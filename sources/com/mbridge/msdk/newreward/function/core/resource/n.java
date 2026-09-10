package com.mbridge.msdk.newreward.function.core.resource;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class n extends a<File> {
    private final y g;
    private File h;

    public n(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar) {
        super(bVar, aVar);
        this.g = new y(f(), e(), this, 100);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.o
    public int a() {
        return 1;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.o
    public boolean b() {
        return true;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.a, com.mbridge.msdk.newreward.function.core.resource.o
    public String c() {
        return (e() == null || e().a() == null) ? "" : e().a().getVideoUrlEncode();
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.o
    public boolean d() {
        if (e() == null || e().a() == null) {
            return true;
        }
        ArrayList<Integer> rsIgnoreCheckRule = e().a().getRsIgnoreCheckRule();
        if (rsIgnoreCheckRule == null) {
            return false;
        }
        return rsIgnoreCheckRule.contains(0);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.a
    public q g() {
        return this.g;
    }

    public File n() {
        return this.h;
    }

    public void a(File file) {
        this.h = file;
    }
}
