package inrooted;

import android.view.View;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewTreeSavedStateRegistryOwner.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Linrooted/taiyuan;", "owner", "", "saneness", "(Landroid/view/View;Linrooted/taiyuan;)V", "attabal", "(Landroid/view/View;)Linrooted/taiyuan;", "savedstate"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class impassible {
    public static final taiyuan attabal(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(attabal.view_tree_saved_state_registry_owner);
            taiyuan taiyuanVar = tag instanceof taiyuan ? (taiyuan) tag : null;
            if (taiyuanVar != null) {
                return taiyuanVar;
            }
            Object objAttabal = mastfed.saneness.attabal(view);
            view = objAttabal instanceof View ? (View) objAttabal : null;
        }
        return null;
    }

    public static final void saneness(View view, taiyuan taiyuanVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(attabal.view_tree_saved_state_registry_owner, taiyuanVar);
    }
}
