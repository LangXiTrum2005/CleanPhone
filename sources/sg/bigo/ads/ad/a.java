package sg.bigo.ads.ad;

import android.content.Context;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.core.g;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: sg.bigo.ads.ad.a$a, reason: collision with other inner class name */
    public static class C0780a implements AdBid {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f45383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final sg.bigo.ads.api.core.c f45384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sg.bigo.ads.core.e.a.b f45385c;
        private boolean d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f45386e = false;

        public C0780a(g gVar, sg.bigo.ads.api.core.c cVar, sg.bigo.ads.core.e.a.b bVar) {
            this.f45383a = gVar;
            this.f45384b = cVar;
            this.f45385c = bVar;
        }

        @Override // sg.bigo.ads.api.AdBid
        public final double getPrice() {
            return this.f45384b.ai();
        }

        @Override // sg.bigo.ads.api.AdBid
        public final void notifyLoss(Double d, String str, int i2) {
            if (this.f45386e) {
                return;
            }
            this.f45386e = true;
            if (d != null) {
                this.f45385c.b("first_price", String.valueOf(d));
            }
            if (str != null) {
                this.f45385c.b("first_bidder", str);
            }
            this.f45385c.b("loss_reason", String.valueOf(i2));
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.b.4

                /* JADX INFO: renamed from: a */
                final /* synthetic */ Context f48399a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ boolean f48400b = false;

                public AnonymousClass4() {
                    context = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.this.e(context, this.f48400b);
                }
            });
            sg.bigo.ads.api.core.c cVar = this.f45384b;
            sg.bigo.ads.core.d.b.a(cVar, cVar.aj(), d, str, i2);
        }

        @Override // sg.bigo.ads.api.AdBid
        public final void notifyWin(Double d, String str) {
            if (this.d) {
                return;
            }
            this.d = true;
            if (d != null) {
                this.f45385c.b("sec_price", String.valueOf(d));
            }
            if (str != null) {
                this.f45385c.b("sec_bidder", str);
            }
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.b.3

                /* JADX INFO: renamed from: a */
                final /* synthetic */ Context f48396a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ boolean f48397b = false;

                public AnonymousClass3() {
                    context = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.this.d(context, this.f48397b);
                }
            });
            sg.bigo.ads.api.core.c cVar = this.f45384b;
            sg.bigo.ads.core.d.b.a(cVar, cVar.aj(), d, str);
            g gVar = this.f45383a;
            sg.bigo.ads.core.b.b.a().a("win", sg.bigo.ads.core.b.a.a("win", gVar.f47033b, gVar.f47034c, gVar.f47032a, Integer.valueOf(this.f45384b.aj()), d == null ? null : String.valueOf(d), str, null));
        }
    }
}
