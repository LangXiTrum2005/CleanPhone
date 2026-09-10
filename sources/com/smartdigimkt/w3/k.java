package com.smartdigimkt.w3;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.smartdigimkt.j4.f0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class k implements Handler.Callback, com.smartdigimkt.j4.r.a, com.smartdigimkt.m4.h.a, com.smartdigimkt.j4.s.b, com.smartdigimkt.w3.e.a, x.a {
    private static final String G0 = "ExoPlayerImplInternal";
    public static final int H0 = 0;
    public static final int I0 = 1;
    public static final int J0 = 2;
    private static final int K0 = 0;
    private static final int L0 = 1;
    private static final int M0 = 2;
    private static final int N0 = 3;
    private static final int O0 = 4;
    private static final int P0 = 5;
    private static final int Q0 = 6;
    private static final int R0 = 7;
    private static final int S0 = 8;
    private static final int T0 = 9;
    private static final int U0 = 10;
    private static final int V0 = 11;
    private static final int W0 = 12;
    private static final int X0 = 13;
    private static final int Y0 = 14;
    private static final int Z0 = 15;
    private static final int a1 = 10;
    private static final int b1 = 10;
    private static final int c1 = 1000;
    private static final long d1 = 500;
    private int A0;
    private boolean B0;
    private int C0;
    private e D0;
    private long E0;
    private int F0;
    private final y[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final z[] f39310Y;
    private final com.smartdigimkt.m4.h Z;
    private final com.smartdigimkt.m4.i e0;
    private final p f0;
    private final com.smartdigimkt.p4.k g0;
    private final HandlerThread h0;
    private final Handler i0;
    private final h j0;
    private final e0.c k0;
    private final e0.b l0;
    private final long m0;
    private final boolean n0;
    private final com.smartdigimkt.w3.e o0;
    private final ArrayList<c> q0;
    private final com.smartdigimkt.p4.c r0;
    private u u0;
    private com.smartdigimkt.j4.s v0;
    private y[] w0;
    private boolean x0;
    private boolean y0;
    private boolean z0;
    private final s s0 = new s();
    private c0 t0 = c0.g;
    private final d p0 = new d(null);

    public class a implements Runnable {
        final /* synthetic */ x X;

        public a(x xVar) {
            this.X = xVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                k.this.b(this.X);
            } catch (g e2) {
                Log.e(k.G0, "Unexpected error delivering message on external thread.", e2);
                throw new RuntimeException(e2);
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.smartdigimkt.j4.s f39312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e0 f39313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f39314c;

        public b(com.smartdigimkt.j4.s sVar, e0 e0Var, Object obj) {
            this.f39312a = sVar;
            this.f39313b = e0Var;
            this.f39314c = obj;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private u f39318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f39319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f39320c;
        private int d;

        private d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }

        public boolean a(u uVar) {
            return uVar != this.f39318a || this.f39319b > 0 || this.f39320c;
        }

        public void b(u uVar) {
            this.f39318a = uVar;
            this.f39319b = 0;
            this.f39320c = false;
        }

        public void a(int i2) {
            this.f39319b += i2;
        }

        public void b(int i2) {
            if (this.f39320c && this.d != 4) {
                com.smartdigimkt.p4.a.a(i2 == 4);
            } else {
                this.f39320c = true;
                this.d = i2;
            }
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0 f39321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f39323c;

        public e(e0 e0Var, int i2, long j) {
            this.f39321a = e0Var;
            this.f39322b = i2;
            this.f39323c = j;
        }
    }

    public k(y[] yVarArr, com.smartdigimkt.m4.h hVar, com.smartdigimkt.m4.i iVar, p pVar, boolean z2, int i2, boolean z3, Handler handler, h hVar2, com.smartdigimkt.p4.c cVar) {
        this.X = yVarArr;
        this.Z = hVar;
        this.e0 = iVar;
        this.f0 = pVar;
        this.y0 = z2;
        this.A0 = i2;
        this.B0 = z3;
        this.i0 = handler;
        this.j0 = hVar2;
        this.r0 = cVar;
        this.m0 = pVar.e();
        this.n0 = pVar.a();
        this.u0 = new u(e0.f39262a, -9223372036854775807L, f0.d, iVar);
        this.f39310Y = new z[yVarArr.length];
        for (int i3 = 0; i3 < yVarArr.length; i3++) {
            yVarArr[i3].a(i3);
            this.f39310Y[i3] = yVarArr[i3].m();
        }
        this.o0 = new com.smartdigimkt.w3.e(this, cVar);
        this.q0 = new ArrayList<>();
        this.w0 = new y[0];
        this.k0 = new e0.c();
        this.l0 = new e0.b();
        hVar.a((com.smartdigimkt.m4.h.a) this);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.h0 = handlerThread;
        handlerThread.start();
        this.g0 = cVar.a(handlerThread.getLooper(), this);
    }

    private void f(boolean z2) throws g {
        this.B0 = z2;
        if (this.s0.b(z2)) {
            return;
        }
        a(true);
    }

    private boolean g(boolean z2) {
        if (this.w0.length == 0) {
            return f();
        }
        if (!z2) {
            return false;
        }
        if (!this.u0.g) {
            return true;
        }
        q qVarD = this.s0.d();
        long jA = qVarD.a(!qVarD.f39352h.g);
        return jA == Long.MIN_VALUE || this.f0.a(jA - qVarD.c(this.E0), this.o0.b().f39374a, this.z0);
    }

    private void i() throws IOException {
        q qVarD = this.s0.d();
        q qVarF = this.s0.f();
        if (qVarD == null || qVarD.f) {
            return;
        }
        if (qVarF == null || qVarF.f39353i == qVarD) {
            for (y yVar : this.w0) {
                if (!yVar.f()) {
                    return;
                }
            }
            qVarD.f39348a.g();
        }
    }

    private void j() throws IOException {
        this.s0.a(this.E0);
        if (this.s0.h()) {
            r rVarA = this.s0.a(this.E0, this.u0);
            if (rVarA == null) {
                this.v0.b();
                return;
            }
            this.s0.a(this.f39310Y, this.Z, this.f0.c(), this.v0, this.u0.f39367a.a(rVarA.f39356a.f36015a, this.l0, true).f39264b, rVarA).a(this, rVarA.f39357b);
            b(true);
        }
    }

    private void l() {
        a(true, true, true);
        this.f0.b();
        c(1);
        this.h0.quitSafely();
        synchronized (this) {
            this.x0 = true;
            notifyAll();
        }
    }

    private void m() throws g {
        if (this.s0.g()) {
            float f = this.o0.b().f39374a;
            q qVarF = this.s0.f();
            boolean z2 = true;
            for (q qVarE = this.s0.e(); qVarE != null && qVarE.f; qVarE = qVarE.f39353i) {
                if (qVarE.b(f)) {
                    if (z2) {
                        q qVarE2 = this.s0.e();
                        boolean zA = this.s0.a(qVarE2);
                        boolean[] zArr = new boolean[this.X.length];
                        long jA = qVarE2.a(this.u0.j, zA, zArr);
                        a(qVarE2.j, qVarE2.k);
                        u uVar = this.u0;
                        if (uVar.f != 4 && jA != uVar.j) {
                            u uVar2 = this.u0;
                            this.u0 = uVar2.a(uVar2.f39369c, jA, uVar2.f39370e);
                            this.p0.b(4);
                            a(jA);
                        }
                        boolean[] zArr2 = new boolean[this.X.length];
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            y[] yVarArr = this.X;
                            if (i2 >= yVarArr.length) {
                                break;
                            }
                            y yVar = yVarArr[i2];
                            boolean z3 = yVar.d() != 0;
                            zArr2[i2] = z3;
                            com.smartdigimkt.j4.y yVar2 = qVarE2.f39350c[i2];
                            if (yVar2 != null) {
                                i3++;
                            }
                            if (z3) {
                                if (yVar2 != yVar.h()) {
                                    a(yVar);
                                } else if (zArr[i2]) {
                                    yVar.a(this.E0);
                                }
                            }
                            i2++;
                        }
                        this.u0 = this.u0.a(qVarE2.j, qVarE2.k);
                        a(zArr2, i3);
                    } else {
                        this.s0.a(qVarE);
                        if (qVarE.f) {
                            qVarE.a(Math.max(qVarE.f39352h.f39357b, qVarE.c(this.E0)), false);
                            a(qVarE.j, qVarE.k);
                        }
                    }
                    if (this.u0.f != 4) {
                        g();
                        r();
                        this.g0.a(2);
                        return;
                    }
                    return;
                }
                if (qVarE == qVarF) {
                    z2 = false;
                }
            }
        }
    }

    private void n() {
        for (int size = this.q0.size() - 1; size >= 0; size--) {
            if (!a(this.q0.get(size))) {
                this.q0.get(size).f39315a.a(false);
                this.q0.remove(size);
            }
        }
        Collections.sort(this.q0);
    }

    private void o() throws g {
        this.z0 = false;
        this.o0.d();
        for (y yVar : this.w0) {
            yVar.start();
        }
    }

    private void p() throws g {
        this.o0.e();
        for (y yVar : this.w0) {
            b(yVar);
        }
    }

    private void q() throws g, IOException {
        com.smartdigimkt.j4.s sVar = this.v0;
        if (sVar == null) {
            return;
        }
        if (this.C0 > 0) {
            sVar.b();
            return;
        }
        j();
        q qVarD = this.s0.d();
        int i2 = 0;
        if (qVarD == null || qVarD.d()) {
            b(false);
        } else if (!this.u0.g) {
            g();
        }
        if (!this.s0.g()) {
            return;
        }
        q qVarE = this.s0.e();
        q qVarF = this.s0.f();
        boolean z2 = false;
        while (this.y0 && qVarE != qVarF && this.E0 >= qVarE.f39353i.f39351e) {
            if (z2) {
                h();
            }
            int i3 = qVarE.f39352h.f ? 0 : 3;
            q qVarA = this.s0.a();
            a(qVarE);
            u uVar = this.u0;
            r rVar = qVarA.f39352h;
            this.u0 = uVar.a(rVar.f39356a, rVar.f39357b, rVar.d);
            this.p0.b(i3);
            r();
            qVarE = qVarA;
            z2 = true;
        }
        if (qVarF.f39352h.g) {
            while (true) {
                y[] yVarArr = this.X;
                if (i2 >= yVarArr.length) {
                    return;
                }
                y yVar = yVarArr[i2];
                com.smartdigimkt.j4.y yVar2 = qVarF.f39350c[i2];
                if (yVar2 != null && yVar.h() == yVar2 && yVar.f()) {
                    yVar.i();
                }
                i2++;
            }
        } else {
            q qVar = qVarF.f39353i;
            if (qVar == null || !qVar.f) {
                return;
            }
            int i4 = 0;
            while (true) {
                y[] yVarArr2 = this.X;
                if (i4 < yVarArr2.length) {
                    y yVar3 = yVarArr2[i4];
                    com.smartdigimkt.j4.y yVar4 = qVarF.f39350c[i4];
                    if (yVar3.h() != yVar4) {
                        return;
                    }
                    if (yVar4 != null && !yVar3.f()) {
                        return;
                    } else {
                        i4++;
                    }
                } else {
                    com.smartdigimkt.m4.i iVar = qVarF.k;
                    q qVarB = this.s0.b();
                    com.smartdigimkt.m4.i iVar2 = qVarB.k;
                    boolean z3 = qVarB.f39348a.e() != -9223372036854775807L;
                    int i5 = 0;
                    while (true) {
                        y[] yVarArr3 = this.X;
                        if (i5 >= yVarArr3.length) {
                            return;
                        }
                        y yVar5 = yVarArr3[i5];
                        if (iVar.a(i5)) {
                            if (z3) {
                                yVar5.i();
                            } else if (!yVar5.k()) {
                                com.smartdigimkt.m4.f fVarA = iVar2.f36692c.a(i5);
                                boolean zA = iVar2.a(i5);
                                boolean z4 = this.f39310Y[i5].e() == 5;
                                a0 a0Var = iVar.f36691b[i5];
                                a0 a0Var2 = iVar2.f36691b[i5];
                                if (zA && a0Var2.equals(a0Var) && !z4) {
                                    yVar5.a(a(fVarA), qVarB.f39350c[i5], qVarB.c());
                                } else {
                                    yVar5.i();
                                }
                            }
                        }
                        i5++;
                    }
                }
            }
        }
    }

    private void r() throws g {
        if (this.s0.g()) {
            q qVarE = this.s0.e();
            long jE = qVarE.f39348a.e();
            if (jE != -9223372036854775807L) {
                a(jE);
                if (jE != this.u0.j) {
                    u uVar = this.u0;
                    this.u0 = uVar.a(uVar.f39369c, jE, uVar.f39370e);
                    this.p0.b(4);
                }
            } else {
                long jF = this.o0.f();
                this.E0 = jF;
                long jC = qVarE.c(jF);
                a(this.u0.j, jC);
                this.u0.j = jC;
            }
            this.u0.k = this.w0.length == 0 ? qVarE.f39352h.f39359e : qVarE.a(true);
        }
    }

    public void b(e0 e0Var, int i2, long j) {
        this.g0.a(3, new e(e0Var, i2, j)).sendToTarget();
    }

    public void c(boolean z2) {
        this.g0.a(1, z2 ? 1 : 0, 0).sendToTarget();
    }

    public Looper d() {
        return this.h0.getLooper();
    }

    public void e(boolean z2) {
        this.g0.a(13, z2 ? 1 : 0, 0).sendToTarget();
    }

    public void h(boolean z2) {
        this.g0.a(6, z2 ? 1 : 0, 0).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    b((com.smartdigimkt.j4.s) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    d(message.arg1 != 0);
                    break;
                case 2:
                    b();
                    break;
                case 3:
                    a((e) message.obj);
                    break;
                case 4:
                    b((v) message.obj);
                    break;
                case 5:
                    b((c0) message.obj);
                    break;
                case 6:
                    a(message.arg1 != 0, true);
                    break;
                case 7:
                    l();
                    return true;
                case 8:
                    a((b) message.obj);
                    break;
                case 9:
                    c((com.smartdigimkt.j4.r) message.obj);
                    break;
                case 10:
                    b((com.smartdigimkt.j4.r) message.obj);
                    break;
                case 11:
                    m();
                    break;
                case 12:
                    b(message.arg1);
                    break;
                case 13:
                    f(message.arg1 != 0);
                    break;
                case 14:
                    c((x) message.obj);
                    break;
                case 15:
                    e((x) message.obj);
                    break;
                default:
                    return false;
            }
            h();
        } catch (g e2) {
            Log.e(G0, "Playback error.", e2);
            a(false, false);
            this.i0.obtainMessage(2, e2).sendToTarget();
            h();
        } catch (IOException e3) {
            Log.e(G0, "Source error.", e3);
            a(false, false);
            this.i0.obtainMessage(2, g.a(e3)).sendToTarget();
            h();
        } catch (RuntimeException e4) {
            Log.e(G0, "Internal runtime error.", e4);
            a(false, false);
            this.i0.obtainMessage(2, g.a(e4)).sendToTarget();
            h();
        }
        return true;
    }

    public synchronized void k() {
        if (!this.x0 && this.h0.isAlive()) {
            this.g0.a(7);
            long jB = 500;
            long jB2 = this.r0.b() + 500;
            boolean z2 = false;
            while (!this.x0 && jB > 0) {
                try {
                    wait(jB);
                } catch (InterruptedException unused) {
                    z2 = true;
                }
                jB = jB2 - this.r0.b();
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // com.smartdigimkt.w3.e.a
    public void onPlaybackParametersChanged(v vVar) {
        this.i0.obtainMessage(1, vVar).sendToTarget();
        a(vVar.f39374a);
    }

    private void c(int i2) {
        u uVar = this.u0;
        if (uVar.f != i2) {
            this.u0 = uVar.b(i2);
        }
    }

    private void e(x xVar) {
        xVar.d().post(new a(xVar));
    }

    private void h() {
        if (this.p0.a(this.u0)) {
            this.i0.obtainMessage(0, this.p0.f39319b, this.p0.f39320c ? this.p0.d : -1, this.u0).sendToTarget();
            this.p0.b(this.u0);
        }
    }

    @Override // com.smartdigimkt.j4.z.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(com.smartdigimkt.j4.r rVar) {
        this.g0.a(10, rVar).sendToTarget();
    }

    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f39315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f39316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f39317c;
        public Object d;

        public c(x xVar) {
            this.f39315a = xVar;
        }

        public void a(int i2, long j, Object obj) {
            this.f39316b = i2;
            this.f39317c = j;
            this.d = obj;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            Object obj = this.d;
            if ((obj == null) != (cVar.d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i2 = this.f39316b - cVar.f39316b;
            return i2 != 0 ? i2 : com.smartdigimkt.p4.f0.b(this.f39317c, cVar.f39317c);
        }
    }

    private void b(boolean z2) {
        u uVar = this.u0;
        if (uVar.g != z2) {
            this.u0 = uVar.a(z2);
        }
    }

    private void d(boolean z2) throws g {
        this.z0 = false;
        this.y0 = z2;
        if (!z2) {
            p();
            r();
            return;
        }
        int i2 = this.u0.f;
        if (i2 == 3) {
            o();
            this.g0.a(2);
        } else if (i2 == 2) {
            this.g0.a(2);
        }
    }

    public void a(com.smartdigimkt.j4.s sVar, boolean z2, boolean z3) {
        this.g0.a(0, z2 ? 1 : 0, z3 ? 1 : 0, sVar).sendToTarget();
    }

    private int c() {
        e0 e0Var = this.u0.f39367a;
        if (e0Var.c()) {
            return 0;
        }
        return e0Var.a(e0Var.a(this.B0), this.k0).f;
    }

    private void e() {
        c(4);
        a(false, true, false);
    }

    private boolean f() {
        q qVarE = this.s0.e();
        long j = qVarE.f39352h.f39359e;
        if (j == -9223372036854775807L || this.u0.j < j) {
            return true;
        }
        q qVar = qVarE.f39353i;
        if (qVar != null) {
            return qVar.f || qVar.f39352h.f39356a.a();
        }
        return false;
    }

    private void b(com.smartdigimkt.j4.s sVar, boolean z2, boolean z3) {
        this.C0++;
        a(true, z2, z3);
        this.f0.f();
        this.v0 = sVar;
        c(2);
        sVar.a(this.j0, true, this);
        this.g0.a(2);
    }

    public void a(int i2) {
        this.g0.a(12, i2, 0).sendToTarget();
    }

    public void a(v vVar) {
        this.g0.a(4, vVar).sendToTarget();
    }

    private void c(x xVar) throws g {
        if (xVar.f() == -9223372036854775807L) {
            d(xVar);
            return;
        }
        if (this.v0 != null && this.C0 <= 0) {
            c cVar = new c(xVar);
            if (a(cVar)) {
                this.q0.add(cVar);
                Collections.sort(this.q0);
                return;
            } else {
                xVar.a(false);
                return;
            }
        }
        this.q0.add(new c(xVar));
    }

    public void a(c0 c0Var) {
        this.g0.a(5, c0Var).sendToTarget();
    }

    @Override // com.smartdigimkt.w3.x.a
    public synchronized void a(x xVar) {
        if (this.x0) {
            Log.w(G0, "Ignoring messages sent after release.");
            xVar.a(false);
        } else {
            this.g0.a(14, xVar).sendToTarget();
        }
    }

    private void g() {
        q qVarD = this.s0.d();
        long jB = qVarD.b();
        if (jB == Long.MIN_VALUE) {
            b(false);
            return;
        }
        boolean zA = this.f0.a(jB - qVarD.c(this.E0), this.o0.b().f39374a);
        b(zA);
        if (zA) {
            qVarD.a(this.E0);
        }
    }

    private void d(x xVar) throws g {
        if (xVar.d().getLooper() == this.g0.a()) {
            b(xVar);
            int i2 = this.u0.f;
            if (i2 == 3 || i2 == 2) {
                this.g0.a(2);
                return;
            }
            return;
        }
        this.g0.a(15, xVar).sendToTarget();
    }

    private void b(int i2) throws g {
        this.A0 = i2;
        if (this.s0.b(i2)) {
            return;
        }
        a(true);
    }

    @Override // com.smartdigimkt.j4.s.b
    public void a(com.smartdigimkt.j4.s sVar, e0 e0Var, Object obj) {
        this.g0.a(8, new b(sVar, e0Var, obj)).sendToTarget();
    }

    private void b() throws g, IOException {
        int i2;
        long jA = this.r0.a();
        q();
        if (!this.s0.g()) {
            i();
            b(jA, 10L);
            return;
        }
        q qVarE = this.s0.e();
        com.smartdigimkt.p4.d0.a("doSomeWork");
        r();
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        qVarE.f39348a.a(this.u0.j - this.m0, this.n0);
        y[] yVarArr = this.w0;
        int length = yVarArr.length;
        int i3 = 0;
        boolean z2 = true;
        boolean z3 = true;
        while (i3 < length) {
            y yVar = yVarArr[i3];
            int i4 = i3;
            yVar.a(this.E0, jElapsedRealtime);
            z3 = z3 && yVar.a();
            boolean z4 = yVar.isReady() || yVar.a() || c(yVar);
            if (!z4) {
                yVar.j();
            }
            z2 = z2 && z4;
            i3 = i4 + 1;
        }
        if (!z2) {
            i();
        }
        long j = qVarE.f39352h.f39359e;
        if (z3 && ((j == -9223372036854775807L || j <= this.u0.j) && qVarE.f39352h.g)) {
            c(4);
            p();
        } else if (this.u0.f == 2 && g(z2)) {
            c(3);
            if (this.y0) {
                o();
            }
        } else if (this.u0.f == 3 && (this.w0.length != 0 ? !z2 : !f())) {
            this.z0 = this.y0;
            c(2);
            p();
        }
        if (this.u0.f == 2) {
            for (y yVar2 : this.w0) {
                yVar2.j();
            }
        }
        if ((this.y0 && this.u0.f == 3) || (i2 = this.u0.f) == 2) {
            b(jA, 10L);
        } else if (this.w0.length != 0 && i2 != 4) {
            b(jA, 1000L);
        } else {
            this.g0.b(2);
        }
        com.smartdigimkt.p4.d0.a();
    }

    @Override // com.smartdigimkt.j4.r.a
    public void a(com.smartdigimkt.j4.r rVar) {
        this.g0.a(9, rVar).sendToTarget();
    }

    @Override // com.smartdigimkt.m4.h.a
    public void a() {
        this.g0.a(11);
    }

    private void a(boolean z2) throws g {
        com.smartdigimkt.j4.s.a aVar = this.s0.e().f39352h.f39356a;
        long jA = a(aVar, this.u0.j, true);
        if (jA != this.u0.j) {
            u uVar = this.u0;
            this.u0 = uVar.a(aVar, jA, uVar.f39370e);
            if (z2) {
                this.p0.b(4);
            }
        }
    }

    private void c(com.smartdigimkt.j4.r rVar) throws g {
        if (this.s0.a(rVar)) {
            q qVarD = this.s0.d();
            qVarD.a(this.o0.b().f39374a);
            a(qVarD.j, qVarD.k);
            if (!this.s0.g()) {
                a(this.s0.a().f39352h.f39357b);
                a((q) null);
            }
            g();
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d7 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    private void a(e eVar) throws g {
        long jLongValue;
        boolean z2;
        com.smartdigimkt.j4.s.a aVar;
        long j;
        long j2;
        u uVarA;
        long jA;
        boolean z3 = true;
        this.p0.a(1);
        Pair<Integer, Long> pairA = a(eVar, true);
        if (pairA == null) {
            aVar = new com.smartdigimkt.j4.s.a(c());
            z2 = true;
            jLongValue = -9223372036854775807L;
            j = -9223372036854775807L;
        } else {
            int iIntValue = ((Integer) pairA.first).intValue();
            long jLongValue2 = ((Long) pairA.second).longValue();
            com.smartdigimkt.j4.s.a aVarA = this.s0.a(iIntValue, jLongValue2);
            if (aVarA.a()) {
                z2 = true;
                jLongValue = 0;
            } else {
                jLongValue = ((Long) pairA.second).longValue();
                z2 = eVar.f39323c == -9223372036854775807L;
            }
            aVar = aVarA;
            j = jLongValue2;
        }
        try {
            if (this.v0 == null || this.C0 > 0) {
                this.D0 = eVar;
            } else {
                if (jLongValue == -9223372036854775807L) {
                    c(4);
                    a(false, true, false);
                } else {
                    if (aVar.equals(this.u0.f39369c)) {
                        q qVarE = this.s0.e();
                        jA = (qVarE == null || jLongValue == 0) ? jLongValue : qVarE.f39348a.a(jLongValue, this.t0);
                        if (com.smartdigimkt.w3.b.b(jA) == com.smartdigimkt.w3.b.b(this.u0.j)) {
                            uVarA = this.u0.a(aVar, this.u0.j, j);
                            if (z2) {
                                return;
                            } else {
                                return;
                            }
                        }
                    } else {
                        jA = jLongValue;
                    }
                    long jA2 = a(aVar, jA);
                    if (jLongValue == jA2) {
                        z3 = false;
                    }
                    z2 |= z3;
                    j2 = jA2;
                }
                uVarA = this.u0.a(aVar, j2, j);
            }
            j2 = jLongValue;
            uVarA = this.u0.a(aVar, j2, j);
        } finally {
            this.u0 = this.u0.a(aVar, jLongValue, j);
            if (z2) {
                this.p0.b(2);
            }
        }
    }

    private boolean c(y yVar) {
        q qVar = this.s0.f().f39353i;
        return qVar != null && qVar.f && yVar.f();
    }

    private long a(com.smartdigimkt.j4.s.a aVar, long j) throws g {
        return a(aVar, j, this.s0.e() != this.s0.f());
    }

    private long a(com.smartdigimkt.j4.s.a aVar, long j, boolean z2) throws g {
        p();
        this.z0 = false;
        c(2);
        q qVarE = this.s0.e();
        q qVarA = qVarE;
        while (qVarA != null) {
            if (a(aVar, j, qVarA)) {
                this.s0.a(qVarA);
                break;
            }
            qVarA = this.s0.a();
        }
        if (qVarE != qVarA || z2) {
            for (y yVar : this.w0) {
                a(yVar);
            }
            this.w0 = new y[0];
            qVarE = null;
        }
        if (qVarA != null) {
            a(qVarE);
            if (qVarA.g) {
                j = qVarA.f39348a.c(j);
                qVarA.f39348a.a(j - this.m0, this.n0);
            }
            a(j);
            g();
        } else {
            this.s0.a(true);
            a(j);
        }
        this.g0.a(2);
        return j;
    }

    private void b(long j, long j2) {
        this.g0.b(2);
        this.g0.a(2, j + j2);
    }

    private void b(v vVar) {
        this.o0.a(vVar);
    }

    private void b(c0 c0Var) {
        this.t0 = c0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(x xVar) throws g {
        if (xVar.k()) {
            return;
        }
        try {
            xVar.g().a(xVar.i(), xVar.e());
        } finally {
            xVar.a(true);
        }
    }

    private void b(y yVar) throws g {
        if (yVar.d() == 2) {
            yVar.stop();
        }
    }

    private void b(com.smartdigimkt.j4.r rVar) {
        if (this.s0.a(rVar)) {
            this.s0.a(this.E0);
            g();
        }
    }

    private boolean a(com.smartdigimkt.j4.s.a aVar, long j, q qVar) {
        if (!aVar.equals(qVar.f39352h.f39356a) || !qVar.f) {
            return false;
        }
        this.u0.f39367a.a(qVar.f39352h.f39356a.f36015a, this.l0);
        int iA = this.l0.a(j);
        return iA == -1 || this.l0.b(iA) == qVar.f39352h.f39358c;
    }

    private void a(long j) throws g {
        if (this.s0.g()) {
            j = this.s0.e().d(j);
        }
        this.E0 = j;
        this.o0.a(j);
        for (y yVar : this.w0) {
            yVar.a(this.E0);
        }
    }

    private void a(boolean z2, boolean z3) {
        a(true, z2, z2);
        this.p0.a(this.C0 + (z3 ? 1 : 0));
        this.C0 = 0;
        this.f0.d();
        c(1);
    }

    private void a(boolean z2, boolean z3, boolean z4) {
        com.smartdigimkt.j4.s sVar;
        this.g0.b(2);
        this.z0 = false;
        this.o0.e();
        this.E0 = 0L;
        for (y yVar : this.w0) {
            try {
                a(yVar);
            } catch (g | RuntimeException e2) {
                Log.e(G0, "Stop failed.", e2);
            }
        }
        this.w0 = new y[0];
        this.s0.a(!z3);
        b(false);
        if (z3) {
            this.D0 = null;
        }
        if (z4) {
            this.s0.a(e0.f39262a);
            Iterator<c> it = this.q0.iterator();
            while (it.hasNext()) {
                it.next().f39315a.a(false);
            }
            this.q0.clear();
            this.F0 = 0;
        }
        e0 e0Var = z4 ? e0.f39262a : this.u0.f39367a;
        Object obj = z4 ? null : this.u0.f39368b;
        com.smartdigimkt.j4.s.a aVar = z3 ? new com.smartdigimkt.j4.s.a(c()) : this.u0.f39369c;
        long j = z3 ? -9223372036854775807L : this.u0.j;
        long j2 = z3 ? -9223372036854775807L : this.u0.f39370e;
        u uVar = this.u0;
        this.u0 = new u(e0Var, obj, aVar, j, j2, uVar.f, false, z4 ? f0.d : uVar.f39371h, z4 ? this.e0 : uVar.f39372i);
        if (!z2 || (sVar = this.v0) == null) {
            return;
        }
        sVar.a(this);
        this.v0 = null;
    }

    private boolean a(c cVar) {
        Object obj = cVar.d;
        if (obj == null) {
            Pair<Integer, Long> pairA = a(new e(cVar.f39315a.h(), cVar.f39315a.j(), com.smartdigimkt.w3.b.a(cVar.f39315a.f())), false);
            if (pairA == null) {
                return false;
            }
            cVar.a(((Integer) pairA.first).intValue(), ((Long) pairA.second).longValue(), this.u0.f39367a.a(((Integer) pairA.first).intValue(), this.l0, true).f39264b);
        } else {
            int iA = this.u0.f39367a.a(obj);
            if (iA == -1) {
                return false;
            }
            cVar.f39316b = iA;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0034, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x006b, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(long r7, long r9) throws com.smartdigimkt.w3.g {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smartdigimkt.w3.k.a(long, long):void");
    }

    private void a(y yVar) throws g {
        this.o0.a(yVar);
        b(yVar);
        yVar.c();
    }

    private void a(f0 f0Var, com.smartdigimkt.m4.i iVar) {
        this.f0.a(this.X, f0Var, iVar.f36692c);
    }

    private void a(float f) {
        for (q qVarC = this.s0.c(); qVarC != null; qVarC = qVarC.f39353i) {
            com.smartdigimkt.m4.i iVar = qVarC.k;
            if (iVar != null) {
                for (com.smartdigimkt.m4.f fVar : iVar.f36692c.a()) {
                    if (fVar != null) {
                        fVar.a(f);
                    }
                }
            }
        }
    }

    private void a(b bVar) throws g {
        if (bVar.f39312a != this.v0) {
            return;
        }
        e0 e0Var = this.u0.f39367a;
        e0 e0Var2 = bVar.f39313b;
        Object obj = bVar.f39314c;
        this.s0.a(e0Var2);
        this.u0 = this.u0.a(e0Var2, obj);
        n();
        int i2 = this.C0;
        if (i2 > 0) {
            this.p0.a(i2);
            this.C0 = 0;
            e eVar = this.D0;
            if (eVar != null) {
                Pair<Integer, Long> pairA = a(eVar, true);
                this.D0 = null;
                if (pairA == null) {
                    e();
                    return;
                }
                int iIntValue = ((Integer) pairA.first).intValue();
                long jLongValue = ((Long) pairA.second).longValue();
                com.smartdigimkt.j4.s.a aVarA = this.s0.a(iIntValue, jLongValue);
                this.u0 = this.u0.a(aVarA, aVarA.a() ? 0L : jLongValue, jLongValue);
                return;
            }
            if (this.u0.d == -9223372036854775807L) {
                if (e0Var2.c()) {
                    e();
                    return;
                }
                Pair<Integer, Long> pairA2 = a(e0Var2, e0Var2.a(this.B0), -9223372036854775807L);
                int iIntValue2 = ((Integer) pairA2.first).intValue();
                long jLongValue2 = ((Long) pairA2.second).longValue();
                com.smartdigimkt.j4.s.a aVarA2 = this.s0.a(iIntValue2, jLongValue2);
                this.u0 = this.u0.a(aVarA2, aVarA2.a() ? 0L : jLongValue2, jLongValue2);
                return;
            }
            return;
        }
        u uVar = this.u0;
        int i3 = uVar.f39369c.f36015a;
        long j = uVar.f39370e;
        if (e0Var.c()) {
            if (e0Var2.c()) {
                return;
            }
            com.smartdigimkt.j4.s.a aVarA3 = this.s0.a(i3, j);
            this.u0 = this.u0.a(aVarA3, aVarA3.a() ? 0L : j, j);
            return;
        }
        q qVarC = this.s0.c();
        int iA = e0Var2.a(qVarC == null ? e0Var.a(i3, this.l0, true).f39264b : qVarC.f39349b);
        if (iA == -1) {
            int iA2 = a(i3, e0Var, e0Var2);
            if (iA2 == -1) {
                e();
                return;
            }
            Pair<Integer, Long> pairA3 = a(e0Var2, e0Var2.a(iA2, this.l0).f39265c, -9223372036854775807L);
            int iIntValue3 = ((Integer) pairA3.first).intValue();
            long jLongValue3 = ((Long) pairA3.second).longValue();
            com.smartdigimkt.j4.s.a aVarA4 = this.s0.a(iIntValue3, jLongValue3);
            e0Var2.a(iIntValue3, this.l0, true);
            if (qVarC != null) {
                Object obj2 = this.l0.f39264b;
                qVarC.f39352h = qVarC.f39352h.a(-1);
                while (true) {
                    qVarC = qVarC.f39353i;
                    if (qVarC == null) {
                        break;
                    } else if (qVarC.f39349b.equals(obj2)) {
                        qVarC.f39352h = this.s0.a(qVarC.f39352h, iIntValue3);
                    } else {
                        qVarC.f39352h = qVarC.f39352h.a(-1);
                    }
                }
            }
            this.u0 = this.u0.a(aVarA4, a(aVarA4, aVarA4.a() ? 0L : jLongValue3), jLongValue3);
            return;
        }
        if (iA != i3) {
            this.u0 = this.u0.a(iA);
        }
        com.smartdigimkt.j4.s.a aVar = this.u0.f39369c;
        if (aVar.a()) {
            com.smartdigimkt.j4.s.a aVarA5 = this.s0.a(iA, j);
            if (!aVarA5.equals(aVar)) {
                this.u0 = this.u0.a(aVarA5, a(aVarA5, aVarA5.a() ? 0L : j), j);
                return;
            }
        }
        if (this.s0.b(aVar, this.E0)) {
            return;
        }
        a(false);
    }

    private int a(int i2, e0 e0Var, e0 e0Var2) {
        int iA = e0Var.a();
        int i3 = 0;
        int iA2 = i2;
        int iA3 = -1;
        while (i3 < iA && iA3 == -1) {
            e0 e0Var3 = e0Var;
            iA2 = e0Var3.a(iA2, this.l0, this.k0, this.A0, this.B0);
            if (iA2 == -1) {
                break;
            }
            iA3 = e0Var2.a(e0Var3.a(iA2, this.l0, true).f39264b);
            i3++;
            e0Var = e0Var3;
        }
        return iA3;
    }

    private Pair<Integer, Long> a(e eVar, boolean z2) {
        int iA;
        e0 e0Var = this.u0.f39367a;
        e0 e0Var2 = eVar.f39321a;
        if (e0Var.c()) {
            return null;
        }
        e0 e0Var3 = e0Var2.c() ? e0Var : e0Var2;
        try {
            Pair<Integer, Long> pairA = e0Var3.a(this.k0, this.l0, eVar.f39322b, eVar.f39323c);
            if (e0Var == e0Var3) {
                return pairA;
            }
            int iA2 = e0Var.a(e0Var3.a(((Integer) pairA.first).intValue(), this.l0, true).f39264b);
            if (iA2 != -1) {
                return Pair.create(Integer.valueOf(iA2), (Long) pairA.second);
            }
            if (!z2 || (iA = a(((Integer) pairA.first).intValue(), e0Var3, e0Var)) == -1) {
                return null;
            }
            return a(e0Var, e0Var.a(iA, this.l0).f39265c, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new o(e0Var, eVar.f39322b, eVar.f39323c);
        }
    }

    private Pair<Integer, Long> a(e0 e0Var, int i2, long j) {
        return e0Var.a(this.k0, this.l0, i2, j);
    }

    private void a(q qVar) throws g {
        q qVarE = this.s0.e();
        if (qVarE == null || qVar == qVarE) {
            return;
        }
        boolean[] zArr = new boolean[this.X.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            y[] yVarArr = this.X;
            if (i2 < yVarArr.length) {
                y yVar = yVarArr[i2];
                zArr[i2] = yVar.d() != 0;
                if (qVarE.k.a(i2)) {
                    i3++;
                }
                if (zArr[i2] && (!qVarE.k.a(i2) || (yVar.k() && yVar.h() == qVar.f39350c[i2]))) {
                    a(yVar);
                }
                i2++;
            } else {
                this.u0 = this.u0.a(qVarE.j, qVarE.k);
                a(zArr, i3);
                return;
            }
        }
    }

    private void a(boolean[] zArr, int i2) throws g {
        this.w0 = new y[i2];
        q qVarE = this.s0.e();
        int i3 = 0;
        for (int i4 = 0; i4 < this.X.length; i4++) {
            if (qVarE.k.a(i4)) {
                a(i4, zArr[i4], i3);
                i3++;
            }
        }
    }

    private void a(int i2, boolean z2, int i3) throws g {
        q qVarE = this.s0.e();
        y yVar = this.X[i2];
        this.w0[i3] = yVar;
        if (yVar.d() == 0) {
            com.smartdigimkt.m4.i iVar = qVarE.k;
            a0 a0Var = iVar.f36691b[i2];
            m[] mVarArrA = a(iVar.f36692c.a(i2));
            boolean z3 = this.y0 && this.u0.f == 3;
            yVar.a(a0Var, mVarArrA, qVarE.f39350c[i2], this.E0, !z2 && z3, qVarE.c());
            this.o0.b(yVar);
            if (z3) {
                yVar.start();
            }
        }
    }

    private static m[] a(com.smartdigimkt.m4.f fVar) {
        int iJ = fVar != null ? fVar.j() : 0;
        m[] mVarArr = new m[iJ];
        for (int i2 = 0; i2 < iJ; i2++) {
            mVarArr[i2] = fVar.a(i2);
        }
        return mVarArr;
    }
}
