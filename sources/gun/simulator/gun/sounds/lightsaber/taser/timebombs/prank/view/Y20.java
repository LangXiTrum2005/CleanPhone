package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Y20 implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4004a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Y20(Object obj, int i) {
        this.f4004a = i;
        this.b = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = this.f4004a;
        Object obj = this.b;
        switch (i) {
            case 0:
                SavedStateRegistry.performAttach$lambda$4((SavedStateRegistry) obj, lifecycleOwner, event);
                break;
            default:
                InterfaceC2303Ba interfaceC2303Ba = (InterfaceC2303Ba) obj;
                AbstractC2995aW.q(interfaceC2303Ba, "this$0");
                AbstractC2995aW.q(lifecycleOwner, "source");
                AbstractC2995aW.q(event, NotificationCompat.CATEGORY_EVENT);
                if (event.getTargetState() == Lifecycle.State.DESTROYED) {
                    interfaceC2303Ba.a();
                }
                interfaceC2303Ba.b(lifecycleOwner, event.getTargetState());
                break;
        }
    }
}
