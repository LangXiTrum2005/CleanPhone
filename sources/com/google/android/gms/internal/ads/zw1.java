package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zw1 implements ok1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f22739c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22741b;

    public zw1(String str, int i10) {
        this.f22740a = i10;
        switch (i10) {
            case 1:
                this.f22741b = Logger.getLogger(str);
                break;
            default:
                this.f22741b = str;
                break;
        }
    }

    public static int A(int i10, byte[] bArr, int i11, int i12, at1 at1Var, ur1 ur1Var) {
        ts1 ts1Var = (ts1) at1Var;
        int iC = c(bArr, i11, ur1Var);
        ts1Var.n(ur1Var.f20874a);
        while (iC < i12) {
            int iC2 = c(bArr, iC, ur1Var);
            if (i10 != ur1Var.f20874a) {
                break;
            }
            iC = c(bArr, iC2, ur1Var);
            ts1Var.n(ur1Var.f20874a);
        }
        return iC;
    }

    public static int B(byte[] bArr, int i10, at1 at1Var, ur1 ur1Var) throws et1 {
        ts1 ts1Var = (ts1) at1Var;
        int iC = c(bArr, i10, ur1Var);
        int i11 = ur1Var.f20874a + iC;
        while (iC < i11) {
            iC = c(bArr, iC, ur1Var);
            ts1Var.n(ur1Var.f20874a);
        }
        if (iC == i11) {
            return iC;
        }
        throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int C(bu1 bu1Var, int i10, byte[] bArr, int i11, int i12, at1 at1Var, ur1 ur1Var) throws et1 {
        ss1 ss1VarZza = bu1Var.zza();
        bu1 bu1Var2 = bu1Var;
        byte[] bArr2 = bArr;
        int i13 = i12;
        ur1 ur1Var2 = ur1Var;
        int iW = w(ss1VarZza, bu1Var2, bArr2, i11, i13, ur1Var2);
        bu1Var2.a(ss1VarZza);
        ur1Var2.f20876c = ss1VarZza;
        at1Var.add(ss1VarZza);
        while (iW < i13) {
            ur1 ur1Var3 = ur1Var2;
            int i14 = i13;
            int iC = c(bArr2, iW, ur1Var3);
            if (i10 != ur1Var3.f20874a) {
                break;
            }
            byte[] bArr3 = bArr2;
            bu1 bu1Var3 = bu1Var2;
            ss1 ss1VarZza2 = bu1Var3.zza();
            iW = w(ss1VarZza2, bu1Var3, bArr3, iC, i14, ur1Var3);
            bu1Var2 = bu1Var3;
            bArr2 = bArr3;
            i13 = i14;
            ur1Var2 = ur1Var3;
            bu1Var2.a(ss1VarZza2);
            ur1Var2.f20876c = ss1VarZza2;
            at1Var.add(ss1VarZza2);
        }
        return iW;
    }

    public static int D(int i10, byte[] bArr, int i11, int i12, iu1 iu1Var, ur1 ur1Var) throws et1 {
        if ((i10 >>> 3) == 0) {
            throw new et1("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iK = k(bArr, i11, ur1Var);
            iu1Var.d(i10, Long.valueOf(ur1Var.f20875b));
            return iK;
        }
        if (i13 == 1) {
            iu1Var.d(i10, Long.valueOf(p(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iC = c(bArr, i11, ur1Var);
            int i14 = ur1Var.f20874a;
            if (i14 < 0) {
                throw new et1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iC) {
                throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                iu1Var.d(i10, cs1.f13248b);
            } else {
                iu1Var.d(i10, cs1.D(bArr, iC, i14));
            }
            return iC + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new et1("Protocol message contained an invalid tag (zero).");
            }
            iu1Var.d(i10, Integer.valueOf(n(i11, bArr)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        iu1 iu1VarA = iu1.a();
        int i16 = ur1Var.f20877d + 1;
        ur1Var.f20877d = i16;
        F(i16);
        int i17 = 0;
        while (i11 < i12) {
            int iC2 = c(bArr, i11, ur1Var);
            int i18 = ur1Var.f20874a;
            if (i18 == i15) {
                i17 = i18;
                i11 = iC2;
                break;
            }
            i11 = D(i18, bArr, iC2, i12, iu1VarA, ur1Var);
            i17 = i18;
        }
        ur1Var.f20877d--;
        if (i11 > i12 || i17 != i15) {
            throw new et1("Failed to parse the message.");
        }
        iu1Var.d(i10, iu1VarA);
        return i11;
    }

    public static int E(int i10, byte[] bArr, int i11, int i12, ur1 ur1Var) throws et1 {
        if ((i10 >>> 3) == 0) {
            throw new et1("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return k(bArr, i11, ur1Var);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return c(bArr, i11, ur1Var) + ur1Var.f20874a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new et1("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = ur1Var.f20877d + 1;
        ur1Var.f20877d = i15;
        F(i15);
        int i16 = 0;
        while (i11 < i12) {
            i11 = c(bArr, i11, ur1Var);
            i16 = ur1Var.f20874a;
            if (i16 == i14) {
                break;
            }
            i11 = E(i16, bArr, i11, i12, ur1Var);
        }
        ur1Var.f20877d--;
        if (i11 > i12 || i16 != i14) {
            throw new et1("Failed to parse the message.");
        }
        return i11;
    }

    public static void F(int i10) throws et1 {
        if (i10 >= 100) {
            throw new et1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public static Object G(Future future) {
        if (future.isDone()) {
            return ic1.b(future);
        }
        throw new IllegalStateException(dv.B("Future was expected to be done: %s", future));
    }

    public static Object H(m00 m00Var) {
        try {
            return ic1.b(m00Var);
        } catch (ExecutionException e10) {
            if (e10.getCause() instanceof Error) {
                throw new cn.c0((Error) e10.getCause());
            }
            throw new aa.b(e10.getCause(), 6);
        }
    }

    public static int b(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i10 >>>= 1;
            i11++;
        }
        return i11;
    }

    public static int c(byte[] bArr, int i10, ur1 ur1Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return g(b10, bArr, i11, ur1Var);
        }
        ur1Var.f20874a = b10;
        return i11;
    }

    public static be1 d(Object obj) {
        return obj == null ? be1.f12743b : new be1(obj);
    }

    public static void f(long[] jArr, long[] jArr2, int i10) {
        for (int i11 = 0; i11 < 10; i11++) {
            int i12 = (int) jArr[i11];
            jArr[i11] = ((-i10) & (((int) jArr2[i11]) ^ i12)) ^ i12;
        }
    }

    public static int g(int i10, byte[] bArr, int i11, ur1 ur1Var) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            ur1Var.f20874a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            ur1Var.f20874a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            ur1Var.f20874a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            ur1Var.f20874a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                ur1Var.f20874a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static z61 h(np0 np0Var, boolean z10, boolean z11) throws ab {
        if (z10) {
            m(3, np0Var, false);
        }
        np0Var.k((int) np0Var.a(), StandardCharsets.UTF_8);
        long jA = np0Var.a();
        String[] strArr = new String[(int) jA];
        for (int i10 = 0; i10 < jA; i10++) {
            strArr[i10] = np0Var.k((int) np0Var.a(), StandardCharsets.UTF_8);
        }
        if (z11 && (np0Var.K() & 1) == 0) {
            throw ab.a(null, "framing bit expected to be set");
        }
        return new z61(strArr);
    }

    public static ok1 i(mk1 mk1Var) {
        uo0 uo0Var = mk1Var.f17469c;
        pk1 pk1Var = new pk1(((zq1) uo0Var.f20839b).b());
        try {
            Provider providerD = v71.d();
            if (providerD == null) {
                throw new GeneralSecurityException("Conscrypt not available");
            }
            Mac.getInstance("AESCMAC", providerD);
            return new f81(5, pk1Var, new f81(((zq1) uo0Var.f20839b).b(), providerD));
        } catch (GeneralSecurityException unused) {
            return pk1Var;
        }
    }

    public static zw1 j(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zw1(cls.getSimpleName(), 0) : new zw1(cls.getSimpleName(), 1);
    }

    public static int k(byte[] bArr, int i10, ur1 ur1Var) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            ur1Var.f20875b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        ur1Var.f20875b = j11;
        return i12;
    }

    public static ae1 l(Throwable th2) {
        th2.getClass();
        ae1 ae1Var = new ae1();
        ae1Var.d(th2);
        return ae1Var;
    }

    public static boolean m(int i10, np0 np0Var, boolean z10) throws ab {
        if (np0Var.B() < 7) {
            if (z10) {
                return false;
            }
            int iB = np0Var.B();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iB).length() + 18);
            sb2.append("too short header: ");
            sb2.append(iB);
            throw ab.a(null, sb2.toString());
        }
        if (np0Var.K() != i10) {
            if (z10) {
                return false;
            }
            throw ab.a(null, "expected header type ".concat(String.valueOf(Integer.toHexString(i10))));
        }
        if (np0Var.K() == 118 && np0Var.K() == 111 && np0Var.K() == 114 && np0Var.K() == 98 && np0Var.K() == 105 && np0Var.K() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw ab.a(null, "expected characters 'vorbis'");
    }

    public static int n(int i10, byte[] bArr) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static pe1 o(Executor executor, Callable callable) {
        pe1 pe1Var = new pe1(callable);
        executor.execute(pe1Var);
        return pe1Var;
    }

    public static long p(int i10, byte[] bArr) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    public static int q(byte[] bArr, int i10, ur1 ur1Var) throws et1 {
        int iC = c(bArr, i10, ur1Var);
        int i11 = ur1Var.f20874a;
        if (i11 < 0) {
            throw new et1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            ur1Var.f20876c = "";
            return iC;
        }
        ur1Var.f20876c = pu1.d(bArr, iC, i11);
        return iC + i11;
    }

    public static pe1 r(nd1 nd1Var, Executor executor) {
        pe1 pe1Var = new pe1();
        pe1Var.f18595h = new oe1(pe1Var, nd1Var);
        executor.execute(pe1Var);
        return pe1Var;
    }

    public static int s(byte[] bArr, int i10, ur1 ur1Var) throws et1 {
        int iC = c(bArr, i10, ur1Var);
        int i11 = ur1Var.f20874a;
        if (i11 < 0) {
            throw new et1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iC) {
            throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            ur1Var.f20876c = cs1.f13248b;
            return iC;
        }
        ur1Var.f20876c = cs1.D(bArr, iC, i11);
        return iC + i11;
    }

    public static lc1 t(ListenableFuture listenableFuture, Class cls, d81 d81Var, Executor executor) {
        int i10 = mc1.f17394k;
        lc1 lc1Var = new lc1(listenableFuture, cls, d81Var);
        listenableFuture.addListener(lc1Var, gc1.j(executor, lc1Var));
        return lc1Var;
    }

    public static kc1 u(ListenableFuture listenableFuture, Class cls, od1 od1Var, Executor executor) {
        int i10 = mc1.f17394k;
        kc1 kc1Var = new kc1(listenableFuture, cls, od1Var);
        listenableFuture.addListener(kc1Var, gc1.j(executor, kc1Var));
        return kc1Var;
    }

    public static ListenableFuture v(ListenableFuture listenableFuture, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        ne1 ne1Var = new ne1();
        ne1Var.f17788h = listenableFuture;
        ry0 ry0Var = new ry0();
        ry0Var.f19706b = ne1Var;
        ne1Var.f17789i = scheduledExecutorService.schedule(ry0Var, j10, timeUnit);
        listenableFuture.addListener(ry0Var, td1.f20333a);
        return ne1Var;
    }

    public static int w(Object obj, bu1 bu1Var, byte[] bArr, int i10, int i11, ur1 ur1Var) throws et1 {
        int iG = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iG = g(i12, bArr, iG, ur1Var);
            i12 = ur1Var.f20874a;
        }
        int i13 = iG;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = ur1Var.f20877d + 1;
        ur1Var.f20877d = i14;
        F(i14);
        int i15 = i13 + i12;
        bu1Var.h(obj, bArr, i13, i15, ur1Var);
        ur1Var.f20877d--;
        ur1Var.f20876c = obj;
        return i15;
    }

    public static fd1 x(ListenableFuture listenableFuture, od1 od1Var, Executor executor) {
        int i10 = hd1.f15263j;
        fd1 fd1Var = new fd1(listenableFuture, od1Var);
        listenableFuture.addListener(fd1Var, gc1.j(executor, fd1Var));
        return fd1Var;
    }

    public static int y(Object obj, bu1 bu1Var, byte[] bArr, int i10, int i11, int i12, ur1 ur1Var) throws et1 {
        int i13 = ur1Var.f20877d + 1;
        ur1Var.f20877d = i13;
        F(i13);
        int iX = ((qt1) bu1Var).x(obj, bArr, i10, i11, i12, ur1Var);
        ur1Var.f20877d--;
        ur1Var.f20876c = obj;
        return iX;
    }

    public static gd1 z(ListenableFuture listenableFuture, d81 d81Var, Executor executor) {
        int i10 = hd1.f15263j;
        gd1 gd1Var = new gd1(listenableFuture, d81Var);
        listenableFuture.addListener(gd1Var, gc1.j(executor, gd1Var));
        return gd1Var;
    }

    public final void e(String str) {
        switch (this.f22740a) {
            case 0:
                String str2 = (String) this.f22741b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
                sb2.append(str2);
                sb2.append(":");
                sb2.append(str);
                Log.d("isoparser", sb2.toString());
                break;
            default:
                ((Logger) this.f22741b).logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
                break;
        }
    }
}
