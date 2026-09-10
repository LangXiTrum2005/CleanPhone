package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* JADX INFO: loaded from: classes7.dex */
public final class JvmProtoBuf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension f44128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension f44129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension f44130c;
    public static final GeneratedMessageLite.GeneratedExtension d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension f44131e;
    public static final GeneratedMessageLite.GeneratedExtension f;
    public static final GeneratedMessageLite.GeneratedExtension g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension f44132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension f44133i;
    public static final GeneratedMessageLite.GeneratedExtension j;
    public static final GeneratedMessageLite.GeneratedExtension k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension f44134l;
    public static final GeneratedMessageLite.GeneratedExtension m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension f44135n;

    public interface JvmFieldSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public interface JvmMethodSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public interface JvmPropertySignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public interface StringTableTypesOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        ProtoBuf.Constructor constructor = ProtoBuf.Constructor.j0;
        JvmMethodSignature jvmMethodSignature = JvmMethodSignature.h0;
        WireFormat.FieldType fieldType = WireFormat.FieldType.n0;
        f44128a = GeneratedMessageLite.d(constructor, jvmMethodSignature, jvmMethodSignature, 100, fieldType, JvmMethodSignature.class);
        ProtoBuf.Function function = ProtoBuf.Function.v0;
        f44129b = GeneratedMessageLite.d(function, jvmMethodSignature, jvmMethodSignature, 100, fieldType, JvmMethodSignature.class);
        WireFormat.FieldType fieldType2 = WireFormat.FieldType.h0;
        f44130c = GeneratedMessageLite.d(function, 0, null, 101, fieldType2, Integer.class);
        ProtoBuf.Property property = ProtoBuf.Property.v0;
        JvmPropertySignature jvmPropertySignature = JvmPropertySignature.k0;
        d = GeneratedMessageLite.d(property, jvmPropertySignature, jvmPropertySignature, 100, fieldType, JvmPropertySignature.class);
        f44131e = GeneratedMessageLite.d(property, 0, null, 101, fieldType2, Integer.class);
        ProtoBuf.Type type = ProtoBuf.Type.u0;
        ProtoBuf.Annotation annotation = ProtoBuf.Annotation.h0;
        f = GeneratedMessageLite.c(type, annotation, 100, fieldType, ProtoBuf.Annotation.class);
        g = GeneratedMessageLite.d(type, Boolean.FALSE, null, 101, WireFormat.FieldType.k0, Boolean.class);
        f44132h = GeneratedMessageLite.c(ProtoBuf.TypeParameter.n0, annotation, 100, fieldType, ProtoBuf.Annotation.class);
        ProtoBuf.Class r7 = ProtoBuf.Class.K0;
        f44133i = GeneratedMessageLite.d(r7, 0, null, 101, fieldType2, Integer.class);
        j = GeneratedMessageLite.c(r7, property, 102, fieldType, ProtoBuf.Property.class);
        k = GeneratedMessageLite.d(r7, 0, null, 103, fieldType2, Integer.class);
        f44134l = GeneratedMessageLite.d(r7, 0, null, 104, fieldType2, Integer.class);
        ProtoBuf.Package r8 = ProtoBuf.Package.l0;
        m = GeneratedMessageLite.d(r8, 0, null, 101, fieldType2, Integer.class);
        f44135n = GeneratedMessageLite.c(r8, property, 102, fieldType, ProtoBuf.Property.class);
    }

    public static final class JvmFieldSignature extends GeneratedMessageLite implements JvmFieldSignatureOrBuilder {
        public static final JvmFieldSignature h0;
        public static final Parser i0 = new AnonymousClass1();
        public final ByteString X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f44136Y;
        public int Z;
        public int e0;
        public byte f0;
        public int g0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<JvmFieldSignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new JvmFieldSignature(codedInputStream);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<JvmFieldSignature, Builder> implements JvmFieldSignatureOrBuilder {

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f44137Y;
            public int Z;
            public int e0;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                JvmFieldSignature jvmFieldSignatureG = g();
                jvmFieldSignatureG.isInitialized();
                return jvmFieldSignatureG;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder c() {
                Builder builder = new Builder();
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object c() {
                Builder builder = new Builder();
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final GeneratedMessageLite.Builder c() {
                Builder builder = new Builder();
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                h((JvmFieldSignature) generatedMessageLite);
                return this;
            }

            public final JvmFieldSignature g() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(this);
                int i2 = this.f44137Y;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                jvmFieldSignature.Z = this.Z;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                jvmFieldSignature.e0 = this.e0;
                jvmFieldSignature.f44136Y = i3;
                return jvmFieldSignature;
            }

            public final void h(JvmFieldSignature jvmFieldSignature) {
                if (jvmFieldSignature == JvmFieldSignature.h0) {
                    return;
                }
                int i2 = jvmFieldSignature.f44136Y;
                if ((i2 & 1) == 1) {
                    int i3 = jvmFieldSignature.Z;
                    this.f44137Y = 1 | this.f44137Y;
                    this.Z = i3;
                }
                if ((i2 & 2) == 2) {
                    int i4 = jvmFieldSignature.e0;
                    this.f44137Y = 2 | this.f44137Y;
                    this.e0 = i4;
                }
                this.X = this.X.c(jvmFieldSignature.X);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                JvmFieldSignature jvmFieldSignature = null;
                try {
                    try {
                        ((AnonymousClass1) JvmFieldSignature.i0).getClass();
                        h(new JvmFieldSignature(codedInputStream));
                    } catch (InvalidProtocolBufferException e2) {
                        JvmFieldSignature jvmFieldSignature2 = (JvmFieldSignature) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            jvmFieldSignature = jvmFieldSignature2;
                            if (jvmFieldSignature != null) {
                                h(jvmFieldSignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (jvmFieldSignature != null) {
                        h(jvmFieldSignature);
                    }
                    throw th;
                }
            }
        }

        static {
            JvmFieldSignature jvmFieldSignature = new JvmFieldSignature();
            h0 = jvmFieldSignature;
            jvmFieldSignature.Z = 0;
            jvmFieldSignature.e0 = 0;
        }

        public JvmFieldSignature() {
            this.f0 = (byte) -1;
            this.g0 = -1;
            this.X = ByteString.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f44136Y & 1) == 1) {
                codedOutputStream.m(1, this.Z);
            }
            if ((this.f44136Y & 2) == 2) {
                codedOutputStream.m(2, this.e0);
            }
            codedOutputStream.r(this.X);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.g0;
            if (i2 != -1) {
                return i2;
            }
            int iB = (this.f44136Y & 1) == 1 ? CodedOutputStream.b(1, this.Z) : 0;
            if ((this.f44136Y & 2) == 2) {
                iB += CodedOutputStream.b(2, this.e0);
            }
            int size = this.X.size() + iB;
            this.g0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            if (this.f0 == 1) {
                return true;
            }
            this.f0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builder = new Builder();
            builder.h(this);
            return builder;
        }

        public JvmFieldSignature(Builder builder) {
            this.f0 = (byte) -1;
            this.g0 = -1;
            this.X = builder.X;
        }

        public JvmFieldSignature(CodedInputStream codedInputStream) {
            this.f0 = (byte) -1;
            this.g0 = -1;
            boolean z2 = false;
            this.Z = 0;
            this.e0 = 0;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            while (!z2) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f44136Y |= 1;
                                this.Z = codedInputStream.k();
                            } else if (iN != 16) {
                                if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                }
                            } else {
                                this.f44136Y |= 2;
                                this.e0 = codedInputStream.k();
                            }
                        }
                        z2 = true;
                    } catch (InvalidProtocolBufferException e2) {
                        e2.X = this;
                        throw e2;
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                        invalidProtocolBufferException.X = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.X = output.h();
                    }
                    throw th;
                }
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.X = output.h();
            }
        }
    }

    public static final class JvmMethodSignature extends GeneratedMessageLite implements JvmMethodSignatureOrBuilder {
        public static final JvmMethodSignature h0;
        public static final Parser i0 = new AnonymousClass1();
        public final ByteString X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f44138Y;
        public int Z;
        public int e0;
        public byte f0;
        public int g0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<JvmMethodSignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new JvmMethodSignature(codedInputStream);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<JvmMethodSignature, Builder> implements JvmMethodSignatureOrBuilder {

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f44139Y;
            public int Z;
            public int e0;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                JvmMethodSignature jvmMethodSignatureG = g();
                jvmMethodSignatureG.isInitialized();
                return jvmMethodSignatureG;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder c() {
                Builder builder = new Builder();
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object c() {
                Builder builder = new Builder();
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final GeneratedMessageLite.Builder c() {
                Builder builder = new Builder();
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                h((JvmMethodSignature) generatedMessageLite);
                return this;
            }

            public final JvmMethodSignature g() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(this);
                int i2 = this.f44139Y;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                jvmMethodSignature.Z = this.Z;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                jvmMethodSignature.e0 = this.e0;
                jvmMethodSignature.f44138Y = i3;
                return jvmMethodSignature;
            }

            public final void h(JvmMethodSignature jvmMethodSignature) {
                if (jvmMethodSignature == JvmMethodSignature.h0) {
                    return;
                }
                int i2 = jvmMethodSignature.f44138Y;
                if ((i2 & 1) == 1) {
                    int i3 = jvmMethodSignature.Z;
                    this.f44139Y = 1 | this.f44139Y;
                    this.Z = i3;
                }
                if ((i2 & 2) == 2) {
                    int i4 = jvmMethodSignature.e0;
                    this.f44139Y = 2 | this.f44139Y;
                    this.e0 = i4;
                }
                this.X = this.X.c(jvmMethodSignature.X);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                JvmMethodSignature jvmMethodSignature = null;
                try {
                    try {
                        ((AnonymousClass1) JvmMethodSignature.i0).getClass();
                        h(new JvmMethodSignature(codedInputStream));
                    } catch (InvalidProtocolBufferException e2) {
                        JvmMethodSignature jvmMethodSignature2 = (JvmMethodSignature) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            jvmMethodSignature = jvmMethodSignature2;
                            if (jvmMethodSignature != null) {
                                h(jvmMethodSignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (jvmMethodSignature != null) {
                        h(jvmMethodSignature);
                    }
                    throw th;
                }
            }
        }

        static {
            JvmMethodSignature jvmMethodSignature = new JvmMethodSignature();
            h0 = jvmMethodSignature;
            jvmMethodSignature.Z = 0;
            jvmMethodSignature.e0 = 0;
        }

        public JvmMethodSignature() {
            this.f0 = (byte) -1;
            this.g0 = -1;
            this.X = ByteString.X;
        }

        public static Builder e(JvmMethodSignature jvmMethodSignature) {
            Builder builder = new Builder();
            builder.h(jvmMethodSignature);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f44138Y & 1) == 1) {
                codedOutputStream.m(1, this.Z);
            }
            if ((this.f44138Y & 2) == 2) {
                codedOutputStream.m(2, this.e0);
            }
            codedOutputStream.r(this.X);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.g0;
            if (i2 != -1) {
                return i2;
            }
            int iB = (this.f44138Y & 1) == 1 ? CodedOutputStream.b(1, this.Z) : 0;
            if ((this.f44138Y & 2) == 2) {
                iB += CodedOutputStream.b(2, this.e0);
            }
            int size = this.X.size() + iB;
            this.g0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            if (this.f0 == 1) {
                return true;
            }
            this.f0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            return e(this);
        }

        public JvmMethodSignature(Builder builder) {
            this.f0 = (byte) -1;
            this.g0 = -1;
            this.X = builder.X;
        }

        public JvmMethodSignature(CodedInputStream codedInputStream) {
            this.f0 = (byte) -1;
            this.g0 = -1;
            boolean z2 = false;
            this.Z = 0;
            this.e0 = 0;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            while (!z2) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f44138Y |= 1;
                                this.Z = codedInputStream.k();
                            } else if (iN != 16) {
                                if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                }
                            } else {
                                this.f44138Y |= 2;
                                this.e0 = codedInputStream.k();
                            }
                        }
                        z2 = true;
                    } catch (InvalidProtocolBufferException e2) {
                        e2.X = this;
                        throw e2;
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                        invalidProtocolBufferException.X = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.X = output.h();
                    }
                    throw th;
                }
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.X = output.h();
            }
        }
    }

    public static final class JvmPropertySignature extends GeneratedMessageLite implements JvmPropertySignatureOrBuilder {
        public static final JvmPropertySignature k0;
        public static final Parser l0 = new AnonymousClass1();
        public final ByteString X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f44140Y;
        public JvmFieldSignature Z;
        public JvmMethodSignature e0;
        public JvmMethodSignature f0;
        public JvmMethodSignature g0;
        public JvmMethodSignature h0;
        public byte i0;
        public int j0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<JvmPropertySignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new JvmPropertySignature(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<JvmPropertySignature, Builder> implements JvmPropertySignatureOrBuilder {

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f44141Y;
            public JvmFieldSignature Z;
            public JvmMethodSignature e0;
            public JvmMethodSignature f0;
            public JvmMethodSignature g0;
            public JvmMethodSignature h0;

            public static Builder i() {
                Builder builder = new Builder();
                builder.Z = JvmFieldSignature.h0;
                JvmMethodSignature jvmMethodSignature = JvmMethodSignature.h0;
                builder.e0 = jvmMethodSignature;
                builder.f0 = jvmMethodSignature;
                builder.g0 = jvmMethodSignature;
                builder.h0 = jvmMethodSignature;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                k(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                JvmPropertySignature jvmPropertySignatureG = g();
                jvmPropertySignatureG.isInitialized();
                return jvmPropertySignatureG;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder c() {
                Builder builderI = i();
                builderI.j(g());
                return builderI;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object c() {
                Builder builderI = i();
                builderI.j(g());
                return builderI;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                k(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final GeneratedMessageLite.Builder c() {
                Builder builderI = i();
                builderI.j(g());
                return builderI;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                j((JvmPropertySignature) generatedMessageLite);
                return this;
            }

            public final JvmPropertySignature g() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(this);
                int i2 = this.f44141Y;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                jvmPropertySignature.Z = this.Z;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                jvmPropertySignature.e0 = this.e0;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                jvmPropertySignature.f0 = this.f0;
                if ((i2 & 8) == 8) {
                    i3 |= 8;
                }
                jvmPropertySignature.g0 = this.g0;
                if ((i2 & 16) == 16) {
                    i3 |= 16;
                }
                jvmPropertySignature.h0 = this.h0;
                jvmPropertySignature.f44140Y = i3;
                return jvmPropertySignature;
            }

            public final void j(JvmPropertySignature jvmPropertySignature) {
                JvmMethodSignature jvmMethodSignature;
                JvmMethodSignature jvmMethodSignature2;
                JvmMethodSignature jvmMethodSignature3;
                JvmMethodSignature jvmMethodSignature4;
                JvmFieldSignature jvmFieldSignature;
                if (jvmPropertySignature == JvmPropertySignature.k0) {
                    return;
                }
                if ((jvmPropertySignature.f44140Y & 1) == 1) {
                    JvmFieldSignature jvmFieldSignature2 = jvmPropertySignature.Z;
                    if ((this.f44141Y & 1) != 1 || (jvmFieldSignature = this.Z) == JvmFieldSignature.h0) {
                        this.Z = jvmFieldSignature2;
                    } else {
                        JvmFieldSignature.Builder builder = new JvmFieldSignature.Builder();
                        builder.h(jvmFieldSignature);
                        builder.h(jvmFieldSignature2);
                        this.Z = builder.g();
                    }
                    this.f44141Y |= 1;
                }
                if ((jvmPropertySignature.f44140Y & 2) == 2) {
                    JvmMethodSignature jvmMethodSignature5 = jvmPropertySignature.e0;
                    if ((this.f44141Y & 2) != 2 || (jvmMethodSignature4 = this.e0) == JvmMethodSignature.h0) {
                        this.e0 = jvmMethodSignature5;
                    } else {
                        JvmMethodSignature.Builder builderE = JvmMethodSignature.e(jvmMethodSignature4);
                        builderE.h(jvmMethodSignature5);
                        this.e0 = builderE.g();
                    }
                    this.f44141Y |= 2;
                }
                if ((jvmPropertySignature.f44140Y & 4) == 4) {
                    JvmMethodSignature jvmMethodSignature6 = jvmPropertySignature.f0;
                    if ((this.f44141Y & 4) != 4 || (jvmMethodSignature3 = this.f0) == JvmMethodSignature.h0) {
                        this.f0 = jvmMethodSignature6;
                    } else {
                        JvmMethodSignature.Builder builderE2 = JvmMethodSignature.e(jvmMethodSignature3);
                        builderE2.h(jvmMethodSignature6);
                        this.f0 = builderE2.g();
                    }
                    this.f44141Y |= 4;
                }
                if ((jvmPropertySignature.f44140Y & 8) == 8) {
                    JvmMethodSignature jvmMethodSignature7 = jvmPropertySignature.g0;
                    if ((this.f44141Y & 8) != 8 || (jvmMethodSignature2 = this.g0) == JvmMethodSignature.h0) {
                        this.g0 = jvmMethodSignature7;
                    } else {
                        JvmMethodSignature.Builder builderE3 = JvmMethodSignature.e(jvmMethodSignature2);
                        builderE3.h(jvmMethodSignature7);
                        this.g0 = builderE3.g();
                    }
                    this.f44141Y |= 8;
                }
                if ((jvmPropertySignature.f44140Y & 16) == 16) {
                    JvmMethodSignature jvmMethodSignature8 = jvmPropertySignature.h0;
                    if ((this.f44141Y & 16) != 16 || (jvmMethodSignature = this.h0) == JvmMethodSignature.h0) {
                        this.h0 = jvmMethodSignature8;
                    } else {
                        JvmMethodSignature.Builder builderE4 = JvmMethodSignature.e(jvmMethodSignature);
                        builderE4.h(jvmMethodSignature8);
                        this.h0 = builderE4.g();
                    }
                    this.f44141Y |= 16;
                }
                this.X = this.X.c(jvmPropertySignature.X);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void k(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                JvmPropertySignature jvmPropertySignature = null;
                try {
                    try {
                        ((AnonymousClass1) JvmPropertySignature.l0).getClass();
                        j(new JvmPropertySignature(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e2) {
                        JvmPropertySignature jvmPropertySignature2 = (JvmPropertySignature) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            jvmPropertySignature = jvmPropertySignature2;
                            if (jvmPropertySignature != null) {
                                j(jvmPropertySignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (jvmPropertySignature != null) {
                        j(jvmPropertySignature);
                    }
                    throw th;
                }
            }
        }

        static {
            JvmPropertySignature jvmPropertySignature = new JvmPropertySignature();
            k0 = jvmPropertySignature;
            jvmPropertySignature.Z = JvmFieldSignature.h0;
            JvmMethodSignature jvmMethodSignature = JvmMethodSignature.h0;
            jvmPropertySignature.e0 = jvmMethodSignature;
            jvmPropertySignature.f0 = jvmMethodSignature;
            jvmPropertySignature.g0 = jvmMethodSignature;
            jvmPropertySignature.h0 = jvmMethodSignature;
        }

        public JvmPropertySignature() {
            this.i0 = (byte) -1;
            this.j0 = -1;
            this.X = ByteString.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f44140Y & 1) == 1) {
                codedOutputStream.o(1, this.Z);
            }
            if ((this.f44140Y & 2) == 2) {
                codedOutputStream.o(2, this.e0);
            }
            if ((this.f44140Y & 4) == 4) {
                codedOutputStream.o(3, this.f0);
            }
            if ((this.f44140Y & 8) == 8) {
                codedOutputStream.o(4, this.g0);
            }
            if ((this.f44140Y & 16) == 16) {
                codedOutputStream.o(5, this.h0);
            }
            codedOutputStream.r(this.X);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.j0;
            if (i2 != -1) {
                return i2;
            }
            int iD = (this.f44140Y & 1) == 1 ? CodedOutputStream.d(1, this.Z) : 0;
            if ((this.f44140Y & 2) == 2) {
                iD += CodedOutputStream.d(2, this.e0);
            }
            if ((this.f44140Y & 4) == 4) {
                iD += CodedOutputStream.d(3, this.f0);
            }
            if ((this.f44140Y & 8) == 8) {
                iD += CodedOutputStream.d(4, this.g0);
            }
            if ((this.f44140Y & 16) == 16) {
                iD += CodedOutputStream.d(5, this.h0);
            }
            int size = this.X.size() + iD;
            this.j0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            if (this.i0 == 1) {
                return true;
            }
            this.i0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.i();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderI = Builder.i();
            builderI.j(this);
            return builderI;
        }

        public JvmPropertySignature(Builder builder) {
            this.i0 = (byte) -1;
            this.j0 = -1;
            this.X = builder.X;
        }

        public JvmPropertySignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.i0 = (byte) -1;
            this.j0 = -1;
            this.Z = JvmFieldSignature.h0;
            JvmMethodSignature jvmMethodSignature = JvmMethodSignature.h0;
            this.e0 = jvmMethodSignature;
            this.f0 = jvmMethodSignature;
            this.g0 = jvmMethodSignature;
            this.h0 = jvmMethodSignature;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z2 = false;
            while (!z2) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            JvmMethodSignature.Builder builderE = null;
                            JvmFieldSignature.Builder builder = null;
                            JvmMethodSignature.Builder builderE2 = null;
                            JvmMethodSignature.Builder builderE3 = null;
                            JvmMethodSignature.Builder builderE4 = null;
                            if (iN == 10) {
                                if ((this.f44140Y & 1) == 1) {
                                    JvmFieldSignature jvmFieldSignature = this.Z;
                                    jvmFieldSignature.getClass();
                                    builder = new JvmFieldSignature.Builder();
                                    builder.h(jvmFieldSignature);
                                }
                                JvmFieldSignature jvmFieldSignature2 = (JvmFieldSignature) codedInputStream.g(JvmFieldSignature.i0, extensionRegistryLite);
                                this.Z = jvmFieldSignature2;
                                if (builder != null) {
                                    builder.h(jvmFieldSignature2);
                                    this.Z = builder.g();
                                }
                                this.f44140Y |= 1;
                            } else if (iN == 18) {
                                if ((this.f44140Y & 2) == 2) {
                                    JvmMethodSignature jvmMethodSignature2 = this.e0;
                                    jvmMethodSignature2.getClass();
                                    builderE2 = JvmMethodSignature.e(jvmMethodSignature2);
                                }
                                JvmMethodSignature jvmMethodSignature3 = (JvmMethodSignature) codedInputStream.g(JvmMethodSignature.i0, extensionRegistryLite);
                                this.e0 = jvmMethodSignature3;
                                if (builderE2 != null) {
                                    builderE2.h(jvmMethodSignature3);
                                    this.e0 = builderE2.g();
                                }
                                this.f44140Y |= 2;
                            } else if (iN == 26) {
                                if ((this.f44140Y & 4) == 4) {
                                    JvmMethodSignature jvmMethodSignature4 = this.f0;
                                    jvmMethodSignature4.getClass();
                                    builderE3 = JvmMethodSignature.e(jvmMethodSignature4);
                                }
                                JvmMethodSignature jvmMethodSignature5 = (JvmMethodSignature) codedInputStream.g(JvmMethodSignature.i0, extensionRegistryLite);
                                this.f0 = jvmMethodSignature5;
                                if (builderE3 != null) {
                                    builderE3.h(jvmMethodSignature5);
                                    this.f0 = builderE3.g();
                                }
                                this.f44140Y |= 4;
                            } else if (iN == 34) {
                                if ((this.f44140Y & 8) == 8) {
                                    JvmMethodSignature jvmMethodSignature6 = this.g0;
                                    jvmMethodSignature6.getClass();
                                    builderE4 = JvmMethodSignature.e(jvmMethodSignature6);
                                }
                                JvmMethodSignature jvmMethodSignature7 = (JvmMethodSignature) codedInputStream.g(JvmMethodSignature.i0, extensionRegistryLite);
                                this.g0 = jvmMethodSignature7;
                                if (builderE4 != null) {
                                    builderE4.h(jvmMethodSignature7);
                                    this.g0 = builderE4.g();
                                }
                                this.f44140Y |= 8;
                            } else if (iN != 42) {
                                if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                }
                            } else {
                                if ((this.f44140Y & 16) == 16) {
                                    JvmMethodSignature jvmMethodSignature8 = this.h0;
                                    jvmMethodSignature8.getClass();
                                    builderE = JvmMethodSignature.e(jvmMethodSignature8);
                                }
                                JvmMethodSignature jvmMethodSignature9 = (JvmMethodSignature) codedInputStream.g(JvmMethodSignature.i0, extensionRegistryLite);
                                this.h0 = jvmMethodSignature9;
                                if (builderE != null) {
                                    builderE.h(jvmMethodSignature9);
                                    this.h0 = builderE.g();
                                }
                                this.f44140Y |= 16;
                            }
                        }
                        z2 = true;
                    } catch (InvalidProtocolBufferException e2) {
                        e2.X = this;
                        throw e2;
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                        invalidProtocolBufferException.X = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.X = output.h();
                    }
                    throw th;
                }
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.X = output.h();
            }
        }
    }

    public static final class StringTableTypes extends GeneratedMessageLite implements StringTableTypesOrBuilder {
        public static final StringTableTypes h0;
        public static final Parser i0 = new AnonymousClass1();
        public final ByteString X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public List f44142Y;
        public List Z;
        public int e0;
        public byte f0;
        public int g0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<StringTableTypes> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new StringTableTypes(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<StringTableTypes, Builder> implements StringTableTypesOrBuilder {

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f44143Y;
            public List Z;
            public List e0;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                StringTableTypes stringTableTypesG = g();
                stringTableTypesG.isInitialized();
                return stringTableTypesG;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder c() {
                Builder builder = new Builder();
                List list = Collections.EMPTY_LIST;
                builder.Z = list;
                builder.e0 = list;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object c() {
                Builder builder = new Builder();
                List list = Collections.EMPTY_LIST;
                builder.Z = list;
                builder.e0 = list;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final GeneratedMessageLite.Builder c() {
                Builder builder = new Builder();
                List list = Collections.EMPTY_LIST;
                builder.Z = list;
                builder.e0 = list;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                h((StringTableTypes) generatedMessageLite);
                return this;
            }

            public final StringTableTypes g() {
                StringTableTypes stringTableTypes = new StringTableTypes(this);
                if ((this.f44143Y & 1) == 1) {
                    this.Z = Collections.unmodifiableList(this.Z);
                    this.f44143Y &= -2;
                }
                stringTableTypes.f44142Y = this.Z;
                if ((this.f44143Y & 2) == 2) {
                    this.e0 = Collections.unmodifiableList(this.e0);
                    this.f44143Y &= -3;
                }
                stringTableTypes.Z = this.e0;
                return stringTableTypes;
            }

            public final void h(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.h0) {
                    return;
                }
                if (!stringTableTypes.f44142Y.isEmpty()) {
                    if (this.Z.isEmpty()) {
                        this.Z = stringTableTypes.f44142Y;
                        this.f44143Y &= -2;
                    } else {
                        if ((this.f44143Y & 1) != 1) {
                            this.Z = new ArrayList(this.Z);
                            this.f44143Y |= 1;
                        }
                        this.Z.addAll(stringTableTypes.f44142Y);
                    }
                }
                if (!stringTableTypes.Z.isEmpty()) {
                    if (this.e0.isEmpty()) {
                        this.e0 = stringTableTypes.Z;
                        this.f44143Y &= -3;
                    } else {
                        if ((this.f44143Y & 2) != 2) {
                            this.e0 = new ArrayList(this.e0);
                            this.f44143Y |= 2;
                        }
                        this.e0.addAll(stringTableTypes.Z);
                    }
                }
                this.X = this.X.c(stringTableTypes.X);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                StringTableTypes stringTableTypes = null;
                try {
                    try {
                        ((AnonymousClass1) StringTableTypes.i0).getClass();
                        h(new StringTableTypes(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e2) {
                        StringTableTypes stringTableTypes2 = (StringTableTypes) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            stringTableTypes = stringTableTypes2;
                            if (stringTableTypes != null) {
                                h(stringTableTypes);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (stringTableTypes != null) {
                        h(stringTableTypes);
                    }
                    throw th;
                }
            }
        }

        public interface RecordOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            StringTableTypes stringTableTypes = new StringTableTypes();
            h0 = stringTableTypes;
            List list = Collections.EMPTY_LIST;
            stringTableTypes.f44142Y = list;
            stringTableTypes.Z = list;
        }

        public StringTableTypes() {
            this.e0 = -1;
            this.f0 = (byte) -1;
            this.g0 = -1;
            this.X = ByteString.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i2 = 0; i2 < this.f44142Y.size(); i2++) {
                codedOutputStream.o(1, (MessageLite) this.f44142Y.get(i2));
            }
            if (this.Z.size() > 0) {
                codedOutputStream.v(42);
                codedOutputStream.v(this.e0);
            }
            for (int i3 = 0; i3 < this.Z.size(); i3++) {
                codedOutputStream.n(((Integer) this.Z.get(i3)).intValue());
            }
            codedOutputStream.r(this.X);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.g0;
            if (i2 != -1) {
                return i2;
            }
            int iD = 0;
            for (int i3 = 0; i3 < this.f44142Y.size(); i3++) {
                iD += CodedOutputStream.d(1, (MessageLite) this.f44142Y.get(i3));
            }
            int iC = 0;
            for (int i4 = 0; i4 < this.Z.size(); i4++) {
                iC += CodedOutputStream.c(((Integer) this.Z.get(i4)).intValue());
            }
            int iC2 = iD + iC;
            if (!this.Z.isEmpty()) {
                iC2 = iC2 + 1 + CodedOutputStream.c(iC);
            }
            this.e0 = iC;
            int size = this.X.size() + iC2;
            this.g0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            if (this.f0 == 1) {
                return true;
            }
            this.f0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            Builder builder = new Builder();
            List list = Collections.EMPTY_LIST;
            builder.Z = list;
            builder.e0 = list;
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builder = new Builder();
            List list = Collections.EMPTY_LIST;
            builder.Z = list;
            builder.e0 = list;
            builder.h(this);
            return builder;
        }

        public static final class Record extends GeneratedMessageLite implements RecordOrBuilder {
            public static final Record n0;
            public static final Parser o0 = new AnonymousClass1();
            public final ByteString X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f44144Y;
            public int Z;
            public int e0;
            public Object f0;
            public Operation g0;
            public List h0;
            public int i0;
            public List j0;
            public int k0;
            public byte l0;
            public int m0;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$1, reason: invalid class name */
            public static class AnonymousClass1 extends AbstractParser<Record> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new Record(codedInputStream);
                }
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Record, Builder> implements RecordOrBuilder {

                /* JADX INFO: renamed from: Y, reason: collision with root package name */
                public int f44145Y;
                public int Z;
                public int e0;
                public Object f0;
                public Operation g0;
                public List h0;
                public List i0;

                public static Builder i() {
                    Builder builder = new Builder();
                    builder.Z = 1;
                    builder.f0 = "";
                    builder.g0 = Operation.NONE;
                    List list = Collections.EMPTY_LIST;
                    builder.h0 = list;
                    builder.i0 = list;
                    return builder;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    k(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final MessageLite build() {
                    Record recordG = g();
                    recordG.isInitialized();
                    return recordG;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                public final AbstractMessageLite.Builder c() {
                    Builder builderI = i();
                    builderI.j(g());
                    return builderI;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public final Object c() {
                    Builder builderI = i();
                    builderI.j(g());
                    return builderI;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: d */
                public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    k(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* JADX INFO: renamed from: e */
                public final GeneratedMessageLite.Builder c() {
                    Builder builderI = i();
                    builderI.j(g());
                    return builderI;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                    j((Record) generatedMessageLite);
                    return this;
                }

                public final Record g() {
                    Record record = new Record(this);
                    int i2 = this.f44145Y;
                    int i3 = (i2 & 1) != 1 ? 0 : 1;
                    record.Z = this.Z;
                    if ((i2 & 2) == 2) {
                        i3 |= 2;
                    }
                    record.e0 = this.e0;
                    if ((i2 & 4) == 4) {
                        i3 |= 4;
                    }
                    record.f0 = this.f0;
                    if ((i2 & 8) == 8) {
                        i3 |= 8;
                    }
                    record.g0 = this.g0;
                    if ((i2 & 16) == 16) {
                        this.h0 = Collections.unmodifiableList(this.h0);
                        this.f44145Y &= -17;
                    }
                    record.h0 = this.h0;
                    if ((this.f44145Y & 32) == 32) {
                        this.i0 = Collections.unmodifiableList(this.i0);
                        this.f44145Y &= -33;
                    }
                    record.j0 = this.i0;
                    record.f44144Y = i3;
                    return record;
                }

                public final void j(Record record) {
                    if (record == Record.n0) {
                        return;
                    }
                    int i2 = record.f44144Y;
                    if ((i2 & 1) == 1) {
                        int i3 = record.Z;
                        this.f44145Y = 1 | this.f44145Y;
                        this.Z = i3;
                    }
                    if ((i2 & 2) == 2) {
                        int i4 = record.e0;
                        this.f44145Y = 2 | this.f44145Y;
                        this.e0 = i4;
                    }
                    if ((i2 & 4) == 4) {
                        this.f44145Y |= 4;
                        this.f0 = record.f0;
                    }
                    if ((i2 & 8) == 8) {
                        Operation operation = record.g0;
                        operation.getClass();
                        this.f44145Y = 8 | this.f44145Y;
                        this.g0 = operation;
                    }
                    if (!record.h0.isEmpty()) {
                        if (this.h0.isEmpty()) {
                            this.h0 = record.h0;
                            this.f44145Y &= -17;
                        } else {
                            if ((this.f44145Y & 16) != 16) {
                                this.h0 = new ArrayList(this.h0);
                                this.f44145Y |= 16;
                            }
                            this.h0.addAll(record.h0);
                        }
                    }
                    if (!record.j0.isEmpty()) {
                        if (this.i0.isEmpty()) {
                            this.i0 = record.j0;
                            this.f44145Y &= -33;
                        } else {
                            if ((this.f44145Y & 32) != 32) {
                                this.i0 = new ArrayList(this.i0);
                                this.f44145Y |= 32;
                            }
                            this.i0.addAll(record.j0);
                        }
                    }
                    this.X = this.X.c(record.X);
                }

                /* JADX WARN: Code duplicated, block: B:14:0x001d  */
                public final void k(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Record record = null;
                    try {
                        try {
                            ((AnonymousClass1) Record.o0).getClass();
                            j(new Record(codedInputStream));
                        } catch (InvalidProtocolBufferException e2) {
                            Record record2 = (Record) e2.X;
                            try {
                                throw e2;
                            } catch (Throwable th) {
                                th = th;
                                record = record2;
                                if (record != null) {
                                    j(record);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (record != null) {
                            j(record);
                        }
                        throw th;
                    }
                }
            }

            public enum Operation implements Internal.EnumLite {
                NONE(0),
                INTERNAL_TO_CLASS_ID(1),
                DESC_TO_CLASS_ID(2);

                public final int X;

                /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$Operation$1, reason: invalid class name */
                public static class AnonymousClass1 implements Internal.EnumLiteMap<Operation> {
                }

                Operation(int i2) {
                    this.X = i2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.X;
                }
            }

            static {
                Record record = new Record();
                n0 = record;
                record.Z = 1;
                record.e0 = 0;
                record.f0 = "";
                record.g0 = Operation.NONE;
                List list = Collections.EMPTY_LIST;
                record.h0 = list;
                record.j0 = list;
            }

            public Record() {
                this.i0 = -1;
                this.k0 = -1;
                this.l0 = (byte) -1;
                this.m0 = -1;
                this.X = ByteString.X;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final void b(CodedOutputStream codedOutputStream) {
                ByteString byteStringD;
                getSerializedSize();
                if ((this.f44144Y & 1) == 1) {
                    codedOutputStream.m(1, this.Z);
                }
                if ((this.f44144Y & 2) == 2) {
                    codedOutputStream.m(2, this.e0);
                }
                if ((this.f44144Y & 8) == 8) {
                    codedOutputStream.l(3, this.g0.X);
                }
                if (this.h0.size() > 0) {
                    codedOutputStream.v(34);
                    codedOutputStream.v(this.i0);
                }
                for (int i2 = 0; i2 < this.h0.size(); i2++) {
                    codedOutputStream.n(((Integer) this.h0.get(i2)).intValue());
                }
                if (this.j0.size() > 0) {
                    codedOutputStream.v(42);
                    codedOutputStream.v(this.k0);
                }
                for (int i3 = 0; i3 < this.j0.size(); i3++) {
                    codedOutputStream.n(((Integer) this.j0.get(i3)).intValue());
                }
                if ((this.f44144Y & 4) == 4) {
                    Object obj = this.f0;
                    if (obj instanceof String) {
                        byteStringD = ByteString.d((String) obj);
                        this.f0 = byteStringD;
                    } else {
                        byteStringD = (ByteString) obj;
                    }
                    codedOutputStream.x(6, 2);
                    codedOutputStream.v(byteStringD.size());
                    codedOutputStream.r(byteStringD);
                }
                codedOutputStream.r(this.X);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final int getSerializedSize() {
                ByteString byteStringD;
                int i2 = this.m0;
                if (i2 != -1) {
                    return i2;
                }
                int iB = (this.f44144Y & 1) == 1 ? CodedOutputStream.b(1, this.Z) : 0;
                if ((this.f44144Y & 2) == 2) {
                    iB += CodedOutputStream.b(2, this.e0);
                }
                if ((this.f44144Y & 8) == 8) {
                    iB += CodedOutputStream.a(3, this.g0.X);
                }
                int iC = 0;
                for (int i3 = 0; i3 < this.h0.size(); i3++) {
                    iC += CodedOutputStream.c(((Integer) this.h0.get(i3)).intValue());
                }
                int iC2 = iB + iC;
                if (!this.h0.isEmpty()) {
                    iC2 = iC2 + 1 + CodedOutputStream.c(iC);
                }
                this.i0 = iC;
                int iC3 = 0;
                for (int i4 = 0; i4 < this.j0.size(); i4++) {
                    iC3 += CodedOutputStream.c(((Integer) this.j0.get(i4)).intValue());
                }
                int size = iC2 + iC3;
                if (!this.j0.isEmpty()) {
                    size = size + 1 + CodedOutputStream.c(iC3);
                }
                this.k0 = iC3;
                if ((this.f44144Y & 4) == 4) {
                    Object obj = this.f0;
                    if (obj instanceof String) {
                        byteStringD = ByteString.d((String) obj);
                        this.f0 = byteStringD;
                    } else {
                        byteStringD = (ByteString) obj;
                    }
                    size += byteStringD.size() + CodedOutputStream.f(byteStringD.size()) + CodedOutputStream.h(6);
                }
                int size2 = this.X.size() + size;
                this.m0 = size2;
                return size2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (this.l0 == 1) {
                    return true;
                }
                this.l0 = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final MessageLite.Builder newBuilderForType() {
                return Builder.i();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final MessageLite.Builder toBuilder() {
                Builder builderI = Builder.i();
                builderI.j(this);
                return builderI;
            }

            public Record(Builder builder) {
                this.i0 = -1;
                this.k0 = -1;
                this.l0 = (byte) -1;
                this.m0 = -1;
                this.X = builder.X;
            }

            public Record(CodedInputStream codedInputStream) {
                Operation operation;
                this.i0 = -1;
                this.k0 = -1;
                this.l0 = (byte) -1;
                this.m0 = -1;
                this.Z = 1;
                boolean z2 = false;
                this.e0 = 0;
                this.f0 = "";
                Operation operation2 = Operation.NONE;
                this.g0 = operation2;
                List list = Collections.EMPTY_LIST;
                this.h0 = list;
                this.j0 = list;
                ByteString.Output output = new ByteString.Output();
                CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
                int i2 = 0;
                while (!z2) {
                    try {
                        try {
                            try {
                                int iN = codedInputStream.n();
                                if (iN != 0) {
                                    if (iN == 8) {
                                        this.f44144Y |= 1;
                                        this.Z = codedInputStream.k();
                                    } else if (iN == 16) {
                                        this.f44144Y |= 2;
                                        this.e0 = codedInputStream.k();
                                    } else if (iN == 24) {
                                        int iK = codedInputStream.k();
                                        if (iK == 0) {
                                            operation = operation2;
                                        } else if (iK != 1) {
                                            operation = iK != 2 ? null : Operation.DESC_TO_CLASS_ID;
                                        } else {
                                            operation = Operation.INTERNAL_TO_CLASS_ID;
                                        }
                                        if (operation == null) {
                                            codedOutputStreamJ.v(iN);
                                            codedOutputStreamJ.v(iK);
                                        } else {
                                            this.f44144Y |= 8;
                                            this.g0 = operation;
                                        }
                                    } else if (iN == 32) {
                                        if ((i2 & 16) != 16) {
                                            this.h0 = new ArrayList();
                                            i2 |= 16;
                                        }
                                        this.h0.add(Integer.valueOf(codedInputStream.k()));
                                    } else if (iN == 34) {
                                        int iD = codedInputStream.d(codedInputStream.k());
                                        if ((i2 & 16) != 16 && codedInputStream.b() > 0) {
                                            this.h0 = new ArrayList();
                                            i2 |= 16;
                                        }
                                        while (codedInputStream.b() > 0) {
                                            this.h0.add(Integer.valueOf(codedInputStream.k()));
                                        }
                                        codedInputStream.c(iD);
                                    } else if (iN == 40) {
                                        if ((i2 & 32) != 32) {
                                            this.j0 = new ArrayList();
                                            i2 |= 32;
                                        }
                                        this.j0.add(Integer.valueOf(codedInputStream.k()));
                                    } else if (iN == 42) {
                                        int iD2 = codedInputStream.d(codedInputStream.k());
                                        if ((i2 & 32) != 32 && codedInputStream.b() > 0) {
                                            this.j0 = new ArrayList();
                                            i2 |= 32;
                                        }
                                        while (codedInputStream.b() > 0) {
                                            this.j0.add(Integer.valueOf(codedInputStream.k()));
                                        }
                                        codedInputStream.c(iD2);
                                    } else if (iN != 50) {
                                        if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                        }
                                    } else {
                                        ByteString byteStringE = codedInputStream.e();
                                        this.f44144Y |= 4;
                                        this.f0 = byteStringE;
                                    }
                                }
                                z2 = true;
                            } catch (IOException e2) {
                                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                                invalidProtocolBufferException.X = this;
                                throw invalidProtocolBufferException;
                            }
                        } catch (InvalidProtocolBufferException e3) {
                            e3.X = this;
                            throw e3;
                        }
                    } catch (Throwable th) {
                        if ((i2 & 16) == 16) {
                            this.h0 = Collections.unmodifiableList(this.h0);
                        }
                        if ((i2 & 32) == 32) {
                            this.j0 = Collections.unmodifiableList(this.j0);
                        }
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } finally {
                            this.X = output.h();
                        }
                        throw th;
                    }
                }
                if ((i2 & 16) == 16) {
                    this.h0 = Collections.unmodifiableList(this.h0);
                }
                if ((i2 & 32) == 32) {
                    this.j0 = Collections.unmodifiableList(this.j0);
                }
                try {
                    codedOutputStreamJ.i();
                } catch (IOException unused2) {
                } finally {
                    this.X = output.h();
                }
            }
        }

        public StringTableTypes(Builder builder) {
            this.e0 = -1;
            this.f0 = (byte) -1;
            this.g0 = -1;
            this.X = builder.X;
        }

        public StringTableTypes(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.e0 = -1;
            this.f0 = (byte) -1;
            this.g0 = -1;
            List list = Collections.EMPTY_LIST;
            this.f44142Y = list;
            this.Z = list;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN == 10) {
                                if ((i2 & 1) != 1) {
                                    this.f44142Y = new ArrayList();
                                    i2 |= 1;
                                }
                                this.f44142Y.add(codedInputStream.g(Record.o0, extensionRegistryLite));
                            } else if (iN == 40) {
                                if ((i2 & 2) != 2) {
                                    this.Z = new ArrayList();
                                    i2 |= 2;
                                }
                                this.Z.add(Integer.valueOf(codedInputStream.k()));
                            } else if (iN != 42) {
                                if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                }
                            } else {
                                int iD = codedInputStream.d(codedInputStream.k());
                                if ((i2 & 2) != 2 && codedInputStream.b() > 0) {
                                    this.Z = new ArrayList();
                                    i2 |= 2;
                                }
                                while (codedInputStream.b() > 0) {
                                    this.Z.add(Integer.valueOf(codedInputStream.k()));
                                }
                                codedInputStream.c(iD);
                            }
                        }
                        z2 = true;
                    } catch (InvalidProtocolBufferException e2) {
                        e2.X = this;
                        throw e2;
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                        invalidProtocolBufferException.X = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    if ((i2 & 1) == 1) {
                        this.f44142Y = Collections.unmodifiableList(this.f44142Y);
                    }
                    if ((i2 & 2) == 2) {
                        this.Z = Collections.unmodifiableList(this.Z);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.X = output.h();
                    }
                    throw th;
                }
            }
            if ((i2 & 1) == 1) {
                this.f44142Y = Collections.unmodifiableList(this.f44142Y);
            }
            if ((i2 & 2) == 2) {
                this.Z = Collections.unmodifiableList(this.Z);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.X = output.h();
            }
        }
    }
}
