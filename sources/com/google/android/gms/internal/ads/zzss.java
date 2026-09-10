package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.inmobi.commons.core.configs.AdConfig;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class zzss implements zzrf {
    private static final AtomicInteger zza = new AtomicInteger();
    private long zzA;
    private long zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private long zzF;
    private float zzG;
    private ByteBuffer zzH;
    private int zzI;
    private ByteBuffer zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private zze zzQ;
    private AudioDeviceInfo zzR;
    private int zzS;
    private long zzT;
    private boolean zzU;
    private boolean zzV;
    private long zzW;
    private long zzX;
    private Handler zzY;
    private final zzsn zzZ;
    private final Context zzb;
    private final zzqj zzc;
    private final zzsh zzd;
    private final zzta zze;
    private final zzcv zzf;
    private final zzsz zzg;
    private final zzgtd zzh;
    private final ArrayDeque zzi;
    private zzsj zzj;
    private final zzsr zzk;
    private final zzsr zzl;
    private zzpn zzm;
    private zzrc zzn;
    private zzsm zzo;
    private zzsm zzp;
    private zzck zzq;
    private zzqg zzr;
    private zzpz zzs;
    private zzd zzt;
    private zzsq zzu;
    private zzsq zzv;
    private zzav zzw;
    private boolean zzx;
    private long zzy;
    private long zzz;

    public /* synthetic */ zzss(zzsl zzslVar, byte[] bArr) {
        this.zzb = zzslVar.zzb() == null ? null : zzslVar.zzb().getApplicationContext();
        this.zzt = zzd.zza;
        this.zzZ = zzslVar.zzd();
        this.zzc = zzslVar.zzc();
        zzsh zzshVar = new zzsh();
        this.zzd = zzshVar;
        zzta zztaVar = new zzta();
        this.zze = zztaVar;
        this.zzf = new zzcv();
        this.zzg = new zzsz();
        this.zzh = zzgtd.zzk(zztaVar, zzshVar);
        this.zzG = 1.0f;
        this.zzO = 0;
        this.zzQ = new zze(0, 0.0f);
        zzav zzavVar = zzav.zza;
        this.zzv = new zzsq(zzavVar, 0L, 0L, null);
        this.zzw = zzavVar;
        this.zzx = false;
        this.zzi = new ArrayDeque();
        this.zzk = new zzsr();
        this.zzl = new zzsr();
        int iZzaf = -1;
        if (Build.VERSION.SDK_INT >= 34 && zzslVar.zzb() != null) {
            iZzaf = zzaf(zzslVar.zzb().getDeviceId());
        }
        this.zzS = iZzaf;
    }

    public static int zzD(int i2, ByteBuffer byteBuffer) {
        int i3;
        int i4;
        byte b2;
        int i5;
        int i6;
        if (i2 == 20) {
            return zzafn.zzb(byteBuffer);
        }
        if (i2 != 30) {
            switch (i2) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iZzb = zzafl.zzb(zzfj.zzJ(byteBuffer, byteBuffer.position()));
                    if (iZzb != -1) {
                        return iZzb;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return com.p004ironsource.mediationsdk.metadata.a.f25965n;
                default:
                    switch (i2) {
                        case 14:
                            int iPosition = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i7 = iPosition;
                            while (true) {
                                if (i7 > iLimit) {
                                    i6 = -1;
                                } else if ((zzfj.zzJ(byteBuffer, i7 + 4) & (-2)) == -126718022) {
                                    i6 = i7 - iPosition;
                                } else {
                                    i7++;
                                }
                            }
                            if (i6 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i6) + ((byteBuffer.get((byteBuffer.position() + i6) + 7) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int iPosition2 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition2);
                            return zzads.zzb(new zzeq(bArr, 16)).zzc;
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException(androidx.datastore.preferences.protobuf.a.g(i2, "Unexpected audio encoding: ", new StringBuilder(String.valueOf(i2).length() + 27)));
                    }
                    break;
            }
            return zzadp.zze(byteBuffer);
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition3 = byteBuffer.position();
        byte b3 = byteBuffer.get(iPosition3);
        if (b3 != -2) {
            if (b3 != -1) {
                if (b3 != 31) {
                    i4 = (byteBuffer.get(iPosition3 + 4) & 1) << 6;
                    i5 = byteBuffer.get(iPosition3 + 5) & 252;
                } else {
                    i4 = (byteBuffer.get(iPosition3 + 5) & 7) << 4;
                    b2 = byteBuffer.get(iPosition3 + 6);
                }
                i3 = (i5 >> 2) | i4;
            } else {
                i4 = (byteBuffer.get(iPosition3 + 4) & 7) << 4;
                b2 = byteBuffer.get(iPosition3 + 7);
            }
            i5 = b2 & 60;
            i3 = (i5 >> 2) | i4;
        } else {
            i3 = ((byteBuffer.get(iPosition3 + 5) & 1) << 6) | ((byteBuffer.get(iPosition3 + 4) & 252) >> 2);
        }
        return (i3 + 1) * 32;
    }

    public static /* synthetic */ boolean zzG() {
        return zza.get() > 0;
    }

    private final void zzP() {
        zzck zzckVarZzl = this.zzp.zzl();
        this.zzq = zzckVarZzl;
        zzckVarZzl.zzb(zzcm.zza);
    }

    private final zzpz zzQ(zzqi zzqiVar) throws zzrb {
        try {
            return this.zzc.zzc(zzqiVar);
        } catch (zzqf e2) {
            zzrb zzrbVar = new zzrb(0, zzqiVar.zzb, zzqiVar.zzc, zzqiVar.zza, zzqiVar.zze, this.zzp.zzg(), false, e2);
            zzrc zzrcVar = this.zzn;
            if (zzrcVar == null) {
                throw zzrbVar;
            }
            zzrcVar.zza(zzrbVar);
            throw zzrbVar;
        }
    }

    private final void zzR(long j) throws Exception {
        zzU(j);
        if (this.zzJ != null) {
            return;
        }
        if (!this.zzq.zzc()) {
            ByteBuffer byteBuffer = this.zzH;
            if (byteBuffer != null) {
                zzT(byteBuffer);
                zzU(j);
                return;
            }
            return;
        }
        while (!this.zzq.zzg()) {
            do {
                ByteBuffer byteBufferZze = this.zzq.zze();
                if (byteBufferZze.hasRemaining()) {
                    zzT(byteBufferZze);
                    zzU(j);
                } else {
                    ByteBuffer byteBuffer2 = this.zzH;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzq.zzd(this.zzH);
                    }
                }
            } while (this.zzJ == null);
            return;
        }
    }

    private final boolean zzS() throws Exception {
        if (!this.zzq.zzc()) {
            zzU(Long.MIN_VALUE);
            return this.zzJ == null;
        }
        this.zzq.zzf();
        zzR(Long.MIN_VALUE);
        if (!this.zzq.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer = this.zzJ;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0153  */
    /* JADX WARN: Code duplicated, block: B:49:0x0157  */
    /* JADX WARN: Code duplicated, block: B:51:0x015b  */
    /* JADX WARN: Code duplicated, block: B:53:0x015f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0163  */
    /* JADX WARN: Code duplicated, block: B:57:0x0167  */
    /* JADX WARN: Code duplicated, block: B:60:0x0185  */
    /* JADX WARN: Code duplicated, block: B:61:0x0198  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x01cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:73:0x020d  */
    /* JADX WARN: Code duplicated, block: B:79:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0059 A[SYNTHETIC] */
    private final void zzT(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        zzgqa.zzi(this.zzJ == null);
        if (byteBuffer.hasRemaining()) {
            if (this.zzp.zzf()) {
                int iZzs = (int) zzfj.zzs(zzfj.zzq(20L), this.zzp.zzk().zzb);
                long jZzac = zzac();
                long j = iZzs;
                if (jZzac < j) {
                    int i13 = this.zzp.zzk().zza;
                    int iZzj = this.zzp.zzj();
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    int i14 = (int) jZzac;
                    while (byteBuffer.hasRemaining() && i14 < iZzs) {
                        if (i13 != 2) {
                            if (i13 == 3) {
                                i4 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                            } else if (i13 != 4) {
                                if (i13 != 21) {
                                    if (i13 == 22) {
                                        i9 = byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                        i10 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                        i11 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                                        i12 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                                    } else if (i13 == 268435456) {
                                        i2 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                                        i3 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                                    } else if (i13 == 1342177280) {
                                        i6 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                                        i7 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                                        i8 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                    } else {
                                        if (i13 != 1610612736) {
                                            throw new IllegalStateException();
                                        }
                                        i9 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                                        i10 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                                        i11 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                        i12 = byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    }
                                    i4 = i9 | i10 | i11 | i12;
                                } else {
                                    i6 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                    i7 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                                    i8 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                                }
                                i4 = i6 | i7 | i8;
                            } else {
                                float fMax = Math.max(-1.0f, Math.min(byteBuffer.getFloat(), 1.0f));
                                i4 = (int) (fMax < 0.0f ? (-fMax) * (-2.1474836E9f) : fMax * 2.1474836E9f);
                            }
                            i5 = (int) ((((long) i4) * ((long) i14)) / j);
                            if (i13 != 2) {
                                byteBufferOrder.put((byte) (i5 >> 16));
                                byteBufferOrder.put((byte) (i5 >> 24));
                            } else if (i13 != 3) {
                                byteBufferOrder.put((byte) (i5 >> 24));
                            } else if (i13 != 4) {
                                if (i13 != 21) {
                                    byteBufferOrder.put((byte) (i5 >> 8));
                                    byteBufferOrder.put((byte) (i5 >> 16));
                                    byteBufferOrder.put((byte) (i5 >> 24));
                                } else if (i13 != 22) {
                                    byteBufferOrder.put((byte) i5);
                                    byteBufferOrder.put((byte) (i5 >> 8));
                                    byteBufferOrder.put((byte) (i5 >> 16));
                                    byteBufferOrder.put((byte) (i5 >> 24));
                                } else if (i13 != 268435456) {
                                    byteBufferOrder.put((byte) (i5 >> 24));
                                    byteBufferOrder.put((byte) (i5 >> 16));
                                } else if (i13 != 1342177280) {
                                    byteBufferOrder.put((byte) (i5 >> 24));
                                    byteBufferOrder.put((byte) (i5 >> 16));
                                    byteBufferOrder.put((byte) (i5 >> 8));
                                } else {
                                    if (i13 == 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    byteBufferOrder.put((byte) (i5 >> 24));
                                    byteBufferOrder.put((byte) (i5 >> 16));
                                    byteBufferOrder.put((byte) (i5 >> 8));
                                    byteBufferOrder.put((byte) i5);
                                }
                            } else if (i5 < 0) {
                                byteBufferOrder.putFloat((-i5) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i5 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + iZzj) {
                                i14++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i2 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                            i3 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                        }
                        i4 = i2 | i3;
                        i5 = (int) ((((long) i4) * ((long) i14)) / j);
                        if (i13 != 2) {
                            byteBufferOrder.put((byte) (i5 >> 16));
                            byteBufferOrder.put((byte) (i5 >> 24));
                        } else if (i13 != 3) {
                            byteBufferOrder.put((byte) (i5 >> 24));
                        } else if (i13 != 4) {
                            if (i13 != 21) {
                                byteBufferOrder.put((byte) (i5 >> 8));
                                byteBufferOrder.put((byte) (i5 >> 16));
                                byteBufferOrder.put((byte) (i5 >> 24));
                            } else if (i13 != 22) {
                                byteBufferOrder.put((byte) i5);
                                byteBufferOrder.put((byte) (i5 >> 8));
                                byteBufferOrder.put((byte) (i5 >> 16));
                                byteBufferOrder.put((byte) (i5 >> 24));
                            } else if (i13 != 268435456) {
                                byteBufferOrder.put((byte) (i5 >> 24));
                                byteBufferOrder.put((byte) (i5 >> 16));
                            } else if (i13 != 1342177280) {
                                byteBufferOrder.put((byte) (i5 >> 24));
                                byteBufferOrder.put((byte) (i5 >> 16));
                                byteBufferOrder.put((byte) (i5 >> 8));
                            } else {
                                if (i13 == 1610612736) {
                                    throw new IllegalStateException();
                                }
                                byteBufferOrder.put((byte) (i5 >> 24));
                                byteBufferOrder.put((byte) (i5 >> 16));
                                byteBufferOrder.put((byte) (i5 >> 8));
                                byteBufferOrder.put((byte) i5);
                            }
                        } else if (i5 < 0) {
                            byteBufferOrder.putFloat((-i5) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i5 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + iZzj) {
                            i14++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                    byteBuffer2 = byteBufferOrder;
                } else {
                    byteBuffer2 = byteBuffer;
                }
            } else {
                byteBuffer2 = byteBuffer;
            }
            this.zzJ = byteBuffer2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    private final void zzU(long j) throws Exception {
        zzrc zzrcVar;
        if (this.zzJ == null || this.zzl.zzb()) {
            return;
        }
        int iRemaining = this.zzJ.remaining();
        boolean z2 = true;
        try {
            boolean zZzc = this.zzs.zzc(this.zzJ, this.zzI, j);
            this.zzT = SystemClock.elapsedRealtime();
            this.zzl.zzc();
            if (this.zzs.zzg()) {
                if (this.zzB > 0) {
                    this.zzV = false;
                }
                if (this.zzN && (zzrcVar = this.zzn) != null && !zZzc) {
                }
            }
            if (this.zzp.zzf()) {
                this.zzA += (long) (iRemaining - this.zzJ.remaining());
            }
            if (zZzc) {
                if (!this.zzp.zzf()) {
                    zzgqa.zzi(this.zzJ == this.zzH);
                    this.zzB = (((long) this.zzC) * ((long) this.zzI)) + this.zzB;
                }
                this.zzJ = null;
            }
        } catch (zzpy e2) {
            boolean z3 = e2.zzb;
            if (!z3) {
                z2 = false;
            } else if (zzac() <= 0) {
                if (this.zzs.zzg()) {
                    zzV();
                } else {
                    z2 = false;
                }
            }
            zzre zzreVar = new zzre(e2.zza, this.zzp.zzg(), z2);
            zzrc zzrcVar2 = this.zzn;
            if (zzrcVar2 != null) {
                zzrcVar2.zza(zzreVar);
            }
            if (z3) {
                throw zzreVar;
            }
            this.zzl.zza(zzreVar);
        }
    }

    private final void zzV() {
        this.zzp.zzk();
    }

    private final void zzW() {
        if (zzab()) {
            this.zzs.zzf(this.zzG);
        }
    }

    private final void zzX() {
        if (this.zzp != null) {
            zzsm zzsmVar = this.zzo;
            if (zzsmVar != null) {
                this.zzp = zzsmVar;
                this.zzo = null;
            }
            try {
                this.zzp = new zzsm(this.zzp.zzg(), this.zzp.zzh(), this.zzp.zzi(), this.zzp.zzj(), this.zzc.zzb(zzad(this.zzp.zzh(), -1)), this.zzp.zzl(), null);
            } catch (zzqa e2) {
                throw new IllegalStateException(new zzra(e2, this.zzp.zzg()));
            }
        }
        zzA();
    }

    private final void zzY(zzav zzavVar) {
        zzsq zzsqVar = new zzsq(zzavVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzab()) {
            this.zzu = zzsqVar;
        } else {
            this.zzv = zzsqVar;
        }
    }

    private final void zzZ(long j) {
        zzav zzavVar;
        boolean z2;
        if (zzaa()) {
            zzsn zzsnVar = this.zzZ;
            zzavVar = this.zzw;
            zzsnVar.zzb(zzavVar);
        } else {
            zzavVar = zzav.zza;
        }
        zzav zzavVar2 = zzavVar;
        this.zzw = zzavVar2;
        if (zzaa()) {
            zzsn zzsnVar2 = this.zzZ;
            z2 = this.zzx;
            zzsnVar2.zzc(z2);
        } else {
            z2 = false;
        }
        this.zzx = z2;
        this.zzi.add(new zzsq(zzavVar2, Math.max(0L, j), this.zzp.zzd(zzac()), null));
        zzP();
        zzrc zzrcVar = this.zzn;
        if (zzrcVar != null) {
            ((zzsv) zzrcVar).zza.zzaw().zzh(this.zzx);
        }
    }

    private final boolean zzaa() {
        if (!this.zzp.zzf()) {
            return false;
        }
        int i2 = this.zzp.zzg().zzI;
        return true;
    }

    private final boolean zzab() {
        return this.zzs != null;
    }

    private final long zzac() {
        if (!this.zzp.zzf()) {
            return this.zzB;
        }
        long j = this.zzA;
        long jZzj = this.zzp.zzj();
        String str = zzfj.zza;
        return ((j + jZzj) - 1) / jZzj;
    }

    private final zzqc zzad(zzv zzvVar, int i2) {
        zzqb zzqbVar = new zzqb(zzvVar);
        zzqbVar.zza(this.zzt);
        zzqbVar.zzb(this.zzR);
        zzqbVar.zzc(this.zzO);
        zzqbVar.zze(-1);
        zzqbVar.zzd(this.zzS);
        return new zzqc(zzqbVar, null);
    }

    private final void zzae() {
        if (this.zzL) {
            return;
        }
        this.zzL = true;
        if (this.zzs.zzg()) {
            this.zzM = false;
        }
        this.zzs.zzd();
    }

    private static int zzaf(int i2) {
        if (i2 == 0 || i2 == -1) {
            return -1;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzA() {
        if (zzab()) {
            this.zzy = 0L;
            this.zzz = 0L;
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzV = false;
            this.zzC = 0;
            this.zzv = new zzsq(this.zzw, 0L, 0L, null);
            this.zzF = 0L;
            this.zzu = null;
            this.zzi.clear();
            this.zzH = null;
            this.zzI = 0;
            this.zzJ = null;
            this.zzL = false;
            this.zzK = false;
            this.zzM = false;
            this.zze.zzr();
            zzP();
            this.zzj = null;
            zzsm zzsmVar = this.zzo;
            if (zzsmVar != null) {
                this.zzp = zzsmVar;
                this.zzo = null;
            }
            zza.incrementAndGet();
            this.zzs.zze();
            this.zzs = null;
        }
        this.zzl.zzc();
        this.zzk.zzc();
        this.zzW = 0L;
        this.zzX = 0L;
        Handler handler = this.zzY;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzB() {
        zzA();
        zzgtd zzgtdVar = this.zzh;
        int size = zzgtdVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzco) zzgtdVar.get(i2)).zzj();
        }
        this.zzf.zzj();
        this.zzg.zzj();
        zzck zzckVar = this.zzq;
        if (zzckVar != null) {
            zzckVar.zzh();
        }
        this.zzN = false;
        this.zzU = false;
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzC() {
        this.zzc.zzf();
    }

    public final /* synthetic */ void zzE() {
        if (this.zzX >= 300000) {
            ((zzsv) this.zzn).zza.zzay(true);
            this.zzX = 0L;
        }
    }

    public final /* synthetic */ void zzF() {
        zzrc zzrcVar = this.zzn;
        if (zzrcVar != null) {
            ((zzsv) zzrcVar).zza.zzR();
        }
    }

    public final /* synthetic */ zzsj zzI() {
        return this.zzj;
    }

    public final /* synthetic */ zzrc zzJ() {
        return this.zzn;
    }

    public final /* synthetic */ zzsm zzK() {
        return this.zzp;
    }

    public final /* synthetic */ zzpz zzL() {
        return this.zzs;
    }

    public final /* synthetic */ void zzM(boolean z2) {
        this.zzM = true;
    }

    public final /* synthetic */ boolean zzN() {
        return this.zzN;
    }

    public final /* synthetic */ long zzO() {
        return this.zzT;
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zza(zzrc zzrcVar) {
        this.zzn = zzrcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzb(zzpn zzpnVar) {
        this.zzm = zzpnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzc(zzdn zzdnVar) {
        this.zzc.zze(zzdnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final boolean zzd(zzv zzvVar) {
        return zze(zzvVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final int zze(zzv zzvVar) {
        int i2 = this.zzc.zza(zzad(zzvVar, -1)).zzd;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                return 0;
            }
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final zzpw zzf(zzv zzvVar) {
        if (this.zzU) {
            return zzpw.zza;
        }
        zzqe zzqeVarZza = this.zzc.zza(zzad(zzvVar, -1));
        zzpv zzpvVar = new zzpv();
        zzpvVar.zza(zzqeVarZza.zza);
        zzpvVar.zzb(zzqeVarZza.zzb);
        zzpvVar.zzc(zzqeVarZza.zzc);
        return zzpvVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final long zzg(boolean z2) {
        ArrayDeque arrayDeque;
        long j;
        if (!zzab() || this.zzE) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.zzs.zzk(), this.zzp.zzd(zzac()));
        while (true) {
            arrayDeque = this.zzi;
            if (arrayDeque.isEmpty() || jMin < ((zzsq) arrayDeque.getFirst()).zzc) {
                break;
            }
            this.zzv = (zzsq) arrayDeque.remove();
        }
        zzsq zzsqVar = this.zzv;
        long j2 = jMin - zzsqVar.zzc;
        long jZzv = zzfj.zzv(j2, zzsqVar.zza.zzb);
        if (arrayDeque.isEmpty()) {
            long jZzd = this.zzZ.zzd(j2);
            zzsq zzsqVar2 = this.zzv;
            j = zzsqVar2.zzb + jZzd;
            zzsqVar2.zzd = jZzd - jZzv;
        } else {
            zzsq zzsqVar3 = this.zzv;
            j = zzsqVar3.zzb + jZzv + zzsqVar3.zzd;
        }
        long jZze = this.zzZ.zze();
        long jZzd2 = j + this.zzp.zzd(jZze);
        long j3 = this.zzW;
        if (jZze > j3) {
            long jZzd3 = this.zzp.zzd(jZze - j3);
            this.zzW = jZze;
            this.zzX += jZzd3;
            if (this.zzY == null) {
                this.zzY = new Handler(Looper.myLooper());
            }
            this.zzY.removeCallbacksAndMessages(null);
            this.zzY.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzE();
                }
            }, 100L);
        }
        return jZzd2;
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzh(zzv zzvVar, int i2, int[] iArr) throws zzra {
        zzck zzckVar;
        zzv zzvVarZzM;
        int iZzD;
        int iZzD2;
        if (this.zzr == null && this.zzb != null) {
            zzqg zzqgVar = new zzqg() { // from class: com.google.android.gms.internal.ads.zzso
                @Override // com.google.android.gms.internal.ads.zzqg
                public final /* synthetic */ void zza() {
                    this.zza.zzF();
                }
            };
            this.zzr = zzqgVar;
            this.zzc.zzd(zzqgVar);
        }
        if ("audio/raw".equals(zzvVar.zzo)) {
            int i3 = zzvVar.zzI;
            zzgqa.zza(zzfj.zzA(i3));
            int i4 = zzvVar.zzG;
            iZzD = zzfj.zzD(i3) * i4;
            zzgta zzgtaVar = new zzgta();
            zzgtaVar.zzh(this.zzh);
            zzgtaVar.zzf(this.zzf);
            zzgtaVar.zzg(this.zzZ.zza());
            zzckVar = new zzck(zzgtaVar.zzi());
            if (zzckVar.equals(this.zzq)) {
                zzckVar = this.zzq;
            }
            this.zze.zzq(zzvVar.zzJ, zzvVar.zzK);
            this.zzd.zzq(iArr);
            try {
                zzcl zzclVarZza = zzckVar.zza(new zzcl(zzvVar.zzH, i4, i3));
                zzt zztVarZza = zzvVar.zza();
                int i5 = zzclVarZza.zzd;
                zztVarZza.zzG(i5);
                zztVarZza.zzF(zzclVarZza.zzb);
                int i6 = zzclVarZza.zzc;
                zztVarZza.zzE(i6);
                zzvVarZzM = zztVarZza.zzM();
                iZzD2 = zzfj.zzD(i5) * i6;
            } catch (zzcn e2) {
                throw new zzra(e2, zzvVar);
            }
        } else {
            zzckVar = new zzck(zzgtd.zzi());
            zzvVarZzM = zzvVar;
            iZzD = -1;
            iZzD2 = -1;
        }
        zzck zzckVar2 = zzckVar;
        try {
            zzqi zzqiVarZzb = this.zzc.zzb(zzad(zzvVarZzM, -1));
            this.zzU = false;
            zzsm zzsmVar = new zzsm(zzvVar, zzvVarZzM, iZzD, iZzD2, zzqiVarZzb, zzckVar2, null);
            if (zzab()) {
                this.zzo = zzsmVar;
            } else {
                this.zzp = zzsmVar;
            }
        } catch (zzqa e3) {
            throw new zzra(e3, zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzi() {
        this.zzN = true;
        if (zzab()) {
            this.zzs.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzj() {
        this.zzD = true;
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final boolean zzk(ByteBuffer byteBuffer, long j, int i2) throws Exception {
        zzpz zzpzVarZzQ;
        ByteBuffer byteBuffer2 = this.zzH;
        zzgqa.zza(byteBuffer2 == null || byteBuffer == byteBuffer2);
        byte[] bArr = null;
        if (this.zzo != null) {
            if (!zzS()) {
                return false;
            }
            if (this.zzo.zzb(this.zzp)) {
                this.zzp = this.zzo;
                this.zzo = null;
                zzpz zzpzVar = this.zzs;
                if (zzpzVar != null && zzpzVar.zzg()) {
                    this.zzp.zzk();
                }
            } else {
                zzae();
                if (zzn()) {
                    return false;
                }
                zzA();
            }
            zzZ(j);
        }
        if (!zzab()) {
            try {
                if (this.zzk.zzb()) {
                    return false;
                }
                try {
                    zzpzVarZzQ = zzQ(this.zzp.zzk());
                } catch (zzrb e2) {
                    if (this.zzp.zzk().zze > 1000000) {
                        zzqh zzqhVar = new zzqh(this.zzp.zzk(), null);
                        zzqhVar.zze(1000000);
                        zzqi zzqiVar = new zzqi(zzqhVar, null);
                        try {
                            zzpz zzpzVarZzQ2 = zzQ(zzqiVar);
                            this.zzp = this.zzp.zza(zzqiVar);
                            zzpzVarZzQ = zzpzVarZzQ2;
                        } catch (zzrb e3) {
                            e2.addSuppressed(e3);
                            zzV();
                            throw e2;
                        }
                    }
                    zzV();
                    throw e2;
                }
                this.zzs = zzpzVarZzQ;
                zzsj zzsjVar = new zzsj(this, this.zzp.zzk(), bArr);
                this.zzj = zzsjVar;
                this.zzs.zzm(zzsjVar);
                if (this.zzs.zzg()) {
                    this.zzp.zzk();
                }
                zzpn zzpnVar = this.zzm;
                if (zzpnVar != null) {
                    this.zzs.zzn(zzpnVar);
                }
                zzW();
                int i3 = this.zzQ.zza;
                AudioDeviceInfo audioDeviceInfo = this.zzR;
                if (audioDeviceInfo != null) {
                    this.zzs.zzo(audioDeviceInfo);
                }
                this.zzE = true;
                int iZzh = this.zzs.zzh();
                int i4 = this.zzO;
                this.zzO = iZzh;
                zzrc zzrcVar = this.zzn;
                if (zzrcVar != null) {
                    ((zzsv) zzrcVar).zza.zzaw().zzk(this.zzp.zze());
                    if (iZzh != i4) {
                        this.zzP = true;
                        zzsm zzsmVar = this.zzp;
                        zzqh zzqhVar2 = new zzqh(zzsmVar.zzk(), null);
                        zzqhVar2.zzg(this.zzO);
                        this.zzp = zzsmVar.zza(new zzqi(zzqhVar2, null));
                        zzsm zzsmVar2 = this.zzo;
                        if (zzsmVar2 != null) {
                            zzqh zzqhVar3 = new zzqh(zzsmVar2.zzk(), null);
                            zzqhVar3.zzg(this.zzO);
                            this.zzo = zzsmVar2.zza(new zzqi(zzqhVar3, null));
                        }
                        zzrc zzrcVar2 = this.zzn;
                        int i5 = this.zzO;
                        if (Build.VERSION.SDK_INT >= 35) {
                            zzsw zzswVar = ((zzsv) zzrcVar2).zza;
                            if (zzswVar.zzax() != null) {
                                zzswVar.zzax().zza(i5);
                            }
                        }
                        ((zzsv) zzrcVar2).zza.zzaw().zzm(i5);
                    }
                }
            } catch (zzrb e4) {
                this.zzk.zza(e4);
                return false;
            }
        }
        this.zzk.zzc();
        if (this.zzE) {
            this.zzF = Math.max(0L, j);
            this.zzD = false;
            this.zzE = false;
            zzZ(j);
            if (this.zzN) {
                zzi();
            }
        }
        if (this.zzH == null) {
            zzgqa.zza(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.zzp.zzf() && this.zzC == 0) {
                int iZzD = zzD(this.zzp.zzk().zza, byteBuffer);
                this.zzC = iZzD;
                if (iZzD == 0) {
                    return true;
                }
            }
            if (this.zzu != null) {
                if (!zzS()) {
                    return false;
                }
                zzZ(j);
                this.zzu = null;
            }
            long j2 = this.zzF;
            zzsm zzsmVar3 = this.zzp;
            long jZzc = j2 + zzsmVar3.zzc((zzsmVar3.zzf() ? this.zzy / ((long) this.zzp.zzi()) : this.zzz) - this.zze.zzs());
            if (!this.zzD && Math.abs(jZzc - j) > 200000) {
                zzrc zzrcVar3 = this.zzn;
                if (zzrcVar3 != null) {
                    zzrcVar3.zza(new zzrd(j, jZzc));
                }
                this.zzD = true;
            }
            if (this.zzD) {
                if (!zzS()) {
                    return false;
                }
                long j3 = j - jZzc;
                this.zzF += j3;
                this.zzD = false;
                zzZ(j);
                zzrc zzrcVar4 = this.zzn;
                if (zzrcVar4 != null && j3 != 0) {
                    ((zzsv) zzrcVar4).zza.zzao();
                }
            }
            if (this.zzp.zzf()) {
                this.zzy += (long) byteBuffer.remaining();
            } else {
                this.zzz = (((long) this.zzC) * ((long) i2)) + this.zzz;
            }
            this.zzH = byteBuffer;
            this.zzI = i2;
        }
        zzR(j);
        if (!this.zzH.hasRemaining()) {
            this.zzH = null;
            this.zzI = 0;
            return true;
        }
        if (!this.zzs.zzl()) {
            return false;
        }
        zzee.zzc("DefaultAudioSink", "Resetting stalled audio output");
        zzA();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzl() throws zzre {
        if (!this.zzK && zzab() && zzS()) {
            zzae();
            this.zzK = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final boolean zzm() {
        if (zzab()) {
            return this.zzK && !zzn();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final boolean zzn() {
        if (!zzab()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.zzs.zzg() && this.zzM) {
            return false;
        }
        long jZzac = zzac();
        long jZzk = this.zzs.zzk();
        zzpz zzpzVar = this.zzs;
        zzpzVar.getClass();
        return jZzac > zzfj.zzs(jZzk, zzpzVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzo(zzav zzavVar) {
        float f = zzavVar.zzb;
        String str = zzfj.zza;
        this.zzw = new zzav(Math.max(0.1f, Math.min(f, 8.0f)), Math.max(0.1f, Math.min(zzavVar.zzc, 8.0f)));
        zzY(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final zzav zzp() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzq(boolean z2) {
        this.zzx = z2;
        zzY(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzr(zzd zzdVar) {
        if (this.zzt.equals(zzdVar)) {
            return;
        }
        this.zzt = zzdVar;
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzs(int i2) {
        if (this.zzP) {
            if (this.zzO != i2) {
                return;
            } else {
                this.zzP = false;
            }
        }
        if (this.zzO != i2) {
            this.zzO = i2;
            zzX();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzt(zze zzeVar) {
        if (this.zzQ.equals(zzeVar)) {
            return;
        }
        if (this.zzs != null) {
            int i2 = this.zzQ.zza;
        }
        this.zzQ = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzu(AudioDeviceInfo audioDeviceInfo) {
        this.zzR = audioDeviceInfo;
        zzpz zzpzVar = this.zzs;
        if (zzpzVar != null) {
            zzpzVar.zzo(audioDeviceInfo);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzv(int i2) {
        int i3 = this.zzS;
        int iZzaf = zzaf(i2);
        if (i3 == iZzaf) {
            return;
        }
        this.zzS = iZzaf;
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final long zzw() {
        if (!zzab()) {
            return -9223372036854775807L;
        }
        if (this.zzp.zzf()) {
            return this.zzp.zzd(this.zzs.zzj());
        }
        long jZzj = this.zzs.zzj();
        int iZzf = zzaes.zzf(this.zzp.zzk().zza);
        zzgqa.zzi(iZzf != -2147483647);
        return zzfj.zzt(jZzj, 1000000L, iZzf, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzx(int i2, int i3) {
        zzpz zzpzVar = this.zzs;
        if (zzpzVar != null) {
            zzpzVar.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzy(float f) {
        if (this.zzG != f) {
            this.zzG = f;
            zzW();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzz() {
        this.zzN = false;
        if (zzab()) {
            this.zzs.zzb();
        }
    }
}
