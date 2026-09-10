package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import com.ironsource.Ua;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1gSDK extends AFe1fSDK<String> {
    private final String component2;
    private final String copy;
    private final UUID copydefault;
    private final Map<String, String> equals;
    private final LinkGenerator.ResponseListener hashCode;
    private final LinkGenerator toString;

    public AFe1gSDK(AFd1zSDK aFd1zSDK, UUID uuid, String str, Map<String, String> map, String str2, LinkGenerator.ResponseListener responseListener, LinkGenerator linkGenerator) {
        super(AFe1pSDK.ONELINK, new AFe1pSDK[]{AFe1pSDK.RC_CDN}, aFd1zSDK, uuid.toString());
        this.copydefault = uuid;
        this.component2 = str;
        this.equals = new HashMap(map);
        this.hashCode = responseListener;
        this.copy = str2;
        this.toString = linkGenerator;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return Ua.C;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final AppsFlyerRequestListener component2() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        ResponseNetwork responseNetwork;
        super.getCurrencyIso4217Code();
        LinkGenerator.ResponseListener responseListener = this.hashCode;
        if (responseListener != null) {
            if (this.getMonetizationNetwork == AFe1uSDK.SUCCESS && (responseNetwork = ((AFe1fSDK) this).areAllFieldsValid) != null) {
                responseListener.onResponse((String) responseNetwork.getBody());
                return;
            }
            Throwable thComponent1 = component1();
            if (!(thComponent1 instanceof ParsingException)) {
                responseListener.onResponse(this.toString.generateLink());
            } else if (((ParsingException) thComponent1).getRawResponse().isSuccessful()) {
                responseListener.onResponseError("Can't parse one link data");
            } else {
                responseListener.onResponse(this.toString.generateLink());
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final AFd1hSDK<String> AFAdRevenueData(String str) {
        return ((AFe1fSDK) this).component4.getMonetizationNetwork(this.component2, this.equals, this.copy, this.copydefault, str);
    }
}
