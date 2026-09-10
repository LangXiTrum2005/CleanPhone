package com.mbridge.msdk.config.component.common.util;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.sdk.x;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(String str, String str2) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD == null) {
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                b.a(contextD).b(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, str);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            b.a(contextD).b("c", str2);
        } catch (Throwable th2) {
            q0.b("MBIdsMergeStoreUtil", th2.getMessage());
        }
    }

    public void a(String str, String str2) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new com.facebook.appevents.c(str, str2, 2));
    }

    public void a() {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new x(11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b() {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD == null) {
                return;
            }
            String strA = b.a(contextD).a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "");
            String strA2 = b.a(contextD).a("c", "");
            if (!TextUtils.isEmpty(strA)) {
                com.mbridge.msdk.foundation.same.a.V = strA;
            }
            if (TextUtils.isEmpty(strA2)) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.f33721g = strA2;
        } catch (Throwable th2) {
            q0.b("MBIdsMergeStoreUtil", th2.getMessage());
        }
    }
}
