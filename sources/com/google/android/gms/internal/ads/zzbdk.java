package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzbdk extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzbdb zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzbdk() {
        zzbdb zzbdbVar = new zzbdb();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzbdbVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbib.zzd.zze()).intValue();
        this.zzg = ((Long) zzbib.zza.zze()).intValue();
        this.zzh = ((Long) zzbib.zze.zze()).intValue();
        this.zzi = ((Long) zzbib.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzaA)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzaB)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzaC)).intValue();
        this.zze = ((Long) zzbib.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzaE);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzaF)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzaG)).booleanValue();
        ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzaH)).getClass();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00f7 */
    /* JADX WARN: Code duplicated, block: B:64:0x00e8 A[EXC_TOP_SPLITTER, LOOP:1: B:64:0x00e8->B:73:0x00e8, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdk.run():void");
    }

    public final void zza() {
        synchronized (this.zzc) {
            try {
                if (this.zza) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Content hash thread already started, quitting...");
                } else {
                    this.zza = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(View view) {
        try {
            zzbda zzbdaVar = new zzbda(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context contextZze = com.google.android.gms.ads.internal.zzt.zzg().zze();
            if (contextZze != null) {
                String str = this.zzm;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = (String) view.getTag(contextZze.getResources().getIdentifier((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzaD), "id", contextZze.getPackageName()));
                    if (str2 != null && str2.equals(str)) {
                        return;
                    }
                }
            }
            zzbdj zzbdjVarZzc = zzc(view, zzbdaVar);
            zzbdaVar.zzi();
            if (zzbdjVarZzc.zza == 0 && zzbdjVarZzc.zzb == 0) {
                return;
            }
            int i2 = zzbdjVarZzc.zzb;
            if (i2 != 0) {
                if (i2 == 0) {
                }
                this.zzd.zzc(zzbdaVar);
            } else if (zzbdaVar.zzl() == 0) {
                return;
            }
            if (this.zzd.zza(zzbdaVar)) {
                return;
            }
            this.zzd.zzc(zzbdaVar);
        } catch (Exception e2) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception in fetchContentOnUIThread", e2);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "ContentFetchTask.fetchContent");
        }
    }

    public final zzbdj zzc(View view, zzbda zzbdaVar) {
        if (view == null) {
            return new zzbdj(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzbdj(this, 0, 0);
            }
            zzbdaVar.zzg(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzbdj(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzcir)) {
            WebView webView = (WebView) view;
            zzbdaVar.zze();
            webView.post(new zzbdi(this, zzbdaVar, webView, globalVisibleRect));
            return new zzbdj(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new zzbdj(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            zzbdj zzbdjVarZzc = zzc(viewGroup.getChildAt(i4), zzbdaVar);
            i2 += zzbdjVarZzc.zza;
            i3 += zzbdjVarZzc.zzb;
        }
        return new zzbdj(this, i2, i3);
    }

    public final void zzd(zzbda zzbdaVar, WebView webView, String str, boolean z2) {
        zzbda zzbdaVar2;
        zzbdaVar.zzd();
        try {
            if (TextUtils.isEmpty(str)) {
                zzbdaVar2 = zzbdaVar;
            } else {
                String strOptString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzbdaVar2 = zzbdaVar;
                    zzbdaVar2.zzf(strOptString, z2, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb.append(title);
                    sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                    sb.append(strOptString);
                    zzbdaVar.zzf(sb.toString(), z2, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                    zzbdaVar2 = zzbdaVar;
                }
            }
            if (zzbdaVar2.zza()) {
                this.zzd.zzb(zzbdaVar2);
            }
        } catch (JSONException unused) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Json string may be malformed.");
        } catch (Throwable th) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            StringBuilder sb = new StringBuilder(40);
            sb.append("ContentFetchThread: paused, pause = true");
            String string = sb.toString();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        }
    }
}
