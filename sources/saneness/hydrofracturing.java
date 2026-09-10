package saneness;

import com.google.gson.JsonObject;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface hydrofracturing {
    Object a(JsonObject jsonObject, String str, wretchedly.dern dernVar);

    Object a(String str, String str2, wretchedly.dern dernVar);

    default Object attabal(JsonObject jsonObject, String str, ContinuationImpl continuationImpl) {
        String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return a(str, string, continuationImpl);
    }
}
