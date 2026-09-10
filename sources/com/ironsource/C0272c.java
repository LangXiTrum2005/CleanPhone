package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0272c implements InterfaceC0332f5<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y5 f28318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0692z7 f28320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jk.b f28321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C0693z8 f28322e;

    public C0272c(Y5 fileUrl, String destinationPath, InterfaceC0692z7 downloadManager, jk.b onFinish) {
        kotlin.jvm.internal.n.f(fileUrl, "fileUrl");
        kotlin.jvm.internal.n.f(destinationPath, "destinationPath");
        kotlin.jvm.internal.n.f(downloadManager, "downloadManager");
        kotlin.jvm.internal.n.f(onFinish, "onFinish");
        this.f28318a = fileUrl;
        this.f28319b = destinationPath;
        this.f28320c = downloadManager;
        this.f28321d = onFinish;
        this.f28322e = new C0693z8(c(), X3.f27650i);
    }

    @Override // com.ironsource.Oc
    public void a(C0693z8 file) {
        kotlin.jvm.internal.n.f(file, "file");
        if (kotlin.jvm.internal.n.a(file.getName(), X3.f27650i)) {
            try {
                i().invoke(new wj.h(c(file)));
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                i().invoke(new wj.h(t9.e.c(e10)));
            }
        }
    }

    @Override // com.ironsource.InterfaceC0332f5
    public void b(C0693z8 c0693z8) {
        kotlin.jvm.internal.n.f(c0693z8, "<set-?>");
        this.f28322e = c0693z8;
    }

    @Override // com.ironsource.InterfaceC0332f5
    public String c() {
        return this.f28319b;
    }

    @Override // com.ironsource.InterfaceC0332f5
    public Y5 d() {
        return this.f28318a;
    }

    @Override // com.ironsource.InterfaceC0332f5
    public jk.b i() {
        return this.f28321d;
    }

    @Override // com.ironsource.InterfaceC0332f5
    public C0693z8 k() {
        return this.f28322e;
    }

    @Override // com.ironsource.InterfaceC0332f5
    public InterfaceC0692z7 l() {
        return this.f28320c;
    }

    private final JSONObject c(C0693z8 c0693z8) {
        return new JSONObject(IronSourceStorageUtils.readFile(c0693z8));
    }

    @Override // com.ironsource.Oc
    public void a(C0693z8 c0693z8, C0532q8 error) {
        kotlin.jvm.internal.n.f(error, "error");
        i().invoke(new wj.h(t9.e.c(new Exception(defpackage.e.n("Unable to download abTestMap.json: ", error.b())))));
    }
}
