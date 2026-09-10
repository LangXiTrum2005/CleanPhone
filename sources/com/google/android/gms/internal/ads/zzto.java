package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzto extends zztf {
    private final HashMap zza = new HashMap();

    @Nullable
    private Handler zzb;

    @Nullable
    private zzgy zzc;

    public abstract void zzA(Object obj, zzui zzuiVar, zzbq zzbqVar);

    public final void zzB(final Object obj, zzui zzuiVar) {
        zzcw.zzd(!this.zza.containsKey(obj));
        zzuh zzuhVar = new zzuh() { // from class: com.google.android.gms.internal.ads.zztl
            @Override // com.google.android.gms.internal.ads.zzuh
            public final void zza(zzui zzuiVar2, zzbq zzbqVar) {
                this.zza.zzA(obj, zzuiVar2, zzbqVar);
            }
        };
        zztm zztmVar = new zztm(this, obj);
        this.zza.put(obj, new zztn(zzuiVar, zzuhVar, zztmVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzuiVar.zzh(handler, zztmVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzuiVar.zzg(handler2, zztmVar);
        zzuiVar.zzm(zzuhVar, this.zzc, zzb());
        if (zzu()) {
            return;
        }
        zzuiVar.zzi(zzuhVar);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    @CallSuper
    public final void zzj() {
        for (zztn zztnVar : this.zza.values()) {
            zztnVar.zza.zzi(zztnVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztf
    @CallSuper
    public final void zzl() {
        for (zztn zztnVar : this.zza.values()) {
            zztnVar.zza.zzk(zztnVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztf
    @CallSuper
    public void zzn(@Nullable zzgy zzgyVar) {
        this.zzc = zzgyVar;
        this.zzb = zzei.zzy(null);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    @CallSuper
    public void zzq() {
        for (zztn zztnVar : this.zza.values()) {
            zztnVar.zza.zzp(zztnVar.zzb);
            zztnVar.zza.zzs(zztnVar.zzc);
            zztnVar.zza.zzr(zztnVar.zzc);
        }
        this.zza.clear();
    }

    public int zzw(Object obj, int i) {
        return 0;
    }

    public long zzx(Object obj, long j, @Nullable zzug zzugVar) {
        return j;
    }

    @Nullable
    public zzug zzy(Object obj, zzug zzugVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzui
    @CallSuper
    public void zzz() throws IOException {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zztn) it.next()).zza.zzz();
        }
    }
}
