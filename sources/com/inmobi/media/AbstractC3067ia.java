package com.inmobi.media;

import A.RunnableC0882b0;
import android.content.Context;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: com.inmobi.media.ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3067ia {
    public static final void a(AdConfig.OmidConfig omidConfig, int i2, N9 mNetworkRequest, int i3) {
        byte[] bArr;
        Intrinsics.f(omidConfig, "$omidConfig");
        Intrinsics.f(mNetworkRequest, "$mNetworkRequest");
        Context contextD = Uc.d();
        if (contextD == null) {
            return;
        }
        if ((System.currentTimeMillis() / ((long) 1000)) - new Sa(contextD, "omid_js_store").b() > omidConfig.getExpiry()) {
            int i4 = 0;
            while (i4 <= i2) {
                P9 p9B = mNetworkRequest.b();
                Context contextD2 = Uc.d();
                if (p9B.b()) {
                    i4++;
                    if (i4 > i2) {
                        return;
                    } else {
                        try {
                            Thread.sleep(((long) i3) * 1000);
                        } catch (InterruptedException unused) {
                        }
                    }
                } else if (contextD2 != null) {
                    Sa sa = new Sa(contextD2, "omid_js_store");
                    Map map = p9B.f;
                    String strA = null;
                    List list = map != null ? (List) map.get("Content-Encoding") : null;
                    if (Intrinsics.a(list != null ? (String) list.get(0) : null, com.smartdigimkt.o0.b.d)) {
                        boolean z2 = T9.f23231a;
                        byte[] bArr2 = p9B.f23071b;
                        if (bArr2 == null || bArr2.length == 0) {
                            bArr = new byte[0];
                        } else {
                            bArr = new byte[bArr2.length];
                            Intrinsics.c(bArr2);
                            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                        }
                        byte[] bArrA = T9.a(bArr);
                        if (bArrA != null) {
                            try {
                                strA = new String(bArrA, Charsets.f44691a);
                            } catch (UnsupportedEncodingException unused2) {
                            }
                        }
                    } else {
                        strA = p9B.a();
                    }
                    if (strA != null) {
                        sa.b("omid_js_string", strA);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static void a(AdConfig.OmidConfig omidConfig) {
        Intrinsics.f(omidConfig, "omidConfig");
        String url = omidConfig.getUrl();
        int maxRetries = omidConfig.getMaxRetries();
        int retryInterval = omidConfig.getRetryInterval();
        if (url == null) {
            return;
        }
        N9 n9 = new N9(url, null);
        n9.x = false;
        n9.t = false;
        n9.f23014u = false;
        ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24144b.getX()).submit(new RunnableC0882b0(omidConfig, maxRetries, n9, retryInterval));
    }
}
