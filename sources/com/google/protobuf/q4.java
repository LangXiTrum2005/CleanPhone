package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q4 {
    public abstract UnknownFieldSetLite a(Object obj);

    public final boolean b(Object obj, s3 s3Var, int i10) throws IOException {
        b0 b0Var = (b0) s3Var;
        int i11 = b0Var.f24772b;
        int tagFieldNumber = WireFormat.getTagFieldNumber(i11);
        int tagWireType = WireFormat.getTagWireType(i11);
        if (tagWireType == 0) {
            b0Var.x(0);
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 0), Long.valueOf(b0Var.f24771a.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            b0Var.x(1);
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 1), Long.valueOf(b0Var.f24771a.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 2), b0Var.e());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            b0Var.x(5);
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 5), Integer.valueOf(b0Var.f24771a.readFixed32()));
            return true;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        int iMakeTag = WireFormat.makeTag(tagFieldNumber, 4);
        int i12 = i10 + 1;
        if (i12 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        while (b0Var.a() != Integer.MAX_VALUE && b(unknownFieldSetLiteNewInstance, b0Var, i12)) {
        }
        if (iMakeTag != b0Var.f24772b) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        unknownFieldSetLiteNewInstance.makeImmutable();
        ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 3), unknownFieldSetLiteNewInstance);
        return true;
    }

    public abstract void c(Object obj, Object obj2);
}
