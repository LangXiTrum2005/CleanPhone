package com.thinkup.core.common.inner.mixad.oo;

import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.on.oom;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends oom implements Serializable {
    public m(com.thinkup.core.common.mn.on.o oVar, n0 n0Var, int i2) {
        this.mo = n0Var.om0();
        this.o = n0Var.oomn();
        this.oo = n0Var.mon();
        this.om = n0Var.oon0();
        this.mm = n0Var.n0n();
        this.mn = n0Var.oom0();
        this.f42254n = n0Var.oomo();
        this.o0 = n0Var.no0();
        this.m = i2;
        this.nm = -1;
        this.n0 = n0Var.nn();
        n nVar = new n(oVar);
        this.oo0 = nVar;
        nVar.o0m(i2);
    }

    public final String toString() {
        return "ThirdPartyAdRequestInfo{bidId='" + this.mo + "', placementId='" + this.o + "', adsourceId='" + this.oo + "', requestId='" + this.om + "', networkFirmId=" + this.mm + ", networkName='" + this.mn + "', trafficGroupId=" + this.f42254n + ", groupId=" + this.o0 + ", format=" + this.m + ", tpBidId='" + this.n0 + "', requestUrl='" + this.o0o + "', bidResultOutDateTime=" + this.o00 + ", baseAdSetting=" + this.oo0 + AbstractJsonLexerKt.END_OBJ;
    }
}
