package ads_mobile_sdk;

import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class a13 extends Lambda implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a13(String str, Throwable th) {
        super(0);
        this.a = str;
        this.b = th;
    }

    @Override // p002kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Trapped exception (" + this.a + "): " + this.b;
    }
}
