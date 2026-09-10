package com.mbridge.msdk.newreward.function.common;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.video.bt.module.orglistener.h;
import defpackage.e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBridgeGlobalCommon {
    public static String SESSION_ID = "";
    public static Map<String, h> showRewardListenerMap = new HashMap();

    public static void setAlertDialogText(String str, String str2, String str3, String str4, String str5) {
        Context contextD = c.n().d();
        if (!TextUtils.isEmpty(str2)) {
            y0.b(contextD, e.n("MBridge_ConfirmTitle", str), str2.trim());
        }
        if (!TextUtils.isEmpty(str3)) {
            y0.b(contextD, e.n("MBridge_ConfirmContent", str), str3.trim());
        }
        if (!TextUtils.isEmpty(str5)) {
            y0.b(contextD, e.n("MBridge_CancelText", str), str5.trim());
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        y0.b(contextD, e.n("MBridge_ConfirmText", str), str4.trim());
    }
}
