package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.terni;

/* JADX INFO: loaded from: classes.dex */
public class ei extends mj implements liquory.saneness {
    public final d41 b;
    public final cg2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei(d41 internalBannerAd, cg2 adFrame) {
        super(internalBannerAd);
        Intrinsics.checkNotNullParameter(internalBannerAd, "internalBannerAd");
        Intrinsics.checkNotNullParameter(adFrame, "adFrame");
        this.b = internalBannerAd;
        this.c = adFrame;
    }

    public d41 a() {
        return this.b;
    }

    @Override // liquory.saneness
    public final liquory.attabal getAdSize() {
        return a().j();
    }

    @Override // liquory.saneness
    public final cg2 getView() {
        return this.c;
    }

    @Override // liquory.saneness
    public final void a(liquory.attabal adSize) {
        Intrinsics.checkNotNullParameter(adSize, "newSize");
        this.c.a(adSize);
        d41 d41VarA = a();
        Context context = this.c.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        d41VarA.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adSize, "newSize");
        gq0 gq0Var = (gq0) monocoque.attabal.saneness(d41VarA.i());
        if (gq0Var == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        int width = adSize.getWidth();
        int height = adSize.getHeight();
        boolean zCompetently = adSize.competently();
        if (zCompetently) {
            width = 320;
            height = 50;
        }
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        int iApplyDimension = (int) TypedValue.applyDimension(1, width, displayMetrics);
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, height, displayMetrics2);
        gq0Var.a(zCompetently ? new ia3(ha3.FLUID_RECTANGLE, iApplyDimension, iApplyDimension2, true) : new ia3(ha3.FIXED_RECTANGLE, iApplyDimension, iApplyDimension2, 8));
    }

    @Override // liquory.saneness
    public final View getView(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        terni.f37333attabal.getClass();
        ((x) ((i60) ((terni) en0.c.getValue())).G.get()).a(activity, r.CREATED);
        return this.c;
    }
}
