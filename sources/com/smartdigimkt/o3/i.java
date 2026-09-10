package com.smartdigimkt.o3;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class i extends a {
    public i(a.C0557a c0557a) {
        super(c0557a);
    }

    @Override // com.smartdigimkt.o3.a, com.smartdigimkt.o3.m
    public n a() {
        n nVarA;
        com.smartdigimkt.w6.f fVar = this.f37330c;
        String strG = fVar != null ? fVar.G() : "";
        if (TextUtils.isEmpty(strG)) {
            return n.a(false, "MarketUrlClickAction execute fail with empty url");
        }
        com.smartdigimkt.v3.l lVarA = this.f37331e.a();
        if (lVarA == null) {
            return n.a(false, "DeeplinkClickAction empty mOfferClickReportNotify");
        }
        b bVar = this.f;
        if (bVar != null) {
            bVar.clickStartUI();
            this.f.clickCallback();
        }
        if (!TextUtils.isEmpty(this.f37330c.X()) && (nVarA = a(lVarA)) != null) {
            return nVarA;
        }
        com.smartdigimkt.m3.e eVarA = com.smartdigimkt.q3.d.a(this.f37329b, strG, this.f37330c, this.d);
        if (eVarA.a() != 0) {
            com.smartdigimkt.i7.d.a(this.d, this.f37330c, strG, "0", 2, 0, eVarA.b());
            return n.a(false, "MarketUrlClickAction execute fail");
        }
        com.smartdigimkt.m3.f.a(this.f37329b, this.f37330c);
        k kVar = this.f37331e;
        if (kVar != null) {
            kVar.b();
        }
        b bVar2 = this.f;
        if (bVar2 != null) {
            bVar2.clickEndUI();
        }
        com.smartdigimkt.i7.d.a(this.d, this.f37330c, strG, "1", 2, 0, eVarA.b());
        return n.a(true, "MarketUrlClickAction execute success");
    }
}
