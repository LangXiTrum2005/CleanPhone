package ads_mobile_sdk;

import com.google.gson.JsonObject;
import com.ironsource.X3;
import com.unity3d.ads.BuildConfig;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.phonoscope;

/* JADX INFO: loaded from: classes.dex */
public final class oy0 implements phonoscope {
    public final wz0 a;

    public oy0(wz0 inspectorManager) {
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        this.a = inspectorManager;
    }

    @Override // saneness.phonoscope
    public final Object a(JsonObject jsonObject, wretchedly.dern dernVar) {
        Intrinsics.checkNotNullParameter("gesture", X3.i.W);
        String str = "";
        Intrinsics.checkNotNullParameter("", BuildConfig.FLAVOR);
        try {
            Intrinsics.checkNotNullParameter(jsonObject, "<this>");
            Intrinsics.checkNotNullParameter("gesture", X3.i.W);
            String asString = jsonObject.get("gesture").getAsString();
            Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
            str = asString;
        } catch (Exception unused) {
        }
        if (Intrinsics.wireman(str, "shake")) {
            wz0 wz0Var = this.a;
            ny0 ny0Var = ny0.SHAKE;
            wz0Var.getClass();
            Object objA = wz0.a(wz0Var, ny0Var, dernVar);
            return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
        }
        if (Intrinsics.wireman(str, "flick")) {
            wz0 wz0Var2 = this.a;
            ny0 ny0Var2 = ny0.FLICK;
            wz0Var2.getClass();
            Object objA2 = wz0.a(wz0Var2, ny0Var2, dernVar);
            return objA2 == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA2 : Unit.f29295attabal;
        }
        wz0 wz0Var3 = this.a;
        ny0 ny0Var3 = ny0.NONE;
        wz0Var3.getClass();
        Object objA3 = wz0.a(wz0Var3, ny0Var3, dernVar);
        return objA3 == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA3 : Unit.f29295attabal;
    }
}
