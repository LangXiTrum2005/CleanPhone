package ads_mobile_sdk;

import com.google.gson.JsonObject;
import com.ironsource.C3474d8;
import java.util.Optional;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.tael;

/* JADX INFO: loaded from: classes.dex */
public final class ra3 implements tael {
    public final saran a;
    public final Optional b;

    public ra3(saran uiScope, Optional optionalWebView) {
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(optionalWebView, "optionalWebView");
        this.a = uiScope;
        this.b = optionalWebView;
    }

    @Override // saneness.tael
    public final Unit a(boolean z) {
        gq0 gq0Var = (gq0) monocoque.attabal.saneness(this.b);
        if (gq0Var == null) {
            return Unit.f29295attabal;
        }
        String str = z ? "1" : "0";
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(C3474d8.k, str);
        cutely.wireman(this.a, null, null, new qa3(gq0Var, jsonObject, null), 3, null);
        return Unit.f29295attabal;
    }
}
