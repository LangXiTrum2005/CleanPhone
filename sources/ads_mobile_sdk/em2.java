package ads_mobile_sdk;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;
import saneness.evenfall;
import saneness.moneyless;
import saneness.splinterproof;
import saneness.vir;

/* JADX INFO: loaded from: classes.dex */
public final class em2 extends Lambda implements Function0 {
    public final /* synthetic */ JsonObject a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em2(JsonObject jsonObject) {
        super(0);
        this.a = jsonObject;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        no0 no0Var = no0.CUI_NAME_ADREQUEST_PARSERESPONSE;
        List listFormularize = adultoid.formularize();
        JsonObject jsonObject = this.a;
        w03 w03VarA = j13.a(no0Var, listFormularize, true);
        try {
            JsonArray asJsonArray = jsonObject.getAsJsonArray("responses");
            int i = 0;
            JsonObject asJsonObject = !asJsonArray.isEmpty() ? asJsonArray.get(0).getAsJsonObject() : null;
            JsonArray asJsonArray2 = asJsonObject != null ? asJsonObject.getAsJsonArray("ad_configs") : null;
            ArrayList arrayList = new ArrayList();
            if (asJsonArray2 != null) {
                int i2 = 0;
                for (JsonElement jsonElement : asJsonArray2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        adultoid.dovishness();
                    }
                    JsonElement jsonElement2 = jsonElement;
                    Intrinsics.beachfront(jsonElement2);
                    List list = h1.A0;
                    JsonObject asJsonObject2 = jsonElement2.getAsJsonObject();
                    Intrinsics.checkNotNullExpressionValue(asJsonObject2, "getAsJsonObject(...)");
                    h1 h1VarSaneness = splinterproof.saneness(asJsonObject2, i2);
                    if (h1VarSaneness != null) {
                        arrayList.add(h1VarSaneness);
                    }
                    i2 = i3;
                }
            }
            ur urVarAttabal = moneyless.attabal(asJsonObject != null ? asJsonObject.getAsJsonObject("common") : null);
            JsonElement jsonElement3 = jsonObject.get("actions");
            JsonArray asJsonArray3 = jsonElement3 != null ? jsonElement3.getAsJsonArray() : null;
            ArrayList arrayList2 = new ArrayList();
            if (asJsonArray3 != null) {
                for (JsonElement jsonElement4 : asJsonArray3) {
                    int i4 = i + 1;
                    if (i < 0) {
                        adultoid.dovishness();
                    }
                    JsonElement jsonElement5 = jsonElement4;
                    Intrinsics.beachfront(jsonElement5);
                    JsonObject asJsonObject3 = jsonElement5.getAsJsonObject();
                    Intrinsics.checkNotNullExpressionValue(asJsonObject3, "getAsJsonObject(...)");
                    dm2 dm2VarAttabal = vir.attabal(asJsonObject3);
                    if (dm2VarAttabal != null) {
                        arrayList2.add(dm2VarAttabal);
                    }
                    i = i4;
                }
            }
            fm2 fm2Var = new fm2(arrayList, urVarAttabal, arrayList2);
            interaction.saneness.attabal(w03VarA, null);
            return fm2Var;
        } catch (Throwable th) {
            try {
                w03VarA.b(th);
                if (th instanceof evenfall) {
                    throw th;
                }
                w03VarA.a(th);
                if (th instanceof TimeoutCancellationException) {
                    throw new cp0(th);
                }
                if (th instanceof CancellationException) {
                    throw new bn0(th);
                }
                if (th instanceof yn0) {
                    throw th;
                }
                throw new gn0(th);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    interaction.saneness.attabal(w03VarA, th2);
                    throw th3;
                }
            }
        }
    }
}
