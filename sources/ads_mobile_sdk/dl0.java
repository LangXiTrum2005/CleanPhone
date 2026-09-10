package ads_mobile_sdk;

import androidx.p000activity.ComponentActivity;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class dl0 extends Lambda implements Function0 {
    public final /* synthetic */ bm0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl0(bm0 bm0Var) {
        super(0);
        this.a = bm0Var;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        bm0 bm0Var = this.a;
        cr closeReason = cr.CLOSE_BUTTON;
        bm0Var.getClass();
        Intrinsics.checkNotNullParameter(closeReason, "closeReason");
        bm0Var.t = closeReason;
        ComponentActivity componentActivity = bm0Var.l;
        if (componentActivity != null) {
            componentActivity.finish();
        }
        return Unit.f29295attabal;
    }
}
