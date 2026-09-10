package sg.bigo.ads.core.mraid;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements sg.bigo.ads.common.d.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final sg.bigo.ads.core.mraid.c.b f48642A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final sg.bigo.ads.core.mraid.c.b f48643B;
    private int C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f48644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final n f48645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final FrameLayout f48646c;
    final sg.bigo.ads.core.mraid.a.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final j f48647e;
    o f;
    public b g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    sg.bigo.ads.core.mraid.c.C0874c f48648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final sg.bigo.ads.core.mraid.c f48649i;
    final sg.bigo.ads.core.mraid.c j;
    final c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private WeakReference<Activity> f48650l;
    private ViewGroup m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C0875e f48651n;
    private l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private sg.bigo.ads.core.mraid.c.C0874c f48652p;
    private Integer q;
    private final int r;
    private int s;
    private boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private i f48653u;
    private final h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f48654w;
    private boolean x;
    private sg.bigo.ads.core.mraid.a y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Handler f48655z;

    public interface a extends b {
        void a(String str, String str2);
    }

    public interface b {
        void a();

        void a(String str, sg.bigo.ads.common.i iVar);

        boolean a(Activity activity, int i2);

        void b();

        boolean b(Activity activity, int i2);

        void c();

        void d();

        void e();

        void f();

        void g();
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f48665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f48666b;

        private c() {
            this.f48665a = -1;
            this.f48666b = -1;
        }

        public final void a() {
            int measuredWidth = e.this.f48648h.getMeasuredWidth();
            int measuredHeight = e.this.f48648h.getMeasuredHeight();
            this.f48665a = measuredWidth;
            this.f48666b = measuredHeight;
        }

        public /* synthetic */ c(e eVar, byte b2) {
            this();
        }
    }

    public interface d {
        void a();
    }

    /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.e$e, reason: collision with other inner class name */
    public static class C0875e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Handler f48668a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a f48669b;

        /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.e$e$a */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final View[] f48670a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final Handler f48671b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Runnable f48672c;
            int d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final Runnable f48673e;

            private a(Handler handler, View[] viewArr) {
                this.f48673e = new Runnable() { // from class: sg.bigo.ads.core.mraid.e.e.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        for (final View view : a.this.f48670a) {
                            if (view.getHeight() > 0 || view.getWidth() > 0) {
                                a.a(a.this);
                            } else {
                                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: sg.bigo.ads.core.mraid.e.e.a.1.1
                                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                                    public final boolean onPreDraw() {
                                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                                        a.a(a.this);
                                        return true;
                                    }
                                });
                            }
                        }
                    }
                };
                this.f48671b = handler;
                this.f48670a = viewArr;
            }

            public final void a() {
                this.f48671b.removeCallbacks(this.f48673e);
                this.f48672c = null;
            }

            public /* synthetic */ a(Handler handler, View[] viewArr, byte b2) {
                this(handler, viewArr);
            }

            public static /* synthetic */ void a(a aVar) {
                Runnable runnable;
                int i2 = aVar.d - 1;
                aVar.d = i2;
                if (i2 != 0 || (runnable = aVar.f48672c) == null) {
                    return;
                }
                runnable.run();
                aVar.f48672c = null;
            }
        }

        public final void a() {
            a aVar = this.f48669b;
            if (aVar != null) {
                aVar.a();
                this.f48669b = null;
            }
        }
    }

    public e(Context context, n nVar) {
        this(context, nVar, new sg.bigo.ads.core.mraid.c(nVar), new sg.bigo.ads.core.mraid.c(n.INTERSTITIAL), new C0875e());
    }

    public static int a(int i2, int i3, int i4) {
        return Math.max(i2, Math.min(i3, i4));
    }

    private void l() {
        this.f48649i.a();
        this.f48648h = null;
    }

    private void m() {
        this.j.a();
        this.f48652p = null;
    }

    private void n() throws sg.bigo.ads.core.mraid.d {
        int iA;
        i iVar = this.f48653u;
        if (iVar != i.NONE) {
            iA = iVar.d;
        } else {
            if (this.t) {
                o();
                return;
            }
            Activity activity = this.f48650l.get();
            if (activity == null) {
                throw new sg.bigo.ads.core.mraid.d("Unable to set MRAID expand orientation to 'none'; expected passed in Activity Context.");
            }
            iA = sg.bigo.ads.common.aa.b.a(activity);
        }
        a(iA);
    }

    private void o() {
        Integer num;
        j().setSystemUiVisibility(this.s);
        Activity activity = this.f48650l.get();
        if (activity != null && (num = this.q) != null) {
            b bVar = this.g;
            if (bVar != null && bVar.b(activity, num.intValue())) {
                return;
            } else {
                activity.setRequestedOrientation(this.q.intValue());
            }
        }
        this.q = null;
    }

    private boolean p() {
        return !this.d.f48608a.isVisible();
    }

    private void q() {
        if (this.y != null) {
            this.f48644a.getContentResolver().unregisterContentObserver(this.y);
            this.y = null;
        }
    }

    public final sg.bigo.ads.core.mraid.c.C0874c b() {
        return this.j.c() ? this.f48652p : this.f48648h;
    }

    public final boolean c() {
        Activity activity = this.f48650l.get();
        if (activity == null || b() == null) {
            return false;
        }
        if (this.f48645b != n.INLINE) {
            return true;
        }
        return h.a(activity);
    }

    public final void d() {
        this.f48654w = false;
        k();
        sg.bigo.ads.core.mraid.c.C0874c c0874c = this.f48648h;
        if (c0874c != null) {
            c0874c.onResume();
        }
        sg.bigo.ads.core.mraid.c.C0874c c0874c2 = this.f48652p;
        if (c0874c2 != null) {
            c0874c2.onResume();
        }
    }

    public final void e() {
        this.f48651n.a();
        try {
            sg.bigo.ads.common.d.a.a().a(this);
        } catch (IllegalArgumentException e2) {
            if (!e2.getMessage().contains("Receiver not registered")) {
                throw e2;
            }
        }
        if (!this.f48654w) {
            a(true);
        }
        u.b(this.d);
        l();
        m();
        o();
        q();
        this.m = null;
        u.b(this.f48646c);
        u.b(this.d);
        this.x = true;
    }

    public final void f() {
        b bVar;
        if (this.f48645b != n.INTERSTITIAL || (bVar = this.g) == null) {
            return;
        }
        bVar.g();
    }

    public final void g() {
        o oVar;
        o oVar2;
        ViewGroup.LayoutParams layoutParams;
        sg.bigo.ads.core.mraid.c.C0874c c0874c;
        if (this.f48648h == null || (oVar = this.f) == o.LOADING || oVar == (oVar2 = o.HIDDEN)) {
            return;
        }
        o oVar3 = o.EXPANDED;
        if (oVar == oVar3 || this.f48645b == n.INTERSTITIAL) {
            o();
        }
        o oVar4 = this.f;
        if (oVar4 != o.RESIZED && oVar4 != oVar3) {
            if (oVar4 == o.DEFAULT) {
                this.f48646c.setVisibility(4);
                a(oVar2);
                return;
            }
            return;
        }
        if (!this.j.c() || (c0874c = this.f48652p) == null) {
            this.d.removeView(this.f48648h);
            this.f48646c.addView(this.f48648h, new FrameLayout.LayoutParams(-1, -1));
            this.f48646c.setVisibility(0);
        } else {
            m();
            this.d.removeView(c0874c);
        }
        c cVar = this.k;
        sg.bigo.ads.core.mraid.c.C0874c c0874c2 = e.this.f48648h;
        if (c0874c2 != null && cVar.f48665a > 0 && cVar.f48666b > 0 && (layoutParams = c0874c2.getLayoutParams()) != null) {
            layoutParams.width = cVar.f48665a;
            layoutParams.height = cVar.f48666b;
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
            }
            e.this.f48648h.setLayoutParams(layoutParams);
        }
        u.b(this.d);
        a(o.DEFAULT);
    }

    public final void h() {
        b bVar = this.g;
        if (bVar != null) {
            bVar.c();
        }
    }

    public final ViewGroup i() {
        ViewGroup viewGroup = this.m;
        if (viewGroup != null) {
            return viewGroup;
        }
        View viewA = u.a(this.f48650l.get(), this.f48646c);
        return viewA instanceof ViewGroup ? (ViewGroup) viewA : this.f48646c;
    }

    public final ViewGroup j() {
        if (this.m == null) {
            this.m = i();
        }
        return this.m;
    }

    public final void k() {
        o oVar;
        if (this.x || (oVar = this.f) == o.LOADING || oVar == o.HIDDEN || this.f48648h == null) {
            return;
        }
        Context context = this.f48644a;
        if (this.y != null) {
            q();
        }
        this.y = new sg.bigo.ads.core.mraid.a(this.f48655z, context.getApplicationContext(), new sg.bigo.ads.core.mraid.a.InterfaceC0872a() { // from class: sg.bigo.ads.core.mraid.e.7
            @Override // sg.bigo.ads.core.mraid.a.InterfaceC0872a
            public final void a(float f) {
                e.this.f48649i.c("mraidbridge.notifyAudioVolumeChangeEvent(" + f + ");");
            }
        });
        context.getApplicationContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.y);
    }

    private e(Context context, n nVar, sg.bigo.ads.core.mraid.c cVar, sg.bigo.ads.core.mraid.c cVar2, C0875e c0875e) {
        o oVar = o.LOADING;
        this.f = oVar;
        this.t = true;
        this.f48653u = i.NONE;
        this.f48654w = true;
        byte b2 = 0;
        this.x = false;
        sg.bigo.ads.core.mraid.c.a aVar = new sg.bigo.ads.core.mraid.c.a() { // from class: sg.bigo.ads.core.mraid.e.3
            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a() {
                e eVar = e.this;
                eVar.f48649i.a(h.b(eVar.f48644a), h.a(eVar.f48644a), h.d(eVar.f48644a), h.c(eVar.f48644a), eVar.c());
                eVar.f48649i.a(eVar.f48645b);
                sg.bigo.ads.core.mraid.c cVar3 = eVar.f48649i;
                cVar3.a(cVar3.b());
                eVar.f48649i.a(eVar.f48647e);
                eVar.k();
                eVar.a(o.DEFAULT);
                eVar.f48649i.c("mraidbridge.notifyReadyEvent();");
                b bVar = e.this.g;
                if (bVar != null) {
                    bVar.a();
                }
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void b() {
                b bVar = e.this.g;
                if (bVar != null) {
                    bVar.b();
                }
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void c() {
                e.this.h();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final boolean d() {
                return e.this.a();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void e() {
                e.this.f();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void f() {
                e.this.g();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(int i2, int i3, int i4, int i5, sg.bigo.ads.core.mraid.a.a.EnumC0873a enumC0873a, boolean z2) throws sg.bigo.ads.core.mraid.d {
                e eVar = e.this;
                if (eVar.f48648h == null) {
                    throw new sg.bigo.ads.core.mraid.d("Unable to resize after the WebView is destroyed");
                }
                o oVar2 = eVar.f;
                if (oVar2 == o.LOADING || oVar2 == o.HIDDEN) {
                    return;
                }
                if (oVar2 == o.EXPANDED) {
                    throw new sg.bigo.ads.core.mraid.d("Not allowed to resize from an already expanded ad");
                }
                if (eVar.f48645b == n.INTERSTITIAL) {
                    throw new sg.bigo.ads.core.mraid.d("Not allowed to resize from an interstitial ad");
                }
                eVar.k.a();
                Context context2 = eVar.f48644a;
                int iA = sg.bigo.ads.common.utils.e.a(context2, i2);
                int iA2 = sg.bigo.ads.common.utils.e.a(context2, i3);
                int iA3 = sg.bigo.ads.common.utils.e.a(context2, i4);
                int iA4 = sg.bigo.ads.common.utils.e.a(context2, i5);
                Rect rect = eVar.f48647e.g;
                int i6 = rect.left + iA3;
                int i7 = rect.top + iA4;
                Rect rect2 = new Rect(i6, i7, iA + i6, i7 + iA2);
                if (!z2) {
                    Rect rect3 = eVar.f48647e.f48706c;
                    if (rect2.width() > rect3.width() || rect2.height() > rect3.height()) {
                        StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i2, i3, "resizeProperties specified a size (", ", ", ") and offset (");
                        androidx.datastore.preferences.protobuf.a.y(sbP, i4, ", ", i5, ") that doesn't allow the ad to appear within the max allowed size (");
                        sbP.append(eVar.f48647e.d.width());
                        sbP.append(", ");
                        sbP.append(eVar.f48647e.d.height());
                        sbP.append(")");
                        throw new sg.bigo.ads.core.mraid.d(sbP.toString());
                    }
                    rect2.offsetTo(e.a(rect3.left, rect2.left, rect3.right - rect2.width()), e.a(rect3.top, rect2.top, rect3.bottom - rect2.height()));
                }
                Rect rect4 = new Rect();
                eVar.d.a(enumC0873a, rect2, rect4);
                if (!eVar.f48647e.f48706c.contains(rect4)) {
                    StringBuilder sbP2 = androidx.datastore.preferences.protobuf.a.p(i2, i3, "resizeProperties specified a size (", ", ", ") and offset (");
                    androidx.datastore.preferences.protobuf.a.y(sbP2, i4, ", ", i5, ") that doesn't allow the close region to appear within the max allowed size (");
                    sbP2.append(eVar.f48647e.d.width());
                    sbP2.append(", ");
                    sbP2.append(eVar.f48647e.d.height());
                    sbP2.append(")");
                    throw new sg.bigo.ads.core.mraid.d(sbP2.toString());
                }
                if (!rect2.contains(rect4)) {
                    StringBuilder sbP3 = androidx.datastore.preferences.protobuf.a.p(i2, iA2, "resizeProperties specified a size (", ", ", ") and offset (");
                    sbP3.append(i4);
                    sbP3.append(", ");
                    sbP3.append(i5);
                    sbP3.append(") that don't allow the close region to appear within the resized ad.");
                    throw new sg.bigo.ads.core.mraid.d(sbP3.toString());
                }
                eVar.d.setCloseVisible(false);
                eVar.d.setClosePosition(enumC0873a);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect2.width(), rect2.height());
                int i8 = rect2.left;
                Rect rect5 = eVar.f48647e.f48706c;
                layoutParams.leftMargin = i8 - rect5.left;
                layoutParams.topMargin = rect2.top - rect5.top;
                o oVar3 = eVar.f;
                if (oVar3 == o.DEFAULT) {
                    eVar.f48646c.removeView(eVar.f48648h);
                    eVar.f48646c.setVisibility(4);
                    eVar.d.addView(eVar.f48648h, new FrameLayout.LayoutParams(-1, -1));
                    eVar.j().addView(eVar.d, layoutParams);
                } else if (oVar3 == o.RESIZED) {
                    eVar.d.setLayoutParams(layoutParams);
                }
                eVar.d.setClosePosition(enumC0873a);
                eVar.a(o.RESIZED);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void b(boolean z2) {
                e.this.b(z2);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(String str) {
                e.this.a(str);
            }

            @Override // sg.bigo.ads.core.mraid.c.a
            public final void a(String str, String str2) {
                b bVar = e.this.g;
                if (bVar == null || !(bVar instanceof a)) {
                    return;
                }
                ((a) bVar).a(str, str2);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(String str, sg.bigo.ads.common.i iVar) {
                e.this.a(str, iVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(String str, boolean z2) throws sg.bigo.ads.core.mraid.d {
                e.this.a(str, z2);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(sg.bigo.ads.core.mraid.b bVar) {
                if (e.this.j.c()) {
                    return;
                }
                e.this.f48649i.a(bVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(boolean z2) {
                if (e.this.j.c()) {
                    return;
                }
                e.this.f48649i.a(z2);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(boolean z2, i iVar) throws sg.bigo.ads.core.mraid.d {
                e.this.a(z2, iVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final boolean a(JsResult jsResult) {
                return e.this.a(jsResult);
            }
        };
        this.f48642A = aVar;
        sg.bigo.ads.core.mraid.c.b bVar = new sg.bigo.ads.core.mraid.c.b() { // from class: sg.bigo.ads.core.mraid.e.4
            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a() {
                final e eVar = e.this;
                eVar.a(new Runnable() { // from class: sg.bigo.ads.core.mraid.e.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        e eVar2 = e.this;
                        eVar2.j.a(h.b(eVar2.f48644a), h.a(e.this.f48644a), h.d(e.this.f48644a), h.c(e.this.f48644a), e.this.c());
                        e eVar3 = e.this;
                        eVar3.j.a(eVar3.f);
                        e eVar4 = e.this;
                        eVar4.j.a(eVar4.f48645b);
                        sg.bigo.ads.core.mraid.c cVar3 = e.this.j;
                        cVar3.a(cVar3.b());
                        e.this.j.c("mraidbridge.notifyReadyEvent();");
                    }
                });
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void b() {
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void c() {
                e.this.h();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final boolean d() {
                return e.this.a();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void e() {
                e.this.f();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void f() {
                e.this.g();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(int i2, int i3, int i4, int i5, sg.bigo.ads.core.mraid.a.a.EnumC0873a enumC0873a, boolean z2) throws sg.bigo.ads.core.mraid.d {
                throw new sg.bigo.ads.core.mraid.d("Not allowed to resize from an expanded state");
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void b(boolean z2) {
                e.this.b(z2);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(String str) {
                e.this.a(str);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(String str, sg.bigo.ads.common.i iVar) {
                e.this.a(str, iVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(String str, boolean z2) {
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(sg.bigo.ads.core.mraid.b bVar2) {
                e.this.f48649i.a(bVar2);
                e.this.j.a(bVar2);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(boolean z2) {
                e.this.f48649i.a(z2);
                e.this.j.a(z2);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(boolean z2, i iVar) throws sg.bigo.ads.core.mraid.d {
                e.this.a(z2, iVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final boolean a(JsResult jsResult) {
                return e.this.a(jsResult);
            }
        };
        this.f48643B = bVar;
        this.C = -1;
        this.f48655z = new Handler(Looper.getMainLooper());
        this.f48644a = context;
        this.f48650l = context instanceof Activity ? new WeakReference<>((Activity) context) : new WeakReference<>(null);
        this.f48645b = nVar;
        this.f48649i = cVar;
        this.j = cVar2;
        this.f48651n = c0875e;
        this.k = new c(this, b2);
        this.f = oVar;
        this.f48647e = new j(context, context.getResources().getDisplayMetrics().density);
        this.f48646c = new FrameLayout(context);
        sg.bigo.ads.core.mraid.a.a aVar2 = new sg.bigo.ads.core.mraid.a.a(context);
        this.d = aVar2;
        aVar2.setOnCloseListener(new sg.bigo.ads.core.mraid.a.a.b() { // from class: sg.bigo.ads.core.mraid.e.1
            @Override // sg.bigo.ads.core.mraid.a.a.b
            public final void a() {
                e.this.g();
            }
        });
        View view = new View(context);
        view.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.core.mraid.e.2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        aVar2.addView(view, new FrameLayout.LayoutParams(-1, -1));
        sg.bigo.ads.common.d.a.a().a(context, this);
        cVar.f48626a = aVar;
        cVar2.f48626a = bVar;
        this.v = new h();
        this.r = 4871;
    }

    private void a(int i2) throws sg.bigo.ads.core.mraid.d {
        Activity activity = this.f48650l.get();
        if (activity == null || !a(this.f48653u)) {
            throw new sg.bigo.ads.core.mraid.d("Attempted to lock orientation to unsupported value: " + this.f48653u.name());
        }
        if (this.q == null) {
            this.q = Integer.valueOf(activity.getRequestedOrientation());
        }
        b bVar = this.g;
        if (bVar == null || !bVar.a(activity, i2)) {
            activity.setRequestedOrientation(i2);
        }
    }

    public final void b(boolean z2) {
        if (z2 == p()) {
            return;
        }
        this.d.setCloseVisible(!z2);
    }

    @Override // sg.bigo.ads.common.d.b
    public final void a(Context context, Intent intent) {
        int rotation;
        if (!"android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) || (rotation = ((WindowManager) this.f48644a.getSystemService("window")).getDefaultDisplay().getRotation()) == this.C) {
            return;
        }
        this.C = rotation;
        a((Runnable) null);
    }

    private static void a(WebView webView, boolean z2) {
        if (z2) {
            webView.stopLoading();
            webView.loadUrl("");
        }
        webView.onPause();
    }

    public final void a(final Runnable runnable) {
        byte b2 = 0;
        this.f48651n.a();
        final sg.bigo.ads.core.mraid.c.C0874c c0874cB = b();
        if (c0874cB == null) {
            return;
        }
        C0875e c0875e = this.f48651n;
        C0875e.a aVar = new C0875e.a(c0875e.f48668a, new View[]{this.f48646c, c0874cB}, b2);
        c0875e.f48669b = aVar;
        aVar.f48672c = new Runnable() { // from class: sg.bigo.ads.core.mraid.e.6
            @Override // java.lang.Runnable
            public final void run() {
                DisplayMetrics displayMetrics = e.this.f48644a.getResources().getDisplayMetrics();
                j jVar = e.this.f48647e;
                jVar.f48704a.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                jVar.a(jVar.f48704a, jVar.f48705b);
                int[] iArr = new int[2];
                ViewGroup viewGroupI = e.this.i();
                viewGroupI.getLocationOnScreen(iArr);
                j jVar2 = e.this.f48647e;
                int i2 = iArr[0];
                int i3 = iArr[1];
                jVar2.f48706c.set(i2, i3, viewGroupI.getWidth() + i2, viewGroupI.getHeight() + i3);
                jVar2.a(jVar2.f48706c, jVar2.d);
                e.this.f48646c.getLocationOnScreen(iArr);
                e eVar = e.this;
                j jVar3 = eVar.f48647e;
                int i4 = iArr[0];
                int i5 = iArr[1];
                jVar3.g.set(i4, i5, eVar.f48646c.getWidth() + i4, e.this.f48646c.getHeight() + i5);
                jVar3.a(jVar3.g, jVar3.f48708h);
                c0874cB.getLocationOnScreen(iArr);
                j jVar4 = e.this.f48647e;
                int i6 = iArr[0];
                int i7 = iArr[1];
                jVar4.f48707e.set(i6, i7, c0874cB.getWidth() + i6, c0874cB.getHeight() + i7);
                jVar4.a(jVar4.f48707e, jVar4.f);
                e eVar2 = e.this;
                eVar2.f48649i.a(eVar2.f48647e);
                if (e.this.j.c()) {
                    e eVar3 = e.this;
                    eVar3.j.a(eVar3.f48647e);
                }
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        aVar.d = aVar.f48670a.length;
        aVar.f48671b.post(aVar.f48673e);
    }

    public final void a(String str) {
        MraidVideoActivity.a(this.f48644a, str);
    }

    public final void a(String str, sg.bigo.ads.common.i iVar) {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (!"tel".equalsIgnoreCase(scheme) && !"voicemail".equalsIgnoreCase(scheme) && !"sms".equalsIgnoreCase(scheme) && !"mailto".equalsIgnoreCase(scheme) && !"geo".equalsIgnoreCase(scheme) && !"google.streetview".equalsIgnoreCase(scheme)) {
            b bVar = this.g;
            if (bVar != null) {
                bVar.a(str, iVar);
                return;
            }
            return;
        }
        sg.bigo.ads.common.t.a.a(2, "MraidController", "Uri scheme " + uri.getScheme() + " is not allowed.");
    }

    public final void a(String str, d dVar) {
        a(dVar);
        this.f48649i.a(str);
    }

    public final void a(String str, boolean z2) throws sg.bigo.ads.core.mraid.d {
        sg.bigo.ads.core.mraid.a.a aVar;
        sg.bigo.ads.core.mraid.c.C0874c c0874c;
        if (this.f48648h == null) {
            throw new sg.bigo.ads.core.mraid.d("Unable to expand after the WebView is destroyed");
        }
        if (this.f48645b == n.INTERSTITIAL) {
            return;
        }
        o oVar = this.f;
        o oVar2 = o.DEFAULT;
        if (oVar == oVar2 || oVar == o.RESIZED) {
            n();
            boolean z3 = str != null;
            if (z3) {
                sg.bigo.ads.core.mraid.c.C0874c c0874cA = sg.bigo.ads.core.mraid.c.a(this.f48644a);
                this.f48652p = c0874cA;
                if (c0874cA == null) {
                    return;
                }
                this.j.a(c0874cA);
                this.j.b(str);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            o oVar3 = this.f;
            if (oVar3 == oVar2) {
                this.s = j().getSystemUiVisibility();
                j().setSystemUiVisibility(this.r);
                if (z3) {
                    aVar = this.d;
                    c0874c = this.f48652p;
                } else {
                    this.k.a();
                    this.f48646c.removeView(this.f48648h);
                    this.f48646c.setVisibility(4);
                    aVar = this.d;
                    c0874c = this.f48648h;
                }
                aVar.addView(c0874c, layoutParams);
                j().addView(this.d, new FrameLayout.LayoutParams(-1, -1));
            } else if (oVar3 == o.RESIZED && z3) {
                this.d.removeView(this.f48648h);
                this.f48646c.addView(this.f48648h, layoutParams);
                this.f48646c.setVisibility(4);
                this.d.addView(this.f48652p, layoutParams);
            }
            this.d.setLayoutParams(layoutParams);
            b(z2);
            a(o.EXPANDED);
        }
    }

    public final void a(d dVar) {
        sg.bigo.ads.core.mraid.c.C0874c c0874cA = sg.bigo.ads.core.mraid.c.a(this.f48644a);
        this.f48648h = c0874cA;
        if (c0874cA == null) {
            return;
        }
        if (dVar != null) {
            dVar.a();
        }
        this.f48649i.a(this.f48648h);
        this.f48646c.addView(this.f48648h, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a(o oVar) {
        sg.bigo.ads.common.t.a.a(0, 3, "MraidController", "MRAID state set to ".concat(String.valueOf(oVar)));
        o oVar2 = this.f;
        this.f = oVar;
        this.f48649i.a(oVar);
        sg.bigo.ads.core.mraid.c cVar = this.j;
        if (cVar.f48628c) {
            cVar.a(oVar);
        }
        b bVar = this.g;
        if (bVar != null) {
            o oVar3 = o.EXPANDED;
            if (oVar == oVar3) {
                bVar.d();
            } else if ((oVar2 == oVar3 && oVar == o.DEFAULT) || oVar == o.HIDDEN) {
                bVar.f();
            } else {
                o oVar4 = o.RESIZED;
                if ((oVar2 == oVar4 && oVar == o.DEFAULT) || oVar == oVar4) {
                    bVar.e();
                }
            }
        }
        a((Runnable) null);
    }

    public final void a(boolean z2) {
        this.f48654w = true;
        q();
        sg.bigo.ads.core.mraid.c.C0874c c0874c = this.f48648h;
        if (c0874c != null) {
            a(c0874c, z2);
        }
        sg.bigo.ads.core.mraid.c.C0874c c0874c2 = this.f48652p;
        if (c0874c2 != null) {
            a(c0874c2, z2);
        }
    }

    public final void a(boolean z2, i iVar) throws sg.bigo.ads.core.mraid.d {
        if (!a(iVar)) {
            throw new sg.bigo.ads.core.mraid.d("Unable to force orientation to ".concat(String.valueOf(iVar)));
        }
        this.t = z2;
        this.f48653u = iVar;
        if (this.f == o.EXPANDED || (this.f48645b == n.INTERSTITIAL && !this.f48654w)) {
            n();
        }
    }

    public final boolean a() {
        l lVar = this.o;
        if (lVar != null) {
            return lVar.b();
        }
        return true;
    }

    private static boolean a(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    public final boolean a(JsResult jsResult) {
        l lVar = this.o;
        if (lVar != null) {
            return lVar.a();
        }
        jsResult.confirm();
        return true;
    }

    private boolean a(i iVar) {
        if (iVar == i.NONE) {
            return true;
        }
        Activity activity = this.f48650l.get();
        if (activity == null) {
            return false;
        }
        try {
            ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0);
            return a(activityInfo.configChanges, 128) && a(activityInfo.configChanges, 1024);
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
