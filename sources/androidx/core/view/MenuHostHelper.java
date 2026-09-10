package androidx.core.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MenuHostHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f4444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f4445b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f4446c = new HashMap();

    public static class LifecycleContainer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lifecycle f4447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LifecycleEventObserver f4448b;

        public LifecycleContainer(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
            this.f4447a = lifecycle;
            this.f4448b = lifecycleEventObserver;
            lifecycle.a(lifecycleEventObserver);
        }
    }

    public MenuHostHelper(Runnable runnable) {
        this.f4444a = runnable;
    }

    public final void a(final MenuProvider menuProvider, LifecycleOwner lifecycleOwner) {
        this.f4445b.add(menuProvider);
        this.f4444a.run();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        HashMap map = this.f4446c;
        LifecycleContainer lifecycleContainer = (LifecycleContainer) map.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.f4447a.c(lifecycleContainer.f4448b);
            lifecycleContainer.f4448b = null;
        }
        map.put(menuProvider, new LifecycleContainer(lifecycle, new LifecycleEventObserver() { // from class: androidx.core.view.c
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                Lifecycle.Event event2 = Lifecycle.Event.ON_DESTROY;
                MenuHostHelper menuHostHelper = this.X;
                if (event == event2) {
                    menuHostHelper.c(menuProvider);
                } else {
                    menuHostHelper.getClass();
                }
            }
        }));
    }

    public final void b(final MenuProvider menuProvider, LifecycleOwner lifecycleOwner, final Lifecycle.State state) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        HashMap map = this.f4446c;
        LifecycleContainer lifecycleContainer = (LifecycleContainer) map.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.f4447a.c(lifecycleContainer.f4448b);
            lifecycleContainer.f4448b = null;
        }
        map.put(menuProvider, new LifecycleContainer(lifecycle, new LifecycleEventObserver() { // from class: androidx.core.view.b
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                MenuHostHelper menuHostHelper = this.X;
                menuHostHelper.getClass();
                Lifecycle.Event.INSTANCE.getClass();
                Lifecycle.State state2 = state;
                Lifecycle.Event eventB = Lifecycle.Event.Companion.b(state2);
                Runnable runnable = menuHostHelper.f4444a;
                CopyOnWriteArrayList copyOnWriteArrayList = menuHostHelper.f4445b;
                MenuProvider menuProvider2 = menuProvider;
                if (event == eventB) {
                    copyOnWriteArrayList.add(menuProvider2);
                    runnable.run();
                } else if (event == Lifecycle.Event.ON_DESTROY) {
                    menuHostHelper.c(menuProvider2);
                } else if (event == Lifecycle.Event.Companion.a(state2)) {
                    copyOnWriteArrayList.remove(menuProvider2);
                    runnable.run();
                }
            }
        }));
    }

    public final void c(MenuProvider menuProvider) {
        this.f4445b.remove(menuProvider);
        LifecycleContainer lifecycleContainer = (LifecycleContainer) this.f4446c.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.f4447a.c(lifecycleContainer.f4448b);
            lifecycleContainer.f4448b = null;
        }
        this.f4444a.run();
    }
}
