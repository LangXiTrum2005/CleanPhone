package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class D6 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E6 f22762a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D6(E6 e6) {
        super(1);
        this.f22762a = e6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
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
                        this.f22762a.b((T5) obj2);
                    }
                    break;
            }
        } else {
            E6 e6 = this.f22762a;
            C3236t4 c3236t4 = e6.f22797b;
            if (c3236t4 != null) {
                ScheduledExecutorService scheduledExecutorService = c3236t4.f24003h;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
                c3236t4.f24003h = null;
                c3236t4.f24002e.set(false);
                c3236t4.f.set(true);
                c3236t4.g.clear();
                c3236t4.f24004i = null;
            }
            e6.f22797b = null;
            Uc.f().a(e6.d);
        }
        return Unit.f43263a;
    }
}
