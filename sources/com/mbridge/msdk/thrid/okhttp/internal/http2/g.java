package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Closeable {
    static final /* synthetic */ boolean A = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final ExecutorService f36447z = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Http2Connection", true));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f36448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final j f36449b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f36451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f36452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f36453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ScheduledExecutorService f36455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ExecutorService f36456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.http2.l f36457j;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    long f36465s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final m f36467u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final Socket f36468v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.http2.j f36469w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final l f36470x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final Set<Integer> f36471y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map<Integer, com.mbridge.msdk.thrid.okhttp.internal.http2.i> f36450c = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f36458k = 0;
    private long l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f36459m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f36460n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f36461o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f36462p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f36463q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    long f36464r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    m f36466t = new m();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.b f36473c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
            super(str, objArr);
            this.f36472b = i10;
            this.f36473c = bVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            try {
                g.this.b(this.f36472b, this.f36473c);
            } catch (IOException unused) {
                g.this.h();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f36476c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i10, long j10) {
            super(str, objArr);
            this.f36475b = i10;
            this.f36476c = j10;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            try {
                g.this.f36469w.a(this.f36475b, this.f36476c);
            } catch (IOException unused) {
                g.this.h();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c extends com.mbridge.msdk.thrid.okhttp.internal.b {
        public c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            g.this.a(false, 2, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f36480c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, int i10, List list) {
            super(str, objArr);
            this.f36479b = i10;
            this.f36480c = list;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            if (g.this.f36457j.a(this.f36479b, this.f36480c)) {
                try {
                    g.this.f36469w.a(this.f36479b, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                    synchronized (g.this) {
                        try {
                            g.this.f36471y.remove(Integer.valueOf(this.f36479b));
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f36483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f36484d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, int i10, List list, boolean z10) {
            super(str, objArr);
            this.f36482b = i10;
            this.f36483c = list;
            this.f36484d = z10;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            boolean zA = g.this.f36457j.a(this.f36482b, this.f36483c, this.f36484d);
            if (zA) {
                try {
                    g.this.f36469w.a(this.f36482b, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (zA || this.f36484d) {
                synchronized (g.this) {
                    try {
                        g.this.f36471y.remove(Integer.valueOf(this.f36482b));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.thrid.okio.c f36487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f36488d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f36489e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object[] objArr, int i10, com.mbridge.msdk.thrid.okio.c cVar, int i11, boolean z10) {
            super(str, objArr);
            this.f36486b = i10;
            this.f36487c = cVar;
            this.f36488d = i11;
            this.f36489e = z10;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            try {
                boolean zA = g.this.f36457j.a(this.f36486b, this.f36487c, this.f36488d, this.f36489e);
                if (zA) {
                    g.this.f36469w.a(this.f36486b, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                }
                if (zA || this.f36489e) {
                    synchronized (g.this) {
                        g.this.f36471y.remove(Integer.valueOf(this.f36486b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0187g extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.b f36492c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0187g(String str, Object[] objArr, int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
            super(str, objArr);
            this.f36491b = i10;
            this.f36492c = bVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            g.this.f36457j.a(this.f36491b, this.f36492c);
            synchronized (g.this) {
                g.this.f36471y.remove(Integer.valueOf(this.f36491b));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class i extends com.mbridge.msdk.thrid.okhttp.internal.b {
        public i() {
            super("OkHttp %s ping", g.this.f36451d);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            boolean z10;
            synchronized (g.this) {
                if (g.this.l < g.this.f36458k) {
                    z10 = true;
                } else {
                    g.e(g.this);
                    z10 = false;
                }
            }
            if (z10) {
                g.this.h();
            } else {
                g.this.a(false, 1, 0);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static abstract class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f36503a = new a();

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static class a extends j {
            @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.g.j
            public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) throws IOException {
                iVar.a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
            }
        }

        public void a(g gVar) {
        }

        public abstract void a(com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) throws IOException;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class k extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f36504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f36505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f36506d;

        public k(boolean z10, int i10, int i11) {
            super("OkHttp %s ping %08x%08x", g.this.f36451d, Integer.valueOf(i10), Integer.valueOf(i11));
            this.f36504b = z10;
            this.f36505c = i10;
            this.f36506d = i11;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            g.this.a(this.f36504b, this.f36505c, this.f36506d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class l extends com.mbridge.msdk.thrid.okhttp.internal.b implements com.mbridge.msdk.thrid.okhttp.internal.http2.h.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.mbridge.msdk.thrid.okhttp.internal.http2.h f36508b;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a extends com.mbridge.msdk.thrid.okhttp.internal.b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.i f36510b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Object[] objArr, com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) {
                super(str, objArr);
                this.f36510b = iVar;
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.b
            public void b() {
                try {
                    g.this.f36449b.a(this.f36510b);
                } catch (IOException e10) {
                    com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(4, "Http2Connection.Listener failure for " + g.this.f36451d, e10);
                    try {
                        this.f36510b.a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class b extends com.mbridge.msdk.thrid.okhttp.internal.b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f36512b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m f36513c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object[] objArr, boolean z10, m mVar) {
                super(str, objArr);
                this.f36512b = z10;
                this.f36513c = mVar;
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.b
            public void b() {
                l.this.b(this.f36512b, this.f36513c);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class c extends com.mbridge.msdk.thrid.okhttp.internal.b {
            public c(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.b
            public void b() {
                g gVar = g.this;
                gVar.f36449b.a(gVar);
            }
        }

        public l(com.mbridge.msdk.thrid.okhttp.internal.http2.h hVar) {
            super("OkHttp %s", g.this.f36451d);
            this.f36508b = hVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() throws Throwable {
            Throwable th2;
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar;
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar2 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.INTERNAL_ERROR;
            try {
                try {
                    this.f36508b.a(this);
                    while (this.f36508b.a(false, (com.mbridge.msdk.thrid.okhttp.internal.http2.h.b) this)) {
                    }
                    bVar = com.mbridge.msdk.thrid.okhttp.internal.http2.b.NO_ERROR;
                    try {
                        try {
                            g.this.a(bVar, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                        } catch (Throwable th3) {
                            th2 = th3;
                            try {
                                g.this.a(bVar, bVar2);
                            } catch (IOException unused) {
                            }
                            com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f36508b);
                            throw th2;
                        }
                    } catch (IOException unused2) {
                        com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar3 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR;
                        g.this.a(bVar3, bVar3);
                    }
                } catch (IOException unused3) {
                    bVar = bVar2;
                } catch (Throwable th4) {
                    th2 = th4;
                    bVar = bVar2;
                    g.this.a(bVar, bVar2);
                    com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f36508b);
                    throw th2;
                }
            } catch (IOException unused4) {
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f36508b);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, int i11, int i12, boolean z10) {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, int i10, com.mbridge.msdk.thrid.okio.e eVar, int i11) throws IOException {
            if (g.this.b(i10)) {
                g.this.a(i10, eVar, i11, z10);
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarA = g.this.a(i10);
            if (iVarA == null) {
                g.this.c(i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR);
                long j10 = i11;
                g.this.g(j10);
                eVar.skip(j10);
                return;
            }
            iVarA.a(eVar, i11);
            if (z10) {
                iVarA.i();
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, int i10, int i11, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
            if (g.this.b(i10)) {
                g.this.b(i10, list, z10);
                return;
            }
            synchronized (g.this) {
                try {
                    com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarA = g.this.a(i10);
                    if (iVarA == null) {
                        if (g.this.f36454g) {
                            return;
                        }
                        g gVar = g.this;
                        if (i10 <= gVar.f36452e) {
                            return;
                        }
                        if (i10 % 2 == gVar.f36453f % 2) {
                            return;
                        }
                        com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar = new com.mbridge.msdk.thrid.okhttp.internal.http2.i(i10, g.this, false, z10, com.mbridge.msdk.thrid.okhttp.internal.c.b(list));
                        g gVar2 = g.this;
                        gVar2.f36452e = i10;
                        gVar2.f36450c.put(Integer.valueOf(i10), iVar);
                        g.f36447z.execute(new a("OkHttp %s stream %d", new Object[]{g.this.f36451d, Integer.valueOf(i10)}, iVar));
                        return;
                    }
                    iVarA.a(list);
                    if (z10) {
                        iVarA.i();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void b(boolean z10, m mVar) {
            com.mbridge.msdk.thrid.okhttp.internal.http2.i[] iVarArr;
            long j10;
            synchronized (g.this.f36469w) {
                synchronized (g.this) {
                    try {
                        int iC = g.this.f36467u.c();
                        if (z10) {
                            g.this.f36467u.a();
                        }
                        g.this.f36467u.a(mVar);
                        int iC2 = g.this.f36467u.c();
                        iVarArr = null;
                        if (iC2 == -1 || iC2 == iC) {
                            j10 = 0;
                        } else {
                            j10 = iC2 - iC;
                            if (!g.this.f36450c.isEmpty()) {
                                iVarArr = (com.mbridge.msdk.thrid.okhttp.internal.http2.i[]) g.this.f36450c.values().toArray(new com.mbridge.msdk.thrid.okhttp.internal.http2.i[g.this.f36450c.size()]);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    g gVar = g.this;
                    gVar.f36469w.a(gVar.f36467u);
                } catch (IOException unused) {
                    g.this.h();
                }
            }
            if (iVarArr != null) {
                for (com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(j10);
                    }
                }
            }
            g.f36447z.execute(new c("OkHttp %s settings", g.this.f36451d));
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
            if (g.this.b(i10)) {
                g.this.a(i10, bVar);
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarC = g.this.c(i10);
            if (iVarC != null) {
                iVarC.d(bVar);
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, m mVar) {
            try {
                g.this.f36455h.execute(new b("OkHttp %s ACK Settings", new Object[]{g.this.f36451d}, z10, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, int i10, int i11) {
            if (!z10) {
                try {
                    g.this.f36455h.execute(g.this.new k(true, i10, i11));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (g.this) {
                try {
                    if (i10 == 1) {
                        g.c(g.this);
                    } else if (i10 == 2) {
                        g.h(g.this);
                    } else if (i10 == 3) {
                        g.i(g.this);
                        g.this.notifyAll();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar, com.mbridge.msdk.thrid.okio.f fVar) {
            com.mbridge.msdk.thrid.okhttp.internal.http2.i[] iVarArr;
            fVar.j();
            synchronized (g.this) {
                iVarArr = (com.mbridge.msdk.thrid.okhttp.internal.http2.i[]) g.this.f36450c.values().toArray(new com.mbridge.msdk.thrid.okhttp.internal.http2.i[g.this.f36450c.size()]);
                g.this.f36454g = true;
            }
            for (com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar : iVarArr) {
                if (iVar.c() > i10 && iVar.f()) {
                    iVar.d(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
                    g.this.c(iVar.c());
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, long j10) {
            if (i10 == 0) {
                synchronized (g.this) {
                    g gVar = g.this;
                    gVar.f36465s += j10;
                    gVar.notifyAll();
                }
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarA = g.this.a(i10);
            if (iVarA != null) {
                synchronized (iVarA) {
                    iVarA.a(j10);
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, int i11, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) throws Throwable {
            g.this.a(i11, list);
        }
    }

    public g(h hVar) {
        m mVar = new m();
        this.f36467u = mVar;
        this.f36471y = new LinkedHashSet();
        this.f36457j = hVar.f36499f;
        boolean z10 = hVar.f36500g;
        this.f36448a = z10;
        this.f36449b = hVar.f36498e;
        int i10 = z10 ? 1 : 2;
        this.f36453f = i10;
        if (z10) {
            this.f36453f = i10 + 2;
        }
        if (z10) {
            this.f36466t.a(7, 16777216);
        }
        String str = hVar.f36495b;
        this.f36451d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp %s Writer", str), false));
        this.f36455h = scheduledThreadPoolExecutor;
        if (hVar.f36501h != 0) {
            i iVar = new i();
            long j10 = hVar.f36501h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, j10, j10, TimeUnit.MILLISECONDS);
        }
        this.f36456i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp %s Push Observer", str), true));
        mVar.a(7, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        mVar.a(5, Http2.INITIAL_MAX_FRAME_SIZE);
        this.f36465s = mVar.c();
        this.f36468v = hVar.f36494a;
        this.f36469w = new com.mbridge.msdk.thrid.okhttp.internal.http2.j(hVar.f36497d, z10);
        this.f36470x = new l(new com.mbridge.msdk.thrid.okhttp.internal.http2.h(hVar.f36496c, z10));
    }

    public static /* synthetic */ long c(g gVar) {
        long j10 = gVar.l;
        gVar.l = 1 + j10;
        return j10;
    }

    public static /* synthetic */ long e(g gVar) {
        long j10 = gVar.f36458k;
        gVar.f36458k = 1 + j10;
        return j10;
    }

    public static /* synthetic */ long h(g gVar) {
        long j10 = gVar.f36460n;
        gVar.f36460n = 1 + j10;
        return j10;
    }

    public static /* synthetic */ long i(g gVar) {
        long j10 = gVar.f36462p;
        gVar.f36462p = 1 + j10;
        return j10;
    }

    public boolean b(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.NO_ERROR, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
    }

    public void flush() throws IOException {
        this.f36469w.flush();
    }

    public synchronized int k() {
        return this.f36467u.b(Integer.MAX_VALUE);
    }

    public void l() {
        synchronized (this) {
            try {
                long j10 = this.f36460n;
                long j11 = this.f36459m;
                if (j10 < j11) {
                    return;
                }
                this.f36459m = j11 + 1;
                this.f36463q = System.nanoTime() + C.NANOS_PER_SECOND;
                try {
                    this.f36455h.execute(new c("OkHttp %s ping", this.f36451d));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m() throws IOException {
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        try {
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar = com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR;
            a(bVar, bVar);
        } catch (IOException unused) {
        }
    }

    public synchronized com.mbridge.msdk.thrid.okhttp.internal.http2.i c(int i10) {
        com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarRemove;
        iVarRemove = this.f36450c.remove(Integer.valueOf(i10));
        notifyAll();
        return iVarRemove;
    }

    public synchronized boolean f(long j10) {
        if (this.f36454g) {
            return false;
        }
        return this.f36460n >= this.f36459m || j10 < this.f36463q;
    }

    public synchronized void g(long j10) {
        long j11 = this.f36464r + j10;
        this.f36464r = j11;
        if (j11 >= this.f36466t.c() / 2) {
            a(0, this.f36464r);
            this.f36464r = 0L;
        }
    }

    public synchronized com.mbridge.msdk.thrid.okhttp.internal.http2.i a(int i10) {
        return this.f36450c.get(Integer.valueOf(i10));
    }

    public void b(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        this.f36469w.a(i10, bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Socket f36494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f36495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        com.mbridge.msdk.thrid.okio.e f36496c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        com.mbridge.msdk.thrid.okio.d f36497d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        j f36498e = j.f36503a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        com.mbridge.msdk.thrid.okhttp.internal.http2.l f36499f = com.mbridge.msdk.thrid.okhttp.internal.http2.l.f36565a;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f36500g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f36501h;

        public h(boolean z10) {
            this.f36500g = z10;
        }

        public h a(Socket socket, String str, com.mbridge.msdk.thrid.okio.e eVar, com.mbridge.msdk.thrid.okio.d dVar) {
            this.f36494a = socket;
            this.f36495b = str;
            this.f36496c = eVar;
            this.f36497d = dVar;
            return this;
        }

        public h a(j jVar) {
            this.f36498e = jVar;
            return this;
        }

        public h a(int i10) {
            this.f36501h = i10;
            return this;
        }

        public g a() {
            return new g(this);
        }
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http2.i a(List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list, boolean z10) throws IOException {
        return a(0, list, z10);
    }

    public void b(int i10, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list, boolean z10) {
        try {
            a(new e("OkHttp %s Push Headers[%s]", new Object[]{this.f36451d, Integer.valueOf(i10)}, i10, list, z10));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void c(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        try {
            this.f36455h.execute(new a("OkHttp %s stream %d", new Object[]{this.f36451d, Integer.valueOf(i10)}, i10, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    private com.mbridge.msdk.thrid.okhttp.internal.http2.i a(int i10, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list, boolean z10) throws IOException {
        Throwable th2;
        com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar;
        boolean z11;
        boolean z12 = !z10;
        synchronized (this.f36469w) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f36453f > 1073741823) {
                                try {
                                    a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
                                } catch (Throwable th3) {
                                    th2 = th3;
                                }
                            }
                            if (!this.f36454g) {
                                int i11 = this.f36453f;
                                this.f36453f = i11 + 2;
                                iVar = new com.mbridge.msdk.thrid.okhttp.internal.http2.i(i11, this, z12, false, null);
                                z11 = !z10 || this.f36465s == 0 || iVar.f36528b == 0;
                                if (iVar.g()) {
                                    this.f36450c.put(Integer.valueOf(i11), iVar);
                                }
                                if (i10 == 0) {
                                    this.f36469w.a(z12, i11, i10, list);
                                } else if (!this.f36448a) {
                                    this.f36469w.a(i10, i11, list);
                                } else {
                                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                }
                            } else {
                                throw new com.mbridge.msdk.thrid.okhttp.internal.http2.a();
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            th2 = th;
                        }
                        throw th2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
        if (z11) {
            this.f36469w.flush();
        }
        return iVar;
    }

    public void a(int i10, boolean z10, com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
        long j11;
        int iMin;
        long j12;
        if (j10 == 0) {
            this.f36469w.a(z10, i10, cVar, 0);
            return;
        }
        while (j10 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j11 = this.f36465s;
                            if (j11 <= 0) {
                                if (this.f36450c.containsKey(Integer.valueOf(i10))) {
                                    wait();
                                } else {
                                    throw new IOException("stream closed");
                                }
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                iMin = Math.min((int) Math.min(j10, j11), this.f36469w.h());
                j12 = iMin;
                this.f36465s -= j12;
            }
            j10 -= j12;
            this.f36469w.a(z10 && j10 == 0, i10, cVar, iMin);
        }
    }

    public void a(int i10, long j10) {
        try {
            this.f36455h.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f36451d, Integer.valueOf(i10)}, i10, j10));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void a(boolean z10, int i10, int i11) {
        try {
            this.f36469w.a(z10, i10, i11);
        } catch (IOException unused) {
            h();
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        synchronized (this.f36469w) {
            synchronized (this) {
                if (this.f36454g) {
                    return;
                }
                this.f36454g = true;
                this.f36469w.a(this.f36452e, bVar, com.mbridge.msdk.thrid.okhttp.internal.c.f36258a);
            }
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar2) throws IOException {
        if (!A && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        com.mbridge.msdk.thrid.okhttp.internal.http2.i[] iVarArr = null;
        try {
            a(bVar);
            e = null;
        } catch (IOException e10) {
            e = e10;
        }
        synchronized (this) {
            try {
                if (!this.f36450c.isEmpty()) {
                    iVarArr = (com.mbridge.msdk.thrid.okhttp.internal.http2.i[]) this.f36450c.values().toArray(new com.mbridge.msdk.thrid.okhttp.internal.http2.i[this.f36450c.size()]);
                    this.f36450c.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (iVarArr != null) {
            for (com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar : iVarArr) {
                try {
                    iVar.a(bVar2);
                } catch (IOException e11) {
                    if (e != null) {
                        e = e11;
                    }
                }
            }
        }
        try {
            this.f36469w.close();
        } catch (IOException e12) {
            if (e == null) {
                e = e12;
            }
        }
        try {
            this.f36468v.close();
        } catch (IOException e13) {
            e = e13;
        }
        this.f36455h.shutdown();
        this.f36456i.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public void a(boolean z10) throws IOException {
        if (z10) {
            this.f36469w.d();
            this.f36469w.b(this.f36466t);
            int iC = this.f36466t.c();
            if (iC != 65535) {
                this.f36469w.a(0, iC - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
        new Thread(this.f36470x).start();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:19:0x003f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public void a(int r9, java.util.List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Set<java.lang.Integer> r0 = r8.f36471y     // Catch: java.lang.Throwable -> L3a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L18
            com.mbridge.msdk.thrid.okhttp.internal.http2.b r10 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L14
            r8.c(r9, r10)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r0 = move-exception
            r9 = r0
            r3 = r8
            goto L3d
        L18:
            java.util.Set<java.lang.Integer> r0 = r8.f36471y     // Catch: java.lang.Throwable -> L3a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3a
            r0.add(r1)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3a
            com.mbridge.msdk.thrid.okhttp.internal.http2.g$d r2 = new com.mbridge.msdk.thrid.okhttp.internal.http2.g$d     // Catch: java.util.concurrent.RejectedExecutionException -> L39
            java.lang.String r4 = "OkHttp %s Push Request[%s]"
            java.lang.String r0 = r8.f36451d     // Catch: java.util.concurrent.RejectedExecutionException -> L39
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L39
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r1}     // Catch: java.util.concurrent.RejectedExecutionException -> L39
            r3 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r4, r5, r6, r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L39
            r3.a(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L39
        L39:
            return
        L3a:
            r0 = move-exception
            r3 = r8
        L3c:
            r9 = r0
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            throw r9
        L3f:
            r0 = move-exception
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.g.a(int, java.util.List):void");
    }

    public void a(int i10, com.mbridge.msdk.thrid.okio.e eVar, int i11, boolean z10) throws IOException {
        com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
        long j10 = i11;
        eVar.e(j10);
        eVar.b(cVar, j10);
        if (cVar.size() == j10) {
            a(new f("OkHttp %s Push Data[%s]", new Object[]{this.f36451d, Integer.valueOf(i10)}, i10, cVar, i11, z10));
            return;
        }
        throw new IOException(cVar.size() + " != " + i11);
    }

    public void a(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        a(new C0187g("OkHttp %s Push Reset[%s]", new Object[]{this.f36451d, Integer.valueOf(i10)}, i10, bVar));
    }

    private synchronized void a(com.mbridge.msdk.thrid.okhttp.internal.b bVar) {
        if (!this.f36454g) {
            this.f36456i.execute(bVar);
        }
    }
}
