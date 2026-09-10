package androidx.lifecycle;

import android.view.View;
import com.charging.screenshow.battery.animations.themes.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewTreeLifecycleOwner {
    public static final void a(View view, LifecycleOwner lifecycleOwner) {
        Intrinsics.f(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
