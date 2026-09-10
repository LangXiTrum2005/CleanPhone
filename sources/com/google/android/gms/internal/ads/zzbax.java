package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbax extends zzbbh {
    private List zzh;
    private final Context zzi;

    public zzbax(zzazt zzaztVar, String str, String str2, zzavs zzavsVar, int i2, int i3, Context context) {
        super(zzaztVar, "JC98YOkW1OV00In88Kxh39aoA4/Lc5LugpNahl16Tw21h78xPzCO3AkqsFSMWF+O", "uHu4aeoXgHtmEAr/p8TbphROLjKobmRTgSnNeTPf/24=", zzavsVar, i2, 31);
        this.zzh = null;
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzavs zzavsVar = this.zzd;
        zzavsVar.zzq(-1L);
        zzavsVar.zzr(-1L);
        Context contextZzb = this.zzi;
        if (contextZzb == null) {
            contextZzb = this.zza.zzb();
        }
        if (this.zzh == null) {
            this.zzh = (List) this.zze.invoke(null, contextZzb);
        }
        List list = this.zzh;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (zzavsVar) {
            zzavsVar.zzq(((Long) this.zzh.get(0)).longValue());
            zzavsVar.zzr(((Long) this.zzh.get(1)).longValue());
        }
    }
}
