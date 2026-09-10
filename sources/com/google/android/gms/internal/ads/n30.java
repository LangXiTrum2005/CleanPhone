package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n30 extends FrameLayout implements b30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r30 f17626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o8 f17627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f17628c;

    public n30(r30 r30Var, yh0 yh0Var) {
        super(r30Var.getContext());
        this.f17628c = new AtomicBoolean();
        this.f17626a = r30Var;
        this.f17627b = new o8(r30Var.f19325a.f13033c, this, this, yh0Var);
        addView(r30Var);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void A(boolean z10) {
        this.f17626a.A(z10);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void B(long j10, boolean z10) {
        this.f17626a.B(j10, z10);
    }

    @Override // com.google.android.gms.internal.ads.qc0
    public final void C() {
        r30 r30Var = this.f17626a;
        if (r30Var != null) {
            r30Var.C();
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void D(String str, oq oqVar) {
        this.f17626a.D(str, oqVar);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void E(du0 du0Var, fu0 fu0Var) {
        r30 r30Var = this.f17626a;
        r30Var.f19336j = du0Var;
        r30Var.f19337k = fu0Var;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void F(t0 t0Var) {
        this.f17626a.F(t0Var);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void G(int i10) {
        this.f17626a.G(i10);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final boolean H(int i10, boolean z10) {
        if (!this.f17628c.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) zzba.zzc().a(am.C1)).booleanValue()) {
            return false;
        }
        r30 r30Var = this.f17626a;
        if (r30Var.getParent() instanceof ViewGroup) {
            ((ViewGroup) r30Var.getParent()).removeView(r30Var);
        }
        r30Var.H(i10, z10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void I(boolean z10) {
        this.f17626a.f19339n.E = z10;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void K() {
        o8 o8Var = this.f17627b;
        o8Var.getClass();
        k9.c0.d("onDestroy must be called from the UI thread.");
        d10 d10Var = (d10) o8Var.f18185f;
        if (d10Var != null) {
            d10Var.f13339e.a();
            z00 z00Var = d10Var.f13341g;
            if (z00Var != null) {
                z00Var.k();
            }
            d10Var.d();
            ((n30) o8Var.f18183d).removeView((d10) o8Var.f18185f);
            o8Var.f18185f = null;
        }
        this.f17626a.K();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void L() {
        this.f17626a.f19328b0 = true;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void M(boolean z10) {
        this.f17626a.M(z10);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void N(t30 t30Var) {
        this.f17626a.N(t30Var);
    }

    @Override // com.google.android.gms.internal.ads.qc0
    public final void O() {
        r30 r30Var = this.f17626a;
        if (r30Var != null) {
            r30Var.O();
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final boolean P() {
        return this.f17626a.P();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void R(dg0 dg0Var) {
        this.f17626a.R(dg0Var);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void S(boolean z10, int i10, String str, String str2, boolean z11) {
        this.f17626a.S(z10, i10, str, str2, z11);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void T(jm0 jm0Var) {
        this.f17626a.T(jm0Var);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void U(int i10) {
        this.f17626a.U(i10);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void V(String str, String str2) {
        this.f17626a.V(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void W() {
        this.f17626a.W();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void X(ri riVar) {
        this.f17626a.X(riVar);
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final void a(String str, String str2) {
        this.f17626a.a("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void a0(km0 km0Var) {
        this.f17626a.a0(km0Var);
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final void b(String str, JSONObject jSONObject) {
        this.f17626a.a(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final int c() {
        return ((Boolean) zzba.zzc().a(am.T4)).booleanValue() ? this.f17626a.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void c0(boolean z10) {
        this.f17626a.c0(z10);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final boolean canGoBack() {
        return this.f17626a.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final Context d() {
        return this.f17626a.f19325a.f13033c;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void d0(int i10, boolean z10) {
        this.f17626a.d0(i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void destroy() {
        jm0 jm0VarX;
        r30 r30Var = this.f17626a;
        km0 km0VarZzU = r30Var.zzU();
        if (km0VarZzU != null) {
            y01 y01Var = zzs.zza;
            y01Var.post(new d(km0VarZzU, 25));
            y01Var.postDelayed(new m30(r30Var, 1), ((Integer) zzba.zzc().a(am.f12327r6)).intValue());
        } else if (!((Boolean) zzba.zzc().a(am.f12359t6)).booleanValue() || (jm0VarX = r30Var.x()) == null) {
            r30Var.destroy();
        } else {
            zzs.zza.post(new zd1(15, this, jm0VarX));
        }
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void e(String str, Map map) {
        this.f17626a.e(str, map);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void e0(String str, e20 e20Var) {
        this.f17626a.e0(str, e20Var);
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void f(String str, JSONObject jSONObject) {
        this.f17626a.f(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final zzm f0() {
        return this.f17626a.f0();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final e20 g(String str) {
        return this.f17626a.g(str);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void g0(zzm zzmVar) {
        this.f17626a.g0(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void goBack() {
        this.f17626a.goBack();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void h() {
        this.f17626a.h();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void h0(String str, x11 x11Var) {
        this.f17626a.h0(str, x11Var);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final boolean i() {
        return this.f17626a.i();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void i0(zzc zzcVar, boolean z10, boolean z11, String str) {
        this.f17626a.i0(zzcVar, z10, z11, str);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final ri j() {
        return this.f17626a.j();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void k0(boolean z10, int i10, String str, boolean z11, boolean z12) {
        this.f17626a.k0(z10, i10, str, z11, z12);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final boolean l() {
        return this.f17626a.l();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void l0() {
        setBackgroundColor(0);
        this.f17626a.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void loadData(String str, String str2, String str3) {
        this.f17626a.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f17626a.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void loadUrl(String str) {
        this.f17626a.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void m() {
        this.f17626a.m();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final qf m0() {
        return this.f17626a.f19327b;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final String n() {
        return this.f17626a.n();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final ListenableFuture o() {
        return this.f17626a.o();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final boolean o0() {
        return this.f17628c.get();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        r30 r30Var = this.f17626a;
        if (r30Var != null) {
            r30Var.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void onPause() {
        z00 z00Var;
        o8 o8Var = this.f17627b;
        o8Var.getClass();
        k9.c0.d("onPause must be called from the UI thread.");
        d10 d10Var = (d10) o8Var.f18185f;
        if (d10Var != null && (z00Var = d10Var.f13341g) != null) {
            z00Var.m();
        }
        this.f17626a.onPause();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void onResume() {
        this.f17626a.onResume();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void p() {
        this.f17626a.p();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final o8 p0() {
        return this.f17627b;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void q(zzm zzmVar) {
        this.f17626a.q(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final fu0 r() {
        return this.f17626a.f19337k;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void r0(int i10) {
        this.f17626a.r0(i10);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void s() {
        km0 km0VarZzU;
        jm0 jm0VarX;
        TextView textView = new TextView(getContext());
        zzt.zzc();
        textView.setText(zzs.zzB());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12359t6)).booleanValue();
        r30 r30Var = this.f17626a;
        if (zBooleanValue && (jm0VarX = r30Var.x()) != null) {
            jm0VarX.d(textView);
            return;
        }
        if (((Boolean) zzba.zzc().a(am.f12343s6)).booleanValue() && (km0VarZzU = r30Var.zzU()) != null && ((jy0) km0VarZzU.f16481b.f11931g) == jy0.HTML) {
            im0 im0VarZzu = zzt.zzu();
            ky0 ky0Var = km0VarZzU.f16480a;
            ((tc0) im0VarZzu).getClass();
            tc0.o(new fm0(ky0Var, textView, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final boolean s0() {
        return this.f17626a.s0();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.b30
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f17626a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.b30
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f17626a.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f17626a.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f17626a.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void t(String str, String str2) throws Throwable {
        this.f17626a.t(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final ao t0() {
        return this.f17626a.t0();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void u(Context context) {
        this.f17626a.u(context);
    }

    @Override // com.google.android.gms.internal.ads.ai
    public final void v(zh zhVar) {
        this.f17626a.v(zhVar);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void w(String str, oq oqVar) {
        this.f17626a.w(str, oqVar);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void w0(boolean z10) {
        this.f17626a.w0(z10);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final jm0 x() {
        return this.f17626a.x();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void x0(ao aoVar) {
        this.f17626a.x0(aoVar);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void y(int i10, boolean z10, boolean z11) {
        this.f17626a.y(i10, z10, z11);
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final du0 zzC() {
        return this.f17626a.f19336j;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final WebView zzD() {
        return this.f17626a;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final ArrayList zzF() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt != this.f17626a) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void zzJ() {
        this.f17626a.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final zzm zzL() {
        return this.f17626a.zzL();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final t0 zzN() {
        return this.f17626a.zzN();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final g30 zzP() {
        return this.f17626a.f19339n;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final boolean zzR() {
        return this.f17626a.zzR();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final pu0 zzT() {
        return this.f17626a.f19329c;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final km0 zzU() {
        return this.f17626a.zzU();
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final void zza(String str) {
        this.f17626a.Q(str);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdk() {
        this.f17626a.zzdk();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdl() {
        this.f17626a.zzdl();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final t30 zzh() {
        return this.f17626a.zzh();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final em zzi() {
        return this.f17626a.J;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final Activity zzj() {
        return this.f17626a.f19325a.f13031a;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final zza zzk() {
        return this.f17626a.f19333g;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void zzl() {
        this.f17626a.zzl();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final String zzm() {
        return this.f17626a.zzm();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final String zzn() {
        return this.f17626a.zzn();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final int zzp() {
        return this.f17626a.zzp();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final lj1 zzq() {
        return this.f17626a.L;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final VersionInfoParcel zzs() {
        return this.f17626a.f19331e;
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void zzv(int i10) {
        d10 d10Var = (d10) this.f17627b.f18185f;
        if (d10Var != null) {
            if (((Boolean) zzba.zzc().a(am.f12430y0)).booleanValue()) {
                d10Var.f13336b.setBackgroundColor(i10);
                d10Var.f13337c.setBackgroundColor(i10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final int zzx() {
        return ((Boolean) zzba.zzc().a(am.T4)).booleanValue() ? this.f17626a.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final void zzz() {
        this.f17626a.zzz();
    }

    @Override // com.google.android.gms.internal.ads.b30
    public final View zzE() {
        return this;
    }
}
