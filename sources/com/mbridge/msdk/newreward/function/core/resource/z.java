package com.mbridge.msdk.newreward.function.core.resource;

/* JADX INFO: loaded from: classes2.dex */
public class z extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.core.campaign.b f1687a;
    private final com.mbridge.msdk.newreward.function.core.campaign.a b;
    private final c c;

    public z(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, c cVar) {
        this.f1687a = bVar;
        this.b = aVar;
        this.c = cVar;
        cVar.a(true);
        cVar.b(false);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.p
    public void a(int i, x xVar) {
        if (xVar != null) {
            xVar.a(this.f1687a, this.b, this);
            xVar.b(this.f1687a, this.b, this);
        }
    }
}
