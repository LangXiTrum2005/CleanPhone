package sg.bigo.ads.controller.a;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public interface f extends c {

    public static class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final sg.bigo.ads.controller.a.a f47854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final sg.bigo.ads.controller.a.a.b f47855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sg.bigo.ads.common.g f47856c;
        private final sg.bigo.ads.api.a.h d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f47857e;
        private String f;
        private j g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private j f47858h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f47859i;
        private boolean j;
        private boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f47860l;
        private g m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f47861n;
        private final AtomicBoolean o = new AtomicBoolean(false);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final AtomicBoolean f47862p = new AtomicBoolean(false);
        private final Runnable q = new Runnable() { // from class: sg.bigo.ads.controller.a.f.a.1
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[bigo url] run timeout task");
                a.this.b();
            }
        };

        public a(sg.bigo.ads.controller.a.a aVar, sg.bigo.ads.common.g gVar, sg.bigo.ads.api.a.h hVar, String str, String str2) {
            this.f47861n = null;
            boolean z2 = false;
            this.f47854a = aVar;
            this.f47856c = gVar;
            this.d = hVar;
            this.f47857e = str;
            this.f47861n = str2;
            str.getClass();
            if (str.equals("/Ad/GetSDKConfig")) {
                this.f47855b = aVar.g;
                z2 = true;
            } else {
                this.f47855b = !str.equals("/Ad/ReportUniBaina") ? aVar.f47751i : aVar.f47750h;
            }
            this.f47859i = z2;
        }

        @Override // sg.bigo.ads.common.u.a
        public final String a() {
            g gVar;
            g gVar2;
            String str = this.f47861n;
            if (str != null) {
                return sg.bigo.ads.b.a(str, this.f47857e);
            }
            if (q.a((CharSequence) this.f)) {
                String strV = this.f47856c.v();
                e eVarA = this.f47855b.a(strV, this.d.s());
                sg.bigo.ads.controller.a.a aVar = this.f47854a;
                this.j = aVar.f47748a;
                this.k = aVar.f47749e;
                this.f47860l = aVar.f;
                this.g = eVarA.f47851a;
                this.f47858h = this.f47855b.f47757a;
                sg.bigo.ads.controller.a.b.d.a.f47847a.a(this.f47857e, this.g, this.f47858h);
                this.f = sg.bigo.ads.b.a(this.g.c() ? this.g.b() : this.g.a(), this.f47857e);
                if (eVarA.f47853c && (gVar2 = this.m) != null) {
                    gVar2.a(this.f47857e);
                }
                if (eVarA.f47852b && (gVar = this.m) != null) {
                    gVar.a(strV, this.f47859i);
                }
            }
            return this.f;
        }

        @Override // sg.bigo.ads.common.u.a
        public final void b() {
            g gVar;
            boolean zEquals = false;
            if (!this.o.compareAndSet(false, true)) {
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[bigo url] mark fail do nth, it has marked.");
                return;
            }
            sg.bigo.ads.common.n.d.a(this.q);
            String strD = d();
            p005e.a.f(new StringBuilder("[bigo url] mark fail, url is "), 0, this.f, 3, "AntiBan");
            sg.bigo.ads.controller.a.a.b bVar = this.f47855b;
            sg.bigo.ads.controller.a.a.b.C0858b c0858b = bVar.f47758b;
            if (c0858b != null && (zEquals = TextUtils.equals(strD, c0858b.a()))) {
                bVar.f47759c++;
            }
            if (zEquals && (gVar = this.m) != null) {
                gVar.a(this.f47857e);
            }
        }

        @Override // sg.bigo.ads.common.u.a
        public final void c() {
            g gVar;
            boolean z2 = false;
            if (!this.o.compareAndSet(false, true)) {
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[bigo url] mark success do nth, it has marked.");
                return;
            }
            sg.bigo.ads.common.n.d.a(this.q);
            String strD = d();
            p005e.a.f(new StringBuilder("[bigo url] mark success, url is "), 0, this.f, 3, "AntiBan");
            sg.bigo.ads.controller.a.a.b bVar = this.f47855b;
            sg.bigo.ads.controller.a.a.b.C0858b c0858b = bVar.f47758b;
            if (c0858b != null) {
                boolean z3 = TextUtils.equals(strD, c0858b.a()) && bVar.f47759c > 0;
                if (z3) {
                    bVar.f47759c = 0;
                }
                z2 = z3;
            }
            if (z2 && (gVar = this.m) != null) {
                gVar.a(this.f47857e);
            }
        }

        @Override // sg.bigo.ads.common.u.a
        public final String d() {
            j jVar = this.g;
            return jVar != null ? jVar.a() : "";
        }

        @Override // sg.bigo.ads.common.u.a
        public final boolean e() {
            j jVar = this.g;
            return jVar != null && jVar.c();
        }

        @Override // sg.bigo.ads.common.u.a
        public final String f() {
            j jVar = this.f47858h;
            return jVar != null ? jVar.a() : "";
        }

        @Override // sg.bigo.ads.controller.a.c
        public final j g() {
            return this.g;
        }

        @Override // sg.bigo.ads.controller.a.c
        public final boolean h() {
            return this.k;
        }

        @Override // sg.bigo.ads.controller.a.c
        public final String i() {
            return this.f47860l;
        }

        @Override // sg.bigo.ads.controller.a.c
        public final void a(long j) {
            if (this.f47862p.compareAndSet(false, true)) {
                sg.bigo.ads.common.n.d.a(3, this.q, j);
            }
        }

        @Override // sg.bigo.ads.controller.a.c
        public final void a(g gVar) {
            this.m = gVar;
        }
    }
}
