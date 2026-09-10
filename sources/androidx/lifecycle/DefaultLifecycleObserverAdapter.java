package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultLifecycleObserverAdapter implements LifecycleEventObserver {
    public final DefaultLifecycleObserver X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final LifecycleEventObserver f5226Y;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5227a;

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
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f5227a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(DefaultLifecycleObserver defaultLifecycleObserver, LifecycleEventObserver lifecycleEventObserver) {
        Intrinsics.f(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.X = defaultLifecycleObserver;
        this.f5226Y = lifecycleEventObserver;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i2 = WhenMappings.f5227a[event.ordinal()];
        DefaultLifecycleObserver defaultLifecycleObserver = this.X;
        switch (i2) {
            case 1:
                defaultLifecycleObserver.onCreate(lifecycleOwner);
                break;
            case 2:
                defaultLifecycleObserver.onStart(lifecycleOwner);
                break;
            case 3:
                defaultLifecycleObserver.onResume(lifecycleOwner);
                break;
            case 4:
                defaultLifecycleObserver.onPause(lifecycleOwner);
                break;
            case 5:
                defaultLifecycleObserver.onStop(lifecycleOwner);
                break;
            case 6:
                defaultLifecycleObserver.onDestroy(lifecycleOwner);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        LifecycleEventObserver lifecycleEventObserver = this.f5226Y;
        if (lifecycleEventObserver != null) {
            lifecycleEventObserver.onStateChanged(lifecycleOwner, event);
        }
    }
}
