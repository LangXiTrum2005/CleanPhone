package ads_mobile_sdk;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ck extends Lambda implements Function1 {
    public static final ck a = new ck();

    public ck() {
        super(1);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JsonElement it = (JsonElement) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return (JsonObject) new Gson().fromJson(it.getAsString(), JsonObject.class);
    }
}
