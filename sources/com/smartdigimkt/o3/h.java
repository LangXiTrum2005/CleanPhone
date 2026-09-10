package com.smartdigimkt.o3;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class h extends a {
    public h(a.C0557a c0557a) {
        super(c0557a);
    }

    @Override // com.smartdigimkt.o3.a, com.smartdigimkt.o3.m
    public n a() {
        k kVar = this.f37331e;
        if (kVar == null) {
            return n.a(false, "JumpUrlClickAction empty mOfferClickReportNotify");
        }
        com.smartdigimkt.v3.l lVarA = kVar.a();
        if (lVarA == null) {
            return n.a(false, "JumpUrlClickAction empty mOfferClickReportNotify");
        }
        lVarA.k = new com.smartdigimkt.v3.b();
        com.smartdigimkt.v3.g gVarB = b();
        lVarA.k.f39077a = gVarB != null ? gVarB.f39093c : "";
        if (!TextUtils.isEmpty(this.f37330c.A())) {
            String strA = this.f37330c.A();
            String str = this.d.f;
            String strReplaceAll = strA.replaceAll("\\{req_id\\}", str != null ? str : "");
            if (com.smartdigimkt.q3.d.b(this.f37329b, strReplaceAll, this.f37330c, this.d)) {
                com.smartdigimkt.v3.a aVar = lVarA.f39137i;
                if (aVar != null) {
                    aVar.f39066i = true;
                }
                k kVar2 = this.f37331e;
                if (kVar2 != null) {
                    kVar2.b();
                }
                com.smartdigimkt.i7.d.a(this.d, this.f37330c, strReplaceAll, "1", 1, 0);
                b bVar = this.f;
                if (bVar != null) {
                    bVar.clickStartUI();
                    this.f.clickCallback();
                    this.f.deeplinkCallback(true);
                    this.f.clickEndUI();
                }
                return n.a(true, "JumpUrlClickAction execute success");
            }
            com.smartdigimkt.i7.d.a(this.d, this.f37330c, strReplaceAll, "0", 1, 0);
        }
        return n.a(false, "JumpUrlClickAction execute fail");
    }
}
