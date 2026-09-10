package com.mbridge.msdk.newreward.function.core.resource;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends d<File> {
    private File g;

    public b(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar) {
        super(bVar, aVar);
    }

    public void a(File file) {
        this.g = file;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.o
    public boolean d() {
        return true;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.d
    public boolean n() {
        return true;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public File h() {
        return this.g;
    }
}
