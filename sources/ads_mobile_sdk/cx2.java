package ads_mobile_sdk;

import com.google.gson.JsonObject;
import com.ironsource.X3;
import com.unity3d.ads.BuildConfig;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import saneness.phonoscope;

/* JADX INFO: loaded from: classes.dex */
public final class cx2 implements phonoscope {
    public final wz0 a;

    public cx2(wz0 inspectorManager) {
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        this.a = inspectorManager;
    }

    @Override // saneness.phonoscope
    public final Object a(JsonObject jsonObject, wretchedly.dern dernVar) {
        Intrinsics.checkNotNullParameter("test_mode_enabled", X3.i.W);
        String str = "";
        Intrinsics.checkNotNullParameter("", BuildConfig.FLAVOR);
        try {
            Intrinsics.checkNotNullParameter(jsonObject, "<this>");
            Intrinsics.checkNotNullParameter("test_mode_enabled", X3.i.W);
            String asString = jsonObject.get("test_mode_enabled").getAsString();
            Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
            str = asString;
        } catch (Exception unused) {
        }
        if (StringsKt.empress(str)) {
            return Unit.f29295attabal;
        }
        wz0 wz0Var = this.a;
        boolean z = Boolean.parseBoolean(str);
        wz0Var.getClass();
        Object objA = wz0.a(wz0Var, z, dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }
}
