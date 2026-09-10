package androidx.p000activity;

import android.view.View;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.activity.seminary, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/View;", "Landroidx/activity/restrictive;", "onBackPressedDispatcherOwner", "", "attabal", "(Landroid/view/View;Landroidx/activity/restrictive;)V", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class C0824seminary {
    public static final void attabal(View view, restrictive onBackPressedDispatcherOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(merc.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }
}
