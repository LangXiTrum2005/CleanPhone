package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
final class zzglv implements zzgls {
    private final zzgnc zza;
    private final long zzb;

    public zzglv(zzfzm zzfzmVar, zzgnc zzgncVar, long j) {
        this.zza = zzgncVar;
        this.zzb = j;
    }

    private static boolean zzc(zzgcs zzgcsVar) {
        int iZza = zzgcsVar.zzb().zza().zza();
        int iZzb = zzgcsVar.zzb().zza().zzb();
        byte[] versionArray = zzatg.zza();
        Intrinsics.f(versionArray, "versionArray");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        Intrinsics.e(byteBufferAllocate, "allocate(...)");
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) iZza);
        byteBufferAllocate.putInt(iZzb);
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.e(bArrArray, "array(...)");
        return Arrays.equals(bArrArray, versionArray);
    }

    @Override // com.google.android.gms.internal.ads.zzgls
    public final boolean zza(zzgcs zzgcsVar) {
        if (zzgcsVar == null || zzgcsVar.equals(zzgcs.zzg())) {
            this.zza.zzb(20202);
            return true;
        }
        if (!zzc(zzgcsVar)) {
            this.zza.zzb(20205);
            return true;
        }
        boolean z2 = zzgcsVar.zzb().zzc() - System.currentTimeMillis() <= this.zzb;
        if (z2) {
            this.zza.zzb(20203);
        }
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzgls
    public final boolean zzb(zzgcs zzgcsVar) {
        if (zzgcsVar == null || zzgcsVar.equals(zzgcs.zzg())) {
            this.zza.zzb(20204);
            return false;
        }
        if (zzc(zzgcsVar)) {
            return true;
        }
        this.zza.zzb(20206);
        return false;
    }
}
