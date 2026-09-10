package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.ads.AdError;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g22 {
    public static final /* synthetic */ int Q = 0;
    public final int A;
    public final float B;
    public final byte[] C;
    public final int D;
    public final lq1 E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public int P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ca1 f14667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f14674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f14675k;
    public final s8 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f14676m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f14677n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f14678o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f14679p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f14680q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f14681r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g02 f14682s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f14683t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f14684u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f14685v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f14686w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f14687x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f14688y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f14689z;

    static {
        new g22(new i12());
        String str = uu0.f20901a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(36, 36);
        Integer.toString(37, 36);
        Integer.toString(38, 36);
    }

    public g22(i12 i12Var) {
        boolean z10;
        String str;
        this.f14665a = i12Var.f15499a;
        String strP = uu0.p(i12Var.f15502d);
        this.f14668d = strP;
        if (i12Var.f15501c.isEmpty() && i12Var.f15500b != null) {
            this.f14667c = ca1.u(new i32(strP, i12Var.f15500b));
            this.f14666b = i12Var.f15500b;
        } else if (i12Var.f15501c.isEmpty() || i12Var.f15500b != null) {
            if (!i12Var.f15501c.isEmpty() || i12Var.f15500b != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= i12Var.f15501c.size()) {
                        z10 = false;
                        break;
                    } else {
                        if (((i32) i12Var.f15501c.get(i10)).f15558b.equals(i12Var.f15500b)) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    }
                }
            } else {
                z10 = true;
                break;
            }
            ps1.c0(z10);
            this.f14667c = i12Var.f15501c;
            this.f14666b = i12Var.f15500b;
        } else {
            ca1 ca1Var = i12Var.f15501c;
            this.f14667c = ca1Var;
            Iterator it = ca1Var.iterator();
            while (true) {
                v81 v81Var = (v81) it;
                if (!v81Var.hasNext()) {
                    str = ((i32) ca1Var.get(0)).f15558b;
                    break;
                }
                i32 i32Var = (i32) v81Var.next();
                if (TextUtils.equals(i32Var.f15557a, strP)) {
                    str = i32Var.f15558b;
                    break;
                }
            }
            this.f14666b = str;
        }
        this.f14669e = i12Var.f15503e;
        ps1.d0("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", i12Var.f15505g == 0 || (i12Var.f15504f & 32768) != 0);
        this.f14670f = i12Var.f15504f;
        this.f14671g = i12Var.f15505g;
        int i11 = i12Var.f15506h;
        this.f14672h = i11;
        int i12 = i12Var.f15507i;
        this.f14673i = i12;
        this.f14674j = i12 != -1 ? i12 : i11;
        this.f14675k = i12Var.f15508j;
        this.l = i12Var.f15509k;
        this.f14676m = i12Var.l;
        this.f14677n = i12Var.f15510m;
        this.f14678o = i12Var.f15511n;
        this.f14679p = i12Var.f15512o;
        this.f14680q = i12Var.f15513p;
        List list = i12Var.f15514q;
        this.f14681r = list == null ? Collections.EMPTY_LIST : list;
        g02 g02Var = i12Var.f15515r;
        this.f14682s = g02Var;
        this.f14683t = i12Var.f15516s;
        this.f14684u = i12Var.f15517t;
        this.f14685v = i12Var.f15518u;
        this.f14686w = i12Var.f15519v;
        this.f14687x = i12Var.f15520w;
        this.f14688y = i12Var.f15521x;
        this.f14689z = i12Var.f15522y;
        int i13 = i12Var.f15523z;
        this.A = i13 == -1 ? 0 : i13;
        float f10 = i12Var.A;
        this.B = f10 == -1.0f ? 1.0f : f10;
        this.C = i12Var.B;
        this.D = i12Var.C;
        this.E = i12Var.D;
        this.F = i12Var.E;
        int i14 = i12Var.F;
        this.G = i14;
        int i15 = i12Var.G;
        this.H = i15;
        if (i14 != -1 && i15 != -1 && Integer.bitCount(i15) != i14) {
            throw new IllegalStateException(dv.B("channelCount and channelMask are inconsistent. channelCount=%s, channelMask=%s", Integer.valueOf(i14), Integer.valueOf(i15)));
        }
        this.I = i12Var.H;
        this.J = i12Var.I;
        int i16 = i12Var.J;
        this.K = i16 == -1 ? 0 : i16;
        int i17 = i12Var.K;
        this.L = i17 != -1 ? i17 : 0;
        this.M = i12Var.L;
        this.N = i12Var.M;
        int i18 = i12Var.N;
        if (i18 != 0 || g02Var == null) {
            this.O = i18;
        } else {
            this.O = 1;
        }
    }

    public static String c(g22 g22Var) {
        String str;
        String str2;
        String string;
        int i10;
        int i11;
        StringBuilder sbI = d5.u.i("id=");
        sbI.append(g22Var.f14665a);
        sbI.append(", mimeType=");
        sbI.append(g22Var.f14678o);
        String str3 = g22Var.f14677n;
        if (str3 != null) {
            sbI.append(", container=");
            sbI.append(str3);
        }
        String str4 = g22Var.f14676m;
        if (str4 != null) {
            sbI.append(", primaryGroupId=");
            sbI.append(str4);
        }
        int i12 = g22Var.f14674j;
        if (i12 != -1) {
            sbI.append(", bitrate=");
            sbI.append(i12);
        }
        String str5 = g22Var.f14675k;
        if (str5 != null) {
            sbI.append(", codecs=");
            sbI.append(str5);
        }
        g02 g02Var = g22Var.f14682s;
        if (g02Var != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i13 = 0; i13 < g02Var.f14648d; i13++) {
                UUID uuid = g02Var.f14645a[i13].f12968b;
                if (uuid.equals(v01.f20989b)) {
                    linkedHashSet.add(C.CENC_TYPE_cenc);
                } else if (uuid.equals(v01.f20990c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(v01.f20992e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(v01.f20991d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(v01.f20988a)) {
                    linkedHashSet.add("universal");
                } else {
                    String string2 = uuid.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 10);
                    sb2.append("unknown (");
                    sb2.append(string2);
                    sb2.append(")");
                    linkedHashSet.add(sb2.toString());
                }
            }
            sbI.append(", drm=[");
            v71.z(sbI, linkedHashSet.iterator(), ",");
            sbI.append(']');
        }
        int i14 = g22Var.f14685v;
        if (i14 != -1 && (i11 = g22Var.f14686w) != -1) {
            l1.d.p(sbI, ", res=", i14, "x", i11);
        }
        int i15 = g22Var.f14687x;
        if (i15 != -1 && (i10 = g22Var.f14688y) != -1) {
            l1.d.p(sbI, ", decRes=", i15, "x", i10);
        }
        float f10 = g22Var.B;
        int i16 = ac1.f11991a;
        double d10 = f10;
        if (Math.copySign((-1.0d) + d10, 1.0d) > 0.001d && d10 != 1.0d && (!Double.isNaN(d10) || !Double.isNaN(1.0d))) {
            sbI.append(", par=");
            Object[] objArr = {Float.valueOf(f10)};
            String str6 = uu0.f20901a;
            sbI.append(String.format(Locale.US, "%.3f", objArr));
        }
        lq1 lq1Var = g22Var.E;
        if (lq1Var != null) {
            int i17 = lq1Var.f17107f;
            int i18 = lq1Var.f17106e;
            if ((i18 != -1 && i17 != -1) || lq1Var.d()) {
                sbI.append(", color=");
                if (lq1Var.d()) {
                    String strE = lq1.e(lq1Var.f17102a);
                    String strG = lq1.g(lq1Var.f17103b);
                    String strF = lq1.f(lq1Var.f17104c);
                    String str7 = uu0.f20901a;
                    Locale locale = Locale.US;
                    str2 = strE + "/" + strG + "/" + strF;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i18 == -1 || i17 == -1) {
                    string = "NA/NA";
                } else {
                    StringBuilder sb3 = new StringBuilder(com.applovin.impl.ca.e(i18, 1) + String.valueOf(i17).length());
                    sb3.append(i18);
                    sb3.append("/");
                    sb3.append(i17);
                    string = sb3.toString();
                }
                StringBuilder sb4 = new StringBuilder(string.length() + str2.length() + 1);
                sb4.append(str2);
                sb4.append("/");
                sb4.append(string);
                sbI.append(sb4.toString());
            }
        }
        float f11 = g22Var.f14689z;
        if (f11 != -1.0f) {
            sbI.append(", fps=");
            sbI.append(f11);
        }
        int i19 = g22Var.F;
        if (i19 != -1) {
            sbI.append(", maxSubLayers=");
            sbI.append(i19);
        }
        int i20 = g22Var.G;
        if (i20 != -1) {
            sbI.append(", channels=");
            sbI.append(i20);
        }
        int i21 = g22Var.H;
        if (i21 != -1) {
            sbI.append(", channel_mask=");
            sbI.append(i21);
        }
        int i22 = g22Var.I;
        if (i22 != -1) {
            sbI.append(", sample_rate=");
            sbI.append(i22);
        }
        String str8 = g22Var.f14668d;
        if (str8 != null) {
            sbI.append(", language=");
            sbI.append(str8);
        }
        ca1 ca1Var = g22Var.f14667c;
        if (!ca1Var.isEmpty()) {
            sbI.append(", labels=[");
            v71.z(sbI, v71.w(ca1Var, t51.f20192d).iterator(), ",");
            sbI.append(X3.j.f27836e);
        }
        int i23 = g22Var.f14669e;
        if (i23 != 0) {
            sbI.append(", selectionFlags=[");
            String str9 = uu0.f20901a;
            ArrayList arrayList = new ArrayList();
            if ((i23 & 1) != 0) {
                arrayList.add(BuildConfig.FLAVOR);
            }
            if ((i23 & 2) != 0) {
                arrayList.add("forced");
            }
            v71.z(sbI, arrayList.iterator(), ",");
            sbI.append(X3.j.f27836e);
        }
        int i24 = g22Var.f14670f;
        if (i24 != 0) {
            sbI.append(", roleFlags=[");
            int i25 = i24 & 32768;
            String str10 = uu0.f20901a;
            ArrayList arrayList2 = new ArrayList();
            if ((i24 & 1) != 0) {
                arrayList2.add(X3.i.Z);
            }
            if ((i24 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i24 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i24 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i24 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i24 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i24 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i24 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i24 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                arrayList2.add("sign");
            }
            if ((i24 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i24 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i24 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i24 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i24 & Segment.SIZE) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i24 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                arrayList2.add("trick-play");
            }
            if (i25 != 0) {
                arrayList2.add("auxiliary");
            }
            v71.z(sbI, arrayList2.iterator(), ",");
            sbI.append(X3.j.f27836e);
        }
        if ((i24 & 32768) != 0) {
            sbI.append(", auxiliaryTrackType=");
            int i26 = g22Var.f14671g;
            String str11 = uu0.f20901a;
            if (i26 == 0) {
                str = AdError.UNDEFINED_DOMAIN;
            } else if (i26 == 1) {
                str = "original";
            } else if (i26 == 2) {
                str = "depth-linear";
            } else if (i26 == 3) {
                str = "depth-inverse";
            } else {
                if (i26 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sbI.append(str);
        }
        return sbI.toString();
    }

    public final i12 a() {
        return new i12(this);
    }

    public final boolean b(g22 g22Var) {
        List list = this.f14681r;
        int size = list.size();
        List list2 = g22Var.f14681r;
        if (size != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || g22.class != obj.getClass()) {
            return false;
        }
        g22 g22Var = (g22) obj;
        int i11 = this.P;
        return (i11 == 0 || (i10 = g22Var.P) == 0 || i11 == i10) && this.f14669e == g22Var.f14669e && this.f14670f == g22Var.f14670f && this.f14671g == g22Var.f14671g && this.f14672h == g22Var.f14672h && this.f14673i == g22Var.f14673i && this.f14679p == g22Var.f14679p && this.f14683t == g22Var.f14683t && this.f14685v == g22Var.f14685v && this.f14686w == g22Var.f14686w && this.f14687x == g22Var.f14687x && this.f14688y == g22Var.f14688y && this.A == g22Var.A && this.D == g22Var.D && this.F == g22Var.F && this.G == g22Var.G && this.H == g22Var.H && this.I == g22Var.I && this.J == g22Var.J && this.K == g22Var.K && this.L == g22Var.L && this.M == g22Var.M && this.O == g22Var.O && Float.compare(this.f14689z, g22Var.f14689z) == 0 && Float.compare(this.B, g22Var.B) == 0 && Objects.equals(this.f14665a, g22Var.f14665a) && Objects.equals(this.f14666b, g22Var.f14666b) && this.f14667c.equals(g22Var.f14667c) && Objects.equals(this.f14675k, g22Var.f14675k) && Objects.equals(this.f14676m, g22Var.f14676m) && Objects.equals(this.f14677n, g22Var.f14677n) && Objects.equals(this.f14678o, g22Var.f14678o) && Objects.equals(this.f14668d, g22Var.f14668d) && Arrays.equals(this.C, g22Var.C) && Objects.equals(this.l, g22Var.l) && Objects.equals(this.E, g22Var.E) && Objects.equals(this.f14682s, g22Var.f14682s) && b(g22Var);
    }

    public final int hashCode() {
        int i10 = this.P;
        if (i10 != 0) {
            return i10;
        }
        String str = this.f14665a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f14666b;
        int iHashCode2 = this.f14667c.hashCode() + ((((iHashCode + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.f14668d;
        int iHashCode3 = ((((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f14669e) * 31) + this.f14670f) * 31) + this.f14671g) * 31) + this.f14672h) * 31) + this.f14673i) * 31;
        String str4 = this.f14675k;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        s8 s8Var = this.l;
        int iHashCode5 = iHashCode4 + (s8Var == null ? 0 : s8Var.hashCode());
        String str5 = this.f14676m;
        int iHashCode6 = ((iHashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f14677n;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f14678o;
        int iFloatToIntBits = ((((((((((((((((((((((((Float.floatToIntBits(this.B) + ((((Float.floatToIntBits(this.f14689z) + ((((((((((((((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.f14679p) * 31) + ((int) this.f14683t)) * 31) + this.f14685v) * 31) + this.f14686w) * 31) + this.f14687x) * 31) + this.f14688y) * 31)) * 31) + this.A) * 31)) * 31) + this.D) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) - 1) * 31) - 1) * 31) + this.O;
        this.P = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.E);
        String str = this.f14665a;
        int length = String.valueOf(str).length();
        String str2 = this.f14666b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f14677n;
        int length3 = String.valueOf(str3).length();
        String str4 = this.f14678o;
        int length4 = String.valueOf(str4).length();
        String str5 = this.f14675k;
        int length5 = String.valueOf(str5).length();
        int i10 = this.f14674j;
        int length6 = String.valueOf(i10).length();
        String str6 = this.f14668d;
        int length7 = String.valueOf(str6).length();
        int i11 = this.f14685v;
        int length8 = String.valueOf(i11).length();
        int i12 = this.f14686w;
        int length9 = String.valueOf(i12).length();
        float f10 = this.f14689z;
        int length10 = String.valueOf(f10).length();
        int length11 = strValueOf.length();
        int i13 = this.G;
        int length12 = String.valueOf(i13).length();
        int i14 = this.H;
        int length13 = String.valueOf(i14).length();
        int i15 = this.I;
        StringBuilder sb2 = new StringBuilder(length + 9 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2 + length6 + 2 + length7 + 3 + length8 + 2 + length9 + 2 + length10 + 2 + length11 + 4 + length12 + 2 + length13 + 2 + String.valueOf(i15).length() + 2);
        d5.u.r(sb2, "Format(", str, ", ", str2);
        d5.u.r(sb2, ", ", str3, ", ", str4);
        sb2.append(", ");
        sb2.append(str5);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(str6);
        sb2.append(", [");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(f10);
        sb2.append(", ");
        sb2.append(strValueOf);
        sb2.append("], [");
        sb2.append(i13);
        l1.d.p(sb2, ", ", i14, ", ", i15);
        sb2.append("])");
        return sb2.toString();
    }
}
