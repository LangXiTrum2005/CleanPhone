package xn;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zc.u f54002a = new zc.u(23);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qj.x f54003b = new qj.x(23);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f54004c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f54005d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public xa.b f54006e = new xa.b(25);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f54007f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f54008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f54009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f54010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f54011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f54012k;
    public ProxySelector l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f54013m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SocketFactory f54014n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SSLSocketFactory f54015o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public X509TrustManager f54016p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f54017q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f54018r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ko.c f54019s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f f54020t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.google.android.gms.internal.auth.i f54021u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f54022v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f54023w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f54024x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f54025y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public od.c f54026z;

    public p() {
        b bVar = b.f53927a;
        this.f54008g = bVar;
        this.f54009h = true;
        this.f54010i = true;
        this.f54011j = b.f53928b;
        this.f54012k = b.f53929c;
        this.f54013m = bVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        kotlin.jvm.internal.n.e(socketFactory, "getDefault()");
        this.f54014n = socketFactory;
        this.f54017q = q.B;
        this.f54018r = q.A;
        this.f54019s = ko.c.f44753a;
        this.f54020t = f.f53943c;
        this.f54022v = 10000;
        this.f54023w = 10000;
        this.f54024x = 10000;
        this.f54025y = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
    }
}
