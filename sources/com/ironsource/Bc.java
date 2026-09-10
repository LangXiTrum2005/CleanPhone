package com.ironsource;

import android.app.Activity;
import com.ironsource.sdk.IronSourceNetwork;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Bc implements Ac {
    @Override // com.ironsource.Ac
    public void a(Activity activity, K9 adInstance, Map<String, String> showParams) throws Exception {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        kotlin.jvm.internal.n.f(showParams, "showParams");
        IronSourceNetwork.showAd(activity, adInstance, showParams);
    }

    @Override // com.ironsource.Ac
    public boolean a(K9 adInstance) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        return IronSourceNetwork.isAdAvailableForInstance(adInstance);
    }
}
