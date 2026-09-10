package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzcbf implements zzcbk {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = androidx.media3.extractor.text.ttml.a.u();
    boolean zza;
    private final zziev zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzcbh zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzcbf(Context context, VersionInfoParcel versionInfoParcel, zzcbh zzcbhVar, String str, zzcbg zzcbgVar) {
        Preconditions.checkNotNull(zzcbhVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzcbhVar;
        Iterator it = zzcbhVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zziev zzievVarZzg = zzigz.zzg();
        zzievVarZzg.zzn(9);
        if (str != null) {
            zzievVarZzg.zzb(str);
            zzievVarZzg.zzc(str);
        }
        zziew zziewVarZzc = zziex.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zziewVarZzc.zza(str2);
        }
        zzievVarZzg.zzd((zziex) zziewVarZzc.zzbu());
        zzigl zziglVarZzc = zzigm.zzc();
        zziglVarZzc.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zziglVarZzc.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zziglVarZzc.zzb(apkVersion);
        }
        zzievVarZzg.zzk((zzigm) zziglVarZzc.zzbu());
        this.zzd = zzievVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final zzcbh zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzb(String str) {
        synchronized (this.zzj) {
            try {
                if (str == null) {
                    this.zzd.zzi();
                } else {
                    this.zzd.zzh(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final boolean zzc() {
        return this.zzi.zzc && !this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzd(View view) {
        Bitmap bitmapCreateBitmap;
        if (this.zzi.zzc && !this.zzl) {
            com.google.android.gms.ads.internal.zzt.zzc();
            final Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (RuntimeException e2) {
                        e = e2;
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to capture the web view", e);
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e4) {
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to capture the webview", e4);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                zzcbj.zza("Failed to capture the webview bitmap.");
            } else {
                this.zzl = true;
                com.google.android.gms.ads.internal.util.zzs.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbe
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzg(bitmap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zze(String str, Map map, int i2) {
        synchronized (this.zzj) {
            if (i2 == 3) {
                try {
                    this.zzm = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap = this.zze;
            if (linkedHashMap.containsKey(str)) {
                if (i2 == 3) {
                    ((zzigj) linkedHashMap.get(str)).zze(4);
                }
                return;
            }
            zzigj zzigjVarZze = zzigk.zze();
            int iZza = zzigi.zza(i2);
            if (iZza != 0) {
                zzigjVarZze.zze(iZza);
            }
            zzigjVarZze.zza(linkedHashMap.size());
            zzigjVarZze.zzb(str);
            zzifi zzifiVarZzc = zzifl.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzifg zzifgVarZzc = zzifh.zzc();
                        zzifgVarZzc.zza(zzhzl.zzv(str2));
                        zzifgVarZzc.zzb(zzhzl.zzv(str3));
                        zzifiVarZzc.zza((zzifh) zzifgVarZzc.zzbu());
                    }
                }
            }
            zzigjVarZze.zzc((zzifl) zzifiVarZzc.zzbu());
            linkedHashMap.put(str, zzigjVarZze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            ListenableFuture listenableFutureZza = zzgym.zza(Collections.EMPTY_MAP);
            zzgxu zzgxuVar = new zzgxu() { // from class: com.google.android.gms.internal.ads.zzcbb
                @Override // com.google.android.gms.internal.ads.zzgxu
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zzh((Map) obj);
                }
            };
            zzgyw zzgywVar = zzcdo.zzg;
            ListenableFuture listenableFutureZzj = zzgym.zzj(listenableFutureZza, zzgxuVar, zzgywVar);
            ListenableFuture listenableFutureZzi = zzgym.zzi(listenableFutureZzj, 10L, TimeUnit.SECONDS, zzcdo.zzd);
            zzgym.zzr(listenableFutureZzj, new zzcba(this, listenableFutureZzi), zzgywVar);
            zzc.add(listenableFutureZzi);
        }
    }

    public final /* synthetic */ void zzg(Bitmap bitmap) {
        zzhzk zzhzkVarZzA = zzhzl.zzA();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzhzkVarZzA);
        synchronized (this.zzj) {
            zziev zzievVar = this.zzd;
            zzigd zzigdVarZzc = zzigf.zzc();
            zzigdVarZzc.zzb(zzhzkVarZzA.zza());
            zzigdVarZzc.zza("image/png");
            zzigdVarZzc.zzc(2);
            zzievVar.zzj((zzigf) zzigdVarZzc.zzbu());
        }
    }

    public final /* synthetic */ ListenableFuture zzh(Map map) {
        int length;
        zzigj zzigjVar;
        ListenableFuture listenableFutureZzk;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        Object obj = this.zzj;
                        synchronized (obj) {
                            try {
                                length = jSONArrayOptJSONArray.length();
                                synchronized (obj) {
                                    zzigjVar = (zzigj) this.zze.get(str);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (zzigjVar == null) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                            sb.append("Cannot find the corresponding resource object for ");
                            sb.append(str);
                            zzcbj.zza(sb.toString());
                        } else {
                            for (int i2 = 0; i2 < length; i2++) {
                                zzigjVar.zzd(jSONArrayOptJSONArray.getJSONObject(i2).getString("threat_type"));
                            }
                            this.zza = (length > 0) | this.zza;
                        }
                    }
                }
            } catch (JSONException e2) {
                if (((Boolean) zzbis.zza.zze()).booleanValue()) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get SafeBrowsing metadata", e2);
                }
                return zzgym.zzc(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z2 = this.zza;
        if (!(z2 && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z2 || !this.zzi.zzd))) {
            return zzgym.zza(null);
        }
        synchronized (this.zzj) {
            try {
                Iterator it = this.zze.values().iterator();
                while (it.hasNext()) {
                    this.zzd.zzf((zzigk) ((zzigj) it.next()).zzbu());
                }
                zziev zzievVar = this.zzd;
                zzievVar.zzl(this.zzf);
                zzievVar.zzm(this.zzg);
                if (zzcbj.zzb()) {
                    String strZza = zzievVar.zza();
                    String strZzg = zzievVar.zzg();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strZza).length() + 38 + String.valueOf(strZzg).length() + 15);
                    sb2.append("Sending SB report\n  url: ");
                    sb2.append(strZza);
                    sb2.append("\n  clickUrl: ");
                    sb2.append(strZzg);
                    sb2.append("\n  resources: \n");
                    StringBuilder sb3 = new StringBuilder(sb2.toString());
                    for (zzigk zzigkVar : zzievVar.zze()) {
                        sb3.append("    [");
                        sb3.append(zzigkVar.zzd());
                        sb3.append("] ");
                        sb3.append(zzigkVar.zzc());
                    }
                    zzcbj.zza(sb3.toString());
                }
                ListenableFuture listenableFutureZzb = new com.google.android.gms.ads.internal.util.zzbl(this.zzh).zzb(1, this.zzi.zzb, null, ((zzigz) zzievVar.zzbu()).zzaN());
                if (zzcbj.zzb()) {
                    listenableFutureZzb.addListener(zzcbd.zza, zzcdo.zza);
                }
                listenableFutureZzk = zzgym.zzk(listenableFutureZzb, zzcbc.zza, zzcdo.zzg);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listenableFutureZzk;
    }
}
