package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/deadwork;", "", "Landroid/view/View;", "windowRootView", "Landroidx/compose/runtime/Recomposer;", "attabal", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface deadwork {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f7423attabal;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.deadwork$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/deadwork$attabal;", "", "<init>", "()V", "Landroidx/compose/ui/platform/deadwork;", "saneness", "Landroidx/compose/ui/platform/deadwork;", "dern", "()Landroidx/compose/ui/platform/deadwork;", "getLifecycleAware$annotations", "LifecycleAware", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ Companion f7423attabal = new Companion();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public static final deadwork LifecycleAware = new deadwork() { // from class: androidx.compose.ui.platform.libyan
            @Override // androidx.compose.ui.platform.deadwork
            public final Recomposer attabal(View view) {
                return deadwork.Companion.saneness(view);
            }
        };

        public static final Recomposer saneness(View view) {
            return WindowRecomposer_androidKt.dern(view, null, null, 3, null);
        }

        public final deadwork dern() {
            return LifecycleAware;
        }
    }

    Recomposer attabal(View windowRootView);
}
