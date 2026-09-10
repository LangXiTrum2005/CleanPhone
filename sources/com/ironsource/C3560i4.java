package com.ironsource;

import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3560i4 implements InterfaceC3489e5<C3824x8> {
    private final V5 a;
    private final String b;
    private final InterfaceC3823x7 c;
    private final Function1<Result<? extends C3824x8>, Unit> d;
    private C3824x8 e;

    /* JADX WARN: Multi-variable type inference failed */
    public C3560i4(V5 fileUrl, String destinationPath, InterfaceC3823x7 downloadManager, Function1<? super Result<? extends C3824x8>, Unit> onFinish) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.a = fileUrl;
        this.b = destinationPath;
        this.c = downloadManager;
        this.d = onFinish;
        this.e = new C3824x8(c());
    }

    @Override // com.ironsource.Jc
    public void a(C3824x8 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        i().invoke(Result.m3350boximpl(Result.m3351constructorimpl(file)));
    }

    @Override // com.ironsource.InterfaceC3489e5
    public void b(C3824x8 c3824x8) {
        Intrinsics.checkNotNullParameter(c3824x8, "<set-?>");
        this.e = c3824x8;
    }

    @Override // com.ironsource.InterfaceC3489e5
    public String c() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC3489e5
    public V5 d() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC3489e5
    public Function1<Result<? extends C3824x8>, Unit> i() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC3489e5
    public C3824x8 k() {
        return this.e;
    }

    @Override // com.ironsource.InterfaceC3489e5
    public InterfaceC3823x7 l() {
        return this.c;
    }

    @Override // com.ironsource.Jc
    public void a(C3824x8 c3824x8, C3671o8 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Function1<Result<? extends C3824x8>, Unit> function1I = i();
        Result.Companion companion = Result.INSTANCE;
        function1I.invoke(Result.m3350boximpl(Result.m3351constructorimpl(p002kotlin.dern.attabal(new Exception("Unable to download mobileController.html: " + error.b())))));
    }
}
