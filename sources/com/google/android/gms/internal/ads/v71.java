package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.math.RoundingMode;
import java.net.UnknownHostException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Provider;
import java.security.Security;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v71 {
    public static final ei l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final qd0 f21091o;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f21098v = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f21078a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f21079b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f21080c = {64, InterfaceC0435l1.d.b.f29113j, 128, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, com.ironsource.mediationsdk.metadata.a.f29616n, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f21081d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f21082e = {5, 8, 10, 12};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f21083f = {6, 9, 12, 15};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f21084g = {2, 4, 6, 8};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f21085h = {9, 11, 13, 16};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f21086i = {5, 8, 10, 12};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final pb f21087j = new pb(4, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ei f21088k = new ei(6);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ei f21089m = new ei(29);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final qd0 f21090n = new qd0(9);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f21092p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final lr0 f21093q = new lr0(2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final lr0 f21094r = new lr0(8);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final lr0 f21095s = new lr0(14);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final lr0 f21096t = new lr0(19);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String[] f21097u = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    static {
        int i10 = 16;
        l = new ei(i10);
        f21091o = new qd0(i10);
    }

    public static ya1 A(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return ca1.u("");
        }
        aa1 aa1Var = ca1.f13122b;
        rb0.p(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int iO = O(bArr, i11, i10);
        int i12 = 0;
        while (i11 < iO) {
            String str = new String(bArr, i11, iO - i11, I(i10));
            int length = objArrCopyOf.length;
            int i13 = i12 + 1;
            int iD = x91.d(length, i13);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i12] = str;
            i11 = T(i10) + iO;
            iO = O(bArr, i11, i10);
            i12 = i13;
        }
        ya1 ya1VarA = ca1.A(i12, objArrCopyOf);
        return ya1VarA.isEmpty() ? ca1.u("") : ya1VarA;
    }

    public static void B(String str, String str2, Throwable th2) {
        synchronized (f21092p) {
            Log.w(str, M(str2, th2));
        }
    }

    public static int C(int i10, np0 np0Var) {
        byte[] bArr = np0Var.f17880a;
        int i11 = np0Var.f17881b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11 + i10) {
                return i10;
            }
            if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                i10--;
            }
            i12 = i13;
        }
    }

    public static void D(SQLiteDatabase sQLiteDatabase, long j10, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j10));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j10)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static void E(gp0 gp0Var) {
        gp0Var.f(3);
        gp0Var.f(8);
        boolean zG = gp0Var.g();
        boolean zG2 = gp0Var.g();
        if (zG) {
            gp0Var.f(5);
        }
        if (zG2) {
            gp0Var.f(6);
        }
    }

    public static void F(String str, String str2) {
        synchronized (f21092p) {
            Log.e(str, M(str2, null));
        }
    }

    public static int G(int i10) {
        if (i10 == 20) {
            return 63750;
        }
        if (i10 == 30) {
            return 2250000;
        }
        switch (i10) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return DefaultOggSeeker.MATCH_BYTE_RANGE;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i10) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static int H(gp0 gp0Var, int i10, int i11, int i12) {
        ps1.v(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        Math.addExact(Math.addExact(i13, i14), 1 << i12);
        if (gp0Var.b() >= i10) {
            int iH = gp0Var.h(i10);
            if (iH == i13) {
                if (gp0Var.b() >= i11) {
                    int iH2 = gp0Var.h(i11);
                    iH += iH2;
                    if (iH2 == i14) {
                        if (gp0Var.b() >= i12) {
                            return gp0Var.h(i12) + iH;
                        }
                    }
                }
            }
            return iH;
        }
        return -1;
    }

    public static Charset I(int i10) {
        if (i10 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i10 != 2) {
            return i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    public static void J(String str, String str2, Throwable th2) {
        synchronized (f21092p) {
            Log.e(str, M(str2, th2));
        }
    }

    public static Cursor K(SQLiteDatabase sQLiteDatabase, int i10) {
        String[] strArr = {X3.i.X};
        String[] strArr2 = new String[1];
        if (i10 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i10 == 1) {
            strArr2[0] = "total_requests";
        } else if (i10 != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    public static String L(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static String M(String str, Throwable th2) {
        String strReplace;
        if (th2 != null) {
            synchronized (f21092p) {
                Throwable cause = th2;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        String strReplace2 = strReplace.replace("\n", "\n  ");
        int length = String.valueOf(str).length();
        return d5.u.h(new StringBuilder(String.valueOf(strReplace2).length() + length + 3 + 1), str, "\n  ", strReplace2, "\n");
    }

    public static int N(gp0 gp0Var, int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && gp0Var.g(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return gp0Var.h(iArr[i10]) + i12;
    }

    public static int O(byte[] bArr, int i10, int i11) {
        int iQ = Q(i10, bArr);
        if (i11 == 0 || i11 == 3) {
            return iQ;
        }
        while (true) {
            int length = bArr.length;
            if (iQ >= length - 1) {
                return length;
            }
            int i12 = iQ + 1;
            if ((iQ - i10) % 2 == 0 && bArr[i12] == 0) {
                return iQ;
            }
            iQ = Q(i12, bArr);
        }
    }

    public static void P(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(X3.i.X, (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    public static int Q(int i10, byte[] bArr) {
        while (true) {
            int length = bArr.length;
            if (i10 >= length) {
                return length;
            }
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
    }

    public static gp0 R(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == 127 || b10 == 100 || b10 == 64 || b10 == 113) {
            return new gp0(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b11 = bArrCopyOf[0];
        if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b12 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b12;
            }
        }
        int length = bArrCopyOf.length;
        gp0 gp0Var = new gp0(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            gp0 gp0Var2 = new gp0(bArrCopyOf, length);
            while (gp0Var2.b() >= 16) {
                gp0Var2.f(2);
                int iH = gp0Var2.h(14);
                int iMin = Math.min(8 - gp0Var.f14923c, 14);
                int i12 = gp0Var.f14923c;
                int i13 = (8 - i12) - iMin;
                byte[] bArr2 = gp0Var.f14921a;
                int i14 = gp0Var.f14922b;
                byte b13 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr2[i14]);
                bArr2[i14] = b13;
                int i15 = 14 - iMin;
                int i16 = iH & 16383;
                bArr2[i14] = (byte) (b13 | ((i16 >>> i15) << i13));
                int i17 = i14 + 1;
                while (i15 > 8) {
                    i15 -= 8;
                    gp0Var.f14921a[i17] = (byte) (i16 >>> i15);
                    i17++;
                }
                int i18 = 8 - i15;
                byte[] bArr3 = gp0Var.f14921a;
                byte b14 = (byte) (bArr3[i17] & ((1 << i18) - 1));
                bArr3[i17] = b14;
                bArr3[i17] = (byte) (((i16 & ((1 << i15) - 1)) << i18) | b14);
                gp0Var.f(14);
                gp0Var.m();
            }
        }
        int length2 = bArrCopyOf.length;
        gp0Var.f14921a = bArrCopyOf;
        gp0Var.f14922b = 0;
        gp0Var.f14923c = 0;
        gp0Var.f14924d = length2;
        return gp0Var;
    }

    public static void S(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put(X3.i.X, (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static int T(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static String U(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    public static int a(int i10) {
        if (i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368) {
            return 1;
        }
        if (i10 == 1683496997 || i10 == 622876772) {
            return 2;
        }
        if (i10 == 1078008818 || i10 == -233094848) {
            return 3;
        }
        return (i10 == 1908687592 || i10 == -398277519) ? 4 : 0;
    }

    public static e21 b(Task task) {
        e21 e21Var = new e21();
        e21Var.f13809h = task;
        task.addOnCompleteListener(td1.f20333a, new uo0(e21Var, 8));
        return e21Var;
    }

    public static Object c(q81 q81Var) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return q81Var.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static Provider d() {
        for (int i10 = 0; i10 < 3; i10++) {
            Provider provider = Security.getProvider(f21097u[i10]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    public static ArrayList e(mb1 mb1Var) {
        ArrayList arrayList = new ArrayList();
        mb1Var.getClass();
        while (mb1Var.hasNext()) {
            arrayList.add(mb1Var.next());
        }
        return arrayList;
    }

    public static ArrayList f(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            try {
                byte b10 = byteBufferAsReadOnlyBuffer.get();
                int i10 = b10 >> 3;
                if (((b10 >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                if (((b10 >> 1) & 1) != 0) {
                    iRemaining = 0;
                    for (int i11 = 0; i11 < 8; i11++) {
                        byte b11 = byteBufferAsReadOnlyBuffer.get();
                        iRemaining |= (b11 & 127) << (i11 * 7);
                        if ((b11 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    iRemaining = byteBufferAsReadOnlyBuffer.remaining();
                }
                if (byteBufferAsReadOnlyBuffer.position() + iRemaining > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                int i12 = i10 & 15;
                ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
                arrayList.add(new n81(i12, byteBufferDuplicate));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static void g(int i10, String str, Throwable th2) {
        String strK = l1.d.k(new StringBuilder(String.valueOf(i10).length() + 20), "Ad failed to load : ", i10);
        int i11 = zze.zza;
        zzo.zzh(strK);
        zze.zzb(str, th2);
        if (i10 == 3) {
            return;
        }
        zzt.zzh().e(str, th2);
    }

    public static final void h(cn.a0 a0Var, uo0 coroutineSequence, jk.c cVar) {
        kotlin.jvm.internal.n.f(a0Var, "<this>");
        kotlin.jvm.internal.n.f(coroutineSequence, "coroutineSequence");
        cn.d0.g(a0Var, new u71(coroutineSequence, cVar, (ak.f) null), 1);
    }

    public static void i(n7 n7Var, b2.d0 d0Var) {
        for (int i10 = 0; i10 < n7Var.zza(); i10++) {
            long jZzb = n7Var.zzb(i10);
            ArrayList arrayListB = n7Var.b(jZzb);
            if (!arrayListB.isEmpty()) {
                if (i10 == n7Var.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = n7Var.zzb(i10 + 1) - n7Var.zzb(i10);
                if (jZzb2 > 0) {
                    d0Var.mo161zza(new m7(arrayListB, jZzb, jZzb2));
                }
            }
        }
    }

    public static void j(ListenableFuture listenableFuture, String str, Executor executor) {
        listenableFuture.addListener(new zd1(0, listenableFuture, new af1(str, 4)), executor);
    }

    public static void k(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    public static void l(String str, String str2) {
        synchronized (f21092p) {
            Log.d(str, M(str2, null));
        }
    }

    public static void m(String str, boolean z10) throws ab {
        if (!z10) {
            throw ab.a(null, str);
        }
    }

    public static int n(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static int o(int i10, int i11) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i11 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i12 = i10 / i11;
        int i13 = i10 - (i11 * i12);
        if (i13 == 0) {
            return i12;
        }
        int i14 = ((i10 ^ i11) >> 31) | 1;
        switch (bc1.f12734a[roundingMode.ordinal()]) {
            case 1:
                ps1.D(false);
                return i12;
            case 2:
                return i12;
            case 3:
                if (i14 >= 0) {
                    return i12;
                }
                break;
            case 4:
                break;
            case 5:
                if (i14 <= 0) {
                    return i12;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i13);
                int iAbs2 = iAbs - (Math.abs(i11) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i12;
                }
                if (iAbs2 <= 0) {
                    return i12;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i12 + i14;
    }

    public static void p(Context context, boolean z10) {
        if (z10) {
            int i10 = zze.zza;
            zzo.zzh("This request is sent from a test device.");
            return;
        }
        zzay.zza();
        String strZzF = zzf.zzF(context);
        String strJ = q4.a.j(new StringBuilder(String.valueOf(strZzF).length() + InterfaceC0435l1.d.b.f29106c), "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"", strZzF, "\")) to get test ads on this device.");
        int i11 = zze.zza;
        zzo.zzh(strJ);
    }

    public static void q(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    public static void r(String str, String str2) {
        synchronized (f21092p) {
            Log.i(str, M(str2, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x003e, B:23:0x0049, B:25:0x006b, B:29:0x0071, B:41:0x008d, B:42:0x008f, B:45:0x0095, B:48:0x009f, B:31:0x007b, B:35:0x0082, B:10:0x0023), top: B:54:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x007b A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x003e, B:23:0x0049, B:25:0x006b, B:29:0x0071, B:41:0x008d, B:42:0x008f, B:45:0x0095, B:48:0x009f, B:31:0x007b, B:35:0x0082, B:10:0x0023), top: B:54:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008d A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x003e, B:23:0x0049, B:25:0x006b, B:29:0x0071, B:41:0x008d, B:42:0x008f, B:45:0x0095, B:48:0x009f, B:31:0x007b, B:35:0x0082, B:10:0x0023), top: B:54:0x0006 }] */
    public static boolean s(np0 np0Var, int i10, int i11, boolean z10) {
        boolean z11;
        int iO;
        long jO;
        int iL;
        int i12;
        int i13 = np0Var.f17881b;
        while (true) {
            try {
                z11 = true;
                z11 = true;
                int i14 = 1;
                int i15 = 1;
                if (np0Var.B() >= i11) {
                    if (i10 >= 3) {
                        iO = np0Var.b();
                        jO = np0Var.P();
                        iL = np0Var.L();
                    } else {
                        iO = np0Var.O();
                        jO = np0Var.O();
                        iL = 0;
                    }
                    if (iO != 0 || jO != 0 || iL != 0) {
                        if (i10 != 4 || z10) {
                            if (i10 == 4) {
                                if ((iL & 64) != 0) {
                                    i14 = 0;
                                }
                                int i16 = i14;
                                i15 = iL & 1;
                                i12 = i16;
                            } else if (i10 == 3) {
                                if ((iL & 32) != 0) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if ((iL & 128) != 0) {
                                    i15 = 0;
                                }
                            } else {
                                i12 = 0;
                                i15 = 0;
                            }
                            if (i15 != 0) {
                                i12 += 4;
                            }
                            if (jO >= i12 && np0Var.B() >= jO) {
                                np0Var.G((int) jO);
                            }
                        } else if ((8421504 & jO) == 0) {
                            long j10 = ((jO >> 16) & 255) << 14;
                            jO = ((jO >> 24) << 21) | j10 | (jO & 255) | (((jO >> 8) & 255) << 7);
                            if (i10 == 4) {
                                if ((iL & 64) != 0) {
                                    i14 = 0;
                                }
                                int i17 = i14;
                                i15 = iL & 1;
                                i12 = i17;
                            } else if (i10 == 3) {
                                if ((iL & 32) != 0) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if ((iL & 128) != 0) {
                                    i15 = 0;
                                }
                            } else {
                                i12 = 0;
                                i15 = 0;
                            }
                            if (i15 != 0) {
                                i12 += 4;
                            }
                            if (jO >= i12) {
                                np0Var.G((int) jO);
                            }
                        }
                        z11 = false;
                        break;
                    }
                    break;
                }
                break;
            } catch (Throwable th2) {
                np0Var.E(i13);
                throw th2;
            }
        }
        np0Var.E(i13);
        return z11;
    }

    public static int t(SQLiteDatabase sQLiteDatabase, int i10) {
        int i11 = 0;
        if (i10 == 2) {
            return 0;
        }
        Cursor cursorK = K(sQLiteDatabase, i10);
        if (cursorK.getCount() > 0) {
            cursorK.moveToNext();
            i11 = cursorK.getInt(cursorK.getColumnIndexOrThrow(X3.i.X));
        }
        cursorK.close();
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005e  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int u(byte[] bArr) {
        int i10;
        int i11;
        byte b10;
        int i12;
        int i13;
        int i14;
        byte b11;
        boolean z10 = false;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i13 = (bArr[7] & 3) << 12;
                i14 = (bArr[6] & 255) << 4;
                b11 = bArr[9];
            } else if (b12 != 31) {
                i10 = (bArr[5] & 3) << 12;
                i11 = (bArr[6] & 255) << 4;
                b10 = bArr[7];
            } else {
                i13 = (bArr[6] & 3) << 12;
                i14 = (bArr[7] & 255) << 4;
                b11 = bArr[8];
            }
            i12 = (((b11 & 60) >> 2) | i13 | i14) + 1;
            z10 = true;
            if (z10) {
                return (i12 * 16) / 14;
            }
            return i12;
        }
        i10 = (bArr[4] & 3) << 12;
        i11 = (bArr[7] & 255) << 4;
        b10 = bArr[6];
        i12 = (((b10 & 240) >> 4) | i10 | i11) + 1;
        if (z10) {
            return (i12 * 16) / 14;
        }
        return i12;
    }

    /* JADX WARN: Code duplicated, block: B:147:0x0265  */
    /* JADX WARN: Code duplicated, block: B:148:0x0267  */
    /* JADX WARN: Code duplicated, block: B:152:0x026e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0274  */
    /* JADX WARN: Code duplicated, block: B:155:0x0278 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x0291 A[Catch: all -> 0x0130, Exception | OutOfMemoryError -> 0x0253, TRY_LEAVE, TryCatch #0 {Exception | OutOfMemoryError -> 0x0253, blocks: (B:135:0x021b, B:137:0x0242, B:139:0x0249, B:138:0x0245, B:158:0x027e, B:160:0x0291), top: B:260:0x01f1 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b9 A[Catch: all -> 0x0130, Exception | OutOfMemoryError -> 0x02b6, TryCatch #2 {all -> 0x0130, blocks: (B:83:0x0105, B:90:0x013c, B:93:0x0143, B:104:0x016d, B:107:0x019f, B:115:0x01ca, B:117:0x01de, B:119:0x01e5, B:118:0x01e1, B:133:0x0204, B:135:0x021b, B:137:0x0242, B:139:0x0249, B:138:0x0245, B:158:0x027e, B:160:0x0291, B:162:0x029a, B:172:0x02db, B:174:0x02f7, B:176:0x02fe, B:175:0x02fa, B:168:0x02b9, B:170:0x02d5, B:188:0x031c, B:194:0x035d, B:197:0x0386, B:201:0x039a, B:205:0x03a7, B:206:0x03ad, B:208:0x03b3, B:210:0x03ba, B:211:0x03be, B:219:0x03e3, B:223:0x040e, B:225:0x0419, B:226:0x044b, B:227:0x0456, B:229:0x045c, B:231:0x0463, B:232:0x0467, B:237:0x0480, B:244:0x0491, B:246:0x04bb, B:247:0x04ca, B:248:0x04d5), top: B:261:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x02d5 A[Catch: all -> 0x0130, Exception | OutOfMemoryError -> 0x02b6, TryCatch #2 {all -> 0x0130, blocks: (B:83:0x0105, B:90:0x013c, B:93:0x0143, B:104:0x016d, B:107:0x019f, B:115:0x01ca, B:117:0x01de, B:119:0x01e5, B:118:0x01e1, B:133:0x0204, B:135:0x021b, B:137:0x0242, B:139:0x0249, B:138:0x0245, B:158:0x027e, B:160:0x0291, B:162:0x029a, B:172:0x02db, B:174:0x02f7, B:176:0x02fe, B:175:0x02fa, B:168:0x02b9, B:170:0x02d5, B:188:0x031c, B:194:0x035d, B:197:0x0386, B:201:0x039a, B:205:0x03a7, B:206:0x03ad, B:208:0x03b3, B:210:0x03ba, B:211:0x03be, B:219:0x03e3, B:223:0x040e, B:225:0x0419, B:226:0x044b, B:227:0x0456, B:229:0x045c, B:231:0x0463, B:232:0x0467, B:237:0x0480, B:244:0x0491, B:246:0x04bb, B:247:0x04ca, B:248:0x04d5), top: B:261:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x02da  */
    /* JADX WARN: Code duplicated, block: B:174:0x02f7 A[Catch: all -> 0x0130, Exception | OutOfMemoryError -> 0x02b6, TryCatch #2 {all -> 0x0130, blocks: (B:83:0x0105, B:90:0x013c, B:93:0x0143, B:104:0x016d, B:107:0x019f, B:115:0x01ca, B:117:0x01de, B:119:0x01e5, B:118:0x01e1, B:133:0x0204, B:135:0x021b, B:137:0x0242, B:139:0x0249, B:138:0x0245, B:158:0x027e, B:160:0x0291, B:162:0x029a, B:172:0x02db, B:174:0x02f7, B:176:0x02fe, B:175:0x02fa, B:168:0x02b9, B:170:0x02d5, B:188:0x031c, B:194:0x035d, B:197:0x0386, B:201:0x039a, B:205:0x03a7, B:206:0x03ad, B:208:0x03b3, B:210:0x03ba, B:211:0x03be, B:219:0x03e3, B:223:0x040e, B:225:0x0419, B:226:0x044b, B:227:0x0456, B:229:0x045c, B:231:0x0463, B:232:0x0467, B:237:0x0480, B:244:0x0491, B:246:0x04bb, B:247:0x04ca, B:248:0x04d5), top: B:261:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x02fa A[Catch: all -> 0x0130, Exception | OutOfMemoryError -> 0x02b6, TryCatch #2 {all -> 0x0130, blocks: (B:83:0x0105, B:90:0x013c, B:93:0x0143, B:104:0x016d, B:107:0x019f, B:115:0x01ca, B:117:0x01de, B:119:0x01e5, B:118:0x01e1, B:133:0x0204, B:135:0x021b, B:137:0x0242, B:139:0x0249, B:138:0x0245, B:158:0x027e, B:160:0x0291, B:162:0x029a, B:172:0x02db, B:174:0x02f7, B:176:0x02fe, B:175:0x02fa, B:168:0x02b9, B:170:0x02d5, B:188:0x031c, B:194:0x035d, B:197:0x0386, B:201:0x039a, B:205:0x03a7, B:206:0x03ad, B:208:0x03b3, B:210:0x03ba, B:211:0x03be, B:219:0x03e3, B:223:0x040e, B:225:0x0419, B:226:0x044b, B:227:0x0456, B:229:0x045c, B:231:0x0463, B:232:0x0467, B:237:0x0480, B:244:0x0491, B:246:0x04bb, B:247:0x04ca, B:248:0x04d5), top: B:261:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x030a  */
    /* JADX WARN: Code duplicated, block: B:189:0x0353 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x0355  */
    /* JADX WARN: Code duplicated, block: B:213:0x03d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:214:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:238:0x0485 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:239:0x0487  */
    public static x4 v(int i10, np0 np0Var, boolean z10, s6 s6Var) {
        int iH;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        x4 x4Var;
        int i13;
        x4 s4Var;
        x4 a5Var;
        int i14;
        byte[] bArr;
        int iQ;
        String strE;
        String strConcat;
        int iT;
        byte[] bArrCopyOfRange;
        int iK = np0Var.K();
        int iK2 = np0Var.K();
        int iK3 = np0Var.K();
        int iK4 = i10 >= 3 ? np0Var.K() : 0;
        if (i10 == 4) {
            iH = np0Var.h();
            if (!z10) {
                iH = ((iH >> 24) << 21) | (iH & 255) | (((iH >> 8) & 255) << 7) | (((iH >> 16) & 255) << 14);
            }
        } else {
            iH = i10 == 3 ? np0Var.h() : np0Var.O();
        }
        int iL = i10 >= 3 ? np0Var.L() : 0;
        if (iK == 0 && iK2 == 0 && iK3 == 0 && iK4 == 0 && iH == 0 && iL == 0) {
            np0Var.E(np0Var.f17882c);
            return null;
        }
        int iD = np0Var.D() + iH;
        String str = "Id3Decoder";
        if (iD > np0Var.f17882c) {
            y("Id3Decoder", "Frame size exceeds remaining tag data");
            np0Var.E(np0Var.f17882c);
            return null;
        }
        if (s6Var != null) {
            np0Var.E(iD);
            return null;
        }
        if (i10 == 3) {
            int i15 = iL & 64;
            i11 = (iL & 128) != 0 ? 1 : 0;
            z13 = false;
            z12 = i15 != 0;
            z11 = (iL & 32) != 0;
            i12 = i11;
        } else if (i10 == 4) {
            boolean z14 = (iL & 64) != 0;
            int i16 = (iL & 8) != 0 ? 1 : 0;
            z12 = (iL & 4) != 0;
            z13 = (iL & 2) != 0;
            i12 = iL & 1;
            int i17 = i16;
            z11 = z14;
            i11 = i17;
        } else {
            i11 = 0;
            i12 = 0;
            z11 = false;
            z12 = false;
            z13 = false;
        }
        if (i11 != 0 || z12) {
            y("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            np0Var.E(iD);
            return null;
        }
        if (z11) {
            np0Var.G(1);
            iH--;
        }
        if (i12 != 0) {
            np0Var.G(4);
            iH -= 4;
        }
        if (z13) {
            iH = C(iH, np0Var);
        }
        try {
            try {
                if (iK == 84 && iK2 == 88 && iK3 == 88 && (i10 == 2 || iK4 == 88)) {
                    if (iH <= 0) {
                        s4Var = null;
                    } else {
                        int iK5 = np0Var.K();
                        int i18 = iH - 1;
                        byte[] bArr2 = new byte[i18];
                        np0Var.H(bArr2, 0, i18);
                        int iO = O(bArr2, 0, iK5);
                        s4Var = new c5("TXXX", new String(bArr2, 0, iO, I(iK5)), A(bArr2, iK5, iO + T(iK5)));
                    }
                    str = "Id3Decoder";
                } else {
                    if (iK == 84) {
                        String strL = L(i10, 84, iK2, iK3, iK4);
                        if (iH > 0) {
                            int iK6 = np0Var.K();
                            int i19 = iH - 1;
                            byte[] bArr3 = new byte[i19];
                            np0Var.H(bArr3, 0, i19);
                            s4Var = new c5(strL, null, A(bArr3, iK6, 0));
                        }
                        str = "Id3Decoder";
                    } else {
                        if (iK == 87) {
                            if (iK2 != 88 || iK3 != 88 || (i10 != 2 && iK4 != 88)) {
                                i13 = 87;
                            } else if (iH > 0) {
                                int iK7 = np0Var.K();
                                int i20 = iH - 1;
                                byte[] bArr4 = new byte[i20];
                                np0Var.H(bArr4, 0, i20);
                                int iO2 = O(bArr4, 0, iK7);
                                String str2 = new String(bArr4, 0, iO2, I(iK7));
                                int iT2 = iO2 + T(iK7);
                                s4Var = new d5("WXXX", str2, U(bArr4, iT2, Q(iT2, bArr4), StandardCharsets.ISO_8859_1));
                            }
                            str = "Id3Decoder";
                        } else {
                            i13 = iK;
                        }
                        if (i13 == 87) {
                            String strL2 = L(i10, 87, iK2, iK3, iK4);
                            byte[] bArr5 = new byte[iH];
                            np0Var.H(bArr5, 0, iH);
                            s4Var = new d5(strL2, null, new String(bArr5, 0, Q(0, bArr5), StandardCharsets.ISO_8859_1));
                        } else {
                            if (i13 == 80) {
                                if (iK2 == 82 && iK3 == 73 && iK4 == 86) {
                                    byte[] bArr6 = new byte[iH];
                                    np0Var.H(bArr6, 0, iH);
                                    int iQ2 = Q(0, bArr6);
                                    String str3 = new String(bArr6, 0, iQ2, StandardCharsets.ISO_8859_1);
                                    int i21 = iQ2 + 1;
                                    s4Var = new b5(str3, iH <= i21 ? uu0.f20902b : Arrays.copyOfRange(bArr6, i21, iH));
                                } else {
                                    i13 = 80;
                                }
                            }
                            try {
                                if (i13 != 71) {
                                    try {
                                        if (i10 == 2) {
                                            if (i13 != 80 && iK2 == 73 && iK3 == 67) {
                                                int iK8 = np0Var.K();
                                                Charset charsetI = I(iK8);
                                                i14 = iH - 1;
                                                bArr = new byte[i14];
                                                np0Var.H(bArr, 0, i14);
                                                if (i10 == 2) {
                                                    iK = iK;
                                                    strConcat = "image/".concat(String.valueOf(x10.e(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1))));
                                                    if ("image/jpg".equals(strConcat)) {
                                                        strConcat = "image/jpeg";
                                                    }
                                                    iQ = 2;
                                                } else {
                                                    iK = iK;
                                                    iQ = Q(0, bArr);
                                                    strE = x10.e(new String(bArr, 0, iQ, StandardCharsets.ISO_8859_1));
                                                    if (strE.indexOf(47) == -1) {
                                                        strConcat = "image/".concat(strE);
                                                    } else {
                                                        strConcat = strE;
                                                    }
                                                }
                                                int i22 = bArr[iQ + 1] & 255;
                                                int i23 = iQ + 2;
                                                int iO3 = O(bArr, i23, iK8);
                                                String str4 = new String(bArr, i23, iO3 - i23, charsetI);
                                                iT = iO3 + T(iK8);
                                                if (i14 <= iT) {
                                                    bArrCopyOfRange = uu0.f20902b;
                                                } else {
                                                    bArrCopyOfRange = Arrays.copyOfRange(bArr, iT, i14);
                                                }
                                                s4Var = new r4(strConcat, str4, i22, bArrCopyOfRange);
                                            } else {
                                                iK = iK;
                                                if (i13 == 67 || iK2 != 79 || iK3 != 77 || (iK4 != 77 && i10 != 2)) {
                                                    if (i13 != 67 && iK2 == 72 && iK3 == 65 && iK4 == 80) {
                                                        int iD2 = np0Var.D();
                                                        int iQ3 = Q(iD2, np0Var.F());
                                                        String str5 = new String(np0Var.F(), iD2, iQ3 - iD2, StandardCharsets.ISO_8859_1);
                                                        np0Var.E(iQ3 + 1);
                                                        int iB = np0Var.b();
                                                        int iB2 = np0Var.b();
                                                        if (iB > iB2) {
                                                            s4Var = null;
                                                        } else {
                                                            long jP = np0Var.P();
                                                            long j10 = jP == 4294967295L ? -1L : jP;
                                                            long jP2 = np0Var.P();
                                                            long j11 = jP2 == 4294967295L ? -1L : jP2;
                                                            ArrayList arrayList = new ArrayList();
                                                            int i24 = iD2 + iH;
                                                            while (np0Var.D() < i24) {
                                                                x4 x4VarV = v(i10, np0Var, z10, null);
                                                                if (x4VarV != null) {
                                                                    arrayList.add(x4VarV);
                                                                }
                                                            }
                                                            a5Var = new t4(str5, iB, iB2, j10, j11, (x4[]) arrayList.toArray(new x4[0]));
                                                        }
                                                    } else if (i13 != 67 && iK2 == 84 && iK3 == 79 && iK4 == 67) {
                                                        int iD3 = np0Var.D();
                                                        int iQ4 = Q(iD3, np0Var.F());
                                                        String str6 = new String(np0Var.F(), iD3, iQ4 - iD3, StandardCharsets.ISO_8859_1);
                                                        np0Var.E(iQ4 + 1);
                                                        int iK9 = np0Var.K();
                                                        boolean z15 = (iK9 & 2) != 0;
                                                        int i25 = iK9 & 1;
                                                        int iK10 = np0Var.K();
                                                        String[] strArr = new String[iK10];
                                                        int i26 = 0;
                                                        while (i26 < iK10) {
                                                            int iD4 = np0Var.D();
                                                            int iQ5 = Q(iD4, np0Var.F());
                                                            strArr[i26] = new String(np0Var.F(), iD4, iQ5 - iD4, StandardCharsets.ISO_8859_1);
                                                            np0Var.E(iQ5 + 1);
                                                            i26++;
                                                            iD3 = iD3;
                                                            iK10 = iK10;
                                                            str6 = str6;
                                                        }
                                                        int i27 = iD3;
                                                        String str7 = str6;
                                                        ArrayList arrayList2 = new ArrayList();
                                                        int i28 = i27 + iH;
                                                        while (np0Var.D() < i28) {
                                                            x4 x4VarV2 = v(i10, np0Var, z10, null);
                                                            if (x4VarV2 != null) {
                                                                arrayList2.add(x4VarV2);
                                                            }
                                                        }
                                                        a5Var = new u4(str7, z15, 1 == i25, strArr, (x4[]) arrayList2.toArray(new x4[0]));
                                                    } else if (i13 != 77 && iK2 == 76 && iK3 == 76 && iK4 == 84) {
                                                        int iL2 = np0Var.L();
                                                        int iO4 = np0Var.O();
                                                        int iO5 = np0Var.O();
                                                        int iK11 = np0Var.K();
                                                        int iK12 = np0Var.K();
                                                        gp0 gp0Var = new gp0();
                                                        gp0Var.a(np0Var);
                                                        int i29 = ((iH - 10) * 8) / (iK11 + iK12);
                                                        int[] iArr = new int[i29];
                                                        int[] iArr2 = new int[i29];
                                                        for (int i30 = 0; i30 < i29; i30++) {
                                                            int iH2 = gp0Var.h(iK11);
                                                            int iH3 = gp0Var.h(iK12);
                                                            iArr[i30] = iH2;
                                                            iArr2[i30] = iH3;
                                                        }
                                                        a5Var = new a5(iL2, iO4, iArr, iArr2, iO5);
                                                    } else {
                                                        String strL3 = L(i10, i13, iK2, iK3, iK4);
                                                        byte[] bArr7 = new byte[iH];
                                                        np0Var.H(bArr7, 0, iH);
                                                        s4Var = new s4(strL3, bArr7);
                                                    }
                                                    s4Var = a5Var;
                                                } else if (iH < 4) {
                                                    s4Var = null;
                                                } else {
                                                    int iK13 = np0Var.K();
                                                    Charset charsetI2 = I(iK13);
                                                    byte[] bArr8 = new byte[3];
                                                    np0Var.H(bArr8, 0, 3);
                                                    String str8 = new String(bArr8, 0, 3);
                                                    int i31 = iH - 4;
                                                    byte[] bArr9 = new byte[i31];
                                                    np0Var.H(bArr9, 0, i31);
                                                    int iO6 = O(bArr9, 0, iK13);
                                                    String str9 = new String(bArr9, 0, iO6, charsetI2);
                                                    int iT3 = iO6 + T(iK13);
                                                    s4Var = new v4(str8, str9, U(bArr9, iT3, O(bArr9, iT3, iK13), charsetI2));
                                                }
                                            }
                                        } else if (i13 != 65 && iK2 == 80 && iK3 == 73 && iK4 == 67) {
                                            int iK14 = np0Var.K();
                                            Charset charsetI3 = I(iK14);
                                            i14 = iH - 1;
                                            bArr = new byte[i14];
                                            np0Var.H(bArr, 0, i14);
                                            if (i10 == 2) {
                                                iK = iK;
                                                strConcat = "image/".concat(String.valueOf(x10.e(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1))));
                                                if ("image/jpg".equals(strConcat)) {
                                                    strConcat = "image/jpeg";
                                                }
                                                iQ = 2;
                                            } else {
                                                iK = iK;
                                                iQ = Q(0, bArr);
                                                strE = x10.e(new String(bArr, 0, iQ, StandardCharsets.ISO_8859_1));
                                                if (strE.indexOf(47) == -1) {
                                                    strConcat = "image/".concat(strE);
                                                } else {
                                                    strConcat = strE;
                                                }
                                            }
                                            int i210 = bArr[iQ + 1] & 255;
                                            int i211 = iQ + 2;
                                            int iO7 = O(bArr, i211, iK14);
                                            String str10 = new String(bArr, i211, iO7 - i211, charsetI3);
                                            iT = iO7 + T(iK14);
                                            if (i14 <= iT) {
                                                bArrCopyOfRange = uu0.f20902b;
                                            } else {
                                                bArrCopyOfRange = Arrays.copyOfRange(bArr, iT, i14);
                                            }
                                            s4Var = new r4(strConcat, str10, i210, bArrCopyOfRange);
                                        } else {
                                            iK = iK;
                                            if (i13 == 67) {
                                                if (i13 != 67) {
                                                    if (i13 != 67) {
                                                        if (i13 != 77) {
                                                        }
                                                        String strL4 = L(i10, i13, iK2, iK3, iK4);
                                                        byte[] bArr10 = new byte[iH];
                                                        np0Var.H(bArr10, 0, iH);
                                                        s4Var = new s4(strL4, bArr10);
                                                    } else {
                                                        if (i13 != 77) {
                                                        }
                                                        String strL5 = L(i10, i13, iK2, iK3, iK4);
                                                        byte[] bArr11 = new byte[iH];
                                                        np0Var.H(bArr11, 0, iH);
                                                        s4Var = new s4(strL5, bArr11);
                                                    }
                                                } else if (i13 != 67) {
                                                    if (i13 != 77) {
                                                    }
                                                    String strL6 = L(i10, i13, iK2, iK3, iK4);
                                                    byte[] bArr12 = new byte[iH];
                                                    np0Var.H(bArr12, 0, iH);
                                                    s4Var = new s4(strL6, bArr12);
                                                } else {
                                                    if (i13 != 77) {
                                                    }
                                                    String strL7 = L(i10, i13, iK2, iK3, iK4);
                                                    byte[] bArr13 = new byte[iH];
                                                    np0Var.H(bArr13, 0, iH);
                                                    s4Var = new s4(strL7, bArr13);
                                                }
                                            } else if (i13 != 67) {
                                                if (i13 != 67) {
                                                    if (i13 != 77) {
                                                    }
                                                    String strL8 = L(i10, i13, iK2, iK3, iK4);
                                                    byte[] bArr14 = new byte[iH];
                                                    np0Var.H(bArr14, 0, iH);
                                                    s4Var = new s4(strL8, bArr14);
                                                } else {
                                                    if (i13 != 77) {
                                                    }
                                                    String strL9 = L(i10, i13, iK2, iK3, iK4);
                                                    byte[] bArr15 = new byte[iH];
                                                    np0Var.H(bArr15, 0, iH);
                                                    s4Var = new s4(strL9, bArr15);
                                                }
                                            } else if (i13 != 67) {
                                                if (i13 != 77) {
                                                }
                                                String strL10 = L(i10, i13, iK2, iK3, iK4);
                                                byte[] bArr16 = new byte[iH];
                                                np0Var.H(bArr16, 0, iH);
                                                s4Var = new s4(strL10, bArr16);
                                            } else {
                                                if (i13 != 77) {
                                                }
                                                String strL11 = L(i10, i13, iK2, iK3, iK4);
                                                byte[] bArr17 = new byte[iH];
                                                np0Var.H(bArr17, 0, iH);
                                                s4Var = new s4(strL11, bArr17);
                                            }
                                        }
                                    } catch (Exception | OutOfMemoryError e10) {
                                        e = e10;
                                        np0Var.E(iD);
                                        x4Var = null;
                                    }
                                } else if (iK2 != 69 || iK3 != 79) {
                                    i13 = 71;
                                    if (i10 == 2) {
                                        if (i13 != 80) {
                                        }
                                        iK = iK;
                                        if (i13 == 67) {
                                            if (i13 != 67) {
                                                if (i13 != 67) {
                                                    if (i13 != 77) {
                                                    }
                                                    String strL12 = L(i10, i13, iK2, iK3, iK4);
                                                    byte[] bArr18 = new byte[iH];
                                                    np0Var.H(bArr18, 0, iH);
                                                    s4Var = new s4(strL12, bArr18);
                                                } else {
                                                    if (i13 != 77) {
                                                    }
                                                    String strL13 = L(i10, i13, iK2, iK3, iK4);
                                                    byte[] bArr19 = new byte[iH];
                                                    np0Var.H(bArr19, 0, iH);
                                                    s4Var = new s4(strL13, bArr19);
                                                }
                                            } else if (i13 != 67) {
                                                if (i13 != 77) {
                                                }
                                                String strL14 = L(i10, i13, iK2, iK3, iK4);
                                                byte[] bArr110 = new byte[iH];
                                                np0Var.H(bArr110, 0, iH);
                                                s4Var = new s4(strL14, bArr110);
                                            } else {
                                                if (i13 != 77) {
                                                }
                                                String strL15 = L(i10, i13, iK2, iK3, iK4);
                                                byte[] bArr111 = new byte[iH];
                                                np0Var.H(bArr111, 0, iH);
                                                s4Var = new s4(strL15, bArr111);
                                            }
                                        } else if (i13 != 67) {
                                            if (i13 != 67) {
                                                if (i13 != 77) {
                                                }
                                                String strL16 = L(i10, i13, iK2, iK3, iK4);
                                                byte[] bArr112 = new byte[iH];
                                                np0Var.H(bArr112, 0, iH);
                                                s4Var = new s4(strL16, bArr112);
                                            } else {
                                                if (i13 != 77) {
                                                }
                                                String strL17 = L(i10, i13, iK2, iK3, iK4);
                                                byte[] bArr113 = new byte[iH];
                                                np0Var.H(bArr113, 0, iH);
                                                s4Var = new s4(strL17, bArr113);
                                            }
                                        } else if (i13 != 67) {
                                            if (i13 != 77) {
                                            }
                                            String strL18 = L(i10, i13, iK2, iK3, iK4);
                                            byte[] bArr114 = new byte[iH];
                                            np0Var.H(bArr114, 0, iH);
                                            s4Var = new s4(strL18, bArr114);
                                        } else {
                                            if (i13 != 77) {
                                            }
                                            String strL19 = L(i10, i13, iK2, iK3, iK4);
                                            byte[] bArr115 = new byte[iH];
                                            np0Var.H(bArr115, 0, iH);
                                            s4Var = new s4(strL19, bArr115);
                                        }
                                    } else {
                                        if (i13 != 65) {
                                        }
                                        iK = iK;
                                        if (i13 == 67) {
                                            if (i13 != 67) {
                                                if (i13 != 67) {
                                                    if (i13 != 77) {
                                                    }
                                                    String strL110 = L(i10, i13, iK2, iK3, iK4);
                                                    byte[] bArr116 = new byte[iH];
                                                    np0Var.H(bArr116, 0, iH);
                                                    s4Var = new s4(strL110, bArr116);
                                                } else {
                                                    if (i13 != 77) {
                                                    }
                                                    String strL111 = L(i10, i13, iK2, iK3, iK4);
                                                    byte[] bArr117 = new byte[iH];
                                                    np0Var.H(bArr117, 0, iH);
                                                    s4Var = new s4(strL111, bArr117);
                                                }
                                            } else if (i13 != 67) {
                                                if (i13 != 77) {
                                                }
                                                String strL112 = L(i10, i13, iK2, iK3, iK4);
                                                byte[] bArr118 = new byte[iH];
                                                np0Var.H(bArr118, 0, iH);
                                                s4Var = new s4(strL112, bArr118);
                                            } else {
                                                if (i13 != 77) {
                                                }
                                                String strL113 = L(i10, i13, iK2, iK3, iK4);
                                                byte[] bArr119 = new byte[iH];
                                                np0Var.H(bArr119, 0, iH);
                                                s4Var = new s4(strL113, bArr119);
                                            }
                                        } else if (i13 != 67) {
                                            if (i13 != 67) {
                                                if (i13 != 77) {
                                                }
                                                String strL114 = L(i10, i13, iK2, iK3, iK4);
                                                byte[] bArr1110 = new byte[iH];
                                                np0Var.H(bArr1110, 0, iH);
                                                s4Var = new s4(strL114, bArr1110);
                                            } else {
                                                if (i13 != 77) {
                                                }
                                                String strL115 = L(i10, i13, iK2, iK3, iK4);
                                                byte[] bArr1111 = new byte[iH];
                                                np0Var.H(bArr1111, 0, iH);
                                                s4Var = new s4(strL115, bArr1111);
                                            }
                                        } else if (i13 != 67) {
                                            if (i13 != 77) {
                                            }
                                            String strL116 = L(i10, i13, iK2, iK3, iK4);
                                            byte[] bArr1112 = new byte[iH];
                                            np0Var.H(bArr1112, 0, iH);
                                            s4Var = new s4(strL116, bArr1112);
                                        } else {
                                            if (i13 != 77) {
                                            }
                                            String strL117 = L(i10, i13, iK2, iK3, iK4);
                                            byte[] bArr1113 = new byte[iH];
                                            np0Var.H(bArr1113, 0, iH);
                                            s4Var = new s4(strL117, bArr1113);
                                        }
                                    }
                                } else if (iK4 == 66 || i10 == 2) {
                                    try {
                                        int iK15 = np0Var.K();
                                        Charset charsetI4 = I(iK15);
                                        int i32 = iH - 1;
                                        byte[] bArr20 = new byte[i32];
                                        np0Var.H(bArr20, 0, i32);
                                        int iQ6 = Q(0, bArr20);
                                        str = "Id3Decoder";
                                        String strG = na.g(new String(bArr20, 0, iQ6, StandardCharsets.ISO_8859_1));
                                        int i33 = iQ6 + 1;
                                        int iO8 = O(bArr20, i33, iK15);
                                        String strU = U(bArr20, i33, iO8, charsetI4);
                                        int iT4 = iO8 + T(iK15);
                                        int iO9 = O(bArr20, iT4, iK15);
                                        String strU2 = U(bArr20, iT4, iO9, charsetI4);
                                        int iT5 = iO9 + T(iK15);
                                        iK = iK;
                                        s4Var = new w4(strG, strU, strU2, i32 <= iT5 ? uu0.f20902b : Arrays.copyOfRange(bArr20, iT5, i32));
                                    } catch (Exception | OutOfMemoryError e11) {
                                        e = e11;
                                        str = "Id3Decoder";
                                        np0Var.E(iD);
                                        x4Var = null;
                                    }
                                } else {
                                    i13 = 71;
                                    if (i10 == 2) {
                                        if (i13 != 80) {
                                        }
                                        iK = iK;
                                        if (i13 == 67) {
                                            if (i13 != 67) {
                                                if (i13 != 67) {
                                                    if (i13 != 77) {
                                                    }
                                                    String strL118 = L(i10, i13, iK2, iK3, iK4);
                                                    byte[] bArr1114 = new byte[iH];
                                                    np0Var.H(bArr1114, 0, iH);
                                                    s4Var = new s4(strL118, bArr1114);
                                                } else {
                                                    if (i13 != 77) {
                                                    }
                                                    String strL119 = L(i10, i13, iK2, iK3, iK4);
                                                    byte[] bArr1115 = new byte[iH];
                                                    np0Var.H(bArr1115, 0, iH);
                                                    s4Var = new s4(strL119, bArr1115);
                                                }
                                            } else if (i13 != 67) {
                                                if (i13 != 77) {
                                                }
                                                String strL1110 = L(i10, i13, iK2, iK3, iK4);
                                                byte[] bArr1116 = new byte[iH];
                                                np0Var.H(bArr1116, 0, iH);
                                                s4Var = new s4(strL1110, bArr1116);
                                            } else {
                                                if (i13 != 77) {
                                                }
                                                String strL1111 = L(i10, i13, iK2, iK3, iK4);
                                                byte[] bArr1117 = new byte[iH];
                                                np0Var.H(bArr1117, 0, iH);
                                                s4Var = new s4(strL1111, bArr1117);
                                            }
                                        } else if (i13 != 67) {
                                            if (i13 != 67) {
                                                if (i13 != 77) {
                                                }
                                                String strL1112 = L(i10, i13, iK2, iK3, iK4);
                                                byte[] bArr1118 = new byte[iH];
                                                np0Var.H(bArr1118, 0, iH);
                                                s4Var = new s4(strL1112, bArr1118);
                                            } else {
                                                if (i13 != 77) {
                                                }
                                                String strL1113 = L(i10, i13, iK2, iK3, iK4);
                                                byte[] bArr1119 = new byte[iH];
                                                np0Var.H(bArr1119, 0, iH);
                                                s4Var = new s4(strL1113, bArr1119);
                                            }
                                        } else if (i13 != 67) {
                                            if (i13 != 77) {
                                            }
                                            String strL1114 = L(i10, i13, iK2, iK3, iK4);
                                            byte[] bArr11110 = new byte[iH];
                                            np0Var.H(bArr11110, 0, iH);
                                            s4Var = new s4(strL1114, bArr11110);
                                        } else {
                                            if (i13 != 77) {
                                            }
                                            String strL1115 = L(i10, i13, iK2, iK3, iK4);
                                            byte[] bArr11111 = new byte[iH];
                                            np0Var.H(bArr11111, 0, iH);
                                            s4Var = new s4(strL1115, bArr11111);
                                        }
                                    } else {
                                        if (i13 != 65) {
                                        }
                                        iK = iK;
                                        if (i13 == 67) {
                                            if (i13 != 67) {
                                                if (i13 != 67) {
                                                    if (i13 != 77) {
                                                    }
                                                    String strL1116 = L(i10, i13, iK2, iK3, iK4);
                                                    byte[] bArr11112 = new byte[iH];
                                                    np0Var.H(bArr11112, 0, iH);
                                                    s4Var = new s4(strL1116, bArr11112);
                                                } else {
                                                    if (i13 != 77) {
                                                    }
                                                    String strL1117 = L(i10, i13, iK2, iK3, iK4);
                                                    byte[] bArr11113 = new byte[iH];
                                                    np0Var.H(bArr11113, 0, iH);
                                                    s4Var = new s4(strL1117, bArr11113);
                                                }
                                            } else if (i13 != 67) {
                                                if (i13 != 77) {
                                                }
                                                String strL1118 = L(i10, i13, iK2, iK3, iK4);
                                                byte[] bArr11114 = new byte[iH];
                                                np0Var.H(bArr11114, 0, iH);
                                                s4Var = new s4(strL1118, bArr11114);
                                            } else {
                                                if (i13 != 77) {
                                                }
                                                String strL1119 = L(i10, i13, iK2, iK3, iK4);
                                                byte[] bArr11115 = new byte[iH];
                                                np0Var.H(bArr11115, 0, iH);
                                                s4Var = new s4(strL1119, bArr11115);
                                            }
                                        } else if (i13 != 67) {
                                            if (i13 != 67) {
                                                if (i13 != 77) {
                                                }
                                                String strL11110 = L(i10, i13, iK2, iK3, iK4);
                                                byte[] bArr11116 = new byte[iH];
                                                np0Var.H(bArr11116, 0, iH);
                                                s4Var = new s4(strL11110, bArr11116);
                                            } else {
                                                if (i13 != 77) {
                                                }
                                                String strL11111 = L(i10, i13, iK2, iK3, iK4);
                                                byte[] bArr11117 = new byte[iH];
                                                np0Var.H(bArr11117, 0, iH);
                                                s4Var = new s4(strL11111, bArr11117);
                                            }
                                        } else if (i13 != 67) {
                                            if (i13 != 77) {
                                            }
                                            String strL11112 = L(i10, i13, iK2, iK3, iK4);
                                            byte[] bArr11118 = new byte[iH];
                                            np0Var.H(bArr11118, 0, iH);
                                            s4Var = new s4(strL11112, bArr11118);
                                        } else {
                                            if (i13 != 77) {
                                            }
                                            String strL11113 = L(i10, i13, iK2, iK3, iK4);
                                            byte[] bArr11119 = new byte[iH];
                                            np0Var.H(bArr11119, 0, iH);
                                            s4Var = new s4(strL11113, bArr11119);
                                        }
                                    }
                                }
                            } catch (Exception | OutOfMemoryError e12) {
                                e = e12;
                            }
                        }
                        str = "Id3Decoder";
                    }
                    s4Var = null;
                    str = "Id3Decoder";
                }
                np0Var.E(iD);
                x4Var = s4Var;
                e = null;
            } catch (Throwable th2) {
                np0Var.E(iD);
                throw th2;
            }
        } catch (Exception | OutOfMemoryError e13) {
            e = e13;
            str = "Id3Decoder";
        }
        if (x4Var == null) {
            String strL20 = L(i10, iK, iK2, iK3, iK4);
            StringBuilder sb2 = new StringBuilder(strL20.length() + 39 + String.valueOf(iH).length());
            sb2.append("Failed to decode frame: id=");
            sb2.append(strL20);
            sb2.append(", frameSize=");
            sb2.append(iH);
            B(str, sb2.toString(), e);
        }
        return x4Var;
    }

    public static AbstractList w(List list, d81 d81Var) {
        return list != null ? new qa1(list, d81Var) : new ra1(list, d81Var);
    }

    public static void x(gp0 gp0Var) {
        int iH;
        int iH2 = gp0Var.h(2);
        if (iH2 == 0) {
            gp0Var.f(6);
            return;
        }
        int iH3 = H(gp0Var, 5, 8, 16) + 1;
        if (iH2 == 1) {
            gp0Var.f(iH3 * 7);
            return;
        }
        if (iH2 == 2) {
            boolean zG = gp0Var.g();
            int i10 = true != zG ? 5 : 1;
            int i11 = true == zG ? 7 : 5;
            int i12 = true == zG ? 8 : 6;
            int i13 = 0;
            while (i13 < iH3) {
                if (gp0Var.g()) {
                    gp0Var.f(7);
                    iH = 0;
                } else {
                    if (gp0Var.h(2) == 3 && gp0Var.h(i11) * i10 != 0) {
                        gp0Var.e();
                    }
                    iH = gp0Var.h(i12) * i10;
                    if (iH != 0 && iH != 180) {
                        gp0Var.e();
                    }
                    gp0Var.e();
                }
                if (iH != 0 && iH != 180 && gp0Var.g()) {
                    i13++;
                }
                i13++;
            }
        }
    }

    public static void y(String str, String str2) {
        synchronized (f21092p) {
            Log.w(str, M(str2, null));
        }
    }

    public static final void z(StringBuilder sb2, Iterator it, String str) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) str);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
