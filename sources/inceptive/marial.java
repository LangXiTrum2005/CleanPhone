package inceptive;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* JADX INFO: compiled from: ScarInterstitialAd.java */
/* JADX INFO: loaded from: classes4.dex */
public class marial extends attabal<InterstitialAd> implements astigmatic.attabal {
    public marial(Context context, twas.attabal attabalVar, astigmatic.dern dernVar, com.unity3d.scar.adapter.common.dern dernVar2, com.unity3d.scar.adapter.common.beachfront beachfrontVar) {
        super(context, dernVar, attabalVar, dernVar2);
        this.f28593marial = new beachfront(beachfrontVar, this);
    }

    @Override // inceptive.attabal
    public void saneness(AdRequest adRequest, astigmatic.saneness sanenessVar) {
        InterstitialAd.load(this.f28594saneness, this.f28592dern.saneness(), adRequest, ((beachfront) this.f28593marial).saneness());
    }

    @Override // astigmatic.attabal
    public void show(Activity activity) {
        T t = this.f28590attabal;
        if (t != 0) {
            ((InterstitialAd) t).show(activity);
        } else {
            this.f28591beachfront.handleError(com.unity3d.scar.adapter.common.saneness.attabal(this.f28592dern));
        }
    }
}
