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
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public interface zzcex extends com.google.android.gms.ads.internal.client.zza, zzdds, zzceo, zzbmk, zzcga, zzcge, zzbmw, zzayk, zzcgh, com.google.android.gms.ads.internal.zzn, zzcgk, zzcgl, zzcbs, zzcgm {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcge, com.google.android.gms.internal.ads.zzcbs
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

    void measure(int i, int i2);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzcbs
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzcbs
    void zzC(zzcfz zzcfzVar);

    @Override // com.google.android.gms.internal.ads.zzceo
    zzfbo zzD();

    Context zzE();

    @Override // com.google.android.gms.internal.ads.zzcgm
    View zzF();

    WebView zzG();

    WebViewClient zzH();

    @Override // com.google.android.gms.internal.ads.zzcgk
    zzava zzI();

    zzazx zzJ();

    zzbfk zzK();

    com.google.android.gms.ads.internal.overlay.zzm zzL();

    com.google.android.gms.ads.internal.overlay.zzm zzM();

    zzcgp zzN();

    @Override // com.google.android.gms.internal.ads.zzcgj
    zzcgr zzO();

    zzecp zzP();

    zzecr zzQ();

    @Override // com.google.android.gms.internal.ads.zzcga
    zzfbr zzR();

    zzfcn zzS();

    AI zzT();

    String zzU();

    List zzV();

    void zzW(zzfbo zzfboVar, zzfbr zzfbrVar);

    void zzX();

    void zzY();

    void zzZ(int i);

    void zzaA(String str, Predicate predicate);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD(boolean z, int i);

    boolean zzaE();

    boolean zzaF();

    boolean zzaG();

    boolean zzaH();

    void zzaa();

    void zzab();

    void zzac(boolean z);

    void zzad();

    void zzae(String str, String str2, String str3);

    void zzaf();

    void zzag(String str, zzbjp zzbjpVar);

    void zzah();

    void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzaj(zzcgr zzcgrVar);

    void zzak(zzazx zzazxVar);

    void zzal(boolean z);

    void zzam();

    void zzan(Context context);

    void zzao(boolean z);

    void zzap(zzbfi zzbfiVar);

    void zzaq(boolean z);

    void zzar(zzbfk zzbfkVar);

    void zzas(zzecp zzecpVar);

    void zzat(zzecr zzecrVar);

    void zzau(int i);

    void zzav(boolean z);

    void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzax(boolean z);

    void zzay(boolean z);

    void zzaz(String str, zzbjp zzbjpVar);

    @Override // com.google.android.gms.internal.ads.zzcge, com.google.android.gms.internal.ads.zzcbs
    Activity zzi();

    @Override // com.google.android.gms.internal.ads.zzcbs
    com.google.android.gms.ads.internal.zza zzj();

    @Override // com.google.android.gms.internal.ads.zzcbs
    zzbcy zzm();

    @Override // com.google.android.gms.internal.ads.zzcgl, com.google.android.gms.internal.ads.zzcbs
    VersionInfoParcel zzn();

    @Override // com.google.android.gms.internal.ads.zzcbs
    zzcfz zzq();

    @Override // com.google.android.gms.internal.ads.zzcbs
    void zzt(String str, zzcde zzcdeVar);
}
