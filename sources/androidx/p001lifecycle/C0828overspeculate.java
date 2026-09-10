package androidx.p001lifecycle;

import android.view.View;
import mastfed.saneness;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import tarboosh.attabal;

/* JADX INFO: renamed from: androidx.lifecycle.overspeculate, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: compiled from: ViewTreeLifecycleOwner.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/arytenoidectomy;", "lifecycleOwner", "", "saneness", "(Landroid/view/View;Landroidx/lifecycle/arytenoidectomy;)V", "attabal", "(Landroid/view/View;)Landroidx/lifecycle/arytenoidectomy;", "lifecycle-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class C0828overspeculate {
    public static final arytenoidectomy attabal(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(attabal.view_tree_lifecycle_owner);
            arytenoidectomy arytenoidectomyVar = tag instanceof arytenoidectomy ? (arytenoidectomy) tag : null;
            if (arytenoidectomyVar != null) {
                return arytenoidectomyVar;
            }
            Object objAttabal = saneness.attabal(view);
            view = objAttabal instanceof View ? (View) objAttabal : null;
        }
        return null;
    }

    public static final void saneness(View view, arytenoidectomy arytenoidectomyVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(attabal.view_tree_lifecycle_owner, arytenoidectomyVar);
    }
}
