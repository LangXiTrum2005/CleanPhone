package i1;

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
public final class p {
    public final float A;
    public final byte[] B;
    public final int C;
    public final h D;
    public final int E;
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
    public final String f42631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oa.j0 f42633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f42636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f42637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f42638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f42639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f42640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f42641k;
    public final c0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f42642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f42643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f42644o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f42645p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f42646q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f42647r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f42648s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f42649t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f42650u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f42651v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f42652w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f42653x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f42654y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f42655z;

    static {
        new o().a();
        l1.y.G(0);
        l1.y.G(1);
        l1.y.G(2);
        l1.y.G(3);
        l1.y.G(4);
        d5.u.m(5, 6, 7, 8, 9);
        d5.u.m(10, 11, 12, 13, 14);
        d5.u.m(15, 16, 17, 18, 19);
        d5.u.m(20, 21, 22, 23, 24);
        d5.u.m(25, 26, 27, 28, 29);
        d5.u.m(30, 31, 32, 33, 34);
        l1.y.G(35);
        l1.y.G(36);
    }

    public p(o oVar) {
        boolean z10;
        String str;
        this.f42631a = oVar.f42589a;
        String strN = l1.y.N(oVar.f42592d);
        this.f42634d = strN;
        if (oVar.f42591c.isEmpty() && oVar.f42590b != null) {
            this.f42633c = oa.j0.B(new q(strN, oVar.f42590b));
            this.f42632b = oVar.f42590b;
        } else if (oVar.f42591c.isEmpty() || oVar.f42590b != null) {
            if (!oVar.f42591c.isEmpty() || oVar.f42590b != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= oVar.f42591c.size()) {
                        z10 = false;
                        break;
                    } else {
                        if (((q) oVar.f42591c.get(i10)).f42658b.equals(oVar.f42590b)) {
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
            go.k.t(z10);
            this.f42633c = oVar.f42591c;
            this.f42632b = oVar.f42590b;
        } else {
            oa.j0 j0Var = oVar.f42591c;
            this.f42633c = j0Var;
            Iterator it = j0Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((q) j0Var.get(0)).f42658b;
                    break;
                }
                q qVar = (q) it.next();
                if (TextUtils.equals(qVar.f42657a, strN)) {
                    str = qVar.f42658b;
                    break;
                }
            }
            this.f42632b = str;
        }
        this.f42635e = oVar.f42593e;
        go.k.s("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", oVar.f42595g == 0 || (oVar.f42594f & 32768) != 0);
        this.f42636f = oVar.f42594f;
        this.f42637g = oVar.f42595g;
        int i11 = oVar.f42596h;
        this.f42638h = i11;
        int i12 = oVar.f42597i;
        this.f42639i = i12;
        this.f42640j = i12 != -1 ? i12 : i11;
        this.f42641k = oVar.f42598j;
        this.l = oVar.f42599k;
        this.f42642m = oVar.l;
        this.f42643n = oVar.f42600m;
        this.f42644o = oVar.f42601n;
        this.f42645p = oVar.f42602o;
        List list = oVar.f42603p;
        this.f42646q = list == null ? Collections.EMPTY_LIST : list;
        m mVar = oVar.f42604q;
        this.f42647r = mVar;
        this.f42648s = oVar.f42605r;
        this.f42649t = oVar.f42606s;
        this.f42650u = oVar.f42607t;
        this.f42651v = oVar.f42608u;
        this.f42652w = oVar.f42609v;
        this.f42653x = oVar.f42610w;
        this.f42654y = oVar.f42611x;
        int i13 = oVar.f42612y;
        this.f42655z = i13 == -1 ? 0 : i13;
        float f10 = oVar.f42613z;
        this.A = f10 == -1.0f ? 1.0f : f10;
        this.B = oVar.A;
        this.C = oVar.B;
        this.D = oVar.C;
        this.E = oVar.D;
        this.F = oVar.E;
        this.G = oVar.F;
        this.H = oVar.G;
        int i14 = oVar.H;
        this.I = i14 == -1 ? 0 : i14;
        int i15 = oVar.I;
        this.J = i15 != -1 ? i15 : 0;
        this.K = oVar.J;
        this.L = oVar.K;
        this.M = oVar.L;
        this.N = oVar.M;
        int i16 = oVar.N;
        if (i16 != 0 || mVar == null) {
            this.O = i16;
        } else {
            this.O = 1;
        }
    }

