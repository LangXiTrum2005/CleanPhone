package com.adjust.sdk.meta;

import android.content.Context;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.ReferrerDetails;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class Util {
    public static synchronized ReferrerDetails getMetaInstallReferrerDetails(Context context, String str, ILogger iLogger) {
        if (!AdjustMetaReferrer.shouldReadMetaReferrer) {
            return null;
        }
        iLogger.info("getMetaInstallReferrerDetails invoked", new Object[0]);
        MetaInstallReferrerResult metaInstallReferrer = MetaReferrerClient.getMetaInstallReferrer(context, str, iLogger, true);
        if (metaInstallReferrer == null) {
            return null;
        }
        MetaInstallReferrerDetails metaInstallReferrerDetails = metaInstallReferrer.metaInstallReferrerDetails;
        if (metaInstallReferrerDetails == null) {
            return null;
        }
        return new ReferrerDetails(metaInstallReferrerDetails.installReferrer, metaInstallReferrerDetails.actualTimestampInSec, Boolean.valueOf(metaInstallReferrerDetails.isClick));
    }
}
