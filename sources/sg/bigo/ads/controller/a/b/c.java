package sg.bigo.ads.controller.a.b;

import android.text.TextUtils;
import android.util.Pair;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.g;
import sg.bigo.ads.controller.b.h;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final sg.bigo.ads.controller.a.b f47836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final g f47837c;
    protected final sg.bigo.ads.controller.b.d d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final h f47838e;
    protected sg.bigo.ads.common.n.e f = null;
    protected AtomicInteger g = new AtomicInteger(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected AtomicBoolean f47839h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f47835a = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f47840i = new Runnable() { // from class: sg.bigo.ads.controller.a.b.c.1
        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            if (cVar.f47836b != null) {
                if (cVar.f == null) {
                    cVar.f = cVar.a();
                }
                sg.bigo.ads.common.n.e eVar = c.this.f;
                if (eVar == null || eVar.f47349a.get() != 0) {
                    c.this.d();
                    return;
                }
                Pair<String, Integer> pairA = c.a(c.this);
                if (pairA == null || TextUtils.isEmpty((CharSequence) pairA.first)) {
                    return;
                }
                c.this.a(pairA);
                c.this.f47836b.f47798a.a(0L);
                if (1 == ((Integer) pairA.second).intValue() % i.f46986a.y()) {
                    c.this.a((String) pairA.first, ((Integer) pairA.second).intValue(), "0");
                }
            }
        }
    };

    public c(sg.bigo.ads.controller.a.b bVar, g gVar, sg.bigo.ads.controller.b.d dVar, h hVar) {
        this.f47836b = bVar;
        this.f47837c = gVar;
        this.d = dVar;
        this.f47838e = hVar;
    }

    public static /* synthetic */ Pair a(c cVar) {
        sg.bigo.ads.controller.a.b bVar = cVar.f47836b;
        if (bVar == null || bVar.f47798a == null) {
            return null;
        }
        return cVar.b().a(i.f46986a);
    }

    public abstract sg.bigo.ads.common.n.e a();

    public abstract void a(Pair<String, Integer> pair);

    public abstract sg.bigo.ads.controller.a.a.b b();

    public final void c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iRound = Math.round((i.f46986a.z() / 2.0f) * 60000.0f);
        long jAbs = Math.abs(jCurrentTimeMillis - this.f47835a);
        if (this.f47835a == 0 || jAbs > iRound) {
            this.f47835a = jCurrentTimeMillis;
            this.g.set(0);
            d();
        }
    }

    public final void d() {
        if (this.g.getAndAdd(1) >= 3 || this.f47839h.get()) {
            return;
        }
        sg.bigo.ads.common.n.d.a(this.f47840i);
        sg.bigo.ads.common.n.d.a(1, this.f47840i, 5000L);
    }

    public final void a(Pair<String, Integer> pair, boolean z2) {
        if (this.f47836b == null || this.f47837c == null || this.d == null || pair == null) {
            return;
        }
        boolean zA = b().a((String) pair.first, this.f47837c.v(), this.d.s(), i.f46986a, z2);
        this.f47836b.f47798a.a(0L);
        if (zA) {
            a((String) pair.first, ((Integer) pair.second).intValue(), "1");
        }
    }

    public final void a(String str, int i2, String str2) {
        String str3;
        if (this instanceof b) {
            str3 = "1";
        } else {
            str3 = this instanceof a ? "2" : "0";
        }
        HashMap mapT = androidx.media3.extractor.text.ttml.a.t("type", str3, "host", str);
        mapT.put("retry_times", String.valueOf(i.f46986a.y()));
        mapT.put("retry_interval", String.valueOf(i.f46986a.z()));
        mapT.put("next_retry_interval", String.valueOf(i.f46986a.A()));
        mapT.put("cur_retry_time", String.valueOf(i2));
        mapT.put("uuid", this.f47837c.X());
        mapT.put("action", str2);
        sg.bigo.ads.core.d.b.d(mapT);
    }

    public static boolean a(int i2) {
        return i2 == 702 || i2 == 701 || i2 == 700;
    }
}
