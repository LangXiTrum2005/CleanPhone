package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m6 implements m2 {
    public static final byte[] N = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final g22 O;
    public l6 A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public o2 G;
    public h3[] H;
    public h3[] I;
    public boolean J;
    public boolean K;
    public long L;
    public long M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7 f17280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f17282c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f17287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final np0 f17288i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kj1 f17292n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final so0 f17293o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ya1 f17294p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17295q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17296r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f17297s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f17298t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public np0 f17299u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f17300v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17301w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f17302x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f17303y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f17304z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lj1 f17289j = new lj1(3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final np0 f17290k = new np0(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final np0 f17284e = new np0(dv.f13741n);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final np0 f17285f = new np0(6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final np0 f17286g = new np0();
    public final ArrayDeque l = new ArrayDeque();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayDeque f17291m = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f17283d = new SparseArray();

    static {
        i12 i12Var = new i12();
        i12Var.e(MimeTypes.APPLICATION_EMSG);
        O = new g22(i12Var);
    }

    public m6(p7 p7Var, int i10, ya1 ya1Var) {
        this.f17280a = p7Var;
        this.f17281b = i10;
        this.f17282c = Collections.unmodifiableList(ya1Var);
        byte[] bArr = new byte[16];
        this.f17287h = bArr;
        this.f17288i = new np0(bArr);
        aa1 aa1Var = ca1.f13122b;
        this.f17294p = ya1.f22208e;
        this.f17303y = C.TIME_UNSET;
        this.f17302x = C.TIME_UNSET;
        this.f17304z = C.TIME_UNSET;
        this.G = o2.Q8;
        this.H = new h3[0];
        this.I = new h3[0];
        this.f17292n = new kj1(new b21(this, 3));
        this.f17293o = new so0(2);
        this.L = -1L;
        this.M = -1L;
    }

    public static void c(int i10) throws ab {
        if (i10 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 27);
        sb2.append("Unexpected negative value: ");
        sb2.append(i10);
        throw ab.a(null, sb2.toString());
    }

    public static void h(np0 np0Var, int i10, y6 y6Var) throws ab {
        np0Var.E(i10 + 8);
        int iB = np0Var.b();
        byte[] bArr = g6.f14774a;
        if ((iB & 1) != 0) {
            throw ab.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iB & 2) != 0;
        int iH = np0Var.h();
        if (iH == 0) {
            Arrays.fill(y6Var.f22170k, 0, y6Var.f22163d, false);
            return;
        }
        int i11 = y6Var.f22163d;
        np0 np0Var2 = (np0) y6Var.f22175q;
        if (iH != i11) {
            throw ab.a(null, l1.d.j(new StringBuilder(String.valueOf(iH).length() + 58 + String.valueOf(i11).length()), iH, "Senc sample count ", i11, " is different from fragment sample count"));
        }
        Arrays.fill(y6Var.f22170k, 0, iH, z10);
        np0Var2.y(np0Var.B());
        y6Var.f22169j = true;
        y6Var.l = true;
        np0Var.H(np0Var2.f17880a, 0, np0Var2.f17882c);
        np0Var2.E(0);
        y6Var.l = false;
    }

    public static Pair i(long j10, np0 np0Var) throws ab {
        long j11;
        long j12;
        np0 np0Var2 = np0Var;
        np0Var2.E(8);
        int iA = g6.a(np0Var2.b());
        np0Var2.G(4);
        long jP = np0Var2.P();
        if (iA == 0) {
            j11 = np0Var2.P();
            j12 = np0Var2.P();
        } else {
            j11 = np0Var2.j();
            j12 = np0Var2.j();
        }
        long j13 = j12 + j10;
        long jV = uu0.v(j11, 1000000L, jP, RoundingMode.DOWN);
        np0Var2.G(2);
        int iL = np0Var2.L();
        int[] iArr = new int[iL];
        long[] jArr = new long[iL];
        long[] jArr2 = new long[iL];
        long[] jArr3 = new long[iL];
        long j14 = j13;
        long j15 = jV;
        int i10 = 0;
        while (i10 < iL) {
            int iB = np0Var2.b();
            if ((Integer.MIN_VALUE & iB) != 0) {
                throw ab.a(null, "Unhandled indirect reference");
            }
            long jP2 = np0Var2.P();
            iArr[i10] = iB & Integer.MAX_VALUE;
            jArr[i10] = j14;
            jArr3[i10] = j15;
            j11 += jP2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jV2 = uu0.v(j11, 1000000L, jP, RoundingMode.DOWN);
            jArr4[i10] = jV2 - jArr5[i10];
            np0Var2.G(4);
            j14 += (long) iArr[i10];
            i10++;
            iL = iL;
            np0Var2 = np0Var;
            j15 = jV2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jV), new g2(iArr, jArr, jArr2, jArr3));
    }

    public static g02 j(List list) {
        int i10;
        UUID uuid;
        vf vfVar;
        int size = list.size();
        int i11 = 0;
        ArrayList arrayList = null;
        while (i11 < size) {
            w01 w01Var = (w01) list.get(i11);
            if (w01Var.f22444b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = w01Var.f21353c.f17880a;
                np0 np0Var = new np0(bArr);
                if (np0Var.f17882c < 32) {
                    i10 = i11;
                    vfVar = null;
                    uuid = null;
                } else {
                    np0Var.E(0);
                    int iB = np0Var.B();
                    int iB2 = np0Var.b();
                    if (iB2 != iB) {
                        v71.y("PsshAtomUtil", l1.d.j(new StringBuilder(String.valueOf(iB2).length() + 52 + String.valueOf(iB).length()), iB2, "Advertised atom size (", iB, ") does not match buffer size: "));
                    } else {
                        int iB3 = np0Var.b();
                        if (iB3 != 1886614376) {
                            com.applovin.impl.ca.r(new StringBuilder(String.valueOf(iB3).length() + 23), "Atom type is not pssh: ", iB3, "PsshAtomUtil");
                        } else {
                            int iA = g6.a(np0Var.b());
                            if (iA > 1) {
                                com.applovin.impl.ca.r(new StringBuilder(String.valueOf(iA).length() + 26), "Unsupported pssh version: ", iA, "PsshAtomUtil");
                            } else {
                                UUID uuid2 = new UUID(np0Var.d(), np0Var.d());
                                if (iA == 1) {
                                    int iH = np0Var.h();
                                    UUID[] uuidArr = new UUID[iH];
                                    int i12 = 0;
                                    while (i12 < iH) {
                                        uuidArr[i12] = new UUID(np0Var.d(), np0Var.d());
                                        i12++;
                                        i11 = i11;
                                    }
                                }
                                i10 = i11;
                                uuid = null;
                                int iH2 = np0Var.h();
                                int iB4 = np0Var.B();
                                if (iH2 != iB4) {
                                    v71.y("PsshAtomUtil", l1.d.j(new StringBuilder(String.valueOf(iH2).length() + 49 + String.valueOf(iB4).length()), iH2, "Atom data size (", iB4, ") does not match the bytes left: "));
                                    vfVar = null;
                                } else {
                                    np0Var.H(new byte[iH2], 0, iH2);
                                    vfVar = new vf(uuid2, 3);
                                }
                            }
                        }
                    }
                    i10 = i11;
                    vfVar = null;
                    uuid = null;
                }
                UUID uuid3 = vfVar == null ? uuid : (UUID) vfVar.f21157b;
                if (uuid3 == null) {
                    v71.y("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new c02(uuid3, MimeTypes.VIDEO_MP4, bArr));
                }
            } else {
                i10 = i11;
            }
            i11 = i10 + 1;
        }
        if (arrayList == null) {
            return null;
        }
        return new g02(null, false, (c02[]) arrayList.toArray(new c02[0]));
    }

    public final void a() {
        this.f17295q = 0;
        this.f17298t = 0;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0452 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x0454  */
    /* JADX WARN: Code duplicated, block: B:162:0x0459  */
    /* JADX WARN: Code duplicated, block: B:165:0x0460  */
    /* JADX WARN: Code duplicated, block: B:166:0x0469  */
    /* JADX WARN: Code duplicated, block: B:169:0x0472  */
    /* JADX WARN: Code duplicated, block: B:170:0x0479  */
    /* JADX WARN: Code duplicated, block: B:171:0x047b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x047d  */
    /* JADX WARN: Code duplicated, block: B:173:0x0481  */
    /* JADX WARN: Code duplicated, block: B:174:0x0482 A[PHI: r12
  0x0482: PHI (r12v26 int) = (r12v24 int), (r12v27 int) binds: [B:170:0x0479, B:173:0x0481] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:176:0x0486  */
    /* JADX WARN: Code duplicated, block: B:178:0x0493  */
    /* JADX WARN: Code duplicated, block: B:181:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:184:0x04be  */
    /* JADX WARN: Code duplicated, block: B:185:0x04c0  */
    public final void b(long j10) throws ab {
        s8 s8Var;
        int i10;
        int i11;
        long j11;
        h6 h6Var;
        int i12;
        h6 h6Var2;
        ArrayList arrayList;
        int i13;
        ArrayList arrayList2;
        int i14;
        int i15;
        int i16;
        byte[] bArr;
        int i17;
        boolean z10;
        int i18;
        int i19;
        int i20;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        int i21;
        long j12;
        long j13;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        long jV;
        boolean z11;
        ec1 ec1Var;
        ec1 ec1Var2;
        int i22;
        while (true) {
            ArrayDeque arrayDeque = this.l;
            if (arrayDeque.isEmpty() || ((j01) arrayDeque.peek()).f15889c != j10) {
                break;
            }
            j01 j01Var = (j01) arrayDeque.pop();
            int i23 = j01Var.f22444b;
            ArrayList arrayList3 = j01Var.f15890d;
            SparseArray sparseArray = this.f17283d;
            int i24 = 12;
            int i25 = 8;
            if (i23 == 1836019574) {
                g02 g02VarJ = j(arrayList3);
                j01 j01VarH = j01Var.h(1836475768);
                j01VarH.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList4 = j01VarH.f15890d;
                int size = arrayList4.size();
                int i26 = 0;
                long jP = C.TIME_UNSET;
                while (i26 < size) {
                    w01 w01Var = (w01) arrayList4.get(i26);
                    int i27 = w01Var.f22444b;
                    np0 np0Var = w01Var.f21353c;
                    if (i27 == 1953654136) {
                        np0Var.E(i24);
                        Pair pairCreate = Pair.create(Integer.valueOf(np0Var.b()), new h6(np0Var.b() - 1, np0Var.b(), np0Var.b(), np0Var.b()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (h6) pairCreate.second);
                    } else if (i27 == 1835362404) {
                        np0Var.E(8);
                        jP = g6.a(np0Var.b()) == 0 ? np0Var.P() : np0Var.j();
                    }
                    i26++;
                    i24 = 12;
                }
                int i28 = -1;
                int i29 = 0;
                j01 j01VarH2 = j01Var.h(1835365473);
                s8 s8VarE = j01VarH2 != null ? g6.e(j01VarH2) : null;
                v2 v2Var = new v2();
                w01 w01VarG = j01Var.g(1969517665);
                if (w01VarG != null) {
                    s8 s8VarC = g6.c(w01VarG);
                    v2Var.a(s8VarC);
                    s8Var = s8VarC;
                } else {
                    s8Var = null;
                }
                w01 w01VarG2 = j01Var.g(1836476516);
                w01VarG2.getClass();
                s8 s8Var2 = new s8(g6.d(w01VarG2.f21353c));
                ArrayList arrayListB = g6.b(j01Var, v2Var, jP, g02VarJ, false, false, new i6(i29));
                int size2 = arrayListB.size();
                if (sparseArray.size() == 0) {
                    String strF = dv.f(arrayListB);
                    int i30 = 0;
                    while (i30 < size2) {
                        z6 z6Var = (z6) arrayListB.get(i30);
                        w6 w6Var = z6Var.f22510a;
                        if (w6Var.f21427m) {
                            o2 o2Var = this.G;
                            int i31 = w6Var.f21417b;
                            h3 h3VarE = o2Var.e(i30, i31);
                            int i32 = i30;
                            long j14 = w6Var.f21420e;
                            h3VarE.getClass();
                            i11 = i32;
                            g22 g22Var = w6Var.f21422g;
                            g22Var.getClass();
                            i12 i12Var = new i12(g22Var);
                            i12Var.d(strF);
                            if (i31 == 1) {
                                int i33 = v2Var.f21004a;
                                i10 = size2;
                                int i34 = i28;
                                j11 = j14;
                                if (i33 != i34 && (i12 = v2Var.f21005b) != i34) {
                                    i12Var.J = i33;
                                    i12Var.K = i12;
                                }
                            } else {
                                i10 = size2;
                                j11 = j14;
                            }
                            ps1.r(i31, s8VarE, i12Var, g22Var.l, s8Var, s8Var2);
                            int i35 = w6Var.f21416a;
                            if (sparseArray2.size() == 1) {
                                h6Var = (h6) sparseArray2.valueAt(0);
                            } else {
                                h6Var = (h6) sparseArray2.get(i35);
                                h6Var.getClass();
                            }
                            sparseArray.put(i35, new l6(h3VarE, z6Var, h6Var, new g22(i12Var)));
                            this.f17303y = Math.max(this.f17303y, j11);
                        } else {
                            i10 = size2;
                            i11 = i30;
                        }
                        i30 = i11 + 1;
                        arrayListB = arrayListB;
                        strF = strF;
                        size2 = i10;
                        i28 = -1;
                    }
                    this.G.zzv();
                } else {
                    ArrayList arrayList5 = arrayListB;
                    int i36 = 0;
                    int i37 = 0;
                    while (i36 < size2) {
                        ArrayList arrayList6 = arrayList5;
                        if (((z6) arrayList6.get(i36)).f22510a.f21427m) {
                            i37++;
                        }
                        i36++;
                        arrayList5 = arrayList6;
                    }
                    ArrayList arrayList7 = arrayList5;
                    ps1.c0(sparseArray.size() == i37);
                    for (int i38 = 0; i38 < size2; i38++) {
                        z6 z6Var2 = (z6) arrayList7.get(i38);
                        w6 w6Var2 = z6Var2.f22510a;
                        if (w6Var2.f21427m) {
                            int i39 = w6Var2.f21416a;
                            l6 l6Var = (l6) sparseArray.get(i39);
                            if (sparseArray2.size() == 1) {
                                h6Var2 = (h6) sparseArray2.valueAt(0);
                            } else {
                                h6Var2 = (h6) sparseArray2.get(i39);
                                h6Var2.getClass();
                            }
                            l6Var.f16747d = z6Var2;
                            l6Var.f16748e = h6Var2;
                            l6Var.f16744a.f(l6Var.f16753j);
                            l6Var.a();
                        }
                    }
                }
            } else if (i23 == 1836019558) {
                ArrayList arrayList8 = j01Var.f15891e;
                int size3 = arrayList8.size();
                int i40 = 0;
                while (i40 < size3) {
                    j01 j01Var2 = (j01) arrayList8.get(i40);
                    if (j01Var2.f22444b == 1953653094) {
                        w01 w01VarG3 = j01Var2.g(1952868452);
                        w01VarG3.getClass();
                        np0 np0Var2 = w01VarG3.f21353c;
                        np0Var2.E(i25);
                        int iB5 = np0Var2.b();
                        byte[] bArr2 = g6.f14774a;
                        l6 l6Var2 = (l6) sparseArray.get(np0Var2.b());
                        if (l6Var2 == null) {
                            l6Var2 = null;
                        } else {
                            y6 y6Var = l6Var2.f16745b;
                            if ((iB5 & 1) != 0) {
                                long j15 = np0Var2.j();
                                y6Var.f22160a = j15;
                                y6Var.f22161b = j15;
                            }
                            h6 h6Var3 = l6Var2.f16748e;
                            y6Var.f22173o = new h6((iB5 & 2) != 0 ? np0Var2.b() - 1 : h6Var3.f15179a, (iB5 & 8) != 0 ? np0Var2.b() : h6Var3.f15180b, (iB5 & 16) != 0 ? np0Var2.b() : h6Var3.f15181c, (iB5 & 32) != 0 ? np0Var2.b() : h6Var3.f15182d);
                        }
                        if (l6Var2 == null) {
                            arrayList = arrayList8;
                            i13 = size3;
                            arrayList2 = arrayList3;
                            i14 = i40;
                            i15 = i25;
                        } else {
                            y6 y6Var2 = l6Var2.f16745b;
                            long j16 = y6Var2.f22171m;
                            boolean z12 = y6Var2.f22172n;
                            l6Var2.a();
                            l6Var2.f16755m = true;
                            w01 w01VarG4 = j01Var2.g(1952867444);
                            if (w01VarG4 != null) {
                                np0 np0Var3 = w01VarG4.f21353c;
                                np0Var3.E(i25);
                                y6Var2.f22171m = g6.a(np0Var3.b()) == 1 ? np0Var3.j() : np0Var3.P();
                                y6Var2.f22172n = true;
                            } else {
                                y6Var2.f22171m = j16;
                                y6Var2.f22172n = z12;
                            }
                            ArrayList arrayList9 = j01Var2.f15890d;
                            int size4 = arrayList9.size();
                            int i41 = 0;
                            int i42 = 0;
                            int i43 = 0;
                            while (true) {
                                i16 = 1953658222;
                                if (i41 >= size4) {
                                    break;
                                }
                                w01 w01Var2 = (w01) arrayList9.get(i41);
                                ArrayList arrayList10 = arrayList8;
                                if (w01Var2.f22444b == 1953658222) {
                                    np0 np0Var4 = w01Var2.f21353c;
                                    np0Var4.E(12);
                                    int iH = np0Var4.h();
                                    if (iH > 0) {
                                        i43 += iH;
                                        i42++;
                                    }
                                }
                                i41++;
                                arrayList8 = arrayList10;
                            }
                            arrayList = arrayList8;
                            l6Var2.f16751h = 0;
                            l6Var2.f16750g = 0;
                            l6Var2.f16749f = 0;
                            y6Var2.f22162c = i42;
                            y6Var2.f22163d = i43;
                            if (y6Var2.f22165f.length < i42) {
                                y6Var2.f22164e = new long[i42];
                                y6Var2.f22165f = new int[i42];
                            }
                            if (y6Var2.f22166g.length < i43) {
                                int i44 = (i43 * 125) / 100;
                                y6Var2.f22166g = new int[i44];
                                y6Var2.f22167h = new long[i44];
                                y6Var2.f22168i = new boolean[i44];
                                y6Var2.f22170k = new boolean[i44];
                            }
                            int i45 = 0;
                            int i46 = 0;
                            int i47 = 0;
                            while (true) {
                                long jA = 0;
                                if (i45 >= size4) {
                                    break;
                                }
                                w01 w01Var3 = (w01) arrayList9.get(i45);
                                if (w01Var3.f22444b == i16) {
                                    int i48 = i46 + 1;
                                    np0 np0Var5 = w01Var3.f21353c;
                                    np0Var5.E(8);
                                    int iB6 = np0Var5.b();
                                    w6 w6Var3 = l6Var2.f16747d.f22510a;
                                    h6 h6Var4 = (h6) y6Var2.f22173o;
                                    String str = uu0.f20901a;
                                    y6Var2.f22165f[i46] = np0Var5.h();
                                    long[] jArr2 = y6Var2.f22164e;
                                    long j17 = y6Var2.f22160a;
                                    jArr2[i46] = j17;
                                    if ((iB6 & 1) != 0) {
                                        jArr2[i46] = j17 + ((long) np0Var5.b());
                                    }
                                    boolean z13 = (iB6 & 4) != 0;
                                    int i49 = h6Var4.f15182d;
                                    int iB7 = z13 ? np0Var5.b() : i49;
                                    boolean z14 = z13;
                                    int i50 = iB6 & NotificationCompat.FLAG_LOCAL_ONLY;
                                    int i51 = iB6 & 512;
                                    int i52 = iB6 & 1024;
                                    int i53 = iB6 & com.ironsource.mediationsdk.metadata.a.f29616n;
                                    ec1 ec1Var3 = w6Var3.f21424i;
                                    if (ec1Var3 != null) {
                                        i19 = i49;
                                        i18 = size4;
                                        if (ec1Var3.f13932b == 1 && (ec1Var = w6Var3.f21425j) != null) {
                                            if (ec1Var3.a(0) == 0) {
                                                ec1Var2 = ec1Var;
                                                i22 = 0;
                                                i20 = i46;
                                            } else {
                                                long jA2 = ec1Var3.a(0);
                                                long j18 = w6Var3.f21419d;
                                                RoundingMode roundingMode = RoundingMode.DOWN;
                                                long jV2 = uu0.v(jA2, 1000000L, j18, roundingMode);
                                                i20 = i46;
                                                if (jV2 + uu0.v(ec1Var.a(0), 1000000L, w6Var3.f21418c, roundingMode) >= w6Var3.f21420e) {
                                                    ec1Var2 = ec1Var;
                                                    i22 = 0;
                                                }
                                            }
                                            jA = ec1Var2.a(i22);
                                        }
                                        iArr = y6Var2.f22166g;
                                        jArr = y6Var2.f22167h;
                                        zArr = y6Var2.f22168i;
                                        i21 = y6Var2.f22165f[i20] + i47;
                                        j12 = w6Var3.f21418c;
                                        j13 = y6Var2.f22171m;
                                        while (i47 < i21) {
                                            if (i50 != 0) {
                                                iB = np0Var5.b();
                                            } else {
                                                iB = h6Var4.f15180b;
                                            }
                                            c(iB);
                                            if (i51 != 0) {
                                                iB2 = np0Var5.b();
                                            } else {
                                                iB2 = h6Var4.f15181c;
                                            }
                                            c(iB2);
                                            if (i52 != 0) {
                                                iB3 = np0Var5.b();
                                            } else if (i47 != 0) {
                                                iB3 = i19;
                                            } else if (z14) {
                                                iB3 = iB7;
                                                i47 = 0;
                                            } else {
                                                i47 = 0;
                                                iB3 = i19;
                                            }
                                            if (i53 != 0) {
                                                iB4 = np0Var5.b();
                                            } else {
                                                iB4 = 0;
                                            }
                                            int i54 = iB2;
                                            int i55 = i21;
                                            jV = uu0.v((((long) iB4) + j13) - jA, 1000000L, j12, RoundingMode.DOWN);
                                            jArr[i47] = jV;
                                            if (!y6Var2.f22172n) {
                                                jArr[i47] = jV + l6Var2.f16747d.f22518i;
                                            }
                                            iArr[i47] = i54;
                                            if (((iB3 >> 16) & 1) == 0) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            zArr[i47] = z11;
                                            j13 += (long) iB;
                                            i47++;
                                            zArr = zArr;
                                            h6Var4 = h6Var4;
                                            i21 = i55;
                                        }
                                        int i56 = i21;
                                        y6Var2.f22171m = j13;
                                        i46 = i48;
                                        i47 = i56;
                                    } else {
                                        i19 = i49;
                                        i18 = size4;
                                    }
                                    i20 = i46;
                                    iArr = y6Var2.f22166g;
                                    jArr = y6Var2.f22167h;
                                    zArr = y6Var2.f22168i;
                                    i21 = y6Var2.f22165f[i20] + i47;
                                    j12 = w6Var3.f21418c;
                                    j13 = y6Var2.f22171m;
                                    while (i47 < i21) {
                                        if (i50 != 0) {
                                            iB = np0Var5.b();
                                        } else {
                                            iB = h6Var4.f15180b;
                                        }
                                        c(iB);
                                        if (i51 != 0) {
                                            iB2 = np0Var5.b();
                                        } else {
                                            iB2 = h6Var4.f15181c;
                                        }
                                        c(iB2);
                                        if (i52 != 0) {
                                            iB3 = np0Var5.b();
                                        } else if (i47 != 0) {
                                            iB3 = i19;
                                        } else if (z14) {
                                            iB3 = iB7;
                                            i47 = 0;
                                        } else {
                                            i47 = 0;
                                            iB3 = i19;
                                        }
                                        if (i53 != 0) {
                                            iB4 = np0Var5.b();
                                        } else {
                                            iB4 = 0;
                                        }
                                        int i57 = iB2;
                                        int i58 = i21;
                                        jV = uu0.v((((long) iB4) + j13) - jA, 1000000L, j12, RoundingMode.DOWN);
                                        jArr[i47] = jV;
                                        if (!y6Var2.f22172n) {
                                            jArr[i47] = jV + l6Var2.f16747d.f22518i;
                                        }
                                        iArr[i47] = i57;
                                        if (((iB3 >> 16) & 1) == 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        zArr[i47] = z11;
                                        j13 += (long) iB;
                                        i47++;
                                        zArr = zArr;
                                        h6Var4 = h6Var4;
                                        i21 = i58;
                                    }
                                    int i59 = i21;
                                    y6Var2.f22171m = j13;
                                    i46 = i48;
                                    i47 = i59;
                                } else {
                                    i18 = size4;
                                }
                                i45++;
                                size3 = size3;
                                arrayList3 = arrayList3;
                                i40 = i40;
                                size4 = i18;
                                i16 = 1953658222;
                            }
                            i13 = size3;
                            arrayList2 = arrayList3;
                            i14 = i40;
                            w6 w6Var4 = l6Var2.f16747d.f22510a;
                            h6 h6Var5 = (h6) y6Var2.f22173o;
                            h6Var5.getClass();
                            int i60 = h6Var5.f15179a;
                            x6[] x6VarArr = w6Var4.f21428n;
                            x6 x6Var = x6VarArr == null ? null : x6VarArr[i60];
                            w01 w01VarG5 = j01Var2.g(1935763834);
                            if (w01VarG5 != null) {
                                x6Var.getClass();
                                int i61 = x6Var.f21752d;
                                np0 np0Var6 = w01VarG5.f21353c;
                                np0Var6.E(8);
                                if ((np0Var6.b() & 1) == 1) {
                                    np0Var6.G(8);
                                }
                                int iK = np0Var6.K();
                                int iH2 = np0Var6.h();
                                int i62 = y6Var2.f22163d;
                                if (iH2 > i62) {
                                    throw ab.a(null, l1.d.j(new StringBuilder(String.valueOf(iH2).length() + 56 + String.valueOf(i62).length()), iH2, "Saiz sample count ", i62, " is greater than fragment sample count"));
                                }
                                if (iK == 0) {
                                    boolean[] zArr2 = y6Var2.f22170k;
                                    i17 = 0;
                                    for (int i63 = 0; i63 < iH2; i63++) {
                                        int iK2 = np0Var6.K();
                                        i17 += iK2;
                                        zArr2[i63] = iK2 > i61;
                                    }
                                    z10 = false;
                                } else {
                                    boolean z15 = iK > i61;
                                    i17 = iK * iH2;
                                    z10 = false;
                                    Arrays.fill(y6Var2.f22170k, 0, iH2, z15);
                                }
                                Arrays.fill(y6Var2.f22170k, iH2, y6Var2.f22163d, z10);
                                if (i17 > 0) {
                                    ((np0) y6Var2.f22175q).y(i17);
                                    y6Var2.f22169j = true;
                                    y6Var2.l = true;
                                }
                            }
                            w01 w01VarG6 = j01Var2.g(1935763823);
                            if (w01VarG6 != null) {
                                np0 np0Var7 = w01VarG6.f21353c;
                                np0Var7.E(8);
                                int iB8 = np0Var7.b();
                                if ((iB8 & 1) == 1) {
                                    np0Var7.G(8);
                                }
                                int iH3 = np0Var7.h();
                                if (iH3 != 1) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(iH3).length() + 29);
                                    sb2.append("Unexpected saio entry count: ");
                                    sb2.append(iH3);
                                    throw ab.a(null, sb2.toString());
                                }
                                y6Var2.f22161b += g6.a(iB8) == 0 ? np0Var7.P() : np0Var7.j();
                            }
                            w01 w01VarG7 = j01Var2.g(1936027235);
                            if (w01VarG7 != null) {
                                h(w01VarG7.f21353c, 0, y6Var2);
                            }
                            String str2 = x6Var != null ? x6Var.f21750b : null;
                            np0 np0Var8 = null;
                            np0 np0Var9 = null;
                            for (int i64 = 0; i64 < arrayList9.size(); i64++) {
                                w01 w01Var4 = (w01) arrayList9.get(i64);
                                np0 np0Var10 = w01Var4.f21353c;
                                int i65 = w01Var4.f22444b;
                                if (i65 == 1935828848) {
                                    np0Var10.E(12);
                                    if (np0Var10.b() == 1936025959) {
                                        np0Var8 = np0Var10;
                                    }
                                } else if (i65 == 1936158820) {
                                    np0Var10.E(12);
                                    if (np0Var10.b() == 1936025959) {
                                        np0Var9 = np0Var10;
                                    }
                                }
                            }
                            if (np0Var8 != null && np0Var9 != null) {
                                np0Var8.E(8);
                                int iA = g6.a(np0Var8.b());
                                np0Var8.G(4);
                                if (iA == 1) {
                                    np0Var8.G(4);
                                }
                                if (np0Var8.b() != 1) {
                                    throw ab.b("Entry count in sbgp != 1 (unsupported).");
                                }
                                np0Var9.E(8);
                                int iA2 = g6.a(np0Var9.b());
                                np0Var9.G(4);
                                if (iA2 == 1) {
                                    if (np0Var9.P() == 0) {
                                        throw ab.b("Variable length description in sgpd found (unsupported)");
                                    }
                                } else if (iA2 >= 2) {
                                    np0Var9.G(4);
                                }
                                if (np0Var9.P() != 1) {
                                    throw ab.b("Entry count in sgpd != 1 (unsupported).");
                                }
                                np0Var9.G(1);
                                int iK3 = np0Var9.K();
                                int i66 = (iK3 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                                int i67 = iK3 & 15;
                                if (np0Var9.K() == 1) {
                                    int iK4 = np0Var9.K();
                                    byte[] bArr3 = new byte[16];
                                    np0Var9.H(bArr3, 0, 16);
                                    if (iK4 == 0) {
                                        int iK5 = np0Var9.K();
                                        byte[] bArr4 = new byte[iK5];
                                        np0Var9.H(bArr4, 0, iK5);
                                        bArr = bArr4;
                                    } else {
                                        bArr = null;
                                    }
                                    y6Var2.f22169j = true;
                                    y6Var2.f22174p = new x6(true, str2, iK4, bArr3, i66, i67, bArr);
                                }
                            }
                            int size5 = arrayList9.size();
                            for (int i68 = 0; i68 < size5; i68++) {
                                w01 w01Var5 = (w01) arrayList9.get(i68);
                                if (w01Var5.f22444b == 1970628964) {
                                    np0 np0Var11 = w01Var5.f21353c;
                                    np0Var11.E(8);
                                    byte[] bArr5 = this.f17287h;
                                    np0Var11.H(bArr5, 0, 16);
                                    if (Arrays.equals(bArr5, N)) {
                                        h(np0Var11, 16, y6Var2);
                                    }
                                }
                            }
                            i15 = 8;
                        }
                    } else {
                        arrayList = arrayList8;
                        i13 = size3;
                        arrayList2 = arrayList3;
                        i14 = i40;
                        i15 = i25;
                    }
                    i40 = i14 + 1;
                    i25 = i15;
                    arrayList8 = arrayList;
                    size3 = i13;
                    arrayList3 = arrayList2;
                }
                g02 g02VarJ2 = j(arrayList3);
                if (g02VarJ2 != null) {
                    int size6 = sparseArray.size();
                    for (int i69 = 0; i69 < size6; i69++) {
                        l6 l6Var3 = (l6) sparseArray.valueAt(i69);
                        w6 w6Var5 = l6Var3.f16747d.f22510a;
                        h6 h6Var6 = (h6) l6Var3.f16745b.f22173o;
                        String str3 = uu0.f20901a;
                        int i70 = h6Var6.f15179a;
                        x6[] x6VarArr2 = w6Var5.f21428n;
                        x6 x6Var2 = x6VarArr2 == null ? null : x6VarArr2[i70];
                        g02 g02VarA = g02VarJ2.a(x6Var2 != null ? x6Var2.f21750b : null);
                        i12 i12Var2 = new i12(l6Var3.f16753j);
                        i12Var2.f15515r = g02VarA;
                        l6Var3.f16744a.f(new g22(i12Var2));
                    }
                }
                if (this.f17302x != C.TIME_UNSET) {
                    int size7 = sparseArray.size();
                    for (int i71 = 0; i71 < size7; i71++) {
                        l6 l6Var4 = (l6) sparseArray.valueAt(i71);
                        long j19 = this.f17302x;
                        int i72 = l6Var4.f16749f;
                        while (true) {
                            y6 y6Var3 = l6Var4.f16745b;
                            if (i72 >= y6Var3.f22163d || y6Var3.f22167h[i72] > j19) {
                                break;
                            }
                            if (y6Var3.f22168i[i72]) {
                                l6Var4.f16752i = i72;
                            }
                            i72++;
                        }
                    }
                    this.f17302x = C.TIME_UNSET;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((j01) arrayDeque.peek()).f15891e.add(j01Var);
            }
        }
        a();
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean d(n2 n2Var) {
        ya1 ya1VarU;
        e3 e3VarW = dv.w(n2Var, true);
        if (e3VarW != null) {
            ya1VarU = ca1.u(e3VarW);
        } else {
            aa1 aa1Var = ca1.f13122b;
            ya1VarU = ya1.f22208e;
        }
        this.f17294p = ya1VarU;
        return e3VarW == null;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void e(long j10, long j11) {
        SparseArray sparseArray = this.f17283d;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((l6) sparseArray.valueAt(i10)).a();
        }
        this.f17291m.clear();
        this.f17301w = 0;
        ((PriorityQueue) this.f17292n.f16466e).clear();
        this.f17302x = j11;
        this.l.clear();
        this.M = -1L;
        a();
    }

    /* JADX WARN: Code duplicated, block: B:113:0x020b  */
    /* JADX WARN: Code duplicated, block: B:405:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:412:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:415:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:417:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:418:0x0903  */
    /* JADX WARN: Code duplicated, block: B:420:0x090f  */
    /* JADX WARN: Code duplicated, block: B:427:0x092d  */
    /* JADX WARN: Code duplicated, block: B:435:0x095b  */
    /* JADX WARN: Code duplicated, block: B:437:0x0962 A[LOOP:2: B:436:0x0960->B:437:0x0962, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:440:0x0975  */
    /* JADX WARN: Code duplicated, block: B:441:0x0982  */
    /* JADX WARN: Code duplicated, block: B:443:0x098a  */
    /* JADX WARN: Code duplicated, block: B:537:0x0a94  */
    /* JADX WARN: Code duplicated, block: B:539:0x0aa2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:543:0x0ad0  */
    /* JADX WARN: Code duplicated, block: B:544:0x0ad4  */
    /* JADX WARN: Code duplicated, block: B:549:0x0adf  */
    /* JADX WARN: Code duplicated, block: B:556:0x0584 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.m2
    public final int f(n2 n2Var, q2 q2Var) throws ab {
        so0 so0Var;
        int i10;
        ArrayDeque arrayDeque;
        kj1 kj1Var;
        np0 np0Var;
        ArrayDeque arrayDeque2;
        String strM;
        long j10;
        long jP;
        String str;
        long j11;
        long j12;
        long j13;
        char c4;
        l6 l6Var;
        boolean z10;
        l6 l6Var2;
        int i11;
        int iE;
        int i12;
        boolean z11;
        String strQ;
        int i13;
        int iD;
        int i14;
        int i15;
        int i16;
        long j14;
        long j15;
        long jP2;
        long j16;
        long j17;
        long j18;
        long jZzn;
        int i17;
        int i18;
        long j19;
        long j20;
        int size;
        int i19;
        n2 n2Var2 = n2Var;
        loop0: while (true) {
            q2 q2Var2 = q2Var;
            while (true) {
                int i20 = this.f17295q;
                so0Var = this.f17293o;
                i10 = this.f17281b;
                arrayDeque = this.l;
                kj1Var = this.f17292n;
                np0Var = this.f17288i;
                SparseArray sparseArray = this.f17283d;
                boolean z12 = true;
                if (i20 != 0) {
                    arrayDeque2 = this.f17291m;
                    if (i20 != 1) {
                        long j21 = Long.MAX_VALUE;
                        if (i20 != 2) {
                            c4 = 6;
                            int i21 = 2;
                            if (i20 == 5) {
                                np0Var.y(16);
                                if (n2Var2.x(np0Var.f17880a, 0, 16, true)) {
                                    np0Var.E(0);
                                    int iB = np0Var.b();
                                    int iB2 = np0Var.b();
                                    if (iB == 16 && iB2 == 1835430511) {
                                        np0Var.G(4);
                                        long jP3 = np0Var.P();
                                        long jZzo = n2Var2.zzo() - jP3;
                                        if (jP3 <= 0 || jP3 > 2147483647L || jZzo < 0 || jZzo < this.M) {
                                            k(new r2(this.f17303y, this.M), q2Var2);
                                        } else {
                                            q2Var2.f18888a = jZzo;
                                            this.f17295q = 6;
                                        }
                                    } else {
                                        k(new r2(this.f17303y, this.M), q2Var2);
                                    }
                                } else {
                                    k(new r2(this.f17303y, this.M), q2Var2);
                                }
                                int i22 = this.f17295q;
                                if (i22 == 6 || i22 == 0) {
                                    return 1;
                                }
                            } else if (i20 != 6) {
                                l6Var = this.A;
                                if (l6Var != null) {
                                    z10 = true;
                                    break loop0;
                                }
                                int size2 = sparseArray.size();
                                int i23 = 0;
                                l6 l6Var3 = null;
                                while (i23 < size2) {
                                    l6 l6Var4 = (l6) sparseArray.valueAt(i23);
                                    boolean z13 = z12;
                                    boolean z14 = l6Var4.f16755m;
                                    y6 y6Var = l6Var4.f16745b;
                                    if (z14) {
                                        i14 = size2;
                                    } else {
                                        i14 = size2;
                                        if (l6Var4.f16749f != l6Var4.f16747d.f22511b) {
                                        }
                                        i23++;
                                        size2 = i14;
                                        z12 = z13;
                                    }
                                    if (!z14 || l6Var4.f16751h != y6Var.f22162c) {
                                        long j22 = !z14 ? l6Var4.f16747d.f22512c[l6Var4.f16749f] : y6Var.f22164e[l6Var4.f16751h];
                                        if (j22 < j21) {
                                            l6Var3 = l6Var4;
                                            j21 = j22;
                                        }
                                    }
                                    i23++;
                                    size2 = i14;
                                    z12 = z13;
                                }
                                z10 = z12;
                                if (l6Var3 != null) {
                                    int iZzn = (int) ((!l6Var3.f16755m ? l6Var3.f16747d.f22512c[l6Var3.f16749f] : l6Var3.f16745b.f22164e[l6Var3.f16751h]) - n2Var2.zzn());
                                    if (iZzn < 0) {
                                        v71.y("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                        iZzn = 0;
                                    }
                                    n2Var2.zzf(iZzn);
                                    this.A = l6Var3;
                                    l6Var = l6Var3;
                                    break loop0;
                                }
                                int iZzn2 = (int) (this.f17300v - n2Var2.zzn());
                                if (iZzn2 < 0) {
                                    throw ab.a(null, "Offset to end of mdat was negative.");
                                }
                                n2Var2.zzf(iZzn2);
                                a();
                            } else {
                                long jZzo2 = n2Var2.zzo() - n2Var2.zzn();
                                np0Var.y(8);
                                if (n2Var2.m(np0Var.f17880a, 0, 8, true)) {
                                    np0Var.E(0);
                                    int iB3 = np0Var.b();
                                    if (np0Var.b() != 1835430497) {
                                        k(new r2(this.f17303y, this.M), q2Var2);
                                    } else {
                                        int i24 = (int) jZzo2;
                                        np0 np0Var2 = new np0(i24);
                                        n2Var2.p(np0Var2.f17880a, 0, i24);
                                        np0Var2.E(iB3 == 1 ? 16 : 8);
                                        SparseArray sparseArray2 = new SparseArray();
                                        SparseArray sparseArray3 = new SparseArray();
                                        while (np0Var2.B() >= 8) {
                                            int i25 = np0Var2.f17881b;
                                            long jP4 = np0Var2.P();
                                            int iB4 = np0Var2.b();
                                            if (jP4 == 1) {
                                                if (np0Var2.B() < 8) {
                                                    break;
                                                }
                                                jP4 = np0Var2.d();
                                            } else if (jP4 == 0) {
                                                jP4 = ((long) np0Var2.f17882c) - ((long) i25);
                                            }
                                            int i26 = jP4 == 1 ? 16 : 8;
                                            if (jP4 < i26) {
                                                break;
                                            }
                                            long j23 = i25;
                                            if (jP4 > ((long) np0Var2.f17882c) - j23) {
                                                break;
                                            }
                                            if (iB4 != 1952871009) {
                                                j14 = jP4;
                                                j15 = j23;
                                            } else if (jP4 < i26 + 16) {
                                                np0Var2.E((int) (j23 + jP4));
                                            } else {
                                                int iA = g6.a(np0Var2.b());
                                                int iB5 = np0Var2.b();
                                                l6 l6Var5 = (l6) sparseArray.get(iB5);
                                                if (l6Var5 == null) {
                                                    np0Var2.E((int) (j23 + jP4));
                                                } else {
                                                    long j24 = l6Var5.f16747d.f22510a.f21418c;
                                                    int iB6 = np0Var2.b();
                                                    int i27 = iB6 >> 4;
                                                    int i28 = iB6 >> 2;
                                                    int i29 = iB6 & 3;
                                                    j14 = jP4;
                                                    long jP5 = np0Var2.P();
                                                    int i30 = (i27 & 3) + 1;
                                                    j15 = j23;
                                                    int i31 = (i28 & 3) + 1;
                                                    int i32 = i29 + 1;
                                                    if (((iA == 1 ? 16L : 8L) + ((long) i30) + ((long) i31) + ((long) i32)) * jP5 > np0Var2.B()) {
                                                        np0Var2.E((int) (j15 + j14));
                                                    } else {
                                                        int i33 = (int) jP5;
                                                        long[] jArr = new long[i33];
                                                        long[] jArr2 = new long[i33];
                                                        int i34 = 0;
                                                        while (i34 < i33) {
                                                            int i35 = i30;
                                                            if (iA == 1) {
                                                                jP2 = np0Var2.j();
                                                                iA = 1;
                                                            } else {
                                                                jP2 = np0Var2.P();
                                                            }
                                                            long j25 = jP2;
                                                            long j26 = iA == 1 ? np0Var2.j() : np0Var2.P();
                                                            np0Var2.G(i35 + i31 + i32);
                                                            jArr[i34] = uu0.v(j25, 1000000L, j24, RoundingMode.DOWN);
                                                            jArr2[i34] = j26;
                                                            i34++;
                                                            i30 = i35;
                                                            iA = iA;
                                                        }
                                                        sparseArray2.put(iB5, jArr);
                                                        sparseArray3.put(iB5, jArr2);
                                                    }
                                                }
                                            }
                                            np0Var2.E((int) (j15 + j14));
                                        }
                                        if (sparseArray2.size() == 0) {
                                            k(new r2(this.f17303y, this.M), q2Var2);
                                        } else {
                                            int iKeyAt = -1;
                                            int i36 = -1;
                                            int i37 = 0;
                                            while (i37 < sparseArray2.size()) {
                                                int iKeyAt2 = sparseArray2.keyAt(i37);
                                                l6 l6Var6 = (l6) sparseArray.get(iKeyAt2);
                                                if (l6Var6 != null) {
                                                    int i38 = l6Var6.f16747d.f22510a.f21417b;
                                                    if (iKeyAt != -1) {
                                                        i16 = iKeyAt;
                                                    } else if (i38 == i21) {
                                                        iKeyAt = iKeyAt2;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    if (i36 == -1) {
                                                        i36 = i38 == 1 ? iKeyAt2 : -1;
                                                    }
                                                    iKeyAt = i16;
                                                }
                                                i37++;
                                                i21 = 2;
                                            }
                                            if (iKeyAt != -1) {
                                                i15 = iKeyAt;
                                            } else if (i36 != -1) {
                                                i15 = i36;
                                            } else {
                                                iKeyAt = sparseArray2.keyAt(0);
                                                i15 = iKeyAt;
                                            }
                                            k(new k6(sparseArray2, sparseArray3, this.f17303y, this.M, i15), q2Var2);
                                        }
                                    }
                                } else {
                                    k(new r2(this.f17303y, this.M), q2Var2);
                                }
                                if (this.f17295q == 0) {
                                    return 1;
                                }
                            }
                        } else {
                            int size3 = sparseArray.size();
                            l6 l6Var7 = null;
                            for (int i39 = 0; i39 < size3; i39++) {
                                y6 y6Var2 = ((l6) sparseArray.valueAt(i39)).f16745b;
                                if (y6Var2.l) {
                                    long j27 = y6Var2.f22161b;
                                    if (j27 < j21) {
                                        l6Var7 = (l6) sparseArray.valueAt(i39);
                                        j21 = j27;
                                    }
                                }
                            }
                            if (l6Var7 == null) {
                                this.f17295q = 3;
                            } else {
                                int iZzn3 = (int) (j21 - n2Var2.zzn());
                                if (iZzn3 < 0) {
                                    throw ab.a(null, "Offset to encryption data was negative.");
                                }
                                n2Var2.zzf(iZzn3);
                                y6 y6Var3 = l6Var7.f16745b;
                                np0 np0Var3 = (np0) y6Var3.f22175q;
                                n2Var2.p(np0Var3.f17880a, 0, np0Var3.f17882c);
                                np0Var3.E(0);
                                y6Var3.l = false;
                            }
                        }
                    }
                } else {
                    int i40 = this.f17298t;
                    np0 np0Var4 = this.f17290k;
                    if (i40 == 0) {
                        if (!n2Var2.x(np0Var4.f17880a, 0, 8, true)) {
                            long j28 = this.L;
                            if (j28 == -1) {
                                kj1Var.w(0);
                                return -1;
                            }
                            q2Var.f18888a = j28;
                            this.L = -1L;
                            this.G.o(so0Var.h());
                            this.K = true;
                            return 1;
                        }
                        this.f17298t = 8;
                        np0Var4.E(0);
                        this.f17297s = np0Var4.P();
                        this.f17296r = np0Var4.b();
                    }
                    long j29 = this.f17297s;
                    if (j29 == 1) {
                        n2Var2.p(np0Var4.f17880a, 8, 8);
                        this.f17298t += 8;
                        this.f17297s = np0Var4.j();
                    } else {
                        if (j29 == 0) {
                            long jZzo3 = n2Var2.zzo();
                            if (jZzo3 == -1) {
                                jZzo3 = !arrayDeque.isEmpty() ? ((j01) arrayDeque.peek()).f15889c : -1L;
                            }
                            if (jZzo3 != -1) {
                                this.f17297s = (jZzo3 - n2Var2.zzn()) + ((long) this.f17298t);
                            }
                        }
                        j16 = this.f17297s;
                        int i41 = this.f17298t;
                        j17 = i41;
                        if (j16 >= j17) {
                            j18 = j17;
                        } else {
                            if (this.f17296r == 1718773093 || i41 != 8) {
                                throw ab.b("Atom size less than header length (unsupported).");
                            }
                            this.f17297s = j17;
                            j16 = j17;
                            j18 = j16;
                        }
                        if (this.L != r11) {
                            if (this.f17296r == 1936286840) {
                                np0Var.y((int) j16);
                                System.arraycopy(np0Var4.f17880a, 0, np0Var.f17880a, 0, 8);
                                n2Var2.p(np0Var.f17880a, 8, (int) (this.f17297s - ((long) this.f17298t)));
                                so0Var.e((g2) i(n2Var2.zzm(), np0Var).second);
                            } else {
                                n2Var2.j((int) (j16 - j18), true);
                            }
                            a();
                        } else {
                            jZzn = n2Var2.zzn() - j18;
                            i17 = this.f17296r;
                            if ((i17 == 1836019558 && i17 != 1835295092) || this.J) {
                                if (this.f17296r == 1836019558) {
                                    size = sparseArray.size();
                                    for (i19 = 0; i19 < size; i19++) {
                                        y6 y6Var4 = ((l6) sparseArray.valueAt(i19)).f16745b;
                                        y6Var4.f22161b = jZzn;
                                        y6Var4.f22160a = jZzn;
                                    }
                                }
                                i18 = this.f17296r;
                                if (i18 == 1835295092) {
                                    this.A = null;
                                    this.f17300v = jZzn + this.f17297s;
                                    this.f17295q = 2;
                                } else if (i18 != 1836019574) {
                                    long jZzn2 = n2Var2.zzn();
                                    j19 = this.f17297s;
                                    long j30 = jZzn2 + j19;
                                    if (j19 != this.f17298t) {
                                        np0Var.y(8);
                                        n2Var2.v(np0Var.f17880a, 0, 8);
                                        g6.f(np0Var);
                                        n2Var2.zzf(np0Var.f17881b);
                                        n2Var2.zzl();
                                    }
                                    j20 = j30 - 8;
                                    arrayDeque.push(new j01(this.f17296r, j20));
                                    if (this.f17297s == this.f17298t) {
                                        b(j20);
                                    } else {
                                        a();
                                    }
                                } else {
                                    long jZzn3 = n2Var2.zzn();
                                    j19 = this.f17297s;
                                    long j31 = jZzn3 + j19;
                                    if (j19 != this.f17298t) {
                                        np0Var.y(8);
                                        n2Var2.v(np0Var.f17880a, 0, 8);
                                        g6.f(np0Var);
                                        n2Var2.zzf(np0Var.f17881b);
                                        n2Var2.zzl();
                                    }
                                    j20 = j31 - 8;
                                    arrayDeque.push(new j01(this.f17296r, j20));
                                    if (this.f17297s == this.f17298t) {
                                        b(j20);
                                    } else {
                                        a();
                                    }
                                }
                            } else if (n2Var2.zzo() == r11 && this.M == -1 && (i10 & 512) != 0) {
                                this.M = jZzn;
                                q2Var.f18888a = n2Var2.zzo() - 16;
                                this.f17295q = 5;
                            } else {
                                this.G.o(new r2(this.f17303y, jZzn));
                                this.J = true;
                                if (this.f17296r == 1836019558) {
                                    size = sparseArray.size();
                                    while (i19 < size) {
                                        y6 y6Var5 = ((l6) sparseArray.valueAt(i19)).f16745b;
                                        y6Var5.f22161b = jZzn;
                                        y6Var5.f22160a = jZzn;
                                    }
                                }
                                i18 = this.f17296r;
                                if (i18 == 1835295092) {
                                    this.A = null;
                                    this.f17300v = jZzn + this.f17297s;
                                    this.f17295q = 2;
                                } else if (i18 != 1836019574 || i18 == 1953653099 || i18 == 1835297121 || i18 == 1835626086 || i18 == 1937007212 || i18 == 1836019558 || i18 == 1953653094 || i18 == 1836475768 || i18 == 1701082227 || i18 == 1835365473) {
                                    long jZzn4 = n2Var2.zzn();
                                    j19 = this.f17297s;
                                    long j32 = jZzn4 + j19;
                                    if (j19 != this.f17298t && i18 == 1835365473) {
                                        np0Var.y(8);
                                        n2Var2.v(np0Var.f17880a, 0, 8);
                                        g6.f(np0Var);
                                        n2Var2.zzf(np0Var.f17881b);
                                        n2Var2.zzl();
                                    }
                                    j20 = j32 - 8;
                                    arrayDeque.push(new j01(this.f17296r, j20));
                                    if (this.f17297s == this.f17298t) {
                                        b(j20);
                                    } else {
                                        a();
                                    }
                                } else if (i18 == 1751411826 || i18 == 1835296868 || i18 == 1836476516 || i18 == 1936286840 || i18 == 1937011556 || i18 == 1937011827 || i18 == 1668576371 || i18 == 1937011555 || i18 == 1937011578 || i18 == 1937013298 || i18 == 1937007471 || i18 == 1668232756 || i18 == 1937011571 || i18 == 1952867444 || i18 == 1952868452 || i18 == 1953196132 || i18 == 1953654136 || i18 == 1953658222 || i18 == 1886614376 || i18 == 1935763834 || i18 == 1935763823 || i18 == 1936027235 || i18 == 1970628964 || i18 == 1935828848 || i18 == 1936158820 || i18 == 1701606260 || i18 == 1835362404 || i18 == 1701671783 || i18 == 1969517665 || i18 == 1801812339 || i18 == 1768715124) {
                                    if (this.f17298t != 8) {
                                        throw ab.b("Leaf atom defines extended atom size (unsupported).");
                                    }
                                    if (this.f17297s > 2147483647L) {
                                        throw ab.b("Leaf atom with length > 2147483647 (unsupported).");
                                    }
                                    np0 np0Var5 = new np0((int) this.f17297s);
                                    System.arraycopy(np0Var4.f17880a, 0, np0Var5.f17880a, 0, 8);
                                    this.f17299u = np0Var5;
                                    this.f17295q = 1;
                                } else {
                                    if (this.f17297s > 2147483647L) {
                                        throw ab.b("Skipping atom with length > 2147483647 (unsupported).");
                                    }
                                    this.f17299u = null;
                                    this.f17295q = 1;
                                }
                            }
                        }
                        if (this.f17295q == 5) {
                            return 1;
                        }
                        q2Var2 = q2Var;
                    }
                    j16 = this.f17297s;
                    int i42 = this.f17298t;
                    j17 = i42;
                    if (j16 >= j17) {
                        if (this.f17296r == 1718773093) {
                        }
                        throw ab.b("Atom size less than header length (unsupported).");
                    }
                    j18 = j17;
                    if (this.L != r11) {
                        if (this.f17296r == 1936286840) {
                            np0Var.y((int) j16);
                            System.arraycopy(np0Var4.f17880a, 0, np0Var.f17880a, 0, 8);
                            n2Var2.p(np0Var.f17880a, 8, (int) (this.f17297s - ((long) this.f17298t)));
                            so0Var.e((g2) i(n2Var2.zzm(), np0Var).second);
                        } else {
                            n2Var2.j((int) (j16 - j18), true);
                        }
                        a();
                    } else {
                        jZzn = n2Var2.zzn() - j18;
                        i17 = this.f17296r;
                        if (i17 == 1836019558) {
                            if (n2Var2.zzo() == r11) {
                            }
                            this.G.o(new r2(this.f17303y, jZzn));
                            this.J = true;
                            if (this.f17296r == 1836019558) {
                                size = sparseArray.size();
                                while (i19 < size) {
                                    y6 y6Var6 = ((l6) sparseArray.valueAt(i19)).f16745b;
                                    y6Var6.f22161b = jZzn;
                                    y6Var6.f22160a = jZzn;
                                }
                            }
                            i18 = this.f17296r;
                            if (i18 == 1835295092) {
                                this.A = null;
                                this.f17300v = jZzn + this.f17297s;
                                this.f17295q = 2;
                            } else if (i18 != 1836019574) {
                                long jZzn5 = n2Var2.zzn();
                                j19 = this.f17297s;
                                long j33 = jZzn5 + j19;
                                if (j19 != this.f17298t) {
                                    np0Var.y(8);
                                    n2Var2.v(np0Var.f17880a, 0, 8);
                                    g6.f(np0Var);
                                    n2Var2.zzf(np0Var.f17881b);
                                    n2Var2.zzl();
                                }
                                j20 = j33 - 8;
                                arrayDeque.push(new j01(this.f17296r, j20));
                                if (this.f17297s == this.f17298t) {
                                    b(j20);
                                } else {
                                    a();
                                }
                            } else {
                                long jZzn6 = n2Var2.zzn();
                                j19 = this.f17297s;
                                long j34 = jZzn6 + j19;
                                if (j19 != this.f17298t) {
                                    np0Var.y(8);
                                    n2Var2.v(np0Var.f17880a, 0, 8);
                                    g6.f(np0Var);
                                    n2Var2.zzf(np0Var.f17881b);
                                    n2Var2.zzl();
                                }
                                j20 = j34 - 8;
                                arrayDeque.push(new j01(this.f17296r, j20));
                                if (this.f17297s == this.f17298t) {
                                    b(j20);
                                } else {
                                    a();
                                }
                            }
                        } else {
                            if (n2Var2.zzo() == r11) {
                            }
                            this.G.o(new r2(this.f17303y, jZzn));
                            this.J = true;
                            if (this.f17296r == 1836019558) {
                                size = sparseArray.size();
                                while (i19 < size) {
                                    y6 y6Var7 = ((l6) sparseArray.valueAt(i19)).f16745b;
                                    y6Var7.f22161b = jZzn;
                                    y6Var7.f22160a = jZzn;
                                }
                            }
                            i18 = this.f17296r;
                            if (i18 == 1835295092) {
                                this.A = null;
                                this.f17300v = jZzn + this.f17297s;
                                this.f17295q = 2;
                            } else if (i18 != 1836019574) {
                                long jZzn7 = n2Var2.zzn();
                                j19 = this.f17297s;
                                long j35 = jZzn7 + j19;
                                if (j19 != this.f17298t) {
                                    np0Var.y(8);
                                    n2Var2.v(np0Var.f17880a, 0, 8);
                                    g6.f(np0Var);
                                    n2Var2.zzf(np0Var.f17881b);
                                    n2Var2.zzl();
                                }
                                j20 = j35 - 8;
                                arrayDeque.push(new j01(this.f17296r, j20));
                                if (this.f17297s == this.f17298t) {
                                    b(j20);
                                } else {
                                    a();
                                }
                            } else {
                                long jZzn8 = n2Var2.zzn();
                                j19 = this.f17297s;
                                long j36 = jZzn8 + j19;
                                if (j19 != this.f17298t) {
                                    np0Var.y(8);
                                    n2Var2.v(np0Var.f17880a, 0, 8);
                                    g6.f(np0Var);
                                    n2Var2.zzf(np0Var.f17881b);
                                    n2Var2.zzl();
                                }
                                j20 = j36 - 8;
                                arrayDeque.push(new j01(this.f17296r, j20));
                                if (this.f17297s == this.f17298t) {
                                    b(j20);
                                } else {
                                    a();
                                }
                            }
                        }
                    }
                    if (this.f17295q == 5) {
                        return 1;
                    }
                    q2Var2 = q2Var;
                }
            }
            long j37 = this.f17297s - ((long) this.f17298t);
            np0 np0Var6 = this.f17299u;
            int i43 = (int) j37;
            if (np0Var6 != null) {
                n2Var2.p(np0Var6.f17880a, 8, i43);
                int i44 = this.f17296r;
                w01 w01Var = new w01(i44, np0Var6);
                if (!arrayDeque.isEmpty()) {
                    ((j01) arrayDeque.peek()).f15890d.add(w01Var);
                } else if (i44 == 1936286840) {
                    Pair pairI = i(n2Var2.zzn(), np0Var6);
                    so0Var.e((g2) pairI.second);
                    this.f17304z = ((Long) pairI.first).longValue();
                    if (!this.K) {
                        this.G.o(((LinkedHashMap) so0Var.f20013b).size() == 1 ? (a3) pairI.second : so0Var.h());
                        this.J = true;
                    }
                } else if (i44 != 1701671783 || this.H.length == 0) {
                    n2Var2 = n2Var;
                } else {
                    np0Var6.E(8);
                    int iA2 = g6.a(np0Var6.b());
                    if (iA2 == 0) {
                        strM = np0Var6.m();
                        strM.getClass();
                        String strM2 = np0Var6.m();
                        strM2.getClass();
                        long jP6 = np0Var6.P();
                        long jP7 = np0Var6.P();
                        RoundingMode roundingMode = RoundingMode.DOWN;
                        long jV = uu0.v(jP7, 1000000L, jP6, roundingMode);
                        long j38 = this.f17304z;
                        long j39 = j38 != C.TIME_UNSET ? j38 + jV : -9223372036854775807L;
                        long jV2 = uu0.v(np0Var6.P(), 1000L, jP6, roundingMode);
                        j10 = -9223372036854775807L;
                        jP = np0Var6.P();
                        str = strM2;
                        j11 = j39;
                        j12 = jV2;
                        j13 = jV;
                    } else if (iA2 != 1) {
                        com.applovin.impl.ca.r(new StringBuilder(String.valueOf(iA2).length() + 35), "Skipping unsupported emsg version: ", iA2, "FragmentedMp4Extractor");
                    } else {
                        long jP8 = np0Var6.P();
                        long j40 = np0Var6.j();
                        RoundingMode roundingMode2 = RoundingMode.DOWN;
                        long jV3 = uu0.v(j40, 1000000L, jP8, roundingMode2);
                        long jV4 = uu0.v(np0Var6.P(), 1000L, jP8, roundingMode2);
                        long jP9 = np0Var6.P();
                        strM = np0Var6.m();
                        strM.getClass();
                        String strM3 = np0Var6.m();
                        strM3.getClass();
                        j10 = -9223372036854775807L;
                        jP = jP9;
                        str = strM3;
                        j12 = jV4;
                        j13 = -9223372036854775807L;
                        j11 = jV3;
                    }
                    byte[] bArr = new byte[np0Var6.B()];
                    np0Var6.H(bArr, 0, np0Var6.B());
                    lj1 lj1Var = this.f17289j;
                    ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) lj1Var.f17036b;
                    byteArrayOutputStream.reset();
                    try {
                        DataOutputStream dataOutputStream = (DataOutputStream) lj1Var.f17037c;
                        dataOutputStream.writeBytes(strM);
                        dataOutputStream.writeByte(0);
                        dataOutputStream.writeBytes(str);
                        dataOutputStream.writeByte(0);
                        dataOutputStream.writeLong(j12);
                        dataOutputStream.writeLong(jP);
                        dataOutputStream.write(bArr);
                        dataOutputStream.flush();
                        np0 np0Var7 = new np0(byteArrayOutputStream.toByteArray());
                        int iB7 = np0Var7.B();
                        for (h3 h3Var : this.H) {
                            np0Var7.E(0);
                            h3Var.b(iB7, np0Var7);
                        }
                        if (j11 == j10) {
                            arrayDeque2.addLast(new j6(j13, iB7, true));
                            this.f17301w += iB7;
                        } else if (arrayDeque2.isEmpty()) {
                            for (h3 h3Var2 : this.H) {
                                h3Var2.c(j11, 1, iB7, 0, null);
                            }
                        } else {
                            arrayDeque2.addLast(new j6(j11, iB7, false));
                            this.f17301w += iB7;
                        }
                        n2Var2 = n2Var;
                    } catch (IOException e10) {
                        throw new RuntimeException(e10);
                    }
                }
            } else {
                n2Var2.zzf(i43);
            }
            b(n2Var2.zzn());
        }
        h3 h3Var3 = l6Var.f16744a;
        y6 y6Var8 = l6Var.f16745b;
        if (this.f17295q == 3) {
            this.B = !l6Var.f16755m ? l6Var.f16747d.f22513d[l6Var.f16749f] : y6Var8.f22166g[l6Var.f16749f];
            String str2 = l6Var.f16747d.f22510a.f21422g.f14678o;
            this.E = !((!Objects.equals(str2, "video/avc") ? !(!Objects.equals(str2, "video/hevc") || (i10 & 128) == 0) : (i10 & 64) != 0) ? false : z10);
            if (l6Var.f16749f < l6Var.f16752i) {
                n2Var2.zzf(this.B);
                x6 x6VarE = l6Var.e();
                if (x6VarE != null) {
                    np0 np0Var8 = (np0) y6Var8.f22175q;
                    int i45 = x6VarE.f21752d;
                    if (i45 != 0) {
                        np0Var8.G(i45);
                    }
                    int i46 = l6Var.f16749f;
                    if (y6Var8.f22169j && y6Var8.f22170k[i46]) {
                        np0Var8.G(np0Var8.L() * 6);
                    }
                }
                if (!l6Var.c()) {
                    this.A = null;
                }
                this.f17295q = 3;
                return 0;
            }
            if (l6Var.f16747d.f22510a.f21423h == z10) {
                this.B -= 8;
                n2Var2.zzf(8);
            }
            if ("audio/ac4".equals(l6Var.f16747d.f22510a.f21422g.f14678o)) {
                this.C = l6Var.d(this.B, 7);
                rb0.w(this.B, np0Var);
                h3Var3.b(7, np0Var);
                iD = this.C + 7;
                this.C = iD;
                i13 = 0;
            } else {
                i13 = 0;
                iD = l6Var.d(this.B, 0);
                this.C = iD;
            }
            this.B += iD;
            this.f17295q = 4;
            this.D = i13;
        }
        z6 z6Var = l6Var.f16747d;
        w6 w6Var = z6Var.f22510a;
        long j41 = !l6Var.f16755m ? z6Var.f22515f[l6Var.f16749f] : y6Var8.f22167h[l6Var.f16749f];
        int i47 = w6Var.f21426k;
        g22 g22Var = w6Var.f21422g;
        if (i47 != 0) {
            np0 np0Var9 = this.f17285f;
            byte[] bArr2 = np0Var9.f17880a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i48 = 4 - i47;
            while (true) {
                int i49 = i47;
                if (this.C >= this.B) {
                    break;
                }
                int i50 = this.D;
                if (i50 == 0) {
                    if (this.I.length > 0 || !this.E) {
                        int iU = dv.u(g22Var);
                        if (i49 + iU > this.B - this.C) {
                            i12 = 0;
                        } else {
                            i12 = iU;
                        }
                    } else {
                        i12 = 0;
                    }
                    n2Var2.p(bArr2, i48, i49 + i12);
                    np0Var9.E(0);
                    int iB8 = np0Var9.b();
                    if (iB8 < 0) {
                        throw ab.a(null, "Invalid NAL length");
                    }
                    this.D = iB8 - i12;
                    np0 np0Var10 = this.f17284e;
                    l6Var2 = l6Var;
                    np0Var10.E(0);
                    h3Var3.b(4, np0Var10);
                    this.C += 4;
                    this.B += i48;
                    if (this.I.length <= 0 || i12 <= 0 || (strQ = dv.Q(g22Var)) == null) {
                        i11 = i48;
                    } else {
                        int iHashCode = strQ.hashCode();
                        i11 = i48;
                        if (iHashCode == -1662541442 ? !(!strQ.equals("video/hevc") || ((bArr2[4] & 126) >> 1) != 39) : !(iHashCode == 1331836730 ? !strQ.equals("video/avc") || (bArr2[4] & 31) != c4 : iHashCode != 1331856911 || !strQ.equals("video/vvc") || ((bArr2[5] & 248) >> 3) != 23)) {
                            z11 = true;
                        }
                        this.F = z11;
                        h3Var3.b(i12, np0Var9);
                        this.C += i12;
                        if (i12 <= 0 && !this.E && dv.D(bArr2, i12, g22Var)) {
                            this.E = true;
                        }
                    }
                    z11 = false;
                    this.F = z11;
                    h3Var3.b(i12, np0Var9);
                    this.C += i12;
                    if (i12 <= 0) {
                    }
                } else {
                    l6Var2 = l6Var;
                    i11 = i48;
                    if (this.F) {
                        np0 np0Var11 = this.f17286g;
                        np0Var11.y(i50);
                        n2Var2.p(np0Var11.f17880a, 0, this.D);
                        h3Var3.b(this.D, np0Var11);
                        int i51 = this.D;
                        int iB9 = dv.b(np0Var11.f17882c, np0Var11.f17880a);
                        np0Var11.E(0);
                        np0Var11.C(iB9);
                        int i52 = g22Var.f14680q;
                        if (i52 == -1) {
                            if (kj1Var.f16462a != 0) {
                                kj1Var.u(0);
                            }
                        } else if (kj1Var.f16462a != i52) {
                            kj1Var.u(i52);
                        }
                        kj1Var.v(j41, np0Var11);
                        if ((l6Var2.b() & 4) != 0) {
                            kj1Var.w(0);
                        }
                        iE = i51;
                    } else {
                        iE = h3Var3.e(n2Var2, i50, false);
                    }
                    this.C += iE;
                    this.D -= iE;
                }
                i48 = i11;
                i47 = i49;
                l6Var = l6Var2;
                c4 = 6;
            }
        } else {
            while (true) {
                int i53 = this.C;
                int i54 = this.B;
                if (i53 >= i54) {
                    break;
                }
                this.C += h3Var3.e(n2Var2, i54 - i53, false);
            }
        }
        l6 l6Var8 = l6Var;
        int iB10 = l6Var8.b();
        if (!this.E) {
            iB10 |= 67108864;
        }
        int i55 = iB10;
        x6 x6VarE2 = l6Var8.e();
        long j42 = j41;
        h3Var3.c(j42, i55, this.B, 0, x6VarE2 != null ? x6VarE2.f21751c : null);
        while (!arrayDeque2.isEmpty()) {
            j6 j6Var = (j6) arrayDeque2.removeFirst();
            int i56 = this.f17301w;
            int i57 = j6Var.f15992c;
            this.f17301w = i56 - i57;
            long j43 = j6Var.f15990a;
            if (j6Var.f15991b) {
                j43 += j42;
            }
            long j44 = j43;
            for (h3 h3Var4 : this.H) {
                h3Var4.c(j44, 1, i57, this.f17301w, null);
            }
        }
        if (!l6Var8.c()) {
            this.A = null;
        }
        this.f17295q = 3;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void g(o2 o2Var) {
        if ((this.f17281b & 32) == 0) {
            o2Var = new bc.s(o2Var, this.f17280a);
        }
        this.G = o2Var;
        a();
        h3[] h3VarArr = new h3[2];
        this.H = h3VarArr;
        int i10 = 0;
        h3[] h3VarArr2 = (h3[]) uu0.n(0, h3VarArr);
        this.H = h3VarArr2;
        for (h3 h3Var : h3VarArr2) {
            h3Var.f(O);
        }
        List list = this.f17282c;
        this.I = new h3[list.size()];
        int i11 = 100;
        while (i10 < this.I.length) {
            int i12 = i11 + 1;
            h3 h3VarE = this.G.e(i11, 3);
            h3VarE.f((g22) list.get(i10));
            this.I[i10] = h3VarE;
            i10++;
            i11 = i12;
        }
    }

    public final void k(a3 a3Var, q2 q2Var) {
        this.G.o(a3Var);
        this.J = true;
        q2Var.f18888a = this.M;
        a();
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final /* synthetic */ List zzb() {
        return this.f17294p;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void zzf() {
    }
}
