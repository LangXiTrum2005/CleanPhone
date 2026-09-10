package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public interface zzcir extends com.google.android.gms.ads.internal.client.zza, zzdir, zzcii, zzbqj, zzcjy, zzckd, zzbqv, zzbck, zzckh, com.google.android.gms.ads.internal.zzn, zzckk, zzckl, zzcfk, zzckm {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzckd, com.google.android.gms.internal.ads.zzcfk
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i2, int i3);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzcfk
    void setBackgroundColor(int i2);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzcii
    zzfhr zzC();

    WebView zzD();

    @Override // com.google.android.gms.internal.ads.zzckm
    View zzE();

    List zzF();

    void zzG();

    void zzH(int i2);

    void zzI();

    void zzJ();

    Context zzK();

    com.google.android.gms.ads.internal.overlay.zzm zzL();

    com.google.android.gms.ads.internal.overlay.zzm zzM();

    @Override // com.google.android.gms.internal.ads.zzckj
    zzclb zzN();

    String zzO();

    zzckp zzP();

    WebViewClient zzQ();

    boolean zzR();

    @Override // com.google.android.gms.internal.ads.zzckk
    zzayq zzS();

    zzfio zzT();

    zzejb zzU();

    zzeiz zzV();

    boolean zzW();

    boolean zzX();

    void zzY();

    boolean zzZ();

    boolean zzaA(boolean z2, int i2);

    boolean zzaB();

    @Override // com.google.android.gms.internal.ads.zzcjy
    zzfhu zzaC();

    void zzaD(zzfhr zzfhrVar, zzfhu zzfhuVar);

    void zzaE(boolean z2);

    ListenableFuture zzaF();

    void zzaG(boolean z2);

    boolean zzaa();

    void zzab(String str, zzbnn zzbnnVar);

    void zzac(String str, zzbnn zzbnnVar);

    void zzad(String str, Predicate predicate);

    void zzae(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzaf(zzclb zzclbVar);

    void zzag(boolean z2);

    void zzah();

    void zzai(Context context);

    void zzaj(boolean z2);

    void zzak(zzejb zzejbVar);

    void zzal(zzeiz zzeizVar);

    void zzam(int i2);

    void zzan(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzao(boolean z2);

    void zzap();

    void zzaq(zzbjl zzbjlVar);

    zzbjl zzar();

    void zzas(boolean z2);

    void zzat();

    void zzau(String str, String str2, String str3);

    void zzav();

    void zzaw(boolean z2);

    void zzax(zzbji zzbjiVar);

    void zzay(zzbdx zzbdxVar);

    zzbdx zzaz();

    @Override // com.google.android.gms.internal.ads.zzcfk
    zzcjx zzh();

    @Override // com.google.android.gms.internal.ads.zzckd, com.google.android.gms.internal.ads.zzcfk
    Activity zzj();

    @Override // com.google.android.gms.internal.ads.zzcfk
    com.google.android.gms.ads.internal.zza zzk();

    @Override // com.google.android.gms.internal.ads.zzcfk
    zzbgx zzq();

    @Override // com.google.android.gms.internal.ads.zzckl, com.google.android.gms.internal.ads.zzcfk
    VersionInfoParcel zzs();

    @Override // com.google.android.gms.internal.ads.zzcfk
    void zzt(String str, zzcgx zzcgxVar);

    @Override // com.google.android.gms.internal.ads.zzcfk
    void zzw(zzcjx zzcjxVar);
}
