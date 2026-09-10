package ads_mobile_sdk;

import android.content.Context;
import java.net.URL;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;
import saneness.hobby;
import saneness.tithonia;

/* JADX INFO: loaded from: classes.dex */
public final class eu1 implements hobby {
    public final du1 a;
    public final taiyuan b;

    public eu1(ms executor, String userAgent, Context context) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = new du1(userAgent);
        this.b = p002kotlin.saneness.saneness(new cu1(executor, this));
    }

    @Override // saneness.hobby
    public final Object a(n51 n51Var) {
        Object objA = ((it0) this.b.getValue()).a(n51Var);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    @Override // saneness.hobby
    public final Object a(int i, long j, d4 d4Var) {
        Object objA = ((it0) this.b.getValue()).a(i, j, d4Var);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    @Override // saneness.hobby
    public final void a(imposure.saneness interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        ((it0) this.b.getValue()).a(interceptor);
    }

    @Override // saneness.hobby
    public final Object a(String str, Map map, wretchedly.dern dernVar) {
        Object objA = ((it0) this.b.getValue()).a(str, map, dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    @Override // saneness.hobby
    public final Object a(xt0 xt0Var, p002kotlin.time.saneness sanenessVar, qs1 qs1Var) {
        return ((it0) this.b.getValue()).a(xt0Var, sanenessVar, (Map) null, true, (wretchedly.dern) qs1Var);
    }

    @Override // saneness.hobby
    public final Object a(URL url, eh0 eh0Var, wretchedly.dern dernVar) {
        return ((it0) this.b.getValue()).a(url, eh0Var, dernVar);
    }

    @Override // saneness.hobby
    public final Object a(URL url, wretchedly.dern dernVar) {
        return ((it0) this.b.getValue()).a(url, dernVar);
    }

    @Override // saneness.hobby
    public final Object a(xt0 xt0Var, p002kotlin.time.saneness sanenessVar, Map map, boolean z, wretchedly.dern dernVar) {
        return ((it0) this.b.getValue()).a(xt0Var, sanenessVar, map, z, dernVar);
    }

    @Override // saneness.hobby
    public final Object a(URL url, p002kotlin.time.saneness sanenessVar, Map map, boolean z, wretchedly.dern dernVar) {
        return ((it0) this.b.getValue()).a(url, sanenessVar, map, z, dernVar);
    }

    @Override // saneness.hobby
    public final void a(vo chromeVariationsProvider) {
        Intrinsics.checkNotNullParameter(chromeVariationsProvider, "chromeVariationsProvider");
    }

    @Override // saneness.hobby
    public final void a(tithonia debugModeProvider) {
        Intrinsics.checkNotNullParameter(debugModeProvider, "debugModeProvider");
    }
}
