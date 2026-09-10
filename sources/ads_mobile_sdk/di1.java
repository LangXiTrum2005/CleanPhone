package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.ahermatype;

/* JADX INFO: loaded from: classes.dex */
public final class di1 {
    public final ahermatype a;

    public di1(ahermatype mraidEventEmitter) {
        Intrinsics.checkNotNullParameter(mraidEventEmitter, "mraidEventEmitter");
        this.a = mraidEventEmitter;
    }

    public final Unit a(qg1 qg1Var) {
        Object objC = this.a.c(qg1Var);
        if (objC != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            objC = Unit.f29295attabal;
        }
        return (Unit) objC;
    }
}
