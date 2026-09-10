package com.mbridge.msdk.newreward.function.core.resource;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends d<String> {
    private String g;
    protected Boolean h;

    public c(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar) {
        super(bVar, aVar);
        this.h = null;
    }

    public void a(String str) {
        this.g = str;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.o
    public boolean d() {
        Boolean bool = this.h;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zP = p();
        this.h = Boolean.valueOf(zP);
        return zP;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.d
    public boolean n() {
        return false;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public String h() {
        return this.g;
    }

    public abstract boolean p();
}
