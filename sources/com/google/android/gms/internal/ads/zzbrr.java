package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzbrr {
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    private final zzfnr zze;
    private final com.google.android.gms.ads.internal.util.zzbc zzf;
    private final com.google.android.gms.ads.internal.util.zzbc zzg;
    private zzbrq zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbrr(Context context, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.util.zzbc zzbcVar, com.google.android.gms.ads.internal.util.zzbc zzbcVar2, zzfnr zzfnrVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = versionInfoParcel;
        this.zze = zzfnrVar;
        this.zzf = zzbcVar;
        this.zzg = zzbcVar2;
    }

    public final zzbrq zza(zzayq zzayqVar) {
        zzfne zzfneVarZzn = zzfne.zzn(this.zzb, 6);
        zzfneVarZzn.zza();
        final zzbrq zzbrqVar = new zzbrq(this.zzg);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final zzayq zzayqVar2 = null;
        zzcdo.zzf.execute(new Runnable(zzayqVar2, zzbrqVar) { // from class: com.google.android.gms.internal.ads.zzbrh
            private final /* synthetic */ zzbrq zzb;

            {
                this.zzb = zzbrqVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(null, this.zzb);
            }
        });
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine: Promise created");
        zzbrqVar.zze(new zzbra(this, zzbrqVar, zzfneVarZzn), new zzbrb(this, zzbrqVar, zzfneVarZzn));
        return zzbrqVar;
    }

    public final zzbrl zzb(zzayq zzayqVar) {
        com.google.android.gms.ads.internal.util.zze.zza("getEngine: Trying to acquire lock");
        Object obj = this.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine: Lock acquired");
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock acquired");
                        zzbrq zzbrqVar = this.zzh;
                        if (zzbrqVar != null && this.zzi == 0) {
                            zzbrqVar.zze(new zzcdx() { // from class: com.google.android.gms.internal.ads.zzbrd
                                @Override // com.google.android.gms.internal.ads.zzcdx
                                public final /* synthetic */ void zza(Object obj2) {
                                    this.zza.zze((zzbqm) obj2);
                                }
                            }, zzbre.zza);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock released");
        zzbrq zzbrqVar2 = this.zzh;
        if (zzbrqVar2 != null && zzbrqVar2.zzi() != -1) {
            int i2 = this.zzi;
            if (i2 == 0) {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (NO_UPDATE): Lock released");
                return this.zzh.zza();
            }
            if (i2 != 1) {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (UPDATING): Lock released");
                return this.zzh.zza();
            }
            this.zzi = 2;
            zza(null);
            com.google.android.gms.ads.internal.util.zze.zza("getEngine (PENDING_UPDATE): Lock released");
            return this.zzh.zza();
        }
        this.zzi = 2;
        this.zzh = zza(null);
        com.google.android.gms.ads.internal.util.zze.zza("getEngine (NULL or REJECTED): Lock released");
        return this.zzh.zza();
    }

    public final void zzc() {
        zzbrq zzbrqVar = this.zzh;
        if (zzbrqVar != null) {
            zzbrqVar.zzc();
            this.zzh = null;
        }
    }

    public final /* synthetic */ void zzd(zzayq zzayqVar, final zzbrq zzbrqVar) {
        final long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        final ArrayList arrayList = new ArrayList();
        try {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
            final zzbqu zzbquVar = new zzbqu(this.zzb, this.zzd, null, null);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After createJavascriptEngine");
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbquVar.zzi(new zzbql() { // from class: com.google.android.gms.internal.ads.zzbrf
                @Override // com.google.android.gms.internal.ads.zzbql
                public final /* synthetic */ void zza() {
                    long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                    final long j = jCurrentTimeMillis;
                    final ArrayList arrayList2 = arrayList;
                    arrayList2.add(Long.valueOf(jCurrentTimeMillis2 - j));
                    String strValueOf = String.valueOf(arrayList2.get(0));
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 52);
                    sb.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                    sb.append(strValueOf);
                    sb.append(" ms.");
                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                    zzfxl zzfxlVar = com.google.android.gms.ads.internal.util.zzs.zza;
                    final zzbrr zzbrrVar = this.zza;
                    final zzbrq zzbrqVar2 = zzbrqVar;
                    final zzbqm zzbqmVar = zzbquVar;
                    zzfxlVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrg
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbrrVar.zzf(zzbrqVar2, zzbqmVar, arrayList2, j);
                        }
                    }, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzd)).intValue());
                }
            });
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbquVar.zzm("/jsLoaded", new zzbqw(this, jCurrentTimeMillis, zzbrqVar, zzbquVar));
            com.google.android.gms.ads.internal.util.zzbv zzbvVar = new com.google.android.gms.ads.internal.util.zzbv();
            zzbqx zzbqxVar = new zzbqx(this, null, zzbquVar, zzbvVar);
            zzbvVar.zzb(zzbqxVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            if (!((Boolean) zzbik.zzd.zze()).booleanValue() || TextUtils.equals(this.zzb.getPackageName(), "com.google.android.gms")) {
                zzbquVar.zzm("/requestReload", zzbqxVar);
            }
            String str = this.zzc;
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str)));
            if (str.endsWith(".js")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbquVar.zzf(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (str.startsWith("<html>")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbquVar.zzh(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbquVar.zzg(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new zzbqz(this, zzbrqVar, zzbquVar, arrayList, jCurrentTimeMillis), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zze)).intValue());
        } catch (Throwable th) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating webview.", th);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziF)).booleanValue()) {
                zzbrqVar.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziH)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbrqVar.zzg();
            } else {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbrqVar.zzg();
            }
        }
    }

    public final /* synthetic */ void zze(zzbqm zzbqmVar) {
        if (zzbqmVar.zzk()) {
            this.zzi = 1;
        }
    }

    public final /* synthetic */ void zzf(zzbrq zzbrqVar, final zzbqm zzbqmVar, ArrayList arrayList, long j) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (zzbrqVar.zzi() != -1 && zzbrqVar.zzi() != 1) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziF)).booleanValue()) {
                        zzbrqVar.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        zzbrqVar.zzg();
                    }
                    zzgyw zzgywVar = zzcdo.zzf;
                    Objects.requireNonNull(zzbqmVar);
                    zzgywVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrc
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbqmVar.zzj();
                        }
                    });
                    String strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzd));
                    int iZzi = zzbrqVar.zzi();
                    int i2 = this.zzi;
                    String strValueOf2 = String.valueOf(arrayList.get(0));
                    long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - j;
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 94 + String.valueOf(iZzi).length() + 39 + String.valueOf(i2).length() + 57 + strValueOf2.length() + 42 + String.valueOf(jCurrentTimeMillis).length() + 15);
                    sb.append("Could not receive /jsLoaded in ");
                    sb.append(strValueOf);
                    sb.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                    sb.append(iZzi);
                    sb.append(". Update status(onEngLoadedTimeout) is ");
                    sb.append(i2);
                    sb.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                    sb.append(strValueOf2);
                    sb.append(" ms. Total latency(onEngLoadedTimeout) is ");
                    sb.append(jCurrentTimeMillis);
                    sb.append(" ms. Rejecting.");
                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                    com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ Object zzg() {
        return this.zza;
    }

    public final /* synthetic */ zzfnr zzh() {
        return this.zze;
    }

    public final /* synthetic */ zzbrq zzi() {
        return this.zzh;
    }

    public final /* synthetic */ void zzj(zzbrq zzbrqVar) {
        this.zzh = zzbrqVar;
    }

    public final /* synthetic */ int zzk() {
        return this.zzi;
    }

    public final /* synthetic */ void zzl(int i2) {
        this.zzi = i2;
    }
}
