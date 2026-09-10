package ads_mobile_sdk;

import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: classes.dex */
public final class zx2 implements scarbroite.attabal {
    public final /* synthetic */ RewardItem a;

    public zx2(RewardItem rewardItem) {
        this.a = rewardItem;
    }

    @Override // scarbroite.attabal
    public final int getAmount() {
        return this.a.getAmount();
    }

    @Override // scarbroite.attabal
    public final String getType() {
        return this.a.getType();
    }
}
