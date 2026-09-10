package ads_mobile_sdk;

import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class nc0 extends Lambda implements Function0 {
    public final /* synthetic */ qc0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc0(qc0 qc0Var) {
        super(0);
        this.a = qc0Var;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(this.a.e.hasSystemFeature("com.google.android.feature.services_updater") && this.a.e.hasSystemFeature("cn.google.services"));
    }
}
