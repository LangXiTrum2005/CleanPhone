package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Tk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2780Tk implements InterfaceC4395qO, InterfaceC4897w40, InterfaceC2722Re {
    public static final Pattern x = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern y = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3788a;
    public final C2497Im b;
    public final Bd0 c;
    public final InterfaceC3296dq d;
    public final G7 e;
    public final C3844k50 f;
    public final long g;
    public final PI h;
    public final C2833Vl i;
    public final C4062md0 j;
    public final C2754Sk[] k;
    public final C4710tz l;
    public final UU m;
    public final DO o;
    public final C3031aq p;
    public InterfaceC4307pO q;
    public Wm0 t;
    public C2676Pk u;
    public int v;
    public List w;
    public C2748Se[] r = new C2748Se[0];
    public C3474fs[] s = new C3474fs[0];
    public final IdentityHashMap n = new IdentityHashMap();

    public C2780Tk(int i, C2676Pk c2676Pk, C3844k50 c3844k50, int i2, C2497Im c2497Im, Bd0 bd0, InterfaceC3296dq interfaceC3296dq, C3031aq c3031aq, G7 g7, DO r31, long j, PI pi, C2833Vl c2833Vl, C4710tz c4710tz, Wm0 wm0, WU wu) {
        int i3;
        int i4;
        int i5;
        int i6;
        C4619sw[] c4619swArr;
        C4619sw[] c4619swArrD;
        C2343Co c2343CoA;
        InterfaceC3296dq interfaceC3296dq2 = interfaceC3296dq;
        this.f3788a = i;
        this.u = c2676Pk;
        this.f = c3844k50;
        this.v = i2;
        this.b = c2497Im;
        this.c = bd0;
        this.d = interfaceC3296dq2;
        this.p = c3031aq;
        this.e = g7;
        this.o = r31;
        this.g = j;
        this.h = pi;
        this.i = c2833Vl;
        this.l = c4710tz;
        this.m = new UU(c2676Pk, wm0, c2833Vl);
        C2748Se[] c2748SeArr = this.r;
        c4710tz.getClass();
        this.t = C4710tz.i(c2748SeArr);
        C3259dU c3259dUA = c2676Pk.a(i2);
        List list = c3259dUA.d;
        this.w = list;
        List list2 = c3259dUA.c;
        int size = list2.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i7 = 0; i7 < size; i7++) {
            sparseIntArray.put(((X2) list2.get(i7)).f3953a, i7);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i7));
            arrayList.add(arrayList2);
            sparseArray.put(i7, arrayList2);
        }
        for (int i8 = 0; i8 < size; i8++) {
            X2 x2 = (X2) list2.get(i8);
            C2343Co c2343CoA2 = a("http://dashif.org/guidelines/trickmode", x2.e);
            List list3 = x2.f;
            c2343CoA2 = c2343CoA2 == null ? a("http://dashif.org/guidelines/trickmode", list3) : c2343CoA2;
            int iMin = (c2343CoA2 == null || (iMin = sparseIntArray.get(Integer.parseInt(c2343CoA2.b), -1)) == -1) ? i8 : iMin;
            if (iMin == i8 && (c2343CoA = a("urn:mpeg:dash:adaptation-set-switching:2016", list3)) != null) {
                int i9 = Ug0.f3833a;
                for (String str : c2343CoA.b.split(",", -1)) {
                    int i10 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i10 != -1) {
                        iMin = Math.min(iMin, i10);
                    }
                }
            }
            if (iMin != i8) {
                List list4 = (List) sparseArray.get(i8);
                List list5 = (List) sparseArray.get(iMin);
                list5.addAll(list4);
                sparseArray.put(i8, list5);
                arrayList.remove(list4);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i11 = 0; i11 < size2; i11++) {
            int[] iArrZ0 = AbstractC2995aW.z0((Collection) arrayList.get(i11));
            iArr[i11] = iArrZ0;
            Arrays.sort(iArrZ0);
        }
        boolean[] zArr = new boolean[size2];
        C4619sw[][] c4619swArr2 = new C4619sw[size2][];
        int i12 = 0;
        int i13 = 0;
        while (i12 < size2) {
            for (int i14 : iArr[i12]) {
                List list6 = ((X2) list2.get(i14)).c;
                for (int i15 = 0; i15 < list6.size(); i15++) {
                    if (!((FY) list6.get(i15)).d.isEmpty()) {
                        zArr[i12] = true;
                        i13++;
                        break;
                    }
                }
            }
            int[] iArr2 = iArr[i12];
            int length = iArr2.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length) {
                    i6 = 1;
                    c4619swArr = new C4619sw[0];
                    break;
                }
                int i17 = iArr2[i16];
                X2 x3 = (X2) list2.get(i17);
                List list7 = ((X2) list2.get(i17)).d;
                int[] iArr3 = iArr2;
                int i18 = 0;
                while (true) {
                    if (i18 < list7.size()) {
                        C2343Co c2343Co = (C2343Co) list7.get(i18);
                        int i19 = length;
                        List list8 = list7;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(c2343Co.f2943a)) {
                            C4531rw c4531rw = new C4531rw();
                            c4531rw.k = MimeTypes.APPLICATION_CEA608;
                            c4531rw.f4954a = AbstractC5044xl.o(new StringBuilder(), x3.f3953a, ":cea608");
                            c4619swArrD = d(c2343Co, x, new C4619sw(c4531rw));
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(c2343Co.f2943a)) {
                            C4531rw c4531rw2 = new C4531rw();
                            c4531rw2.k = MimeTypes.APPLICATION_CEA708;
                            c4531rw2.f4954a = AbstractC5044xl.o(new StringBuilder(), x3.f3953a, ":cea708");
                            c4619swArrD = d(c2343Co, y, new C4619sw(c4531rw2));
                        } else {
                            i18++;
                            length = i19;
                            list7 = list8;
                        }
                        c4619swArr = c4619swArrD;
                        i6 = 1;
                        break;
                    }
                    i16++;
                    iArr2 = iArr3;
                }
            }
            c4619swArr2[i12] = c4619swArr;
            if (c4619swArr.length != 0) {
                i13 += i6;
            }
            i12 += i6;
        }
        int size3 = list.size() + i13 + size2;
        C3974ld0[] c3974ld0Arr = new C3974ld0[size3];
        C2754Sk[] c2754SkArr = new C2754Sk[size3];
        int i20 = 0;
        int i21 = 0;
        while (i21 < size2) {
            int[] iArr4 = iArr[i21];
            ArrayList arrayList3 = new ArrayList();
            int length2 = iArr4.length;
            int i22 = size2;
            int i23 = 0;
            while (i23 < length2) {
                arrayList3.addAll(((X2) list2.get(iArr4[i23])).c);
                i23++;
                iArr = iArr;
            }
            int[][] iArr5 = iArr;
            int size4 = arrayList3.size();
            C4619sw[] c4619swArr3 = new C4619sw[size4];
            int i24 = 0;
            while (i24 < size4) {
                int i25 = size4;
                C4619sw c4619sw = ((FY) arrayList3.get(i24)).f3070a;
                ArrayList arrayList4 = arrayList3;
                int iG = interfaceC3296dq2.g(c4619sw);
                C4531rw c4531rwA = c4619sw.a();
                c4531rwA.F = iG;
                c4619swArr3[i24] = c4531rwA.a();
                i24++;
                size4 = i25;
                arrayList3 = arrayList4;
            }
            X2 x4 = (X2) list2.get(iArr4[0]);
            int i26 = x4.f3953a;
            String string = i26 != -1 ? Integer.toString(i26) : AbstractC3950lJ.p("unset:", i21);
            int i27 = i20 + 1;
            if (zArr[i21]) {
                i3 = i20 + 2;
                i4 = i27;
            } else {
                i3 = i27;
                i4 = -1;
            }
            if (c4619swArr2[i21].length != 0) {
                i5 = i3;
                i3++;
            } else {
                i5 = -1;
            }
            c3974ld0Arr[i20] = new C3974ld0(string, c4619swArr3);
            c2754SkArr[i20] = new C2754Sk(x4.b, 0, i20, i4, iArr4, i5, -1);
            int i28 = i4;
            int i29 = -1;
            if (i28 != -1) {
                String strH = DM.h(string, ":emsg");
                C4531rw c4531rw3 = new C4531rw();
                c4531rw3.f4954a = strH;
                c4531rw3.k = MimeTypes.APPLICATION_EMSG;
                c3974ld0Arr[i28] = new C3974ld0(strH, new C4619sw(c4531rw3));
                c2754SkArr[i28] = new C2754Sk(5, 1, i20, -1, iArr4, -1, -1);
                i29 = -1;
            }
            if (i5 != i29) {
                c3974ld0Arr[i5] = new C3974ld0(DM.h(string, ":cc"), c4619swArr2[i21]);
                c2754SkArr[i5] = new C2754Sk(3, 1, i20, -1, iArr4, -1, -1);
            }
            i21++;
            size2 = i22;
            iArr = iArr5;
            interfaceC3296dq2 = interfaceC3296dq;
            i20 = i3;
            list2 = list2;
            zArr = zArr;
        }
        int i30 = 0;
        while (i30 < list.size()) {
            C3650hs c3650hs = (C3650hs) list.get(i30);
            C4531rw c4531rw4 = new C4531rw();
            c4531rw4.f4954a = c3650hs.a();
            c4531rw4.k = MimeTypes.APPLICATION_EMSG;
            c3974ld0Arr[i20] = new C3974ld0(c3650hs.a() + ":" + i30, new C4619sw(c4531rw4));
            c2754SkArr[i20] = new C2754Sk(5, 2, -1, -1, new int[0], -1, i30);
            i30++;
            i20++;
        }
        Pair pairCreate = Pair.create(new C4062md0(c3974ld0Arr), c2754SkArr);
        this.j = (C4062md0) pairCreate.first;
        this.k = (C2754Sk[]) pairCreate.second;
    }

    public static C2343Co a(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            C2343Co c2343Co = (C2343Co) list.get(i);
            if (str.equals(c2343Co.f2943a)) {
                return c2343Co;
            }
        }
        return null;
    }

    public static C4619sw[] d(C2343Co c2343Co, Pattern pattern, C4619sw c4619sw) {
        String str = c2343Co.b;
        if (str == null) {
            return new C4619sw[]{c4619sw};
        }
        int i = Ug0.f3833a;
        String[] strArrSplit = str.split(";", -1);
        C4619sw[] c4619swArr = new C4619sw[strArrSplit.length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            Matcher matcher = pattern.matcher(strArrSplit[i2]);
            if (!matcher.matches()) {
                return new C4619sw[]{c4619sw};
            }
            int i3 = Integer.parseInt(matcher.group(1));
            C4531rw c4531rwA = c4619sw.a();
            c4531rwA.f4954a = c4619sw.f5005a + ":" + i3;
            c4531rwA.C = i3;
            c4531rwA.c = matcher.group(2);
            c4619swArr[i2] = new C4619sw(c4531rwA);
        }
        return c4619swArr;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long b(long j, P30 p30) {
        for (C2748Se c2748Se : this.r) {
            if (c2748Se.f3724a == 2) {
                return c2748Se.e.b(j, p30);
            }
        }
        return j;
    }

    public final int c(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        C2754Sk[] c2754SkArr = this.k;
        int i3 = c2754SkArr[i2].e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && c2754SkArr[i5].c == 0) {
                return i4;
            }
        }
        return -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean continueLoading(long j) {
        return this.t.continueLoading(j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getBufferedPositionUs() {
        return this.t.getBufferedPositionUs();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getNextLoadPositionUs() {
        return this.t.getNextLoadPositionUs();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final C4062md0 getTrackGroups() {
        return this.j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean isLoading() {
        return this.t.isLoading();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long k(InterfaceC3299dt[] interfaceC3299dtArr, boolean[] zArr, W20[] w20Arr, boolean[] zArr2, long j) {
        int i;
        int[] iArr;
        int i2;
        int[] iArr2;
        W20[] w20Arr2;
        C3974ld0 c3974ld0A;
        int i3;
        C3974ld0 c3974ld0A2;
        int i4;
        TU tu;
        W20 w20;
        InterfaceC3299dt[] interfaceC3299dtArr2 = interfaceC3299dtArr;
        W20[] w20Arr3 = w20Arr;
        int[] iArr3 = new int[interfaceC3299dtArr2.length];
        int i5 = 0;
        while (true) {
            i = -1;
            if (i5 >= interfaceC3299dtArr2.length) {
                break;
            }
            InterfaceC3299dt interfaceC3299dt = interfaceC3299dtArr2[i5];
            if (interfaceC3299dt != null) {
                iArr3[i5] = this.j.b(interfaceC3299dt.getTrackGroup());
            } else {
                iArr3[i5] = -1;
            }
            i5++;
        }
        for (int i6 = 0; i6 < interfaceC3299dtArr2.length; i6++) {
            if (interfaceC3299dtArr2[i6] == null || !zArr[i6]) {
                W20 w21 = w20Arr3[i6];
                if (w21 instanceof C2748Se) {
                    ((C2748Se) w21).m(this);
                } else if (w21 instanceof C2696Qe) {
                    ((C2696Qe) w21).c();
                }
                w20Arr3[i6] = null;
            }
        }
        for (int i7 = 0; i7 < interfaceC3299dtArr2.length; i7++) {
            W20 w22 = w20Arr3[i7];
            if ((w22 instanceof C2890Xq) || (w22 instanceof C2696Qe)) {
                int iC = c(i7, iArr3);
                if (iC != -1) {
                    W20 w23 = w20Arr3[i7];
                    if (!(w23 instanceof C2696Qe) || ((C2696Qe) w23).f3611a != w20Arr3[iC]) {
                        w20 = w20Arr3[i7];
                        if (w20 instanceof C2696Qe) {
                            ((C2696Qe) w20).c();
                        }
                        w20Arr3[i7] = null;
                    }
                } else if (!(w20Arr3[i7] instanceof C2890Xq)) {
                    w20 = w20Arr3[i7];
                    if (w20 instanceof C2696Qe) {
                        ((C2696Qe) w20).c();
                    }
                    w20Arr3[i7] = null;
                }
            }
        }
        int i8 = 0;
        while (i8 < interfaceC3299dtArr2.length) {
            InterfaceC3299dt interfaceC3299dt2 = interfaceC3299dtArr2[i8];
            if (interfaceC3299dt2 == null) {
                i2 = i8;
                iArr2 = iArr3;
                w20Arr2 = w20Arr3;
            } else {
                W20 w24 = w20Arr3[i8];
                if (w24 == null) {
                    zArr2[i8] = true;
                    C2754Sk c2754Sk = this.k[iArr3[i8]];
                    int i9 = c2754Sk.c;
                    if (i9 == 0) {
                        int i10 = c2754Sk.f;
                        boolean z = i10 != i;
                        if (z) {
                            c3974ld0A = this.j.a(i10);
                            i3 = 1;
                        } else {
                            c3974ld0A = null;
                            i3 = 0;
                        }
                        int i11 = c2754Sk.g;
                        boolean z2 = i11 != i;
                        if (z2) {
                            c3974ld0A2 = this.j.a(i11);
                            i3 += c3974ld0A2.f4655a;
                        } else {
                            c3974ld0A2 = null;
                        }
                        C4619sw[] c4619swArr = new C4619sw[i3];
                        int[] iArr4 = new int[i3];
                        if (z) {
                            c4619swArr[0] = c3974ld0A.d[0];
                            iArr4[0] = 5;
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (z2) {
                            for (int i12 = 0; i12 < c3974ld0A2.f4655a; i12++) {
                                C4619sw c4619sw = c3974ld0A2.d[i12];
                                c4619swArr[i4] = c4619sw;
                                iArr4[i4] = 3;
                                arrayList.add(c4619sw);
                                i4++;
                            }
                        }
                        if (this.u.d && z) {
                            UU uu = this.m;
                            tu = new TU(uu, uu.f3821a);
                        } else {
                            tu = null;
                        }
                        C2497Im c2497Im = this.b;
                        PI pi = this.h;
                        C2676Pk c2676Pk = this.u;
                        int i13 = i8;
                        C3844k50 c3844k50 = this.f;
                        int[] iArr5 = iArr3;
                        int i14 = this.v;
                        int[] iArr6 = c2754Sk.f3731a;
                        int i15 = c2754Sk.b;
                        long j2 = this.g;
                        Bd0 bd0 = this.c;
                        InterfaceC4429ql interfaceC4429qlCreateDataSource = c2497Im.f3238a.createDataSource();
                        if (bd0 != null) {
                            interfaceC4429qlCreateDataSource.c(bd0);
                        }
                        TU tu2 = tu;
                        i2 = i13;
                        iArr2 = iArr5;
                        C2748Se c2748Se = new C2748Se(c2754Sk.b, iArr4, c4619swArr, new C2575Lm(pi, c2676Pk, c3844k50, i14, iArr6, interfaceC3299dt2, i15, interfaceC4429qlCreateDataSource, j2, z, arrayList, tu), this, this.i, j, this.d, this.p, this.e, this.o);
                        synchronized (this) {
                            this.n.put(c2748Se, tu2);
                        }
                        w20Arr2 = w20Arr;
                        w20Arr2[i2] = c2748Se;
                    } else {
                        i2 = i8;
                        iArr2 = iArr3;
                        w20Arr2 = w20Arr3;
                        if (i9 == 2) {
                            w20Arr2[i2] = new C3474fs((C3650hs) this.w.get(c2754Sk.d), interfaceC3299dt2.getTrackGroup().d[0], this.u.d);
                        }
                    }
                } else {
                    i2 = i8;
                    iArr2 = iArr3;
                    w20Arr2 = w20Arr3;
                    if (w24 instanceof C2748Se) {
                        ((C2575Lm) ((InterfaceC2650Ok) ((C2748Se) w24).e)).i = interfaceC3299dt2;
                    }
                }
            }
            i8 = i2 + 1;
            w20Arr3 = w20Arr2;
            iArr3 = iArr2;
            i = -1;
            interfaceC3299dtArr2 = interfaceC3299dtArr;
        }
        int[] iArr7 = iArr3;
        W20[] w20Arr4 = w20Arr3;
        int i16 = 0;
        while (i16 < interfaceC3299dtArr.length) {
            if (w20Arr4[i16] != null || interfaceC3299dtArr[i16] == null) {
                iArr = iArr7;
            } else {
                iArr = iArr7;
                C2754Sk c2754Sk2 = this.k[iArr[i16]];
                if (c2754Sk2.c == 1) {
                    int iC2 = c(i16, iArr);
                    if (iC2 == -1) {
                        w20Arr4[i16] = new C2890Xq();
                    } else {
                        C2748Se c2748Se2 = (C2748Se) w20Arr4[iC2];
                        int i17 = c2754Sk2.b;
                        int i18 = 0;
                        while (true) {
                            V20[] v20Arr = c2748Se2.n;
                            if (i18 >= v20Arr.length) {
                                throw new IllegalStateException();
                            }
                            if (c2748Se2.b[i18] == i17) {
                                boolean[] zArr3 = c2748Se2.d;
                                FW.s(!zArr3[i18]);
                                zArr3[i18] = true;
                                v20Arr[i18].F(j, true);
                                w20Arr4[i16] = new C2696Qe(c2748Se2, c2748Se2, v20Arr[i18], i18);
                                break;
                            }
                            i18++;
                        }
                    }
                }
                i16++;
                iArr7 = iArr;
            }
            i16++;
            iArr7 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (W20 w25 : w20Arr4) {
            if (w25 instanceof C2748Se) {
                arrayList2.add((C2748Se) w25);
            } else if (w25 instanceof C3474fs) {
                arrayList3.add((C3474fs) w25);
            }
        }
        C2748Se[] c2748SeArr = new C2748Se[arrayList2.size()];
        this.r = c2748SeArr;
        arrayList2.toArray(c2748SeArr);
        C3474fs[] c3474fsArr = new C3474fs[arrayList3.size()];
        this.s = c3474fsArr;
        arrayList3.toArray(c3474fsArr);
        C4710tz c4710tz = this.l;
        C2748Se[] c2748SeArr2 = this.r;
        c4710tz.getClass();
        this.t = C4710tz.i(c2748SeArr2);
        return j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void maybeThrowPrepareError() {
        this.h.maybeThrowError();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4897w40
    public final void o(InterfaceC4985x40 interfaceC4985x40) {
        this.q.o(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void q(long j) {
        for (C2748Se c2748Se : this.r) {
            c2748Se.q(j);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void r(InterfaceC4307pO interfaceC4307pO, long j) {
        this.q = interfaceC4307pO;
        interfaceC4307pO.p(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long readDiscontinuity() {
        return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final void reevaluateBuffer(long j) {
        this.t.reevaluateBuffer(j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long seekToUs(long j) {
        for (C2748Se c2748Se : this.r) {
            c2748Se.n(j);
        }
        for (C3474fs c3474fs : this.s) {
            int iB = Ug0.b(c3474fs.c, j, true);
            c3474fs.g = iB;
            c3474fs.h = (c3474fs.d && iB == c3474fs.c.length) ? j : com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        return j;
    }
}
