package com.google.android.gms.ads.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.internal.ads.pi1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzo extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzs f11212a;

    public zzo(zzs zzsVar) {
        this.f11212a = zzsVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzs zzsVar = this.f11212a;
        zzbh zzbhVar = zzsVar.f11225f;
        if (zzbhVar != null) {
            try {
                zzbhVar.zzd(pi1.C(1, null, null));
            } catch (RemoteException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
        zzbh zzbhVar2 = zzsVar.f11225f;
        if (zzbhVar2 != null) {
            try {
                zzbhVar2.zzc(0);
            } catch (RemoteException e11) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e11);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzs zzsVar = this.f11212a;
        int iZzE = 0;
        if (str.startsWith(zzsVar.y1())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            zzbh zzbhVar = zzsVar.f11225f;
            if (zzbhVar != null) {
                try {
                    zzbhVar.zzd(pi1.C(3, null, null));
                } catch (RemoteException e10) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
                }
            }
            zzbh zzbhVar2 = zzsVar.f11225f;
            if (zzbhVar2 != null) {
                try {
                    zzbhVar2.zzc(3);
                } catch (RemoteException e11) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e11);
                }
            }
            zzsVar.x1(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            zzbh zzbhVar3 = zzsVar.f11225f;
            if (zzbhVar3 != null) {
                try {
                    zzbhVar3.zzd(pi1.C(1, null, null));
                } catch (RemoteException e12) {
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e12);
                }
            }
            zzbh zzbhVar4 = zzsVar.f11225f;
            if (zzbhVar4 != null) {
                try {
                    zzbhVar4.zzc(0);
                } catch (RemoteException e13) {
                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e13);
                }
            }
            zzsVar.x1(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            zzbh zzbhVar5 = zzsVar.f11225f;
            if (zzbhVar5 != null) {
                try {
                    zzbhVar5.zzf();
                } catch (RemoteException e14) {
                    int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e14);
                }
            }
            zzsVar.getClass();
            String queryParameter = Uri.parse(str).getQueryParameter("height");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    zzay.zza();
                    iZzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(zzsVar.f11222c, Integer.parseInt(queryParameter));
                } catch (NumberFormatException unused) {
                }
            }
            zzsVar.x1(iZzE);
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        zzbh zzbhVar6 = zzsVar.f11225f;
        if (zzbhVar6 != null) {
            try {
                zzbhVar6.zzh();
                zzsVar.f11225f.zze();
            } catch (RemoteException e15) {
                int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e15);
            }
        }
        zzsVar.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        zzsVar.f11222c.startActivity(intent);
        return true;
    }
}
