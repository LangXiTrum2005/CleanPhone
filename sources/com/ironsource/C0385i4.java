package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.i4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0385i4 implements InterfaceC0332f5<C0693z8> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y5 f28884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0692z7 f28886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jk.b f28887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C0693z8 f28888e;

    public C0385i4(Y5 fileUrl, String destinationPath, InterfaceC0692z7 downloadManager, jk.b onFinish) {
        kotlin.jvm.internal.n.f(fileUrl, "fileUrl");
        kotlin.jvm.internal.n.f(destinationPath, "destinationPath");
        kotlin.jvm.internal.n.f(downloadManager, "downloadManager");
        kotlin.jvm.internal.n.f(onFinish, "onFinish");
        this.f28884a = fileUrl;
        this.f28885b = destinationPath;
        this.f28886c = downloadManager;
        this.f28887d = onFinish;
        this.f28888e = new C0693z8(c());
    }

    @Override // com.ironsource.Oc
    public void a(C0693z8 file) {
        kotlin.jvm.internal.n.f(file, "file");
        i().invoke(new wj.h(file));
    }

    @Override // com.ironsource.InterfaceC0332f5
    public void b(C0693z8 c0693z8) {
        kotlin.jvm.internal.n.f(c0693z8, "<set-?>");
        this.f28888e = c0693z8;
    }

    @Override // com.ironsource.InterfaceC0332f5
    public String c() {
        return this.f28885b;
    }

    @Override // com.ironsource.InterfaceC0332f5
    public Y5 d() {
        return this.f28884a;
    }

    @Override // com.ironsource.InterfaceC0332f5
    public jk.b i() {
        return this.f28887d;
    }

    @Override // com.ironsource.InterfaceC0332f5
    public C0693z8 k() {
        return this.f28888e;
    }

    @Override // com.ironsource.InterfaceC0332f5
    public InterfaceC0692z7 l() {
        return this.f28886c;
    }

    @Override // com.ironsource.Oc
    public void a(C0693z8 c0693z8, C0532q8 error) {
        kotlin.jvm.internal.n.f(error, "error");
        i().invoke(new wj.h(t9.e.c(new Exception(defpackage.e.n("Unable to download mobileController.html: ", error.b())))));
    }
}
