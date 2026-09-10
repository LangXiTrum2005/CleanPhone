package com.unity3d.ironsourceads.interstitial;

import android.os.Bundle;
import com.ironsource.C0661xc;
import com.ironsource.Ed;
import com.ironsource.W9;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class InterstitialAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bundle f38473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Ed f38474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f38475e;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f38476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f38477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bundle f38478c;

        public Builder(String instanceId, String adm) {
            n.f(instanceId, "instanceId");
            n.f(adm, "adm");
            this.f38476a = instanceId;
            this.f38477b = adm;
        }

        public final InterstitialAdRequest build() {
            IronLog.API.info("instanceId: " + this.f38476a);
            return new InterstitialAdRequest(this.f38476a, this.f38477b, this.f38478c, null);
        }

        public final String getAdm() {
            return this.f38477b;
        }

        public final String getInstanceId() {
            return this.f38476a;
        }

        public final Builder withExtraParams(Bundle extraParams) {
            n.f(extraParams, "extraParams");
            this.f38478c = extraParams;
            return this;
        }
    }

    public /* synthetic */ InterstitialAdRequest(String str, String str2, Bundle bundle, g gVar) {
        this(str, str2, bundle);
    }

    public final String getAdId$mediationsdk_release() {
        return this.f38475e;
    }

    public final String getAdm() {
        return this.f38472b;
    }

    public final Bundle getExtraParams() {
        return this.f38473c;
    }

    public final String getInstanceId() {
        return this.f38471a;
    }

    public final Ed getProviderName$mediationsdk_release() {
        return this.f38474d;
    }

    private InterstitialAdRequest(String str, String str2, Bundle bundle) {
        this.f38471a = str;
        this.f38472b = str2;
        this.f38473c = bundle;
        this.f38474d = new C0661xc(str);
        String strB = W9.b();
        n.e(strB, "generateMultipleUniqueInstanceId()");
        this.f38475e = strB;
    }
}
