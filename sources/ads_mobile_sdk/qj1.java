package ads_mobile_sdk;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class qj1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ vj1 a;
    public final /* synthetic */ JsonObject b;
    public final /* synthetic */ hj1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj1(hj1 hj1Var, vj1 vj1Var, JsonObject jsonObject, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = vj1Var;
        this.b = jsonObject;
        this.c = hj1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new qj1(this.c, this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qj1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ?? Formularize;
        JsonObject asJsonObject;
        JsonObject asJsonObject2;
        JsonArray jsonArrayD;
        d61 d61Var;
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        sn1 sn1Var = this.a.d;
        JsonObject adJson = this.b;
        sn1Var.getClass();
        Intrinsics.checkNotNullParameter(adJson, "adJson");
        d61 d61Var2 = null;
        JsonObject jsonObjectA = cb1.a(adJson, CampaignEx.JSON_NATIVE_VIDEO_MUTE, (JsonObject) null);
        if (jsonObjectA == null || (jsonArrayD = cb1.d(jsonObjectA, "reasons")) == null) {
            Formularize = adultoid.formularize();
        } else {
            Formularize = new ArrayList();
            Iterator<JsonElement> it = jsonArrayD.iterator();
            while (it.hasNext()) {
                try {
                    JsonObject asJsonObject3 = it.next().getAsJsonObject();
                    Intrinsics.checkNotNullExpressionValue(asJsonObject3, "getAsJsonObject(...)");
                    String strA = cb1.a(asJsonObject3, "reason", "");
                    String strA2 = cb1.a(asJsonObject3, "ping_url", "");
                    d61Var = (StringsKt.empress(strA) || StringsKt.empress(strA2)) ? null : new d61(strA, strA2);
                } catch (Exception unused) {
                }
                if (d61Var != null) {
                    Formularize.add(d61Var);
                }
            }
        }
        Iterator it2 = Formularize.iterator();
        while (it2.hasNext()) {
            this.c.p.add((d61) it2.next());
        }
        hj1 hj1Var = this.c;
        sn1 sn1Var2 = this.a.d;
        JsonObject adJson2 = this.b;
        sn1Var2.getClass();
        Intrinsics.checkNotNullParameter(adJson2, "adJson");
        Intrinsics.checkNotNullParameter(CampaignEx.JSON_NATIVE_VIDEO_MUTE, X3.i.W);
        if (adJson2 == null) {
            asJsonObject = null;
        } else {
            try {
                asJsonObject = adJson2.getAsJsonObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
            } catch (Exception unused2) {
                asJsonObject = null;
            }
        }
        if (asJsonObject != null) {
            Intrinsics.checkNotNullParameter("default_reason", X3.i.W);
            try {
                asJsonObject2 = asJsonObject.getAsJsonObject("default_reason");
            } catch (Exception unused3) {
                asJsonObject2 = null;
            }
            if (asJsonObject2 != null) {
                String strA3 = cb1.a(asJsonObject2, "reason", "");
                String strA4 = cb1.a(asJsonObject2, "ping_url", "");
                if (!StringsKt.empress(strA3) && !StringsKt.empress(strA4)) {
                    d61Var2 = new d61(strA3, strA4);
                }
            }
        }
        hj1Var.q = d61Var2;
        return Unit.f29295attabal;
    }
}
