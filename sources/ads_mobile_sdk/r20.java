package ads_mobile_sdk;

import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class r20 extends Lambda implements Function1 {
    public static final r20 a = new r20();

    public r20() {
        super(1);
    }

    public static String a(l20 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        long jMerc = p002kotlin.time.saneness.merc(it.a(), it.b.a());
        return it.a + "." + p002kotlin.time.saneness.adultoid(jMerc);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a((l20) obj);
    }
}
