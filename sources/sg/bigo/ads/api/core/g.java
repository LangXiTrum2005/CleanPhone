package sg.bigo.ads.api.core;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f47032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg.bigo.ads.api.a.l f47033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sg.bigo.ads.api.b f47034c;
    public sg.bigo.ads.common.g d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f47035e;
    public final Context f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public sg.bigo.ads.common.g f47036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f47037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sg.bigo.ads.api.a.l f47038c;
        private final sg.bigo.ads.api.b d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Context f47039e;
        private final Context f;

        public a(c cVar, sg.bigo.ads.api.a.l lVar, sg.bigo.ads.api.b bVar, Context context, Context context2) {
            this.f47037b = cVar;
            this.f47038c = lVar;
            this.d = bVar;
            this.f47039e = context;
            this.f = context2;
        }

        public final g a() {
            g gVar = new g(this.f47037b, this.f47038c, this.d, this.f47039e, this.f, (byte) 0);
            gVar.d = this.f47036a;
            return gVar;
        }
    }

    private g(c cVar, sg.bigo.ads.api.a.l lVar, sg.bigo.ads.api.b bVar, Context context, Context context2) {
        this.f47032a = cVar;
        this.f47033b = lVar;
        this.f47034c = bVar;
        this.f47035e = context;
        this.f = context2;
    }

    public final g a(c cVar) {
        g gVar = new g(cVar, this.f47033b, this.f47034c, this.f47035e, this.f);
        gVar.d = this.d;
        return gVar;
    }

    public /* synthetic */ g(c cVar, sg.bigo.ads.api.a.l lVar, sg.bigo.ads.api.b bVar, Context context, Context context2, byte b2) {
        this(cVar, lVar, bVar, context, context2);
    }
}
