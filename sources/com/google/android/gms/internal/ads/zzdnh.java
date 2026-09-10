package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.applovin.impl.Z;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.common.n.mo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdnh extends zzcvk {
    public static final zzgtd zzc = zzgtd.zzn("3010", "3008", "1005", "1009", ErrorCode.loadInShowingFilter, ErrorCode.inRequestFailPacing);
    private final List zzA;
    private final Executor zzd;
    private final zzdnm zze;
    private final zzdnu zzf;
    private final zzdol zzg;
    private final zzdnr zzh;
    private final zzdnw zzi;
    private final zzija zzj;
    private final zzija zzk;
    private final zzija zzl;
    private final zzija zzm;
    private final zzija zzn;
    private zzdpj zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private final zzcbt zzt;
    private final zzayq zzu;
    private final VersionInfoParcel zzv;
    private final Context zzw;
    private final zzdnj zzx;
    private final zzeqs zzy;
    private final Map zzz;

    public zzdnh(zzcvj zzcvjVar, Executor executor, zzdnm zzdnmVar, zzdnu zzdnuVar, zzdol zzdolVar, zzdnr zzdnrVar, zzdnw zzdnwVar, zzija zzijaVar, zzija zzijaVar2, zzija zzijaVar3, zzija zzijaVar4, zzija zzijaVar5, zzcbt zzcbtVar, zzayq zzayqVar, VersionInfoParcel versionInfoParcel, Context context, zzdnj zzdnjVar, zzeqs zzeqsVar, zzbcn zzbcnVar) {
        super(zzcvjVar);
        this.zzd = executor;
        this.zze = zzdnmVar;
        this.zzf = zzdnuVar;
        this.zzg = zzdolVar;
        this.zzh = zzdnrVar;
        this.zzi = zzdnwVar;
        this.zzj = zzijaVar;
        this.zzk = zzijaVar2;
        this.zzl = zzijaVar3;
        this.zzm = zzijaVar4;
        this.zzn = zzijaVar5;
        this.zzt = zzcbtVar;
        this.zzu = zzayqVar;
        this.zzv = versionInfoParcel;
        this.zzw = context;
        this.zzx = zzdnjVar;
        this.zzy = zzeqsVar;
        this.zzz = new HashMap();
        this.zzA = new ArrayList();
    }

    public static boolean zzI(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlW)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        long jZzA = com.google.android.gms.ads.internal.util.zzs.zzA(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (jZzA >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlX)).intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzac, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzU(zzdpj zzdpjVar) {
        Iterator<String> itKeys;
        View view;
        zzayl zzaylVarZzb;
        try {
            if (!this.zzp) {
                this.zzo = zzdpjVar;
                this.zzg.zza(zzdpjVar);
                this.zzf.zza(zzdpjVar.zzdE(), zzdpjVar.zzk(), zzdpjVar.zzl(), zzdpjVar, zzdpjVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdo)).booleanValue() && (zzaylVarZzb = this.zzu.zzb()) != null) {
                    zzaylVarZzb.zzh(zzdpjVar.zzdE());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzco)).booleanValue()) {
                    zzfhr zzfhrVar = this.zzb;
                    if (zzfhrVar.zzak && (itKeys = zzfhrVar.zzaj.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            zzdpj zzdpjVar2 = this.zzo;
                            WeakReference weakReference = zzdpjVar2 == null ? null : (WeakReference) zzdpjVar2.zzj().get(next);
                            this.zzz.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                zzbcm zzbcmVar = new zzbcm(this.zzw, view);
                                this.zzA.add(zzbcmVar);
                                zzbcmVar.zza(new zzdmw(this, next));
                            }
                        }
                    }
                }
                if (zzdpjVar.zzh() != null) {
                    zzdpjVar.zzh().zza(this.zzt);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final void zzV(zzdpj zzdpjVar) {
        this.zzf.zzb(zzdpjVar.zzdE(), zzdpjVar.zzj());
        if (zzdpjVar.zzdA() != null) {
            zzdpjVar.zzdA().setClickable(false);
            zzdpjVar.zzdA().removeAllViews();
        }
        if (zzdpjVar.zzh() != null) {
            zzdpjVar.zzh().zzb(this.zzt);
        }
        this.zzo = null;
    }

    private final synchronized void zzae(View view, Map map, Map map2) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzw(view, map, map2, zzah());
        this.zzq = true;
    }

    private final synchronized void zzaf(View view, Map map, Map map2) {
        View viewZzag;
        if (!this.zzr && (viewZzag = zzag(map)) != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzoX)).booleanValue()) {
                Rect rect = new Rect();
                if (viewZzag.getGlobalVisibleRect(rect, new Point()) && viewZzag.getHeight() == rect.height() && viewZzag.getWidth() == rect.width()) {
                    this.zzf.zzx(view, map, map2, zzah());
                    this.zzr = true;
                }
            } else if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzoY)).booleanValue()) {
                zzbgb zzbgbVar = zzbgk.zzoZ;
                if (((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).floatValue() > 0.0d) {
                    double dFloatValue = ((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).floatValue();
                    Rect rect2 = new Rect();
                    if (viewZzag.getGlobalVisibleRect(rect2, new Point())) {
                        if (rect2.height() * rect2.width() >= ((double) (viewZzag.getHeight() * viewZzag.getWidth())) * (dFloatValue / 100.0d)) {
                            this.zzf.zzx(view, map, map2, zzah());
                            this.zzr = true;
                        }
                    }
                }
            } else if (zzI(viewZzag)) {
                this.zzf.zzx(view, map, map2, zzah());
                this.zzr = true;
            }
        }
    }

    private final synchronized View zzag(Map map) {
        if (map != null) {
            zzgtd zzgtdVar = zzc;
            int size = zzgtdVar.size();
            int i2 = 0;
            while (i2 < size) {
                WeakReference weakReference = (WeakReference) map.get((String) zzgtdVar.get(i2));
                i2++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzah() {
        zzdpj zzdpjVar = this.zzo;
        if (zzdpjVar == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper iObjectWrapperZzo = zzdpjVar.zzo();
        if (iObjectWrapperZzo != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapperZzo);
        }
        return zzdol.zza;
    }

    private final void zzai(String str, boolean z2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgl)).booleanValue()) {
            zzL("Google", true);
            return;
        }
        ListenableFuture listenableFutureZzX = this.zze.zzX();
        if (listenableFutureZzX == null) {
            return;
        }
        zzgym.zzr(listenableFutureZzX, new zzdmx(this, "Google", true), this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaj, reason: merged with bridge method [inline-methods] */
    public final void zzY(View view, zzejb zzejbVar) {
        zzcir zzcirVarZzW = this.zze.zzW();
        if (!this.zzh.zzd() || zzejbVar == null || zzcirVarZzW == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzejbVar.zza(), view);
    }

    public final synchronized void zzA(com.google.android.gms.ads.internal.client.zzdj zzdjVar) {
        this.zzf.zzr(zzdjVar);
    }

    public final synchronized void zzB(com.google.android.gms.ads.internal.client.zzdf zzdfVar) {
        this.zzf.zzs(zzdfVar);
    }

    public final synchronized void zzC() {
        this.zzf.zzg();
    }

    public final synchronized void zzD() {
        zzdpj zzdpjVar = this.zzo;
        if (zzdpjVar == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z2 = zzdpjVar instanceof zzdof;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzW(z2);
                }
            });
        }
    }

    public final synchronized void zzE(final View view, final int i2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmS)).booleanValue()) {
            zzdpj zzdpjVar = this.zzo;
            if (zzdpjVar == null) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z2 = zzdpjVar instanceof zzdof;
                this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnd
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzX(view, z2, i2);
                    }
                });
            }
        }
    }

    public final synchronized boolean zzF() {
        return this.zzf.zzh();
    }

    public final synchronized int zzG() {
        return this.zzf.zzu();
    }

    public final synchronized boolean zzH() {
        return this.zzf.zzv();
    }

    public final boolean zzJ() {
        return this.zzh.zzc();
    }

    public final String zzK() {
        return this.zzh.zzf();
    }

    public final zzejb zzL(String str, boolean z2) {
        boolean z3;
        boolean z4;
        String str2;
        zzeix zzeixVar;
        zzeiy zzeiyVar;
        String str3;
        zzdnr zzdnrVar = this.zzh;
        if (zzdnrVar.zzd() && !TextUtils.isEmpty(str)) {
            zzdnm zzdnmVar = this.zze;
            zzcir zzcirVarZzW = zzdnmVar.zzW();
            zzcir zzcirVarZzT = zzdnmVar.zzT();
            if (zzcirVarZzW == null && zzcirVarZzT == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            zzdnrVar.zzg();
            int iZzc = zzdnrVar.zzg().zzc();
            int i3 = iZzc - 1;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (iZzc != 1) {
                        str3 = iZzc != 2 ? "UNKNOWN" : "DISPLAY";
                    } else {
                        str3 = "VIDEO";
                    }
                    String strS = android.support.v4.media.a.s(new StringBuilder(str3.length() + 49), "Unknown omid media type: ", str3, ". Not initializing Omid.");
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(strS);
                    return null;
                }
                if (zzcirVarZzW == null) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid media type was display but there was no display webview.");
                    return null;
                }
                z4 = false;
                z3 = true;
            } else if (zzcirVarZzT != null) {
                z3 = false;
                z4 = true;
            } else {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid media type was video but there was no video webview.");
            }
            if (z3) {
                str2 = null;
            } else {
                str2 = "javascript";
                zzcirVarZzW = zzcirVarZzT;
            }
            if (zzcirVarZzW == null) {
                int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Webview is null in InternalNativeAd");
                return null;
            }
            if (!com.google.android.gms.ads.internal.zzt.zzu().zza(this.zzw)) {
                int i8 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            VersionInfoParcel versionInfoParcel = this.zzv;
            int i9 = versionInfoParcel.buddyApkVersion;
            int i10 = versionInfoParcel.clientJarVersion;
            StringBuilder sb = new StringBuilder(Z.a(i9, 1) + String.valueOf(i10).length());
            sb.append(i9);
            sb.append(mo.ono);
            sb.append(i10);
            String string = sb.toString();
            if (z4) {
                zzeixVar = zzeix.VIDEO;
                zzeiyVar = zzeiy.DEFINED_BY_JAVASCRIPT;
            } else {
                zzeixVar = zzeix.NATIVE_DISPLAY;
                zzeiyVar = zzdnmVar.zzx() == 3 ? zzeiy.UNSPECIFIED : zzeiy.ONE_PIXEL;
            }
            zzejb zzejbVarZzd = com.google.android.gms.ads.internal.zzt.zzu().zzd(string, zzcirVarZzW.zzD(), "", "javascript", str2, str, zzeiyVar, zzeixVar, this.zzb.zzal);
            if (zzejbVarZzd == null) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create omid session in InternalNativeAd");
                return null;
            }
            zzdnmVar.zzq(zzejbVarZzd);
            zzcirVarZzW.zzak(zzejbVarZzd);
            if (z4) {
                zzfrh zzfrhVarZza = zzejbVarZzd.zza();
                if (zzcirVarZzT != null) {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zzfrhVarZza, zzcirVarZzT.zzE());
                }
                this.zzs = true;
            }
            if (z2) {
                com.google.android.gms.ads.internal.zzt.zzu().zze(zzejbVarZzd.zza());
                zzcirVarZzW.zze("onSdkLoaded", new ArrayMap(0));
            }
            return zzejbVarZzd;
        }
        return null;
    }

    public final boolean zzM() {
        return this.zzh.zzd();
    }

    public final void zzN(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgl)).booleanValue()) {
            zzdnm zzdnmVar = this.zze;
            if (zzdnmVar.zzx() != 3) {
                zzcdt zzcdtVarZzY = zzdnmVar.zzY();
                if (zzcdtVarZzY == null) {
                    return;
                }
                zzgym.zzr(zzcdtVarZzY, new zzdmy(this, view), this.zzd);
                return;
            }
        }
        zzY(view, this.zze.zzZ());
    }

    public final void zzO(View view) {
        zzejb zzejbVarZzZ = this.zze.zzZ();
        if (!this.zzh.zzd() || zzejbVarZzZ == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzg(zzejbVarZzZ.zza(), view);
    }

    public final zzdnj zzP() {
        return this.zzx;
    }

    public final synchronized void zzQ(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zzy.zza(zzdtVar);
    }

    public final void zzR(Bundle bundle) {
        final zzcir zzcirVarZzT = this.zze.zzT();
        if (zzcirVarZzT == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdne
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgtd zzgtdVar = zzdnh.zzc;
                    zzcirVarZzT.zzd("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e2) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error reading event signals", e2);
        }
    }

    public final /* synthetic */ void zzS() {
        try {
            zzdnm zzdnmVar = this.zze;
            int iZzx = zzdnmVar.zzx();
            if (iZzx == 1) {
                zzbkz zzbkzVarZza = this.zzi.zza();
                if (zzbkzVarZza != null) {
                    zzai("Google", true);
                    zzbkzVarZza.zze((zzbkp) this.zzj.zzb());
                    return;
                }
                return;
            }
            if (iZzx == 2) {
                zzbkw zzbkwVarZzb = this.zzi.zzb();
                if (zzbkwVarZzb != null) {
                    zzai("Google", true);
                    zzbkwVarZzb.zze((zzbkn) this.zzk.zzb());
                    return;
                }
                return;
            }
            if (iZzx == 3) {
                zzblf zzblfVarZzf = this.zzi.zzf(zzdnmVar.zzS());
                if (zzblfVarZzf != null) {
                    if (zzdnmVar.zzT() != null) {
                        zzL("Google", true);
                    }
                    zzblfVarZzf.zze((zzbks) this.zzn.zzb());
                    return;
                }
                return;
            }
            if (iZzx == 6) {
                zzblm zzblmVarZzc = this.zzi.zzc();
                if (zzblmVarZzc != null) {
                    zzai("Google", true);
                    zzblmVarZzc.zze((zzbls) this.zzl.zzb());
                    return;
                }
                return;
            }
            if (iZzx != 7) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Wrong native template id!");
            } else {
                zzbqh zzbqhVarZze = this.zzi.zze();
                if (zzbqhVarZze != null) {
                    zzbqhVarZze.zze((zzbqb) this.zzm.zzb());
                }
            }
        } catch (RemoteException e2) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException when notifyAdLoad is called", e2);
        }
    }

    public final /* synthetic */ void zzT() {
        this.zzf.zzA();
        this.zze.zzae();
    }

    public final /* synthetic */ void zzW(boolean z2) {
        zzdpj zzdpjVar = this.zzo;
        if (zzdpjVar != null) {
            this.zzf.zzf(null, zzdpjVar.zzdE(), this.zzo.zzj(), this.zzo.zzk(), z2, zzah(), 0);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        }
    }

    public final /* synthetic */ void zzX(View view, boolean z2, int i2) {
        zzdpj zzdpjVar = this.zzo;
        if (zzdpjVar != null) {
            this.zzf.zzf(view, zzdpjVar.zzdE(), this.zzo.zzj(), this.zzo.zzk(), z2, zzah(), i2);
        } else {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        }
    }

    public final /* synthetic */ zzdnm zzZ() {
        return this.zze;
    }

    public final synchronized void zza(String str) {
        this.zzf.zzd(str);
    }

    public final /* synthetic */ zzdpj zzaa() {
        return this.zzo;
    }

    public final /* synthetic */ Map zzab() {
        return this.zzz;
    }

    public final synchronized void zzb() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzn();
    }

    public final synchronized void zzc(Bundle bundle) {
        this.zzf.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final synchronized void zzd() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzT();
            }
        });
        super.zzd();
    }

    public final synchronized boolean zze(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zZzz = this.zzf.zzz(bundle);
        this.zzq = zZzz;
        return zZzz;
    }

    public final synchronized void zzf(Bundle bundle) {
        this.zzf.zzk(bundle);
    }

    public final synchronized void zzg(final zzdpj zzdpjVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcm)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdna
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzU(zzdpjVar);
                }
            });
        } else {
            zzU(zzdpjVar);
        }
    }

    public final synchronized void zzh(final zzdpj zzdpjVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcm)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzV(zzdpjVar);
                }
            });
        } else {
            zzV(zzdpjVar);
        }
    }

    public final synchronized void zzi(View view, View view2, Map map, Map map2, boolean z2) {
        zzcir zzcirVarZzT;
        this.zzg.zzb(this.zzo);
        this.zzf.zzc(view, view2, map, map2, z2, zzah());
        if (this.zzs) {
            zzdnm zzdnmVar = this.zze;
            if (zzdnmVar.zzT() != null && (zzcirVarZzT = zzdnmVar.zzT()) != null) {
                zzcirVarZzT.zze("onSdkAdUserInteractionClick", new ArrayMap(0));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzj() {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzS();
            }
        };
        Executor executor = this.zzd;
        executor.execute(runnable);
        if (this.zze.zzx() != 7) {
            final zzdnu zzdnuVar = this.zzf;
            Objects.requireNonNull(zzdnuVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdng
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdnuVar.zzy();
                }
            });
        }
        super.zzj();
    }

    public final synchronized void zzk(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzj(view, motionEvent, view2);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a A[Catch: all -> 0x000a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006c A[Catch: all -> 0x000a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008d A[Catch: all -> 0x000a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    public final synchronized void zzu(View view, Map map, Map map2, boolean z2) {
        Iterator it;
        View view2;
        if (this.zzq) {
            zzaf(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzco)).booleanValue() && this.zzb.zzak) {
            Map map3 = this.zzz;
            Iterator it2 = map3.keySet().iterator();
            while (it2.hasNext()) {
                if (!((Boolean) map3.get((String) it2.next())).booleanValue()) {
                }
            }
            if (!z2) {
                zzae(view, map, map2);
                zzaf(view, map, map2);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeJ)).booleanValue()) {
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                    if (view2 == null) {
                    }
                }
            }
        } else {
            if (!z2) {
                zzae(view, map, map2);
                zzaf(view, map, map2);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeJ)).booleanValue() && map != null) {
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                    if (view2 == null && zzI(view2)) {
                        zzae(view, map, map2);
                        return;
                    }
                }
            }
        }
    }

    public final synchronized JSONObject zzv(View view, Map map, Map map2) {
        return this.zzf.zzl(view, map, map2, zzah());
    }

    public final synchronized JSONObject zzw(View view, Map map, Map map2) {
        return this.zzf.zzm(view, map, map2, zzah());
    }

    public final synchronized void zzx(View view) {
        this.zzf.zzo(view);
    }

    public final synchronized void zzy(zzblp zzblpVar) {
        this.zzf.zzp(zzblpVar);
    }

    public final synchronized void zzz() {
        this.zzf.zzq();
    }
}
