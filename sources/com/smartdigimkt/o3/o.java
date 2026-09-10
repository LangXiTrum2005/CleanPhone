package com.smartdigimkt.o3;

/* JADX INFO: loaded from: classes.dex */
public class o extends a {
    public o(a.C0557a c0557a) {
        super(c0557a);
    }

    @Override // com.smartdigimkt.o3.a, com.smartdigimkt.o3.m
    public n a() {
        b bVar = this.f;
        if (bVar != null) {
            bVar.clickStartUI();
            this.f.clickCallback();
        }
        if (!com.smartdigimkt.q3.d.a(this.f37330c, this.d)) {
            return n.a(false, "WXMiniClickAction execute fail");
        }
        k kVar = this.f37331e;
        if (kVar != null) {
            kVar.b();
        }
        b bVar2 = this.f;
        if (bVar2 != null) {
            bVar2.clickEndUI();
        }
        return n.a(true, "WXMiniClickAction execute success");
    }
}
