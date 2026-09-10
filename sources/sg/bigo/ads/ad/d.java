package sg.bigo.ads.ad;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.core.c;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d<T extends Ad, U extends sg.bigo.ads.api.core.c> extends c<T, U> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected d<T, U>.a f45658w;
    private boolean x;

    public final class a {
        private long f;
        private long g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f45663h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f45664i = 0;
        private long j = 0;
        private boolean k = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f45659a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f45660b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f45661c = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f45665l = false;
        final Runnable d = new Runnable() { // from class: sg.bigo.ads.ad.d.a.1
            @Override // java.lang.Runnable
            public final void run() {
                View view;
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f45588i || ((aVar.f45660b && aVar.f45661c) || (view = dVar.f45585c) == null)) {
                    aVar.a();
                    return;
                }
                Rect rect = new Rect();
                boolean z2 = sg.bigo.ads.common.ab.a.a(view, rect) || (d.this.n() && sg.bigo.ads.api.core.b.b(d.this.o()));
                if (z2) {
                    a aVar2 = a.this;
                    if (aVar2.f45659a == -1) {
                        aVar2.f45659a = u.a(view) ? 1 : 0;
                    }
                }
                if (z2) {
                    a aVar3 = a.this;
                    if (!aVar3.f45660b) {
                        a.a(aVar3, rect);
                    }
                    a aVar4 = a.this;
                    if (!aVar4.f45661c) {
                        a.b(aVar4, rect);
                    }
                }
                a aVar5 = a.this;
                if (aVar5.f45660b && aVar5.f45661c) {
                    aVar5.a();
                } else {
                    sg.bigo.ads.common.n.d.a(2, aVar5.d, 500L);
                }
            }
        };

        public a() {
        }

        private float a(Rect rect) {
            d dVar = d.this;
            if (dVar.f45585c == null || sg.bigo.ads.api.core.b.b(dVar.f45584b.f47032a.x())) {
                return 0.0f;
            }
            float height = d.this.f45585c.getHeight() * 1.0f * d.this.f45585c.getWidth();
            float fHeight = rect.height() * 1.0f * rect.width();
            if (height <= 0.0f) {
                return 0.0f;
            }
            return fHeight / height;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:23:0x0053 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:25:0x0056  */
        public void b() {
            if (this.f45665l) {
                return;
            }
            this.f = d.this.p() == 2 ? d.a(d.this) : d.b(d.this);
            this.f45663h = d.this.p() == 2 ? d.c(d.this) : d.d(d.this);
            int iO = d.this.o();
            int iP = d.this.p();
            int i2 = 1000;
            if (iO == 1) {
                if (iP == 2) {
                    i2 = 2000;
                }
            } else if (iO != 2 && iO != 3) {
                if (iO == 4) {
                    i2 = 2000;
                } else if (iO != 12) {
                    i2 = 0;
                } else if (iP == 2) {
                    i2 = 2000;
                }
            }
            this.g = i2;
            sg.bigo.ads.common.n.d.a(2, this.d);
            this.f45665l = true;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x005c  */
        /* JADX WARN: Code duplicated, block: B:39:0x006f  */
        /* JADX WARN: Code duplicated, block: B:41:0x007b  */
        /* JADX WARN: Code duplicated, block: B:47:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        public static /* synthetic */ void b(a aVar, Rect rect) {
            if (aVar.j == 0) {
                aVar.j = SystemClock.elapsedRealtime();
            }
            float fA = aVar.a(rect);
            d dVar = d.this;
            View view = dVar.f45585c;
            int iO = dVar.o();
            int iP = d.this.p();
            if (view != null && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
                int width = view.getWidth() * view.getHeight();
                if (iO == 1) {
                    if (iP == 2 ? width <= 242000 ? fA <= 0.5f : fA <= 0.3f : fA <= 0.5f) {
                        if (sg.bigo.ads.api.core.b.b(d.this.o())) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else if (iO != 2) {
                    if (iO != 3 && iO != 4) {
                        if (iO != 12) {
                            if (sg.bigo.ads.api.core.b.b(d.this.o())) {
                                return;
                            } else {
                                return;
                            }
                        } else if (iP == 2) {
                            if (sg.bigo.ads.api.core.b.b(d.this.o())) {
                                return;
                            } else {
                                return;
                            }
                        } else if (sg.bigo.ads.api.core.b.b(d.this.o())) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else if (width <= 242000 ? fA <= 0.5f : fA <= 0.3f) {
                    if (sg.bigo.ads.api.core.b.b(d.this.o())) {
                        return;
                    } else {
                        return;
                    }
                }
            } else if (sg.bigo.ads.api.core.b.b(d.this.o()) || d.this.f45587h) {
                return;
            }
            if (SystemClock.elapsedRealtime() - aVar.j >= aVar.g) {
                d.this.d(q.a("%.4f", Float.valueOf(fA)));
                aVar.f45661c = true;
            }
        }

        public final void a() {
            sg.bigo.ads.common.n.d.a(this.d);
            this.f45665l = false;
        }

        public final void a(final View view, boolean z2) {
            d.this.f45585c = view;
            if (view == null) {
                return;
            }
            if (z2) {
                sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.d.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.b();
                    }
                });
            } else {
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: sg.bigo.ads.ad.d.a.3
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view2) {
                        a.this.b();
                        view.removeOnAttachStateChangeListener(this);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view2) {
                        a.this.a();
                    }
                });
            }
        }

        public static /* synthetic */ void a(a aVar, Rect rect) {
            float fA;
            if (aVar.f45664i == 0) {
                aVar.f45664i = SystemClock.elapsedRealtime();
            }
            if (aVar.k) {
                fA = 0.0f;
            } else {
                fA = aVar.a(rect);
                View view = d.this.f45585c;
                int i2 = aVar.f45663h;
                if ((view != null && view.getMeasuredHeight() > 0 && view.getMeasuredWidth() > 0 && (i2 == 0 || i2 <= 100.0f * fA)) || (sg.bigo.ads.api.core.b.b(d.this.o()) && !d.this.f45587h)) {
                    aVar.k = true;
                }
            }
            long jMax = aVar.f45659a == 1 ? Math.max(r.f47535a.a(1), aVar.f) : aVar.f;
            if (!aVar.k || SystemClock.elapsedRealtime() - aVar.f45664i < jMax) {
                return;
            }
            if (fA == 0.0f) {
                fA = aVar.a(rect);
            }
            d.this.a("show_proportion", q.a("%.4f", Float.valueOf(fA)));
            d.this.a_();
            aVar.f45660b = true;
        }
    }

    public d(g gVar) {
        super(gVar);
        this.x = false;
        this.f45658w = new a();
    }

    public static /* synthetic */ long a(d dVar) {
        o.b bVarAA;
        sg.bigo.ads.api.core.c cVar = dVar.f45584b.f47032a;
        if (!(cVar instanceof o) || (bVarAA = ((o) cVar).aA()) == null) {
            return 0L;
        }
        return bVarAA.b();
    }

    public static /* synthetic */ long b(d dVar) {
        o.b bVarAA;
        sg.bigo.ads.api.core.c cVar = dVar.f45584b.f47032a;
        if (!(cVar instanceof o) || (bVarAA = ((o) cVar).aA()) == null) {
            return 0L;
        }
        return bVarAA.d();
    }

    public static /* synthetic */ int c(d dVar) {
        o.b bVarAA;
        sg.bigo.ads.api.core.c cVar = dVar.f45584b.f47032a;
        if (!(cVar instanceof o) || (bVarAA = ((o) cVar).aA()) == null) {
            return 0;
        }
        return bVarAA.a();
    }

    public static /* synthetic */ int d(d dVar) {
        o.b bVarAA;
        sg.bigo.ads.api.core.c cVar = dVar.f45584b.f47032a;
        if (!(cVar instanceof o) || (bVarAA = ((o) cVar).aA()) == null) {
            return 0;
        }
        return bVarAA.c();
    }

    @Override // sg.bigo.ads.ad.c
    public void destroyInMainThread() {
        super.destroyInMainThread();
        this.f45658w.a();
    }

    @Override // sg.bigo.ads.ad.c
    public final void k() {
        super.k();
        this.f45658w.a();
    }

    public final void w() {
        this.f45658w.b();
    }

    @Override // sg.bigo.ads.ad.c
    public void a() {
        super.a();
        d<T, U>.a aVar = this.f45658w;
        if (aVar != null) {
            aVar.a();
        }
        this.x = false;
        this.f45658w = new a();
    }

    public final void d(String str) {
        if (this.x) {
            return;
        }
        this.x = true;
        String strI = i();
        int iIntValue = ((Integer) b("render_style", 0)).intValue();
        if (a("06002029")) {
            sg.bigo.ads.core.d.b.a(this, str, strI, iIntValue);
        }
        sg.bigo.ads.api.b.a aVar = this.f47001U;
        if (aVar != null) {
            aVar.a(str, strI, iIntValue);
        }
    }

    public final void a(View view, boolean z2) {
        this.f45658w.a(view, z2);
    }
}
