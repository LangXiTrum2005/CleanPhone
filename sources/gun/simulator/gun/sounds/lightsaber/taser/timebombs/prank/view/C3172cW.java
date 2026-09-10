package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3172cW implements LI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f4225a;
    public final B90 b;
    public final C4568sM c;
    public final InterfaceC4353pt d;
    public final C4581sZ e;
    public volatile boolean g;
    public long i;
    public C4868vl j;
    public V20 k;
    public boolean l;
    public final /* synthetic */ C3525gW m;
    public final C2868Wu f = new C2868Wu(1);
    public boolean h = true;

    public C3172cW(C3525gW c3525gW, Uri uri, InterfaceC4429ql interfaceC4429ql, C4568sM c4568sM, InterfaceC4353pt interfaceC4353pt, C4581sZ c4581sZ) {
        this.m = c3525gW;
        this.f4225a = uri;
        this.b = new B90(interfaceC4429ql);
        this.c = c4568sM;
        this.d = interfaceC4353pt;
        this.e = c4581sZ;
        FI.f3063a.getAndIncrement();
        this.j = a(0L);
    }

    public final C4868vl a(long j) {
        Collections.emptyMap();
        String str = this.m.i;
        Map map = C3525gW.M;
        Uri uri = this.f4225a;
        FW.u(uri, "The uri must be set.");
        return new C4868vl(uri, 0L, 1, null, map, j, -1L, str, 6, null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LI
    public final void cancelLoad() {
        this.g = true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LI
    public final void load() {
        InterfaceC4429ql zb;
        int i;
        int iA = 0;
        while (iA == 0 && !this.g) {
            try {
                long j = this.f.b;
                C4868vl c4868vlA = a(j);
                this.j = c4868vlA;
                long jD = this.b.d(c4868vlA);
                if (jD != -1) {
                    jD += j;
                    C3525gW c3525gW = this.m;
                    c3525gW.p.post(new RunnableC3084bW(c3525gW, 2));
                }
                long j2 = jD;
                this.m.r = IcyHeaders.b(this.b.f2861a.getResponseHeaders());
                B90 b90 = this.b;
                IcyHeaders icyHeaders = this.m.r;
                if (icyHeaders == null || (i = icyHeaders.metadataInterval) == -1) {
                    zb = b90;
                } else {
                    zb = new ZB(b90, i, this);
                    C3525gW c3525gW2 = this.m;
                    c3525gW2.getClass();
                    V20 v20O = c3525gW2.o(new C3349eW(0, true));
                    this.k = v20O;
                    v20O.e(C3525gW.N);
                }
                long jL = j;
                this.c.q(zb, this.f4225a, this.b.f2861a.getResponseHeaders(), j, j2, this.d);
                if (this.m.r != null) {
                    Object obj = this.c.c;
                    if (((InterfaceC4177nt) obj) instanceof NP) {
                        ((NP) ((InterfaceC4177nt) obj)).r = true;
                    }
                }
                if (this.h) {
                    C4568sM c4568sM = this.c;
                    long j3 = this.i;
                    InterfaceC4177nt interfaceC4177nt = (InterfaceC4177nt) c4568sM.c;
                    interfaceC4177nt.getClass();
                    interfaceC4177nt.seek(jL, j3);
                    this.h = false;
                }
                while (true) {
                    long j4 = jL;
                    while (true) {
                        if (iA != 0 || this.g) {
                            break;
                        }
                        try {
                            C4581sZ c4581sZ = this.e;
                            synchronized (c4581sZ) {
                                while (!c4581sZ.f4984a) {
                                    try {
                                        c4581sZ.wait();
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            C4568sM c4568sM2 = this.c;
                            C2868Wu c2868Wu = this.f;
                            InterfaceC4177nt interfaceC4177nt2 = (InterfaceC4177nt) c4568sM2.c;
                            interfaceC4177nt2.getClass();
                            InterfaceC4265ot interfaceC4265ot = (InterfaceC4265ot) c4568sM2.d;
                            interfaceC4265ot.getClass();
                            iA = interfaceC4177nt2.a(interfaceC4265ot, c2868Wu);
                            jL = this.c.l();
                            if (jL > this.m.j + j4) {
                                this.e.c();
                                C3525gW c3525gW3 = this.m;
                                c3525gW3.p.post(c3525gW3.o);
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                }
                if (iA == 1) {
                    iA = 0;
                } else if (this.c.l() != -1) {
                    this.f.b = this.c.l();
                }
                FW.v(this.b);
            } catch (Throwable th2) {
                if (iA != 1 && this.c.l() != -1) {
                    this.f.b = this.c.l();
                }
                FW.v(this.b);
                throw th2;
            }
        }
    }
}
