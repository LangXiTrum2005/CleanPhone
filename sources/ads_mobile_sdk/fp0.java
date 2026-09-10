package ads_mobile_sdk;

import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class fp0 extends Lambda implements Function1 {
    public static final fp0 a = new fp0();

    public fp0() {
        super(1);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        return Boolean.valueOf(!(str == null || str.length() == 0));
    }
}
