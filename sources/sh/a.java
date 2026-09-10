package sh;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import hn.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f50246a;

    public final AdRequest a(String str) {
        return str.isEmpty() ? b().build() : b().setAdString(str).build();
    }

    public final AdRequest.Builder b() {
        AdRequest.Builder requestAgent = new AdRequest.Builder().setRequestAgent(this.f50246a.f42458b);
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_5");
        return requestAgent.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
    }
}
