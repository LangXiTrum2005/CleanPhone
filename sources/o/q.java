package o;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends FrameLayout implements n.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f47012a;

    /* JADX WARN: Multi-variable type inference failed */
    public q(View view) {
        super(view.getContext());
        this.f47012a = (CollapsibleActionView) view;
        addView(view);
    }
}
