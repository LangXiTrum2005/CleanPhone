package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5147yw implements SavedStateRegistry.SavedStateProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5306a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C5147yw(Object obj, int i) {
        this.f5306a = i;
        this.b = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        int i = this.f5306a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((FragmentActivity) obj).lambda$init$0();
            default:
                return ((FragmentManager) obj).lambda$attachController$4();
        }
    }
}
