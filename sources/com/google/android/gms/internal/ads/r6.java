package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r6 implements m2 {
    public static final /* synthetic */ int G = 0;
    public int A;
    public long B;
    public o2 C;
    public q6[] D;
    public long[][] E;
    public int F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7 f19409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final np0 f19411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final np0 f19412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final np0 f19413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final np0 f19414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f19415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u6 f19416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f19417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f19418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f19419k;
    public ya1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f19420m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f19421n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f19422o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f19423p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public np0 f19424q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f19425r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f19426s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f19427t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f19428u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f19429v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f19430w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f19431x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f19432y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f19433z;

    static {
        int i10 = x10.f21697x;
    }

    public r6() {
        this(p7.R8, 16);
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:152:0x0304  */
    /* JADX WARN: Code duplicated, block: B:161:0x0320  */
    /* JADX WARN: Code duplicated, block: B:163:0x0325  */
    /* JADX WARN: Code duplicated, block: B:166:0x0349  */
    /* JADX WARN: Code duplicated, block: B:169:0x0353  */
    /* JADX WARN: Code duplicated, block: B:172:0x0361 A[EDGE_INSN: B:172:0x0361->B:173:0x0363 BREAK  A[LOOP:7: B:167:0x034d->B:260:?]] */
    /* JADX WARN: Code duplicated, block: B:175:0x0367  */
    /* JADX WARN: Code duplicated, block: B:233:0x007a A[EDGE_INSN: B:233:0x007a->B:27:0x007a BREAK  A[LOOP:1: B:14:0x0046->B:25:0x0073], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x0361 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x035f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0073 A[LOOP:1: B:14:0x0046->B:25:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:260:? A[LOOP:7: B:167:0x034d->B:260:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    public final void a(long j10) {
        long j11;
        ArrayList arrayList;
        s8 s8VarE;
        s8 s8VarC;
        ArrayList arrayList2;
        int i10;
        ArrayList arrayList3;
        long j12;
        int i11;
        int i12;
        int i13;
        s8 s8Var;
        ArrayList arrayList4;
        s8 s8Var2;
        s8 s8Var3;
        s8 s8Var4;
        String str;
        g22 g22Var;
        boolean zEquals;
        int i14;
        boolean z10;
        q6 q6Var;
        ArrayList arrayList5;
        Iterator it;
        int i15;
        int i16;
        v7 v7Var;
        v7 v7Var2;
        int i17;
        while (true) {
            ArrayDeque arrayDeque = this.f19415g;
            if (arrayDeque.isEmpty() || ((j01) arrayDeque.peek()).f15889c != j10) {
                break;
            }
            j01 j01Var = (j01) arrayDeque.pop();
            if (j01Var.f22444b == 1836019574) {
                j01 j01VarH = j01Var.h(1835365473);
                ArrayList arrayList6 = new ArrayList();
                if (j01VarH != null) {
                    s8VarE = g6.e(j01VarH);
                    if (this.f19432y) {
                        s8VarE.getClass();
                        v7[] v7VarArr = s8VarE.f19891a;
                        int length = v7VarArr.length;
                        int i18 = 0;
                        while (true) {
                            if (i18 >= length) {
                                j11 = 0;
                                v7Var = null;
                                break;
                            }
                            v7 v7Var3 = v7VarArr[i18];
                            if (jz0.class.isAssignableFrom(v7Var3.getClass())) {
                                v7Var = (v7) jz0.class.cast(v7Var3);
                                j11 = 0;
                                if (!((jz0) v7Var).f16222a.equals("auxiliary.tracks.interleaved")) {
                                }
                                if (v7Var != null) {
                                    break;
                                } else {
                                    i18++;
                                }
                            } else {
                                j11 = 0;
                            }
                            v7Var = null;
                            if (v7Var != null) {
                                break;
                                break;
                            }
                            i18++;
                        }
                        jz0 jz0Var = (jz0) v7Var;
                        if (jz0Var != null && jz0Var.f16223b[0] == 0) {
                            this.B = j11 + 16;
                        }
                        int length2 = v7VarArr.length;
                        int i19 = 0;
                        while (true) {
                            if (i19 >= length2) {
                                v7Var2 = null;
                                break;
                            }
                            v7 v7Var4 = v7VarArr[i19];
                            if (jz0.class.isAssignableFrom(v7Var4.getClass())) {
                                v7Var2 = (v7) jz0.class.cast(v7Var4);
                                if (!((jz0) v7Var2).f16222a.equals("auxiliary.tracks.map")) {
                                    v7Var2 = null;
                                }
                            } else {
                                v7Var2 = null;
                            }
                            if (v7Var2 != null) {
                                break;
                            } else {
                                i19++;
                            }
                        }
                        jz0 jz0Var2 = (jz0) v7Var2;
                        jz0Var2.getClass();
                        ArrayList arrayListB = jz0Var2.b();
                        ArrayList arrayList7 = new ArrayList(arrayListB.size());
                        for (int i20 = 0; i20 < arrayListB.size(); i20++) {
                            int iIntValue = ((Integer) arrayListB.get(i20)).intValue();
                            if (iIntValue == 0) {
                                i17 = 1;
                            } else if (iIntValue != 1) {
                                i17 = 3;
                                if (iIntValue != 2) {
                                    i17 = iIntValue != 3 ? 0 : 4;
                                }
                            } else {
                                i17 = 2;
                            }
                            arrayList7.add(Integer.valueOf(i17));
                        }
                        arrayList = arrayList7;
                    } else {
                        j11 = 0;
                        arrayList = arrayList6;
                    }
                } else {
                    j11 = 0;
                    arrayList = arrayList6;
                    s8VarE = null;
                }
                ArrayList arrayList8 = new ArrayList();
                int i21 = this.F;
                v2 v2Var = new v2();
                w01 w01VarG = j01Var.g(1969517665);
                if (w01VarG != null) {
                    s8VarC = g6.c(w01VarG);
                    v2Var.a(s8VarC);
                } else {
                    s8VarC = null;
                }
                w01 w01VarG2 = j01Var.g(1836476516);
                w01VarG2.getClass();
                boolean z11 = 1 == i21;
                s8 s8Var5 = new s8(g6.d(w01VarG2.f21353c));
                s8 s8Var6 = s8VarC;
                s8 s8Var7 = s8Var5;
                ArrayList<z6> arrayListB2 = g6.b(j01Var, v2Var, C.TIME_UNSET, null, false, z11, i6.f15602b);
                if (this.f19432y) {
                    boolean z12 = arrayList.size() == arrayListB2.size();
                    Locale locale = Locale.US;
                    ps1.d0(l1.d.f("The number of auxiliary track types from metadata (", arrayList.size(), ") is not same as the number of auxiliary tracks (", arrayListB2.size(), ")"), z12);
                }
                ArrayList arrayList9 = new ArrayList();
                Iterator it2 = arrayListB2.iterator();
                while (it2.hasNext()) {
                    int i22 = ((z6) it2.next()).f22510a.l;
                    if (i22 != -1) {
                        Integer numValueOf = Integer.valueOf(i22);
                        if (!arrayList9.contains(numValueOf)) {
                            arrayList9.add(numValueOf);
                        }
                    }
                }
                ArrayList arrayList10 = this.f19418j;
                arrayList10.clear();
                for (z6 z6Var : arrayListB2) {
                    if (arrayList9.contains(Integer.valueOf(z6Var.f22510a.f21416a))) {
                        arrayList10.add(z6Var);
                    }
                }
                String strF = dv.f(arrayListB2);
                int size = -1;
                int i23 = 0;
                int i24 = 0;
                long j13 = C.TIME_UNSET;
                while (i23 < arrayListB2.size()) {
                    z6 z6Var2 = (z6) arrayListB2.get(i23);
                    ArrayDeque arrayDeque2 = arrayDeque;
                    int i25 = z6Var2.f22511b;
                    long[] jArr = z6Var2.f22515f;
                    int[] iArr = z6Var2.f22517h;
                    ArrayList arrayList11 = arrayListB2;
                    int i26 = z6Var2.f22514e;
                    if (i25 == 0) {
                        arrayList2 = arrayList10;
                    } else {
                        w6 w6Var = z6Var2.f22510a;
                        arrayList2 = arrayList10;
                        if (w6Var.f21427m) {
                            ArrayList arrayList12 = arrayList8;
                            o2 o2Var = this.C;
                            int i27 = i24 + 1;
                            String str2 = strF;
                            int i28 = w6Var.f21417b;
                            h3 h3VarE = o2Var.e(i24, i28);
                            q6 q6Var2 = new q6(w6Var, z6Var2, h3VarE);
                            s8 s8Var8 = s8VarE;
                            long j14 = w6Var.f21420e;
                            if (j14 == C.TIME_UNSET) {
                                j14 = z6Var2.f22518i;
                            }
                            h3VarE.getClass();
                            long jMax = Math.max(j13, j14);
                            g22 g22Var2 = w6Var.f21422g;
                            String str3 = g22Var2.f14678o;
                            int i29 = MimeTypes.AUDIO_TRUEHD.equals(str3) ? i26 * 16 : i26 + 30;
                            i12 i12Var = new i12(g22Var2);
                            i12Var.f15512o = i29;
                            if (i28 == 2) {
                                int i30 = g22Var2.f14670f;
                                if ((this.f19410b & 8) != 0) {
                                    i30 |= size == -1 ? 1 : 2;
                                }
                                if (this.f19432y) {
                                    i30 |= 32768;
                                    i12Var.f15505g = ((Integer) arrayList.get(i23)).intValue();
                                }
                                i12Var.f15504f = i30;
                                i28 = 2;
                            }
                            if (na.a(str3)) {
                                boolean z13 = z6Var2.f22519j;
                                i10 = i23;
                                arrayList3 = arrayList;
                                int iMin = Math.min(!z13 ? iArr.length : i25, 20);
                                ps1.c0(j14 != C.TIME_UNSET);
                                long jMin = Math.min(j14, 10000000L);
                                int i31 = 0;
                                int i32 = -1;
                                for (int i33 = 0; i33 < iMin; i33++) {
                                    int i34 = z13 ? i33 : iArr[i33];
                                    long j15 = jArr[i34];
                                    if (j15 > jMin) {
                                        break;
                                    }
                                    if (j15 >= j11 && (i12 = z6Var2.f22513d[(i11 = i34)]) > i31) {
                                        i31 = i12;
                                        i32 = i11;
                                    }
                                }
                                if (i32 != -1) {
                                    j12 = jArr[i32];
                                }
                                if (j12 != C.TIME_UNSET) {
                                    n4 n4Var = new n4(j12);
                                    i13 = 1;
                                    s8Var = new s8(n4Var);
                                } else {
                                    i13 = 1;
                                    s8Var = null;
                                }
                                if (i28 == i13 && (i15 = v2Var.f21004a) != -1 && (i16 = v2Var.f21005b) != -1) {
                                    i12Var.J = i15;
                                    i12Var.K = i16;
                                }
                                s8 s8Var9 = g22Var2.l;
                                arrayList4 = this.f19417i;
                                if (arrayList4.isEmpty()) {
                                    s8Var2 = null;
                                } else {
                                    s8Var2 = new s8(arrayList4);
                                }
                                s8Var3 = s8Var7;
                                s8Var4 = s8Var8;
                                ps1.r(i28, s8Var4, i12Var, s8Var9, s8Var2, s8Var6, s8Var3, s8Var);
                                str = str2;
                                i12Var.d(str);
                                g22Var = new g22(i12Var);
                                zEquals = Objects.equals(str3, MimeTypes.AUDIO_MPEG);
                                i14 = w6Var.l;
                                if (i14 != -1) {
                                    z10 = false;
                                    break;
                                }
                                it = arrayList2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((z6) it.next()).f22510a.f21416a == i14) {
                                            z10 = true;
                                            break;
                                        }
                                    } else {
                                        z10 = false;
                                        break;
                                    }
                                }
                                if (!zEquals || z10) {
                                    q6Var = q6Var2;
                                    q6Var.f18945f = g22Var;
                                } else {
                                    h3VarE.f(g22Var);
                                    q6Var = q6Var2;
                                }
                                if (i28 == 2 && size == -1) {
                                    size = arrayList12.size();
                                }
                                arrayList5 = arrayList12;
                                arrayList5.add(q6Var);
                                i24 = i27;
                                j13 = jMax;
                            } else {
                                i10 = i23;
                                arrayList3 = arrayList;
                            }
                            j12 = -9223372036854775807L;
                            if (j12 != C.TIME_UNSET) {
                                n4 n4Var2 = new n4(j12);
                                i13 = 1;
                                s8Var = new s8(n4Var2);
                            } else {
                                i13 = 1;
                                s8Var = null;
                            }
                            if (i28 == i13) {
                                i12Var.J = i15;
                                i12Var.K = i16;
                            }
                            s8 s8Var10 = g22Var2.l;
                            arrayList4 = this.f19417i;
                            if (arrayList4.isEmpty()) {
                                s8Var2 = null;
                            } else {
                                s8Var2 = new s8(arrayList4);
                            }
                            s8Var3 = s8Var7;
                            s8Var4 = s8Var8;
                            ps1.r(i28, s8Var4, i12Var, s8Var10, s8Var2, s8Var6, s8Var3, s8Var);
                            str = str2;
                            i12Var.d(str);
                            g22Var = new g22(i12Var);
                            zEquals = Objects.equals(str3, MimeTypes.AUDIO_MPEG);
                            i14 = w6Var.l;
                            if (i14 != -1) {
                                z10 = false;
                                break;
                            }
                            it = arrayList2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((z6) it.next()).f22510a.f21416a == i14) {
                                        z10 = true;
                                        break;
                                    }
                                } else {
                                    z10 = false;
                                    break;
                                }
                            }
                            if (zEquals) {
                                q6Var = q6Var2;
                                q6Var.f18945f = g22Var;
                            } else {
                                q6Var = q6Var2;
                                q6Var.f18945f = g22Var;
                            }
                            if (i28 == 2) {
                                size = arrayList12.size();
                            }
                            arrayList5 = arrayList12;
                            arrayList5.add(q6Var);
                            i24 = i27;
                            j13 = jMax;
                        }
                        i23 = i10 + 1;
                        strF = str;
                        s8Var7 = s8Var3;
                        s8VarE = s8Var4;
                        arrayDeque = arrayDeque2;
                        arrayList10 = arrayList2;
                        arrayList = arrayList3;
                        arrayList8 = arrayList5;
                        arrayListB2 = arrayList11;
                    }
                    str = strF;
                    i10 = i23;
                    arrayList3 = arrayList;
                    arrayList5 = arrayList8;
                    s8Var4 = s8VarE;
                    s8Var3 = s8Var7;
                    i23 = i10 + 1;
                    strF = str;
                    s8Var7 = s8Var3;
                    s8VarE = s8Var4;
                    arrayDeque = arrayDeque2;
                    arrayList10 = arrayList2;
                    arrayList = arrayList3;
                    arrayList8 = arrayList5;
                    arrayListB2 = arrayList11;
                }
                ArrayDeque arrayDeque3 = arrayDeque;
                ArrayList arrayList13 = arrayList10;
                int i35 = -1;
                q6[] q6VarArr = (q6[]) arrayList8.toArray(new q6[0]);
                this.D = q6VarArr;
                int length3 = q6VarArr.length;
                long[][] jArr2 = new long[length3][];
                int[] iArr2 = new int[length3];
                long[] jArr3 = new long[length3];
                boolean[] zArr = new boolean[length3];
                for (int i36 = 0; i36 < q6VarArr.length; i36++) {
                    jArr2[i36] = new long[q6VarArr[i36].f18941b.f22511b];
                    jArr3[i36] = q6VarArr[i36].f18941b.f22515f[0];
                }
                long j16 = j11;
                int i37 = 0;
                while (i37 < q6VarArr.length) {
                    int i38 = i35;
                    long j17 = Long.MAX_VALUE;
                    for (int i39 = 0; i39 < q6VarArr.length; i39++) {
                        if (!zArr[i39]) {
                            long j18 = jArr3[i39];
                            if (j18 <= j17) {
                                i38 = i39;
                                j17 = j18;
                            }
                        }
                    }
                    int i40 = iArr2[i38];
                    long[] jArr4 = jArr2[i38];
                    jArr4[i40] = j16;
                    z6 z6Var3 = q6VarArr[i38].f18941b;
                    q6[] q6VarArr2 = q6VarArr;
                    boolean[] zArr2 = zArr;
                    j16 += (long) z6Var3.f22513d[i40];
                    int i41 = i40 + 1;
                    iArr2[i38] = i41;
                    if (i41 < jArr4.length) {
                        jArr3[i38] = z6Var3.f22515f[i41];
                    } else {
                        zArr2[i38] = true;
                        i37++;
                    }
                    q6VarArr = q6VarArr2;
                    zArr = zArr2;
                    i35 = -1;
                }
                this.E = jArr2;
                this.C.zzv();
                this.C.o(new p6(j13, this.D, size));
                arrayDeque3.clear();
                if (!this.f19431x) {
                    this.f19420m = true != arrayList13.isEmpty() ? 4 : 2;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((j01) arrayDeque.peek()).f15891e.add(j01Var);
            }
        }
        int i42 = this.f19420m;
        if (i42 == 4 || i42 == 2) {
            return;
        }
        this.f19420m = 0;
        this.f19423p = 0;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean d(n2 n2Var) {
        ya1 ya1VarU;
        e3 e3VarW = dv.w(n2Var, false);
        if (e3VarW != null) {
            ya1VarU = ca1.u(e3VarW);
        } else {
            aa1 aa1Var = ca1.f13122b;
            ya1VarU = ya1.f22208e;
        }
        this.l = ya1VarU;
        return e3VarW == null;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void e(long j10, long j11) {
        this.f19415g.clear();
        this.f19423p = 0;
        this.f19425r = -1;
        this.f19426s = 0;
        this.f19427t = 0;
        this.f19428u = 0;
        this.f19429v = false;
        this.f19433z = 0;
        this.A = 0;
        this.f19418j.clear();
        this.f19419k.clear();
        if (j10 == 0) {
            if (this.f19420m != 3) {
                this.f19420m = 0;
                this.f19423p = 0;
                return;
            } else {
                u6 u6Var = this.f19416h;
                u6Var.f20645a.clear();
                u6Var.f20646b = 0;
                this.f19417i.clear();
                return;
            }
        }
        for (q6 q6Var : this.D) {
            z6 z6Var = q6Var.f18941b;
            int iA = z6Var.a(j11);
            if (iA == -1) {
                iA = z6Var.b(j11);
            }
            q6Var.f18944e = iA;
            i3 i3Var = q6Var.f18943d;
            if (i3Var != null) {
                i3Var.f15549b = false;
                i3Var.f15550c = 0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0373 A[PHI: r5 r12 r18 r29
  0x0373: PHI (r5v28 boolean) = (r5v21 boolean), (r5v24 boolean) binds: [B:136:0x0371, B:152:0x03a5] A[DONT_GENERATE, DONT_INLINE]
  0x0373: PHI (r12v14 int) = (r12v10 int), (r12v11 int) binds: [B:136:0x0371, B:152:0x03a5] A[DONT_GENERATE, DONT_INLINE]
  0x0373: PHI (r18v7 long) = (r18v3 long), (r18v4 long) binds: [B:136:0x0371, B:152:0x03a5] A[DONT_GENERATE, DONT_INLINE]
  0x0373: PHI (r29v7 long) = (r29v3 long), (r29v4 long) binds: [B:136:0x0371, B:152:0x03a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:150:0x039d  */
    /* JADX WARN: Code duplicated, block: B:277:0x0626 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:387:0x01ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x062f A[EDGE_INSN: B:391:0x062f->B:281:0x062f BREAK  A[LOOP:0: B:3:0x0006->B:410:0x0006], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x061c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x062a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x023a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01db  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.m2
    public final int f(n2 n2Var, q2 q2Var) throws ab {
        char c4;
        int i10;
        int iU;
        int i11;
        char c5;
        int i12;
        ArrayList arrayList;
        List listM;
        int i13;
        List listM2;
        boolean z10;
        boolean z11;
        int i14;
        while (true) {
            int i15 = this.f19420m;
            ArrayDeque arrayDeque = this.f19415g;
            np0 np0Var = this.f19413e;
            boolean z12 = true;
            if (i15 != 0) {
                int i16 = 4;
                if (i15 == 1) {
                    long j10 = this.f19422o - ((long) this.f19423p);
                    long jZzn = n2Var.zzn() + j10;
                    np0 np0Var2 = this.f19424q;
                    if (np0Var2 == null) {
                        if (!this.f19430w && this.f19421n == 1835295092) {
                            this.F = 1;
                        }
                        if (j10 < 262144) {
                            n2Var.zzf((int) j10);
                        } else {
                            q2Var.f18888a = n2Var.zzn() + j10;
                            z11 = true;
                        }
                        a(jZzn);
                        i11 = 1;
                        if (this.f19431x) {
                            this.f19432y = true;
                            q2Var.f18888a = 0L;
                            this.f19431x = false;
                        } else if (!z11) {
                            continue;
                        }
                        if (this.f19420m != 2) {
                            break;
                        }
                    } else {
                        n2Var.p(np0Var2.f17880a, this.f19423p, (int) j10);
                        if (this.f19421n == 1718909296) {
                            this.f19430w = true;
                            np0Var2.E(8);
                            if (np0Var2.b() == 1903435808) {
                                i14 = 1;
                                break;
                            }
                            np0Var2.G(4);
                            while (true) {
                                if (np0Var2.B() <= 0) {
                                    i14 = 0;
                                    break;
                                }
                                if (np0Var2.b() == 1903435808) {
                                    i14 = 1;
                                    break;
                                }
                            }
                            this.F = i14;
                        } else if (!arrayDeque.isEmpty()) {
                            ((j01) arrayDeque.peek()).f15890d.add(new w01(this.f19421n, np0Var2));
                        }
                    }
                    z11 = false;
                    a(jZzn);
                    i11 = 1;
                    if (this.f19431x) {
                        this.f19432y = true;
                        q2Var.f18888a = 0L;
                        this.f19431x = false;
                    } else if (!z11) {
                        continue;
                    }
                    if (this.f19420m != 2) {
                        break;
                        break;
                    }
                } else {
                    if (i15 == 2) {
                        long jZzn2 = n2Var.zzn();
                        int i17 = this.f19425r;
                        if (i17 == -1) {
                            boolean z13 = true;
                            boolean z14 = true;
                            int i18 = -1;
                            int i19 = -1;
                            int i20 = 0;
                            long j11 = Long.MAX_VALUE;
                            long j12 = Long.MAX_VALUE;
                            long j13 = Long.MAX_VALUE;
                            while (true) {
                                q6[] q6VarArr = this.D;
                                if (i20 >= q6VarArr.length) {
                                    break;
                                }
                                q6 q6Var = q6VarArr[i20];
                                int i21 = q6Var.f18944e;
                                z6 z6Var = q6Var.f18941b;
                                boolean z15 = z13;
                                if (i21 == z6Var.f22511b) {
                                    z13 = z15;
                                } else {
                                    long j14 = z6Var.f22512c[i21];
                                    long[][] jArr = this.E;
                                    jArr.getClass();
                                    long j15 = jArr[i20][i21];
                                    long j16 = j14 - jZzn2;
                                    z13 = j16 < 0 || j16 >= 262144;
                                    if (z13) {
                                        if (z13 == z14 && j16 < j13) {
                                            z14 = z13;
                                            j12 = j15;
                                            i19 = i20;
                                            j13 = j16;
                                        }
                                    } else if (z14) {
                                        z14 = z13;
                                        j12 = j15;
                                        i19 = i20;
                                        j13 = j16;
                                    } else {
                                        z14 = false;
                                        if (z13 == z14) {
                                            z14 = z13;
                                            j12 = j15;
                                            i19 = i20;
                                            j13 = j16;
                                        }
                                    }
                                    if (j15 < j11) {
                                        j11 = j15;
                                        i18 = i20;
                                    } else {
                                        z13 = z15;
                                    }
                                }
                                i20++;
                            }
                            i17 = (j11 == Long.MAX_VALUE || !z13 || j12 < j11 + 10485760) ? i19 : i18;
                            this.f19425r = i17;
                            if (i17 == -1) {
                                return -1;
                            }
                        }
                        q6 q6Var2 = this.D[i17];
                        h3 h3Var = q6Var2.f18942c;
                        int i22 = q6Var2.f18944e;
                        z6 z6Var2 = q6Var2.f18941b;
                        long j17 = z6Var2.f22512c[i22] + this.B;
                        int[] iArr = z6Var2.f22513d;
                        int i23 = iArr[i22];
                        i3 i3Var = q6Var2.f18943d;
                        long j18 = (j17 - jZzn2) + ((long) this.f19426s);
                        if (j18 < 0 || j18 >= 262144) {
                            q2Var.f18888a = j17;
                            return 1;
                        }
                        w6 w6Var = q6Var2.f18940a;
                        if (w6Var.f21423h == 1) {
                            j18 += 8;
                            i23 -= 8;
                        }
                        n2Var.zzf((int) j18);
                        g22 g22Var = w6Var.f21422g;
                        String str = g22Var.f14678o;
                        boolean zEquals = Objects.equals(str, "video/avc");
                        int i24 = this.f19410b;
                        if (!zEquals ? !Objects.equals(str, "video/hevc") ? Objects.equals(str, "video/apv") : (i24 & 128) != 0 : (i24 & 32) != 0) {
                            c4 = 1;
                        } else {
                            c4 = 1;
                            this.f19429v = true;
                        }
                        int i25 = w6Var.f21426k;
                        if (i25 == 0) {
                            if ("audio/ac4".equals(str)) {
                                if (this.f19427t == 0) {
                                    rb0.w(i23, np0Var);
                                    h3Var.b(7, np0Var);
                                    this.f19427t += 7;
                                }
                                i23 += 7;
                            } else if (q6Var2.f18945f != null && Objects.equals(str, MimeTypes.AUDIO_MPEG)) {
                                g22 g22Var2 = q6Var2.f18945f;
                                np0Var.y(4);
                                n2Var.v(np0Var.f17880a, 0, 4);
                                n2Var.zzl();
                                y2 y2Var = new y2();
                                if (y2Var.b(np0Var.b()) && !Objects.equals(g22Var2.f14678o, y2Var.f22083b)) {
                                    i12 i12Var = new i12(g22Var2);
                                    String str2 = y2Var.f22083b;
                                    str2.getClass();
                                    i12Var.e(str2);
                                    g22Var2 = new g22(i12Var);
                                }
                                h3Var.f(g22Var2);
                                q6Var2.f18945f = null;
                            } else if (i3Var != null) {
                                i3Var.d(n2Var);
                            }
                            while (true) {
                                int i26 = this.f19427t;
                                if (i26 >= i23) {
                                    break;
                                }
                                int iE = h3Var.e(n2Var, i23 - i26, false);
                                this.f19426s += iE;
                                this.f19427t += iE;
                                this.f19428u -= iE;
                            }
                        } else {
                            np0 np0Var3 = this.f19412d;
                            byte[] bArr = np0Var3.f17880a;
                            bArr[0] = 0;
                            bArr[c4] = 0;
                            bArr[2] = 0;
                            int i27 = 4 - i25;
                            i23 += i27;
                            while (this.f19427t < i23) {
                                int i28 = this.f19428u;
                                if (i28 == 0) {
                                    if (this.f19429v || dv.u(g22Var) + i25 > iArr[i22] - this.f19426s) {
                                        i10 = i25;
                                        iU = 0;
                                    } else {
                                        iU = dv.u(g22Var);
                                        i10 = i25 + iU;
                                    }
                                    n2Var.p(bArr, i27, i10);
                                    this.f19426s += i10;
                                    np0Var3.E(0);
                                    int iB = np0Var3.b();
                                    if (iB < 0) {
                                        throw ab.a(null, "Invalid NAL length");
                                    }
                                    this.f19428u = iB - iU;
                                    np0 np0Var4 = this.f19411c;
                                    np0Var4.E(0);
                                    h3Var.b(4, np0Var4);
                                    this.f19427t += 4;
                                    if (iU > 0) {
                                        h3Var.b(iU, np0Var3);
                                        this.f19427t += iU;
                                        if (dv.D(bArr, iU, g22Var)) {
                                            this.f19429v = true;
                                        }
                                    }
                                } else {
                                    int iE2 = h3Var.e(n2Var, i28, false);
                                    this.f19426s += iE2;
                                    this.f19427t += iE2;
                                    this.f19428u -= iE2;
                                }
                            }
                        }
                        int i29 = i23;
                        long j19 = z6Var2.f22515f[i22];
                        int i30 = z6Var2.f22516g[i22];
                        if (!this.f19429v) {
                            i30 |= 67108864;
                        }
                        int i31 = i30;
                        if (i3Var != null) {
                            i3Var.e(h3Var, j19, i31, i29, 0, null);
                            if (i22 + 1 == z6Var2.f22511b) {
                                i3Var.f(h3Var, null);
                            }
                        } else {
                            h3Var.c(j19, i31, i29, 0, null);
                        }
                        q6Var2.f18944e++;
                        this.f19425r = -1;
                        this.f19426s = 0;
                        this.f19427t = 0;
                        this.f19428u = 0;
                        this.f19429v = false;
                        return 0;
                    }
                    if (i15 != 3) {
                        int i32 = this.f19433z;
                        ArrayList arrayList2 = this.f19418j;
                        z6 z6Var3 = (z6) arrayList2.get(i32);
                        int i33 = this.A;
                        int i34 = z6Var3.f22511b;
                        ArrayList arrayList3 = this.f19419k;
                        if (i33 < i34) {
                            long j20 = z6Var3.f22512c[i33];
                            if (n2Var.zzn() != j20) {
                                q2Var.f18888a = j20;
                                return 1;
                            }
                            int i35 = z6Var3.f22513d[this.A];
                            np0Var.y(i35);
                            n2Var.p(np0Var.f17880a, 0, i35);
                            String strK = np0Var.k(Math.min(np0Var.L(), np0Var.B()), StandardCharsets.UTF_8);
                            long[] jArr2 = z6Var3.f22515f;
                            long jS = uu0.s(jArr2[this.A]);
                            int i36 = this.A + 1;
                            arrayList3.add(new l4(jS, i36 < i34 ? uu0.s(jArr2[i36]) : uu0.s(z6Var3.f22518i), false, new i32(null, strK)));
                            this.A++;
                            return 0;
                        }
                        q6[] q6VarArr2 = this.D;
                        int length = q6VarArr2.length;
                        int i37 = 0;
                        while (i37 < length) {
                            q6 q6Var3 = q6VarArr2[i37];
                            if (q6Var3.f18940a.l == z6Var3.f22510a.f21416a) {
                                g22 g22Var3 = q6Var3.f18945f;
                                g22Var3.getClass();
                                s8 s8Var = g22Var3.l;
                                ArrayList arrayList4 = new ArrayList();
                                z10 = z12;
                                if (s8Var != null) {
                                    arrayList4.addAll(s8Var.a(v7.class, u2.f20598d));
                                }
                                arrayList4.addAll(arrayList3);
                                i12 i12Var2 = new i12(g22Var3);
                                i12Var2.f15509k = new s8(arrayList4);
                                g22 g22Var4 = new g22(i12Var2);
                                if (Objects.equals(g22Var4.f14678o, MimeTypes.AUDIO_MPEG)) {
                                    q6Var3.f18945f = g22Var4;
                                } else {
                                    q6Var3.f18942c.f(g22Var4);
                                    q6Var3.f18945f = null;
                                }
                            } else {
                                z10 = z12;
                            }
                            i37++;
                            z12 = z10;
                        }
                        this.f19433z++;
                        this.A = 0;
                        arrayList3.clear();
                        if (this.f19433z != arrayList2.size()) {
                            return 0;
                        }
                        this.f19420m = 2;
                        return 0;
                    }
                    u6 u6Var = this.f19416h;
                    ArrayList arrayList5 = u6Var.f20645a;
                    int i38 = u6Var.f20646b;
                    if (i38 != 0) {
                        if (i38 != 1) {
                            char c10 = 2820;
                            short s10 = 2817;
                            int i39 = 8;
                            short s11 = 2816;
                            short s12 = 2192;
                            if (i38 != 2) {
                                long jZzn3 = n2Var.zzn();
                                int iZzo = (int) ((n2Var.zzo() - n2Var.zzn()) - ((long) u6Var.f20647c));
                                np0 np0Var5 = new np0(iZzo);
                                n2Var.p(np0Var5.f17880a, 0, iZzo);
                                int i40 = 0;
                                while (i40 < arrayList5.size()) {
                                    t6 t6Var = (t6) arrayList5.get(i40);
                                    np0Var5.E((int) (t6Var.f20197a - jZzn3));
                                    np0Var5.G(i16);
                                    int iC = np0Var5.c();
                                    Charset charset = StandardCharsets.UTF_8;
                                    String strK2 = np0Var5.k(iC, charset);
                                    switch (strK2.hashCode()) {
                                        case -1711564334:
                                            if (!strK2.equals("SlowMotion_Data")) {
                                                throw ab.a(null, "Invalid SEF name");
                                            }
                                            c5 = 2192;
                                            i12 = t6Var.f20198b - (iC + 8);
                                            if (c5 == 2192) {
                                                arrayList = new ArrayList();
                                                listM = u6.f20644e.m(np0Var5.k(i12, charset));
                                                for (i13 = 0; i13 < listM.size(); i13++) {
                                                    listM2 = u6.f20643d.m((CharSequence) listM.get(i13));
                                                    if (listM2.size() != 3) {
                                                        throw ab.a(null, null);
                                                    }
                                                    try {
                                                        arrayList.add(new e5(Long.parseLong((String) listM2.get(0)), Long.parseLong((String) listM2.get(1)), 1 << (Integer.parseInt((String) listM2.get(2)) - 1)));
                                                    } catch (NumberFormatException e10) {
                                                        throw ab.a(e10, null);
                                                    }
                                                }
                                                this.f19417i.add(new g5(arrayList));
                                            } else if (c5 == 2816 && c5 != 2817 && c5 != 2819 && c5 != c10) {
                                                throw new IllegalStateException();
                                            }
                                            i40++;
                                            c10 = 2820;
                                            i16 = 4;
                                            break;
                                            break;
                                        case -1332107749:
                                            if (!strK2.equals("Super_SlowMotion_Edit_Data")) {
                                                throw ab.a(null, "Invalid SEF name");
                                            }
                                            c5 = 2819;
                                            i12 = t6Var.f20198b - (iC + 8);
                                            if (c5 == 2192) {
                                                arrayList = new ArrayList();
                                                listM = u6.f20644e.m(np0Var5.k(i12, charset));
                                                while (i13 < listM.size()) {
                                                    listM2 = u6.f20643d.m((CharSequence) listM.get(i13));
                                                    if (listM2.size() != 3) {
                                                        throw ab.a(null, null);
                                                    }
                                                    arrayList.add(new e5(Long.parseLong((String) listM2.get(0)), Long.parseLong((String) listM2.get(1)), 1 << (Integer.parseInt((String) listM2.get(2)) - 1)));
                                                }
                                                this.f19417i.add(new g5(arrayList));
                                            } else if (c5 == 2816) {
                                                continue;
                                            }
                                            i40++;
                                            c10 = 2820;
                                            i16 = 4;
                                            break;
                                            break;
                                        case -1251387154:
                                            if (!strK2.equals("Super_SlowMotion_Data")) {
                                                throw ab.a(null, "Invalid SEF name");
                                            }
                                            c5 = 2816;
                                            i12 = t6Var.f20198b - (iC + 8);
                                            if (c5 == 2192) {
                                                arrayList = new ArrayList();
                                                listM = u6.f20644e.m(np0Var5.k(i12, charset));
                                                while (i13 < listM.size()) {
                                                    listM2 = u6.f20643d.m((CharSequence) listM.get(i13));
                                                    if (listM2.size() != 3) {
                                                        throw ab.a(null, null);
                                                    }
                                                    arrayList.add(new e5(Long.parseLong((String) listM2.get(0)), Long.parseLong((String) listM2.get(1)), 1 << (Integer.parseInt((String) listM2.get(2)) - 1)));
                                                }
                                                this.f19417i.add(new g5(arrayList));
                                            } else if (c5 == 2816) {
                                                continue;
                                            }
                                            i40++;
                                            c10 = 2820;
                                            i16 = 4;
                                            break;
                                            break;
                                        case -830665521:
                                            if (!strK2.equals("Super_SlowMotion_Deflickering_On")) {
                                                throw ab.a(null, "Invalid SEF name");
                                            }
                                            c5 = c10;
                                            i12 = t6Var.f20198b - (iC + 8);
                                            if (c5 == 2192) {
                                                arrayList = new ArrayList();
                                                listM = u6.f20644e.m(np0Var5.k(i12, charset));
                                                while (i13 < listM.size()) {
                                                    listM2 = u6.f20643d.m((CharSequence) listM.get(i13));
                                                    if (listM2.size() != 3) {
                                                        throw ab.a(null, null);
                                                    }
                                                    arrayList.add(new e5(Long.parseLong((String) listM2.get(0)), Long.parseLong((String) listM2.get(1)), 1 << (Integer.parseInt((String) listM2.get(2)) - 1)));
                                                }
                                                this.f19417i.add(new g5(arrayList));
                                            } else if (c5 == 2816) {
                                                continue;
                                            }
                                            i40++;
                                            c10 = 2820;
                                            i16 = 4;
                                            break;
                                            break;
                                        case 1760745220:
                                            if (!strK2.equals("Super_SlowMotion_BGM")) {
                                                throw ab.a(null, "Invalid SEF name");
                                            }
                                            c5 = 2817;
                                            i12 = t6Var.f20198b - (iC + 8);
                                            if (c5 == 2192) {
                                                arrayList = new ArrayList();
                                                listM = u6.f20644e.m(np0Var5.k(i12, charset));
                                                while (i13 < listM.size()) {
                                                    listM2 = u6.f20643d.m((CharSequence) listM.get(i13));
                                                    if (listM2.size() != 3) {
                                                        throw ab.a(null, null);
                                                    }
                                                    arrayList.add(new e5(Long.parseLong((String) listM2.get(0)), Long.parseLong((String) listM2.get(1)), 1 << (Integer.parseInt((String) listM2.get(2)) - 1)));
                                                }
                                                this.f19417i.add(new g5(arrayList));
                                            } else if (c5 == 2816) {
                                                continue;
                                            }
                                            i40++;
                                            c10 = 2820;
                                            i16 = 4;
                                            break;
                                            break;
                                        default:
                                            throw ab.a(null, "Invalid SEF name");
                                    }
                                }
                                q2Var.f18888a = 0L;
                            } else {
                                long jZzo = n2Var.zzo();
                                int i41 = u6Var.f20647c - 20;
                                np0 np0Var6 = new np0(i41);
                                n2Var.p(np0Var6.f17880a, 0, i41);
                                int i42 = 0;
                                while (i42 < i41 / 12) {
                                    np0Var6.G(2);
                                    np0Var6.v(2);
                                    byte[] bArr2 = np0Var6.f17880a;
                                    int i43 = np0Var6.f17881b;
                                    int i44 = i43 + 1;
                                    np0Var6.f17881b = i44;
                                    int i45 = bArr2[i43] & 255;
                                    np0Var6.f17881b = i43 + 2;
                                    short s13 = (short) (((bArr2[i44] & 255) << 8) | i45);
                                    if (s13 != s12 && s13 != s11 && s13 != s10) {
                                        if (s13 != 2819 && s13 != 2820) {
                                            np0Var6.G(i39);
                                        }
                                        i42++;
                                        s12 = 2192;
                                        s10 = 2817;
                                        s11 = 2816;
                                        i39 = 8;
                                    }
                                    arrayList5.add(new t6((jZzo - ((long) u6Var.f20647c)) - ((long) np0Var6.c()), np0Var6.c()));
                                    i42++;
                                    s12 = 2192;
                                    s10 = 2817;
                                    s11 = 2816;
                                    i39 = 8;
                                }
                                if (arrayList5.isEmpty()) {
                                    q2Var.f18888a = 0L;
                                } else {
                                    u6Var.f20646b = 3;
                                    q2Var.f18888a = ((t6) arrayList5.get(0)).f20197a;
                                }
                            }
                        } else {
                            np0 np0Var7 = new np0(8);
                            n2Var.p(np0Var7.f17880a, 0, 8);
                            u6Var.f20647c = np0Var7.c() + 8;
                            if (np0Var7.b() != 1397048916) {
                                q2Var.f18888a = 0L;
                            } else {
                                q2Var.f18888a = n2Var.zzn() - ((long) (u6Var.f20647c - 12));
                                u6Var.f20646b = 2;
                            }
                        }
                        i11 = 1;
                    } else {
                        long jZzo2 = n2Var.zzo();
                        q2Var.f18888a = (jZzo2 == -1 || jZzo2 < 8) ? 0L : jZzo2 - 8;
                        i11 = 1;
                        u6Var.f20646b = 1;
                    }
                    if (q2Var.f18888a == 0) {
                        this.f19420m = 0;
                        this.f19423p = 0;
                        return i11;
                    }
                }
            } else {
                int i46 = this.f19423p;
                np0 np0Var8 = this.f19414f;
                if (i46 == 0) {
                    if (!n2Var.x(np0Var8.f17880a, 0, 8, true)) {
                        return -1;
                    }
                    this.f19423p = 8;
                    np0Var8.E(0);
                    this.f19422o = np0Var8.P();
                    this.f19421n = np0Var8.b();
                }
                long j21 = this.f19422o;
                if (j21 == 1) {
                    n2Var.p(np0Var8.f17880a, 8, 8);
                    this.f19423p += 8;
                    this.f19422o = np0Var8.j();
                } else if (j21 == 0) {
                    long jZzo3 = n2Var.zzo();
                    if (jZzo3 == -1) {
                        j01 j01Var = (j01) arrayDeque.peek();
                        jZzo3 = j01Var != null ? j01Var.f15889c : -1L;
                    }
                    if (jZzo3 != -1) {
                        this.f19422o = (jZzo3 - n2Var.zzn()) + ((long) this.f19423p);
                    }
                }
                long j22 = this.f19422o;
                int i47 = this.f19423p;
                long j23 = i47;
                if (j22 < j23) {
                    if (this.f19421n != 1718773093 || i47 != 8) {
                        throw ab.b("Atom size less than header length (unsupported).");
                    }
                    this.f19422o = j23;
                    i47 = 8;
                }
                int i48 = this.f19421n;
                if (i48 == 1836019574 || i48 == 1953653099 || i48 == 1835297121 || i48 == 1835626086 || i48 == 1937007212 || i48 == 1701082227 || i48 == 1835365473 || i48 == 1635284069 || i48 == 1953654118) {
                    long jZzn4 = n2Var.zzn();
                    long j24 = this.f19422o;
                    long j25 = jZzn4 + j24;
                    long j26 = this.f19423p;
                    if (j24 != j26 && this.f19421n == 1835365473) {
                        np0Var.y(8);
                        n2Var.v(np0Var.f17880a, 0, 8);
                        g6.f(np0Var);
                        n2Var.zzf(np0Var.f17881b);
                        n2Var.zzl();
                    }
                    long j27 = j25 - j26;
                    arrayDeque.push(new j01(this.f19421n, j27));
                    if (this.f19422o == this.f19423p) {
                        a(j27);
                    } else {
                        this.f19420m = 0;
                        this.f19423p = 0;
                    }
                } else {
                    if (i48 == 1835296868 || i48 == 1836476516 || i48 == 1751411826 || i48 == 1937011556 || i48 == 1937011827 || i48 == 1937011571 || i48 == 1668576371 || i48 == 1701606260 || i48 == 1937011555 || i48 == 1937011578 || i48 == 1937013298 || i48 == 1937007471 || i48 == 1668232756 || i48 == 1953196132 || i48 == 1718909296 || i48 == 1969517665 || i48 == 1801812339 || i48 == 1768715124 || i48 == 1667785072) {
                        ps1.c0(i47 == 8);
                        ps1.c0(this.f19422o <= 2147483647L);
                        np0 np0Var9 = new np0((int) this.f19422o);
                        System.arraycopy(np0Var8.f17880a, 0, np0Var9.f17880a, 0, 8);
                        this.f19424q = np0Var9;
                    } else {
                        this.f19424q = null;
                    }
                    this.f19420m = 1;
                }
            }
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void g(o2 o2Var) {
        if ((this.f19410b & 16) == 0) {
            o2Var = new bc.s(o2Var, this.f19409a);
        }
        this.C = o2Var;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final /* synthetic */ List zzb() {
        return this.l;
    }

    public r6(p7 p7Var, int i10) {
        this.f19409a = p7Var;
        this.f19410b = i10;
        aa1 aa1Var = ca1.f13122b;
        this.l = ya1.f22208e;
        this.f19420m = 0;
        this.f19416h = new u6();
        this.f19417i = new ArrayList();
        this.f19414f = new np0(16);
        this.f19415g = new ArrayDeque();
        this.f19411c = new np0(dv.f13741n);
        this.f19412d = new np0(6);
        this.f19413e = new np0();
        this.f19425r = -1;
        this.C = o2.Q8;
        this.D = new q6[0];
        this.f19418j = new ArrayList();
        this.f19419k = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void zzf() {
    }
}
