package com.unity3d.ironsourceads.rewarded;

import android.os.Bundle;
import com.ironsource.C0661xc;
import com.ironsource.Ed;
import com.ironsource.W9;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class RewardedAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bundle f38486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Ed f38487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f38488e;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f38489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f38490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bundle f38491c;

        public Builder(String instanceId, String adm) {
            n.f(instanceId, "instanceId");
            n.f(adm, "adm");
            this.f38489a = instanceId;
            this.f38490b = adm;
        }

        public final RewardedAdRequest build() {
            IronLog.API.info("instanceId: " + this.f38489a);
            return new RewardedAdRequest(this.f38489a, this.f38490b, this.f38491c, null);
        }

        public final String getAdm() {
            return this.f38490b;
        }

        public final String getInstanceId() {
            return this.f38489a;
        }

        public final Builder withExtraParams(Bundle extraParams) {
            n.f(extraParams, "extraParams");
            this.f38491c = extraParams;
            return this;
        }
    }

    public /* synthetic */ RewardedAdRequest(String str, String str2, Bundle bundle, g gVar) {
        this(str, str2, bundle);
    }

    public final String getAdId$mediationsdk_release() {
        return this.f38488e;
    }

    public final String getAdm() {
        return this.f38485b;
    }

    public final Bundle getExtraParams() {
        return this.f38486c;
    }

    public final String getInstanceId() {
        return this.f38484a;
    }

    public final Ed getProviderName$mediationsdk_release() {
        return this.f38487d;
    }

    private RewardedAdRequest(String str, String str2, Bundle bundle) {
        this.f38484a = str;
        this.f38485b = str2;
        this.f38486c = bundle;
        this.f38487d = new C0661xc(str);
        String strB = W9.b();
        n.e(strB, "generateMultipleUniqueInstanceId()");
        this.f38488e = strB;
    }
}
