package com.applovin.impl.mediation;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.impl.a3;
import com.applovin.impl.f5;
import com.applovin.impl.m3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f8436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f8437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f8438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f8439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f8440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f8441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f8443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f8444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f8445k;
    private MaxAdFormat l;

    private MaxAdapterParametersImpl() {
    }

    public static MaxAdapterParametersImpl a(a3 a3Var) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a((m3) a3Var);
        maxAdapterParametersImplA.f8443i = a3Var.U();
        maxAdapterParametersImplA.f8444j = a3Var.E();
        maxAdapterParametersImplA.f8445k = a3Var.D();
        return maxAdapterParametersImplA;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f8435a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.f8445k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f8444j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public String getConsentString() {
        return this.f8441g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.f8438d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.f8436b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f8437c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f8443i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean hasUserConsent() {
        return this.f8439e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean isAgeRestrictedUser() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean isDoNotSell() {
        return this.f8440f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f8442h;
    }

    public static MaxAdapterParametersImpl a(f5 f5Var, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a(f5Var);
        maxAdapterParametersImplA.f8435a = str;
        maxAdapterParametersImplA.l = maxAdFormat;
        return maxAdapterParametersImplA;
    }

    public static MaxAdapterParametersImpl a(m3 m3Var) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f8435a = m3Var.getAdUnitId();
        maxAdapterParametersImpl.f8439e = m3Var.n();
        maxAdapterParametersImpl.f8440f = m3Var.o();
        maxAdapterParametersImpl.f8441g = m3Var.d();
        maxAdapterParametersImpl.f8436b = m3Var.i();
        maxAdapterParametersImpl.f8437c = m3Var.l();
        maxAdapterParametersImpl.f8438d = m3Var.f();
        maxAdapterParametersImpl.f8442h = m3Var.p();
        return maxAdapterParametersImpl;
    }
}
