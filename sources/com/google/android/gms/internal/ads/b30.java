package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzn;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface b30 extends zza, qc0, is, ns, ai, zzn {
    void A(boolean z10);

    void B(long j10, boolean z10);

    void D(String str, oq oqVar);

    void E(du0 du0Var, fu0 fu0Var);

    void F(t0 t0Var);

    void G(int i10);

    boolean H(int i10, boolean z10);

    void I(boolean z10);

    void K();

    void L();

    void M(boolean z10);

    void N(t30 t30Var);

    boolean P();

    void R(dg0 dg0Var);

    void S(boolean z10, int i10, String str, String str2, boolean z11);

    void T(jm0 jm0Var);

    void U(int i10);

    void V(String str, String str2);

    void W();

    void X(ri riVar);

    void a0(km0 km0Var);

    int c();

    void c0(boolean z10);

    boolean canGoBack();

    Context d();

    void d0(int i10, boolean z10);

    void destroy();

    void e0(String str, e20 e20Var);

    zzm f0();

    e20 g(String str);

    void g0(zzm zzmVar);

    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    int getWidth();

    void goBack();

    void h();

    void h0(String str, x11 x11Var);

    boolean i();

    void i0(zzc zzcVar, boolean z10, boolean z11, String str);

    boolean isAttachedToWindow();

    ri j();

    void k0(boolean z10, int i10, String str, boolean z11, boolean z12);

    boolean l();

    void l0();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void m();

    qf m0();

    void measure(int i10, int i11);

    String n();

    ListenableFuture o();

    boolean o0();

    void onPause();

    void onResume();

    void p();

    o8 p0();

    void q(zzm zzmVar);

    fu0 r();

    void r0(int i10);

    void s();

    boolean s0();

    void setBackgroundColor(int i10);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void t(String str, String str2);

    ao t0();

    void u(Context context);

    void w(String str, oq oqVar);

    void w0(boolean z10);

    jm0 x();

    void x0(ao aoVar);

    void y(int i10, boolean z10, boolean z11);

    du0 zzC();

    WebView zzD();

    View zzE();

    ArrayList zzF();

    void zzJ();

    zzm zzL();

    t0 zzN();

    g30 zzP();

    boolean zzR();

    pu0 zzT();

    km0 zzU();

    t30 zzh();

    em zzi();

    Activity zzj();

    com.google.android.gms.ads.internal.zza zzk();

    void zzl();

    String zzm();

    String zzn();

    int zzp();

    lj1 zzq();

    VersionInfoParcel zzs();

    void zzv(int i10);

    int zzx();

    void zzz();
}
