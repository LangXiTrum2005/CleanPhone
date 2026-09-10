package androidx.savedstate;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewTreeSavedStateRegistryOwner {
    public static final void a(View view, SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.f(view, "<this>");
        view.setTag(com.charging.screenshow.battery.animations.themes.R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }
}
