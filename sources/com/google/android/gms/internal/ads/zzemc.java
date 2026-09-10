package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzemc {
    private final zzgzf zzc;
    private zzems zzf;
    private final String zzh;
    private final int zzi;
    private final zzemr zzj;
    private zzfhr zzk;
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final List zzd = new ArrayList();
    private final Set zze = new HashSet();
    private int zzg = Integer.MAX_VALUE;
    private boolean zzl = false;

    public zzemc(zzfic zzficVar, zzemr zzemrVar, zzgzf zzgzfVar) {
        this.zzi = zzficVar.zzb.zzb.zzr;
        this.zzj = zzemrVar;
        this.zzc = zzgzfVar;
        this.zzh = zzemy.zzb(zzficVar);
        List list = zzficVar.zzb.zza;
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.put((zzfhr) list.get(i2), Integer.valueOf(i2));
        }
        this.zzb.addAll(list);
    }

    private final synchronized boolean zze() {
        if (this.zzl) {
            return false;
        }
        List list = this.zzb;
        if (!list.isEmpty() && ((zzfhr) list.get(0)).zzav && !this.zzd.isEmpty()) {
            return false;
        }
        if (!zzd()) {
            List list2 = this.zzd;
            if (list2.size() < this.zzi && zzf(false)) {
                return true;
            }
        }
        return false;
    }

    private final synchronized boolean zzf(boolean z2) {
        try {
            for (zzfhr zzfhrVar : this.zzb) {
                Integer num = (Integer) this.zza.get(zzfhrVar);
                int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z2 || !this.zze.contains(zzfhrVar.zzat)) {
                    int i2 = this.zzg;
                    if (iIntValue < i2) {
                        return true;
                    }
                    if (iIntValue > i2) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean zzg() {
        try {
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.zza.get((zzfhr) it.next());
                if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.zzg) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean zzh() {
        return zzf(true) || zzg();
    }

    private final synchronized void zzi() {
        this.zzj.zzd(this.zzk);
        zzems zzemsVar = this.zzf;
        if (zzemsVar != null) {
            this.zzc.zza(zzemsVar);
        } else {
            this.zzc.zzb(new zzemv(3, this.zzh));
        }
    }

    @Nullable
    public final synchronized zzfhr zza() {
        try {
            if (zze()) {
                int i2 = 0;
                while (true) {
                    List list = this.zzb;
                    if (i2 >= list.size()) {
                        break;
                    }
                    zzfhr zzfhrVar = (zzfhr) list.get(i2);
                    String str = zzfhrVar.zzat;
                    Set set = this.zze;
                    if (!set.contains(str)) {
                        if (zzfhrVar.zzav) {
                            this.zzl = true;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            set.add(str);
                        }
                        this.zzd.add(zzfhrVar);
                        return (zzfhr) list.remove(i2);
                    }
                    i2++;
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(zzems zzemsVar, zzfhr zzfhrVar) {
        this.zzl = false;
        this.zzd.remove(zzfhrVar);
        if (zzd()) {
            zzemsVar.zzm();
            return;
        }
        Integer num = (Integer) this.zza.get(zzfhrVar);
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (iIntValue > this.zzg) {
            this.zzj.zzf(zzfhrVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzf(this.zzk);
        }
        this.zzg = iIntValue;
        this.zzf = zzemsVar;
        this.zzk = zzfhrVar;
        if (zzh()) {
            return;
        }
        zzi();
    }

    public final synchronized void zzc(Throwable th, zzfhr zzfhrVar) {
        this.zzl = false;
        this.zzd.remove(zzfhrVar);
        this.zze.remove(zzfhrVar.zzat);
        if (zzd() || zzh()) {
            return;
        }
        zzi();
    }

    public final synchronized boolean zzd() {
        return this.zzc.isDone();
    }
}
