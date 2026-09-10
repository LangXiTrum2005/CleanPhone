package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.Animator;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.search.SearchBar;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class F30 implements AccessibilityManagerCompat.TouchExplorationStateChangeListener, AnimatableView.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3051a;

    public /* synthetic */ F30(Object obj) {
        this.f3051a = obj;
    }

    @Override // com.google.android.material.animation.AnimatableView.Listener
    public final void onAnimationEnd() {
        ((Animator) this.f3051a).start();
    }

    @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        ((SearchBar) this.f3051a).lambda$new$0(z);
    }
}
