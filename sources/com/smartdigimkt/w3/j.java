package com.smartdigimkt.w3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.p004ironsource.d9;
import com.smartdigimkt.p4.f0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
final class j implements h {
    private static final String S = "ExoPlayerImpl";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final k f39290A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Handler f39291B;
    private final CopyOnWriteArraySet<w.c> C;
    private final e0.c D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final e0.b f39292E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final ArrayDeque<b> f39293F;
    private boolean G;
    private int H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f39294I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f39295J;
    private boolean K;
    private boolean L;
    private v M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private g f39296N;
    private u O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f39297P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f39298Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private long f39299R;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final y[] f39300w;
    private final com.smartdigimkt.m4.h x;
    private final com.smartdigimkt.m4.i y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Handler f39301z;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            j.this.a(message);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u f39303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<w.c> f39304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.smartdigimkt.m4.h f39305c;
        private final boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f39306e;
        private final int f;
        private final boolean g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f39307h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f39308i;
        private final boolean j;
        private final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final boolean f39309l;

        public b(u uVar, u uVar2, Set<w.c> set, com.smartdigimkt.m4.h hVar, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5) {
            this.f39303a = uVar;
            this.f39304b = set;
            this.f39305c = hVar;
            this.d = z2;
            this.f39306e = i2;
            this.f = i3;
            this.g = z3;
            this.f39307h = z4;
            this.f39308i = z5 || uVar2.f != uVar.f;
            this.j = (uVar2.f39367a == uVar.f39367a && uVar2.f39368b == uVar.f39368b) ? false : true;
            this.k = uVar2.g != uVar.g;
            this.f39309l = uVar2.f39372i != uVar.f39372i;
        }

