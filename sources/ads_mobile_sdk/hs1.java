package ads_mobile_sdk;

import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class hs1 extends Lambda implements Function0 {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs1(long j, boolean z) {
        super(0);
        this.a = j;
        this.b = z;
    }

    @Override // p002kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Now online at " + p002kotlin.time.saneness.starveling(this.a) + "?: " + this.b;
    }
}
