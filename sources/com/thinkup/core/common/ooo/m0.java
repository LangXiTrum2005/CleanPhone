package com.thinkup.core.common.ooo;

import android.util.Log;
import com.thinkup.core.api.TUAdInfo;

/* JADX INFO: loaded from: classes6.dex */
public class m0 {
    public static void o(String str, String str2, TUAdInfo tUAdInfo, boolean z2) {
        if (tUAdInfo != null) {
            return;
        }
        try {
            com.thinkup.core.common.oo0.oo.m("TUAdInfo is null", "An exception occurred for placementId (" + str + ") in the method " + str2 + ". External adInfo is null: " + z2, com.thinkup.core.common.n.o0n.m().o0m());
        } catch (Throwable th) {
            Log.e(com.thinkup.core.n.m0.o, "sendTUAdInfoNullPointException error: " + th.getMessage());
        }
    }
}
