package com.mbridge.msdk.newreward.function.core.resource;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class m extends c {
    private final String i;

    public m(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, String str) {
        super(bVar, aVar);
        this.i = str;
        a(true);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.o
    public int a() {
        return 7;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.a, com.mbridge.msdk.newreward.function.core.resource.o
    public String c() {
        return TextUtils.isEmpty(this.i) ? "" : this.i;
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
