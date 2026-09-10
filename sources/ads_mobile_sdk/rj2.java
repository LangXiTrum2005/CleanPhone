package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.spatterdash;

/* JADX INFO: loaded from: classes.dex */
public final class rj2 implements spatterdash {
    public final e2 a;
    public final h1 b;

    public rj2(e2 adEventEmitter, h1 adConfiguration) {
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.a = adEventEmitter;
        this.b = adConfiguration;
    }

    @Override // saneness.spatterdash
    public final Object a(boolean z, wretchedly.dern dernVar) {
        if (!z) {
            return Unit.f29295attabal;
        }
        if (this.b.n0 == g1.THIRD_PARTY_SDK_CALLBACK) {
            Object objJ = this.a.j(dernVar);
            return objJ == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objJ : Unit.f29295attabal;
        }
        Object objQ = this.a.q(dernVar);
        return objQ == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objQ : Unit.f29295attabal;
    }
}
