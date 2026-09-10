package com.mbridge.msdk.tracker;

import android.util.Log;
import com.mbridge.msdk.tracker.network.b0;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f37039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f37041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f37042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f37043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.tracker.network.u f37044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f37045g;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeReportResponseThread");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b implements com.mbridge.msdk.tracker.network.v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f37047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t f37048b;

        public b(r rVar, t tVar) {
            this.f37047a = rVar;
            this.f37048b = tVar;
        }

        @Override // com.mbridge.msdk.tracker.network.v.a
        public void a(b0 b0Var) {
            int iD;
            int iG;
            String message;
            if (y.a(this.f37047a)) {
                if (b0Var != null) {
                    try {
                        iD = b0Var.d();
                        iG = b0Var.g();
                        message = b0Var.getMessage();
                    } catch (Exception e10) {
                        if (com.mbridge.msdk.tracker.a.f36843a) {
                            Log.e("TrackManager", "onErrorResponse error", e10);
                            return;
                        }
                        return;
                    }
                } else {
                    message = "";
                    iD = 0;
                    iG = 0;
                }
                this.f37047a.a(this.f37048b, 0, "volleyError:" + iD + ",responseCode:" + iG + ",errorMessage:" + message);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c implements com.mbridge.msdk.tracker.network.v.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f37049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t f37050b;

        public c(r rVar, t tVar) {
            this.f37049a = rVar;
            this.f37050b = tVar;
        }

        @Override // com.mbridge.msdk.tracker.network.v.b
        public void a(Object obj) {
            if (y.a(this.f37049a)) {
                try {
                    this.f37049a.a(this.f37050b);
                } catch (Exception e10) {
                    if (com.mbridge.msdk.tracker.a.f36843a) {
                        Log.e("TrackManager", "onResponse error", e10);
                    }
                }
            }
        }
    }

    public o(int i10, p pVar, w wVar, int i11) {
        this.f37040b = i10;
        this.f37041c = pVar;
        this.f37042d = wVar;
        this.f37043e = i11;
        this.f37045g = new ThreadPoolExecutor(i10, i10, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    public void a(r rVar) {
        this.f37039a = rVar;
    }

    public void b(t tVar, Map<String, String> map, boolean z10) {
        if (y.b(map)) {
            r rVar = this.f37039a;
            if (rVar != null) {
                try {
                    rVar.a(tVar, 0, "params is null");
                    return;
                } catch (Exception e10) {
                    if (com.mbridge.msdk.tracker.a.f36843a) {
                        Log.e("TrackManager", "send error", e10);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        try {
            a();
            this.f37044f.a(a(tVar, map, z10));
        } catch (Exception e11) {
            if (com.mbridge.msdk.tracker.a.f36843a) {
                Log.e("TrackManager", "send error", e11);
            }
            if (y.a(this.f37039a)) {
                this.f37039a.a(tVar, 0, e11.getMessage());
            }
        }
    }

    private v<Object> a(t tVar, Map<String, String> map, boolean z10) {
        v<Object> vVar = this.f37043e == 1 ? new v<>(this.f37041c.c(), 1, this.f37041c.a()) : new v<>(this.f37041c.c(), 1);
        vVar.a(map);
        vVar.a(false);
        vVar.c(true);
        vVar.b(true);
        vVar.a(this.f37042d);
        vVar.a(z10 ? com.mbridge.msdk.tracker.network.t.a.HIGH : com.mbridge.msdk.tracker.network.t.a.NORMAL);
        vVar.a((com.mbridge.msdk.tracker.network.v.b<Object>) new c(this.f37039a, tVar));
        vVar.a((com.mbridge.msdk.tracker.network.v.a) new b(this.f37039a, tVar));
        return vVar;
    }

    private void a() {
        if (y.a(this.f37044f)) {
            return;
        }
        com.mbridge.msdk.tracker.network.u uVarA = com.mbridge.msdk.tracker.network.toolbox.o.a(new com.mbridge.msdk.tracker.network.toolbox.b(this.f37041c.b()), new com.mbridge.msdk.tracker.network.f(this.f37045g), this.f37040b, null);
        this.f37044f = uVarA;
        uVarA.b();
    }
}
