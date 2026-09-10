package ads_mobile_sdk;

import com.ironsource.X3;
import java.util.Optional;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.tael;

/* JADX INFO: loaded from: classes.dex */
public final class i93 implements tael {
    public final Optional a;
    public final saran b;
    public final jk0 c;

    public i93(Optional optionalGmaWebView, saran uiScope, jk0 flags) {
        Intrinsics.checkNotNullParameter(optionalGmaWebView, "optionalGmaWebView");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = optionalGmaWebView;
        this.b = uiScope;
        this.c = flags;
    }

    @Override // saneness.tael
    public final Unit a(boolean z) {
        jk0 jk0Var = this.c;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:pause_webview_when_not_visible", X3.i.W);
        if (((Boolean) jk0Var.a("gads:pause_webview_when_not_visible", Boolean.TRUE, zk.b)).booleanValue()) {
            gq0 gq0Var = (gq0) monocoque.attabal.saneness(this.a);
            if (gq0Var == null) {
                return Unit.f29295attabal;
            }
            if (z) {
                saran saranVar = this.b;
                g93 block = new g93(gq0Var, null);
                EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(block, "block");
                cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
            } else {
                saran saranVar2 = this.b;
                h93 block2 = new h93(gq0Var, null);
                EmptyCoroutineContext context2 = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar2, "<this>");
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(block2, "block");
                cutely.wireman(saranVar2, context2, null, new x13(block2, null), 2, null);
            }
        }
        return Unit.f29295attabal;
    }
}
