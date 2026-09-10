package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vc implements ok1, ag0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f21149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f21150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f21151d;

    public vc(qc qcVar, int i10, kc kcVar) {
        this.f21149b = qcVar;
        this.f21148a = i10;
        this.f21150c = kcVar;
    }

    public static final void i(long j10) throws tc {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        if (j10 % (((((((~j11) & j12) | j13) + ((j11 & j14) | j15)) - j16) + jArr[6]) ^ (jArr[7] % 477127367)) != 0) {
            throw new tc();
        }
    }

    @Override // com.google.android.gms.internal.ads.ok1
    public byte[] a(int i10, byte[] bArr) throws InvalidAlgorithmParameterException {
        if (i10 > this.f21148a) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        tq1 tq1Var = (tq1) this.f21149b;
        ((Mac) tq1Var.get()).update(bArr);
        return Arrays.copyOf(((Mac) tq1Var.get()).doFinal(), i10);
    }

    public void b(long j10) {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        long j18 = jArr[7];
        i(j10);
        long j19 = j10 / (((((((~j11) & j12) | j13) + ((j11 & j14) | j15)) - j16) + j17) ^ (j18 % 899334107));
        if (j19 < 0 || j19 > ((qc) this.f21149b).f19023a.length) {
            throw new uc();
        }
        this.f21148a = (int) j19;
    }

    public long c() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        return ((long) this.f21148a) * (((((((~j10) & j11) | j12) + ((j10 & j13) | j14)) - j15) + jArr[6]) ^ (jArr[7] % 1780695788));
    }

    public void d() {
        HandlerThread handlerThread;
        synchronized (this.f21149b) {
            try {
                ps1.c0(this.f21148a > 0);
                int i10 = this.f21148a - 1;
                this.f21148a = i10;
                if (i10 == 0 && (handlerThread = (HandlerThread) this.f21151d) != null) {
                    handlerThread.quit();
                    this.f21151d = null;
                    this.f21150c = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long e() {
        try {
            kc kcVar = (kc) this.f21150c;
            qc qcVar = (qc) this.f21149b;
            int i10 = this.f21148a;
            this.f21148a = i10 + 1;
            return kcVar.j(qcVar, i10);
        } catch (IndexOutOfBoundsException e10) {
            throw new uc(e10);
        }
    }

    public int f() {
        try {
            kc kcVar = (kc) this.f21150c;
            qc qcVar = (qc) this.f21149b;
            int i10 = this.f21148a;
            this.f21148a = i10 + 1;
            int iJ = kcVar.j(qcVar, i10) & 255;
            kc kcVar2 = (kc) this.f21150c;
            qc qcVar2 = (qc) this.f21149b;
            int i11 = this.f21148a;
            this.f21148a = i11 + 1;
            int iJ2 = iJ | ((kcVar2.j(qcVar2, i11) & 255) << 8);
            kc kcVar3 = (kc) this.f21150c;
            qc qcVar3 = (qc) this.f21149b;
            int i12 = this.f21148a;
            this.f21148a = i12 + 1;
            int iJ3 = iJ2 | ((kcVar3.j(qcVar3, i12) & 255) << 16);
            kc kcVar4 = (kc) this.f21150c;
            qc qcVar4 = (qc) this.f21149b;
            int i13 = this.f21148a;
            this.f21148a = i13 + 1;
            return (kcVar4.j(qcVar4, i13) << 24) | iJ3;
        } catch (IndexOutOfBoundsException e10) {
            throw new uc(e10);
        }
    }

    public long g() throws sc, uc {
        int i10 = 0;
        long j10 = 0;
        while (i10 < 64) {
            try {
                kc kcVar = (kc) this.f21150c;
                qc qcVar = (qc) this.f21149b;
                int i11 = this.f21148a;
                this.f21148a = i11 + 1;
                byte bJ = kcVar.j(qcVar, i11);
                j10 |= ((long) (bJ & 127)) << i10;
                if (i10 == 63) {
                    if (bJ > 1) {
                        throw new sc();
                    }
                    i10 = 63;
                }
                if ((bJ & 128) == 0) {
                    return (-(j10 & 1)) ^ (j10 >>> 1);
                }
                i10 += 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new uc(e10);
            }
        }
        throw new sc();
    }

    public qc h(long j10) throws tc, uc {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int iG = com.applovin.impl.ca.g((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        i(c() + j10);
        int i18 = this.f21148a;
        long j11 = i18;
        qc qcVar = (qc) this.f21149b;
        long j12 = (j10 >> ((i17 % 774318984) ^ iG)) + j11;
        if (j12 > qcVar.f19023a.length || j12 < j11) {
            throw new uc();
        }
        try {
            int i19 = (int) j12;
            qc qcVarK = ((kc) this.f21150c).k(qcVar, i18, i19);
            this.f21148a = i19;
            return qcVarK;
        } catch (IndexOutOfBoundsException e10) {
            throw new AssertionError(pc.a("CEiv6BFfPnitUE+D"), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.ag0, com.google.android.gms.internal.ads.li0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo161zza(Object obj) {
        ((v32) obj).c(0, (r32) ((iw0) this.f21149b).f15864b, (j32) this.f21150c, (o32) this.f21151d, this.f21148a);
    }

    public /* synthetic */ vc(iw0 iw0Var, j32 j32Var, o32 o32Var, int i10) {
        this.f21149b = iw0Var;
        this.f21150c = j32Var;
        this.f21151d = o32Var;
        this.f21148a = i10;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public vc(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        int i10;
        tq1 tq1Var = new tq1(this, 0);
        this.f21149b = tq1Var;
        if (jc1.e(2)) {
            this.f21150c = str;
            this.f21151d = secretKeySpec;
            if (secretKeySpec.getEncoded().length >= 16) {
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            i10 = 20;
                            this.f21148a = i10;
                            tq1Var.get();
                            return;
                        }
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            i10 = 28;
                            this.f21148a = i10;
                            tq1Var.get();
                            return;
                        }
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            i10 = 32;
                            this.f21148a = i10;
                            tq1Var.get();
                            return;
                        }
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            i10 = 48;
                            this.f21148a = i10;
                            tq1Var.get();
                            return;
                        }
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            i10 = 64;
                            this.f21148a = i10;
                            tq1Var.get();
                            return;
                        }
                        break;
                }
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
