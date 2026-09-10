package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0934f extends e2 {
    public C0934f(com.applovin.impl.sdk.k kVar) {
        super(kVar, d2.b.AD);
    }

    public void a(d2 d2Var, com.applovin.impl.sdk.ad.b bVar) {
        a(d2Var, bVar, new HashMap());
    }

    public void a(d2 d2Var, com.applovin.impl.sdk.ad.b bVar, Map map) {
        a(d2Var, bVar != null ? bVar.getAdZone() : null, bVar, null, map);
    }

    public void a(d2 d2Var, C0964u c0964u, AppLovinError appLovinError) {
        a(d2Var, c0964u, null, appLovinError, new HashMap());
    }

    private void a(d2 d2Var, C0964u c0964u, com.applovin.impl.sdk.ad.b bVar, AppLovinError appLovinError, Map map) {
        if (((Boolean) this.f10771a.a(x4.f12061J)).booleanValue() && this.f10771a.G0()) {
            return;
        }
        if (bVar != null) {
            map.putAll(f2.a((AppLovinAdImpl) bVar));
        } else if (c0964u != null) {
            CollectionUtils.putStringIfValid("ad_zone_id", c0964u.e(), map);
            MaxAdFormat maxAdFormatD = c0964u.d();
            if (maxAdFormatD != null) {
                CollectionUtils.putStringIfValid("ad_format", maxAdFormatD.getLabel(), map);
            }
        }
        AppLovinAdSize appLovinAdSizeA = a(c0964u, bVar);
        if (appLovinAdSizeA != null) {
            CollectionUtils.putStringIfValid("ad_size", appLovinAdSizeA.getLabel(), map);
        }
        if (appLovinError != null) {
            CollectionUtils.putStringIfValid("error_message", appLovinError.getMessage(), map);
            CollectionUtils.putStringIfValid("error_code", String.valueOf(appLovinError.getCode()), map);
        }
        d(d2Var, map);
    }

    private AppLovinAdSize a(C0964u c0964u, com.applovin.impl.sdk.ad.b bVar) {
        AppLovinAdSize appLovinAdSizeF = c0964u != null ? c0964u.f() : null;
        if (appLovinAdSizeF != null) {
            return appLovinAdSizeF;
        }
        if (bVar != null) {
            return bVar.getSize();
        }
        return null;
    }
}
