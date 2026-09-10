package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r3 implements z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageLite f24932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f24934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24935d;

    public r3(MessageLite messageLite, String str, Object[] objArr) {
        this.f24932a = messageLite;
        this.f24933b = str;
        this.f24934c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f24935d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f24935d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.protobuf.z2
    public final boolean a() {
        return (this.f24935d & 2) == 2;
    }

    @Override // com.google.protobuf.z2
    public final MessageLite b() {
        return this.f24932a;
    }

    @Override // com.google.protobuf.z2
    public final ProtoSyntax getSyntax() {
        int i10 = this.f24935d;
        if ((i10 & 1) != 0) {
            return ProtoSyntax.PROTO2;
        }
        return (i10 & 4) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
    }
}
