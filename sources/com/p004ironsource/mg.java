package com.p004ironsource;

import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/ironsource/mg;", "", "", "placement", "adUnitId", "Lcom/unity3d/mediation/rewarded/LevelPlayReward;", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface mg {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J$\u0010\u000b\u001a\u00020\b2\n\u0010\n\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/mg$a;", "", "", "Lcom/ironsource/services/capping/Identifier;", "placement", IronSourceConstants.EVENTS_REWARD_NAME, "", IronSourceConstants.EVENTS_REWARD_AMOUNT, "", "a", "adUnitId", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(String placement, String rewardName, int rewardAmount);

        void b(String adUnitId, String rewardName, int rewardAmount);
    }

    LevelPlayReward a(String placement, String adUnitId);
}
