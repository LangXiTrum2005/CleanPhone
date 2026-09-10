package ads_mobile_sdk;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;
import p002kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class dq2 extends Lambda implements Function0 {
    public final /* synthetic */ JsonObject a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq2(JsonObject jsonObject) {
        super(0);
        this.a = jsonObject;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        String asString = "";
        List listSplit$default = null;
        for (Map.Entry<String, JsonElement> entry : this.a.entrySet()) {
            Intrinsics.beachfront(entry);
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (Intrinsics.wireman(key, "params")) {
                asString = value.getAsString();
                Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
            } else if (Intrinsics.wireman(key, "csrb_errors")) {
                String asString2 = value.getAsString();
                Intrinsics.checkNotNullExpressionValue(asString2, "getAsString(...)");
                listSplit$default = StringsKt.split$default(asString2, new String[]{","}, false, 0, 6, null);
            }
        }
        return new fq2(asString, listSplit$default);
    }
}
