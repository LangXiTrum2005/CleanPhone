package com.smartdigimkt.u2;

/* JADX INFO: loaded from: classes6.dex */
public class i extends f {
    protected com.smartdigimkt.t2.a W;

    public i(com.smartdigimkt.t2.a aVar) {
        this.W = aVar;
    }

    @Override // com.smartdigimkt.u2.f, com.smartdigimkt.t2.a
    public void a(int i2, Object obj) {
        super.a(i2, obj);
        com.smartdigimkt.t2.a aVar = this.W;
        if (aVar != null) {
            aVar.a(i2, obj);
        }
    }
}
