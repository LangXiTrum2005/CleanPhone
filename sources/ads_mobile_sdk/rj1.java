package ads_mobile_sdk;

import com.google.gson.JsonObject;
import com.ironsource.X3;
import com.unity3d.ads.BuildConfig;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rj1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ JsonObject a;
    public final /* synthetic */ hj1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj1(JsonObject jsonObject, hj1 hj1Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = jsonObject;
        this.b = hj1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new rj1(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new rj1(this.a, this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        JsonObject jsonObject = this.a;
        Intrinsics.checkNotNullParameter("watermark_overlay_png_base64", X3.i.W);
        String str = "";
        Intrinsics.checkNotNullParameter("", BuildConfig.FLAVOR);
        if (jsonObject != null) {
            try {
                Intrinsics.checkNotNullParameter(jsonObject, "<this>");
                Intrinsics.checkNotNullParameter("watermark_overlay_png_base64", X3.i.W);
                String asString = jsonObject.get("watermark_overlay_png_base64").getAsString();
                Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
                str = asString;
            } catch (Exception unused) {
            }
        }
        this.b.v = str;
        return Unit.f29295attabal;
    }
}
