package com.smartdigimkt.o3;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class g extends a {
    public g(a.C0557a c0557a) {
        super(c0557a);
    }

    @Override // com.smartdigimkt.o3.a, com.smartdigimkt.o3.m
    public n a() {
        com.smartdigimkt.w6.f fVar = this.f37330c;
        String strT = fVar != null ? fVar.t() : "";
        if (TextUtils.isEmpty(strT)) {
            return n.a(false, "FastUrlClickAction execute fail with empty url");
        }
        b bVar = this.f;
        if (bVar != null) {
            bVar.clickStartUI();
            this.f.clickCallback();
        }
        if (!com.smartdigimkt.q3.d.b(this.f37329b, strT, this.f37330c, this.d)) {
            com.smartdigimkt.i7.d.a(this.d, this.f37330c, strT, "0", 3, 0);
            return n.a(false, "FastUrlClickAction execute fail");
        }
        k kVar = this.f37331e;
        if (kVar != null) {
            kVar.b();
        }
        b bVar2 = this.f;
        if (bVar2 != null) {
            bVar2.clickEndUI();
        }
        com.smartdigimkt.i7.d.a(this.d, this.f37330c, strT, "1", 3, 0);
        return n.a(true, "FastUrlClickAction execute success");
    }
}
