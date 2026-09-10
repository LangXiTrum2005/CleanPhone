package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.carport;
import saneness.undertread;

/* JADX INFO: loaded from: classes.dex */
public final class go1 implements undertread {
    public final carport a;

    public go1(carport nativeJavascriptEngine) {
        Intrinsics.checkNotNullParameter(nativeJavascriptEngine, "nativeJavascriptEngine");
        this.a = nativeJavascriptEngine;
    }

    @Override // saneness.undertread
    public final Object a(wretchedly.dern dernVar) {
        Object objA = this.a.a(dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }
}
