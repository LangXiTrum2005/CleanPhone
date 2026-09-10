package com.google.protobuf;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CodedInputStream f24771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24774d = 0;

    public b0(CodedInputStream codedInputStream) {
        CodedInputStream codedInputStream2 = (CodedInputStream) Internal.checkNotNull(codedInputStream, "input");
        this.f24771a = codedInputStream2;
        codedInputStream2.wrapper = this;
    }

    public static void A(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public static void z(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public final int a() {
        int i10 = this.f24774d;
        if (i10 != 0) {
            this.f24772b = i10;
            this.f24774d = 0;
        } else {
            this.f24772b = this.f24771a.readTag();
        }
        int i11 = this.f24772b;
        if (i11 == 0 || i11 == this.f24773c) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.getTagFieldNumber(i11);
    }

    public final void b(Object obj, x3 x3Var, ExtensionRegistryLite extensionRegistryLite) {
        int i10 = this.f24773c;
        this.f24773c = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.f24772b), 4);
        try {
            x3Var.g(obj, this, extensionRegistryLite);
            if (this.f24772b != this.f24773c) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.f24773c = i10;
        } catch (Throwable th2) {
            this.f24773c = i10;
            throw th2;
        }
    }

    public final void c(Object obj, x3 x3Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        CodedInputStream codedInputStream = this.f24771a;
        int uInt32 = codedInputStream.readUInt32();
        if (codedInputStream.recursionDepth >= codedInputStream.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iPushLimit = codedInputStream.pushLimit(uInt32);
        codedInputStream.recursionDepth++;
        x3Var.g(obj, this, extensionRegistryLite);
        codedInputStream.checkLastTagWas(0);
        codedInputStream.recursionDepth--;
        codedInputStream.popLimit(iPushLimit);
    }

    public final void d(List list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof j;
        CodedInputStream codedInputStream = this.f24771a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f24772b);
            if (tagWireType == 0) {
                do {
                    list.add(Boolean.valueOf(codedInputStream.readBool()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f24772b);
                this.f24774d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Boolean.valueOf(codedInputStream.readBool()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        j jVar = (j) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f24772b);
        if (tagWireType2 == 0) {
            do {
                jVar.addBoolean(codedInputStream.readBool());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f24772b);
            this.f24774d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            jVar.addBoolean(codedInputStream.readBool());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final ByteString e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        x(2);
        return this.f24771a.readBytes();
    }

    public final void f(List list) throws IOException {
        int tag;
        if (WireFormat.getTagWireType(this.f24772b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(e());
            CodedInputStream codedInputStream = this.f24771a;
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag = codedInputStream.readTag();
            }
        } while (tag == this.f24772b);
        this.f24774d = tag;
    }

    public final void g(List list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof z0;
        CodedInputStream codedInputStream = this.f24771a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f24772b);
            if (tagWireType == 1) {
                do {
                    list.add(Double.valueOf(codedInputStream.readDouble()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f24772b);
                this.f24774d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int uInt32 = codedInputStream.readUInt32();
            A(uInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
            do {
                list.add(Double.valueOf(codedInputStream.readDouble()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        z0 z0Var = (z0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f24772b);
        if (tagWireType2 == 1) {
            do {
                z0Var.addDouble(codedInputStream.readDouble());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f24772b);
            this.f24774d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt33 = codedInputStream.readUInt32();
        A(uInt33);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt33;
        do {
            z0Var.addDouble(codedInputStream.readDouble());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    public final void h(List list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof f2;
        CodedInputStream codedInputStream = this.f24771a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f24772b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readEnum()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f24772b);
                this.f24774d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readEnum()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        f2 f2Var = (f2) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f24772b);
        if (tagWireType2 == 0) {
            do {
                f2Var.addInt(codedInputStream.readEnum());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f24772b);
            this.f24774d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            f2Var.addInt(codedInputStream.readEnum());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final Object i(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i10 = a0.f24762a[fieldType.ordinal()];
        CodedInputStream codedInputStream = this.f24771a;
        switch (i10) {
            case 1:
                x(0);
                return Boolean.valueOf(codedInputStream.readBool());
            case 2:
                return e();
            case 3:
                x(1);
                return Double.valueOf(codedInputStream.readDouble());
            case 4:
                x(0);
                return Integer.valueOf(codedInputStream.readEnum());
            case 5:
                x(5);
                return Integer.valueOf(codedInputStream.readFixed32());
            case 6:
                x(1);
                return Long.valueOf(codedInputStream.readFixed64());
            case 7:
                x(5);
                return Float.valueOf(codedInputStream.readFloat());
            case 8:
                x(0);
                return Integer.valueOf(codedInputStream.readInt32());
            case 9:
                x(0);
                return Long.valueOf(codedInputStream.readInt64());
            case 10:
                return o(cls, extensionRegistryLite);
            case 11:
                x(5);
                return Integer.valueOf(codedInputStream.readSFixed32());
            case 12:
                x(1);
                return Long.valueOf(codedInputStream.readSFixed64());
            case 13:
                x(0);
                return Integer.valueOf(codedInputStream.readSInt32());
            case 14:
                x(0);
                return Long.valueOf(codedInputStream.readSInt64());
            case 15:
                x(2);
                return codedInputStream.readStringRequireUtf8();
            case 16:
                x(0);
                return Integer.valueOf(codedInputStream.readUInt32());
            case 17:
                x(0);
                return Long.valueOf(codedInputStream.readUInt64());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final void j(List list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof f2;
        CodedInputStream codedInputStream = this.f24771a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f24772b);
            if (tagWireType == 2) {
                int uInt32 = codedInputStream.readUInt32();
                z(uInt32);
                int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
                do {
                    list.add(Integer.valueOf(codedInputStream.readFixed32()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.readFixed32()));
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream.readTag();
                }
            } while (tag == this.f24772b);
            this.f24774d = tag;
            return;
        }
        f2 f2Var = (f2) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f24772b);
        if (tagWireType2 == 2) {
            int uInt33 = codedInputStream.readUInt32();
            z(uInt33);
            int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt33;
            do {
                f2Var.addInt(codedInputStream.readFixed32());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            f2Var.addInt(codedInputStream.readFixed32());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag2 = codedInputStream.readTag();
            }
        } while (tag2 == this.f24772b);
        this.f24774d = tag2;
    }

    public final void k(List list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof r2;
        CodedInputStream codedInputStream = this.f24771a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f24772b);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.readFixed64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f24772b);
                this.f24774d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int uInt32 = codedInputStream.readUInt32();
            A(uInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(codedInputStream.readFixed64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        r2 r2Var = (r2) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f24772b);
        if (tagWireType2 == 1) {
            do {
                r2Var.addLong(codedInputStream.readFixed64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f24772b);
            this.f24774d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt33 = codedInputStream.readUInt32();
        A(uInt33);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt33;
        do {
            r2Var.addLong(codedInputStream.readFixed64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    public final void l(List list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof y1;
        CodedInputStream codedInputStream = this.f24771a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f24772b);
            if (tagWireType == 2) {
                int uInt32 = codedInputStream.readUInt32();
                z(uInt32);
                int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
                do {
                    list.add(Float.valueOf(codedInputStream.readFloat()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(codedInputStream.readFloat()));
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream.readTag();
                }
            } while (tag == this.f24772b);
            this.f24774d = tag;
            return;
        }
        y1 y1Var = (y1) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f24772b);
        if (tagWireType2 == 2) {
            int uInt33 = codedInputStream.readUInt32();
            z(uInt33);
            int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt33;
            do {
                y1Var.addFloat(codedInputStream.readFloat());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            y1Var.addFloat(codedInputStream.readFloat());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag2 = codedInputStream.readTag();
            }
        } while (tag2 == this.f24772b);
        this.f24774d = tag2;
    }

    public final void m(List list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof f2;
        CodedInputStream codedInputStream = this.f24771a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f24772b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readInt32()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f24772b);
                this.f24774d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readInt32()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        f2 f2Var = (f2) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f24772b);
        if (tagWireType2 == 0) {
            do {
                f2Var.addInt(codedInputStream.readInt32());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f24772b);
            this.f24774d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            f2Var.addInt(codedInputStream.readInt32());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final void n(List list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof r2;
        CodedInputStream codedInputStream = this.f24771a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f24772b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.readInt64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f24772b);
                this.f24774d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Long.valueOf(codedInputStream.readInt64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        r2 r2Var = (r2) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f24772b);
        if (tagWireType2 == 0) {
            do {
                r2Var.addLong(codedInputStream.readInt64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f24772b);
            this.f24774d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            r2Var.addLong(codedInputStream.readInt64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final Object o(Class cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        x(2);
        x3 x3VarA = p3.f24916c.a(cls);
        Object objD = x3VarA.d();
        c(objD, x3VarA, extensionRegistryLite);
        x3VarA.b(objD);
        return objD;
    }

    public final void p(List list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof f2;
        CodedInputStream codedInputStream = this.f24771a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f24772b);
            if (tagWireType == 2) {
                int uInt32 = codedInputStream.readUInt32();
                z(uInt32);
                int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
                do {
                    list.add(Integer.valueOf(codedInputStream.readSFixed32()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.readSFixed32()));
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream.readTag();
                }
            } while (tag == this.f24772b);
            this.f24774d = tag;
            return;
        }
        f2 f2Var = (f2) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f24772b);
        if (tagWireType2 == 2) {
            int uInt33 = codedInputStream.readUInt32();
            z(uInt33);
            int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt33;
            do {
                f2Var.addInt(codedInputStream.readSFixed32());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            f2Var.addInt(codedInputStream.readSFixed32());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag2 = codedInputStream.readTag();
            }
        } while (tag2 == this.f24772b);
        this.f24774d = tag2;
    }

    public final void q(List list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof r2;
        CodedInputStream codedInputStream = this.f24771a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f24772b);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.readSFixed64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f24772b);
                this.f24774d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int uInt32 = codedInputStream.readUInt32();
            A(uInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(codedInputStream.readSFixed64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        r2 r2Var = (r2) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f24772b);
        if (tagWireType2 == 1) {
            do {
                r2Var.addLong(codedInputStream.readSFixed64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f24772b);
            this.f24774d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt33 = codedInputStream.readUInt32();
        A(uInt33);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt33;
        do {
            r2Var.addLong(codedInputStream.readSFixed64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    public final void r(List list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof f2;
        CodedInputStream codedInputStream = this.f24771a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f24772b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readSInt32()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f24772b);
                this.f24774d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readSInt32()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        f2 f2Var = (f2) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f24772b);
        if (tagWireType2 == 0) {
            do {
                f2Var.addInt(codedInputStream.readSInt32());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f24772b);
            this.f24774d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            f2Var.addInt(codedInputStream.readSInt32());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final void s(List list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof r2;
        CodedInputStream codedInputStream = this.f24771a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f24772b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.readSInt64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f24772b);
                this.f24774d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Long.valueOf(codedInputStream.readSInt64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        r2 r2Var = (r2) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f24772b);
        if (tagWireType2 == 0) {
            do {
                r2Var.addLong(codedInputStream.readSInt64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f24772b);
            this.f24774d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            r2Var.addLong(codedInputStream.readSInt64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final void t(List list, boolean z10) throws IOException {
        String string;
        int tag;
        int tag2;
        if (WireFormat.getTagWireType(this.f24772b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        boolean z11 = list instanceof LazyStringList;
        CodedInputStream codedInputStream = this.f24771a;
        if (z11 && !z10) {
            LazyStringList lazyStringList = (LazyStringList) list;
            do {
                lazyStringList.add(e());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f24772b);
            this.f24774d = tag2;
            return;
        }
        do {
            if (z10) {
                x(2);
                string = codedInputStream.readStringRequireUtf8();
            } else {
                x(2);
                string = codedInputStream.readString();
            }
            list.add(string);
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag = codedInputStream.readTag();
            }
        } while (tag == this.f24772b);
        this.f24774d = tag;
    }

    public final void u(List list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof f2;
        CodedInputStream codedInputStream = this.f24771a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f24772b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readUInt32()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f24772b);
                this.f24774d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readUInt32()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        f2 f2Var = (f2) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f24772b);
        if (tagWireType2 == 0) {
            do {
                f2Var.addInt(codedInputStream.readUInt32());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f24772b);
            this.f24774d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            f2Var.addInt(codedInputStream.readUInt32());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final void v(List list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof r2;
        CodedInputStream codedInputStream = this.f24771a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f24772b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.readUInt64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f24772b);
                this.f24774d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Long.valueOf(codedInputStream.readUInt64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        r2 r2Var = (r2) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f24772b);
        if (tagWireType2 == 0) {
            do {
                r2Var.addLong(codedInputStream.readUInt64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f24772b);
            this.f24774d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            r2Var.addLong(codedInputStream.readUInt64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final void w(int i10) throws InvalidProtocolBufferException {
        if (this.f24771a.getTotalBytesRead() != i10) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final void x(int i10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if (WireFormat.getTagWireType(this.f24772b) != i10) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    public final boolean y() {
        int i10;
        CodedInputStream codedInputStream = this.f24771a;
        if (codedInputStream.isAtEnd() || (i10 = this.f24772b) == this.f24773c) {
            return false;
        }
        return codedInputStream.skipField(i10);
    }
}
