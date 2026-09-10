package ads_mobile_sdk;

import com.google.gson.JsonElement;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class xk extends Lambda implements Function1 {
    public static final xk a = new xk();

    public xk() {
        super(1);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JsonElement it = (JsonElement) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        String asString = it.getAsString();
        Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
        return asString;
    }
}
