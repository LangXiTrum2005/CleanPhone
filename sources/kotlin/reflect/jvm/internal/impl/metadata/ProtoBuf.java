package kotlin.reflect.jvm.internal.impl.metadata;

import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.p004ironsource.mediationsdk.metadata.a;
import com.smartdigimkt.sdk.basead.ui.animplayerview.scale.AlbumScaleMainView;
import com.thinkup.core.common.n.mo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes7.dex */
public final class ProtoBuf {

    public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
    }

    public interface ClassOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface ConstructorOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface ContractOrBuilder extends MessageLiteOrBuilder {
    }

    public interface EffectOrBuilder extends MessageLiteOrBuilder {
    }

    public interface EnumEntryOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface ExpressionOrBuilder extends MessageLiteOrBuilder {
    }

    public interface FunctionOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public enum MemberKind implements Internal.EnumLite {
        /* JADX INFO: Fake field, exist only in values array */
        DECLARATION(0),
        /* JADX INFO: Fake field, exist only in values array */
        FAKE_OVERRIDE(1),
        /* JADX INFO: Fake field, exist only in values array */
        DELEGATION(2),
        /* JADX INFO: Fake field, exist only in values array */
        SYNTHESIZED(3);

        public final int X;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind$1, reason: invalid class name */
        public static class AnonymousClass1 implements Internal.EnumLiteMap<MemberKind> {
        }

        MemberKind(int i2) {
            this.X = i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.X;
        }
    }

    public enum Modality implements Internal.EnumLite {
        /* JADX INFO: Fake field, exist only in values array */
        FINAL(0),
        /* JADX INFO: Fake field, exist only in values array */
        OPEN(1),
        /* JADX INFO: Fake field, exist only in values array */
        ABSTRACT(2),
        /* JADX INFO: Fake field, exist only in values array */
        SEALED(3);

        public final int X;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality$1, reason: invalid class name */
        public static class AnonymousClass1 implements Internal.EnumLiteMap<Modality> {
        }

        Modality(int i2) {
            this.X = i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.X;
        }
    }

    public interface PackageFragmentOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PackageOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PropertyOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface QualifiedNameTableOrBuilder extends MessageLiteOrBuilder {
    }

    public interface StringTableOrBuilder extends MessageLiteOrBuilder {
    }

    public interface TypeAliasOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeTableOrBuilder extends MessageLiteOrBuilder {
    }

    public interface ValueParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface VersionRequirementOrBuilder extends MessageLiteOrBuilder {
    }

    public interface VersionRequirementTableOrBuilder extends MessageLiteOrBuilder {
    }

    public enum Visibility implements Internal.EnumLite {
        /* JADX INFO: Fake field, exist only in values array */
        INTERNAL(0),
        /* JADX INFO: Fake field, exist only in values array */
        PRIVATE(1),
        /* JADX INFO: Fake field, exist only in values array */
        PROTECTED(2),
        /* JADX INFO: Fake field, exist only in values array */
        PUBLIC(3),
        /* JADX INFO: Fake field, exist only in values array */
        PRIVATE_TO_THIS(4),
        /* JADX INFO: Fake field, exist only in values array */
        LOCAL(5);

        public final int X;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility$1, reason: invalid class name */
        public static class AnonymousClass1 implements Internal.EnumLiteMap<Visibility> {
        }

        Visibility(int i2) {
            this.X = i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.X;
        }
    }

    public static final class Annotation extends GeneratedMessageLite implements AnnotationOrBuilder {
        public static final Annotation h0;
        public static final Parser i0 = new AnonymousClass1();
        public final ByteString X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f44041Y;
        public int Z;
        public List e0;
        public byte f0;
        public int g0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<Annotation> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Annotation(codedInputStream, extensionRegistryLite);
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f44047Y;
            public int Z;
            public List e0;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Annotation annotationG = g();
                if (annotationG.isInitialized()) {
                    return annotationG;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder c() {
                Builder builder = new Builder();
                builder.e0 = Collections.EMPTY_LIST;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object c() {
                Builder builder = new Builder();
                builder.e0 = Collections.EMPTY_LIST;
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
                builder.e0 = Collections.EMPTY_LIST;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                h((Annotation) generatedMessageLite);
                return this;
            }

            public final Annotation g() {
                Annotation annotation = new Annotation(this);
                int i2 = this.f44047Y;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                annotation.Z = this.Z;
                if ((i2 & 2) == 2) {
                    this.e0 = Collections.unmodifiableList(this.e0);
                    this.f44047Y &= -3;
                }
                annotation.e0 = this.e0;
                annotation.f44041Y = i3;
                return annotation;
            }

            public final void h(Annotation annotation) {
                if (annotation == Annotation.h0) {
                    return;
                }
                if ((annotation.f44041Y & 1) == 1) {
                    int i2 = annotation.Z;
                    this.f44047Y = 1 | this.f44047Y;
                    this.Z = i2;
                }
                if (!annotation.e0.isEmpty()) {
                    if (this.e0.isEmpty()) {
                        this.e0 = annotation.e0;
                        this.f44047Y &= -3;
                    } else {
                        if ((this.f44047Y & 2) != 2) {
                            this.e0 = new ArrayList(this.e0);
                            this.f44047Y |= 2;
                        }
                        this.e0.addAll(annotation.e0);
                    }
                }
                this.X = this.X.c(annotation.X);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001b  */
            public final void i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Annotation annotation = null;
                try {
                    try {
                        h((Annotation) ((AnonymousClass1) Annotation.i0).a(codedInputStream, extensionRegistryLite));
                    } catch (Throwable th) {
                        th = th;
                        if (annotation != null) {
                            h(annotation);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    Annotation annotation2 = (Annotation) e2.X;
                    try {
                        throw e2;
                    } catch (Throwable th2) {
                        th = th2;
                        annotation = annotation2;
                        if (annotation != null) {
                            h(annotation);
                        }
                        throw th;
                    }
                }
            }
        }

        static {
            Annotation annotation = new Annotation();
            h0 = annotation;
            annotation.Z = 0;
            annotation.e0 = Collections.EMPTY_LIST;
        }

        public Annotation() {
            this.f0 = (byte) -1;
            this.g0 = -1;
            this.X = ByteString.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f44041Y & 1) == 1) {
                codedOutputStream.m(1, this.Z);
            }
            for (int i2 = 0; i2 < this.e0.size(); i2++) {
                codedOutputStream.o(2, (MessageLite) this.e0.get(i2));
            }
            codedOutputStream.r(this.X);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.g0;
            if (i2 != -1) {
                return i2;
            }
            int iB = (this.f44041Y & 1) == 1 ? CodedOutputStream.b(1, this.Z) : 0;
            for (int i3 = 0; i3 < this.e0.size(); i3++) {
                iB += CodedOutputStream.d(2, (MessageLite) this.e0.get(i3));
            }
            int size = this.X.size() + iB;
            this.g0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.f0;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if ((this.f44041Y & 1) != 1) {
                this.f0 = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < this.e0.size(); i2++) {
                if (!((Argument) this.e0.get(i2)).isInitialized()) {
                    this.f0 = (byte) 0;
                    return false;
                }
            }
            this.f0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            Builder builder = new Builder();
            builder.e0 = Collections.EMPTY_LIST;
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builder = new Builder();
            builder.e0 = Collections.EMPTY_LIST;
            builder.h(this);
            return builder;
        }

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static final Argument h0;
            public static final Parser i0 = new AnonymousClass1();
            public final ByteString X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f44042Y;
            public int Z;
            public Value e0;
            public byte f0;
            public int g0;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$1, reason: invalid class name */
            public static class AnonymousClass1 extends AbstractParser<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {

                /* JADX INFO: renamed from: Y, reason: collision with root package name */
                public int f44043Y;
                public int Z;
                public Value e0;

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    i(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final MessageLite build() {
                    Argument argumentG = g();
                    if (argumentG.isInitialized()) {
                        return argumentG;
                    }
                    throw new UninitializedMessageException();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                public final AbstractMessageLite.Builder c() {
                    Builder builder = new Builder();
                    builder.e0 = Value.q0;
                    builder.h(g());
                    return builder;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public final Object c() {
                    Builder builder = new Builder();
                    builder.e0 = Value.q0;
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
                    builder.e0 = Value.q0;
                    builder.h(g());
                    return builder;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                    h((Argument) generatedMessageLite);
                    return this;
                }

                public final Argument g() {
                    Argument argument = new Argument(this);
                    int i2 = this.f44043Y;
                    int i3 = (i2 & 1) != 1 ? 0 : 1;
                    argument.Z = this.Z;
                    if ((i2 & 2) == 2) {
                        i3 |= 2;
                    }
                    argument.e0 = this.e0;
                    argument.f44042Y = i3;
                    return argument;
                }

                public final void h(Argument argument) {
                    Value value;
                    if (argument == Argument.h0) {
                        return;
                    }
                    int i2 = argument.f44042Y;
                    if ((i2 & 1) == 1) {
                        int i3 = argument.Z;
                        this.f44043Y = 1 | this.f44043Y;
                        this.Z = i3;
                    }
                    if ((i2 & 2) == 2) {
                        Value value2 = argument.e0;
                        if ((this.f44043Y & 2) != 2 || (value = this.e0) == Value.q0) {
                            this.e0 = value2;
                        } else {
                            Value.Builder builderI = Value.Builder.i();
                            builderI.j(value);
                            builderI.j(value2);
                            this.e0 = builderI.g();
                        }
                        this.f44043Y |= 2;
                    }
                    this.X = this.X.c(argument.X);
                }

                /* JADX WARN: Code duplicated, block: B:14:0x001d  */
                public final void i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Argument argument = null;
                    try {
                        try {
                            ((AnonymousClass1) Argument.i0).getClass();
                            h(new Argument(codedInputStream, extensionRegistryLite));
                        } catch (InvalidProtocolBufferException e2) {
                            Argument argument2 = (Argument) e2.X;
                            try {
                                throw e2;
                            } catch (Throwable th) {
                                th = th;
                                argument = argument2;
                                if (argument != null) {
                                    h(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (argument != null) {
                            h(argument);
                        }
                        throw th;
                    }
                }
            }

            public interface ValueOrBuilder extends MessageLiteOrBuilder {
            }

            static {
                Argument argument = new Argument();
                h0 = argument;
                argument.Z = 0;
                argument.e0 = Value.q0;
            }

            public Argument() {
                this.f0 = (byte) -1;
                this.g0 = -1;
                this.X = ByteString.X;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final void b(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.f44042Y & 1) == 1) {
                    codedOutputStream.m(1, this.Z);
                }
                if ((this.f44042Y & 2) == 2) {
                    codedOutputStream.o(2, this.e0);
                }
                codedOutputStream.r(this.X);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final int getSerializedSize() {
                int i2 = this.g0;
                if (i2 != -1) {
                    return i2;
                }
                int iB = (this.f44042Y & 1) == 1 ? CodedOutputStream.b(1, this.Z) : 0;
                if ((this.f44042Y & 2) == 2) {
                    iB += CodedOutputStream.d(2, this.e0);
                }
                int size = this.X.size() + iB;
                this.g0 = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b2 = this.f0;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                int i2 = this.f44042Y;
                if ((i2 & 1) != 1) {
                    this.f0 = (byte) 0;
                    return false;
                }
                if ((i2 & 2) != 2) {
                    this.f0 = (byte) 0;
                    return false;
                }
                if (this.e0.isInitialized()) {
                    this.f0 = (byte) 1;
                    return true;
                }
                this.f0 = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final MessageLite.Builder newBuilderForType() {
                Builder builder = new Builder();
                builder.e0 = Value.q0;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final MessageLite.Builder toBuilder() {
                Builder builder = new Builder();
                builder.e0 = Value.q0;
                builder.h(this);
                return builder;
            }

            public static final class Value extends GeneratedMessageLite implements ValueOrBuilder {
                public static final Value q0;
                public static final Parser r0 = new AnonymousClass1();
                public final ByteString X;

                /* JADX INFO: renamed from: Y, reason: collision with root package name */
                public int f44044Y;
                public Type Z;
                public long e0;
                public float f0;
                public double g0;
                public int h0;
                public int i0;
                public int j0;
                public Annotation k0;
                public List l0;
                public int m0;
                public int n0;
                public byte o0;
                public int p0;

                /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$1, reason: invalid class name */
                public static class AnonymousClass1 extends AbstractParser<Value> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                    public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        return new Value(codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {

                    /* JADX INFO: renamed from: Y, reason: collision with root package name */
                    public int f44045Y;
                    public Type Z;
                    public long e0;
                    public float f0;
                    public double g0;
                    public int h0;
                    public int i0;
                    public int j0;
                    public Annotation k0;
                    public List l0;
                    public int m0;
                    public int n0;

                    public static Builder i() {
                        Builder builder = new Builder();
                        builder.Z = Type.BYTE;
                        builder.k0 = Annotation.h0;
                        builder.l0 = Collections.EMPTY_LIST;
                        return builder;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                        k(codedInputStream, extensionRegistryLite);
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    public final MessageLite build() {
                        Value valueG = g();
                        if (valueG.isInitialized()) {
                            return valueG;
                        }
                        throw new UninitializedMessageException();
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
                        j((Value) generatedMessageLite);
                        return this;
                    }

                    public final Value g() {
                        Value value = new Value(this);
                        int i2 = this.f44045Y;
                        int i3 = (i2 & 1) != 1 ? 0 : 1;
                        value.Z = this.Z;
                        if ((i2 & 2) == 2) {
                            i3 |= 2;
                        }
                        value.e0 = this.e0;
                        if ((i2 & 4) == 4) {
                            i3 |= 4;
                        }
                        value.f0 = this.f0;
                        if ((i2 & 8) == 8) {
                            i3 |= 8;
                        }
                        value.g0 = this.g0;
                        if ((i2 & 16) == 16) {
                            i3 |= 16;
                        }
                        value.h0 = this.h0;
                        if ((i2 & 32) == 32) {
                            i3 |= 32;
                        }
                        value.i0 = this.i0;
                        if ((i2 & 64) == 64) {
                            i3 |= 64;
                        }
                        value.j0 = this.j0;
                        if ((i2 & 128) == 128) {
                            i3 |= 128;
                        }
                        value.k0 = this.k0;
                        if ((i2 & 256) == 256) {
                            this.l0 = Collections.unmodifiableList(this.l0);
                            this.f44045Y &= -257;
                        }
                        value.l0 = this.l0;
                        if ((i2 & 512) == 512) {
                            i3 |= 256;
                        }
                        value.m0 = this.m0;
                        if ((i2 & 1024) == 1024) {
                            i3 |= 512;
                        }
                        value.n0 = this.n0;
                        value.f44044Y = i3;
                        return value;
                    }

                    public final void j(Value value) {
                        Annotation annotation;
                        if (value == Value.q0) {
                            return;
                        }
                        if ((value.f44044Y & 1) == 1) {
                            Type type = value.Z;
                            type.getClass();
                            this.f44045Y = 1 | this.f44045Y;
                            this.Z = type;
                        }
                        int i2 = value.f44044Y;
                        if ((i2 & 2) == 2) {
                            long j = value.e0;
                            this.f44045Y |= 2;
                            this.e0 = j;
                        }
                        if ((i2 & 4) == 4) {
                            float f = value.f0;
                            this.f44045Y = 4 | this.f44045Y;
                            this.f0 = f;
                        }
                        if ((i2 & 8) == 8) {
                            double d = value.g0;
                            this.f44045Y |= 8;
                            this.g0 = d;
                        }
                        if ((i2 & 16) == 16) {
                            int i3 = value.h0;
                            this.f44045Y = 16 | this.f44045Y;
                            this.h0 = i3;
                        }
                        if ((i2 & 32) == 32) {
                            int i4 = value.i0;
                            this.f44045Y = 32 | this.f44045Y;
                            this.i0 = i4;
                        }
                        if ((i2 & 64) == 64) {
                            int i5 = value.j0;
                            this.f44045Y = 64 | this.f44045Y;
                            this.j0 = i5;
                        }
                        if ((i2 & 128) == 128) {
                            Annotation annotation2 = value.k0;
                            if ((this.f44045Y & 128) != 128 || (annotation = this.k0) == Annotation.h0) {
                                this.k0 = annotation2;
                            } else {
                                Builder builder = new Builder();
                                builder.e0 = Collections.EMPTY_LIST;
                                builder.h(annotation);
                                builder.h(annotation2);
                                this.k0 = builder.g();
                            }
                            this.f44045Y |= 128;
                        }
                        if (!value.l0.isEmpty()) {
                            if (this.l0.isEmpty()) {
                                this.l0 = value.l0;
                                this.f44045Y &= -257;
                            } else {
                                if ((this.f44045Y & 256) != 256) {
                                    this.l0 = new ArrayList(this.l0);
                                    this.f44045Y |= 256;
                                }
                                this.l0.addAll(value.l0);
                            }
                        }
                        int i6 = value.f44044Y;
                        if ((i6 & 256) == 256) {
                            int i7 = value.m0;
                            this.f44045Y |= 512;
                            this.m0 = i7;
                        }
                        if ((i6 & 512) == 512) {
                            int i8 = value.n0;
                            this.f44045Y |= 1024;
                            this.n0 = i8;
                        }
                        this.X = this.X.c(value.X);
                    }

                    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
                    public final void k(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                        Value value = null;
                        try {
                            try {
                                ((AnonymousClass1) Value.r0).getClass();
                                j(new Value(codedInputStream, extensionRegistryLite));
                            } catch (InvalidProtocolBufferException e2) {
                                Value value2 = (Value) e2.X;
                                try {
                                    throw e2;
                                } catch (Throwable th) {
                                    th = th;
                                    value = value2;
                                    if (value != null) {
                                        j(value);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (value != null) {
                                j(value);
                            }
                            throw th;
                        }
                    }
                }

                public enum Type implements Internal.EnumLite {
                    BYTE(0),
                    CHAR(1),
                    SHORT(2),
                    INT(3),
                    LONG(4),
                    FLOAT(5),
                    DOUBLE(6),
                    BOOLEAN(7),
                    STRING(8),
                    CLASS(9),
                    ENUM(10),
                    ANNOTATION(11),
                    ARRAY(12);

                    public final int X;

                    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type$1, reason: invalid class name */
                    public static class AnonymousClass1 implements Internal.EnumLiteMap<Type> {
                    }

                    Type(int i2) {
                        this.X = i2;
                    }

                    public static Type a(int i2) {
                        switch (i2) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                    public final int getNumber() {
                        return this.X;
                    }
                }

                static {
                    Value value = new Value();
                    q0 = value;
                    value.g();
                }

                public Value() {
                    this.o0 = (byte) -1;
                    this.p0 = -1;
                    this.X = ByteString.X;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public final void b(CodedOutputStream codedOutputStream) {
                    getSerializedSize();
                    if ((this.f44044Y & 1) == 1) {
                        codedOutputStream.l(1, this.Z.X);
                    }
                    if ((this.f44044Y & 2) == 2) {
                        long j = this.e0;
                        codedOutputStream.x(2, 0);
                        codedOutputStream.w((j >> 63) ^ (j << 1));
                    }
                    if ((this.f44044Y & 4) == 4) {
                        float f = this.f0;
                        codedOutputStream.x(3, 5);
                        codedOutputStream.t(Float.floatToRawIntBits(f));
                    }
                    if ((this.f44044Y & 8) == 8) {
                        double d = this.g0;
                        codedOutputStream.x(4, 1);
                        codedOutputStream.u(Double.doubleToRawLongBits(d));
                    }
                    if ((this.f44044Y & 16) == 16) {
                        codedOutputStream.m(5, this.h0);
                    }
                    if ((this.f44044Y & 32) == 32) {
                        codedOutputStream.m(6, this.i0);
                    }
                    if ((this.f44044Y & 64) == 64) {
                        codedOutputStream.m(7, this.j0);
                    }
                    if ((this.f44044Y & 128) == 128) {
                        codedOutputStream.o(8, this.k0);
                    }
                    for (int i2 = 0; i2 < this.l0.size(); i2++) {
                        codedOutputStream.o(9, (MessageLite) this.l0.get(i2));
                    }
                    if ((this.f44044Y & 512) == 512) {
                        codedOutputStream.m(10, this.n0);
                    }
                    if ((this.f44044Y & 256) == 256) {
                        codedOutputStream.m(11, this.m0);
                    }
                    codedOutputStream.r(this.X);
                }

                public final void g() {
                    this.Z = Type.BYTE;
                    this.e0 = 0L;
                    this.f0 = 0.0f;
                    this.g0 = 0.0d;
                    this.h0 = 0;
                    this.i0 = 0;
                    this.j0 = 0;
                    this.k0 = Annotation.h0;
                    this.l0 = Collections.EMPTY_LIST;
                    this.m0 = 0;
                    this.n0 = 0;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public final int getSerializedSize() {
                    int i2 = this.p0;
                    if (i2 != -1) {
                        return i2;
                    }
                    int iA = (this.f44044Y & 1) == 1 ? CodedOutputStream.a(1, this.Z.X) : 0;
                    if ((this.f44044Y & 2) == 2) {
                        long j = this.e0;
                        iA += CodedOutputStream.g((j >> 63) ^ (j << 1)) + CodedOutputStream.h(2);
                    }
                    if ((this.f44044Y & 4) == 4) {
                        iA += CodedOutputStream.h(3) + 4;
                    }
                    if ((this.f44044Y & 8) == 8) {
                        iA += CodedOutputStream.h(4) + 8;
                    }
                    if ((this.f44044Y & 16) == 16) {
                        iA += CodedOutputStream.b(5, this.h0);
                    }
                    if ((this.f44044Y & 32) == 32) {
                        iA += CodedOutputStream.b(6, this.i0);
                    }
                    if ((this.f44044Y & 64) == 64) {
                        iA += CodedOutputStream.b(7, this.j0);
                    }
                    if ((this.f44044Y & 128) == 128) {
                        iA += CodedOutputStream.d(8, this.k0);
                    }
                    for (int i3 = 0; i3 < this.l0.size(); i3++) {
                        iA += CodedOutputStream.d(9, (MessageLite) this.l0.get(i3));
                    }
                    if ((this.f44044Y & 512) == 512) {
                        iA += CodedOutputStream.b(10, this.n0);
                    }
                    if ((this.f44044Y & 256) == 256) {
                        iA += CodedOutputStream.b(11, this.m0);
                    }
                    int size = this.X.size() + iA;
                    this.p0 = size;
                    return size;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b2 = this.o0;
                    if (b2 == 1) {
                        return true;
                    }
                    if (b2 == 0) {
                        return false;
                    }
                    if ((this.f44044Y & 128) == 128 && !this.k0.isInitialized()) {
                        this.o0 = (byte) 0;
                        return false;
                    }
                    for (int i2 = 0; i2 < this.l0.size(); i2++) {
                        if (!((Value) this.l0.get(i2)).isInitialized()) {
                            this.o0 = (byte) 0;
                            return false;
                        }
                    }
                    this.o0 = (byte) 1;
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

                public Value(Builder builder) {
                    this.o0 = (byte) -1;
                    this.p0 = -1;
                    this.X = builder.X;
                }

                public Value(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    Builder builder;
                    this.o0 = (byte) -1;
                    this.p0 = -1;
                    g();
                    ByteString.Output output = new ByteString.Output();
                    CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
                    boolean z2 = false;
                    char c2 = 0;
                    while (!z2) {
                        try {
                            try {
                                int iN = codedInputStream.n();
                                switch (iN) {
                                    case 0:
                                        break;
                                    case 8:
                                        int iK = codedInputStream.k();
                                        Type typeA = Type.a(iK);
                                        if (typeA == null) {
                                            codedOutputStreamJ.v(iN);
                                            codedOutputStreamJ.v(iK);
                                        } else {
                                            this.f44044Y |= 1;
                                            this.Z = typeA;
                                            continue;
                                        }
                                        break;
                                    case 16:
                                        this.f44044Y |= 2;
                                        long jL = codedInputStream.l();
                                        this.e0 = (-(jL & 1)) ^ (jL >>> 1);
                                        continue;
                                    case 29:
                                        this.f44044Y |= 4;
                                        this.f0 = Float.intBitsToFloat(codedInputStream.i());
                                        continue;
                                    case 33:
                                        this.f44044Y |= 8;
                                        this.g0 = Double.longBitsToDouble(codedInputStream.j());
                                        continue;
                                    case 40:
                                        this.f44044Y |= 16;
                                        this.h0 = codedInputStream.k();
                                        continue;
                                    case 48:
                                        this.f44044Y |= 32;
                                        this.i0 = codedInputStream.k();
                                        continue;
                                    case 56:
                                        this.f44044Y |= 64;
                                        this.j0 = codedInputStream.k();
                                        continue;
                                    case 66:
                                        if ((this.f44044Y & 128) == 128) {
                                            Annotation annotation = this.k0;
                                            annotation.getClass();
                                            builder = new Builder();
                                            builder.e0 = Collections.EMPTY_LIST;
                                            builder.h(annotation);
                                        } else {
                                            builder = null;
                                        }
                                        Annotation annotation2 = (Annotation) codedInputStream.g(Annotation.i0, extensionRegistryLite);
                                        this.k0 = annotation2;
                                        if (builder != null) {
                                            builder.h(annotation2);
                                            this.k0 = builder.g();
                                        }
                                        this.f44044Y |= 128;
                                        continue;
                                    case mo.oom.ooo /* 74 */:
                                        if ((c2 & 256) != 256) {
                                            this.l0 = new ArrayList();
                                            c2 = 256;
                                        }
                                        this.l0.add(codedInputStream.g(r0, extensionRegistryLite));
                                        continue;
                                    case 80:
                                        this.f44044Y |= 512;
                                        this.n0 = codedInputStream.k();
                                        continue;
                                    case 88:
                                        this.f44044Y |= 256;
                                        this.m0 = codedInputStream.k();
                                        continue;
                                    default:
                                        if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                            break;
                                        }
                                        break;
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
                            if ((c2 & 256) == 256) {
                                this.l0 = Collections.unmodifiableList(this.l0);
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
                    if ((c2 & 256) == 256) {
                        this.l0 = Collections.unmodifiableList(this.l0);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused2) {
                    } finally {
                        this.X = output.h();
                    }
                }
            }

            public Argument(Builder builder) {
                this.f0 = (byte) -1;
                this.g0 = -1;
                this.X = builder.X;
            }

            public Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Value.Builder builderI;
                this.f0 = (byte) -1;
                this.g0 = -1;
                boolean z2 = false;
                this.Z = 0;
                this.e0 = Value.q0;
                ByteString.Output output = new ByteString.Output();
                CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
                while (!z2) {
                    try {
                        try {
                            int iN = codedInputStream.n();
                            if (iN != 0) {
                                if (iN == 8) {
                                    this.f44042Y |= 1;
                                    this.Z = codedInputStream.k();
                                } else if (iN != 18) {
                                    if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                    }
                                } else {
                                    if ((this.f44042Y & 2) == 2) {
                                        Value value = this.e0;
                                        value.getClass();
                                        builderI = Value.Builder.i();
                                        builderI.j(value);
                                    } else {
                                        builderI = null;
                                    }
                                    Value value2 = (Value) codedInputStream.g(Value.r0, extensionRegistryLite);
                                    this.e0 = value2;
                                    if (builderI != null) {
                                        builderI.j(value2);
                                        this.e0 = builderI.g();
                                    }
                                    this.f44042Y |= 2;
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

        public Annotation(Builder builder) {
            this.f0 = (byte) -1;
            this.g0 = -1;
            this.X = builder.X;
        }

        public Annotation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f0 = (byte) -1;
            this.g0 = -1;
            boolean z2 = false;
            this.Z = 0;
            this.e0 = Collections.EMPTY_LIST;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            char c2 = 0;
            while (!z2) {
                try {
                    try {
                        try {
                            int iN = codedInputStream.n();
                            if (iN != 0) {
                                if (iN == 8) {
                                    this.f44041Y |= 1;
                                    this.Z = codedInputStream.k();
                                } else if (iN != 18) {
                                    if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                    }
                                } else {
                                    if ((c2 & 2) != 2) {
                                        this.e0 = new ArrayList();
                                        c2 = 2;
                                    }
                                    this.e0.add(codedInputStream.g(Argument.i0, extensionRegistryLite));
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
                    if ((c2 & 2) == 2) {
                        this.e0 = Collections.unmodifiableList(this.e0);
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
            if ((c2 & 2) == 2) {
                this.e0 = Collections.unmodifiableList(this.e0);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.X = output.h();
            }
        }
    }

    public static final class QualifiedNameTable extends GeneratedMessageLite implements QualifiedNameTableOrBuilder {
        public static final QualifiedNameTable f0;
        public static final Parser g0 = new AnonymousClass1();
        public final ByteString X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public List f44067Y;
        public byte Z;
        public int e0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<QualifiedNameTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new QualifiedNameTable(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<QualifiedNameTable, Builder> implements QualifiedNameTableOrBuilder {

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f44068Y;
            public List Z;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                QualifiedNameTable qualifiedNameTableG = g();
                if (qualifiedNameTableG.isInitialized()) {
                    return qualifiedNameTableG;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder c() {
                Builder builder = new Builder();
                builder.Z = Collections.EMPTY_LIST;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object c() {
                Builder builder = new Builder();
                builder.Z = Collections.EMPTY_LIST;
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
                builder.Z = Collections.EMPTY_LIST;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                h((QualifiedNameTable) generatedMessageLite);
                return this;
            }

            public final QualifiedNameTable g() {
                QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(this);
                if ((this.f44068Y & 1) == 1) {
                    this.Z = Collections.unmodifiableList(this.Z);
                    this.f44068Y &= -2;
                }
                qualifiedNameTable.f44067Y = this.Z;
                return qualifiedNameTable;
            }

            public final void h(QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == QualifiedNameTable.f0) {
                    return;
                }
                if (!qualifiedNameTable.f44067Y.isEmpty()) {
                    if (this.Z.isEmpty()) {
                        this.Z = qualifiedNameTable.f44067Y;
                        this.f44068Y &= -2;
                    } else {
                        if ((this.f44068Y & 1) != 1) {
                            this.Z = new ArrayList(this.Z);
                            this.f44068Y |= 1;
                        }
                        this.Z.addAll(qualifiedNameTable.f44067Y);
                    }
                }
                this.X = this.X.c(qualifiedNameTable.X);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                QualifiedNameTable qualifiedNameTable = null;
                try {
                    try {
                        ((AnonymousClass1) QualifiedNameTable.g0).getClass();
                        h(new QualifiedNameTable(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e2) {
                        QualifiedNameTable qualifiedNameTable2 = (QualifiedNameTable) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            qualifiedNameTable = qualifiedNameTable2;
                            if (qualifiedNameTable != null) {
                                h(qualifiedNameTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (qualifiedNameTable != null) {
                        h(qualifiedNameTable);
                    }
                    throw th;
                }
            }
        }

        public interface QualifiedNameOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            QualifiedNameTable qualifiedNameTable = new QualifiedNameTable();
            f0 = qualifiedNameTable;
            qualifiedNameTable.f44067Y = Collections.EMPTY_LIST;
        }

        public QualifiedNameTable() {
            this.Z = (byte) -1;
            this.e0 = -1;
            this.X = ByteString.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i2 = 0; i2 < this.f44067Y.size(); i2++) {
                codedOutputStream.o(1, (MessageLite) this.f44067Y.get(i2));
            }
            codedOutputStream.r(this.X);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.e0;
            if (i2 != -1) {
                return i2;
            }
            int iD = 0;
            for (int i3 = 0; i3 < this.f44067Y.size(); i3++) {
                iD += CodedOutputStream.d(1, (MessageLite) this.f44067Y.get(i3));
            }
            int size = this.X.size() + iD;
            this.e0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.Z;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i2 = 0; i2 < this.f44067Y.size(); i2++) {
                if (!((QualifiedName) this.f44067Y.get(i2)).isInitialized()) {
                    this.Z = (byte) 0;
                    return false;
                }
            }
            this.Z = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            Builder builder = new Builder();
            builder.Z = Collections.EMPTY_LIST;
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builder = new Builder();
            builder.Z = Collections.EMPTY_LIST;
            builder.h(this);
            return builder;
        }

        public static final class QualifiedName extends GeneratedMessageLite implements QualifiedNameOrBuilder {
            public static final QualifiedName i0;
            public static final Parser j0 = new AnonymousClass1();
            public final ByteString X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f44069Y;
            public int Z;
            public int e0;
            public Kind f0;
            public byte g0;
            public int h0;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$1, reason: invalid class name */
            public static class AnonymousClass1 extends AbstractParser<QualifiedName> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new QualifiedName(codedInputStream);
                }
            }

            public static final class Builder extends GeneratedMessageLite.Builder<QualifiedName, Builder> implements QualifiedNameOrBuilder {

                /* JADX INFO: renamed from: Y, reason: collision with root package name */
                public int f44070Y;
                public int Z;
                public int e0;
                public Kind f0;

                public static Builder i() {
                    Builder builder = new Builder();
                    builder.Z = -1;
                    builder.f0 = Kind.PACKAGE;
                    return builder;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    k(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final MessageLite build() {
                    QualifiedName qualifiedNameG = g();
                    if (qualifiedNameG.isInitialized()) {
                        return qualifiedNameG;
                    }
                    throw new UninitializedMessageException();
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
                    j((QualifiedName) generatedMessageLite);
                    return this;
                }

                public final QualifiedName g() {
                    QualifiedName qualifiedName = new QualifiedName(this);
                    int i2 = this.f44070Y;
                    int i3 = (i2 & 1) != 1 ? 0 : 1;
                    qualifiedName.Z = this.Z;
                    if ((i2 & 2) == 2) {
                        i3 |= 2;
                    }
                    qualifiedName.e0 = this.e0;
                    if ((i2 & 4) == 4) {
                        i3 |= 4;
                    }
                    qualifiedName.f0 = this.f0;
                    qualifiedName.f44069Y = i3;
                    return qualifiedName;
                }

                public final void j(QualifiedName qualifiedName) {
                    if (qualifiedName == QualifiedName.i0) {
                        return;
                    }
                    int i2 = qualifiedName.f44069Y;
                    if ((i2 & 1) == 1) {
                        int i3 = qualifiedName.Z;
                        this.f44070Y = 1 | this.f44070Y;
                        this.Z = i3;
                    }
                    if ((i2 & 2) == 2) {
                        int i4 = qualifiedName.e0;
                        this.f44070Y = 2 | this.f44070Y;
                        this.e0 = i4;
                    }
                    if ((i2 & 4) == 4) {
                        Kind kind = qualifiedName.f0;
                        kind.getClass();
                        this.f44070Y = 4 | this.f44070Y;
                        this.f0 = kind;
                    }
                    this.X = this.X.c(qualifiedName.X);
                }

                /* JADX WARN: Code duplicated, block: B:14:0x001d  */
                public final void k(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    QualifiedName qualifiedName = null;
                    try {
                        try {
                            ((AnonymousClass1) QualifiedName.j0).getClass();
                            j(new QualifiedName(codedInputStream));
                        } catch (InvalidProtocolBufferException e2) {
                            QualifiedName qualifiedName2 = (QualifiedName) e2.X;
                            try {
                                throw e2;
                            } catch (Throwable th) {
                                th = th;
                                qualifiedName = qualifiedName2;
                                if (qualifiedName != null) {
                                    j(qualifiedName);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (qualifiedName != null) {
                            j(qualifiedName);
                        }
                        throw th;
                    }
                }
            }

            public enum Kind implements Internal.EnumLite {
                CLASS(0),
                PACKAGE(1),
                LOCAL(2);

                public final int X;

                /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$Kind$1, reason: invalid class name */
                public static class AnonymousClass1 implements Internal.EnumLiteMap<Kind> {
                }

                Kind(int i2) {
                    this.X = i2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.X;
                }
            }

            static {
                QualifiedName qualifiedName = new QualifiedName();
                i0 = qualifiedName;
                qualifiedName.Z = -1;
                qualifiedName.e0 = 0;
                qualifiedName.f0 = Kind.PACKAGE;
            }

            public QualifiedName() {
                this.g0 = (byte) -1;
                this.h0 = -1;
                this.X = ByteString.X;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final void b(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.f44069Y & 1) == 1) {
                    codedOutputStream.m(1, this.Z);
                }
                if ((this.f44069Y & 2) == 2) {
                    codedOutputStream.m(2, this.e0);
                }
                if ((this.f44069Y & 4) == 4) {
                    codedOutputStream.l(3, this.f0.X);
                }
                codedOutputStream.r(this.X);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final int getSerializedSize() {
                int i2 = this.h0;
                if (i2 != -1) {
                    return i2;
                }
                int iB = (this.f44069Y & 1) == 1 ? CodedOutputStream.b(1, this.Z) : 0;
                if ((this.f44069Y & 2) == 2) {
                    iB += CodedOutputStream.b(2, this.e0);
                }
                if ((this.f44069Y & 4) == 4) {
                    iB += CodedOutputStream.a(3, this.f0.X);
                }
                int size = this.X.size() + iB;
                this.h0 = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b2 = this.g0;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                if ((this.f44069Y & 2) == 2) {
                    this.g0 = (byte) 1;
                    return true;
                }
                this.g0 = (byte) 0;
                return false;
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

            public QualifiedName(Builder builder) {
                this.g0 = (byte) -1;
                this.h0 = -1;
                this.X = builder.X;
            }

            public QualifiedName(CodedInputStream codedInputStream) {
                Kind kind;
                this.g0 = (byte) -1;
                this.h0 = -1;
                this.Z = -1;
                boolean z2 = false;
                this.e0 = 0;
                Kind kind2 = Kind.PACKAGE;
                this.f0 = kind2;
                ByteString.Output output = new ByteString.Output();
                CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
                while (!z2) {
                    try {
                        try {
                            int iN = codedInputStream.n();
                            if (iN != 0) {
                                if (iN == 8) {
                                    this.f44069Y |= 1;
                                    this.Z = codedInputStream.k();
                                } else if (iN == 16) {
                                    this.f44069Y |= 2;
                                    this.e0 = codedInputStream.k();
                                } else if (iN != 24) {
                                    if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                    }
                                } else {
                                    int iK = codedInputStream.k();
                                    if (iK == 0) {
                                        kind = Kind.CLASS;
                                    } else if (iK != 1) {
                                        kind = iK != 2 ? null : Kind.LOCAL;
                                    } else {
                                        kind = kind2;
                                    }
                                    if (kind == null) {
                                        codedOutputStreamJ.v(iN);
                                        codedOutputStreamJ.v(iK);
                                    } else {
                                        this.f44069Y |= 4;
                                        this.f0 = kind;
                                    }
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

        public QualifiedNameTable(Builder builder) {
            this.Z = (byte) -1;
            this.e0 = -1;
            this.X = builder.X;
        }

        public QualifiedNameTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.Z = (byte) -1;
            this.e0 = -1;
            this.f44067Y = Collections.EMPTY_LIST;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z2 = false;
            boolean z3 = false;
            while (!z2) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN != 10) {
                                if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                }
                            } else {
                                if (!z3) {
                                    this.f44067Y = new ArrayList();
                                    z3 = true;
                                }
                                this.f44067Y.add(codedInputStream.g(QualifiedName.j0, extensionRegistryLite));
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
                    if (z3) {
                        this.f44067Y = Collections.unmodifiableList(this.f44067Y);
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
            if (z3) {
                this.f44067Y = Collections.unmodifiableList(this.f44067Y);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.X = output.h();
            }
        }
    }

    public static final class Type extends GeneratedMessageLite.ExtendableMessage<Type> implements TypeOrBuilder {
        public static final Type u0;
        public static final Parser v0 = new AnonymousClass1();

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ByteString f44074Y;
        public int Z;
        public List e0;
        public boolean f0;
        public int g0;
        public Type h0;
        public int i0;
        public int j0;
        public int k0;
        public int l0;
        public int m0;
        public Type n0;
        public int o0;
        public Type p0;
        public int q0;
        public int r0;
        public byte s0;
        public int t0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<Type> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Type(codedInputStream, extensionRegistryLite);
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Type, Builder> implements TypeOrBuilder {
            public int e0;
            public List f0;
            public boolean g0;
            public int h0;
            public Type i0;
            public int j0;
            public int k0;
            public int l0;
            public int m0;
            public int n0;
            public Type o0;
            public int p0;
            public Type q0;
            public int r0;
            public int s0;

            public static Builder j() {
                Builder builder = new Builder();
                builder.f0 = Collections.EMPTY_LIST;
                Type type = Type.u0;
                builder.i0 = type;
                builder.o0 = type;
                builder.q0 = type;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Type typeI = i();
                if (typeI.isInitialized()) {
                    return typeI;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final GeneratedMessageLite.Builder c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                k((Type) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            public final Type i() {
                Type type = new Type(this);
                int i2 = this.e0;
                if ((i2 & 1) == 1) {
                    this.f0 = Collections.unmodifiableList(this.f0);
                    this.e0 &= -2;
                }
                type.e0 = this.f0;
                int i3 = (i2 & 2) != 2 ? 0 : 1;
                type.f0 = this.g0;
                if ((i2 & 4) == 4) {
                    i3 |= 2;
                }
                type.g0 = this.h0;
                if ((i2 & 8) == 8) {
                    i3 |= 4;
                }
                type.h0 = this.i0;
                if ((i2 & 16) == 16) {
                    i3 |= 8;
                }
                type.i0 = this.j0;
                if ((i2 & 32) == 32) {
                    i3 |= 16;
                }
                type.j0 = this.k0;
                if ((i2 & 64) == 64) {
                    i3 |= 32;
                }
                type.k0 = this.l0;
                if ((i2 & 128) == 128) {
                    i3 |= 64;
                }
                type.l0 = this.m0;
                if ((i2 & 256) == 256) {
                    i3 |= 128;
                }
                type.m0 = this.n0;
                if ((i2 & 512) == 512) {
                    i3 |= 256;
                }
                type.n0 = this.o0;
                if ((i2 & 1024) == 1024) {
                    i3 |= 512;
                }
                type.o0 = this.p0;
                if ((i2 & a.f25965n) == 2048) {
                    i3 |= 1024;
                }
                type.p0 = this.q0;
                if ((i2 & 4096) == 4096) {
                    i3 |= a.f25965n;
                }
                type.q0 = this.r0;
                if ((i2 & Segment.SIZE) == 8192) {
                    i3 |= 4096;
                }
                type.r0 = this.s0;
                type.Z = i3;
                return type;
            }

            public final Builder k(Type type) {
                Type type2;
                Type type3;
                Type type4;
                Type type5 = Type.u0;
                if (type == type5) {
                    return this;
                }
                if (!type.e0.isEmpty()) {
                    if (this.f0.isEmpty()) {
                        this.f0 = type.e0;
                        this.e0 &= -2;
                    } else {
                        if ((this.e0 & 1) != 1) {
                            this.f0 = new ArrayList(this.f0);
                            this.e0 |= 1;
                        }
                        this.f0.addAll(type.e0);
                    }
                }
                int i2 = type.Z;
                if ((i2 & 1) == 1) {
                    boolean z2 = type.f0;
                    this.e0 |= 2;
                    this.g0 = z2;
                }
                if ((i2 & 2) == 2) {
                    int i3 = type.g0;
                    this.e0 |= 4;
                    this.h0 = i3;
                }
                if ((i2 & 4) == 4) {
                    Type type6 = type.h0;
                    if ((this.e0 & 8) != 8 || (type4 = this.i0) == type5) {
                        this.i0 = type6;
                    } else {
                        Builder builderR = Type.r(type4);
                        builderR.k(type6);
                        this.i0 = builderR.i();
                    }
                    this.e0 |= 8;
                }
                if ((type.Z & 8) == 8) {
                    int i4 = type.i0;
                    this.e0 |= 16;
                    this.j0 = i4;
                }
                if (type.p()) {
                    int i5 = type.j0;
                    this.e0 |= 32;
                    this.k0 = i5;
                }
                int i6 = type.Z;
                if ((i6 & 32) == 32) {
                    int i7 = type.k0;
                    this.e0 |= 64;
                    this.l0 = i7;
                }
                if ((i6 & 64) == 64) {
                    int i8 = type.l0;
                    this.e0 |= 128;
                    this.m0 = i8;
                }
                if ((i6 & 128) == 128) {
                    int i9 = type.m0;
                    this.e0 |= 256;
                    this.n0 = i9;
                }
                if ((i6 & 256) == 256) {
                    Type type7 = type.n0;
                    if ((this.e0 & 512) != 512 || (type3 = this.o0) == type5) {
                        this.o0 = type7;
                    } else {
                        Builder builderR2 = Type.r(type3);
                        builderR2.k(type7);
                        this.o0 = builderR2.i();
                    }
                    this.e0 |= 512;
                }
                int i10 = type.Z;
                if ((i10 & 512) == 512) {
                    int i11 = type.o0;
                    this.e0 |= 1024;
                    this.p0 = i11;
                }
                if ((i10 & 1024) == 1024) {
                    Type type8 = type.p0;
                    if ((this.e0 & a.f25965n) != 2048 || (type2 = this.q0) == type5) {
                        this.q0 = type8;
                    } else {
                        Builder builderR3 = Type.r(type2);
                        builderR3.k(type8);
                        this.q0 = builderR3.i();
                    }
                    this.e0 |= a.f25965n;
                }
                int i12 = type.Z;
                if ((i12 & a.f25965n) == 2048) {
                    int i13 = type.q0;
                    this.e0 |= 4096;
                    this.r0 = i13;
                }
                if ((i12 & 4096) == 4096) {
                    int i14 = type.r0;
                    this.e0 |= Segment.SIZE;
                    this.s0 = i14;
                }
                h(type);
                this.X = this.X.c(type.f44074Y);
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void l(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Type type = null;
                try {
                    try {
                        ((AnonymousClass1) Type.v0).getClass();
                        k(new Type(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e2) {
                        Type type2 = (Type) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            type = type2;
                            if (type != null) {
                                k(type);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (type != null) {
                        k(type);
                    }
                    throw th;
                }
            }
        }

        static {
            Type type = new Type();
            u0 = type;
            type.q();
        }

        public Type(Builder builder) {
            super(builder);
            this.s0 = (byte) -1;
            this.t0 = -1;
            this.f44074Y = builder.X;
        }

        public static Builder r(Type type) {
            Builder builderJ = Builder.j();
            builderJ.k(type);
            return builderJ;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.Z & 4096) == 4096) {
                codedOutputStream.m(1, this.r0);
            }
            for (int i2 = 0; i2 < this.e0.size(); i2++) {
                codedOutputStream.o(2, (MessageLite) this.e0.get(i2));
            }
            if ((this.Z & 1) == 1) {
                boolean z2 = this.f0;
                codedOutputStream.x(3, 0);
                codedOutputStream.q(z2 ? 1 : 0);
            }
            if ((this.Z & 2) == 2) {
                codedOutputStream.m(4, this.g0);
            }
            if ((this.Z & 4) == 4) {
                codedOutputStream.o(5, this.h0);
            }
            if ((this.Z & 16) == 16) {
                codedOutputStream.m(6, this.j0);
            }
            if ((this.Z & 32) == 32) {
                codedOutputStream.m(7, this.k0);
            }
            if ((this.Z & 8) == 8) {
                codedOutputStream.m(8, this.i0);
            }
            if ((this.Z & 64) == 64) {
                codedOutputStream.m(9, this.l0);
            }
            if ((this.Z & 256) == 256) {
                codedOutputStream.o(10, this.n0);
            }
            if ((this.Z & 512) == 512) {
                codedOutputStream.m(11, this.o0);
            }
            if ((this.Z & 128) == 128) {
                codedOutputStream.m(12, this.m0);
            }
            if ((this.Z & 1024) == 1024) {
                codedOutputStream.o(13, this.p0);
            }
            if ((this.Z & a.f25965n) == 2048) {
                codedOutputStream.m(14, this.q0);
            }
            extensionWriter.a(200, codedOutputStream);
            codedOutputStream.r(this.f44074Y);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return u0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.t0;
            if (i2 != -1) {
                return i2;
            }
            int iB = (this.Z & 4096) == 4096 ? CodedOutputStream.b(1, this.r0) : 0;
            for (int i3 = 0; i3 < this.e0.size(); i3++) {
                iB += CodedOutputStream.d(2, (MessageLite) this.e0.get(i3));
            }
            if ((this.Z & 1) == 1) {
                iB += CodedOutputStream.h(3) + 1;
            }
            if ((this.Z & 2) == 2) {
                iB += CodedOutputStream.b(4, this.g0);
            }
            if ((this.Z & 4) == 4) {
                iB += CodedOutputStream.d(5, this.h0);
            }
            if ((this.Z & 16) == 16) {
                iB += CodedOutputStream.b(6, this.j0);
            }
            if ((this.Z & 32) == 32) {
                iB += CodedOutputStream.b(7, this.k0);
            }
            if ((this.Z & 8) == 8) {
                iB += CodedOutputStream.b(8, this.i0);
            }
            if ((this.Z & 64) == 64) {
                iB += CodedOutputStream.b(9, this.l0);
            }
            if ((this.Z & 256) == 256) {
                iB += CodedOutputStream.d(10, this.n0);
            }
            if ((this.Z & 512) == 512) {
                iB += CodedOutputStream.b(11, this.o0);
            }
            if ((this.Z & 128) == 128) {
                iB += CodedOutputStream.b(12, this.m0);
            }
            if ((this.Z & 1024) == 1024) {
                iB += CodedOutputStream.d(13, this.p0);
            }
            if ((this.Z & a.f25965n) == 2048) {
                iB += CodedOutputStream.b(14, this.q0);
            }
            int size = this.f44074Y.size() + h() + iB;
            this.t0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.s0;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i2 = 0; i2 < this.e0.size(); i2++) {
                if (!((Argument) this.e0.get(i2)).isInitialized()) {
                    this.s0 = (byte) 0;
                    return false;
                }
            }
            if ((this.Z & 4) == 4 && !this.h0.isInitialized()) {
                this.s0 = (byte) 0;
                return false;
            }
            if ((this.Z & 256) == 256 && !this.n0.isInitialized()) {
                this.s0 = (byte) 0;
                return false;
            }
            if ((this.Z & 1024) == 1024 && !this.p0.isInitialized()) {
                this.s0 = (byte) 0;
                return false;
            }
            if (g()) {
                this.s0 = (byte) 1;
                return true;
            }
            this.s0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.j();
        }

        public final boolean p() {
            return (this.Z & 16) == 16;
        }

        public final void q() {
            this.e0 = Collections.EMPTY_LIST;
            this.f0 = false;
            this.g0 = 0;
            Type type = u0;
            this.h0 = type;
            this.i0 = 0;
            this.j0 = 0;
            this.k0 = 0;
            this.l0 = 0;
            this.m0 = 0;
            this.n0 = type;
            this.o0 = 0;
            this.p0 = type;
            this.q0 = 0;
            this.r0 = 0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Builder toBuilder() {
            return r(this);
        }

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static final Argument i0;
            public static final Parser j0 = new AnonymousClass1();
            public final ByteString X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f44075Y;
            public Projection Z;
            public Type e0;
            public int f0;
            public byte g0;
            public int h0;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$1, reason: invalid class name */
            public static class AnonymousClass1 extends AbstractParser<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {

                /* JADX INFO: renamed from: Y, reason: collision with root package name */
                public int f44076Y;
                public Projection Z;
                public Type e0;
                public int f0;

                public static Builder i() {
                    Builder builder = new Builder();
                    builder.Z = Projection.INV;
                    builder.e0 = Type.u0;
                    return builder;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    k(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final MessageLite build() {
                    Argument argumentG = g();
                    if (argumentG.isInitialized()) {
                        return argumentG;
                    }
                    throw new UninitializedMessageException();
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
                    j((Argument) generatedMessageLite);
                    return this;
                }

                public final Argument g() {
                    Argument argument = new Argument(this);
                    int i2 = this.f44076Y;
                    int i3 = (i2 & 1) != 1 ? 0 : 1;
                    argument.Z = this.Z;
                    if ((i2 & 2) == 2) {
                        i3 |= 2;
                    }
                    argument.e0 = this.e0;
                    if ((i2 & 4) == 4) {
                        i3 |= 4;
                    }
                    argument.f0 = this.f0;
                    argument.f44075Y = i3;
                    return argument;
                }

                public final void j(Argument argument) {
                    Type type;
                    if (argument == Argument.i0) {
                        return;
                    }
                    if ((argument.f44075Y & 1) == 1) {
                        Projection projection = argument.Z;
                        projection.getClass();
                        this.f44076Y = 1 | this.f44076Y;
                        this.Z = projection;
                    }
                    if ((argument.f44075Y & 2) == 2) {
                        Type type2 = argument.e0;
                        if ((this.f44076Y & 2) != 2 || (type = this.e0) == Type.u0) {
                            this.e0 = type2;
                        } else {
                            Builder builderR = Type.r(type);
                            builderR.k(type2);
                            this.e0 = builderR.i();
                        }
                        this.f44076Y |= 2;
                    }
                    if ((argument.f44075Y & 4) == 4) {
                        int i2 = argument.f0;
                        this.f44076Y = 4 | this.f44076Y;
                        this.f0 = i2;
                    }
                    this.X = this.X.c(argument.X);
                }

                /* JADX WARN: Code duplicated, block: B:14:0x001d  */
                public final void k(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Argument argument = null;
                    try {
                        try {
                            ((AnonymousClass1) Argument.j0).getClass();
                            j(new Argument(codedInputStream, extensionRegistryLite));
                        } catch (InvalidProtocolBufferException e2) {
                            Argument argument2 = (Argument) e2.X;
                            try {
                                throw e2;
                            } catch (Throwable th) {
                                th = th;
                                argument = argument2;
                                if (argument != null) {
                                    j(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (argument != null) {
                            j(argument);
                        }
                        throw th;
                    }
                }
            }

            public enum Projection implements Internal.EnumLite {
                IN(0),
                OUT(1),
                INV(2),
                STAR(3);

                public final int X;

                /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Projection$1, reason: invalid class name */
                public static class AnonymousClass1 implements Internal.EnumLiteMap<Projection> {
                }

                Projection(int i2) {
                    this.X = i2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.X;
                }
            }

            static {
                Argument argument = new Argument();
                i0 = argument;
                argument.Z = Projection.INV;
                argument.e0 = Type.u0;
                argument.f0 = 0;
            }

            public Argument() {
                this.g0 = (byte) -1;
                this.h0 = -1;
                this.X = ByteString.X;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final void b(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.f44075Y & 1) == 1) {
                    codedOutputStream.l(1, this.Z.X);
                }
                if ((this.f44075Y & 2) == 2) {
                    codedOutputStream.o(2, this.e0);
                }
                if ((this.f44075Y & 4) == 4) {
                    codedOutputStream.m(3, this.f0);
                }
                codedOutputStream.r(this.X);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final int getSerializedSize() {
                int i2 = this.h0;
                if (i2 != -1) {
                    return i2;
                }
                int iA = (this.f44075Y & 1) == 1 ? CodedOutputStream.a(1, this.Z.X) : 0;
                if ((this.f44075Y & 2) == 2) {
                    iA += CodedOutputStream.d(2, this.e0);
                }
                if ((this.f44075Y & 4) == 4) {
                    iA += CodedOutputStream.b(3, this.f0);
                }
                int size = this.X.size() + iA;
                this.h0 = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b2 = this.g0;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                if ((this.f44075Y & 2) != 2 || this.e0.isInitialized()) {
                    this.g0 = (byte) 1;
                    return true;
                }
                this.g0 = (byte) 0;
                return false;
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

            public Argument(Builder builder) {
                this.g0 = (byte) -1;
                this.h0 = -1;
                this.X = builder.X;
            }

            public Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                this.g0 = (byte) -1;
                this.h0 = -1;
                Projection projection = Projection.INV;
                this.Z = projection;
                this.e0 = Type.u0;
                boolean z2 = false;
                this.f0 = 0;
                ByteString.Output output = new ByteString.Output();
                CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
                while (!z2) {
                    try {
                        try {
                            try {
                                int iN = codedInputStream.n();
                                if (iN != 0) {
                                    Builder builderR = null;
                                    Projection projection2 = null;
                                    if (iN == 8) {
                                        int iK = codedInputStream.k();
                                        if (iK == 0) {
                                            projection2 = Projection.IN;
                                        } else if (iK == 1) {
                                            projection2 = Projection.OUT;
                                        } else if (iK == 2) {
                                            projection2 = projection;
                                        } else if (iK == 3) {
                                            projection2 = Projection.STAR;
                                        }
                                        if (projection2 == null) {
                                            codedOutputStreamJ.v(iN);
                                            codedOutputStreamJ.v(iK);
                                        } else {
                                            this.f44075Y |= 1;
                                            this.Z = projection2;
                                        }
                                    } else if (iN == 18) {
                                        if ((this.f44075Y & 2) == 2) {
                                            Type type = this.e0;
                                            type.getClass();
                                            builderR = Type.r(type);
                                        }
                                        Type type2 = (Type) codedInputStream.g(Type.v0, extensionRegistryLite);
                                        this.e0 = type2;
                                        if (builderR != null) {
                                            builderR.k(type2);
                                            this.e0 = builderR.i();
                                        }
                                        this.f44075Y |= 2;
                                    } else if (iN != 24) {
                                        if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                        }
                                    } else {
                                        this.f44075Y |= 4;
                                        this.f0 = codedInputStream.k();
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

        public Type() {
            this.s0 = (byte) -1;
            this.t0 = -1;
            this.f44074Y = ByteString.X;
        }

        public Type(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.s0 = (byte) -1;
            this.t0 = -1;
            q();
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z2 = false;
            boolean z3 = false;
            while (!z2) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        Parser parser = v0;
                        Builder builderR = null;
                        switch (iN) {
                            case 0:
                                break;
                            case 8:
                                this.Z |= 4096;
                                this.r0 = codedInputStream.k();
                                continue;
                            case 18:
                                if (!z3) {
                                    this.e0 = new ArrayList();
                                    z3 = true;
                                }
                                this.e0.add(codedInputStream.g(Argument.j0, extensionRegistryLite));
                                continue;
                            case 24:
                                this.Z |= 1;
                                this.f0 = codedInputStream.l() != 0;
                                continue;
                            case 32:
                                this.Z |= 2;
                                this.g0 = codedInputStream.k();
                                continue;
                            case 42:
                                if ((this.Z & 4) == 4) {
                                    Type type = this.h0;
                                    type.getClass();
                                    builderR = r(type);
                                }
                                Type type2 = (Type) codedInputStream.g(parser, extensionRegistryLite);
                                this.h0 = type2;
                                if (builderR != null) {
                                    builderR.k(type2);
                                    this.h0 = builderR.i();
                                }
                                this.Z |= 4;
                                continue;
                            case 48:
                                this.Z |= 16;
                                this.j0 = codedInputStream.k();
                                continue;
                            case 56:
                                this.Z |= 32;
                                this.k0 = codedInputStream.k();
                                continue;
                            case 64:
                                this.Z |= 8;
                                this.i0 = codedInputStream.k();
                                continue;
                            case 72:
                                this.Z |= 64;
                                this.l0 = codedInputStream.k();
                                continue;
                            case 82:
                                if ((this.Z & 256) == 256) {
                                    Type type3 = this.n0;
                                    type3.getClass();
                                    builderR = r(type3);
                                }
                                Type type4 = (Type) codedInputStream.g(parser, extensionRegistryLite);
                                this.n0 = type4;
                                if (builderR != null) {
                                    builderR.k(type4);
                                    this.n0 = builderR.i();
                                }
                                this.Z |= 256;
                                continue;
                            case 88:
                                this.Z |= 512;
                                this.o0 = codedInputStream.k();
                                continue;
                            case 96:
                                this.Z |= 128;
                                this.m0 = codedInputStream.k();
                                continue;
                            case 106:
                                if ((this.Z & 1024) == 1024) {
                                    Type type5 = this.p0;
                                    type5.getClass();
                                    builderR = r(type5);
                                }
                                Type type6 = (Type) codedInputStream.g(parser, extensionRegistryLite);
                                this.p0 = type6;
                                if (builderR != null) {
                                    builderR.k(type6);
                                    this.p0 = builderR.i();
                                }
                                this.Z |= 1024;
                                continue;
                            case 112:
                                this.Z |= a.f25965n;
                                this.q0 = codedInputStream.k();
                                continue;
                            default:
                                if (!n(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iN)) {
                                    break;
                                }
                                break;
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
                    if (z3) {
                        this.e0 = Collections.unmodifiableList(this.e0);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f44074Y = output.h();
                    }
                    m();
                    throw th;
                }
            }
            if (z3) {
                this.e0 = Collections.unmodifiableList(this.e0);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.f44074Y = output.h();
            }
            m();
        }
    }

    public static final class Contract extends GeneratedMessageLite implements ContractOrBuilder {
        public static final Contract f0;
        public static final Parser g0 = new AnonymousClass1();
        public final ByteString X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public List f44051Y;
        public byte Z;
        public int e0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<Contract> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Contract(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Contract, Builder> implements ContractOrBuilder {

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f44052Y;
            public List Z;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Contract contractG = g();
                if (contractG.isInitialized()) {
                    return contractG;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder c() {
                Builder builder = new Builder();
                builder.Z = Collections.EMPTY_LIST;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object c() {
                Builder builder = new Builder();
                builder.Z = Collections.EMPTY_LIST;
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
                builder.Z = Collections.EMPTY_LIST;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                h((Contract) generatedMessageLite);
                return this;
            }

            public final Contract g() {
                Contract contract = new Contract(this);
                if ((this.f44052Y & 1) == 1) {
                    this.Z = Collections.unmodifiableList(this.Z);
                    this.f44052Y &= -2;
                }
                contract.f44051Y = this.Z;
                return contract;
            }

            public final void h(Contract contract) {
                if (contract == Contract.f0) {
                    return;
                }
                if (!contract.f44051Y.isEmpty()) {
                    if (this.Z.isEmpty()) {
                        this.Z = contract.f44051Y;
                        this.f44052Y &= -2;
                    } else {
                        if ((this.f44052Y & 1) != 1) {
                            this.Z = new ArrayList(this.Z);
                            this.f44052Y |= 1;
                        }
                        this.Z.addAll(contract.f44051Y);
                    }
                }
                this.X = this.X.c(contract.X);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Contract contract = null;
                try {
                    try {
                        ((AnonymousClass1) Contract.g0).getClass();
                        h(new Contract(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e2) {
                        Contract contract2 = (Contract) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            contract = contract2;
                            if (contract != null) {
                                h(contract);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (contract != null) {
                        h(contract);
                    }
                    throw th;
                }
            }
        }

        static {
            Contract contract = new Contract();
            f0 = contract;
            contract.f44051Y = Collections.EMPTY_LIST;
        }

        public Contract() {
            this.Z = (byte) -1;
            this.e0 = -1;
            this.X = ByteString.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i2 = 0; i2 < this.f44051Y.size(); i2++) {
                codedOutputStream.o(1, (MessageLite) this.f44051Y.get(i2));
            }
            codedOutputStream.r(this.X);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.e0;
            if (i2 != -1) {
                return i2;
            }
            int iD = 0;
            for (int i3 = 0; i3 < this.f44051Y.size(); i3++) {
                iD += CodedOutputStream.d(1, (MessageLite) this.f44051Y.get(i3));
            }
            int size = this.X.size() + iD;
            this.e0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.Z;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i2 = 0; i2 < this.f44051Y.size(); i2++) {
                if (!((Effect) this.f44051Y.get(i2)).isInitialized()) {
                    this.Z = (byte) 0;
                    return false;
                }
            }
            this.Z = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            Builder builder = new Builder();
            builder.Z = Collections.EMPTY_LIST;
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builder = new Builder();
            builder.Z = Collections.EMPTY_LIST;
            builder.h(this);
            return builder;
        }

        public Contract(Builder builder) {
            this.Z = (byte) -1;
            this.e0 = -1;
            this.X = builder.X;
        }

        public Contract(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.Z = (byte) -1;
            this.e0 = -1;
            this.f44051Y = Collections.EMPTY_LIST;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z2 = false;
            boolean z3 = false;
            while (!z2) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN != 10) {
                                if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                }
                            } else {
                                if (!z3) {
                                    this.f44051Y = new ArrayList();
                                    z3 = true;
                                }
                                this.f44051Y.add(codedInputStream.g(Effect.k0, extensionRegistryLite));
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
                    if (z3) {
                        this.f44051Y = Collections.unmodifiableList(this.f44051Y);
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
            if (z3) {
                this.f44051Y = Collections.unmodifiableList(this.f44051Y);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.X = output.h();
            }
        }
    }

    public static final class Effect extends GeneratedMessageLite implements EffectOrBuilder {
        public static final Effect j0;
        public static final Parser k0 = new AnonymousClass1();
        public final ByteString X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f44053Y;
        public EffectType Z;
        public List e0;
        public Expression f0;
        public InvocationKind g0;
        public byte h0;
        public int i0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<Effect> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Effect(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Effect, Builder> implements EffectOrBuilder {

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f44054Y;
            public EffectType Z;
            public List e0;
            public Expression f0;
            public InvocationKind g0;

            public static Builder i() {
                Builder builder = new Builder();
                builder.Z = EffectType.RETURNS_CONSTANT;
                builder.e0 = Collections.EMPTY_LIST;
                builder.f0 = Expression.m0;
                builder.g0 = InvocationKind.AT_MOST_ONCE;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                k(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Effect effectG = g();
                if (effectG.isInitialized()) {
                    return effectG;
                }
                throw new UninitializedMessageException();
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
                j((Effect) generatedMessageLite);
                return this;
            }

            public final Effect g() {
                Effect effect = new Effect(this);
                int i2 = this.f44054Y;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                effect.Z = this.Z;
                if ((i2 & 2) == 2) {
                    this.e0 = Collections.unmodifiableList(this.e0);
                    this.f44054Y &= -3;
                }
                effect.e0 = this.e0;
                if ((i2 & 4) == 4) {
                    i3 |= 2;
                }
                effect.f0 = this.f0;
                if ((i2 & 8) == 8) {
                    i3 |= 4;
                }
                effect.g0 = this.g0;
                effect.f44053Y = i3;
                return effect;
            }

            public final void j(Effect effect) {
                Expression expression;
                if (effect == Effect.j0) {
                    return;
                }
                if ((effect.f44053Y & 1) == 1) {
                    EffectType effectType = effect.Z;
                    effectType.getClass();
                    this.f44054Y |= 1;
                    this.Z = effectType;
                }
                if (!effect.e0.isEmpty()) {
                    if (this.e0.isEmpty()) {
                        this.e0 = effect.e0;
                        this.f44054Y &= -3;
                    } else {
                        if ((this.f44054Y & 2) != 2) {
                            this.e0 = new ArrayList(this.e0);
                            this.f44054Y |= 2;
                        }
                        this.e0.addAll(effect.e0);
                    }
                }
                if ((effect.f44053Y & 2) == 2) {
                    Expression expression2 = effect.f0;
                    if ((this.f44054Y & 4) != 4 || (expression = this.f0) == Expression.m0) {
                        this.f0 = expression2;
                    } else {
                        Expression.Builder builderI = Expression.Builder.i();
                        builderI.j(expression);
                        builderI.j(expression2);
                        this.f0 = builderI.g();
                    }
                    this.f44054Y |= 4;
                }
                if ((effect.f44053Y & 4) == 4) {
                    InvocationKind invocationKind = effect.g0;
                    invocationKind.getClass();
                    this.f44054Y |= 8;
                    this.g0 = invocationKind;
                }
                this.X = this.X.c(effect.X);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void k(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Effect effect = null;
                try {
                    try {
                        ((AnonymousClass1) Effect.k0).getClass();
                        j(new Effect(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e2) {
                        Effect effect2 = (Effect) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            effect = effect2;
                            if (effect != null) {
                                j(effect);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (effect != null) {
                        j(effect);
                    }
                    throw th;
                }
            }
        }

        public enum EffectType implements Internal.EnumLite {
            RETURNS_CONSTANT(0),
            CALLS(1),
            RETURNS_NOT_NULL(2);

            public final int X;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$EffectType$1, reason: invalid class name */
            public static class AnonymousClass1 implements Internal.EnumLiteMap<EffectType> {
            }

            EffectType(int i2) {
                this.X = i2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.X;
            }
        }

        public enum InvocationKind implements Internal.EnumLite {
            AT_MOST_ONCE(0),
            EXACTLY_ONCE(1),
            AT_LEAST_ONCE(2);

            public final int X;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$InvocationKind$1, reason: invalid class name */
            public static class AnonymousClass1 implements Internal.EnumLiteMap<InvocationKind> {
            }

            InvocationKind(int i2) {
                this.X = i2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.X;
            }
        }

        static {
            Effect effect = new Effect();
            j0 = effect;
            effect.Z = EffectType.RETURNS_CONSTANT;
            effect.e0 = Collections.EMPTY_LIST;
            effect.f0 = Expression.m0;
            effect.g0 = InvocationKind.AT_MOST_ONCE;
        }

        public Effect() {
            this.h0 = (byte) -1;
            this.i0 = -1;
            this.X = ByteString.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f44053Y & 1) == 1) {
                codedOutputStream.l(1, this.Z.X);
            }
            for (int i2 = 0; i2 < this.e0.size(); i2++) {
                codedOutputStream.o(2, (MessageLite) this.e0.get(i2));
            }
            if ((this.f44053Y & 2) == 2) {
                codedOutputStream.o(3, this.f0);
            }
            if ((this.f44053Y & 4) == 4) {
                codedOutputStream.l(4, this.g0.X);
            }
            codedOutputStream.r(this.X);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.i0;
            if (i2 != -1) {
                return i2;
            }
            int iA = (this.f44053Y & 1) == 1 ? CodedOutputStream.a(1, this.Z.X) : 0;
            for (int i3 = 0; i3 < this.e0.size(); i3++) {
                iA += CodedOutputStream.d(2, (MessageLite) this.e0.get(i3));
            }
            if ((this.f44053Y & 2) == 2) {
                iA += CodedOutputStream.d(3, this.f0);
            }
            if ((this.f44053Y & 4) == 4) {
                iA += CodedOutputStream.a(4, this.g0.X);
            }
            int size = this.X.size() + iA;
            this.i0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.h0;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i2 = 0; i2 < this.e0.size(); i2++) {
                if (!((Expression) this.e0.get(i2)).isInitialized()) {
                    this.h0 = (byte) 0;
                    return false;
                }
            }
            if ((this.f44053Y & 2) != 2 || this.f0.isInitialized()) {
                this.h0 = (byte) 1;
                return true;
            }
            this.h0 = (byte) 0;
            return false;
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

        public Effect(Builder builder) {
            this.h0 = (byte) -1;
            this.i0 = -1;
            this.X = builder.X;
        }

        public Effect(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.h0 = (byte) -1;
            this.i0 = -1;
            EffectType effectType = EffectType.RETURNS_CONSTANT;
            this.Z = effectType;
            this.e0 = Collections.EMPTY_LIST;
            this.f0 = Expression.m0;
            InvocationKind invocationKind = InvocationKind.AT_MOST_ONCE;
            this.g0 = invocationKind;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z2 = false;
            char c2 = 0;
            while (!z2) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            InvocationKind invocationKind2 = null;
                            EffectType effectType2 = null;
                            Expression.Builder builderI = null;
                            if (iN == 8) {
                                int iK = codedInputStream.k();
                                if (iK == 0) {
                                    effectType2 = effectType;
                                } else if (iK == 1) {
                                    effectType2 = EffectType.CALLS;
                                } else if (iK == 2) {
                                    effectType2 = EffectType.RETURNS_NOT_NULL;
                                }
                                if (effectType2 == null) {
                                    codedOutputStreamJ.v(iN);
                                    codedOutputStreamJ.v(iK);
                                } else {
                                    this.f44053Y |= 1;
                                    this.Z = effectType2;
                                }
                            } else if (iN == 18) {
                                int i2 = (c2 == true ? 1 : 0) & 2;
                                c2 = c2;
                                if (i2 != 2) {
                                    this.e0 = new ArrayList();
                                    c2 = 2;
                                }
                                this.e0.add(codedInputStream.g(Expression.n0, extensionRegistryLite));
                            } else if (iN == 26) {
                                if ((this.f44053Y & 2) == 2) {
                                    Expression expression = this.f0;
                                    expression.getClass();
                                    builderI = Expression.Builder.i();
                                    builderI.j(expression);
                                }
                                Expression expression2 = (Expression) codedInputStream.g(Expression.n0, extensionRegistryLite);
                                this.f0 = expression2;
                                if (builderI != null) {
                                    builderI.j(expression2);
                                    this.f0 = builderI.g();
                                }
                                this.f44053Y |= 2;
                            } else if (iN != 32) {
                                if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                }
                            } else {
                                int iK2 = codedInputStream.k();
                                if (iK2 == 0) {
                                    invocationKind2 = invocationKind;
                                } else if (iK2 == 1) {
                                    invocationKind2 = InvocationKind.EXACTLY_ONCE;
                                } else if (iK2 == 2) {
                                    invocationKind2 = InvocationKind.AT_LEAST_ONCE;
                                }
                                if (invocationKind2 == null) {
                                    codedOutputStreamJ.v(iN);
                                    codedOutputStreamJ.v(iK2);
                                } else {
                                    this.f44053Y |= 4;
                                    this.g0 = invocationKind2;
                                }
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
                    if (((c2 == true ? 1 : 0) & 2) == 2) {
                        this.e0 = Collections.unmodifiableList(this.e0);
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
            if (((c2 == true ? 1 : 0) & 2) == 2) {
                this.e0 = Collections.unmodifiableList(this.e0);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.X = output.h();
            }
        }
    }

    public static final class Expression extends GeneratedMessageLite implements ExpressionOrBuilder {
        public static final Expression m0;
        public static final Parser n0 = new AnonymousClass1();
        public final ByteString X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f44058Y;
        public int Z;
        public int e0;
        public ConstantValue f0;
        public Type g0;
        public int h0;
        public List i0;
        public List j0;
        public byte k0;
        public int l0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<Expression> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Expression(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Expression, Builder> implements ExpressionOrBuilder {

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f44059Y;
            public int Z;
            public int e0;
            public ConstantValue f0;
            public Type g0;
            public int h0;
            public List i0;
            public List j0;

            public static Builder i() {
                Builder builder = new Builder();
                builder.f0 = ConstantValue.TRUE;
                builder.g0 = Type.u0;
                List list = Collections.EMPTY_LIST;
                builder.i0 = list;
                builder.j0 = list;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                k(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Expression expressionG = g();
                if (expressionG.isInitialized()) {
                    return expressionG;
                }
                throw new UninitializedMessageException();
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
                j((Expression) generatedMessageLite);
                return this;
            }

            public final Expression g() {
                Expression expression = new Expression(this);
                int i2 = this.f44059Y;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                expression.Z = this.Z;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                expression.e0 = this.e0;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                expression.f0 = this.f0;
                if ((i2 & 8) == 8) {
                    i3 |= 8;
                }
                expression.g0 = this.g0;
                if ((i2 & 16) == 16) {
                    i3 |= 16;
                }
                expression.h0 = this.h0;
                if ((i2 & 32) == 32) {
                    this.i0 = Collections.unmodifiableList(this.i0);
                    this.f44059Y &= -33;
                }
                expression.i0 = this.i0;
                if ((this.f44059Y & 64) == 64) {
                    this.j0 = Collections.unmodifiableList(this.j0);
                    this.f44059Y &= -65;
                }
                expression.j0 = this.j0;
                expression.f44058Y = i3;
                return expression;
            }

            public final void j(Expression expression) {
                Type type;
                if (expression == Expression.m0) {
                    return;
                }
                int i2 = expression.f44058Y;
                if ((i2 & 1) == 1) {
                    int i3 = expression.Z;
                    this.f44059Y = 1 | this.f44059Y;
                    this.Z = i3;
                }
                if ((i2 & 2) == 2) {
                    int i4 = expression.e0;
                    this.f44059Y = 2 | this.f44059Y;
                    this.e0 = i4;
                }
                if ((i2 & 4) == 4) {
                    ConstantValue constantValue = expression.f0;
                    constantValue.getClass();
                    this.f44059Y = 4 | this.f44059Y;
                    this.f0 = constantValue;
                }
                if ((expression.f44058Y & 8) == 8) {
                    Type type2 = expression.g0;
                    if ((this.f44059Y & 8) != 8 || (type = this.g0) == Type.u0) {
                        this.g0 = type2;
                    } else {
                        Type.Builder builderR = Type.r(type);
                        builderR.k(type2);
                        this.g0 = builderR.i();
                    }
                    this.f44059Y |= 8;
                }
                if ((expression.f44058Y & 16) == 16) {
                    int i5 = expression.h0;
                    this.f44059Y = 16 | this.f44059Y;
                    this.h0 = i5;
                }
                if (!expression.i0.isEmpty()) {
                    if (this.i0.isEmpty()) {
                        this.i0 = expression.i0;
                        this.f44059Y &= -33;
                    } else {
                        if ((this.f44059Y & 32) != 32) {
                            this.i0 = new ArrayList(this.i0);
                            this.f44059Y |= 32;
                        }
                        this.i0.addAll(expression.i0);
                    }
                }
                if (!expression.j0.isEmpty()) {
                    if (this.j0.isEmpty()) {
                        this.j0 = expression.j0;
                        this.f44059Y &= -65;
                    } else {
                        if ((this.f44059Y & 64) != 64) {
                            this.j0 = new ArrayList(this.j0);
                            this.f44059Y |= 64;
                        }
                        this.j0.addAll(expression.j0);
                    }
                }
                this.X = this.X.c(expression.X);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void k(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Expression expression = null;
                try {
                    try {
                        ((AnonymousClass1) Expression.n0).getClass();
                        j(new Expression(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e2) {
                        Expression expression2 = (Expression) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            expression = expression2;
                            if (expression != null) {
                                j(expression);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (expression != null) {
                        j(expression);
                    }
                    throw th;
                }
            }
        }

        public enum ConstantValue implements Internal.EnumLite {
            TRUE(0),
            FALSE(1),
            NULL(2);

            public final int X;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$ConstantValue$1, reason: invalid class name */
            public static class AnonymousClass1 implements Internal.EnumLiteMap<ConstantValue> {
            }

            ConstantValue(int i2) {
                this.X = i2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.X;
            }
        }

        static {
            Expression expression = new Expression();
            m0 = expression;
            expression.Z = 0;
            expression.e0 = 0;
            expression.f0 = ConstantValue.TRUE;
            expression.g0 = Type.u0;
            expression.h0 = 0;
            List list = Collections.EMPTY_LIST;
            expression.i0 = list;
            expression.j0 = list;
        }

        public Expression() {
            this.k0 = (byte) -1;
            this.l0 = -1;
            this.X = ByteString.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f44058Y & 1) == 1) {
                codedOutputStream.m(1, this.Z);
            }
            if ((this.f44058Y & 2) == 2) {
                codedOutputStream.m(2, this.e0);
            }
            if ((this.f44058Y & 4) == 4) {
                codedOutputStream.l(3, this.f0.X);
            }
            if ((this.f44058Y & 8) == 8) {
                codedOutputStream.o(4, this.g0);
            }
            if ((this.f44058Y & 16) == 16) {
                codedOutputStream.m(5, this.h0);
            }
            for (int i2 = 0; i2 < this.i0.size(); i2++) {
                codedOutputStream.o(6, (MessageLite) this.i0.get(i2));
            }
            for (int i3 = 0; i3 < this.j0.size(); i3++) {
                codedOutputStream.o(7, (MessageLite) this.j0.get(i3));
            }
            codedOutputStream.r(this.X);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.l0;
            if (i2 != -1) {
                return i2;
            }
            int iB = (this.f44058Y & 1) == 1 ? CodedOutputStream.b(1, this.Z) : 0;
            if ((this.f44058Y & 2) == 2) {
                iB += CodedOutputStream.b(2, this.e0);
            }
            if ((this.f44058Y & 4) == 4) {
                iB += CodedOutputStream.a(3, this.f0.X);
            }
            if ((this.f44058Y & 8) == 8) {
                iB += CodedOutputStream.d(4, this.g0);
            }
            if ((this.f44058Y & 16) == 16) {
                iB += CodedOutputStream.b(5, this.h0);
            }
            for (int i3 = 0; i3 < this.i0.size(); i3++) {
                iB += CodedOutputStream.d(6, (MessageLite) this.i0.get(i3));
            }
            for (int i4 = 0; i4 < this.j0.size(); i4++) {
                iB += CodedOutputStream.d(7, (MessageLite) this.j0.get(i4));
            }
            int size = this.X.size() + iB;
            this.l0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.k0;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if ((this.f44058Y & 8) == 8 && !this.g0.isInitialized()) {
                this.k0 = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < this.i0.size(); i2++) {
                if (!((Expression) this.i0.get(i2)).isInitialized()) {
                    this.k0 = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < this.j0.size(); i3++) {
                if (!((Expression) this.j0.get(i3)).isInitialized()) {
                    this.k0 = (byte) 0;
                    return false;
                }
            }
            this.k0 = (byte) 1;
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

        public Expression(Builder builder) {
            this.k0 = (byte) -1;
            this.l0 = -1;
            this.X = builder.X;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Expression(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            ConstantValue constantValue;
            this.k0 = (byte) -1;
            this.l0 = -1;
            boolean z2 = false;
            this.Z = 0;
            this.e0 = 0;
            ConstantValue constantValue2 = ConstantValue.TRUE;
            this.f0 = constantValue2;
            this.g0 = Type.u0;
            this.h0 = 0;
            List list = Collections.EMPTY_LIST;
            this.i0 = list;
            this.j0 = list;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            int i2 = 0;
            while (!z2) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f44058Y |= 1;
                                this.Z = codedInputStream.k();
                            } else if (iN != 16) {
                                Object objR = null;
                                if (iN == 24) {
                                    int iK = codedInputStream.k();
                                    if (iK != 0) {
                                        if (iK == 1) {
                                            objR = ConstantValue.FALSE;
                                        } else if (iK == 2) {
                                            objR = ConstantValue.NULL;
                                        }
                                        constantValue = objR;
                                    } else {
                                        constantValue = constantValue2;
                                    }
                                    if (constantValue == 0) {
                                        codedOutputStreamJ.v(iN);
                                        codedOutputStreamJ.v(iK);
                                    } else {
                                        this.f44058Y |= 4;
                                        this.f0 = constantValue;
                                    }
                                } else if (iN == 34) {
                                    if ((this.f44058Y & 8) == 8) {
                                        Type type = this.g0;
                                        type.getClass();
                                        objR = Type.r(type);
                                    }
                                    Type.Builder builder = objR;
                                    Type type2 = (Type) codedInputStream.g(Type.v0, extensionRegistryLite);
                                    this.g0 = type2;
                                    if (builder != 0) {
                                        builder.k(type2);
                                        this.g0 = builder.i();
                                    }
                                    this.f44058Y |= 8;
                                } else if (iN != 40) {
                                    Parser parser = n0;
                                    if (iN == 50) {
                                        if ((i2 & 32) != 32) {
                                            this.i0 = new ArrayList();
                                            i2 |= 32;
                                        }
                                        this.i0.add(codedInputStream.g(parser, extensionRegistryLite));
                                    } else if (iN != 58) {
                                        if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                        }
                                    } else {
                                        if ((i2 & 64) != 64) {
                                            this.j0 = new ArrayList();
                                            i2 |= 64;
                                        }
                                        this.j0.add(codedInputStream.g(parser, extensionRegistryLite));
                                    }
                                } else {
                                    this.f44058Y |= 16;
                                    this.h0 = codedInputStream.k();
                                }
                            } else {
                                this.f44058Y |= 2;
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
                    if ((i2 & 32) == 32) {
                        this.i0 = Collections.unmodifiableList(this.i0);
                    }
                    if ((i2 & 64) == 64) {
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
            if ((i2 & 32) == 32) {
                this.i0 = Collections.unmodifiableList(this.i0);
            }
            if ((i2 & 64) == 64) {
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

    public static final class StringTable extends GeneratedMessageLite implements StringTableOrBuilder {
        public static final StringTable f0;
        public static final Parser g0 = new AnonymousClass1();
        public final ByteString X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public LazyStringList f44072Y;
        public byte Z;
        public int e0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<StringTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new StringTable(codedInputStream);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<StringTable, Builder> implements StringTableOrBuilder {

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f44073Y;
            public LazyStringList Z;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                StringTable stringTableG = g();
                stringTableG.isInitialized();
                return stringTableG;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder c() {
                Builder builder = new Builder();
                builder.Z = LazyStringArrayList.f44218Y;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object c() {
                Builder builder = new Builder();
                builder.Z = LazyStringArrayList.f44218Y;
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
                builder.Z = LazyStringArrayList.f44218Y;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                h((StringTable) generatedMessageLite);
                return this;
            }

            public final StringTable g() {
                StringTable stringTable = new StringTable(this);
                if ((this.f44073Y & 1) == 1) {
                    this.Z = this.Z.getUnmodifiableView();
                    this.f44073Y &= -2;
                }
                stringTable.f44072Y = this.Z;
                return stringTable;
            }

            public final void h(StringTable stringTable) {
                if (stringTable == StringTable.f0) {
                    return;
                }
                if (!stringTable.f44072Y.isEmpty()) {
                    if (this.Z.isEmpty()) {
                        this.Z = stringTable.f44072Y;
                        this.f44073Y &= -2;
                    } else {
                        if ((this.f44073Y & 1) != 1) {
                            this.Z = new LazyStringArrayList(this.Z);
                            this.f44073Y |= 1;
                        }
                        this.Z.addAll(stringTable.f44072Y);
                    }
                }
                this.X = this.X.c(stringTable.X);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                StringTable stringTable = null;
                try {
                    try {
                        ((AnonymousClass1) StringTable.g0).getClass();
                        h(new StringTable(codedInputStream));
                    } catch (InvalidProtocolBufferException e2) {
                        StringTable stringTable2 = (StringTable) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            stringTable = stringTable2;
                            if (stringTable != null) {
                                h(stringTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (stringTable != null) {
                        h(stringTable);
                    }
                    throw th;
                }
            }
        }

        static {
            StringTable stringTable = new StringTable();
            f0 = stringTable;
            stringTable.f44072Y = LazyStringArrayList.f44218Y;
        }

        public StringTable() {
            this.Z = (byte) -1;
            this.e0 = -1;
            this.X = ByteString.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i2 = 0; i2 < this.f44072Y.size(); i2++) {
                ByteString byteString = this.f44072Y.getByteString(i2);
                codedOutputStream.x(1, 2);
                codedOutputStream.v(byteString.size());
                codedOutputStream.r(byteString);
            }
            codedOutputStream.r(this.X);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.e0;
            if (i2 != -1) {
                return i2;
            }
            int size = 0;
            for (int i3 = 0; i3 < this.f44072Y.size(); i3++) {
                ByteString byteString = this.f44072Y.getByteString(i3);
                size += byteString.size() + CodedOutputStream.f(byteString.size());
            }
            int size2 = this.X.size() + this.f44072Y.size() + size;
            this.e0 = size2;
            return size2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            if (this.Z == 1) {
                return true;
            }
            this.Z = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            Builder builder = new Builder();
            builder.Z = LazyStringArrayList.f44218Y;
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builder = new Builder();
            builder.Z = LazyStringArrayList.f44218Y;
            builder.h(this);
            return builder;
        }

        public StringTable(Builder builder) {
            this.Z = (byte) -1;
            this.e0 = -1;
            this.X = builder.X;
        }

        public StringTable(CodedInputStream codedInputStream) {
            this.Z = (byte) -1;
            this.e0 = -1;
            this.f44072Y = LazyStringArrayList.f44218Y;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z2 = false;
            boolean z3 = false;
            while (!z2) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN != 10) {
                                if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                }
                            } else {
                                ByteString byteStringE = codedInputStream.e();
                                if (!z3) {
                                    this.f44072Y = new LazyStringArrayList();
                                    z3 = true;
                                }
                                this.f44072Y.j(byteStringE);
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
                    if (z3) {
                        this.f44072Y = this.f44072Y.getUnmodifiableView();
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
            if (z3) {
                this.f44072Y = this.f44072Y.getUnmodifiableView();
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.X = output.h();
            }
        }
    }

    public static final class TypeTable extends GeneratedMessageLite implements TypeTableOrBuilder {
        public static final TypeTable h0;
        public static final Parser i0 = new AnonymousClass1();
        public final ByteString X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f44081Y;
        public List Z;
        public int e0;
        public byte f0;
        public int g0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<TypeTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new TypeTable(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<TypeTable, Builder> implements TypeTableOrBuilder {

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f44082Y;
            public List Z;
            public int e0;

            public static Builder i() {
                Builder builder = new Builder();
                builder.Z = Collections.EMPTY_LIST;
                builder.e0 = -1;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                k(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                TypeTable typeTableG = g();
                if (typeTableG.isInitialized()) {
                    return typeTableG;
                }
                throw new UninitializedMessageException();
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
                j((TypeTable) generatedMessageLite);
                return this;
            }

            public final TypeTable g() {
                TypeTable typeTable = new TypeTable(this);
                int i2 = this.f44082Y;
                if ((i2 & 1) == 1) {
                    this.Z = Collections.unmodifiableList(this.Z);
                    this.f44082Y &= -2;
                }
                typeTable.Z = this.Z;
                int i3 = (i2 & 2) != 2 ? 0 : 1;
                typeTable.e0 = this.e0;
                typeTable.f44081Y = i3;
                return typeTable;
            }

            public final void j(TypeTable typeTable) {
                if (typeTable == TypeTable.h0) {
                    return;
                }
                if (!typeTable.Z.isEmpty()) {
                    if (this.Z.isEmpty()) {
                        this.Z = typeTable.Z;
                        this.f44082Y &= -2;
                    } else {
                        if ((this.f44082Y & 1) != 1) {
                            this.Z = new ArrayList(this.Z);
                            this.f44082Y |= 1;
                        }
                        this.Z.addAll(typeTable.Z);
                    }
                }
                if ((typeTable.f44081Y & 1) == 1) {
                    int i2 = typeTable.e0;
                    this.f44082Y |= 2;
                    this.e0 = i2;
                }
                this.X = this.X.c(typeTable.X);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void k(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeTable typeTable = null;
                try {
                    try {
                        ((AnonymousClass1) TypeTable.i0).getClass();
                        j(new TypeTable(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e2) {
                        TypeTable typeTable2 = (TypeTable) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            typeTable = typeTable2;
                            if (typeTable != null) {
                                j(typeTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (typeTable != null) {
                        j(typeTable);
                    }
                    throw th;
                }
            }
        }

        static {
            TypeTable typeTable = new TypeTable();
            h0 = typeTable;
            typeTable.Z = Collections.EMPTY_LIST;
            typeTable.e0 = -1;
        }

        public TypeTable() {
            this.f0 = (byte) -1;
            this.g0 = -1;
            this.X = ByteString.X;
        }

        public static Builder e(TypeTable typeTable) {
            Builder builderI = Builder.i();
            builderI.j(typeTable);
            return builderI;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i2 = 0; i2 < this.Z.size(); i2++) {
                codedOutputStream.o(1, (MessageLite) this.Z.get(i2));
            }
            if ((this.f44081Y & 1) == 1) {
                codedOutputStream.m(2, this.e0);
            }
            codedOutputStream.r(this.X);
        }

        public final Builder g() {
            return e(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.g0;
            if (i2 != -1) {
                return i2;
            }
            int iB = 0;
            for (int i3 = 0; i3 < this.Z.size(); i3++) {
                iB += CodedOutputStream.d(1, (MessageLite) this.Z.get(i3));
            }
            if ((this.f44081Y & 1) == 1) {
                iB += CodedOutputStream.b(2, this.e0);
            }
            int size = this.X.size() + iB;
            this.g0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.f0;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i2 = 0; i2 < this.Z.size(); i2++) {
                if (!((Type) this.Z.get(i2)).isInitialized()) {
                    this.f0 = (byte) 0;
                    return false;
                }
            }
            this.f0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.i();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            return e(this);
        }

        public TypeTable(Builder builder) {
            this.f0 = (byte) -1;
            this.g0 = -1;
            this.X = builder.X;
        }

        public TypeTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f0 = (byte) -1;
            this.g0 = -1;
            this.Z = Collections.EMPTY_LIST;
            this.e0 = -1;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z2 = false;
            boolean z3 = false;
            while (!z2) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN == 10) {
                                if (!z3) {
                                    this.Z = new ArrayList();
                                    z3 = true;
                                }
                                this.Z.add(codedInputStream.g(Type.v0, extensionRegistryLite));
                            } else if (iN != 16) {
                                if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                }
                            } else {
                                this.f44081Y |= 1;
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
                    if (z3) {
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
            if (z3) {
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

    public static final class VersionRequirement extends GeneratedMessageLite implements VersionRequirementOrBuilder {
        public static final VersionRequirement l0;
        public static final Parser m0 = new AnonymousClass1();
        public final ByteString X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f44084Y;
        public int Z;
        public int e0;
        public Level f0;
        public int g0;
        public int h0;
        public VersionKind i0;
        public byte j0;
        public int k0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<VersionRequirement> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new VersionRequirement(codedInputStream);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirement, Builder> implements VersionRequirementOrBuilder {

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f44085Y;
            public int Z;
            public int e0;
            public Level f0;
            public int g0;
            public int h0;
            public VersionKind i0;

            public static Builder i() {
                Builder builder = new Builder();
                builder.f0 = Level.ERROR;
                builder.i0 = VersionKind.LANGUAGE_VERSION;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                k(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                VersionRequirement versionRequirementG = g();
                versionRequirementG.isInitialized();
                return versionRequirementG;
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
                j((VersionRequirement) generatedMessageLite);
                return this;
            }

            public final VersionRequirement g() {
                VersionRequirement versionRequirement = new VersionRequirement(this);
                int i2 = this.f44085Y;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                versionRequirement.Z = this.Z;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                versionRequirement.e0 = this.e0;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                versionRequirement.f0 = this.f0;
                if ((i2 & 8) == 8) {
                    i3 |= 8;
                }
                versionRequirement.g0 = this.g0;
                if ((i2 & 16) == 16) {
                    i3 |= 16;
                }
                versionRequirement.h0 = this.h0;
                if ((i2 & 32) == 32) {
                    i3 |= 32;
                }
                versionRequirement.i0 = this.i0;
                versionRequirement.f44084Y = i3;
                return versionRequirement;
            }

            public final void j(VersionRequirement versionRequirement) {
                if (versionRequirement == VersionRequirement.l0) {
                    return;
                }
                int i2 = versionRequirement.f44084Y;
                if ((i2 & 1) == 1) {
                    int i3 = versionRequirement.Z;
                    this.f44085Y = 1 | this.f44085Y;
                    this.Z = i3;
                }
                if ((i2 & 2) == 2) {
                    int i4 = versionRequirement.e0;
                    this.f44085Y = 2 | this.f44085Y;
                    this.e0 = i4;
                }
                if ((i2 & 4) == 4) {
                    Level level = versionRequirement.f0;
                    level.getClass();
                    this.f44085Y = 4 | this.f44085Y;
                    this.f0 = level;
                }
                int i5 = versionRequirement.f44084Y;
                if ((i5 & 8) == 8) {
                    int i6 = versionRequirement.g0;
                    this.f44085Y = 8 | this.f44085Y;
                    this.g0 = i6;
                }
                if ((i5 & 16) == 16) {
                    int i7 = versionRequirement.h0;
                    this.f44085Y = 16 | this.f44085Y;
                    this.h0 = i7;
                }
                if ((i5 & 32) == 32) {
                    VersionKind versionKind = versionRequirement.i0;
                    versionKind.getClass();
                    this.f44085Y = 32 | this.f44085Y;
                    this.i0 = versionKind;
                }
                this.X = this.X.c(versionRequirement.X);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void k(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                VersionRequirement versionRequirement = null;
                try {
                    try {
                        ((AnonymousClass1) VersionRequirement.m0).getClass();
                        j(new VersionRequirement(codedInputStream));
                    } catch (InvalidProtocolBufferException e2) {
                        VersionRequirement versionRequirement2 = (VersionRequirement) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            versionRequirement = versionRequirement2;
                            if (versionRequirement != null) {
                                j(versionRequirement);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (versionRequirement != null) {
                        j(versionRequirement);
                    }
                    throw th;
                }
            }
        }

        public enum Level implements Internal.EnumLite {
            WARNING(0),
            ERROR(1),
            HIDDEN(2);

            public final int X;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$Level$1, reason: invalid class name */
            public static class AnonymousClass1 implements Internal.EnumLiteMap<Level> {
            }

            Level(int i2) {
                this.X = i2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.X;
            }
        }

        public enum VersionKind implements Internal.EnumLite {
            LANGUAGE_VERSION(0),
            COMPILER_VERSION(1),
            API_VERSION(2);

            public final int X;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$VersionKind$1, reason: invalid class name */
            public static class AnonymousClass1 implements Internal.EnumLiteMap<VersionKind> {
            }

            VersionKind(int i2) {
                this.X = i2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.X;
            }
        }

        static {
            VersionRequirement versionRequirement = new VersionRequirement();
            l0 = versionRequirement;
            versionRequirement.Z = 0;
            versionRequirement.e0 = 0;
            versionRequirement.f0 = Level.ERROR;
            versionRequirement.g0 = 0;
            versionRequirement.h0 = 0;
            versionRequirement.i0 = VersionKind.LANGUAGE_VERSION;
        }

        public VersionRequirement() {
            this.j0 = (byte) -1;
            this.k0 = -1;
            this.X = ByteString.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f44084Y & 1) == 1) {
                codedOutputStream.m(1, this.Z);
            }
            if ((this.f44084Y & 2) == 2) {
                codedOutputStream.m(2, this.e0);
            }
            if ((this.f44084Y & 4) == 4) {
                codedOutputStream.l(3, this.f0.X);
            }
            if ((this.f44084Y & 8) == 8) {
                codedOutputStream.m(4, this.g0);
            }
            if ((this.f44084Y & 16) == 16) {
                codedOutputStream.m(5, this.h0);
            }
            if ((this.f44084Y & 32) == 32) {
                codedOutputStream.l(6, this.i0.X);
            }
            codedOutputStream.r(this.X);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.k0;
            if (i2 != -1) {
                return i2;
            }
            int iB = (this.f44084Y & 1) == 1 ? CodedOutputStream.b(1, this.Z) : 0;
            if ((this.f44084Y & 2) == 2) {
                iB += CodedOutputStream.b(2, this.e0);
            }
            if ((this.f44084Y & 4) == 4) {
                iB += CodedOutputStream.a(3, this.f0.X);
            }
            if ((this.f44084Y & 8) == 8) {
                iB += CodedOutputStream.b(4, this.g0);
            }
            if ((this.f44084Y & 16) == 16) {
                iB += CodedOutputStream.b(5, this.h0);
            }
            if ((this.f44084Y & 32) == 32) {
                iB += CodedOutputStream.a(6, this.i0.X);
            }
            int size = this.X.size() + iB;
            this.k0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            if (this.j0 == 1) {
                return true;
            }
            this.j0 = (byte) 1;
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

        public VersionRequirement(Builder builder) {
            this.j0 = (byte) -1;
            this.k0 = -1;
            this.X = builder.X;
        }

        public VersionRequirement(CodedInputStream codedInputStream) {
            this.j0 = (byte) -1;
            this.k0 = -1;
            boolean z2 = false;
            this.Z = 0;
            this.e0 = 0;
            Level level = Level.ERROR;
            this.f0 = level;
            this.g0 = 0;
            this.h0 = 0;
            VersionKind versionKind = VersionKind.LANGUAGE_VERSION;
            this.i0 = versionKind;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            while (!z2) {
                try {
                    try {
                        try {
                            int iN = codedInputStream.n();
                            if (iN != 0) {
                                if (iN == 8) {
                                    this.f44084Y |= 1;
                                    this.Z = codedInputStream.k();
                                } else if (iN != 16) {
                                    VersionKind versionKind2 = null;
                                    Level level2 = null;
                                    if (iN == 24) {
                                        int iK = codedInputStream.k();
                                        if (iK == 0) {
                                            level2 = Level.WARNING;
                                        } else if (iK == 1) {
                                            level2 = level;
                                        } else if (iK == 2) {
                                            level2 = Level.HIDDEN;
                                        }
                                        if (level2 == null) {
                                            codedOutputStreamJ.v(iN);
                                            codedOutputStreamJ.v(iK);
                                        } else {
                                            this.f44084Y |= 4;
                                            this.f0 = level2;
                                        }
                                    } else if (iN == 32) {
                                        this.f44084Y |= 8;
                                        this.g0 = codedInputStream.k();
                                    } else if (iN == 40) {
                                        this.f44084Y |= 16;
                                        this.h0 = codedInputStream.k();
                                    } else if (iN != 48) {
                                        if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                        }
                                    } else {
                                        int iK2 = codedInputStream.k();
                                        if (iK2 == 0) {
                                            versionKind2 = versionKind;
                                        } else if (iK2 == 1) {
                                            versionKind2 = VersionKind.COMPILER_VERSION;
                                        } else if (iK2 == 2) {
                                            versionKind2 = VersionKind.API_VERSION;
                                        }
                                        if (versionKind2 == null) {
                                            codedOutputStreamJ.v(iN);
                                            codedOutputStreamJ.v(iK2);
                                        } else {
                                            this.f44084Y |= 32;
                                            this.i0 = versionKind2;
                                        }
                                    }
                                } else {
                                    this.f44084Y |= 2;
                                    this.e0 = codedInputStream.k();
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

    public static final class VersionRequirementTable extends GeneratedMessageLite implements VersionRequirementTableOrBuilder {
        public static final VersionRequirementTable f0;
        public static final Parser g0 = new AnonymousClass1();
        public final ByteString X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public List f44088Y;
        public byte Z;
        public int e0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<VersionRequirementTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new VersionRequirementTable(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirementTable, Builder> implements VersionRequirementTableOrBuilder {

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f44089Y;
            public List Z;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                VersionRequirementTable versionRequirementTableG = g();
                versionRequirementTableG.isInitialized();
                return versionRequirementTableG;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder c() {
                Builder builder = new Builder();
                builder.Z = Collections.EMPTY_LIST;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object c() {
                Builder builder = new Builder();
                builder.Z = Collections.EMPTY_LIST;
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
                builder.Z = Collections.EMPTY_LIST;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                h((VersionRequirementTable) generatedMessageLite);
                return this;
            }

            public final VersionRequirementTable g() {
                VersionRequirementTable versionRequirementTable = new VersionRequirementTable(this);
                if ((this.f44089Y & 1) == 1) {
                    this.Z = Collections.unmodifiableList(this.Z);
                    this.f44089Y &= -2;
                }
                versionRequirementTable.f44088Y = this.Z;
                return versionRequirementTable;
            }

            public final void h(VersionRequirementTable versionRequirementTable) {
                if (versionRequirementTable == VersionRequirementTable.f0) {
                    return;
                }
                if (!versionRequirementTable.f44088Y.isEmpty()) {
                    if (this.Z.isEmpty()) {
                        this.Z = versionRequirementTable.f44088Y;
                        this.f44089Y &= -2;
                    } else {
                        if ((this.f44089Y & 1) != 1) {
                            this.Z = new ArrayList(this.Z);
                            this.f44089Y |= 1;
                        }
                        this.Z.addAll(versionRequirementTable.f44088Y);
                    }
                }
                this.X = this.X.c(versionRequirementTable.X);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                VersionRequirementTable versionRequirementTable = null;
                try {
                    try {
                        ((AnonymousClass1) VersionRequirementTable.g0).getClass();
                        h(new VersionRequirementTable(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e2) {
                        VersionRequirementTable versionRequirementTable2 = (VersionRequirementTable) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            versionRequirementTable = versionRequirementTable2;
                            if (versionRequirementTable != null) {
                                h(versionRequirementTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (versionRequirementTable != null) {
                        h(versionRequirementTable);
                    }
                    throw th;
                }
            }
        }

        static {
            VersionRequirementTable versionRequirementTable = new VersionRequirementTable();
            f0 = versionRequirementTable;
            versionRequirementTable.f44088Y = Collections.EMPTY_LIST;
        }

        public VersionRequirementTable() {
            this.Z = (byte) -1;
            this.e0 = -1;
            this.X = ByteString.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i2 = 0; i2 < this.f44088Y.size(); i2++) {
                codedOutputStream.o(1, (MessageLite) this.f44088Y.get(i2));
            }
            codedOutputStream.r(this.X);
        }

        public final Builder g() {
            Builder builder = new Builder();
            builder.Z = Collections.EMPTY_LIST;
            builder.h(this);
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.e0;
            if (i2 != -1) {
                return i2;
            }
            int iD = 0;
            for (int i3 = 0; i3 < this.f44088Y.size(); i3++) {
                iD += CodedOutputStream.d(1, (MessageLite) this.f44088Y.get(i3));
            }
            int size = this.X.size() + iD;
            this.e0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            if (this.Z == 1) {
                return true;
            }
            this.Z = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            Builder builder = new Builder();
            builder.Z = Collections.EMPTY_LIST;
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builder = new Builder();
            builder.Z = Collections.EMPTY_LIST;
            builder.h(this);
            return builder;
        }

        public VersionRequirementTable(Builder builder) {
            this.Z = (byte) -1;
            this.e0 = -1;
            this.X = builder.X;
        }

        public VersionRequirementTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.Z = (byte) -1;
            this.e0 = -1;
            this.f44088Y = Collections.EMPTY_LIST;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z2 = false;
            boolean z3 = false;
            while (!z2) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN != 10) {
                                if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                }
                            } else {
                                if (!z3) {
                                    this.f44088Y = new ArrayList();
                                    z3 = true;
                                }
                                this.f44088Y.add(codedInputStream.g(VersionRequirement.m0, extensionRegistryLite));
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
                    if (z3) {
                        this.f44088Y = Collections.unmodifiableList(this.f44088Y);
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
            if (z3) {
                this.f44088Y = Collections.unmodifiableList(this.f44088Y);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.X = output.h();
            }
        }
    }

    public static final class Constructor extends GeneratedMessageLite.ExtendableMessage<Constructor> implements ConstructorOrBuilder {
        public static final Constructor j0;
        public static final Parser k0 = new AnonymousClass1();

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ByteString f44050Y;
        public int Z;
        public int e0;
        public List f0;
        public List g0;
        public byte h0;
        public int i0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<Constructor> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Constructor(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Constructor, Builder> implements ConstructorOrBuilder {
            public int e0;
            public int f0;
            public List g0;
            public List h0;

            public static Builder j() {
                Builder builder = new Builder();
                builder.f0 = 6;
                List list = Collections.EMPTY_LIST;
                builder.g0 = list;
                builder.h0 = list;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Constructor constructorI = i();
                if (constructorI.isInitialized()) {
                    return constructorI;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final GeneratedMessageLite.Builder c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                k((Constructor) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            public final Constructor i() {
                Constructor constructor = new Constructor(this);
                int i2 = this.e0;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                constructor.e0 = this.f0;
                if ((i2 & 2) == 2) {
                    this.g0 = Collections.unmodifiableList(this.g0);
                    this.e0 &= -3;
                }
                constructor.f0 = this.g0;
                if ((this.e0 & 4) == 4) {
                    this.h0 = Collections.unmodifiableList(this.h0);
                    this.e0 &= -5;
                }
                constructor.g0 = this.h0;
                constructor.Z = i3;
                return constructor;
            }

            public final void k(Constructor constructor) {
                if (constructor == Constructor.j0) {
                    return;
                }
                if ((constructor.Z & 1) == 1) {
                    int i2 = constructor.e0;
                    this.e0 = 1 | this.e0;
                    this.f0 = i2;
                }
                if (!constructor.f0.isEmpty()) {
                    if (this.g0.isEmpty()) {
                        this.g0 = constructor.f0;
                        this.e0 &= -3;
                    } else {
                        if ((this.e0 & 2) != 2) {
                            this.g0 = new ArrayList(this.g0);
                            this.e0 |= 2;
                        }
                        this.g0.addAll(constructor.f0);
                    }
                }
                if (!constructor.g0.isEmpty()) {
                    if (this.h0.isEmpty()) {
                        this.h0 = constructor.g0;
                        this.e0 &= -5;
                    } else {
                        if ((this.e0 & 4) != 4) {
                            this.h0 = new ArrayList(this.h0);
                            this.e0 |= 4;
                        }
                        this.h0.addAll(constructor.g0);
                    }
                }
                h(constructor);
                this.X = this.X.c(constructor.f44050Y);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void l(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Constructor constructor = null;
                try {
                    try {
                        ((AnonymousClass1) Constructor.k0).getClass();
                        k(new Constructor(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e2) {
                        Constructor constructor2 = (Constructor) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            constructor = constructor2;
                            if (constructor != null) {
                                k(constructor);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (constructor != null) {
                        k(constructor);
                    }
                    throw th;
                }
            }
        }

        static {
            Constructor constructor = new Constructor();
            j0 = constructor;
            constructor.e0 = 6;
            List list = Collections.EMPTY_LIST;
            constructor.f0 = list;
            constructor.g0 = list;
        }

        public Constructor(Builder builder) {
            super(builder);
            this.h0 = (byte) -1;
            this.i0 = -1;
            this.f44050Y = builder.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.Z & 1) == 1) {
                codedOutputStream.m(1, this.e0);
            }
            for (int i2 = 0; i2 < this.f0.size(); i2++) {
                codedOutputStream.o(2, (MessageLite) this.f0.get(i2));
            }
            for (int i3 = 0; i3 < this.g0.size(); i3++) {
                codedOutputStream.m(31, ((Integer) this.g0.get(i3)).intValue());
            }
            extensionWriter.a(19000, codedOutputStream);
            codedOutputStream.r(this.f44050Y);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return j0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.i0;
            if (i2 != -1) {
                return i2;
            }
            int iB = (this.Z & 1) == 1 ? CodedOutputStream.b(1, this.e0) : 0;
            for (int i3 = 0; i3 < this.f0.size(); i3++) {
                iB += CodedOutputStream.d(2, (MessageLite) this.f0.get(i3));
            }
            int iC = 0;
            for (int i4 = 0; i4 < this.g0.size(); i4++) {
                iC += CodedOutputStream.c(((Integer) this.g0.get(i4)).intValue());
            }
            int size = this.f44050Y.size() + h() + android.support.v4.media.a.c(2, iB + iC, this.g0);
            this.i0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.h0;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i2 = 0; i2 < this.f0.size(); i2++) {
                if (!((ValueParameter) this.f0.get(i2)).isInitialized()) {
                    this.h0 = (byte) 0;
                    return false;
                }
            }
            if (g()) {
                this.h0 = (byte) 1;
                return true;
            }
            this.h0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderJ = Builder.j();
            builderJ.k(this);
            return builderJ;
        }

        public Constructor() {
            this.h0 = (byte) -1;
            this.i0 = -1;
            this.f44050Y = ByteString.X;
        }

        public Constructor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.h0 = (byte) -1;
            this.i0 = -1;
            this.e0 = 6;
            List list = Collections.EMPTY_LIST;
            this.f0 = list;
            this.g0 = list;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.Z |= 1;
                                this.e0 = codedInputStream.k();
                            } else if (iN == 18) {
                                if ((i2 & 2) != 2) {
                                    this.f0 = new ArrayList();
                                    i2 |= 2;
                                }
                                this.f0.add(codedInputStream.g(ValueParameter.n0, extensionRegistryLite));
                            } else if (iN == 248) {
                                if ((i2 & 4) != 4) {
                                    this.g0 = new ArrayList();
                                    i2 |= 4;
                                }
                                this.g0.add(Integer.valueOf(codedInputStream.k()));
                            } else if (iN != 250) {
                                if (!n(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iN)) {
                                }
                            } else {
                                int iD = codedInputStream.d(codedInputStream.k());
                                if ((i2 & 4) != 4 && codedInputStream.b() > 0) {
                                    this.g0 = new ArrayList();
                                    i2 |= 4;
                                }
                                while (codedInputStream.b() > 0) {
                                    this.g0.add(Integer.valueOf(codedInputStream.k()));
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
                    if ((i2 & 2) == 2) {
                        this.f0 = Collections.unmodifiableList(this.f0);
                    }
                    if ((i2 & 4) == 4) {
                        this.g0 = Collections.unmodifiableList(this.g0);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f44050Y = output.h();
                    }
                    m();
                    throw th;
                }
            }
            if ((i2 & 2) == 2) {
                this.f0 = Collections.unmodifiableList(this.f0);
            }
            if ((i2 & 4) == 4) {
                this.g0 = Collections.unmodifiableList(this.g0);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.f44050Y = output.h();
            }
            m();
        }
    }

    public static final class EnumEntry extends GeneratedMessageLite.ExtendableMessage<EnumEntry> implements EnumEntryOrBuilder {
        public static final EnumEntry h0;
        public static final Parser i0 = new AnonymousClass1();

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ByteString f44057Y;
        public int Z;
        public int e0;
        public byte f0;
        public int g0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<EnumEntry> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new EnumEntry(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumEntry, Builder> implements EnumEntryOrBuilder {
            public int e0;
            public int f0;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                j(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                EnumEntry enumEntry = new EnumEntry(this);
                int i2 = (this.e0 & 1) != 1 ? 0 : 1;
                enumEntry.e0 = this.f0;
                enumEntry.Z = i2;
                if (enumEntry.isInitialized()) {
                    return enumEntry;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder c() {
                Builder builder = new Builder();
                EnumEntry enumEntry = new EnumEntry(this);
                int i2 = (this.e0 & 1) != 1 ? 0 : 1;
                enumEntry.e0 = this.f0;
                enumEntry.Z = i2;
                builder.i(enumEntry);
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object c() {
                Builder builder = new Builder();
                EnumEntry enumEntry = new EnumEntry(this);
                int i2 = (this.e0 & 1) != 1 ? 0 : 1;
                enumEntry.e0 = this.f0;
                enumEntry.Z = i2;
                builder.i(enumEntry);
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                j(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final GeneratedMessageLite.Builder c() {
                Builder builder = new Builder();
                EnumEntry enumEntry = new EnumEntry(this);
                int i2 = (this.e0 & 1) != 1 ? 0 : 1;
                enumEntry.e0 = this.f0;
                enumEntry.Z = i2;
                builder.i(enumEntry);
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                i((EnumEntry) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builder = new Builder();
                EnumEntry enumEntry = new EnumEntry(this);
                int i2 = (this.e0 & 1) != 1 ? 0 : 1;
                enumEntry.e0 = this.f0;
                enumEntry.Z = i2;
                builder.i(enumEntry);
                return builder;
            }

            public final void i(EnumEntry enumEntry) {
                if (enumEntry == EnumEntry.h0) {
                    return;
                }
                if ((enumEntry.Z & 1) == 1) {
                    int i2 = enumEntry.e0;
                    this.e0 = 1 | this.e0;
                    this.f0 = i2;
                }
                h(enumEntry);
                this.X = this.X.c(enumEntry.f44057Y);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void j(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                EnumEntry enumEntry = null;
                try {
                    try {
                        ((AnonymousClass1) EnumEntry.i0).getClass();
                        i(new EnumEntry(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e2) {
                        EnumEntry enumEntry2 = (EnumEntry) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            enumEntry = enumEntry2;
                            if (enumEntry != null) {
                                i(enumEntry);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (enumEntry != null) {
                        i(enumEntry);
                    }
                    throw th;
                }
            }
        }

        static {
            EnumEntry enumEntry = new EnumEntry();
            h0 = enumEntry;
            enumEntry.e0 = 0;
        }

        public EnumEntry(Builder builder) {
            super(builder);
            this.f0 = (byte) -1;
            this.g0 = -1;
            this.f44057Y = builder.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.Z & 1) == 1) {
                codedOutputStream.m(1, this.e0);
            }
            extensionWriter.a(200, codedOutputStream);
            codedOutputStream.r(this.f44057Y);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return h0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.g0;
            if (i2 != -1) {
                return i2;
            }
            int size = this.f44057Y.size() + h() + ((this.Z & 1) == 1 ? CodedOutputStream.b(1, this.e0) : 0);
            this.g0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.f0;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (g()) {
                this.f0 = (byte) 1;
                return true;
            }
            this.f0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builder = new Builder();
            builder.i(this);
            return builder;
        }

        public EnumEntry() {
            this.f0 = (byte) -1;
            this.g0 = -1;
            this.f44057Y = ByteString.X;
        }

        public EnumEntry(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f0 = (byte) -1;
            this.g0 = -1;
            boolean z2 = false;
            this.e0 = 0;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            while (!z2) {
                try {
                    try {
                        try {
                            int iN = codedInputStream.n();
                            if (iN != 0) {
                                if (iN != 8) {
                                    if (!n(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iN)) {
                                    }
                                } else {
                                    this.Z |= 1;
                                    this.e0 = codedInputStream.k();
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
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f44057Y = output.h();
                    }
                    m();
                    throw th;
                }
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.f44057Y = output.h();
            }
            m();
        }
    }

    public static final class Package extends GeneratedMessageLite.ExtendableMessage<Package> implements PackageOrBuilder {
        public static final Package l0;
        public static final Parser m0 = new AnonymousClass1();

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ByteString f44064Y;
        public int Z;
        public List e0;
        public List f0;
        public List g0;
        public TypeTable h0;
        public VersionRequirementTable i0;
        public byte j0;
        public int k0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<Package> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Package(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Package, Builder> implements PackageOrBuilder {
            public int e0;
            public List f0;
            public List g0;
            public List h0;
            public TypeTable i0;
            public VersionRequirementTable j0;

            public static Builder j() {
                Builder builder = new Builder();
                List list = Collections.EMPTY_LIST;
                builder.f0 = list;
                builder.g0 = list;
                builder.h0 = list;
                builder.i0 = TypeTable.h0;
                builder.j0 = VersionRequirementTable.f0;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Package packageI = i();
                if (packageI.isInitialized()) {
                    return packageI;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final GeneratedMessageLite.Builder c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                k((Package) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            public final Package i() {
                Package r0 = new Package(this);
                int i2 = this.e0;
                if ((i2 & 1) == 1) {
                    this.f0 = Collections.unmodifiableList(this.f0);
                    this.e0 &= -2;
                }
                r0.e0 = this.f0;
                if ((this.e0 & 2) == 2) {
                    this.g0 = Collections.unmodifiableList(this.g0);
                    this.e0 &= -3;
                }
                r0.f0 = this.g0;
                if ((this.e0 & 4) == 4) {
                    this.h0 = Collections.unmodifiableList(this.h0);
                    this.e0 &= -5;
                }
                r0.g0 = this.h0;
                int i3 = (i2 & 8) != 8 ? 0 : 1;
                r0.h0 = this.i0;
                if ((i2 & 16) == 16) {
                    i3 |= 2;
                }
                r0.i0 = this.j0;
                r0.Z = i3;
                return r0;
            }

            public final void k(Package r6) {
                VersionRequirementTable versionRequirementTable;
                TypeTable typeTable;
                if (r6 == Package.l0) {
                    return;
                }
                if (!r6.e0.isEmpty()) {
                    if (this.f0.isEmpty()) {
                        this.f0 = r6.e0;
                        this.e0 &= -2;
                    } else {
                        if ((this.e0 & 1) != 1) {
                            this.f0 = new ArrayList(this.f0);
                            this.e0 |= 1;
                        }
                        this.f0.addAll(r6.e0);
                    }
                }
                if (!r6.f0.isEmpty()) {
                    if (this.g0.isEmpty()) {
                        this.g0 = r6.f0;
                        this.e0 &= -3;
                    } else {
                        if ((this.e0 & 2) != 2) {
                            this.g0 = new ArrayList(this.g0);
                            this.e0 |= 2;
                        }
                        this.g0.addAll(r6.f0);
                    }
                }
                if (!r6.g0.isEmpty()) {
                    if (this.h0.isEmpty()) {
                        this.h0 = r6.g0;
                        this.e0 &= -5;
                    } else {
                        if ((this.e0 & 4) != 4) {
                            this.h0 = new ArrayList(this.h0);
                            this.e0 |= 4;
                        }
                        this.h0.addAll(r6.g0);
                    }
                }
                if ((r6.Z & 1) == 1) {
                    TypeTable typeTable2 = r6.h0;
                    if ((this.e0 & 8) != 8 || (typeTable = this.i0) == TypeTable.h0) {
                        this.i0 = typeTable2;
                    } else {
                        TypeTable.Builder builderE = TypeTable.e(typeTable);
                        builderE.j(typeTable2);
                        this.i0 = builderE.g();
                    }
                    this.e0 |= 8;
                }
                if ((r6.Z & 2) == 2) {
                    VersionRequirementTable versionRequirementTable2 = r6.i0;
                    if ((this.e0 & 16) != 16 || (versionRequirementTable = this.j0) == VersionRequirementTable.f0) {
                        this.j0 = versionRequirementTable2;
                    } else {
                        VersionRequirementTable.Builder builder = new VersionRequirementTable.Builder();
                        builder.Z = Collections.EMPTY_LIST;
                        builder.h(versionRequirementTable);
                        builder.h(versionRequirementTable2);
                        this.j0 = builder.g();
                    }
                    this.e0 |= 16;
                }
                h(r6);
                this.X = this.X.c(r6.f44064Y);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void l(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Package r0 = null;
                try {
                    try {
                        ((AnonymousClass1) Package.m0).getClass();
                        k(new Package(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e2) {
                        Package r4 = (Package) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            r0 = r4;
                            if (r0 != null) {
                                k(r0);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r0 != null) {
                        k(r0);
                    }
                    throw th;
                }
            }
        }

        static {
            Package r0 = new Package();
            l0 = r0;
            List list = Collections.EMPTY_LIST;
            r0.e0 = list;
            r0.f0 = list;
            r0.g0 = list;
            r0.h0 = TypeTable.h0;
            r0.i0 = VersionRequirementTable.f0;
        }

        public Package(Builder builder) {
            super(builder);
            this.j0 = (byte) -1;
            this.k0 = -1;
            this.f44064Y = builder.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            for (int i2 = 0; i2 < this.e0.size(); i2++) {
                codedOutputStream.o(3, (MessageLite) this.e0.get(i2));
            }
            for (int i3 = 0; i3 < this.f0.size(); i3++) {
                codedOutputStream.o(4, (MessageLite) this.f0.get(i3));
            }
            for (int i4 = 0; i4 < this.g0.size(); i4++) {
                codedOutputStream.o(5, (MessageLite) this.g0.get(i4));
            }
            if ((this.Z & 1) == 1) {
                codedOutputStream.o(30, this.h0);
            }
            if ((this.Z & 2) == 2) {
                codedOutputStream.o(32, this.i0);
            }
            extensionWriter.a(200, codedOutputStream);
            codedOutputStream.r(this.f44064Y);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return l0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.k0;
            if (i2 != -1) {
                return i2;
            }
            int iD = 0;
            for (int i3 = 0; i3 < this.e0.size(); i3++) {
                iD += CodedOutputStream.d(3, (MessageLite) this.e0.get(i3));
            }
            for (int i4 = 0; i4 < this.f0.size(); i4++) {
                iD += CodedOutputStream.d(4, (MessageLite) this.f0.get(i4));
            }
            for (int i5 = 0; i5 < this.g0.size(); i5++) {
                iD += CodedOutputStream.d(5, (MessageLite) this.g0.get(i5));
            }
            if ((this.Z & 1) == 1) {
                iD += CodedOutputStream.d(30, this.h0);
            }
            if ((this.Z & 2) == 2) {
                iD += CodedOutputStream.d(32, this.i0);
            }
            int size = this.f44064Y.size() + h() + iD;
            this.k0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.j0;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i2 = 0; i2 < this.e0.size(); i2++) {
                if (!((Function) this.e0.get(i2)).isInitialized()) {
                    this.j0 = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < this.f0.size(); i3++) {
                if (!((Property) this.f0.get(i3)).isInitialized()) {
                    this.j0 = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < this.g0.size(); i4++) {
                if (!((TypeAlias) this.g0.get(i4)).isInitialized()) {
                    this.j0 = (byte) 0;
                    return false;
                }
            }
            if ((this.Z & 1) == 1 && !this.h0.isInitialized()) {
                this.j0 = (byte) 0;
                return false;
            }
            if (g()) {
                this.j0 = (byte) 1;
                return true;
            }
            this.j0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderJ = Builder.j();
            builderJ.k(this);
            return builderJ;
        }

        public Package() {
            this.j0 = (byte) -1;
            this.k0 = -1;
            this.f44064Y = ByteString.X;
        }

        public Package(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.j0 = (byte) -1;
            this.k0 = -1;
            List list = Collections.EMPTY_LIST;
            this.e0 = list;
            this.f0 = list;
            this.g0 = list;
            this.h0 = TypeTable.h0;
            this.i0 = VersionRequirementTable.f0;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN == 26) {
                                int i3 = (i2 == true ? 1 : 0) & 1;
                                i2 = i2;
                                if (i3 != 1) {
                                    this.e0 = new ArrayList();
                                    i2 = (i2 == true ? 1 : 0) | 1;
                                }
                                this.e0.add(codedInputStream.g(Function.w0, extensionRegistryLite));
                            } else if (iN == 34) {
                                int i4 = (i2 == true ? 1 : 0) & 2;
                                i2 = i2;
                                if (i4 != 2) {
                                    this.f0 = new ArrayList();
                                    i2 = (i2 == true ? 1 : 0) | 2;
                                }
                                this.f0.add(codedInputStream.g(Property.w0, extensionRegistryLite));
                            } else if (iN != 42) {
                                VersionRequirementTable.Builder builder = null;
                                TypeTable.Builder builderE = null;
                                if (iN == 242) {
                                    if ((this.Z & 1) == 1) {
                                        TypeTable typeTable = this.h0;
                                        typeTable.getClass();
                                        builderE = TypeTable.e(typeTable);
                                    }
                                    TypeTable typeTable2 = (TypeTable) codedInputStream.g(TypeTable.i0, extensionRegistryLite);
                                    this.h0 = typeTable2;
                                    if (builderE != null) {
                                        builderE.j(typeTable2);
                                        this.h0 = builderE.g();
                                    }
                                    this.Z |= 1;
                                } else if (iN != 258) {
                                    if (!n(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iN)) {
                                    }
                                } else {
                                    if ((this.Z & 2) == 2) {
                                        VersionRequirementTable versionRequirementTable = this.i0;
                                        versionRequirementTable.getClass();
                                        builder = new VersionRequirementTable.Builder();
                                        builder.Z = Collections.EMPTY_LIST;
                                        builder.h(versionRequirementTable);
                                    }
                                    VersionRequirementTable versionRequirementTable2 = (VersionRequirementTable) codedInputStream.g(VersionRequirementTable.g0, extensionRegistryLite);
                                    this.i0 = versionRequirementTable2;
                                    if (builder != null) {
                                        builder.h(versionRequirementTable2);
                                        this.i0 = builder.g();
                                    }
                                    this.Z |= 2;
                                }
                            } else {
                                int i5 = (i2 == true ? 1 : 0) & 4;
                                i2 = i2;
                                if (i5 != 4) {
                                    this.g0 = new ArrayList();
                                    i2 = (i2 == true ? 1 : 0) | 4;
                                }
                                this.g0.add(codedInputStream.g(TypeAlias.q0, extensionRegistryLite));
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
                    if (((i2 == true ? 1 : 0) & 1) == 1) {
                        this.e0 = Collections.unmodifiableList(this.e0);
                    }
                    if (((i2 == true ? 1 : 0) & 2) == 2) {
                        this.f0 = Collections.unmodifiableList(this.f0);
                    }
                    if (((i2 == true ? 1 : 0) & 4) == 4) {
                        this.g0 = Collections.unmodifiableList(this.g0);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f44064Y = output.h();
                    }
                    m();
                    throw th;
                }
            }
            if (((i2 == true ? 1 : 0) & 1) == 1) {
                this.e0 = Collections.unmodifiableList(this.e0);
            }
            if (((i2 == true ? 1 : 0) & 2) == 2) {
                this.f0 = Collections.unmodifiableList(this.f0);
            }
            if (((i2 == true ? 1 : 0) & 4) == 4) {
                this.g0 = Collections.unmodifiableList(this.g0);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.f44064Y = output.h();
            }
            m();
        }
    }

    public static final class PackageFragment extends GeneratedMessageLite.ExtendableMessage<PackageFragment> implements PackageFragmentOrBuilder {
        public static final PackageFragment k0;
        public static final Parser l0 = new AnonymousClass1();

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ByteString f44065Y;
        public int Z;
        public StringTable e0;
        public QualifiedNameTable f0;
        public Package g0;
        public List h0;
        public byte i0;
        public int j0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<PackageFragment> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new PackageFragment(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<PackageFragment, Builder> implements PackageFragmentOrBuilder {
            public int e0;
            public StringTable f0;
            public QualifiedNameTable g0;
            public Package h0;
            public List i0;

            public static Builder j() {
                Builder builder = new Builder();
                builder.f0 = StringTable.f0;
                builder.g0 = QualifiedNameTable.f0;
                builder.h0 = Package.l0;
                builder.i0 = Collections.EMPTY_LIST;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                PackageFragment packageFragmentI = i();
                if (packageFragmentI.isInitialized()) {
                    return packageFragmentI;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final GeneratedMessageLite.Builder c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                k((PackageFragment) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            public final PackageFragment i() {
                PackageFragment packageFragment = new PackageFragment(this);
                int i2 = this.e0;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                packageFragment.e0 = this.f0;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                packageFragment.f0 = this.g0;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                packageFragment.g0 = this.h0;
                if ((i2 & 8) == 8) {
                    this.i0 = Collections.unmodifiableList(this.i0);
                    this.e0 &= -9;
                }
                packageFragment.h0 = this.i0;
                packageFragment.Z = i3;
                return packageFragment;
            }

            public final void k(PackageFragment packageFragment) {
                Package r2;
                QualifiedNameTable qualifiedNameTable;
                StringTable stringTable;
                if (packageFragment == PackageFragment.k0) {
                    return;
                }
                if ((packageFragment.Z & 1) == 1) {
                    StringTable stringTable2 = packageFragment.e0;
                    if ((this.e0 & 1) != 1 || (stringTable = this.f0) == StringTable.f0) {
                        this.f0 = stringTable2;
                    } else {
                        StringTable.Builder builder = new StringTable.Builder();
                        builder.Z = LazyStringArrayList.f44218Y;
                        builder.h(stringTable);
                        builder.h(stringTable2);
                        this.f0 = builder.g();
                    }
                    this.e0 |= 1;
                }
                if ((packageFragment.Z & 2) == 2) {
                    QualifiedNameTable qualifiedNameTable2 = packageFragment.f0;
                    if ((this.e0 & 2) != 2 || (qualifiedNameTable = this.g0) == QualifiedNameTable.f0) {
                        this.g0 = qualifiedNameTable2;
                    } else {
                        QualifiedNameTable.Builder builder2 = new QualifiedNameTable.Builder();
                        builder2.Z = Collections.EMPTY_LIST;
                        builder2.h(qualifiedNameTable);
                        builder2.h(qualifiedNameTable2);
                        this.g0 = builder2.g();
                    }
                    this.e0 |= 2;
                }
                if ((packageFragment.Z & 4) == 4) {
                    Package r0 = packageFragment.g0;
                    if ((this.e0 & 4) != 4 || (r2 = this.h0) == Package.l0) {
                        this.h0 = r0;
                    } else {
                        Package.Builder builderJ = Package.Builder.j();
                        builderJ.k(r2);
                        builderJ.k(r0);
                        this.h0 = builderJ.i();
                    }
                    this.e0 |= 4;
                }
                if (!packageFragment.h0.isEmpty()) {
                    if (this.i0.isEmpty()) {
                        this.i0 = packageFragment.h0;
                        this.e0 &= -9;
                    } else {
                        if ((this.e0 & 8) != 8) {
                            this.i0 = new ArrayList(this.i0);
                            this.e0 |= 8;
                        }
                        this.i0.addAll(packageFragment.h0);
                    }
                }
                h(packageFragment);
                this.X = this.X.c(packageFragment.f44065Y);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void l(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                PackageFragment packageFragment = null;
                try {
                    try {
                        ((AnonymousClass1) PackageFragment.l0).getClass();
                        k(new PackageFragment(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e2) {
                        PackageFragment packageFragment2 = (PackageFragment) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            packageFragment = packageFragment2;
                            if (packageFragment != null) {
                                k(packageFragment);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (packageFragment != null) {
                        k(packageFragment);
                    }
                    throw th;
                }
            }
        }

        static {
            PackageFragment packageFragment = new PackageFragment();
            k0 = packageFragment;
            packageFragment.e0 = StringTable.f0;
            packageFragment.f0 = QualifiedNameTable.f0;
            packageFragment.g0 = Package.l0;
            packageFragment.h0 = Collections.EMPTY_LIST;
        }

        public PackageFragment(Builder builder) {
            super(builder);
            this.i0 = (byte) -1;
            this.j0 = -1;
            this.f44065Y = builder.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.Z & 1) == 1) {
                codedOutputStream.o(1, this.e0);
            }
            if ((this.Z & 2) == 2) {
                codedOutputStream.o(2, this.f0);
            }
            if ((this.Z & 4) == 4) {
                codedOutputStream.o(3, this.g0);
            }
            for (int i2 = 0; i2 < this.h0.size(); i2++) {
                codedOutputStream.o(4, (MessageLite) this.h0.get(i2));
            }
            extensionWriter.a(200, codedOutputStream);
            codedOutputStream.r(this.f44065Y);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return k0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.j0;
            if (i2 != -1) {
                return i2;
            }
            int iD = (this.Z & 1) == 1 ? CodedOutputStream.d(1, this.e0) : 0;
            if ((this.Z & 2) == 2) {
                iD += CodedOutputStream.d(2, this.f0);
            }
            if ((this.Z & 4) == 4) {
                iD += CodedOutputStream.d(3, this.g0);
            }
            for (int i3 = 0; i3 < this.h0.size(); i3++) {
                iD += CodedOutputStream.d(4, (MessageLite) this.h0.get(i3));
            }
            int size = this.f44065Y.size() + h() + iD;
            this.j0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.i0;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if ((this.Z & 2) == 2 && !this.f0.isInitialized()) {
                this.i0 = (byte) 0;
                return false;
            }
            if ((this.Z & 4) == 4 && !this.g0.isInitialized()) {
                this.i0 = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < this.h0.size(); i2++) {
                if (!((Class) this.h0.get(i2)).isInitialized()) {
                    this.i0 = (byte) 0;
                    return false;
                }
            }
            if (g()) {
                this.i0 = (byte) 1;
                return true;
            }
            this.i0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderJ = Builder.j();
            builderJ.k(this);
            return builderJ;
        }

        public PackageFragment() {
            this.i0 = (byte) -1;
            this.j0 = -1;
            this.f44065Y = ByteString.X;
        }

        public PackageFragment(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.i0 = (byte) -1;
            this.j0 = -1;
            this.e0 = StringTable.f0;
            this.f0 = QualifiedNameTable.f0;
            this.g0 = Package.l0;
            this.h0 = Collections.EMPTY_LIST;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z2 = false;
            char c2 = 0;
            while (!z2) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            Package.Builder builderJ = null;
                            StringTable.Builder builder = null;
                            QualifiedNameTable.Builder builder2 = null;
                            if (iN == 10) {
                                if ((this.Z & 1) == 1) {
                                    StringTable stringTable = this.e0;
                                    stringTable.getClass();
                                    builder = new StringTable.Builder();
                                    builder.Z = LazyStringArrayList.f44218Y;
                                    builder.h(stringTable);
                                }
                                StringTable stringTable2 = (StringTable) codedInputStream.g(StringTable.g0, extensionRegistryLite);
                                this.e0 = stringTable2;
                                if (builder != null) {
                                    builder.h(stringTable2);
                                    this.e0 = builder.g();
                                }
                                this.Z |= 1;
                            } else if (iN == 18) {
                                if ((this.Z & 2) == 2) {
                                    QualifiedNameTable qualifiedNameTable = this.f0;
                                    qualifiedNameTable.getClass();
                                    builder2 = new QualifiedNameTable.Builder();
                                    builder2.Z = Collections.EMPTY_LIST;
                                    builder2.h(qualifiedNameTable);
                                }
                                QualifiedNameTable qualifiedNameTable2 = (QualifiedNameTable) codedInputStream.g(QualifiedNameTable.g0, extensionRegistryLite);
                                this.f0 = qualifiedNameTable2;
                                if (builder2 != null) {
                                    builder2.h(qualifiedNameTable2);
                                    this.f0 = builder2.g();
                                }
                                this.Z |= 2;
                            } else if (iN == 26) {
                                if ((this.Z & 4) == 4) {
                                    Package r6 = this.g0;
                                    r6.getClass();
                                    builderJ = Package.Builder.j();
                                    builderJ.k(r6);
                                }
                                Package r7 = (Package) codedInputStream.g(Package.m0, extensionRegistryLite);
                                this.g0 = r7;
                                if (builderJ != null) {
                                    builderJ.k(r7);
                                    this.g0 = builderJ.i();
                                }
                                this.Z |= 4;
                            } else if (iN != 34) {
                                if (!n(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iN)) {
                                }
                            } else {
                                int i2 = (c2 == true ? 1 : 0) & '\b';
                                c2 = c2;
                                if (i2 != 8) {
                                    this.h0 = new ArrayList();
                                    c2 = '\b';
                                }
                                this.h0.add(codedInputStream.g(Class.L0, extensionRegistryLite));
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
                    if (((c2 == true ? 1 : 0) & '\b') == 8) {
                        this.h0 = Collections.unmodifiableList(this.h0);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f44065Y = output.h();
                    }
                    m();
                    throw th;
                }
            }
            if (((c2 == true ? 1 : 0) & '\b') == 8) {
                this.h0 = Collections.unmodifiableList(this.h0);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.f44065Y = output.h();
            }
            m();
        }
    }

    public static final class TypeAlias extends GeneratedMessageLite.ExtendableMessage<TypeAlias> implements TypeAliasOrBuilder {
        public static final TypeAlias p0;
        public static final Parser q0 = new AnonymousClass1();

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ByteString f44078Y;
        public int Z;
        public int e0;
        public int f0;
        public List g0;
        public Type h0;
        public int i0;
        public Type j0;
        public int k0;
        public List l0;
        public List m0;
        public byte n0;
        public int o0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<TypeAlias> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new TypeAlias(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeAlias, Builder> implements TypeAliasOrBuilder {
            public int e0;
            public int f0;
            public int g0;
            public List h0;
            public Type i0;
            public int j0;
            public Type k0;
            public int l0;
            public List m0;
            public List n0;

            public static Builder j() {
                Builder builder = new Builder();
                builder.f0 = 6;
                List list = Collections.EMPTY_LIST;
                builder.h0 = list;
                Type type = Type.u0;
                builder.i0 = type;
                builder.k0 = type;
                builder.m0 = list;
                builder.n0 = list;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                TypeAlias typeAliasI = i();
                if (typeAliasI.isInitialized()) {
                    return typeAliasI;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final GeneratedMessageLite.Builder c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                k((TypeAlias) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            public final TypeAlias i() {
                TypeAlias typeAlias = new TypeAlias(this);
                int i2 = this.e0;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                typeAlias.e0 = this.f0;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                typeAlias.f0 = this.g0;
                if ((i2 & 4) == 4) {
                    this.h0 = Collections.unmodifiableList(this.h0);
                    this.e0 &= -5;
                }
                typeAlias.g0 = this.h0;
                if ((i2 & 8) == 8) {
                    i3 |= 4;
                }
                typeAlias.h0 = this.i0;
                if ((i2 & 16) == 16) {
                    i3 |= 8;
                }
                typeAlias.i0 = this.j0;
                if ((i2 & 32) == 32) {
                    i3 |= 16;
                }
                typeAlias.j0 = this.k0;
                if ((i2 & 64) == 64) {
                    i3 |= 32;
                }
                typeAlias.k0 = this.l0;
                if ((this.e0 & 128) == 128) {
                    this.m0 = Collections.unmodifiableList(this.m0);
                    this.e0 &= -129;
                }
                typeAlias.l0 = this.m0;
                if ((this.e0 & 256) == 256) {
                    this.n0 = Collections.unmodifiableList(this.n0);
                    this.e0 &= -257;
                }
                typeAlias.m0 = this.n0;
                typeAlias.Z = i3;
                return typeAlias;
            }

            public final void k(TypeAlias typeAlias) {
                Type type;
                Type type2;
                if (typeAlias == TypeAlias.p0) {
                    return;
                }
                int i2 = typeAlias.Z;
                if ((i2 & 1) == 1) {
                    int i3 = typeAlias.e0;
                    this.e0 = 1 | this.e0;
                    this.f0 = i3;
                }
                if ((i2 & 2) == 2) {
                    int i4 = typeAlias.f0;
                    this.e0 = 2 | this.e0;
                    this.g0 = i4;
                }
                if (!typeAlias.g0.isEmpty()) {
                    if (this.h0.isEmpty()) {
                        this.h0 = typeAlias.g0;
                        this.e0 &= -5;
                    } else {
                        if ((this.e0 & 4) != 4) {
                            this.h0 = new ArrayList(this.h0);
                            this.e0 |= 4;
                        }
                        this.h0.addAll(typeAlias.g0);
                    }
                }
                if ((typeAlias.Z & 4) == 4) {
                    Type type3 = typeAlias.h0;
                    if ((this.e0 & 8) != 8 || (type2 = this.i0) == Type.u0) {
                        this.i0 = type3;
                    } else {
                        Type.Builder builderR = Type.r(type2);
                        builderR.k(type3);
                        this.i0 = builderR.i();
                    }
                    this.e0 |= 8;
                }
                int i5 = typeAlias.Z;
                if ((i5 & 8) == 8) {
                    int i6 = typeAlias.i0;
                    this.e0 |= 16;
                    this.j0 = i6;
                }
                if ((i5 & 16) == 16) {
                    Type type4 = typeAlias.j0;
                    if ((this.e0 & 32) != 32 || (type = this.k0) == Type.u0) {
                        this.k0 = type4;
                    } else {
                        Type.Builder builderR2 = Type.r(type);
                        builderR2.k(type4);
                        this.k0 = builderR2.i();
                    }
                    this.e0 |= 32;
                }
                if ((typeAlias.Z & 32) == 32) {
                    int i7 = typeAlias.k0;
                    this.e0 |= 64;
                    this.l0 = i7;
                }
                if (!typeAlias.l0.isEmpty()) {
                    if (this.m0.isEmpty()) {
                        this.m0 = typeAlias.l0;
                        this.e0 &= -129;
                    } else {
                        if ((this.e0 & 128) != 128) {
                            this.m0 = new ArrayList(this.m0);
                            this.e0 |= 128;
                        }
                        this.m0.addAll(typeAlias.l0);
                    }
                }
                if (!typeAlias.m0.isEmpty()) {
                    if (this.n0.isEmpty()) {
                        this.n0 = typeAlias.m0;
                        this.e0 &= -257;
                    } else {
                        if ((this.e0 & 256) != 256) {
                            this.n0 = new ArrayList(this.n0);
                            this.e0 |= 256;
                        }
                        this.n0.addAll(typeAlias.m0);
                    }
                }
                h(typeAlias);
                this.X = this.X.c(typeAlias.f44078Y);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void l(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeAlias typeAlias = null;
                try {
                    try {
                        ((AnonymousClass1) TypeAlias.q0).getClass();
                        k(new TypeAlias(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e2) {
                        TypeAlias typeAlias2 = (TypeAlias) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            typeAlias = typeAlias2;
                            if (typeAlias != null) {
                                k(typeAlias);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (typeAlias != null) {
                        k(typeAlias);
                    }
                    throw th;
                }
            }
        }

        static {
            TypeAlias typeAlias = new TypeAlias();
            p0 = typeAlias;
            typeAlias.e0 = 6;
            typeAlias.f0 = 0;
            List list = Collections.EMPTY_LIST;
            typeAlias.g0 = list;
            Type type = Type.u0;
            typeAlias.h0 = type;
            typeAlias.i0 = 0;
            typeAlias.j0 = type;
            typeAlias.k0 = 0;
            typeAlias.l0 = list;
            typeAlias.m0 = list;
        }

        public TypeAlias(Builder builder) {
            super(builder);
            this.n0 = (byte) -1;
            this.o0 = -1;
            this.f44078Y = builder.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.Z & 1) == 1) {
                codedOutputStream.m(1, this.e0);
            }
            if ((this.Z & 2) == 2) {
                codedOutputStream.m(2, this.f0);
            }
            for (int i2 = 0; i2 < this.g0.size(); i2++) {
                codedOutputStream.o(3, (MessageLite) this.g0.get(i2));
            }
            if ((this.Z & 4) == 4) {
                codedOutputStream.o(4, this.h0);
            }
            if ((this.Z & 8) == 8) {
                codedOutputStream.m(5, this.i0);
            }
            if ((this.Z & 16) == 16) {
                codedOutputStream.o(6, this.j0);
            }
            if ((this.Z & 32) == 32) {
                codedOutputStream.m(7, this.k0);
            }
            for (int i3 = 0; i3 < this.l0.size(); i3++) {
                codedOutputStream.o(8, (MessageLite) this.l0.get(i3));
            }
            for (int i4 = 0; i4 < this.m0.size(); i4++) {
                codedOutputStream.m(31, ((Integer) this.m0.get(i4)).intValue());
            }
            extensionWriter.a(200, codedOutputStream);
            codedOutputStream.r(this.f44078Y);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return p0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.o0;
            if (i2 != -1) {
                return i2;
            }
            int iB = (this.Z & 1) == 1 ? CodedOutputStream.b(1, this.e0) : 0;
            if ((this.Z & 2) == 2) {
                iB += CodedOutputStream.b(2, this.f0);
            }
            for (int i3 = 0; i3 < this.g0.size(); i3++) {
                iB += CodedOutputStream.d(3, (MessageLite) this.g0.get(i3));
            }
            if ((this.Z & 4) == 4) {
                iB += CodedOutputStream.d(4, this.h0);
            }
            if ((this.Z & 8) == 8) {
                iB += CodedOutputStream.b(5, this.i0);
            }
            if ((this.Z & 16) == 16) {
                iB += CodedOutputStream.d(6, this.j0);
            }
            if ((this.Z & 32) == 32) {
                iB += CodedOutputStream.b(7, this.k0);
            }
            for (int i4 = 0; i4 < this.l0.size(); i4++) {
                iB += CodedOutputStream.d(8, (MessageLite) this.l0.get(i4));
            }
            int iC = 0;
            for (int i5 = 0; i5 < this.m0.size(); i5++) {
                iC += CodedOutputStream.c(((Integer) this.m0.get(i5)).intValue());
            }
            int size = this.f44078Y.size() + h() + android.support.v4.media.a.c(2, iB + iC, this.m0);
            this.o0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.n0;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if ((this.Z & 2) != 2) {
                this.n0 = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < this.g0.size(); i2++) {
                if (!((TypeParameter) this.g0.get(i2)).isInitialized()) {
                    this.n0 = (byte) 0;
                    return false;
                }
            }
            if ((this.Z & 4) == 4 && !this.h0.isInitialized()) {
                this.n0 = (byte) 0;
                return false;
            }
            if ((this.Z & 16) == 16 && !this.j0.isInitialized()) {
                this.n0 = (byte) 0;
                return false;
            }
            for (int i3 = 0; i3 < this.l0.size(); i3++) {
                if (!((Annotation) this.l0.get(i3)).isInitialized()) {
                    this.n0 = (byte) 0;
                    return false;
                }
            }
            if (g()) {
                this.n0 = (byte) 1;
                return true;
            }
            this.n0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderJ = Builder.j();
            builderJ.k(this);
            return builderJ;
        }

        public TypeAlias() {
            this.n0 = (byte) -1;
            this.o0 = -1;
            this.f44078Y = ByteString.X;
        }

        public TypeAlias(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.n0 = (byte) -1;
            this.o0 = -1;
            this.e0 = 6;
            boolean z2 = false;
            this.f0 = 0;
            List list = Collections.EMPTY_LIST;
            this.g0 = list;
            Type type = Type.u0;
            this.h0 = type;
            this.i0 = 0;
            this.j0 = type;
            this.k0 = 0;
            this.l0 = list;
            this.m0 = list;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            int i2 = 0;
            while (!z2) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        Type.Builder builderR = null;
                        switch (iN) {
                            case 0:
                                break;
                            case 8:
                                this.Z |= 1;
                                this.e0 = codedInputStream.k();
                                continue;
                            case 16:
                                this.Z |= 2;
                                this.f0 = codedInputStream.k();
                                continue;
                            case 26:
                                if ((i2 & 4) != 4) {
                                    this.g0 = new ArrayList();
                                    i2 |= 4;
                                }
                                this.g0.add(codedInputStream.g(TypeParameter.o0, extensionRegistryLite));
                                continue;
                            case 34:
                                if ((this.Z & 4) == 4) {
                                    Type type2 = this.h0;
                                    type2.getClass();
                                    builderR = Type.r(type2);
                                }
                                Type type3 = (Type) codedInputStream.g(Type.v0, extensionRegistryLite);
                                this.h0 = type3;
                                if (builderR != null) {
                                    builderR.k(type3);
                                    this.h0 = builderR.i();
                                }
                                this.Z |= 4;
                                continue;
                            case 40:
                                this.Z |= 8;
                                this.i0 = codedInputStream.k();
                                continue;
                            case 50:
                                if ((this.Z & 16) == 16) {
                                    Type type4 = this.j0;
                                    type4.getClass();
                                    builderR = Type.r(type4);
                                }
                                Type type5 = (Type) codedInputStream.g(Type.v0, extensionRegistryLite);
                                this.j0 = type5;
                                if (builderR != null) {
                                    builderR.k(type5);
                                    this.j0 = builderR.i();
                                }
                                this.Z |= 16;
                                continue;
                            case 56:
                                this.Z |= 32;
                                this.k0 = codedInputStream.k();
                                continue;
                            case 66:
                                if ((i2 & 128) != 128) {
                                    this.l0 = new ArrayList();
                                    i2 |= 128;
                                }
                                this.l0.add(codedInputStream.g(Annotation.i0, extensionRegistryLite));
                                continue;
                            case 248:
                                if ((i2 & 256) != 256) {
                                    this.m0 = new ArrayList();
                                    i2 |= 256;
                                }
                                this.m0.add(Integer.valueOf(codedInputStream.k()));
                                continue;
                            case 250:
                                int iD = codedInputStream.d(codedInputStream.k());
                                if ((i2 & 256) != 256 && codedInputStream.b() > 0) {
                                    this.m0 = new ArrayList();
                                    i2 |= 256;
                                }
                                while (codedInputStream.b() > 0) {
                                    this.m0.add(Integer.valueOf(codedInputStream.k()));
                                }
                                codedInputStream.c(iD);
                                continue;
                            default:
                                if (!n(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iN)) {
                                    break;
                                }
                                break;
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
                    if ((i2 & 4) == 4) {
                        this.g0 = Collections.unmodifiableList(this.g0);
                    }
                    if ((i2 & 128) == 128) {
                        this.l0 = Collections.unmodifiableList(this.l0);
                    }
                    if ((i2 & 256) == 256) {
                        this.m0 = Collections.unmodifiableList(this.m0);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f44078Y = output.h();
                    }
                    m();
                    throw th;
                }
            }
            if ((i2 & 4) == 4) {
                this.g0 = Collections.unmodifiableList(this.g0);
            }
            if ((i2 & 128) == 128) {
                this.l0 = Collections.unmodifiableList(this.l0);
            }
            if ((i2 & 256) == 256) {
                this.m0 = Collections.unmodifiableList(this.m0);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.f44078Y = output.h();
            }
            m();
        }
    }

    public static final class ValueParameter extends GeneratedMessageLite.ExtendableMessage<ValueParameter> implements ValueParameterOrBuilder {
        public static final ValueParameter m0;
        public static final Parser n0 = new AnonymousClass1();

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ByteString f44083Y;
        public int Z;
        public int e0;
        public int f0;
        public Type g0;
        public int h0;
        public Type i0;
        public int j0;
        public byte k0;
        public int l0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<ValueParameter> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ValueParameter(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ValueParameter, Builder> implements ValueParameterOrBuilder {
            public int e0;
            public int f0;
            public int g0;
            public Type h0;
            public int i0;
            public Type j0;
            public int k0;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                k(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                ValueParameter valueParameterI = i();
                if (valueParameterI.isInitialized()) {
                    return valueParameterI;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder c() {
                Builder builder = new Builder();
                Type type = Type.u0;
                builder.h0 = type;
                builder.j0 = type;
                builder.j(i());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object c() {
                Builder builder = new Builder();
                Type type = Type.u0;
                builder.h0 = type;
                builder.j0 = type;
                builder.j(i());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                k(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final GeneratedMessageLite.Builder c() {
                Builder builder = new Builder();
                Type type = Type.u0;
                builder.h0 = type;
                builder.j0 = type;
                builder.j(i());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                j((ValueParameter) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builder = new Builder();
                Type type = Type.u0;
                builder.h0 = type;
                builder.j0 = type;
                builder.j(i());
                return builder;
            }

            public final ValueParameter i() {
                ValueParameter valueParameter = new ValueParameter(this);
                int i2 = this.e0;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                valueParameter.e0 = this.f0;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                valueParameter.f0 = this.g0;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                valueParameter.g0 = this.h0;
                if ((i2 & 8) == 8) {
                    i3 |= 8;
                }
                valueParameter.h0 = this.i0;
                if ((i2 & 16) == 16) {
                    i3 |= 16;
                }
                valueParameter.i0 = this.j0;
                if ((i2 & 32) == 32) {
                    i3 |= 32;
                }
                valueParameter.j0 = this.k0;
                valueParameter.Z = i3;
                return valueParameter;
            }

            public final void j(ValueParameter valueParameter) {
                Type type;
                Type type2;
                if (valueParameter == ValueParameter.m0) {
                    return;
                }
                int i2 = valueParameter.Z;
                if ((i2 & 1) == 1) {
                    int i3 = valueParameter.e0;
                    this.e0 = 1 | this.e0;
                    this.f0 = i3;
                }
                if ((i2 & 2) == 2) {
                    int i4 = valueParameter.f0;
                    this.e0 = 2 | this.e0;
                    this.g0 = i4;
                }
                if ((i2 & 4) == 4) {
                    Type type3 = valueParameter.g0;
                    if ((this.e0 & 4) != 4 || (type2 = this.h0) == Type.u0) {
                        this.h0 = type3;
                    } else {
                        Type.Builder builderR = Type.r(type2);
                        builderR.k(type3);
                        this.h0 = builderR.i();
                    }
                    this.e0 |= 4;
                }
                int i5 = valueParameter.Z;
                if ((i5 & 8) == 8) {
                    int i6 = valueParameter.h0;
                    this.e0 = 8 | this.e0;
                    this.i0 = i6;
                }
                if ((i5 & 16) == 16) {
                    Type type4 = valueParameter.i0;
                    if ((this.e0 & 16) != 16 || (type = this.j0) == Type.u0) {
                        this.j0 = type4;
                    } else {
                        Type.Builder builderR2 = Type.r(type);
                        builderR2.k(type4);
                        this.j0 = builderR2.i();
                    }
                    this.e0 |= 16;
                }
                if ((valueParameter.Z & 32) == 32) {
                    int i7 = valueParameter.j0;
                    this.e0 = 32 | this.e0;
                    this.k0 = i7;
                }
                h(valueParameter);
                this.X = this.X.c(valueParameter.f44083Y);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void k(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                ValueParameter valueParameter = null;
                try {
                    try {
                        ((AnonymousClass1) ValueParameter.n0).getClass();
                        j(new ValueParameter(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e2) {
                        ValueParameter valueParameter2 = (ValueParameter) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            valueParameter = valueParameter2;
                            if (valueParameter != null) {
                                j(valueParameter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (valueParameter != null) {
                        j(valueParameter);
                    }
                    throw th;
                }
            }
        }

        static {
            ValueParameter valueParameter = new ValueParameter();
            m0 = valueParameter;
            valueParameter.e0 = 0;
            valueParameter.f0 = 0;
            Type type = Type.u0;
            valueParameter.g0 = type;
            valueParameter.h0 = 0;
            valueParameter.i0 = type;
            valueParameter.j0 = 0;
        }

        public ValueParameter(Builder builder) {
            super(builder);
            this.k0 = (byte) -1;
            this.l0 = -1;
            this.f44083Y = builder.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.Z & 1) == 1) {
                codedOutputStream.m(1, this.e0);
            }
            if ((this.Z & 2) == 2) {
                codedOutputStream.m(2, this.f0);
            }
            if ((this.Z & 4) == 4) {
                codedOutputStream.o(3, this.g0);
            }
            if ((this.Z & 16) == 16) {
                codedOutputStream.o(4, this.i0);
            }
            if ((this.Z & 8) == 8) {
                codedOutputStream.m(5, this.h0);
            }
            if ((this.Z & 32) == 32) {
                codedOutputStream.m(6, this.j0);
            }
            extensionWriter.a(200, codedOutputStream);
            codedOutputStream.r(this.f44083Y);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return m0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.l0;
            if (i2 != -1) {
                return i2;
            }
            int iB = (this.Z & 1) == 1 ? CodedOutputStream.b(1, this.e0) : 0;
            if ((this.Z & 2) == 2) {
                iB += CodedOutputStream.b(2, this.f0);
            }
            if ((this.Z & 4) == 4) {
                iB += CodedOutputStream.d(3, this.g0);
            }
            if ((this.Z & 16) == 16) {
                iB += CodedOutputStream.d(4, this.i0);
            }
            if ((this.Z & 8) == 8) {
                iB += CodedOutputStream.b(5, this.h0);
            }
            if ((this.Z & 32) == 32) {
                iB += CodedOutputStream.b(6, this.j0);
            }
            int size = this.f44083Y.size() + h() + iB;
            this.l0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.k0;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            int i2 = this.Z;
            if ((i2 & 2) != 2) {
                this.k0 = (byte) 0;
                return false;
            }
            if ((i2 & 4) == 4 && !this.g0.isInitialized()) {
                this.k0 = (byte) 0;
                return false;
            }
            if ((this.Z & 16) == 16 && !this.i0.isInitialized()) {
                this.k0 = (byte) 0;
                return false;
            }
            if (g()) {
                this.k0 = (byte) 1;
                return true;
            }
            this.k0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            Builder builder = new Builder();
            Type type = Type.u0;
            builder.h0 = type;
            builder.j0 = type;
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builder = new Builder();
            Type type = Type.u0;
            builder.h0 = type;
            builder.j0 = type;
            builder.j(this);
            return builder;
        }

        public ValueParameter() {
            this.k0 = (byte) -1;
            this.l0 = -1;
            this.f44083Y = ByteString.X;
        }

        public ValueParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.k0 = (byte) -1;
            this.l0 = -1;
            boolean z2 = false;
            this.e0 = 0;
            this.f0 = 0;
            Type type = Type.u0;
            this.g0 = type;
            this.h0 = 0;
            this.i0 = type;
            this.j0 = 0;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            while (!z2) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.Z |= 1;
                                this.e0 = codedInputStream.k();
                            } else if (iN != 16) {
                                Type.Builder builderR = null;
                                if (iN == 26) {
                                    if ((this.Z & 4) == 4) {
                                        Type type2 = this.g0;
                                        type2.getClass();
                                        builderR = Type.r(type2);
                                    }
                                    Type type3 = (Type) codedInputStream.g(Type.v0, extensionRegistryLite);
                                    this.g0 = type3;
                                    if (builderR != null) {
                                        builderR.k(type3);
                                        this.g0 = builderR.i();
                                    }
                                    this.Z |= 4;
                                } else if (iN == 34) {
                                    if ((this.Z & 16) == 16) {
                                        Type type4 = this.i0;
                                        type4.getClass();
                                        builderR = Type.r(type4);
                                    }
                                    Type type5 = (Type) codedInputStream.g(Type.v0, extensionRegistryLite);
                                    this.i0 = type5;
                                    if (builderR != null) {
                                        builderR.k(type5);
                                        this.i0 = builderR.i();
                                    }
                                    this.Z |= 16;
                                } else if (iN == 40) {
                                    this.Z |= 8;
                                    this.h0 = codedInputStream.k();
                                } else if (iN != 48) {
                                    if (!n(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iN)) {
                                    }
                                } else {
                                    this.Z |= 32;
                                    this.j0 = codedInputStream.k();
                                }
                            } else {
                                this.Z |= 2;
                                this.f0 = codedInputStream.k();
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
                        this.f44083Y = output.h();
                    }
                    m();
                    throw th;
                }
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.f44083Y = output.h();
            }
            m();
        }
    }

    public static final class Function extends GeneratedMessageLite.ExtendableMessage<Function> implements FunctionOrBuilder {
        public static final Function v0;
        public static final Parser w0 = new AnonymousClass1();

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ByteString f44061Y;
        public int Z;
        public int e0;
        public int f0;
        public int g0;
        public Type h0;
        public int i0;
        public List j0;
        public Type k0;
        public int l0;
        public List m0;
        public List n0;
        public int o0;
        public List p0;
        public TypeTable q0;
        public List r0;
        public Contract s0;
        public byte t0;
        public int u0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<Function> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Function(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Function, Builder> implements FunctionOrBuilder {
            public int e0;
            public int f0;
            public int g0;
            public int h0;
            public Type i0;
            public int j0;
            public List k0;
            public Type l0;
            public int m0;
            public List n0;
            public List o0;
            public List p0;
            public TypeTable q0;
            public List r0;
            public Contract s0;

            public static Builder j() {
                Builder builder = new Builder();
                builder.f0 = 6;
                builder.g0 = 6;
                Type type = Type.u0;
                builder.i0 = type;
                List list = Collections.EMPTY_LIST;
                builder.k0 = list;
                builder.l0 = type;
                builder.n0 = list;
                builder.o0 = list;
                builder.p0 = list;
                builder.q0 = TypeTable.h0;
                builder.r0 = list;
                builder.s0 = Contract.f0;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Function functionI = i();
                if (functionI.isInitialized()) {
                    return functionI;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final GeneratedMessageLite.Builder c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                k((Function) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            public final Function i() {
                Function function = new Function(this);
                int i2 = this.e0;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                function.e0 = this.f0;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                function.f0 = this.g0;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                function.g0 = this.h0;
                if ((i2 & 8) == 8) {
                    i3 |= 8;
                }
                function.h0 = this.i0;
                if ((i2 & 16) == 16) {
                    i3 |= 16;
                }
                function.i0 = this.j0;
                if ((i2 & 32) == 32) {
                    this.k0 = Collections.unmodifiableList(this.k0);
                    this.e0 &= -33;
                }
                function.j0 = this.k0;
                if ((i2 & 64) == 64) {
                    i3 |= 32;
                }
                function.k0 = this.l0;
                if ((i2 & 128) == 128) {
                    i3 |= 64;
                }
                function.l0 = this.m0;
                if ((this.e0 & 256) == 256) {
                    this.n0 = Collections.unmodifiableList(this.n0);
                    this.e0 &= -257;
                }
                function.m0 = this.n0;
                if ((this.e0 & 512) == 512) {
                    this.o0 = Collections.unmodifiableList(this.o0);
                    this.e0 &= -513;
                }
                function.n0 = this.o0;
                if ((this.e0 & 1024) == 1024) {
                    this.p0 = Collections.unmodifiableList(this.p0);
                    this.e0 &= -1025;
                }
                function.p0 = this.p0;
                if ((i2 & a.f25965n) == 2048) {
                    i3 |= 128;
                }
                function.q0 = this.q0;
                if ((this.e0 & 4096) == 4096) {
                    this.r0 = Collections.unmodifiableList(this.r0);
                    this.e0 &= -4097;
                }
                function.r0 = this.r0;
                if ((i2 & Segment.SIZE) == 8192) {
                    i3 |= 256;
                }
                function.s0 = this.s0;
                function.Z = i3;
                return function;
            }

            public final void k(Function function) {
                Contract contract;
                TypeTable typeTable;
                Type type;
                Type type2;
                if (function == Function.v0) {
                    return;
                }
                int i2 = function.Z;
                if ((i2 & 1) == 1) {
                    int i3 = function.e0;
                    this.e0 = 1 | this.e0;
                    this.f0 = i3;
                }
                if ((i2 & 2) == 2) {
                    int i4 = function.f0;
                    this.e0 = 2 | this.e0;
                    this.g0 = i4;
                }
                if ((i2 & 4) == 4) {
                    int i5 = function.g0;
                    this.e0 = 4 | this.e0;
                    this.h0 = i5;
                }
                if ((i2 & 8) == 8) {
                    Type type3 = function.h0;
                    if ((this.e0 & 8) != 8 || (type2 = this.i0) == Type.u0) {
                        this.i0 = type3;
                    } else {
                        Type.Builder builderR = Type.r(type2);
                        builderR.k(type3);
                        this.i0 = builderR.i();
                    }
                    this.e0 |= 8;
                }
                if ((function.Z & 16) == 16) {
                    int i6 = function.i0;
                    this.e0 = 16 | this.e0;
                    this.j0 = i6;
                }
                if (!function.j0.isEmpty()) {
                    if (this.k0.isEmpty()) {
                        this.k0 = function.j0;
                        this.e0 &= -33;
                    } else {
                        if ((this.e0 & 32) != 32) {
                            this.k0 = new ArrayList(this.k0);
                            this.e0 |= 32;
                        }
                        this.k0.addAll(function.j0);
                    }
                }
                if ((function.Z & 32) == 32) {
                    Type type4 = function.k0;
                    if ((this.e0 & 64) != 64 || (type = this.l0) == Type.u0) {
                        this.l0 = type4;
                    } else {
                        Type.Builder builderR2 = Type.r(type);
                        builderR2.k(type4);
                        this.l0 = builderR2.i();
                    }
                    this.e0 |= 64;
                }
                if ((function.Z & 64) == 64) {
                    int i7 = function.l0;
                    this.e0 |= 128;
                    this.m0 = i7;
                }
                if (!function.m0.isEmpty()) {
                    if (this.n0.isEmpty()) {
                        this.n0 = function.m0;
                        this.e0 &= -257;
                    } else {
                        if ((this.e0 & 256) != 256) {
                            this.n0 = new ArrayList(this.n0);
                            this.e0 |= 256;
                        }
                        this.n0.addAll(function.m0);
                    }
                }
                if (!function.n0.isEmpty()) {
                    if (this.o0.isEmpty()) {
                        this.o0 = function.n0;
                        this.e0 &= -513;
                    } else {
                        if ((this.e0 & 512) != 512) {
                            this.o0 = new ArrayList(this.o0);
                            this.e0 |= 512;
                        }
                        this.o0.addAll(function.n0);
                    }
                }
                if (!function.p0.isEmpty()) {
                    if (this.p0.isEmpty()) {
                        this.p0 = function.p0;
                        this.e0 &= -1025;
                    } else {
                        if ((this.e0 & 1024) != 1024) {
                            this.p0 = new ArrayList(this.p0);
                            this.e0 |= 1024;
                        }
                        this.p0.addAll(function.p0);
                    }
                }
                if ((function.Z & 128) == 128) {
                    TypeTable typeTable2 = function.q0;
                    if ((this.e0 & a.f25965n) != 2048 || (typeTable = this.q0) == TypeTable.h0) {
                        this.q0 = typeTable2;
                    } else {
                        TypeTable.Builder builderE = TypeTable.e(typeTable);
                        builderE.j(typeTable2);
                        this.q0 = builderE.g();
                    }
                    this.e0 |= a.f25965n;
                }
                if (!function.r0.isEmpty()) {
                    if (this.r0.isEmpty()) {
                        this.r0 = function.r0;
                        this.e0 &= -4097;
                    } else {
                        if ((this.e0 & 4096) != 4096) {
                            this.r0 = new ArrayList(this.r0);
                            this.e0 |= 4096;
                        }
                        this.r0.addAll(function.r0);
                    }
                }
                if ((function.Z & 256) == 256) {
                    Contract contract2 = function.s0;
                    if ((this.e0 & Segment.SIZE) != 8192 || (contract = this.s0) == Contract.f0) {
                        this.s0 = contract2;
                    } else {
                        Contract.Builder builder = new Contract.Builder();
                        builder.Z = Collections.EMPTY_LIST;
                        builder.h(contract);
                        builder.h(contract2);
                        this.s0 = builder.g();
                    }
                    this.e0 |= Segment.SIZE;
                }
                h(function);
                this.X = this.X.c(function.f44061Y);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void l(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Function function = null;
                try {
                    try {
                        ((AnonymousClass1) Function.w0).getClass();
                        k(new Function(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e2) {
                        Function function2 = (Function) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            function = function2;
                            if (function != null) {
                                k(function);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (function != null) {
                        k(function);
                    }
                    throw th;
                }
            }
        }

        static {
            Function function = new Function();
            v0 = function;
            function.p();
        }

        public Function(Builder builder) {
            super(builder);
            this.o0 = -1;
            this.t0 = (byte) -1;
            this.u0 = -1;
            this.f44061Y = builder.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.Z & 2) == 2) {
                codedOutputStream.m(1, this.f0);
            }
            if ((this.Z & 4) == 4) {
                codedOutputStream.m(2, this.g0);
            }
            if ((this.Z & 8) == 8) {
                codedOutputStream.o(3, this.h0);
            }
            for (int i2 = 0; i2 < this.j0.size(); i2++) {
                codedOutputStream.o(4, (MessageLite) this.j0.get(i2));
            }
            if ((this.Z & 32) == 32) {
                codedOutputStream.o(5, this.k0);
            }
            for (int i3 = 0; i3 < this.p0.size(); i3++) {
                codedOutputStream.o(6, (MessageLite) this.p0.get(i3));
            }
            if ((this.Z & 16) == 16) {
                codedOutputStream.m(7, this.i0);
            }
            if ((this.Z & 64) == 64) {
                codedOutputStream.m(8, this.l0);
            }
            if ((this.Z & 1) == 1) {
                codedOutputStream.m(9, this.e0);
            }
            for (int i4 = 0; i4 < this.m0.size(); i4++) {
                codedOutputStream.o(10, (MessageLite) this.m0.get(i4));
            }
            if (this.n0.size() > 0) {
                codedOutputStream.v(90);
                codedOutputStream.v(this.o0);
            }
            for (int i5 = 0; i5 < this.n0.size(); i5++) {
                codedOutputStream.n(((Integer) this.n0.get(i5)).intValue());
            }
            if ((this.Z & 128) == 128) {
                codedOutputStream.o(30, this.q0);
            }
            for (int i6 = 0; i6 < this.r0.size(); i6++) {
                codedOutputStream.m(31, ((Integer) this.r0.get(i6)).intValue());
            }
            if ((this.Z & 256) == 256) {
                codedOutputStream.o(32, this.s0);
            }
            extensionWriter.a(19000, codedOutputStream);
            codedOutputStream.r(this.f44061Y);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return v0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.u0;
            if (i2 != -1) {
                return i2;
            }
            int iB = (this.Z & 2) == 2 ? CodedOutputStream.b(1, this.f0) : 0;
            if ((this.Z & 4) == 4) {
                iB += CodedOutputStream.b(2, this.g0);
            }
            if ((this.Z & 8) == 8) {
                iB += CodedOutputStream.d(3, this.h0);
            }
            for (int i3 = 0; i3 < this.j0.size(); i3++) {
                iB += CodedOutputStream.d(4, (MessageLite) this.j0.get(i3));
            }
            if ((this.Z & 32) == 32) {
                iB += CodedOutputStream.d(5, this.k0);
            }
            for (int i4 = 0; i4 < this.p0.size(); i4++) {
                iB += CodedOutputStream.d(6, (MessageLite) this.p0.get(i4));
            }
            if ((this.Z & 16) == 16) {
                iB += CodedOutputStream.b(7, this.i0);
            }
            if ((this.Z & 64) == 64) {
                iB += CodedOutputStream.b(8, this.l0);
            }
            if ((this.Z & 1) == 1) {
                iB += CodedOutputStream.b(9, this.e0);
            }
            for (int i5 = 0; i5 < this.m0.size(); i5++) {
                iB += CodedOutputStream.d(10, (MessageLite) this.m0.get(i5));
            }
            int iC = 0;
            for (int i6 = 0; i6 < this.n0.size(); i6++) {
                iC += CodedOutputStream.c(((Integer) this.n0.get(i6)).intValue());
            }
            int iD = iB + iC;
            if (!this.n0.isEmpty()) {
                iD = iD + 1 + CodedOutputStream.c(iC);
            }
            this.o0 = iC;
            if ((this.Z & 128) == 128) {
                iD += CodedOutputStream.d(30, this.q0);
            }
            int iC2 = 0;
            for (int i7 = 0; i7 < this.r0.size(); i7++) {
                iC2 += CodedOutputStream.c(((Integer) this.r0.get(i7)).intValue());
            }
            int iC3 = android.support.v4.media.a.c(2, iD + iC2, this.r0);
            if ((this.Z & 256) == 256) {
                iC3 += CodedOutputStream.d(32, this.s0);
            }
            int size = this.f44061Y.size() + h() + iC3;
            this.u0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.t0;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            int i2 = this.Z;
            if ((i2 & 4) != 4) {
                this.t0 = (byte) 0;
                return false;
            }
            if ((i2 & 8) == 8 && !this.h0.isInitialized()) {
                this.t0 = (byte) 0;
                return false;
            }
            for (int i3 = 0; i3 < this.j0.size(); i3++) {
                if (!((TypeParameter) this.j0.get(i3)).isInitialized()) {
                    this.t0 = (byte) 0;
                    return false;
                }
            }
            if ((this.Z & 32) == 32 && !this.k0.isInitialized()) {
                this.t0 = (byte) 0;
                return false;
            }
            for (int i4 = 0; i4 < this.m0.size(); i4++) {
                if (!((Type) this.m0.get(i4)).isInitialized()) {
                    this.t0 = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < this.p0.size(); i5++) {
                if (!((ValueParameter) this.p0.get(i5)).isInitialized()) {
                    this.t0 = (byte) 0;
                    return false;
                }
            }
            if ((this.Z & 128) == 128 && !this.q0.isInitialized()) {
                this.t0 = (byte) 0;
                return false;
            }
            if ((this.Z & 256) == 256 && !this.s0.isInitialized()) {
                this.t0 = (byte) 0;
                return false;
            }
            if (g()) {
                this.t0 = (byte) 1;
                return true;
            }
            this.t0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.j();
        }

        public final void p() {
            this.e0 = 6;
            this.f0 = 6;
            this.g0 = 0;
            Type type = Type.u0;
            this.h0 = type;
            this.i0 = 0;
            List list = Collections.EMPTY_LIST;
            this.j0 = list;
            this.k0 = type;
            this.l0 = 0;
            this.m0 = list;
            this.n0 = list;
            this.p0 = list;
            this.q0 = TypeTable.h0;
            this.r0 = list;
            this.s0 = Contract.f0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderJ = Builder.j();
            builderJ.k(this);
            return builderJ;
        }

        public Function() {
            this.o0 = -1;
            this.t0 = (byte) -1;
            this.u0 = -1;
            this.f44061Y = ByteString.X;
        }

        public Function(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.o0 = -1;
            this.t0 = (byte) -1;
            this.u0 = -1;
            p();
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        Type.Builder builderR = null;
                        Contract.Builder builder = null;
                        TypeTable.Builder builderE = null;
                        Type.Builder builderR2 = null;
                        switch (iN) {
                            case 0:
                                break;
                            case 8:
                                this.Z |= 2;
                                this.f0 = codedInputStream.k();
                                continue;
                            case 16:
                                this.Z |= 4;
                                this.g0 = codedInputStream.k();
                                continue;
                            case 26:
                                if ((this.Z & 8) == 8) {
                                    Type type = this.h0;
                                    type.getClass();
                                    builderR = Type.r(type);
                                }
                                Type type2 = (Type) codedInputStream.g(Type.v0, extensionRegistryLite);
                                this.h0 = type2;
                                if (builderR != null) {
                                    builderR.k(type2);
                                    this.h0 = builderR.i();
                                }
                                this.Z |= 8;
                                continue;
                            case 34:
                                int i3 = (i2 == true ? 1 : 0) & 32;
                                i2 = i2;
                                if (i3 != 32) {
                                    this.j0 = new ArrayList();
                                    i2 = (i2 == true ? 1 : 0) | 32;
                                }
                                this.j0.add(codedInputStream.g(TypeParameter.o0, extensionRegistryLite));
                                continue;
                            case 42:
                                if ((this.Z & 32) == 32) {
                                    Type type3 = this.k0;
                                    type3.getClass();
                                    builderR2 = Type.r(type3);
                                }
                                Type type4 = (Type) codedInputStream.g(Type.v0, extensionRegistryLite);
                                this.k0 = type4;
                                if (builderR2 != null) {
                                    builderR2.k(type4);
                                    this.k0 = builderR2.i();
                                }
                                this.Z |= 32;
                                continue;
                            case 50:
                                int i4 = (i2 == true ? 1 : 0) & 1024;
                                i2 = i2;
                                if (i4 != 1024) {
                                    this.p0 = new ArrayList();
                                    i2 = (i2 == true ? 1 : 0) | 1024;
                                }
                                this.p0.add(codedInputStream.g(ValueParameter.n0, extensionRegistryLite));
                                continue;
                            case 56:
                                this.Z |= 16;
                                this.i0 = codedInputStream.k();
                                continue;
                            case 64:
                                this.Z |= 64;
                                this.l0 = codedInputStream.k();
                                continue;
                            case 72:
                                this.Z |= 1;
                                this.e0 = codedInputStream.k();
                                continue;
                            case 82:
                                int i5 = (i2 == true ? 1 : 0) & 256;
                                i2 = i2;
                                if (i5 != 256) {
                                    this.m0 = new ArrayList();
                                    i2 = (i2 == true ? 1 : 0) | 256;
                                }
                                this.m0.add(codedInputStream.g(Type.v0, extensionRegistryLite));
                                continue;
                            case 88:
                                int i6 = (i2 == true ? 1 : 0) & 512;
                                i2 = i2;
                                if (i6 != 512) {
                                    this.n0 = new ArrayList();
                                    i2 = (i2 == true ? 1 : 0) | 512;
                                }
                                this.n0.add(Integer.valueOf(codedInputStream.k()));
                                continue;
                            case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
                                int iD = codedInputStream.d(codedInputStream.k());
                                int i7 = (i2 == true ? 1 : 0) & 512;
                                i2 = i2;
                                if (i7 != 512 && codedInputStream.b() > 0) {
                                    i2 = i2;
                                    this.n0 = new ArrayList();
                                    i2 = (i2 == true ? 1 : 0) | 512;
                                }
                                i2 = i2;
                                while (codedInputStream.b() > 0) {
                                    this.n0.add(Integer.valueOf(codedInputStream.k()));
                                }
                                codedInputStream.c(iD);
                                continue;
                            case 242:
                                if ((this.Z & 128) == 128) {
                                    TypeTable typeTable = this.q0;
                                    typeTable.getClass();
                                    builderE = TypeTable.e(typeTable);
                                }
                                TypeTable typeTable2 = (TypeTable) codedInputStream.g(TypeTable.i0, extensionRegistryLite);
                                this.q0 = typeTable2;
                                if (builderE != null) {
                                    builderE.j(typeTable2);
                                    this.q0 = builderE.g();
                                }
                                this.Z |= 128;
                                continue;
                            case 248:
                                int i8 = (i2 == true ? 1 : 0) & 4096;
                                i2 = i2;
                                if (i8 != 4096) {
                                    this.r0 = new ArrayList();
                                    i2 = (i2 == true ? 1 : 0) | 4096;
                                }
                                this.r0.add(Integer.valueOf(codedInputStream.k()));
                                continue;
                            case 250:
                                int iD2 = codedInputStream.d(codedInputStream.k());
                                int i9 = (i2 == true ? 1 : 0) & 4096;
                                i2 = i2;
                                if (i9 != 4096 && codedInputStream.b() > 0) {
                                    i2 = i2;
                                    this.r0 = new ArrayList();
                                    i2 = (i2 == true ? 1 : 0) | 4096;
                                }
                                i2 = i2;
                                while (codedInputStream.b() > 0) {
                                    this.r0.add(Integer.valueOf(codedInputStream.k()));
                                }
                                codedInputStream.c(iD2);
                                continue;
                            case 258:
                                if ((this.Z & 256) == 256) {
                                    Contract contract = this.s0;
                                    contract.getClass();
                                    builder = new Contract.Builder();
                                    builder.Z = Collections.EMPTY_LIST;
                                    builder.h(contract);
                                }
                                Contract contract2 = (Contract) codedInputStream.g(Contract.g0, extensionRegistryLite);
                                this.s0 = contract2;
                                if (builder != null) {
                                    builder.h(contract2);
                                    this.s0 = builder.g();
                                }
                                this.Z |= 256;
                                continue;
                            default:
                                if (!n(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iN)) {
                                    break;
                                }
                                break;
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
                    if (((i2 == true ? 1 : 0) & 32) == 32) {
                        this.j0 = Collections.unmodifiableList(this.j0);
                    }
                    if (((i2 == true ? 1 : 0) & 1024) == 1024) {
                        this.p0 = Collections.unmodifiableList(this.p0);
                    }
                    if (((i2 == true ? 1 : 0) & 256) == 256) {
                        this.m0 = Collections.unmodifiableList(this.m0);
                    }
                    if (((i2 == true ? 1 : 0) & 512) == 512) {
                        this.n0 = Collections.unmodifiableList(this.n0);
                    }
                    if (((i2 == true ? 1 : 0) & 4096) == 4096) {
                        this.r0 = Collections.unmodifiableList(this.r0);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f44061Y = output.h();
                    }
                    m();
                    throw th;
                }
            }
            if (((i2 == true ? 1 : 0) & 32) == 32) {
                this.j0 = Collections.unmodifiableList(this.j0);
            }
            if (((i2 == true ? 1 : 0) & 1024) == 1024) {
                this.p0 = Collections.unmodifiableList(this.p0);
            }
            if (((i2 == true ? 1 : 0) & 256) == 256) {
                this.m0 = Collections.unmodifiableList(this.m0);
            }
            if (((i2 == true ? 1 : 0) & 512) == 512) {
                this.n0 = Collections.unmodifiableList(this.n0);
            }
            if (((i2 == true ? 1 : 0) & 4096) == 4096) {
                this.r0 = Collections.unmodifiableList(this.r0);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.f44061Y = output.h();
            }
            m();
        }
    }

    public static final class Property extends GeneratedMessageLite.ExtendableMessage<Property> implements PropertyOrBuilder {
        public static final Property v0;
        public static final Parser w0 = new AnonymousClass1();

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ByteString f44066Y;
        public int Z;
        public int e0;
        public int f0;
        public int g0;
        public Type h0;
        public int i0;
        public List j0;
        public Type k0;
        public int l0;
        public List m0;
        public List n0;
        public int o0;
        public ValueParameter p0;
        public int q0;
        public int r0;
        public List s0;
        public byte t0;
        public int u0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<Property> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Property(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Property, Builder> implements PropertyOrBuilder {
            public int e0;
            public int f0;
            public int g0;
            public int h0;
            public Type i0;
            public int j0;
            public List k0;
            public Type l0;
            public int m0;
            public List n0;
            public List o0;
            public ValueParameter p0;
            public int q0;
            public int r0;
            public List s0;

            public static Builder j() {
                Builder builder = new Builder();
                builder.f0 = 518;
                builder.g0 = 2054;
                Type type = Type.u0;
                builder.i0 = type;
                List list = Collections.EMPTY_LIST;
                builder.k0 = list;
                builder.l0 = type;
                builder.n0 = list;
                builder.o0 = list;
                builder.p0 = ValueParameter.m0;
                builder.s0 = list;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Property propertyI = i();
                if (propertyI.isInitialized()) {
                    return propertyI;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final GeneratedMessageLite.Builder c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                k((Property) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            public final Property i() {
                Property property = new Property(this);
                int i2 = this.e0;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                property.e0 = this.f0;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                property.f0 = this.g0;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                property.g0 = this.h0;
                if ((i2 & 8) == 8) {
                    i3 |= 8;
                }
                property.h0 = this.i0;
                if ((i2 & 16) == 16) {
                    i3 |= 16;
                }
                property.i0 = this.j0;
                if ((i2 & 32) == 32) {
                    this.k0 = Collections.unmodifiableList(this.k0);
                    this.e0 &= -33;
                }
                property.j0 = this.k0;
                if ((i2 & 64) == 64) {
                    i3 |= 32;
                }
                property.k0 = this.l0;
                if ((i2 & 128) == 128) {
                    i3 |= 64;
                }
                property.l0 = this.m0;
                if ((this.e0 & 256) == 256) {
                    this.n0 = Collections.unmodifiableList(this.n0);
                    this.e0 &= -257;
                }
                property.m0 = this.n0;
                if ((this.e0 & 512) == 512) {
                    this.o0 = Collections.unmodifiableList(this.o0);
                    this.e0 &= -513;
                }
                property.n0 = this.o0;
                if ((i2 & 1024) == 1024) {
                    i3 |= 128;
                }
                property.p0 = this.p0;
                if ((i2 & a.f25965n) == 2048) {
                    i3 |= 256;
                }
                property.q0 = this.q0;
                if ((i2 & 4096) == 4096) {
                    i3 |= 512;
                }
                property.r0 = this.r0;
                if ((this.e0 & Segment.SIZE) == 8192) {
                    this.s0 = Collections.unmodifiableList(this.s0);
                    this.e0 &= -8193;
                }
                property.s0 = this.s0;
                property.Z = i3;
                return property;
            }

            public final void k(Property property) {
                ValueParameter valueParameter;
                Type type;
                Type type2;
                if (property == Property.v0) {
                    return;
                }
                int i2 = property.Z;
                if ((i2 & 1) == 1) {
                    int i3 = property.e0;
                    this.e0 = 1 | this.e0;
                    this.f0 = i3;
                }
                if ((i2 & 2) == 2) {
                    int i4 = property.f0;
                    this.e0 = 2 | this.e0;
                    this.g0 = i4;
                }
                if ((i2 & 4) == 4) {
                    int i5 = property.g0;
                    this.e0 = 4 | this.e0;
                    this.h0 = i5;
                }
                if ((i2 & 8) == 8) {
                    Type type3 = property.h0;
                    if ((this.e0 & 8) != 8 || (type2 = this.i0) == Type.u0) {
                        this.i0 = type3;
                    } else {
                        Type.Builder builderR = Type.r(type2);
                        builderR.k(type3);
                        this.i0 = builderR.i();
                    }
                    this.e0 |= 8;
                }
                if ((property.Z & 16) == 16) {
                    int i6 = property.i0;
                    this.e0 = 16 | this.e0;
                    this.j0 = i6;
                }
                if (!property.j0.isEmpty()) {
                    if (this.k0.isEmpty()) {
                        this.k0 = property.j0;
                        this.e0 &= -33;
                    } else {
                        if ((this.e0 & 32) != 32) {
                            this.k0 = new ArrayList(this.k0);
                            this.e0 |= 32;
                        }
                        this.k0.addAll(property.j0);
                    }
                }
                if ((property.Z & 32) == 32) {
                    Type type4 = property.k0;
                    if ((this.e0 & 64) != 64 || (type = this.l0) == Type.u0) {
                        this.l0 = type4;
                    } else {
                        Type.Builder builderR2 = Type.r(type);
                        builderR2.k(type4);
                        this.l0 = builderR2.i();
                    }
                    this.e0 |= 64;
                }
                if ((property.Z & 64) == 64) {
                    int i7 = property.l0;
                    this.e0 |= 128;
                    this.m0 = i7;
                }
                if (!property.m0.isEmpty()) {
                    if (this.n0.isEmpty()) {
                        this.n0 = property.m0;
                        this.e0 &= -257;
                    } else {
                        if ((this.e0 & 256) != 256) {
                            this.n0 = new ArrayList(this.n0);
                            this.e0 |= 256;
                        }
                        this.n0.addAll(property.m0);
                    }
                }
                if (!property.n0.isEmpty()) {
                    if (this.o0.isEmpty()) {
                        this.o0 = property.n0;
                        this.e0 &= -513;
                    } else {
                        if ((this.e0 & 512) != 512) {
                            this.o0 = new ArrayList(this.o0);
                            this.e0 |= 512;
                        }
                        this.o0.addAll(property.n0);
                    }
                }
                if ((property.Z & 128) == 128) {
                    ValueParameter valueParameter2 = property.p0;
                    if ((this.e0 & 1024) != 1024 || (valueParameter = this.p0) == ValueParameter.m0) {
                        this.p0 = valueParameter2;
                    } else {
                        ValueParameter.Builder builder = new ValueParameter.Builder();
                        Type type5 = Type.u0;
                        builder.h0 = type5;
                        builder.j0 = type5;
                        builder.j(valueParameter);
                        builder.j(valueParameter2);
                        this.p0 = builder.i();
                    }
                    this.e0 |= 1024;
                }
                int i8 = property.Z;
                if ((i8 & 256) == 256) {
                    int i9 = property.q0;
                    this.e0 |= a.f25965n;
                    this.q0 = i9;
                }
                if ((i8 & 512) == 512) {
                    int i10 = property.r0;
                    this.e0 |= 4096;
                    this.r0 = i10;
                }
                if (!property.s0.isEmpty()) {
                    if (this.s0.isEmpty()) {
                        this.s0 = property.s0;
                        this.e0 &= -8193;
                    } else {
                        if ((this.e0 & Segment.SIZE) != 8192) {
                            this.s0 = new ArrayList(this.s0);
                            this.e0 |= Segment.SIZE;
                        }
                        this.s0.addAll(property.s0);
                    }
                }
                h(property);
                this.X = this.X.c(property.f44066Y);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void l(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Property property = null;
                try {
                    try {
                        ((AnonymousClass1) Property.w0).getClass();
                        k(new Property(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e2) {
                        Property property2 = (Property) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            property = property2;
                            if (property != null) {
                                k(property);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (property != null) {
                        k(property);
                    }
                    throw th;
                }
            }
        }

        static {
            Property property = new Property();
            v0 = property;
            property.p();
        }

        public Property(Builder builder) {
            super(builder);
            this.o0 = -1;
            this.t0 = (byte) -1;
            this.u0 = -1;
            this.f44066Y = builder.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.Z & 2) == 2) {
                codedOutputStream.m(1, this.f0);
            }
            if ((this.Z & 4) == 4) {
                codedOutputStream.m(2, this.g0);
            }
            if ((this.Z & 8) == 8) {
                codedOutputStream.o(3, this.h0);
            }
            for (int i2 = 0; i2 < this.j0.size(); i2++) {
                codedOutputStream.o(4, (MessageLite) this.j0.get(i2));
            }
            if ((this.Z & 32) == 32) {
                codedOutputStream.o(5, this.k0);
            }
            if ((this.Z & 128) == 128) {
                codedOutputStream.o(6, this.p0);
            }
            if ((this.Z & 256) == 256) {
                codedOutputStream.m(7, this.q0);
            }
            if ((this.Z & 512) == 512) {
                codedOutputStream.m(8, this.r0);
            }
            if ((this.Z & 16) == 16) {
                codedOutputStream.m(9, this.i0);
            }
            if ((this.Z & 64) == 64) {
                codedOutputStream.m(10, this.l0);
            }
            if ((this.Z & 1) == 1) {
                codedOutputStream.m(11, this.e0);
            }
            for (int i3 = 0; i3 < this.m0.size(); i3++) {
                codedOutputStream.o(12, (MessageLite) this.m0.get(i3));
            }
            if (this.n0.size() > 0) {
                codedOutputStream.v(106);
                codedOutputStream.v(this.o0);
            }
            for (int i4 = 0; i4 < this.n0.size(); i4++) {
                codedOutputStream.n(((Integer) this.n0.get(i4)).intValue());
            }
            for (int i5 = 0; i5 < this.s0.size(); i5++) {
                codedOutputStream.m(31, ((Integer) this.s0.get(i5)).intValue());
            }
            extensionWriter.a(19000, codedOutputStream);
            codedOutputStream.r(this.f44066Y);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return v0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.u0;
            if (i2 != -1) {
                return i2;
            }
            int iB = (this.Z & 2) == 2 ? CodedOutputStream.b(1, this.f0) : 0;
            if ((this.Z & 4) == 4) {
                iB += CodedOutputStream.b(2, this.g0);
            }
            if ((this.Z & 8) == 8) {
                iB += CodedOutputStream.d(3, this.h0);
            }
            for (int i3 = 0; i3 < this.j0.size(); i3++) {
                iB += CodedOutputStream.d(4, (MessageLite) this.j0.get(i3));
            }
            if ((this.Z & 32) == 32) {
                iB += CodedOutputStream.d(5, this.k0);
            }
            if ((this.Z & 128) == 128) {
                iB += CodedOutputStream.d(6, this.p0);
            }
            if ((this.Z & 256) == 256) {
                iB += CodedOutputStream.b(7, this.q0);
            }
            if ((this.Z & 512) == 512) {
                iB += CodedOutputStream.b(8, this.r0);
            }
            if ((this.Z & 16) == 16) {
                iB += CodedOutputStream.b(9, this.i0);
            }
            if ((this.Z & 64) == 64) {
                iB += CodedOutputStream.b(10, this.l0);
            }
            if ((this.Z & 1) == 1) {
                iB += CodedOutputStream.b(11, this.e0);
            }
            for (int i4 = 0; i4 < this.m0.size(); i4++) {
                iB += CodedOutputStream.d(12, (MessageLite) this.m0.get(i4));
            }
            int iC = 0;
            for (int i5 = 0; i5 < this.n0.size(); i5++) {
                iC += CodedOutputStream.c(((Integer) this.n0.get(i5)).intValue());
            }
            int iC2 = iB + iC;
            if (!this.n0.isEmpty()) {
                iC2 = iC2 + 1 + CodedOutputStream.c(iC);
            }
            this.o0 = iC;
            int iC3 = 0;
            for (int i6 = 0; i6 < this.s0.size(); i6++) {
                iC3 += CodedOutputStream.c(((Integer) this.s0.get(i6)).intValue());
            }
            int size = this.f44066Y.size() + h() + android.support.v4.media.a.c(2, iC2 + iC3, this.s0);
            this.u0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.t0;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            int i2 = this.Z;
            if ((i2 & 4) != 4) {
                this.t0 = (byte) 0;
                return false;
            }
            if ((i2 & 8) == 8 && !this.h0.isInitialized()) {
                this.t0 = (byte) 0;
                return false;
            }
            for (int i3 = 0; i3 < this.j0.size(); i3++) {
                if (!((TypeParameter) this.j0.get(i3)).isInitialized()) {
                    this.t0 = (byte) 0;
                    return false;
                }
            }
            if ((this.Z & 32) == 32 && !this.k0.isInitialized()) {
                this.t0 = (byte) 0;
                return false;
            }
            for (int i4 = 0; i4 < this.m0.size(); i4++) {
                if (!((Type) this.m0.get(i4)).isInitialized()) {
                    this.t0 = (byte) 0;
                    return false;
                }
            }
            if ((this.Z & 128) == 128 && !this.p0.isInitialized()) {
                this.t0 = (byte) 0;
                return false;
            }
            if (g()) {
                this.t0 = (byte) 1;
                return true;
            }
            this.t0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.j();
        }

        public final void p() {
            this.e0 = 518;
            this.f0 = 2054;
            this.g0 = 0;
            Type type = Type.u0;
            this.h0 = type;
            this.i0 = 0;
            List list = Collections.EMPTY_LIST;
            this.j0 = list;
            this.k0 = type;
            this.l0 = 0;
            this.m0 = list;
            this.n0 = list;
            this.p0 = ValueParameter.m0;
            this.q0 = 0;
            this.r0 = 0;
            this.s0 = list;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderJ = Builder.j();
            builderJ.k(this);
            return builderJ;
        }

        public Property() {
            this.o0 = -1;
            this.t0 = (byte) -1;
            this.u0 = -1;
            this.f44066Y = ByteString.X;
        }

        public Property(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.o0 = -1;
            this.t0 = (byte) -1;
            this.u0 = -1;
            p();
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                try {
                    try {
                        try {
                            int iN = codedInputStream.n();
                            Type.Builder builderR = null;
                            ValueParameter.Builder builder = null;
                            Type.Builder builderR2 = null;
                            switch (iN) {
                                case 0:
                                    break;
                                case 8:
                                    this.Z |= 2;
                                    this.f0 = codedInputStream.k();
                                    continue;
                                case 16:
                                    this.Z |= 4;
                                    this.g0 = codedInputStream.k();
                                    continue;
                                case 26:
                                    if ((this.Z & 8) == 8) {
                                        Type type = this.h0;
                                        type.getClass();
                                        builderR = Type.r(type);
                                    }
                                    Type type2 = (Type) codedInputStream.g(Type.v0, extensionRegistryLite);
                                    this.h0 = type2;
                                    if (builderR != null) {
                                        builderR.k(type2);
                                        this.h0 = builderR.i();
                                    }
                                    this.Z |= 8;
                                    continue;
                                case 34:
                                    int i3 = (i2 == true ? 1 : 0) & 32;
                                    i2 = i2;
                                    if (i3 != 32) {
                                        this.j0 = new ArrayList();
                                        i2 = (i2 == true ? 1 : 0) | 32;
                                    }
                                    this.j0.add(codedInputStream.g(TypeParameter.o0, extensionRegistryLite));
                                    continue;
                                case 42:
                                    if ((this.Z & 32) == 32) {
                                        Type type3 = this.k0;
                                        type3.getClass();
                                        builderR2 = Type.r(type3);
                                    }
                                    Type type4 = (Type) codedInputStream.g(Type.v0, extensionRegistryLite);
                                    this.k0 = type4;
                                    if (builderR2 != null) {
                                        builderR2.k(type4);
                                        this.k0 = builderR2.i();
                                    }
                                    this.Z |= 32;
                                    continue;
                                case 50:
                                    if ((this.Z & 128) == 128) {
                                        ValueParameter valueParameter = this.p0;
                                        valueParameter.getClass();
                                        builder = new ValueParameter.Builder();
                                        Type type5 = Type.u0;
                                        builder.h0 = type5;
                                        builder.j0 = type5;
                                        builder.j(valueParameter);
                                    }
                                    ValueParameter valueParameter2 = (ValueParameter) codedInputStream.g(ValueParameter.n0, extensionRegistryLite);
                                    this.p0 = valueParameter2;
                                    if (builder != null) {
                                        builder.j(valueParameter2);
                                        this.p0 = builder.i();
                                    }
                                    this.Z |= 128;
                                    continue;
                                case 56:
                                    this.Z |= 256;
                                    this.q0 = codedInputStream.k();
                                    continue;
                                case 64:
                                    this.Z |= 512;
                                    this.r0 = codedInputStream.k();
                                    continue;
                                case 72:
                                    this.Z |= 16;
                                    this.i0 = codedInputStream.k();
                                    continue;
                                case 80:
                                    this.Z |= 64;
                                    this.l0 = codedInputStream.k();
                                    continue;
                                case 88:
                                    this.Z |= 1;
                                    this.e0 = codedInputStream.k();
                                    continue;
                                case 98:
                                    int i4 = (i2 == true ? 1 : 0) & 256;
                                    i2 = i2;
                                    if (i4 != 256) {
                                        this.m0 = new ArrayList();
                                        i2 = (i2 == true ? 1 : 0) | 256;
                                    }
                                    this.m0.add(codedInputStream.g(Type.v0, extensionRegistryLite));
                                    continue;
                                case 104:
                                    int i5 = (i2 == true ? 1 : 0) & 512;
                                    i2 = i2;
                                    if (i5 != 512) {
                                        this.n0 = new ArrayList();
                                        i2 = (i2 == true ? 1 : 0) | 512;
                                    }
                                    this.n0.add(Integer.valueOf(codedInputStream.k()));
                                    continue;
                                case 106:
                                    int iD = codedInputStream.d(codedInputStream.k());
                                    int i6 = (i2 == true ? 1 : 0) & 512;
                                    i2 = i2;
                                    if (i6 != 512 && codedInputStream.b() > 0) {
                                        i2 = i2;
                                        this.n0 = new ArrayList();
                                        i2 = (i2 == true ? 1 : 0) | 512;
                                    }
                                    i2 = i2;
                                    while (codedInputStream.b() > 0) {
                                        this.n0.add(Integer.valueOf(codedInputStream.k()));
                                    }
                                    codedInputStream.c(iD);
                                    continue;
                                case 248:
                                    int i7 = (i2 == true ? 1 : 0) & Segment.SIZE;
                                    i2 = i2;
                                    if (i7 != 8192) {
                                        this.s0 = new ArrayList();
                                        i2 = (i2 == true ? 1 : 0) | Segment.SIZE;
                                    }
                                    this.s0.add(Integer.valueOf(codedInputStream.k()));
                                    continue;
                                case 250:
                                    int iD2 = codedInputStream.d(codedInputStream.k());
                                    int i8 = (i2 == true ? 1 : 0) & Segment.SIZE;
                                    i2 = i2;
                                    if (i8 != 8192 && codedInputStream.b() > 0) {
                                        i2 = i2;
                                        this.s0 = new ArrayList();
                                        i2 = (i2 == true ? 1 : 0) | Segment.SIZE;
                                    }
                                    i2 = i2;
                                    while (codedInputStream.b() > 0) {
                                        this.s0.add(Integer.valueOf(codedInputStream.k()));
                                    }
                                    codedInputStream.c(iD2);
                                    continue;
                                default:
                                    if (!n(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iN)) {
                                        break;
                                    }
                                    break;
                            }
                            z2 = true;
                        } catch (InvalidProtocolBufferException e2) {
                            e2.X = this;
                            throw e2;
                        }
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                        invalidProtocolBufferException.X = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    if (((i2 == true ? 1 : 0) & 32) == 32) {
                        this.j0 = Collections.unmodifiableList(this.j0);
                    }
                    if (((i2 == true ? 1 : 0) & 256) == 256) {
                        this.m0 = Collections.unmodifiableList(this.m0);
                    }
                    if (((i2 == true ? 1 : 0) & 512) == 512) {
                        this.n0 = Collections.unmodifiableList(this.n0);
                    }
                    if (((i2 == true ? 1 : 0) & Segment.SIZE) == 8192) {
                        this.s0 = Collections.unmodifiableList(this.s0);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f44066Y = output.h();
                    }
                    m();
                    throw th;
                }
            }
            if (((i2 == true ? 1 : 0) & 32) == 32) {
                this.j0 = Collections.unmodifiableList(this.j0);
            }
            if (((i2 == true ? 1 : 0) & 256) == 256) {
                this.m0 = Collections.unmodifiableList(this.m0);
            }
            if (((i2 == true ? 1 : 0) & 512) == 512) {
                this.n0 = Collections.unmodifiableList(this.n0);
            }
            if (((i2 == true ? 1 : 0) & Segment.SIZE) == 8192) {
                this.s0 = Collections.unmodifiableList(this.s0);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.f44066Y = output.h();
            }
            m();
        }
    }

    public static final class TypeParameter extends GeneratedMessageLite.ExtendableMessage<TypeParameter> implements TypeParameterOrBuilder {
        public static final TypeParameter n0;
        public static final Parser o0 = new AnonymousClass1();

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ByteString f44079Y;
        public int Z;
        public int e0;
        public int f0;
        public boolean g0;
        public Variance h0;
        public List i0;
        public List j0;
        public int k0;
        public byte l0;
        public int m0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<TypeParameter> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new TypeParameter(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeParameter, Builder> implements TypeParameterOrBuilder {
            public int e0;
            public int f0;
            public int g0;
            public boolean h0;
            public Variance i0;
            public List j0;
            public List k0;

            public static Builder j() {
                Builder builder = new Builder();
                builder.i0 = Variance.INV;
                List list = Collections.EMPTY_LIST;
                builder.j0 = list;
                builder.k0 = list;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                TypeParameter typeParameterI = i();
                if (typeParameterI.isInitialized()) {
                    return typeParameterI;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final GeneratedMessageLite.Builder c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                k((TypeParameter) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            public final TypeParameter i() {
                TypeParameter typeParameter = new TypeParameter(this);
                int i2 = this.e0;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                typeParameter.e0 = this.f0;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                typeParameter.f0 = this.g0;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                typeParameter.g0 = this.h0;
                if ((i2 & 8) == 8) {
                    i3 |= 8;
                }
                typeParameter.h0 = this.i0;
                if ((i2 & 16) == 16) {
                    this.j0 = Collections.unmodifiableList(this.j0);
                    this.e0 &= -17;
                }
                typeParameter.i0 = this.j0;
                if ((this.e0 & 32) == 32) {
                    this.k0 = Collections.unmodifiableList(this.k0);
                    this.e0 &= -33;
                }
                typeParameter.j0 = this.k0;
                typeParameter.Z = i3;
                return typeParameter;
            }

            public final void k(TypeParameter typeParameter) {
                if (typeParameter == TypeParameter.n0) {
                    return;
                }
                int i2 = typeParameter.Z;
                if ((i2 & 1) == 1) {
                    int i3 = typeParameter.e0;
                    this.e0 = 1 | this.e0;
                    this.f0 = i3;
                }
                if ((i2 & 2) == 2) {
                    int i4 = typeParameter.f0;
                    this.e0 = 2 | this.e0;
                    this.g0 = i4;
                }
                if ((i2 & 4) == 4) {
                    boolean z2 = typeParameter.g0;
                    this.e0 = 4 | this.e0;
                    this.h0 = z2;
                }
                if ((i2 & 8) == 8) {
                    Variance variance = typeParameter.h0;
                    variance.getClass();
                    this.e0 = 8 | this.e0;
                    this.i0 = variance;
                }
                if (!typeParameter.i0.isEmpty()) {
                    if (this.j0.isEmpty()) {
                        this.j0 = typeParameter.i0;
                        this.e0 &= -17;
                    } else {
                        if ((this.e0 & 16) != 16) {
                            this.j0 = new ArrayList(this.j0);
                            this.e0 |= 16;
                        }
                        this.j0.addAll(typeParameter.i0);
                    }
                }
                if (!typeParameter.j0.isEmpty()) {
                    if (this.k0.isEmpty()) {
                        this.k0 = typeParameter.j0;
                        this.e0 &= -33;
                    } else {
                        if ((this.e0 & 32) != 32) {
                            this.k0 = new ArrayList(this.k0);
                            this.e0 |= 32;
                        }
                        this.k0.addAll(typeParameter.j0);
                    }
                }
                h(typeParameter);
                this.X = this.X.c(typeParameter.f44079Y);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void l(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeParameter typeParameter = null;
                try {
                    try {
                        ((AnonymousClass1) TypeParameter.o0).getClass();
                        k(new TypeParameter(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e2) {
                        TypeParameter typeParameter2 = (TypeParameter) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            typeParameter = typeParameter2;
                            if (typeParameter != null) {
                                k(typeParameter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (typeParameter != null) {
                        k(typeParameter);
                    }
                    throw th;
                }
            }
        }

        public enum Variance implements Internal.EnumLite {
            IN(0),
            OUT(1),
            INV(2);

            public final int X;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Variance$1, reason: invalid class name */
            public static class AnonymousClass1 implements Internal.EnumLiteMap<Variance> {
            }

            Variance(int i2) {
                this.X = i2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.X;
            }
        }

        static {
            TypeParameter typeParameter = new TypeParameter();
            n0 = typeParameter;
            typeParameter.e0 = 0;
            typeParameter.f0 = 0;
            typeParameter.g0 = false;
            typeParameter.h0 = Variance.INV;
            List list = Collections.EMPTY_LIST;
            typeParameter.i0 = list;
            typeParameter.j0 = list;
        }

        public TypeParameter(Builder builder) {
            super(builder);
            this.k0 = -1;
            this.l0 = (byte) -1;
            this.m0 = -1;
            this.f44079Y = builder.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.Z & 1) == 1) {
                codedOutputStream.m(1, this.e0);
            }
            if ((this.Z & 2) == 2) {
                codedOutputStream.m(2, this.f0);
            }
            if ((this.Z & 4) == 4) {
                boolean z2 = this.g0;
                codedOutputStream.x(3, 0);
                codedOutputStream.q(z2 ? 1 : 0);
            }
            if ((this.Z & 8) == 8) {
                codedOutputStream.l(4, this.h0.X);
            }
            for (int i2 = 0; i2 < this.i0.size(); i2++) {
                codedOutputStream.o(5, (MessageLite) this.i0.get(i2));
            }
            if (this.j0.size() > 0) {
                codedOutputStream.v(50);
                codedOutputStream.v(this.k0);
            }
            for (int i3 = 0; i3 < this.j0.size(); i3++) {
                codedOutputStream.n(((Integer) this.j0.get(i3)).intValue());
            }
            extensionWriter.a(1000, codedOutputStream);
            codedOutputStream.r(this.f44079Y);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return n0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.m0;
            if (i2 != -1) {
                return i2;
            }
            int iB = (this.Z & 1) == 1 ? CodedOutputStream.b(1, this.e0) : 0;
            if ((this.Z & 2) == 2) {
                iB += CodedOutputStream.b(2, this.f0);
            }
            if ((this.Z & 4) == 4) {
                iB += CodedOutputStream.h(3) + 1;
            }
            if ((this.Z & 8) == 8) {
                iB += CodedOutputStream.a(4, this.h0.X);
            }
            for (int i3 = 0; i3 < this.i0.size(); i3++) {
                iB += CodedOutputStream.d(5, (MessageLite) this.i0.get(i3));
            }
            int iC = 0;
            for (int i4 = 0; i4 < this.j0.size(); i4++) {
                iC += CodedOutputStream.c(((Integer) this.j0.get(i4)).intValue());
            }
            int iC2 = iB + iC;
            if (!this.j0.isEmpty()) {
                iC2 = iC2 + 1 + CodedOutputStream.c(iC);
            }
            this.k0 = iC;
            int size = this.f44079Y.size() + h() + iC2;
            this.m0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.l0;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            int i2 = this.Z;
            if ((i2 & 1) != 1) {
                this.l0 = (byte) 0;
                return false;
            }
            if ((i2 & 2) != 2) {
                this.l0 = (byte) 0;
                return false;
            }
            for (int i3 = 0; i3 < this.i0.size(); i3++) {
                if (!((Type) this.i0.get(i3)).isInitialized()) {
                    this.l0 = (byte) 0;
                    return false;
                }
            }
            if (g()) {
                this.l0 = (byte) 1;
                return true;
            }
            this.l0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderJ = Builder.j();
            builderJ.k(this);
            return builderJ;
        }

        public TypeParameter() {
            this.k0 = -1;
            this.l0 = (byte) -1;
            this.m0 = -1;
            this.f44079Y = ByteString.X;
        }

        public TypeParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            Variance variance;
            this.k0 = -1;
            this.l0 = (byte) -1;
            this.m0 = -1;
            this.e0 = 0;
            this.f0 = 0;
            this.g0 = false;
            Variance variance2 = Variance.INV;
            this.h0 = variance2;
            List list = Collections.EMPTY_LIST;
            this.i0 = list;
            this.j0 = list;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.Z |= 1;
                                this.e0 = codedInputStream.k();
                            } else if (iN == 16) {
                                this.Z |= 2;
                                this.f0 = codedInputStream.k();
                            } else if (iN == 24) {
                                this.Z |= 4;
                                this.g0 = codedInputStream.l() != 0;
                            } else if (iN == 32) {
                                int iK = codedInputStream.k();
                                if (iK == 0) {
                                    variance = Variance.IN;
                                } else if (iK != 1) {
                                    variance = iK != 2 ? null : variance2;
                                } else {
                                    variance = Variance.OUT;
                                }
                                if (variance == null) {
                                    codedOutputStreamJ.v(iN);
                                    codedOutputStreamJ.v(iK);
                                } else {
                                    this.Z |= 8;
                                    this.h0 = variance;
                                }
                            } else if (iN == 42) {
                                if ((i2 & 16) != 16) {
                                    this.i0 = new ArrayList();
                                    i2 |= 16;
                                }
                                this.i0.add(codedInputStream.g(Type.v0, extensionRegistryLite));
                            } else if (iN == 48) {
                                if ((i2 & 32) != 32) {
                                    this.j0 = new ArrayList();
                                    i2 |= 32;
                                }
                                this.j0.add(Integer.valueOf(codedInputStream.k()));
                            } else if (iN != 50) {
                                if (!n(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iN)) {
                                }
                            } else {
                                int iD = codedInputStream.d(codedInputStream.k());
                                if ((i2 & 32) != 32 && codedInputStream.b() > 0) {
                                    this.j0 = new ArrayList();
                                    i2 |= 32;
                                }
                                while (codedInputStream.b() > 0) {
                                    this.j0.add(Integer.valueOf(codedInputStream.k()));
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
                    if ((i2 & 16) == 16) {
                        this.i0 = Collections.unmodifiableList(this.i0);
                    }
                    if ((i2 & 32) == 32) {
                        this.j0 = Collections.unmodifiableList(this.j0);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f44079Y = output.h();
                    }
                    m();
                    throw th;
                }
            }
            if ((i2 & 16) == 16) {
                this.i0 = Collections.unmodifiableList(this.i0);
            }
            if ((i2 & 32) == 32) {
                this.j0 = Collections.unmodifiableList(this.j0);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } finally {
                this.f44079Y = output.h();
            }
            m();
        }
    }

    public static final class Class extends GeneratedMessageLite.ExtendableMessage<Class> implements ClassOrBuilder {
        public static final Class K0;
        public static final Parser L0 = new AnonymousClass1();
        public List A0;
        public int B0;
        public List C0;
        public List D0;
        public int E0;
        public TypeTable F0;
        public List G0;
        public VersionRequirementTable H0;
        public byte I0;
        public int J0;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ByteString f44048Y;
        public int Z;
        public int e0;
        public int f0;
        public int g0;
        public List h0;
        public List i0;
        public List j0;
        public int k0;
        public List l0;
        public int m0;
        public List n0;
        public List o0;
        public int p0;
        public List q0;
        public List r0;
        public List s0;
        public List t0;
        public List u0;
        public List v0;
        public int w0;
        public int x0;
        public Type y0;
        public int z0;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<Class> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Class(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Class, Builder> implements ClassOrBuilder {
            public TypeTable A0;
            public List B0;
            public VersionRequirementTable C0;
            public int e0;
            public int f0;
            public int g0;
            public int h0;
            public List i0;
            public List j0;
            public List k0;
            public List l0;
            public List m0;
            public List n0;
            public List o0;
            public List p0;
            public List q0;
            public List r0;
            public List s0;
            public List t0;
            public int u0;
            public Type v0;
            public int w0;
            public List x0;
            public List y0;
            public List z0;

            public static Builder j() {
                Builder builder = new Builder();
                builder.f0 = 6;
                List list = Collections.EMPTY_LIST;
                builder.i0 = list;
                builder.j0 = list;
                builder.k0 = list;
                builder.l0 = list;
                builder.m0 = list;
                builder.n0 = list;
                builder.o0 = list;
                builder.p0 = list;
                builder.q0 = list;
                builder.r0 = list;
                builder.s0 = list;
                builder.t0 = list;
                builder.v0 = Type.u0;
                builder.x0 = list;
                builder.y0 = list;
                builder.z0 = list;
                builder.A0 = TypeTable.h0;
                builder.B0 = list;
                builder.C0 = VersionRequirementTable.f0;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Class classI = i();
                if (classI.isInitialized()) {
                    return classI;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: d */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                l(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* JADX INFO: renamed from: e */
            public final GeneratedMessageLite.Builder c() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder f(GeneratedMessageLite generatedMessageLite) {
                k((Class) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* JADX INFO: renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            public final Class i() {
                Class r0 = new Class(this);
                int i2 = this.e0;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                r0.e0 = this.f0;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                r0.f0 = this.g0;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                r0.g0 = this.h0;
                if ((i2 & 8) == 8) {
                    this.i0 = Collections.unmodifiableList(this.i0);
                    this.e0 &= -9;
                }
                r0.h0 = this.i0;
                if ((this.e0 & 16) == 16) {
                    this.j0 = Collections.unmodifiableList(this.j0);
                    this.e0 &= -17;
                }
                r0.i0 = this.j0;
                if ((this.e0 & 32) == 32) {
                    this.k0 = Collections.unmodifiableList(this.k0);
                    this.e0 &= -33;
                }
                r0.j0 = this.k0;
                if ((this.e0 & 64) == 64) {
                    this.l0 = Collections.unmodifiableList(this.l0);
                    this.e0 &= -65;
                }
                r0.l0 = this.l0;
                if ((this.e0 & 128) == 128) {
                    this.m0 = Collections.unmodifiableList(this.m0);
                    this.e0 &= -129;
                }
                r0.n0 = this.m0;
                if ((this.e0 & 256) == 256) {
                    this.n0 = Collections.unmodifiableList(this.n0);
                    this.e0 &= -257;
                }
                r0.o0 = this.n0;
                if ((this.e0 & 512) == 512) {
                    this.o0 = Collections.unmodifiableList(this.o0);
                    this.e0 &= -513;
                }
                r0.q0 = this.o0;
                if ((this.e0 & 1024) == 1024) {
                    this.p0 = Collections.unmodifiableList(this.p0);
                    this.e0 &= -1025;
                }
                r0.r0 = this.p0;
                if ((this.e0 & a.f25965n) == 2048) {
                    this.q0 = Collections.unmodifiableList(this.q0);
                    this.e0 &= -2049;
                }
                r0.s0 = this.q0;
                if ((this.e0 & 4096) == 4096) {
                    this.r0 = Collections.unmodifiableList(this.r0);
                    this.e0 &= -4097;
                }
                r0.t0 = this.r0;
                if ((this.e0 & Segment.SIZE) == 8192) {
                    this.s0 = Collections.unmodifiableList(this.s0);
                    this.e0 &= -8193;
                }
                r0.u0 = this.s0;
                if ((this.e0 & 16384) == 16384) {
                    this.t0 = Collections.unmodifiableList(this.t0);
                    this.e0 &= -16385;
                }
                r0.v0 = this.t0;
                if ((i2 & 32768) == 32768) {
                    i3 |= 8;
                }
                r0.x0 = this.u0;
                if ((i2 & 65536) == 65536) {
                    i3 |= 16;
                }
                r0.y0 = this.v0;
                if ((i2 & 131072) == 131072) {
                    i3 |= 32;
                }
                r0.z0 = this.w0;
                if ((this.e0 & 262144) == 262144) {
                    this.x0 = Collections.unmodifiableList(this.x0);
                    this.e0 &= -262145;
                }
                r0.A0 = this.x0;
                if ((this.e0 & 524288) == 524288) {
                    this.y0 = Collections.unmodifiableList(this.y0);
                    this.e0 &= -524289;
                }
                r0.C0 = this.y0;
                if ((this.e0 & 1048576) == 1048576) {
                    this.z0 = Collections.unmodifiableList(this.z0);
                    this.e0 &= -1048577;
                }
                r0.D0 = this.z0;
                if ((i2 & 2097152) == 2097152) {
                    i3 |= 64;
                }
                r0.F0 = this.A0;
                if ((this.e0 & 4194304) == 4194304) {
                    this.B0 = Collections.unmodifiableList(this.B0);
                    this.e0 &= -4194305;
                }
                r0.G0 = this.B0;
                if ((i2 & 8388608) == 8388608) {
                    i3 |= 128;
                }
                r0.H0 = this.C0;
                r0.Z = i3;
                return r0;
            }

            public final void k(Class r9) {
                VersionRequirementTable versionRequirementTable;
                TypeTable typeTable;
                Type type;
                if (r9 == Class.K0) {
                    return;
                }
                int i2 = r9.Z;
                if ((i2 & 1) == 1) {
                    int i3 = r9.e0;
                    this.e0 = 1 | this.e0;
                    this.f0 = i3;
                }
                if ((i2 & 2) == 2) {
                    int i4 = r9.f0;
                    this.e0 = 2 | this.e0;
                    this.g0 = i4;
                }
                if ((i2 & 4) == 4) {
                    int i5 = r9.g0;
                    this.e0 = 4 | this.e0;
                    this.h0 = i5;
                }
                if (!r9.h0.isEmpty()) {
                    if (this.i0.isEmpty()) {
                        this.i0 = r9.h0;
                        this.e0 &= -9;
                    } else {
                        if ((this.e0 & 8) != 8) {
                            this.i0 = new ArrayList(this.i0);
                            this.e0 |= 8;
                        }
                        this.i0.addAll(r9.h0);
                    }
                }
                if (!r9.i0.isEmpty()) {
                    if (this.j0.isEmpty()) {
                        this.j0 = r9.i0;
                        this.e0 &= -17;
                    } else {
                        if ((this.e0 & 16) != 16) {
                            this.j0 = new ArrayList(this.j0);
                            this.e0 |= 16;
                        }
                        this.j0.addAll(r9.i0);
                    }
                }
                if (!r9.j0.isEmpty()) {
                    if (this.k0.isEmpty()) {
                        this.k0 = r9.j0;
                        this.e0 &= -33;
                    } else {
                        if ((this.e0 & 32) != 32) {
                            this.k0 = new ArrayList(this.k0);
                            this.e0 |= 32;
                        }
                        this.k0.addAll(r9.j0);
                    }
                }
                if (!r9.l0.isEmpty()) {
                    if (this.l0.isEmpty()) {
                        this.l0 = r9.l0;
                        this.e0 &= -65;
                    } else {
                        if ((this.e0 & 64) != 64) {
                            this.l0 = new ArrayList(this.l0);
                            this.e0 |= 64;
                        }
                        this.l0.addAll(r9.l0);
                    }
                }
                if (!r9.n0.isEmpty()) {
                    if (this.m0.isEmpty()) {
                        this.m0 = r9.n0;
                        this.e0 &= -129;
                    } else {
                        if ((this.e0 & 128) != 128) {
                            this.m0 = new ArrayList(this.m0);
                            this.e0 |= 128;
                        }
                        this.m0.addAll(r9.n0);
                    }
                }
                if (!r9.o0.isEmpty()) {
                    if (this.n0.isEmpty()) {
                        this.n0 = r9.o0;
                        this.e0 &= -257;
                    } else {
                        if ((this.e0 & 256) != 256) {
                            this.n0 = new ArrayList(this.n0);
                            this.e0 |= 256;
                        }
                        this.n0.addAll(r9.o0);
                    }
                }
                if (!r9.q0.isEmpty()) {
                    if (this.o0.isEmpty()) {
                        this.o0 = r9.q0;
                        this.e0 &= -513;
                    } else {
                        if ((this.e0 & 512) != 512) {
                            this.o0 = new ArrayList(this.o0);
                            this.e0 |= 512;
                        }
                        this.o0.addAll(r9.q0);
                    }
                }
                if (!r9.r0.isEmpty()) {
                    if (this.p0.isEmpty()) {
                        this.p0 = r9.r0;
                        this.e0 &= -1025;
                    } else {
                        if ((this.e0 & 1024) != 1024) {
                            this.p0 = new ArrayList(this.p0);
                            this.e0 |= 1024;
                        }
                        this.p0.addAll(r9.r0);
                    }
                }
                if (!r9.s0.isEmpty()) {
                    if (this.q0.isEmpty()) {
                        this.q0 = r9.s0;
                        this.e0 &= -2049;
                    } else {
                        if ((this.e0 & a.f25965n) != 2048) {
                            this.q0 = new ArrayList(this.q0);
                            this.e0 |= a.f25965n;
                        }
                        this.q0.addAll(r9.s0);
                    }
                }
                if (!r9.t0.isEmpty()) {
                    if (this.r0.isEmpty()) {
                        this.r0 = r9.t0;
                        this.e0 &= -4097;
                    } else {
                        if ((this.e0 & 4096) != 4096) {
                            this.r0 = new ArrayList(this.r0);
                            this.e0 |= 4096;
                        }
                        this.r0.addAll(r9.t0);
                    }
                }
                if (!r9.u0.isEmpty()) {
                    if (this.s0.isEmpty()) {
                        this.s0 = r9.u0;
                        this.e0 &= -8193;
                    } else {
                        if ((this.e0 & Segment.SIZE) != 8192) {
                            this.s0 = new ArrayList(this.s0);
                            this.e0 |= Segment.SIZE;
                        }
                        this.s0.addAll(r9.u0);
                    }
                }
                if (!r9.v0.isEmpty()) {
                    if (this.t0.isEmpty()) {
                        this.t0 = r9.v0;
                        this.e0 &= -16385;
                    } else {
                        if ((this.e0 & 16384) != 16384) {
                            this.t0 = new ArrayList(this.t0);
                            this.e0 |= 16384;
                        }
                        this.t0.addAll(r9.v0);
                    }
                }
                int i6 = r9.Z;
                if ((i6 & 8) == 8) {
                    int i7 = r9.x0;
                    this.e0 |= 32768;
                    this.u0 = i7;
                }
                if ((i6 & 16) == 16) {
                    Type type2 = r9.y0;
                    if ((this.e0 & 65536) != 65536 || (type = this.v0) == Type.u0) {
                        this.v0 = type2;
                    } else {
                        Type.Builder builderR = Type.r(type);
                        builderR.k(type2);
                        this.v0 = builderR.i();
                    }
                    this.e0 |= 65536;
                }
                if ((r9.Z & 32) == 32) {
                    int i8 = r9.z0;
                    this.e0 |= 131072;
                    this.w0 = i8;
                }
                if (!r9.A0.isEmpty()) {
                    if (this.x0.isEmpty()) {
                        this.x0 = r9.A0;
                        this.e0 &= -262145;
                    } else {
                        if ((this.e0 & 262144) != 262144) {
                            this.x0 = new ArrayList(this.x0);
                            this.e0 |= 262144;
                        }
                        this.x0.addAll(r9.A0);
                    }
                }
                if (!r9.C0.isEmpty()) {
                    if (this.y0.isEmpty()) {
                        this.y0 = r9.C0;
                        this.e0 &= -524289;
                    } else {
                        if ((this.e0 & 524288) != 524288) {
                            this.y0 = new ArrayList(this.y0);
                            this.e0 |= 524288;
                        }
                        this.y0.addAll(r9.C0);
                    }
                }
                if (!r9.D0.isEmpty()) {
                    if (this.z0.isEmpty()) {
                        this.z0 = r9.D0;
                        this.e0 &= -1048577;
                    } else {
                        if ((this.e0 & 1048576) != 1048576) {
                            this.z0 = new ArrayList(this.z0);
                            this.e0 |= 1048576;
                        }
                        this.z0.addAll(r9.D0);
                    }
                }
                if ((r9.Z & 64) == 64) {
                    TypeTable typeTable2 = r9.F0;
                    if ((this.e0 & 2097152) != 2097152 || (typeTable = this.A0) == TypeTable.h0) {
                        this.A0 = typeTable2;
                    } else {
                        TypeTable.Builder builderE = TypeTable.e(typeTable);
                        builderE.j(typeTable2);
                        this.A0 = builderE.g();
                    }
                    this.e0 |= 2097152;
                }
                if (!r9.G0.isEmpty()) {
                    if (this.B0.isEmpty()) {
                        this.B0 = r9.G0;
                        this.e0 &= -4194305;
                    } else {
                        if ((this.e0 & 4194304) != 4194304) {
                            this.B0 = new ArrayList(this.B0);
                            this.e0 |= 4194304;
                        }
                        this.B0.addAll(r9.G0);
                    }
                }
                if ((r9.Z & 128) == 128) {
                    VersionRequirementTable versionRequirementTable2 = r9.H0;
                    if ((this.e0 & 8388608) != 8388608 || (versionRequirementTable = this.C0) == VersionRequirementTable.f0) {
                        this.C0 = versionRequirementTable2;
                    } else {
                        VersionRequirementTable.Builder builder = new VersionRequirementTable.Builder();
                        builder.Z = Collections.EMPTY_LIST;
                        builder.h(versionRequirementTable);
                        builder.h(versionRequirementTable2);
                        this.C0 = builder.g();
                    }
                    this.e0 |= 8388608;
                }
                h(r9);
                this.X = this.X.c(r9.f44048Y);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x001d  */
            public final void l(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Class r0 = null;
                try {
                    try {
                        ((AnonymousClass1) Class.L0).getClass();
                        k(new Class(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e2) {
                        Class r4 = (Class) e2.X;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            r0 = r4;
                            if (r0 != null) {
                                k(r0);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r0 != null) {
                        k(r0);
                    }
                    throw th;
                }
            }
        }

        public enum Kind implements Internal.EnumLite {
            CLASS(0),
            INTERFACE(1),
            ENUM_CLASS(2),
            /* JADX INFO: Fake field, exist only in values array */
            ENUM_ENTRY(3),
            ANNOTATION_CLASS(4),
            /* JADX INFO: Fake field, exist only in values array */
            OBJECT(5),
            COMPANION_OBJECT(6);

            public final int X;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind$1, reason: invalid class name */
            public static class AnonymousClass1 implements Internal.EnumLiteMap<Kind> {
            }

            Kind(int i2) {
                this.X = i2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.X;
            }
        }

        static {
            Class r0 = new Class();
            K0 = r0;
            r0.p();
        }

        public Class(Builder builder) {
            super(builder);
            this.k0 = -1;
            this.m0 = -1;
            this.p0 = -1;
            this.w0 = -1;
            this.B0 = -1;
            this.E0 = -1;
            this.I0 = (byte) -1;
            this.J0 = -1;
            this.f44048Y = builder.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void b(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.Z & 1) == 1) {
                codedOutputStream.m(1, this.e0);
            }
            if (this.j0.size() > 0) {
                codedOutputStream.v(18);
                codedOutputStream.v(this.k0);
            }
            for (int i2 = 0; i2 < this.j0.size(); i2++) {
                codedOutputStream.n(((Integer) this.j0.get(i2)).intValue());
            }
            if ((this.Z & 2) == 2) {
                codedOutputStream.m(3, this.f0);
            }
            if ((this.Z & 4) == 4) {
                codedOutputStream.m(4, this.g0);
            }
            for (int i3 = 0; i3 < this.h0.size(); i3++) {
                codedOutputStream.o(5, (MessageLite) this.h0.get(i3));
            }
            for (int i4 = 0; i4 < this.i0.size(); i4++) {
                codedOutputStream.o(6, (MessageLite) this.i0.get(i4));
            }
            if (this.l0.size() > 0) {
                codedOutputStream.v(58);
                codedOutputStream.v(this.m0);
            }
            for (int i5 = 0; i5 < this.l0.size(); i5++) {
                codedOutputStream.n(((Integer) this.l0.get(i5)).intValue());
            }
            for (int i6 = 0; i6 < this.q0.size(); i6++) {
                codedOutputStream.o(8, (MessageLite) this.q0.get(i6));
            }
            for (int i7 = 0; i7 < this.r0.size(); i7++) {
                codedOutputStream.o(9, (MessageLite) this.r0.get(i7));
            }
            for (int i8 = 0; i8 < this.s0.size(); i8++) {
                codedOutputStream.o(10, (MessageLite) this.s0.get(i8));
            }
            for (int i9 = 0; i9 < this.t0.size(); i9++) {
                codedOutputStream.o(11, (MessageLite) this.t0.get(i9));
            }
            for (int i10 = 0; i10 < this.u0.size(); i10++) {
                codedOutputStream.o(13, (MessageLite) this.u0.get(i10));
            }
            if (this.v0.size() > 0) {
                codedOutputStream.v(130);
                codedOutputStream.v(this.w0);
            }
            for (int i11 = 0; i11 < this.v0.size(); i11++) {
                codedOutputStream.n(((Integer) this.v0.get(i11)).intValue());
            }
            if ((this.Z & 8) == 8) {
                codedOutputStream.m(17, this.x0);
            }
            if ((this.Z & 16) == 16) {
                codedOutputStream.o(18, this.y0);
            }
            if ((this.Z & 32) == 32) {
                codedOutputStream.m(19, this.z0);
            }
            for (int i12 = 0; i12 < this.n0.size(); i12++) {
                codedOutputStream.o(20, (MessageLite) this.n0.get(i12));
            }
            if (this.o0.size() > 0) {
                codedOutputStream.v(170);
                codedOutputStream.v(this.p0);
            }
            for (int i13 = 0; i13 < this.o0.size(); i13++) {
                codedOutputStream.n(((Integer) this.o0.get(i13)).intValue());
            }
            if (this.A0.size() > 0) {
                codedOutputStream.v(178);
                codedOutputStream.v(this.B0);
            }
            for (int i14 = 0; i14 < this.A0.size(); i14++) {
                codedOutputStream.n(((Integer) this.A0.get(i14)).intValue());
            }
            for (int i15 = 0; i15 < this.C0.size(); i15++) {
                codedOutputStream.o(23, (MessageLite) this.C0.get(i15));
            }
            if (this.D0.size() > 0) {
                codedOutputStream.v(194);
                codedOutputStream.v(this.E0);
            }
            for (int i16 = 0; i16 < this.D0.size(); i16++) {
                codedOutputStream.n(((Integer) this.D0.get(i16)).intValue());
            }
            if ((this.Z & 64) == 64) {
                codedOutputStream.o(30, this.F0);
            }
            for (int i17 = 0; i17 < this.G0.size(); i17++) {
                codedOutputStream.m(31, ((Integer) this.G0.get(i17)).intValue());
            }
            if ((this.Z & 128) == 128) {
                codedOutputStream.o(32, this.H0);
            }
            extensionWriter.a(19000, codedOutputStream);
            codedOutputStream.r(this.f44048Y);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return K0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.J0;
            if (i2 != -1) {
                return i2;
            }
            int iB = (this.Z & 1) == 1 ? CodedOutputStream.b(1, this.e0) : 0;
            int iC = 0;
            for (int i3 = 0; i3 < this.j0.size(); i3++) {
                iC += CodedOutputStream.c(((Integer) this.j0.get(i3)).intValue());
            }
            int iD = iB + iC;
            if (!this.j0.isEmpty()) {
                iD = iD + 1 + CodedOutputStream.c(iC);
            }
            this.k0 = iC;
            if ((this.Z & 2) == 2) {
                iD += CodedOutputStream.b(3, this.f0);
            }
            if ((this.Z & 4) == 4) {
                iD += CodedOutputStream.b(4, this.g0);
            }
            for (int i4 = 0; i4 < this.h0.size(); i4++) {
                iD += CodedOutputStream.d(5, (MessageLite) this.h0.get(i4));
            }
            for (int i5 = 0; i5 < this.i0.size(); i5++) {
                iD += CodedOutputStream.d(6, (MessageLite) this.i0.get(i5));
            }
            int iC2 = 0;
            for (int i6 = 0; i6 < this.l0.size(); i6++) {
                iC2 += CodedOutputStream.c(((Integer) this.l0.get(i6)).intValue());
            }
            int iD2 = iD + iC2;
            if (!this.l0.isEmpty()) {
                iD2 = iD2 + 1 + CodedOutputStream.c(iC2);
            }
            this.m0 = iC2;
            for (int i7 = 0; i7 < this.q0.size(); i7++) {
                iD2 += CodedOutputStream.d(8, (MessageLite) this.q0.get(i7));
            }
            for (int i8 = 0; i8 < this.r0.size(); i8++) {
                iD2 += CodedOutputStream.d(9, (MessageLite) this.r0.get(i8));
            }
            for (int i9 = 0; i9 < this.s0.size(); i9++) {
                iD2 += CodedOutputStream.d(10, (MessageLite) this.s0.get(i9));
            }
            for (int i10 = 0; i10 < this.t0.size(); i10++) {
                iD2 += CodedOutputStream.d(11, (MessageLite) this.t0.get(i10));
            }
            for (int i11 = 0; i11 < this.u0.size(); i11++) {
                iD2 += CodedOutputStream.d(13, (MessageLite) this.u0.get(i11));
            }
            int iC3 = 0;
            for (int i12 = 0; i12 < this.v0.size(); i12++) {
                iC3 += CodedOutputStream.c(((Integer) this.v0.get(i12)).intValue());
            }
            int iD3 = iD2 + iC3;
            if (!this.v0.isEmpty()) {
                iD3 = iD3 + 2 + CodedOutputStream.c(iC3);
            }
            this.w0 = iC3;
            if ((this.Z & 8) == 8) {
                iD3 += CodedOutputStream.b(17, this.x0);
            }
            if ((this.Z & 16) == 16) {
                iD3 += CodedOutputStream.d(18, this.y0);
            }
            if ((this.Z & 32) == 32) {
                iD3 += CodedOutputStream.b(19, this.z0);
            }
            for (int i13 = 0; i13 < this.n0.size(); i13++) {
                iD3 += CodedOutputStream.d(20, (MessageLite) this.n0.get(i13));
            }
            int iC4 = 0;
            for (int i14 = 0; i14 < this.o0.size(); i14++) {
                iC4 += CodedOutputStream.c(((Integer) this.o0.get(i14)).intValue());
            }
            int iC5 = iD3 + iC4;
            if (!this.o0.isEmpty()) {
                iC5 = iC5 + 2 + CodedOutputStream.c(iC4);
            }
            this.p0 = iC4;
            int iC6 = 0;
            for (int i15 = 0; i15 < this.A0.size(); i15++) {
                iC6 += CodedOutputStream.c(((Integer) this.A0.get(i15)).intValue());
            }
            int iD4 = iC5 + iC6;
            if (!this.A0.isEmpty()) {
                iD4 = iD4 + 2 + CodedOutputStream.c(iC6);
            }
            this.B0 = iC6;
            for (int i16 = 0; i16 < this.C0.size(); i16++) {
                iD4 += CodedOutputStream.d(23, (MessageLite) this.C0.get(i16));
            }
            int iC7 = 0;
            for (int i17 = 0; i17 < this.D0.size(); i17++) {
                iC7 += CodedOutputStream.c(((Integer) this.D0.get(i17)).intValue());
            }
            int iD5 = iD4 + iC7;
            if (!this.D0.isEmpty()) {
                iD5 = iD5 + 2 + CodedOutputStream.c(iC7);
            }
            this.E0 = iC7;
            if ((this.Z & 64) == 64) {
                iD5 += CodedOutputStream.d(30, this.F0);
            }
            int iC8 = 0;
            for (int i18 = 0; i18 < this.G0.size(); i18++) {
                iC8 += CodedOutputStream.c(((Integer) this.G0.get(i18)).intValue());
            }
            int iC9 = android.support.v4.media.a.c(2, iD5 + iC8, this.G0);
            if ((this.Z & 128) == 128) {
                iC9 += CodedOutputStream.d(32, this.H0);
            }
            int size = this.f44048Y.size() + h() + iC9;
            this.J0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.I0;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if ((this.Z & 2) != 2) {
                this.I0 = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < this.h0.size(); i2++) {
                if (!((TypeParameter) this.h0.get(i2)).isInitialized()) {
                    this.I0 = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < this.i0.size(); i3++) {
                if (!((Type) this.i0.get(i3)).isInitialized()) {
                    this.I0 = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < this.n0.size(); i4++) {
                if (!((Type) this.n0.get(i4)).isInitialized()) {
                    this.I0 = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < this.q0.size(); i5++) {
                if (!((Constructor) this.q0.get(i5)).isInitialized()) {
                    this.I0 = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < this.r0.size(); i6++) {
                if (!((Function) this.r0.get(i6)).isInitialized()) {
                    this.I0 = (byte) 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < this.s0.size(); i7++) {
                if (!((Property) this.s0.get(i7)).isInitialized()) {
                    this.I0 = (byte) 0;
                    return false;
                }
            }
            for (int i8 = 0; i8 < this.t0.size(); i8++) {
                if (!((TypeAlias) this.t0.get(i8)).isInitialized()) {
                    this.I0 = (byte) 0;
                    return false;
                }
            }
            for (int i9 = 0; i9 < this.u0.size(); i9++) {
                if (!((EnumEntry) this.u0.get(i9)).isInitialized()) {
                    this.I0 = (byte) 0;
                    return false;
                }
            }
            if ((this.Z & 16) == 16 && !this.y0.isInitialized()) {
                this.I0 = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < this.C0.size(); i10++) {
                if (!((Type) this.C0.get(i10)).isInitialized()) {
                    this.I0 = (byte) 0;
                    return false;
                }
            }
            if ((this.Z & 64) == 64 && !this.F0.isInitialized()) {
                this.I0 = (byte) 0;
                return false;
            }
            if (g()) {
                this.I0 = (byte) 1;
                return true;
            }
            this.I0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.j();
        }

        public final void p() {
            this.e0 = 6;
            this.f0 = 0;
            this.g0 = 0;
            List list = Collections.EMPTY_LIST;
            this.h0 = list;
            this.i0 = list;
            this.j0 = list;
            this.l0 = list;
            this.n0 = list;
            this.o0 = list;
            this.q0 = list;
            this.r0 = list;
            this.s0 = list;
            this.t0 = list;
            this.u0 = list;
            this.v0 = list;
            this.x0 = 0;
            this.y0 = Type.u0;
            this.z0 = 0;
            this.A0 = list;
            this.C0 = list;
            this.D0 = list;
            this.F0 = TypeTable.h0;
            this.G0 = list;
            this.H0 = VersionRequirementTable.f0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderJ = Builder.j();
            builderJ.k(this);
            return builderJ;
        }

        public Class() {
            this.k0 = -1;
            this.m0 = -1;
            this.p0 = -1;
            this.w0 = -1;
            this.B0 = -1;
            this.E0 = -1;
            this.I0 = (byte) -1;
            this.J0 = -1;
            this.f44048Y = ByteString.X;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:9:0x004d  */
        /* JADX WARN: Multi-variable type inference failed */
        public Class(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            this.k0 = -1;
            this.m0 = -1;
            this.p0 = -1;
            this.w0 = -1;
            this.B0 = -1;
            this.E0 = -1;
            this.I0 = (byte) -1;
            this.J0 = -1;
            p();
            ByteString.Output outputO = ByteString.o();
            boolean z2 = true;
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(outputO, 1);
            boolean z3 = false;
            int i2 = 0;
            while (true) {
                boolean z4 = z2;
                if (!z3) {
                    try {
                        try {
                            int iN = codedInputStream.n();
                            switch (iN) {
                                case 0:
                                    z3 = z4;
                                    z2 = z4;
                                    break;
                                case 8:
                                    this.Z |= 1;
                                    this.e0 = codedInputStream.f();
                                    z2 = z4;
                                    break;
                                case 16:
                                    if ((i2 & 32) != 32) {
                                        this.j0 = new ArrayList();
                                        i2 |= 32;
                                    }
                                    this.j0.add(Integer.valueOf(codedInputStream.f()));
                                    z2 = z4;
                                    break;
                                case 18:
                                    int iD = codedInputStream.d(codedInputStream.k());
                                    if ((i2 & 32) != 32 && codedInputStream.b() > 0) {
                                        this.j0 = new ArrayList();
                                        i2 |= 32;
                                    }
                                    while (codedInputStream.b() > 0) {
                                        this.j0.add(Integer.valueOf(codedInputStream.f()));
                                    }
                                    codedInputStream.c(iD);
                                    z2 = z4;
                                    break;
                                case 24:
                                    this.Z |= 2;
                                    this.f0 = codedInputStream.f();
                                    z2 = z4;
                                    break;
                                case 32:
                                    this.Z |= 4;
                                    this.g0 = codedInputStream.f();
                                    z2 = z4;
                                    break;
                                case 42:
                                    if ((i2 & 8) != 8) {
                                        this.h0 = new ArrayList();
                                        i2 |= 8;
                                    }
                                    this.h0.add(codedInputStream.g(TypeParameter.o0, extensionRegistryLite));
                                    z2 = z4;
                                    break;
                                case 50:
                                    if ((i2 & 16) != 16) {
                                        this.i0 = new ArrayList();
                                        i2 |= 16;
                                    }
                                    this.i0.add(codedInputStream.g(Type.v0, extensionRegistryLite));
                                    z2 = z4;
                                    break;
                                case 56:
                                    if ((i2 & 64) != 64) {
                                        this.l0 = new ArrayList();
                                        i2 |= 64;
                                    }
                                    this.l0.add(Integer.valueOf(codedInputStream.f()));
                                    z2 = z4;
                                    break;
                                case 58:
                                    int iD2 = codedInputStream.d(codedInputStream.k());
                                    if ((i2 & 64) != 64 && codedInputStream.b() > 0) {
                                        this.l0 = new ArrayList();
                                        i2 |= 64;
                                    }
                                    while (codedInputStream.b() > 0) {
                                        this.l0.add(Integer.valueOf(codedInputStream.f()));
                                    }
                                    codedInputStream.c(iD2);
                                    z2 = z4;
                                    break;
                                case 66:
                                    if ((i2 & 512) != 512) {
                                        this.q0 = new ArrayList();
                                        i2 |= 512;
                                    }
                                    this.q0.add(codedInputStream.g(Constructor.k0, extensionRegistryLite));
                                    z2 = z4;
                                    break;
                                case mo.oom.ooo /* 74 */:
                                    if ((i2 & 1024) != 1024) {
                                        this.r0 = new ArrayList();
                                        i2 |= 1024;
                                    }
                                    this.r0.add(codedInputStream.g(Function.w0, extensionRegistryLite));
                                    z2 = z4;
                                    break;
                                case 82:
                                    if ((i2 & a.f25965n) != 2048) {
                                        this.s0 = new ArrayList();
                                        i2 |= a.f25965n;
                                    }
                                    this.s0.add(codedInputStream.g(Property.w0, extensionRegistryLite));
                                    z2 = z4;
                                    break;
                                case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
                                    if ((i2 & 4096) != 4096) {
                                        this.t0 = new ArrayList();
                                        i2 |= 4096;
                                    }
                                    this.t0.add(codedInputStream.g(TypeAlias.q0, extensionRegistryLite));
                                    z2 = z4;
                                    break;
                                case 106:
                                    if ((i2 & Segment.SIZE) != 8192) {
                                        this.u0 = new ArrayList();
                                        i2 |= Segment.SIZE;
                                    }
                                    this.u0.add(codedInputStream.g(EnumEntry.i0, extensionRegistryLite));
                                    z2 = z4;
                                    break;
                                case 128:
                                    if ((i2 & 16384) != 16384) {
                                        this.v0 = new ArrayList();
                                        i2 |= 16384;
                                    }
                                    this.v0.add(Integer.valueOf(codedInputStream.f()));
                                    z2 = z4;
                                    break;
                                case 130:
                                    int iD3 = codedInputStream.d(codedInputStream.k());
                                    if ((i2 & 16384) != 16384 && codedInputStream.b() > 0) {
                                        this.v0 = new ArrayList();
                                        i2 |= 16384;
                                    }
                                    while (codedInputStream.b() > 0) {
                                        this.v0.add(Integer.valueOf(codedInputStream.f()));
                                    }
                                    codedInputStream.c(iD3);
                                    z2 = z4;
                                    break;
                                case PRIVACY_URL_ERROR_VALUE:
                                    this.Z |= 8;
                                    this.x0 = codedInputStream.f();
                                    z2 = z4;
                                    break;
                                case 146:
                                    Type.Builder builder = (this.Z & 16) == 16 ? this.y0.toBuilder() : null;
                                    Type type = (Type) codedInputStream.g(Type.v0, extensionRegistryLite);
                                    this.y0 = type;
                                    if (builder != 0) {
                                        builder.k(type);
                                        this.y0 = builder.i();
                                    }
                                    this.Z |= 16;
                                    z2 = z4;
                                    break;
                                case 152:
                                    this.Z |= 32;
                                    this.z0 = codedInputStream.f();
                                    z2 = z4;
                                    break;
                                case 162:
                                    if ((i2 & 128) != 128) {
                                        this.n0 = new ArrayList();
                                        i2 |= 128;
                                    }
                                    this.n0.add(codedInputStream.g(Type.v0, extensionRegistryLite));
                                    z2 = z4;
                                    break;
                                case 168:
                                    if ((i2 & 256) != 256) {
                                        this.o0 = new ArrayList();
                                        i2 |= 256;
                                    }
                                    this.o0.add(Integer.valueOf(codedInputStream.f()));
                                    z2 = z4;
                                    break;
                                case 170:
                                    int iD4 = codedInputStream.d(codedInputStream.k());
                                    if ((i2 & 256) != 256 && codedInputStream.b() > 0) {
                                        this.o0 = new ArrayList();
                                        i2 |= 256;
                                    }
                                    while (codedInputStream.b() > 0) {
                                        this.o0.add(Integer.valueOf(codedInputStream.f()));
                                    }
                                    codedInputStream.c(iD4);
                                    z2 = z4;
                                    break;
                                case 176:
                                    if ((i2 & 262144) != 262144) {
                                        this.A0 = new ArrayList();
                                        i2 |= 262144;
                                    }
                                    this.A0.add(Integer.valueOf(codedInputStream.f()));
                                    z2 = z4;
                                    break;
                                case 178:
                                    int iD5 = codedInputStream.d(codedInputStream.k());
                                    if ((i2 & 262144) != 262144 && codedInputStream.b() > 0) {
                                        this.A0 = new ArrayList();
                                        i2 |= 262144;
                                    }
                                    while (codedInputStream.b() > 0) {
                                        this.A0.add(Integer.valueOf(codedInputStream.f()));
                                    }
                                    codedInputStream.c(iD5);
                                    z2 = z4;
                                    break;
                                case 186:
                                    if ((i2 & 524288) != 524288) {
                                        this.C0 = new ArrayList();
                                        i2 |= 524288;
                                    }
                                    this.C0.add(codedInputStream.g(Type.v0, extensionRegistryLite));
                                    z2 = z4;
                                    break;
                                case PsExtractor.AUDIO_STREAM /* 192 */:
                                    if ((i2 & 1048576) != 1048576) {
                                        this.D0 = new ArrayList();
                                        i2 |= 1048576;
                                    }
                                    this.D0.add(Integer.valueOf(codedInputStream.f()));
                                    z2 = z4;
                                    break;
                                case 194:
                                    int iD6 = codedInputStream.d(codedInputStream.k());
                                    if ((i2 & 1048576) != 1048576 && codedInputStream.b() > 0) {
                                        this.D0 = new ArrayList();
                                        i2 |= 1048576;
                                    }
                                    while (codedInputStream.b() > 0) {
                                        this.D0.add(Integer.valueOf(codedInputStream.f()));
                                    }
                                    codedInputStream.c(iD6);
                                    z2 = z4;
                                    break;
                                case 242:
                                    TypeTable.Builder builderG = (this.Z & 64) == 64 ? this.F0.g() : null;
                                    TypeTable typeTable = (TypeTable) codedInputStream.g(TypeTable.i0, extensionRegistryLite);
                                    this.F0 = typeTable;
                                    if (builderG != 0) {
                                        builderG.j(typeTable);
                                        this.F0 = builderG.g();
                                    }
                                    this.Z |= 64;
                                    z2 = z4;
                                    break;
                                case 248:
                                    if ((i2 & 4194304) != 4194304) {
                                        this.G0 = new ArrayList();
                                        i2 |= 4194304;
                                    }
                                    this.G0.add(Integer.valueOf(codedInputStream.f()));
                                    z2 = z4;
                                    break;
                                case 250:
                                    int iD7 = codedInputStream.d(codedInputStream.k());
                                    if ((i2 & 4194304) != 4194304 && codedInputStream.b() > 0) {
                                        this.G0 = new ArrayList();
                                        i2 |= 4194304;
                                    }
                                    while (codedInputStream.b() > 0) {
                                        this.G0.add(Integer.valueOf(codedInputStream.f()));
                                    }
                                    codedInputStream.c(iD7);
                                    z2 = z4;
                                    break;
                                case 258:
                                    try {
                                        VersionRequirementTable.Builder builderG2 = (this.Z & 128) == 128 ? this.H0.g() : null;
                                        VersionRequirementTable versionRequirementTable = (VersionRequirementTable) codedInputStream.g(VersionRequirementTable.g0, extensionRegistryLite);
                                        this.H0 = versionRequirementTable;
                                        if (builderG2 != 0) {
                                            builderG2.h(versionRequirementTable);
                                            this.H0 = builderG2.g();
                                        }
                                        this.Z |= 128;
                                        z2 = z4;
                                    } catch (InvalidProtocolBufferException e2) {
                                        e = e2;
                                        e.X = this;
                                        throw e;
                                    } catch (IOException e3) {
                                        e = e3;
                                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                                        invalidProtocolBufferException.X = this;
                                        throw invalidProtocolBufferException;
                                    } catch (Throwable th) {
                                        th = th;
                                        if ((i2 & 32) == 32) {
                                            this.j0 = Collections.unmodifiableList(this.j0);
                                        }
                                        if ((i2 & 8) == 8) {
                                            this.h0 = Collections.unmodifiableList(this.h0);
                                        }
                                        if ((i2 & 16) == 16) {
                                            this.i0 = Collections.unmodifiableList(this.i0);
                                        }
                                        if ((i2 & 64) == 64) {
                                            this.l0 = Collections.unmodifiableList(this.l0);
                                        }
                                        if ((i2 & 512) == 512) {
                                            this.q0 = Collections.unmodifiableList(this.q0);
                                        }
                                        if ((i2 & 1024) == 1024) {
                                            this.r0 = Collections.unmodifiableList(this.r0);
                                        }
                                        if ((i2 & a.f25965n) == 2048) {
                                            this.s0 = Collections.unmodifiableList(this.s0);
                                        }
                                        if ((i2 & 4096) == 4096) {
                                            this.t0 = Collections.unmodifiableList(this.t0);
                                        }
                                        if ((i2 & Segment.SIZE) == 8192) {
                                            this.u0 = Collections.unmodifiableList(this.u0);
                                        }
                                        if ((i2 & 16384) == 16384) {
                                            this.v0 = Collections.unmodifiableList(this.v0);
                                        }
                                        if ((i2 & 128) == 128) {
                                            this.n0 = Collections.unmodifiableList(this.n0);
                                        }
                                        if ((i2 & 256) == 256) {
                                            this.o0 = Collections.unmodifiableList(this.o0);
                                        }
                                        if ((i2 & 262144) == 262144) {
                                            this.A0 = Collections.unmodifiableList(this.A0);
                                        }
                                        if ((i2 & 524288) == 524288) {
                                            this.C0 = Collections.unmodifiableList(this.C0);
                                        }
                                        if ((i2 & 1048576) == 1048576) {
                                            this.D0 = Collections.unmodifiableList(this.D0);
                                        }
                                        if ((i2 & 4194304) == 4194304) {
                                            this.G0 = Collections.unmodifiableList(this.G0);
                                        }
                                        try {
                                            codedOutputStreamJ.i();
                                            break;
                                        } catch (IOException unused) {
                                        } finally {
                                            this.f44048Y = outputO.h();
                                        }
                                        m();
                                        throw th;
                                    }
                                    break;
                                default:
                                    if (!n(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iN)) {
                                        z3 = z4;
                                    }
                                    z2 = z4;
                                    break;
                            }
                        } catch (InvalidProtocolBufferException e4) {
                            e = e4;
                        } catch (IOException e5) {
                            e = e5;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    if ((i2 & 32) == 32) {
                        this.j0 = Collections.unmodifiableList(this.j0);
                    }
                    if ((i2 & 8) == 8) {
                        this.h0 = Collections.unmodifiableList(this.h0);
                    }
                    if ((i2 & 16) == 16) {
                        this.i0 = Collections.unmodifiableList(this.i0);
                    }
                    if ((i2 & 64) == 64) {
                        this.l0 = Collections.unmodifiableList(this.l0);
                    }
                    if ((i2 & 512) == 512) {
                        this.q0 = Collections.unmodifiableList(this.q0);
                    }
                    if ((i2 & 1024) == 1024) {
                        this.r0 = Collections.unmodifiableList(this.r0);
                    }
                    if ((i2 & a.f25965n) == 2048) {
                        this.s0 = Collections.unmodifiableList(this.s0);
                    }
                    if ((i2 & 4096) == 4096) {
                        this.t0 = Collections.unmodifiableList(this.t0);
                    }
                    if ((i2 & Segment.SIZE) == 8192) {
                        this.u0 = Collections.unmodifiableList(this.u0);
                    }
                    if ((i2 & 16384) == 16384) {
                        this.v0 = Collections.unmodifiableList(this.v0);
                    }
                    if ((i2 & 128) == 128) {
                        this.n0 = Collections.unmodifiableList(this.n0);
                    }
                    if ((i2 & 256) == 256) {
                        this.o0 = Collections.unmodifiableList(this.o0);
                    }
                    if ((i2 & 262144) == 262144) {
                        this.A0 = Collections.unmodifiableList(this.A0);
                    }
                    if ((i2 & 524288) == 524288) {
                        this.C0 = Collections.unmodifiableList(this.C0);
                    }
                    if ((i2 & 1048576) == 1048576) {
                        this.D0 = Collections.unmodifiableList(this.D0);
                    }
                    if ((i2 & 4194304) == 4194304) {
                        this.G0 = Collections.unmodifiableList(this.G0);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused2) {
                    } finally {
                        this.f44048Y = outputO.h();
                    }
                    m();
                    return;
                }
            }
        }
    }
}
