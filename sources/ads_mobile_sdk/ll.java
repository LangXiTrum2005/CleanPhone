package ads_mobile_sdk;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.google.common.base.triweekly;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.taiyuan;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.hawkthorn;
import saneness.imari;

/* JADX INFO: loaded from: classes.dex */
public abstract class ll implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    public static final long j;
    public final saran a;
    public final hawkthorn b;
    public final nd0 c;
    public final amphitheatre d;
    public View e;
    public boolean f;
    public WeakReference g;
    public long h;
    public Boolean i;

    static {
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        j = p002kotlin.time.dern.molybdenite(200, DurationUnit.MILLISECONDS);
    }

    public ll(saran uiScope, hawkthorn viewabilityEventEmitter, nd0 displayUtil, amphitheatre clock, jk0 flags, yf2 requestType) {
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(viewabilityEventEmitter, "viewabilityEventEmitter");
        Intrinsics.checkNotNullParameter(displayUtil, "displayUtil");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        this.a = uiScope;
        this.b = viewabilityEventEmitter;
        this.c = displayUtil;
        this.d = clock;
        this.f = flags.L().contains(requestType.a());
        this.g = new WeakReference(null);
        this.h = p002kotlin.time.saneness.INSTANCE.dern();
    }

    public static final Object a(ll llVar, o73 o73Var, wretchedly.dern dernVar) {
        m73 m73VarA = llVar.a(o73Var);
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        llVar.d.getClass();
        long jGraveside = p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS);
        if (o73Var == o73.SCROLL && Intrinsics.wireman(igo.attabal.attabal(m73VarA.b), llVar.i) && p002kotlin.time.saneness.formularize(jGraveside, p002kotlin.time.saneness.polder(llVar.h, j)) < 0) {
            return Unit.f29295attabal;
        }
        llVar.i = igo.attabal.attabal(m73VarA.b);
        llVar.h = jGraveside;
        Object objC = llVar.b.c(m73VarA, dernVar);
        return objC == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objC : Unit.f29295attabal;
    }

    public final void b(o73 o73Var) throws InterruptedException {
        taiyuan.saneness(null, new il(this, o73Var, null), 1, null);
        if (o73Var == o73.SCROLL) {
            cutely.wireman(this.a, null, null, new jl(this, null), 3, null);
        } else {
            cutely.wireman(this.a, null, null, new kl(this, null), 3, null);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws InterruptedException {
        b(o73.LAYOUT);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() throws InterruptedException {
        b(o73.SCROLL);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) throws InterruptedException {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.g = new WeakReference(viewTreeObserver);
            try {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                viewTreeObserver.addOnScrollChangedListener(this);
            } catch (IllegalStateException unused) {
            }
        }
        b(o73.STATE);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) throws InterruptedException {
        Intrinsics.checkNotNullParameter(view, "view");
        b(o73.STATE);
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.g.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            try {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                viewTreeObserver.removeOnScrollChangedListener(this);
            } catch (IllegalStateException unused) {
            }
        }
        this.g = new WeakReference(null);
    }

    public final void b(View view) {
        this.e = view;
    }

    public final void a() {
        View view = this.e;
        if (view != null) {
            view.removeOnAttachStateChangeListener(this);
        }
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.g.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            try {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                viewTreeObserver.removeOnScrollChangedListener(this);
            } catch (IllegalStateException unused) {
            }
        }
        this.g = new WeakReference(null);
        this.e = null;
    }

    public final m73 a(o73 o73Var) {
        Context context;
        Context context2;
        Context context3;
        Context context4;
        Context context5;
        Rect rect = new Rect();
        int[] iArr = new int[2];
        try {
            View view = this.e;
            if (view != null) {
                view.getLocationOnScreen(iArr);
            }
            int i = iArr[0];
            rect.left = i;
            rect.top = iArr[1];
            View view2 = this.e;
            if (view2 != null) {
                rect.right = i + view2.getWidth();
                rect.bottom = rect.top + view2.getHeight();
            }
        } catch (Exception e) {
            triweekly triweeklyVar = kn0.a;
            kn0.c("Failed to get view location: " + e.getMessage(), null);
        }
        Rect rect2 = new Rect();
        View view3 = this.e;
        if (view3 != null && (context5 = view3.getContext()) != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = ((WindowManager) context5.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
                Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "getCurrentWindowMetrics(...)");
                rect2.right = currentWindowMetrics.getBounds().width();
                rect2.bottom = currentWindowMetrics.getBounds().height();
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context5.getSystemService(WindowManager.class)).getDefaultDisplay().getMetrics(displayMetrics);
                rect2.right = displayMetrics.widthPixels;
                rect2.bottom = displayMetrics.heightPixels;
            }
        }
        Rect rect3 = new Rect();
        View view4 = this.e;
        boolean globalVisibleRect = view4 != null ? view4.getGlobalVisibleRect(rect3) : false;
        Rect rect4 = new Rect();
        View view5 = this.e;
        boolean localVisibleRect = view5 != null ? view5.getLocalVisibleRect(rect4) : false;
        Rect rect5 = new Rect();
        View view6 = this.e;
        if (view6 != null) {
            view6.getHitRect(rect5);
        }
        View view7 = this.e;
        boolean zA = view7 != null ? this.c.a(view7, this.f) : false;
        View view8 = this.e;
        int windowVisibility = view8 != null ? view8.getWindowVisibility() : 8;
        View view9 = this.e;
        Rect rect6 = (view9 == null || (context4 = view9.getContext()) == null) ? new Rect() : imari.saneness(context4, rect);
        View view10 = this.e;
        boolean zIsAttachedToWindow = view10 != null ? view10.isAttachedToWindow() : false;
        View view11 = this.e;
        Rect rect7 = (view11 == null || (context3 = view11.getContext()) == null) ? new Rect() : imari.saneness(context3, rect2);
        View view12 = this.e;
        Rect rect8 = (view12 == null || (context2 = view12.getContext()) == null) ? new Rect() : imari.saneness(context2, rect3);
        View view13 = this.e;
        return new m73(o73Var, zA, windowVisibility, rect6, zIsAttachedToWindow, rect7, rect8, globalVisibleRect, (view13 == null || (context = view13.getContext()) == null) ? new Rect() : imari.saneness(context, rect4), localVisibleRect, rect5);
    }

    public final void a(View targetView) {
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        targetView.addOnAttachStateChangeListener(this);
        if (targetView.isAttachedToWindow()) {
            ViewTreeObserver viewTreeObserver = targetView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                this.g = new WeakReference(viewTreeObserver);
                try {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                    viewTreeObserver.addOnScrollChangedListener(this);
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
            return;
        }
        b(o73.STATE);
    }
}
