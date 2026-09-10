package sg.bigo.ads.controller.d;

import sg.bigo.ads.common.k;
import sg.bigo.ads.controller.a.j;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final sg.bigo.ads.controller.a.b f48041a;

    public static class a implements k.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f48042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f48043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f48044c;
        private final String d;

        public a(String str, j jVar) {
            this.f48042a = str;
            if (jVar != null) {
                boolean zC = jVar.c();
                this.f48044c = zC;
                this.f48043b = jVar.a();
                str = sg.bigo.ads.controller.a.d.a(str, zC ? jVar.b() : jVar.a());
            } else {
                this.f48044c = false;
                this.f48043b = "";
            }
            this.d = str;
        }

        @Override // sg.bigo.ads.common.k.b
        public final String a() {
            return this.d;
        }

        @Override // sg.bigo.ads.common.k.b
        public final String b() {
            return this.f48042a;
        }

        @Override // sg.bigo.ads.common.k.b
        public final String c() {
            return this.f48043b;
        }

        @Override // sg.bigo.ads.common.k.b
        public final boolean d() {
            return this.f48044c;
        }
    }

    public d(sg.bigo.ads.controller.a.b bVar) {
        this.f48041a = bVar;
    }

    @Override // sg.bigo.ads.common.k
    public final k.b a(String str) {
        sg.bigo.ads.controller.a.b bVar = this.f48041a;
        return new a(str, bVar != null ? bVar.f47798a.f47751i.f47758b : null);
    }
}
