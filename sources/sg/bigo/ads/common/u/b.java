package sg.bigo.ads.common.u;

import sg.bigo.ads.common.u.b.c;
import sg.bigo.ads.common.u.c.c;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b<Req extends sg.bigo.ads.common.u.b.c, Res extends sg.bigo.ads.common.u.c.c> {
    public static b<sg.bigo.ads.common.u.b.c, sg.bigo.ads.common.u.c.a> d = new a();

    public static class a<Req extends sg.bigo.ads.common.u.b.c> extends b<Req, sg.bigo.ads.common.u.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Req f47463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        sg.bigo.ads.common.u.c.a f47464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        h f47465c;

        @Override // sg.bigo.ads.common.u.b
        public final /* bridge */ /* synthetic */ sg.bigo.ads.common.u.c.c a(sg.bigo.ads.common.u.c.a aVar) {
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.common.u.b
        public final /* bridge */ /* synthetic */ void a(sg.bigo.ads.common.u.b.c cVar, sg.bigo.ads.common.u.c.c cVar2) {
            this.f47463a = cVar;
            this.f47464b = (sg.bigo.ads.common.u.c.a) cVar2;
        }

        @Override // sg.bigo.ads.common.u.b
        public final void a(Req req, h hVar) {
            this.f47463a = req;
            this.f47465c = hVar;
        }
    }

    public abstract Res a(sg.bigo.ads.common.u.c.a aVar);

    public void a(Req req) {
    }

    public abstract void a(Req req, Res res);

    public abstract void a(Req req, h hVar);

    public void a(Req req, String str, int i2) {
    }

    public boolean a(Req req, int i2) {
        return i2 >= 200 && i2 < 300;
    }
}
