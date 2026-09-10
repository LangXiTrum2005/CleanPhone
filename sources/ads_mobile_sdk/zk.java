package ads_mobile_sdk;

import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.stupefactive;

/* JADX INFO: loaded from: classes.dex */
public abstract class zk {
    public static final jk b = jk.a;
    public static final lk c = lk.a;
    public static final sk d = sk.a;
    public static final nk e = nk.a;
    public static final ok f = ok.a;
    public static final rk g = rk.a;
    public static final pk h = pk.a;
    public static final qk i = qk.a;
    public static final tk j = tk.a;
    public static final kk k = kk.a;
    public static final vk l = vk.a;
    public static final uk m = uk.a;
    public static final wk n = wk.a;
    public static final xk o = xk.a;
    public static final yk p = yk.a;
    public static final mk q = mk.a;
    public final stupefactive a;

    public zk(stupefactive flagValueProvider) {
        Intrinsics.checkNotNullParameter(flagValueProvider, "flagValueProvider");
        this.a = flagValueProvider;
    }

    public final Object a(String key, Object obj, Function1 converter) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Object objA = ((ik) this.a).a(key, converter);
        return objA == null ? obj : objA;
    }
}
