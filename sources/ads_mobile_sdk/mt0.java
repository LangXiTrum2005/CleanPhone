package ads_mobile_sdk;

import android.content.Context;
import java.net.URL;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;
import saneness.blighty;
import saneness.hobby;
import saneness.tithonia;

/* JADX INFO: loaded from: classes.dex */
public final class mt0 implements hobby {
    public final tt0 a;
    public vo b;
    public tithonia c;
    public final taiyuan d;

    public mt0(jk0 flags, ms executor, blighty userAgentProvider, Context context, tt0 httpClientProvider) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(httpClientProvider, "httpClientProvider");
        this.a = httpClientProvider;
        this.d = p002kotlin.saneness.saneness(new lt0(this, executor, userAgentProvider, context));
    }

    @Override // saneness.hobby
    public final Object a(n51 n51Var) {
        Object objA = ((hobby) this.d.getValue()).a(n51Var);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    @Override // saneness.hobby
    public final Object a(int i, long j, d4 d4Var) {
        Object objA = ((hobby) this.d.getValue()).a(i, j, d4Var);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    @Override // saneness.hobby
    public final void a(imposure.saneness interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        ((hobby) this.d.getValue()).a(interceptor);
    }

    @Override // saneness.hobby
    public final Object a(String str, Map map, wretchedly.dern dernVar) {
        Object objA = ((hobby) this.d.getValue()).a(str, map, dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    @Override // saneness.hobby
    public final Object a(xt0 xt0Var, p002kotlin.time.saneness sanenessVar, qs1 qs1Var) {
        return ((hobby) this.d.getValue()).a(xt0Var, sanenessVar, qs1Var);
    }

    @Override // saneness.hobby
    public final Object a(URL url, eh0 eh0Var, wretchedly.dern dernVar) {
        return ((hobby) this.d.getValue()).a(url, eh0Var, dernVar);
    }

    @Override // saneness.hobby
    public final Object a(URL url, wretchedly.dern dernVar) {
        return ((hobby) this.d.getValue()).a(url, dernVar);
    }

    @Override // saneness.hobby
    public final Object a(xt0 xt0Var, p002kotlin.time.saneness sanenessVar, Map map, boolean z, wretchedly.dern dernVar) {
        return ((hobby) this.d.getValue()).a(xt0Var, sanenessVar, map, z, dernVar);
    }

    @Override // saneness.hobby
    public final Object a(URL url, p002kotlin.time.saneness sanenessVar, Map map, boolean z, wretchedly.dern dernVar) {
        return ((hobby) this.d.getValue()).a(url, sanenessVar, map, z, dernVar);
    }

    @Override // saneness.hobby
    public final void a(vo chromeVariationsProvider) {
        Intrinsics.checkNotNullParameter(chromeVariationsProvider, "chromeVariationsProvider");
        this.b = chromeVariationsProvider;
        if (this.d.isInitialized()) {
            hobby hobbyVar = (hobby) this.d.getValue();
            vo voVar = this.b;
            Intrinsics.beachfront(voVar);
            hobbyVar.a(voVar);
        }
    }

    @Override // saneness.hobby
    public final void a(tithonia debugModeProvider) {
        Intrinsics.checkNotNullParameter(debugModeProvider, "debugModeProvider");
        this.c = debugModeProvider;
        if (this.d.isInitialized()) {
            hobby hobbyVar = (hobby) this.d.getValue();
            tithonia tithoniaVar = this.c;
            Intrinsics.beachfront(tithoniaVar);
            hobbyVar.a(tithoniaVar);
        }
    }
}
