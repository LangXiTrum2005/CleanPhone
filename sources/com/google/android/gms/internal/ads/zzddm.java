package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzddm extends zzdbj implements zzayk {
    private final Map zzb;
    private final Context zzc;
    private final zzfbo zzd;

    public zzddm(Context context, Set set, zzfbo zzfboVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfboVar;
    }

    public final synchronized void zza(View view) {
        try {
            zzayl zzaylVar = (zzayl) this.zzb.get(view);
            if (zzaylVar == null) {
                zzayl zzaylVar2 = new zzayl(this.zzc, view);
                zzaylVar2.zzc(this);
                this.zzb.put(view, zzaylVar2);
                zzaylVar = zzaylVar2;
            }
            if (this.zzd.zzX) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbx)).booleanValue()) {
                    zzaylVar.zzg(((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbw)).longValue());
                    return;
                }
            }
            zzaylVar.zzf();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            ((zzayl) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final synchronized void zzdn(final zzayj zzayjVar) {
        zzq(new zzdbi() { // from class: com.google.android.gms.internal.ads.zzddl
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(Object obj) {
                ((zzayk) obj).zzdn(zzayjVar);
            }
        });
    }
}
