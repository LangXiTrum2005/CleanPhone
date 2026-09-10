package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.ironsource.L6;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class su {
    private static final AtomicInteger ik;
    private static final AtomicInteger ka;
    private static final AtomicInteger lr;
    private static final AtomicInteger ri;

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
        ri = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        lr = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        ik = atomicInteger3;
        AtomicInteger atomicInteger4 = new AtomicInteger();
        ka = atomicInteger4;
        atomicInteger.addAndGet(com.bytedance.sdk.openadsdk.tan.ka.ri.ri("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(com.bytedance.sdk.openadsdk.tan.ka.ri.ri("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(com.bytedance.sdk.openadsdk.tan.ka.ri.ri("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(com.bytedance.sdk.openadsdk.tan.ka.ri.ri("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    private static void lr() {
        final int i = ri.get();
        final int i2 = lr.get();
        final int i3 = ik.get();
        final int i4 = ka.get();
        com.bytedance.sdk.openadsdk.slm.ka.ri("crypt_v4_statistics", false, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.core.su.1
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("encrypt_success_count", i);
                    jSONObject.put("encrypt_fail_count", i2);
                    jSONObject.put("decrypt_success_count", i3);
                    jSONObject.put("decrypt_fail_count", i4);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("crypt_v4_statistics").lr(jSONObject.toString());
            }
        });
    }

    public static void ri() {
        try {
            long jRi = com.bytedance.sdk.openadsdk.tan.ka.ri.ri("encrypt_statistics_file", "upload_time_key", 0L);
            if (jRi <= 0 || System.currentTimeMillis() - jRi < SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                if (jRi <= 0 || jRi > System.currentTimeMillis()) {
                    com.bytedance.sdk.openadsdk.tan.ka.ri.ri("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
            lr();
            synchronized (su.class) {
                ri.set(0);
                lr.set(0);
                ik.set(0);
                ka.set(0);
                com.bytedance.sdk.openadsdk.tan.ka.ri.ri("encrypt_statistics_file");
                com.bytedance.sdk.openadsdk.tan.ka.ri.ri("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized void lr(boolean z) {
        try {
            if (z) {
                com.bytedance.sdk.openadsdk.tan.ka.ri.ri("encrypt_statistics_file", "encrypt_success_count", Integer.valueOf(ri.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.tan.ka.ri.ri("encrypt_statistics_file", "encrypt_fail_count", Integer.valueOf(lr.incrementAndGet()));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void ri(final int i, final PangleEncryptConstant.CryptDataScene cryptDataScene, final int i2) {
        com.bytedance.sdk.openadsdk.slm.ka.ri("crypt_v4_fail", false, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.core.su.2
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crypt", i);
                    jSONObject.put("scene", cryptDataScene.value());
                    jSONObject.put("reason", i2);
                    if (i2 == 6) {
                        jSONObject.put(L6.B, Build.MODEL);
                        jSONObject.put("vendor", Build.MANUFACTURER);
                    }
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("crypt_v4_fail").lr(jSONObject.toString());
            }
        });
    }

    public static synchronized void ri(boolean z) {
        try {
            if (z) {
                com.bytedance.sdk.openadsdk.tan.ka.ri.ri("encrypt_statistics_file", "decrypt_success_count", Integer.valueOf(ik.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.tan.ka.ri.ri("encrypt_statistics_file", "decrypt_fail_count", Integer.valueOf(ik.incrementAndGet()));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void ri(JSONObject jSONObject) {
        lr(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }
}
