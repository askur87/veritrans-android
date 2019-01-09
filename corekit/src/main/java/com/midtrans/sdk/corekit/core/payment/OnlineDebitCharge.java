package com.midtrans.sdk.corekit.core.payment;

import android.support.annotation.NonNull;

import com.midtrans.sdk.corekit.base.callback.MidtransCallback;
import com.midtrans.sdk.corekit.core.api.snap.model.pay.response.BasePaymentResponse;

public class OnlineDebitCharge extends BaseGroupPayment {
    /**
     * Start payment using bank transfer and va with CIMB Clicks.
     *
     * @param snapToken token after making checkoutWithTransaction.
     * @param callback  for receiving callback from request.
     */
    public static void paymentUsingCimbClicks(@NonNull final String snapToken,
                                              @NonNull final MidtransCallback<BasePaymentResponse> callback) {
        if (isValidForNetworkCall(callback)) {
            getSnapApiManager().paymentUsingCimbClick(snapToken, callback);
        }
    }

    /**
     * Start payment using bank transfer and va with CIMB Clicks.
     *
     * @param snapToken token after making checkoutWithTransaction.
     * @param callback  for receiving callback from request.
     */
    public static void paymentUsingBcaClickPay(@NonNull final String snapToken,
                                               @NonNull final MidtransCallback<BasePaymentResponse> callback) {
        if (isValidForNetworkCall(callback)) {
            getSnapApiManager().paymentUsingBcaClickPay(snapToken, callback);
        }
    }

    /**
     * Start payment using bank transfer and va with BRI Epay.
     *
     * @param snapToken token after making checkoutWithTransaction.
     * @param callback  for receiving callback from request.
     */
    public static void paymentUsingBriEpay(@NonNull final String snapToken,
                                           @NonNull final MidtransCallback<BasePaymentResponse> callback) {
        if (isValidForNetworkCall(callback)) {
            getSnapApiManager().paymentUsingBriEpay(snapToken, callback);
        }
    }
}