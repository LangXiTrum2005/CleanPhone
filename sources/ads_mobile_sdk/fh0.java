package ads_mobile_sdk;

import android.net.Uri;
import com.ironsource.X3;
import okhttp3.adultoid;
import okhttp3.cuirassed;
import okhttp3.preprohormone;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;
import saneness.grout;

/* JADX INFO: loaded from: classes.dex */
public final class fh0 implements adultoid {
    public final eh0 a;
    public final jk0 b;

    public fh0(eh0 firebaseAnalyticsIds, jk0 flags) {
        Intrinsics.checkNotNullParameter(firebaseAnalyticsIds, "firebaseAnalyticsIds");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = firebaseAnalyticsIds;
        this.b = flags;
    }

    @Override // okhttp3.adultoid
    public final cuirassed intercept(adultoid.attabal chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        String url = chain.request().getUrl().getUrl();
        jk0 jk0Var = this.b;
        grout.attabal(jk0Var, "gads_firebase_analytics_url_macro", X3.i.W, "%5Bgw_fbsaeid%5D", "defaultValue");
        Uri.Builder builderAppendQueryParameter = Uri.parse(dovishness.polder(url, (String) jk0Var.a("gads_firebase_analytics_url_macro", "%5Bgw_fbsaeid%5D", zk.o), this.a.c, false, 4, null)).buildUpon().appendQueryParameter("gmp_app_id", this.a.a).appendQueryParameter("fbs_aiid", this.a.b);
        if (builderAppendQueryParameter.build().getQueryParameter("fbs_aeid") == null) {
            builderAppendQueryParameter.appendQueryParameter("fbs_aeid", this.a.c);
        }
        Uri uriBuild = builderAppendQueryParameter.build();
        preprohormone.attabal attabalVar = new preprohormone.attabal();
        String string = uriBuild.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return chain.attabal(attabalVar.graveside(string).saneness());
    }
}
