package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r2 implements i9, q9, j9, aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o9 f14986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i9 f14987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q9 f14988c;
    public final /* synthetic */ j9 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aa f14989e;
    public w9 f;

    public r2(o9 impressionDependency, i9 impressionClick, q9 impressionDismiss, j9 impressionComplete, aa impressionView) {
        Intrinsics.f(impressionDependency, "impressionDependency");
        Intrinsics.f(impressionClick, "impressionClick");
        Intrinsics.f(impressionDismiss, "impressionDismiss");
        Intrinsics.f(impressionComplete, "impressionComplete");
        Intrinsics.f(impressionView, "impressionView");
        this.f14986a = impressionDependency;
        this.f14987b = impressionClick;
        this.f14988c = impressionDismiss;
        this.d = impressionComplete;
        this.f14989e = impressionView;
        this.f = w9.LOADING;
    }

    public final void A() {
        if (j() && Intrinsics.a(this.f14986a.a(), y.c.g)) {
            z();
        }
    }

    public final void B() {
        if (this.f14986a.l().b() <= 1) {
            K();
            n9 n9VarL = this.f14986a.l();
            n9VarL.b(n9VarL.b() + 1);
        }
    }

    public final boolean C() {
        if (this.f14986a.r().u() == null) {
            return true;
        }
        ij ijVarU = this.f14986a.r().u();
        return (ijVarU != null ? ijVarU.getRootView() : null) == null;
    }

    public final void D() {
        try {
            if (this.f14986a.r() instanceof bj) {
                ((bj) this.f14986a.r()).I();
            } else {
                this.f14986a.r().v();
                this.f14986a.r().a(mi.VOLUME_CHANGE);
            }
        } catch (Exception e2) {
            za.b("Invalid mute video command", e2);
        }
    }

    public final void E() {
        b(this.f14986a.n(), Float.valueOf(this.f14986a.r().t()), Float.valueOf(this.f14986a.r().s()));
        d();
    }

    public final void F() {
        if (this.f14986a.l().c() <= 1) {
            B();
            n9 n9VarL = this.f14986a.l();
            n9VarL.c(n9VarL.c() + 1);
        }
    }

    public final void G() {
        if (this.f != w9.DISPLAYED || j()) {
            return;
        }
        l();
        d(true);
    }

    public final void H() {
        try {
            h3 h3VarR = this.f14986a.r();
            Intrinsics.d(h3VarR, "null cannot be cast to non-null type com.chartboost.sdk.internal.video.VideoProtocol");
            ((bj) h3VarR).L();
        } catch (Exception e2) {
            za.b("Invalid pause video command", e2);
        }
    }

    public final void I() {
        try {
            h3 h3VarR = this.f14986a.r();
            Intrinsics.d(h3VarR, "null cannot be cast to non-null type com.chartboost.sdk.internal.video.VideoProtocol");
            ((bj) h3VarR).M();
        } catch (Exception e2) {
            za.b("Invalid play video command", e2);
        }
    }

    public final void J() {
        this.f = w9.LOADING;
        CBError.Impression impressionA = this.f14986a.r().A();
        if (impressionA == null) {
            g();
        } else {
            b(impressionA);
        }
    }

    public final void K() {
        a(this.f14986a.n(), Float.valueOf(this.f14986a.r().t()), Float.valueOf(this.f14986a.r().s()));
    }

    public final boolean L() {
        return this.f14986a.a().c();
    }

    public final void M() {
        if (this.f14986a.l().d() <= 1) {
            z();
            B();
            n9 n9VarL = this.f14986a.l();
            n9VarL.d(n9VarL.d() + 1);
        }
    }

    public final void N() {
        try {
            if (this.f14986a.r() instanceof bj) {
                ((bj) this.f14986a.r()).O();
            } else {
                this.f14986a.r().D();
                this.f14986a.r().a(mi.VOLUME_CHANGE);
            }
        } catch (Exception e2) {
            za.b("Invalid unmute video command", e2);
        }
    }

    public final void O() {
        this.f14986a.r().w();
    }

    public final void P() {
        this.f14986a.r().f();
    }

    @Override // com.chartboost.sdk.impl.i9
    public void a(String str, CBError.Click error) {
        Intrinsics.f(error, "error");
        this.f14987b.a(str, error);
    }

    public final void b(CBError.Impression error) {
        Intrinsics.f(error, "error");
        if (j()) {
            this.f14986a.c().m();
        } else {
            a(error);
        }
    }

    @Override // com.chartboost.sdk.impl.q9
    public void c() {
        this.f14988c.c();
    }

    @Override // com.chartboost.sdk.impl.i9
    public void d() {
        this.f14987b.d();
    }

    @Override // com.chartboost.sdk.impl.aa
    public boolean e() {
        return this.f14989e.e();
    }

    @Override // com.chartboost.sdk.impl.aa
    public boolean f() {
        return this.f14989e.f();
    }

    @Override // com.chartboost.sdk.impl.aa
    public void g() {
        this.f14989e.g();
    }

    @Override // com.chartboost.sdk.impl.aa
    public boolean h() {
        return this.f14989e.h();
    }

    @Override // com.chartboost.sdk.impl.aa
    public ViewGroup i() {
        return this.f14989e.i();
    }

    @Override // com.chartboost.sdk.impl.aa
    public boolean j() {
        return this.f14989e.j();
    }

    @Override // com.chartboost.sdk.impl.aa
    public void k() {
        this.f14989e.k();
    }

    @Override // com.chartboost.sdk.impl.aa
    public void l() {
        this.f14989e.l();
    }

    public final void m() {
        a(this.f);
    }

    public final void n() {
        try {
            h3 h3VarR = this.f14986a.r();
            Intrinsics.d(h3VarR, "null cannot be cast to non-null type com.chartboost.sdk.internal.video.VideoProtocol");
            ((bj) h3VarR).E();
        } catch (Exception e2) {
            za.b("Invalid close video command", e2);
        }
    }

    public final String o() {
        return this.f14986a.b().m();
    }

    @Override // com.chartboost.sdk.impl.aa
    public void onResume() {
        this.f14989e.onResume();
    }

    @Override // com.chartboost.sdk.impl.aa
    public void onStart() {
        this.f14989e.onStart();
    }

    public final String p() {
        return this.f14986a.b().t();
    }

    public w9 q() {
        return this.f;
    }

    public final String r() {
        return this.f14986a.n();
    }

    public final String s() {
        return this.f14986a.r().i();
    }

    public final String t() {
        return this.f14986a.r().k();
    }

    public final String u() {
        return this.f14986a.r().m();
    }

    public final String v() {
        return this.f14986a.r().o();
    }

    public final String w() {
        return this.f14986a.r().p();
    }

    public final int x() {
        if (this.f14986a.r() instanceof bj) {
            return ((bj) this.f14986a.r()).G();
        }
        return -1;
    }

    public final ij y() {
        return this.f14986a.r().u();
    }

    public final void z() {
        if (this.f14986a.l().a() <= 1) {
            a();
            n9 n9VarL = this.f14986a.l();
            n9VarL.a(n9VarL.a() + 1);
        }
    }

    @Override // com.chartboost.sdk.impl.aa
    public void a(w9 state, CBImpressionActivity activity) {
        Intrinsics.f(state, "state");
        Intrinsics.f(activity, "activity");
        this.f14989e.a(state, activity);
    }

    @Override // com.chartboost.sdk.impl.i9
    public void c(f3 cbUrl) {
        Intrinsics.f(cbUrl, "cbUrl");
        this.f14987b.c(cbUrl);
    }

    @Override // com.chartboost.sdk.impl.aa
    public void d(boolean z2) {
        this.f14989e.d(z2);
    }

    @Override // com.chartboost.sdk.impl.i9
    public void e(boolean z2) {
        this.f14987b.e(z2);
    }

    @Override // com.chartboost.sdk.impl.q9
    public void f(boolean z2) {
        this.f14988c.f(z2);
    }

    @Override // com.chartboost.sdk.impl.aa
    public void a(ViewGroup viewGroup) {
        this.f14989e.a(viewGroup);
    }

    @Override // com.chartboost.sdk.impl.aa
    public void c(boolean z2) {
        this.f14989e.c(z2);
    }

    public final void d(f3 cbUrl) {
        Intrinsics.f(cbUrl, "cbUrl");
        a(cbUrl.b(), cbUrl.a(), this.f);
    }

    @Override // com.chartboost.sdk.impl.j9
    public void a() {
        this.d.a();
    }

    @Override // com.chartboost.sdk.impl.i9
    public boolean a(String urlFromCreative, Boolean bool, w9 impressionState) {
        Intrinsics.f(urlFromCreative, "urlFromCreative");
        Intrinsics.f(impressionState, "impressionState");
        return this.f14987b.a(urlFromCreative, bool, impressionState);
    }

    @Override // com.chartboost.sdk.impl.i9
    public void b(f3 cbUrl) {
        Intrinsics.f(cbUrl, "cbUrl");
        this.f14987b.b(cbUrl);
    }

    @Override // com.chartboost.sdk.impl.q9
    public void a(w9 state) {
        Intrinsics.f(state, "state");
        this.f14988c.a(state);
    }

    @Override // com.chartboost.sdk.impl.aa
    public void b() {
        this.f14989e.b();
    }

    @Override // com.chartboost.sdk.impl.aa
    public void a(CBError.Impression error) {
        Intrinsics.f(error, "error");
        this.f14989e.a(error);
    }

    public void b(w9 newState) {
        Intrinsics.f(newState, "newState");
        this.f = newState;
    }

    @Override // com.chartboost.sdk.impl.i9
    public void a(f3 cbUrl) {
        Intrinsics.f(cbUrl, "cbUrl");
        this.f14987b.a(cbUrl);
    }

    public final void a(List verificationScriptResourceList, Integer num) {
        Intrinsics.f(verificationScriptResourceList, "verificationScriptResourceList");
        this.f14986a.r().a(verificationScriptResourceList, num);
    }

    @Override // com.chartboost.sdk.impl.aa
    public void b(boolean z2) {
        this.f14989e.b(z2);
    }

    public final void b(float f) {
        this.f14986a.r().b(f);
    }

    public final void a(float f, float f2) {
        this.f14986a.r().a(f, f2);
    }

    @Override // com.chartboost.sdk.impl.i9
    public void b(String location, Float f, Float f2) {
        Intrinsics.f(location, "location");
        this.f14987b.b(location, f, f2);
    }

    @Override // com.chartboost.sdk.impl.j9
    public void a(String location, Float f, Float f2) {
        Intrinsics.f(location, "location");
        this.d.a(location, f, f2);
    }

    public final void a(String event) {
        List list;
        Intrinsics.f(event, "event");
        if (event.length() <= 0 || (list = (List) this.f14986a.b().l().get(event)) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f14986a.r().d((String) it.next());
        }
    }

    public final void a(mi vastVideoEvent) {
        Intrinsics.f(vastVideoEvent, "vastVideoEvent");
        this.f14986a.r().a(vastVideoEvent);
    }

    public final void a(boolean z2, String forceOrientation) {
        Intrinsics.f(forceOrientation, "forceOrientation");
        this.f14986a.r().a(z2, forceOrientation);
    }

    public final void a(float f) {
        this.f14986a.r().a(f);
    }

    @Override // com.chartboost.sdk.impl.aa
    public void a(boolean z2) {
        this.f14989e.a(z2);
    }

    public final void a(xd playerState) {
        Intrinsics.f(playerState, "playerState");
        this.f14986a.r().a(playerState);
    }
}
