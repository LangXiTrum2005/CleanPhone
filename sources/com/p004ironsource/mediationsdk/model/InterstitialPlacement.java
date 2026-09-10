package com.p004ironsource.mediationsdk.model;

import com.p004ironsource.nq;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ironsource/mediationsdk/model/InterstitialPlacement;", "Lcom/ironsource/mediationsdk/model/BasePlacement;", "", "placementId", "", "placementName", "", "isDefault", "Lcom/ironsource/nq;", "placementAvailabilitySettings", "<init>", "(ILjava/lang/String;ZLcom/ironsource/nq;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class InterstitialPlacement extends BasePlacement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialPlacement(int i2, String placementName, boolean z2, nq nqVar) {
        super(i2, placementName, z2, nqVar);
        Intrinsics.f(placementName, "placementName");
    }
}
