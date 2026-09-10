package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.p001lifecycle.C0828overspeculate;
import androidx.p001lifecycle.Lifecycle;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.CoroutineStart;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0011\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a)\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\"&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\",\u0010\u0019\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0003\"\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001c\u001a\u00020\u0000*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u001e\u0010!\u001a\u00020\u000e*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Landroid/view/View;", "Landroidx/compose/runtime/graveside;", "wireman", "(Landroid/view/View;)Landroidx/compose/runtime/graveside;", "Landroid/content/Context;", "applicationContext", "Lkotlinx/coroutines/flow/dovishness;", "", "marial", "(Landroid/content/Context;)Lkotlinx/coroutines/flow/dovishness;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/compose/runtime/Recomposer;", "saneness", "(Landroid/view/View;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/Lifecycle;)Landroidx/compose/runtime/Recomposer;", "", "attabal", "Ljava/util/Map;", "animationScale", "value", "beachfront", "taiyuan", "(Landroid/view/View;Landroidx/compose/runtime/graveside;)V", "compositionContext", "competently", "(Landroid/view/View;)Landroid/view/View;", "contentChild", "impromptu", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "getWindowRecomposer$annotations", "(Landroid/view/View;)V", "windowRecomposer", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WindowRecomposer_androidKt {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Map<Context, kotlinx.coroutines.flow.dovishness<Float>> f7383attabal = new LinkedHashMap();

    /* JADX INFO: compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/WindowRecomposer_androidKt$saneness", "Landroid/database/ContentObserver;", "", "selfChange", "Landroid/net/Uri;", "uri", "", "onChange", "(ZLandroid/net/Uri;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness extends ContentObserver {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.channels.wireman<Unit> f7393attabal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public saneness(kotlinx.coroutines.channels.wireman<Unit> wiremanVar, Handler handler) {
            super(handler);
            this.f7393attabal = wiremanVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange, Uri uri) {
            this.f7393attabal.triweekly(Unit.f29295attabal);
        }
    }

    public static final androidx.compose.runtime.graveside beachfront(View view) {
        Object tag = view.getTag(yemenite.wireman.androidx_compose_ui_view_composition_context);
        if (tag instanceof androidx.compose.runtime.graveside) {
            return (androidx.compose.runtime.graveside) tag;
        }
        return null;
    }

    public static final View competently(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                break;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static /* synthetic */ Recomposer dern(View view, CoroutineContext coroutineContext, Lifecycle lifecycle, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            lifecycle = null;
        }
        return saneness(view, coroutineContext, lifecycle);
    }

    public static final Recomposer impromptu(View view) {
        if (!view.isAttachedToWindow()) {
            peridotite.attabal.saneness("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        View viewCompetently = competently(view);
        androidx.compose.runtime.graveside gravesideVarBeachfront = beachfront(viewCompetently);
        if (gravesideVarBeachfront == null) {
            return WindowRecomposerPolicy.f7379attabal.attabal(viewCompetently);
        }
        if (gravesideVarBeachfront instanceof Recomposer) {
            return (Recomposer) gravesideVarBeachfront;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }

    public static final kotlinx.coroutines.flow.dovishness<Float> marial(Context context) {
        kotlinx.coroutines.flow.dovishness<Float> dovishnessVar;
        Map<Context, kotlinx.coroutines.flow.dovishness<Float>> map = f7383attabal;
        synchronized (map) {
            try {
                kotlinx.coroutines.flow.dovishness<Float> dovishnessVarRestrictive = map.get(context);
                if (dovishnessVarRestrictive == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    kotlinx.coroutines.channels.wireman wiremanVarSaneness = kotlinx.coroutines.channels.competently.saneness(-1, null, null, 6, null);
                    dovishnessVarRestrictive = kotlinx.coroutines.flow.marial.restrictive(kotlinx.coroutines.flow.marial.adultoid(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new saneness(wiremanVarSaneness, claque.impromptu.attabal(Looper.getMainLooper())), wiremanVarSaneness, context, null)), kotlinx.coroutines.privatdozent.saneness(), kotlinx.coroutines.flow.graveside.Companion.saneness(kotlinx.coroutines.flow.graveside.INSTANCE, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, dovishnessVarRestrictive);
                }
                dovishnessVar = dovishnessVarRestrictive;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dovishnessVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, androidx.compose.ui.platform.premeiotic] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.coroutines.CoroutineContext] */
    public static final Recomposer saneness(final View view, CoroutineContext coroutineContext, Lifecycle lifecycle) {
        final PausableMonotonicFrameClock pausableMonotonicFrameClock;
        CoroutineContext coroutineContext2;
        ?? premeioticVar;
        if (coroutineContext.get(p002kotlin.coroutines.dern.INSTANCE) == null || coroutineContext.get(androidx.compose.runtime.milliradian.INSTANCE) == null) {
            coroutineContext = AndroidUiDispatcher.INSTANCE.attabal().plus(coroutineContext);
        }
        androidx.compose.runtime.milliradian milliradianVar = (androidx.compose.runtime.milliradian) coroutineContext.get(androidx.compose.runtime.milliradian.INSTANCE);
        if (milliradianVar != null) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(milliradianVar);
            pausableMonotonicFrameClock2.wireman();
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = null;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        yemenite.dern dernVar = (yemenite.dern) coroutineContext.get(yemenite.dern.INSTANCE);
        ?? r0 = dernVar;
        if (dernVar == null) {
            premeioticVar = new premeiotic();
            ref$ObjectRef.element = premeioticVar;
        }
        if (pausableMonotonicFrameClock != null) {
            r0 = premeioticVar;
            coroutineContext2 = pausableMonotonicFrameClock;
        } else {
            r0 = premeioticVar;
            coroutineContext2 = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContextPlus = coroutineContext.plus(coroutineContext2).plus(r0);
        final Recomposer recomposer = new Recomposer(coroutineContextPlus);
        recomposer.palmyra();
        final kotlinx.coroutines.saran saranVarAttabal = kotlinx.coroutines.privatdozent.attabal(coroutineContextPlus);
        if (lifecycle == null) {
            androidx.p001lifecycle.arytenoidectomy arytenoidectomyVarAttabal = C0828overspeculate.attabal(view);
            lifecycle = arytenoidectomyVarAttabal != null ? arytenoidectomyVarAttabal.getLifecycle() : null;
        }
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new attabal(view, recomposer));
            lifecycle.attabal(new androidx.p001lifecycle.impassible() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

                /* JADX INFO: compiled from: WindowRecomposer.android.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public /* synthetic */ class attabal {

                    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
                    public static final /* synthetic */ int[] f7391attabal;

                    static {
                        int[] iArr = new int[Lifecycle.Event.values().length];
                        try {
                            iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        f7391attabal = iArr;
                    }
                }

                @Override // androidx.p001lifecycle.impassible
                public void onStateChanged(androidx.p001lifecycle.arytenoidectomy source, Lifecycle.Event event) {
                    int i = attabal.f7391attabal[event.ordinal()];
                    if (i == 1) {
                        kotlinx.coroutines.cutely.wireman(saranVarAttabal, null, CoroutineStart.UNDISPATCHED, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(ref$ObjectRef, recomposer, source, this, view, null), 1, null);
                        return;
                    }
                    if (i == 2) {
                        PausableMonotonicFrameClock pausableMonotonicFrameClock3 = pausableMonotonicFrameClock;
                        if (pausableMonotonicFrameClock3 != null) {
                            pausableMonotonicFrameClock3.marial();
                        }
                        recomposer.homozygous();
                        return;
                    }
                    if (i == 3) {
                        recomposer.palmyra();
                    } else {
                        if (i != 4) {
                            return;
                        }
                        recomposer.treadless();
                    }
                }
            });
            return recomposer;
        }
        peridotite.attabal.dern("ViewTreeLifecycleOwner not found from " + view);
        throw new KotlinNothingValueException();
    }

    public static final void taiyuan(View view, androidx.compose.runtime.graveside gravesideVar) {
        view.setTag(yemenite.wireman.androidx_compose_ui_view_composition_context, gravesideVar);
    }

    public static final androidx.compose.runtime.graveside wireman(View view) {
        androidx.compose.runtime.graveside gravesideVarBeachfront = beachfront(view);
        if (gravesideVarBeachfront != null) {
            return gravesideVarBeachfront;
        }
        for (ViewParent parent = view.getParent(); gravesideVarBeachfront == null && (parent instanceof View); parent = parent.getParent()) {
            gravesideVarBeachfront = beachfront((View) parent);
        }
        return gravesideVarBeachfront;
    }

    /* JADX INFO: compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/WindowRecomposer_androidKt$attabal", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ Recomposer f7384arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ View f7385kowloon;

        public attabal(View view, Recomposer recomposer) {
            this.f7385kowloon = view;
            this.f7384arytenoidectomy = recomposer;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            this.f7385kowloon.removeOnAttachStateChangeListener(this);
            this.f7384arytenoidectomy.treadless();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
        }
    }
}
