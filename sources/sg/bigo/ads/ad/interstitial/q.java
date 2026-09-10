package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.thinkup.core.common.n.mo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.AutoNextLineLinearLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    final d f46522A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    final e f46523B;
    c C;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final f f46525F;
    private Runnable G;
    private Runnable H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private View f46526I;
    private int M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private long f46528N;
    private boolean O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Runnable f46529P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f46531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final sg.bigo.ads.ad.b.c f46532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final sg.bigo.ads.api.core.c f46533c;
    final sg.bigo.ads.api.a.m d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Runnable f46534e;
    FrameLayout f;
    FrameLayout g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    AlertDialog f46535h;
    boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    boolean f46539p;
    int q;
    long s;
    List<Integer> t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    long f46540u;
    Runnable v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Runnable f46541w;
    Runnable x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final a f46542z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f46536i = true;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f46527J = false;
    boolean j = false;
    private boolean K = false;
    boolean k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f46537l = false;
    boolean m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f46538n = false;
    int r = 0;
    private long L = -1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final List<Runnable> f46530Q = new ArrayList();
    public final b y = new b();
    boolean D = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    int f46524E = 0;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f46606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f46607c;
        boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f46608e;
        int f;
        boolean g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f46609h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f46610i;
        int j;
        float k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f46611l;
        View m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        View f46612n;
        View o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        q f46613p;
        final Map<View, sg.bigo.ads.core.adview.h> q;
        final sg.bigo.ads.core.adview.h r;

        private a() {
            this.f46605a = 0;
            this.q = new HashMap();
            this.r = new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.q.a.1
                @Override // sg.bigo.ads.core.adview.h
                public final void a(int i2, int i3, int i4, int i5, int i6, int i7) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Disable click by style config.");
                }
            };
        }

        public static /* synthetic */ View a(a aVar, View view, float f, float f2) {
            ArrayList arrayList = new ArrayList();
            aVar.a(view, f, f2, 0, new int[2], arrayList);
            if (arrayList.size() > 0) {
                return (View) android.support.v4.media.a.d(1, arrayList);
            }
            return null;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final sg.bigo.ads.core.adview.h a(final sg.bigo.ads.ad.b.c cVar, sg.bigo.ads.core.adview.h hVar) {
            return hVar == cVar ? new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.q.a.3
                @Override // sg.bigo.ads.core.adview.h
                public final void a(int i2, int i3, int i4, int i5, int i6, int i7) {
                    a.this.f46613p.m = true;
                    cVar.a(i2, i3, i4, i5, i6, i7);
                }
            } : hVar;
        }

        private void a(View view, float f, float f2, int i2, int[] iArr, List<View> list) {
            if (i2 > 10) {
                return;
            }
            int i3 = i2 + 1;
            if (view == null) {
                return;
            }
            view.getLocationOnScreen(iArr);
            int i4 = iArr[0];
            int i5 = iArr[1];
            if (f > i4 && f < view.getWidth() + i4 && f2 > i5 && f2 < view.getHeight() + i5 && (view.getTag() instanceof Integer) && this.q.containsKey(view)) {
                list.add(view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    a(viewGroup.getChildAt(i6), f, f2, i3, iArr, list);
                }
            }
        }

        private void a(final sg.bigo.ads.ad.b.c cVar, final View view, final int i2) {
            final int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            view.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.ad.interstitial.q.a.2

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                boolean f46615a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f46616b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f46617c;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ int f46619h = 11;

                private View a(float f) {
                    a aVar = a.this;
                    if (f < aVar.f46609h) {
                        return aVar.f46612n;
                    }
                    int i3 = aVar.f;
                    if (i3 <= 0 || f <= aVar.j - i3) {
                        return null;
                    }
                    return aVar.o;
                }

                /* JADX WARN: Code duplicated, block: B:69:0x0155 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:70:0x0157  */
                /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:73:0x0185
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
                    	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
                    */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View r17, android.view.MotionEvent r18) {
                    /*
                        Method dump skipped, instruction units count: 473
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.q.a.AnonymousClass2.onTouch(android.view.View, android.view.MotionEvent):boolean");
                }
            });
        }

        public final void a(sg.bigo.ads.ad.b.c cVar, View view, View view2, int i2, sg.bigo.ads.core.adview.h hVar) {
            if (view.getTag() != null) {
                sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Error that touch view exists another tag.");
            }
            view.setTag(R.id.content, "TouchView");
            view2.setTag(Integer.valueOf(i2));
            if (hVar != null) {
                this.q.put(view2, hVar);
            }
            a(cVar, view, view2, hVar, this.f46605a);
        }

        private void a(sg.bigo.ads.ad.b.c cVar, View view, View view2, sg.bigo.ads.core.adview.h hVar, int i2) {
            if (hVar == null) {
                view2.setOnTouchListener(null);
            } else {
                a(cVar, view, i2);
            }
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f46623a = false;

        public b() {
        }

        private void b(Runnable runnable) {
            q.b(q.this);
            sg.bigo.ads.common.n.d.a(2, runnable);
        }

        public final boolean a() {
            q qVar = q.this;
            if (qVar.f46536i && !this.f46623a) {
                this.f46623a = true;
                Runnable runnable = qVar.f46541w;
                if (runnable != null) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Show mid page due to close button pressed in main page.");
                    b(runnable);
                    return true;
                }
            }
            return false;
        }

        public final boolean a(Runnable runnable) {
            Runnable runnable2;
            q qVar = q.this;
            if (qVar.f46536i && !this.f46623a) {
                this.f46623a = true;
                Runnable runnable3 = qVar.f46541w;
                if (runnable3 == null && (runnable2 = qVar.v) != null) {
                    sg.bigo.ads.common.n.d.a(runnable2);
                    q qVar2 = q.this;
                    runnable3 = qVar2.v;
                    qVar2.f46541w = runnable3;
                }
                if (runnable3 != null) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Show mid page due to video completion.");
                    q.this.x = runnable;
                    b(runnable3);
                    return true;
                }
            }
            return false;
        }
    }

    public interface c {
        boolean a(Runnable runnable);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f46626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f46627c;

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f46628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f46629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f46630c;
        private final Map<Integer, Long> d;

        private e() {
            this.d = new HashMap();
        }

        public static int a(int i2, boolean z2) {
            if (i2 == 1) {
                return z2 ? 2 : 1;
            }
            if (i2 == 2) {
                return 4;
            }
            if (i2 == 3) {
                return 3;
            }
            if (i2 == 4) {
                return 5;
            }
            return i2 == 5 ? 6 : 0;
        }

        public final void b(sg.bigo.ads.api.core.c cVar, int i2, String str, int i3) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iA = a(str, i3);
            Long l2 = this.d.get(Integer.valueOf(iA));
            if (l2 == null) {
                return;
            }
            sg.bigo.ads.core.d.b.a(cVar, a(i2, false), 5, String.valueOf(iA), SystemClock.elapsedRealtime() - l2.longValue(), false, 0, (String) null);
        }

        public /* synthetic */ e(byte b2) {
            this();
        }

        private static int a(String str, int i2) {
            return (str + i2).hashCode();
        }

        public final void a(sg.bigo.ads.api.core.c cVar, int i2, String str, int i3) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iA = a(str, i3);
            if (this.d.get(Integer.valueOf(iA)) == null) {
                this.d.put(Integer.valueOf(iA), Long.valueOf(SystemClock.elapsedRealtime()));
                sg.bigo.ads.core.d.b.a(cVar, a(i2, false), 1, String.valueOf(iA), 0L, false, 0, (String) null);
            }
        }

        public final void a(sg.bigo.ads.api.core.c cVar, int i2, String str, int i3, int i4, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iA = a(str, i3);
            Long l2 = this.d.get(Integer.valueOf(iA));
            if (l2 == null) {
                return;
            }
            sg.bigo.ads.core.d.b.a(cVar, a(i2, false), 6, String.valueOf(iA), SystemClock.elapsedRealtime() - l2.longValue(), true, i4, str2);
        }

        public final void a(sg.bigo.ads.api.core.c cVar, boolean z2, int i2, String str) {
            if (this.f46630c || this.f46628a <= 0) {
                return;
            }
            this.f46630c = true;
            sg.bigo.ads.core.d.b.a(cVar, a(1, z2), 4, (String) null, SystemClock.elapsedRealtime() - this.f46628a, true, i2, str);
        }
    }

    public q(Context context, sg.bigo.ads.ad.b.c cVar, sg.bigo.ads.api.core.c cVar2, sg.bigo.ads.api.a.m mVar, boolean z2, f fVar, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        byte b2 = 0;
        this.o = false;
        this.f46542z = new a(b2);
        this.f46522A = new d(b2);
        this.f46523B = new e(b2);
        this.f46531a = context;
        this.f46532b = cVar;
        this.f46533c = cVar2;
        this.f46525F = fVar;
        this.d = mVar;
        this.o = z2;
        this.f46534e = runnable;
        this.G = runnable2;
        this.H = runnable3;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12201. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private android.view.View a(android.content.Context r42, sg.bigo.ads.ad.b.c r43, sg.bigo.ads.api.core.c r44, boolean r45) {
        /*
            Method dump skipped, instruction units count: 1220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.q.a(android.content.Context, sg.bigo.ads.ad.b.c, sg.bigo.ads.api.core.c, boolean):android.view.View");
    }

    private FrameLayout b(Context context, View view, boolean z2) {
        int i2 = this.f46522A.f46626b;
        RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context);
        if (i2 == 1) {
            roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 12));
        } else {
            roundedFrameLayout.a(sg.bigo.ads.common.utils.e.a(context, 12), sg.bigo.ads.common.utils.e.a(context, 12), sg.bigo.ads.common.utils.e.a(context, 0), sg.bigo.ads.common.utils.e.a(context, 0));
        }
        roundedFrameLayout.addView(view, new FrameLayout.LayoutParams(-1, z2 ? -1 : -2));
        return roundedFrameLayout;
    }

    private void i() {
        Runnable runnable;
        if (this.y.f46623a) {
            if ((this.K || this.f46537l) && this.f46538n && (runnable = this.H) != null) {
                runnable.run();
                this.H = null;
            }
        }
    }

    private boolean j() {
        return (!this.f46536i || this.K || this.k) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    public final void c() {
        boolean z2;
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Mid page resume.");
        sg.bigo.ads.api.a.m mVar = this.d;
        if (mVar != null) {
            z2 = mVar.a("endpage.is_endpage", 1) == 0 && !this.d.c("layer.is_show_layer") && -1 == this.f46524E;
        }
        if (this.m && !z2) {
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Dismiss page after click.");
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.16
                @Override // java.lang.Runnable
                public final void run() {
                    q.this.f();
                }
            });
        } else {
            if (!this.O || this.f46540u <= 0 || this.v == null) {
                return;
            }
            this.O = false;
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", android.support.v4.media.a.j(this.f46540u, " ms.", new StringBuilder("Resume show task for ")));
            a(this.f46540u);
        }
    }

    public final void d() {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Mid page pause.");
        Runnable runnable = this.v;
        if (this.O || this.f46540u <= 0 || runnable == null) {
            return;
        }
        this.O = true;
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Pause show task.");
        sg.bigo.ads.common.n.d.a(runnable);
        this.f46540u -= SystemClock.elapsedRealtime() - this.f46528N;
    }

    public final void e() {
        int i2 = this.f46522A.f46626b;
        final FrameLayout frameLayout = this.f46537l ? this.g : this.f;
        if (frameLayout == null) {
            f();
            return;
        }
        sg.bigo.ads.common.utils.b.c cVar = new sg.bigo.ads.common.utils.b.c() { // from class: sg.bigo.ads.ad.interstitial.q.17
            @Override // sg.bigo.ads.common.utils.b.c, android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                frameLayout.clearAnimation();
                frameLayout.setVisibility(8);
                q.this.f();
            }
        };
        if (i2 == 1) {
            sg.bigo.ads.ad.interstitial.c.c(frameLayout, cVar);
        } else {
            sg.bigo.ads.ad.interstitial.c.b(frameLayout, cVar);
        }
    }

    public final void f() {
        if (this.f46535h != null) {
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Dismiss mid page.");
            this.f46535h.dismiss();
            this.f46535h = null;
            g();
            i();
        }
        h();
    }

    public final void g() {
        Runnable runnable;
        if (!this.f46538n || (runnable = this.G) == null) {
            return;
        }
        runnable.run();
        this.f46534e = null;
    }

    public final void h() {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Mid page clean unused resource.");
        Iterator<Runnable> it = this.f46530Q.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.f46530Q.clear();
        Runnable runnable = this.v;
        if (runnable != null) {
            sg.bigo.ads.common.n.d.a(runnable);
        }
        Runnable runnable2 = this.f46529P;
        if (runnable2 != null) {
            sg.bigo.ads.common.n.d.a(runnable2);
        }
        this.v = null;
        this.f46541w = null;
        this.k = true;
        this.f = null;
    }

    public final void b() {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Disable mid page.");
        this.f46536i = false;
    }

    public static /* synthetic */ void b(q qVar) {
        qVar.v = null;
        qVar.f46541w = null;
    }

    private FrameLayout a(Context context, View view, boolean z2) {
        int i2;
        FrameLayout frameLayout = new FrameLayout(context);
        int i3 = this.f46522A.f46626b;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, z2 ? -1 : -2);
        if (i3 == 1) {
            int iA = sg.bigo.ads.common.utils.e.a(context, 10);
            layoutParams.topMargin = iA;
            layoutParams.bottomMargin = iA;
            layoutParams.leftMargin = iA;
            layoutParams.rightMargin = iA;
            i2 = 17;
        } else {
            layoutParams.topMargin = sg.bigo.ads.common.utils.e.a(context, 40);
            i2 = 80;
        }
        layoutParams.gravity = i2;
        frameLayout.addView(view, layoutParams);
        return frameLayout;
    }

    private static LinearLayout a(Context context, View view, int i2) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(sg.bigo.ads.common.utils.q.b("#F0F3F4", -7829368));
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.bigo_ad_btn_close);
        imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_ic_close_gray_light));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(context, 24), sg.bigo.ads.common.utils.e.a(context, 24), 21);
        layoutParams.rightMargin = sg.bigo.ads.common.utils.e.a(context, 20);
        frameLayout.addView(imageView, layoutParams);
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(context, 48)));
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, i2));
        return linearLayout;
    }

    public final void a() {
        if (this.f46529P != null || this.L <= 0) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.12
            @Override // java.lang.Runnable
            public final void run() {
                q qVar = q.this;
                qVar.j = true;
                qVar.h();
            }
        };
        this.f46529P = runnable;
        sg.bigo.ads.common.n.d.a(2, runnable, this.L);
    }

    public final void a(int i2, boolean z2) {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Notify mid page content view rendered.");
        this.f46527J = true;
        this.q = i2;
        this.f46539p = z2;
        if (this.f46537l) {
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Loading page is showing, turn to show mid page.");
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.14
                @Override // java.lang.Runnable
                public final void run() {
                    q.a(q.this);
                }
            });
        }
    }

    public final void a(long j) {
        Runnable runnable = this.v;
        this.f46528N = SystemClock.elapsedRealtime();
        sg.bigo.ads.common.n.d.a(runnable);
        sg.bigo.ads.common.n.d.a(2, runnable, j);
    }

    private void a(Context context, View view, sg.bigo.ads.ad.b.c cVar, AutoNextLineLinearLayout autoNextLineLinearLayout, String[] strArr) {
        View view2;
        sg.bigo.ads.ad.b.c cVar2;
        int i2 = 0;
        while (i2 < strArr.length) {
            try {
                String str = strArr[i2];
                if (TextUtils.isEmpty(str)) {
                    view2 = view;
                    cVar2 = cVar;
                } else {
                    TextView textView = new TextView(context);
                    textView.setText(str);
                    textView.setTextColor(sg.bigo.ads.common.utils.q.b("#5F6367", -7829368));
                    textView.setTextSize(13.0f);
                    textView.setPadding(sg.bigo.ads.common.utils.e.a(context, 12), sg.bigo.ads.common.utils.e.a(context, 5), sg.bigo.ads.common.utils.e.a(context, 12), sg.bigo.ads.common.utils.e.a(context, 5));
                    textView.setGravity(17);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setColor(-1);
                    gradientDrawable.setStroke(sg.bigo.ads.common.utils.e.a(context, 1), sg.bigo.ads.common.utils.q.b("#DBDDE0", -7829368));
                    gradientDrawable.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 14));
                    textView.setBackground(gradientDrawable);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, sg.bigo.ads.common.utils.e.a(context, 28));
                    layoutParams.topMargin = sg.bigo.ads.common.utils.e.a(context, 12);
                    layoutParams.rightMargin = sg.bigo.ads.common.utils.e.a(context, 12);
                    view2 = view;
                    cVar2 = cVar;
                    a(view2, textView, 27, cVar2, cVar);
                    autoNextLineLinearLayout.addView(textView, layoutParams);
                }
                i2++;
                view = view2;
                cVar = cVar2;
            } catch (Exception unused) {
                return;
            }
        }
    }

    private void a(Context context, ViewGroup viewGroup, sg.bigo.ads.ad.b.c cVar, final sg.bigo.ads.api.core.c cVar2, String[] strArr) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        final ArrayList arrayList = new ArrayList();
        final int i2 = 0;
        while (i2 < strArr.length) {
            final String str = strArr[i2];
            if (!TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str)) {
                final int iA = sg.bigo.ads.common.utils.e.a(context, 200);
                final RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context);
                roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 4));
                roundedFrameLayout.setStrokeWidth(sg.bigo.ads.common.utils.e.a(context, 1));
                roundedFrameLayout.setStrokeColor(sg.bigo.ads.common.utils.q.b("#08000000", -7829368));
                final AdImageView adImageView = new AdImageView(context);
                adImageView.setBackgroundColor(sg.bigo.ads.common.utils.q.b("#FFE1E1E6", -7829368));
                adImageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_icon_default_only_icon));
                this.f46523B.a(cVar2, 2, str, i2);
                sg.bigo.ads.common.p.g gVar = new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.q.8
                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i3, String str2, String str3) {
                        q.this.f46523B.a(cVar2, 2, str, i2, i3, str2);
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(Bitmap bitmap, sg.bigo.ads.common.p.f fVar) {
                        ViewGroup.LayoutParams layoutParams;
                        adImageView.setBackground(null);
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        if (width > 0 && height > 0 && (layoutParams = roundedFrameLayout.getLayoutParams()) != null) {
                            layoutParams.width = (width * iA) / height;
                        }
                        adImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        q.this.f46523B.b(cVar2, 2, str, i2);
                    }
                };
                adImageView.a(gVar);
                arrayList.add(gVar);
                a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        adImageView.a();
                    }
                });
                adImageView.a(str, cVar2.al());
                roundedFrameLayout.addView(adImageView, new FrameLayout.LayoutParams(-1, -1));
                a aVar = this.f46542z;
                a(viewGroup, roundedFrameLayout, 5, cVar, aVar.f46607c ? cVar : aVar.r);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(context, 100), iA);
                layoutParams.leftMargin = i2 == 0 ? sg.bigo.ads.common.utils.e.a(context, 20) : sg.bigo.ads.common.utils.e.a(context, 12);
                if (i2 + 1 == strArr.length) {
                    layoutParams.rightMargin = sg.bigo.ads.common.utils.e.a(context, 20);
                }
                linearLayout.addView(roundedFrameLayout, layoutParams);
            }
            a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.10
                @Override // java.lang.Runnable
                public final void run() {
                    arrayList.clear();
                }
            });
            i2++;
        }
        a aVar2 = this.f46542z;
        a(viewGroup, viewGroup, 18, cVar, aVar2.d ? cVar : aVar2.r);
        viewGroup.addView(linearLayout);
    }

    public final void a(final Context context, final sg.bigo.ads.ad.b.c cVar, final sg.bigo.ads.api.core.c cVar2, final FrameLayout frameLayout) {
        Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.22
            @Override // java.lang.Runnable
            public final void run() {
                q qVar = q.this;
                qVar.D = false;
                boolean zA = qVar.a(frameLayout);
                if (cVar2 instanceof sg.bigo.ads.core.a.a) {
                    q qVar2 = q.this;
                    if (qVar2.s == 0) {
                        qVar2.s = SystemClock.elapsedRealtime();
                        ((sg.bigo.ads.core.a.a) cVar2).b(q.this.s);
                    }
                }
                sg.bigo.ads.api.core.c cVar3 = cVar2;
                q qVar3 = q.this;
                sg.bigo.ads.core.d.b.a(cVar3, "1", e.a(qVar3.q, qVar3.f46539p), q.this.r);
                Context context2 = context;
                if (context2 instanceof Activity) {
                    Activity activity = (Activity) context2;
                    if (activity.isFinishing() || activity.isDestroyed()) {
                        return;
                    }
                }
                AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setCancelable(!zA).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: sg.bigo.ads.ad.interstitial.q.22.1
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        q qVar4 = q.this;
                        qVar4.k = true;
                        qVar4.f46537l = false;
                    }
                }).create();
                alertDialogCreate.requestWindowFeature(1);
                alertDialogCreate.show();
                Window window = alertDialogCreate.getWindow();
                window.getDecorView().setPadding(0, 0, 0, 0);
                window.setGravity(17);
                window.setContentView(frameLayout);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = -1;
                attributes.height = -1;
                window.setAttributes(attributes);
                q.this.f46535h = alertDialogCreate;
                frameLayout.setVisibility(4);
                frameLayout.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.22.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass22 anonymousClass22 = AnonymousClass22.this;
                        int i2 = q.this.f46522A.f46626b;
                        frameLayout.setVisibility(0);
                        if (i2 == 1) {
                            sg.bigo.ads.ad.interstitial.c.d(frameLayout);
                        } else {
                            sg.bigo.ads.ad.interstitial.c.a(frameLayout, 400L, new sg.bigo.ads.common.utils.b.c());
                        }
                    }
                });
                q qVar4 = q.this;
                Runnable runnable2 = qVar4.f46534e;
                if (runnable2 != null) {
                    runnable2.run();
                    qVar4.f46534e = null;
                    qVar4.f46538n = true;
                }
            }
        };
        c cVar3 = this.C;
        if (cVar3 != null) {
            this.D = cVar3.a(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, View view2, int i2, sg.bigo.ads.ad.b.c cVar, sg.bigo.ads.core.adview.h hVar) {
        a aVar = this.f46542z;
        aVar.a(cVar, view, view2, i2, aVar.a(cVar, hVar));
    }

    private void a(Runnable runnable) {
        this.f46530Q.add(runnable);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5391. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static /* synthetic */ void a(sg.bigo.ads.ad.interstitial.q r16, android.content.Context r17, sg.bigo.ads.ad.b.c r18, sg.bigo.ads.api.core.c r19) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.q.a(sg.bigo.ads.ad.interstitial.q, android.content.Context, sg.bigo.ads.ad.b.c, sg.bigo.ads.api.core.c):void");
    }

    public static /* synthetic */ void a(q qVar, final Context context, final sg.bigo.ads.ad.b.c cVar, final sg.bigo.ads.api.core.c cVar2, int i2) {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Notify mid page content view render failed, try next render way.");
        qVar.r = i2;
        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.15
            @Override // java.lang.Runnable
            public final void run() {
                q.a(q.this, context, cVar, cVar2);
            }
        });
    }

    private void a(sg.bigo.ads.api.core.c cVar) {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "All render way failed.");
        this.j = true;
        sg.bigo.ads.core.d.b.a(cVar, "0", e.a(this.q, this.f46539p), this.r);
        e();
    }

    public final boolean a(Context context, sg.bigo.ads.ad.b.c cVar, sg.bigo.ads.api.core.c cVar2, sg.bigo.ads.api.a.m mVar) {
        String str;
        if (context == null) {
            str = "Invalid context.";
        } else if (cVar == null) {
            str = "Invalid native ad.";
        } else if (cVar2 == null) {
            str = "Invalid adData.";
        } else if (mVar == null) {
            str = "Invalid style config.";
        } else {
            if (!this.K) {
                return true;
            }
            str = "Mid page has been shown.";
        }
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", str);
        return false;
    }

    public final boolean a(FrameLayout frameLayout) {
        int iA;
        final View viewFindViewById = frameLayout.findViewById(R.id.bigo_ad_btn_cta);
        if (viewFindViewById != null && this.f46542z.f46608e) {
            sg.bigo.ads.ad.interstitial.c.e(viewFindViewById);
            a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.2
                @Override // java.lang.Runnable
                public final void run() {
                    viewFindViewById.clearAnimation();
                }
            });
        }
        final View viewFindViewById2 = frameLayout.findViewById(R.id.bigo_ad_btn_close);
        if (viewFindViewById2 == null) {
            return false;
        }
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.interstitial.q.19
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.this.e();
            }
        });
        sg.bigo.ads.api.a.m mVar = this.d;
        if (mVar != null) {
            iA = mVar.a("mid_page.force_staying_time");
            if (iA < 0 || iA > 5) {
                iA = 3;
            }
        } else {
            iA = 0;
        }
        if (iA == 0) {
            viewFindViewById2.setVisibility(0);
            return true;
        }
        viewFindViewById2.setVisibility(4);
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.20
            @Override // java.lang.Runnable
            public final void run() {
                viewFindViewById2.setVisibility(0);
            }
        }, iA * 1000);
        return true;
    }

    public static /* synthetic */ boolean a(q qVar) {
        String str;
        String str2;
        final Context context = qVar.f46531a;
        final sg.bigo.ads.ad.b.c cVar = qVar.f46532b;
        final sg.bigo.ads.api.core.c cVar2 = qVar.f46533c;
        if (qVar.a(context, cVar, cVar2, qVar.d)) {
            final int i2 = qVar.q;
            final boolean z2 = qVar.f46539p;
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Try show mid page.");
            View view = qVar.f46526I;
            boolean z3 = qVar.f46527J;
            boolean z4 = qVar.j;
            if (z3 && view != null) {
                StringBuilder sb = new StringBuilder("Show mid page content, render way: ");
                if (i2 == 1) {
                    str2 = "WEB_VIEW";
                } else if (i2 == 2) {
                    str2 = "NATIVE";
                } else if (i2 == 3) {
                    str2 = "IMAGE";
                } else if (i2 != 4) {
                    str2 = i2 != 5 ? "UNKNOWN" : "LOADING";
                } else {
                    str2 = "FALLBACK";
                }
                sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", android.support.v4.media.a.r(sb, str2, mo.ono));
                if (qVar.j()) {
                    boolean z5 = qVar.q == 3;
                    final FrameLayout frameLayoutA = qVar.a(context, qVar.b(context, view, z5), z5);
                    qVar.K = true;
                    if (cVar2 instanceof sg.bigo.ads.core.a.a) {
                        ((sg.bigo.ads.core.a.a) cVar2).g(e.a(i2, z2));
                    }
                    sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.18
                        @Override // java.lang.Runnable
                        public final void run() {
                            q qVar2 = q.this;
                            Context context2 = context;
                            sg.bigo.ads.ad.b.c cVar3 = cVar;
                            sg.bigo.ads.api.core.c cVar4 = cVar2;
                            FrameLayout frameLayout = frameLayoutA;
                            if (!qVar2.f46537l) {
                                qVar2.a(context2, cVar3, cVar4, frameLayout);
                                qVar2.f = frameLayout;
                                return;
                            }
                            FrameLayout frameLayout2 = qVar2.g;
                            if (frameLayout2 != null) {
                                frameLayout2.removeAllViews();
                                qVar2.a(frameLayout);
                                frameLayout2.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                            }
                            qVar2.f = frameLayout2;
                            qVar2.f46537l = false;
                            if ((cVar4 instanceof sg.bigo.ads.core.a.a) && qVar2.s == 0) {
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                qVar2.s = jElapsedRealtime;
                                ((sg.bigo.ads.core.a.a) cVar4).b(jElapsedRealtime);
                            }
                            sg.bigo.ads.core.d.b.a(cVar4, "1", e.a(qVar2.q, qVar2.f46539p), qVar2.r);
                        }
                    });
                }
                return true;
            }
            if (z4) {
                str = "Failed to show mid page due to unavailable.";
            } else {
                if (!z3 && view != null) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Show mid page loading.");
                    if (qVar.j()) {
                        final FrameLayout frameLayout = new FrameLayout(context);
                        View viewA = sg.bigo.ads.common.utils.a.a(context, qVar.o ? R.layout.bigo_ad_layout_interstitial_mid_page_loading_view_landscape : R.layout.bigo_ad_layout_interstitial_mid_page_loading_view, null, false);
                        if (viewA != null) {
                            qVar.f46537l = true;
                            FrameLayout frameLayoutA2 = qVar.a(context, (View) qVar.b(context, a(context, viewA, -1), true), true);
                            frameLayout.addView(frameLayoutA2, new FrameLayout.LayoutParams(-1, -1));
                            a aVar = qVar.f46542z;
                            qVar.a(viewA, viewA, 18, cVar, aVar.f46606b ? cVar : aVar.r);
                            a aVar2 = qVar.f46542z;
                            qVar.a(frameLayoutA2, frameLayoutA2, 18, cVar, aVar2.f46606b ? cVar : aVar2.r);
                            qVar.g = frameLayout;
                            if (cVar2 instanceof sg.bigo.ads.core.a.a) {
                                ((sg.bigo.ads.core.a.a) cVar2).g(6);
                            }
                            qVar.q = 5;
                            sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.21
                                @Override // java.lang.Runnable
                                public final void run() {
                                    q.this.a(context, cVar, cVar2, frameLayout);
                                }
                            });
                        }
                    }
                    return true;
                }
                str = "Failed to show mid page due to unknown reason.";
            }
            sg.bigo.ads.common.t.a.a(0, "InterstitialMidPageRenderer", str);
        }
        return false;
    }
}
