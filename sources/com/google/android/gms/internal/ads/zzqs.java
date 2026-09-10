package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.YB;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzqs extends zzsn implements zzkk {
    private final Context zzb;
    private final zzpe zzc;
    private final zzpm zzd;

    @Nullable
    private final zzrz zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;

    @Nullable
    private zzab zzi;

    @Nullable
    private zzab zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzqs(Context context, zzsb zzsbVar, zzsp zzspVar, boolean z, @Nullable Handler handler, @Nullable zzpf zzpfVar, zzpm zzpmVar) {
        super(1, zzsbVar, zzspVar, false, 44100.0f);
        zzqr zzqrVar = null;
        zzrz zzrzVar = zzei.zza >= 35 ? new zzrz(zzry.zza) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzpmVar;
        this.zze = zzrzVar;
        this.zzo = -1000;
        this.zzc = new zzpe(handler, zzpfVar);
        zzpmVar.zzq(new zzqq(this, zzqrVar));
    }

    private final int zzaQ(zzsg zzsgVar, zzab zzabVar) {
        int i;
        if (!"OMX.google.raw.decoder".equals(zzsgVar.zza) || (i = zzei.zza) >= 24 || (i == 23 && zzei.zzM(this.zzb))) {
            return zzabVar.zzp;
        }
        return -1;
    }

    private static List zzaR(zzsp zzspVar, zzab zzabVar, boolean z, zzpm zzpmVar) throws zzsu {
        zzsg zzsgVarZza;
        if (zzabVar.zzo == null) {
            return zzfxn.zzn();
        }
        return (!zzpmVar.zzA(zzabVar) || (zzsgVarZza = zzta.zza()) == null) ? zzta.zze(zzspVar, zzabVar, false, false) : zzfxn.zzo(zzsgVarZza);
    }

    private final void zzaS() {
        long jZzb = this.zzd.zzb(zzW());
        if (jZzb != Long.MIN_VALUE) {
            if (!this.zzl) {
                jZzb = Math.max(this.zzk, jZzb);
            }
            this.zzk = jZzb;
            this.zzl = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzA() {
        zzrz zzrzVar;
        this.zzd.zzk();
        if (zzei.zza < 35 || (zzrzVar = this.zze) == null) {
            return;
        }
        zzrzVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr
    public final void zzC() {
        this.zzn = false;
        try {
            super.zzC();
            if (this.zzm) {
            }
        } finally {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzl();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzD() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzE() {
        zzaS();
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzlj, com.google.android.gms.internal.ads.zzlm
    public final String zzU() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzlj
    public final boolean zzW() {
        return super.zzW() && this.zzd.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzlj
    public final boolean zzX() {
        return this.zzd.zzy() || super.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final float zzZ(float f, zzab zzabVar, zzab[] zzabVarArr) {
        int iMax = -1;
        for (zzab zzabVar2 : zzabVarArr) {
            int i = zzabVar2.zzE;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final long zza() {
        if (zzcT() == 2) {
            zzaS();
        }
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final int zzaa(zzsp zzspVar, zzab zzabVar) throws zzsu {
        int i;
        boolean z;
        if (!zzbb.zzg(zzabVar.zzo)) {
            return 128;
        }
        int i2 = zzabVar.zzK;
        boolean zZzaP = zzsn.zzaP(zzabVar);
        int i3 = 1;
        if (!zZzaP || (i2 != 0 && zzta.zza() == null)) {
            i = 0;
        } else {
            zzor zzorVarZzd = this.zzd.zzd(zzabVar);
            if (zzorVarZzd.zzb) {
                i = true != zzorVarZzd.zzc ? 512 : 1536;
                if (zzorVarZzd.zzd) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (this.zzd.zzA(zzabVar)) {
                return i | 172;
            }
        }
        if ((!MimeTypes.AUDIO_RAW.equals(zzabVar.zzo) || this.zzd.zzA(zzabVar)) && this.zzd.zzA(zzei.zzA(2, zzabVar.zzD, zzabVar.zzE))) {
            List listZzaR = zzaR(zzspVar, zzabVar, false, this.zzd);
            if (!listZzaR.isEmpty()) {
                if (zZzaP) {
                    zzsg zzsgVar = (zzsg) listZzaR.get(0);
                    boolean zZze = zzsgVar.zze(zzabVar);
                    if (!zZze) {
                        int i4 = 1;
                        while (true) {
                            if (i4 >= listZzaR.size()) {
                                z = true;
                                break;
                            }
                            zzsg zzsgVar2 = (zzsg) listZzaR.get(i4);
                            if (zzsgVar2.zze(zzabVar)) {
                                zzsgVar = zzsgVar2;
                                z = false;
                                zZze = true;
                                break;
                            }
                            i4++;
                        }
                    } else {
                        z = true;
                        break;
                    }
                    int i5 = true != zZze ? 3 : 4;
                    int i6 = 8;
                    if (zZze && zzsgVar.zzf(zzabVar)) {
                        i6 = 16;
                    }
                    return i5 | i6 | 32 | (true != zzsgVar.zzg ? 0 : 64) | (true != z ? 0 : 128) | i;
                }
                i3 = 2;
            }
        }
        return i3 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final zzht zzab(zzsg zzsgVar, zzab zzabVar, zzab zzabVar2) {
        int i;
        int i2;
        zzht zzhtVarZzb = zzsgVar.zzb(zzabVar, zzabVar2);
        int i3 = zzhtVarZzb.zze;
        if (zzaM(zzabVar2)) {
            i3 |= 32768;
        }
        if (zzaQ(zzsgVar, zzabVar2) > this.zzf) {
            i3 |= 64;
        }
        String str = zzsgVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzhtVarZzb.zzd;
            i2 = 0;
        }
        return new zzht(str, zzabVar, zzabVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    @Nullable
    public final zzht zzac(zzke zzkeVar) throws zzib {
        zzab zzabVar = zzkeVar.zza;
        zzabVar.getClass();
        this.zzi = zzabVar;
        zzht zzhtVarZzac = super.zzac(zzkeVar);
        this.zzc.zzi(zzabVar, zzhtVarZzac);
        return zzhtVarZzac;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    @Override // com.google.android.gms.internal.ads.zzsn
    public final zzsa zzaf(zzsg zzsgVar, zzab zzabVar, @Nullable MediaCrypto mediaCrypto, float f) {
        boolean z;
        zzab[] zzabVarArrZzT = zzT();
        int length = zzabVarArrZzT.length;
        int iZzaQ = zzaQ(zzsgVar, zzabVar);
        if (length != 1) {
            for (zzab zzabVar2 : zzabVarArrZzT) {
                if (zzsgVar.zzb(zzabVar, zzabVar2).zzd != 0) {
                    iZzaQ = Math.max(iZzaQ, zzaQ(zzsgVar, zzabVar2));
                }
            }
        }
        this.zzf = iZzaQ;
        String str = zzsgVar.zza;
        int i = zzei.zza;
        if (i < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(zzei.zzc)) {
            String str2 = zzei.zzb;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.zzg = z;
        String str3 = zzsgVar.zza;
        this.zzh = str3.equals("OMX.google.opus.decoder") || str3.equals("c2.android.opus.decoder") || str3.equals("OMX.google.vorbis.decoder") || str3.equals("c2.android.vorbis.decoder");
        String str4 = zzsgVar.zzc;
        int i2 = this.zzf;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str4);
        mediaFormat.setInteger("channel-count", zzabVar.zzD);
        mediaFormat.setInteger("sample-rate", zzabVar.zzE);
        zzdr.zzb(mediaFormat, zzabVar.zzr);
        zzdr.zza(mediaFormat, "max-input-size", i2);
        if (i >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f) {
                if (i == 23) {
                    String str5 = zzei.zzd;
                    if (!"ZTE B2017G".equals(str5) && !"AXON 7 mini".equals(str5)) {
                        mediaFormat.setFloat("operating-rate", f);
                    }
                } else {
                    mediaFormat.setFloat("operating-rate", f);
                }
            }
        }
        if (i <= 28 && "audio/ac4".equals(zzabVar.zzo)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i >= 24 && this.zzd.zza(zzei.zzA(4, zzabVar.zzD, zzabVar.zzE)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzo));
        }
        this.zzj = (!MimeTypes.AUDIO_RAW.equals(zzsgVar.zzb) || MimeTypes.AUDIO_RAW.equals(zzabVar.zzo)) ? null : zzabVar;
        return zzsa.zza(zzsgVar, mediaFormat, zzabVar, null, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final List zzag(zzsp zzspVar, zzab zzabVar, boolean z) throws zzsu {
        return zzta.zzf(zzaR(zzspVar, zzabVar, false, this.zzd), zzabVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzaj(zzhh zzhhVar) {
        zzab zzabVar;
        if (zzei.zza < 29 || (zzabVar = zzhhVar.zza) == null || !Objects.equals(zzabVar.zzo, MimeTypes.AUDIO_OPUS) || !zzaL()) {
            return;
        }
        ByteBuffer byteBuffer = zzhhVar.zzf;
        byteBuffer.getClass();
        zzab zzabVar2 = zzhhVar.zza;
        zzabVar2.getClass();
        int i = zzabVar2.zzG;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzr(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / C.NANOS_PER_SECOND));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzak(Exception exc) {
        zzdo.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzal(String str, zzsa zzsaVar, long j, long j2) {
        this.zzc.zze(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzam(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzan(zzab zzabVar, @Nullable MediaFormat mediaFormat) throws zzib {
        int iZzn;
        int i;
        zzab zzabVar2 = this.zzj;
        boolean z = true;
        int[] iArr = null;
        if (zzabVar2 != null) {
            zzabVar = zzabVar2;
        } else if (zzaz() != null) {
            mediaFormat.getClass();
            if (MimeTypes.AUDIO_RAW.equals(zzabVar.zzo)) {
                iZzn = zzabVar.zzF;
            } else if (zzei.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iZzn = mediaFormat.containsKey("v-bits-per-sample") ? zzei.zzn(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iZzn = mediaFormat.getInteger("pcm-encoding");
            }
            zzz zzzVar = new zzz();
            zzzVar.zzaa(MimeTypes.AUDIO_RAW);
            zzzVar.zzU(iZzn);
            zzzVar.zzG(zzabVar.zzG);
            zzzVar.zzH(zzabVar.zzH);
            zzzVar.zzT(zzabVar.zzl);
            zzzVar.zzM(zzabVar.zza);
            zzzVar.zzO(zzabVar.zzb);
            zzzVar.zzP(zzabVar.zzc);
            zzzVar.zzQ(zzabVar.zzd);
            zzzVar.zzac(zzabVar.zze);
            zzzVar.zzY(zzabVar.zzf);
            zzzVar.zzz(mediaFormat.getInteger("channel-count"));
            zzzVar.zzab(mediaFormat.getInteger("sample-rate"));
            zzab zzabVarZzag = zzzVar.zzag();
            if (this.zzg && zzabVarZzag.zzD == 6 && (i = zzabVar.zzD) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < zzabVar.zzD; i2++) {
                    iArr[i2] = i2;
                }
            } else if (this.zzh) {
                int i3 = zzabVarZzag.zzD;
                if (i3 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i3 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i3 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i3 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i3 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            zzabVar = zzabVarZzag;
        }
        try {
            int i4 = zzei.zza;
            if (i4 >= 29) {
                if (zzaL()) {
                    zzn();
                }
                if (i4 < 29) {
                    z = false;
                }
                zzcw.zzf(z);
            }
            this.zzd.zze(zzabVar, 0, iArr);
        } catch (zzph e) {
            throw zzcW(e, e.zza, false, 5001);
        }
    }

    @CallSuper
    public final void zzao() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzap() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzaq() throws zzib {
        try {
            this.zzd.zzj();
        } catch (zzpl e) {
            throw zzcW(e, e.zzc, e.zzb, true != zzaL() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final boolean zzar(long j, long j2, @Nullable zzsd zzsdVar, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzab zzabVar) throws zzib {
        byteBuffer.getClass();
        if (this.zzj != null && (i2 & 2) != 0) {
            zzsdVar.getClass();
            zzsdVar.zzo(i, false);
            return true;
        }
        if (z) {
            if (zzsdVar != null) {
                zzsdVar.zzo(i, false);
            }
            ((zzsn) this).zza.zzf += i3;
            this.zzd.zzg();
            return true;
        }
        try {
            if (!this.zzd.zzx(byteBuffer, j3, i3)) {
                return false;
            }
            if (zzsdVar != null) {
                zzsdVar.zzo(i, false);
            }
            ((zzsn) this).zza.zze += i3;
            return true;
        } catch (zzpi e) {
            zzab zzabVar2 = this.zzi;
            if (zzaL()) {
                zzn();
            }
            throw zzcW(e, zzabVar2, e.zzb, 5001);
        } catch (zzpl e2) {
            if (zzaL()) {
                zzn();
            }
            throw zzcW(e2, zzabVar, e2.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final boolean zzas(zzab zzabVar) {
        zzn();
        return this.zzd.zzA(zzabVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final zzbe zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzg(zzbe zzbeVar) {
        this.zzd.zzs(zzbeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final boolean zzj() {
        boolean z = this.zzn;
        this.zzn = false;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzlj
    @Nullable
    public final zzkk zzl() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzle
    public final void zzu(int i, @Nullable Object obj) throws zzib {
        zzrz zzrzVar;
        if (i == 2) {
            zzpm zzpmVar = this.zzd;
            obj.getClass();
            zzpmVar.zzw(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            zze zzeVar = (zze) obj;
            zzpm zzpmVar2 = this.zzd;
            zzeVar.getClass();
            zzpmVar2.zzm(zzeVar);
            return;
        }
        if (i == 6) {
            zzf zzfVar = (zzf) obj;
            zzpm zzpmVar3 = this.zzd;
            zzfVar.getClass();
            zzpmVar3.zzo(zzfVar);
            return;
        }
        if (i == 12) {
            if (zzei.zza >= 23) {
                this.zzd.zzu(YB.i(obj));
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.zzo = ((Integer) obj).intValue();
            zzsd zzsdVarZzaz = zzaz();
            if (zzsdVarZzaz == null || zzei.zza < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzo));
            zzsdVarZzaz.zzq(bundle);
            return;
        }
        if (i == 9) {
            zzpm zzpmVar4 = this.zzd;
            obj.getClass();
            zzpmVar4.zzv(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                super.zzu(i, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            this.zzd.zzn(iIntValue);
            if (zzei.zza < 35 || (zzrzVar = this.zze) == null) {
                return;
            }
            zzrzVar.zzd(iIntValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr
    public final void zzx() {
        this.zzm = true;
        this.zzi = null;
        try {
            this.zzd.zzf();
            super.zzx();
        } catch (Throwable th) {
            super.zzx();
            throw th;
        } finally {
            this.zzc.zzg(((zzsn) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr
    public final void zzy(boolean z, boolean z2) throws zzib {
        super.zzy(z, z2);
        this.zzc.zzh(((zzsn) this).zza);
        zzn();
        this.zzd.zzt(zzo());
        this.zzd.zzp(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr
    public final void zzz(long j, boolean z) throws zzib {
        super.zzz(j, z);
        this.zzd.zzf();
        this.zzk = j;
        this.zzn = false;
        this.zzl = true;
    }
}
