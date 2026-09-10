package com.mbridge.msdk.newreward.function.core.resource;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class i extends c {
    public i(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar) {
        super(bVar, aVar);
        a(true);
        b(false);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.o
    public int a() {
        return 3;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.a, com.mbridge.msdk.newreward.function.core.resource.o
    public String c() {
        if (e() == null) {
            return "";
        }
        String strE = f().e();
        return TextUtils.isEmpty(strE) ? "" : strE;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.a
    public q g() {
        return new z(f(), e(), this);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.c
    public boolean p() {
        return true;
    }
}
