package kaleidoscopic;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* JADX INFO: compiled from: ScarInterstitialAd.java */
/* JADX INFO: loaded from: classes4.dex */
public class marial extends attabal<InterstitialAd> implements astigmatic.attabal {
    public marial(Context context, frailly.attabal attabalVar, astigmatic.dern dernVar, com.unity3d.scar.adapter.common.dern dernVar2, com.unity3d.scar.adapter.common.beachfront beachfrontVar) {
        super(context, dernVar, attabalVar, dernVar2);
        this.f29057marial = new beachfront(beachfrontVar, this);
    }

    @Override // kaleidoscopic.attabal
    public void saneness(AdRequest adRequest, astigmatic.saneness sanenessVar) {
        InterstitialAd.load(this.f29058saneness, this.f29056dern.saneness(), adRequest, ((beachfront) this.f29057marial).saneness());
    }

    @Override // astigmatic.attabal
    public void show(Activity activity) {
        T t = this.f29054attabal;
        if (t != 0) {
            ((InterstitialAd) t).show(activity);
        } else {
            this.f29055beachfront.handleError(com.unity3d.scar.adapter.common.saneness.attabal(this.f29056dern));
        }
    }
}
