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
package crossmobile.ios.accounts;

import crossmobile.ios.foundation.NSError;
import org.crossmobile.bridge.ann.CMBlock;
import org.crossmobile.bridge.ann.CMTarget;
import org.robovm.objc.block.VoidBlock2;

/**
 * ACAccountStoreCredentialRenewalHandler interface specifies the handler that is
 * called when the credentials are renewed.
 */
@CMTarget
public interface ACAccountStoreCredentialRenewalHandler extends VoidBlock2<Integer, NSError> {

    /**
     * It is called in order to handle account credentials' renewal.
     *
     * @param renewResult The result of the event of renewing account credentials.
     * @param error       The error in case of failure.
     */
    @Override
    @CMBlock("void(^ACAccountStoreCredentialRenewalHandler)(ACAccountCredentialRenewResult renewResult, NSError *error);")
    public void invoke(Integer renewResult, NSError error);

}
