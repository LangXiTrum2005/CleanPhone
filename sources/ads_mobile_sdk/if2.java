package ads_mobile_sdk;

import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class if2 extends Lambda implements Function0 {
    public final /* synthetic */ spartacist a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if2(spartacist spartacistVar) {
        super(0);
        this.a = spartacistVar;
    }

    @Override // p002kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Pre break glass URL result: " + ((tn0) this.a).a();
    }
}
