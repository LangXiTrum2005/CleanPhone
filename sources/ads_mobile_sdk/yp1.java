package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.undertread;

/* JADX INFO: loaded from: classes.dex */
public final class yp1 implements undertread {
    public final wp1 a;

    public yp1(wp1 nativeOnePointFiveOverlayFactory) {
        Intrinsics.checkNotNullParameter(nativeOnePointFiveOverlayFactory, "nativeOnePointFiveOverlayFactory");
        this.a = nativeOnePointFiveOverlayFactory;
    }

    @Override // saneness.undertread
    public final Object a(wretchedly.dern dernVar) {
        wp1 wp1Var = this.a;
        wp1Var.getClass();
        Object objB = wp1.b(wp1Var, dernVar);
        return objB == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objB : Unit.f29295attabal;
    }
}
