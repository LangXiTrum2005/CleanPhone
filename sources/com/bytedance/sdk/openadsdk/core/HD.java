package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.umeng.ccg.a;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class HD {
    private static final AtomicInteger LD;
    private static final AtomicInteger Lxb;
    private static final AtomicInteger ZU;
    private static final AtomicInteger lk;

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
        Lxb = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        LD = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        lk = atomicInteger3;
        AtomicInteger atomicInteger4 = new AtomicInteger();
        ZU = atomicInteger4;
        atomicInteger.addAndGet(com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    private static void LD() {
        final int i = Lxb.get();
        final int i2 = LD.get();
        final int i3 = lk.get();
        final int i4 = ZU.get();
        com.bytedance.sdk.openadsdk.STP.lk.Lxb("crypt_v4_statistics", false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.core.HD.1
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            @Nullable
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("encrypt_success_count", i);
                    jSONObject.put("encrypt_fail_count", i2);
                    jSONObject.put("decrypt_success_count", i3);
                    jSONObject.put("decrypt_fail_count", i4);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb("crypt_v4_statistics").LD(jSONObject.toString());
            }
        });
    }

    public static void Lxb() {
        try {
            long jLxb = com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("encrypt_statistics_file", "upload_time_key", 0L);
            if (jLxb <= 0 || System.currentTimeMillis() - jLxb < 86400000) {
                if (jLxb <= 0 || jLxb > System.currentTimeMillis()) {
                    com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
            LD();
            synchronized (HD.class) {
                Lxb.set(0);
                LD.set(0);
                lk.set(0);
                ZU.set(0);
                com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("encrypt_statistics_file");
                com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized void LD(boolean z) {
        try {
            if (z) {
                com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("encrypt_statistics_file", "encrypt_success_count", Integer.valueOf(Lxb.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("encrypt_statistics_file", "encrypt_fail_count", Integer.valueOf(LD.incrementAndGet()));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void Lxb(final int i, final PangleEncryptConstant.CryptDataScene cryptDataScene, final int i2) {
        com.bytedance.sdk.openadsdk.STP.lk.Lxb("crypt_v4_fail", false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.core.HD.2
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            @Nullable
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crypt", i);
                    jSONObject.put(a.j, cryptDataScene.value());
                    jSONObject.put("reason", i2);
                    if (i2 == 6) {
                        jSONObject.put("model", Build.MODEL);
                        jSONObject.put("vendor", Build.MANUFACTURER);
                    }
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb("crypt_v4_fail").LD(jSONObject.toString());
            }
        });
    }

    public static synchronized void Lxb(boolean z) {
        try {
            if (z) {
                com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("encrypt_statistics_file", "decrypt_success_count", Integer.valueOf(lk.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("encrypt_statistics_file", "decrypt_fail_count", Integer.valueOf(lk.incrementAndGet()));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void Lxb(JSONObject jSONObject) {
        LD(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }
}
