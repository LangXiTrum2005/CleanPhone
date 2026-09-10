package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final enum i5 extends k5 {
    public i5() {
        super("STRICT", 1);
    }

    @Override // com.google.protobuf.k5
    public final Object a(CodedInputStream codedInputStream) {
        return codedInputStream.readStringRequireUtf8();
    }
}
