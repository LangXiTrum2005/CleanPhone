package com.ironsource;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3465d implements V5 {
    private final Yc a;

    public C3465d(Yc folderRootUrl) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        this.a = folderRootUrl;
    }

    @Override // com.ironsource.V5
    public String value() {
        return this.a.a() + "/abTestMap.json";
    }
}
