package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class w6 extends y6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f9955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinAdRewardListener f9956h;

    public w6(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.l lVar) {
        super("TaskValidateAppLovinReward", lVar);
        this.f9955g = bVar;
        this.f9956h = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.t6
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f9955g.getAdZone().e());
        String clCode = this.f9955g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.t6
    public String f() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.y6
    public boolean h() {
        return this.f9955g.G0();
    }

    @Override // com.applovin.impl.y6
    public void a(q4 q4Var) {
        this.f9955g.a(q4Var);
        String strB = q4Var.b();
        Map<String, String> mapA = q4Var.a();
        if (strB.equals("accepted")) {
            this.f9956h.userRewardVerified(this.f9955g, mapA);
            return;
        }
        if (strB.equals("quota_exceeded")) {
            this.f9956h.userOverQuota(this.f9955g, mapA);
        } else if (strB.equals("rejected")) {
            this.f9956h.userRewardRejected(this.f9955g, mapA);
        } else {
            this.f9956h.validationRequestFailed(this.f9955g, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.t6
    public void a(int i10) {
        String str;
        super.a(i10);
        if (i10 >= 400 && i10 < 500) {
            this.f9956h.userRewardRejected(this.f9955g, Collections.EMPTY_MAP);
            str = "rejected";
        } else {
            this.f9956h.validationRequestFailed(this.f9955g, i10);
            str = "network_timeout";
        }
        this.f9955g.a(q4.a(str));
    }
}
