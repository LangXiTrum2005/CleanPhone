package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.C0661xc;
import com.ironsource.Ed;
import com.ironsource.W9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.AdSize;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class BannerAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f38439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f38441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AdSize f38442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bundle f38443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Ed f38444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f38445g;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f38446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f38447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f38448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AdSize f38449d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Bundle f38450e;

        public Builder(Context context, String instanceId, String adm, AdSize size) {
            n.f(context, "context");
            n.f(instanceId, "instanceId");
            n.f(adm, "adm");
            n.f(size, "size");
            this.f38446a = context;
            this.f38447b = instanceId;
            this.f38448c = adm;
            this.f38449d = size;
        }

        public final BannerAdRequest build() {
            IronLog.API.info("instanceId: " + this.f38447b + ", size: " + this.f38449d.getSizeDescription());
            return new BannerAdRequest(this.f38446a, this.f38447b, this.f38448c, this.f38449d, this.f38450e, null);
        }

        public final String getAdm() {
            return this.f38448c;
        }

        public final Context getContext() {
            return this.f38446a;
        }

        public final String getInstanceId() {
            return this.f38447b;
        }

        public final AdSize getSize() {
            return this.f38449d;
        }

        public final Builder withExtraParams(Bundle extraParams) {
            n.f(extraParams, "extraParams");
            this.f38450e = extraParams;
            return this;
        }
    }

    public /* synthetic */ BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle, g gVar) {
        this(context, str, str2, adSize, bundle);
    }

    public final String getAdId$mediationsdk_release() {
        return this.f38445g;
    }

    public final String getAdm() {
        return this.f38441c;
    }

    public final Context getContext() {
        return this.f38439a;
    }

    public final Bundle getExtraParams() {
        return this.f38443e;
    }

    public final String getInstanceId() {
        return this.f38440b;
    }

    public final Ed getProviderName$mediationsdk_release() {
        return this.f38444f;
    }

    public final AdSize getSize() {
        return this.f38442d;
    }

    private BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle) {
        this.f38439a = context;
        this.f38440b = str;
        this.f38441c = str2;
        this.f38442d = adSize;
        this.f38443e = bundle;
        this.f38444f = new C0661xc(str);
        String strB = W9.b();
        n.e(strB, "generateMultipleUniqueInstanceId()");
        this.f38445g = strB;
    }
}
