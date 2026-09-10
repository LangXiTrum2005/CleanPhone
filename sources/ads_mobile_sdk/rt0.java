package ads_mobile_sdk;

import java.io.IOException;
import kotlinx.coroutines.impassible;
import kotlinx.coroutines.kowloon;
import okhttp3.beachfront;
import okhttp3.cuirassed;
import okhttp3.marial;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rt0 implements beachfront {
    public final /* synthetic */ impassible a;

    public rt0(kowloon kowloonVar) {
        this.a = kowloonVar;
    }

    @Override // okhttp3.beachfront
    public final void onFailure(marial call, IOException e) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e, "e");
        this.a.impassible(new on0(e, k41.NETWORK_ERROR, null, 4), new pt0(call));
    }

    @Override // okhttp3.beachfront
    public final void onResponse(marial call, cuirassed response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        this.a.impassible(new tn0(response), new qt0(call));
    }
}
