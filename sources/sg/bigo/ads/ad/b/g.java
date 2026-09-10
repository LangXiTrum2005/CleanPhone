package sg.bigo.ads.ad.b;

import android.content.Context;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes7.dex */
public final class g<T extends Ad> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    T f45504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Context f45505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    sg.bigo.ads.core.a.a f45506c;
    p d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    sg.bigo.ads.api.b.d.a<T> f45507e;
    final sg.bigo.ads.core.g.c f;
    sg.bigo.ads.core.player.b.a g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    sg.bigo.ads.core.player.b.d f45508h;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.b.g$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f45509a;

        public AnonymousClass1(int i2) {
            this.f45509a = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i2 = this.f45509a;
            if (i2 != 0) {
                g gVar = g.this;
                gVar.f45507e.a(gVar.f45504a, 1006, i2, "Invalid VPAID media files.");
                return;
            }
            g.this.g = new sg.bigo.ads.core.player.b.a() { // from class: sg.bigo.ads.ad.b.g.1.1
                @Override // sg.bigo.ads.core.player.b.a
                public final void a() {
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void b(int i3) {
                    g gVar2 = g.this;
                    gVar2.f45507e.a(gVar2.f45504a, 1006, i3, "Failed to download VPAID.");
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void a(int i3) {
                    g gVar2 = g.this;
                    if (gVar2.d == null) {
                        gVar2.f45507e.a(gVar2.f45504a, 1006, 10075, "VPAID video config is empty.");
                    } else {
                        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.b.g.1.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                sg.bigo.ads.api.c.b bVarB = sg.bigo.ads.api.c.b.b(g.this.f45506c.x());
                                bVarB.f47009c = false;
                                g gVar3 = g.this;
                                p pVar = gVar3.d;
                                int i4 = pVar.x;
                                int i5 = pVar.f48538w;
                                g gVar4 = g.this;
                                gVar3.f45508h = new sg.bigo.ads.core.player.b.d(gVar4.f45505b, i4, i5, bVarB, gVar4.f45506c);
                                g gVar5 = g.this;
                                gVar5.f45508h.setOnEventListener(gVar5.f);
                            }
                        });
                    }
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void a(String str, sg.bigo.ads.common.h.a aVar) {
                }
            };
            sg.bigo.ads.core.player.b bVarA = sg.bigo.ads.core.player.b.a();
            g gVar2 = g.this;
            bVarA.a(gVar2.f45505b, gVar2.f45506c, gVar2.g);
        }
    }

    public g(Context context, sg.bigo.ads.core.g.c cVar, sg.bigo.ads.core.a.a aVar, p pVar, sg.bigo.ads.api.b.d.a<T> aVar2, T t) {
        this.f45505b = context;
        this.f = cVar;
        this.f45506c = aVar;
        this.d = pVar;
        this.f45507e = aVar2;
        this.f45504a = t;
    }

    public final boolean a() {
        return this.f45506c.at() == 1;
    }
}
