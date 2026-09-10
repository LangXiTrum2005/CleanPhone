package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.C0239a2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.core.di.ServiceProvider;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dv implements p2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ei f13733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ei f13734f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final qd0 f13736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final qd0 f13737i;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f13746s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f13747t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f13729a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f13730b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f13731c = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final pb f13732d = new pb(4, "gads:pan:experiment_id", "");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final qd0 f13735g = new qd0(3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final qd0 f13738j = new qd0(25);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final lr0 f13739k = new lr0(5);
    public static final lr0 l = new lr0(11);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final lr0 f13740m = new lr0(16);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f13741n = {0, 0, 0, 1};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float[] f13742o = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f13743p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int[] f13744q = new int[10];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f13745r = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    static {
        int i10 = 13;
        f13733e = new ei(i10);
        int i11 = 19;
        f13734f = new ei(i11);
        f13736h = new qd0(i10);
        f13737i = new qd0(i11);
    }

    public static long A(int i10, long j10) {
        if (i10 == 1) {
            return j10;
        }
        int i11 = i10 >> 1;
        long j11 = (j10 * j10) % 1073807359;
        return (i10 & 1) == 0 ? A(i11, j11) % 1073807359 : ((A(i11, j11) % 1073807359) * j10) % 1073807359;
    }

    public static String B(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length || (iIndexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, iIndexOf);
            sb2.append(G(objArr[i10]));
            i11 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i10 < length) {
            String str2 = " [";
            while (i10 < objArr.length) {
                sb2.append(str2);
                sb2.append(G(objArr[i10]));
                i10++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static boolean C(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static boolean D(byte[] bArr, int i10, g22 g22Var) {
        int i11;
        String str = g22Var.f14678o;
        if (Objects.equals(str, "video/avc")) {
            byte b10 = bArr[4];
            if (((b10 & 96) >> 5) == 0 && ((i11 = b10 & 31) == 1 || i11 == 9 || i11 == 14)) {
                return false;
            }
        } else if (Objects.equals(str, "video/hevc")) {
            t0 t0VarN = N(new ta1(bArr, 4, i10 + 4));
            int i12 = t0VarN.f20103a;
            if (i12 == 35) {
                return false;
            }
            if (i12 <= 14 && i12 % 2 == 0 && t0VarN.f20105c == g22Var.F - 1) {
                return false;
            }
        }
        return true;
    }

    public static long E(int i10, String[] strArr) {
        long jB = (((long) ps1.b(strArr[0])) + 2147483647L) % 1073807359;
        for (int i11 = 1; i11 < i10; i11++) {
            jB = (((((long) ps1.b(strArr[i11])) + 2147483647L) % 1073807359) + ((jB * 16785407) % 1073807359)) % 1073807359;
        }
        return jB;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0185  */
    /* JADX WARN: Code duplicated, block: B:102:0x0189  */
    /* JADX WARN: Code duplicated, block: B:103:0x018e  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:111:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:123:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:129:0x0208  */
    /* JADX WARN: Code duplicated, block: B:132:0x020f  */
    /* JADX WARN: Code duplicated, block: B:135:0x021b  */
    /* JADX WARN: Code duplicated, block: B:137:0x023a  */
    /* JADX WARN: Code duplicated, block: B:142:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x009f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0160  */
    /* JADX WARN: Code duplicated, block: B:93:0x0166  */
    /* JADX WARN: Code duplicated, block: B:95:0x0170  */
    /* JADX WARN: Code duplicated, block: B:99:0x0182  */
    public static t61 F(byte[] bArr, int i10, int i11) {
        int iG;
        int i12;
        int i13;
        int iG2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iF;
        int i19;
        int i20;
        int iG3;
        int i21;
        int i22;
        int i23;
        int i24;
        float f10;
        int i25;
        int i26;
        float f11;
        int i27;
        int iC;
        boolean zD;
        boolean zD2;
        int iE;
        int iE2;
        int i28;
        ta1 ta1Var = new ta1(bArr, i10, i11);
        int iE3 = ta1Var.e(8);
        int iE4 = ta1Var.e(8);
        int iE5 = ta1Var.e(8);
        int iG4 = ta1Var.g();
        if (iE3 == 100 || iE3 == 110 || iE3 == 122 || iE3 == 244 || iE3 == 44 || iE3 == 83 || iE3 == 86 || iE3 == 118 || iE3 == 128) {
            iG = ta1Var.g();
            if (iG == 3) {
                ta1Var.d();
                i12 = 3;
            } else {
                i12 = iG;
            }
            i13 = 16;
            iG2 = ta1Var.g();
            int iG5 = ta1Var.g();
            ta1Var.a();
            if (ta1Var.d()) {
                if (i12 != 3) {
                    i15 = 8;
                } else {
                    i15 = 12;
                }
                for (i16 = 0; i16 < i15; i16++) {
                    if (!ta1Var.d()) {
                        if (i16 < 6) {
                            i17 = 16;
                        } else {
                            i17 = 64;
                        }
                        iF = 8;
                        i19 = 8;
                        for (i18 = 0; i18 < i17; i18++) {
                            if (iF != 0) {
                                iF = ((ta1Var.f() + i19) + NotificationCompat.FLAG_LOCAL_ONLY) % NotificationCompat.FLAG_LOCAL_ONLY;
                            }
                            if (iF != 0) {
                                i19 = iF;
                            }
                        }
                    }
                }
            }
            i14 = iG5;
        } else if (iE3 == 138) {
            iE3 = 138;
            iG = ta1Var.g();
            if (iG == 3) {
                ta1Var.d();
                i12 = 3;
            } else {
                i12 = iG;
            }
            i13 = 16;
            iG2 = ta1Var.g();
            int iG6 = ta1Var.g();
            ta1Var.a();
            if (ta1Var.d()) {
                if (i12 != 3) {
                    i15 = 8;
                } else {
                    i15 = 12;
                }
                while (i16 < i15) {
                    if (!ta1Var.d()) {
                        if (i16 < 6) {
                            i17 = 16;
                        } else {
                            i17 = 64;
                        }
                        iF = 8;
                        i19 = 8;
                        while (i18 < i17) {
                            if (iF != 0) {
                                iF = ((ta1Var.f() + i19) + NotificationCompat.FLAG_LOCAL_ONLY) % NotificationCompat.FLAG_LOCAL_ONLY;
                            }
                            if (iF != 0) {
                                i19 = iF;
                            }
                        }
                    }
                }
            }
            i14 = iG6;
        } else {
            iG = 1;
            i13 = 16;
            i14 = 0;
            iG2 = 0;
        }
        ta1Var.g();
        int iG7 = ta1Var.g();
        if (iG7 == 0) {
            ta1Var.g();
        } else if (iG7 == 1) {
            ta1Var.d();
            ta1Var.f();
            ta1Var.f();
            long jG = ta1Var.g();
            for (int i29 = 0; i29 < jG; i29++) {
                ta1Var.g();
            }
        }
        ta1Var.g();
        ta1Var.a();
        int iG8 = ta1Var.g() + 1;
        int iG9 = ta1Var.g() + 1;
        boolean zD3 = ta1Var.d();
        int i30 = 2 - (zD3 ? 1 : 0);
        if (!zD3) {
            ta1Var.a();
        }
        ta1Var.a();
        int iB = iG8 * 16;
        int iB2 = iG9 * i30 * 16;
        if (ta1Var.d()) {
            int iG10 = ta1Var.g();
            int iG11 = ta1Var.g();
            int iG12 = ta1Var.g();
            int iG13 = ta1Var.g();
            if (iG == 0) {
                i28 = 1;
            } else {
                int i31 = iG == 3 ? 1 : 2;
                i30 *= iG == 1 ? 2 : 1;
                i28 = i31;
            }
            iB = l1.d.b(iG10, iG11, i28, iB);
            iB2 = l1.d.b(iG12, iG13, i30, iB2);
        }
        int i32 = iB;
        int i33 = iB2;
        if (iE3 != 44 && iE3 != 86 && iE3 != 100 && iE3 != 110 && iE3 != 122) {
            if (iE3 == 244) {
                i20 = 244;
            } else {
                iG3 = i13;
                i21 = iE3;
            }
            i22 = -1;
            if (ta1Var.d()) {
                if (ta1Var.d()) {
                    iE = ta1Var.e(8);
                    if (iE == 255) {
                        int i34 = i13;
                        iE2 = ta1Var.e(i34);
                        int iE6 = ta1Var.e(i34);
                        if (iE2 != 0 || iE6 == 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = iE2 / iE6;
                        }
                    } else if (iE < 17) {
                        f11 = f13742o[iE];
                    } else {
                        com.applovin.impl.ca.r(new StringBuilder(String.valueOf(iE).length() + 35), "Unexpected aspect_ratio_idc value: ", iE, "NalUnitUtil");
                        f11 = 1.0f;
                    }
                } else {
                    f11 = 1.0f;
                }
                if (ta1Var.d()) {
                    ta1Var.a();
                }
                if (ta1Var.d()) {
                    ta1Var.b(3);
                    int i35 = true != ta1Var.d() ? 2 : 1;
                    if (ta1Var.d()) {
                        int iE7 = ta1Var.e(8);
                        int iE8 = ta1Var.e(8);
                        ta1Var.b(8);
                        int iB3 = lq1.b(iE7);
                        iC = lq1.c(iE8);
                        i27 = iB3;
                    } else {
                        i27 = -1;
                        iC = -1;
                    }
                    i22 = i35;
                } else {
                    i27 = -1;
                    iC = -1;
                }
                if (ta1Var.d()) {
                    ta1Var.g();
                    ta1Var.g();
                }
                if (ta1Var.d()) {
                    ta1Var.b(65);
                }
                zD = ta1Var.d();
                if (zD) {
                    P(ta1Var);
                }
                zD2 = ta1Var.d();
                if (zD2) {
                    P(ta1Var);
                }
                if (zD || zD2) {
                    ta1Var.a();
                }
                ta1Var.a();
                if (ta1Var.d()) {
                    ta1Var.a();
                    ta1Var.g();
                    ta1Var.g();
                    ta1Var.g();
                    ta1Var.g();
                    iG3 = ta1Var.g();
                    ta1Var.g();
                }
                i23 = i22;
                i24 = iC;
                f10 = f11;
                i25 = iG3;
                i26 = i27;
            } else {
                i23 = -1;
                i24 = -1;
                f10 = 1.0f;
                i25 = iG3;
                i26 = -1;
            }
            return new t61(i21, iE4, iE5, iG4, i32, i33, f10, iG2, i14, i26, i23, i24, i25);
        }
        i20 = iE3;
        if ((iE4 & 16) != 0) {
            i21 = i20;
            iG3 = 0;
        } else {
            iG3 = i13;
            i21 = i20;
        }
        i22 = -1;
        if (ta1Var.d()) {
            if (ta1Var.d()) {
                f11 = 1.0f;
            } else {
                iE = ta1Var.e(8);
                if (iE == 255) {
                    int i36 = i13;
                    iE2 = ta1Var.e(i36);
                    int iE9 = ta1Var.e(i36);
                    if (iE2 != 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = 1.0f;
                    }
                } else if (iE < 17) {
                    f11 = f13742o[iE];
                } else {
                    com.applovin.impl.ca.r(new StringBuilder(String.valueOf(iE).length() + 35), "Unexpected aspect_ratio_idc value: ", iE, "NalUnitUtil");
                    f11 = 1.0f;
                }
            }
            if (ta1Var.d()) {
                ta1Var.a();
            }
            if (ta1Var.d()) {
                ta1Var.b(3);
                if (true != ta1Var.d()) {
                }
                if (ta1Var.d()) {
                    int iE10 = ta1Var.e(8);
                    int iE11 = ta1Var.e(8);
                    ta1Var.b(8);
                    int iB4 = lq1.b(iE10);
                    iC = lq1.c(iE11);
                    i27 = iB4;
                } else {
                    i27 = -1;
                    iC = -1;
                }
                i22 = i35;
            } else {
                i27 = -1;
                iC = -1;
            }
            if (ta1Var.d()) {
                ta1Var.g();
                ta1Var.g();
            }
            if (ta1Var.d()) {
                ta1Var.b(65);
            }
            zD = ta1Var.d();
            if (zD) {
                P(ta1Var);
            }
            zD2 = ta1Var.d();
            if (zD2) {
                P(ta1Var);
            }
            if (zD) {
                ta1Var.a();
            } else {
                ta1Var.a();
            }
            ta1Var.a();
            if (ta1Var.d()) {
                ta1Var.a();
                ta1Var.g();
                ta1Var.g();
                ta1Var.g();
                ta1Var.g();
                iG3 = ta1Var.g();
                ta1Var.g();
            }
            i23 = i22;
            i24 = iC;
            f10 = f11;
            i25 = iG3;
            i26 = i27;
        } else {
            i23 = -1;
            i24 = -1;
            f10 = 1.0f;
            i25 = iG3;
            i26 = -1;
        }
        return new t61(i21, iE4, iE5, iG4, i32, i33, f10, iG2, i14, i26, i23, i24, i25);
    }

    public static String G(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e10) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strJ = q4.a.j(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strJ), (Throwable) e10);
            String name2 = e10.getClass().getName();
            StringBuilder sb2 = new StringBuilder(strJ.length() + 8 + name2.length() + 1);
            d5.u.r(sb2, "<", strJ, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:484:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0112  */
    /* JADX WARN: Code duplicated, block: B:66:0x012b  */
    /* JADX WARN: Code duplicated, block: B:70:0x013e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0143  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static uw H(byte[] bArr, int i10, int i11) {
        u31 u31Var;
        boolean z10;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        boolean z11;
        int i12;
        int[] iArr;
        boolean[][] zArr;
        ya1 ya1Var;
        boolean[][] zArr2;
        int[] iArr2;
        int i13;
        int i14;
        boolean zD;
        int i15;
        int i16;
        int i17;
        int iG;
        int i18;
        int i19;
        int i20;
        boolean z12;
        boolean z13;
        ta1 ta1Var = new ta1(bArr, i10, i11);
        N(ta1Var);
        ta1Var.b(4);
        boolean zD2 = ta1Var.d();
        boolean zD3 = ta1Var.d();
        int iE5 = ta1Var.e(6);
        int i21 = iE5 + 1;
        int iE6 = ta1Var.e(3);
        ta1Var.b(17);
        j31 j31VarO = O(ta1Var, true, iE6, null);
        for (int i22 = true != ta1Var.d() ? iE6 : 0; i22 <= iE6; i22++) {
            ta1Var.g();
            ta1Var.g();
            ta1Var.g();
        }
        int iE7 = ta1Var.e(6);
        int iG2 = ta1Var.g() + 1;
        int i23 = 6;
        int i24 = 1;
        u31 u31Var2 = new u31(ca1.u(j31VarO), new int[1], 0);
        boolean z14 = i21 >= 2 && iG2 >= 2;
        boolean z15 = zD2 && zD3;
        int i25 = iE7 + 1;
        if (!z14 || !z15 || i25 < i21) {
            return new uw((ya1) null, u31Var2, (iw0) null, (u31) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, iG2, i25);
        int[] iArr4 = new int[iG2];
        int[] iArr5 = new int[iG2];
        iArr3[0][0] = 0;
        iArr4[0] = 1;
        iArr5[0] = 0;
        for (int i26 = 1; i26 < iG2; i26++) {
            int i27 = 0;
            for (int i28 = 0; i28 <= iE7; i28++) {
                if (ta1Var.d()) {
                    iArr3[i26][i27] = i28;
                    iArr5[i26] = i28;
                    i27++;
                }
                iArr4[i26] = i27;
            }
        }
        if (ta1Var.d()) {
            ta1Var.b(64);
            if (ta1Var.d()) {
                ta1Var.g();
            }
            int iG3 = ta1Var.g();
            int i29 = 0;
            while (i29 < iG3) {
                ta1Var.g();
                if (i29 == 0 || ta1Var.d()) {
                    boolean zD4 = ta1Var.d();
                    boolean zD5 = ta1Var.d();
                    z13 = zD4;
                    z12 = zD5;
                    if (zD4 || zD5) {
                        zD = ta1Var.d();
                        if (zD) {
                            ta1Var.b(19);
                        }
                        ta1Var.b(8);
                        if (zD) {
                            ta1Var.b(4);
                        }
                        ta1Var.b(15);
                        i16 = zD4;
                        i15 = zD5;
                    }
                    i17 = 0;
                    while (i17 <= iE6) {
                        if (!ta1Var.d() || ta1Var.d()) {
                            ta1Var.g();
                        } else {
                            if (ta1Var.d()) {
                                iG = 0;
                            }
                            int[][] iArr6 = iArr3;
                            i18 = i16 + i15;
                            int[] iArr7 = iArr5;
                            i19 = 0;
                            while (i19 < i18) {
                                int i30 = i18;
                                for (i20 = 0; i20 <= iG; i20++) {
                                    ta1Var.g();
                                    ta1Var.g();
                                    if (zD) {
                                        ta1Var.g();
                                        ta1Var.g();
                                    }
                                    ta1Var.a();
                                }
                                i19++;
                                i18 = i30;
                            }
                            i17++;
                            iArr3 = iArr6;
                            i29 = i29;
                            iArr5 = iArr7;
                        }
                        iG = ta1Var.g();
                        int[][] iArr8 = iArr3;
                        i18 = i16 + i15;
                        int[] iArr9 = iArr5;
                        i19 = 0;
                        while (i19 < i18) {
                            int i31 = i18;
                            while (i20 <= iG) {
                                ta1Var.g();
                                ta1Var.g();
                                if (zD) {
                                    ta1Var.g();
                                    ta1Var.g();
                                }
                                ta1Var.a();
                            }
                            i19++;
                            i18 = i31;
                        }
                        i17++;
                        iArr3 = iArr8;
                        i29 = i29;
                        iArr5 = iArr9;
                    }
                    i29++;
                } else {
                    z13 = false;
                    z12 = false;
                }
                zD = false;
                i16 = z13;
                i15 = z12;
                i17 = 0;
                while (i17 <= iE6) {
                    if (ta1Var.d()) {
                        ta1Var.g();
                        iG = ta1Var.g();
                    } else {
                        ta1Var.g();
                        iG = ta1Var.g();
                    }
                    int[][] iArr10 = iArr3;
                    i18 = i16 + i15;
                    int[] iArr11 = iArr5;
                    i19 = 0;
                    while (i19 < i18) {
                        int i32 = i18;
                        while (i20 <= iG) {
                            ta1Var.g();
                            ta1Var.g();
                            if (zD) {
                                ta1Var.g();
                                ta1Var.g();
                            }
                            ta1Var.a();
                        }
                        i19++;
                        i18 = i32;
                    }
                    i17++;
                    iArr3 = iArr10;
                    i29 = i29;
                    iArr5 = iArr11;
                }
                i29++;
            }
        }
        int[][] iArr12 = iArr3;
        int[] iArr13 = iArr5;
        if (!ta1Var.d()) {
            return new uw((ya1) null, u31Var2, (iw0) null, (u31) null);
        }
        int i33 = ta1Var.f20277d;
        if (i33 > 0) {
            ta1Var.b(8 - i33);
        }
        j31 j31VarO2 = O(ta1Var, false, iE6, j31VarO);
        boolean zD6 = ta1Var.d();
        boolean[] zArr3 = new boolean[16];
        int i34 = 0;
        for (int i35 = 0; i35 < 16; i35++) {
            boolean zD7 = ta1Var.d();
            zArr3[i35] = zD7;
            if (zD7) {
                i34++;
            }
        }
        if (i34 == 0 || !zArr3[1]) {
            return new uw((ya1) null, u31Var2, (iw0) null, (u31) null);
        }
        int i36 = i34 + 1;
        int[] iArr14 = new int[i34];
        for (int i37 = 0; i37 < i34 - (zD6 ? 1 : 0); i37++) {
            iArr14[i37] = ta1Var.e(3);
        }
        int[] iArr15 = new int[i36];
        if (zD6) {
            for (int i38 = 1; i38 < i34; i38++) {
                for (int i39 = 0; i39 < i38; i39++) {
                    iArr15[i38] = iArr14[i39] + 1 + iArr15[i38];
                }
            }
            iArr15[i34] = 6;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i21, i34);
        int[] iArr17 = new int[i21];
        iArr17[0] = 0;
        boolean zD8 = ta1Var.d();
        int i40 = 1;
        while (i40 < i21) {
            if (zD8) {
                iArr17[i40] = ta1Var.e(i23);
            } else {
                iArr17[i40] = i40;
            }
            if (zD6) {
                i14 = i40;
                int i41 = 0;
                while (i41 < i34) {
                    int i42 = i41 + 1;
                    iArr16[i14][i41] = (iArr17[i14] & ((1 << iArr15[i42]) - 1)) >> iArr15[i41];
                    i41 = i42;
                }
            } else {
                int i43 = 0;
                while (i43 < i34) {
                    iArr16[i40][i43] = ta1Var.e(iArr14[i43] + 1);
                    i43++;
                    i40 = i40;
                }
                i14 = i40;
            }
            i40 = i14 + 1;
            i23 = 6;
        }
        int[] iArr18 = new int[i25];
        int i44 = 1;
        int i45 = 0;
        while (i45 < i21) {
            iArr18[iArr17[i45]] = -1;
            int[] iArr19 = iArr18;
            int i46 = 0;
            int i47 = 0;
            while (i46 < 16) {
                if (zArr3[i46]) {
                    i13 = i24;
                    if (i46 == i13) {
                        iArr19[iArr17[i45]] = iArr16[i45][i47];
                        i46 = i13;
                    }
                    i47++;
                } else {
                    i13 = i24;
                }
                i46 += i13;
                i24 = i13;
            }
            if (i45 > 0) {
                int i48 = 0;
                while (true) {
                    if (i48 >= i45) {
                        i44++;
                        break;
                    }
                    int i49 = i48;
                    if (iArr19[iArr17[i45]] == iArr19[iArr17[i48]]) {
                        break;
                    }
                    i48 = i49 + 1;
                }
            }
            i45++;
            iArr18 = iArr19;
            i24 = 1;
        }
        int[] iArr20 = iArr18;
        int iE8 = ta1Var.e(4);
        if (i44 < 2 || iE8 == 0) {
            return new uw((ya1) null, u31Var2, (iw0) null, (u31) null);
        }
        int[] iArr21 = new int[i44];
        for (int i50 = 0; i50 < i44; i50++) {
            iArr21[i50] = ta1Var.e(iE8);
        }
        int[] iArr22 = new int[i25];
        int i51 = 0;
        while (i51 < i21) {
            int[] iArr23 = iArr22;
            iArr23[Math.min(iArr17[i51], iE7)] = i51;
            i51++;
            iArr22 = iArr23;
        }
        int[] iArr24 = iArr22;
        String str = "initialCapacity";
        rb0.p(4, "initialCapacity");
        int i52 = i44;
        Object[] objArrCopyOf = new Object[4];
        int i53 = 0;
        int i54 = 0;
        while (i54 <= iE7) {
            int[] iArr25 = iArr17;
            int i55 = i54;
            int iMin = Math.min(iArr20[i54], i52 - 1);
            int[] iArr26 = iArr4;
            j21 j21Var = new j21(iArr24[i55], iMin >= 0 ? iArr21[iMin] : -1);
            int length = objArrCopyOf.length;
            int i56 = i53 + 1;
            int iD = x91.d(length, i56);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i53] = j21Var;
            i54 = i55 + 1;
            i53 = i56;
            iArr17 = iArr25;
            iArr4 = iArr26;
        }
        int[] iArr27 = iArr17;
        int[] iArr28 = iArr4;
        ya1 ya1VarA = ca1.A(i53, objArrCopyOf);
        if (((j21) ya1VarA.get(0)).f15938b == -1) {
            return new uw((ya1) null, u31Var2, (iw0) null, (u31) null);
        }
        int i57 = 1;
        while (true) {
            if (i57 > iE7) {
                i57 = -1;
                break;
            }
            if (((j21) ya1VarA.get(i57)).f15938b != -1) {
                break;
            }
            i57++;
        }
        if (i57 == -1) {
            return new uw((ya1) null, u31Var2, (iw0) null, (u31) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i21, i21);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i21, i21);
        int i58 = 1;
        while (i58 < i21) {
            boolean[][] zArr6 = zArr5;
            for (int i59 = 0; i59 < i58; i59++) {
                boolean[] zArr7 = zArr4[i58];
                boolean[] zArr8 = zArr6[i58];
                boolean zD9 = ta1Var.d();
                zArr8[i59] = zD9;
                zArr7[i59] = zD9;
            }
            i58++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i60 = 1; i60 < i21; i60++) {
            int i61 = 0;
            while (i61 < iE5) {
                boolean[][] zArr10 = zArr4;
                for (int i62 = 0; i62 < i60; i62++) {
                    boolean[] zArr11 = zArr9[i60];
                    if (zArr11[i62] && zArr9[i62][i61]) {
                        zArr11[i61] = true;
                        break;
                    }
                }
                i61++;
                zArr4 = zArr10;
            }
        }
        boolean[][] zArr12 = zArr4;
        int[] iArr29 = new int[i25];
        for (int i63 = 0; i63 < i21; i63++) {
            int i64 = 0;
            for (int i65 = 0; i65 < i63; i65++) {
                i64 += zArr12[i63][i65] ? 1 : 0;
            }
            iArr29[iArr27[i63]] = i64;
        }
        int i66 = 0;
        for (int i67 = 0; i67 < i21; i67++) {
            if (iArr29[iArr27[i67]] == 0) {
                i66++;
            }
        }
        if (i66 > 1) {
            return new uw((ya1) null, u31Var2, (iw0) null, (u31) null);
        }
        int[] iArr30 = new int[i21];
        int[] iArr31 = new int[iG2];
        if (ta1Var.d()) {
            int i68 = 0;
            while (i68 < i21) {
                int i69 = i68;
                iArr30[i69] = ta1Var.e(3);
                i68 = i69 + 1;
            }
        } else {
            Arrays.fill(iArr30, 0, i21, iE6);
        }
        int i70 = 0;
        while (i70 < iG2) {
            int i71 = i70;
            int[] iArr32 = iArr30;
            int[] iArr33 = iArr31;
            int iMax = 0;
            for (int i72 = 0; i72 < iArr28[i71]; i72++) {
                iMax = Math.max(iMax, iArr32[((j21) ya1VarA.get(iArr12[i71][i72])).f15937a]);
            }
            iArr33[i71] = iMax + 1;
            i70 = i71 + 1;
            iArr30 = iArr32;
            iArr31 = iArr33;
        }
        int[] iArr34 = iArr31;
        if (ta1Var.d()) {
            int i73 = 0;
            while (i73 < iE5) {
                int i74 = i73 + 1;
                int i75 = i74;
                while (i75 < i21) {
                    if (zArr12[i75][i73]) {
                        ta1Var.b(3);
                    }
                    i75++;
                    iE5 = iE5;
                }
                i73 = i74;
            }
        }
        ta1Var.a();
        int iG4 = ta1Var.g() + 1;
        z91 z91Var = new z91(4);
        z91Var.a(j31VarO);
        if (iG4 > 1) {
            z91Var.a(j31VarO2);
            for (int i76 = 2; i76 < iG4; i76++) {
                j31VarO2 = O(ta1Var, ta1Var.d(), iE6, j31VarO2);
                z91Var.a(j31VarO2);
            }
        }
        ya1 ya1VarF = z91Var.f();
        int iG5 = ta1Var.g() + iG2;
        if (iG5 > iG2) {
            return new uw((ya1) null, u31Var2, (iw0) null, (u31) null);
        }
        int iE9 = ta1Var.e(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iG5, i25);
        int[] iArr35 = new int[iG5];
        int i77 = 0;
        int[] iArr36 = new int[iG5];
        int i78 = 0;
        while (i78 < iG2) {
            iArr35[i78] = i77;
            int i79 = i78;
            int i80 = iArr13[i79];
            iArr36[i79] = i80;
            if (iE9 == 0) {
                zArr2 = zArr13;
                ya1Var = ya1VarF;
                iArr2 = iArr35;
                Arrays.fill(zArr13[i79], i77, iArr28[i79], true);
                iArr2[i79] = iArr28[i79];
            } else {
                ya1Var = ya1VarF;
                zArr2 = zArr13;
                iArr2 = iArr35;
                if (iE9 == 1) {
                    for (int i81 = 0; i81 < iArr28[i79]; i81++) {
                        zArr2[i79][i81] = iArr12[i79][i81] == i80;
                    }
                    iArr2[i79] = 1;
                } else {
                    i77 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i78 = i79 + 1;
                zArr13 = zArr2;
                iArr35 = iArr2;
                ya1VarF = ya1Var;
            }
            i77 = 0;
            i78 = i79 + 1;
            zArr13 = zArr2;
            iArr35 = iArr2;
            ya1VarF = ya1Var;
        }
        ya1 ya1Var2 = ya1VarF;
        boolean[][] zArr14 = zArr13;
        int[] iArr37 = iArr35;
        int[] iArr38 = new int[i25];
        int i82 = 2;
        int[] iArr39 = new int[2];
        iArr39[1] = i25;
        iArr39[i77] = iG5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr39);
        int i83 = 1;
        int i84 = 0;
        while (i83 < iG5) {
            if (iE9 == i82) {
                for (int i85 = 0; i85 < iArr28[i83]; i85++) {
                    zArr14[i83][i85] = ta1Var.d();
                    int i86 = iArr37[i83];
                    boolean z16 = zArr14[i83][i85];
                    iArr37[i83] = i86 + (z16 ? 1 : 0);
                    if (z16) {
                        iArr36[i83] = iArr12[i83][i85];
                    }
                }
            }
            if (i84 == 0) {
                i12 = 0;
                if (iArr12[i83][0] == 0 && zArr14[i83][0]) {
                    i84 = 0;
                    for (int i87 = 1; i87 < iArr28[i83]; i87++) {
                        if (iArr12[i83][i87] == i57 && zArr14[i83][i57]) {
                            i84 = i83;
                        }
                    }
                } else {
                    i84 = 0;
                }
            } else {
                i12 = 0;
            }
            int i88 = i12;
            while (i88 < iArr28[i83]) {
                if (iG4 > 1) {
                    zArr15[i83][i88] = zArr14[i83][i88];
                    iArr = iArr38;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iB = ac1.b(iG4);
                    if (!zArr[i83][i88]) {
                        int i89 = ((j21) ya1VarA.get(iArr12[i83][i88])).f15937a;
                        int i90 = i12;
                        while (i90 < i88) {
                            int i91 = i90;
                            if (zArr9[i89][((j21) ya1VarA.get(iArr12[i83][i91])).f15937a]) {
                                zArr[i83][i88] = true;
                                break;
                            }
                            i90 = i91 + 1;
                        }
                    }
                    if (zArr[i83][i88]) {
                        if (i84 <= 0 || i83 != i84) {
                            ta1Var.b(iB);
                        } else {
                            iArr[i88] = ta1Var.e(iB);
                        }
                    }
                } else {
                    iArr = iArr38;
                    zArr = zArr15;
                }
                i88++;
                iArr38 = iArr;
                zArr15 = zArr;
            }
            int[] iArr40 = iArr38;
            boolean[][] zArr16 = zArr15;
            if (iArr37[i83] == 1 && iArr29[iArr36[i83]] > 0) {
                ta1Var.a();
            }
            i83++;
            iArr38 = iArr40;
            zArr15 = zArr16;
            i82 = 2;
        }
        int[] iArr41 = iArr38;
        boolean[][] zArr17 = zArr15;
        if (i84 == 0) {
            return new uw((ya1) null, u31Var2, (iw0) null, (u31) null);
        }
        int iG6 = ta1Var.g();
        int i92 = iG6 + 1;
        String str2 = "expectedSize";
        rb0.p(i92, "expectedSize");
        rb0.p(i92, "initialCapacity");
        int[] iArr42 = new int[i21];
        Object[] objArrCopyOf2 = new Object[i92];
        int i93 = 0;
        int i94 = 0;
        boolean z17 = false;
        while (i93 < i92) {
            int i95 = i93;
            int iE10 = ta1Var.e(16);
            boolean z18 = z17;
            int iE11 = ta1Var.e(16);
            if (ta1Var.d()) {
                iE2 = ta1Var.e(2);
                if (iE2 == 3) {
                    ta1Var.a();
                }
                iE3 = ta1Var.e(4);
                iE4 = ta1Var.e(4);
            } else {
                iE2 = 0;
                iE3 = 0;
                iE4 = 0;
            }
            if (ta1Var.d()) {
                int iG7 = ta1Var.g();
                int iG8 = ta1Var.g();
                int iG9 = ta1Var.g();
                int iG10 = ta1Var.g();
                iE10 = l1.d.b(iG7, iG8, (iE2 == 1 || iE2 == 2) ? 2 : 1, iE10);
                iE11 = l1.d.b(iG9, iG10, iE2 == 1 ? 2 : 1, iE11);
            }
            e41 e41Var = new e41(iE2, iE3, iE4, iE10, iE11);
            int length2 = objArrCopyOf2.length;
            int iD2 = x91.d(length2, i94 + 1);
            if (iD2 > length2 || z18) {
                objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iD2);
                z11 = false;
            } else {
                z11 = z18;
            }
            objArrCopyOf2[i94] = e41Var;
            i93 = i95 + 1;
            i94++;
            iArr41 = iArr41;
            ya1VarA = ya1VarA;
            str = str;
            str2 = str2;
            iG2 = iG2;
            z17 = z11;
        }
        String str3 = str;
        String str4 = str2;
        ya1 ya1Var3 = ya1VarA;
        int i96 = iG2;
        int[] iArr43 = iArr41;
        if (i92 <= 1 || !ta1Var.d()) {
            for (int i97 = 1; i97 < i21; i97++) {
                iArr42[i97] = Math.min(i97, iG6);
            }
        } else {
            double d10 = i92;
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iB2 = ac1.b(d10);
            for (int i98 = 1; i98 < i21; i98++) {
                iArr42[i98] = ta1Var.e(iB2);
            }
        }
        iw0 iw0Var = new iw0(ca1.A(i94, objArrCopyOf2), iArr42);
        ta1Var.b(2);
        for (int i99 = 1; i99 < i21; i99++) {
            if (iArr29[iArr27[i99]] == 0) {
                ta1Var.a();
            }
        }
        for (int i100 = 1; i100 < iG5; i100++) {
            boolean zD10 = ta1Var.d();
            int i101 = 0;
            while (i101 < iArr34[i100]) {
                if ((i101 <= 0 || !zD10) ? i101 == 0 : ta1Var.d()) {
                    for (int i102 = 0; i102 < iArr28[i100]; i102++) {
                        if (zArr17[i100][i102]) {
                            ta1Var.g();
                        }
                    }
                    ta1Var.g();
                    ta1Var.g();
                }
                i101++;
            }
        }
        int iG11 = ta1Var.g() + 2;
        if (ta1Var.d()) {
            ta1Var.b(iG11);
        } else {
            for (int i103 = 1; i103 < i21; i103++) {
                for (int i104 = 0; i104 < i103; i104++) {
                    if (zArr12[i103][i104]) {
                        ta1Var.b(iG11);
                    }
                }
            }
        }
        int iG12 = ta1Var.g();
        for (int i105 = 1; i105 <= iG12; i105++) {
            ta1Var.b(8);
        }
        if (ta1Var.d()) {
            int i106 = ta1Var.f20277d;
            if (i106 > 0) {
                ta1Var.b(8 - i106);
            }
            if (ta1Var.d() || ta1Var.d()) {
                ta1Var.a();
            }
            boolean zD11 = ta1Var.d();
            boolean zD12 = ta1Var.d();
            if (zD11 || zD12) {
                for (int i107 = 0; i107 < i96; i107++) {
                    for (int i108 = 0; i108 < iArr34[i107]; i108++) {
                        boolean zD13 = zD11 ? ta1Var.d() : false;
                        boolean zD14 = zD12 ? ta1Var.d() : false;
                        if (zD13) {
                            ta1Var.b(32);
                        }
                        if (zD14) {
                            ta1Var.b(18);
                        }
                    }
                }
            }
            boolean zD15 = ta1Var.d();
            if (zD15) {
                z10 = true;
                iE = ta1Var.e(4) + 1;
            } else {
                z10 = true;
                iE = i21;
            }
            rb0.p(iE, str4);
            rb0.p(iE, str3);
            int[] iArr44 = new int[i21];
            Object[] objArrCopyOf3 = new Object[iE];
            int i109 = 0;
            int i110 = 0;
            boolean z19 = false;
            while (i109 < iE) {
                ta1Var.b(3);
                int i111 = z10 != ta1Var.d() ? 2 : 1;
                int iB3 = lq1.b(ta1Var.e(8));
                int iC = lq1.c(ta1Var.e(8));
                ta1Var.b(8);
                r51 r51Var = new r51(iB3, i111, iC);
                int length3 = objArrCopyOf3.length;
                int iD3 = x91.d(length3, i110 + 1);
                if (iD3 > length3 || z19) {
                    objArrCopyOf3 = Arrays.copyOf(objArrCopyOf3, iD3);
                    z19 = false;
                }
                objArrCopyOf3[i110] = r51Var;
                i109++;
                i110++;
                z10 = true;
                z19 = z19;
            }
            if (zD15 && iE > 1) {
                for (int i112 = 0; i112 < i21; i112++) {
                    iArr44[i112] = ta1Var.e(4);
                }
            }
            u31Var = new u31(ca1.A(i110, objArrCopyOf3), iArr44, 1);
        } else {
            u31Var = null;
        }
        return new uw(ya1Var3, new u31(ya1Var2, iArr43, 0), iw0Var, u31Var);
    }

    public static boolean I(kb1 kb1Var, Collection collection) {
        collection.getClass();
        if (collection instanceof va1) {
            collection = ((va1) collection).zza();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= kb1Var.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= kb1Var.remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it2 = kb1Var.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:154:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:158:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:162:0x02d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:170:0x0302  */
    /* JADX WARN: Code duplicated, block: B:172:0x0309 A[LOOP:12: B:171:0x0307->B:172:0x0309, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x031d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0323  */
    /* JADX WARN: Code duplicated, block: B:179:0x032d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0339 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:183:0x033f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0343  */
    /* JADX WARN: Code duplicated, block: B:186:0x0348  */
    /* JADX WARN: Code duplicated, block: B:189:0x0364  */
    /* JADX WARN: Code duplicated, block: B:192:0x036d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0378  */
    /* JADX WARN: Code duplicated, block: B:195:0x037a  */
    /* JADX WARN: Code duplicated, block: B:198:0x0381  */
    /* JADX WARN: Code duplicated, block: B:199:0x0397  */
    /* JADX WARN: Code duplicated, block: B:201:0x039a  */
    /* JADX WARN: Code duplicated, block: B:202:0x039c  */
    /* JADX WARN: Code duplicated, block: B:206:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:210:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:213:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:215:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:216:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:58:0x0114  */
    /* JADX WARN: Code duplicated, block: B:60:0x011a  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0120 A[LOOP:0: B:63:0x011e->B:64:0x0120, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x013a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0155  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:76:0x0163  */
    /* JADX WARN: Code duplicated, block: B:78:0x0169  */
    /* JADX WARN: Code duplicated, block: B:80:0x016c  */
    /* JADX WARN: Code duplicated, block: B:82:0x016f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Code duplicated, block: B:86:0x017a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0189  */
    /* JADX WARN: Code duplicated, block: B:91:0x018f A[LOOP:3: B:90:0x018d->B:91:0x018f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x0197  */
    /* JADX WARN: Code duplicated, block: B:94:0x0199  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ae  */
    public static h51 J(byte[] bArr, int i10, int i11, uw uwVar) {
        int i12;
        boolean z10;
        int i13;
        int iB;
        int iB2;
        int iG;
        int i14;
        int i15;
        int i16;
        int iG2;
        int i17;
        int iG3;
        int i18;
        int i19;
        int iG4;
        int[] iArr;
        int[] iArrCopyOf;
        int i20;
        int i21;
        int iG5;
        int i22;
        int i23;
        int i24;
        float f10;
        int i25;
        int i26;
        int i27;
        int iC;
        u31 u31Var;
        int i28;
        ca1 ca1Var;
        int iB3;
        int iE;
        int iE2;
        int iE3;
        int iG6;
        int i29;
        int iG7;
        int[] iArr2;
        int i30;
        int[] iArr3;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int iMin;
        int i37;
        int i38;
        int i39;
        int iMax;
        iw0 iw0Var;
        t0 t0VarN = N(new ta1(bArr, i10, i11));
        int i40 = 2;
        ta1 ta1Var = new ta1(bArr, i10 + 2, i11);
        int i41 = 4;
        ta1Var.b(4);
        int iE4 = ta1Var.e(3);
        int i42 = t0VarN.f20104b;
        int i43 = 1;
        if (i42 == 0 || iE4 != 7) {
            i12 = iE4;
            z10 = false;
        } else {
            z10 = true;
            i12 = 7;
        }
        if (uwVar != null) {
            ca1 ca1Var2 = (ca1) uwVar.f20919c;
            if (ca1Var2.isEmpty()) {
                i13 = 0;
            } else {
                i13 = ((j21) ca1Var2.get(Math.min(i42, ca1Var2.size() - 1))).f15937a;
            }
        } else {
            i13 = 0;
        }
        j31 j31VarO = null;
        if (!z10) {
            ta1Var.a();
            j31VarO = O(ta1Var, true, i12, null);
        } else if (uwVar != null) {
            u31 u31Var2 = (u31) uwVar.f20920d;
            int i44 = u31Var2.f20610b[i13];
            ca1 ca1Var3 = u31Var2.f20609a;
            if (ca1Var3.size() > i44) {
                j31VarO = (j31) ca1Var3.get(i44);
            }
        }
        j31 j31Var = j31VarO;
        ta1Var.g();
        if (z10) {
            int iE5 = ta1Var.d() ? ta1Var.e(8) : -1;
            if (uwVar != null && (iw0Var = (iw0) uwVar.f20921e) != null) {
                if (iE5 == -1) {
                    iE5 = ((int[]) iw0Var.f15865c)[i13];
                }
                if (iE5 != -1) {
                    ca1 ca1Var4 = (ca1) iw0Var.f15864b;
                    if (ca1Var4.size() > iE5) {
                        e41 e41Var = (e41) ca1Var4.get(iE5);
                        int i45 = e41Var.f13829a;
                        int i46 = e41Var.f13832d;
                        int i47 = e41Var.f13833e;
                        iG = e41Var.f13830b;
                        i14 = i46;
                        iB2 = i47;
                        i15 = iB2;
                        iG2 = e41Var.f13831c;
                        i16 = i14;
                    }
                    iG3 = ta1Var.g();
                    if (z10) {
                        i18 = -1;
                    } else {
                        if (true != ta1Var.d()) {
                            i39 = i12;
                        } else {
                            i39 = 0;
                        }
                        iMax = -1;
                        while (i39 <= i12) {
                            ta1Var.g();
                            iMax = Math.max(ta1Var.g(), iMax);
                            ta1Var.g();
                            i39++;
                            i43 = i43;
                        }
                        i18 = iMax;
                    }
                    i19 = i43;
                    ta1Var.g();
                    ta1Var.g();
                    ta1Var.g();
                    ta1Var.g();
                    ta1Var.g();
                    ta1Var.g();
                    if (ta1Var.d()) {
                        if (!z10 && ta1Var.d()) {
                            ta1Var.b(6);
                        } else if (ta1Var.d()) {
                            i35 = 0;
                            while (i35 < i41) {
                                i36 = 0;
                                while (i36 < 6) {
                                    if (ta1Var.d()) {
                                        iMin = Math.min(64, i19 << ((i35 + i35) + i41));
                                        if (i35 > i19) {
                                            ta1Var.f();
                                        }
                                        for (i37 = 0; i37 < iMin; i37++) {
                                            ta1Var.f();
                                        }
                                    } else {
                                        ta1Var.g();
                                    }
                                    if (i35 == 3) {
                                        i38 = 3;
                                    } else {
                                        i38 = 1;
                                    }
                                    i36 += i38;
                                    i41 = 4;
                                    i19 = 1;
                                }
                                i35++;
                                i41 = 4;
                                i19 = 1;
                            }
                        }
                    }
                    ta1Var.b(2);
                    if (ta1Var.d()) {
                        ta1Var.b(8);
                        ta1Var.g();
                        ta1Var.g();
                        ta1Var.a();
                    }
                    iG4 = ta1Var.g();
                    iArr = new int[0];
                    iArrCopyOf = new int[0];
                    i20 = iB2;
                    i21 = 0;
                    iG5 = -1;
                    i22 = -1;
                    while (i21 < iG4) {
                        if (i21 == 0 && ta1Var.d()) {
                            int i48 = i22 + iG5;
                            boolean zD = ta1Var.d();
                            boolean z11 = true;
                            int iG8 = ta1Var.g() + 1;
                            int i49 = 1 - ((zD ? 1 : 0) + (zD ? 1 : 0));
                            int i50 = i48 + 1;
                            boolean[] zArr = new boolean[i50];
                            int i51 = 0;
                            while (i51 <= i48) {
                                if (ta1Var.d()) {
                                    zArr[i51] = z11;
                                } else {
                                    zArr[i51] = ta1Var.d();
                                }
                                i51++;
                                z11 = true;
                            }
                            int i52 = iG5 - 1;
                            int[] iArr4 = new int[i50];
                            int[] iArr5 = new int[i50];
                            int i53 = 0;
                            while (true) {
                                i34 = i49 * iG8;
                                if (i52 < 0) {
                                    break;
                                }
                                int i54 = iArrCopyOf[i52] + i34;
                                if (i54 < 0 && zArr[i22 + i52]) {
                                    iArr4[i53] = i54;
                                    i53++;
                                }
                                i52--;
                            }
                            if (i34 < 0 && zArr[i48]) {
                                iArr4[i53] = i34;
                                i53++;
                            }
                            int[] iArr6 = iArr;
                            int i55 = i53;
                            for (int i56 = 0; i56 < i22; i56++) {
                                int i57 = iArr6[i56] + i34;
                                if (i57 < 0 && zArr[i56]) {
                                    iArr4[i55] = i57;
                                    i55++;
                                }
                            }
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i55);
                            int i58 = 0;
                            for (int i59 = i22 - 1; i59 >= 0; i59--) {
                                int i60 = iArr6[i59] + i34;
                                if (i60 > 0 && zArr[i59]) {
                                    iArr5[i58] = i60;
                                    i58++;
                                }
                            }
                            if (i34 > 0 && zArr[i48]) {
                                iArr5[i58] = i34;
                                i58++;
                            }
                            int i61 = i58;
                            for (int i62 = 0; i62 < iG5; i62++) {
                                int i63 = iArrCopyOf[i62] + i34;
                                if (i63 > 0 && zArr[i22 + i62]) {
                                    iArr5[i61] = i63;
                                    i61++;
                                }
                            }
                            iArrCopyOf = Arrays.copyOf(iArr5, i61);
                            i22 = i55;
                            iG5 = i61;
                            iArr = iArrCopyOf2;
                        } else {
                            iG7 = ta1Var.g();
                            iG5 = ta1Var.g();
                            iArr2 = new int[iG7];
                            for (i30 = 0; i30 < iG7; i30++) {
                                if (i30 > 0) {
                                    i33 = iArr2[i30 - 1];
                                } else {
                                    i33 = 0;
                                }
                                iArr2[i30] = i33 - (ta1Var.g() + 1);
                                ta1Var.a();
                            }
                            iArr3 = new int[iG5];
                            for (i31 = 0; i31 < iG5; i31++) {
                                if (i31 > 0) {
                                    i32 = iArr3[i31 - 1];
                                } else {
                                    i32 = 0;
                                }
                                iArr3[i31] = ta1Var.g() + 1 + i32;
                                ta1Var.a();
                            }
                            iArr = iArr2;
                            iArrCopyOf = iArr3;
                            i22 = iG7;
                        }
                        i21++;
                        iG4 = iG4;
                        i13 = i13;
                        iG3 = iG3;
                    }
                    i23 = i13;
                    i24 = iG3;
                    if (ta1Var.d()) {
                        iG6 = ta1Var.g();
                        for (i29 = 0; i29 < iG6; i29++) {
                            ta1Var.b(i24 + 5);
                        }
                    }
                    ta1Var.b(2);
                    f10 = 1.0f;
                    if (ta1Var.d()) {
                        if (ta1Var.d()) {
                            iE = ta1Var.e(8);
                            if (iE == 255) {
                                iE2 = ta1Var.e(16);
                                iE3 = ta1Var.e(16);
                                if (iE2 != 0 && iE3 != 0) {
                                    f10 = iE2 / iE3;
                                }
                            } else if (iE < 17) {
                                f10 = f13742o[iE];
                            } else {
                                com.applovin.impl.ca.r(new StringBuilder(String.valueOf(iE).length() + 35), "Unexpected aspect_ratio_idc value: ", iE, "NalUnitUtil");
                            }
                        }
                        if (ta1Var.d()) {
                            ta1Var.a();
                        }
                        if (ta1Var.d()) {
                            ta1Var.b(3);
                            if (true != ta1Var.d()) {
                                i27 = 2;
                            } else {
                                i27 = 1;
                            }
                            if (ta1Var.d()) {
                                int iE6 = ta1Var.e(8);
                                int iE7 = ta1Var.e(8);
                                ta1Var.b(8);
                                iB3 = lq1.b(iE6);
                                iC = lq1.c(iE7);
                            } else {
                                iC = -1;
                                iB3 = -1;
                            }
                        } else {
                            if (uwVar != null && (u31Var = (u31) uwVar.f20918b) != null) {
                                i28 = u31Var.f20610b[i23];
                                ca1Var = u31Var.f20609a;
                                if (ca1Var.size() > i28) {
                                    r51 r51Var = (r51) ca1Var.get(i28);
                                    iB3 = r51Var.f19406a;
                                    int i64 = r51Var.f19407b;
                                    iC = r51Var.f19408c;
                                    i27 = i64;
                                }
                            }
                            iC = -1;
                            i27 = -1;
                            iB3 = -1;
                        }
                        if (ta1Var.d()) {
                            ta1Var.g();
                            ta1Var.g();
                        }
                        ta1Var.a();
                        if (ta1Var.d()) {
                            i25 = i20 + i20;
                        } else {
                            i25 = i20;
                        }
                        i26 = iB3;
                    } else {
                        f10 = 1.0f;
                        i25 = i20;
                        i26 = -1;
                        i27 = -1;
                        iC = -1;
                    }
                    return new h51(i12, j31Var, i17, iG2, i16, i25, i14, i15, f10, i18, i26, i27, iC);
                }
            }
            iB2 = 0;
            i14 = 0;
            i17 = 0;
            iG2 = 0;
            i16 = 0;
            i15 = 0;
            iG3 = ta1Var.g();
            if (z10) {
                if (true != ta1Var.d()) {
                    i39 = i12;
                } else {
                    i39 = 0;
                }
                iMax = -1;
                while (i39 <= i12) {
                    ta1Var.g();
                    iMax = Math.max(ta1Var.g(), iMax);
                    ta1Var.g();
                    i39++;
                    i43 = i43;
                }
                i18 = iMax;
            } else {
                i18 = -1;
            }
            i19 = i43;
            ta1Var.g();
            ta1Var.g();
            ta1Var.g();
            ta1Var.g();
            ta1Var.g();
            ta1Var.g();
            if (ta1Var.d()) {
                if (!z10) {
                    if (ta1Var.d()) {
                        i35 = 0;
                        while (i35 < i41) {
                            i36 = 0;
                            while (i36 < 6) {
                                if (ta1Var.d()) {
                                    ta1Var.g();
                                } else {
                                    iMin = Math.min(64, i19 << ((i35 + i35) + i41));
                                    if (i35 > i19) {
                                        ta1Var.f();
                                    }
                                    while (i37 < iMin) {
                                        ta1Var.f();
                                    }
                                }
                                if (i35 == 3) {
                                    i38 = 3;
                                } else {
                                    i38 = 1;
                                }
                                i36 += i38;
                                i41 = 4;
                                i19 = 1;
                            }
                            i35++;
                            i41 = 4;
                            i19 = 1;
                        }
                    }
                } else if (ta1Var.d()) {
                    i35 = 0;
                    while (i35 < i41) {
                        i36 = 0;
                        while (i36 < 6) {
                            if (ta1Var.d()) {
                                ta1Var.g();
                            } else {
                                iMin = Math.min(64, i19 << ((i35 + i35) + i41));
                                if (i35 > i19) {
                                    ta1Var.f();
                                }
                                while (i37 < iMin) {
                                    ta1Var.f();
                                }
                            }
                            if (i35 == 3) {
                                i38 = 3;
                            } else {
                                i38 = 1;
                            }
                            i36 += i38;
                            i41 = 4;
                            i19 = 1;
                        }
                        i35++;
                        i41 = 4;
                        i19 = 1;
                    }
                }
            }
            ta1Var.b(2);
            if (ta1Var.d()) {
                ta1Var.b(8);
                ta1Var.g();
                ta1Var.g();
                ta1Var.a();
            }
            iG4 = ta1Var.g();
            iArr = new int[0];
            iArrCopyOf = new int[0];
            i20 = iB2;
            i21 = 0;
            iG5 = -1;
            i22 = -1;
            while (i21 < iG4) {
                if (i21 == 0) {
                    iG7 = ta1Var.g();
                    iG5 = ta1Var.g();
                    iArr2 = new int[iG7];
                    while (i30 < iG7) {
                        if (i30 > 0) {
                            i33 = iArr2[i30 - 1];
                        } else {
                            i33 = 0;
                        }
                        iArr2[i30] = i33 - (ta1Var.g() + 1);
                        ta1Var.a();
                    }
                    iArr3 = new int[iG5];
                    while (i31 < iG5) {
                        if (i31 > 0) {
                            i32 = iArr3[i31 - 1];
                        } else {
                            i32 = 0;
                        }
                        iArr3[i31] = ta1Var.g() + 1 + i32;
                        ta1Var.a();
                    }
                    iArr = iArr2;
                    iArrCopyOf = iArr3;
                    i22 = iG7;
                } else {
                    iG7 = ta1Var.g();
                    iG5 = ta1Var.g();
                    iArr2 = new int[iG7];
                    while (i30 < iG7) {
                        if (i30 > 0) {
                            i33 = iArr2[i30 - 1];
                        } else {
                            i33 = 0;
                        }
                        iArr2[i30] = i33 - (ta1Var.g() + 1);
                        ta1Var.a();
                    }
                    iArr3 = new int[iG5];
                    while (i31 < iG5) {
                        if (i31 > 0) {
                            i32 = iArr3[i31 - 1];
                        } else {
                            i32 = 0;
                        }
                        iArr3[i31] = ta1Var.g() + 1 + i32;
                        ta1Var.a();
                    }
                    iArr = iArr2;
                    iArrCopyOf = iArr3;
                    i22 = iG7;
                }
                i21++;
                iG4 = iG4;
                i13 = i13;
                iG3 = iG3;
            }
            i23 = i13;
            i24 = iG3;
            if (ta1Var.d()) {
                iG6 = ta1Var.g();
                while (i29 < iG6) {
                    ta1Var.b(i24 + 5);
                }
            }
            ta1Var.b(2);
            f10 = 1.0f;
            if (ta1Var.d()) {
                if (ta1Var.d()) {
                    iE = ta1Var.e(8);
                    if (iE == 255) {
                        iE2 = ta1Var.e(16);
                        iE3 = ta1Var.e(16);
                        if (iE2 != 0) {
                            f10 = iE2 / iE3;
                        }
                    } else if (iE < 17) {
                        f10 = f13742o[iE];
                    } else {
                        com.applovin.impl.ca.r(new StringBuilder(String.valueOf(iE).length() + 35), "Unexpected aspect_ratio_idc value: ", iE, "NalUnitUtil");
                    }
                }
                if (ta1Var.d()) {
                    ta1Var.a();
                }
                if (ta1Var.d()) {
                    ta1Var.b(3);
                    if (true != ta1Var.d()) {
                        i27 = 2;
                    } else {
                        i27 = 1;
                    }
                    if (ta1Var.d()) {
                        int iE8 = ta1Var.e(8);
                        int iE9 = ta1Var.e(8);
                        ta1Var.b(8);
                        iB3 = lq1.b(iE8);
                        iC = lq1.c(iE9);
                    } else {
                        iC = -1;
                        iB3 = -1;
                    }
                } else {
                    if (uwVar != null) {
                        i28 = u31Var.f20610b[i23];
                        ca1Var = u31Var.f20609a;
                        if (ca1Var.size() > i28) {
                            r51 r51Var2 = (r51) ca1Var.get(i28);
                            iB3 = r51Var2.f19406a;
                            int i65 = r51Var2.f19407b;
                            iC = r51Var2.f19408c;
                            i27 = i65;
                        }
                    }
                    iC = -1;
                    i27 = -1;
                    iB3 = -1;
                }
                if (ta1Var.d()) {
                    ta1Var.g();
                    ta1Var.g();
                }
                ta1Var.a();
                if (ta1Var.d()) {
                    i25 = i20 + i20;
                } else {
                    i25 = i20;
                }
                i26 = iB3;
            } else {
                f10 = 1.0f;
                i25 = i20;
                i26 = -1;
                i27 = -1;
                iC = -1;
            }
            return new h51(i12, j31Var, i17, iG2, i16, i25, i14, i15, f10, i18, i26, i27, iC);
        }
        int iG9 = ta1Var.g();
        if (iG9 == 3) {
            ta1Var.a();
            iG9 = 3;
        }
        int iG10 = ta1Var.g();
        int iG11 = ta1Var.g();
        if (ta1Var.d()) {
            int iG12 = ta1Var.g();
            int iG13 = ta1Var.g();
            int iG14 = ta1Var.g();
            int iG15 = ta1Var.g();
            if (iG9 != 1 && iG9 != 2) {
                i40 = 1;
            }
            iB = l1.d.b(iG12, iG13, i40, iG10);
            iB2 = l1.d.b(iG14, iG15, iG9 == 1 ? 2 : 1, iG11);
        } else {
            iB = iG10;
            iB2 = iG11;
        }
        iG = ta1Var.g();
        i14 = iG10;
        i15 = iG11;
        i16 = iB;
        iG2 = ta1Var.g();
        i17 = iG;
        iG3 = ta1Var.g();
        if (z10) {
            if (true != ta1Var.d()) {
                i39 = i12;
            } else {
                i39 = 0;
            }
            iMax = -1;
            while (i39 <= i12) {
                ta1Var.g();
                iMax = Math.max(ta1Var.g(), iMax);
                ta1Var.g();
                i39++;
                i43 = i43;
            }
            i18 = iMax;
        } else {
            i18 = -1;
        }
        i19 = i43;
        ta1Var.g();
        ta1Var.g();
        ta1Var.g();
        ta1Var.g();
        ta1Var.g();
        ta1Var.g();
        if (ta1Var.d()) {
            if (!z10) {
                if (ta1Var.d()) {
                    i35 = 0;
                    while (i35 < i41) {
                        i36 = 0;
                        while (i36 < 6) {
                            if (ta1Var.d()) {
                                ta1Var.g();
                            } else {
                                iMin = Math.min(64, i19 << ((i35 + i35) + i41));
                                if (i35 > i19) {
                                    ta1Var.f();
                                }
                                while (i37 < iMin) {
                                    ta1Var.f();
                                }
                            }
                            if (i35 == 3) {
                                i38 = 3;
                            } else {
                                i38 = 1;
                            }
                            i36 += i38;
                            i41 = 4;
                            i19 = 1;
                        }
                        i35++;
                        i41 = 4;
                        i19 = 1;
                    }
                }
            } else if (ta1Var.d()) {
                i35 = 0;
                while (i35 < i41) {
                    i36 = 0;
                    while (i36 < 6) {
                        if (ta1Var.d()) {
                            ta1Var.g();
                        } else {
                            iMin = Math.min(64, i19 << ((i35 + i35) + i41));
                            if (i35 > i19) {
                                ta1Var.f();
                            }
                            while (i37 < iMin) {
                                ta1Var.f();
                            }
                        }
                        if (i35 == 3) {
                            i38 = 3;
                        } else {
                            i38 = 1;
                        }
                        i36 += i38;
                        i41 = 4;
                        i19 = 1;
                    }
                    i35++;
                    i41 = 4;
                    i19 = 1;
                }
            }
        }
        ta1Var.b(2);
        if (ta1Var.d()) {
            ta1Var.b(8);
            ta1Var.g();
            ta1Var.g();
            ta1Var.a();
        }
        iG4 = ta1Var.g();
        iArr = new int[0];
        iArrCopyOf = new int[0];
        i20 = iB2;
        i21 = 0;
        iG5 = -1;
        i22 = -1;
        while (i21 < iG4) {
            if (i21 == 0) {
                iG7 = ta1Var.g();
                iG5 = ta1Var.g();
                iArr2 = new int[iG7];
                while (i30 < iG7) {
                    if (i30 > 0) {
                        i33 = iArr2[i30 - 1];
                    } else {
                        i33 = 0;
                    }
                    iArr2[i30] = i33 - (ta1Var.g() + 1);
                    ta1Var.a();
                }
                iArr3 = new int[iG5];
                while (i31 < iG5) {
                    if (i31 > 0) {
                        i32 = iArr3[i31 - 1];
                    } else {
                        i32 = 0;
                    }
                    iArr3[i31] = ta1Var.g() + 1 + i32;
                    ta1Var.a();
                }
                iArr = iArr2;
                iArrCopyOf = iArr3;
                i22 = iG7;
            } else {
                iG7 = ta1Var.g();
                iG5 = ta1Var.g();
                iArr2 = new int[iG7];
                while (i30 < iG7) {
                    if (i30 > 0) {
                        i33 = iArr2[i30 - 1];
                    } else {
                        i33 = 0;
                    }
                    iArr2[i30] = i33 - (ta1Var.g() + 1);
                    ta1Var.a();
                }
                iArr3 = new int[iG5];
                while (i31 < iG5) {
                    if (i31 > 0) {
                        i32 = iArr3[i31 - 1];
                    } else {
                        i32 = 0;
                    }
                    iArr3[i31] = ta1Var.g() + 1 + i32;
                    ta1Var.a();
                }
                iArr = iArr2;
                iArrCopyOf = iArr3;
                i22 = iG7;
            }
            i21++;
            iG4 = iG4;
            i13 = i13;
            iG3 = iG3;
        }
        i23 = i13;
        i24 = iG3;
        if (ta1Var.d()) {
            iG6 = ta1Var.g();
            while (i29 < iG6) {
                ta1Var.b(i24 + 5);
            }
        }
        ta1Var.b(2);
        f10 = 1.0f;
        if (ta1Var.d()) {
            if (ta1Var.d()) {
                iE = ta1Var.e(8);
                if (iE == 255) {
                    iE2 = ta1Var.e(16);
                    iE3 = ta1Var.e(16);
                    if (iE2 != 0) {
                        f10 = iE2 / iE3;
                    }
                } else if (iE < 17) {
                    f10 = f13742o[iE];
                } else {
                    com.applovin.impl.ca.r(new StringBuilder(String.valueOf(iE).length() + 35), "Unexpected aspect_ratio_idc value: ", iE, "NalUnitUtil");
                }
            }
            if (ta1Var.d()) {
                ta1Var.a();
            }
            if (ta1Var.d()) {
                ta1Var.b(3);
                if (true != ta1Var.d()) {
                    i27 = 2;
                } else {
                    i27 = 1;
                }
                if (ta1Var.d()) {
                    int iE10 = ta1Var.e(8);
                    int iE11 = ta1Var.e(8);
                    ta1Var.b(8);
                    iB3 = lq1.b(iE10);
                    iC = lq1.c(iE11);
                } else {
                    iC = -1;
                    iB3 = -1;
                }
            } else {
                if (uwVar != null) {
                    i28 = u31Var.f20610b[i23];
                    ca1Var = u31Var.f20609a;
                    if (ca1Var.size() > i28) {
                        r51 r51Var3 = (r51) ca1Var.get(i28);
                        iB3 = r51Var3.f19406a;
                        int i66 = r51Var3.f19407b;
                        iC = r51Var3.f19408c;
                        i27 = i66;
                    }
                }
                iC = -1;
                i27 = -1;
                iB3 = -1;
            }
            if (ta1Var.d()) {
                ta1Var.g();
                ta1Var.g();
            }
            ta1Var.a();
            if (ta1Var.d()) {
                i25 = i20 + i20;
            } else {
                i25 = i20;
            }
            i26 = iB3;
        } else {
            f10 = 1.0f;
            i25 = i20;
            i26 = -1;
            i27 = -1;
            iC = -1;
        }
        return new h51(i12, j31Var, i17, iG2, i16, i25, i14, i15, f10, i18, i26, i27, iC);
    }

    public static int K(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        ps1.c0(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            L(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            L(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            L(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    L(zArr);
                    return i15;
                }
                i14 = i15;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static void L(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static String M(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            byte[] bArr = (byte[]) list.get(i10);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                aa1 aa1Var = ca1.f13122b;
                rb0.p(4, "initialCapacity");
                Object[] objArrCopyOf = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i11 >= length2) {
                        break;
                    }
                    int iK = K(bArr, i11, length2, zArr);
                    if (iK != length2) {
                        Integer numValueOf = Integer.valueOf(iK);
                        int length3 = objArrCopyOf.length;
                        int i13 = i12 + 1;
                        int iD = x91.d(length3, i13);
                        if (iD > length3) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                        }
                        objArrCopyOf[i12] = numValueOf;
                        i12 = i13;
                    }
                    i11 = iK + 3;
                }
                ya1 ya1VarA = ca1.A(i12, objArrCopyOf);
                for (int i14 = 0; i14 < ya1VarA.f22210d; i14++) {
                    if (((Integer) ya1VarA.get(i14)).intValue() + 3 < length) {
                        ta1 ta1Var = new ta1(bArr, ((Integer) ya1VarA.get(i14)).intValue() + 3, length);
                        t0 t0VarN = N(ta1Var);
                        if (t0VarN.f20103a == 33 && t0VarN.f20104b == 0) {
                            ta1Var.b(4);
                            int iE = ta1Var.e(3);
                            ta1Var.a();
                            j31 j31VarO = O(ta1Var, true, iE, null);
                            return re0.a(j31VarO.f15955a, j31VarO.f15956b, j31VarO.f15957c, j31VarO.f15958d, j31VarO.f15959e, j31VarO.f15960f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static t0 N(ta1 ta1Var) {
        ta1Var.a();
        return new t0(ta1Var.e(6), ta1Var.e(6), ta1Var.e(3) - 1, false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c A[SYNTHETIC] */
    public static j31 O(ta1 ta1Var, boolean z10, int i10, j31 j31Var) {
        int[] iArr;
        int i11;
        boolean z11;
        int i12;
        int i13;
        boolean zD;
        int iE;
        int i14;
        int i15;
        int[] iArr2 = new int[6];
        if (!z10) {
            if (j31Var != null) {
                int i16 = j31Var.f15955a;
                zD = j31Var.f15956b;
                iE = j31Var.f15957c;
                i14 = j31Var.f15958d;
                iArr2 = j31Var.f15959e;
                i11 = i16;
            } else {
                iArr = iArr2;
                i11 = 0;
                z11 = false;
                i12 = 0;
                i13 = 0;
            }
            int iE2 = ta1Var.e(8);
            i15 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                if (ta1Var.d()) {
                    i15 += 88;
                }
                if (ta1Var.d()) {
                    i15 += 8;
                }
            }
            ta1Var.b(i15);
            if (i10 > 0) {
                int i18 = 8 - i10;
                ta1Var.b(i18 + i18);
            }
            return new j31(i11, z11, i12, i13, iArr, iE2);
        }
        int iE3 = ta1Var.e(2);
        zD = ta1Var.d();
        iE = ta1Var.e(5);
        i14 = 0;
        for (int i19 = 0; i19 < 32; i19++) {
            if (ta1Var.d()) {
                i14 |= 1 << i19;
            }
        }
        for (int i20 = 0; i20 < 6; i20++) {
            iArr2[i20] = ta1Var.e(8);
        }
        i11 = iE3;
        iArr = iArr2;
        z11 = zD;
        i12 = iE;
        i13 = i14;
        int iE4 = ta1Var.e(8);
        i15 = 0;
        while (i17 < i10) {
            if (ta1Var.d()) {
                i15 += 88;
            }
            if (ta1Var.d()) {
                i15 += 8;
            }
        }
        ta1Var.b(i15);
        if (i10 > 0) {
            int i110 = 8 - i10;
            ta1Var.b(i110 + i110);
        }
        return new j31(i11, z11, i12, i13, iArr, iE4);
    }

    public static void P(ta1 ta1Var) {
        int iG = ta1Var.g() + 1;
        ta1Var.b(8);
        for (int i10 = 0; i10 < iG; i10++) {
            ta1Var.g();
            ta1Var.g();
            ta1Var.a();
        }
        ta1Var.b(20);
    }

    public static String Q(g22 g22Var) {
        String str;
        String str2 = g22Var.f14678o;
        if (Objects.equals(str2, "video/dolby-vision") && (str = g22Var.f14675k) != null) {
            if (str.startsWith("dva1") || str.startsWith("dvav")) {
                return "video/avc";
            }
            if (str.startsWith("dvh1") || str.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return str2;
    }

    public static int a(int i10) {
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
            default:
                return 0;
        }
    }

    public static int b(int i10, byte[] bArr) {
        int i11;
        synchronized (f13743p) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    try {
                        if (i12 >= i10 - 2) {
                            i12 = i10;
                            break;
                        }
                        int i14 = i12 + 1;
                        if (bArr[i12] == 0 && bArr[i14] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12 = i14;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f13744q;
                    int length = iArr.length;
                    if (length <= i13) {
                        f13744q = Arrays.copyOf(iArr, length + length);
                    }
                    f13744q[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = f13744q[i17] - i15;
                System.arraycopy(bArr, i15, bArr, i16, i18);
                int i19 = i16 + i18;
                int i20 = i19 + 1;
                bArr[i19] = 0;
                i16 = i19 + 2;
                bArr[i20] = 0;
                i15 += i18 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i16, i11 - i16);
        }
        return i11;
    }

    public static wa c(fb fbVar) {
        long j10;
        boolean z10;
        long j11;
        long j12;
        long j13;
        long j14;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = fbVar.f14356c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jO = str != null ? o(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z10 = false;
            j11 = 0;
            j12 = 0;
            while (i10 < strArrSplit.length) {
                String strTrim = strArrSplit[i10].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j12 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j11 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z10 = true;
                }
                i10++;
            }
            j10 = 0;
            i10 = 1;
        } else {
            j10 = 0;
            z10 = false;
            j11 = 0;
            j12 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jO2 = str3 != null ? o(str3) : j10;
        String str4 = (String) map.get("Last-Modified");
        long jO3 = str4 != null ? o(str4) : j10;
        String str5 = (String) map.get(Command.HTTP_HEADER_ETAG);
        if (i10 != 0) {
            long j15 = (j12 * 1000) + jCurrentTimeMillis;
            j14 = z10 ? j15 : (j11 * 1000) + j15;
            j13 = j15;
        } else {
            j13 = (jO <= j10 || jO2 < jO) ? j10 : (jO2 - jO) + jCurrentTimeMillis;
            j14 = j13;
        }
        wa waVar = new wa();
        waVar.f21469a = fbVar.f14355b;
        waVar.f21470b = str5;
        waVar.f21474f = j13;
        waVar.f21473e = j14;
        waVar.f21471c = jO;
        waVar.f21472d = jO3;
        waVar.f21475g = map;
        waVar.f21476h = fbVar.f14357d;
        return waVar;
    }

    public static l01 d(Context context, hh hhVar, String str, String str2, qz0 qz0Var) {
        l01 l01Var;
        tz0 tz0Var = new tz0(context, hhVar, str, str2, qz0Var);
        try {
            l01Var = (l01) tz0Var.f20537e.poll(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            tz0Var.b(2009, tz0Var.f20540h, e10);
            l01Var = null;
        }
        tz0Var.b(IronSourceError.ERROR_REWARD_VALIDATION_FAILED, tz0Var.f20540h, null);
        if (l01Var != null) {
            if (l01Var.f16618c == 7) {
                qz0.f19245e = 3;
            } else {
                qz0.f19245e = 2;
            }
        }
        return l01Var == null ? new l01() : l01Var;
    }

    public static gb1 e(Set set, ia1 ia1Var) {
        ps1.e0(set, "set1");
        ps1.e0(ia1Var, "set2");
        return new gb1(set, ia1Var);
    }

    public static String f(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        String str = null;
        boolean z10 = false;
        while (it.hasNext()) {
            String str2 = ((z6) it.next()).f22510a.f21422g.f14678o;
            if (na.a(str2)) {
                return MimeTypes.VIDEO_MP4;
            }
            if ("audio".equals(na.i(str2))) {
                z10 = true;
            } else if (na.b(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z10) {
            return MimeTypes.AUDIO_MP4;
        }
        return str != null ? str : MimeTypes.APPLICATION_MP4;
    }

    public static String g(JSONObject jSONObject, String str, String str2) {
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("including");
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("excluding");
                    if (s(jSONArrayOptJSONArray2, str) && !s(jSONArrayOptJSONArray3, str)) {
                        return jSONObjectOptJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    public static void i(AtomicReference atomicReference, et0 et0Var) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            et0Var.zza(obj);
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i11 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    public static void j(s9.a aVar, Throwable th2, String str) {
        zw.c((Context) s9.b.y1(aVar)).b(th2, str, ((Double) pn.f18742f.o()).floatValue());
    }

    public static boolean k(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static int l(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }

    public static int m(Object obj) {
        return l(obj == null ? 0 : obj.hashCode());
    }

    public static long n(np0 np0Var, int i10, int i11) {
        np0Var.E(i10);
        if (np0Var.B() < 5) {
            return C.TIME_UNSET;
        }
        int iB = np0Var.b();
        if ((8388608 & iB) != 0 || ((iB >> 8) & 8191) != i11 || (iB & 32) == 0 || np0Var.K() < 7 || np0Var.B() < 7 || (np0Var.K() & 16) != 16) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[6];
        np0Var.H(bArr, 0, 6);
        long j10 = bArr[0];
        long j11 = bArr[1];
        long j12 = bArr[2];
        long j13 = bArr[3] & 255;
        return ((j10 & 255) << 25) | ((j11 & 255) << 17) | ((j12 & 255) << 9) | (j13 + j13) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static long o(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e10) {
            if ("0".equals(str) || C0239a2.f28156f.equals(str)) {
                ob.a("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", ob.d("Unable to parse dateStr: %s, falling back to 0", str), e10);
            return 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d5, code lost:
    
        if (r11 != 3) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.v1 p(com.google.android.gms.internal.ads.gp0 r11, boolean r12) throws com.google.android.gms.internal.ads.ab {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dv.p(com.google.android.gms.internal.ads.gp0, boolean):com.google.android.gms.internal.ads.v1");
    }

    public static hb1 q(Set set, h81 h81Var) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof hb1)) {
                return new jb1(set2, h81Var);
            }
            hb1 hb1Var = (hb1) set2;
            h81 h81Var2 = hb1Var.f15246b;
            h81Var2.getClass();
            return new jb1((SortedSet) hb1Var.f15245a, new i81(Arrays.asList(h81Var2, h81Var)));
        }
        if (!(set instanceof hb1)) {
            set.getClass();
            return new hb1(set, h81Var);
        }
        hb1 hb1Var2 = (hb1) set;
        h81 h81Var3 = hb1Var2.f15246b;
        h81Var3.getClass();
        return new hb1(hb1Var2.f15245a, new i81(Arrays.asList(h81Var3, h81Var)));
    }

    public static void r(int i10, long j10, String str, int i11, PriorityQueue priorityQueue) {
        pi piVar = new pi(i11, j10, str);
        if ((priorityQueue.size() != i10 || (((pi) priorityQueue.peek()).f18664c <= i11 && ((pi) priorityQueue.peek()).f18662a <= j10)) && !priorityQueue.contains(piVar)) {
            priorityQueue.add(piVar);
            if (priorityQueue.size() > i10) {
                priorityQueue.poll();
            }
        }
    }

    public static boolean s(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String strOptString = jSONArray.optString(i10);
                try {
                    if ((((Boolean) zzba.zzc().a(am.Bc)).booleanValue() ? Pattern.compile(strOptString, 2) : Pattern.compile(strOptString)).matcher(str).lookingAt()) {
                        return true;
                    }
                } catch (PatternSyntaxException e10) {
                    zzt.zzh().d("RtbAdapterMap.hasAtleastOneRegexMatch", e10);
                }
            }
        }
        return false;
    }

    public static boolean t(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static int u(g22 g22Var) {
        String strQ = Q(g22Var);
        if (Objects.equals(strQ, "video/avc")) {
            return 1;
        }
        return (Objects.equals(strQ, "video/hevc") || Objects.equals(strQ, "video/vvc")) ? 2 : 0;
    }

    public static int v(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0195  */
    /* JADX WARN: Code duplicated, block: B:116:0x0198  */
    /* JADX WARN: Code duplicated, block: B:118:0x019c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x019e  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:128:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7  */
    /* JADX WARN: Multi-variable type inference failed */
    public static e3 w(n2 n2Var, boolean z10) {
        e3 e3Var;
        long jD;
        int i10;
        long j10;
        long j11;
        int i11;
        boolean z11;
        boolean z12;
        int[] iArr;
        int i12;
        long jZzo = n2Var.zzo();
        long j12 = -1;
        long j13 = 4096;
        if (jZzo != -1 && jZzo <= 4096) {
            j13 = jZzo;
        }
        np0 np0Var = new np0(64);
        int i13 = (int) j13;
        int i14 = 0;
        int i15 = 0;
        boolean z13 = false;
        while (true) {
            if (i15 < i13) {
                np0Var.y(8);
                if (n2Var.m(np0Var.f17880a, i14, 8, true)) {
                    long jP = np0Var.P();
                    int iB = np0Var.b();
                    if (jP == 1) {
                        n2Var.v(np0Var.f17880a, 8, 8);
                        i10 = 16;
                        np0Var.C(16);
                        jD = np0Var.d();
                    } else {
                        if (jP == 0) {
                            long jZzo2 = n2Var.zzo();
                            if (jZzo2 != j12) {
                                jP = (jZzo2 - n2Var.zzm()) + 8;
                            }
                        }
                        jD = jP;
                        i10 = 8;
                    }
                    long j14 = i10;
                    if (jD < j14) {
                        e3Var = null;
                        if (iB != 1718773093) {
                            i12 = iB;
                        } else if (i10 == 8) {
                            iB = 1718773093;
                            j10 = 8;
                        } else {
                            i12 = 1718773093;
                        }
                        return new b6(i12, i10, 0, jD);
                    }
                    e3Var = null;
                    j10 = jD;
                    i15 += i10;
                    if (iB == 1836019574) {
                        i13 += (int) j10;
                        if (jZzo != -1 && i13 > jZzo) {
                            i13 = (int) jZzo;
                        }
                        if (iB == 1836019574) {
                            j12 = -1;
                            i14 = 0;
                        } else {
                            if (iB != 1953653099 || iB == 1835297121 || iB == 1835626086) {
                                j11 = jZzo;
                                i11 = 0;
                            } else if (iB == 1836019558 || iB == 1836475768) {
                                i14 = 1;
                            } else {
                                z13 |= !(iB != 1835295092);
                                if (iB == 1937007212) {
                                    if (j10 <= 1000000) {
                                        iB = 1937007212;
                                    }
                                    i14 = 0;
                                }
                                j11 = jZzo;
                                if ((((long) i15) + j10) - j14 >= i13) {
                                    i14 = 0;
                                } else {
                                    int i16 = (int) (j10 - j14);
                                    i15 += i16;
                                    int i17 = 1718909296;
                                    if (iB == 1718909296) {
                                        int i18 = 8;
                                        if (i16 < 8) {
                                            return new b6(i17, i18, 0, i16);
                                        }
                                        np0Var.y(i16);
                                        i11 = 0;
                                        n2Var.v(np0Var.f17880a, 0, i16);
                                        int iB2 = np0Var.b();
                                        int i19 = iB2 >>> 8;
                                        int i20 = 29;
                                        int[] iArr2 = f13731c;
                                        if (i19 != 3368816) {
                                            int i21 = 0;
                                            while (true) {
                                                if (i21 >= 29) {
                                                    z11 = false;
                                                    break;
                                                }
                                                if (iArr2[i21] == iB2) {
                                                    z11 = true;
                                                    break;
                                                }
                                                i21++;
                                            }
                                        } else {
                                            z11 = true;
                                            break;
                                        }
                                        boolean z14 = z11 | z13;
                                        np0Var.G(4);
                                        int iB3 = np0Var.B() / 4;
                                        if (!z14 && iB3 > 0) {
                                            int[] iArr3 = new int[iB3];
                                            int i22 = 0;
                                            while (true) {
                                                if (i22 >= iB3) {
                                                    z12 = z14;
                                                    iArr = iArr3;
                                                    break;
                                                }
                                                int iB4 = np0Var.b();
                                                iArr3[i22] = iB4;
                                                if ((iB4 >>> 8) != 3368816) {
                                                    int i23 = 0;
                                                    while (true) {
                                                        if (i23 >= i20) {
                                                            i22++;
                                                            i20 = 29;
                                                        } else if (iArr2[i23] != iB4) {
                                                            i23++;
                                                            i20 = 29;
                                                        }
                                                    }
                                                }
                                                z12 = true;
                                                iArr = iArr3;
                                                break;
                                            }
                                        }
                                        z12 = z14;
                                        iArr = e3Var;
                                        if (!z12) {
                                            return new b2.w(iB2, 2, iArr);
                                        }
                                        z13 = z12;
                                    } else {
                                        i11 = 0;
                                        if (i16 != 0) {
                                            n2Var.b(i16);
                                        }
                                    }
                                }
                            }
                            i14 = i11;
                            jZzo = j11;
                            j12 = -1;
                        }
                    } else {
                        if (iB == 1970628964) {
                            iB = 1970628964;
                            i13 += (int) j10;
                            if (jZzo != -1) {
                                i13 = (int) jZzo;
                            }
                            if (iB == 1836019574) {
                                j12 = -1;
                                i14 = 0;
                            }
                        }
                        if (iB != 1953653099) {
                            j11 = jZzo;
                            i11 = 0;
                        } else {
                            j11 = jZzo;
                            i11 = 0;
                        }
                        i14 = i11;
                        jZzo = j11;
                        j12 = -1;
                    }
                }
                if (!z13) {
                    return s6.f19858b;
                }
                if (z10 != i14) {
                    return i14 != 0 ? n6.f17676c : n6.f17677d;
                }
                return e3Var;
            }
            e3Var = null;
            if (!z13) {
                return s6.f19858b;
            }
            if (z10 != i14) {
                if (i14 != 0) {
                }
            }
            return e3Var;
        }
    }

    public static String x(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static String y(String[] strArr, int i10, int i11) {
        int i12 = i11 + i10;
        if (strArr.length < i12) {
            int i13 = zze.zza;
            zzo.zzf("Unable to construct shingle");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i14 = i12 - 1;
            if (i10 >= i14) {
                sb2.append(strArr[i14]);
                return sb2.toString();
            }
            sb2.append(strArr[i10]);
            sb2.append(' ');
            i10++;
        }
    }

    public static int z(gp0 gp0Var) throws ab {
        int iH = gp0Var.h(4);
        if (iH == 15) {
            if (gp0Var.b() >= 24) {
                return gp0Var.h(24);
            }
            throw ab.a(null, "AAC header insufficient data");
        }
        if (iH < 13) {
            return f13729a[iH];
        }
        throw ab.a(null, "AAC header wrong Sampling Frequency Index");
    }
}
