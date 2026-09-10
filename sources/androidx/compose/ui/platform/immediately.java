package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.WeakHashMap;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Wrapper.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/runtime/graveside;", "parent", "Lkotlin/Function0;", "", "content", "Landroidx/compose/runtime/molybdenite;", "saneness", "(Landroidx/compose/ui/platform/AbstractComposeView;Landroidx/compose/runtime/graveside;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/molybdenite;", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "attabal", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/graveside;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/molybdenite;", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "DefaultLayoutParams", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class immediately {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f7439attabal = new ViewGroup.LayoutParams(-2, -2);

    public static final androidx.compose.runtime.molybdenite attabal(AndroidComposeView androidComposeView, androidx.compose.runtime.graveside gravesideVar, Function2<? super androidx.compose.runtime.taiyuan, ? super Integer, Unit> function2) {
        if (InspectableValueKt.attabal() && androidComposeView.getTag(yemenite.wireman.inspection_slot_table_set) == null) {
            androidComposeView.setTag(yemenite.wireman.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
        }
        androidx.compose.runtime.molybdenite molybdeniteVarAttabal = androidx.compose.runtime.rotuma.attabal(new androidx.compose.ui.node.lerp(androidComposeView.getRoot()), gravesideVar);
        Object tag = androidComposeView.getView().getTag(yemenite.wireman.wrapped_composition_tag);
        WrappedComposition wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, molybdeniteVarAttabal);
            androidComposeView.getView().setTag(yemenite.wireman.wrapped_composition_tag, wrappedComposition);
        }
        wrappedComposition.competently(function2);
        if (!Intrinsics.wireman(androidComposeView.getCoroutineContext(), gravesideVar.getEffectCoroutineContext())) {
            androidComposeView.setCoroutineContext(gravesideVar.getEffectCoroutineContext());
        }
        return wrappedComposition;
    }

    public static final androidx.compose.runtime.molybdenite saneness(AbstractComposeView abstractComposeView, androidx.compose.runtime.graveside gravesideVar, Function2<? super androidx.compose.runtime.taiyuan, ? super Integer, Unit> function2) {
        GlobalSnapshotManager.f7308attabal.saneness();
        AndroidComposeView androidComposeView = null;
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            abstractComposeView.removeAllViews();
        }
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), gravesideVar.getEffectCoroutineContext());
            abstractComposeView.addView(androidComposeView.getView(), f7439attabal);
        }
        return attabal(androidComposeView, gravesideVar, function2);
    }
}
