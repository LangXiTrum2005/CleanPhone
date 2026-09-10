package sg.bigo.ads.common.u.a;

import android.net.TrafficStats;
import android.text.TextUtils;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.io.Closeable;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.URL;
import org.apache.http.conn.ConnectTimeoutException;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.u.h;
import sg.bigo.ads.common.u.i;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements sg.bigo.ads.common.u.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f47440a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f47441b;

    /* JADX INFO: renamed from: sg.bigo.ads.common.u.a.a$a, reason: collision with other inner class name */
    public static class C0848a implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f47444a;

        public C0848a(d dVar) {
            this.f47444a = dVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            d dVar = this.f47444a;
            if (dVar != null) {
                dVar.f47451a.disconnect();
            }
        }
    }

    public a(g gVar) {
        this.f47441b = gVar;
        e.k();
    }

    private void a(c cVar, sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.c, sg.bigo.ads.common.u.c.c> bVar, boolean z2) {
        InputStream inputStreamA;
        int i2;
        URL url;
        TrafficStats.setThreadStatsTag(9999000);
        d dVar = null;
        boolean z3 = false;
        try {
            d dVar2 = new d(cVar);
            try {
                d.a aVarB = dVar2.b();
                if (aVarB != null) {
                    bVar.a(cVar.f47446a, aVarB.f47456b, aVarB.f47458e);
                    if (aVarB.f47457c == 0 && (url = aVarB.f47455a) != null) {
                        this.f47440a.a(cVar.f47447b, url);
                        try {
                            c cVarA = cVar.a(aVarB.f47455a);
                            sg.bigo.ads.common.t.a.a(0, 3, "AndroidNetClient", "process redirect, " + aVarB.f47455a);
                            if (cVar.f47448c) {
                                cVar.f47446a.a("Accept-Encoding");
                            }
                            a(cVarA, bVar, z2);
                            sg.bigo.ads.common.utils.g.a((Closeable) null);
                            dVar2.f47451a.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            return;
                        } catch (i unused) {
                        }
                    }
                }
                if (bVar.a(cVar.f47446a, dVar2.f47452b)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "AndroidNetClient", cVar + ", responseCode = " + dVar2.f47452b + ", is valid.");
                    inputStreamA = dVar2.a();
                    try {
                        a(bVar, cVar, bVar.a(new sg.bigo.ads.common.u.c.a(cVar.f47446a.f47471i, dVar2.f47452b, inputStreamA, dVar2.f47453c, z2 ? null : new C0848a(dVar2))));
                    } catch (Throwable th) {
                        th = th;
                        dVar = dVar2;
                        try {
                            if (th instanceof SocketTimeoutException) {
                                i2 = IronSourceError.ERROR_NT_INIT_FAILED_AFTER_LOAD;
                            } else {
                                i2 = th instanceof ConnectTimeoutException ? IronSourceError.ERROR_NT_LOAD_AFTER_LONG_INITIATION : 700;
                            }
                            a(bVar, cVar, new h(i2, th.getMessage()));
                            sg.bigo.ads.common.t.a.a(0, "AndroidNetClient", cVar + ", error = " + th.getMessage());
                            sg.bigo.ads.common.utils.g.a((Closeable) inputStreamA);
                            if (dVar != null) {
                                dVar.f47451a.disconnect();
                            }
                            return;
                        } finally {
                            if (z2) {
                                sg.bigo.ads.common.utils.g.a((Closeable) inputStreamA);
                                if (dVar != null) {
                                    dVar.f47451a.disconnect();
                                }
                            }
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                } else {
                    String strA = aVarB != null ? aVarB.d : null;
                    InputStream errorStream = dVar2.f47451a.getErrorStream();
                    if (TextUtils.isEmpty(strA)) {
                        strA = sg.bigo.ads.common.utils.g.a(errorStream);
                    }
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(strA)) {
                        sb.append(strA);
                        sb.append(", ");
                    }
                    sb.append("responseCode is ");
                    sb.append(dVar2.f47452b);
                    sb.append(", validate fail.");
                    sg.bigo.ads.common.t.a.a(0, "AndroidNetClient", cVar + ", responseCode = " + dVar2.f47452b + ", is invalid.");
                    a(bVar, cVar, new sg.bigo.ads.common.u.e(dVar2.f47452b, sb.toString()));
                    z3 = true;
                    inputStreamA = errorStream;
                }
                if (z2 || z3) {
                    sg.bigo.ads.common.utils.g.a((Closeable) inputStreamA);
                    dVar2.f47451a.disconnect();
                }
                TrafficStats.clearThreadStatsTag();
            } catch (Throwable th2) {
                th = th2;
                inputStreamA = null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamA = null;
        }
    }

    @Override // sg.bigo.ads.common.u.d
    public final void b(sg.bigo.ads.common.u.b.c cVar, sg.bigo.ads.common.u.b bVar) {
        new e(cVar.k, cVar, bVar) { // from class: sg.bigo.ads.common.u.a.a.2
            @Override // sg.bigo.ads.common.u.a.e
            public final void a(sg.bigo.ads.common.u.b.c cVar2, sg.bigo.ads.common.u.b bVar2) {
                a.this.a(cVar2, (sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.c, sg.bigo.ads.common.u.c.c>) bVar2, true);
            }
        }.l();
    }

    @Override // sg.bigo.ads.common.u.d
    public final void c(sg.bigo.ads.common.u.b.c cVar, sg.bigo.ads.common.u.b bVar) {
        a(cVar, (sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.c, sg.bigo.ads.common.u.c.c>) bVar, false);
    }

    @Override // sg.bigo.ads.common.u.d
    public final void a(sg.bigo.ads.common.u.b.c cVar, sg.bigo.ads.common.u.b bVar) {
        new e(cVar.k, cVar, bVar) { // from class: sg.bigo.ads.common.u.a.a.1
            @Override // sg.bigo.ads.common.u.a.e
            public final void a(sg.bigo.ads.common.u.b.c cVar2, sg.bigo.ads.common.u.b bVar2) {
                a.this.a(cVar2, (sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.c, sg.bigo.ads.common.u.c.c>) bVar2, true);
            }
        }.l();
    }

    public final void a(sg.bigo.ads.common.u.b.c cVar, sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.c, sg.bigo.ads.common.u.c.c> bVar, boolean z2) {
        a(new c(cVar, this.f47440a, this.f47441b), bVar, z2);
    }

    private static void a(sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.c, sg.bigo.ads.common.u.c.c> bVar, c cVar, sg.bigo.ads.common.u.c.c cVar2) {
        if (!cVar.b()) {
            cVar.f47446a.j.c();
        }
        bVar.a(cVar.f47446a, cVar2);
    }

    private static void a(sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.c, sg.bigo.ads.common.u.c.c> bVar, c cVar, h hVar) {
        if (!cVar.b()) {
            T t = cVar.f47446a.j;
            if (hVar.getClass() == h.class) {
                t.b();
            } else if (hVar.getClass() == sg.bigo.ads.common.u.e.class) {
                t.c();
            }
        }
        bVar.a(cVar.f47446a, hVar);
    }
}
