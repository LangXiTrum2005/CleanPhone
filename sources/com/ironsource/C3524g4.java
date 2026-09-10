package com.ironsource;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3524g4 implements InterfaceC3755t7 {
    private final String a;
    private final String b;
    private final boolean c;
    private final Yc d;

    public C3524g4() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.ironsource.InterfaceC3755t7
    public String a() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC3755t7
    public boolean b() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC3755t7
    public Yc c() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC3755t7
    public String d() {
        return this.b;
    }

    public C3524g4(String controllerUrl, String cacheFolder, boolean z, Yc rootFolder) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        Intrinsics.checkNotNullParameter(cacheFolder, "cacheFolder");
        Intrinsics.checkNotNullParameter(rootFolder, "rootFolder");
        this.a = controllerUrl;
        this.b = cacheFolder;
        this.c = z;
        this.d = rootFolder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3524g4(String str, String str2, boolean z, Yc yc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? "" : str;
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new Yc(str) : yc);
    }
}
