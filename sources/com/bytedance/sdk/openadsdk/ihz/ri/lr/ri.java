package com.bytedance.sdk.openadsdk.ihz.ri.lr;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.aw;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.settings.sf;
import com.bytedance.sdk.openadsdk.slm.ik;
import com.bytedance.sdk.openadsdk.slm.lr;
import com.bytedance.sdk.openadsdk.slm.ri.ka;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.su;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.L6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.BuildConfig;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static volatile ri mj;
    private volatile Boolean ri = null;
    private AtomicLong lr = new AtomicLong(0);
    private int ik = 0;
    private String ka = "";
    private final CountDownLatch fi = new CountDownLatch(1);
    private volatile boolean di = false;
    private String xha = "";

    private ri() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ik() {
        if (this.ri == null) {
            synchronized (this) {
                try {
                    if (this.ri == null) {
                        this.ri = Boolean.valueOf(((int) ((Math.random() * 100.0d) + 1.0d)) <= ik.lr("gid_status", 100));
                        if (this.ri.booleanValue()) {
                            try {
                                this.xha = su.ri();
                            } catch (Throwable unused) {
                                this.xha = BuildConfig.FLAVOR;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.ri.booleanValue();
    }

    public String lr() {
        if (nr.ka().sez() != 1) {
            return this.ka;
        }
        if (dzy.di()) {
            return this.ka;
        }
        if (!this.di) {
            try {
                this.fi.await(4L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
            } finally {
                this.di = true;
                this.fi.countDown();
            }
        }
        return this.ka;
    }

    public static ri ri() {
        if (mj == null) {
            synchronized (ri.class) {
                try {
                    if (mj == null) {
                        mj = new ri();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mj;
    }

    public void ri(boolean z) {
        if (this.ik == 1 || !TextUtils.isEmpty(this.ka)) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (z || this.lr.get() <= jElapsedRealtime) {
            this.lr.set(jElapsedRealtime + 300000);
            final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            dzy.ri(new com.bytedance.sdk.component.mj.lr.ik("pag_gaid") { // from class: com.bytedance.sdk.openadsdk.ihz.ri.lr.ri.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v5, types: [com.bytedance.sdk.openadsdk.core.ik] */
                /* JADX WARN: Type inference failed for: r4v0 */
                /* JADX WARN: Type inference failed for: r4v1, types: [int] */
                /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
                @Override // java.lang.Runnable
                public void run() {
                    ?? IsLimitAdTrackingEnabled;
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(nr.ri());
                        if (advertisingIdInfo != null) {
                            IsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                            if (IsLimitAdTrackingEnabled != 0) {
                                ri.this.ik = 1;
                                ri.this.ri(2, "lmt", SystemClock.elapsedRealtime() - jElapsedRealtime2);
                            }
                            if (IsLimitAdTrackingEnabled == 0) {
                                String id = advertisingIdInfo.getId();
                                String str = ri.this.ka;
                                if (TextUtils.isEmpty(id)) {
                                    ri.this.ri(4, "empty gaid", SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                } else {
                                    ri.this.ka = id;
                                    ri.this.ri(true, SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                }
                                if (!str.equals(id)) {
                                    aw.ri();
                                }
                            }
                        } else {
                            IsLimitAdTrackingEnabled = -1;
                        }
                        if (IsLimitAdTrackingEnabled != -1) {
                            com.bytedance.sdk.openadsdk.core.ik.ri().ri("limit_ad_track", IsLimitAdTrackingEnabled);
                        }
                    } catch (Throwable th) {
                        try {
                            ri.this.ik = 2;
                            ri.this.ri(3, th, SystemClock.elapsedRealtime() - jElapsedRealtime2);
                            ac.ik("AdvertisingIdHelper", th.getMessage());
                        } finally {
                            ri.this.di = true;
                            ri.this.fi.countDown();
                            com.bytedance.sdk.openadsdk.core.sf.ik.ri(ri.this.ka);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String lr(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(th.toString());
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb.append("\n\tat ");
                sb.append(stackTraceElement.toString());
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public void ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(L6.V0, lr());
        } catch (JSONException unused) {
        }
    }

    public void ri(boolean z, long j) {
        ri(z, 0, "", null, j);
    }

    public void ri(int i, String str, long j) {
        ri(false, i, str, null, j);
    }

    public void ri(int i, Throwable th, long j) {
        ri(false, i, "", th, j);
    }

    public void ri(final boolean z, final int i, final String str, final Throwable th, final long j) {
        if ((this.ri == null || this.ri.booleanValue()) && nr.ri() != null) {
            nr.fi().ri(new lr() { // from class: com.bytedance.sdk.openadsdk.ihz.ri.lr.ri.2
                @Override // com.bytedance.sdk.openadsdk.slm.lr
                public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                    if (!ri.this.ik()) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("session_id", ri.this.xha);
                    jSONObject.put("is_success", z);
                    jSONObject.put("error_code", i);
                    jSONObject.put("error_msg", TextUtils.isEmpty(str) ? ri.lr(th) : str);
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                    jSONObject.put("has_setting", sf.lr().zk() > 0);
                    return ka.lr().ri("gid_status").lr(jSONObject.toString());
                }
            }, false);
        }
    }
}
