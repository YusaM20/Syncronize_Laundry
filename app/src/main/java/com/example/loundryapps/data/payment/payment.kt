package com.example.loundryapps.data.payment

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.loundryapps.R
import com.midtrans.sdk.corekit.callback.TransactionFinishedCallback
import com.midtrans.sdk.corekit.core.MidtransSDK
import com.midtrans.sdk.corekit.core.TransactionRequest
import com.midtrans.sdk.corekit.models.BillingAddress
import com.midtrans.sdk.corekit.models.CustomerDetails
import com.midtrans.sdk.corekit.models.ShippingAddress
import com.midtrans.sdk.uikit.SdkUIFlowBuilder

class payment : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)
        val btn : ImageView = findViewById(R.id.pesan)

        SdkUIFlowBuilder.init()
            .setClientKey("SB-Mid-client-sMs3pSGj5KKV4t8T")
            .setContext(applicationContext)
            .setTransactionFinishedCallback(TransactionFinishedCallback {
                result ->
            })
            .setMerchantBaseUrl("http://localhost/charge/index.php/")
            .enableLog(true)
            .setLanguage("id")
            .buildSDK();

           val transactionRequest = TransactionRequest("laundryapp"+System.currentTimeMillis().toShort()+"",
               15000.0)
           val detail = com.midtrans.sdk.corekit.models.ItemDetails("washfold",5000.0,60,"laundry")
            val itemDetails = ArrayList<com.midtrans.sdk.corekit.models.ItemDetails>()
            itemDetails.add(detail)
            uiKitDetails(transactionRequest)
            transactionRequest.itemDetails = itemDetails
            MidtransSDK.getInstance().transactionRequest = transactionRequest
            MidtransSDK.getInstance().startPaymentUiFlow(this)
        }
    }

fun uiKitDetails(transactionRequest: TransactionRequest){

    val customerDetails = CustomerDetails()
    customerDetails.customerIdentifier = "Supri anti"
    customerDetails.phone = "082345678999"
    customerDetails.firstName = "Supri"
    customerDetails.lastName = "anti"
    customerDetails.email = "suprikiyowo@gmail.com"
    val shippingAddress = ShippingAddress()
    shippingAddress.address = "Baturan, Gantiwarno"
    shippingAddress.city = "Klaten"
    shippingAddress.postalCode = "51193"
    customerDetails.shippingAddress = shippingAddress
    val billingAddress = BillingAddress()
    billingAddress.address  = "Baturan, Gantiwarno"
    billingAddress.city = "Klaten"
    billingAddress.postalCode = "51193"
    customerDetails.billingAddress = billingAddress

    transactionRequest.customerDetails = customerDetails
}
