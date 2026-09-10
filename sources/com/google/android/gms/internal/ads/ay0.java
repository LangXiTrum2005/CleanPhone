package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.ads.AdFormat;
import java.io.EOFException;
import java.io.Serializable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.ECPoint;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ay0 implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f12538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12539d;

    public /* synthetic */ ay0(int i10, boolean z10) {
        this.f12536a = i10;
        this.f12537b = null;
        this.f12538c = null;
        this.f12539d = null;
    }

    public static void d(ay0 ay0Var, f81 f81Var) {
        ay0 ay0Var2 = (ay0) f81Var.f14317b;
        long[] jArr = (long[]) ay0Var.f12537b;
        long[] jArr2 = (long[]) ay0Var2.f12537b;
        long[] jArr3 = (long[]) f81Var.f14318c;
        ps1.S(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) ay0Var.f12538c;
        long[] jArr5 = (long[]) ay0Var2.f12538c;
        long[] jArr6 = (long[]) ay0Var2.f12539d;
        ps1.S(jArr4, jArr5, jArr6);
        ps1.S((long[]) ay0Var.f12539d, jArr6, jArr3);
    }

    @Override // com.google.android.gms.internal.ads.u
    public synchronized void a(t tVar) {
        ((by1) this.f12539d).f12928c.a(tVar);
        r(tVar);
    }

    @Override // com.google.android.gms.internal.ads.u
    public synchronized void b(c7 c7Var) {
        ((by1) this.f12539d).f12928c.b(c7Var);
        while (c7Var != null) {
            t tVar = (t) c7Var.f13072c;
            tVar.getClass();
            r(tVar);
            c7Var = (c7) c7Var.f13073d;
            if (c7Var == null || ((t) c7Var.f13072c) == null) {
                c7Var = null;
            }
        }
    }

    public void c(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
        this.f12537b = Integer.valueOf(i10);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    public void e(wk1 wk1Var, Uri uri, Map map, long j10, long j11, h42 h42Var) throws w42 {
        h2 h2Var = new h2(wk1Var, j10, j11);
        this.f12539d = h2Var;
        if (((m2) this.f12538c) != null) {
            return;
        }
        m2[] m2VarArrH = ((p2) this.f12537b).h(uri, map);
        int length = m2VarArrH.length;
        aa1 aa1Var = ca1.f13122b;
        rb0.p(length, "expectedSize");
        z91 z91Var = new z91(length);
        boolean z10 = true;
        if (length == 1) {
            this.f12538c = m2VarArrH[0];
        } else {
            for (m2 m2Var : m2VarArrH) {
                try {
                    if (m2Var.d(h2Var)) {
                        this.f12538c = m2Var;
                        h2Var.f15065f = 0;
                        break;
                    }
                    z91Var.b(m2Var.zzb());
                    boolean z11 = ((m2) this.f12538c) != null || h2Var.f15063d == j10;
                    ps1.c0(z11);
                    h2Var.f15065f = 0;
                } catch (EOFException unused) {
                    if (((m2) this.f12538c) != null || h2Var.f15063d == j10) {
                    }
                } catch (Throwable th2) {
                    if (((m2) this.f12538c) == null && h2Var.f15063d != j10) {
                        z10 = false;
                    }
                    ps1.c0(z10);
                    h2Var.f15065f = 0;
                    throw th2;
                }
                ps1.c0(z11);
                h2Var.f15065f = 0;
            }
            if (((m2) this.f12538c) == null) {
                Iterator it = v71.w(ca1.z(m2VarArrH), t51.f20193e).iterator();
                StringBuilder sb2 = new StringBuilder();
                v71.z(sb2, it, ", ");
                String string = sb2.toString();
                throw new w42(q4.a.j(new StringBuilder(string.length() + 58), "None of the available extractors (", string, ") could read the stream."), z91Var.f());
            }
        }
        ((m2) this.f12538c).g(h42Var);
    }

    public void f(int i10) throws GeneralSecurityException {
        if (i10 < 10 || i10 > 16) {
            throw new GeneralSecurityException(l1.d.k(new StringBuilder(String.valueOf(i10).length() + 40), "Invalid tag size for AesCmacParameters: ", i10));
        }
        this.f12538c = Integer.valueOf(i10);
    }

    public byte[] g() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = (long[]) this.f12539d;
        ps1.W(jArr4, jArr14);
        ps1.W(jArr13, jArr4);
        ps1.W(jArr12, jArr13);
        ps1.S(jArr5, jArr12, jArr14);
        ps1.S(jArr6, jArr5, jArr4);
        ps1.W(jArr12, jArr6);
        ps1.S(jArr7, jArr12, jArr5);
        ps1.W(jArr12, jArr7);
        ps1.W(jArr13, jArr12);
        ps1.W(jArr12, jArr13);
        ps1.W(jArr13, jArr12);
        ps1.W(jArr12, jArr13);
        ps1.S(jArr8, jArr12, jArr7);
        ps1.W(jArr12, jArr8);
        ps1.W(jArr13, jArr12);
        for (int i10 = 2; i10 < 10; i10 += 2) {
            ps1.W(jArr12, jArr13);
            ps1.W(jArr13, jArr12);
        }
        ps1.S(jArr9, jArr13, jArr8);
        ps1.W(jArr12, jArr9);
        ps1.W(jArr13, jArr12);
        for (int i11 = 2; i11 < 20; i11 += 2) {
            ps1.W(jArr12, jArr13);
            ps1.W(jArr13, jArr12);
        }
        ps1.S(jArr12, jArr13, jArr9);
        ps1.W(jArr13, jArr12);
        ps1.W(jArr12, jArr13);
        for (int i12 = 2; i12 < 10; i12 += 2) {
            ps1.W(jArr13, jArr12);
            ps1.W(jArr12, jArr13);
        }
        ps1.S(jArr10, jArr12, jArr8);
        ps1.W(jArr12, jArr10);
        ps1.W(jArr13, jArr12);
        for (int i13 = 2; i13 < 50; i13 += 2) {
            ps1.W(jArr12, jArr13);
            ps1.W(jArr13, jArr12);
        }
        ps1.S(jArr11, jArr13, jArr10);
        ps1.W(jArr13, jArr11);
        ps1.W(jArr12, jArr13);
        for (int i14 = 2; i14 < 100; i14 += 2) {
            ps1.W(jArr13, jArr12);
            ps1.W(jArr12, jArr13);
        }
        ps1.S(jArr13, jArr12, jArr11);
        ps1.W(jArr12, jArr13);
        ps1.W(jArr13, jArr12);
        for (int i15 = 2; i15 < 50; i15 += 2) {
            ps1.W(jArr12, jArr13);
            ps1.W(jArr13, jArr12);
        }
        ps1.S(jArr12, jArr13, jArr10);
        ps1.W(jArr13, jArr12);
        ps1.W(jArr12, jArr13);
        ps1.W(jArr13, jArr12);
        ps1.W(jArr12, jArr13);
        ps1.W(jArr13, jArr12);
        ps1.S(jArr, jArr13, jArr6);
        ps1.S(jArr2, (long[]) this.f12537b, jArr);
        ps1.S(jArr3, (long[]) this.f12538c, jArr);
        byte[] bArrB0 = ps1.b0(jArr3);
        bArrB0[31] = (byte) (bArrB0[31] ^ ((ps1.b0(jArr2)[0] & 1) << 7));
        return bArrB0;
    }

    public long h() {
        h2 h2Var = (h2) this.f12539d;
        if (h2Var != null) {
            return h2Var.f15063d;
        }
        return -1L;
    }

    public vf1 i() throws GeneralSecurityException {
        uo0 uo0Var;
        zq1 zq1VarB;
        yf1 yf1Var = (yf1) this.f12537b;
        if (yf1Var == null || (uo0Var = (uo0) this.f12538c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (yf1Var.f22228a != ((zq1) uo0Var.f20839b).f22697a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (yf1Var.a() && ((Integer) this.f12539d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((yf1) this.f12537b).a() && ((Integer) this.f12539d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        xf1 xf1Var = ((yf1) this.f12537b).f22230c;
        if (xf1Var == xf1.f21854e) {
            zq1VarB = wi1.f21526a;
        } else if (xf1Var == xf1.f21853d) {
            zq1VarB = wi1.a(((Integer) this.f12539d).intValue());
        } else {
            if (xf1Var != xf1.f21852c) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(((yf1) this.f12537b).f22230c)));
            }
            zq1VarB = wi1.b(((Integer) this.f12539d).intValue());
        }
        return new vf1((yf1) this.f12537b, (uo0) this.f12538c, zq1VarB, (Integer) this.f12539d);
    }

    public zf1 j() throws GeneralSecurityException {
        uo0 uo0Var;
        zq1 zq1VarB;
        bg1 bg1Var = (bg1) this.f12537b;
        if (bg1Var == null || (uo0Var = (uo0) this.f12538c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (bg1Var.f12775a != ((zq1) uo0Var.f20839b).f22697a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (bg1Var.a() && ((Integer) this.f12539d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((bg1) this.f12537b).a() && ((Integer) this.f12539d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        af1 af1Var = ((bg1) this.f12537b).f12776b;
        if (af1Var == af1.f12015h) {
            zq1VarB = wi1.f21526a;
        } else if (af1Var == af1.f12014g) {
            zq1VarB = wi1.a(((Integer) this.f12539d).intValue());
        } else {
            if (af1Var != af1.f12013f) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(((bg1) this.f12537b).f12776b)));
            }
            zq1VarB = wi1.b(((Integer) this.f12539d).intValue());
        }
        return new zf1((bg1) this.f12537b, (uo0) this.f12538c, zq1VarB, (Integer) this.f12539d);
    }

    public cg1 k() throws GeneralSecurityException {
        uo0 uo0Var;
        zq1 zq1VarB;
        eg1 eg1Var = (eg1) this.f12537b;
        if (eg1Var == null || (uo0Var = (uo0) this.f12538c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (eg1Var.f13966a != ((zq1) uo0Var.f20839b).f22697a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (eg1Var.a() && ((Integer) this.f12539d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((eg1) this.f12537b).a() && ((Integer) this.f12539d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        sf1 sf1Var = ((eg1) this.f12537b).f13967b;
        if (sf1Var == sf1.f19960j) {
            zq1VarB = wi1.f21526a;
        } else if (sf1Var == sf1.f19959i) {
            zq1VarB = wi1.a(((Integer) this.f12539d).intValue());
        } else {
            if (sf1Var != sf1.f19958h) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(((eg1) this.f12537b).f13967b)));
            }
            zq1VarB = wi1.b(((Integer) this.f12539d).intValue());
        }
        return new cg1((eg1) this.f12537b, (uo0) this.f12538c, zq1VarB, (Integer) this.f12539d);
    }

    public sj1 l() throws GeneralSecurityException {
        uo0 uo0Var;
        zq1 zq1VarA;
        vj1 vj1Var = (vj1) this.f12537b;
        if (vj1Var == null || (uo0Var = (uo0) this.f12538c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (vj1Var.f21189a != ((zq1) uo0Var.f20839b).f22697a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (vj1Var.a() && ((Integer) this.f12539d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((vj1) this.f12537b).a() && ((Integer) this.f12539d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        af1 af1Var = ((vj1) this.f12537b).f21191c;
        if (af1Var == af1.f12024r) {
            zq1VarA = wi1.f21526a;
        } else if (af1Var == af1.f12023q || af1Var == af1.f12022p) {
            zq1VarA = wi1.a(((Integer) this.f12539d).intValue());
        } else {
            if (af1Var != af1.f12021o) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(((vj1) this.f12537b).f21191c)));
            }
            zq1VarA = wi1.b(((Integer) this.f12539d).intValue());
        }
        return new sj1((vj1) this.f12537b, (uo0) this.f12538c, zq1VarA, (Integer) this.f12539d);
    }

    public vj1 m() throws GeneralSecurityException {
        Integer num = (Integer) this.f12537b;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f12538c) != null) {
            return new vj1(num.intValue(), ((Integer) this.f12538c).intValue(), (af1) this.f12539d);
        }
        throw new GeneralSecurityException("tag size not set");
    }

    public xj1 n() throws GeneralSecurityException {
        uo0 uo0Var;
        zq1 zq1VarA;
        bk1 bk1Var = (bk1) this.f12537b;
        if (bk1Var == null || (uo0Var = (uo0) this.f12538c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (bk1Var.f12814a != ((zq1) uo0Var.f20839b).f22697a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (bk1Var.a() && ((Integer) this.f12539d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((bk1) this.f12537b).a() && ((Integer) this.f12539d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ak1 ak1Var = ((bk1) this.f12537b).f12816c;
        if (ak1Var == ak1.f12056e) {
            zq1VarA = wi1.f21526a;
        } else if (ak1Var == ak1.f12055d || ak1Var == ak1.f12054c) {
            zq1VarA = wi1.a(((Integer) this.f12539d).intValue());
        } else {
            if (ak1Var != ak1.f12053b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(((bk1) this.f12537b).f12816c)));
            }
            zq1VarA = wi1.b(((Integer) this.f12539d).intValue());
        }
        return new xj1((bk1) this.f12537b, (uo0) this.f12538c, zq1VarA, (Integer) this.f12539d);
    }

    public to1 o() throws GeneralSecurityException {
        zq1 zq1VarA;
        ro1 ro1Var = (ro1) this.f12537b;
        if (ro1Var == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ECPoint eCPoint = (ECPoint) this.f12538c;
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        zh1.a(eCPoint, ro1Var.f19631b.f19152b.getCurve());
        if (((ro1) this.f12537b).a() && ((Integer) this.f12539d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((ro1) this.f12537b).a() && ((Integer) this.f12539d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        xf1 xf1Var = ((ro1) this.f12537b).f19633d;
        if (xf1Var == xf1.f21862n) {
            zq1VarA = wi1.f21526a;
        } else if (xf1Var == xf1.f21861m || xf1Var == xf1.l) {
            zq1VarA = wi1.a(((Integer) this.f12539d).intValue());
        } else {
            if (xf1Var != xf1.f21860k) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(((ro1) this.f12537b).f19633d.f21864b));
            }
            zq1VarA = wi1.b(((Integer) this.f12539d).intValue());
        }
        return new to1((ro1) this.f12537b, (ECPoint) this.f12538c, zq1VarA, (Integer) this.f12539d);
    }

    public ip1 p() throws GeneralSecurityException {
        zq1 zq1VarA;
        if (((gp1) this.f12537b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.f12538c;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        gp1 gp1Var = (gp1) this.f12537b;
        int i10 = gp1Var.f14926a;
        if (iBitLength != i10) {
            throw new GeneralSecurityException(l1.d.j(new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(i10).length()), iBitLength, "Got modulus size ", i10, ", but parameters requires modulus size "));
        }
        if (gp1Var.a() && ((Integer) this.f12539d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((gp1) this.f12537b).a() && ((Integer) this.f12539d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        fp1 fp1Var = ((gp1) this.f12537b).f14928c;
        if (fp1Var == fp1.f14504e) {
            zq1VarA = wi1.f21526a;
        } else if (fp1Var == fp1.f14503d || fp1Var == fp1.f14502c) {
            zq1VarA = wi1.a(((Integer) this.f12539d).intValue());
        } else {
            if (fp1Var != fp1.f14501b) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(((gp1) this.f12537b).f14928c)));
            }
            zq1VarA = wi1.b(((Integer) this.f12539d).intValue());
        }
        return new ip1((gp1) this.f12537b, (BigInteger) this.f12538c, zq1VarA, (Integer) this.f12539d);
    }

    public pp1 q() throws GeneralSecurityException {
        zq1 zq1VarA;
        if (((np1) this.f12537b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.f12538c;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        np1 np1Var = (np1) this.f12537b;
        int i10 = np1Var.f17884a;
        if (iBitLength != i10) {
            throw new GeneralSecurityException(l1.d.j(new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(i10).length()), iBitLength, "Got modulus size ", i10, ", but parameters requires modulus size "));
        }
        if (np1Var.a() && ((Integer) this.f12539d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((np1) this.f12537b).a() && ((Integer) this.f12539d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        mp1 mp1Var = ((np1) this.f12537b).f17886c;
        if (mp1Var == mp1.f17511e) {
            zq1VarA = wi1.f21526a;
        } else if (mp1Var == mp1.f17510d || mp1Var == mp1.f17509c) {
            zq1VarA = wi1.a(((Integer) this.f12539d).intValue());
        } else {
            if (mp1Var != mp1.f17508b) {
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(((np1) this.f12537b).f17886c)));
            }
            zq1VarA = wi1.b(((Integer) this.f12539d).intValue());
        }
        return new pp1((np1) this.f12537b, (BigInteger) this.f12538c, zq1VarA, (Integer) this.f12539d);
    }

    public void r(t tVar) {
        j02 j02Var = (j02) ((HashMap) this.f12537b).remove(tVar);
        j02Var.getClass();
        ay1 ay1Var = (ay1) ((by1) this.f12539d).f12938n.get(j02Var);
        if (ay1Var != null) {
            synchronized (ay1Var) {
                ay1Var.f12543d--;
            }
        }
    }

    public String toString() {
        switch (this.f12536a) {
            case 2:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f12537b);
                sb2.append('{');
                f81 f81Var = (f81) ((f81) this.f12538c).f14318c;
                String str = "";
                while (f81Var != null) {
                    Object obj = f81Var.f14317b;
                    sb2.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    f81Var = (f81) f81Var.f14318c;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.u
    public synchronized t zza() {
        t tVarZza;
        by1 by1Var = (by1) this.f12539d;
        androidx.datastore.preferences.protobuf.n nVar = by1Var.f12928c;
        HashMap map = (HashMap) this.f12537b;
        tVarZza = nVar.zza();
        j02 j02Var = (j02) this.f12538c;
        map.put(tVarZza, j02Var);
        ay1 ay1Var = (ay1) by1Var.f12938n.get(j02Var);
        if (ay1Var != null) {
            synchronized (ay1Var) {
                ay1Var.f12543d++;
            }
        }
        return tVarZza;
    }

    @Override // com.google.android.gms.internal.ads.u
    public synchronized void zzd() {
        ((by1) this.f12539d).f12928c.zzd();
    }

    public ay0(p2 p2Var) {
        this.f12536a = 18;
        this.f12537b = p2Var;
    }

    public /* synthetic */ ay0(Serializable serializable, Serializable serializable2, Object obj, int i10) {
        this.f12536a = i10;
        this.f12537b = serializable;
        this.f12538c = serializable2;
        this.f12539d = obj;
    }

    public ay0(String str, AdFormat adFormat) {
        this.f12536a = 0;
        this.f12537b = str;
        this.f12539d = adFormat;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Serializable, long[]] */
    public ay0(int i10) {
        this(new long[10], new long[10], new long[10], 6);
        this.f12536a = i10;
        switch (i10) {
            case 6:
                break;
            case 7:
            default:
                this.f12538c = new ArrayDeque();
                this.f12539d = null;
                this.f12537b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                break;
            case 8:
                this.f12537b = null;
                this.f12538c = null;
                this.f12539d = af1.f12024r;
                break;
        }
    }

    public ay0(Context context) {
        this.f12536a = 16;
        this.f12537b = context != null ? context.getApplicationContext() : null;
        if (context == null) {
            this.f12538c = l02.f16620f;
        }
    }

    public ay0(by1 by1Var, j02 j02Var) {
        this.f12536a = 14;
        this.f12539d = by1Var;
        this.f12537b = new HashMap();
        this.f12538c = j02Var;
    }

    public /* synthetic */ ay0(j12 j12Var) {
        this.f12536a = 15;
        this.f12539d = j12Var;
        Handler handlerO = uu0.o();
        this.f12537b = handlerO;
        h12 h12Var = new h12(this, 0);
        this.f12538c = h12Var;
        j12Var.f15917a.registerStreamEventCallback(new i0(handlerO, 2), h12Var);
    }

    public ay0(x40[] x40VarArr) {
        this.f12536a = 17;
        x12 x12Var = new x12();
        x12Var.f21707m = 0;
        x12Var.f21709o = 0;
        x12Var.f21710p = 0;
        byte[] bArr = uu0.f20902b;
        x12Var.f21708n = bArr;
        x12Var.f21711q = bArr;
        i70 i70Var = new i70();
        i70Var.f15632c = 1.0f;
        i70Var.f15633d = 1.0f;
        z20 z20Var = z20.f22471e;
        i70Var.f15634e = z20Var;
        i70Var.f15635f = z20Var;
        i70Var.f15636g = z20Var;
        i70Var.f15637h = z20Var;
        ByteBuffer byteBuffer = x40.f21739a;
        i70Var.f15640k = byteBuffer;
        i70Var.l = byteBuffer;
        i70Var.f15631b = -1;
        x40[] x40VarArr2 = {x12Var, i70Var};
        this.f12537b = x40VarArr2;
        System.arraycopy(x40VarArr, 0, x40VarArr2, 0, 0);
        this.f12538c = x12Var;
        this.f12539d = i70Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ay0(f81 f81Var) {
        this(6);
        this.f12536a = 6;
        d(this, f81Var);
    }

    public ay0(String str) {
        this.f12536a = 2;
        f81 f81Var = new f81(0, false);
        this.f12538c = f81Var;
        this.f12539d = f81Var;
        this.f12537b = str;
    }

    public ay0(ay0 ay0Var) {
        this.f12536a = 6;
        this.f12537b = Arrays.copyOf((long[]) ay0Var.f12537b, 10);
        this.f12538c = Arrays.copyOf((long[]) ay0Var.f12538c, 10);
        this.f12539d = Arrays.copyOf((long[]) ay0Var.f12539d, 10);
    }
}
