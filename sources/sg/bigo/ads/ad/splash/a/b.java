package sg.bigo.ads.ad.splash.a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public class b implements h {
    public static Bitmap j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    n f46823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final m f46824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final m f46825c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    n f46826e;
    n f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected sg.bigo.ads.ad.splash.b f46827h;
    sg.bigo.ads.api.core.g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f46829l;
    private Runnable m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f46830n;
    AtomicBoolean d = new AtomicBoolean(false);
    final AtomicBoolean g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f46828i = c.a.f46853a;
    private int o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<w> f46831p = new ArrayList();

    public b(sg.bigo.ads.api.core.g gVar, m mVar, m mVar2, sg.bigo.ads.ad.splash.b bVar) {
        this.f46827h = bVar;
        this.f46824b = mVar;
        this.f46825c = mVar2;
        this.k = gVar;
        this.f46829l = gVar.f47032a.i();
    }

    private void l() {
        n nVar = this.f46826e;
        if (nVar != null) {
            nVar.b();
            this.f46826e = null;
        }
        if (this.m != null) {
            this.m = null;
        }
    }

    private void m() {
        this.f46828i = c.a.d;
        n nVar = this.f46823a;
        if (nVar != null) {
            nVar.b();
        }
        n nVar2 = this.f;
        if (nVar2 != null) {
            nVar2.b();
        }
        l();
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a() {
        VideoController videoController;
        if (this.f46828i == c.a.f46854b && (videoController = this.f46827h.x.getVideoController()) != null) {
            videoController.setVideoLifeCallback(new VideoController.VideoLifeCallback() { // from class: sg.bigo.ads.ad.splash.a.b.1
                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onMuteChange(boolean z2) {
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoEnd() {
                    if (!b.this.f46827h.C()) {
                        b.this.f46827h.A();
                    }
                    sg.bigo.ads.ad.splash.b bVar = b.this.f46827h;
                    m mVar = bVar.f46917A;
                    if (mVar == null || mVar.a("endpage.endpage_timing", 0) != 2) {
                        return;
                    }
                    bVar.a(8, 1);
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoPause() {
                    b.this.f46827h.y();
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoPlay() {
                    b.this.f46827h.z();
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoStart() {
                    if (b.this.g.compareAndSet(true, false)) {
                        b.this.h();
                        n nVar = b.this.f46823a;
                        if (nVar != null) {
                            nVar.b();
                            b.this.f46823a = null;
                        }
                        b.this.f46827h.x();
                        n nVar2 = b.this.f;
                        if (nVar2 != null) {
                            nVar2.b();
                            b.this.f = null;
                        }
                    }
                }
            });
            videoController.setBackupLoadCallback(new VideoController.a() { // from class: sg.bigo.ads.ad.splash.a.b.5
                @Override // sg.bigo.ads.api.VideoController.a
                public final void i(boolean z2) {
                    sg.bigo.ads.common.t.a.a(0, 4, "SplashAd", "backup image loaded when show default backup style, so cancel this timer");
                    n nVar = b.this.f46826e;
                    if (nVar != null) {
                        nVar.b();
                        b.this.f46826e = null;
                    }
                    n nVar2 = b.this.f46823a;
                    if (nVar2 != null) {
                        nVar2.b();
                        b.this.f46823a = null;
                    }
                    b.this.f46827h.x();
                    n nVar3 = b.this.f;
                    if (nVar3 != null) {
                        nVar3.b();
                        b.this.f = null;
                    }
                }
            });
        }
        h();
        sg.bigo.ads.api.core.g gVar = this.f46827h.f46918B;
        final String strL = gVar == null ? "" : gVar.f47033b.l();
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.ad.splash.a.b.12
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.controller.c.a.a(strL);
                sg.bigo.ads.common.x.a.j(strL);
                String str = strL;
                sg.bigo.ads.common.x.a.a(str, sg.bigo.ads.common.x.a.i(str) + 1);
                sg.bigo.ads.common.x.a.a(strL, System.currentTimeMillis());
            }
        });
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void b() {
        l();
        this.d.set(true);
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public void c() {
        m();
        j = null;
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final int d() {
        return this.f46828i;
    }

    public int e() {
        if (this.f46825c != null && f()) {
            return sg.bigo.ads.ad.splash.a.b(this.f46824b) ? R.layout.bigo_ad_splash_style_halfscreen : R.layout.bigo_ad_splash_style_fullscreen_immersive;
        }
        return sg.bigo.ads.ad.splash.a.a(this.f46824b);
    }

    public final boolean f() {
        m mVar = this.f46825c;
        return mVar != null && 2 == mVar.a("video_play_page.ad_component_layout", 1);
    }

    public boolean g() {
        return true;
    }

    public final void h() {
        int iA;
        int iMax;
        int iB;
        final int iA2;
        n nVar = this.f46826e;
        if (nVar != null) {
            nVar.b();
            this.f46826e = null;
        }
        final int i2 = -1;
        if (this.g.get() && this.f46827h.f().bh() == null) {
            m mVar = this.f46825c;
            if (mVar != null && (iA2 = x.a(mVar.a("video_play_page.time_for_auto_click", -1))) > 0) {
                n nVar2 = new n(((long) iA2) * 1000) { // from class: sg.bigo.ads.ad.splash.a.b.9
                    @Override // sg.bigo.ads.common.utils.n
                    public final void a() {
                        if (b.this.d.compareAndSet(false, true)) {
                            sg.bigo.ads.common.t.a.a(0, 4, "Interstitial Video", android.support.v4.media.a.i(iA2, "s", new StringBuilder("auto click after ")));
                            b.this.f46827h.E();
                        }
                    }

                    @Override // sg.bigo.ads.common.utils.n
                    public final void a(long j2) {
                    }
                };
                this.f46826e = nVar2;
                nVar2.c();
            }
            m mVar2 = this.f46825c;
            if (mVar2 == null || (iB = x.b(mVar2.a("video_play_page.time_for_show_backup", -1))) <= 0) {
                return;
            }
            n nVar3 = new n(((long) iB) * 1000) { // from class: sg.bigo.ads.ad.splash.a.b.2
                @Override // sg.bigo.ads.common.utils.n
                public final void a() {
                    b.this.f46827h.a(10, 13);
                }

                @Override // sg.bigo.ads.common.utils.n
                public final void a(long j2) {
                }
            };
            this.f = nVar3;
            nVar3.c();
            return;
        }
        m mVar3 = this.f46825c;
        if (mVar3 == null || (iA = mVar3.a("video_play_page.auto_click")) < 2 || iA > 7) {
            return;
        }
        if (iA <= 5) {
            i2 = iA;
        } else if (iA == 7 && (iMax = Math.max(0, this.f46824b.a("splash_duration"))) > 0 && this.f46823a != null) {
            i2 = iMax - 1;
        }
        if (i2 >= 0) {
            n nVar4 = new n(((long) i2) * 1000) { // from class: sg.bigo.ads.ad.splash.a.b.10
                @Override // sg.bigo.ads.common.utils.n
                public final void a() {
                    if (b.this.d.compareAndSet(false, true)) {
                        sg.bigo.ads.common.t.a.a(0, 4, "Interstitial Video", android.support.v4.media.a.i(i2, "s", new StringBuilder("auto click after ")));
                        b.this.f46827h.E();
                    }
                }

                @Override // sg.bigo.ads.common.utils.n
                public final void a(long j2) {
                }
            };
            this.f46826e = nVar4;
            nVar4.c();
        } else if (iA == 6) {
            this.m = new Runnable() { // from class: sg.bigo.ads.ad.splash.a.b.11
                @Override // java.lang.Runnable
                public final void run() {
                    if (b.this.d.compareAndSet(false, true)) {
                        sg.bigo.ads.common.t.a.a(0, 4, "Interstitial Video", "auto click after ");
                        b.this.f46827h.E();
                    }
                }
            };
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.h
    public final AtomicBoolean i() {
        return this.g;
    }

    @Override // sg.bigo.ads.ad.splash.a.h
    public final void j() {
        Runnable runnable = this.m;
        if (runnable != null) {
            runnable.run();
            this.m = null;
        }
    }

    public final void k() {
        this.o = 2;
        Iterator<w> it = this.f46831p.iterator();
        while (it.hasNext()) {
            it.next().a();
            it.remove();
        }
    }

    public void a(ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.bigo_ad_splash_btn_cta_container);
        boolean zG = g();
        if (viewGroup2 != null) {
            if (zG) {
                sg.bigo.ads.ad.splash.a.a(viewGroup2, i2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
    }

    public final void a(sg.bigo.ads.ad.b.c cVar, final ImageView imageView) {
        sg.bigo.ads.ad.splash.a.a(cVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.splash.a.b.8
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                final Bitmap bitmap2 = bitmap;
                imageView.post(new Runnable() { // from class: sg.bigo.ads.ad.splash.a.b.8.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        imageView.setImageBitmap(bitmap2);
                    }
                });
            }
        });
    }

    @Override // sg.bigo.ads.ad.splash.a.h
    public final void a(w wVar) {
        if (wVar == null) {
            return;
        }
        if (j != null) {
            wVar.a();
            return;
        }
        this.f46831p.add(wVar);
        if (this.o == 1) {
            return;
        }
        o oVar = (o) this.f46827h.x.f();
        if (!oVar.aR()) {
            String strAT = oVar.aT();
            if (q.a((CharSequence) strAT)) {
                k();
                return;
            } else {
                this.o = 1;
                sg.bigo.ads.common.p.e.a(this.f46827h.f45584b.f47035e, strAT, oVar.al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.splash.a.b.4
                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i2, String str, String str2) {
                        b.this.k();
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(Bitmap bitmap, sg.bigo.ads.common.p.f fVar) {
                        b.j = bitmap;
                        b.this.k();
                    }
                });
                return;
            }
        }
        String strB = sg.bigo.ads.common.o.b(this.f46827h.f45584b.f47035e, oVar.aN());
        if (q.a((CharSequence) strB)) {
            k();
            return;
        }
        this.o = 1;
        final String path = Uri.parse(strB).getPath();
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.ad.splash.a.b.3
            @Override // java.lang.Runnable
            public final void run() {
                b.j = sg.bigo.ads.common.utils.d.a(Uri.parse(path).getPath(), b.this.f46827h.f45584b.f47035e);
                b.this.k();
            }
        });
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public void a(boolean z2) {
        if (!z2) {
            n nVar = this.f46826e;
            if (nVar != null) {
                nVar.d();
            }
            n nVar2 = this.f;
            if (nVar2 != null) {
                nVar2.d();
                return;
            }
            return;
        }
        n nVar3 = this.f46826e;
        if (nVar3 != null && nVar3.e()) {
            this.f46826e.c();
        }
        n nVar4 = this.f;
        if (nVar4 == null || !nVar4.e()) {
            return;
        }
        this.f.c();
    }

    /* JADX WARN: Failed to calculate best type for var: r6v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v28 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v30 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v10 ??, new type: char
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // sg.bigo.ads.ad.splash.a.c
    public void a(boolean r19, android.view.ViewGroup r20, int r21) {
        /*
            Method dump skipped, instruction units count: 963
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.splash.a.b.a(boolean, android.view.ViewGroup, int):void");
    }
}
