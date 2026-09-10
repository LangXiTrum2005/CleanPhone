package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfme extends zzfma {
    private WebView zza;
    private Long zzb;
    private final Map zzc;

    public zzfme(String str, Map map, String str2) {
        super(str);
        this.zzb = null;
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfma
    public final void zzc() {
        super.zzc();
        new Handler().postDelayed(new zzfmd(this), Math.max(4000 - (this.zzb == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfma
    public final void zzi(zzfkt zzfktVar, zzfkr zzfkrVar) {
        JSONObject jSONObject = new JSONObject();
        Map mapZzi = zzfkrVar.zzi();
        Iterator it = mapZzi.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzj(zzfktVar, zzfkrVar, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzfma
    public final void zzo() {
        WebView webView = new WebView(zzflp.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        this.zza.setWebViewClient(new zzfmc(this));
        zzn(this.zza);
        zzflr.zzk(this.zza, null);
        Iterator it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
        } else {
            throw null;
        }
    }
}
