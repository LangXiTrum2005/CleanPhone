package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public interface zzrf {
    void zzA();

    void zzB();

    default void zzC() {
    }

    void zza(zzrc zzrcVar);

    default void zzb(zzpn zzpnVar) {
    }

    default void zzc(zzdn zzdnVar) {
    }

    boolean zzd(zzv zzvVar);

    int zze(zzv zzvVar);

    default zzpw zzf(zzv zzvVar) {
        throw null;
    }

    long zzg(boolean z2);

    void zzh(zzv zzvVar, int i2, int[] iArr) throws zzra;

    void zzi();

    void zzj();

    boolean zzk(ByteBuffer byteBuffer, long j, int i2) throws zzrb, zzre;

    void zzl() throws zzre;

    boolean zzm();

    boolean zzn();

    void zzo(zzav zzavVar);

    zzav zzp();

    void zzq(boolean z2);

    void zzr(zzd zzdVar);

    void zzs(int i2);

    void zzt(zze zzeVar);

    default void zzu(AudioDeviceInfo audioDeviceInfo) {
    }

    default void zzv(int i2) {
    }

    long zzw();

    default void zzx(int i2, int i3) {
    }

    void zzy(float f);

    void zzz();
}