    public static String c(p pVar) {
        int i10;
        String str;
        String str2;
        if (pVar == null) {
            return "null";
        }
        int i11 = pVar.f42635e;
        oa.j0 j0Var = pVar.f42633c;
        String str3 = pVar.f42634d;
        int i12 = pVar.G;
        int i13 = pVar.F;
        int i14 = pVar.E;
        float f10 = pVar.f42654y;
        h hVar = pVar.D;
        float f11 = pVar.A;
        int i15 = pVar.f42653x;
        int i16 = pVar.f42652w;
        int i17 = pVar.f42651v;
        int i18 = pVar.f42650u;
        m mVar = pVar.f42647r;
        String str4 = pVar.f42641k;
        int i19 = pVar.f42640j;
        String str5 = pVar.f42642m;
        int i20 = pVar.f42636f;
        na.g gVar = new na.g(String.valueOf(','));
        StringBuilder sbI = d5.u.i("id=");
        sbI.append(pVar.f42631a);
        sbI.append(", mimeType=");
        sbI.append(pVar.f42643n);
        if (str5 != null) {
            sbI.append(", container=");
            sbI.append(str5);
        }
        if (i19 != -1) {
            sbI.append(", bitrate=");
            sbI.append(i19);
        }
        if (str4 != null) {
            sbI.append(", codecs=");
            sbI.append(str4);
        }
        if (mVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i21 = 0; i21 < mVar.f42580d; i21++) {
                UUID uuid = mVar.f42577a[i21].f42570b;
                if (uuid.equals(g.f42539b)) {
                    linkedHashSet.add(C.CENC_TYPE_cenc);
                } else if (uuid.equals(g.f42540c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(g.f42542e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(g.f42541d)) {
                    linkedHashSet.add("widevine");
                } else {
                    if (uuid.equals(g.f42538a)) {
                        linkedHashSet.add("universal");
                    } else {
                        linkedHashSet.add("unknown (" + uuid + ")");
                    }
                }
            }
            sbI.append(", drm=[");
            gVar.s(sbI, linkedHashSet.iterator());
            sbI.append(']');
        }
        if (i18 != -1 && i17 != -1) {
            l1.d.p(sbI, ", res=", i18, "x", i17);
        }
        if (i16 != -1 && i15 != -1) {
            l1.d.p(sbI, ", decRes=", i16, "x", i15);
        }
        double d10 = f11;
        int i22 = ra.c.f49517a;
        if (Math.copySign(d10 - 1.0d, 1.0d) > 0.001d && d10 != 1.0d && (!Double.isNaN(d10) || !Double.isNaN(1.0d))) {
            sbI.append(", par=");
            Object[] objArr = {Float.valueOf(f11)};
            String str6 = l1.y.f44830a;
            sbI.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (hVar != null) {
            int i23 = hVar.f42553f;
            int i24 = hVar.f42552e;
            if ((i24 != -1 && i23 != -1) || hVar.d()) {
                sbI.append(", color=");
                if (hVar.d()) {
                    String strB = h.b(hVar.f42548a);
                    String strA = h.a(hVar.f42549b);
                    String strC = h.c(hVar.f42550c);
                    Locale locale = Locale.US;
                    str2 = strB + "/" + strA + "/" + strC;
                } else {
                    str2 = "NA/NA/NA";
                }
                sbI.append(str2 + "/" + ((i24 == -1 || i23 == -1) ? "NA/NA" : i24 + "/" + i23));
            }
        }
        if (f10 != -1.0f) {
            sbI.append(", fps=");
            sbI.append(f10);
        }
        if (i14 != -1) {
            sbI.append(", maxSubLayers=");
            sbI.append(i14);
        }
        if (i13 != -1) {
            sbI.append(", channels=");
            sbI.append(i13);
        }
        if (i12 != -1) {
            sbI.append(", sample_rate=");
            sbI.append(i12);
        }
        if (str3 != null) {
            sbI.append(", language=");
            sbI.append(str3);
        }
        if (!j0Var.isEmpty()) {
            sbI.append(", labels=[");
            gVar.s(sbI, oa.q.z(j0Var, new d2.c(7)).iterator());
            sbI.append(X3.j.f27836e);
        }
        if (i11 != 0) {
            sbI.append(", selectionFlags=[");
            String str7 = l1.y.f44830a;
            ArrayList arrayList = new ArrayList();
            if ((i11 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i11 & 1) != 0) {
                arrayList.add(BuildConfig.FLAVOR);
            }
            if ((i11 & 2) != 0) {
                arrayList.add("forced");
            }
            gVar.s(sbI, arrayList.iterator());
            sbI.append(X3.j.f27836e);
        }
        if (i20 != 0) {
            sbI.append(", roleFlags=[");
            String str8 = l1.y.f44830a;
            ArrayList arrayList2 = new ArrayList();
            if ((i20 & 1) != 0) {
                arrayList2.add(X3.i.Z);
            }
            if ((i20 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i20 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i20 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i20 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i20 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i20 & 64) != 0) {
                arrayList2.add("caption");
            }
            i10 = i20;
            if ((i10 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                arrayList2.add("sign");
            }
            if ((i10 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i10 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i10 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i10 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i10 & Segment.SIZE) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i10 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            gVar.s(sbI, arrayList2.iterator());
            sbI.append(X3.j.f27836e);
        } else {
            i10 = i20;
        }
        if ((i10 & 32768) != 0) {
            sbI.append(", auxiliaryTrackType=");
            int i25 = pVar.f42637g;
            String str9 = l1.y.f44830a;
            if (i25 == 0) {
                str = AdError.UNDEFINED_DOMAIN;
            } else if (i25 == 1) {
                str = "original";
            } else if (i25 == 2) {
                str = "depth-linear";
            } else if (i25 == 3) {
                str = "depth-inverse";
            } else {
                if (i25 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sbI.append(str);
        }
        return sbI.toString();
    }

    public final o a() {
        o oVar = new o();
        oVar.f42589a = this.f42631a;
        oVar.f42590b = this.f42632b;
        oVar.f42591c = this.f42633c;
        oVar.f42592d = this.f42634d;
        oVar.f42593e = this.f42635e;
        oVar.f42594f = this.f42636f;
        oVar.f42596h = this.f42638h;
        oVar.f42597i = this.f42639i;
        oVar.f42598j = this.f42641k;
        oVar.f42599k = this.l;
        oVar.l = this.f42642m;
        oVar.f42600m = this.f42643n;
        oVar.f42601n = this.f42644o;
        oVar.f42602o = this.f42645p;
        oVar.f42603p = this.f42646q;
        oVar.f42604q = this.f42647r;
        oVar.f42605r = this.f42648s;
        oVar.f42606s = this.f42649t;
        oVar.f42607t = this.f42650u;
        oVar.f42608u = this.f42651v;
        oVar.f42609v = this.f42652w;
        oVar.f42610w = this.f42653x;
        oVar.f42611x = this.f42654y;
        oVar.f42612y = this.f42655z;
        oVar.f42613z = this.A;
        oVar.A = this.B;
        oVar.B = this.C;
        oVar.C = this.D;
        oVar.D = this.E;
        oVar.E = this.F;
        oVar.F = this.G;
        oVar.G = this.H;
        oVar.H = this.I;
        oVar.I = this.J;
        oVar.J = this.K;
        oVar.K = this.L;
        oVar.L = this.M;
        oVar.M = this.N;
        oVar.N = this.O;
        return oVar;
    }

    public final boolean b(p pVar) {
        List list = this.f42646q;
        if (list.size() != pVar.f42646q.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) pVar.f42646q.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final p d(p pVar) {
        String str;
        String str2;
        int i10;
        int i11;
        if (this == pVar) {
            return this;
        }
        int iH = d0.h(this.f42643n);
        String str3 = pVar.f42631a;
        c0 c0VarB = pVar.l;
        oa.j0 j0Var = pVar.f42633c;
        int i12 = pVar.M;
        int i13 = pVar.N;
        String str4 = pVar.f42632b;
        if (str4 == null) {
            str4 = this.f42632b;
        }
        if (j0Var.isEmpty()) {
            j0Var = this.f42633c;
        }
        if ((iH != 3 && iH != 1) || (str = pVar.f42634d) == null) {
            str = this.f42634d;
        }
        int i14 = this.f42638h;
        if (i14 == -1) {
            i14 = pVar.f42638h;
        }
        int i15 = this.f42639i;
        if (i15 == -1) {
            i15 = pVar.f42639i;
        }
        String str5 = this.f42641k;
        if (str5 == null) {
            String strW = l1.y.w(pVar.f42641k, iH);
            if (l1.y.W(strW).length == 1) {
                str5 = strW;
            }
        }
        c0 c0Var = this.l;
        if (c0Var != null) {
            c0VarB = c0Var.b(c0VarB);
        }
        float f10 = this.f42654y;
        if (f10 == -1.0f && iH == 2) {
            f10 = pVar.f42654y;
        }
        int i16 = this.f42635e | pVar.f42635e;
        int i17 = this.f42636f | pVar.f42636f;
        m mVar = pVar.f42647r;
        ArrayList arrayList = new ArrayList();
        oa.j0 j0Var2 = j0Var;
        if (mVar != null) {
            String str6 = mVar.f42579c;
            l[] lVarArr = mVar.f42577a;
            int length = lVarArr.length;
            int i18 = 0;
            while (i18 < length) {
                int i19 = i18;
                l lVar = lVarArr[i19];
                int i20 = length;
                if (lVar.f42573e != null) {
                    arrayList.add(lVar);
                }
                i18 = i19 + 1;
                length = i20;
            }
            str2 = str6;
        } else {
            str2 = null;
        }
        m mVar2 = this.f42647r;
        if (mVar2 != null) {
            if (str2 == null) {
                str2 = mVar2.f42579c;
            }
            int size = arrayList.size();
            l[] lVarArr2 = mVar2.f42577a;
            String str7 = str2;
            int length2 = lVarArr2.length;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = i21;
                l lVar2 = lVarArr2[i22];
                int i23 = length2;
                if (lVar2.f42573e != null) {
                    UUID uuid = lVar2.f42570b;
                    i11 = i13;
                    int i24 = 0;
                    while (true) {
                        if (i24 >= size) {
                            i10 = size;
                            arrayList.add(lVar2);
                            break;
                        }
                        i10 = size;
                        if (((l) arrayList.get(i24)).f42570b.equals(uuid)) {
                            break;
                        }
                        i24++;
                        size = i10;
                    }
                } else {
                    i10 = size;
                    i11 = i13;
                }
                i21 = i22 + 1;
                length2 = i23;
                i13 = i11;
                size = i10;
            }
            str2 = str7;
        }
        int i25 = i13;
        m mVar3 = arrayList.isEmpty() ? null : new m(arrayList, str2);
        o oVarA = a();
        oVarA.f42589a = str3;
        oVarA.f42590b = str4;
        oVarA.f42591c = oa.j0.x(j0Var2);
        oVarA.f42592d = str;
        oVarA.f42593e = i16;
        oVarA.f42594f = i17;
        oVarA.f42596h = i14;
        oVarA.f42597i = i15;
        oVarA.f42598j = str5;
        oVarA.f42599k = c0VarB;
        oVarA.f42604q = mVar3;
        oVarA.f42611x = f10;
        oVarA.L = i12;
        oVarA.M = i25;
        return new p(oVarA);
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        int i11 = this.P;
        return (i11 == 0 || (i10 = pVar.P) == 0 || i11 == i10) && this.f42635e == pVar.f42635e && this.f42636f == pVar.f42636f && this.f42637g == pVar.f42637g && this.f42638h == pVar.f42638h && this.f42639i == pVar.f42639i && this.f42644o == pVar.f42644o && this.f42648s == pVar.f42648s && this.f42650u == pVar.f42650u && this.f42651v == pVar.f42651v && this.f42652w == pVar.f42652w && this.f42653x == pVar.f42653x && this.f42655z == pVar.f42655z && this.C == pVar.C && this.E == pVar.E && this.F == pVar.F && this.G == pVar.G && this.H == pVar.H && this.I == pVar.I && this.J == pVar.J && this.K == pVar.K && this.M == pVar.M && this.N == pVar.N && this.O == pVar.O && Float.compare(this.f42654y, pVar.f42654y) == 0 && Float.compare(this.A, pVar.A) == 0 && Objects.equals(this.f42631a, pVar.f42631a) && Objects.equals(this.f42632b, pVar.f42632b) && this.f42633c.equals(pVar.f42633c) && Objects.equals(this.f42641k, pVar.f42641k) && Objects.equals(this.f42642m, pVar.f42642m) && Objects.equals(this.f42643n, pVar.f42643n) && Objects.equals(this.f42634d, pVar.f42634d) && Arrays.equals(this.B, pVar.B) && Objects.equals(this.l, pVar.l) && Objects.equals(this.D, pVar.D) && Objects.equals(this.f42647r, pVar.f42647r) && b(pVar);
    }

    public final int hashCode() {
        if (this.P == 0) {
            String str = this.f42631a;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f42632b;
            int iHashCode2 = (this.f42633c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f42634d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f42635e) * 31) + this.f42636f) * 31) + this.f42637g) * 31) + this.f42638h) * 31) + this.f42639i) * 31;
            String str4 = this.f42641k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            c0 c0Var = this.l;
            int iHashCode5 = (iHashCode4 + (c0Var == null ? 0 : c0Var.hashCode())) * 961;
            String str5 = this.f42642m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f42643n;
            this.P = ((((((((((((((((((((((Float.floatToIntBits(this.A) + ((((Float.floatToIntBits(this.f42654y) + ((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f42644o) * 31) + ((int) this.f42648s)) * 31) + this.f42650u) * 31) + this.f42651v) * 31) + this.f42652w) * 31) + this.f42653x) * 31)) * 31) + this.f42655z) * 31)) * 31) + this.C) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.M) * 31) + this.N) * 31) + this.O;
        }
        return this.P;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f42631a);
        sb2.append(", ");
        sb2.append(this.f42632b);
        sb2.append(", ");
        sb2.append(this.f42642m);
        sb2.append(", ");
        sb2.append(this.f42643n);
        sb2.append(", ");
        sb2.append(this.f42641k);
        sb2.append(", ");
        sb2.append(this.f42640j);
        sb2.append(", ");
        sb2.append(this.f42634d);
        sb2.append(", [");
        sb2.append(this.f42650u);
        sb2.append(", ");
        sb2.append(this.f42651v);
        sb2.append(", ");
        sb2.append(this.f42654y);
        sb2.append(", ");
        sb2.append(this.D);
        sb2.append("], [");
        sb2.append(this.F);
        sb2.append(", ");
        return l1.d.i(sb2, this.G, "])");
    }
}
