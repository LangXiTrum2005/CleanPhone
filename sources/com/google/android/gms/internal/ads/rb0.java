package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.F9;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rb0 implements p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ExecutorService f19498a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ei f19500c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ei f19502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ei f19503f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final qd0 f19505h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final qd0 f19507j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final tt0 f19510n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f19511o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f19512p = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f19499b = {F9.b.f26076b, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, com.ironsource.mediationsdk.metadata.a.f29616n};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ei f19501d = new ei(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final qd0 f19504g = new qd0(8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final qd0 f19506i = new qd0(21);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final lr0 f19508k = new lr0(7);
    public static final lr0 l = new lr0(13);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final lr0 f19509m = new lr0(18);

    static {
        byte b10 = 0;
        f19500c = new ei(b10);
        int i10 = 15;
        f19502e = new ei(i10);
        int i11 = 28;
        f19503f = new ei(i11);
        f19505h = new qd0(i10);
        f19507j = new qd0(i11);
        f19510n = new tt0(b10, 10);
    }

    public static void A(Bundle bundle, String str, boolean z10, boolean z11) {
        if (z11) {
            bundle.putBoolean(str, z10);
        }
    }

    public static void B(gp0 gp0Var, x1 x1Var) throws ab {
        int iH = gp0Var.h(5);
        gp0Var.f(2);
        if (gp0Var.g()) {
            gp0Var.f(5);
        }
        if (iH >= 7 && iH <= 10) {
            gp0Var.e();
        }
        if (gp0Var.g()) {
            int iH2 = gp0Var.h(3);
            if (x1Var.f21669b == -1 && iH >= 0 && iH <= 15 && (iH2 == 0 || iH2 == 1)) {
                x1Var.f21669b = iH;
            }
            if (gp0Var.g()) {
                H(gp0Var);
            }
        }
    }

    public static void C(File file, boolean z10) {
        if (z10 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static void D(List list, h81 h81Var, int i10, int i11) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i11) {
                break;
            } else if (h81Var.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            } else {
                list.remove(i11);
            }
        }
    }

    public static void E(gp0 gp0Var, x1 x1Var) throws ab {
        gp0Var.f(2);
        boolean zG = gp0Var.g();
        int iH = gp0Var.h(8);
        for (int i10 = 0; i10 < iH; i10++) {
            gp0Var.f(2);
            if (gp0Var.g()) {
                gp0Var.f(5);
            }
            if (zG) {
                gp0Var.f(24);
            } else {
                if (gp0Var.g()) {
                    if (!gp0Var.g()) {
                        gp0Var.f(4);
                    }
                    x1Var.f21670c = gp0Var.h(6) + 1;
                }
                gp0Var.f(4);
            }
        }
        if (gp0Var.g()) {
            gp0Var.f(3);
            if (gp0Var.g()) {
                H(gp0Var);
            }
        }
    }

    public static void F(String str, Bundle bundle, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static boolean G(File file) {
        boolean z10;
        if (!file.exists()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            z10 = true;
            for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                File file2 = fileArrListFiles[i10];
                z10 = file2 != null && G(file2) && z10;
            }
        } else {
            z10 = true;
        }
        return file.delete() && z10;
    }

    public static void H(gp0 gp0Var) throws ab {
        int iH = gp0Var.h(6);
        if (iH < 2 || iH > 42) {
            throw ab.b(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iH)));
        }
        gp0Var.f(iH * 8);
    }

    public static long a(double d10) {
        ps1.C("not a normal value", s(d10));
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits + jDoubleToRawLongBits : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static Bundle b(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    public static Bundle c(Pair... pairArr) {
        Bundle bundle = new Bundle();
        if (((Boolean) zzba.zzc().a(am.S2)).booleanValue()) {
            for (int i10 = 0; i10 < 2; i10++) {
                Pair pair = pairArr[i10];
                if (!TextUtils.isEmpty((CharSequence) pair.first) && ((Long) pair.second).longValue() > 0) {
                    bundle.putLong((String) pair.first, ((Long) pair.second).longValue());
                }
            }
        }
        return bundle;
    }

    public static File d(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(v(file, str), str2);
    }

    public static String e(String str, Context context, boolean z10, Map map) {
        String strD;
        if ((((Boolean) zzba.zzc().a(am.f12159g1)).booleanValue() && !z10) || !zzt.zzD().a(context) || TextUtils.isEmpty(str) || (strD = zzt.zzD().d(context)) == null) {
            return str;
        }
        String str2 = (String) zzba.zzc().a(am.Z0);
        if (((Boolean) zzba.zzc().a(am.Y0)).booleanValue() && str.contains(str2)) {
            if (zzt.zzc().zzh(str)) {
                kz kzVarZzD = zzt.zzD();
                Map map2 = (Map) map.get("_ac");
                kzVarZzD.getClass();
                kzVarZzD.h(context, "_ac", strD, kz.f(map2));
                return z(context, str).replace(str2, strD);
            }
            if (!zzt.zzc().zzi(str)) {
                return str;
            }
            kz kzVarZzD2 = zzt.zzD();
            Map map3 = (Map) map.get("_ai");
            kzVarZzD2.getClass();
            kzVarZzD2.h(context, "_ai", strD, kz.f(map3));
            return z(context, str).replace(str2, strD);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((Boolean) zzba.zzc().a(am.X0)).booleanValue()) {
            return str;
        }
        if (zzt.zzc().zzh(str)) {
            kz kzVarZzD3 = zzt.zzD();
            Map map4 = (Map) map.get("_ac");
            kzVarZzD3.getClass();
            kzVarZzD3.h(context, "_ac", strD, kz.f(map4));
            return u(z(context, str), "fbs_aeid", strD).toString();
        }
        if (!zzt.zzc().zzi(str)) {
            return str;
        }
        kz kzVarZzD4 = zzt.zzD();
        Map map5 = (Map) map.get("_ai");
        kzVarZzD4.getClass();
        kzVarZzD4.h(context, "_ai", strD, kz.f(map5));
        return u(z(context, str), "fbs_aeid", strD).toString();
    }

    public static synchronized Executor g() {
        try {
            if (f19498a == null) {
                String str = uu0.f20901a;
                f19498a = Executors.newSingleThreadExecutor(new lu0("ExoPlayer:BackgroundExecutor"));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f19498a;
    }

    public static void i(long j10, np0 np0Var, h3[] h3VarArr) {
        int i10;
        int iB;
        int iK;
        while (true) {
            if (np0Var.B() <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (np0Var.B() == 0) {
                    i10 = -1;
                    break;
                }
                int iK2 = np0Var.K();
                i11 += iK2;
                if (iK2 != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            do {
                if (np0Var.B() == 0) {
                    i12 = -1;
                    break;
                } else {
                    iK = np0Var.K();
                    i12 += iK;
                }
            } while (iK == 255);
            int i13 = np0Var.f17881b + i12;
            if (i12 == -1 || i12 > np0Var.B()) {
                v71.y("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i13 = np0Var.f17882c;
            } else if (i10 == 4 && i12 >= 8) {
                int iK3 = np0Var.K();
                int iL = np0Var.L();
                if (iL == 49) {
                    iB = np0Var.b();
                    iL = 49;
                } else {
                    iB = 0;
                }
                int iK4 = np0Var.K();
                if (iL == 47) {
                    np0Var.G(1);
                    iL = 47;
                }
                boolean z10 = iK3 == 181 && (iL == 49 || iL == 47) && iK4 == 3;
                if (iL == 49) {
                    z10 &= iB == 1195456820;
                }
                if (z10) {
                    q(j10, np0Var, h3VarArr);
                }
            }
            np0Var.E(i13);
        }
    }

    public static void j(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String string = obj.toString();
        throw new NullPointerException(q4.a.j(new StringBuilder(string.length() + 26), "null value in entry: ", string, "=null"));
    }

    public static void k(String str, Exception exc) {
        Log.e("OMIDLIB", str, exc);
    }

    public static boolean l(n2 n2Var, boolean z10) {
        int i10;
        np0 np0Var = new np0(16);
        boolean z11 = true;
        while (true) {
            np0Var.y(8);
            if (!n2Var.m(np0Var.f17880a, 0, 8, true)) {
                break;
            }
            long jP = np0Var.P();
            int iB = np0Var.b();
            if (jP != 1) {
                i10 = 8;
            } else {
                if (!n2Var.m(np0Var.f17880a, 8, 8, true)) {
                    break;
                }
                jP = np0Var.j();
                i10 = 16;
            }
            long j10 = i10;
            if (jP < j10) {
                break;
            }
            int i11 = (int) (jP - j10);
            if (z11) {
                if (iB != 1718909296 || i11 < 8) {
                    break;
                }
                np0Var.y(4);
                n2Var.v(np0Var.f17880a, 0, 4);
                if (np0Var.b() != 1751476579) {
                    break;
                }
                if (!z10) {
                    return true;
                }
                n2Var.b(i11 - 4);
                z11 = false;
            } else {
                if (iB == 1836086884) {
                    return true;
                }
                if (i11 != 0) {
                    n2Var.b(i11);
                }
                z11 = false;
            }
        }
        return false;
    }

    public static byte[] m() {
        int i10 = (((((~1070575321) & 53864535) | 741512112) + ((1070575321 & 1665624655) | 1758594712)) - 1358657052) ^ (1555319301 % 382697713);
        int i11 = (((((~1529195746) & 118097808) | 3345166) + ((1529195746 & 656934035) | 821390159)) - 940522761) ^ (1037127828 % 1034949299);
        int[] iArr = {350322227, 1077471394, 1759186290, 18931840, 769005128, 1847857001, 24413078, 1982275856, 1275373743};
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        int i16 = iArr[4];
        int i17 = iArr[5];
        int i18 = iArr[6];
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((iArr[7] % 1275373743) ^ com.applovin.impl.ca.g((i13 & (~i12)) | i14, (i12 & i15) | i16, i17, i18));
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) i11);
        byteBufferAllocate.putInt(i10);
        return byteBufferAllocate.array();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    public static t0 n(gp0 gp0Var) {
        int i10;
        int i11;
        int iH = gp0Var.h(16);
        int iH2 = gp0Var.h(16);
        if (iH2 == 65535) {
            iH2 = gp0Var.h(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i12 = iH2 + i10;
        if (iH == 44097) {
            i12 += 2;
        }
        if (gp0Var.h(2) == 3) {
            do {
                gp0Var.h(2);
            } while (gp0Var.g());
        }
        int iH3 = gp0Var.h(10);
        if (gp0Var.g() && gp0Var.h(3) > 0) {
            gp0Var.f(2);
        }
        int i13 = true != gp0Var.g() ? 44100 : 48000;
        int iH4 = gp0Var.h(4);
        int[] iArr = f19499b;
        if (i13 == 44100 && iH4 == 13) {
            i11 = iArr[13];
        } else if (i13 != 48000 || iH4 >= 14) {
            i11 = 0;
        } else {
            int i14 = iArr[iH4];
            int i15 = iH3 % 5;
            if (i15 == 1) {
                if (iH4 != 3 || iH4 == 8) {
                    i11 = i14 + 1;
                } else {
                    i11 = i14;
                }
            } else if (i15 != 2) {
                if (i15 == 3) {
                    if (iH4 != 3) {
                    }
                    i11 = i14 + 1;
                } else if (i15 == 4 && (iH4 == 3 || iH4 == 8 || iH4 == 11)) {
                    i11 = i14 + 1;
                } else {
                    i11 = i14;
                }
            } else if (iH4 == 8 || iH4 == 11) {
                i11 = i14 + 1;
            } else {
                i11 = i14;
            }
        }
        return new t0(i13, i12, i11, false);
    }

    public static Object o(gb1 gb1Var, String str) {
        la1 la1Var = new la1(gb1Var, gb1Var.f14808a, gb1Var.f14809b);
        return la1Var.hasNext() ? la1Var.next() : str;
    }

    public static void p(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 29 + String.valueOf(i10).length());
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void q(long j10, np0 np0Var, h3[] h3VarArr) {
        int iK = np0Var.K();
        if ((iK & 64) != 0) {
            int i10 = iK & 31;
            np0Var.G(1);
            int i11 = np0Var.f17881b;
            for (h3 h3Var : h3VarArr) {
                int i12 = i10 * 3;
                np0Var.E(i11);
                h3Var.b(i12, np0Var);
                ps1.c0(j10 != C.TIME_UNSET);
                h3Var.c(j10, 1, i12, 0, null);
            }
        }
    }

    public static void r(Bundle bundle, String str, String str2, boolean z10) {
        if (!z10 || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static boolean s(double d10) {
        return Math.getExponent(d10) <= 1023;
    }

    public static boolean t(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                p9.c.d(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                p9.c.d(fileOutputStream);
                return false;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                p9.c.d(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static Uri u(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i10 = iIndexOf + 1;
        StringBuilder sb2 = new StringBuilder(str.substring(0, i10));
        d5.u.r(sb2, str2, X3.j.f27830b, str3, X3.j.f27832c);
        sb2.append(str.substring(i10));
        return Uri.parse(sb2.toString());
    }

    public static File v(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        C(file2, false);
        return file2;
    }

    public static void w(int i10, np0 np0Var) {
        np0Var.y(7);
        byte[] bArr = np0Var.f17880a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    public static void x(Bundle bundle, String str, int i10, boolean z10) {
        if (z10) {
            bundle.putInt(str, i10);
        }
    }

    public static void y(ArrayList arrayList, pb pbVar) {
        String str = (String) pbVar.o();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    public static String z(Context context, String str) {
        String strB = zzt.zzD().b(context);
        String strC = zzt.zzD().c(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strB)) {
            str = u(str, "gmp_app_id", strB).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strC)) ? str : u(str, "fbs_aiid", strC).toString();
    }
}
