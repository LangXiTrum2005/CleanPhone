package saneness;

import ads_mobile_sdk.gq0;
import ads_mobile_sdk.po0;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface hemolysin {
    Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar);

    default hemolysin a() {
        return this;
    }

    po0 b();

    default boolean c() {
        return false;
    }

    default String d() {
        return null;
    }

    default void a(String adKey) {
        Intrinsics.checkNotNullParameter(adKey, "adKey");
    }
}
