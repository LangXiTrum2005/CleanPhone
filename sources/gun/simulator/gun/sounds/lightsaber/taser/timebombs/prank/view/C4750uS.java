package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.support.v4.media.session.PlaybackStateCompat;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4750uS {
    public int A;
    public int B;
    public long C;
    public C3830jy D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3605hO f5079a;
    public C2294Ar b;
    public final ArrayList c;
    public final ArrayList d;
    public InterfaceC2839Vr e;
    public boolean f;
    public InterfaceC5166z7 g;
    public boolean h;
    public boolean i;
    public InterfaceC3108bk j;
    public C4850vc k;
    public InterfaceC5140yp l;
    public Proxy m;
    public ProxySelector n;
    public InterfaceC5166z7 o;
    public SocketFactory p;
    public SSLSocketFactory q;
    public X509TrustManager r;
    public List s;
    public List t;
    public HostnameVerifier u;
    public C4500rd v;
    public AbstractC3375el w;
    public int x;
    public int y;
    public int z;

    public C4750uS() {
        C3605hO c3605hO = new C3605hO();
        c3605hO.b = 64;
        c3605hO.c = 5;
        c3605hO.e = new ArrayDeque();
        c3605hO.f = new ArrayDeque();
        c3605hO.g = new ArrayDeque();
        this.f5079a = c3605hO;
        this.b = new C2294Ar(8);
        this.c = new ArrayList();
        this.d = new ArrayList();
        AbstractC2865Wr abstractC2865Wr = AbstractC2865Wr.NONE;
        byte[] bArr = Vg0.f3884a;
        AbstractC2995aW.q(abstractC2865Wr, "<this>");
        this.e = new C4808v4(abstractC2865Wr);
        this.f = true;
        G7 g7 = InterfaceC5166z7.Y0;
        this.g = g7;
        this.h = true;
        this.i = true;
        this.j = InterfaceC3108bk.b1;
        this.l = InterfaceC5140yp.c1;
        this.o = g7;
        SocketFactory socketFactory = SocketFactory.getDefault();
        AbstractC2995aW.p(socketFactory, "getDefault()");
        this.p = socketFactory;
        this.s = C4838vS.F;
        this.t = C4838vS.E;
        this.u = C4135nS.f4744a;
        this.v = C4500rd.c;
        this.y = 10000;
        this.z = 10000;
        this.A = 10000;
        this.C = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    public final void a(long j, TimeUnit timeUnit) {
        AbstractC2995aW.q(timeUnit, "unit");
        this.y = Vg0.b(j, timeUnit);
    }

    public final void b(long j, TimeUnit timeUnit) {
        AbstractC2995aW.q(timeUnit, "unit");
        this.z = Vg0.b(j, timeUnit);
    }
}
