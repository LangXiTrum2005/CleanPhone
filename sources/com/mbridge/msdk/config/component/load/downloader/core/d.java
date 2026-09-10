package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f32122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.b f32123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f32125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f32126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Future f32127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap<String, List<String>> f32128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.f f32129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f32130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f32131j;
    private int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f32133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f32134n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f32136p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f32137q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f32138r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile int f32132k = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f32135o = 0;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f32139a;

        public a(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f32139a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f32129h != null) {
                    d.this.f32129h.a(this.f32139a);
                }
                d.this.a();
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f32141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.a f32142b;

        public b(com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
            this.f32141a = bVar;
            this.f32142b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f32132k >= d.this.f32131j) {
                    d.this.b(4);
                    if (d.this.f32129h != null) {
                        d.this.f32129h.a(this.f32141a, this.f32142b);
                    }
                    d.this.a();
                    return;
                }
                d.this.b(7);
                d.this.f32132k++;
                com.mbridge.msdk.config.component.load.downloader.core.f.a().b(d.this);
                com.mbridge.msdk.config.component.load.downloader.core.f.a().a(d.this);
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f32144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DownloadProgress f32145b;

        public c(com.mbridge.msdk.config.component.load.downloader.b bVar, DownloadProgress downloadProgress) {
            this.f32144a = bVar;
            this.f32145b = downloadProgress;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f32129h != null) {
                    d.this.f32129h.a(this.f32144a, this.f32145b);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class RunnableC0105d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f32147a;

        public RunnableC0105d(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f32147a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f32129h != null) {
                    d.this.f32129h.c(this.f32147a);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f32149a;

        public e(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f32149a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f32129h != null) {
                    d.this.f32129h.b(this.f32149a);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f32151a;

        public f(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f32151a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f32126e != null && !d.this.f32126e.isEmpty()) {
                    String str = (String) d.this.f32126e.get("responseHeaders");
                    if (!TextUtils.isEmpty(str)) {
                        this.f32151a.a("responseHeaders", str);
                    }
                }
                if (d.this.f32129h != null) {
                    d.this.f32129h.d(this.f32151a);
                }
                d.this.a();
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    public d(com.mbridge.msdk.config.component.load.downloader.core.e eVar) {
        this.f32128g = eVar.f32158f;
        this.f32124c = eVar.f32155c;
        this.f32130i = eVar.f32159g;
        this.f32122a = eVar.f32153a;
        this.f32136p = eVar.f32162j;
        this.f32123b = eVar.f32154b;
        this.f32138r = eVar.f32163k;
        this.f32129h = eVar.f32156d;
        this.f32131j = eVar.f32160h;
        this.f32134n = eVar.f32161i;
        this.f32126e = eVar.f32157e;
    }

    public long f() {
        return this.f32125d;
    }

    public long g() {
        return this.f32130i;
    }

    public int h() {
        return this.l;
    }

    public int i() {
        return this.f32133m;
    }

    public long j() {
        return this.f32134n;
    }

    public long k() {
        return this.f32135o;
    }

    public long l() {
        return this.f32138r;
    }

    public void m() {
        com.mbridge.msdk.config.component.load.downloader.core.f.a().a(this);
    }

    public long b() {
        return this.f32122a;
    }

    public com.mbridge.msdk.config.component.load.downloader.b c() {
        return this.f32123b;
    }

    public int d() {
        return this.f32124c;
    }

    public String e() {
        com.mbridge.msdk.config.component.load.downloader.b bVar = this.f32123b;
        if (bVar != null) {
            return bVar.f();
        }
        return null;
    }

    public static d a(com.mbridge.msdk.config.component.load.downloader.core.e eVar) {
        return new d(eVar);
    }

    public void b(int i10) {
        this.f32133m = i10;
    }

    public void c(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        if (this.f32133m != 5) {
            i.b().a().getDownloadResultTasks().execute(new e(bVar));
            l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(bVar.f(), bVar.h(), System.currentTimeMillis(), 0L, System.currentTimeMillis(), k(), f(), 0, this.f32137q, 0, "", bVar.b(), bVar.a()), bVar.h());
        }
    }

    public void d(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        if (this.f32133m != 5) {
            i.b().a().getDownloadResultTasks().execute(new RunnableC0105d(bVar));
            l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(bVar.f(), bVar.h(), System.currentTimeMillis(), 0L, System.currentTimeMillis(), k(), f(), 0, this.f32137q, 2, "", bVar.b(), bVar.a()));
        }
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        this.f32133m = 5;
        Future future = this.f32127f;
        if (future != null) {
            future.cancel(false);
        }
    }

    public void b(long j10) {
        this.f32135o = j10;
    }

    public void e(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        if (this.f32133m != 5) {
            b(1);
            i.b().a().getDownloadResultTasks().execute(new f(bVar));
            l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(bVar.f(), bVar.h(), bVar.g(), bVar.i(), System.currentTimeMillis(), k(), f(), bVar.d(), this.f32137q, 1, bVar.j(), bVar.b(), bVar.a()), bVar.h());
        }
    }

    public void b(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        i.b().a().getDownloadResultTasks().execute(new a(bVar));
    }

    public void a(long j10) {
        this.f32125d = j10;
    }

    public void a(int i10) {
        this.l = i10;
    }

    public void a(String str) {
        this.f32137q = str;
    }

    public void a(Future future) {
        this.f32127f = future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f32129h = null;
        com.mbridge.msdk.config.component.load.downloader.core.f.a().b(this);
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
        if (this.f32133m != 5) {
            b(4);
            i.b().a().getDownloadResultTasks().execute(new b(bVar, aVar));
            q0.b("DownloadRequest", aVar.a().getMessage());
            l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(bVar.f(), bVar.h(), bVar.g(), 0L, 0L, k(), f(), bVar.d(), this.f32137q, 4, "", bVar.b(), bVar.a()), bVar.h());
        }
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b bVar, DownloadProgress downloadProgress) {
        if (this.f32133m != 5) {
            i.b().a().getDownloadResultTasks().execute(new c(bVar, downloadProgress));
        }
    }
}
