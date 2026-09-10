package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.g4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0349g4 implements InterfaceC0620v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f28735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0286cd f28736d;

    public C0349g4() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.ironsource.InterfaceC0620v7
    public String a() {
        return this.f28733a;
    }

    @Override // com.ironsource.InterfaceC0620v7
    public boolean b() {
        return this.f28735c;
    }

    @Override // com.ironsource.InterfaceC0620v7
    public C0286cd c() {
        return this.f28736d;
    }

    @Override // com.ironsource.InterfaceC0620v7
    public String d() {
        return this.f28734b;
    }

    public C0349g4(String controllerUrl, String cacheFolder, boolean z10, C0286cd rootFolder) {
        kotlin.jvm.internal.n.f(controllerUrl, "controllerUrl");
        kotlin.jvm.internal.n.f(cacheFolder, "cacheFolder");
        kotlin.jvm.internal.n.f(rootFolder, "rootFolder");
        this.f28733a = controllerUrl;
        this.f28734b = cacheFolder;
        this.f28735c = z10;
        this.f28736d = rootFolder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0349g4(String str, String str2, boolean z10, C0286cd c0286cd, int i10, kotlin.jvm.internal.g gVar) {
        str = (i10 & 1) != 0 ? "" : str;
        this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? new C0286cd(str) : c0286cd);
    }
}
