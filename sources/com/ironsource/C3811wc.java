package com.ironsource;

import android.app.Activity;
import com.ironsource.sdk.IronSourceNetwork;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3811wc implements InterfaceC3794vc {
    @Override // com.ironsource.InterfaceC3794vc
    public void a(Activity activity, H9 adInstance, Map<String, String> showParams) throws Exception {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(showParams, "showParams");
        IronSourceNetwork.showAd(activity, adInstance, showParams);
    }

    @Override // com.ironsource.InterfaceC3794vc
    public boolean a(H9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return IronSourceNetwork.isAdAvailableForInstance(adInstance);
    }
}
