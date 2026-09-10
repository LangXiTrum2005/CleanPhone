package sg.bigo.ads.ad.b.a;

import android.os.SystemClock;
import android.webkit.URLUtil;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends sg.bigo.ads.ad.b.c {
    public f(sg.bigo.ads.api.core.g gVar) {
        super(gVar);
    }

    @Override // sg.bigo.ads.ad.b.c
    public final void a(sg.bigo.ads.api.b.d.a<NativeAd> aVar, int i2) {
        if (this.f45586e || this.f) {
            return;
        }
        String strA = this.f45584b.f47032a.N().a();
        if (!URLUtil.isNetworkUrl(strA)) {
            strA = null;
        }
        if (strA != null) {
            aVar.a(this);
        } else {
            aVar.a(this, 1005, IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, "Illegal Land Url");
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sg.bigo.ads.api.core.c] */
    @Override // sg.bigo.ads.ad.b.c, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        if (this.q) {
            return;
        }
        this.q = true;
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) f(), SystemClock.elapsedRealtime() - this.k);
    }
}
