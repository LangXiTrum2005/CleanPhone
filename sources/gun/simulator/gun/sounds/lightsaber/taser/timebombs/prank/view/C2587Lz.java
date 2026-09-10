package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2587Lz implements InterfaceC4395qO, InterfaceC2973aA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2484Hz f3383a;
    public final InterfaceC3150cA b;
    public final C2497Im c;
    public final Bd0 d;
    public final InterfaceC3296dq e;
    public final C3031aq f;
    public final G7 g;
    public final DO h;
    public final C2833Vl i;
    public final IdentityHashMap j;
    public final NN k;
    public final C4710tz l;
    public final boolean m;
    public final int n;
    public final boolean o;
    public final WU p;
    public final Wm0 q = new Wm0(this);
    public InterfaceC4307pO r;
    public int s;
    public C4062md0 t;
    public C3591hA[] u;
    public C3591hA[] v;
    public int w;
    public Wm0 x;

    public C2587Lz(InterfaceC2484Hz interfaceC2484Hz, InterfaceC3150cA interfaceC3150cA, C2497Im c2497Im, Bd0 bd0, InterfaceC3296dq interfaceC3296dq, C3031aq c3031aq, G7 g7, DO r8, C2833Vl c2833Vl, C4710tz c4710tz, boolean z, int i, boolean z2, WU wu) {
        this.f3383a = interfaceC2484Hz;
        this.b = interfaceC3150cA;
        this.c = c2497Im;
        this.d = bd0;
        this.e = interfaceC3296dq;
        this.f = c3031aq;
        this.g = g7;
        this.h = r8;
        this.i = c2833Vl;
        this.l = c4710tz;
        this.m = z;
        this.n = i;
        this.o = z2;
        this.p = wu;
        c4710tz.getClass();
        this.x = C4710tz.i(new InterfaceC4985x40[0]);
        this.j = new IdentityHashMap();
        this.k = new NN(24, 0);
        this.u = new C3591hA[0];
        this.v = new C3591hA[0];
    }

    public static C4619sw e(C4619sw c4619sw, C4619sw c4619sw2, boolean z) {
        String strS;
        Metadata metadata;
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        if (c4619sw2 != null) {
            strS = c4619sw2.i;
            metadata = c4619sw2.j;
            i2 = c4619sw2.y;
            i = c4619sw2.d;
            i3 = c4619sw2.e;
            str = c4619sw2.c;
            str2 = c4619sw2.b;
        } else {
            strS = Ug0.s(c4619sw.i, 1);
            metadata = c4619sw.j;
            if (z) {
                i2 = c4619sw.y;
                i = c4619sw.d;
                i3 = c4619sw.e;
                str = c4619sw.c;
                str2 = c4619sw.b;
            } else {
                i = 0;
                str = null;
                str2 = null;
                i2 = -1;
                i3 = 0;
            }
        }
        String strE = AbstractC5011xP.e(strS);
        int i4 = z ? c4619sw.f : -1;
        int i5 = z ? c4619sw.g : -1;
        C4531rw c4531rw = new C4531rw();
        c4531rw.f4954a = c4619sw.f5005a;
        c4531rw.b = str2;
        c4531rw.j = c4619sw.k;
        c4531rw.k = strE;
        c4531rw.h = strS;
        c4531rw.i = metadata;
        c4531rw.f = i4;
        c4531rw.g = i5;
        c4531rw.x = i2;
        c4531rw.d = i;
        c4531rw.e = i3;
        c4531rw.c = str;
        return new C4619sw(c4531rw);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052 A[LOOP:1: B:17:0x0043->B:22:0x0052, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0056 A[EDGE_INSN: B:51:0x0056->B:24:0x0056 BREAK  A[LOOP:1: B:17:0x0043->B:22:0x0052], SYNTHETIC] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2973aA
    public final boolean a(Uri uri, BR br, boolean z) {
        long j;
        int i;
        Uri[] uriArr;
        int iIndexOf;
        C3643hn c3643hn;
        boolean z2;
        boolean z3 = true;
        for (C3591hA c3591hA : this.u) {
            C2458Gz c2458Gz = c3591hA.d;
            if (Ug0.l(c2458Gz.e, uri)) {
                if (!z) {
                    C3483g0 c3483g0W = FW.w(c2458Gz.q);
                    c3591hA.i.getClass();
                    C2868Wu c2868WuY = G7.y(c3483g0W, br);
                    if (c2868WuY != null && c2868WuY.f3945a == 2) {
                        j = c2868WuY.b;
                    }
                    i = 0;
                    while (true) {
                        uriArr = c2458Gz.e;
                        if (i < uriArr.length) {
                            i = -1;
                            break;
                        }
                        if (uriArr[i].equals(uri)) {
                            break;
                        }
                        i++;
                    }
                    if (i != -1 && (iIndexOf = c2458Gz.q.indexOf(i)) != -1) {
                        c2458Gz.s |= uri.equals(c2458Gz.o);
                        if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            if (!c2458Gz.q.blacklist(iIndexOf, j) && (c3643hn = (C3643hn) ((C3730in) c2458Gz.g).d.get(uri)) != null) {
                                if (!C3643hn.a(c3643hn, j)) {
                                }
                            }
                        }
                        if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            z2 = true;
                        }
                    } else if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        z2 = true;
                    }
                    z2 = false;
                }
                j = -9223372036854775807L;
                i = 0;
                while (true) {
                    uriArr = c2458Gz.e;
                    if (i < uriArr.length) {
                        i = -1;
                        break;
                    }
                    if (uriArr[i].equals(uri)) {
                        break;
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    c2458Gz.s |= uri.equals(c2458Gz.o);
                    if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        if (!c2458Gz.q.blacklist(iIndexOf, j)) {
                        }
                    }
                    if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        z2 = true;
                    }
                } else if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    z2 = true;
                }
                z2 = false;
            } else {
                z2 = true;
            }
            z3 &= z2;
        }
        this.r.o(this);
        return z3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long b(long j, P30 p30) {
        for (C3591hA c3591hA : this.v) {
            if (c3591hA.A == 2) {
                C2458Gz c2458Gz = c3591hA.d;
                int selectedIndex = c2458Gz.q.getSelectedIndex();
                Uri[] uriArr = c2458Gz.e;
                int length = uriArr.length;
                InterfaceC3150cA interfaceC3150cA = c2458Gz.g;
                C2743Rz c2743RzA = (selectedIndex >= length || selectedIndex == -1) ? null : ((C3730in) interfaceC3150cA).a(uriArr[c2458Gz.q.getSelectedIndexInTrackGroup()], true);
                if (c2743RzA == null) {
                    break;
                }
                AC ac = c2743RzA.r;
                if (ac.isEmpty() || !c2743RzA.c) {
                    break;
                    break;
                }
                long j2 = c2743RzA.h - ((C3730in) interfaceC3150cA).n;
                long j3 = j - j2;
                int iD = Ug0.d(ac, Long.valueOf(j3), true);
                long j4 = ((C2665Oz) ac.get(iD)).e;
                return p30.a(j3, j4, iD != ac.size() - 1 ? ((C2665Oz) ac.get(iD + 1)).e : j4) + j2;
            }
        }
        return j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2973aA
    public final void c() {
        for (C3591hA c3591hA : this.u) {
            ArrayList arrayList = c3591hA.n;
            if (!arrayList.isEmpty()) {
                C2536Jz c2536Jz = (C2536Jz) FW.H(arrayList);
                int iB = c3591hA.d.b(c2536Jz);
                if (iB == 1) {
                    c2536Jz.K = true;
                } else if (iB == 2 && !c3591hA.T) {
                    OI oi = c3591hA.j;
                    if (oi.d()) {
                        oi.a();
                    }
                }
            }
        }
        this.r.o(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean continueLoading(long j) {
        if (this.t != null) {
            return this.x.continueLoading(j);
        }
        for (C3591hA c3591hA : this.u) {
            if (!c3591hA.D) {
                c3591hA.continueLoading(c3591hA.P);
            }
        }
        return false;
    }

    public final C3591hA d(String str, int i, Uri[] uriArr, C4619sw[] c4619swArr, C4619sw c4619sw, List list, Map map, long j) {
        return new C3591hA(str, i, this.q, new C2458Gz(this.f3383a, this.b, uriArr, c4619swArr, this.c, this.d, this.k, list, this.p), map, this.i, j, c4619sw, this.e, this.f, this.g, this.h, this.n);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getBufferedPositionUs() {
        return this.x.getBufferedPositionUs();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getNextLoadPositionUs() {
        return this.x.getNextLoadPositionUs();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final C4062md0 getTrackGroups() {
        C4062md0 c4062md0 = this.t;
        c4062md0.getClass();
        return c4062md0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean isLoading() {
        return this.x.isLoading();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 8311. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long k(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt[] r38, boolean[] r39, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20[] r40, boolean[] r41, long r42) {
        /*
            Method dump skipped, instruction units count: 831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2587Lz.k(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dt[], boolean[], gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20[], boolean[], long):long");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void maybeThrowPrepareError() throws IOException {
        for (C3591hA c3591hA : this.u) {
            c3591hA.s();
            if (c3591hA.T && !c3591hA.D) {
                throw KT.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void q(long j) {
        for (C3591hA c3591hA : this.v) {
            if (c3591hA.C && !c3591hA.o()) {
                int length = c3591hA.v.length;
                for (int i = 0; i < length; i++) {
                    c3591hA.v[i].h(j, c3591hA.N[i]);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:69:0x0136  */
    /* JADX WARN: Code duplicated, block: B:75:0x0173  */
    /* JADX WARN: Code duplicated, block: B:77:0x0178 A[LOOP:4: B:76:0x0176->B:77:0x0178, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f9 A[LOOP:5: B:87:0x01f3->B:89:0x01f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x0217  */
    /* JADX WARN: Code duplicated, block: B:93:0x021f A[LOOP:6: B:92:0x021d->B:93:0x021f, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r24v0, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void r(InterfaceC4307pO interfaceC4307pO, long j) {
        ?? EmptyMap;
        List list;
        boolean z;
        ?? r21;
        ArrayList arrayList;
        List list2;
        HashSet hashSet;
        int i;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        Uri[] uriArr;
        C4619sw[] c4619swArr;
        int[] iArr;
        int i4;
        int i5;
        int iR;
        int iR2;
        int i6;
        ?? r22;
        C3591hA c3591hAD;
        ArrayList arrayList2;
        C4619sw c4619sw;
        C4619sw[] c4619swArr2;
        int i7;
        C4619sw[] c4619swArr3;
        int i8;
        List list3;
        int i9;
        boolean z4;
        int i10;
        int i11;
        this.r = interfaceC4307pO;
        C3730in c3730in = (C3730in) this.b;
        c3730in.getClass();
        c3730in.e.add(this);
        C2847Vz c2847Vz = c3730in.j;
        c2847Vz.getClass();
        if (this.o) {
            List list4 = c2847Vz.m;
            ArrayList arrayList3 = new ArrayList(list4);
            EmptyMap = new HashMap();
            int i12 = 0;
            while (i12 < arrayList3.size()) {
                DrmInitData drmInitDataE = (DrmInitData) list4.get(i12);
                String str = drmInitDataE.schemeType;
                i12++;
                int i13 = i12;
                while (i13 < arrayList3.size()) {
                    DrmInitData drmInitData = (DrmInitData) arrayList3.get(i13);
                    if (TextUtils.equals(drmInitData.schemeType, str)) {
                        drmInitDataE = drmInitDataE.e(drmInitData);
                        arrayList3.remove(i13);
                    } else {
                        i13++;
                    }
                }
                EmptyMap.put(str, drmInitDataE);
            }
        } else {
            EmptyMap = Collections.emptyMap();
        }
        ?? r14 = EmptyMap;
        List list5 = c2847Vz.e;
        boolean z5 = !list5.isEmpty();
        this.s = 0;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        boolean z6 = this.m;
        List list6 = c2847Vz.g;
        if (z5) {
            int size = list5.size();
            int[] iArr2 = new int[size];
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i14 < list5.size()) {
                C4619sw c4619sw2 = ((C2821Uz) list5.get(i14)).b;
                if (c4619sw2.r <= 0) {
                    String str2 = c4619sw2.i;
                    if (Ug0.s(str2, 2) != null) {
                        i11 = 1;
                        iArr2[i14] = 2;
                        i15++;
                    } else {
                        i11 = 1;
                        if (Ug0.s(str2, 1) != null) {
                            iArr2[i14] = 1;
                            i16++;
                        } else {
                            iArr2[i14] = -1;
                        }
                    }
                } else {
                    i11 = 1;
                    iArr2[i14] = 2;
                    i15++;
                }
                i14 += i11;
            }
            if (i15 > 0) {
                i3 = i15;
                z2 = true;
            } else {
                if (i16 < size) {
                    i3 = size - i16;
                    z2 = false;
                    z3 = true;
                } else {
                    i3 = size;
                    z2 = false;
                }
                uriArr = new Uri[i3];
                c4619swArr = new C4619sw[i3];
                iArr = new int[i3];
                i4 = 0;
                i5 = 0;
                while (i4 < list5.size()) {
                    if (z2) {
                        z4 = z6;
                        if (iArr2[i4] == 2) {
                        }
                        i10 = 1;
                        i4 += i10;
                        z6 = z4;
                    } else {
                        z4 = z6;
                    }
                    if (z3 || iArr2[i4] != 1) {
                        C2821Uz c2821Uz = (C2821Uz) list5.get(i4);
                        uriArr[i5] = c2821Uz.f3851a;
                        c4619swArr[i5] = c2821Uz.b;
                        i10 = 1;
                        iArr[i5] = i4;
                        i5++;
                    } else {
                        i10 = 1;
                    }
                    i4 += i10;
                    z6 = z4;
                }
                boolean z7 = z6;
                String str3 = c4619swArr[0].i;
                iR = Ug0.r(2, str3);
                iR2 = Ug0.r(1, str3);
                boolean z8 = (iR2 != 1 || (iR2 == 0 && list6.isEmpty())) && iR <= 1 && iR2 + iR > 0;
                if (!z2 || iR2 <= 0) {
                    i6 = 0;
                } else {
                    i6 = 1;
                }
                list = list6;
                r22 = r14;
                arrayList = arrayList5;
                z = z7;
                c3591hAD = d("main", i6, uriArr, c4619swArr, c2847Vz.j, c2847Vz.k, r14, j);
                arrayList4.add(c3591hAD);
                arrayList.add(iArr);
                r21 = r22;
                r21 = r22;
                if (z && z8) {
                    arrayList2 = new ArrayList();
                    c4619sw = c2847Vz.j;
                    if (iR > 0) {
                        c4619swArr3 = new C4619sw[i3];
                        for (i8 = 0; i8 < i3; i8++) {
                            C4619sw c4619sw3 = c4619swArr[i8];
                            String strS = Ug0.s(c4619sw3.i, 2);
                            String strE = AbstractC5011xP.e(strS);
                            C4531rw c4531rw = new C4531rw();
                            c4531rw.f4954a = c4619sw3.f5005a;
                            c4531rw.b = c4619sw3.b;
                            c4531rw.j = c4619sw3.k;
                            c4531rw.k = strE;
                            c4531rw.h = strS;
                            c4531rw.i = c4619sw3.j;
                            c4531rw.f = c4619sw3.f;
                            c4531rw.g = c4619sw3.g;
                            c4531rw.p = c4619sw3.q;
                            c4531rw.q = c4619sw3.r;
                            c4531rw.r = c4619sw3.s;
                            c4531rw.d = c4619sw3.d;
                            c4531rw.e = c4619sw3.e;
                            c4619swArr3[i8] = new C4619sw(c4531rw);
                        }
                        arrayList2.add(new C3974ld0("main", c4619swArr3));
                        if (iR2 > 0 && (c4619sw != null || list.isEmpty())) {
                            arrayList2.add(new C3974ld0("main:audio", e(c4619swArr[0], c4619sw, false)));
                        }
                        list3 = c2847Vz.k;
                        if (list3 != null) {
                            for (i9 = 0; i9 < list3.size(); i9++) {
                                arrayList2.add(new C3974ld0(AbstractC3950lJ.p("main:cc:", i9), (C4619sw) list3.get(i9)));
                            }
                        }
                    } else {
                        c4619swArr2 = new C4619sw[i3];
                        for (i7 = 0; i7 < i3; i7++) {
                            c4619swArr2[i7] = e(c4619swArr[i7], c4619sw, true);
                        }
                        arrayList2.add(new C3974ld0("main", c4619swArr2));
                    }
                    C4531rw c4531rw2 = new C4531rw();
                    c4531rw2.f4954a = "ID3";
                    c4531rw2.k = MimeTypes.APPLICATION_ID3;
                    C3974ld0 c3974ld0 = new C3974ld0("main:id3", new C4619sw(c4531rw2));
                    arrayList2.add(c3974ld0);
                    c3591hAD.t((C3974ld0[]) arrayList2.toArray(new C3974ld0[0]), arrayList2.indexOf(c3974ld0));
                    r21 = r22;
                }
            }
            z3 = false;
            uriArr = new Uri[i3];
            c4619swArr = new C4619sw[i3];
            iArr = new int[i3];
            i4 = 0;
            i5 = 0;
            while (i4 < list5.size()) {
                if (z2) {
                    z4 = z6;
                    if (iArr2[i4] == 2) {
                    }
                    i10 = 1;
                    i4 += i10;
                    z6 = z4;
                } else {
                    z4 = z6;
                }
                if (z3) {
                }
                C2821Uz c2821Uz2 = (C2821Uz) list5.get(i4);
                uriArr[i5] = c2821Uz2.f3851a;
                c4619swArr[i5] = c2821Uz2.b;
                i10 = 1;
                iArr[i5] = i4;
                i5++;
                i4 += i10;
                z6 = z4;
            }
            boolean z9 = z6;
            String str4 = c4619swArr[0].i;
            iR = Ug0.r(2, str4);
            iR2 = Ug0.r(1, str4);
            if (iR2 != 1) {
            }
            if (z2) {
                i6 = 0;
            } else {
                i6 = 0;
            }
            list = list6;
            r22 = r14;
            arrayList = arrayList5;
            z = z9;
            c3591hAD = d("main", i6, uriArr, c4619swArr, c2847Vz.j, c2847Vz.k, r14, j);
            arrayList4.add(c3591hAD);
            arrayList.add(iArr);
            r21 = r22;
            r21 = r22;
            if (z) {
                arrayList2 = new ArrayList();
                c4619sw = c2847Vz.j;
                if (iR > 0) {
                    c4619swArr3 = new C4619sw[i3];
                    while (i8 < i3) {
                        C4619sw c4619sw4 = c4619swArr[i8];
                        String strS2 = Ug0.s(c4619sw4.i, 2);
                        String strE2 = AbstractC5011xP.e(strS2);
                        C4531rw c4531rw3 = new C4531rw();
                        c4531rw3.f4954a = c4619sw4.f5005a;
                        c4531rw3.b = c4619sw4.b;
                        c4531rw3.j = c4619sw4.k;
                        c4531rw3.k = strE2;
                        c4531rw3.h = strS2;
                        c4531rw3.i = c4619sw4.j;
                        c4531rw3.f = c4619sw4.f;
                        c4531rw3.g = c4619sw4.g;
                        c4531rw3.p = c4619sw4.q;
                        c4531rw3.q = c4619sw4.r;
                        c4531rw3.r = c4619sw4.s;
                        c4531rw3.d = c4619sw4.d;
                        c4531rw3.e = c4619sw4.e;
                        c4619swArr3[i8] = new C4619sw(c4531rw3);
                    }
                    arrayList2.add(new C3974ld0("main", c4619swArr3));
                    if (iR2 > 0) {
                        arrayList2.add(new C3974ld0("main:audio", e(c4619swArr[0], c4619sw, false)));
                    }
                    list3 = c2847Vz.k;
                    if (list3 != null) {
                        while (i9 < list3.size()) {
                            arrayList2.add(new C3974ld0(AbstractC3950lJ.p("main:cc:", i9), (C4619sw) list3.get(i9)));
                        }
                    }
                } else {
                    c4619swArr2 = new C4619sw[i3];
                    while (i7 < i3) {
                        c4619swArr2[i7] = e(c4619swArr[i7], c4619sw, true);
                    }
                    arrayList2.add(new C3974ld0("main", c4619swArr2));
                }
                C4531rw c4531rw4 = new C4531rw();
                c4531rw4.f4954a = "ID3";
                c4531rw4.k = MimeTypes.APPLICATION_ID3;
                C3974ld0 c3974ld1 = new C3974ld0("main:id3", new C4619sw(c4531rw4));
                arrayList2.add(c3974ld1);
                c3591hAD.t((C3974ld0[]) arrayList2.toArray(new C3974ld0[0]), arrayList2.indexOf(c3974ld1));
                r21 = r22;
            }
        } else {
            list = list6;
            z = z6;
            r21 = r14;
            arrayList = arrayList5;
        }
        ArrayList arrayList6 = new ArrayList(list.size());
        ArrayList arrayList7 = new ArrayList(list.size());
        ArrayList arrayList8 = new ArrayList(list.size());
        HashSet hashSet2 = new HashSet();
        int i17 = 0;
        while (i17 < list.size()) {
            List list7 = list;
            String str5 = ((C2795Tz) list7.get(i17)).c;
            if (hashSet2.add(str5)) {
                arrayList6.clear();
                arrayList7.clear();
                arrayList8.clear();
                int i18 = 0;
                boolean z10 = true;
                while (i18 < list7.size()) {
                    if (Ug0.a(str5, ((C2795Tz) list7.get(i18)).c)) {
                        C2795Tz c2795Tz = (C2795Tz) list7.get(i18);
                        arrayList8.add(Integer.valueOf(i18));
                        arrayList6.add(c2795Tz.f3803a);
                        C4619sw c4619sw5 = c2795Tz.b;
                        arrayList7.add(c4619sw5);
                        i2 = 1;
                        z10 &= Ug0.r(1, c4619sw5.i) == 1;
                    } else {
                        i2 = 1;
                    }
                    i18 += i2;
                }
                String strI = AbstractC3888ke0.i("audio:", str5);
                int i19 = Ug0.f3833a;
                list2 = list7;
                hashSet = hashSet2;
                i = i17;
                C3591hA c3591hAD2 = d(strI, 1, (Uri[]) arrayList6.toArray(new Uri[0]), (C4619sw[]) arrayList7.toArray(new C4619sw[0]), null, Collections.emptyList(), r21, j);
                arrayList.add(AbstractC2995aW.z0(arrayList8));
                arrayList4.add(c3591hAD2);
                if (z && z10) {
                    c3591hAD2.t(new C3974ld0[]{new C3974ld0(strI, (C4619sw[]) arrayList7.toArray(new C4619sw[0]))}, new int[0]);
                }
                i17 = i + 1;
                hashSet2 = hashSet;
                list = list2;
            } else {
                list2 = list7;
                hashSet = hashSet2;
                i = i17;
            }
            i17 = i + 1;
            hashSet2 = hashSet;
            list = list2;
        }
        this.w = arrayList4.size();
        int i20 = 0;
        while (true) {
            List list8 = c2847Vz.h;
            if (i20 >= list8.size()) {
                break;
            }
            C2795Tz c2795Tz2 = (C2795Tz) list8.get(i20);
            StringBuilder sbQ = AbstractC5044xl.q("subtitle:", i20, ":");
            sbQ.append(c2795Tz2.c);
            String string = sbQ.toString();
            Uri[] uriArr2 = {c2795Tz2.f3803a};
            C4619sw c4619sw6 = c2795Tz2.b;
            C3591hA c3591hAD3 = d(string, 3, uriArr2, new C4619sw[]{c4619sw6}, null, Collections.emptyList(), r21, j);
            arrayList.add(new int[]{i20});
            arrayList4.add(c3591hAD3);
            c3591hAD3.t(new C3974ld0[]{new C3974ld0(string, c4619sw6)}, new int[0]);
            i20++;
        }
        this.u = (C3591hA[]) arrayList4.toArray(new C3591hA[0]);
        this.s = this.u.length;
        for (int i21 = 0; i21 < this.w; i21++) {
            this.u[i21].d.l = true;
        }
        for (C3591hA c3591hA : this.u) {
            if (!c3591hA.D) {
                c3591hA.continueLoading(c3591hA.P);
            }
        }
        this.v = this.u;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long readDiscontinuity() {
        return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final void reevaluateBuffer(long j) {
        this.x.reevaluateBuffer(j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long seekToUs(long j) {
        C3591hA[] c3591hAArr = this.v;
        if (c3591hAArr.length > 0) {
            boolean zV = c3591hAArr[0].v(j, false);
            int i = 1;
            while (true) {
                C3591hA[] c3591hAArr2 = this.v;
                if (i >= c3591hAArr2.length) {
                    break;
                }
                c3591hAArr2[i].v(j, zV);
                i++;
            }
            if (zV) {
                ((SparseArray) this.k.b).clear();
            }
        }
        return j;
    }
}
