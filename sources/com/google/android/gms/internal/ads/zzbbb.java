package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbbb extends zzbbh {
    private final zzbaa zzh;
    private long zzi;

    public zzbbb(zzazt zzaztVar, String str, String str2, zzavs zzavsVar, int i2, int i3, zzbaa zzbaaVar) {
        super(zzaztVar, "7i2iPrjrwVOXQymI9kbzBw+Saen0JiBKsL25H084g9vqkkZvrS3PC/gXCAaliMdd", "jjLuguQ1TtUBIYvLkWHGRHLEQB49t1f8VaYjdD5pX6Q=", zzavsVar, i2, 53);
        this.zzh = zzbaaVar;
        if (zzbaaVar != null) {
            this.zzi = zzbaaVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            this.zzd.zzH(((Long) this.zze.invoke(null, Long.valueOf(this.zzi))).longValue());
        }
    }
}
