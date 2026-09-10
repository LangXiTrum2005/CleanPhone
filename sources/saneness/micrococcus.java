package saneness;

import com.google.android.libraries.ads.mobile.sdk.internal.util.AndroidBundleTypeAdapterFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class micrococcus implements coi {
    @Override // saneness.adultoid
    public final Object get() {
        Gson gsonCreate = new GsonBuilder().registerTypeAdapterFactory(new AndroidBundleTypeAdapterFactory()).create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
        return (Gson) vilification.dern(gsonCreate);
    }
}
