package androidx.activity;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/activity/PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1", "Landroid/view/View$OnAttachStateChangeListener;", "activity-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        throw null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnScrollChangedListener(null);
        view.removeOnLayoutChangeListener(null);
    }
}
