package com.google.android.gms.internal.ads;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zzauc implements Supplier {
    private final /* synthetic */ int zzc;
    public static final /* synthetic */ zzauc zzb = new zzauc(1);
    static final /* synthetic */ zzauc zza = new zzauc(0);

    private /* synthetic */ zzauc(int i2) {
        this.zzc = i2;
    }

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.zzc != 0 ? zzaus.zza(null) : new zzauf();
    }
}
