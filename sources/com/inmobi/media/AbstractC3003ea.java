package com.inmobi.media;

import android.os.Debug;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3003ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CrashConfig f23565a;

    static {
        LinkedHashMap linkedHashMap = O2.f23027a;
        f23565a = (CrashConfig) AbstractC3174p5.a("crashReporting", "null cannot be cast to non-null type com.inmobi.commons.core.configs.CrashConfig", null);
        System.currentTimeMillis();
    }

    public static void a(JSONObject payload, boolean z2, boolean z3, long j) {
        int i2;
        int i3;
        long[] jArr;
        Intrinsics.f(payload, "payload");
        if (f23565a.getCrashConfig().getReportOOMInfo() && z2) {
            AbstractC3188q3 type = z3 ? C3172p3.d : C3140n3.d;
            Intrinsics.f(type, "type");
            C6 c6A = V5.a();
            if (c6A != null) {
                String key = type.f23914c;
                Intrinsics.f(key, "key");
                c6A.a(type.f23914c, c6A.f22735a.getInt(key, 0) + 1, true);
            }
            C6 c6A2 = V5.a();
            if (c6A2 != null) {
                String key2 = type.f23912a;
                Intrinsics.f(key2, "key");
                long j2 = c6A2.f22735a.getLong(key2, 0L);
                String str = type.f23913b;
                if (j2 == 0) {
                    c6A2.a(str, j, true);
                } else {
                    c6A2.a(str, j - j2, true);
                }
            }
            if (z3) {
                C3172p3 type2 = C3172p3.d;
                Intrinsics.f(type2, "type");
                C6 c6A3 = V5.a();
                if (c6A3 != null) {
                    String key3 = type2.f23914c;
                    Intrinsics.f(key3, "key");
                    i2 = c6A3.f22735a.getInt(key3, 0);
                } else {
                    i2 = 0;
                }
                C3140n3 type3 = C3140n3.d;
                Intrinsics.f(type3, "type");
                C6 c6A4 = V5.a();
                if (c6A4 != null) {
                    String key4 = type3.f23914c;
                    Intrinsics.f(key4, "key");
                    i3 = c6A4.f22735a.getInt(key4, 0);
                } else {
                    i3 = 0;
                }
                int i4 = i2 + i3;
                float f = i4 > 0 ? (i2 * 100.0f) / i4 : 0.0f;
                payload.put("inmobiOOMCount", i2);
                payload.put("appOOMCount", i3);
                payload.put("appOomCrashInterval", V5.a(type3));
                payload.put("inmOOMCrashInterval", V5.a(type2));
                payload.put("oomRatioInMobiToApp", Float.valueOf(f));
                if (L3.f22938a.H()) {
                    long jLongValue = 0;
                    long jLongValue2 = 0;
                    for (Map.Entry<String, String> entry : Debug.getRuntimeStats().entrySet()) {
                        String key5 = entry.getKey();
                        String value = entry.getValue();
                        if (Intrinsics.a(key5, "art.gc.blocking-gc-count")) {
                            Intrinsics.c(value);
                            Long lZ = StringsKt.Z(value);
                            jLongValue = lZ != null ? lZ.longValue() : 0L;
                        } else if (Intrinsics.a(key5, "art.gc.gc-count")) {
                            Intrinsics.c(value);
                            Long lZ2 = StringsKt.Z(value);
                            jLongValue2 = lZ2 != null ? lZ2.longValue() : 0L;
                        }
                    }
                    jArr = new long[]{jLongValue, jLongValue2};
                } else {
                    jArr = null;
                }
                if (jArr != null) {
                    payload.put("blockingGcCount", jArr[0]);
                    payload.put("gcCount", jArr[1]);
                }
            }
        }
    }
}
