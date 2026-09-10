package com.inmobi.media;

import com.inmobi.media.C2901fd;
import kotlinx.coroutines.flow.formularize;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2901fd extends AbstractC3214s2 {
    public final C2927gd h;
    public final taiyuan i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2901fd(saran coroutineScope, C3285un viewabilityModel, C3360xn viewabilityCriteria, formularize windowObserver) {
        super(coroutineScope, viewabilityModel, viewabilityCriteria, windowObserver);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(viewabilityModel, "viewabilityModel");
        Intrinsics.checkNotNullParameter(viewabilityCriteria, "viewabilityCriteria");
        Intrinsics.checkNotNullParameter(windowObserver, "windowObserver");
        this.h = new C2927gd(new Jn(viewabilityCriteria.b, viewabilityCriteria.c), this.g.c);
        this.i = saneness.saneness(new Function0() { // from class: adsuki.don
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C2901fd.a(this.f3413kowloon);
            }
        });
    }

    public static final Bn a(C2901fd c2901fd) {
        C2927gd viewabilityTrackerView = c2901fd.h;
        Intrinsics.checkNotNullParameter(viewabilityTrackerView, "viewabilityTrackerView");
        return new Bn(new C3328wg(c2901fd.a, new C3378yg(c2901fd.b.a), viewabilityTrackerView), new Dn(c2901fd.a, c2901fd.b.d));
    }

    @Override // com.inmobi.media.AbstractC3214s2
    public final Bn c() {
        return (Bn) this.i.getValue();
    }
}
