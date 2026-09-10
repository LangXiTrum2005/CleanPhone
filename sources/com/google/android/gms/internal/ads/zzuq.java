package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.p004ironsource.d9;
import com.unity3d.services.core.device.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzuq extends zzij {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private float zzA;
    private ArrayDeque zzB;
    private zzum zzC;
    private zzuj zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private boolean zzL;
    private long zzM;
    private int zzN;
    private int zzO;
    private ByteBuffer zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private boolean zzZ;
    protected zzik zza;
    private boolean zzaa;
    private boolean zzab;
    private long zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private zzup zzag;
    private long zzah;
    private boolean zzai;
    private boolean zzaj;
    private boolean zzak;
    private long zzal;
    private final zzue zzc;
    private final zzus zzd;
    private final float zze;
    private final zzih zzf;
    private final zzih zzg;
    private final zzih zzh;
    private final zztx zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzsx zzl;
    private final AtomicInteger zzm;
    private zzv zzn;
    private zzv zzo;
    private zztd zzp;
    private zztd zzq;
    private zzmh zzr;
    private MediaCrypto zzs;
    private long zzt;
    private float zzu;
    private float zzv;
    private zzug zzw;
    private zzv zzx;
    private MediaFormat zzy;
    private boolean zzz;

    public zzuq(int i2, zzue zzueVar, zzus zzusVar, boolean z2, float f) {
        super(i2);
        this.zzc = zzueVar;
        zzusVar.getClass();
        this.zzd = zzusVar;
        this.zze = f;
        this.zzm = new AtomicInteger();
        this.zzf = new zzih(0, 0);
        this.zzg = new zzih(0, 0);
        this.zzh = new zzih(2, 0);
        zztx zztxVar = new zztx();
        this.zzi = zztxVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        this.zzag = zzup.zza;
        zztxVar.zzj(0);
        zztxVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzsx();
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzW = 0;
        this.zzN = -1;
        this.zzO = -1;
        this.zzM = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzK = -9223372036854775807L;
        this.zzX = 0;
        this.zzY = 0;
        this.zza = new zzik();
        this.zzak = false;
        this.zzal = 0L;
    }

    private final void zzao() {
        this.zzS = false;
        zzat();
    }

    private final void zzat() {
        zzaw();
        this.zzU = false;
        this.zzi.zza();
        this.zzh.zza();
        this.zzT = false;
        this.zzl.zzb();
    }

    private final boolean zzau() {
        if (this.zzw == null) {
            return false;
        }
        if (zzaK()) {
            zzaI();
            return true;
        }
        if (zzaL()) {
            zzav();
            return false;
        }
        this.zzak = true;
        return false;
    }

    private final void zzav() {
        try {
            zzug zzugVar = this.zzw;
            if (zzugVar == null) {
                throw null;
            }
            zzugVar.zzk();
            zzaN();
        } catch (Throwable th) {
            zzaN();
            throw th;
        }
    }

    private final void zzaw() {
        this.zzac = -9223372036854775807L;
        zzbo().zzf = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
    }

    private final boolean zzax(int i2) throws zzit {
        zzle zzleVarZzH = zzH();
        zzih zzihVar = this.zzf;
        zzihVar.zza();
        int iZzO = zzO(zzleVarZzH, zzihVar, i2 | 4);
        if (iZzO == -5) {
            zzam(zzleVarZzH);
            return true;
        }
        if (iZzO != -4 || !zzihVar.zzb()) {
            return false;
        }
        this.zzad = true;
        zzbm();
        return false;
    }

    private final boolean zzay(long j) {
        return this.zzt == -9223372036854775807L || zzL().zzb() - j < this.zzt;
    }

    public static boolean zzbd(zzv zzvVar) {
        return zzvVar.zzN == 0;
    }

    private final boolean zzbg() {
        return this.zzO >= 0;
    }

    private final void zzbh() {
        this.zzN = -1;
        this.zzg.zzc = null;
    }

    private final void zzbi() {
        this.zzO = -1;
        this.zzP = null;
    }

    private final boolean zzbj(zzv zzvVar) throws zzit {
        if (this.zzw != null && this.zzY != 3 && zze() != 0) {
            float f = this.zzv;
            zzvVar.getClass();
            float fZzai = zzai(f, zzvVar, zzI());
            float f2 = this.zzA;
            if (f2 != fZzai) {
                if (fZzai == -1.0f) {
                    zzbl();
                    return false;
                }
                if (f2 != -1.0f || fZzai > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fZzai);
                    zzug zzugVar = this.zzw;
                    zzugVar.getClass();
                    zzugVar.zzp(bundle);
                    this.zzA = fZzai;
                }
            }
        }
        return true;
    }

    private final boolean zzbk() throws zzit {
        if (this.zzZ) {
            this.zzX = 1;
            if (this.zzG) {
                this.zzY = 3;
                return false;
            }
            this.zzY = 2;
        } else {
            zzbp();
        }
        return true;
    }

    private final void zzbl() throws zzit {
        if (this.zzZ) {
            this.zzX = 1;
            this.zzY = 3;
        } else {
            zzaI();
            zzaA();
        }
    }

    private final void zzbm() throws zzit {
        int i2 = this.zzY;
        if (i2 == 1) {
            zzav();
            return;
        }
        if (i2 == 2) {
            zzav();
            zzbp();
        } else if (i2 != 3) {
            this.zzae = true;
            zzar();
        } else {
            zzaI();
            zzaA();
        }
    }

    private final void zzbn(zzup zzupVar) {
        this.zzag = zzupVar;
        if (zzupVar.zzd != -9223372036854775807L) {
            this.zzai = true;
        }
    }

    private final zzup zzbo() {
        ArrayDeque arrayDeque = this.zzk;
        return !arrayDeque.isEmpty() ? (zzup) arrayDeque.getLast() : this.zzag;
    }

    private final void zzbp() throws zzit {
        zztd zztdVar = this.zzq;
        zztdVar.getClass();
        this.zzp = zztdVar;
        this.zzX = 0;
        this.zzY = 0;
    }

    private final boolean zzbq(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        zzv zzvVar = this.zzo;
        return (zzvVar != null && Objects.equals(zzvVar.zzo, "audio/opus") && zzafn.zzf(j, j2)) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public void zzA(long j, boolean z2, boolean z3) throws zzit {
        ArrayDeque arrayDeque = this.zzk;
        if (!arrayDeque.isEmpty()) {
            this.zzag = (zzup) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z3) {
            this.zzad = false;
            this.zzae = false;
            if (this.zzS) {
                zzat();
            } else {
                zzaJ();
            }
            zzff zzffVar = this.zzag.zze;
            if (zzffVar.zzc() > 0) {
                this.zzaf = true;
            }
            zzffVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public void zzD() {
        this.zzn = null;
        zzbn(zzup.zza);
        this.zzk.clear();
        if (this.zzS) {
            zzao();
        } else {
            zzau();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public void zzE() {
        try {
            zzao();
            zzaI();
        } finally {
            this.zzq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final long zzT(long j, long j2) {
        return zzah(j, j2, this.zzL);
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public void zzV(float f, float f2) throws zzit {
        this.zzu = f;
        this.zzv = f2;
        zzbj(this.zzx);
    }

    /* JADX WARN: Code duplicated, block: B:230:0x0369 A[LOOP:0: B:126:0x01fa->B:230:0x0369, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:361:0x0584  */
    /* JADX WARN: Code duplicated, block: B:363:0x058b  */
    /* JADX WARN: Code duplicated, block: B:367:0x059e  */
    /* JADX WARN: Code duplicated, block: B:370:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:372:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:375:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:376:0x05be  */
    /* JADX WARN: Code duplicated, block: B:402:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzuq] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    @Override // com.google.android.gms.internal.ads.zzmi
    public void zzX(long j, long j2) throws Throwable {
        boolean z2;
        ?? r12;
        ?? r13;
        boolean z3;
        ?? r2;
        zzui zzuiVarZzaP;
        int i2;
        StackTraceElement[] stackTrace;
        boolean z4;
        boolean z5;
        Throwable th;
        long j3;
        boolean z6;
        boolean z7;
        ByteBuffer byteBuffer;
        int i3;
        MediaCodec.BufferInfo bufferInfo;
        long j4;
        int i4;
        long j5;
        boolean z8 = true;
        try {
            try {
                if (this.zzae) {
                    zzar();
                    return;
                }
                int i5 = 2;
                if (this.zzn == null && !zzax(2)) {
                    return;
                }
                zzaA();
                byte b2 = -5;
                ?? r6 = 0;
                try {
                    try {
                        try {
                            try {
                                if (this.zzS) {
                                    try {
                                        try {
                                            Trace.beginSection("bypassRender");
                                            while (true) {
                                                zzgqa.zzi(this.zzae ^ z8);
                                                zztx zztxVar = this.zzi;
                                                try {
                                                    if (zztxVar.zzp()) {
                                                        ByteBuffer byteBuffer2 = zztxVar.zzc;
                                                        int i6 = this.zzO;
                                                        int iZzo = zztxVar.zzo();
                                                        long j6 = zztxVar.zze;
                                                        boolean zZzbq = zzbq(zzG(), zztxVar.zzn());
                                                        boolean zZzb = zztxVar.zzb();
                                                        zzv zzvVar = this.zzo;
                                                        if (zzvVar == null) {
                                                            throw r6;
                                                        }
                                                        if (zzaq(j, j2, null, byteBuffer2, i6, 0, iZzo, j6, zZzbq, zZzb, zzvVar)) {
                                                            zzaV(zztxVar.zzn());
                                                            zztxVar.zza();
                                                            r6 = 0;
                                                        } else {
                                                            z8 = true;
                                                        }
                                                        z5 = false;
                                                        break;
                                                    }
                                                    r6 = r6;
                                                    if (!this.zzad) {
                                                        z8 = true;
                                                        if (this.zzT) {
                                                            zzgqa.zzi(zztxVar.zzq(this.zzh));
                                                            z5 = false;
                                                            this.zzT = false;
                                                        } else {
                                                            z5 = false;
                                                        }
                                                        if (this.zzU) {
                                                            if (!zztxVar.zzp()) {
                                                                zzao();
                                                                this.zzU = z5;
                                                                zzaA();
                                                                if (!this.zzS) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        zzgqa.zzi(!this.zzad);
                                                        zzle zzleVarZzH = zzH();
                                                        zzih zzihVar = this.zzh;
                                                        zzihVar.zza();
                                                        while (true) {
                                                            zzihVar.zza();
                                                            int iZzO = zzO(zzleVarZzH, zzihVar, z5 ? 1 : 0);
                                                            if (iZzO == -5) {
                                                                zzam(zzleVarZzH);
                                                                break;
                                                            }
                                                            if (iZzO != -4) {
                                                                if (!zzcW()) {
                                                                    break;
                                                                }
                                                                zzbo().zzf = this.zzac;
                                                                break;
                                                            }
                                                            if (zzihVar.zzb()) {
                                                                this.zzad = true;
                                                                zzbo().zzf = this.zzac;
                                                                break;
                                                            }
                                                            this.zzac = Math.max(this.zzac, zzihVar.zze);
                                                            if (zzcW() || this.zzg.zzd()) {
                                                                zzbo().zzf = this.zzac;
                                                            }
                                                            if (this.zzaf) {
                                                                zzv zzvVar2 = this.zzn;
                                                                if (zzvVar2 == null) {
                                                                    throw r6;
                                                                }
                                                                this.zzo = zzvVar2;
                                                                if (Objects.equals(zzvVar2.zzo, "audio/opus") && !this.zzo.zzr.isEmpty()) {
                                                                    int iZze = zzafn.zze((byte[]) this.zzo.zzr.get(z5 ? 1 : 0));
                                                                    zzt zztVarZza = this.zzo.zza();
                                                                    zztVarZza.zzH(iZze);
                                                                    this.zzo = zztVarZza.zzM();
                                                                }
                                                                zzan(this.zzo, r6);
                                                                this.zzaf = z5;
                                                            }
                                                            zzihVar.zzl();
                                                            zzv zzvVar3 = this.zzo;
                                                            if (zzvVar3 != null && Objects.equals(zzvVar3.zzo, "audio/opus")) {
                                                                if (zzihVar.zze()) {
                                                                    zzihVar.zza = this.zzo;
                                                                    zzas(zzihVar);
                                                                }
                                                                if (zzafn.zzf(zzG(), zzihVar.zze)) {
                                                                    this.zzl.zza(zzihVar, this.zzo.zzr);
                                                                }
                                                            }
                                                            if (zztxVar.zzp()) {
                                                                long jZzG = zzG();
                                                                if (zzbq(jZzG, zztxVar.zzn()) == zzbq(jZzG, zzihVar.zze)) {
                                                                }
                                                                this.zzT = true;
                                                                break;
                                                            }
                                                            if (!zztxVar.zzq(zzihVar)) {
                                                                this.zzT = true;
                                                                break;
                                                            }
                                                        }
                                                        if (zztxVar.zzp()) {
                                                            zztxVar.zzl();
                                                        }
                                                        if (!zztxVar.zzp() && !this.zzad && !this.zzU) {
                                                            break;
                                                        }
                                                    } else {
                                                        z8 = true;
                                                        this.zzae = true;
                                                        z5 = false;
                                                        break;
                                                    }
                                                } catch (IllegalStateException e2) {
                                                    e = e2;
                                                    z8 = true;
                                                    b2 = 0;
                                                    z2 = z8;
                                                    r13 = b2;
                                                    z3 = e instanceof MediaCodec.CodecException;
                                                    if (!z3) {
                                                        stackTrace = e.getStackTrace();
                                                        if (stackTrace.length > 0) {
                                                        }
                                                        throw e;
                                                    }
                                                    zzal(e);
                                                    if (z3) {
                                                        r2 = r13;
                                                    } else {
                                                        r2 = r13;
                                                    }
                                                    if (r2 != 0) {
                                                        zzaI();
                                                    }
                                                    zzuiVarZzaP = zzaP(e, this.zzD);
                                                    if (zzuiVarZzaP.zza == 1101) {
                                                        i2 = 4006;
                                                    } else {
                                                        i2 = 4003;
                                                    }
                                                    throw zzN(zzuiVarZzaP, this.zzn, r2, i2);
                                                }
                                            }
                                            Trace.endSection();
                                        } catch (IllegalStateException e3) {
                                            e = e3;
                                        }
                                    } catch (MediaCodec.CryptoException e4) {
                                        e = e4;
                                        b2 = 0;
                                        r12 = b2;
                                        throw zzN(e, this.zzn, r12, zzfj.zzE(e.getErrorCode()));
                                    }
                                } else {
                                    byte b3 = -5;
                                    Throwable th2 = null;
                                    boolean z9 = false;
                                    if (this.zzw != null) {
                                        long jZzb = zzL().zzb();
                                        Trace.beginSection("drainAndFeed");
                                        long j7 = jZzb;
                                        while (true) {
                                            zzug zzugVar = this.zzw;
                                            if (zzugVar == null) {
                                                throw th2;
                                            }
                                            try {
                                                if (!zzbg()) {
                                                    try {
                                                        MediaCodec.BufferInfo bufferInfo2 = this.zzj;
                                                        int iZzf = zzugVar.zzf(bufferInfo2);
                                                        if (iZzf >= 0) {
                                                            th = th2;
                                                            bufferInfo2.presentationTimeUs -= this.zzal;
                                                            if (!this.zzI) {
                                                                if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                                                                    zzbm();
                                                                    j3 = j7;
                                                                    break;
                                                                }
                                                                this.zzO = iZzf;
                                                                ByteBuffer byteBufferZzj = zzugVar.zzj(iZzf);
                                                                this.zzP = byteBufferZzj;
                                                                if (byteBufferZzj != null) {
                                                                    byteBufferZzj.position(bufferInfo2.offset);
                                                                    this.zzP.limit(bufferInfo2.offset + bufferInfo2.size);
                                                                }
                                                                zzv zzvVar4 = (zzv) this.zzag.zze.zze(bufferInfo2.presentationTimeUs);
                                                                if (zzvVar4 == null && this.zzai && this.zzy != null) {
                                                                    zzvVar4 = (zzv) this.zzag.zze.zzd();
                                                                }
                                                                if (zzvVar4 != null) {
                                                                    this.zzo = zzvVar4;
                                                                } else if (this.zzz && this.zzo != null) {
                                                                }
                                                                zzv zzvVar5 = this.zzo;
                                                                if (zzvVar5 == null) {
                                                                    throw th;
                                                                }
                                                                zzan(zzvVar5, this.zzy);
                                                                this.zzz = z9;
                                                                this.zzai = z9;
                                                            } else {
                                                                this.zzI = z9;
                                                                zzugVar.zzc(iZzf, z9);
                                                                j3 = j7;
                                                                if (!zzay(j3)) {
                                                                    break;
                                                                    break;
                                                                }
                                                                j7 = j3;
                                                                th2 = th;
                                                                z8 = true;
                                                                i5 = 2;
                                                                z9 = false;
                                                                b3 = -5;
                                                            }
                                                        } else {
                                                            if (iZzf != -2) {
                                                                if (this.zzJ && (this.zzad || this.zzX == i5)) {
                                                                    zzbm();
                                                                }
                                                                long j8 = this.zzK;
                                                                if (j8 != -9223372036854775807L && j8 + 100 < zzL().zza()) {
                                                                    zzbm();
                                                                }
                                                                th = th2;
                                                                j3 = j7;
                                                                break;
                                                            }
                                                            this.zzab = z8;
                                                            zzug zzugVar2 = this.zzw;
                                                            if (zzugVar2 == null) {
                                                                throw th2;
                                                            }
                                                            MediaFormat mediaFormatZzg = zzugVar2.zzg();
                                                            if (this.zzE != 0 && mediaFormatZzg.getInteger("width") == 32 && mediaFormatZzg.getInteger("height") == 32) {
                                                                this.zzI = z8;
                                                            } else {
                                                                this.zzy = mediaFormatZzg;
                                                                this.zzz = z8;
                                                            }
                                                            th = th2;
                                                            j3 = j7;
                                                            if (!zzay(j3)) {
                                                                break;
                                                            }
                                                            j7 = j3;
                                                            th2 = th;
                                                            z8 = true;
                                                            i5 = 2;
                                                            z9 = false;
                                                            b3 = -5;
                                                        }
                                                    } catch (IllegalStateException e5) {
                                                        e = e5;
                                                        z4 = z9;
                                                        z2 = true;
                                                        r13 = z4;
                                                    }
                                                    z3 = e instanceof MediaCodec.CodecException;
                                                    if (!z3) {
                                                        stackTrace = e.getStackTrace();
                                                        if (stackTrace.length > 0 || !stackTrace[r13].getClassName().equals("android.media.MediaCodec")) {
                                                            throw e;
                                                        }
                                                    }
                                                    zzal(e);
                                                    if (z3 || !((MediaCodec.CodecException) e).isRecoverable()) {
                                                        r2 = r13;
                                                    } else {
                                                        r2 = z2;
                                                    }
                                                    if (r2 != 0) {
                                                        zzaI();
                                                    }
                                                    zzuiVarZzaP = zzaP(e, this.zzD);
                                                    if (zzuiVarZzaP.zza == 1101) {
                                                        i2 = 4006;
                                                    } else {
                                                        i2 = 4003;
                                                    }
                                                    throw zzN(zzuiVarZzaP, this.zzn, r2, i2);
                                                }
                                                th = th2;
                                                zzv zzvVar6 = this.zzo;
                                                if (zzvVar6 == null) {
                                                    throw th;
                                                }
                                                if (zzaq(j, j2, zzugVar, byteBuffer, i3, i4, 1, j5, z6, z7, zzvVar6)) {
                                                    zzaV(bufferInfo.presentationTimeUs);
                                                    boolean z10 = (bufferInfo.flags & 4) != 0;
                                                    if (!z10 && this.zzaa && this.zzR) {
                                                        this.zzK = zzL().zza();
                                                    }
                                                    zzbi();
                                                    if (z10) {
                                                        zzbm();
                                                    } else {
                                                        j3 = j4;
                                                        if (!zzay(j3)) {
                                                            break;
                                                            break;
                                                        }
                                                        j7 = j3;
                                                        th2 = th;
                                                        z8 = true;
                                                        i5 = 2;
                                                        z9 = false;
                                                        b3 = -5;
                                                    }
                                                }
                                                j3 = j4;
                                                break;
                                            } catch (IllegalStateException e6) {
                                                e = e6;
                                                r13 = z9;
                                                z2 = true;
                                            }
                                            z6 = (this.zzak || this.zzj.presentationTimeUs < zzG()) ? true : z9;
                                            this.zzQ = z6;
                                            long j9 = this.zzag.zzf;
                                            z7 = (j9 == -9223372036854775807L || j9 > this.zzj.presentationTimeUs) ? z9 : true;
                                            this.zzR = z7;
                                            byteBuffer = this.zzP;
                                            i3 = this.zzO;
                                            bufferInfo = this.zzj;
                                            j4 = j7;
                                            i4 = bufferInfo.flags;
                                            j5 = bufferInfo.presentationTimeUs;
                                        }
                                        do {
                                            zzug zzugVar3 = this.zzw;
                                            if (zzugVar3 != null && this.zzX != 2 && !this.zzad) {
                                                if (this.zzN < 0) {
                                                    int iZze2 = zzugVar3.zze();
                                                    this.zzN = iZze2;
                                                    if (iZze2 >= 0) {
                                                        zzih zzihVar2 = this.zzg;
                                                        zzihVar2.zzc = zzugVar3.zzh(iZze2);
                                                        zzihVar2.zza();
                                                    }
                                                }
                                                z2 = true;
                                                if (this.zzX == 1) {
                                                    if (!this.zzJ) {
                                                        this.zzaa = true;
                                                        zzugVar3.zza(this.zzN, 0, 0, 0L, 4);
                                                        zzbh();
                                                    }
                                                    this.zzX = 2;
                                                    break;
                                                }
                                                try {
                                                    if (this.zzH) {
                                                        this.zzH = false;
                                                        ByteBuffer byteBuffer3 = this.zzg.zzc;
                                                        if (byteBuffer3 == null) {
                                                            throw th;
                                                        }
                                                        byteBuffer3.put(zzb);
                                                        zzugVar3.zza(this.zzN, 0, 38, 0L, 0);
                                                        zzbh();
                                                        this.zzZ = true;
                                                    } else {
                                                        if (this.zzW == 1) {
                                                            int i7 = 0;
                                                            while (true) {
                                                                zzv zzvVar7 = this.zzx;
                                                                if (zzvVar7 == null) {
                                                                    throw th;
                                                                }
                                                                if (i7 >= zzvVar7.zzr.size()) {
                                                                    this.zzW = 2;
                                                                    break;
                                                                }
                                                                byte[] bArr = (byte[]) this.zzx.zzr.get(i7);
                                                                ByteBuffer byteBuffer4 = this.zzg.zzc;
                                                                if (byteBuffer4 == null) {
                                                                    throw th;
                                                                }
                                                                byteBuffer4.put(bArr);
                                                                i7++;
                                                            }
                                                        }
                                                        ByteBuffer byteBuffer5 = this.zzg.zzc;
                                                        if (byteBuffer5 == null) {
                                                            throw th;
                                                        }
                                                        int iPosition = byteBuffer5.position();
                                                        final zzle zzleVarZzH2 = zzH();
                                                        try {
                                                            zzugVar3.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzun
                                                                @Override // java.lang.Runnable
                                                                public final /* synthetic */ void run() {
                                                                    this.zza.zzbe(zzleVarZzH2);
                                                                }
                                                            });
                                                            int i8 = this.zzm.get();
                                                            if (i8 == -3) {
                                                                if (!zzcW()) {
                                                                    break;
                                                                }
                                                                zzbo().zzf = this.zzac;
                                                                break;
                                                            }
                                                            if (i8 == -5) {
                                                                if (this.zzW == 2) {
                                                                    this.zzg.zza();
                                                                    this.zzW = 1;
                                                                }
                                                                zzam(zzleVarZzH2);
                                                            } else {
                                                                zzih zzihVar3 = this.zzg;
                                                                if (zzihVar3.zzb()) {
                                                                    zzbo().zzf = this.zzac;
                                                                    if (this.zzW == 2) {
                                                                        zzihVar3.zza();
                                                                        this.zzW = 1;
                                                                    }
                                                                    this.zzad = true;
                                                                    if (!this.zzZ) {
                                                                        zzbm();
                                                                        break;
                                                                    } else {
                                                                        if (!this.zzJ) {
                                                                            this.zzaa = true;
                                                                            zzugVar3.zza(this.zzN, 0, 0, 0L, 4);
                                                                            zzbh();
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                if (this.zzZ || zzihVar3.zzc()) {
                                                                    long j10 = zzihVar3.zze;
                                                                    if (!zzaT(zzihVar3)) {
                                                                        boolean zZzk = zzihVar3.zzk();
                                                                        if (zZzk) {
                                                                            zzihVar3.zzb.zzc(iPosition);
                                                                        }
                                                                        if (this.zzaf) {
                                                                            zzff zzffVar = zzbo().zze;
                                                                            zzv zzvVar8 = this.zzn;
                                                                            if (zzvVar8 == null) {
                                                                                throw th;
                                                                            }
                                                                            zzffVar.zza(j10, zzvVar8);
                                                                            this.zzaf = false;
                                                                        }
                                                                        this.zzac = Math.max(this.zzac, j10);
                                                                        if (zzcW() || zzihVar3.zzd()) {
                                                                            zzbo().zzf = this.zzac;
                                                                        }
                                                                        zzihVar3.zzl();
                                                                        if (zzihVar3.zze()) {
                                                                            zzas(zzihVar3);
                                                                        }
                                                                        if (this.zzak) {
                                                                            long j11 = this.zzac;
                                                                            if (j10 <= j11) {
                                                                                this.zzal = (j11 - j10) + 1 + this.zzal;
                                                                            }
                                                                            this.zzac = j10;
                                                                            this.zzak = false;
                                                                        }
                                                                        zzaR(zzihVar3);
                                                                        int iZzaS = zzaS(zzihVar3);
                                                                        long j12 = j10 + this.zzal;
                                                                        if (zZzk) {
                                                                            zzugVar3.zzb(this.zzN, 0, zzihVar3.zzb, j12, iZzaS);
                                                                        } else {
                                                                            int i9 = this.zzN;
                                                                            ByteBuffer byteBuffer6 = zzihVar3.zzc;
                                                                            if (byteBuffer6 == null) {
                                                                                throw th;
                                                                            }
                                                                            zzugVar3.zza(i9, 0, byteBuffer6.limit(), j12, iZzaS);
                                                                        }
                                                                        zzbh();
                                                                        this.zzZ = true;
                                                                        this.zzW = 0;
                                                                        this.zza.zzc++;
                                                                    }
                                                                } else {
                                                                    zzihVar3.zza();
                                                                    if (this.zzW == 2) {
                                                                        this.zzW = 1;
                                                                    }
                                                                }
                                                            }
                                                        } catch (zzig e7) {
                                                            zzal(e7);
                                                            zzax(0);
                                                            zzav();
                                                        }
                                                    }
                                                } catch (IllegalStateException e8) {
                                                    e = e8;
                                                    r13 = 0;
                                                    z3 = e instanceof MediaCodec.CodecException;
                                                    if (!z3) {
                                                        stackTrace = e.getStackTrace();
                                                        if (stackTrace.length > 0) {
                                                        }
                                                        throw e;
                                                    }
                                                    zzal(e);
                                                    if (z3) {
                                                        r2 = r13;
                                                    } else {
                                                        r2 = r13;
                                                    }
                                                    if (r2 != 0) {
                                                        zzaI();
                                                    }
                                                    zzuiVarZzaP = zzaP(e, this.zzD);
                                                    if (zzuiVarZzaP.zza == 1101) {
                                                        i2 = 4006;
                                                    } else {
                                                        i2 = 4003;
                                                    }
                                                    throw zzN(zzuiVarZzaP, this.zzn, r2, i2);
                                                }
                                            }
                                            break;
                                        } while (zzay(j3));
                                        Trace.endSection();
                                    } else {
                                        this.zza.zzd += zzP(j);
                                        zzax(1);
                                    }
                                }
                                this.zza.zza();
                            } catch (MediaCodec.CryptoException e9) {
                                e = e9;
                                throw zzN(e, this.zzn, r12, zzfj.zzE(e.getErrorCode()));
                            } catch (IllegalStateException e10) {
                                e = e10;
                            }
                        } catch (MediaCodec.CryptoException e11) {
                            e = e11;
                        }
                    } catch (IllegalStateException e12) {
                        e = e12;
                    }
                } catch (IllegalStateException e13) {
                    e = e13;
                    z4 = false;
                }
            } catch (IllegalStateException e14) {
                e = e14;
                z2 = true;
            }
        } catch (MediaCodec.CryptoException e15) {
            e = e15;
            r12 = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public boolean zzY() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public boolean zzZ() {
        return this.zzae;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0280 A[Catch: zzum -> 0x0082, TryCatch #5 {zzum -> 0x0082, blocks: (B:25:0x0055, B:27:0x005c, B:29:0x0060, B:31:0x0076, B:36:0x0087, B:40:0x0093, B:42:0x009b, B:44:0x009f, B:46:0x00a3, B:48:0x00ac, B:138:0x0267, B:140:0x0280, B:142:0x0289, B:145:0x0290, B:146:0x0292, B:141:0x0283, B:148:0x0294, B:149:0x0295, B:151:0x029a, B:152:0x029b, B:153:0x02a5, B:38:0x008a, B:39:0x0092, B:155:0x02a8), top: B:168:0x0055, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0283 A[Catch: zzum -> 0x0082, TryCatch #5 {zzum -> 0x0082, blocks: (B:25:0x0055, B:27:0x005c, B:29:0x0060, B:31:0x0076, B:36:0x0087, B:40:0x0093, B:42:0x009b, B:44:0x009f, B:46:0x00a3, B:48:0x00ac, B:138:0x0267, B:140:0x0280, B:142:0x0289, B:145:0x0290, B:146:0x0292, B:141:0x0283, B:148:0x0294, B:149:0x0295, B:151:0x029a, B:152:0x029b, B:153:0x02a5, B:38:0x008a, B:39:0x0092, B:155:0x02a8), top: B:168:0x0055, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x028f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0108  */
    /* JADX WARN: Code duplicated, block: B:84:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:96:0x01cf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [com.google.android.gms.internal.ads.zzue] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.gms.internal.ads.zzuj] */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.google.android.gms.internal.ads.zzud] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzuq] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void zzaA() throws zzit {
        zzv zzvVar;
        boolean z2;
        ?? r10;
        zzum zzumVar;
        zzum zzumVar2;
        int i2;
        boolean z3;
        if (this.zzw != null || this.zzS || (zzvVar = this.zzn) == null) {
            return;
        }
        boolean z4 = true;
        if (zzaB(zzvVar)) {
            zzao();
            String str = zzvVar.zzo;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.zzi.zzm(32);
            } else {
                this.zzi.zzm(1);
            }
            this.zzS = true;
            return;
        }
        zztd zztdVar = this.zzq;
        this.zzp = zztdVar;
        if (zztdVar != null) {
            zzgqa.zzi(true);
            this.zzp.zza();
        }
        try {
            zzv zzvVar2 = this.zzn;
            MediaCrypto mediaCrypto = null;
            if (zzvVar2 == null) {
                throw null;
            }
            if (this.zzB == null) {
                try {
                    List listZzad = zzad(this.zzd, zzvVar2, false);
                    listZzad.isEmpty();
                    this.zzB = new ArrayDeque();
                    if (!listZzad.isEmpty()) {
                        this.zzB.add((zzuj) listZzad.get(0));
                    }
                    this.zzC = null;
                } catch (zzuu e2) {
                    throw new zzum(zzvVar2, (Throwable) e2, false, -49998);
                }
            }
            if (this.zzB.isEmpty()) {
                throw new zzum(zzvVar2, (Throwable) null, false, -49999);
            }
            ArrayDeque arrayDeque = this.zzB;
            if (arrayDeque == null) {
                throw null;
            }
            while (this.zzw == null) {
                zzuj zzujVar = (zzuj) arrayDeque.peekFirst();
                if (zzujVar == null) {
                    throw mediaCrypto;
                }
                zzaQ(zzvVar2);
                if (!zzaC(zzujVar)) {
                    return;
                }
                try {
                    this.zzD = zzujVar;
                    zzv zzvVar3 = this.zzn;
                    if (zzvVar3 == null) {
                        throw mediaCrypto;
                    }
                    String str2 = zzujVar.zza;
                    float fZzai = zzai(this.zzv, zzvVar3, zzI());
                    if (fZzai <= this.zze) {
                        fZzai = -1.0f;
                    }
                    long jZzb = zzL().zzb();
                    z2 = z4;
                    try {
                        ?? Zzaf = zzaf(zzujVar, zzvVar3, mediaCrypto, fZzai);
                        int i3 = Build.VERSION.SDK_INT;
                        if (i3 >= 31) {
                            LogSessionId logSessionIdZza = zzK().zza();
                            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                            if (!logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                                Zzaf.zzb.setString("log-session-id", logSessionIdZza.getStringId());
                            }
                        }
                        try {
                            StringBuilder sb = new StringBuilder(str2.length() + 12);
                            sb.append("createCodec:");
                            sb.append(str2);
                            Trace.beginSection(sb.toString());
                            zzug zzugVarZzb = this.zzc.zzb(Zzaf);
                            this.zzw = zzugVarZzb;
                            this.zzL = zzugVarZzb.zzm(new zzuo(this, null));
                            Trace.endSection();
                            long jZzb2 = zzL().zzb();
                            if (!zzujVar.zzc(zzvVar3)) {
                                String strZze = zzv.zze(zzvVar3);
                                String str3 = zzfj.zza;
                                Locale locale = Locale.US;
                                zzee.zzc("MediaCodecRenderer", "Format exceeds selected codec's capabilities [" + strZze + ", " + str2 + d9.i.f24752e);
                            }
                            this.zzA = fZzai;
                            this.zzx = zzvVar3;
                            if (i3 > 25 || !"OMX.Exynos.avc.dec.secure".equals(str2)) {
                                i2 = 0;
                            } else {
                                String str4 = Build.MODEL;
                                if (str4.startsWith("SM-T585") || str4.startsWith("SM-A510") || str4.startsWith("SM-A520") || str4.startsWith("SM-J700")) {
                                    i2 = 2;
                                } else {
                                    i2 = 0;
                                }
                            }
                            this.zzE = i2;
                            this.zzF = (i3 == 29 && "c2.android.aac.decoder".equals(str2)) ? z2 : false;
                            this.zzG = false;
                            String str5 = zzujVar.zza;
                            if (i3 <= 25 && "OMX.rk.video_decoder.avc".equals(str5)) {
                                z3 = z2;
                            } else if ((i3 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str5) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str5) || "OMX.bcm.vdec.avc.tunnel".equals(str5) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str5) || "OMX.bcm.vdec.hevc.tunnel".equals(str5) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str5))) && !("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && zzujVar.zzf)) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            this.zzJ = z3;
                            if (this.zzw == null) {
                                throw null;
                            }
                            if (zze() == 2) {
                                this.zzM = zzL().zzb() + 1000;
                            }
                            this.zza.zza++;
                            Zzaf = zzujVar;
                            try {
                                zzaj(str2, Zzaf, jZzb2, jZzb2 - jZzb);
                            } catch (Exception e3) {
                                e = e3;
                                r10 = Zzaf;
                                zzee.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r10.zza), e);
                                arrayDeque.removeFirst();
                                zzumVar = new zzum(zzvVar2, (Throwable) e, false, (zzuj) r10);
                                zzal(zzumVar);
                                zzumVar2 = this.zzC;
                                if (zzumVar2 == null) {
                                    this.zzC = zzumVar;
                                } else {
                                    this.zzC = zzumVar2.zza(zzumVar);
                                }
                                if (!arrayDeque.isEmpty()) {
                                    throw this.zzC;
                                }
                            }
                            z4 = z2;
                            mediaCrypto = null;
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        r10 = zzujVar;
                    }
                } catch (Exception e5) {
                    e = e5;
                    z2 = z4;
                }
                r10 = zzujVar;
                zzee.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r10.zza), e);
                arrayDeque.removeFirst();
                zzumVar = new zzum(zzvVar2, (Throwable) e, false, (zzuj) r10);
                zzal(zzumVar);
                zzumVar2 = this.zzC;
                if (zzumVar2 == null) {
                    this.zzC = zzumVar;
                } else {
                    this.zzC = zzumVar2.zza(zzumVar);
                }
                if (!arrayDeque.isEmpty()) {
                    throw this.zzC;
                }
                z4 = z2;
                mediaCrypto = null;
            }
            this.zzB = mediaCrypto;
        } catch (zzum e6) {
            throw zzN(e6, zzvVar, false, 4001);
        }
    }

    public final boolean zzaB(zzv zzvVar) {
        return this.zzq == null && zzae(zzvVar);
    }

    public boolean zzaC(zzuj zzujVar) {
        return true;
    }

    public final boolean zzaD() {
        return this.zzS;
    }

    public final zzug zzaE() {
        return this.zzw;
    }

    public final zzv zzaF() {
        return this.zzx;
    }

    public final MediaFormat zzaG() {
        return this.zzy;
    }

    public final zzuj zzaH() {
        return this.zzD;
    }

    public final void zzaI() {
        try {
            zzug zzugVar = this.zzw;
            if (zzugVar != null) {
                zzugVar.zzl();
                this.zza.zzb++;
                zzuj zzujVar = this.zzD;
                if (zzujVar == null) {
                    throw null;
                }
                zzak(zzujVar.zza);
            }
            this.zzw = null;
            this.zzs = null;
            this.zzp = null;
            zzaO();
        } catch (Throwable th) {
            this.zzw = null;
            this.zzs = null;
            this.zzp = null;
            zzaO();
            throw th;
        }
    }

    public final boolean zzaJ() throws zzit {
        boolean zZzau = zzau();
        if (zZzau) {
            zzaA();
        }
        return zZzau;
    }

    public boolean zzaK() {
        int i2 = this.zzY;
        if (i2 == 3 || ((this.zzF && !this.zzab) || (this.zzG && this.zzaa))) {
            return true;
        }
        if (i2 != 2) {
            return false;
        }
        try {
            zzbp();
            return false;
        } catch (zzit e2) {
            zzee.zzd("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e2);
            return true;
        }
    }

    public boolean zzaL() {
        return true;
    }

    public final long zzaM() {
        return this.zzal;
    }

    public void zzaN() {
        zzbh();
        zzbi();
        zzaw();
        this.zzM = -9223372036854775807L;
        this.zzaa = false;
        this.zzK = -9223372036854775807L;
        this.zzZ = false;
        this.zzH = false;
        this.zzI = false;
        this.zzQ = false;
        this.zzR = false;
        this.zzX = 0;
        this.zzY = 0;
        this.zzW = this.zzV ? 1 : 0;
        this.zzak = false;
        this.zzal = 0L;
    }

    public final void zzaO() {
        zzaN();
        this.zzB = null;
        this.zzD = null;
        this.zzx = null;
        this.zzy = null;
        this.zzz = false;
        this.zzab = false;
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzF = false;
        this.zzG = false;
        this.zzJ = false;
        this.zzL = false;
        this.zzV = false;
        this.zzW = 0;
    }

    public zzui zzaP(Throwable th, zzuj zzujVar) {
        return new zzui(th, zzujVar);
    }

    public boolean zzaQ(zzv zzvVar) throws zzit {
        return true;
    }

    public void zzaR(zzih zzihVar) throws zzit {
    }

    public int zzaS(zzih zzihVar) {
        return 0;
    }

    public boolean zzaT(zzih zzihVar) {
        return false;
    }

    public final long zzaU() {
        return this.zzah;
    }

    public void zzaV(long j) {
        this.zzah = j;
        while (true) {
            ArrayDeque arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || j < ((zzup) arrayDeque.peek()).zzb) {
                return;
            }
            zzup zzupVar = (zzup) arrayDeque.poll();
            zzupVar.getClass();
            zzbn(zzupVar);
            zzap();
        }
    }

    public final boolean zzaW() {
        if (this.zzn == null) {
            return false;
        }
        if (zzQ() || zzbg()) {
            return true;
        }
        return this.zzM != -9223372036854775807L && zzL().zzb() < this.zzM;
    }

    public final float zzaX() {
        return this.zzu;
    }

    public final zzmh zzaY() {
        return this.zzr;
    }

    public final boolean zzaZ() throws zzit {
        return zzbj(this.zzx);
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public final int zzab(zzv zzvVar) throws zzit {
        try {
            return zzac(this.zzd, zzvVar);
        } catch (zzuu e2) {
            throw zzN(e2, zzvVar, false, 4002);
        }
    }

    public abstract int zzac(zzus zzusVar, zzv zzvVar) throws zzuu;

    public abstract List zzad(zzus zzusVar, zzv zzvVar, boolean z2) throws zzuu;

    public boolean zzae(zzv zzvVar) {
        return false;
    }

    public abstract zzud zzaf(zzuj zzujVar, zzv zzvVar, MediaCrypto mediaCrypto, float f);

    public zzil zzag(zzuj zzujVar, zzv zzvVar, zzv zzvVar2) {
        throw null;
    }

    public long zzah(long j, long j2, boolean z2) {
        return super.zzT(j, j2);
    }

    public float zzai(float f, zzv zzvVar, zzv[] zzvVarArr) {
        throw null;
    }

    public void zzaj(String str, zzud zzudVar, long j, long j2) {
        throw null;
    }

    public void zzak(String str) {
        throw null;
    }

    public void zzal(Exception exc) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    public zzil zzam(zzle zzleVar) throws zzit {
        int i2;
        boolean z2 = true;
        this.zzaf = true;
        zzv zzvVarZzM = zzleVar.zzb;
        zzvVarZzM.getClass();
        String str = zzvVarZzM.zzo;
        if (str == null) {
            throw zzN(new IllegalArgumentException("Sample MIME type is null."), zzvVarZzM, false, 4005);
        }
        if ((str.equals(MimeTypes.VIDEO_AV1) || str.equals("video/x-vnd.on2.vp9")) && !zzvVarZzM.zzr.isEmpty()) {
            zzt zztVarZza = zzvVarZzM.zza();
            zztVarZza.zzp(null);
            zzvVarZzM = zztVarZza.zzM();
        }
        zzv zzvVar = zzvVarZzM;
        this.zzq = zzleVar.zza;
        this.zzn = zzvVar;
        if (this.zzS) {
            this.zzU = true;
            return null;
        }
        zzug zzugVar = this.zzw;
        if (zzugVar == null) {
            this.zzB = null;
            zzaA();
            return null;
        }
        zzuj zzujVar = this.zzD;
        zzujVar.getClass();
        zzv zzvVar2 = this.zzx;
        zzvVar2.getClass();
        zztd zztdVar = this.zzp;
        zztd zztdVar2 = this.zzq;
        if (zztdVar != zztdVar2) {
            zzbl();
            return new zzil(zzujVar.zza, zzvVar2, zzvVar, 0, 128);
        }
        zzil zzilVarZzag = zzag(zzujVar, zzvVar2, zzvVar);
        int i3 = zzilVarZzag.zzd;
        if (i3 != 0) {
            i2 = 2;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (zzbj(zzvVar)) {
                        this.zzx = zzvVar;
                        if (zztdVar2 == zztdVar || zzbk()) {
                        }
                    } else {
                        i2 = 16;
                    }
                } else if (zzbj(zzvVar)) {
                    this.zzV = true;
                    this.zzW = 1;
                    int i4 = this.zzE;
                    if (i4 != 2 && (i4 != 1 || zzvVar.zzv != zzvVar2.zzv || zzvVar.zzw != zzvVar2.zzw)) {
                        z2 = false;
                    }
                    this.zzH = z2;
                    this.zzx = zzvVar;
                    if (zztdVar2 == zztdVar || zzbk()) {
                    }
                } else {
                    i2 = 16;
                }
            } else if (zzbj(zzvVar)) {
                this.zzx = zzvVar;
                if (zztdVar2 != zztdVar) {
                    if (zzbk()) {
                    }
                } else if (this.zzZ) {
                    this.zzX = 1;
                    if (this.zzG) {
                        this.zzY = 3;
                    } else {
                        this.zzY = 1;
                    }
                }
            } else {
                i2 = 16;
            }
            return (i3 != 0 || (this.zzw == zzugVar && this.zzY != 3)) ? zzilVarZzag : new zzil(zzujVar.zza, zzvVar2, zzvVar, 0, i2);
        }
        zzbl();
        i2 = 0;
        if (i3 != 0) {
        }
    }

    public void zzan(zzv zzvVar, MediaFormat mediaFormat) throws zzit {
        throw null;
    }

    public void zzap() {
    }

    public abstract boolean zzaq(long j, long j2, zzug zzugVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j3, boolean z2, boolean z3, zzv zzvVar) throws zzit;

    public void zzar() throws zzit {
        throw null;
    }

    public void zzas(zzih zzihVar) throws zzit {
        throw null;
    }

    public final void zzaz() {
        this.zzaj = true;
    }

    public final long zzba() {
        return this.zzag.zzf;
    }

    public final long zzbb() {
        return this.zzag.zzd;
    }

    public final long zzbc() {
        return this.zzag.zzc;
    }

    public final /* synthetic */ void zzbe(zzle zzleVar) {
        this.zzm.set(zzO(zzleVar, this.zzg, 0));
    }

    public final /* synthetic */ zzmh zzbf() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmk
    public final int zzu() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmd
    public void zzx(int i2, Object obj) throws zzit {
        if (i2 == 11) {
            zzmh zzmhVar = (zzmh) obj;
            zzmhVar.getClass();
            this.zzr = zzmhVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public void zzy(boolean z2, boolean z3) throws zzit {
        this.zza = new zzik();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzz(com.google.android.gms.internal.ads.zzv[] r12, long r13, long r15, com.google.android.gms.internal.ads.zzwg r17) throws com.google.android.gms.internal.ads.zzit {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zzup r12 = r11.zzag
            long r0 = r12.zzd
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            com.google.android.gms.internal.ads.zzup r4 = new com.google.android.gms.internal.ads.zzup
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.zzbn(r4)
            boolean r12 = r11.zzaj
            if (r12 == 0) goto L56
            r11.zzap()
            return
        L24:
            java.util.ArrayDeque r12 = r11.zzk
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.zzac
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.zzah
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            com.google.android.gms.internal.ads.zzup r4 = new com.google.android.gms.internal.ads.zzup
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.zzbn(r4)
            com.google.android.gms.internal.ads.zzup r12 = r11.zzag
            long r12 = r12.zzd
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.zzap()
        L56:
            return
        L57:
            com.google.android.gms.internal.ads.zzup r0 = new com.google.android.gms.internal.ads.zzup
            long r1 = r11.zzac
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuq.zzz(com.google.android.gms.internal.ads.zzv[], long, long, com.google.android.gms.internal.ads.zzwg):void");
    }
}
