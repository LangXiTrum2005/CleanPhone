package ads_mobile_sdk;

import android.net.Network;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class bs1 extends Lambda implements Function0 {
    public final /* synthetic */ long a;
    public final /* synthetic */ Network b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs1(long j, Network network) {
        super(0);
        this.a = j;
        this.b = network;
    }

    @Override // p002kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Network lost at " + p002kotlin.time.saneness.starveling(this.a) + ": " + this.b;
    }
}
