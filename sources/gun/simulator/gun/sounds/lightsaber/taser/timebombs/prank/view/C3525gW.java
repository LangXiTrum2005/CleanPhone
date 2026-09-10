package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Handler;
import androidx.work.WorkRequest;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3525gW implements InterfaceC4395qO, InterfaceC4353pt, JI, MI, U20 {
    public static final Map M;
    public static final C4619sw N;
    public boolean A;
    public boolean C;
    public boolean D;
    public int E;
    public boolean F;
    public long G;
    public boolean I;
    public int J;
    public boolean K;
    public boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f4418a;
    public final InterfaceC4429ql b;
    public final InterfaceC3296dq c;
    public final G7 d;
    public final DO e;
    public final C3031aq f;
    public final C3787jW g;
    public final C2833Vl h;
    public final String i;
    public final long j;
    public final C4568sM l;
    public InterfaceC4307pO q;
    public IcyHeaders r;
    public boolean u;
    public boolean v;
    public boolean w;
    public C3437fW x;
    public O30 y;
    public final OI k = new OI("ProgressiveMediaPeriod");
    public final C4581sZ m = new C4581sZ(2);
    public final RunnableC3084bW n = new RunnableC3084bW(this, 0);
    public final RunnableC3084bW o = new RunnableC3084bW(this, 1);
    public final Handler p = Ug0.m(null);
    public C3349eW[] t = new C3349eW[0];
    public V20[] s = new V20[0];
    public long H = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public long z = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public int B = 1;

    static {
        HashMap map = new HashMap();
        map.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        M = Collections.unmodifiableMap(map);
        C4531rw c4531rw = new C4531rw();
        c4531rw.f4954a = "icy";
        c4531rw.k = "application/x-icy";
        N = c4531rw.a();
    }

    public C3525gW(Uri uri, InterfaceC4429ql interfaceC4429ql, C4568sM c4568sM, InterfaceC3296dq interfaceC3296dq, C3031aq c3031aq, G7 g7, DO r7, C3787jW c3787jW, C2833Vl c2833Vl, String str, int i) {
        this.f4418a = uri;
        this.b = interfaceC4429ql;
        this.c = interfaceC3296dq;
        this.f = c3031aq;
        this.d = g7;
        this.e = r7;
        this.g = c3787jW;
        this.h = c2833Vl;
        this.i = str;
        this.j = i;
        this.l = c4568sM;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4353pt
    public final void a(O30 o30) {
        this.p.post(new RunnableC3976le0(14, this, o30));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long b(long j, P30 p30) {
        g();
        if (!this.y.isSeekable()) {
            return 0L;
        }
        N30 seekPoints = this.y.getSeekPoints(j);
        return p30.a(j, seekPoints.f3437a.f3588a, seekPoints.b.f3588a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final void c(LI li, long j, long j2) {
        O30 o30;
        C3172cW c3172cW = (C3172cW) li;
        if (this.z == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && (o30 = this.y) != null) {
            boolean zIsSeekable = o30.isSeekable();
            long jI = i(true);
            long j3 = jI == Long.MIN_VALUE ? 0L : jI + WorkRequest.MIN_BACKOFF_MILLIS;
            this.z = j3;
            this.g.w(j3, zIsSeekable, this.A);
        }
        Uri uri = c3172cW.b.c;
        FI fi = new FI();
        this.d.getClass();
        this.e.g(fi, 1, -1, null, 0, null, c3172cW.i, this.z);
        this.K = true;
        InterfaceC4307pO interfaceC4307pO = this.q;
        interfaceC4307pO.getClass();
        interfaceC4307pO.o(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean continueLoading(long j) {
        if (this.K) {
            return false;
        }
        OI oi = this.k;
        if (oi.c() || this.I) {
            return false;
        }
        if (this.v && this.E == 0) {
            return false;
        }
        boolean zD = this.m.d();
        if (oi.d()) {
            return zD;
        }
        p();
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final void d(LI li, long j, long j2, boolean z) {
        C3172cW c3172cW = (C3172cW) li;
        Uri uri = c3172cW.b.c;
        FI fi = new FI();
        this.d.getClass();
        this.e.d(fi, 1, -1, null, 0, null, c3172cW.i, this.z);
        if (z) {
            return;
        }
        for (V20 v20 : this.s) {
            v20.C(false);
        }
        if (this.E > 0) {
            InterfaceC4307pO interfaceC4307pO = this.q;
            interfaceC4307pO.getClass();
            interfaceC4307pO.o(this);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final C2868Wu e(LI li, long j, long j2, IOException iOException, int i) {
        long jMin;
        C2868Wu c2868WuB;
        O30 o30;
        C3172cW c3172cW = (C3172cW) li;
        Uri uri = c3172cW.b.c;
        FI fi = new FI();
        int i2 = Ug0.f3833a;
        this.d.getClass();
        if ((iOException instanceof KT) || (iOException instanceof FileNotFoundException) || (iOException instanceof OA) || (iOException instanceof NI)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i3 = C4604sl.b;
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof C4604sl) && ((C4604sl) cause).f4995a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            c2868WuB = OI.f;
        } else {
            int iH = h();
            boolean z = iH > this.J;
            if (this.F || !((o30 = this.y) == null || o30.getDurationUs() == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET)) {
                this.J = iH;
            } else if (!this.v || s()) {
                this.D = this.v;
                this.G = 0L;
                this.J = 0;
                for (V20 v20 : this.s) {
                    v20.C(false);
                }
                c3172cW.f.b = 0L;
                c3172cW.i = 0L;
                c3172cW.h = true;
                c3172cW.l = false;
            } else {
                this.I = true;
                c2868WuB = OI.e;
            }
            c2868WuB = OI.b(jMin, z);
        }
        C2868Wu c2868Wu = c2868WuB;
        this.e.i(fi, 1, -1, null, 0, null, c3172cW.i, this.z, iOException, !c2868Wu.c());
        return c2868Wu;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4353pt
    public final void endTracks() {
        this.u = true;
        this.p.post(this.n);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U20
    public final void f() {
        this.p.post(this.n);
    }

    public final void g() {
        FW.s(this.v);
        this.x.getClass();
        this.y.getClass();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getBufferedPositionUs() {
        long jI;
        boolean z;
        g();
        if (this.K || this.E == 0) {
            return Long.MIN_VALUE;
        }
        if (j()) {
            return this.H;
        }
        if (this.w) {
            int length = this.s.length;
            jI = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                C3437fW c3437fW = this.x;
                if (c3437fW.b[i] && c3437fW.c[i]) {
                    V20 v20 = this.s[i];
                    synchronized (v20) {
                        z = v20.w;
                    }
                    if (!z) {
                        jI = Math.min(jI, this.s[i].n());
                    }
                }
            }
        } else {
            jI = Long.MAX_VALUE;
        }
        if (jI == Long.MAX_VALUE) {
            jI = i(false);
        }
        return jI == Long.MIN_VALUE ? this.G : jI;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final C4062md0 getTrackGroups() {
        g();
        return this.x.f4368a;
    }

    public final int h() {
        int i = 0;
        for (V20 v20 : this.s) {
            i += v20.q + v20.p;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    public final long i(boolean z) {
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.s.length; i++) {
            if (z) {
                jMax = Math.max(jMax, this.s[i].n());
            } else {
                C3437fW c3437fW = this.x;
                c3437fW.getClass();
                if (c3437fW.c[i]) {
                    jMax = Math.max(jMax, this.s[i].n());
                }
            }
        }
        return jMax;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean isLoading() {
        boolean z;
        if (this.k.d()) {
            C4581sZ c4581sZ = this.m;
            synchronized (c4581sZ) {
                z = c4581sZ.f4984a;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        return this.H != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long k(InterfaceC3299dt[] interfaceC3299dtArr, boolean[] zArr, W20[] w20Arr, boolean[] zArr2, long j) {
        boolean[] zArr3;
        InterfaceC3299dt interfaceC3299dt;
        g();
        C3437fW c3437fW = this.x;
        C4062md0 c4062md0 = c3437fW.f4368a;
        int i = this.E;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = interfaceC3299dtArr.length;
            zArr3 = c3437fW.c;
            if (i3 >= length) {
                break;
            }
            W20 w20 = w20Arr[i3];
            if (w20 != null && (interfaceC3299dtArr[i3] == null || !zArr[i3])) {
                int i4 = ((C3261dW) w20).f4272a;
                FW.s(zArr3[i4]);
                this.E--;
                zArr3[i4] = false;
                w20Arr[i3] = null;
            }
            i3++;
        }
        boolean z = !this.C ? j == 0 : i != 0;
        for (int i5 = 0; i5 < interfaceC3299dtArr.length; i5++) {
            if (w20Arr[i5] == null && (interfaceC3299dt = interfaceC3299dtArr[i5]) != null) {
                FW.s(interfaceC3299dt.length() == 1);
                FW.s(interfaceC3299dt.getIndexInTrackGroup(0) == 0);
                int iB = c4062md0.b(interfaceC3299dt.getTrackGroup());
                FW.s(!zArr3[iB]);
                this.E++;
                zArr3[iB] = true;
                w20Arr[i5] = new C3261dW(this, iB);
                zArr2[i5] = true;
                if (!z) {
                    V20 v20 = this.s[iB];
                    z = (v20.F(j, true) || v20.q() == 0) ? false : true;
                }
            }
        }
        if (this.E == 0) {
            this.I = false;
            this.D = false;
            OI oi = this.k;
            if (oi.d()) {
                V20[] v20Arr = this.s;
                int length2 = v20Arr.length;
                while (i2 < length2) {
                    v20Arr[i2].i();
                    i2++;
                }
                oi.a();
            } else {
                for (V20 v21 : this.s) {
                    v21.C(false);
                }
            }
        } else if (z) {
            j = seekToUs(j);
            while (i2 < w20Arr.length) {
                if (w20Arr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.C = true;
        return j;
    }

    public final void l() {
        if (this.L || this.v || !this.u || this.y == null) {
            return;
        }
        for (V20 v20 : this.s) {
            if (v20.t() == null) {
                return;
            }
        }
        this.m.c();
        int length = this.s.length;
        C3974ld0[] c3974ld0Arr = new C3974ld0[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            C4619sw c4619swT = this.s[i].t();
            c4619swT.getClass();
            String str = c4619swT.l;
            boolean zK = AbstractC5011xP.k(str);
            boolean z = zK || AbstractC5011xP.m(str);
            zArr[i] = z;
            this.w = z | this.w;
            IcyHeaders icyHeaders = this.r;
            if (icyHeaders != null) {
                if (zK || this.t[i].b) {
                    Metadata metadata = c4619swT.j;
                    Metadata metadata2 = metadata == null ? new Metadata(icyHeaders) : metadata.b(icyHeaders);
                    C4531rw c4531rwA = c4619swT.a();
                    c4531rwA.i = metadata2;
                    c4619swT = new C4619sw(c4531rwA);
                }
                if (zK && c4619swT.f == -1 && c4619swT.g == -1 && icyHeaders.bitrate != -1) {
                    C4531rw c4531rwA2 = c4619swT.a();
                    c4531rwA2.f = icyHeaders.bitrate;
                    c4619swT = new C4619sw(c4531rwA2);
                }
            }
            int iG = this.c.g(c4619swT);
            C4531rw c4531rwA3 = c4619swT.a();
            c4531rwA3.F = iG;
            c3974ld0Arr[i] = new C3974ld0(Integer.toString(i), c4531rwA3.a());
        }
        this.x = new C3437fW(new C4062md0(c3974ld0Arr), zArr);
        this.v = true;
        InterfaceC4307pO interfaceC4307pO = this.q;
        interfaceC4307pO.getClass();
        interfaceC4307pO.p(this);
    }

    public final void m(int i) {
        g();
        C3437fW c3437fW = this.x;
        boolean[] zArr = c3437fW.d;
        if (zArr[i]) {
            return;
        }
        C4619sw c4619sw = c3437fW.f4368a.a(i).d[0];
        this.e.b(AbstractC5011xP.i(c4619sw.l), c4619sw, 0, null, this.G);
        zArr[i] = true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void maybeThrowPrepareError() throws IOException {
        int iA = this.d.A(this.B);
        OI oi = this.k;
        IOException iOException = oi.c;
        if (iOException != null) {
            throw iOException;
        }
        KI ki = oi.b;
        if (ki != null) {
            if (iA == Integer.MIN_VALUE) {
                iA = ki.f3309a;
            }
            IOException iOException2 = ki.e;
            if (iOException2 != null && ki.f > iA) {
                throw iOException2;
            }
        }
        if (this.K && !this.v) {
            throw KT.a("Loading finished before preparation is complete.", null);
        }
    }

    public final void n(int i) {
        g();
        boolean[] zArr = this.x.b;
        if (this.I && zArr[i] && !this.s[i].v(false)) {
            this.H = 0L;
            this.I = false;
            this.D = true;
            this.G = 0L;
            this.J = 0;
            for (V20 v20 : this.s) {
                v20.C(false);
            }
            InterfaceC4307pO interfaceC4307pO = this.q;
            interfaceC4307pO.getClass();
            interfaceC4307pO.o(this);
        }
    }

    public final V20 o(C3349eW c3349eW) {
        int length = this.s.length;
        for (int i = 0; i < length; i++) {
            if (c3349eW.equals(this.t[i])) {
                return this.s[i];
            }
        }
        InterfaceC3296dq interfaceC3296dq = this.c;
        interfaceC3296dq.getClass();
        C3031aq c3031aq = this.f;
        c3031aq.getClass();
        V20 v20 = new V20(this.h, interfaceC3296dq, c3031aq);
        v20.f = this;
        int i2 = length + 1;
        C3349eW[] c3349eWArr = (C3349eW[]) Arrays.copyOf(this.t, i2);
        c3349eWArr[length] = c3349eW;
        this.t = c3349eWArr;
        V20[] v20Arr = (V20[]) Arrays.copyOf(this.s, i2);
        v20Arr[length] = v20;
        this.s = v20Arr;
        return v20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MI
    public final void onLoaderReleased() {
        for (V20 v20 : this.s) {
            v20.B();
        }
        C4568sM c4568sM = this.l;
        InterfaceC4177nt interfaceC4177nt = (InterfaceC4177nt) c4568sM.c;
        if (interfaceC4177nt != null) {
            interfaceC4177nt.release();
            c4568sM.c = null;
        }
        c4568sM.d = null;
    }

    public final void p() {
        C3172cW c3172cW = new C3172cW(this, this.f4418a, this.b, this.l, this, this.m);
        if (this.v) {
            FW.s(j());
            long j = this.z;
            if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && this.H > j) {
                this.K = true;
                this.H = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                return;
            }
            O30 o30 = this.y;
            o30.getClass();
            long j2 = o30.getSeekPoints(this.H).f3437a.b;
            long j3 = this.H;
            c3172cW.f.b = j2;
            c3172cW.i = j3;
            c3172cW.h = true;
            c3172cW.l = false;
            for (V20 v20 : this.s) {
                v20.t = this.H;
            }
            this.H = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        this.J = h();
        this.k.f(c3172cW, this, this.d.A(this.B));
        this.e.l(new FI(c3172cW.j), 1, -1, null, 0, null, c3172cW.i, this.z);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void q(long j) {
        g();
        if (j()) {
            return;
        }
        boolean[] zArr = this.x.c;
        int length = this.s.length;
        for (int i = 0; i < length; i++) {
            this.s[i].h(j, zArr[i]);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void r(InterfaceC4307pO interfaceC4307pO, long j) {
        this.q = interfaceC4307pO;
        this.m.d();
        p();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long readDiscontinuity() {
        if (!this.D) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        if (!this.K && h() <= this.J) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        this.D = false;
        return this.G;
    }

    public final boolean s() {
        return this.D || j();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long seekToUs(long j) {
        g();
        boolean[] zArr = this.x.b;
        if (!this.y.isSeekable()) {
            j = 0;
        }
        this.D = false;
        this.G = j;
        if (j()) {
            this.H = j;
            return j;
        }
        if (this.B != 7) {
            int length = this.s.length;
            for (int i = 0; i < length; i++) {
                if (this.s[i].F(j, false) || (!zArr[i] && this.w)) {
                }
            }
            return j;
        }
        this.I = false;
        this.H = j;
        this.K = false;
        OI oi = this.k;
        if (oi.d()) {
            for (V20 v20 : this.s) {
                v20.i();
            }
            oi.a();
        } else {
            oi.c = null;
            for (V20 v21 : this.s) {
                v21.C(false);
            }
        }
        return j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4353pt
    public final InterfaceC4326pd0 track(int i, int i2) {
        return o(new C3349eW(i, false));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final void reevaluateBuffer(long j) {
    }
}
