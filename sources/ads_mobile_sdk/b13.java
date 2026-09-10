package ads_mobile_sdk;

import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class b13 extends Lambda implements Function0 {
    public final /* synthetic */ Throwable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b13(Throwable th) {
        super(0);
        this.a = th;
    }

    @Override // p002kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Untrapped exception: " + this.a;
    }
}
