package com.apm.insight.k;

import android.util.Log;
import com.apm.insight.runtime.m;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Runnable f10153a = new Runnable() { // from class: com.apm.insight.k.a.1
        @Override // java.lang.Runnable
        public final void run() {
            if (com.apm.insight.l.k.b(com.apm.insight.e.g())) {
                a.i();
            }
            if (a.f10154b > 0) {
                if (com.apm.insight.l.a.b(com.apm.insight.e.g())) {
                    m.a().a(a.f10153a, MBInterstitialActivity.WEB_LOAD_TIME);
                } else {
                    m.a().a(a.f10153a, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                }
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10154b = 0;

    public static void a() {
        f10154b = 40;
        m.a().a(f10153a);
    }

    public static void b() {
        if (!j.b()) {
            j.c();
        }
        if (com.apm.insight.l.k.b(com.apm.insight.e.g()) && j.g()) {
            i();
        }
    }

    public static boolean c() {
        return false;
    }

    public static void d() {
    }

    private static byte[] h() {
        try {
            return e.a(com.apm.insight.e.i().getConfigUrl(), com.apm.insight.entity.b.a().toString().getBytes());
        } catch (Throwable th) {
            com.apm.insight.a.a(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void i() {
        try {
            int i2 = f10154b;
            if (i2 > 0) {
                f10154b = i2 - 1;
            }
            com.apm.insight.a.a((Object) "try fetchApmConfig");
            if (!com.apm.insight.l.a.b(com.apm.insight.e.g())) {
                j.c();
                if (j.a()) {
                    f10154b = 0;
                }
                return;
            }
            JSONArray jSONArrayOptJSONArray = null;
            try {
                byte[] bArrH = h();
                if (bArrH != null) {
                    jSONArrayOptJSONArray = new JSONObject(new String(bArrH)).optJSONArray("data");
                }
            } catch (Throwable th) {
                if (com.apm.insight.e.i().isDebugMode()) {
                    Log.e("npth", "npth NPTH Catch Error", th);
                }
            }
            com.apm.insight.a.a((Object) "after fetchApmConfig net ".concat(String.valueOf(jSONArrayOptJSONArray)));
            if (jSONArrayOptJSONArray == null) {
                f10154b -= 10;
            } else {
                com.apm.insight.runtime.a.a(jSONArrayOptJSONArray, true);
                f10154b = 0;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
