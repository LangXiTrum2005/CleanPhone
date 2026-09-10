package com.ironsource;

import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Rd implements O7, O7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, LevelPlayReward> f27148a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, LevelPlayReward> f27149b = new LinkedHashMap();

    @Override // com.ironsource.O7.a
    public void a(String placement, String rewardName, int i10) {
        kotlin.jvm.internal.n.f(placement, "placement");
        kotlin.jvm.internal.n.f(rewardName, "rewardName");
        this.f27148a.put(placement, new LevelPlayReward(rewardName, i10));
    }

    @Override // com.ironsource.O7.a
    public void b(String adUnitId, String rewardName, int i10) {
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.n.f(rewardName, "rewardName");
        this.f27149b.put(adUnitId, new LevelPlayReward(rewardName, i10));
    }

    @Override // com.ironsource.O7
    public LevelPlayReward a(String str, String adUnitId) {
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        LevelPlayReward levelPlayRewardA = a(str);
        return (levelPlayRewardA == null && (levelPlayRewardA = b(adUnitId)) == null) ? a() : levelPlayRewardA;
    }

    @Override // com.ironsource.O7
    public LevelPlayReward b(String adUnitId) {
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        return this.f27149b.get(adUnitId);
    }

    @Override // com.ironsource.O7
    public LevelPlayReward a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.f27148a.get(str);
    }

    private final LevelPlayReward a() {
        return new LevelPlayReward("", 0);
    }
}
