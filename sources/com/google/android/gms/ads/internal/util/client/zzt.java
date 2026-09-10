package com.google.android.gms.ads.internal.util.client;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ zzt[] f11001a;
    public static final zzt zza;
    public static final zzt zzb;
    public static final zzt zzc;
    public static final zzt zzd;

    static {
        zzt zztVar = new zzt("SUCCESS", 0);
        zza = zztVar;
        zzt zztVar2 = new zzt("PERMANENT_FAILURE", 1);
        zzb = zztVar2;
        zzt zztVar3 = new zzt("RETRIABLE_FAILURE", 2);
        zzc = zztVar3;
        zzt zztVar4 = new zzt("BUFFERED", 3);
        zzd = zztVar4;
        f11001a = new zzt[]{zztVar, zztVar2, zztVar3, zztVar4};
    }

    public static zzt[] values() {
        return (zzt[]) f11001a.clone();
    }
}
