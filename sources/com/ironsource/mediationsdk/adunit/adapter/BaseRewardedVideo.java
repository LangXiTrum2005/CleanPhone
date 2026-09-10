package com.ironsource.mediationsdk.adunit.adapter;

import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseRewardedVideo<NetworkAdapter extends BaseAdapter> extends BaseAdInteractionAdapter<NetworkAdapter, RewardedVideoAdListener> {
    public BaseRewardedVideo(NetworkSettings networkSettings) {
        super(LevelPlay.AdFormat.REWARDED, networkSettings);
    }
}
