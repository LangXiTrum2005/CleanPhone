package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class f extends g2 {
    public f(com.applovin.impl.sdk.l lVar) {
        super(lVar, f2.b.AD);
    }

    public void a(f2 f2Var, com.applovin.impl.sdk.ad.b bVar) {
        a(f2Var, bVar, new HashMap());
    }

    public void a(f2 f2Var, com.applovin.impl.sdk.ad.b bVar, Map map) {
        a(f2Var, bVar != null ? bVar.getAdZone() : null, bVar, null, map);
    }

    public void a(f2 f2Var, u uVar, AppLovinError appLovinError) {
        a(f2Var, uVar, null, appLovinError, new HashMap());
    }

    private void a(f2 f2Var, u uVar, com.applovin.impl.sdk.ad.b bVar, AppLovinError appLovinError, Map map) {
        if (((Boolean) this.f7970a.a(z4.J)).booleanValue() && this.f7970a.I0()) {
            return;
        }
        if (bVar != null) {
            map.putAll(h2.a((AppLovinAdImpl) bVar));
        } else if (uVar != null) {
            CollectionUtils.putStringIfValid("ad_zone_id", uVar.e(), map);
            MaxAdFormat maxAdFormatD = uVar.d();
            if (maxAdFormatD != null) {
                CollectionUtils.putStringIfValid("ad_format", maxAdFormatD.getLabel(), map);
            }
        }
        AppLovinAdSize appLovinAdSizeA = a(uVar, bVar);
        if (appLovinAdSizeA != null) {
            CollectionUtils.putStringIfValid("ad_size", appLovinAdSizeA.getLabel(), map);
        }
        if (appLovinError != null) {
            CollectionUtils.putStringIfValid("error_message", appLovinError.getMessage(), map);
            CollectionUtils.putStringIfValid("error_code", String.valueOf(appLovinError.getCode()), map);
        }
        d(f2Var, map);
    }

    private AppLovinAdSize a(u uVar, com.applovin.impl.sdk.ad.b bVar) {
        AppLovinAdSize appLovinAdSizeF = uVar != null ? uVar.f() : null;
        if (appLovinAdSizeF != null) {
            return appLovinAdSizeF;
        }
        if (bVar != null) {
            return bVar.getSize();
        }
        return null;
    }
}
