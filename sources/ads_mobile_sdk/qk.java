package ads_mobile_sdk;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class qk extends Lambda implements Function1 {
    public static final qk a = new qk();

    public qk() {
        super(1);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JsonElement it = (JsonElement) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        JsonObject asJsonObject = it.getAsJsonObject();
        Intrinsics.checkNotNullExpressionValue(asJsonObject, "getAsJsonObject(...)");
        return asJsonObject;
    }
}
