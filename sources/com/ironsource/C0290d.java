package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0290d implements Y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0286cd f28407a;

    public C0290d(C0286cd folderRootUrl) {
        kotlin.jvm.internal.n.f(folderRootUrl, "folderRootUrl");
        this.f28407a = folderRootUrl;
    }

    @Override // com.ironsource.Y5
    public String value() {
        return wi.d.h(this.f28407a.a(), "/abTestMap.json");
    }
}
