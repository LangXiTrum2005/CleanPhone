package com.p004ironsource;

import android.app.Activity;
import com.p004ironsource.sdk.IronSourceNetwork;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/ironsource/ep;", "Lcom/ironsource/dp;", "Landroid/app/Activity;", "activity", "Lcom/ironsource/zj;", d9.h.p0, "", "", "showParams", "", "a", "", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ep implements dp {
    @Override // com.p004ironsource.dp
    public void a(Activity activity, zj adInstance, Map<String, String> showParams) throws Exception {
        Intrinsics.f(activity, "activity");
        Intrinsics.f(adInstance, "adInstance");
        Intrinsics.f(showParams, "showParams");
        IronSourceNetwork.showAd(activity, adInstance, showParams);
    }

    @Override // com.p004ironsource.dp
    public boolean a(zj adInstance) {
        Intrinsics.f(adInstance, "adInstance");
        return IronSourceNetwork.isAdAvailableForInstance(adInstance);
    }
}
