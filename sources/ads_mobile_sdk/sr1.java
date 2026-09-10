package ads_mobile_sdk;

import android.content.Context;
import android.os.SystemClock;
import com.google.common.base.triweekly;
import com.google.gson.JsonObject;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.amphitheatre;
import saneness.darpa;

/* JADX INFO: loaded from: classes.dex */
public final class sr1 implements darpa {
    public final Context a;
    public final String b;
    public final String c;
    public final wf d;
    public final Optional e;
    public final amphitheatre f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public final rr1 i;

    public sr1(Context context, String afmaVersion, String adId, wf appSettings, Optional optionalGmaWebView, amphitheatre clock) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(appSettings, "appSettings");
        Intrinsics.checkNotNullParameter(optionalGmaWebView, "optionalGmaWebView");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.a = context;
        this.b = afmaVersion;
        this.c = adId;
        this.d = appSettings;
        this.e = optionalGmaWebView;
        this.f = clock;
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        this.i = new rr1();
    }

    public final Object a(wretchedly.dern dernVar) {
        gq0 gq0Var = (gq0) monocoque.attabal.saneness(this.e);
        if (gq0Var == null) {
            return Unit.f29295attabal;
        }
        JsonObject jsonObjectA = this.i.a(this.a, this.b, this.c, this.d);
        triweekly triweeklyVar = kn0.a;
        kn0.b("Calling: AFMA_updateActiveView(" + jsonObjectA + ");", null);
        Object objB = gq0Var.b(jsonObjectA, "AFMA_updateActiveView", dernVar);
        return objB == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objB : Unit.f29295attabal;
    }

    @Override // saneness.darpa
    public final Object b(m73 m73Var, wretchedly.dern dernVar) {
        this.i.a = this.h.get() ? false : m73Var.b;
        rr1 rr1Var = this.i;
        this.f.getClass();
        rr1Var.d = SystemClock.elapsedRealtime();
        this.i.f = m73Var;
        if (!this.g.get()) {
            return Unit.f29295attabal;
        }
        Object objA = a(dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }
}
