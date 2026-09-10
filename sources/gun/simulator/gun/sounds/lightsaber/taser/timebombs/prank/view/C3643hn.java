package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3643hn implements JI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f4470a;
    public final OI b = new OI("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final InterfaceC4429ql c;
    public C2743Rz d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public IOException j;
    public final /* synthetic */ C3730in k;

    public C3643hn(C3730in c3730in, Uri uri) {
        this.k = c3730in;
        this.f4470a = uri;
        this.c = c3730in.f4520a.f3238a.createDataSource();
    }

    public static boolean a(C3643hn c3643hn, long j) {
        c3643hn.h = SystemClock.elapsedRealtime() + j;
        C3730in c3730in = c3643hn.k;
        if (!c3643hn.f4470a.equals(c3730in.k)) {
            return false;
        }
        List list = c3730in.j.e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C3643hn c3643hn2 = (C3643hn) c3730in.d.get(((C2821Uz) list.get(i)).f3851a);
            c3643hn2.getClass();
            if (jElapsedRealtime > c3643hn2.h) {
                Uri uri = c3643hn2.f4470a;
                c3730in.k = uri;
                c3643hn2.f(c3730in.b(uri));
                return false;
            }
        }
        return true;
    }

    public final void b(Uri uri) {
        C3730in c3730in = this.k;
        MT mt = new MT(this.c, uri, 4, c3730in.b.p(c3730in.j, this.d));
        G7 g7 = c3730in.c;
        int i = mt.c;
        this.b.f(mt, this, g7.A(i));
        c3730in.f.l(new FI(mt.b), i, -1, null, 0, null, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final void c(LI li, long j, long j2) {
        MT mt = (MT) li;
        AbstractC2873Wz abstractC2873Wz = (AbstractC2873Wz) mt.f;
        Uri uri = mt.d.c;
        FI fi = new FI();
        if (abstractC2873Wz instanceof C2743Rz) {
            g((C2743Rz) abstractC2873Wz, fi);
            this.k.f.f(fi, 4);
        } else {
            KT ktB = KT.b("Loaded playlist has unexpected type.", null);
            this.j = ktB;
            this.k.f.j(fi, 4, ktB, true);
        }
        this.k.c.getClass();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final void d(LI li, long j, long j2, boolean z) {
        MT mt = (MT) li;
        long j3 = mt.f3405a;
        Uri uri = mt.d.c;
        FI fi = new FI();
        C3730in c3730in = this.k;
        c3730in.c.getClass();
        c3730in.f.d(fi, 4, -1, null, 0, null, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final C2868Wu e(LI li, long j, long j2, IOException iOException, int i) {
        C2868Wu c2868WuB;
        MT mt = (MT) li;
        long j3 = mt.f3405a;
        Uri uri = mt.d.c;
        FI fi = new FI();
        boolean z = uri.getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof C2899Xz;
        Uri uri2 = this.f4470a;
        C3730in c3730in = this.k;
        int i2 = mt.c;
        if (z || z2) {
            int i3 = iOException instanceof SA ? ((SA) iOException).d : Integer.MAX_VALUE;
            if (z2 || i3 == 400 || i3 == 503) {
                this.g = SystemClock.elapsedRealtime();
                f(uri2);
                DO r8 = c3730in.f;
                int i4 = Ug0.f3833a;
                r8.j(fi, i2, iOException, true);
                return OI.e;
            }
        }
        BR br = new BR(fi, new C3779jO(i2), iOException, i);
        Iterator it = c3730in.e.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((InterfaceC2973aA) it.next()).a(uri2, br, false);
        }
        G7 g7 = c3730in.c;
        if (z3) {
            g7.getClass();
            long jB = G7.B(br);
            c2868WuB = jB != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? OI.b(jB, false) : OI.f;
        } else {
            c2868WuB = OI.e;
        }
        boolean zC = true ^ c2868WuB.c();
        c3730in.f.j(fi, i2, iOException, zC);
        if (!zC) {
            return c2868WuB;
        }
        g7.getClass();
        return c2868WuB;
    }

    public final void f(Uri uri) {
        this.h = 0L;
        if (this.i) {
            return;
        }
        OI oi = this.b;
        if (oi.d() || oi.c()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.g;
        if (jElapsedRealtime >= j) {
            b(uri);
        } else {
            this.i = true;
            this.k.h.postDelayed(new RunnableC3976le0(16, this, uri), j - jElapsedRealtime);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x022d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0243  */
    /* JADX WARN: Code duplicated, block: B:108:0x0251  */
    /* JADX WARN: Code duplicated, block: B:110:0x0259  */
    /* JADX WARN: Code duplicated, block: B:113:0x025e  */
    /* JADX WARN: Code duplicated, block: B:115:0x026a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0285  */
    /* JADX WARN: Code duplicated, block: B:119:0x0291  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:128:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:55:0x0101  */
    /* JADX WARN: Code duplicated, block: B:56:0x0104  */
    /* JADX WARN: Code duplicated, block: B:59:0x0108  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX WARN: Code duplicated, block: B:62:0x011b  */
    /* JADX WARN: Code duplicated, block: B:64:0x011e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0130  */
    /* JADX WARN: Code duplicated, block: B:70:0x0188  */
    /* JADX WARN: Code duplicated, block: B:72:0x0195  */
    /* JADX WARN: Code duplicated, block: B:74:0x0199  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b4 A[LOOP:0: B:77:0x01ae->B:79:0x01b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x01be  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01da  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:93:0x0210 A[LOOP:1: B:91:0x020a->B:93:0x0210, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x0222  */
    /* JADX WARN: Code duplicated, block: B:99:0x0227  */
    public final void g(C2743Rz c2743Rz, FI fi) {
        long j;
        long j2;
        long j3;
        boolean z;
        AC ac;
        C2743Rz c2743Rz2;
        int i;
        int i2;
        AC ac2;
        C2665Oz c2665Oz;
        boolean z2;
        int i3;
        C2743Rz c2743Rz3;
        CopyOnWriteArrayList copyOnWriteArrayList;
        Uri uriBuild;
        boolean z3;
        long size;
        C2743Rz c2743Rz4;
        C3124bu c3124bu;
        BR br;
        Iterator it;
        C2743Rz c2743Rz5;
        long j4;
        C2743Rz c2743Rz6;
        C2717Qz c2717Qz;
        Uri.Builder builderBuildUpon;
        C2743Rz c2743Rz7;
        C2717Qz c2717Qz2;
        String str;
        C2743Rz c2743Rz8;
        AC ac3;
        int size2;
        long j5;
        Iterator it2;
        int size3;
        int size4;
        int size5;
        C2743Rz c2743Rz9 = this.d;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.e = jElapsedRealtime;
        C3730in c3730in = this.k;
        c3730in.getClass();
        if (c2743Rz9 != null) {
            long j6 = c2743Rz.k;
            long j7 = c2743Rz9.k;
            if (j6 <= j7) {
                boolean z4 = c2743Rz9.o;
                AC ac4 = c2743Rz9.s;
                AC ac5 = c2743Rz9.r;
                boolean z5 = c2743Rz.o;
                if (j6 < j7 || ((size3 = c2743Rz.r.size() - ac5.size()) == 0 ? !((size4 = c2743Rz.s.size()) > (size5 = ac4.size()) || (size4 == size5 && z5 && !z4)) : size3 <= 0)) {
                    c2743Rz3 = (!z5 || z4) ? c2743Rz9 : new C2743Rz(c2743Rz9.d, c2743Rz9.f3949a, c2743Rz9.b, c2743Rz9.e, c2743Rz9.g, c2743Rz9.h, c2743Rz9.i, c2743Rz9.j, c2743Rz9.k, c2743Rz9.l, c2743Rz9.m, c2743Rz9.n, c2743Rz9.c, true, c2743Rz9.p, c2743Rz9.q, ac5, ac4, c2743Rz9.v, c2743Rz9.t);
                    z2 = false;
                }
            }
            this.d = c2743Rz3;
            copyOnWriteArrayList = c3730in.e;
            uriBuild = this.f4470a;
            z3 = c2743Rz3.o;
            if (c2743Rz3 != c2743Rz9) {
                this.j = null;
                this.f = jElapsedRealtime;
                if (uriBuild.equals(c3730in.k)) {
                    if (c3730in.l == null) {
                        c3730in.m = !z3;
                        c3730in.n = c2743Rz3.h;
                    }
                    c3730in.l = c2743Rz3;
                    ((C2769Sz) c3730in.i).w(c2743Rz3);
                }
                it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC2973aA) it2.next()).c();
                }
            } else if (!z3) {
                size = c2743Rz.k + ((long) c2743Rz.r.size());
                c2743Rz4 = this.d;
                if (size < c2743Rz4.k) {
                    c3124bu = new C3124bu();
                    z2 = true;
                } else if (jElapsedRealtime - this.f > Ug0.W(c2743Rz4.m) * 3.5d) {
                    c3124bu = new C3124bu();
                } else {
                    c3124bu = null;
                }
                if (c3124bu != null) {
                    this.j = c3124bu;
                    br = new BR(fi, new C3779jO(4), c3124bu, 1);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC2973aA) it.next()).a(uriBuild, br, z2);
                    }
                }
            }
            c2743Rz5 = this.d;
            if (c2743Rz5.v.e) {
                j4 = 0;
            } else {
                j5 = c2743Rz5.m;
                if (c2743Rz5 == c2743Rz9) {
                    j5 /= 2;
                }
                j4 = j5;
            }
            this.g = Ug0.W(j4) + jElapsedRealtime;
            if (this.d.n == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || uriBuild.equals(c3730in.k)) {
                c2743Rz6 = this.d;
                if (c2743Rz6.o) {
                }
                c2717Qz = c2743Rz6.v;
                if (c2717Qz.f3636a == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || c2717Qz.e) {
                    builderBuildUpon = uriBuild.buildUpon();
                    c2743Rz7 = this.d;
                    if (c2743Rz7.v.e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c2743Rz7.k + ((long) c2743Rz7.r.size())));
                        c2743Rz8 = this.d;
                        if (c2743Rz8.n != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            ac3 = c2743Rz8.s;
                            size2 = ac3.size();
                            if (!ac3.isEmpty() && ((C2613Mz) FW.H(ac3)).m) {
                                size2--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                        }
                    }
                    c2717Qz2 = this.d.v;
                    if (c2717Qz2.f3636a != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        if (c2717Qz2.b) {
                            str = "v2";
                        } else {
                            str = "YES";
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                    }
                    uriBuild = builderBuildUpon.build();
                }
                f(uriBuild);
            }
            return;
        }
        c2743Rz.getClass();
        boolean z6 = c2743Rz.p;
        long j8 = c2743Rz.k;
        if (!z6) {
            C2743Rz c2743Rz10 = c3730in.l;
            j = c2743Rz10 != null ? c2743Rz10.h : 0L;
            if (c2743Rz9 != null) {
                AC ac6 = c2743Rz9.r;
                int size6 = ac6.size();
                long j9 = c2743Rz9.k;
                int i4 = (int) (j8 - j9);
                C2665Oz c2665Oz2 = i4 < ac6.size() ? (C2665Oz) ac6.get(i4) : null;
                long j10 = c2743Rz9.h;
                if (c2665Oz2 != null) {
                    j3 = c2665Oz2.e;
                } else if (size6 == j8 - j9) {
                    j3 = c2743Rz9.u;
                } else {
                    j2 = j;
                }
                j = j10 + j3;
            }
            z = c2743Rz.i;
            ac = c2743Rz.r;
            if (z) {
                c2743Rz2 = c3730in.l;
                if (c2743Rz2 != null) {
                    i = c2743Rz2.j;
                } else {
                    i = 0;
                }
                if (c2743Rz9 == null) {
                    i2 = (int) (j8 - c2743Rz9.k);
                    ac2 = c2743Rz9.r;
                    if (i2 < ac2.size()) {
                        c2665Oz = (C2665Oz) ac2.get(i2);
                    } else {
                        c2665Oz = null;
                    }
                    if (c2665Oz != null) {
                        int i5 = c2743Rz9.j + c2665Oz.d;
                        z2 = false;
                        i = i5 - ((C2665Oz) ac.get(0)).d;
                    } else {
                        z2 = false;
                    }
                    i3 = i;
                }
                c2743Rz3 = new C2743Rz(c2743Rz.d, c2743Rz.f3949a, c2743Rz.b, c2743Rz.e, c2743Rz.g, j2, true, i3, c2743Rz.k, c2743Rz.l, c2743Rz.m, c2743Rz.n, c2743Rz.c, c2743Rz.o, c2743Rz.p, c2743Rz.q, ac, c2743Rz.s, c2743Rz.v, c2743Rz.t);
                this.d = c2743Rz3;
                copyOnWriteArrayList = c3730in.e;
                uriBuild = this.f4470a;
                z3 = c2743Rz3.o;
                if (c2743Rz3 != c2743Rz9) {
                    this.j = null;
                    this.f = jElapsedRealtime;
                    if (uriBuild.equals(c3730in.k)) {
                        if (c3730in.l == null) {
                            c3730in.m = !z3;
                            c3730in.n = c2743Rz3.h;
                        }
                        c3730in.l = c2743Rz3;
                        ((C2769Sz) c3730in.i).w(c2743Rz3);
                    }
                    it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC2973aA) it2.next()).c();
                    }
                } else if (!z3) {
                    size = c2743Rz.k + ((long) c2743Rz.r.size());
                    c2743Rz4 = this.d;
                    if (size < c2743Rz4.k) {
                        c3124bu = new C3124bu();
                        z2 = true;
                    } else if (jElapsedRealtime - this.f > Ug0.W(c2743Rz4.m) * 3.5d) {
                        c3124bu = new C3124bu();
                    } else {
                        c3124bu = null;
                    }
                    if (c3124bu != null) {
                        this.j = c3124bu;
                        br = new BR(fi, new C3779jO(4), c3124bu, 1);
                        it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC2973aA) it.next()).a(uriBuild, br, z2);
                        }
                    }
                }
                c2743Rz5 = this.d;
                if (c2743Rz5.v.e) {
                    j5 = c2743Rz5.m;
                    if (c2743Rz5 == c2743Rz9) {
                        j5 /= 2;
                    }
                    j4 = j5;
                } else {
                    j4 = 0;
                }
                this.g = Ug0.W(j4) + jElapsedRealtime;
                if (this.d.n == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                }
                c2743Rz6 = this.d;
                if (c2743Rz6.o) {
                    c2717Qz = c2743Rz6.v;
                    if (c2717Qz.f3636a == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        builderBuildUpon = uriBuild.buildUpon();
                        c2743Rz7 = this.d;
                        if (c2743Rz7.v.e) {
                            builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c2743Rz7.k + ((long) c2743Rz7.r.size())));
                            c2743Rz8 = this.d;
                            if (c2743Rz8.n != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                ac3 = c2743Rz8.s;
                                size2 = ac3.size();
                                if (!ac3.isEmpty()) {
                                    size2--;
                                }
                                builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                            }
                        }
                        c2717Qz2 = this.d.v;
                        if (c2717Qz2.f3636a != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            if (c2717Qz2.b) {
                                str = "v2";
                            } else {
                                str = "YES";
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                        }
                        uriBuild = builderBuildUpon.build();
                    } else {
                        builderBuildUpon = uriBuild.buildUpon();
                        c2743Rz7 = this.d;
                        if (c2743Rz7.v.e) {
                            builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c2743Rz7.k + ((long) c2743Rz7.r.size())));
                            c2743Rz8 = this.d;
                            if (c2743Rz8.n != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                ac3 = c2743Rz8.s;
                                size2 = ac3.size();
                                if (!ac3.isEmpty()) {
                                    size2--;
                                }
                                builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                            }
                        }
                        c2717Qz2 = this.d.v;
                        if (c2717Qz2.f3636a != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            if (c2717Qz2.b) {
                                str = "v2";
                            } else {
                                str = "YES";
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                        }
                        uriBuild = builderBuildUpon.build();
                    }
                    f(uriBuild);
                }
            }
            i = c2743Rz.j;
            i3 = i;
            z2 = false;
            c2743Rz3 = new C2743Rz(c2743Rz.d, c2743Rz.f3949a, c2743Rz.b, c2743Rz.e, c2743Rz.g, j2, true, i3, c2743Rz.k, c2743Rz.l, c2743Rz.m, c2743Rz.n, c2743Rz.c, c2743Rz.o, c2743Rz.p, c2743Rz.q, ac, c2743Rz.s, c2743Rz.v, c2743Rz.t);
            this.d = c2743Rz3;
            copyOnWriteArrayList = c3730in.e;
            uriBuild = this.f4470a;
            z3 = c2743Rz3.o;
            if (c2743Rz3 != c2743Rz9) {
                this.j = null;
                this.f = jElapsedRealtime;
                if (uriBuild.equals(c3730in.k)) {
                    if (c3730in.l == null) {
                        c3730in.m = !z3;
                        c3730in.n = c2743Rz3.h;
                    }
                    c3730in.l = c2743Rz3;
                    ((C2769Sz) c3730in.i).w(c2743Rz3);
                }
                it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC2973aA) it2.next()).c();
                }
            } else if (!z3) {
                size = c2743Rz.k + ((long) c2743Rz.r.size());
                c2743Rz4 = this.d;
                if (size < c2743Rz4.k) {
                    c3124bu = new C3124bu();
                    z2 = true;
                } else if (jElapsedRealtime - this.f > Ug0.W(c2743Rz4.m) * 3.5d) {
                    c3124bu = new C3124bu();
                } else {
                    c3124bu = null;
                }
                if (c3124bu != null) {
                    this.j = c3124bu;
                    br = new BR(fi, new C3779jO(4), c3124bu, 1);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC2973aA) it.next()).a(uriBuild, br, z2);
                    }
                }
            }
            c2743Rz5 = this.d;
            if (c2743Rz5.v.e) {
                j5 = c2743Rz5.m;
                if (c2743Rz5 == c2743Rz9) {
                    j5 /= 2;
                }
                j4 = j5;
            } else {
                j4 = 0;
            }
            this.g = Ug0.W(j4) + jElapsedRealtime;
            if (this.d.n == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            }
            c2743Rz6 = this.d;
            if (c2743Rz6.o) {
                c2717Qz = c2743Rz6.v;
                if (c2717Qz.f3636a == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    builderBuildUpon = uriBuild.buildUpon();
                    c2743Rz7 = this.d;
                    if (c2743Rz7.v.e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c2743Rz7.k + ((long) c2743Rz7.r.size())));
                        c2743Rz8 = this.d;
                        if (c2743Rz8.n != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            ac3 = c2743Rz8.s;
                            size2 = ac3.size();
                            if (!ac3.isEmpty()) {
                                size2--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                        }
                    }
                    c2717Qz2 = this.d.v;
                    if (c2717Qz2.f3636a != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        if (c2717Qz2.b) {
                            str = "v2";
                        } else {
                            str = "YES";
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                    }
                    uriBuild = builderBuildUpon.build();
                } else {
                    builderBuildUpon = uriBuild.buildUpon();
                    c2743Rz7 = this.d;
                    if (c2743Rz7.v.e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c2743Rz7.k + ((long) c2743Rz7.r.size())));
                        c2743Rz8 = this.d;
                        if (c2743Rz8.n != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            ac3 = c2743Rz8.s;
                            size2 = ac3.size();
                            if (!ac3.isEmpty()) {
                                size2--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                        }
                    }
                    c2717Qz2 = this.d.v;
                    if (c2717Qz2.f3636a != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        if (c2717Qz2.b) {
                            str = "v2";
                        } else {
                            str = "YES";
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                    }
                    uriBuild = builderBuildUpon.build();
                }
                f(uriBuild);
            }
        }
        j = c2743Rz.h;
        j2 = j;
        z = c2743Rz.i;
        ac = c2743Rz.r;
        if (z) {
            c2743Rz2 = c3730in.l;
            if (c2743Rz2 != null) {
                i = c2743Rz2.j;
            } else {
                i = 0;
            }
            if (c2743Rz9 == null) {
                i2 = (int) (j8 - c2743Rz9.k);
                ac2 = c2743Rz9.r;
                if (i2 < ac2.size()) {
                    c2665Oz = (C2665Oz) ac2.get(i2);
                } else {
                    c2665Oz = null;
                }
                if (c2665Oz != null) {
                    int i6 = c2743Rz9.j + c2665Oz.d;
                    z2 = false;
                    i = i6 - ((C2665Oz) ac.get(0)).d;
                } else {
                    z2 = false;
                }
                i3 = i;
            }
            c2743Rz3 = new C2743Rz(c2743Rz.d, c2743Rz.f3949a, c2743Rz.b, c2743Rz.e, c2743Rz.g, j2, true, i3, c2743Rz.k, c2743Rz.l, c2743Rz.m, c2743Rz.n, c2743Rz.c, c2743Rz.o, c2743Rz.p, c2743Rz.q, ac, c2743Rz.s, c2743Rz.v, c2743Rz.t);
            this.d = c2743Rz3;
            copyOnWriteArrayList = c3730in.e;
            uriBuild = this.f4470a;
            z3 = c2743Rz3.o;
            if (c2743Rz3 != c2743Rz9) {
                this.j = null;
                this.f = jElapsedRealtime;
                if (uriBuild.equals(c3730in.k)) {
                    if (c3730in.l == null) {
                        c3730in.m = !z3;
                        c3730in.n = c2743Rz3.h;
                    }
                    c3730in.l = c2743Rz3;
                    ((C2769Sz) c3730in.i).w(c2743Rz3);
                }
                it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC2973aA) it2.next()).c();
                }
            } else if (!z3) {
                size = c2743Rz.k + ((long) c2743Rz.r.size());
                c2743Rz4 = this.d;
                if (size < c2743Rz4.k) {
                    c3124bu = new C3124bu();
                    z2 = true;
                } else if (jElapsedRealtime - this.f > Ug0.W(c2743Rz4.m) * 3.5d) {
                    c3124bu = new C3124bu();
                } else {
                    c3124bu = null;
                }
                if (c3124bu != null) {
                    this.j = c3124bu;
                    br = new BR(fi, new C3779jO(4), c3124bu, 1);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC2973aA) it.next()).a(uriBuild, br, z2);
                    }
                }
            }
            c2743Rz5 = this.d;
            if (c2743Rz5.v.e) {
                j5 = c2743Rz5.m;
                if (c2743Rz5 == c2743Rz9) {
                    j5 /= 2;
                }
                j4 = j5;
            } else {
                j4 = 0;
            }
            this.g = Ug0.W(j4) + jElapsedRealtime;
            if (this.d.n == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            }
            c2743Rz6 = this.d;
            if (c2743Rz6.o) {
                c2717Qz = c2743Rz6.v;
                if (c2717Qz.f3636a == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    builderBuildUpon = uriBuild.buildUpon();
                    c2743Rz7 = this.d;
                    if (c2743Rz7.v.e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c2743Rz7.k + ((long) c2743Rz7.r.size())));
                        c2743Rz8 = this.d;
                        if (c2743Rz8.n != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            ac3 = c2743Rz8.s;
                            size2 = ac3.size();
                            if (!ac3.isEmpty()) {
                                size2--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                        }
                    }
                    c2717Qz2 = this.d.v;
                    if (c2717Qz2.f3636a != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        if (c2717Qz2.b) {
                            str = "v2";
                        } else {
                            str = "YES";
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                    }
                    uriBuild = builderBuildUpon.build();
                } else {
                    builderBuildUpon = uriBuild.buildUpon();
                    c2743Rz7 = this.d;
                    if (c2743Rz7.v.e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c2743Rz7.k + ((long) c2743Rz7.r.size())));
                        c2743Rz8 = this.d;
                        if (c2743Rz8.n != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            ac3 = c2743Rz8.s;
                            size2 = ac3.size();
                            if (!ac3.isEmpty()) {
                                size2--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                        }
                    }
                    c2717Qz2 = this.d.v;
                    if (c2717Qz2.f3636a != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        if (c2717Qz2.b) {
                            str = "v2";
                        } else {
                            str = "YES";
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                    }
                    uriBuild = builderBuildUpon.build();
                }
                f(uriBuild);
            }
        }
        i = c2743Rz.j;
        i3 = i;
        z2 = false;
        c2743Rz3 = new C2743Rz(c2743Rz.d, c2743Rz.f3949a, c2743Rz.b, c2743Rz.e, c2743Rz.g, j2, true, i3, c2743Rz.k, c2743Rz.l, c2743Rz.m, c2743Rz.n, c2743Rz.c, c2743Rz.o, c2743Rz.p, c2743Rz.q, ac, c2743Rz.s, c2743Rz.v, c2743Rz.t);
        this.d = c2743Rz3;
        copyOnWriteArrayList = c3730in.e;
        uriBuild = this.f4470a;
        z3 = c2743Rz3.o;
        if (c2743Rz3 != c2743Rz9) {
            this.j = null;
            this.f = jElapsedRealtime;
            if (uriBuild.equals(c3730in.k)) {
                if (c3730in.l == null) {
                    c3730in.m = !z3;
                    c3730in.n = c2743Rz3.h;
                }
                c3730in.l = c2743Rz3;
                ((C2769Sz) c3730in.i).w(c2743Rz3);
            }
            it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC2973aA) it2.next()).c();
            }
        } else if (!z3) {
            size = c2743Rz.k + ((long) c2743Rz.r.size());
            c2743Rz4 = this.d;
            if (size < c2743Rz4.k) {
                c3124bu = new C3124bu();
                z2 = true;
            } else if (jElapsedRealtime - this.f > Ug0.W(c2743Rz4.m) * 3.5d) {
                c3124bu = new C3124bu();
            } else {
                c3124bu = null;
            }
            if (c3124bu != null) {
                this.j = c3124bu;
                br = new BR(fi, new C3779jO(4), c3124bu, 1);
                it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2973aA) it.next()).a(uriBuild, br, z2);
                }
            }
        }
        c2743Rz5 = this.d;
        if (c2743Rz5.v.e) {
            j5 = c2743Rz5.m;
            if (c2743Rz5 == c2743Rz9) {
                j5 /= 2;
            }
            j4 = j5;
        } else {
            j4 = 0;
        }
        this.g = Ug0.W(j4) + jElapsedRealtime;
        if (this.d.n == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
        }
        c2743Rz6 = this.d;
        if (c2743Rz6.o) {
            c2717Qz = c2743Rz6.v;
            if (c2717Qz.f3636a == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                builderBuildUpon = uriBuild.buildUpon();
                c2743Rz7 = this.d;
                if (c2743Rz7.v.e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c2743Rz7.k + ((long) c2743Rz7.r.size())));
                    c2743Rz8 = this.d;
                    if (c2743Rz8.n != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        ac3 = c2743Rz8.s;
                        size2 = ac3.size();
                        if (!ac3.isEmpty()) {
                            size2--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                    }
                }
                c2717Qz2 = this.d.v;
                if (c2717Qz2.f3636a != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    if (c2717Qz2.b) {
                        str = "v2";
                    } else {
                        str = "YES";
                    }
                    builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                }
                uriBuild = builderBuildUpon.build();
            } else {
                builderBuildUpon = uriBuild.buildUpon();
                c2743Rz7 = this.d;
                if (c2743Rz7.v.e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c2743Rz7.k + ((long) c2743Rz7.r.size())));
                    c2743Rz8 = this.d;
                    if (c2743Rz8.n != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        ac3 = c2743Rz8.s;
                        size2 = ac3.size();
                        if (!ac3.isEmpty()) {
                            size2--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                    }
                }
                c2717Qz2 = this.d.v;
                if (c2717Qz2.f3636a != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    if (c2717Qz2.b) {
                        str = "v2";
                    } else {
                        str = "YES";
                    }
                    builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                }
                uriBuild = builderBuildUpon.build();
            }
            f(uriBuild);
        }
    }
}
