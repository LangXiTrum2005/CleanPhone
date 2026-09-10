package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2458Gz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2484Hz f3147a;
    public final InterfaceC4429ql b;
    public final InterfaceC4429ql c;
    public final NN d;
    public final Uri[] e;
    public final C4619sw[] f;
    public final InterfaceC3150cA g;
    public final C3974ld0 h;
    public final List i;
    public final WU k;
    public boolean l;
    public C3529ga n;
    public Uri o;
    public boolean p;
    public InterfaceC3299dt q;
    public boolean s;
    public final NN j = new NN(0);
    public byte[] m = Ug0.e;
    public long r = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    public C2458Gz(InterfaceC2484Hz interfaceC2484Hz, InterfaceC3150cA interfaceC3150cA, Uri[] uriArr, C4619sw[] c4619swArr, C2497Im c2497Im, Bd0 bd0, NN nn, List list, WU wu) {
        this.f3147a = interfaceC2484Hz;
        this.g = interfaceC3150cA;
        this.e = uriArr;
        this.f = c4619swArr;
        this.d = nn;
        this.i = list;
        this.k = wu;
        InterfaceC4429ql interfaceC4429qlCreateDataSource = c2497Im.f3238a.createDataSource();
        this.b = interfaceC4429qlCreateDataSource;
        if (bd0 != null) {
            interfaceC4429qlCreateDataSource.c(bd0);
        }
        this.c = c2497Im.f3238a.createDataSource();
        this.h = new C3974ld0(c4619swArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((c4619swArr[i].e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        C3974ld0 c3974ld0 = this.h;
        int[] iArrZ0 = AbstractC2995aW.z0(arrayList);
        C2406Ez c2406Ez = new C2406Ez(c3974ld0, iArrZ0);
        c2406Ez.g = c2406Ez.d(c3974ld0.d[iArrZ0[0]]);
        this.q = c2406Ez;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00de  */
    public final InterfaceC3954lN[] a(C2536Jz c2536Jz, long j) {
        List listUnmodifiableList;
        int iA = c2536Jz == null ? -1 : this.h.a(c2536Jz.d);
        int length = this.q.length();
        InterfaceC3954lN[] interfaceC3954lNArr = new InterfaceC3954lN[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int indexInTrackGroup = this.q.getIndexInTrackGroup(i);
            Uri uri = this.e[indexInTrackGroup];
            C3730in c3730in = (C3730in) this.g;
            if (c3730in.f(uri)) {
                C2743Rz c2743RzA = c3730in.a(uri, z);
                c2743RzA.getClass();
                long j2 = c2743RzA.h - c3730in.n;
                Pair pairC = c(c2536Jz, indexInTrackGroup != iA, c2743RzA, j2, j);
                long jLongValue = ((Long) pairC.first).longValue();
                int iIntValue = ((Integer) pairC.second).intValue();
                int i2 = (int) (jLongValue - c2743RzA.k);
                if (i2 >= 0) {
                    AC ac = c2743RzA.r;
                    if (ac.size() < i2) {
                        C5086yC c5086yC = AC.b;
                        listUnmodifiableList = C3965lY.e;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        if (i2 < ac.size()) {
                            if (iIntValue != -1) {
                                C2665Oz c2665Oz = (C2665Oz) ac.get(i2);
                                if (iIntValue == 0) {
                                    arrayList.add(c2665Oz);
                                } else if (iIntValue < c2665Oz.m.size()) {
                                    AC ac2 = c2665Oz.m;
                                    arrayList.addAll(ac2.subList(iIntValue, ac2.size()));
                                }
                                i2++;
                            }
                            arrayList.addAll(ac.subList(i2, ac.size()));
                            iIntValue = 0;
                        }
                        if (c2743RzA.n != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            if (iIntValue == -1) {
                                iIntValue = 0;
                            }
                            AC ac3 = c2743RzA.s;
                            if (iIntValue < ac3.size()) {
                                arrayList.addAll(ac3.subList(iIntValue, ac3.size()));
                            }
                        }
                        listUnmodifiableList = Collections.unmodifiableList(arrayList);
                    }
                } else {
                    C5086yC c5086yC2 = AC.b;
                    listUnmodifiableList = C3965lY.e;
                }
                interfaceC3954lNArr[i] = new C2380Dz(j2, listUnmodifiableList);
            } else {
                interfaceC3954lNArr[i] = InterfaceC3954lN.q1;
            }
            i++;
            z = false;
        }
        return interfaceC3954lNArr;
    }

    public final int b(C2536Jz c2536Jz) {
        if (c2536Jz.o == -1) {
            return 1;
        }
        C2743Rz c2743RzA = ((C3730in) this.g).a(this.e[this.h.a(c2536Jz.d)], false);
        c2743RzA.getClass();
        int i = (int) (c2536Jz.j - c2743RzA.k);
        if (i < 0) {
            return 1;
        }
        AC ac = c2743RzA.r;
        AC ac2 = i < ac.size() ? ((C2665Oz) ac.get(i)).m : c2743RzA.s;
        int size = ac2.size();
        int i2 = c2536Jz.o;
        if (i2 >= size) {
            return 2;
        }
        C2613Mz c2613Mz = (C2613Mz) ac2.get(i2);
        if (c2613Mz.m) {
            return 0;
        }
        return Ug0.a(Uri.parse(FW.V(c2743RzA.f3949a, c2613Mz.f3582a)), c2536Jz.b.f5150a) ? 1 : 2;
    }

    public final Pair c(C2536Jz c2536Jz, boolean z, C2743Rz c2743Rz, long j, long j2) {
        boolean z2 = true;
        int i = -1;
        if (c2536Jz != null && !z) {
            boolean z3 = c2536Jz.H;
            long jA = c2536Jz.j;
            int i2 = c2536Jz.o;
            if (!z3) {
                return new Pair(Long.valueOf(jA), Integer.valueOf(i2));
            }
            if (i2 == -1) {
                jA = c2536Jz.a();
            }
            return new Pair(Long.valueOf(jA), Integer.valueOf(i2 != -1 ? i2 + 1 : -1));
        }
        long j3 = c2743Rz.u + j;
        if (c2536Jz != null && !this.p) {
            j2 = c2536Jz.g;
        }
        boolean z4 = c2743Rz.o;
        long j4 = c2743Rz.k;
        AC ac = c2743Rz.r;
        if (!z4 && j2 >= j3) {
            return new Pair(Long.valueOf(j4 + ((long) ac.size())), -1);
        }
        long j5 = j2 - j;
        Long lValueOf = Long.valueOf(j5);
        if (((C3730in) this.g).m && c2536Jz != null) {
            z2 = false;
        }
        int iD = Ug0.d(ac, lValueOf, z2);
        long j6 = ((long) iD) + j4;
        if (iD >= 0) {
            C2665Oz c2665Oz = (C2665Oz) ac.get(iD);
            long j7 = c2665Oz.e + c2665Oz.c;
            AC ac2 = c2743Rz.s;
            AC ac3 = j5 < j7 ? c2665Oz.m : ac2;
            for (int i3 = 0; i3 < ac3.size(); i3++) {
                C2613Mz c2613Mz = (C2613Mz) ac3.get(i3);
                if (j5 < c2613Mz.e + c2613Mz.c) {
                    if (!c2613Mz.l) {
                        break;
                    }
                    j6 += ac3 == ac2 ? 1L : 0L;
                    i = i3;
                    break;
                }
            }
        }
        return new Pair(Long.valueOf(j6), Integer.valueOf(i));
    }

    public final C2354Cz d(Uri uri, int i) {
        if (uri == null) {
            return null;
        }
        NN nn = this.j;
        byte[] bArr = (byte[]) ((LinkedHashMap) nn.b).remove(uri);
        if (bArr != null) {
            return null;
        }
        C4868vl c4868vl = new C4868vl(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 1, null);
        C4619sw c4619sw = this.f[i];
        int selectionReason = this.q.getSelectionReason();
        Object selectionData = this.q.getSelectionData();
        byte[] bArr2 = this.m;
        C2354Cz c2354Cz = new C2354Cz(this.c, c4868vl, 3, c4619sw, selectionReason, selectionData, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        if (bArr2 == null) {
            bArr2 = Ug0.e;
        }
        c2354Cz.j = bArr2;
        return c2354Cz;
    }
}
