/*
 * (c) 2019 by Panayotis Katsaloulis
 *
 * CrossMobile is free software; you can redistribute it and/or modify
 * it under the terms of the CrossMobile Community License as published
 * by the CrossMobile team.
 *
 * CrossMobile is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * CrossMobile Community License for more details.
 *
 * You should have received a copy of the CrossMobile Community
 * License along with CrossMobile; if not, please contact the
 * CrossMobile team at https://crossmobile.tech/contact/
 */
package crossmobile.ios.storekit;

import crossmobile.ios.foundation.NSData;
import crossmobile.ios.foundation.NSDate;
import crossmobile.ios.foundation.NSError;
import crossmobile.ios.foundation.NSLocale;

import static org.crossmobile.bind.system.AbstractLifecycleBridge.errorFromInfo;

public class $storekit {

    public static SKProduct newSKProduct(String locDescription, String locTitle, double price, NSLocale locale, String prodId) {
        return new SKProduct(locDescription, locTitle, price, locale == null ? NSLocale.currentLocale() : locale, prodId);
    }

    public static SKPaymentTransaction newSKPaymentTransaction(int state, String productIdentifier, String transactionIdentifier, NSDate transactionDate, byte[] requestData, byte[] transactionReceipt, String errorTxt) {
        if (requestData == null)
            requestData = new byte[]{};
        if (transactionReceipt == null)
            transactionReceipt = new byte[]{};
        if (transactionDate == null)
            transactionDate = NSDate.date();
        if (transactionIdentifier == null)
            transactionIdentifier = "transaction:product=" + productIdentifier;
        SKPayment payment = new SKPayment(productIdentifier, 1, NSData.dataWithBytesNoCopy(requestData));
        NSError error = state == SKPaymentTransactionState.Failed ? NSError.errorWithDomain(NSError.Domain.SKError, SKError.Unknown, errorFromInfo(errorTxt + " (" + state + ")")) : null;
        return new SKPaymentTransaction(payment, state, transactionIdentifier, NSData.dataWithBytesNoCopy(transactionReceipt), transactionDate, null, error);
    }

}
