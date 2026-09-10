package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class CodedOutputStreamWriter implements Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f4780a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.CodedOutputStreamWriter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4781a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f4781a = iArr;
            try {
                iArr[WireFormat.FieldType.k0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4781a[WireFormat.FieldType.j0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4781a[WireFormat.FieldType.h0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4781a[WireFormat.FieldType.r0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4781a[WireFormat.FieldType.t0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4781a[WireFormat.FieldType.p0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4781a[WireFormat.FieldType.i0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4781a[WireFormat.FieldType.f0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4781a[WireFormat.FieldType.s0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4781a[WireFormat.FieldType.u0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4781a[WireFormat.FieldType.g0.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4781a[WireFormat.FieldType.l0.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public CodedOutputStreamWriter(CodedOutputStream codedOutputStream) {
        Internal.a(codedOutputStream, "output");
        this.f4780a = codedOutputStream;
        codedOutputStream.f4777a = this;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void a(int i2, List list, Schema schema) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            e(i2, list.get(i3), schema);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void b(int i2, ByteString byteString) {
        this.f4780a.b(i2, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void c(int i2, Object obj, Schema schema) {
        this.f4780a.B(i2, (MessageLite) obj, schema);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void d(int i2, MapEntryLite.Metadata metadata, Map map) {
        CodedOutputStream codedOutputStream = this.f4780a;
        codedOutputStream.getClass();
        for (Map.Entry entry : map.entrySet()) {
            codedOutputStream.G(i2, 2);
            codedOutputStream.H(MapEntryLite.a(metadata, entry.getKey(), entry.getValue()));
            MapEntryLite.b(codedOutputStream, metadata, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void e(int i2, Object obj, Schema schema) {
        CodedOutputStream codedOutputStream = this.f4780a;
        codedOutputStream.G(i2, 3);
        schema.d((MessageLite) obj, codedOutputStream.f4777a);
        codedOutputStream.G(i2, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void f(int i2, List list, Schema schema) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            c(i2, list.get(i3), schema);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.X;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeBool(int i2, boolean z2) {
        this.f4780a.writeBool(i2, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeBoolList(int i2, List list, boolean z2) {
        boolean z3 = list instanceof BooleanArrayList;
        CodedOutputStream codedOutputStream = this.f4780a;
        int i3 = 0;
        if (!z3) {
            if (!z2) {
                while (i3 < list.size()) {
                    codedOutputStream.writeBool(i2, ((Boolean) list.get(i3)).booleanValue());
                    i3++;
                }
                return;
            }
            codedOutputStream.G(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Boolean) list.get(i5)).getClass();
                Logger logger = CodedOutputStream.f4775b;
                i4++;
            }
            codedOutputStream.H(i4);
            while (i3 < list.size()) {
                codedOutputStream.u(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
                i3++;
            }
            return;
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) list;
        if (!z2) {
            while (i3 < booleanArrayList.Z) {
                codedOutputStream.writeBool(i2, booleanArrayList.getBoolean(i3));
                i3++;
            }
            return;
        }
        codedOutputStream.G(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < booleanArrayList.Z; i7++) {
            booleanArrayList.getBoolean(i7);
            Logger logger2 = CodedOutputStream.f4775b;
            i6++;
        }
        codedOutputStream.H(i6);
        while (i3 < booleanArrayList.Z) {
            codedOutputStream.u(booleanArrayList.getBoolean(i3) ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeBytesList(int i2, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f4780a.b(i2, (ByteString) list.get(i3));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeDouble(int i2, double d) {
        CodedOutputStream codedOutputStream = this.f4780a;
        codedOutputStream.getClass();
        codedOutputStream.writeFixed64(i2, Double.doubleToRawLongBits(d));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeDoubleList(int i2, List list, boolean z2) {
        boolean z3 = list instanceof DoubleArrayList;
        CodedOutputStream codedOutputStream = this.f4780a;
        int i3 = 0;
        if (!z3) {
            if (!z2) {
                while (i3 < list.size()) {
                    double dDoubleValue = ((Double) list.get(i3)).doubleValue();
                    codedOutputStream.getClass();
                    codedOutputStream.writeFixed64(i2, Double.doubleToRawLongBits(dDoubleValue));
                    i3++;
                }
                return;
            }
            codedOutputStream.G(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Double) list.get(i5)).getClass();
                Logger logger = CodedOutputStream.f4775b;
                i4 += 8;
            }
            codedOutputStream.H(i4);
            while (i3 < list.size()) {
                codedOutputStream.y(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                i3++;
            }
            return;
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) list;
        if (!z2) {
            while (i3 < doubleArrayList.Z) {
                double d = doubleArrayList.getDouble(i3);
                codedOutputStream.getClass();
                codedOutputStream.writeFixed64(i2, Double.doubleToRawLongBits(d));
                i3++;
            }
            return;
        }
        codedOutputStream.G(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < doubleArrayList.Z; i7++) {
            doubleArrayList.getDouble(i7);
            Logger logger2 = CodedOutputStream.f4775b;
            i6 += 8;
        }
        codedOutputStream.H(i6);
        while (i3 < doubleArrayList.Z) {
            codedOutputStream.y(Double.doubleToRawLongBits(doubleArrayList.getDouble(i3)));
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeEndGroup(int i2) {
        this.f4780a.G(i2, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeEnum(int i2, int i3) {
        this.f4780a.writeInt32(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeEnumList(int i2, List list, boolean z2) {
        boolean z3 = list instanceof IntArrayList;
        CodedOutputStream codedOutputStream = this.f4780a;
        int i3 = 0;
        if (!z3) {
            if (!z2) {
                while (i3 < list.size()) {
                    codedOutputStream.writeInt32(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            codedOutputStream.G(i2, 2);
            int iQ = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iQ += CodedOutputStream.q(((Integer) list.get(i4)).intValue());
            }
            codedOutputStream.H(iQ);
            while (i3 < list.size()) {
                codedOutputStream.z(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z2) {
            while (i3 < intArrayList.Z) {
                codedOutputStream.writeInt32(i2, intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        codedOutputStream.G(i2, 2);
        int iQ2 = 0;
        for (int i5 = 0; i5 < intArrayList.Z; i5++) {
            iQ2 += CodedOutputStream.q(intArrayList.getInt(i5));
        }
        codedOutputStream.H(iQ2);
        while (i3 < intArrayList.Z) {
            codedOutputStream.z(intArrayList.getInt(i3));
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed32(int i2, int i3) {
        this.f4780a.writeFixed32(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed32List(int i2, List list, boolean z2) {
        boolean z3 = list instanceof IntArrayList;
        CodedOutputStream codedOutputStream = this.f4780a;
        int i3 = 0;
        if (!z3) {
            if (!z2) {
                while (i3 < list.size()) {
                    codedOutputStream.writeFixed32(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            codedOutputStream.G(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Integer) list.get(i5)).getClass();
                Logger logger = CodedOutputStream.f4775b;
                i4 += 4;
            }
            codedOutputStream.H(i4);
            while (i3 < list.size()) {
                codedOutputStream.x(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z2) {
            while (i3 < intArrayList.Z) {
                codedOutputStream.writeFixed32(i2, intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        codedOutputStream.G(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < intArrayList.Z; i7++) {
            intArrayList.getInt(i7);
            Logger logger2 = CodedOutputStream.f4775b;
            i6 += 4;
        }
        codedOutputStream.H(i6);
        while (i3 < intArrayList.Z) {
            codedOutputStream.x(intArrayList.getInt(i3));
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed64(int i2, long j) {
        this.f4780a.writeFixed64(i2, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed64List(int i2, List list, boolean z2) {
        boolean z3 = list instanceof LongArrayList;
        CodedOutputStream codedOutputStream = this.f4780a;
        int i3 = 0;
        if (!z3) {
            if (!z2) {
                while (i3 < list.size()) {
                    codedOutputStream.writeFixed64(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            codedOutputStream.G(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Long) list.get(i5)).getClass();
                Logger logger = CodedOutputStream.f4775b;
                i4 += 8;
            }
            codedOutputStream.H(i4);
            while (i3 < list.size()) {
                codedOutputStream.y(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z2) {
            while (i3 < longArrayList.Z) {
                codedOutputStream.writeFixed64(i2, longArrayList.getLong(i3));
                i3++;
            }
            return;
        }
        codedOutputStream.G(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < longArrayList.Z; i7++) {
            longArrayList.getLong(i7);
            Logger logger2 = CodedOutputStream.f4775b;
            i6 += 8;
        }
        codedOutputStream.H(i6);
        while (i3 < longArrayList.Z) {
            codedOutputStream.y(longArrayList.getLong(i3));
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFloat(int i2, float f) {
        CodedOutputStream codedOutputStream = this.f4780a;
        codedOutputStream.getClass();
        codedOutputStream.writeFixed32(i2, Float.floatToRawIntBits(f));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFloatList(int i2, List list, boolean z2) {
        boolean z3 = list instanceof FloatArrayList;
        CodedOutputStream codedOutputStream = this.f4780a;
        int i3 = 0;
        if (!z3) {
            if (!z2) {
                while (i3 < list.size()) {
                    float fFloatValue = ((Float) list.get(i3)).floatValue();
                    codedOutputStream.getClass();
                    codedOutputStream.writeFixed32(i2, Float.floatToRawIntBits(fFloatValue));
                    i3++;
                }
                return;
            }
            codedOutputStream.G(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Float) list.get(i5)).getClass();
                Logger logger = CodedOutputStream.f4775b;
                i4 += 4;
            }
            codedOutputStream.H(i4);
            while (i3 < list.size()) {
                codedOutputStream.x(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                i3++;
            }
            return;
        }
        FloatArrayList floatArrayList = (FloatArrayList) list;
        if (!z2) {
            while (i3 < floatArrayList.Z) {
                float f = floatArrayList.getFloat(i3);
                codedOutputStream.getClass();
                codedOutputStream.writeFixed32(i2, Float.floatToRawIntBits(f));
                i3++;
            }
            return;
        }
        codedOutputStream.G(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < floatArrayList.Z; i7++) {
            floatArrayList.getFloat(i7);
            Logger logger2 = CodedOutputStream.f4775b;
            i6 += 4;
        }
        codedOutputStream.H(i6);
        while (i3 < floatArrayList.Z) {
            codedOutputStream.x(Float.floatToRawIntBits(floatArrayList.getFloat(i3)));
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt32(int i2, int i3) {
        this.f4780a.writeInt32(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt32List(int i2, List list, boolean z2) {
        boolean z3 = list instanceof IntArrayList;
        CodedOutputStream codedOutputStream = this.f4780a;
        int i3 = 0;
        if (!z3) {
            if (!z2) {
                while (i3 < list.size()) {
                    codedOutputStream.writeInt32(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            codedOutputStream.G(i2, 2);
            int iQ = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iQ += CodedOutputStream.q(((Integer) list.get(i4)).intValue());
            }
            codedOutputStream.H(iQ);
            while (i3 < list.size()) {
                codedOutputStream.z(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z2) {
            while (i3 < intArrayList.Z) {
                codedOutputStream.writeInt32(i2, intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        codedOutputStream.G(i2, 2);
        int iQ2 = 0;
        for (int i5 = 0; i5 < intArrayList.Z; i5++) {
            iQ2 += CodedOutputStream.q(intArrayList.getInt(i5));
        }
        codedOutputStream.H(iQ2);
        while (i3 < intArrayList.Z) {
            codedOutputStream.z(intArrayList.getInt(i3));
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt64(int i2, long j) {
        this.f4780a.writeUInt64(i2, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt64List(int i2, List list, boolean z2) {
        boolean z3 = list instanceof LongArrayList;
        CodedOutputStream codedOutputStream = this.f4780a;
        int i3 = 0;
        if (!z3) {
            if (!z2) {
                while (i3 < list.size()) {
                    codedOutputStream.writeUInt64(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            codedOutputStream.G(i2, 2);
            int iQ = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iQ += CodedOutputStream.q(((Long) list.get(i4)).longValue());
            }
            codedOutputStream.H(iQ);
            while (i3 < list.size()) {
                codedOutputStream.I(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z2) {
            while (i3 < longArrayList.Z) {
                codedOutputStream.writeUInt64(i2, longArrayList.getLong(i3));
                i3++;
            }
            return;
        }
        codedOutputStream.G(i2, 2);
        int iQ2 = 0;
        for (int i5 = 0; i5 < longArrayList.Z; i5++) {
            iQ2 += CodedOutputStream.q(longArrayList.getLong(i5));
        }
        codedOutputStream.H(iQ2);
        while (i3 < longArrayList.Z) {
            codedOutputStream.I(longArrayList.getLong(i3));
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessage(int i2, Object obj) {
        this.f4780a.A(i2, (MessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageSetItem(int i2, Object obj) {
        boolean z2 = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.f4780a;
        if (z2) {
            codedOutputStream.E(i2, (ByteString) obj);
        } else {
            codedOutputStream.D(i2, (MessageLite) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed32(int i2, int i3) {
        this.f4780a.writeFixed32(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed32List(int i2, List list, boolean z2) {
        boolean z3 = list instanceof IntArrayList;
        CodedOutputStream codedOutputStream = this.f4780a;
        int i3 = 0;
        if (!z3) {
            if (!z2) {
                while (i3 < list.size()) {
                    codedOutputStream.writeFixed32(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            codedOutputStream.G(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Integer) list.get(i5)).getClass();
                Logger logger = CodedOutputStream.f4775b;
                i4 += 4;
            }
            codedOutputStream.H(i4);
            while (i3 < list.size()) {
                codedOutputStream.x(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z2) {
            while (i3 < intArrayList.Z) {
                codedOutputStream.writeFixed32(i2, intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        codedOutputStream.G(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < intArrayList.Z; i7++) {
            intArrayList.getInt(i7);
            Logger logger2 = CodedOutputStream.f4775b;
            i6 += 4;
        }
        codedOutputStream.H(i6);
        while (i3 < intArrayList.Z) {
            codedOutputStream.x(intArrayList.getInt(i3));
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed64(int i2, long j) {
        this.f4780a.writeFixed64(i2, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed64List(int i2, List list, boolean z2) {
        boolean z3 = list instanceof LongArrayList;
        CodedOutputStream codedOutputStream = this.f4780a;
        int i3 = 0;
        if (!z3) {
            if (!z2) {
                while (i3 < list.size()) {
                    codedOutputStream.writeFixed64(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            codedOutputStream.G(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Long) list.get(i5)).getClass();
                Logger logger = CodedOutputStream.f4775b;
                i4 += 8;
            }
            codedOutputStream.H(i4);
            while (i3 < list.size()) {
                codedOutputStream.y(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z2) {
            while (i3 < longArrayList.Z) {
                codedOutputStream.writeFixed64(i2, longArrayList.getLong(i3));
                i3++;
            }
            return;
        }
        codedOutputStream.G(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < longArrayList.Z; i7++) {
            longArrayList.getLong(i7);
            Logger logger2 = CodedOutputStream.f4775b;
            i6 += 8;
        }
        codedOutputStream.H(i6);
        while (i3 < longArrayList.Z) {
            codedOutputStream.y(longArrayList.getLong(i3));
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt32(int i2, int i3) {
        this.f4780a.writeUInt32(i2, CodedOutputStream.r(i3));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt32List(int i2, List list, boolean z2) {
        boolean z3 = list instanceof IntArrayList;
        CodedOutputStream codedOutputStream = this.f4780a;
        int i3 = 0;
        if (!z3) {
            if (!z2) {
                while (i3 < list.size()) {
                    codedOutputStream.writeUInt32(i2, CodedOutputStream.r(((Integer) list.get(i3)).intValue()));
                    i3++;
                }
                return;
            }
            codedOutputStream.G(i2, 2);
            int iL = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iL += CodedOutputStream.l(((Integer) list.get(i4)).intValue());
            }
            codedOutputStream.H(iL);
            while (i3 < list.size()) {
                codedOutputStream.H(CodedOutputStream.r(((Integer) list.get(i3)).intValue()));
                i3++;
            }
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z2) {
            while (i3 < intArrayList.Z) {
                codedOutputStream.writeUInt32(i2, CodedOutputStream.r(intArrayList.getInt(i3)));
                i3++;
            }
            return;
        }
        codedOutputStream.G(i2, 2);
        int iL2 = 0;
        for (int i5 = 0; i5 < intArrayList.Z; i5++) {
            iL2 += CodedOutputStream.l(intArrayList.getInt(i5));
        }
        codedOutputStream.H(iL2);
        while (i3 < intArrayList.Z) {
            codedOutputStream.H(CodedOutputStream.r(intArrayList.getInt(i3)));
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt64(int i2, long j) {
        this.f4780a.writeUInt64(i2, CodedOutputStream.s(j));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt64List(int i2, List list, boolean z2) {
        boolean z3 = list instanceof LongArrayList;
        CodedOutputStream codedOutputStream = this.f4780a;
        int i3 = 0;
        if (!z3) {
            if (!z2) {
                while (i3 < list.size()) {
                    codedOutputStream.writeUInt64(i2, CodedOutputStream.s(((Long) list.get(i3)).longValue()));
                    i3++;
                }
                return;
            }
            codedOutputStream.G(i2, 2);
            int iM = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iM += CodedOutputStream.m(((Long) list.get(i4)).longValue());
            }
            codedOutputStream.H(iM);
            while (i3 < list.size()) {
                codedOutputStream.I(CodedOutputStream.s(((Long) list.get(i3)).longValue()));
                i3++;
            }
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z2) {
            while (i3 < longArrayList.Z) {
                codedOutputStream.writeUInt64(i2, CodedOutputStream.s(longArrayList.getLong(i3)));
                i3++;
            }
            return;
        }
        codedOutputStream.G(i2, 2);
        int iM2 = 0;
        for (int i5 = 0; i5 < longArrayList.Z; i5++) {
            iM2 += CodedOutputStream.m(longArrayList.getLong(i5));
        }
        codedOutputStream.H(iM2);
        while (i3 < longArrayList.Z) {
            codedOutputStream.I(CodedOutputStream.s(longArrayList.getLong(i3)));
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeStartGroup(int i2) {
        this.f4780a.G(i2, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeString(int i2, String str) {
        this.f4780a.writeString(i2, str);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeStringList(int i2, List list) {
        boolean z2 = list instanceof LazyStringList;
        CodedOutputStream codedOutputStream = this.f4780a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                codedOutputStream.writeString(i2, (String) list.get(i3));
                i3++;
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        while (i3 < list.size()) {
            Object raw = lazyStringList.getRaw(i3);
            if (raw instanceof String) {
                codedOutputStream.writeString(i2, (String) raw);
            } else {
                codedOutputStream.b(i2, (ByteString) raw);
            }
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt32(int i2, int i3) {
        this.f4780a.writeUInt32(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt32List(int i2, List list, boolean z2) {
        boolean z3 = list instanceof IntArrayList;
        CodedOutputStream codedOutputStream = this.f4780a;
        int i3 = 0;
        if (!z3) {
            if (!z2) {
                while (i3 < list.size()) {
                    codedOutputStream.writeUInt32(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            codedOutputStream.G(i2, 2);
            int iP = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iP += CodedOutputStream.p(((Integer) list.get(i4)).intValue());
            }
            codedOutputStream.H(iP);
            while (i3 < list.size()) {
                codedOutputStream.H(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z2) {
            while (i3 < intArrayList.Z) {
                codedOutputStream.writeUInt32(i2, intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        codedOutputStream.G(i2, 2);
        int iP2 = 0;
        for (int i5 = 0; i5 < intArrayList.Z; i5++) {
            iP2 += CodedOutputStream.p(intArrayList.getInt(i5));
        }
        codedOutputStream.H(iP2);
        while (i3 < intArrayList.Z) {
            codedOutputStream.H(intArrayList.getInt(i3));
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt64(int i2, long j) {
        this.f4780a.writeUInt64(i2, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt64List(int i2, List list, boolean z2) {
        boolean z3 = list instanceof LongArrayList;
        CodedOutputStream codedOutputStream = this.f4780a;
        int i3 = 0;
        if (!z3) {
            if (!z2) {
                while (i3 < list.size()) {
                    codedOutputStream.writeUInt64(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            codedOutputStream.G(i2, 2);
            int iQ = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iQ += CodedOutputStream.q(((Long) list.get(i4)).longValue());
            }
            codedOutputStream.H(iQ);
            while (i3 < list.size()) {
                codedOutputStream.I(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z2) {
            while (i3 < longArrayList.Z) {
                codedOutputStream.writeUInt64(i2, longArrayList.getLong(i3));
                i3++;
            }
            return;
        }
        codedOutputStream.G(i2, 2);
        int iQ2 = 0;
        for (int i5 = 0; i5 < longArrayList.Z; i5++) {
            iQ2 += CodedOutputStream.q(longArrayList.getLong(i5));
        }
        codedOutputStream.H(iQ2);
        while (i3 < longArrayList.Z) {
            codedOutputStream.I(longArrayList.getLong(i3));
            i3++;
        }
    }
}
