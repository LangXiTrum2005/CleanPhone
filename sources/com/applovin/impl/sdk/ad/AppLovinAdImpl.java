package com.applovin.impl.sdk.ad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.j5;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.u;
import com.applovin.impl.u1;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd, u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u f9342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f9344c;

    public AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, l lVar) {
        super(jSONObject, jSONObject2, lVar);
    }

    private long b() {
        return getLongFromAdObject("ad_expiration_ms", ((Long) this.sdk.a(z4.f10149g1)).longValue());
    }

    public boolean canExpire() {
        return getSize() == AppLovinAdSize.INTERSTITIAL && b() > 0;
    }

    public boolean equals(Object obj) {
        AppLovinAd appLovinAdC;
        if ((obj instanceof c) && (appLovinAdC = ((c) obj).c()) != null) {
            obj = appLovinAdC;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    public u getAdZone() {
        u uVar = this.f9342a;
        if (uVar != null) {
            if (uVar.f() != null && this.f9342a.g() != null) {
                return this.f9342a;
            }
            if (getSize() == null && getType() == null) {
                return this.f9342a;
            }
        }
        u uVarA = u.a(getSize(), getType(), getStringFromFullResponse("zone_id", null), getBooleanFromFullResponse("is_bidding", false), getBooleanFromFullResponse("is_direct_sold", false));
        this.f9342a = uVarA;
        return uVarA;
    }

    public c getDummyAd() {
        return this.f9344c;
    }

    @Nullable
    public String getMediationServeId() {
        return getStringFromFullResponse("event_id", null);
    }

    public abstract JSONObject getOriginalFullResponse();

    public String getRawFullResponse() {
        String string;
        j5 j5Var = this.synchronizedFullResponse;
        if (j5Var != null) {
            return j5Var.toString();
        }
        synchronized (this.fullResponseLock) {
            string = this.fullResponse.toString();
        }
        return string;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", null));
    }

    @Override // com.applovin.impl.u1
    public long getTimeToLiveMillis() {
        if (!canExpire()) {
            return Long.MAX_VALUE;
        }
        return b() - (System.currentTimeMillis() - getCreatedAtMillis());
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (getAdZone().i()) {
            return null;
        }
        return getStringFromFullResponse("zone_id", null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", Boolean.FALSE);
    }

    public boolean hasVideoUrl() {
        this.sdk.Q();
        if (!p.a()) {
            return false;
        }
        this.sdk.Q().b("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
        return false;
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    public boolean isExpired() {
        return this.f9343b;
    }

    public boolean isVideoAd() {
        return this.adObject.has("is_video_ad") ? getBooleanFromAdObject("is_video_ad", Boolean.FALSE) : hasVideoUrl();
    }

    public void setDummyAd(c cVar) {
        this.f9344c = cVar;
    }

    @Override // com.applovin.impl.u1
    public void setExpired() {
        this.f9343b = true;
    }

    public void setHasShown(boolean z10) {
        try {
            j5 j5Var = this.synchronizedAdObject;
            if (j5Var != null) {
                j5Var.a("shown", (Object) Boolean.valueOf(z10));
                return;
            }
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z10);
            }
        } catch (Throwable unused) {
        }
    }

    @NonNull
    public String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", zoneId=\"" + getZoneId() + "\"}";
    }
}
