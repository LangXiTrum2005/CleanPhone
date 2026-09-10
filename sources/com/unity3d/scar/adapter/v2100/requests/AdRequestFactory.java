package com.unity3d.scar.adapter.v2100.requests;

import androidx.media3.extractor.text.ttml.a;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.unity3d.scar.adapter.common.requests.RequestExtras;

/* JADX INFO: loaded from: classes6.dex */
public class AdRequestFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RequestExtras f42806a;

    public final AdRequest a(String str) {
        return str.isEmpty() ? b().build() : b().setAdString(str).build();
    }

    public final AdRequest.Builder b() {
        return new AdRequest.Builder().setRequestAgent(this.f42806a.f42789a).addNetworkExtrasBundle(AdMobAdapter.class, a.d("query_info_type", "requester_type_5"));
    }
}
