package androidx.p001lifecycle;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.ironsource.X3;
import inrooted.beachfront;
import inrooted.taiyuan;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LegacySavedStateHandleController.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/cutely;", "", "<init>", "()V", "Linrooted/beachfront;", "registry", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "", X3.i.W, "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/supplicat;", "saneness", "(Linrooted/beachfront;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/supplicat;", "Landroidx/lifecycle/starveling;", "viewModel", "", "attabal", "(Landroidx/lifecycle/starveling;Linrooted/beachfront;Landroidx/lifecycle/Lifecycle;)V", "dern", "(Linrooted/beachfront;Landroidx/lifecycle/Lifecycle;)V", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final cutely f10460attabal = new cutely();

    /* JADX INFO: compiled from: LegacySavedStateHandleController.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/cutely$attabal;", "Linrooted/beachfront$attabal;", "<init>", "()V", "Linrooted/taiyuan;", "owner", "", "attabal", "(Linrooted/taiyuan;)V", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements beachfront.attabal {
        @Override // inrooted.beachfront.attabal
        public void attabal(taiyuan owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (!(owner instanceof splinterproof)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
            }
            mathsort viewModelStore = ((splinterproof) owner).getViewModelStore();
            beachfront savedStateRegistry = owner.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.dern().iterator();
            while (it.hasNext()) {
                starveling starvelingVarSaneness = viewModelStore.saneness(it.next());
                if (starvelingVarSaneness != null) {
                    cutely.attabal(starvelingVarSaneness, savedStateRegistry, owner.getLifecycle());
                }
            }
            if (viewModelStore.dern().isEmpty()) {
                return;
            }
            savedStateRegistry.wireman(attabal.class);
        }
    }

    /* JADX INFO: compiled from: LegacySavedStateHandleController.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/lifecycle/cutely$saneness", "Landroidx/lifecycle/impassible;", "Landroidx/lifecycle/arytenoidectomy;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "", "onStateChanged", "(Landroidx/lifecycle/arytenoidectomy;Landroidx/lifecycle/Lifecycle$Event;)V", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class saneness implements impassible {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ beachfront f10461arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f10462kowloon;

        public saneness(Lifecycle lifecycle, beachfront beachfrontVar) {
            this.f10462kowloon = lifecycle;
            this.f10461arytenoidectomy = beachfrontVar;
        }

        @Override // androidx.p001lifecycle.impassible
        public void onStateChanged(arytenoidectomy source, Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == Lifecycle.Event.ON_START) {
                this.f10462kowloon.wireman(this);
                this.f10461arytenoidectomy.wireman(attabal.class);
            }
        }
    }

    public static final void attabal(starveling viewModel, beachfront registry, Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        supplicat supplicatVar = (supplicat) viewModel.dern("androidx.lifecycle.savedstate.vm.tag");
        if (supplicatVar == null || supplicatVar.getIsAttached()) {
            return;
        }
        supplicatVar.attabal(registry, lifecycle);
        f10460attabal.dern(registry, lifecycle);
    }

    public static final supplicat saneness(beachfront registry, Lifecycle lifecycle, String key, Bundle defaultArgs) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.beachfront(key);
        supplicat supplicatVar = new supplicat(key, sealless.INSTANCE.attabal(registry.attabal(key), defaultArgs));
        supplicatVar.attabal(registry, lifecycle);
        f10460attabal.dern(registry, lifecycle);
        return supplicatVar;
    }

    public final void dern(beachfront registry, Lifecycle lifecycle) {
        Lifecycle.State state = lifecycle.getState();
        if (state == Lifecycle.State.INITIALIZED || state.isAtLeast(Lifecycle.State.STARTED)) {
            registry.wireman(attabal.class);
        } else {
            lifecycle.attabal(new saneness(lifecycle, registry));
        }
    }
}
