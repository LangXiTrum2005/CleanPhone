package ads_mobile_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.common.base.triweekly;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.compiler;
import saneness.mutative;

/* JADX INFO: loaded from: classes.dex */
public final class x extends ox0 implements Application.ActivityLifecycleCallbacks {
    public final Application c;
    public final WeakReference d;
    public final saran e;
    public final jk0 f;
    public final amphitheatre g;
    public final LinkedHashSet h;
    public r i;
    public Activity j;
    public boolean k;
    public monroe l;
    public boolean m;
    public boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context applicationContext, Application application, WeakReference firstContextReference, saran backgroundScope, jk0 flags, amphitheatre clock) {
        super(no0.CUI_NAME_SDKINIT_ACTIVITY_TRACKER, 2);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(firstContextReference, "firstContextReference");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.c = application;
        this.d = firstContextReference;
        this.e = backgroundScope;
        this.f = flags;
        this.g = clock;
        this.h = new LinkedHashSet();
        this.i = r.NONE;
        this.n = compiler.attabal(applicationContext);
    }

    public final void a(Activity activity, r activityState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(activityState, "activityState");
        synchronized (this) {
            try {
                if (Intrinsics.wireman(activity, this.j)) {
                    this.i = activityState;
                } else {
                    if (activityState.a < this.i.a) {
                        return;
                    }
                    this.j = activity;
                    this.i = activityState;
                }
                if (activityState == r.RESUMED) {
                    this.k = false;
                    if (c()) {
                        kn0.b("App is now foregrounded", null);
                        this.n = false;
                        monroe monroeVar = this.l;
                        if (monroeVar != null) {
                            monroe.attabal.attabal(monroeVar, null, 1, null);
                        }
                        this.l = null;
                        this.m = true;
                        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                        this.g.getClass();
                        long jGraveside = p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS);
                        for (mutative mutativeVar : this.h) {
                            saran saranVar = this.e;
                            t block = new t(mutativeVar, jGraveside, null);
                            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                            Intrinsics.checkNotNullParameter(saranVar, "<this>");
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intrinsics.checkNotNullParameter(block, "block");
                            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
                        }
                    }
                } else if (activityState == r.STOPPED) {
                    this.k = true;
                    saran saranVar2 = this.e;
                    v block2 = new v(this, null);
                    EmptyCoroutineContext context2 = EmptyCoroutineContext.INSTANCE;
                    Intrinsics.checkNotNullParameter(saranVar2, "<this>");
                    Intrinsics.checkNotNullParameter(context2, "context");
                    Intrinsics.checkNotNullParameter(block2, "block");
                    this.l = cutely.wireman(saranVar2, context2, null, new x13(block2, null), 2, null);
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Activity b() {
        Activity activity;
        synchronized (this) {
            activity = this.j;
        }
        return activity;
    }

    public final boolean c() {
        boolean z;
        synchronized (this) {
            z = this.n;
        }
        return z;
    }

    @Override // ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) {
        return a(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        a(activity, r.CREATED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        synchronized (this) {
            try {
                if (Intrinsics.wireman(activity, this.j)) {
                    this.j = null;
                    this.i = r.NONE;
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        a(activity, r.PAUSED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        a(activity, r.RESUMED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        a(activity, r.STARTED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        a(activity, r.STOPPED);
    }

    public static /* synthetic */ tn0 a(x xVar) {
        synchronized (xVar) {
            try {
                Context context = (Context) xVar.d.get();
                if (context != null && (context instanceof Activity)) {
                    xVar.j = (Activity) context;
                    xVar.i = r.INITIAL;
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
        xVar.c.registerActivityLifecycleCallbacks(xVar);
        boolean zC = xVar.c();
        triweekly triweeklyVar = kn0.a;
        kn0.b("App is initially " + (zC ? "backgrounded" : "foregrounded"), null);
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        xVar.g.getClass();
        long jGraveside = p002kotlin.time.dern.graveside(amphitheatre.b(), DurationUnit.MILLISECONDS);
        Iterator it = xVar.h.iterator();
        while (it.hasNext()) {
            y13.a(xVar.e, new w(zC, (mutative) it.next(), jGraveside, null));
        }
        return new tn0(Unit.f29295attabal);
    }
}
