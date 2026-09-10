package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import com.applovin.impl.Z;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzse implements zzqj {
    private final Context zza;
    private final zzsd zzb;
    private zzed zzc;
    private zzdn zzd;
    private zzpp zze;
    private zzpu zzf;
    private Looper zzg;
    private Context zzh;
    private final zzsi zzi;

    public /* synthetic */ zzse(zzsc zzscVar, byte[] bArr) {
        this.zza = zzscVar.zzd();
        zzsi zzsiVarZzg = zzscVar.zzg();
        zzsiVarZzg.getClass();
        this.zzi = zzsiVarZzg;
        this.zze = zzscVar.zze();
        this.zzb = zzscVar.zzd() != null ? new zzsd(this, null) : null;
        this.zzd = zzdn.zza;
    }

    @EnsuresNonNull
    private final void zzj(zzqc zzqcVar) {
        Context context;
        zzk();
        zzpu zzpuVar = this.zzf;
        if (zzpuVar == null && (context = this.zza) != null) {
            zzpu zzpuVar2 = new zzpu(context, new zzpt() { // from class: com.google.android.gms.internal.ads.zzsb
                @Override // com.google.android.gms.internal.ads.zzpt
                public final /* synthetic */ void zza(zzpp zzppVar) {
                    this.zza.zzg(zzppVar);
                }
            }, zzqcVar.zzb, zzqcVar.zzc);
            this.zzf = zzpuVar2;
            this.zze = zzpuVar2.zzd();
        } else if (zzpuVar != null) {
            AudioDeviceInfo audioDeviceInfo = zzqcVar.zzc;
            if (audioDeviceInfo != null) {
                zzpuVar.zzc(audioDeviceInfo);
            }
            this.zzf.zzb(zzqcVar.zzb);
        }
        this.zze.getClass();
    }

    private final void zzk() {
        if (this.zza == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zzg;
        boolean z2 = true;
        if (looper != null && looper != looperMyLooper) {
            z2 = false;
        }
        String strZzl = zzl(looper);
        String strZzl2 = zzl(looperMyLooper);
        if (!z2) {
            throw new IllegalStateException(zzgqr.zzd("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", strZzl, strZzl2));
        }
        this.zzg = looperMyLooper;
    }

    private static String zzl(Looper looper) {
        return looper == null ? AbstractJsonLexerKt.NULL : looper.getThread().getName();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0041  */
    @Override // com.google.android.gms.internal.ads.zzqj
    public final zzqe zza(zzqc zzqcVar) {
        zzj(zzqcVar);
        zzsi zzsiVar = this.zzi;
        zzv zzvVar = zzqcVar.zza;
        zzd zzdVar = zzqcVar.zzb;
        zzpw zzpwVarZza = zzsiVar.zza(zzvVar, zzdVar);
        zzqd zzqdVar = new zzqd();
        int i2 = 0;
        if (Objects.equals(zzvVar.zzo, "audio/raw")) {
            int i3 = zzvVar.zzI;
            if (!zzfj.zzA(i3)) {
                Z.w(new StringBuilder(String.valueOf(i3).length() + 22), "Invalid PCM encoding: ", i3, "ATAudioOutputProvider");
            } else if (i3 != 2) {
                i2 = 1;
            } else {
                i2 = 2;
            }
        } else if (this.zze.zzd(zzvVar, zzdVar) != null) {
            i2 = 2;
        }
        zzqdVar.zzd(i2);
        zzqdVar.zza(zzpwVarZza.zzb);
        zzqdVar.zzb(zzpwVarZza.zzc);
        zzqdVar.zzc(zzpwVarZza.zzd);
        return zzqdVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final zzqi zzb(zzqc zzqcVar) throws zzqa {
        int i2;
        int iIntValue;
        int i3;
        int iZzD;
        int i4;
        zzj(zzqcVar);
        zzv zzvVar = zzqcVar.zza;
        String str = zzvVar.zzo;
        if (Objects.equals(str, "audio/raw")) {
            int i5 = zzvVar.zzI;
            zzgqa.zza(zzfj.zzA(i5));
            i2 = zzvVar.zzH;
            int i6 = zzvVar.zzG;
            iIntValue = zzfj.zzB(i6);
            iZzD = zzfj.zzD(i5) * i6;
            i4 = i5;
            i3 = 0;
        } else {
            i2 = zzvVar.zzH;
            zzpw zzpwVar = zzpw.zza;
            Pair pairZzd = this.zze.zzd(zzvVar, zzqcVar.zzb);
            if (pairZzd == null) {
                throw new zzqa("Unable to configure passthrough for: ".concat(String.valueOf(zzvVar)));
            }
            int iIntValue2 = ((Integer) pairZzd.first).intValue();
            iIntValue = ((Integer) pairZzd.second).intValue();
            i3 = 2;
            iZzD = -1;
            i4 = iIntValue2;
        }
        int i7 = i2;
        if (i4 == 0) {
            String strValueOf = String.valueOf(zzvVar);
            StringBuilder sb = new StringBuilder(Z.a(i3, 37) + strValueOf.length());
            sb.append("Invalid output encoding (mode=");
            sb.append(i3);
            sb.append(") for: ");
            sb.append(strValueOf);
            throw new zzqa(sb.toString());
        }
        if (iIntValue == 0) {
            String strValueOf2 = String.valueOf(zzvVar);
            StringBuilder sb2 = new StringBuilder(Z.a(i3, 43) + strValueOf2.length());
            sb2.append("Invalid output channel config (mode=");
            sb2.append(i3);
            sb2.append(") for: ");
            sb2.append(strValueOf2);
            throw new zzqa(sb2.toString());
        }
        int i8 = zzvVar.zzj;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i8 == -1) {
            i8 = 768000;
        }
        int i9 = i8;
        int iMax = zzqcVar.zzf;
        if (iMax == -1) {
            int i10 = iZzD;
            int minBufferSize = AudioTrack.getMinBufferSize(i7, iIntValue, i4);
            zzgqa.zzi(minBufferSize != -2);
            int i11 = i10 == -1 ? 1 : i10;
            int i12 = i11;
            iMax = (((Math.max(minBufferSize, zzsu.zzb(minBufferSize, i4, i3, i11, i7, i9)) + i12) - 1) / i12) * i12;
        }
        zzqh zzqhVar = new zzqh();
        zzqhVar.zzb(i7);
        zzqhVar.zzc(iIntValue);
        zzqhVar.zza(i4);
        zzqhVar.zze(iMax);
        zzqhVar.zzg(zzqcVar.zzd);
        zzqhVar.zzf(zzqcVar.zzb);
        zzqhVar.zzd(false);
        zzqhVar.zzh(zzqcVar.zze);
        return new zzqi(zzqhVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final zzpz zzc(zzqi zzqiVar) throws zzqf {
        Context context;
        Context context2;
        try {
            int i2 = zzqiVar.zzg;
            int i3 = zzqiVar.zzh;
            if (i3 == -1 || (context2 = this.zza) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.zzh;
                if (context3 == null || context3.getDeviceId() != i3) {
                    this.zzh = context2.createDeviceContext(i3);
                }
                context = this.zzh;
                i2 = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzqiVar.zzf.zza()).setAudioFormat(new AudioFormat.Builder().setSampleRate(zzqiVar.zzb).setChannelMask(zzqiVar.zzc).setEncoding(zzqiVar.zza).build()).setTransferMode(1).setBufferSizeInBytes(zzqiVar.zze).setSessionId(i2);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 29) {
                sessionId.setOffloadedPlayback(false);
            }
            if (i4 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new zzrz(audioTrackBuild, zzqiVar, this.zzb, this.zzd);
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new zzqf(null);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new zzqf(e);
        } catch (UnsupportedOperationException e3) {
            e = e3;
            throw new zzqf(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzd(zzqg zzqgVar) {
        zzk();
        if (this.zzc == null) {
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            zzed zzedVar = new zzed(looperMyLooper, this.zzd);
            this.zzc = zzedVar;
            zzedVar.zzg(false);
        }
        this.zzc.zzb(zzqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zze(zzdn zzdnVar) {
        this.zzd = zzdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzf() {
        zzed zzedVar = this.zzc;
        if (zzedVar != null) {
            zzedVar.zzf();
        }
        zzpu zzpuVar = this.zzf;
        if (zzpuVar != null) {
            zzpuVar.zze();
        }
    }

    public final void zzg(zzpp zzppVar) {
        zzk();
        zzpp zzppVar2 = this.zze;
        if (zzppVar2 == null || zzppVar.equals(zzppVar2)) {
            return;
        }
        this.zze = zzppVar;
        zzed zzedVar = this.zzc;
        if (zzedVar != null) {
            zzedVar.zzd(-1, zzsa.zza);
            zzedVar.zze();
        }
    }

    public final /* synthetic */ void zzh(zzpp zzppVar) {
        this.zze = zzppVar;
    }

    public final /* synthetic */ zzpu zzi() {
        return this.zzf;
    }
}
