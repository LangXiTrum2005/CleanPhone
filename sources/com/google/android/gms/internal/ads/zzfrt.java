package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfrt {
    private final zzfrv zza;
    private final WebView zzb;
    private zzftw zzc;
    private final HashMap zzd;
    private final zzfsj zze;

    private zzfrt(zzfrv zzfrvVar, WebView webView, boolean z2) {
        HashMap map = new HashMap();
        this.zzd = map;
        this.zze = new zzfsj();
        zzftf.zza();
        this.zza = zzfrvVar;
        this.zzb = webView;
        if (zzc() != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzfrh) it.next()).zzb(webView);
            }
            this.zzc = new zzftw(webView);
        }
        if (!WebViewFeature.a("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        zze();
        WebViewCompat.a(this.zzb, "omidJsSessionService", new HashSet(Arrays.asList("*")), new zzfrr(this));
    }

    public static zzfrt zza(zzfrv zzfrvVar, WebView webView, boolean z2) {
        return new zzfrt(zzfrvVar, webView, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        WebViewCompat.f(this.zzb, "omidJsSessionService");
    }

    public final void zzb(zzfrs zzfrsVar) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfrh) it.next()).zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzfrq(this, zzfrsVar, timer), 1000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zzc() {
        zzftw zzftwVar = this.zzc;
        if (zzftwVar == null) {
            return null;
        }
        return (View) zzftwVar.get();
    }

    public final void zzd(View view, zzfro zzfroVar, String str) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfrh) it.next()).zzd(view, zzfroVar, "Ad overlay");
        }
        this.zze.zzb(view, zzfroVar, "Ad overlay");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zzf(String str) {
        zzfrm zzfrmVar = zzfrm.DEFINED_BY_JAVASCRIPT;
        zzfrp zzfrpVar = zzfrp.DEFINED_BY_JAVASCRIPT;
        zzfru zzfruVar = zzfru.JAVASCRIPT;
        zzfrl zzfrlVar = new zzfrl(zzfri.zza(zzfrmVar, zzfrpVar, zzfruVar, zzfruVar, false), zzfrj.zza(this.zza, this.zzb, null, null), str);
        this.zzd.put(str, zzfrlVar);
        zzfrlVar.zzb(zzc());
        for (zzfsi zzfsiVar : this.zze.zza()) {
            zzfrlVar.zzd((View) zzfsiVar.zza().get(), zzfsiVar.zzc(), zzfsiVar.zzd());
        }
        zzfrlVar.zza();
    }

    public final /* synthetic */ void zzg(String str) {
        HashMap map = this.zzd;
        zzfrh zzfrhVar = (zzfrh) map.get(str);
        if (zzfrhVar != null) {
            zzfrhVar.zzc();
            map.remove(str);
        }
    }
}
