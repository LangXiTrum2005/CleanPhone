package ads_mobile_sdk;

import com.google.gson.JsonElement;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ek extends Lambda implements Function1 {
    public static final ek a = new ek();

    public ek() {
        super(1);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JsonElement it = (JsonElement) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Double.valueOf(it.getAsDouble());
    }
}
