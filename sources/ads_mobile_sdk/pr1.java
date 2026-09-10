package ads_mobile_sdk;

import java.util.Optional;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.darpa;

/* JADX INFO: loaded from: classes.dex */
public final class pr1 implements darpa {
    public final ag1 a;
    public final Optional b;
    public final saran c;

    public pr1(ag1 mraidAfmaDispatcher, Optional optionalWebView, saran uiScope) {
        Intrinsics.checkNotNullParameter(mraidAfmaDispatcher, "mraidAfmaDispatcher");
        Intrinsics.checkNotNullParameter(optionalWebView, "optionalWebView");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        this.a = mraidAfmaDispatcher;
        this.b = optionalWebView;
        this.c = uiScope;
    }

    @Override // saneness.darpa
    public final Object b(m73 m73Var, wretchedly.dern dernVar) {
        gq0 gq0Var = (gq0) monocoque.attabal.saneness(this.b);
        if (gq0Var == null) {
            return Unit.f29295attabal;
        }
        o73 o73Var = m73Var.a;
        if (o73Var == o73.LAYOUT || o73Var == o73.STATE) {
            cutely.wireman(this.c, null, null, new or1(this, gq0Var, null), 3, null);
        }
        return Unit.f29295attabal;
    }
}