        public void a() {
            if (this.j || this.f == 0) {
                for (w.c cVar : this.f39304b) {
                    u uVar = this.f39303a;
                    cVar.onTimelineChanged(uVar.f39367a, uVar.f39368b, this.f);
                }
            }
            if (this.d) {
                Iterator<w.c> it = this.f39304b.iterator();
                while (it.hasNext()) {
                    it.next().onPositionDiscontinuity(this.f39306e);
                }
            }
            if (this.f39309l) {
                this.f39305c.a(this.f39303a.f39372i.d);
                for (w.c cVar2 : this.f39304b) {
                    u uVar2 = this.f39303a;
                    cVar2.onTracksChanged(uVar2.f39371h, uVar2.f39372i.f36692c);
                }
            }
            if (this.k) {
                Iterator<w.c> it2 = this.f39304b.iterator();
                while (it2.hasNext()) {
                    it2.next().onLoadingChanged(this.f39303a.g);
                }
            }
            if (this.f39308i) {
                Iterator<w.c> it3 = this.f39304b.iterator();
                while (it3.hasNext()) {
                    it3.next().onPlayerStateChanged(this.f39307h, this.f39303a.f);
                }
            }
            if (this.g) {
                Iterator<w.c> it4 = this.f39304b.iterator();
                while (it4.hasNext()) {
                    it4.next().onSeekProcessed();
                }
            }
        }
    }

    public j(y[] yVarArr, com.smartdigimkt.m4.h hVar, p pVar, com.smartdigimkt.p4.c cVar) {
        Log.i(S, "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.8.4] [" + f0.f37543e + d9.i.f24752e);
        com.smartdigimkt.p4.a.b(yVarArr.length > 0);
        this.f39300w = (y[]) com.smartdigimkt.p4.a.a(yVarArr);
        this.x = (com.smartdigimkt.m4.h) com.smartdigimkt.p4.a.a(hVar);
        this.G = false;
        this.H = 0;
        this.f39294I = false;
        this.C = new CopyOnWriteArraySet<>();
        com.smartdigimkt.m4.i iVar = new com.smartdigimkt.m4.i(new a0[yVarArr.length], new com.smartdigimkt.m4.f[yVarArr.length], null);
        this.y = iVar;
        this.D = new e0.c();
        this.f39292E = new e0.b();
        this.M = v.f39373e;
        a aVar = new a(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f39301z = aVar;
        this.O = new u(e0.f39262a, 0L, com.smartdigimkt.j4.f0.d, iVar);
        this.f39293F = new ArrayDeque<>();
        k kVar = new k(yVarArr, hVar, iVar, pVar, this.G, this.H, this.f39294I, aVar, this, cVar);
        this.f39290A = kVar;
        this.f39291B = new Handler(kVar.d());
    }

    private boolean A() {
        return this.O.f39367a.c() || this.f39295J > 0;
    }

    @Override // com.smartdigimkt.w3.w
    public boolean B() {
        return this.f39294I;
    }

    @Override // com.smartdigimkt.w3.w
    public int D() {
        if (A()) {
            return this.f39297P;
        }
        u uVar = this.O;
        return uVar.f39367a.a(uVar.f39369c.f36015a, this.f39292E).f39265c;
    }

    @Override // com.smartdigimkt.w3.w
    public com.smartdigimkt.m4.g E() {
        return this.O.f39372i.f36692c;
    }

    @Override // com.smartdigimkt.w3.w
    public long F() {
        return A() ? this.f39299R : b(this.O.j);
    }

    @Override // com.smartdigimkt.w3.w
    public w.e G() {
        return null;
    }

    @Override // com.smartdigimkt.w3.w
    public w.g a() {
        return null;
    }

    @Override // com.smartdigimkt.w3.w
    public void b(w.c cVar) {
        this.C.remove(cVar);
    }

    @Override // com.smartdigimkt.w3.w
    public void c(int i2) {
        if (this.H != i2) {
            this.H = i2;
            this.f39290A.a(i2);
            Iterator<w.c> it = this.C.iterator();
            while (it.hasNext()) {
                it.next().onRepeatModeChanged(i2);
            }
        }
    }

    @Override // com.smartdigimkt.w3.w
    public boolean d() {
        return this.O.g;
    }

    @Override // com.smartdigimkt.w3.w
    public long e() {
        if (!c()) {
            return F();
        }
        u uVar = this.O;
        uVar.f39367a.a(uVar.f39369c.f36015a, this.f39292E);
        return com.smartdigimkt.w3.b.b(this.O.f39370e) + this.f39292E.e();
    }

    @Override // com.smartdigimkt.w3.w
    public int f() {
        e0 e0Var = this.O.f39367a;
        if (e0Var.c()) {
            return -1;
        }
        return e0Var.b(D(), this.H, this.f39294I);
    }

    @Override // com.smartdigimkt.w3.w
    public Object g() {
        return this.O.f39368b;
    }

    @Override // com.smartdigimkt.w3.w
    public long h() {
        return A() ? this.f39299R : b(this.O.k);
    }

    @Override // com.smartdigimkt.w3.w
    public boolean i() {
        return this.G;
    }

    @Override // com.smartdigimkt.w3.w
    public int j() {
        return this.O.f;
    }

    @Override // com.smartdigimkt.w3.w
    public int k() {
        long jH = h();
        long jX = x();
        if (jH == -9223372036854775807L || jX == -9223372036854775807L) {
            return 0;
        }
        if (jX == 0) {
            return 100;
        }
        return f0.a((int) ((jH * 100) / jX), 0, 100);
    }

    @Override // com.smartdigimkt.w3.w
    public int l() {
        return this.f39300w.length;
    }

    @Override // com.smartdigimkt.w3.w
    public g m() {
        return this.f39296N;
    }

    @Override // com.smartdigimkt.w3.h
    public Looper n() {
        return this.f39290A.d();
    }

    @Override // com.smartdigimkt.w3.w
    public int o() {
        return A() ? this.f39298Q : this.O.f39369c.f36015a;
    }

    @Override // com.smartdigimkt.w3.w
    public boolean p() {
        e0 e0Var = this.O.f39367a;
        return !e0Var.c() && e0Var.a(D(), this.D).d;
    }

    @Override // com.smartdigimkt.w3.w
    public void q() {
        a(D());
    }

    @Override // com.smartdigimkt.w3.w
    public int r() {
        if (c()) {
            return this.O.f39369c.f36016b;
        }
        return -1;
    }

    @Override // com.smartdigimkt.w3.w
    public void release() {
        Log.i(S, "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.8.4] [" + f0.f37543e + "] [" + l.a() + d9.i.f24752e);
        this.f39290A.k();
        this.f39301z.removeCallbacksAndMessages(null);
    }

    @Override // com.smartdigimkt.w3.w
    public int s() {
        e0 e0Var = this.O.f39367a;
        if (e0Var.c()) {
            return -1;
        }
        return e0Var.a(D(), this.H, this.f39294I);
    }

    @Override // com.smartdigimkt.w3.w
    public void stop() {
        c(false);
    }

    @Override // com.smartdigimkt.w3.w
    public int t() {
        if (c()) {
            return this.O.f39369c.f36017c;
        }
        return -1;
    }

    @Override // com.smartdigimkt.w3.w
    public boolean u() {
        e0 e0Var = this.O.f39367a;
        return !e0Var.c() && e0Var.a(D(), this.D).f39270e;
    }

    @Override // com.smartdigimkt.w3.w
    public com.smartdigimkt.j4.f0 v() {
        return this.O.f39371h;
    }

    @Override // com.smartdigimkt.w3.w
    public int w() {
        return this.H;
    }

    @Override // com.smartdigimkt.w3.w
    public long x() {
        e0 e0Var = this.O.f39367a;
        if (e0Var.c()) {
            return -9223372036854775807L;
        }
        if (!c()) {
            return e0Var.a(D(), this.D).c();
        }
        com.smartdigimkt.j4.s.a aVar = this.O.f39369c;
        e0Var.a(aVar.f36015a, this.f39292E);
        return com.smartdigimkt.w3.b.b(this.f39292E.a(aVar.f36016b, aVar.f36017c));
    }

    @Override // com.smartdigimkt.w3.w
    public Object y() {
        int iD = D();
        if (iD > this.O.f39367a.b()) {
            return null;
        }
        return this.O.f39367a.a(iD, this.D, true).f39267a;
    }

    @Override // com.smartdigimkt.w3.w
    public e0 z() {
        return this.O.f39367a;
    }

    @Override // com.smartdigimkt.w3.w
    public void a(w.c cVar) {
        this.C.add(cVar);
    }

    @Override // com.smartdigimkt.w3.w
    public void b(boolean z2) {
        if (this.f39294I != z2) {
            this.f39294I = z2;
            this.f39290A.e(z2);
            Iterator<w.c> it = this.C.iterator();
            while (it.hasNext()) {
                it.next().onShuffleModeEnabledChanged(z2);
            }
        }
    }

    @Override // com.smartdigimkt.w3.w
    public int d(int i2) {
        return this.f39300w[i2].e();
    }

    @Override // com.smartdigimkt.w3.h
    public void a(com.smartdigimkt.j4.s sVar) {
        a(sVar, true, true);
    }

    @Override // com.smartdigimkt.w3.h
    public void a(com.smartdigimkt.j4.s sVar, boolean z2, boolean z3) {
        this.f39296N = null;
        u uVarA = a(z2, z3, 2);
        this.K = true;
        this.f39295J++;
        this.f39290A.a(sVar, z2, z3);
        a(uVarA, false, 4, 1, false, false);
    }

    @Override // com.smartdigimkt.w3.w
    public void c(boolean z2) {
        if (z2) {
            this.f39296N = null;
        }
        u uVarA = a(z2, z2, 1);
        this.f39295J++;
        this.f39290A.h(z2);
        a(uVarA, false, 4, 1, false, false);
    }

    @Override // com.smartdigimkt.w3.w
    public v b() {
        return this.M;
    }

    @Override // com.smartdigimkt.w3.h
    public void b(h.c... cVarArr) {
        for (h.c cVar : cVarArr) {
            a(cVar.f39287a).a(cVar.f39288b).a(cVar.f39289c).l();
        }
    }

    private long b(long j) {
        long jB = com.smartdigimkt.w3.b.b(j);
        if (this.O.f39369c.a()) {
            return jB;
        }
        u uVar = this.O;
        uVar.f39367a.a(uVar.f39369c.f36015a, this.f39292E);
        return this.f39292E.e() + jB;
    }

    @Override // com.smartdigimkt.w3.w
    public void a(boolean z2) {
        if (this.G != z2) {
            this.G = z2;
            this.f39290A.c(z2);
            a(this.O, false, 4, 1, false, true);
        }
    }

    @Override // com.smartdigimkt.w3.w
    public boolean c() {
        return !A() && this.O.f39369c.a();
    }

    @Override // com.smartdigimkt.w3.w
    public void a(int i2) {
        a(i2, -9223372036854775807L);
    }

    @Override // com.smartdigimkt.w3.w
    public void a(long j) {
        a(D(), j);
    }

    @Override // com.smartdigimkt.w3.w
    public void a(int i2, long j) {
        int i3;
        e0 e0Var = this.O.f39367a;
        if (i2 >= 0 && (e0Var.c() || i2 < e0Var.b())) {
            this.L = true;
            this.f39295J++;
            if (c()) {
                Log.w(S, "seekTo ignored because an ad is playing");
                this.f39301z.obtainMessage(0, 1, -1, this.O).sendToTarget();
                return;
            }
            this.f39297P = i2;
            if (e0Var.c()) {
                this.f39299R = j == -9223372036854775807L ? 0L : j;
                this.f39298Q = 0;
                i3 = i2;
            } else {
                long jB = j == -9223372036854775807L ? e0Var.a(i2, this.D).b() : com.smartdigimkt.w3.b.a(j);
                i3 = i2;
                Pair<Integer, Long> pairA = e0Var.a(this.D, this.f39292E, i3, jB);
                this.f39299R = com.smartdigimkt.w3.b.b(jB);
                this.f39298Q = ((Integer) pairA.first).intValue();
            }
            this.f39290A.b(e0Var, i3, com.smartdigimkt.w3.b.a(j));
            Iterator<w.c> it = this.C.iterator();
            while (it.hasNext()) {
                it.next().onPositionDiscontinuity(1);
            }
            return;
        }
        throw new o(e0Var, i2, j);
    }

    @Override // com.smartdigimkt.w3.w
    public void a(v vVar) {
        if (vVar == null) {
            vVar = v.f39373e;
        }
        this.f39290A.a(vVar);
    }

    @Override // com.smartdigimkt.w3.h
    public void a(c0 c0Var) {
        if (c0Var == null) {
            c0Var = c0.g;
        }
        this.f39290A.a(c0Var);
    }

    @Override // com.smartdigimkt.w3.h
    public x a(x.b bVar) {
        return new x(this.f39290A, bVar, this.O.f39367a, D(), this.f39291B);
    }

    @Override // com.smartdigimkt.w3.h
    public void a(h.c... cVarArr) {
        ArrayList<x> arrayList = new ArrayList();
        for (h.c cVar : cVarArr) {
            arrayList.add(a(cVar.f39287a).a(cVar.f39288b).a(cVar.f39289c).l());
        }
        boolean z2 = false;
        for (x xVar : arrayList) {
            boolean z3 = true;
            while (z3) {
                try {
                    xVar.a();
                    z3 = false;
                } catch (InterruptedException unused) {
                    z2 = true;
                } catch (TimeoutException e2) {
                    e2.getMessage();
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    public void a(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            u uVar = (u) message.obj;
            int i3 = message.arg1;
            int i4 = message.arg2;
            a(uVar, i3, i4 != -1, i4);
            return;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                g gVar = (g) message.obj;
                this.f39296N = gVar;
                Iterator<w.c> it = this.C.iterator();
                while (it.hasNext()) {
                    it.next().onPlayerError(gVar);
                }
                return;
            }
            throw new IllegalStateException();
        }
        v vVar = (v) message.obj;
        if (this.M.equals(vVar)) {
            return;
        }
        this.M = vVar;
        Iterator<w.c> it2 = this.C.iterator();
        while (it2.hasNext()) {
            it2.next().onPlaybackParametersChanged(vVar);
        }
    }

    private void a(u uVar, int i2, boolean z2, int i3) {
        int i4 = this.f39295J - i2;
        this.f39295J = i4;
        if (i4 == 0) {
            u uVarA = uVar.d == -9223372036854775807L ? uVar.a(uVar.f39369c, 0L, uVar.f39370e) : uVar;
            if ((!this.O.f39367a.c() || this.K) && uVarA.f39367a.c()) {
                this.f39298Q = 0;
                this.f39297P = 0;
                this.f39299R = 0L;
            }
            int i5 = this.K ? 0 : 2;
            boolean z3 = this.L;
            this.K = false;
            this.L = false;
            a(uVarA, z2, i3, i5, z3, false);
        }
    }

    private u a(boolean z2, boolean z3, int i2) {
        if (z2) {
            this.f39297P = 0;
            this.f39298Q = 0;
            this.f39299R = 0L;
        } else {
            this.f39297P = D();
            this.f39298Q = o();
            this.f39299R = F();
        }
        e0 e0Var = z3 ? e0.f39262a : this.O.f39367a;
        Object obj = z3 ? null : this.O.f39368b;
        u uVar = this.O;
        return new u(e0Var, obj, uVar.f39369c, uVar.d, uVar.f39370e, i2, false, z3 ? com.smartdigimkt.j4.f0.d : uVar.f39371h, z3 ? this.y : uVar.f39372i);
    }

    private void a(u uVar, boolean z2, int i2, int i3, boolean z3, boolean z4) {
        boolean zIsEmpty = this.f39293F.isEmpty();
        this.f39293F.addLast(new b(uVar, this.O, this.C, this.x, z2, i2, i3, z3, this.G, z4));
        this.O = uVar;
        if (zIsEmpty) {
            while (!this.f39293F.isEmpty()) {
                this.f39293F.peekFirst().a();
                this.f39293F.removeFirst();
            }
        }
    }
}
