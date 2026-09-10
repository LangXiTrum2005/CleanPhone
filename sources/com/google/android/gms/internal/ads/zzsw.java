package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.Scopes;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzsw extends zzuq implements zzlj {
    private final Context zzb;
    private final zzqx zzc;
    private final zzrf zzd;
    private final zzuc zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzv zzi;
    private zzv zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzsw(Context context, zzue zzueVar, zzus zzusVar, boolean z2, Handler handler, zzqy zzqyVar, zzrf zzrfVar) {
        super(1, zzueVar, zzusVar, false, 44100.0f);
        zzuc zzucVar = Build.VERSION.SDK_INT >= 35 ? new zzuc(zzub.zzb) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzrfVar;
        this.zze = zzucVar;
        this.zzo = -1000;
        this.zzc = new zzqx(handler, zzqyVar);
        this.zzq = -9223372036854775807L;
        zzrfVar.zza(new zzsv(this, null));
    }

    private static List zzbg(zzus zzusVar, zzv zzvVar, boolean z2, zzrf zzrfVar) throws zzuu {
        zzuj zzujVarZza;
        if (zzvVar.zzo == null) {
            return zzgtd.zzi();
        }
        return (!zzrfVar.zzd(zzvVar) || (zzujVarZza = zzvc.zza()) == null) ? zzvc.zzc(zzusVar, zzvVar, false, false) : zzgtd.zzj(zzujVarZza);
    }

    private final int zzbh(zzuj zzujVar, zzv zzvVar) {
        "OMX.google.raw.decoder".equals(zzujVar.zza);
        return zzvVar.zzp;
    }

    private final void zzbi() {
        long jZzg = this.zzd.zzg(zzZ());
        if (jZzg != Long.MIN_VALUE) {
            if (!this.zzl) {
                jZzg = Math.max(this.zzk, jZzg);
            }
            this.zzk = jZzg;
            this.zzl = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuq, com.google.android.gms.internal.ads.zzij
    public final void zzA(long j, boolean z2, boolean z3) throws zzit {
        super.zzA(j, z2, z3);
        this.zzd.zzA();
        this.zzk = j;
        this.zzq = -9223372036854775807L;
        this.zzn = false;
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public final void zzB() {
        this.zzd.zzi();
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public final void zzC() {
        zzbi();
        this.zzp = false;
        this.zzd.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzuq, com.google.android.gms.internal.ads.zzij
    public final void zzD() {
        this.zzm = true;
        this.zzi = null;
        this.zzq = -9223372036854775807L;
        try {
            this.zzd.zzA();
            super.zzD();
        } catch (Throwable th) {
            super.zzD();
            throw th;
        } finally {
            this.zzc.zzg(((zzuq) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuq, com.google.android.gms.internal.ads.zzij
    public final void zzE() {
        this.zzn = false;
        this.zzq = -9223372036854775807L;
        try {
            super.zzE();
            if (this.zzm) {
            }
        } finally {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzB();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public final void zzF() {
        zzuc zzucVar;
        this.zzd.zzC();
        if (Build.VERSION.SDK_INT < 35 || (zzucVar = this.zze) == null) {
            return;
        }
        zzucVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzmi, com.google.android.gms.internal.ads.zzmk
    public final String zzS() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzuq, com.google.android.gms.internal.ads.zzmi
    public final boolean zzY() {
        return this.zzd.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzuq, com.google.android.gms.internal.ads.zzmi
    public final boolean zzZ() {
        return super.zzZ() && this.zzd.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final int zzac(zzus zzusVar, zzv zzvVar) throws zzuu {
        int i2;
        boolean z2;
        String str = zzvVar.zzo;
        if (!zzas.zza(str)) {
            return 128;
        }
        int i3 = zzvVar.zzN;
        boolean zZzbd = zzuq.zzbd(zzvVar);
        int i4 = 1;
        if (!zZzbd || (i3 != 0 && zzvc.zza() == null)) {
            i2 = 0;
        } else {
            zzrf zzrfVar = this.zzd;
            zzpw zzpwVarZzf = zzrfVar.zzf(zzvVar);
            if (zzpwVarZzf.zzb) {
                i2 = true != zzpwVarZzf.zzc ? 512 : 1536;
                if (zzpwVarZzf.zzd) {
                    i2 |= com.p004ironsource.mediationsdk.metadata.a.f25965n;
                }
            } else {
                i2 = 0;
            }
            if (zzrfVar.zzd(zzvVar)) {
                return i2 | 172;
            }
        }
        if (!"audio/raw".equals(str) || this.zzd.zzd(zzvVar)) {
            zzrf zzrfVar2 = this.zzd;
            if (zzrfVar2.zzd(zzfj.zzy(2, zzvVar.zzG, zzvVar.zzH))) {
                List listZzbg = zzbg(zzusVar, zzvVar, false, zzrfVar2);
                if (!listZzbg.isEmpty()) {
                    if (zZzbd) {
                        zzuj zzujVar = (zzuj) listZzbg.get(0);
                        boolean zZzc = zzujVar.zzc(zzvVar);
                        if (!zZzc) {
                            int i5 = 1;
                            while (true) {
                                if (i5 >= listZzbg.size()) {
                                    z2 = true;
                                    break;
                                }
                                zzuj zzujVar2 = (zzuj) listZzbg.get(i5);
                                if (zzujVar2.zzc(zzvVar)) {
                                    z2 = false;
                                    zZzc = true;
                                    zzujVar = zzujVar2;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            z2 = true;
                            break;
                        }
                        int i6 = true != zZzc ? 3 : 4;
                        int i7 = 8;
                        if (zZzc && zzujVar.zze(zzvVar)) {
                            i7 = 16;
                        }
                        return i6 | i7 | 32 | (true != zzujVar.zzg ? 0 : 64) | (true != z2 ? 0 : 128) | i2;
                    }
                    i4 = 2;
                }
            }
        }
        return i4 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final List zzad(zzus zzusVar, zzv zzvVar, boolean z2) throws zzuu {
        return zzvc.zze(zzbg(zzusVar, zzvVar, false, this.zzd), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final boolean zzae(zzv zzvVar) {
        zzJ();
        return this.zzd.zzd(zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final zzud zzaf(zzuj zzujVar, zzv zzvVar, MediaCrypto mediaCrypto, float f) {
        zzv[] zzvVarArrZzI = zzI();
        int length = zzvVarArrZzI.length;
        int iZzbh = zzbh(zzujVar, zzvVar);
        if (length != 1) {
            for (zzv zzvVar2 : zzvVarArrZzI) {
                if (zzujVar.zzf(zzvVar, zzvVar2).zzd != 0) {
                    iZzbh = Math.max(iZzbh, zzbh(zzujVar, zzvVar2));
                }
            }
        }
        this.zzf = iZzbh;
        String str = zzujVar.zza;
        int i2 = Build.VERSION.SDK_INT;
        this.zzg = false;
        this.zzh = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = zzujVar.zzc;
        int i3 = this.zzf;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i4 = zzvVar.zzG;
        mediaFormat.setInteger("channel-count", i4);
        int i5 = zzvVar.zzH;
        mediaFormat.setInteger("sample-rate", i5);
        zzeh.zza(mediaFormat, zzvVar.zzr);
        zzeh.zzb(mediaFormat, "max-input-size", i3);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        String str3 = zzvVar.zzo;
        if ("audio/ac4".equals(str3)) {
            Pair pairZzd = zzdo.zzd(zzvVar);
            if (pairZzd != null) {
                zzeh.zzb(mediaFormat, Scopes.PROFILE, ((Integer) pairZzd.first).intValue());
                zzeh.zzb(mediaFormat, AppLovinEventTypes.USER_COMPLETED_LEVEL, ((Integer) pairZzd.second).intValue());
            }
            if (i2 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (this.zzd.zze(zzfj.zzy(4, i4, i5)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i2 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i2 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzo));
        }
        this.zzj = (!"audio/raw".equals(zzujVar.zzb) || "audio/raw".equals(str3)) ? null : zzvVar;
        return zzud.zza(zzujVar, mediaFormat, zzvVar, null, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final zzil zzag(zzuj zzujVar, zzv zzvVar, zzv zzvVar2) {
        int i2;
        int i3;
        zzil zzilVarZzf = zzujVar.zzf(zzvVar, zzvVar2);
        int i4 = zzilVarZzf.zze;
        if (zzaB(zzvVar2)) {
            i4 |= 32768;
        }
        if (zzbh(zzujVar, zzvVar2) > this.zzf) {
            i4 |= 64;
        }
        String str = zzujVar.zza;
        if (i4 != 0) {
            i3 = 0;
            i2 = i4;
        } else {
            i2 = 0;
            i3 = zzilVarZzf.zzd;
        }
        return new zzil(str, zzvVar, zzvVar2, i3, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final long zzah(long j, long j2, boolean z2) {
        zzrf zzrfVar = this.zzd;
        boolean z3 = false;
        if (zzrfVar.zzn() && this.zzq != -9223372036854775807L) {
            z3 = true;
        }
        if (!this.zzp) {
            return (z3 || super.zzZ()) ? 1000000L : 10000L;
        }
        long jZzw = zzrfVar.zzw();
        if (!z3 || jZzw == -9223372036854775807L) {
            return 10000L;
        }
        return Math.max(10000L, ((long) ((Math.min(jZzw, this.zzq - j) / (zzj() != null ? zzj().zzb : 1.0f)) / 2.0f)) - (zzfj.zzq(zzL().zzb()) - j2));
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final float zzai(float f, zzv zzvVar, zzv[] zzvVarArr) {
        int iMax = -1;
        for (zzv zzvVar2 : zzvVarArr) {
            int i2 = zzvVar2.zzH;
            if (i2 != -1) {
                iMax = Math.max(iMax, i2);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final void zzaj(String str, zzud zzudVar, long j, long j2) {
        this.zzc.zzb(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final void zzak(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final void zzal(Exception exc) {
        zzee.zzf("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final zzil zzam(zzle zzleVar) throws zzit {
        zzv zzvVar = zzleVar.zzb;
        zzvVar.getClass();
        this.zzi = zzvVar;
        zzil zzilVarZzam = super.zzam(zzleVar);
        this.zzc.zzc(zzvVar, zzilVarZzam);
        return zzilVarZzam;
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final void zzan(zzv zzvVar, MediaFormat mediaFormat) throws zzit {
        int iZzz;
        int i2;
        zzv zzvVar2 = this.zzj;
        int[] iArr = null;
        boolean z2 = true;
        if (zzvVar2 != null) {
            zzvVar = zzvVar2;
        } else if (zzaE() != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(zzvVar.zzo)) {
                iZzz = zzvVar.zzI;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iZzz = mediaFormat.getInteger("pcm-encoding");
            } else {
                iZzz = mediaFormat.containsKey("v-bits-per-sample") ? zzfj.zzz(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            zzt zztVar = new zzt();
            zztVar.zzm("audio/raw");
            zztVar.zzG(iZzz);
            zztVar.zzH(zzvVar.zzJ);
            zztVar.zzI(zzvVar.zzK);
            zztVar.zzk(zzvVar.zzl);
            zztVar.zza(zzvVar.zza);
            zztVar.zzc(zzvVar.zzb);
            zztVar.zzd(zzvVar.zzc);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzf(zzvVar.zze);
            zztVar.zzg(zzvVar.zzf);
            zztVar.zzE(mediaFormat.getInteger("channel-count"));
            zztVar.zzF(mediaFormat.getInteger("sample-rate"));
            zzv zzvVarZzM = zztVar.zzM();
            if (this.zzg && zzvVarZzM.zzG == 6 && (i2 = zzvVar.zzG) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr[i3] = i3;
                }
            } else if (this.zzh) {
                int i4 = zzvVarZzM.zzG;
                if (i4 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i4 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i4 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i4 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i4 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            zzvVar = zzvVarZzM;
        }
        try {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 29) {
                if (zzaD()) {
                    zzJ();
                }
                if (i5 < 29) {
                    z2 = false;
                }
                zzgqa.zzi(z2);
            }
            this.zzd.zzh(zzvVar, 0, iArr);
        } catch (zzra e2) {
            throw zzN(e2, e2.zza, false, IronSourceConstants.errorCode_biddingDataException);
        }
    }

    public final void zzao() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final void zzap() {
        this.zzd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final boolean zzaq(long j, long j2, zzug zzugVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j3, boolean z2, boolean z3, zzv zzvVar) throws zzit {
        byteBuffer.getClass();
        this.zzq = -9223372036854775807L;
        if (this.zzj != null && (i3 & 2) != 0) {
            zzugVar.getClass();
            zzugVar.zzc(i2, false);
            return true;
        }
        if (z2) {
            if (zzugVar != null) {
                zzugVar.zzc(i2, false);
            }
            ((zzuq) this).zza.zzf += i4;
            this.zzd.zzj();
            return true;
        }
        try {
            if (!this.zzd.zzk(byteBuffer, j3, i4)) {
                this.zzq = j3;
                return false;
            }
            if (zzugVar != null) {
                zzugVar.zzc(i2, false);
            }
            ((zzuq) this).zza.zze += i4;
            return true;
        } catch (zzrb e2) {
            zzv zzvVar2 = this.zzi;
            if (zzaD()) {
                zzJ();
            }
            throw zzN(e2, zzvVar2, false, IronSourceConstants.errorCode_biddingDataException);
        } catch (zzre e3) {
            if (zzaD()) {
                zzJ();
            }
            throw zzN(e3, zzvVar, e3.zzb, IronSourceConstants.errorCode_isReadyException);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final void zzar() throws zzit {
        try {
            this.zzd.zzl();
            if (zzba() != -9223372036854775807L) {
                this.zzq = zzba();
            }
        } catch (zzre e2) {
            throw zzN(e2, e2.zzc, e2.zzb, true != zzaD() ? IronSourceConstants.errorCode_isReadyException : IronSourceConstants.errorCode_loadInProgress);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final void zzas(zzih zzihVar) {
        zzv zzvVar;
        if (Build.VERSION.SDK_INT < 29 || (zzvVar = zzihVar.zza) == null || !Objects.equals(zzvVar.zzo, "audio/opus") || !zzaD()) {
            return;
        }
        ByteBuffer byteBuffer = zzihVar.zzf;
        byteBuffer.getClass();
        zzv zzvVar2 = zzihVar.zza;
        zzvVar2.getClass();
        int i2 = zzvVar2.zzJ;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzx(i2, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    public final /* synthetic */ zzqx zzaw() {
        return this.zzc;
    }

    public final /* synthetic */ zzuc zzax() {
        return this.zze;
    }

    public final /* synthetic */ void zzay(boolean z2) {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmi
    public final zzlj zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final long zzg() {
        if (zze() == 2) {
            zzbi();
        }
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzh() {
        boolean z2 = this.zzn;
        this.zzn = false;
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzi(zzav zzavVar) {
        this.zzd.zzo(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final zzav zzj() {
        return this.zzd.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzuq, com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmd
    public final void zzx(int i2, Object obj) throws zzit {
        zzuc zzucVar;
        if (i2 == 2) {
            zzrf zzrfVar = this.zzd;
            obj.getClass();
            zzrfVar.zzy(((Float) obj).floatValue());
            return;
        }
        if (i2 == 3) {
            zzd zzdVar = (zzd) obj;
            zzrf zzrfVar2 = this.zzd;
            zzdVar.getClass();
            zzrfVar2.zzr(zzdVar);
            return;
        }
        if (i2 == 6) {
            zze zzeVar = (zze) obj;
            zzrf zzrfVar3 = this.zzd;
            zzeVar.getClass();
            zzrfVar3.zzt(zzeVar);
            return;
        }
        if (i2 == 12) {
            this.zzd.zzu((AudioDeviceInfo) obj);
            return;
        }
        if (i2 == 16) {
            obj.getClass();
            this.zzo = ((Integer) obj).intValue();
            zzug zzugVarZzaE = zzaE();
            if (zzugVarZzaE == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzo));
            zzugVarZzaE.zzp(bundle);
            return;
        }
        if (i2 == 19) {
            zzrf zzrfVar4 = this.zzd;
            obj.getClass();
            zzrfVar4.zzv(((Integer) obj).intValue());
            return;
        }
        if (i2 == 9) {
            zzrf zzrfVar5 = this.zzd;
            obj.getClass();
            zzrfVar5.zzq(((Boolean) obj).booleanValue());
        } else {
            if (i2 != 10) {
                super.zzx(i2, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            this.zzd.zzs(iIntValue);
            if (Build.VERSION.SDK_INT < 35 || (zzucVar = this.zze) == null) {
                return;
            }
            zzucVar.zza(iIntValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuq, com.google.android.gms.internal.ads.zzij
    public final void zzy(boolean z2, boolean z3) throws zzit {
        super.zzy(z2, z3);
        this.zzc.zza(((zzuq) this).zza);
        zzJ();
        zzrf zzrfVar = this.zzd;
        zzrfVar.zzb(zzK());
        zzrfVar.zzc(zzL());
    }
}
