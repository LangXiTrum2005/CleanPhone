package ads_mobile_sdk;

import com.google.android.gms.ads.AdError;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import kurbash.formularize;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.MutablePropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import saneness.igo;

/* JADX INFO: loaded from: classes.dex */
public final class yb0 {
    public static final /* synthetic */ formularize[] b = {polloi.competently(new MutablePropertyReference1Impl(yb0.class, "thirdPartyEventEmitter", "getThirdPartyEventEmitter()Lcom/google/android/libraries/ads/mobile/sdk/internal/event/ThirdPartyEventEmitter;", 0))};
    public final vw2 a = new vw2(null);

    public final igo a() {
        return (igo) this.a.getValue(this, b[0]);
    }

    public final void b() {
        igo igoVarA = a();
        if (igoVarA != null) {
            hy2 hy2Var = (hy2) igoVarA;
            saran saranVar = hy2Var.a;
            px2 block = new px2(hy2Var, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }

    public final void c() {
        igo igoVarA = a();
        if (igoVarA != null) {
            hy2 hy2Var = (hy2) igoVarA;
            saran saranVar = hy2Var.a;
            rx2 block = new rx2(hy2Var, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
            g1 g1Var = hy2Var.b.n0;
            if (g1Var == g1.FORMAT_DEFAULT || g1Var == g1.ON_AD_OPENED) {
                saran saranVar2 = hy2Var.a;
                sx2 block2 = new sx2(hy2Var, null);
                Intrinsics.checkNotNullParameter(saranVar2, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(block2, "block");
                cutely.wireman(saranVar2, context, null, new x13(block2, null), 2, null);
            }
        }
    }

    public final void d() {
        igo igoVarA = a();
        if (igoVarA != null) {
            hy2 hy2Var = (hy2) igoVarA;
            saran saranVar = hy2Var.a;
            tx2 block = new tx2(hy2Var, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }

    public final void e() {
        igo igoVarA = a();
        if (igoVarA != null) {
            ((hy2) igoVarA).a();
        }
    }

    public final void f() {
        igo igoVarA = a();
        if (igoVarA != null) {
            hy2 hy2Var = (hy2) igoVarA;
            saran saranVar = hy2Var.a;
            cy2 block = new cy2(hy2Var, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }

    public final void a(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        igo igoVarA = a();
        if (igoVarA != null) {
            hy2 hy2Var = (hy2) igoVarA;
            Intrinsics.checkNotNullParameter(adError, "adError");
            monroe monroeVar = hy2Var.g;
            if (monroeVar != null) {
                monroe.attabal.attabal(monroeVar, null, 1, null);
            }
            saran saranVar = hy2Var.a;
            qx2 block = new qx2(hy2Var, adError, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }
}
