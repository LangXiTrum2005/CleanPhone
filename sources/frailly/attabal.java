package frailly;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: compiled from: AdRequestFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public shiite.attabal f26533attabal;

    public attabal(shiite.attabal attabalVar) {
        this.f26533attabal = attabalVar;
    }

    public AdRequest attabal() {
        return dern().build();
    }

    public AdRequest.Builder dern() {
        return new AdRequest.Builder().setRequestAgent(this.f26533attabal.saneness()).addNetworkExtrasBundle(AdMobAdapter.class, this.f26533attabal.attabal());
    }

    public AdRequest saneness(String str) {
        return str.isEmpty() ? attabal() : dern().setAdString(str).build();
    }
}
