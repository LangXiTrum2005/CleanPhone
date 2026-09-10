package sg.bigo.ads.controller.e;

import android.content.ContentValues;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.p004ironsource.f9;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.core.q;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.t;
import sg.bigo.ads.controller.g.i;
import sg.bigo.ads.controller.g.j;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.c, l>, sg.bigo.ads.controller.f.a.InterfaceC0860a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final sg.bigo.ads.controller.b.d f48050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final sg.bigo.ads.controller.b.h f48051c;
    final sg.bigo.ads.controller.a.b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f48052e;
    final e f;
    public f g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final LinkedList<C0859a<? extends sg.bigo.ads.api.b>> f48053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final SparseArray<C0859a<i>> f48054i;
    public long j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final b f48055l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f48056n;
    private final sg.bigo.ads.controller.b o;
    private final AtomicBoolean m = new AtomicBoolean(false);
    boolean k = true;

    /* JADX INFO: renamed from: sg.bigo.ads.controller.e.a$a, reason: collision with other inner class name */
    public static class C0859a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f48081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final sg.bigo.ads.controller.c f48082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f48083c;
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f48084e;
        public int f;
        public q g;

        private C0859a(T t, sg.bigo.ads.controller.c cVar) {
            this.f48084e = 1;
            this.f = 0;
            this.f48081a = t;
            this.f48082b = cVar;
        }

        public /* synthetic */ C0859a(Object obj, sg.bigo.ads.controller.c cVar, byte b2) {
            this(obj, cVar);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile int f48086b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f48087c = true;

        public b() {
        }

        public final void a() {
            if (this.f48086b == 0 || this.f48086b == 2) {
                sg.bigo.ads.common.t.a.a(0, 3, "PrefetchConfigTask", "Task set.");
                sg.bigo.ads.common.n.d.a(3, this, 5000L);
                this.f48086b = 1;
            }
        }

        public final void b() {
            if (this.f48086b == 1 || this.f48086b == 2) {
                if (this.f48086b == 1) {
                    sg.bigo.ads.common.n.d.a(this);
                }
                sg.bigo.ads.common.t.a.a(0, 3, "PrefetchConfigTask", "Task canceled.");
                this.f48086b = 3;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!sg.bigo.ads.common.f.b.e()) {
                b();
                return;
            }
            if (!this.f48087c || a.this.k) {
                sg.bigo.ads.common.t.a.a(0, 3, "PrefetchConfigTask", "Start to execute task.");
                this.f48086b = 4;
                a.this.f.a(new e.a() { // from class: sg.bigo.ads.controller.e.a.b.1
                    @Override // sg.bigo.ads.controller.e.e.a
                    public final void a(int i2) {
                        a.a(a.this, 1, (Map) null);
                    }

                    @Override // sg.bigo.ads.controller.e.e.a
                    public final void a(int i2, int i3, String str) {
                    }
                }, 0);
            } else {
                this.f48087c = false;
                sg.bigo.ads.common.t.a.b("PrefetchConfigTask", "The network is unavailable now. Task paused.");
                this.f48086b = 2;
            }
        }

        public static /* synthetic */ void a(b bVar) {
            if (bVar.f48086b == 2) {
                sg.bigo.ads.common.t.a.a(0, 3, "PrefetchConfigTask", "Task resumed.");
                bVar.a();
            }
        }
    }

    public a(Context context, AdConfig adConfig) {
        sg.bigo.ads.controller.b bVar = new sg.bigo.ads.controller.b() { // from class: sg.bigo.ads.controller.e.a.1
            @Override // sg.bigo.ads.controller.e
            public final void a(int i2, int i3, int i4, String str, Object obj) {
                StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i2, i3, "sdk config fetch error, seq=", ", code=", ", subCode=");
                sbP.append(i4);
                sbP.append(", message=");
                sbP.append(str);
                sg.bigo.ads.common.t.a.a(0, "AdController", sbP.toString());
            }

            @Override // sg.bigo.ads.controller.b
            public final void a(int i2, String str) {
                sg.bigo.ads.common.t.a.a(0, 3, "AdController", "sdk config fetch success, seqId=" + i2 + ", data=" + str);
            }
        };
        this.o = bVar;
        this.f48049a = context;
        sg.bigo.ads.controller.b.d dVar = new sg.bigo.ads.controller.b.d(context);
        this.f48050b = dVar;
        sg.bigo.ads.api.a.i.f46986a = dVar;
        sg.bigo.ads.controller.b.h hVar = new sg.bigo.ads.controller.b.h(context);
        this.f48051c = hVar;
        d dVar2 = new d(context, adConfig, dVar);
        this.f48052e = dVar2;
        sg.bigo.ads.controller.a.b bVar2 = new sg.bigo.ads.controller.a.b(context, dVar2, dVar);
        this.d = bVar2;
        bVar2.g = bVar;
        sg.bigo.ads.common.u.a.e.a(bVar2.f47798a.m);
        sg.bigo.ads.common.u.g.f47490a = new sg.bigo.ads.common.u.a.a(dVar2);
        this.f = new e(context, dVar, hVar, dVar2, bVar2);
        sg.bigo.ads.api.a.h hVar2 = sg.bigo.ads.api.a.i.f46986a;
        if (hVar2 != null) {
            sg.bigo.ads.api.a.b bVarQ = hVar2.q();
            if (bVarQ instanceof sg.bigo.ads.controller.b.b) {
                ((sg.bigo.ads.controller.b.b) bVarQ).f47879a = hVar;
            }
        }
        this.f48053h = new LinkedList<>();
        this.f48054i = new SparseArray<>();
        this.f48055l = new b();
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0228  */
    /* JADX WARN: Code duplicated, block: B:79:0x0235  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        C0859a<? extends sg.bigo.ads.api.b> c0859aPoll;
        l lVarA;
        byte b2;
        int i2;
        String str;
        int i3;
        i bVar;
        a aVar;
        l lVar;
        sg.bigo.ads.api.b.a aVar2;
        boolean z2;
        sg.bigo.ads.api.core.c cVarA;
        sg.bigo.ads.api.a.h hVar;
        int i4;
        sg.bigo.ads.api.a.h hVar2;
        while (true) {
            if (this.f48054i.size() >= this.f48050b.D() || (c0859aPoll = this.f48053h.poll()) == null) {
                return;
            }
            lVarA = this.f48051c.a((sg.bigo.ads.api.b) c0859aPoll.f48081a);
            String str2 = ((sg.bigo.ads.api.b) c0859aPoll.f48081a).f46988b;
            b2 = 0;
            if (lVarA == null) {
                sg.bigo.ads.common.t.a.a(0, "AdController", "scheduleRequest error, slot is empty, slot id=" + ((sg.bigo.ads.api.b) c0859aPoll.f48081a).f46987a);
                i2 = 10006;
                str = "The slot id is inactive or invalid, please make sure the id is aligned with app id. If ids are correct, please wait for at least 30 minutes then try again";
                i3 = f9.j;
            } else if (!lVarA.m()) {
                sg.bigo.ads.common.t.a.a(0, "AdController", "schedule next request, slot is disable, slot id=" + ((sg.bigo.ads.api.b) c0859aPoll.f48081a).f46987a);
                i2 = 10005;
                str = "The switch of the slot is turned off. Please check slot setup.";
                i3 = 1015;
            } else if (((sg.bigo.ads.api.b) c0859aPoll.f48081a).a(lVarA.b())) {
                sg.bigo.ads.common.t.a.a(0, "AdController", "schedule next request, this slot id is ad type " + lVarA.b() + ", request as type " + ((sg.bigo.ads.api.b) c0859aPoll.f48081a).c());
                i2 = 10007;
                str = "The ad type of this slot isn't consistent with the method to querying an ad.";
                i3 = f9.f24993l;
            } else {
                boolean zW = lVarA.w();
                if (!zW && !TextUtils.isEmpty(str2)) {
                    sg.bigo.ads.common.t.a.a(0, "AdController", "requsting an ordinary ad with server bidding payload.");
                }
                if (c0859aPoll.f48083c && (hVar2 = sg.bigo.ads.api.a.i.f46986a) != null && hVar2.q().f(lVarA.l()) > 1) {
                    sg.bigo.ads.common.t.a.a(0, "AdController", "schedule next request, slot is timeout, slot id=" + ((sg.bigo.ads.api.b) c0859aPoll.f48081a).f46987a);
                    i4 = 10207;
                } else if (c0859aPoll.d && (hVar = sg.bigo.ads.api.a.i.f46986a) != null && hVar.q().g(lVarA.l()) > 1) {
                    sg.bigo.ads.common.t.a.a(0, "AdController", "schedule next request, slot is loaded with cache, slot id=" + ((sg.bigo.ads.api.b) c0859aPoll.f48081a).f46987a);
                    i4 = 10208;
                } else {
                    if (!sg.bigo.ads.api.core.b.d(lVarA.b())) {
                        break;
                    }
                    sg.bigo.ads.common.x.a.j(lVarA.l());
                    int iA = lVarA.q().a("splash_impression_limit");
                    if (iA <= 0) {
                        z2 = true;
                    } else {
                        z2 = sg.bigo.ads.common.x.a.i(lVarA.l()) < iA;
                        if (!z2) {
                            sg.bigo.ads.common.t.a.b("AdController", "The maximum number of ad impressions for the day (" + iA + ") has been reached.");
                        }
                    }
                    if (!z2) {
                        i2 = 10008;
                        str = "The impressions of the ad has reached the limit. You can change this setup on bigo's console";
                        i3 = 1017;
                    } else {
                        if (zW || (cVarA = sg.bigo.ads.controller.c.a.a(lVarA, ((sg.bigo.ads.api.b) c0859aPoll.f48081a).g)) == null) {
                            break;
                        }
                        if (cVarA.J()) {
                            sg.bigo.ads.controller.c.a.a(lVarA.l());
                            break;
                        }
                        sg.bigo.ads.common.t.a.a("AdController", "Succeed to load splash ads from local db.");
                        sg.bigo.ads.api.core.g.a aVar3 = new sg.bigo.ads.api.core.g.a(cVarA, lVarA, (sg.bigo.ads.api.b) c0859aPoll.f48081a, this.f48049a, b());
                        aVar3.f47036a = this.f48052e;
                        c0859aPoll.f48082b.a(-1, c0859aPoll.f48081a, aVar3.a());
                    }
                }
                a(c0859aPoll, 1011, i4, "no fill");
            }
            a(c0859aPoll, i3, i2, str);
        }
        sg.bigo.ads.api.a.h hVar3 = sg.bigo.ads.api.a.i.f46986a;
        if (hVar3 != null && hVar3.t() && !this.k) {
            a(c0859aPoll, 1003, AuthApiStatusCodes.AUTH_APP_CERT_ERROR, "no network connection");
            return;
        }
        sg.bigo.ads.controller.b.d dVar = this.f48050b;
        d dVar2 = this.f48052e;
        sg.bigo.ads.controller.a.b bVar2 = this.d;
        sg.bigo.ads.api.b bVar3 = (sg.bigo.ads.api.b) c0859aPoll.f48081a;
        if (!bVar3.e()) {
            if (lVarA.w()) {
                bVar = new sg.bigo.ads.controller.g.c(dVar, dVar2, bVar3, lVarA, this);
                aVar = this;
                lVar = lVarA;
            } else {
                aVar = this;
                bVar = new sg.bigo.ads.controller.g.b(dVar, dVar2, bVar2, bVar3, lVarA, aVar);
            }
            aVar.f48054i.put(bVar.a(), new C0859a<>(bVar, c0859aPoll.f48082b, b2));
            aVar2 = ((sg.bigo.ads.api.b) c0859aPoll.f48081a).g;
            if (aVar2.k == 0) {
                aVar2.k = System.currentTimeMillis();
            }
            c0859aPoll.f48084e = 2;
            if (bVar instanceof sg.bigo.ads.controller.g.b) {
                c0859aPoll.g = ((sg.bigo.ads.controller.g.b) bVar).f48150h;
            }
            bVar.b();
            Map<String, Object> mapA = sg.bigo.ads.core.b.a.a("load", lVar, (sg.bigo.ads.api.b) c0859aPoll.f48081a, null, Integer.valueOf(lVar.v()));
            mapA.put("is_server_request", 1);
            sg.bigo.ads.core.b.b.a().a("load", mapA);
        }
        aVar = this;
        bVar = new j(dVar, dVar2, bVar2, bVar3, lVarA, aVar);
        lVar = lVarA;
        aVar.f48054i.put(bVar.a(), new C0859a<>(bVar, c0859aPoll.f48082b, b2));
        aVar2 = ((sg.bigo.ads.api.b) c0859aPoll.f48081a).g;
        if (aVar2.k == 0) {
            aVar2.k = System.currentTimeMillis();
        }
        c0859aPoll.f48084e = 2;
        if (bVar instanceof sg.bigo.ads.controller.g.b) {
            c0859aPoll.g = ((sg.bigo.ads.controller.g.b) bVar).f48150h;
        }
        bVar.b();
        Map<String, Object> mapA2 = sg.bigo.ads.core.b.a.a("load", lVar, (sg.bigo.ads.api.b) c0859aPoll.f48081a, null, Integer.valueOf(lVar.v()));
        mapA2.put("is_server_request", 1);
        sg.bigo.ads.core.b.b.a().a("load", mapA2);
    }

    public final Context b() {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                return this.f48049a;
            }
            Context context = this.f48056n;
            if (context != null) {
                return context;
            }
            Context contextCreateWindowContext = this.f48049a.createDisplayContext(((DisplayManager) this.f48049a.getSystemService(DisplayManager.class)).getDisplay(0)).createWindowContext(1001, null);
            this.f48056n = contextCreateWindowContext;
            return contextCreateWindowContext;
        } catch (Throwable unused) {
            return this.f48049a;
        }
    }

    @Override // sg.bigo.ads.controller.e
    public final /* synthetic */ void a(final int i2, final int i3, final int i4, final String str, l lVar) {
        final l lVar2 = lVar;
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.a.3
            @Override // java.lang.Runnable
            public final void run() {
                C0859a<i> c0859a = a.this.f48054i.get(i2);
                if (c0859a != null) {
                    sg.bigo.ads.api.b bVarK = c0859a.f48081a.k();
                    a.this.f48054i.remove(i2);
                    int i5 = i3;
                    String str2 = str;
                    if (i5 == 1005) {
                        if (i4 == -6) {
                            i5 = 1004;
                            str2 = "The sdk integration and ad request are successful, but no ad wins at this time.";
                        } else {
                            str2 = "Error from server: " + str;
                        }
                    }
                    c0859a.f48082b.a(i2, i5, i4, str2, Pair.create(bVarK, lVar2));
                }
                a.this.a();
            }
        });
    }

    @Override // sg.bigo.ads.controller.e
    public final /* synthetic */ void a(final int i2, sg.bigo.ads.api.b bVar, sg.bigo.ads.api.core.c[] cVarArr) {
        final sg.bigo.ads.api.b bVar2 = bVar;
        final sg.bigo.ads.api.core.c[] cVarArr2 = cVarArr;
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.a.2
            @Override // java.lang.Runnable
            public final void run() {
                C0859a<i> c0859a = a.this.f48054i.get(i2);
                if (c0859a != null) {
                    a.this.f48054i.remove(i2);
                    if (!k.a(cVarArr2)) {
                        sg.bigo.ads.api.core.g[] gVarArr = new sg.bigo.ads.api.core.g[cVarArr2.length];
                        int i3 = 0;
                        while (true) {
                            sg.bigo.ads.api.core.c[] cVarArr3 = cVarArr2;
                            if (i3 >= cVarArr3.length) {
                                break;
                            }
                            sg.bigo.ads.api.core.c cVar = cVarArr3[i3];
                            l lVarL = c0859a.f48081a.l();
                            sg.bigo.ads.api.b bVar3 = bVar2;
                            a aVar = a.this;
                            sg.bigo.ads.api.core.g.a aVar2 = new sg.bigo.ads.api.core.g.a(cVar, lVarL, bVar3, aVar.f48049a, aVar.b());
                            aVar2.f47036a = a.this.f48052e;
                            gVarArr[i3] = aVar2.a();
                            if (sg.bigo.ads.api.core.b.d(cVar.x())) {
                                t.a();
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("slot", cVar.b());
                                contentValues.put("log_id", Long.valueOf(cVar.Z()));
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                contentValues.put("start_time", Long.valueOf(jCurrentTimeMillis));
                                contentValues.put("end_time", Long.valueOf((cVar.L() * 1000) + jCurrentTimeMillis));
                                JSONObject jSONObjectAf = cVar.af();
                                contentValues.put("ad_data", jSONObjectAf == null ? "" : jSONObjectAf.toString());
                                contentValues.put("mtime", Long.valueOf(jCurrentTimeMillis));
                                sg.bigo.ads.common.g.a.a.b("tb_addata", contentValues);
                            }
                            i3++;
                        }
                        c0859a.f48082b.a(i2, bVar2, gVarArr);
                    }
                }
                a.this.a();
            }
        });
    }

    public final void a(String str, String str2) {
        this.d.a(str, str2);
    }

    public final void a(final C0859a<? extends sg.bigo.ads.api.b> c0859a, final int i2, final int i3, final String str) {
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.controller.e.a.11
            @Override // java.lang.Runnable
            public final void run() {
                c0859a.f48082b.a(0, i2, i3, str, new Pair(c0859a.f48081a, null));
            }
        });
    }

    public static /* synthetic */ void a(a aVar, int i2, Map map) {
        if (sg.bigo.ads.common.utils.q.a((CharSequence) aVar.f48052e.f48094c.F()) || aVar.m.getAndSet(true)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jI = sg.bigo.ads.common.x.a.i();
        long jElapsedRealtime = aVar.j == 0 ? -1L : SystemClock.elapsedRealtime() - aVar.j;
        if (jCurrentTimeMillis - jI >= 300000) {
            sg.bigo.ads.core.d.b.a(jElapsedRealtime, i2, sg.bigo.ads.common.x.a.r(), sg.bigo.ads.common.m.b.e(), (Map<String, String>) map);
            sg.bigo.ads.common.x.a.c(jCurrentTimeMillis);
            sg.bigo.ads.core.d.b.a();
            sg.bigo.ads.core.d.b.a(aVar.f48052e);
        }
    }

    public static /* synthetic */ void a(a aVar, final C0859a c0859a) {
        if (aVar.f48050b.H()) {
            sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.a.10
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    Ad adA;
                    sg.bigo.ads.api.b bVar = (sg.bigo.ads.api.b) c0859a.f48081a;
                    l lVarA = a.this.f48051c.a(bVar);
                    if ((lVarA != null ? lVarA.w() : false) || bVar.g()) {
                        a.this.f48053h.addFirst(c0859a);
                    } else {
                        if (lVarA != null && (adA = sg.bigo.ads.ad.b.a.f45406a.a(lVarA)) != null) {
                            sg.bigo.ads.controller.c cVar = c0859a.f48082b;
                            if ((cVar instanceof sg.bigo.ads.controller.a) && (((sg.bigo.ads.controller.a) cVar).f47747a instanceof sg.bigo.ads.controller.d)) {
                                sg.bigo.ads.controller.c cVar2 = ((sg.bigo.ads.controller.a) cVar).f47747a;
                                if (cVar2 instanceof sg.bigo.ads.controller.d) {
                                    ((sg.bigo.ads.controller.d) cVar2).a(lVarA, adA);
                                }
                            }
                        }
                        a.this.f48053h.offer(c0859a);
                    }
                    a.this.a();
                }
            });
        } else {
            aVar.a(c0859a, 1005, 10004, "The country where the ad request comes from is not supported, please change your country to RU or US and have a try. Besides, check your COPPA setup on bigo's console. The app will fail to send an ad request if it's targeted children under 13.");
        }
    }

    @Override // sg.bigo.ads.controller.f.a.InterfaceC0860a
    public final void a(boolean z2) {
        this.k = z2;
        if (z2) {
            sg.bigo.ads.common.aa.b.a();
            b.a(this.f48055l);
        }
    }
}
