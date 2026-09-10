package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class W2 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Eg f27522a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements Eg {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(V0 adTools, long j10) {
            kotlin.jvm.internal.n.f(adTools, "$adTools");
            adTools.c(new bi(adTools, j10, 3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(V0 adTools, long j10) {
            kotlin.jvm.internal.n.f(adTools, "$adTools");
            adTools.d().h().a(j10);
        }

        @Override // com.ironsource.Eg
        public void a(View view, FrameLayout.LayoutParams layoutParams, V0 adTools) {
            kotlin.jvm.internal.n.f(view, "view");
            kotlin.jvm.internal.n.f(layoutParams, "layoutParams");
            kotlin.jvm.internal.n.f(adTools, "adTools");
            View childAt = W2.this.getChildAt(0);
            long jF = Kb.f26413u.d().h().f();
            if (jF <= 0) {
                W2.this.removeView(childAt);
                W2.this.addView(view, layoutParams);
                adTools.c(new bi(adTools, jF, 0));
                return;
            }
            adTools.c(new bi(adTools, jF, 1));
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            W2.this.addView(view, layoutParams);
            if (childAt != null) {
                childAt.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(jF).withStartAction(new androidx.fragment.app.n(childAt, 23)).withEndAction(new ph(W2.this, childAt, childAt, 7)).start();
            }
            view.animate().alpha(1.0f).setDuration(jF).withEndAction(new bi(adTools, jF, 2)).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(V0 adTools, long j10) {
            kotlin.jvm.internal.n.f(adTools, "$adTools");
            adTools.d().h().a(true, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(V0 adTools, long j10) {
            kotlin.jvm.internal.n.f(adTools, "$adTools");
            adTools.d().h().a(false, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(View this_apply) {
            kotlin.jvm.internal.n.f(this_apply, "$this_apply");
            this_apply.setEnabled(false);
            this_apply.setClickable(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(W2 this$0, View view, View this_apply) {
            kotlin.jvm.internal.n.f(this$0, "this$0");
            kotlin.jvm.internal.n.f(this_apply, "$this_apply");
            this$0.removeView(view);
            this_apply.setEnabled(true);
            this_apply.setClickable(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W2(Context context) {
        super(context);
        kotlin.jvm.internal.n.f(context, "context");
        this.f27522a = new a();
    }

    public final Eg getViewBinder() {
        return this.f27522a;
    }
}
