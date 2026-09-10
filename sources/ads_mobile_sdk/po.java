package ads_mobile_sdk;

import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class po extends Lambda implements Function0 {
    public final /* synthetic */ no a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po(no noVar) {
        super(0);
        this.a = noVar;
    }

    @Override // p002kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "variations header: " + this.a.b() + ", " + this.a.c();
    }
}
