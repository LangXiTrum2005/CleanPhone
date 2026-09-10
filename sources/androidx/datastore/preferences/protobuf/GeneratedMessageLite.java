package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected UnknownFieldSetLite unknownFields;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4849a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f4849a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4849a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite.Builder<MessageType, BuilderType> {
        public final GeneratedMessageLite X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public GeneratedMessageLite f4850Y;

        public Builder(GeneratedMessageLite generatedMessageLite) {
            this.X = generatedMessageLite;
            if (generatedMessageLite.m()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f4850Y = generatedMessageLite.p();
        }

        public static void l(Object obj, Object obj2) {
            Protobuf.f4904c.b(obj).mergeFrom(obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        public final Object clone() {
            Builder builder = (Builder) this.X.h(MethodToInvoke.f0, null);
            builder.f4850Y = buildPartial();
            return builder;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: e */
        public final Builder clone() {
            Builder builder = (Builder) this.X.h(MethodToInvoke.f0, null);
            builder.f4850Y = buildPartial();
            return builder;
        }

        public final GeneratedMessageLite f() {
            GeneratedMessageLite generatedMessageLiteBuildPartial = buildPartial();
            generatedMessageLiteBuildPartial.getClass();
            if (GeneratedMessageLite.l(generatedMessageLiteBuildPartial, true)) {
                return generatedMessageLiteBuildPartial;
            }
            throw new UninitializedMessageException();
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public GeneratedMessageLite buildPartial() {
            if (!this.f4850Y.m()) {
                return this.f4850Y;
            }
            GeneratedMessageLite generatedMessageLite = this.f4850Y;
            generatedMessageLite.getClass();
            Protobuf protobuf = Protobuf.f4904c;
            protobuf.getClass();
            protobuf.a(generatedMessageLite.getClass()).makeImmutable(generatedMessageLite);
            generatedMessageLite.n();
            return this.f4850Y;
        }

        public final void i() {
            if (this.f4850Y.m()) {
                return;
            }
            j();
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return GeneratedMessageLite.l(this.f4850Y, false);
        }

        public void j() {
            GeneratedMessageLite generatedMessageLiteP = this.X.p();
            l(generatedMessageLiteP, this.f4850Y);
            this.f4850Y = generatedMessageLiteP;
        }

        public final void k(GeneratedMessageLite generatedMessageLite) {
            if (this.X.equals(generatedMessageLite)) {
                return;
            }
            i();
            l(this.f4850Y, generatedMessageLite);
        }
    }

    public static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder
        public final void j() {
            super.j();
            GeneratedMessageLite generatedMessageLite = this.f4850Y;
            if (((ExtendableMessage) generatedMessageLite).extensions != FieldSet.d) {
                ((ExtendableMessage) generatedMessageLite).extensions = ((ExtendableMessage) generatedMessageLite).extensions.clone();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final ExtendableMessage buildPartial() {
            if (!((ExtendableMessage) this.f4850Y).m()) {
                return (ExtendableMessage) this.f4850Y;
            }
            ((ExtendableMessage) this.f4850Y).extensions.j();
            return (ExtendableMessage) super.buildPartial();
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected FieldSet<ExtensionDescriptor> extensions = FieldSet.d;

        public class ExtensionWriter {
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite b() {
            return (GeneratedMessageLite) h(MethodToInvoke.g0, null);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLite
        public final Builder newBuilderForType() {
            return (Builder) h(MethodToInvoke.f0, null);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLite
        public final Builder toBuilder() {
            Builder builder = (Builder) h(MethodToInvoke.f0, null);
            builder.k(this);
            return builder;
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends MessageLiteOrBuilder {
    }

    public static final class ExtensionDescriptor implements FieldSet.FieldDescriptorLite<ExtensionDescriptor> {
        public final WireFormat.FieldType X;

        public ExtensionDescriptor(WireFormat.FieldType fieldType) {
            this.X = fieldType;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final Builder c(MessageLite.Builder builder, MessageLite messageLite) {
            Builder builder2 = (Builder) builder;
            builder2.k((GeneratedMessageLite) messageLite);
            return builder2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((ExtensionDescriptor) obj).getClass();
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.JavaType getLiteJavaType() {
            return this.X.X;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.FieldType getLiteType() {
            return this.X;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final int getNumber() {
            return 1001;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final boolean isPacked() {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final boolean isRepeated() {
            return false;
        }
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JavaFeaturesProto.JavaFeatures f4851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExtensionDescriptor f4852b;

        public GeneratedExtension(DescriptorProtos.FeatureSet featureSet, JavaFeaturesProto.JavaFeatures javaFeatures, JavaFeaturesProto.JavaFeatures javaFeatures2, ExtensionDescriptor extensionDescriptor) {
            if (featureSet == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (extensionDescriptor.X == WireFormat.FieldType.n0 && javaFeatures2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f4851a = javaFeatures2;
            this.f4852b = extensionDescriptor;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MethodToInvoke {
        public static final MethodToInvoke X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final MethodToInvoke f4853Y;
        public static final MethodToInvoke Z;
        public static final MethodToInvoke e0;
        public static final MethodToInvoke f0;
        public static final MethodToInvoke g0;
        public static final /* synthetic */ MethodToInvoke[] h0;

        static {
            MethodToInvoke methodToInvoke = new MethodToInvoke("GET_MEMOIZED_IS_INITIALIZED", 0);
            X = methodToInvoke;
            MethodToInvoke methodToInvoke2 = new MethodToInvoke("SET_MEMOIZED_IS_INITIALIZED", 1);
            f4853Y = methodToInvoke2;
            MethodToInvoke methodToInvoke3 = new MethodToInvoke("BUILD_MESSAGE_INFO", 2);
            Z = methodToInvoke3;
            MethodToInvoke methodToInvoke4 = new MethodToInvoke("NEW_MUTABLE_INSTANCE", 3);
            e0 = methodToInvoke4;
            MethodToInvoke methodToInvoke5 = new MethodToInvoke("NEW_BUILDER", 4);
            f0 = methodToInvoke5;
            MethodToInvoke methodToInvoke6 = new MethodToInvoke("GET_DEFAULT_INSTANCE", 5);
            g0 = methodToInvoke6;
            h0 = new MethodToInvoke[]{methodToInvoke, methodToInvoke2, methodToInvoke3, methodToInvoke4, methodToInvoke5, methodToInvoke6, new MethodToInvoke("GET_PARSER", 6)};
        }

        public static MethodToInvoke valueOf(String str) {
            return (MethodToInvoke) java.lang.Enum.valueOf(MethodToInvoke.class, str);
        }

        public static MethodToInvoke[] values() {
            return (MethodToInvoke[]) h0.clone();
        }
    }

    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;

        public Object readResolve() throws ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = Class.forName(null).getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                ((MessageLite) declaredField.get(null)).newBuilderForType().getClass();
                throw null;
            } catch (InvalidProtocolBufferException e2) {
                throw new RuntimeException("Unable to understand proto buffer", e2);
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException("Unable to find proto buffer class: null", e3);
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("Unable to call parsePartialFrom", e4);
            } catch (NoSuchFieldException e5) {
                throw new RuntimeException("Unable to find DEFAULT_INSTANCE in null", e5);
            } catch (SecurityException e6) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in null", e6);
            }
        }
    }

    public GeneratedMessageLite() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = UnknownFieldSetLite.f;
    }

    public static Internal.ProtobufList i() {
        return ProtobufArrayList.e0;
    }

    public static GeneratedMessageLite j(Class cls) {
        GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (generatedMessageLite != null) {
            return generatedMessageLite;
        }
        GeneratedMessageLite<?, ?> generatedMessageLite2 = (GeneratedMessageLite) ((GeneratedMessageLite) UnsafeUtil.c(cls)).h(MethodToInvoke.g0, null);
        if (generatedMessageLite2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, generatedMessageLite2);
        return generatedMessageLite2;
    }

    public static Object k(java.lang.reflect.Method method, MessageLite messageLite, Object... objArr) {
        try {
            return method.invoke(messageLite, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean l(GeneratedMessageLite generatedMessageLite, boolean z2) {
        byte bByteValue = ((Byte) generatedMessageLite.h(MethodToInvoke.X, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        Protobuf protobuf = Protobuf.f4904c;
        protobuf.getClass();
        boolean zIsInitialized = protobuf.a(generatedMessageLite.getClass()).isInitialized(generatedMessageLite);
        if (z2) {
            generatedMessageLite.h(MethodToInvoke.f4853Y, zIsInitialized ? generatedMessageLite : null);
        }
        return zIsInitialized;
    }

    public static Object o(GeneratedMessageLite generatedMessageLite, String str, Object[] objArr) {
        return new RawMessageInfo(generatedMessageLite, str, objArr);
    }

    public static GeneratedMessageLite q(GeneratedMessageLite generatedMessageLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLiteP = generatedMessageLite.p();
        try {
            Schema schemaB = Protobuf.f4904c.b(generatedMessageLiteP);
            CodedInputStreamReader codedInputStreamReader = codedInputStream.f4753b;
            if (codedInputStreamReader == null) {
                codedInputStreamReader = new CodedInputStreamReader(codedInputStream);
            }
            schemaB.a(generatedMessageLiteP, codedInputStreamReader, extensionRegistryLite);
            schemaB.makeImmutable(generatedMessageLiteP);
            return generatedMessageLiteP;
        } catch (InvalidProtocolBufferException e2) {
            if (e2.X) {
                throw new InvalidProtocolBufferException(e2.getMessage(), e2);
            }
            throw e2;
        } catch (UninitializedMessageException e3) {
            throw new InvalidProtocolBufferException(e3.getMessage());
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4.getMessage(), e4);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e5.getCause());
            }
            throw e5;
        }
    }

    public static void r(Class cls, GeneratedMessageLite generatedMessageLite) {
        generatedMessageLite.n();
        defaultInstanceMap.put(cls, generatedMessageLite);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public GeneratedMessageLite b() {
        return (GeneratedMessageLite) h(MethodToInvoke.g0, null);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final void c(CodedOutputStream codedOutputStream) {
        Protobuf protobuf = Protobuf.f4904c;
        protobuf.getClass();
        Schema schemaA = protobuf.a(getClass());
        CodedOutputStreamWriter codedOutputStreamWriter = codedOutputStream.f4777a;
        if (codedOutputStreamWriter == null) {
            codedOutputStreamWriter = new CodedOutputStreamWriter(codedOutputStream);
        }
        schemaA.d(this, codedOutputStreamWriter);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    public final int d() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    public final int e(Schema schema) {
        int iB;
        int iB2;
        if (m()) {
            if (schema == null) {
                Protobuf protobuf = Protobuf.f4904c;
                protobuf.getClass();
                iB2 = protobuf.a(getClass()).b(this);
            } else {
                iB2 = schema.b(this);
            }
            if (iB2 >= 0) {
                return iB2;
            }
            throw new IllegalStateException(android.support.v4.media.a.h(iB2, "serialized size must be non-negative, was "));
        }
        if (d() != Integer.MAX_VALUE) {
            return d();
        }
        if (schema == null) {
            Protobuf protobuf2 = Protobuf.f4904c;
            protobuf2.getClass();
            iB = protobuf2.a(getClass()).b(this);
        } else {
            iB = schema.b(this);
        }
        f(iB);
        return iB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Protobuf protobuf = Protobuf.f4904c;
        protobuf.getClass();
        return protobuf.a(getClass()).e(this, (GeneratedMessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    public final void f(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException(android.support.v4.media.a.h(i2, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i2 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final int getSerializedSize() {
        return e(null);
    }

    public abstract Object h(MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite);

    public final int hashCode() {
        if (m()) {
            Protobuf protobuf = Protobuf.f4904c;
            protobuf.getClass();
            return protobuf.a(getClass()).c(this);
        }
        if (this.memoizedHashCode == 0) {
            Protobuf protobuf2 = Protobuf.f4904c;
            protobuf2.getClass();
            this.memoizedHashCode = protobuf2.a(getClass()).c(this);
        }
        return this.memoizedHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return l(this, true);
    }

    public final boolean m() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void n() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public Builder newBuilderForType() {
        return (Builder) h(MethodToInvoke.f0, null);
    }

    public final GeneratedMessageLite p() {
        return (GeneratedMessageLite) h(MethodToInvoke.e0, null);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public Builder toBuilder() {
        Builder builder = (Builder) h(MethodToInvoke.f0, null);
        builder.k(this);
        return builder;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = MessageLiteToString.f4883a;
        StringBuilder sbX = android.support.v4.media.a.x("# ", string);
        MessageLiteToString.c(this, sbX, 0);
        return sbX.toString();
    }
}
