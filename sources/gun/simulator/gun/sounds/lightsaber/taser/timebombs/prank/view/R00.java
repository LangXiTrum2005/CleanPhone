package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.util.SparseArray;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Locale;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class R00 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q00 f3638a;
    public final P00 b;
    public final String c;
    public final SocketFactory d;
    public final boolean e;
    public Uri i;
    public Ig0 k;
    public String l;
    public N00 m;
    public BR n;
    public boolean p;
    public boolean q;
    public boolean r;
    public final ArrayDeque f = new ArrayDeque();
    public final SparseArray g = new SparseArray();
    public final A70 h = new A70(this, 0);
    public C3398f10 j = new C3398f10(new O00(this));
    public long s = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public int o = -1;

    public R00(U00 u00, U00 u01, String str, Uri uri, SocketFactory socketFactory, boolean z) {
        this.f3638a = u00;
        this.b = u01;
        this.c = str;
        this.d = socketFactory;
        this.e = z;
        this.i = AbstractC3486g10.g(uri);
        this.k = AbstractC3486g10.e(uri);
    }

    public static C3965lY k(C4635t50 c4635t50, Uri uri) {
        C4998xC c4998xC = new C4998xC();
        for (int i = 0; i < c4635t50.b.size(); i++) {
            QN qn = (QN) c4635t50.b.get(i);
            if (J00.a(qn)) {
                c4998xC.H0(new C2956a10(qn, uri));
            }
        }
        return c4998xC.J0();
    }

    public static void r(R00 r00, C3124bu c3124bu) {
        r00.getClass();
        if (r00.p) {
            ((U00) r00.b).f3804a.l = c3124bu;
            return;
        }
        String message = c3124bu.getMessage();
        int i = AbstractC5192zU.f5327a;
        if (message == null) {
            message = "";
        }
        ((U00) r00.f3638a).g(message, c3124bu);
    }

    public static void t(R00 r00, List list) {
        if (r00.e) {
            SE.c("\n").b(list);
            AbstractC4038mJ.b();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        N00 n00 = this.m;
        if (n00 != null) {
            n00.close();
            this.m = null;
            A70 a70 = this.h;
            Uri uri = this.i;
            String str = this.l;
            str.getClass();
            R00 r00 = (R00) a70.d;
            int i = r00.o;
            if (i != -1 && i != 0) {
                r00.o = 0;
                a70.k(a70.e(12, str, C4405qY.g, uri));
            }
        }
        this.j.close();
    }

    public final void u() {
        long jW;
        V00 v00 = (V00) this.f.pollFirst();
        if (v00 == null) {
            Y00 y00 = ((U00) this.b).f3804a;
            long j = y00.n;
            if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                jW = Ug0.W(j);
            } else {
                long j2 = y00.o;
                jW = j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? Ug0.W(j2) : 0L;
            }
            y00.d.y(jW);
            return;
        }
        A70 a70 = this.h;
        Uri uriA = v00.a();
        FW.t(v00.c);
        String str = v00.c;
        String str2 = this.l;
        ((R00) a70.d).o = 0;
        FW.k("Transport", str);
        a70.k(a70.e(10, str2, C4405qY.g(1, new Object[]{"Transport", str}, null), uriA));
    }

    public final Socket v(Uri uri) {
        FW.h(uri.getHost() != null);
        int port = uri.getPort() > 0 ? uri.getPort() : 554;
        String host = uri.getHost();
        host.getClass();
        return this.d.createSocket(host, port);
    }

    public final void w() {
        try {
            close();
            C3398f10 c3398f10 = new C3398f10(new O00(this));
            this.j = c3398f10;
            c3398f10.a(v(this.i));
            this.l = null;
            this.q = false;
            this.n = null;
        } catch (IOException e) {
            ((U00) this.b).f3804a.l = new C3124bu((Throwable) e);
        }
    }

    public final void x(long j) {
        if (this.o == 2 && !this.r) {
            A70 a70 = this.h;
            Uri uri = this.i;
            String str = this.l;
            str.getClass();
            FW.s(((R00) a70.d).o == 2);
            a70.k(a70.e(5, str, C4405qY.g, uri));
            ((R00) a70.d).r = true;
        }
        this.s = j;
    }

    public final void y(long j) {
        A70 a70 = this.h;
        Uri uri = this.i;
        String str = this.l;
        str.getClass();
        int i = ((R00) a70.d).o;
        FW.s(i == 1 || i == 2);
        C3662i10 c3662i10 = C3662i10.c;
        Object[] objArr = {Double.valueOf(j / 1000.0d)};
        int i2 = Ug0.f3833a;
        a70.k(a70.e(6, str, C4405qY.g(1, new Object[]{"Range", String.format(Locale.US, "npt=%.3f-", objArr)}, null), uri));
    }
}
