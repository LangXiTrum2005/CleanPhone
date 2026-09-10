package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzdpo implements zzdnu, zzdfm {
    private final zzbto zza;
    private final zzdbc zzb;
    private final zzddd zzc;
    private final zzdai zzd;
    private final zzdip zze;
    private final Context zzf;
    private final zzfhr zzg;
    private final VersionInfoParcel zzh;
    private final zzfik zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = true;
    private final zzbtk zzm;
    private final zzbtl zzn;

    public zzdpo(zzbtk zzbtkVar, zzbtl zzbtlVar, zzbto zzbtoVar, zzdbc zzdbcVar, zzddd zzdddVar, zzdai zzdaiVar, zzdip zzdipVar, Context context, zzfhr zzfhrVar, VersionInfoParcel versionInfoParcel, zzfik zzfikVar) {
        this.zzm = zzbtkVar;
        this.zzn = zzbtlVar;
        this.zza = zzbtoVar;
        this.zzb = zzdbcVar;
        this.zzc = zzdddVar;
        this.zzd = zzdaiVar;
        this.zze = zzdipVar;
        this.zzf = context;
        this.zzg = zzfhrVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzfikVar;
    }

    private static final HashMap zzB(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map2;
    }

    private final void zzi(View view) {
        try {
            zzbto zzbtoVar = this.zza;
            if (zzbtoVar != null && !zzbtoVar.zzu()) {
                zzbtoVar.zzw(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzme)).booleanValue()) {
                    this.zze.zzdu();
                    return;
                }
                return;
            }
            zzbtk zzbtkVar = this.zzm;
            if (zzbtkVar != null && !zzbtkVar.zzq()) {
                zzbtkVar.zzn(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzme)).booleanValue()) {
                    this.zze.zzdu();
                    return;
                }
                return;
            }
            zzbtl zzbtlVar = this.zzn;
            if (zzbtlVar == null || zzbtlVar.zzo()) {
                return;
            }
            zzbtlVar.zzl(ObjectWrapper.wrap(view));
            this.zzd.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzme)).booleanValue()) {
                this.zze.zzdu();
            }
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call handleClick", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzA() {
        try {
            zzbto zzbtoVar = this.zza;
            if (zzbtoVar != null) {
                zzbtoVar.zzC();
            }
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call destroy", e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00cf A[Catch: RemoteException -> 0x002b, JSONException -> 0x0047, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0047, blocks: (B:49:0x00b4, B:50:0x00c9, B:52:0x00cf), top: B:71:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00c9 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zza(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        ClassLoader classLoader;
        Iterator it;
        IObjectWrapper iObjectWrapperZzq;
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzg.zzaj;
            boolean z2 = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcb)).booleanValue() && jSONObject.length() != 0) {
                Map map3 = map == null ? new HashMap() : map;
                Map map4 = map2 == null ? new HashMap() : map2;
                HashMap map5 = new HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                Iterator<String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        WeakReference weakReference = (WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcc)).booleanValue() && next.equals("3010")) {
                                zzbto zzbtoVar = this.zza;
                                Object objUnwrap = null;
                                if (zzbtoVar != null) {
                                    try {
                                        iObjectWrapperZzq = zzbtoVar.zzq();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbtk zzbtkVar = this.zzm;
                                    if (zzbtkVar != null) {
                                        iObjectWrapperZzq = zzbtkVar.zzw();
                                    } else {
                                        zzbtl zzbtlVar = this.zzn;
                                        iObjectWrapperZzq = zzbtlVar != null ? zzbtlVar.zzu() : null;
                                    }
                                }
                                if (iObjectWrapperZzq != null) {
                                    objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzq);
                                }
                                if (objUnwrap != null) {
                                    cls = objUnwrap.getClass();
                                    ArrayList arrayList = new ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbp.zza(jSONArrayOptJSONArray, arrayList);
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    classLoader = this.zzf.getClassLoader();
                                    it = arrayList.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                try {
                                    ArrayList arrayList2 = new ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbp.zza(jSONArrayOptJSONArray, arrayList2);
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    classLoader = this.zzf.getClassLoader();
                                    it = arrayList2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                } catch (JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z2 = false;
                        break;
                    }
                }
            }
            this.zzl = z2;
            HashMap mapZzB = zzB(map);
            HashMap mapZzB2 = zzB(map2);
            zzbto zzbtoVar2 = this.zza;
            if (zzbtoVar2 != null) {
                zzbtoVar2.zzx(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzB), ObjectWrapper.wrap(mapZzB2));
                return;
            }
            zzbtk zzbtkVar2 = this.zzm;
            if (zzbtkVar2 != null) {
                zzbtkVar2.zzy(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzB), ObjectWrapper.wrap(mapZzB2));
                zzbtkVar2.zzo(iObjectWrapperWrap);
                return;
            }
            zzbtl zzbtlVar2 = this.zzn;
            if (zzbtlVar2 != null) {
                zzbtlVar2.zzw(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzB), ObjectWrapper.wrap(mapZzB2));
                zzbtlVar2.zzm(iObjectWrapperWrap);
            }
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call trackView", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzb(View view, Map map) {
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            zzbto zzbtoVar = this.zza;
            if (zzbtoVar != null) {
                zzbtoVar.zzy(iObjectWrapperWrap);
                return;
            }
            zzbtk zzbtkVar = this.zzm;
            if (zzbtkVar != null) {
                zzbtkVar.zzs(iObjectWrapperWrap);
                return;
            }
            zzbtl zzbtlVar = this.zzn;
            if (zzbtlVar != null) {
                zzbtlVar.zzq(iObjectWrapperWrap);
            }
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call untrackView", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzc(View view, View view2, Map map, Map map2, boolean z2, ImageView.ScaleType scaleType) {
        if (this.zzk && this.zzg.zzL) {
            return;
        }
        zzi(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzd(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdfm
    public final void zzdG() {
        try {
            zzbto zzbtoVar = this.zza;
            if (zzbtoVar == null || !zzbtoVar.zzt()) {
                return;
            }
            zzfhr zzfhrVar = this.zzg;
            if (zzfhrVar.zze != 4 && !zzfhrVar.zzaD) {
                return;
            }
            zzbtoVar.zzv();
            this.zzb.zza();
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to report impression from an adapter", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfm
    public final void zzdH() {
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zze(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzf(View view, View view2, Map map, Map map2, boolean z2, ImageView.ScaleType scaleType, int i2) {
        if (!this.zzk) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzg.zzL) {
            zzi(view2);
        } else {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzg() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final boolean zzh() {
        return this.zzg.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzj(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzk(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final JSONObject zzl(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final JSONObject zzm(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzn() {
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzo(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzp(zzblp zzblpVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzr(com.google.android.gms.ads.internal.client.zzdj zzdjVar) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzs(com.google.android.gms.ads.internal.client.zzdf zzdfVar) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzt() {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final int zzu() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final boolean zzv() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzw(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzj) {
                this.zzj = com.google.android.gms.ads.internal.zzt.zzo().zzg(this.zzf, this.zzh.afmaVersion, this.zzg.zzC.toString(), this.zzi.zzg);
            }
            if (this.zzl) {
                zzbto zzbtoVar = this.zza;
                if (zzbtoVar == null) {
                    zzbtk zzbtkVar = this.zzm;
                    if (zzbtkVar != null && !zzbtkVar.zzp()) {
                        zzbtkVar.zzm();
                        this.zzb.zza();
                        return;
                    }
                    zzbtl zzbtlVar = this.zzn;
                    if (zzbtlVar == null || zzbtlVar.zzn()) {
                        return;
                    }
                    zzbtlVar.zzk();
                    this.zzb.zza();
                    return;
                }
                zzfhr zzfhrVar = this.zzg;
                if (zzfhrVar.zzaD) {
                    if (zzbtoVar.zzt()) {
                        return;
                    }
                    zzbtoVar.zzv();
                    this.zzb.zza();
                    return;
                }
                if (zzbtoVar.zzt() && zzfhrVar.zze == 4) {
                    this.zzc.zza();
                } else {
                    zzbtoVar.zzv();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call recordImpression", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzx(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzy() {
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final boolean zzz(Bundle bundle) {
        return false;
    }
}
