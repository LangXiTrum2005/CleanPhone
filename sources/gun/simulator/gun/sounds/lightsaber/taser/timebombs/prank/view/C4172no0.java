package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.badlogic.gdx.Net;
import com.bytedance.sdk.component.OY.ebl;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.no0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4172no0 extends JK {
    public final Socket m;
    public final Wm0 n;
    public final C4959wm0 o;
    public volatile UG p;
    public volatile boolean q;

    public C4172no0(C3844k50 c3844k50) {
        super((BF) c3844k50.b, (Vo0) c3844k50.c);
        this.q = true;
        this.m = (Socket) c3844k50.d;
        this.n = (Wm0) c3844k50.e;
        this.o = C4959wm0.c();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JK
    public final void d() {
        super.d();
        UG ug = this.p;
        this.p = null;
        if (ug != null) {
            ug.d();
        }
    }

    public final void h(C4084mo0 c4084mo0) throws Throwable {
        while (true) {
            Yo0 yo0 = this.i;
            if (!(yo0.d < yo0.e)) {
                return;
            }
            a();
            Xo0 xo0A = this.i.a();
            try {
                i(c4084mo0, xo0A);
                return;
            } catch (LG e) {
                if (AbstractC4648tE.c) {
                    Log.getStackTraceString(e);
                    return;
                }
                return;
            } catch (Oo0 unused) {
                Yo0.f.add(xo0A.f3996a);
                f();
            } catch (C3433fS e2) {
                if (AbstractC4648tE.c) {
                    Log.getStackTraceString(e2);
                }
                this.q = false;
                f();
            } catch (C4695tm0 e3) {
                if (AbstractC4648tE.c) {
                    Log.getStackTraceString(e3);
                    return;
                }
                return;
            } catch (IOException e4) {
                if (e4 instanceof SocketTimeoutException) {
                    Yo0.g.add(xo0A.f3996a);
                }
                if (!b()) {
                    f();
                } else if (AbstractC4648tE.c && !"Canceled".equalsIgnoreCase(e4.getMessage())) {
                    Log.getStackTraceString(e4);
                }
            } catch (Exception e5) {
                if (AbstractC4648tE.c) {
                    Log.getStackTraceString(e5);
                }
            }
        }
    }

    public final void i(C4084mo0 c4084mo0, Xo0 xo0) throws Throwable {
        NN nn;
        ebl eblVar;
        UG ug;
        if (Net.HttpMethods.HEAD.equalsIgnoreCase((String) ((C4568sM) this.h.c).b)) {
            byte[] bArrJ = j(this.b.a(((JW) this.h.d).f3268a, this.g), c4084mo0, xo0);
            if (bArrJ == null) {
                return;
            }
            c4084mo0.a(bArrJ, bArrJ.length);
            return;
        }
        NN nn2 = null;
        int i = 0;
        if (this.q) {
            File fileO = this.f3261a.o(this.g);
            long length = fileO.length();
            KK kkA = this.b.a(((JW) this.h.d).f3268a, this.g);
            if (length > c4084mo0.b) {
                No0 no0 = AbstractC4648tE.f5026a;
                if (!c4084mo0.c) {
                    byte[] bArrJ2 = j(kkA, c4084mo0, xo0);
                    a();
                    if (bArrJ2 == null) {
                        return;
                    } else {
                        c4084mo0.a(bArrJ2, bArrJ2.length);
                    }
                }
                if (kkA == null) {
                    kkA = this.b.a(((JW) this.h.d).f3268a, this.g);
                    if (kkA == null) {
                        j(null, c4084mo0, xo0);
                        kkA = this.b.a(((JW) this.h.d).f3268a, this.g);
                        if (kkA == null) {
                            throw new Oo0("failed to get header, rawKey: " + this.f + ", url: " + xo0);
                        }
                    }
                }
                if (fileO.length() >= kkA.c || !((ug = this.p) == null || ug.b() || ug.j.get() == 2)) {
                    eblVar = null;
                } else {
                    JG jg = new JG();
                    BF bf = this.f3261a;
                    if (bf == null) {
                        throw new IllegalArgumentException("cache == null");
                    }
                    jg.d = bf;
                    Vo0 vo0 = this.b;
                    if (vo0 == null) {
                        throw new IllegalArgumentException("db == null");
                    }
                    jg.e = vo0;
                    String str = this.f;
                    if (TextUtils.isEmpty(str)) {
                        throw new IllegalArgumentException("rawKey == null");
                    }
                    jg.f3259a = str;
                    String str2 = this.g;
                    if (TextUtils.isEmpty(str2)) {
                        throw new IllegalArgumentException("key == null");
                    }
                    jg.b = str2;
                    jg.c = new Yo0(xo0.f3996a);
                    jg.f = this.e;
                    jg.h = this.h;
                    jg.i = new NN(this, 13);
                    UG ugA = jg.a();
                    this.p = ugA;
                    eblVar = new ebl(ugA, null, 10, 1);
                    com.bytedance.sdk.component.OY.lc.LD(new Bo0(eblVar));
                }
                byte[] bArr = new byte[8192];
                try {
                    NN nn3 = new NN(fileO, "r");
                    try {
                        nn3.g(c4084mo0.b);
                        int iMin = ((JW) this.h.d).e > 0 ? Math.min(kkA.c, ((JW) this.h.d).e) : kkA.c;
                        while (c4084mo0.b < iMin) {
                            a();
                            try {
                                int i2 = ((RandomAccessFile) nn3.b).read(bArr);
                                if (i2 <= 0) {
                                    UG ug2 = this.p;
                                    if (ug2 != null) {
                                        LG lg = ug2.r;
                                        if (lg != null) {
                                            throw lg;
                                        }
                                        C3433fS c3433fS = ug2.q;
                                        if (c3433fS != null) {
                                            throw c3433fS;
                                        }
                                    }
                                    if (ug2 == null || ug2.b() || ug2.j.get() == 2) {
                                        No0 no1 = AbstractC4648tE.f5026a;
                                        throw new Oo0("illegal state download task has finished, rawKey: " + this.f + ", url: " + xo0);
                                    }
                                    a();
                                    synchronized (ug2.o) {
                                        try {
                                            ug2.o.wait(1000L);
                                        } catch (InterruptedException unused) {
                                        }
                                    }
                                } else {
                                    try {
                                        c4084mo0.f4717a.write(bArr, 0, i2);
                                        c4084mo0.b += i2;
                                    } catch (IOException e) {
                                        throw new C4695tm0(e);
                                    }
                                }
                                a();
                            } catch (IOException e2) {
                                throw new C3433fS(e2);
                            }
                        }
                        No0 no2 = AbstractC4648tE.f5026a;
                        this.j.compareAndSet(0, 2);
                        nn3.f();
                        if (eblVar != null) {
                            try {
                                eblVar.get();
                                return;
                            } catch (Throwable unused2) {
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        nn2 = nn3;
                        if (nn2 != null) {
                            nn2.f();
                        }
                        if (eblVar != null) {
                            try {
                                eblVar.get();
                            } catch (Throwable unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        UG ug3 = this.p;
        this.p = null;
        if (ug3 != null) {
            ug3.d();
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i3 = c4084mo0.b;
        C4568sM c4568sMC = c(xo0, i3, ((JW) this.h.d).e, "GET");
        if (c4568sMC == null) {
            return;
        }
        try {
            String strF = PK.f(c4568sMC, false, true);
            if (strF != null) {
                throw new Oo0(strF + ", rawKey: " + this.f + ", url: " + xo0);
            }
            KK kkA2 = this.b.a(g(), this.g);
            int iB = PK.b(c4568sMC);
            if (kkA2 != null && kkA2.c != iB) {
                No0 no3 = AbstractC4648tE.f5026a;
                throw new LG("Content-Length not match, old length: " + kkA2.c + ", new length: " + iB + ", rawKey: " + this.f + ", currentUrl: " + xo0 + ", previousInfo: " + kkA2.e);
            }
            if (!c4084mo0.c) {
                String strE = PK.e(c4568sMC, i3);
                a();
                byte[] bytes = strE.getBytes(PK.b);
                c4084mo0.a(bytes, bytes.length);
            }
            a();
            File fileG = this.f3261a.g(this.g);
            if (!this.q || fileG == null || fileG.length() < c4084mo0.b) {
                if (AbstractC4648tE.c) {
                    fileG.length();
                }
                nn = null;
            } else {
                PK.c(c4568sMC, this.b, this.g, ((JW) this.h.d).f3268a);
                try {
                    nn = new NN(fileG, "rwd");
                    try {
                        nn.g(c4084mo0.b);
                        if (AbstractC4648tE.c) {
                            fileG.length();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        nn2 = nn;
                    }
                } catch (C3433fS unused4) {
                    nn = null;
                }
            }
            KK kkA3 = this.b.a(g(), this.g);
            int i4 = kkA3 == null ? 0 : kkA3.c;
            byte[] bArr2 = new byte[8192];
            InputStream inputStreamG = c4568sMC.g();
            int i5 = 0;
            while (true) {
                try {
                    int i6 = inputStreamG.read(bArr2);
                    if (i6 < 0) {
                        No0 no4 = AbstractC4648tE.f5026a;
                        this.j.compareAndSet(0, 2);
                        PK.j(c4568sMC.g());
                        if (nn != null) {
                            nn.f();
                        }
                        this.c.addAndGet(i5);
                        this.d.addAndGet(SystemClock.elapsedRealtime() - jElapsedRealtime);
                        return;
                    }
                    a();
                    if (i6 > 0) {
                        try {
                            c4084mo0.f4717a.write(bArr2, 0, i6);
                            c4084mo0.b += i6;
                            i5 += i6;
                            if (nn != null) {
                                try {
                                    try {
                                        ((RandomAccessFile) nn.b).write(bArr2, 0, i6);
                                    } catch (Throwable th4) {
                                        nn.f();
                                        try {
                                            if (AbstractC4648tE.c) {
                                                Log.getStackTraceString(th4);
                                            }
                                            nn = null;
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    }
                                } catch (IOException e3) {
                                    throw new C3433fS(e3);
                                }
                            }
                            e(i4, c4084mo0.b);
                        } catch (IOException e4) {
                            throw new C4695tm0(e4);
                        }
                    }
                    a();
                } catch (Throwable th6) {
                    th = th6;
                    nn2 = nn;
                }
                i = i5;
                PK.j(c4568sMC.g());
                if (nn2 != null) {
                    nn2.f();
                }
                this.c.addAndGet(i);
                this.d.addAndGet(SystemClock.elapsedRealtime() - jElapsedRealtime);
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final byte[] j(KK kk, C4084mo0 c4084mo0, Xo0 xo0) {
        if (kk != null) {
            No0 no0 = AbstractC4648tE.f5026a;
            return PK.d(kk, c4084mo0.b).getBytes(PK.b);
        }
        C4568sM c4568sMC = c(xo0, 0, -1, Net.HttpMethods.HEAD);
        if (c4568sMC == null) {
            return null;
        }
        try {
            String strF = PK.f(c4568sMC, false, false);
            if (strF == null) {
                KK kkC = PK.c(c4568sMC, this.b, this.g, ((JW) this.h.d).f3268a);
                No0 no1 = AbstractC4648tE.f5026a;
                byte[] bytes = PK.d(kkC, c4084mo0.b).getBytes(PK.b);
                PK.j(c4568sMC.g());
                return bytes;
            }
            throw new Oo0(strF + ", rawKey: " + this.f + ", url: " + xo0);
        } catch (Throwable th) {
            PK.j(c4568sMC.g());
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4084mo0 c4084mo0;
        No0 no0;
        try {
            this.h = C4568sM.c(this.m.getInputStream());
            OutputStream outputStream = this.m.getOutputStream();
            if (((JW) this.h.d).f3268a == 1) {
                No0 no1 = AbstractC4648tE.f5026a;
                no0 = null;
            } else {
                no0 = AbstractC4648tE.f5026a;
            }
            if (no0 == null) {
                No0 no2 = AbstractC4648tE.f5026a;
                c4084mo0 = null;
            } else {
                this.f3261a = no0;
                this.f = ((JW) this.h.d).b;
                this.g = ((JW) this.h.d).c;
                this.i = new Yo0(((JW) this.h.d).f);
                this.e = (List) this.h.b;
                if (AbstractC4648tE.c) {
                    this.h.toString();
                }
                c4084mo0 = new C4084mo0(outputStream, ((JW) this.h.d).d);
            }
        } catch (KW e) {
            PK.k(this.m);
            if (AbstractC4648tE.c) {
                Log.getStackTraceString(e);
            }
            if (this.f3261a != null) {
                f();
            }
        } catch (IOException e2) {
            PK.k(this.m);
            if (AbstractC4648tE.c) {
                Log.getStackTraceString(e2);
            }
            if (this.f3261a != null) {
                f();
            }
        }
        if (c4084mo0 == null) {
            return;
        }
        Wm0 wm0 = this.n;
        if (wm0 != null) {
            synchronized (((C4963wo0) wm0.b).f) {
                try {
                    Set set = (Set) ((C4963wo0) wm0.b).f.get(g());
                    if (set != null) {
                        set.add(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f3261a.f(this.g);
        if (AbstractC4648tE.h != 0) {
            KK kkA = this.b.a(((JW) this.h.d).f3268a, this.g);
            if (kkA == null || this.f3261a.o(this.g).length() < kkA.c) {
                this.o.a(f(), this.g);
            }
        }
        try {
            h(c4084mo0);
        } catch (MK e3) {
            if (AbstractC4648tE.c) {
                Log.getStackTraceString(e3);
            }
        } catch (Throwable th2) {
            if (AbstractC4648tE.c) {
                Log.getStackTraceString(th2);
            }
        }
        this.f3261a.e(this.g);
        this.o.a(f(), null);
        d();
        PK.k(this.m);
        Wm0 wm1 = this.n;
        if (wm1 != null) {
            wm1.x(this);
        }
    }
}
