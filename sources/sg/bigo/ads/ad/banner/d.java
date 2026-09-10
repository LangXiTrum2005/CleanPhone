package sg.bigo.ads.ad.banner;

import android.util.Log;
import sg.bigo.ads.api.BannerAd;
import sg.bigo.ads.api.InnerBannerAd;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    public static BannerAd a(sg.bigo.ads.api.core.g gVar) {
        try {
            return new i(gVar);
        } catch (Exception e2) {
            sg.bigo.ads.core.d.b.a(3000, 10100, Log.getStackTraceString(e2));
            return null;
        }
    }

    public static InnerBannerAd b(sg.bigo.ads.api.core.g gVar) {
        if (gVar.f47032a.w() == 3) {
            return new e(gVar);
        }
        if (gVar.f47032a.w() == 2 || gVar.f47032a.w() == 1) {
            return new sg.bigo.ads.ad.c.d(gVar);
        }
        return null;
    }
}
