package sg.bigo.ads.api;

import sg.bigo.ads.ad.d.e;
import sg.bigo.ads.ad.interstitial.k;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.api.core.g;

/* JADX INFO: loaded from: classes7.dex */
public class INAdCreator implements k.a<t> {
    @Override // sg.bigo.ads.ad.interstitial.k.a
    public t getAdInstance(g gVar) {
        return gVar.f47032a.x() == 20 ? new e(gVar) : new t(gVar);
    }
}
