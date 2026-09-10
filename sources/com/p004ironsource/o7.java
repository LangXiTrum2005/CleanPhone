package com.p004ironsource;

import android.app.Activity;
import com.p004ironsource.h2;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.Placement;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o7<Listener extends h2> extends s7<Listener> implements AdapterAdInteractionListener {

    public class a extends ks {
        public a() {
        }

        @Override // com.p004ironsource.ks
        public void a() {
            o7.this.P();
        }
    }

    public class b extends ks {
        public b() {
        }

        @Override // com.p004ironsource.ks
        public void a() {
            o7.this.S();
        }
    }

    public class c extends ks {
        public c() {
        }

        @Override // com.p004ironsource.ks
        public void a() {
            o7.this.Q();
        }
    }

    public class d extends ks {
        public d() {
        }

        @Override // com.p004ironsource.ks
        public void a() {
            o7.this.T();
        }
    }

    public class e extends ks {
        public e() {
        }

        @Override // com.p004ironsource.ks
        public void a() {
            o7.this.R();
        }
    }

    public class f extends ks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f26350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26351b;

        public f(int i2, String str) {
            this.f26350a = i2;
            this.f26351b = str;
        }

        @Override // com.p004ironsource.ks
        public void a() {
            o7.this.b(this.f26350a, this.f26351b);
        }
    }

    public o7(vq vqVar, k1 k1Var, BaseAdAdapter<?, ?> baseAdAdapter, a3 a3Var, m5 m5Var, Listener listener) {
        super(vqVar, k1Var, baseAdAdapter, a3Var, m5Var, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        synchronized (this.q) {
            try {
                if (this.f26762e == s7.h.SHOWING) {
                    a(s7.h.NONE);
                    if (this.d != null) {
                        String string = "";
                        if (this.f26759a.a() == IronSource.AD_UNIT.REWARDED_VIDEO) {
                            String strD = ((h2) this.f26760b).d();
                            StringBuilder sb = new StringBuilder("otherInstanceAvailable = ");
                            sb.append(strD.length() > 0 ? "true|".concat(strD) : "false");
                            string = sb.toString();
                        }
                        this.d.f24488i.a(j(), string);
                    }
                    ((h2) this.f26760b).a(this);
                    return;
                }
                ironLog.error("unexpected ad closed for " + k() + " - state = " + this.f26762e);
                c2 c2Var = this.d;
                if (c2Var != null) {
                    c2Var.j.l("unexpected ad closed - state = " + this.f26762e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        IronLog.INTERNAL.verbose(d());
        c2 c2Var = this.d;
        if (c2Var != null) {
            c2Var.f24488i.d(j());
        }
        ((h2) this.f26760b).c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        IronLog.INTERNAL.verbose(d());
        c2 c2Var = this.d;
        if (c2Var != null) {
            c2Var.f24488i.l(j());
        }
        ((h2) this.f26760b).b((o7<?>) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        IronLog.INTERNAL.verbose(d());
        c2 c2Var = this.d;
        if (c2Var != null) {
            c2Var.f24488i.i(j());
        }
        ((h2) this.f26760b).d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        IronLog.INTERNAL.verbose(d());
        c2 c2Var = this.d;
        if (c2Var != null) {
            c2Var.f24488i.k(j());
        }
    }

    public static String a(s7.h hVar, int i2, String str) {
        Locale locale = Locale.ENGLISH;
        return "unexpected show failed, state - " + hVar + ", error - " + i2 + " " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i2 + ", " + str));
        s7.h hVar = this.f26762e;
        if (hVar == s7.h.SHOWING) {
            a(s7.h.FAILED);
            c2 c2Var = this.d;
            if (c2Var != null) {
                c2Var.f24488i.a(j(), i2, str, "");
            }
            ((h2) this.f26760b).a(new IronSourceError(i2, str), (o7<?>) this);
            return;
        }
        String strA = a(hVar, i2, str);
        ironLog.error(a(strA));
        c2 c2Var2 = this.d;
        if (c2Var2 != null) {
            c2Var2.j.t(strA);
        }
    }

    @Override // com.p004ironsource.s7
    public boolean B() {
        if (this.k == null || !y()) {
            return false;
        }
        try {
            Object obj = this.f26761c;
            if (obj instanceof AdapterAdFullScreenInterface) {
                return ((AdapterAdFullScreenInterface) obj).isAdAvailable(this.k);
            }
            IronLog.INTERNAL.error(a("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface"));
            c2 c2Var = this.d;
            if (c2Var != null) {
                c2Var.j.g("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface");
            }
            return false;
        } catch (Throwable th) {
            StringBuilder sbP = com.google.firebase.crashlytics.internal.model.a.p("isReadyToShow - exception = ", th);
            sbP.append(th.getMessage());
            sbP.append(" - state = ");
            sbP.append(this.f26762e);
            String string = sbP.toString();
            IronLog.INTERNAL.error(a(string));
            c2 c2Var2 = this.d;
            if (c2Var2 != null) {
                c2Var2.j.g(string);
            }
        }
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        if (u().c()) {
            u().a(new a());
        } else {
            P();
        }
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        if (u().c()) {
            u().a(new c());
        } else {
            Q();
        }
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowFailed(int i2, String str) {
        if (u().c()) {
            u().a(new f(i2, str));
        } else {
            b(i2, str);
        }
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowSuccess() {
        if (u().c()) {
            u().a(new e());
        } else {
            R();
        }
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        if (u().c()) {
            u().a(new b());
        } else {
            S();
        }
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        if (u().c()) {
            u().a(new d());
        } else {
            T();
        }
    }

    public void a(Activity activity, Placement placement) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + placement.getPlacementName()));
        try {
            this.g = placement;
            a(s7.h.SHOWING);
            this.d.f24488i.a(activity, j());
            Object obj = this.f26761c;
            if (obj instanceof AdapterAdFullScreenInterface) {
                ((AdapterAdFullScreenInterface) obj).showAd(this.k, this);
                return;
            }
            ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
            c2 c2Var = this.d;
            if (c2Var != null) {
                c2Var.j.g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            }
        } catch (Throwable th) {
            q9.d().a(th);
            a(s7.h.FAILED);
            String str = "showAd - exception = " + th.getMessage() + " - state = " + this.f26762e;
            IronLog.INTERNAL.error(a(str));
            c2 c2Var2 = this.d;
            if (c2Var2 != null) {
                c2Var2.j.g(str);
            }
            onAdShowFailed(y1.h(this.f26759a.a()), str);
        }
    }

    public void b(boolean z2) {
        c2 c2Var = this.d;
        if (c2Var != null) {
            c2Var.f24488i.a(z2);
        }
    }
}
