package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfrj {
    private final zzfrv zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze;
    private final String zzf;
    private final zzfrk zzg;

    private zzfrj(zzfrv zzfrvVar, WebView webView, String str, List list, String str2, String str3, zzfrk zzfrkVar) {
        this.zza = zzfrvVar;
        this.zzb = webView;
        this.zzg = zzfrkVar;
        this.zzf = str2;
        this.zze = str3;
    }

    public static zzfrj zza(zzfrv zzfrvVar, WebView webView, String str, String str2) {
        if (str2 != null) {
            zzftf.zzd(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new zzfrj(zzfrvVar, webView, null, null, str, str2, zzfrk.HTML);
    }

    public static zzfrj zzb(zzfrv zzfrvVar, WebView webView, String str, String str2) {
        zzftf.zzd("", 256, "CustomReferenceData is greater than 256 characters");
        return new zzfrj(zzfrvVar, webView, null, null, str, "", zzfrk.JAVASCRIPT);
    }

    public final zzfrv zzc() {
        return this.zza;
    }

    public final List zzd() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zze() {
        return Collections.unmodifiableMap(this.zzd);
    }

    public final WebView zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zze;
    }

    public final zzfrk zzi() {
        return this.zzg;
    }
}
