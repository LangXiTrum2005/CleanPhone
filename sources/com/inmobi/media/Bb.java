package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public final class Bb extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Bb f22724a = new Bb();

    public Bb() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws JSONException {
        C2978d2 it = (C2978d2) obj;
        Intrinsics.f(it, "it");
        int i2 = it.f23507a;
        if (i2 != 1 && i2 != 2) {
            switch (i2) {
                case 150:
                case 151:
                case 152:
                    Map map = it.f23509c;
                    if (map != null && map.containsKey("data")) {
                        Object obj2 = it.f23509c.get("data");
                        Intrinsics.d(obj2, "null cannot be cast to non-null type com.inmobi.commons.core.incident.IncidentEvent");
                        T5 t5 = (T5) obj2;
                        EnumC2932a7 enumC2932a7 = Cb.f22744a;
                        boolean z2 = t5 instanceof C3124m3;
                        if (z2 || (t5 instanceof mf)) {
                            for (Fc fc : D5.a()) {
                                EnumC2932a7 logLevel = EnumC2932a7.ERROR;
                                String message = "TYPE - " + t5.f23247a + ", TIMESTAMP - " + t5.f23248b + ", PAYLOAD - " + t5.a();
                                fc.getClass();
                                Intrinsics.f(logLevel, "logLevel");
                                Intrinsics.f(message, "message");
                                fc.f22827a.a(logLevel, "LOGGER CRASH", message);
                                if (z2) {
                                    fc.f22827a.b();
                                }
                            }
                        } else if (Cb.f22747e.getAnr().getAppExitReason().getReportToLogs() && (t5 instanceof C2977d1)) {
                            new C2931a6(Cb.f22747e.getAnr().getAppExitReason().getIncompleteLogThresholdTime()).a(t5.f23247a, t5.a(), ((C2977d1) t5).g, t5.f23248b);
                        }
                    }
                    break;
            }
        } else {
            EnumC2932a7 enumC2932a8 = Cb.f22744a;
            for (Fc fc2 : D5.a()) {
                EnumC2932a7 logLevel2 = EnumC2932a7.ERROR;
                String message2 = "SYSTEM SHUTDOWN RECEIVED - " + i2;
                fc2.getClass();
                Intrinsics.f(logLevel2, "logLevel");
                Intrinsics.f(message2, "message");
                fc2.f22827a.a(logLevel2, "LOGGER CRASH", message2);
                fc2.f22827a.b();
            }
            AtomicBoolean atomicBoolean = Cb.f22746c;
            atomicBoolean.set(false);
            H7 h7F = Uc.f();
            Bb bb = Cb.g;
            h7F.a(bb);
            Cb.f22745b = null;
            atomicBoolean.set(false);
            Uc.f().a(bb);
            Cb.f22745b = null;
        }
        return Unit.f43263a;
    }
}
