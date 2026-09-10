package sg.bigo.ads.api;

import sg.bigo.ads.ad.interstitial.k;
import sg.bigo.ads.ad.interstitial.o;
import sg.bigo.ads.api.core.g;

/* JADX INFO: loaded from: classes7.dex */
public class IBAdCreator implements k.a<o> {
    @Override // sg.bigo.ads.ad.interstitial.k.a
    public o getAdInstance(g gVar) {
        return gVar.f47032a.x() == 20 ? new sg.bigo.ads.ad.d.c(gVar) : new o(gVar);
    }
}
