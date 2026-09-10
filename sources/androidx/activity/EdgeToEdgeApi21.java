package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.core.view.WindowCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001J?\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/activity/EdgeToEdgeApi21;", "Landroidx/activity/EdgeToEdgeImpl;", "Landroidx/activity/SystemBarStyle;", "statusBarStyle", "navigationBarStyle", "Landroid/view/Window;", "window", "Landroid/view/View;", "view", "", "statusBarIsDark", "navigationBarIsDark", "", "a", "(Landroidx/activity/SystemBarStyle;Landroidx/activity/SystemBarStyle;Landroid/view/Window;Landroid/view/View;ZZ)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class EdgeToEdgeApi21 implements EdgeToEdgeImpl {
    public void a(SystemBarStyle statusBarStyle, SystemBarStyle navigationBarStyle, Window window, View view, boolean statusBarIsDark, boolean navigationBarIsDark) {
        Intrinsics.f(statusBarStyle, "statusBarStyle");
        Intrinsics.f(navigationBarStyle, "navigationBarStyle");
        Intrinsics.f(window, "window");
        Intrinsics.f(view, "view");
        WindowCompat.a(window, false);
        window.addFlags(67108864);
        window.addFlags(134217728);
    }
}
