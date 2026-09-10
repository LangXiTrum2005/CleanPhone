package inceptive;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* JADX INFO: compiled from: ScarRewardedAd.java */
/* JADX INFO: loaded from: classes4.dex */
public class competently extends attabal<RewardedAd> implements astigmatic.attabal {
    public competently(Context context, twas.attabal attabalVar, astigmatic.dern dernVar, com.unity3d.scar.adapter.common.dern dernVar2, com.unity3d.scar.adapter.common.competently competentlyVar) {
        super(context, dernVar, attabalVar, dernVar2);
        this.f28593marial = new impromptu(competentlyVar, this);
    }

    @Override // inceptive.attabal
    public void saneness(AdRequest adRequest, astigmatic.saneness sanenessVar) {
        RewardedAd.load(this.f28594saneness, this.f28592dern.saneness(), adRequest, ((impromptu) this.f28593marial).saneness());
    }

    @Override // astigmatic.attabal
    public void show(Activity activity) {
        T t = this.f28590attabal;
        if (t != 0) {
            ((RewardedAd) t).show(activity, ((impromptu) this.f28593marial).dern());
        } else {
            this.f28591beachfront.handleError(com.unity3d.scar.adapter.common.saneness.attabal(this.f28592dern));
        }
    }
}
