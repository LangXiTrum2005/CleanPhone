package com.mbridge.msdk.newreward.function.core.resource;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d<Resource> extends a<Resource> {
    public d(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar) {
        super(bVar, aVar);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.o
    public boolean b() {
        return true;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.a
    public boolean j() {
        return n() || super.j();
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.a
    public boolean l() {
        return n() || super.l();
    }

    public abstract boolean n();
}
