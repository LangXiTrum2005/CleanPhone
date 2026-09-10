package sg.bigo.ads.controller.e;

import android.os.SystemClock;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.n;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements sg.bigo.ads.common.f.a.InterfaceC0837a {
    private static final h f = new h();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f48134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f48135i;
    private long j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f48130a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f48131b = 5000;
    private long g = com.smartdigimkt.o1.b.D0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f48132c = 0;
    long d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f48133e = new a();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f48136a = System.currentTimeMillis();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f48137b = System.currentTimeMillis();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f48138c = System.currentTimeMillis();

        public a() {
        }

        public final String a(String str) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("start_ts", Long.valueOf(this.f48138c));
                h hVar = h.this;
                jSONObject.putOpt("total_duration", Long.valueOf(hVar.f48132c + hVar.b()));
                h hVar2 = h.this;
                long jB = hVar2.b();
                if (jB > hVar2.f48131b) {
                    hVar2.d = jB;
                } else {
                    jB = hVar2.d;
                }
                jSONObject.putOpt("close_duration", Long.valueOf(jB));
                g.a aVarA = g.a().a(str);
                jSONObject.putOpt("front_total_req_times", Long.valueOf(g.this.f48126c ? aVarA.f48127a.getAndAdd(1) : aVarA.f48127a.get()));
                g.a aVarA2 = g.a().a(str);
                jSONObject.putOpt("back_total_req_times", Long.valueOf(!g.this.f48126c ? aVarA2.f48128b.getAndAdd(1) : aVarA2.f48128b.get()));
                g.a aVarA3 = g.a().a(str);
                jSONObject.putOpt("close_front_req_times", Long.valueOf(g.this.f48126c ? aVarA3.f48129c.getAndAdd(1) : aVarA3.f48129c.get()));
                jSONObject.putOpt("req_status", Long.valueOf(h.a(h.this)));
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }
    }

    private h() {
        sg.bigo.ads.common.f.a.a().d = this;
    }

    public static /* synthetic */ int a(h hVar) {
        return hVar.f48134h ? 1 : 2;
    }

    public final long b() {
        long j = this.f48135i;
        if (j > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
            if (jElapsedRealtime > 0 && jElapsedRealtime > this.f48131b) {
                return jElapsedRealtime;
            }
        }
        return 0L;
    }

    public static h a() {
        return f;
    }

    @Override // sg.bigo.ads.common.f.a.InterfaceC0837a
    public final void a(long j, long j2) {
        this.f48134h = true;
        this.f48135i = j;
        a aVar = this.f48133e;
        aVar.f48137b = j2;
        long j3 = this.g;
        if (j3 > 0) {
            long j4 = this.j;
            if (j4 > 0 && j - j4 >= j3) {
                this.f48132c = 0L;
                this.d = 0L;
                aVar.f48138c = System.currentTimeMillis();
                g.a().f48125a.clear();
            }
        }
        a aVar2 = this.f48133e;
        if (aVar2.f48138c == 0) {
            aVar2.f48138c = System.currentTimeMillis();
        }
        g.a().a(true);
    }

    public final void a(n nVar) {
        this.f48130a = nVar.a();
        this.f48131b = nVar.b();
        this.g = nVar.c();
    }

    @Override // sg.bigo.ads.common.f.a.InterfaceC0837a
    public final void a(boolean z2, long j, long j2, long j3) {
        this.f48134h = false;
        this.j = j2;
        this.f48135i = 0L;
        long j4 = j2 - j;
        if (j4 > 0 && j4 > this.f48131b) {
            this.f48132c += j4;
            this.d = j4;
            if (this.f48130a) {
                sg.bigo.ads.core.d.b.a(z2 ? 1 : 2, j3, j4);
            }
        }
        g.a().a(false);
    }
}
