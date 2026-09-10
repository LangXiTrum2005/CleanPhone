package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Cg implements Y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0286cd f25908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25909b;

    public Cg(C0286cd folderRootUrl, String version) {
        kotlin.jvm.internal.n.f(folderRootUrl, "folderRootUrl");
        kotlin.jvm.internal.n.f(version, "version");
        this.f25908a = folderRootUrl;
        this.f25909b = version;
    }

    public final String a() {
        return this.f25909b;
    }

    @Override // com.ironsource.Y5
    public String value() {
        return q4.a.i(this.f25908a.a(), "/versions/", this.f25909b, "/mobileController.html");
    }
}
