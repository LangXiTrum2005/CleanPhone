package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: RawMessageInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public final class permissivist implements grimness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final privatdozent f22258attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Object[] f22259dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f22260saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f22261wireman;

    public permissivist(privatdozent privatdozentVar, String str, Object[] objArr) {
        this.f22258attabal = privatdozentVar;
        this.f22260saneness = str;
        this.f22259dern = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f22261wireman = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f22261wireman = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public Object[] attabal() {
        return this.f22259dern;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.grimness
    public privatdozent getDefaultInstance() {
        return this.f22258attabal;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.grimness
    public ProtoSyntax getSyntax() {
        int i = this.f22261wireman;
        if ((i & 1) != 0) {
            return ProtoSyntax.PROTO2;
        }
        return (i & 4) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.grimness
    public boolean isMessageSetWireFormat() {
        return (this.f22261wireman & 2) == 2;
    }

    public String saneness() {
        return this.f22260saneness;
    }
}
