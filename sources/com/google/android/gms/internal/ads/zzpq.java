package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzpq extends AudioDeviceCallback {
    final /* synthetic */ zzpu zza;

    public /* synthetic */ zzpq(zzpu zzpuVar, byte[] bArr) {
        Objects.requireNonNull(zzpuVar);
        this.zza = zzpuVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpu zzpuVar = this.zza;
        zzpuVar.zzf(zzpp.zza(zzpuVar.zzg(), zzpuVar.zzj(), zzpuVar.zzh()));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        String str = zzfj.zza;
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            zzpu zzpuVar = this.zza;
            if (Objects.equals(audioDeviceInfo, zzpuVar.zzh())) {
                zzpuVar.zzi(null);
                break;
            }
        }
        zzpu zzpuVar2 = this.zza;
        zzpuVar2.zzf(zzpp.zza(zzpuVar2.zzg(), zzpuVar2.zzj(), zzpuVar2.zzh()));
    }
}
