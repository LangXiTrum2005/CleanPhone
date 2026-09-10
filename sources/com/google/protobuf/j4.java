package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j4 implements z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtoSyntax f24877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f24879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s1[] f24880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MessageLite f24881e;

    public j4(ProtoSyntax protoSyntax, boolean z10, int[] iArr, s1[] s1VarArr, Object obj) {
        this.f24877a = protoSyntax;
        this.f24878b = z10;
        this.f24879c = iArr;
        this.f24880d = s1VarArr;
        this.f24881e = (MessageLite) Internal.checkNotNull(obj, "defaultInstance");
    }

    @Override // com.google.protobuf.z2
    public final boolean a() {
        return this.f24878b;
    }

    @Override // com.google.protobuf.z2
    public final MessageLite b() {
        return this.f24881e;
    }

    @Override // com.google.protobuf.z2
    public final ProtoSyntax getSyntax() {
        return this.f24877a;
    }
}
