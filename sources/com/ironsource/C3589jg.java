package com.ironsource;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3589jg implements V5 {
    private final Yc a;
    private final String b;

    public C3589jg(Yc folderRootUrl, String version) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        Intrinsics.checkNotNullParameter(version, "version");
        this.a = folderRootUrl;
        this.b = version;
    }

    public final String a() {
        return this.b;
    }

    @Override // com.ironsource.V5
    public String value() {
        return this.a.a() + "/versions/" + this.b + "/mobileController.html";
    }
}
