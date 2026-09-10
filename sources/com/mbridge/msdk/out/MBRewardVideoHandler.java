package com.mbridge.msdk.out;

import android.content.Context;
import com.mbridge.msdk.out.strategy.base.NonBidAdHandler;
import com.mbridge.msdk.out.strategy.component.ComponentStrategy;
import com.mbridge.msdk.out.strategy.legacy.reward.RewardVideoStrategy;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBRewardVideoHandler extends NonBidAdHandler {
    private static final String TAG = "MBRewardVideoHandler";

    public MBRewardVideoHandler(Context context, String str, String str2) {
        super(context, str, str2);
    }

    @Override // com.mbridge.msdk.out.strategy.base.BaseAdHandler
    public void initStrategy(String str, String str2) {
        this.legacyVideoAdStrategy = new RewardVideoStrategy(str2, str);
        this.componentAdStrategy = new ComponentStrategy(str2, str, 94);
    }

    public MBRewardVideoHandler(String str, String str2) {
        super(str, str2);
    }
}
