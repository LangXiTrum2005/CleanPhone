package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.internal.ads.ur1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile na.h f23733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f23734b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Thread f23735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Handler f23736d;

    public static int a(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 != 3) {
            return i10 != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int b(byte[] bArr, int i10, ur1 ur1Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return f(b10, bArr, i11, ur1Var);
        }
        ur1Var.f20874a = b10;
        return i11;
    }

    public static File c(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        throw new IllegalStateException("getFilesDir returned null twice.");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:75:0x0177, B:15:0x0025, B:17:0x002d, B:21:0x003a, B:23:0x0040, B:25:0x0048, B:74:0x0173, B:76:0x017a, B:77:0x017d, B:78:0x017e, B:26:0x004c, B:28:0x0050, B:29:0x005d, B:31:0x0063, B:37:0x0079, B:39:0x007f, B:40:0x008b, B:61:0x0157, B:62:0x015a, B:70:0x016a, B:69:0x0167, B:71:0x016b, B:72:0x0170, B:73:0x0171, B:32:0x0069, B:36:0x0070), top: B:83:0x0007, inners: #4 }] */
    public static na.h d(Context context) {
        na.h hVar;
        na.h pVar;
        na.h pVar2;
        char c4;
        na.h hVar2 = f23733a;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (mb.class) {
            try {
                hVar = f23733a;
                if (hVar == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    x.e eVar = nb.f23773a;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        hVar = na.a.f46626a;
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        Context contextCreateDeviceProtectedStorageContext = !context.isDeviceProtectedStorage() ? context.createDeviceProtectedStorageContext() : context;
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            char c5 = 0;
                            try {
                                File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                pVar = file.exists() ? new na.p(file) : na.a.f46626a;
                            } catch (RuntimeException e10) {
                                Log.e("HermeticFileOverrides", "no data dir", e10);
                                pVar = na.a.f46626a;
                            }
                            if (pVar.g()) {
                                File file2 = (File) pVar.d();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        x.i iVar = new x.i(0);
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                StringBuilder sb2 = new StringBuilder(line.length() + 9);
                                                sb2.append("Invalid: ");
                                                sb2.append(line);
                                                Log.e("HermeticFileOverrides", sb2.toString());
                                            } else {
                                                String str3 = new String(strArrSplit[c5]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                x.i iVar2 = (x.i) iVar.get(str3);
                                                if (iVar2 == null) {
                                                    c4 = 0;
                                                    iVar2 = new x.i(0);
                                                    iVar.put(str3, iVar2);
                                                } else {
                                                    c4 = 0;
                                                }
                                                iVar2.put(strDecode, strDecode2);
                                                c5 = c4;
                                            }
                                        }
                                        String string = file2.toString();
                                        String packageName = contextCreateDeviceProtectedStorageContext.getPackageName();
                                        StringBuilder sb3 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
                                        sb3.append("Parsed ");
                                        sb3.append(string);
                                        sb3.append(" for Android package ");
                                        sb3.append(packageName);
                                        Log.w("HermeticFileOverrides", sb3.toString());
                                        lb lbVar = new lb(iVar);
                                        bufferedReader.close();
                                        pVar2 = new na.p(lbVar);
                                    } catch (Throwable th2) {
                                        try {
                                            bufferedReader.close();
                                            throw th2;
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                            throw th2;
                                        }
                                    }
                                } catch (IOException e11) {
                                    throw new RuntimeException(e11);
                                }
                            } else {
                                pVar2 = na.a.f46626a;
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            hVar = pVar2;
                        } catch (Throwable th4) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th4;
                        }
                    } else {
                        hVar = na.a.f46626a;
                    }
                    f23733a = hVar;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return hVar;
    }

    public static boolean e(Thread thread) {
        if (f23735c == null) {
            f23735c = Looper.getMainLooper().getThread();
        }
        return thread == f23735c;
    }

    public static int f(int i10, byte[] bArr, int i11, ur1 ur1Var) {
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

    public static Handler g() {
        if (f23736d == null) {
            synchronized (f23734b) {
                try {
                    if (f23736d == null) {
                        f23736d = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f23736d;
    }

    public static void h(sg sgVar) {
        yf yfVar;
        if (l(sgVar) || (yfVar = ((yf) sgVar).f24177a) == null) {
            Trace.beginSection(((yf) sgVar).f24179c);
            n(sgVar);
        } else {
            h(yfVar);
            n(sgVar);
        }
    }

    public static int i(byte[] bArr, int i10, ur1 ur1Var) {
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

    public static void j(sg sgVar) {
        if (!l(sgVar)) {
            yf yfVar = (yf) sgVar;
            if (yfVar.f24177a != null) {
                Trace.endSection();
                j(yfVar.f24177a);
                return;
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public static int k(int i10, byte[] bArr) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static boolean l(sg sgVar) {
        return ((yf) sgVar).f24181e != Thread.currentThread();
    }

    public static long m(int i10, byte[] bArr) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    public static void n(sg sgVar) {
        String strSubstring = ((yf) sgVar).f24180d;
        AtomicReference atomicReference = dg.f23392a;
        if (strSubstring.length() > 127) {
            strSubstring = strSubstring.substring(0, 127);
        }
        Trace.beginSection(strSubstring);
    }

    public static int o(byte[] bArr, int i10, ur1 ur1Var) throws u1 {
        int iB = b(bArr, i10, ur1Var);
        int i11 = ur1Var.f20874a;
        if (i11 < 0) {
            throw new u1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            ur1Var.f20876c = "";
            return iB;
        }
        ur1Var.f20876c = b3.d(bArr, iB, i11);
        return iB + i11;
    }

    public static int p(byte[] bArr, int i10, ur1 ur1Var) throws u1 {
        int iB = b(bArr, i10, ur1Var);
        int i11 = ur1Var.f20874a;
        if (i11 < 0) {
            throw new u1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iB) {
            throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            ur1Var.f20876c = s0.f23949b;
            return iB;
        }
        ur1Var.f20876c = s0.s(bArr, iB, i11);
        return iB + i11;
    }

    public static int q(Object obj, o2 o2Var, byte[] bArr, int i10, int i11, ur1 ur1Var) throws u1 {
        int iF = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iF = f(i12, bArr, iF, ur1Var);
            i12 = ur1Var.f20874a;
        }
        int i13 = iF;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = ur1Var.f20877d + 1;
        ur1Var.f20877d = i14;
        if (i14 >= 100) {
            throw new u1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i15 = i13 + i12;
        o2Var.f(obj, bArr, i13, i15, ur1Var);
        ur1Var.f20877d--;
        ur1Var.f20876c = obj;
        return i15;
    }

    public static int r(Object obj, o2 o2Var, byte[] bArr, int i10, int i11, int i12, ur1 ur1Var) throws u1 {
        g2 g2Var = (g2) o2Var;
        int i13 = ur1Var.f20877d + 1;
        ur1Var.f20877d = i13;
        if (i13 >= 100) {
            throw new u1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iX = g2Var.x(obj, bArr, i10, i11, i12, ur1Var);
        ur1Var.f20877d--;
        ur1Var.f20876c = obj;
        return iX;
    }

    public static int s(int i10, byte[] bArr, int i11, int i12, s1 s1Var, ur1 ur1Var) {
        j1 j1Var = (j1) s1Var;
        int iB = b(bArr, i11, ur1Var);
        j1Var.n(ur1Var.f20874a);
        while (iB < i12) {
            int iB2 = b(bArr, iB, ur1Var);
            if (i10 != ur1Var.f20874a) {
                break;
            }
            iB = b(bArr, iB2, ur1Var);
            j1Var.n(ur1Var.f20874a);
        }
        return iB;
    }

    public static int t(byte[] bArr, int i10, s1 s1Var, ur1 ur1Var) throws u1 {
        j1 j1Var = (j1) s1Var;
        int iB = b(bArr, i10, ur1Var);
        int i11 = ur1Var.f20874a + iB;
        while (iB < i11) {
            iB = b(bArr, iB, ur1Var);
            j1Var.n(ur1Var.f20874a);
        }
        if (iB == i11) {
            return iB;
        }
        throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int u(o2 o2Var, int i10, byte[] bArr, int i11, int i12, s1 s1Var, ur1 ur1Var) throws u1 {
        i1 i1VarZza = o2Var.zza();
        o2 o2Var2 = o2Var;
        byte[] bArr2 = bArr;
        int i13 = i12;
        ur1 ur1Var2 = ur1Var;
        int iQ = q(i1VarZza, o2Var2, bArr2, i11, i13, ur1Var2);
        o2Var2.a(i1VarZza);
        ur1Var2.f20876c = i1VarZza;
        s1Var.add(i1VarZza);
        while (iQ < i13) {
            ur1 ur1Var3 = ur1Var2;
            int i14 = i13;
            int iB = b(bArr2, iQ, ur1Var3);
            if (i10 != ur1Var3.f20874a) {
                break;
            }
            byte[] bArr3 = bArr2;
            o2 o2Var3 = o2Var2;
            i1 i1VarZza2 = o2Var3.zza();
            iQ = q(i1VarZza2, o2Var3, bArr3, iB, i14, ur1Var3);
            o2Var2 = o2Var3;
            bArr2 = bArr3;
            i13 = i14;
            ur1Var2 = ur1Var3;
            o2Var2.a(i1VarZza2);
            ur1Var2.f20876c = i1VarZza2;
            s1Var.add(i1VarZza2);
        }
        return iQ;
    }

    public static int v(int i10, byte[] bArr, int i11, int i12, u2 u2Var, ur1 ur1Var) throws u1 {
        if ((i10 >>> 3) == 0) {
            throw new u1("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int i14 = i(bArr, i11, ur1Var);
            u2Var.d(i10, Long.valueOf(ur1Var.f20875b));
            return i14;
        }
        if (i13 == 1) {
            u2Var.d(i10, Long.valueOf(m(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iB = b(bArr, i11, ur1Var);
            int i15 = ur1Var.f20874a;
            if (i15 < 0) {
                throw new u1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i15 > bArr.length - iB) {
                throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i15 == 0) {
                u2Var.d(i10, s0.f23949b);
            } else {
                u2Var.d(i10, s0.s(bArr, iB, i15));
            }
            return iB + i15;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new u1("Protocol message contained an invalid tag (zero).");
            }
            u2Var.d(i10, Integer.valueOf(k(i11, bArr)));
            return i11 + 4;
        }
        int i16 = (i10 & (-8)) | 4;
        u2 u2VarA = u2.a();
        int i17 = ur1Var.f20877d + 1;
        ur1Var.f20877d = i17;
        if (i17 >= 100) {
            throw new u1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i18 = 0;
        while (i11 < i12) {
            int iB2 = b(bArr, i11, ur1Var);
            int i19 = ur1Var.f20874a;
            if (i19 == i16) {
                i18 = i19;
                i11 = iB2;
                break;
            }
            i11 = v(i19, bArr, iB2, i12, u2VarA, ur1Var);
            i18 = i19;
        }
        ur1Var.f20877d--;
        if (i11 > i12 || i18 != i16) {
            throw new u1("Failed to parse the message.");
        }
        u2Var.d(i10, u2VarA);
        return i11;
    }

    public static int w(int i10, byte[] bArr, int i11, int i12, ur1 ur1Var) throws u1 {
        if ((i10 >>> 3) == 0) {
            throw new u1("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return i(bArr, i11, ur1Var);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return b(bArr, i11, ur1Var) + ur1Var.f20874a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new u1("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = b(bArr, i11, ur1Var);
            i15 = ur1Var.f20874a;
            if (i15 == i14) {
                break;
            }
            i11 = w(i15, bArr, i11, i12, ur1Var);
        }
        if (i11 > i12 || i15 != i14) {
            throw new u1("Failed to parse the message.");
        }
        return i11;
    }
}
