package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static int a(byte[] bArr, int i10, g gVar) {
        int iR = r(bArr, i10, gVar);
        int i11 = gVar.f24836a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i11 > bArr.length - iR) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i11 == 0) {
            gVar.f24838c = ByteString.EMPTY;
            return iR;
        }
        gVar.f24838c = ByteString.copyFrom(bArr, iR, i11);
        return iR + i11;
    }

    public static int b(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static long c(int i10, byte[] bArr) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public static int d(x3 x3Var, byte[] bArr, int i10, int i11, int i12, g gVar) {
        Object objD = x3Var.d();
        int iU = u(objD, x3Var, bArr, i10, i11, i12, gVar);
        x3Var.b(objD);
        gVar.f24838c = objD;
        return iU;
    }

    public static int e(x3 x3Var, byte[] bArr, int i10, int i11, g gVar) {
        Object objD = x3Var.d();
        int iV = v(objD, x3Var, bArr, i10, i11, gVar);
        x3Var.b(objD);
        gVar.f24838c = objD;
        return iV;
    }

    public static int f(x3 x3Var, int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList protobufList, g gVar) {
        int iE = e(x3Var, bArr, i11, i12, gVar);
        protobufList.add(gVar.f24838c);
        while (iE < i12) {
            int iR = r(bArr, iE, gVar);
            if (i10 != gVar.f24836a) {
                break;
            }
            iE = e(x3Var, bArr, iR, i12, gVar);
            protobufList.add(gVar.f24838c);
        }
        return iE;
    }

    public static int g(byte[] bArr, int i10, Internal.ProtobufList protobufList, g gVar) {
        j jVar = (j) protobufList;
        int iR = r(bArr, i10, gVar);
        int i11 = gVar.f24836a + iR;
        while (iR < i11) {
            iR = t(bArr, iR, gVar);
            jVar.addBoolean(gVar.f24837b != 0);
        }
        if (iR == i11) {
            return iR;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int h(byte[] bArr, int i10, Internal.ProtobufList protobufList, g gVar) {
        z0 z0Var = (z0) protobufList;
        int iR = r(bArr, i10, gVar);
        int i11 = gVar.f24836a + iR;
        while (iR < i11) {
            z0Var.addDouble(Double.longBitsToDouble(c(iR, bArr)));
            iR += 8;
        }
        if (iR == i11) {
            return iR;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int i(byte[] bArr, int i10, Internal.ProtobufList protobufList, g gVar) {
        f2 f2Var = (f2) protobufList;
        int iR = r(bArr, i10, gVar);
        int i11 = gVar.f24836a + iR;
        while (iR < i11) {
            f2Var.addInt(b(iR, bArr));
            iR += 4;
        }
        if (iR == i11) {
            return iR;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int j(byte[] bArr, int i10, Internal.ProtobufList protobufList, g gVar) {
        r2 r2Var = (r2) protobufList;
        int iR = r(bArr, i10, gVar);
        int i11 = gVar.f24836a + iR;
        while (iR < i11) {
            r2Var.addLong(c(iR, bArr));
            iR += 8;
        }
        if (iR == i11) {
            return iR;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int k(byte[] bArr, int i10, Internal.ProtobufList protobufList, g gVar) {
        y1 y1Var = (y1) protobufList;
        int iR = r(bArr, i10, gVar);
        int i11 = gVar.f24836a + iR;
        while (iR < i11) {
            y1Var.addFloat(Float.intBitsToFloat(b(iR, bArr)));
            iR += 4;
        }
        if (iR == i11) {
            return iR;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int l(byte[] bArr, int i10, Internal.ProtobufList protobufList, g gVar) {
        f2 f2Var = (f2) protobufList;
        int iR = r(bArr, i10, gVar);
        int i11 = gVar.f24836a + iR;
        while (iR < i11) {
            iR = r(bArr, iR, gVar);
            f2Var.addInt(CodedInputStream.decodeZigZag32(gVar.f24836a));
        }
        if (iR == i11) {
            return iR;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int m(byte[] bArr, int i10, Internal.ProtobufList protobufList, g gVar) {
        r2 r2Var = (r2) protobufList;
        int iR = r(bArr, i10, gVar);
        int i11 = gVar.f24836a + iR;
        while (iR < i11) {
            iR = t(bArr, iR, gVar);
            r2Var.addLong(CodedInputStream.decodeZigZag64(gVar.f24837b));
        }
        if (iR == i11) {
            return iR;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int n(byte[] bArr, int i10, Internal.ProtobufList protobufList, g gVar) {
        f2 f2Var = (f2) protobufList;
        int iR = r(bArr, i10, gVar);
        int i11 = gVar.f24836a + iR;
        while (iR < i11) {
            iR = r(bArr, iR, gVar);
            f2Var.addInt(gVar.f24836a);
        }
        if (iR == i11) {
            return iR;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int o(byte[] bArr, int i10, g gVar) {
        int iR = r(bArr, i10, gVar);
        int i11 = gVar.f24836a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i11 == 0) {
            gVar.f24838c = "";
            return iR;
        }
        gVar.f24838c = new String(bArr, iR, i11, Internal.UTF_8);
        return iR + i11;
    }

    public static int p(int i10, byte[] bArr, int i11, int i12, UnknownFieldSetLite unknownFieldSetLite, g gVar) {
        if (WireFormat.getTagFieldNumber(i10) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i10);
        if (tagWireType == 0) {
            int iT = t(bArr, i11, gVar);
            unknownFieldSetLite.storeField(i10, Long.valueOf(gVar.f24837b));
            return iT;
        }
        if (tagWireType == 1) {
            unknownFieldSetLite.storeField(i10, Long.valueOf(c(i11, bArr)));
            return i11 + 8;
        }
        if (tagWireType == 2) {
            int iR = r(bArr, i11, gVar);
            int i13 = gVar.f24836a;
            if (i13 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i13 > bArr.length - iR) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i13 == 0) {
                unknownFieldSetLite.storeField(i10, ByteString.EMPTY);
            } else {
                unknownFieldSetLite.storeField(i10, ByteString.copyFrom(bArr, iR, i13));
            }
            return iR + i13;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            unknownFieldSetLite.storeField(i10, Integer.valueOf(b(i11, bArr)));
            return i11 + 4;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        int i14 = (i10 & (-8)) | 4;
        int i15 = gVar.f24840e + 1;
        gVar.f24840e = i15;
        if (i15 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int i16 = 0;
        while (i11 < i12) {
            int iR2 = r(bArr, i11, gVar);
            i16 = gVar.f24836a;
            if (i16 == i14) {
                i11 = iR2;
                break;
            }
            i11 = p(i16, bArr, iR2, i12, unknownFieldSetLiteNewInstance, gVar);
        }
        gVar.f24840e--;
        if (i11 > i12 || i16 != i14) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        unknownFieldSetLite.storeField(i10, unknownFieldSetLiteNewInstance);
        return i11;
    }

    public static int q(int i10, byte[] bArr, int i11, g gVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            gVar.f24836a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            gVar.f24836a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            gVar.f24836a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            gVar.f24836a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                gVar.f24836a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int r(byte[] bArr, int i10, g gVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return q(b10, bArr, i11, gVar);
        }
        gVar.f24836a = b10;
        return i11;
    }

    public static int s(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList protobufList, g gVar) {
        f2 f2Var = (f2) protobufList;
        int iR = r(bArr, i11, gVar);
        f2Var.addInt(gVar.f24836a);
        while (iR < i12) {
            int iR2 = r(bArr, iR, gVar);
            if (i10 != gVar.f24836a) {
                break;
            }
            iR = r(bArr, iR2, gVar);
            f2Var.addInt(gVar.f24836a);
        }
        return iR;
    }

    public static int t(byte[] bArr, int i10, g gVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            gVar.f24837b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        gVar.f24837b = j11;
        return i12;
    }

    public static int u(Object obj, x3 x3Var, byte[] bArr, int i10, int i11, int i12, g gVar) {
        d3 d3Var = (d3) x3Var;
        int i13 = gVar.f24840e + 1;
        gVar.f24840e = i13;
        if (i13 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iH = d3Var.H(obj, bArr, i10, i11, i12, gVar);
        gVar.f24840e--;
        gVar.f24838c = obj;
        return iH;
    }

    public static int v(Object obj, x3 x3Var, byte[] bArr, int i10, int i11, g gVar) {
        int iQ = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iQ = q(i12, bArr, iQ, gVar);
            i12 = gVar.f24836a;
        }
        int i13 = iQ;
        if (i12 < 0 || i12 > i11 - i13) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i14 = gVar.f24840e + 1;
        gVar.f24840e = i14;
        if (i14 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int i15 = i13 + i12;
        x3Var.h(obj, bArr, i13, i15, gVar);
        gVar.f24840e--;
        gVar.f24838c = obj;
        return i15;
    }

    public static int w(int i10, byte[] bArr, int i11, int i12, g gVar) {
        if (WireFormat.getTagFieldNumber(i10) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i10);
        if (tagWireType == 0) {
            return t(bArr, i11, gVar);
        }
        if (tagWireType == 1) {
            return i11 + 8;
        }
        if (tagWireType == 2) {
            return r(bArr, i11, gVar) + gVar.f24836a;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return i11 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i13 = (i10 & (-8)) | 4;
        int i14 = 0;
        while (i11 < i12) {
            i11 = r(bArr, i11, gVar);
            i14 = gVar.f24836a;
            if (i14 == i13) {
                break;
            }
            i11 = w(i14, bArr, i11, i12, gVar);
        }
        if (i11 > i12 || i14 != i13) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i11;
    }
}
