package com.p004ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.impl.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ironsource/w6;", "Landroid/widget/FrameLayout;", "Lcom/ironsource/xw;", "a", "Lcom/ironsource/xw;", "getViewBinder", "()Lcom/ironsource/xw;", "viewBinder", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class w6 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final xw viewBinder;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"com/ironsource/w6$a", "Lcom/ironsource/xw;", "Landroid/view/View;", "view", "Landroid/widget/FrameLayout$LayoutParams;", "layoutParams", "Lcom/ironsource/u2;", "adTools", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements xw {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(View this_apply) {
            Intrinsics.f(this_apply, "$this_apply");
            this_apply.setEnabled(false);
            this_apply.setClickable(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(u2 adTools, long j) {
            Intrinsics.f(adTools, "$adTools");
            adTools.getEventSender().getTroubleshoot().a(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(u2 adTools, long j) {
            Intrinsics.f(adTools, "$adTools");
            adTools.getEventSender().getTroubleshoot().a(true, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(u2 adTools, long j) {
            Intrinsics.f(adTools, "$adTools");
            adTools.d(new I0(adTools, j, 3));
        }

        @Override // com.p004ironsource.xw
        public void a(View view, FrameLayout.LayoutParams layoutParams, u2 adTools) {
            Intrinsics.f(view, "view");
            Intrinsics.f(layoutParams, "layoutParams");
            Intrinsics.f(adTools, "adTools");
            View childAt = w6.this.getChildAt(0);
            long jE = on.INSTANCE.d().d().e();
            if (jE <= 0) {
                w6.this.removeView(childAt);
                w6.this.addView(view, layoutParams);
                adTools.d(new I0(adTools, jE, 0));
                return;
            }
            adTools.d(new I0(adTools, jE, 1));
            view.setAlpha(0.0f);
            w6.this.addView(view, layoutParams);
            if (childAt != null) {
                childAt.animate().alpha(0.0f).setDuration(jE).withStartAction(new D(childAt, 12)).withEndAction(new H0(w6.this, childAt, childAt, 21)).start();
            }
            view.animate().alpha(1.0f).setDuration(jE).withEndAction(new I0(adTools, jE, 2)).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(u2 adTools, long j) {
            Intrinsics.f(adTools, "$adTools");
            adTools.getEventSender().getTroubleshoot().a(false, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(w6 this$0, View view, View this_apply) {
            Intrinsics.f(this$0, "this$0");
            Intrinsics.f(this_apply, "$this_apply");
            this$0.removeView(view);
            this_apply.setEnabled(true);
            this_apply.setClickable(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(Context context) {
        super(context);
        Intrinsics.f(context, "context");
        this.viewBinder = new a();
    }

    public final xw getViewBinder() {
        return this.viewBinder;
    }
}
