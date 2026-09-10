package com.mbridge.msdk.newreward.function.core.resource;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class e extends b {
    private final s h;

    public e(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar) {
        super(bVar, aVar);
        this.h = new s(f(), e(), this);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.o
    public int a() {
        return 3;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.a, com.mbridge.msdk.newreward.function.core.resource.o
    public String c() {
        return (f() == null || TextUtils.isEmpty(f().e())) ? "" : f().e();
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.a
    public q g() {
        return this.h;
    }
}
