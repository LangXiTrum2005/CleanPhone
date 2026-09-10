package com.mbridge.msdk.newreward.function.core.resource;

/* JADX INFO: loaded from: classes2.dex */
public class h extends c {
    public h(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar) {
        super(bVar, aVar);
        a(true);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.o
    public int a() {
        return 8;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.a, com.mbridge.msdk.newreward.function.core.resource.o
    public String c() {
        return (e() == null || e().a() == null) ? "" : e().a().getEndScreenUrl();
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.a
    public q g() {
        return new v(f(), e(), this);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.c
    public boolean p() {
        return true;
    }
}
