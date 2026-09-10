package com.p004ironsource.mediationsdk.model;

import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.nq;
import com.smartdigimkt.h5.f;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B;\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/ironsource/mediationsdk/model/Placement;", "Lcom/ironsource/mediationsdk/model/BasePlacement;", "", "toString", "<set-?>", "e", "Ljava/lang/String;", "getRewardName", "()Ljava/lang/String;", IronSourceConstants.EVENTS_REWARD_NAME, "", f.j, "I", "getRewardAmount", "()I", IronSourceConstants.EVENTS_REWARD_AMOUNT, "placementId", "placementName", "", "isDefault", "Lcom/ironsource/nq;", "placementAvailabilitySettings", "<init>", "(ILjava/lang/String;ZLjava/lang/String;ILcom/ironsource/nq;)V", "placement", "(Lcom/ironsource/mediationsdk/model/BasePlacement;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class Placement extends BasePlacement {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String rewardName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int rewardAmount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Placement(int i2, String placementName, boolean z2, String rewardName, int i3, nq nqVar) {
        super(i2, placementName, z2, nqVar);
        Intrinsics.f(placementName, "placementName");
        Intrinsics.f(rewardName, "rewardName");
        this.rewardAmount = i3;
        this.rewardName = rewardName;
    }

    public final int getRewardAmount() {
        return this.rewardAmount;
    }

    public final String getRewardName() {
        return this.rewardName;
    }

    @Override // com.p004ironsource.mediationsdk.model.BasePlacement
    public String toString() {
        return super.toString() + ", reward name: " + this.rewardName + " , amount: " + this.rewardAmount;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Placement(BasePlacement placement) {
        super(placement.getPlacementId(), placement.getPlacementName(), placement.getIsDefault(), placement.getPlacementAvailabilitySettings());
        Intrinsics.f(placement, "placement");
        this.rewardName = "";
    }
}
