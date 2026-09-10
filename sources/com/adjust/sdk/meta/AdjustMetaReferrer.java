package com.adjust.sdk.meta;

import android.content.Context;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.k0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AdjustMetaReferrer {
    static boolean shouldReadMetaReferrer = true;

    public static void doNotReadMetaReferrer() {
        shouldReadMetaReferrer = false;
    }

    public static void getMetaInstallReferrer(Context context, String str, OnMetaInstallReferrerReadListener onMetaInstallReferrerReadListener) {
        if (onMetaInstallReferrerReadListener == null) {
            AdjustFactory.getLogger().error("onMetaInstallReferrerReadListener can not be null", new Object[0]);
        } else {
            new k0(context, str, onMetaInstallReferrerReadListener).execute(context);
        }
    }

    public static void readMetaReferrer(Context context) {
        shouldReadMetaReferrer = true;
    }
}
