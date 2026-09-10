package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.work.PeriodicWorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4255om;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.np0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzqm implements zzpm {
    private static final Object zza = new Object();

    @Nullable
    @GuardedBy("releaseExecutorLock")
    private static ScheduledExecutorService zzb;

    @GuardedBy("releaseExecutorLock")
    private static int zzc;
    private zzbe zzA;
    private boolean zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private long zzF;
    private int zzG;
    private boolean zzH;
    private boolean zzI;
    private long zzJ;
    private float zzK;

    @Nullable
    private ByteBuffer zzL;
    private int zzM;

    @Nullable
    private ByteBuffer zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private zzf zzT;

    @Nullable
    private zzoo zzU;
    private long zzV;
    private boolean zzW;
    private boolean zzX;

    @Nullable
    private Looper zzY;
    private long zzZ;
    private long zzaa;
    private Handler zzab;
    private final zzqc zzac;
    private final zzps zzad;

    @Nullable
    private final Context zzd;
    private final zzpr zze;
    private final zzqw zzf;
    private final zzfxn zzg;
    private final zzfxn zzh;
    private final zzpq zzi;
    private final ArrayDeque zzj;
    private zzqk zzk;
    private final zzqg zzl;
    private final zzqg zzm;
    private final zzpz zzn;

    @Nullable
    private zzog zzo;

    @Nullable
    private zzpj zzp;

    @Nullable
    private zzqb zzq;
    private zzqb zzr;
    private zzce zzs;

    @Nullable
    private AudioTrack zzt;
    private zzoi zzu;
    private zzon zzv;

    @Nullable
    private zzqf zzw;
    private zze zzx;

    @Nullable
    private zzqd zzy;
    private zzqd zzz;

    public /* synthetic */ zzqm(zzqa zzqaVar, zzql zzqlVar) {
        zzoi zzoiVarZzc;
        Context context = zzqaVar.zza;
        this.zzd = context;
        zze zzeVar = zze.zza;
        this.zzx = zzeVar;
        zzql zzqlVar2 = null;
        if (context != null) {
            zzoi zzoiVar = zzoi.zza;
            int i = zzei.zza;
            zzoiVarZzc = zzoi.zzc(context, zzeVar, null);
        } else {
            zzoiVarZzc = zzqaVar.zzb;
        }
        this.zzu = zzoiVarZzc;
        this.zzac = zzqaVar.zzf;
        int i2 = zzei.zza;
        zzps zzpsVar = zzqaVar.zzg;
        zzpsVar.getClass();
        this.zzad = zzpsVar;
        this.zzi = new zzpq(new zzqh(this, zzqlVar2));
        zzpr zzprVar = new zzpr();
        this.zze = zzprVar;
        zzqw zzqwVar = new zzqw();
        this.zzf = zzqwVar;
        this.zzg = zzfxn.zzq(new zzcl(), zzprVar, zzqwVar);
        this.zzh = zzfxn.zzo(new zzqv());
        this.zzK = 1.0f;
        this.zzS = 0;
        this.zzT = new zzf(0, 0.0f);
        zzbe zzbeVar = zzbe.zza;
        this.zzz = new zzqd(zzbeVar, 0L, 0L, null);
        this.zzA = zzbeVar;
        this.zzB = false;
        this.zzj = new ArrayDeque();
        this.zzl = new zzqg();
        this.zzm = new zzqg();
        this.zzn = zzqaVar.zze;
    }

    public static /* synthetic */ void zzG(zzqm zzqmVar) {
        if (zzqmVar.zzaa >= PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            ((zzqq) zzqmVar.zzp).zza.zzn = true;
            zzqmVar.zzaa = 0L;
        }
    }

    public static /* synthetic */ void zzI(AudioTrack audioTrack, final zzpj zzpjVar, Handler handler, final zzpg zzpgVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzpjVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpv
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((zzqq) zzpjVar).zza.zzc.zzd(zzpgVar);
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i = zzc - 1;
                    zzc = i;
                    if (i == 0) {
                        zzb.shutdown();
                        zzb = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            if (zzpjVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpv
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((zzqq) zzpjVar).zza.zzc.zzd(zzpgVar);
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i2 = zzc - 1;
                    zzc = i2;
                    if (i2 == 0) {
                        zzb.shutdown();
                        zzb = null;
                    }
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzK() {
        boolean z;
        synchronized (zza) {
            z = zzc > 0;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzL() {
        zzqb zzqbVar = this.zzr;
        return zzqbVar.zzc == 0 ? this.zzC / ((long) zzqbVar.zzb) : this.zzD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzM() {
        zzqb zzqbVar = this.zzr;
        if (zzqbVar.zzc != 0) {
            return this.zzF;
        }
        long j = this.zzE;
        long j2 = zzqbVar.zzd;
        int i = zzei.zza;
        return ((j + j2) - 1) / j2;
    }

    private final AudioTrack zzN(zzqb zzqbVar) throws zzpi {
        try {
            return zzac(zzqbVar.zza(), this.zzx, this.zzS, zzqbVar.zza);
        } catch (zzpi e) {
            zzpj zzpjVar = this.zzp;
            if (zzpjVar != null) {
                zzpjVar.zza(e);
            }
            throw e;
        }
    }

    private final void zzO(long j) {
        zzbe zzbeVar;
        boolean z;
        if (zzab()) {
            zzqc zzqcVar = this.zzac;
            zzbeVar = this.zzA;
            zzqcVar.zzc(zzbeVar);
        } else {
            zzbeVar = zzbe.zza;
        }
        zzbe zzbeVar2 = zzbeVar;
        this.zzA = zzbeVar2;
        if (zzab()) {
            zzqc zzqcVar2 = this.zzac;
            z = this.zzB;
            zzqcVar2.zzd(z);
        } else {
            z = false;
        }
        this.zzB = z;
        this.zzj.add(new zzqd(zzbeVar2, Math.max(0L, j), zzei.zzt(zzM(), this.zzr.zze), null));
        zzX();
        zzpj zzpjVar = this.zzp;
        if (zzpjVar != null) {
            ((zzqq) zzpjVar).zza.zzc.zzw(this.zzB);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    private final void zzP(long j) throws Exception {
        zzpj zzpjVar;
        if (this.zzN == null || this.zzm.zzc()) {
            return;
        }
        int iRemaining = this.zzN.remaining();
        boolean z = true;
        int iWrite = this.zzt.write(this.zzN, iRemaining, 1);
        this.zzV = SystemClock.elapsedRealtime();
        if (iWrite < 0) {
            if ((zzei.zza < 24 || iWrite != -6) && iWrite != -32) {
                z = false;
            } else if (zzM() <= 0) {
                if (zzaa(this.zzt)) {
                    zzQ();
                } else {
                    z = false;
                }
            }
            zzpl zzplVar = new zzpl(iWrite, this.zzr.zza, z);
            zzpj zzpjVar2 = this.zzp;
            if (zzpjVar2 != null) {
                zzpjVar2.zza(zzplVar);
            }
            if (zzplVar.zzb) {
                this.zzu = zzoi.zza;
                throw zzplVar;
            }
            this.zzm.zzb(zzplVar);
            return;
        }
        this.zzm.zza();
        if (zzaa(this.zzt)) {
            if (this.zzF > 0) {
                this.zzX = false;
            }
            if (this.zzR && (zzpjVar = this.zzp) != null && iWrite < iRemaining) {
            }
        }
        int i = this.zzr.zzc;
        if (i == 0) {
            this.zzE += (long) iWrite;
        }
        if (iWrite == iRemaining) {
            if (i != 0) {
                zzcw.zzf(this.zzN == this.zzL);
                this.zzF = (((long) this.zzG) * ((long) this.zzM)) + this.zzF;
            }
            this.zzN = null;
        }
    }

    private final void zzQ() {
        if (this.zzr.zzc == 1) {
            this.zzW = true;
        }
    }

    private final void zzR() {
        if (this.zzv != null || this.zzd == null) {
            return;
        }
        this.zzY = Looper.myLooper();
        zzon zzonVar = new zzon(this.zzd, new zzpw(this), this.zzx, this.zzU);
        this.zzv = zzonVar;
        this.zzu = zzonVar.zzc();
    }

    private final void zzS() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        this.zzi.zzb(zzM());
        if (zzaa(this.zzt)) {
            this.zzQ = false;
        }
        this.zzt.stop();
    }

    private final void zzT(long j) throws Exception {
        zzP(j);
        if (this.zzN != null) {
            return;
        }
        if (!this.zzs.zzh()) {
            ByteBuffer byteBuffer = this.zzL;
            if (byteBuffer != null) {
                zzV(byteBuffer);
                zzP(j);
                return;
            }
            return;
        }
        while (!this.zzs.zzg()) {
            do {
                ByteBuffer byteBufferZzb = this.zzs.zzb();
                if (byteBufferZzb.hasRemaining()) {
                    zzV(byteBufferZzb);
                    zzP(j);
                } else {
                    ByteBuffer byteBuffer2 = this.zzL;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzs.zze(this.zzL);
                    }
                }
            } while (this.zzN == null);
            return;
        }
    }

    private final void zzU(zzbe zzbeVar) {
        long j = C.TIME_UNSET;
        zzqd zzqdVar = new zzqd(zzbeVar, j, j, null);
        if (zzZ()) {
            this.zzy = zzqdVar;
        } else {
            this.zzz = zzqdVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0141 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0145  */
    /* JADX WARN: Code duplicated, block: B:49:0x0149  */
    /* JADX WARN: Code duplicated, block: B:51:0x014d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0151  */
    /* JADX WARN: Code duplicated, block: B:55:0x0155  */
    /* JADX WARN: Code duplicated, block: B:57:0x0159  */
    /* JADX WARN: Code duplicated, block: B:60:0x0177  */
    /* JADX WARN: Code duplicated, block: B:61:0x018a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0197  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01db  */
    /* JADX WARN: Code duplicated, block: B:73:0x0201  */
    /* JADX WARN: Code duplicated, block: B:79:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x004b A[SYNTHETIC] */
    private final void zzV(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        zzcw.zzf(this.zzN == null);
        if (byteBuffer.hasRemaining()) {
            if (this.zzr.zzc == 0) {
                int iZzp = (int) zzei.zzp(zzei.zzs(20L), this.zzr.zze);
                long jZzM = zzM();
                long j = iZzp;
                if (jZzM < j) {
                    zzqb zzqbVar = this.zzr;
                    int i12 = zzqbVar.zzg;
                    int i13 = zzqbVar.zzd;
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    int i14 = (int) jZzM;
                    while (byteBuffer.hasRemaining() && i14 < iZzp) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i12 != 4) {
                                if (i12 != 21) {
                                    if (i12 == 22) {
                                        i8 = byteBuffer.get() & 255;
                                        i9 = (byteBuffer.get() & 255) << 8;
                                        i10 = (byteBuffer.get() & 255) << 16;
                                        i11 = (byteBuffer.get() & 255) << 24;
                                    } else if (i12 == 268435456) {
                                        i = (byteBuffer.get() & 255) << 24;
                                        i2 = (byteBuffer.get() & 255) << 16;
                                    } else if (i12 == 1342177280) {
                                        i5 = (byteBuffer.get() & 255) << 24;
                                        i6 = (byteBuffer.get() & 255) << 16;
                                        i7 = (byteBuffer.get() & 255) << 8;
                                    } else {
                                        if (i12 != 1610612736) {
                                            throw new IllegalStateException();
                                        }
                                        i8 = (byteBuffer.get() & 255) << 24;
                                        i9 = (byteBuffer.get() & 255) << 16;
                                        i10 = (byteBuffer.get() & 255) << 8;
                                        i11 = byteBuffer.get() & 255;
                                    }
                                    i3 = i8 | i9 | i10 | i11;
                                } else {
                                    i5 = (byteBuffer.get() & 255) << 8;
                                    i6 = (byteBuffer.get() & 255) << 16;
                                    i7 = (byteBuffer.get() & 255) << 24;
                                }
                                i3 = i5 | i6 | i7;
                            } else {
                                float fMax = Math.max(-1.0f, Math.min(byteBuffer.getFloat(), 1.0f));
                                if (fMax < 0.0f) {
                                    fMax = -fMax;
                                    f = -2.1474836E9f;
                                } else {
                                    f = 2.1474836E9f;
                                }
                                i3 = (int) (fMax * f);
                            }
                            i4 = (int) ((((long) i3) * ((long) i14)) / j);
                            if (i12 != 2) {
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 3) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 4) {
                                if (i12 != 21) {
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i12 != 22) {
                                    byteBufferOrder.put((byte) i4);
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i12 != 268435456) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                } else if (i12 != 1342177280) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                } else {
                                    if (i12 == 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) i4);
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + i13) {
                                i14++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            i2 = (byteBuffer.get() & 255) << 24;
                        }
                        i3 = i | i2;
                        i4 = (int) ((((long) i3) * ((long) i14)) / j);
                        if (i12 != 2) {
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i12 != 3) {
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i12 != 4) {
                            if (i12 != 21) {
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 22) {
                                byteBufferOrder.put((byte) i4);
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 268435456) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                            } else if (i12 != 1342177280) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                            } else {
                                if (i12 == 1610612736) {
                                    throw new IllegalStateException();
                                }
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) i4);
                            }
                        } else if (i4 < 0) {
                            byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + i13) {
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
            this.zzN = byteBuffer2;
        }
    }

    private final void zzW() {
        if (zzZ()) {
            this.zzt.setVolume(this.zzK);
        }
    }

    private final void zzX() {
        zzce zzceVar = this.zzr.zzi;
        this.zzs = zzceVar;
        zzceVar.zzc();
    }

    private final boolean zzY() throws Exception {
        if (!this.zzs.zzh()) {
            zzP(Long.MIN_VALUE);
            return this.zzN == null;
        }
        this.zzs.zzd();
        zzT(Long.MIN_VALUE);
        if (!this.zzs.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer = this.zzN;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    private final boolean zzZ() {
        return this.zzt != null;
    }

    private static boolean zzaa(AudioTrack audioTrack) {
        return zzei.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzab() {
        zzqb zzqbVar = this.zzr;
        if (zzqbVar.zzc != 0) {
            return false;
        }
        int i = zzqbVar.zza.zzF;
        return true;
    }

    private static final AudioTrack zzac(zzpg zzpgVar, zze zzeVar, int i, zzab zzabVar) throws zzpi {
        AudioTrack audioTrack;
        try {
            int i2 = zzei.zza;
            if (i2 >= 23) {
                AudioFormat audioFormatZzx = zzei.zzx(zzpgVar.zzb, zzpgVar.zzc, zzpgVar.zza);
                AudioAttributes audioAttributes = zzeVar.zza().zza;
                np0.f();
                AudioTrack.Builder sessionId = AbstractC4255om.e().setAudioAttributes(audioAttributes).setAudioFormat(audioFormatZzx).setTransferMode(1).setBufferSizeInBytes(zzpgVar.zze).setSessionId(i);
                if (i2 >= 29) {
                    sessionId.setOffloadedPlayback(zzpgVar.zzd);
                }
                audioTrack = sessionId.build();
            } else {
                AudioAttributes audioAttributes2 = zzeVar.zza().zza;
                int i3 = zzpgVar.zzb;
                int i4 = zzpgVar.zzc;
                int i5 = zzpgVar.zza;
                audioTrack = new AudioTrack(audioAttributes2, zzei.zzx(i3, i4, i5), zzpgVar.zze, 1, i);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzpi(state, zzpgVar.zzb, zzpgVar.zzc, zzpgVar.zza, zzabVar, zzpgVar.zzd, null);
        } catch (IllegalArgumentException e) {
            e = e;
            throw new zzpi(0, zzpgVar.zzb, zzpgVar.zzc, zzpgVar.zza, zzabVar, zzpgVar.zzd, e);
        } catch (UnsupportedOperationException e2) {
            e = e2;
            throw new zzpi(0, zzpgVar.zzb, zzpgVar.zzc, zzpgVar.zza, zzabVar, zzpgVar.zzd, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final boolean zzA(zzab zzabVar) {
        return zza(zzabVar) != 0;
    }

    public final void zzJ(zzoi zzoiVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zzY;
        if (looper != looperMyLooper) {
            throw new IllegalStateException(AbstractC5044xl.n("Current looper (", looperMyLooper != null ? looperMyLooper.getThread().getName() : "null", ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), ")"));
        }
        if (zzoiVar.equals(this.zzu)) {
            return;
        }
        this.zzu = zzoiVar;
        zzpj zzpjVar = this.zzp;
        if (zzpjVar != null) {
            ((zzqq) zzpjVar).zza.zzB();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final int zza(zzab zzabVar) {
        zzR();
        if (!MimeTypes.AUDIO_RAW.equals(zzabVar.zzo)) {
            return this.zzu.zzb(zzabVar, this.zzx) != null ? 2 : 0;
        }
        if (zzei.zzJ(zzabVar.zzF)) {
            return zzabVar.zzF != 2 ? 1 : 2;
        }
        AbstractC3888ke0.r("Invalid PCM encoding: ", zzabVar.zzF, "DefaultAudioSink");
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final long zzb(boolean z) {
        long jZzq;
        if (!zzZ() || this.zzI) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.zzi.zza(z), zzei.zzt(zzM(), this.zzr.zze));
        while (!this.zzj.isEmpty() && jMin >= ((zzqd) this.zzj.getFirst()).zzc) {
            this.zzz = (zzqd) this.zzj.remove();
        }
        long j = jMin - this.zzz.zzc;
        if (this.zzj.isEmpty()) {
            jZzq = this.zzz.zzb + this.zzac.zza(j);
        } else {
            zzqd zzqdVar = (zzqd) this.zzj.getFirst();
            jZzq = zzqdVar.zzb - zzei.zzq(zzqdVar.zzc - jMin, this.zzz.zza.zzb);
        }
        long jZzb = this.zzac.zzb();
        long jZzt = zzei.zzt(jZzb, this.zzr.zze) + jZzq;
        long j2 = this.zzZ;
        if (jZzb > j2) {
            long jZzt2 = zzei.zzt(jZzb - j2, this.zzr.zze);
            this.zzZ = jZzb;
            this.zzaa += jZzt2;
            if (this.zzab == null) {
                this.zzab = new Handler(Looper.myLooper());
            }
            this.zzab.removeCallbacksAndMessages(null);
            this.zzab.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpu
                @Override // java.lang.Runnable
                public final void run() {
                    zzqm.zzG(this.zza);
                }
            }, 100L);
        }
        return jZzt;
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final zzbe zzc() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final zzor zzd(zzab zzabVar) {
        return this.zzW ? zzor.zza : this.zzad.zza(zzabVar, this.zzx);
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zze(zzab zzabVar, int i, @Nullable int[] iArr) throws zzph {
        int iIntValue;
        zzce zzceVar;
        int i2;
        int iIntValue2;
        int iZzk;
        int i3;
        int iZzk2;
        int iMax;
        zzR();
        if (MimeTypes.AUDIO_RAW.equals(zzabVar.zzo)) {
            zzcw.zzd(zzei.zzJ(zzabVar.zzF));
            iZzk = zzei.zzk(zzabVar.zzF) * zzabVar.zzD;
            zzfxk zzfxkVar = new zzfxk();
            zzfxkVar.zzh(this.zzg);
            zzfxkVar.zzg(this.zzac.zze());
            zzce zzceVar2 = new zzce(zzfxkVar.zzi());
            if (zzceVar2.equals(this.zzs)) {
                zzceVar2 = this.zzs;
            }
            this.zzf.zzq(zzabVar.zzG, zzabVar.zzH);
            this.zze.zzo(iArr);
            try {
                zzcf zzcfVarZza = zzceVar2.zza(new zzcf(zzabVar.zzE, zzabVar.zzD, zzabVar.zzF));
                iIntValue = zzcfVarZza.zzd;
                i2 = zzcfVarZza.zzb;
                int i4 = zzcfVarZza.zzc;
                iIntValue2 = zzei.zzi(i4);
                zzceVar = zzceVar2;
                iZzk2 = zzei.zzk(iIntValue) * i4;
                i3 = 0;
            } catch (zzcg e) {
                throw new zzph(e, zzabVar);
            }
        } else {
            zzce zzceVar3 = new zzce(zzfxn.zzn());
            int i5 = zzabVar.zzE;
            zzor zzorVar = zzor.zza;
            Pair pairZzb = this.zzu.zzb(zzabVar, this.zzx);
            if (pairZzb == null) {
                throw new zzph("Unable to configure passthrough for: ".concat(String.valueOf(zzabVar)), zzabVar);
            }
            iIntValue = ((Integer) pairZzb.first).intValue();
            zzceVar = zzceVar3;
            i2 = i5;
            iIntValue2 = ((Integer) pairZzb.second).intValue();
            iZzk = -1;
            i3 = 2;
            iZzk2 = -1;
        }
        if (iIntValue == 0) {
            throw new zzph("Invalid output encoding (mode=" + i3 + ") for: " + String.valueOf(zzabVar), zzabVar);
        }
        if (iIntValue2 == 0) {
            throw new zzph("Invalid output channel config (mode=" + i3 + ") for: " + String.valueOf(zzabVar), zzabVar);
        }
        int i6 = zzabVar.zzj;
        if (MimeTypes.AUDIO_DTS_EXPRESS.equals(zzabVar.zzo) && i6 == -1) {
            i6 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i2, iIntValue2, iIntValue);
        zzcw.zzf(minBufferSize != -2);
        int i7 = iZzk2 != -1 ? iZzk2 : 1;
        int i8 = 250000;
        if (i3 == 0) {
            iMax = Math.max(zzqo.zza(250000, i2, i7), Math.min(minBufferSize * 4, zzqo.zza(750000, i2, i7)));
        } else if (i3 != 1) {
            if (iIntValue == 5) {
                i8 = 500000;
            } else if (iIntValue == 8) {
                i8 = 1000000;
                iIntValue = 8;
            }
            iMax = zzgaq.zzb((((long) i8) * ((long) (i6 != -1 ? zzgaj.zzb(i6, 8, RoundingMode.CEILING) : zzqo.zzb(iIntValue)))) / 1000000);
        } else {
            iMax = zzgaq.zzb((((long) zzqo.zzb(iIntValue)) * 50000000) / 1000000);
        }
        int i9 = iIntValue;
        int iMax2 = (((Math.max(minBufferSize, iMax) + i7) - 1) / i7) * i7;
        this.zzW = false;
        zzqb zzqbVar = new zzqb(zzabVar, iZzk, i3, iZzk2, i2, iIntValue2, i9, iMax2, zzceVar, false, false, false);
        if (zzZ()) {
            this.zzq = zzqbVar;
        } else {
            this.zzr = zzqbVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzf() {
        zzqf zzqfVar;
        if (zzZ()) {
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzE = 0L;
            this.zzF = 0L;
            this.zzX = false;
            this.zzG = 0;
            this.zzz = new zzqd(this.zzA, 0L, 0L, null);
            this.zzJ = 0L;
            this.zzy = null;
            this.zzj.clear();
            this.zzL = null;
            this.zzM = 0;
            this.zzN = null;
            this.zzP = false;
            this.zzO = false;
            this.zzQ = false;
            this.zzf.zzp();
            zzX();
            if (this.zzi.zzh()) {
                this.zzt.pause();
            }
            if (zzaa(this.zzt)) {
                zzqk zzqkVar = this.zzk;
                zzqkVar.getClass();
                zzqkVar.zzb(this.zzt);
            }
            final zzpg zzpgVarZza = this.zzr.zza();
            zzqb zzqbVar = this.zzq;
            if (zzqbVar != null) {
                this.zzr = zzqbVar;
                this.zzq = null;
            }
            this.zzi.zzc();
            if (zzei.zza >= 24 && (zzqfVar = this.zzw) != null) {
                zzqfVar.zzb();
                this.zzw = null;
            }
            final AudioTrack audioTrack = this.zzt;
            final zzpj zzpjVar = this.zzp;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (zza) {
                try {
                    if (zzb == null) {
                        final String str = "ExoPlayer:AudioTrackReleaseThread";
                        zzb = Executors.newSingleThreadScheduledExecutor(new ThreadFactory(str) { // from class: com.google.android.gms.internal.ads.zzeh
                            public final /* synthetic */ String zza = "ExoPlayer:AudioTrackReleaseThread";

                            @Override // java.util.concurrent.ThreadFactory
                            public final Thread newThread(Runnable runnable) {
                                return new Thread(runnable, this.zza);
                            }
                        });
                    }
                    zzc++;
                    zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpt
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzqm.zzI(audioTrack, zzpjVar, handler, zzpgVarZza);
                        }
                    }, 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.zzt = null;
        }
        this.zzm.zza();
        this.zzl.zza();
        this.zzZ = 0L;
        this.zzaa = 0L;
        Handler handler2 = this.zzab;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzg() {
        this.zzH = true;
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzh() {
        this.zzR = false;
        if (zzZ()) {
            if (this.zzi.zzk() || zzaa(this.zzt)) {
                this.zzt.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzi() {
        this.zzR = true;
        if (zzZ()) {
            this.zzi.zzf();
            this.zzt.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzj() throws zzpl {
        if (!this.zzO && zzZ() && zzY()) {
            zzS();
            this.zzO = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzk() {
        zzon zzonVar = this.zzv;
        if (zzonVar != null) {
            zzonVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzl() {
        zzf();
        zzfxn zzfxnVar = this.zzg;
        int size = zzfxnVar.size();
        for (int i = 0; i < size; i++) {
            ((zzch) zzfxnVar.get(i)).zzf();
        }
        zzfxn zzfxnVar2 = this.zzh;
        int size2 = zzfxnVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((zzch) zzfxnVar2.get(i2)).zzf();
        }
        zzce zzceVar = this.zzs;
        if (zzceVar != null) {
            zzceVar.zzf();
        }
        this.zzR = false;
        this.zzW = false;
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzm(zze zzeVar) {
        if (this.zzx.equals(zzeVar)) {
            return;
        }
        this.zzx = zzeVar;
        zzon zzonVar = this.zzv;
        if (zzonVar != null) {
            zzonVar.zzg(zzeVar);
        }
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzn(int i) {
        if (this.zzS != i) {
            this.zzS = i;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzo(zzf zzfVar) {
        if (this.zzT.equals(zzfVar)) {
            return;
        }
        if (this.zzt != null) {
            int i = this.zzT.zza;
        }
        this.zzT = zzfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzp(zzcx zzcxVar) {
        this.zzi.zze(zzcxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzq(zzpj zzpjVar) {
        this.zzp = zzpjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    @RequiresApi(29)
    public final void zzr(int i, int i2) {
        AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            zzaa(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzs(zzbe zzbeVar) {
        this.zzA = new zzbe(Math.max(0.1f, Math.min(zzbeVar.zzb, 8.0f)), Math.max(0.1f, Math.min(zzbeVar.zzc, 8.0f)));
        zzU(zzbeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzt(@Nullable zzog zzogVar) {
        this.zzo = zzogVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    @RequiresApi(23)
    public final void zzu(@Nullable AudioDeviceInfo audioDeviceInfo) {
        this.zzU = audioDeviceInfo == null ? null : new zzoo(audioDeviceInfo);
        zzon zzonVar = this.zzv;
        if (zzonVar != null) {
            zzonVar.zzh(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            zzpx.zza(audioTrack, this.zzU);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzv(boolean z) {
        this.zzB = z;
        zzU(this.zzA);
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzw(float f) {
        if (this.zzK != f) {
            this.zzK = f;
            zzW();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:116:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:138:0x025f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0261  */
    /* JADX WARN: Code duplicated, block: B:142:0x026f  */
    /* JADX WARN: Code duplicated, block: B:145:0x027a  */
    /* JADX WARN: Code duplicated, block: B:147:0x0283  */
    /* JADX WARN: Code duplicated, block: B:148:0x0287  */
    /* JADX WARN: Code duplicated, block: B:150:0x0291 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x0293 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x0295  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:159:0x02eb  */
    @Override // com.google.android.gms.internal.ads.zzpm
    public final boolean zzx(ByteBuffer byteBuffer, long j, int i) throws Exception {
        AudioTrack audioTrackZzN;
        zzon zzonVar;
        zzog zzogVar;
        boolean z;
        int iZzb;
        int iPosition;
        byte b;
        int i2;
        int i3;
        int i4;
        byte b2;
        int i5;
        int i6;
        ByteBuffer byteBuffer2 = this.zzL;
        zzcw.zzd(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzq != null) {
            if (!zzY()) {
                return false;
            }
            zzqb zzqbVar = this.zzq;
            zzqb zzqbVar2 = this.zzr;
            if (zzqbVar2.zzc == zzqbVar.zzc && zzqbVar2.zzg == zzqbVar.zzg && zzqbVar2.zze == zzqbVar.zze && zzqbVar2.zzf == zzqbVar.zzf && zzqbVar2.zzd == zzqbVar.zzd) {
                this.zzr = zzqbVar;
                this.zzq = null;
                AudioTrack audioTrack = this.zzt;
                if (audioTrack != null && zzaa(audioTrack)) {
                    boolean z2 = this.zzr.zzk;
                }
            } else {
                zzS();
                if (zzy()) {
                    return false;
                }
                zzf();
            }
            zzO(j);
        }
        if (!zzZ()) {
            try {
                if (this.zzl.zzc()) {
                    return false;
                }
                try {
                    zzqb zzqbVar3 = this.zzr;
                    zzqbVar3.getClass();
                    audioTrackZzN = zzN(zzqbVar3);
                } catch (zzpi e) {
                    zzqb zzqbVar4 = this.zzr;
                    if (zzqbVar4.zzh > 1000000) {
                        zzqb zzqbVar5 = new zzqb(zzqbVar4.zza, zzqbVar4.zzb, zzqbVar4.zzc, zzqbVar4.zzd, zzqbVar4.zze, zzqbVar4.zzf, zzqbVar4.zzg, 1000000, zzqbVar4.zzi, false, false, false);
                        try {
                            audioTrackZzN = zzN(zzqbVar5);
                            this.zzr = zzqbVar5;
                        } catch (zzpi e2) {
                            e.addSuppressed(e2);
                            zzQ();
                            throw e;
                        }
                    }
                    zzQ();
                    throw e;
                }
                this.zzt = audioTrackZzN;
                if (zzaa(audioTrackZzN)) {
                    AudioTrack audioTrack2 = this.zzt;
                    if (this.zzk == null) {
                        this.zzk = new zzqk(this);
                    }
                    this.zzk.zza(audioTrack2);
                    boolean z3 = this.zzr.zzk;
                }
                int i7 = zzei.zza;
                if (i7 >= 31 && (zzogVar = this.zzo) != null) {
                    AudioTrack audioTrack3 = this.zzt;
                    LogSessionId logSessionIdZza = zzogVar.zza();
                    if (!logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                        audioTrack3.setLogSessionId(logSessionIdZza);
                    }
                }
                this.zzS = this.zzt.getAudioSessionId();
                zzpq zzpqVar = this.zzi;
                AudioTrack audioTrack4 = this.zzt;
                zzqb zzqbVar6 = this.zzr;
                zzpqVar.zzd(audioTrack4, zzqbVar6.zzc == 2, zzqbVar6.zzg, zzqbVar6.zzd, zzqbVar6.zzh);
                zzW();
                int i8 = this.zzT.zza;
                zzoo zzooVar = this.zzU;
                if (zzooVar != null && i7 >= 23) {
                    zzpx.zza(this.zzt, zzooVar);
                    zzon zzonVar2 = this.zzv;
                    if (zzonVar2 != null) {
                        zzonVar2.zzh(this.zzU.zza);
                    }
                }
                if (i7 >= 24 && (zzonVar = this.zzv) != null) {
                    this.zzw = new zzqf(this.zzt, zzonVar);
                }
                this.zzI = true;
                zzpj zzpjVar = this.zzp;
                if (zzpjVar != null) {
                    ((zzqq) zzpjVar).zza.zzc.zzc(this.zzr.zza());
                }
            } catch (zzpi e3) {
                if (e3.zzb) {
                    throw e3;
                }
                this.zzl.zzb(e3);
                return false;
            }
        }
        this.zzl.zza();
        if (this.zzI) {
            this.zzJ = Math.max(0L, j);
            this.zzH = false;
            this.zzI = false;
            zzO(j);
            if (this.zzR) {
                zzi();
            }
        }
        if (!this.zzi.zzj(zzM())) {
            return false;
        }
        if (this.zzL == null) {
            zzcw.zzd(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            zzqb zzqbVar7 = this.zzr;
            if (zzqbVar7.zzc != 0 && this.zzG == 0) {
                int i9 = zzqbVar7.zzg;
                if (i9 == 20) {
                    z = true;
                    iZzb = zzadi.zzb(byteBuffer);
                } else if (i9 != 30) {
                    switch (i9) {
                        case 5:
                        case 6:
                            iZzb = zzabn.zza(byteBuffer);
                            z = true;
                            break;
                        case 7:
                        case 8:
                            if (byteBuffer.getInt(0) == -233094848) {
                                z = true;
                                iZzb = 1024;
                            } else {
                                if (byteBuffer.getInt(0) == -398277519) {
                                    iZzb = 1024;
                                } else if (byteBuffer.getInt(0) != 622876772) {
                                    iPosition = byteBuffer.position();
                                    b = byteBuffer.get(iPosition);
                                    if (b != -2) {
                                        if (b != -1) {
                                            if (b != 31) {
                                                i4 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                                i5 = byteBuffer.get(iPosition + 5) & 252;
                                                i3 = 2;
                                            } else {
                                                i3 = 2;
                                                i4 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                                b2 = byteBuffer.get(iPosition + 6);
                                            }
                                            i2 = (i5 >> i3) | i4;
                                            z = true;
                                        } else {
                                            i3 = 2;
                                            i4 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                            b2 = byteBuffer.get(iPosition + 7);
                                        }
                                        i5 = b2 & 60;
                                        i2 = (i5 >> i3) | i4;
                                        z = true;
                                    } else {
                                        z = true;
                                        i2 = ((byteBuffer.get(iPosition + 5) & 1) << 6) | ((byteBuffer.get(iPosition + 4) & 252) >> 2);
                                    }
                                    iZzb = (i2 + (z ? 1 : 0)) * 32;
                                } else {
                                    iZzb = 4096;
                                }
                                z = true;
                            }
                            break;
                        case 9:
                            iZzb = zzadg.zzc(zzei.zzj(byteBuffer, byteBuffer.position()));
                            if (iZzb == -1) {
                                throw new IllegalArgumentException();
                            }
                            z = true;
                            break;
                        case 10:
                            iZzb = 1024;
                            z = true;
                            break;
                        case 11:
                        case 12:
                            iZzb = 2048;
                            z = true;
                            break;
                        default:
                            switch (i9) {
                                case 14:
                                    int iPosition2 = byteBuffer.position();
                                    int iLimit = byteBuffer.limit() - 10;
                                    int i10 = iPosition2;
                                    while (true) {
                                        if (i10 > iLimit) {
                                            i6 = -1;
                                        } else if ((zzei.zzj(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                                            i6 = i10 - iPosition2;
                                        } else {
                                            i10++;
                                        }
                                    }
                                    if (i6 != -1) {
                                        iZzb = (40 << ((byteBuffer.get((byteBuffer.position() + i6) + ((byteBuffer.get((byteBuffer.position() + i6) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                    } else {
                                        iZzb = 0;
                                    }
                                    break;
                                case 15:
                                    iZzb = 512;
                                    break;
                                case 16:
                                    iZzb = 1024;
                                    break;
                                case 17:
                                    byte[] bArr = new byte[16];
                                    int iPosition3 = byteBuffer.position();
                                    byteBuffer.get(bArr);
                                    byteBuffer.position(iPosition3);
                                    iZzb = zzabq.zza(new zzdx(bArr, 16)).zzc;
                                    break;
                                case 18:
                                    iZzb = zzabn.zza(byteBuffer);
                                    break;
                                default:
                                    throw new IllegalStateException(AbstractC3950lJ.p("Unexpected audio encoding: ", i9));
                            }
                            z = true;
                            break;
                    }
                } else if (byteBuffer.getInt(0) == -233094848) {
                    if (byteBuffer.getInt(0) == -398277519) {
                        iZzb = 1024;
                    } else if (byteBuffer.getInt(0) != 622876772) {
                        iZzb = 4096;
                    } else {
                        iPosition = byteBuffer.position();
                        b = byteBuffer.get(iPosition);
                        if (b != -2) {
                            if (b != -1) {
                                if (b != 31) {
                                    i4 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                    i5 = byteBuffer.get(iPosition + 5) & 252;
                                    i3 = 2;
                                } else {
                                    i3 = 2;
                                    i4 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                    b2 = byteBuffer.get(iPosition + 6);
                                }
                                i2 = (i5 >> i3) | i4;
                                z = true;
                            } else {
                                i3 = 2;
                                i4 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                b2 = byteBuffer.get(iPosition + 7);
                            }
                            i5 = b2 & 60;
                            i2 = (i5 >> i3) | i4;
                            z = true;
                        } else {
                            z = true;
                            i2 = ((byteBuffer.get(iPosition + 5) & 1) << 6) | ((byteBuffer.get(iPosition + 4) & 252) >> 2);
                        }
                        iZzb = (i2 + (z ? 1 : 0)) * 32;
                    }
                    z = true;
                } else {
                    z = true;
                    iZzb = 1024;
                }
                this.zzG = iZzb;
                if (iZzb == 0) {
                    return z;
                }
            }
            if (this.zzy != null) {
                if (!zzY()) {
                    return false;
                }
                zzO(j);
                this.zzy = null;
            }
            long jZzt = zzei.zzt(zzL() - this.zzf.zzo(), this.zzr.zza.zzE) + this.zzJ;
            if (!this.zzH && Math.abs(jZzt - j) > 200000) {
                zzpj zzpjVar2 = this.zzp;
                if (zzpjVar2 != null) {
                    zzpjVar2.zza(new zzpk(j, jZzt));
                }
                this.zzH = true;
            }
            if (this.zzH) {
                if (!zzY()) {
                    return false;
                }
                long j2 = j - jZzt;
                this.zzJ += j2;
                this.zzH = false;
                zzO(j);
                zzpj zzpjVar3 = this.zzp;
                if (zzpjVar3 != null && j2 != 0) {
                    ((zzqq) zzpjVar3).zza.zzao();
                }
            }
            if (this.zzr.zzc == 0) {
                this.zzC += (long) byteBuffer.remaining();
            } else {
                this.zzD = (((long) this.zzG) * ((long) i)) + this.zzD;
            }
            this.zzL = byteBuffer;
            this.zzM = i;
        }
        zzT(j);
        if (!this.zzL.hasRemaining()) {
            this.zzL = null;
            this.zzM = 0;
            return true;
        }
        if (!this.zzi.zzi(zzM())) {
            return false;
        }
        zzdo.zzf("DefaultAudioSink", "Resetting stalled audio track");
        zzf();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final boolean zzy() {
        if (zzZ()) {
            return !(zzei.zza >= 29 && this.zzt.isOffloadedPlayback() && this.zzQ) && this.zzi.zzg(zzM());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final boolean zzz() {
        if (zzZ()) {
            return this.zzO && !zzy();
        }
        return true;
    }
}
