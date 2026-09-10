package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeaf {
    private final zzdzp zza;
    private final zzdur zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    public zzeaf(zzdzp zzdzpVar, zzdur zzdurVar) {
        this.zza = zzdzpVar;
        this.zzb = zzdurVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc(List list) {
        zzduq zzduqVarZzc;
        zzduq zzduqVarZzc2;
        zzbvn zzbvnVar;
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbpm zzbpmVar = (zzbpm) it.next();
                    String string = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkH)).booleanValue() || (zzduqVarZzc2 = this.zzb.zzc(zzbpmVar.zza)) == null || (zzbvnVar = zzduqVarZzc2.zzc) == null) ? "" : zzbvnVar.toString();
                    String str = string;
                    boolean z2 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkI)).booleanValue() && (zzduqVarZzc = this.zzb.zzc(zzbpmVar.zza)) != null && zzduqVarZzc.zzd;
                    List list2 = this.zzd;
                    String str2 = zzbpmVar.zza;
                    list2.add(new zzeae(str2, str, this.zzb.zzd(str2), zzbpmVar.zzb ? 1 : 0, zzbpmVar.zzd, zzbpmVar.zzc, z2));
                }
                this.zze = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza() {
        this.zza.zzb(new zzead(this));
    }

    public final JSONArray zzb() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            try {
                if (!this.zze) {
                    zzdzp zzdzpVar = this.zza;
                    if (!zzdzpVar.zze()) {
                        zza();
                        return jSONArray;
                    }
                    zzc(zzdzpVar.zzd());
                }
                Iterator it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((zzeae) it.next()).zza());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
