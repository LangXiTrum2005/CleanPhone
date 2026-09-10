package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f24893a;

    public l0(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.checkNotNull(codedOutputStream, "output");
        this.f24893a = codedOutputStream2;
        codedOutputStream2.wrapper = this;
    }

    public final void a(int i10, ByteString byteString) {
        this.f24893a.writeBytes(i10, byteString);
    }

    public final void b(int i10, int i11) throws IOException {
        this.f24893a.writeFixed32(i10, i11);
    }

    public final void c(int i10, long j10) throws IOException {
        this.f24893a.writeFixed64(i10, j10);
    }

    public final void d(int i10, Object obj, x3 x3Var) throws IOException {
        this.f24893a.writeGroup(i10, (MessageLite) obj, x3Var);
    }

    public final void e(int i10, int i11) throws IOException {
        this.f24893a.writeInt32(i10, i11);
    }

    public final void f(int i10, long j10) throws IOException {
        this.f24893a.writeInt64(i10, j10);
    }

    public final void g(int i10, Object obj, x3 x3Var) throws IOException {
        this.f24893a.writeMessage(i10, (MessageLite) obj, x3Var);
    }

    public final void h(int i10, Object obj) throws IOException {
        boolean z10 = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.f24893a;
        if (z10) {
            codedOutputStream.writeRawMessageSetExtension(i10, (ByteString) obj);
        } else {
            codedOutputStream.writeMessageSetExtension(i10, (MessageLite) obj);
        }
    }
}
