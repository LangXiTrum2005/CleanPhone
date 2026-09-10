package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes4.dex */
public interface zzeiw {
    boolean zza(Context context);

    String zzb(Context context);

    zzejb zzc(String str, WebView webView, String str2, String str3, String str4, zzeiy zzeiyVar, zzeix zzeixVar, String str5);

    zzejb zzd(String str, WebView webView, String str2, String str3, String str4, String str5, zzeiy zzeiyVar, zzeix zzeixVar, String str6);

    void zze(zzfrh zzfrhVar);

    void zzf(zzfrh zzfrhVar);

    void zzg(zzfrh zzfrhVar, View view);

    void zzh(zzfrh zzfrhVar, View view);

    zzfrt zzi(VersionInfoParcel versionInfoParcel, WebView webView, boolean z2);

    void zzj(zzfrt zzfrtVar, zzfrs zzfrsVar);

    void zzk(zzfrt zzfrtVar, View view);
}
