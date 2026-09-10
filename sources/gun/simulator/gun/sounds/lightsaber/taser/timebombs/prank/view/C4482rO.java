package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Looper;
import android.util.Pair;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4482rO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4395qO f4928a;
    public final Object b;
    public final W20[] c;
    public boolean d;
    public boolean e;
    public C4658tO f;
    public boolean g;
    public final boolean[] h;
    public final L9[] i;
    public final AbstractC4129nM j;
    public final OO k;
    public C4482rO l;
    public C4062md0 m;
    public C4941wd0 n;
    public long o;

    public C4482rO(L9[] l9Arr, long j, AbstractC4129nM abstractC4129nM, C2833Vl c2833Vl, OO oo, C4658tO c4658tO, C4941wd0 c4941wd0) {
        this.i = l9Arr;
        this.o = j;
        this.j = abstractC4129nM;
        this.k = oo;
        C5186zO c5186zO = c4658tO.f5033a;
        this.b = c5186zO.f4977a;
        this.f = c4658tO;
        this.m = C4062md0.d;
        this.n = c4941wd0;
        this.c = new W20[l9Arr.length];
        this.h = new boolean[l9Arr.length];
        oo.getClass();
        int i = AbstractC3832k.h;
        Pair pair = (Pair) c5186zO.f4977a;
        Object obj = pair.first;
        C5186zO c5186zOB = c5186zO.b(pair.second);
        MO mo = (MO) oo.d.get(obj);
        mo.getClass();
        oo.g.add(mo);
        LO lo = (LO) oo.f.get(mo);
        if (lo != null) {
            lo.f3352a.h(lo.b);
        }
        mo.c.add(c5186zOB);
        InterfaceC4395qO interfaceC4395qOB = mo.f3403a.b(c5186zOB, c2833Vl, c4658tO.b);
        oo.c.put(interfaceC4395qOB, mo);
        oo.c();
        long j2 = c4658tO.d;
        this.f4928a = j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? new C2308Bf(interfaceC4395qOB, true, 0L, j2) : interfaceC4395qOB;
    }

    public final long a(C4941wd0 c4941wd0, long j, boolean z, boolean[] zArr) {
        L9[] l9Arr;
        W20[] w20Arr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= c4941wd0.f5189a) {
                break;
            }
            if (z || !c4941wd0.a(this.n, i)) {
                z2 = false;
            }
            this.h[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            l9Arr = this.i;
            int length = l9Arr.length;
            w20Arr = this.c;
            if (i2 >= length) {
                break;
            }
            if (l9Arr[i2].f3341a == -2) {
                w20Arr[i2] = null;
            }
            i2++;
        }
        b();
        this.n = c4941wd0;
        c();
        long jK = this.f4928a.k(c4941wd0.c, this.h, this.c, zArr, j);
        for (int i3 = 0; i3 < l9Arr.length; i3++) {
            if (l9Arr[i3].f3341a == -2 && this.n.b(i3)) {
                w20Arr[i3] = new C2890Xq();
            }
        }
        this.e = false;
        for (int i4 = 0; i4 < w20Arr.length; i4++) {
            if (w20Arr[i4] != null) {
                FW.s(c4941wd0.b(i4));
                if (l9Arr[i4].f3341a != -2) {
                    this.e = true;
                }
            } else {
                FW.s(c4941wd0.c[i4] == null);
            }
        }
        return jK;
    }

    public final void b() {
        if (this.l != null) {
            return;
        }
        int i = 0;
        while (true) {
            C4941wd0 c4941wd0 = this.n;
            if (i >= c4941wd0.f5189a) {
                return;
            }
            boolean zB = c4941wd0.b(i);
            InterfaceC3299dt interfaceC3299dt = this.n.c[i];
            if (zB && interfaceC3299dt != null) {
                interfaceC3299dt.disable();
            }
            i++;
        }
    }

    public final void c() {
        if (this.l != null) {
            return;
        }
        int i = 0;
        while (true) {
            C4941wd0 c4941wd0 = this.n;
            if (i >= c4941wd0.f5189a) {
                return;
            }
            boolean zB = c4941wd0.b(i);
            InterfaceC3299dt interfaceC3299dt = this.n.c[i];
            if (zB && interfaceC3299dt != null) {
                interfaceC3299dt.enable();
            }
            i++;
        }
    }

    public final long d() {
        if (!this.d) {
            return this.f.b;
        }
        long bufferedPositionUs = this.e ? this.f4928a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f.e : bufferedPositionUs;
    }

    public final long e() {
        return this.f.b + this.o;
    }

    public final void f() {
        b();
        InterfaceC4395qO interfaceC4395qO = this.f4928a;
        try {
            boolean z = interfaceC4395qO instanceof C2308Bf;
            OO oo = this.k;
            if (z) {
                oo.f(((C2308Bf) interfaceC4395qO).f2883a);
            } else {
                oo.f(interfaceC4395qO);
            }
        } catch (RuntimeException e) {
            AbstractC4038mJ.d("Period release failed.", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:144:0x0313  */
    /* JADX WARN: Code duplicated, block: B:181:0x0395  */
    public final C4941wd0 g(float f, Gc0 gc0) {
        C2939Zn c2939Zn;
        C4062md0[] c4062md0Arr;
        int[] iArr;
        boolean z;
        String str;
        C4062md0[] c4062md0Arr2;
        boolean z2;
        C3965lY c3965lYP;
        boolean z3;
        C3123bt c3123bt;
        C3123bt c3123bt2;
        C4062md0[] c4062md0Arr3;
        int[] iArr2;
        C3974ld0 c3974ld0;
        int[] iArr3;
        C3877kY c3877kY;
        int[] iArr4;
        AbstractC4129nM abstractC4129nM = this.j;
        L9[] l9Arr = this.i;
        C4062md0 c4062md0 = this.m;
        C5186zO c5186zO = this.f.f5033a;
        abstractC4129nM.getClass();
        int[] iArr5 = new int[l9Arr.length + 1];
        int length = l9Arr.length + 1;
        C3974ld0[][] c3974ld0Arr = new C3974ld0[length][];
        int[][][] iArr6 = new int[l9Arr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = c4062md0.f4703a;
            c3974ld0Arr[i] = new C3974ld0[i2];
            iArr6[i] = new int[i2][];
        }
        int length2 = l9Arr.length;
        int[] iArr7 = new int[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            iArr7[i3] = l9Arr[i3].v();
        }
        int i4 = 0;
        while (i4 < c4062md0.f4703a) {
            C3974ld0 c3974ld0A = c4062md0.a(i4);
            boolean z4 = c3974ld0A.c == 5;
            int length3 = l9Arr.length;
            int i5 = 0;
            int i6 = 0;
            boolean z5 = true;
            while (i5 < l9Arr.length) {
                L9 l9 = l9Arr[i5];
                C4062md0 c4062md1 = c4062md0;
                int iMax = 0;
                for (int i7 = 0; i7 < c3974ld0A.f4655a; i7++) {
                    iMax = Math.max(iMax, l9.u(c3974ld0A.d[i7]) & 7);
                }
                boolean z6 = iArr5[i5] == 0;
                if (iMax > i6 || (iMax == i6 && z4 && !z5 && z6)) {
                    i6 = iMax;
                    z5 = z6;
                    length3 = i5;
                }
                i5++;
                c4062md0 = c4062md1;
            }
            C4062md0 c4062md2 = c4062md0;
            if (length3 == l9Arr.length) {
                iArr4 = new int[c3974ld0A.f4655a];
            } else {
                L9 l10 = l9Arr[length3];
                int[] iArr8 = new int[c3974ld0A.f4655a];
                for (int i8 = 0; i8 < c3974ld0A.f4655a; i8++) {
                    iArr8[i8] = l10.u(c3974ld0A.d[i8]);
                }
                iArr4 = iArr8;
            }
            int i9 = iArr5[length3];
            c3974ld0Arr[length3][i9] = c3974ld0A;
            iArr6[length3][i9] = iArr4;
            iArr5[length3] = i9 + 1;
            i4++;
            c4062md0 = c4062md2;
        }
        C4062md0[] c4062md0Arr4 = new C4062md0[l9Arr.length];
        String[] strArr = new String[l9Arr.length];
        int[] iArr9 = new int[l9Arr.length];
        for (int i10 = 0; i10 < l9Arr.length; i10++) {
            int i11 = iArr5[i10];
            c4062md0Arr4[i10] = new C4062md0((C3974ld0[]) Ug0.N(c3974ld0Arr[i10], i11));
            iArr6[i10] = (int[][]) Ug0.N(iArr6[i10], i11);
            strArr[i10] = l9Arr[i10].e();
            iArr9[i10] = l9Arr[i10].f3341a;
        }
        C4041mM c4041mM = new C4041mM(iArr9, c4062md0Arr4, iArr7, iArr6, new C4062md0((C3974ld0[]) Ug0.N(c3974ld0Arr[l9Arr.length], iArr5[l9Arr.length])));
        C3557go c3557go = (C3557go) abstractC4129nM;
        synchronized (c3557go.c) {
            try {
                c2939Zn = c3557go.g;
                if (c2939Zn.j0 && Ug0.f3833a >= 32 && (c3877kY = c3557go.h) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    FW.t(looperMyLooper);
                    c3877kY.h(c3557go, looperMyLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i12 = c4041mM.f4692a;
        C3123bt[] c3123btArr = new C3123bt[i12];
        int i13 = 2;
        Pair pairI = C3557go.i(2, c4041mM, iArr6, new C3285dk(13, c2939Zn, iArr7), new P70(9));
        if (pairI != null) {
            c3123btArr[((Integer) pairI.second).intValue()] = (C3123bt) pairI.first;
        }
        int i14 = 0;
        while (true) {
            c4062md0Arr = c4041mM.c;
            iArr = c4041mM.b;
            if (i14 >= c4041mM.f4692a) {
                z = false;
                break;
            }
            if (2 == iArr[i14] && c4062md0Arr[i14].f4703a > 0) {
                z = true;
                break;
            }
            i14++;
        }
        Pair pairI2 = C3557go.i(1, c4041mM, iArr6, new C2809Un(c3557go, z, c2939Zn), new P70(10));
        if (pairI2 != null) {
            c3123btArr[((Integer) pairI2.second).intValue()] = (C3123bt) pairI2.first;
        }
        if (pairI2 == null) {
            str = null;
        } else {
            C3123bt c3123bt3 = (C3123bt) pairI2.first;
            str = c3123bt3.f4193a.d[c3123bt3.b[0]].c;
        }
        int i15 = 3;
        Pair pairI3 = C3557go.i(3, c4041mM, iArr6, new C3285dk(14, c2939Zn, str), new P70(11));
        if (pairI3 != null) {
            c3123btArr[((Integer) pairI3.second).intValue()] = (C3123bt) pairI3.first;
        }
        int i16 = 0;
        while (i16 < i12) {
            int i17 = iArr[i16];
            if (i17 == i13 || i17 == 1 || i17 == i15) {
                c4062md0Arr3 = c4062md0Arr;
                iArr2 = iArr;
            } else {
                C4062md0 c4062md3 = c4062md0Arr[i16];
                int[][] iArr10 = iArr6[i16];
                C3974ld0 c3974ld1 = null;
                int i18 = 0;
                int i19 = 0;
                C2887Xn c2887Xn = null;
                while (i18 < c4062md3.f4703a) {
                    C3974ld0 c3974ld0A2 = c4062md3.a(i18);
                    int[] iArr11 = iArr10[i18];
                    C2887Xn c2887Xn2 = c2887Xn;
                    int i20 = i19;
                    C3974ld0 c3974ld2 = c3974ld1;
                    int i21 = 0;
                    while (i21 < c3974ld0A2.f4655a) {
                        C4062md0[] c4062md0Arr5 = c4062md0Arr;
                        if (C3557go.f(iArr11[i21], c2939Zn.k0)) {
                            c3974ld0 = c3974ld0A2;
                            C2887Xn c2887Xn3 = new C2887Xn(c3974ld0A2.d[i21], iArr11[i21]);
                            if (c2887Xn2 != null) {
                                iArr3 = iArr;
                                if (AbstractC2802Ug.f3832a.d(c2887Xn3.b, c2887Xn2.b).d(c2887Xn3.f3994a, c2887Xn2.f3994a).f() > 0) {
                                }
                            } else {
                                iArr3 = iArr;
                            }
                            c2887Xn2 = c2887Xn3;
                            i20 = i21;
                            c3974ld2 = c3974ld0;
                        } else {
                            c3974ld0 = c3974ld0A2;
                            iArr3 = iArr;
                        }
                        i21++;
                        c4062md0Arr = c4062md0Arr5;
                        c3974ld0A2 = c3974ld0;
                        iArr = iArr3;
                    }
                    i18++;
                    c3974ld1 = c3974ld2;
                    i19 = i20;
                    c2887Xn = c2887Xn2;
                }
                c4062md0Arr3 = c4062md0Arr;
                iArr2 = iArr;
                c3123btArr[i16] = c3974ld1 == null ? null : new C3123bt(0, c3974ld1, new int[]{i19});
            }
            i16++;
            c4062md0Arr = c4062md0Arr3;
            iArr = iArr2;
            i13 = 2;
            i15 = 3;
        }
        int i22 = c4041mM.f4692a;
        HashMap map = new HashMap();
        int i23 = 0;
        while (true) {
            c4062md0Arr2 = c4041mM.c;
            if (i23 >= i22) {
                break;
            }
            C3557go.d(c4062md0Arr2[i23], c2939Zn, map);
            i23++;
        }
        C3557go.d(c4041mM.f, c2939Zn, map);
        for (int i24 = 0; i24 < i22; i24++) {
            C4501rd0 c4501rd0 = (C4501rd0) map.get(Integer.valueOf(c4041mM.b[i24]));
            if (c4501rd0 != null) {
                AC ac = c4501rd0.b;
                if (ac.isEmpty()) {
                    c3123bt2 = null;
                } else {
                    C4062md0 c4062md4 = c4062md0Arr2[i24];
                    C3974ld0 c3974ld3 = c4501rd0.f4938a;
                    if (c4062md4.b(c3974ld3) != -1) {
                        c3123bt2 = new C3123bt(0, c3974ld3, AbstractC2995aW.z0(ac));
                    } else {
                        c3123bt2 = null;
                    }
                }
                c3123btArr[i24] = c3123bt2;
            }
        }
        int i25 = c4041mM.f4692a;
        for (int i26 = 0; i26 < i25; i26++) {
            C4062md0 c4062md5 = c4041mM.c[i26];
            Map map2 = (Map) c2939Zn.n0.get(i26);
            if (map2 != null && map2.containsKey(c4062md5)) {
                Map map3 = (Map) c2939Zn.n0.get(i26);
                C3027ao c3027ao = map3 != null ? (C3027ao) map3.get(c4062md5) : null;
                if (c3027ao != null) {
                    int[] iArr12 = c3027ao.b;
                    if (iArr12.length != 0) {
                        c3123bt = new C3123bt(c3027ao.c, c4062md5.a(c3027ao.f4142a), iArr12);
                    } else {
                        c3123bt = null;
                    }
                } else {
                    c3123bt = null;
                }
                c3123btArr[i26] = c3123bt;
            }
        }
        for (int i27 = 0; i27 < i12; i27++) {
            int i28 = c4041mM.b[i27];
            if (c2939Zn.o0.get(i27) || c2939Zn.z.contains(Integer.valueOf(i28))) {
                c3123btArr[i27] = null;
            }
        }
        InterfaceC3211ct interfaceC3211ct = c3557go.e;
        F8 f8 = c3557go.b;
        FW.t(f8);
        InterfaceC3299dt[] interfaceC3299dtArrS = ((G7) interfaceC3211ct).s(c3123btArr, f8);
        C5196zY[] c5196zYArr = new C5196zY[i12];
        for (int i29 = 0; i29 < i12; i29++) {
            c5196zYArr[i29] = (c2939Zn.o0.get(i29) || c2939Zn.z.contains(Integer.valueOf(c4041mM.b[i29])) || (c4041mM.b[i29] != -2 && interfaceC3299dtArrS[i29] == null)) ? null : C5196zY.b;
        }
        if (c2939Zn.l0) {
            int i30 = -1;
            int i31 = -1;
            int i32 = 0;
            while (true) {
                if (i32 >= c4041mM.f4692a) {
                    z3 = true;
                    break;
                }
                int i33 = c4041mM.b[i32];
                InterfaceC3299dt interfaceC3299dt = interfaceC3299dtArrS[i32];
                if (i33 == 1 || i33 == 2) {
                    if (interfaceC3299dt != null) {
                        int[][] iArr13 = iArr6[i32];
                        int iB = c4041mM.c[i32].b(interfaceC3299dt.getTrackGroup());
                        int i34 = 0;
                        while (true) {
                            if (i34 >= interfaceC3299dt.length()) {
                                if (i33 != 1) {
                                    if (i30 == -1) {
                                        i30 = i32;
                                        break;
                                    }
                                    z3 = false;
                                    break;
                                }
                                if (i31 == -1) {
                                    i31 = i32;
                                    break;
                                }
                                z3 = false;
                                break;
                            }
                            if ((iArr13[iB][interfaceC3299dt.getIndexInTrackGroup(i34)] & 32) != 32) {
                                break;
                            }
                            i34++;
                        }
                    }
                }
                i32++;
            }
            if (z3 & ((i31 == -1 || i30 == -1) ? false : true)) {
                C5196zY c5196zY = new C5196zY(true);
                c5196zYArr[i31] = c5196zY;
                c5196zYArr[i30] = c5196zY;
            }
        }
        Pair pairCreate = Pair.create(c5196zYArr, interfaceC3299dtArrS);
        InterfaceC3299dt[] interfaceC3299dtArr = (InterfaceC3299dt[]) pairCreate.second;
        List[] listArr = new List[interfaceC3299dtArr.length];
        for (int i35 = 0; i35 < interfaceC3299dtArr.length; i35++) {
            InterfaceC3299dt interfaceC3299dt2 = interfaceC3299dtArr[i35];
            if (interfaceC3299dt2 != null) {
                c3965lYP = AC.p(interfaceC3299dt2);
            } else {
                C5086yC c5086yC = AC.b;
                c3965lYP = C3965lY.e;
            }
            listArr[i35] = c3965lYP;
        }
        C4998xC c4998xC = new C4998xC();
        for (int i36 = 0; i36 < c4041mM.f4692a; i36++) {
            C4062md0[] c4062md0Arr6 = c4041mM.c;
            C4062md0 c4062md6 = c4062md0Arr6[i36];
            List list = listArr[i36];
            int i37 = 0;
            while (i37 < c4062md6.f4703a) {
                C3974ld0 c3974ld0A3 = c4062md6.a(i37);
                int i38 = c4062md0Arr6[i36].a(i37).f4655a;
                int[] iArr14 = new int[i38];
                int i39 = 0;
                for (int i40 = 0; i40 < i38; i40++) {
                    if ((c4041mM.e[i36][i37][i40] & 7) == 4) {
                        iArr14[i39] = i40;
                        i39++;
                    }
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr14, i39);
                int iMin = 16;
                List[] listArr2 = listArr;
                int i41 = 0;
                boolean z7 = false;
                int i42 = 0;
                String str2 = null;
                while (i41 < iArrCopyOf.length) {
                    C4062md0 c4062md7 = c4062md6;
                    String str3 = c4062md0Arr6[i36].a(i37).d[iArrCopyOf[i41]].l;
                    int i43 = i42 + 1;
                    if (i42 == 0) {
                        str2 = str3;
                    } else {
                        z7 = (!Ug0.a(str2, str3)) | z7;
                    }
                    iMin = Math.min(iMin, c4041mM.e[i36][i37][i41] & 24);
                    i41++;
                    i42 = i43;
                    c4062md6 = c4062md7;
                }
                C4062md0 c4062md8 = c4062md6;
                if (z7) {
                    iMin = Math.min(iMin, c4041mM.d[i36]);
                }
                boolean z8 = iMin != 0;
                int i44 = c3974ld0A3.f4655a;
                int[] iArr15 = new int[i44];
                boolean[] zArr = new boolean[i44];
                for (int i45 = 0; i45 < c3974ld0A3.f4655a; i45++) {
                    iArr15[i45] = c4041mM.e[i36][i37][i45] & 7;
                    int i46 = 0;
                    while (true) {
                        if (i46 >= list.size()) {
                            z2 = false;
                            break;
                        }
                        InterfaceC3299dt interfaceC3299dt3 = (InterfaceC3299dt) list.get(i46);
                        if (interfaceC3299dt3.getTrackGroup().equals(c3974ld0A3) && interfaceC3299dt3.indexOf(i45) != -1) {
                            z2 = true;
                            break;
                        }
                        i46++;
                    }
                    zArr[i45] = z2;
                }
                c4998xC.H0(new C5029xd0(c3974ld0A3, z8, iArr15, zArr));
                i37++;
                listArr = listArr2;
                c4062md6 = c4062md8;
            }
        }
        int i47 = 0;
        while (true) {
            C4062md0 c4062md9 = c4041mM.f;
            if (i47 >= c4062md9.f4703a) {
                break;
            }
            C3974ld0 c3974ld0A4 = c4062md9.a(i47);
            int[] iArr16 = new int[c3974ld0A4.f4655a];
            Arrays.fill(iArr16, 0);
            c4998xC.H0(new C5029xd0(c3974ld0A4, false, iArr16, new boolean[c3974ld0A4.f4655a]));
            i47++;
        }
        C4941wd0 c4941wd0 = new C4941wd0((C5196zY[]) pairCreate.first, (InterfaceC3299dt[]) pairCreate.second, new C5117yd0(c4998xC.J0()), c4041mM);
        for (InterfaceC3299dt interfaceC3299dt4 : c4941wd0.c) {
            if (interfaceC3299dt4 != null) {
                interfaceC3299dt4.onPlaybackSpeed(f);
            }
        }
        return c4941wd0;
    }

    public final void h() {
        InterfaceC4395qO interfaceC4395qO = this.f4928a;
        if (interfaceC4395qO instanceof C2308Bf) {
            long j = this.f.d;
            if (j == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                j = Long.MIN_VALUE;
            }
            C2308Bf c2308Bf = (C2308Bf) interfaceC4395qO;
            c2308Bf.e = 0L;
            c2308Bf.f = j;
        }
    }
}
