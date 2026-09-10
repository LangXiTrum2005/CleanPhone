package com.inmobi.media;

import android.os.Build;
import com.inmobi.media.C2908fk;
import com.inmobi.media.I2;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2908fk {
    public TelemetryConfig a;

    public C2908fk(TelemetryConfig telemetryConfig) {
        Intrinsics.checkNotNullParameter(telemetryConfig, "telemetryConfig");
        this.a = telemetryConfig;
        ((C3349xc) Ji.e.getValue()).a(new int[]{Opcodes.FCMPG, Opcodes.DCMPG}, new Function1() { // from class: adsuki.beclomethasone
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2908fk.a(this.f3337kowloon, (I2) obj);
            }
        });
    }

    public static final Unit a(C2908fk c2908fk, I2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        switch (it.a) {
            case Opcodes.FCMPG /* 150 */:
                Map map = it.c;
                Object obj = map != null ? map.get("data") : null;
                c2908fk.a("CrashEventOccurred", obj instanceof T4 ? (T4) obj : null);
                break;
            case Opcodes.DCMPL /* 151 */:
                Map map2 = it.c;
                Object obj2 = map2 != null ? map2.get("data") : null;
                Wn wn = obj2 instanceof Wn ? (Wn) obj2 : null;
                c2908fk.getClass();
                if (wn != null && AbstractC2984il.a(wn)) {
                    C3342x5.a.getClass();
                    if (!C3342x5.r()) {
                        c2908fk.a("MainThreadBlockedEvent", wn);
                    }
                }
                break;
            case Opcodes.DCMPG /* 152 */:
                Map map3 = it.c;
                Object obj3 = map3 != null ? map3.get("data") : null;
                c2908fk.a(obj3 instanceof C3388z1 ? (C3388z1) obj3 : null);
                break;
        }
        return Unit.f29295attabal;
    }

    public final void a(C3388z1 c3388z1) {
        if (Build.VERSION.SDK_INT < 30 || c3388z1 == null || c3388z1.g != 6) {
            return;
        }
        a("ANREvent", c3388z1);
    }

    public final void a(String str, Q9 q9) {
        if (this.a.getPriorityEventsList().contains(str) && q9 != null && AbstractC2984il.a(q9)) {
            Wj.b(str, new LinkedHashMap(), EnumC2779ak.SDK);
        }
    }
}
