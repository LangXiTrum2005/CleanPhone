package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o90 extends Lambda implements Function1 {
    public static final o90 a = new o90();

    public o90() {
        super(1);
    }

    public static String a(Map.Entry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getKey() + " = " + it.getValue();
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a((Map.Entry) obj);
    }
}
