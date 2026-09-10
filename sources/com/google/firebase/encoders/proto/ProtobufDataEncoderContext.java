package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class ProtobufDataEncoderContext implements ObjectEncoderContext {
    public static final Charset f = Charset.forName("UTF-8");
    public static final FieldDescriptor g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final FieldDescriptor f20801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f20802i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f20803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f20804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f20805c;
    public final a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ProtobufValueEncoderContext f20806e = new ProtobufValueEncoderContext(this);

    /* JADX INFO: renamed from: com.google.firebase.encoders.proto.ProtobufDataEncoderContext$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20807a;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            f20807a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20807a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20807a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        FieldDescriptor.Builder builder = new FieldDescriptor.Builder("key");
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f20798a = 1;
        builder.b(atProtobuf.a());
        g = builder.a();
        FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("value");
        AtProtobuf atProtobuf2 = new AtProtobuf();
        atProtobuf2.f20798a = 2;
        builder2.b(atProtobuf2.a());
        f20801h = builder2.a();
        f20802i = new a(0);
    }

    public ProtobufDataEncoderContext(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, a aVar) {
        this.f20803a = byteArrayOutputStream;
        this.f20804b = map;
        this.f20805c = map2;
        this.d = aVar;
    }

    public static int k(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) ((Annotation) fieldDescriptor.f20783b.get(Protobuf.class));
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext a(FieldDescriptor fieldDescriptor, boolean z2) {
        g(fieldDescriptor, z2 ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext b(FieldDescriptor fieldDescriptor, long j) throws IOException {
        h(fieldDescriptor, j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext c(FieldDescriptor fieldDescriptor, int i2) {
        g(fieldDescriptor, i2, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext d(FieldDescriptor fieldDescriptor, double d) throws IOException {
        e(fieldDescriptor, d, true);
        return this;
    }

    public final void e(FieldDescriptor fieldDescriptor, double d, boolean z2) throws IOException {
        if (z2 && d == 0.0d) {
            return;
        }
        l((k(fieldDescriptor) << 3) | 1);
        this.f20803a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext f(FieldDescriptor fieldDescriptor, Object obj) {
        i(fieldDescriptor, obj, true);
        return this;
    }

    public final void g(FieldDescriptor fieldDescriptor, int i2, boolean z2) {
        if (z2 && i2 == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) ((Annotation) fieldDescriptor.f20783b.get(Protobuf.class));
        if (protobuf == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = protobuf.intEncoding().ordinal();
        if (iOrdinal == 0) {
            l(protobuf.tag() << 3);
            l(i2);
        } else if (iOrdinal == 1) {
            l(protobuf.tag() << 3);
            l((i2 << 1) ^ (i2 >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            l((protobuf.tag() << 3) | 5);
            this.f20803a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
        }
    }

    public final void h(FieldDescriptor fieldDescriptor, long j, boolean z2) throws IOException {
        if (z2 && j == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) ((Annotation) fieldDescriptor.f20783b.get(Protobuf.class));
        if (protobuf == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = protobuf.intEncoding().ordinal();
        if (iOrdinal == 0) {
            l(protobuf.tag() << 3);
            m(j);
        } else if (iOrdinal == 1) {
            l(protobuf.tag() << 3);
            m((j >> 63) ^ (j << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            l((protobuf.tag() << 3) | 1);
            this.f20803a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void i(FieldDescriptor fieldDescriptor, Object obj, boolean z2) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z2 && charSequence.length() == 0) {
                return;
            }
            l((k(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            l(bytes.length);
            this.f20803a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(fieldDescriptor, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(f20802i, fieldDescriptor, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            e(fieldDescriptor, ((Double) obj).doubleValue(), z2);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z2 && fFloatValue == 0.0f) {
                return;
            }
            l((k(fieldDescriptor) << 3) | 5);
            this.f20803a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            h(fieldDescriptor, ((Number) obj).longValue(), z2);
            return;
        }
        if (obj instanceof Boolean) {
            g(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z2);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z2 && bArr.length == 0) {
                return;
            }
            l((k(fieldDescriptor) << 3) | 2);
            l(bArr.length);
            this.f20803a.write(bArr);
            return;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.f20804b.get(obj.getClass());
        if (objectEncoder != null) {
            j(objectEncoder, fieldDescriptor, obj, z2);
            return;
        }
        ValueEncoder valueEncoder = (ValueEncoder) this.f20805c.get(obj.getClass());
        if (valueEncoder != null) {
            ProtobufValueEncoderContext protobufValueEncoderContext = this.f20806e;
            protobufValueEncoderContext.f20814a = false;
            protobufValueEncoderContext.f20816c = fieldDescriptor;
            protobufValueEncoderContext.f20815b = z2;
            valueEncoder.a(obj, protobufValueEncoderContext);
            return;
        }
        if (obj instanceof ProtoEnum) {
            g(fieldDescriptor, ((ProtoEnum) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            g(fieldDescriptor, ((Enum) obj).ordinal(), true);
        } else {
            j(this.d, fieldDescriptor, obj, z2);
        }
    }

    public final void j(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z2) throws IOException {
        LengthCountingOutputStream lengthCountingOutputStream = new LengthCountingOutputStream();
        lengthCountingOutputStream.X = 0L;
        try {
            OutputStream outputStream = this.f20803a;
            this.f20803a = lengthCountingOutputStream;
            try {
                objectEncoder.a(obj, this);
                this.f20803a = outputStream;
                long j = lengthCountingOutputStream.X;
                lengthCountingOutputStream.close();
                if (z2 && j == 0) {
                    return;
                }
                l((k(fieldDescriptor) << 3) | 2);
                m(j);
                objectEncoder.a(obj, this);
            } catch (Throwable th) {
                this.f20803a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                lengthCountingOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void l(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.f20803a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.f20803a.write(i2 & 127);
    }

    public final void m(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f20803a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f20803a.write(((int) j) & 127);
    }
}
