package ads_mobile_sdk;

import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.anaphylactin;

/* JADX INFO: loaded from: classes.dex */
public final class y7 implements anaphylactin {
    public final e2 a;
    public final AtomicBoolean b;

    public y7(e2 adEventEmitter) {
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        this.a = adEventEmitter;
        this.b = new AtomicBoolean(false);
    }

    @Override // saneness.anaphylactin
    public final Object a(m73 m73Var, wretchedly.dern dernVar) {
        if (!m73Var.b || !this.b.compareAndSet(false, true)) {
            return Unit.f29295attabal;
        }
        Object objQ = this.a.q(dernVar);
        return objQ == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objQ : Unit.f29295attabal;
    }
}
