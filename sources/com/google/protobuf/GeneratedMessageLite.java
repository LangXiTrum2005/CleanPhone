package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected UnknownFieldSetLite unknownFields = UnknownFieldSetLite.getDefaultInstance();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite.Builder<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        protected MessageType instance;

        public Builder(MessageType messagetype) {
            this.defaultInstance = messagetype;
            if (messagetype.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = (MessageType) newMutableInstance();
        }

        private static <MessageType> void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
            p3 p3Var = p3.f24916c;
            p3Var.getClass();
            p3Var.a(messagetype.getClass()).a(messagetype, messagetype2);
        }

        private MessageType newMutableInstance() {
            return (MessageType) this.defaultInstance.newMutableInstance();
        }

        public final void copyOnWrite() {
            if (this.instance.isMutable()) {
                return;
            }
            copyOnWriteInternal();
        }

        public void copyOnWriteInternal() {
            MessageType messagetype = (MessageType) newMutableInstance();
            mergeFromInstance(messagetype, this.instance);
            this.instance = messagetype;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw AbstractMessageLite.Builder.newUninitializedMessageException(messagetype);
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public MessageType buildPartial() {
            if (!this.instance.isMutable()) {
                return this.instance;
            }
            this.instance.makeImmutable();
            return this.instance;
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public final BuilderType clear() {
            if (this.defaultInstance.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = (MessageType) newMutableInstance();
            return this;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder
        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder
        public BuilderType internalMergeFrom(MessageType messagetype) {
            return (BuilderType) mergeFrom((GeneratedMessageLite) messagetype);
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public BuilderType mo171clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.instance = (MessageType) buildPartial();
            return buildertype;
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            if (getDefaultInstanceForType().equals(messagetype)) {
                return this;
            }
            copyOnWrite();
            mergeFromInstance(this.instance, messagetype);
            return this;
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            copyOnWrite();
            try {
                p3 p3Var = p3.f24916c;
                MessageType messagetype = this.instance;
                p3Var.getClass();
                p3Var.a(messagetype.getClass()).h(this.instance, bArr, i10, i10 + i11, new g(extensionRegistryLite));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            return (BuilderType) mergeFrom(bArr, i10, i11, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            copyOnWrite();
            try {
                p3 p3Var = p3.f24916c;
                MessageType messagetype = this.instance;
                p3Var.getClass();
                x3 x3VarA = p3Var.a(messagetype.getClass());
                MessageType messagetype2 = this.instance;
                b0 b0Var = codedInputStream.wrapper;
                if (b0Var == null) {
                    b0Var = new b0(codedInputStream);
                }
                x3VarA.g(messagetype2, b0Var, extensionRegistryLite);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        public ExtendableBuilder(MessageType messagetype) {
            super(messagetype);
        }

        private v1 ensureExtensionsAreMutable() {
            v1 v1Var = ((ExtendableMessage) this.instance).extensions;
            if (!v1Var.f24966b) {
                return v1Var;
            }
            v1 v1VarB = v1Var.clone();
            ((ExtendableMessage) this.instance).extensions = v1VarB;
            return v1VarB;
        }

        private void verifyExtensionContainingType(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public final <Type> BuilderType addExtension(ExtensionLite<MessageType, List<Type>> extensionLite, Type type) {
            GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().a(generatedExtensionCheckIsLite.descriptor, generatedExtensionCheckIsLite.singularToFieldSetType(type));
            return this;
        }

        public final BuilderType clearExtension(ExtensionLite<MessageType, ?> extensionLite) {
            GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            copyOnWrite();
            v1 v1VarEnsureExtensionsAreMutable = ensureExtensionsAreMutable();
            c2 c2Var = generatedExtensionCheckIsLite.descriptor;
            z3 z3Var = v1VarEnsureExtensionsAreMutable.f24965a;
            z3Var.remove(c2Var);
            if (z3Var.isEmpty()) {
                v1VarEnsureExtensionsAreMutable.f24967c = false;
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.Builder
        public void copyOnWriteInternal() {
            super.copyOnWriteInternal();
            MessageType messagetype = this.instance;
            if (((ExtendableMessage) messagetype).extensions != v1.f24964d) {
                ((ExtendableMessage) messagetype).extensions = ((ExtendableMessage) messagetype).extensions.clone();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite) {
            return (Type) ((ExtendableMessage) this.instance).getExtension(extensionLite);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite) {
            return ((ExtendableMessage) this.instance).getExtensionCount(extensionLite);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite) {
            return ((ExtendableMessage) this.instance).hasExtension(extensionLite);
        }

        public void internalSetExtensionSet(v1 v1Var) {
            copyOnWrite();
            ((ExtendableMessage) this.instance).extensions = v1Var;
        }

        public final <Type> BuilderType setExtension(ExtensionLite<MessageType, Type> extensionLite, Type type) {
            GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().p(generatedExtensionCheckIsLite.descriptor, generatedExtensionCheckIsLite.toFieldSetType(type));
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i10) {
            return (Type) ((ExtendableMessage) this.instance).getExtension(extensionLite, i10);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public final MessageType buildPartial() {
            if (!((ExtendableMessage) this.instance).isMutable()) {
                return (MessageType) this.instance;
            }
            ((ExtendableMessage) this.instance).extensions.m();
            return (MessageType) super.buildPartial();
        }

        public final <Type> BuilderType setExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i10, Type type) {
            GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            copyOnWrite();
            v1 v1VarEnsureExtensionsAreMutable = ensureExtensionsAreMutable();
            c2 c2Var = generatedExtensionCheckIsLite.descriptor;
            Object objSingularToFieldSetType = generatedExtensionCheckIsLite.singularToFieldSetType(type);
            v1VarEnsureExtensionsAreMutable.getClass();
            if (c2Var.f24786d) {
                Object objF = v1VarEnsureExtensionsAreMutable.f(c2Var);
                if (objF != null) {
                    v1.q(c2Var, objSingularToFieldSetType);
                    ((List) objF).set(i10, objSingularToFieldSetType);
                    return this;
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends MessageLiteOrBuilder {
        <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite);

        <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i10);

        <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite);

        <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class GeneratedExtension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {
        final ContainingType containingTypeDefaultInstance;
        final Type defaultValue;
        final c2 descriptor;
        final MessageLite messageDefaultInstance;

        public GeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, c2 c2Var, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (c2Var.f24785c == WireFormat.FieldType.MESSAGE && messageLite == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.containingTypeDefaultInstance = containingtype;
            this.defaultValue = type;
            this.messageDefaultInstance = messageLite;
            this.descriptor = c2Var;
        }

        public Object fromFieldSetType(Object obj) {
            c2 c2Var = this.descriptor;
            if (!c2Var.f24786d) {
                return singularFromFieldSetType(obj);
            }
            if (c2Var.f24785c.getJavaType() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(singularFromFieldSetType(it.next()));
            }
            return arrayList;
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.containingTypeDefaultInstance;
        }

        @Override // com.google.protobuf.ExtensionLite
        public Type getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.google.protobuf.ExtensionLite
        public WireFormat.FieldType getLiteType() {
            return this.descriptor.f24785c;
        }

        @Override // com.google.protobuf.ExtensionLite
        public MessageLite getMessageDefaultInstance() {
            return this.messageDefaultInstance;
        }

        @Override // com.google.protobuf.ExtensionLite
        public int getNumber() {
            return this.descriptor.f24784b;
        }

        @Override // com.google.protobuf.ExtensionLite
        public boolean isRepeated() {
            return this.descriptor.f24786d;
        }

        public Object singularFromFieldSetType(Object obj) {
            return this.descriptor.f24785c.getJavaType() == WireFormat.JavaType.ENUM ? this.descriptor.f24783a.findValueByNumber(((Integer) obj).intValue()) : obj;
        }

        public Object singularToFieldSetType(Object obj) {
            return this.descriptor.f24785c.getJavaType() == WireFormat.JavaType.ENUM ? Integer.valueOf(((Internal.EnumLite) obj).getNumber()) : obj;
        }

        public Object toFieldSetType(Object obj) {
            c2 c2Var = this.descriptor;
            if (!c2Var.f24786d) {
                return singularToFieldSetType(obj);
            }
            if (c2Var.f24785c.getJavaType() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(singularToFieldSetType(it.next()));
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final Class<?> messageClass;
        private final String messageClassName;

        public SerializedForm(MessageLite messageLite) {
            this.messageClass = messageLite.getClass();
            this.messageClassName = messageLite.getClass().getName();
            this.asBytes = messageLite.toByteArray();
        }

        public static SerializedForm of(MessageLite messageLite) {
            return new SerializedForm(messageLite);
        }

        @Deprecated
        private Object readResolveFallback() throws ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = resolveMessageClass().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (InvalidProtocolBufferException e10) {
                throw new RuntimeException("Unable to understand proto buffer", e10);
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Unable to call parsePartialFrom", e12);
            } catch (NoSuchFieldException e13) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.messageClassName, e13);
            } catch (SecurityException e14) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.messageClassName, e14);
            }
        }

        private Class<?> resolveMessageClass() throws ClassNotFoundException {
            Class<?> cls = this.messageClass;
            return cls != null ? cls : Class.forName(this.messageClassName);
        }

        public Object readResolve() throws ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = resolveMessageClass().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (InvalidProtocolBufferException e10) {
                throw new RuntimeException("Unable to understand proto buffer", e10);
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Unable to call parsePartialFrom", e12);
            } catch (NoSuchFieldException unused) {
                return readResolveFallback();
            } catch (SecurityException e13) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.messageClassName, e13);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>, T> GeneratedExtension<MessageType, T> checkIsLite(ExtensionLite<MessageType, T> extensionLite) {
        if (extensionLite.isLite()) {
            return (GeneratedExtension) extensionLite;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t10) throws InvalidProtocolBufferException {
        if (t10 == null || t10.isInitialized()) {
            return t10;
        }
        throw t10.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(t10);
    }

    private int computeSerializedSize(x3 x3Var) {
        if (x3Var != null) {
            return x3Var.f(this);
        }
        p3 p3Var = p3.f24916c;
        p3Var.getClass();
        return p3Var.a(getClass()).f(this);
    }

    public static Internal.BooleanList emptyBooleanList() {
        return j.f24863c;
    }

    public static Internal.DoubleList emptyDoubleList() {
        return z0.f25054c;
    }

    public static Internal.FloatList emptyFloatList() {
        return y1.f25036c;
    }

    public static Internal.IntList emptyIntList() {
        return f2.f24831c;
    }

    public static Internal.LongList emptyLongList() {
        return r2.f24929c;
    }

    public static <E> Internal.ProtobufList<E> emptyProtobufList() {
        return q3.f24923c;
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == UnknownFieldSetLite.getDefaultInstance()) {
            this.unknownFields = UnknownFieldSetLite.newInstance();
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> T getDefaultInstance(Class<T> cls) {
        T t10 = (T) defaultInstanceMap.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) ((GeneratedMessageLite) x4.c(cls)).getDefaultInstanceForType();
        if (t11 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t11);
        return t11;
    }

    public static java.lang.reflect.Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e10);
        }
    }

    public static Object invokeOrDie(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$IntList] */
    public static Internal.IntList mutableCopy(Internal.IntList intList) {
        int size = intList.size();
        return intList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static Object newMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        return new r3(messageLite, str, objArr);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i10, WireFormat.FieldType fieldType, boolean z10, Class cls) {
        return new GeneratedExtension<>(containingtype, Collections.EMPTY_LIST, messageLite, new c2(enumLiteMap, i10, fieldType, true, z10), cls);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i10, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension<>(containingtype, type, messageLite, new c2(enumLiteMap, i10, fieldType, false, false), cls);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t10, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t10, inputStream, ExtensionRegistryLite.getEmptyRegistry()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parseFrom(t10, CodedInputStream.newInstance(byteBuffer), extensionRegistryLite));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t10, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(new a(inputStream, CodedInputStream.readRawVarint32(i10, inputStream)));
            T t11 = (T) parsePartialFrom(t10, codedInputStreamNewInstance, extensionRegistryLite);
            try {
                codedInputStreamNewInstance.checkLastTagWas(0);
                return t11;
            } catch (InvalidProtocolBufferException e10) {
                throw e10.setUnfinishedMessage(t11);
            }
        } catch (InvalidProtocolBufferException e11) {
            if (e11.getThrownFromInputStream()) {
                throw new InvalidProtocolBufferException((IOException) e11);
            }
            throw e11;
        } catch (IOException e12) {
            throw new InvalidProtocolBufferException(e12);
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t10, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t11 = (T) t10.newMutableInstance();
        try {
            p3 p3Var = p3.f24916c;
            p3Var.getClass();
            x3 x3VarA = p3Var.a(t11.getClass());
            b0 b0Var = codedInputStream.wrapper;
            if (b0Var == null) {
                b0Var = new b0(codedInputStream);
            }
            x3VarA.g(t11, b0Var, extensionRegistryLite);
            x3VarA.b(t11);
            return t11;
        } catch (InvalidProtocolBufferException e10) {
            e = e10;
            if (e.getThrownFromInputStream()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.setUnfinishedMessage(t11);
        } catch (UninitializedMessageException e11) {
            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(t11);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw e13;
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> cls, T t10) {
        t10.markImmutable();
        defaultInstanceMap.put(cls, t10);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        p3 p3Var = p3.f24916c;
        p3Var.getClass();
        return p3Var.a(getClass()).i(this);
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj) {
        return dynamicMethod(methodToInvoke, obj, null);
    }

    public abstract Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p3 p3Var = p3.f24916c;
        p3Var.getClass();
        return p3Var.a(getClass()).j(this, (GeneratedMessageLite) obj);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.AbstractMessageLite
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.MessageLite
    public final Parser<MessageType> getParserForType() {
        return (Parser) dynamicMethod(MethodToInvoke.GET_PARSER);
    }

    @Override // com.google.protobuf.AbstractMessageLite
    public int getSerializedSize(x3 x3Var) {
        if (isMutable()) {
            int iComputeSerializedSize = computeSerializedSize(x3Var);
            if (iComputeSerializedSize >= 0) {
                return iComputeSerializedSize;
            }
            throw new IllegalStateException(l1.d.e(iComputeSerializedSize, "serialized size must be non-negative, was "));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int iComputeSerializedSize2 = computeSerializedSize(x3Var);
        setMemoizedSerializedSize(iComputeSerializedSize2);
        return iComputeSerializedSize2;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public void makeImmutable() {
        p3 p3Var = p3.f24916c;
        p3Var.getClass();
        p3Var.a(getClass()).b(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i10, ByteString byteString) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeLengthDelimitedField(i10, byteString);
    }

    public final void mergeUnknownFields(UnknownFieldSetLite unknownFieldSetLite) {
        this.unknownFields = UnknownFieldSetLite.mutableCopyOf(this.unknownFields, unknownFieldSetLite);
    }

    public void mergeVarintField(int i10, int i11) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeVarintField(i10, i11);
    }

    public MessageType newMutableInstance() {
        return (MessageType) dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    public boolean parseUnknownField(int i10, CodedInputStream codedInputStream) throws IOException {
        if (WireFormat.getTagWireType(i10) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mergeFieldFrom(i10, codedInputStream);
    }

    public void setMemoizedHashCode(int i10) {
        this.memoizedHashCode = i10;
    }

    @Override // com.google.protobuf.AbstractMessageLite
    public void setMemoizedSerializedSize(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(l1.d.e(i10, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = b3.f24777a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        b3.c(this, sb2, 0);
        return sb2.toString();
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        p3 p3Var = p3.f24916c;
        p3Var.getClass();
        x3 x3VarA = p3Var.a(getClass());
        l0 l0Var = codedOutputStream.wrapper;
        if (l0Var == null) {
            l0Var = new l0(codedOutputStream);
        }
        x3VarA.e(this, l0Var);
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.dynamicMethod(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        p3 p3Var = p3.f24916c;
        p3Var.getClass();
        boolean zC = p3Var.a(t10.getClass()).c(t10);
        if (z10) {
            t10.dynamicMethod(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, zC ? t10 : null);
        }
        return zC;
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((GeneratedMessageLite) messagetype);
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke) {
        return dynamicMethod(methodToInvoke, null, null);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.MessageLite
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    @Override // com.google.protobuf.MessageLite
    public final BuilderType toBuilder() {
        return (BuilderType) ((Builder) dynamicMethod(MethodToInvoke.NEW_BUILDER)).mergeFrom(this);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {
        private final T defaultInstance;

        public DefaultInstanceBasedParser(T t10) {
            this.defaultInstance = t10;
        }

        @Override // com.google.protobuf.Parser
        public T parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.parsePartialFrom(this.defaultInstance, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public T parsePartialFrom(byte[] bArr, int i10, int i11, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.parsePartialFrom(this.defaultInstance, bArr, i10, i11, extensionRegistryLite);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$LongList] */
    public static Internal.LongList mutableCopy(Internal.LongList longList) {
        int size = longList.size();
        return longList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (T) parseFrom(t10, byteBuffer, ExtensionRegistryLite.getEmptyRegistry());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t10, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t10, inputStream, extensionRegistryLite));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, ByteString byteString) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parseFrom(t10, byteString, ExtensionRegistryLite.getEmptyRegistry()));
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected v1 extensions = v1.f24964d;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class ExtensionWriter {
            private final Iterator<Map.Entry<c2, Object>> iter;
            private final boolean messageSetWireFormat;
            private Map.Entry<c2, Object> next;

            public /* synthetic */ ExtensionWriter(ExtendableMessage extendableMessage, boolean z10, b2 b2Var) {
                this(z10);
            }

            public void writeUntil(int i10, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<c2, Object> entry = this.next;
                    if (entry == null || entry.getKey().f24784b >= i10) {
                        return;
                    }
                    c2 key = this.next.getKey();
                    if (this.messageSetWireFormat && key.f24785c.getJavaType() == WireFormat.JavaType.MESSAGE && !key.f24786d) {
                        codedOutputStream.writeMessageSetExtension(key.f24784b, (MessageLite) this.next.getValue());
                    } else {
                        Object value = this.next.getValue();
                        v1 v1Var = v1.f24964d;
                        WireFormat.FieldType fieldType = key.f24785c;
                        int i11 = key.f24784b;
                        if (key.f24786d) {
                            List list = (List) value;
                            if (!key.f24787e) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    v1.r(codedOutputStream, fieldType, i11, it.next());
                                }
                            } else if (!list.isEmpty()) {
                                codedOutputStream.writeTag(i11, 2);
                                Iterator it2 = list.iterator();
                                int iD = 0;
                                while (it2.hasNext()) {
                                    iD += v1.d(fieldType, it2.next());
                                }
                                codedOutputStream.writeUInt32NoTag(iD);
                                Iterator it3 = list.iterator();
                                while (it3.hasNext()) {
                                    v1.s(codedOutputStream, fieldType, it3.next());
                                }
                            }
                        } else if (value instanceof LazyField) {
                            v1.r(codedOutputStream, fieldType, i11, ((LazyField) value).getValue());
                        } else {
                            v1.r(codedOutputStream, fieldType, i11, value);
                        }
                    }
                    if (this.iter.hasNext()) {
                        this.next = this.iter.next();
                    } else {
                        this.next = null;
                    }
                }
            }

            private ExtensionWriter(boolean z10) {
                Iterator<Map.Entry<c2, Object>> itL = ExtendableMessage.this.extensions.l();
                this.iter = itL;
                if (itL.hasNext()) {
                    this.next = itL.next();
                }
                this.messageSetWireFormat = z10;
            }
        }

        private void eagerlyMergeMessageSetExtension(CodedInputStream codedInputStream, GeneratedExtension<?, ?> generatedExtension, ExtensionRegistryLite extensionRegistryLite, int i10) throws IOException {
            parseExtension(codedInputStream, extensionRegistryLite, generatedExtension, WireFormat.makeTag(i10, 2), i10);
        }

        private void mergeMessageSetExtensionFromBytes(ByteString byteString, ExtensionRegistryLite extensionRegistryLite, GeneratedExtension<?, ?> generatedExtension) throws IOException {
            MessageLite messageLite = (MessageLite) this.extensions.f(generatedExtension.descriptor);
            MessageLite.Builder builder = messageLite != null ? messageLite.toBuilder() : null;
            if (builder == null) {
                builder = generatedExtension.getMessageDefaultInstance().newBuilderForType();
            }
            builder.mergeFrom(byteString, extensionRegistryLite);
            ensureExtensionsAreMutable().p(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(builder.build()));
        }

        private <MessageType extends MessageLite> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int uInt32 = 0;
            ByteString bytes = null;
            GeneratedExtension<?, ?> generatedExtensionFindLiteExtensionByNumber = null;
            while (true) {
                int tag = codedInputStream.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                    uInt32 = codedInputStream.readUInt32();
                    if (uInt32 != 0) {
                        generatedExtensionFindLiteExtensionByNumber = extensionRegistryLite.findLiteExtensionByNumber(messagetype, uInt32);
                    }
                } else if (tag == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                    if (uInt32 == 0 || generatedExtensionFindLiteExtensionByNumber == null) {
                        bytes = codedInputStream.readBytes();
                    } else {
                        eagerlyMergeMessageSetExtension(codedInputStream, generatedExtensionFindLiteExtensionByNumber, extensionRegistryLite, uInt32);
                        bytes = null;
                    }
                } else if (!codedInputStream.skipField(tag)) {
                    break;
                }
            }
            codedInputStream.checkLastTagWas(WireFormat.MESSAGE_SET_ITEM_END_TAG);
            if (bytes == null || uInt32 == 0) {
                return;
            }
            if (generatedExtensionFindLiteExtensionByNumber != null) {
                mergeMessageSetExtensionFromBytes(bytes, extensionRegistryLite, generatedExtensionFindLiteExtensionByNumber);
            } else {
                mergeLengthDelimitedField(uInt32, bytes);
            }
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0009  */
        private boolean parseExtension(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, GeneratedExtension<?, ?> generatedExtension, int i10, int i11) throws IOException {
            boolean z10;
            Object objBuild;
            MessageLite messageLite;
            int tagWireType = WireFormat.getTagWireType(i10);
            boolean z11 = false;
            if (generatedExtension == null) {
                z10 = false;
                z11 = true;
            } else {
                WireFormat.FieldType fieldType = generatedExtension.descriptor.f24785c;
                v1 v1Var = v1.f24964d;
                if (tagWireType == fieldType.getWireType()) {
                    z10 = false;
                } else {
                    c2 c2Var = generatedExtension.descriptor;
                    if (c2Var.f24786d && c2Var.f24785c.isPackable()) {
                        WireFormat.FieldType fieldType2 = generatedExtension.descriptor.f24785c;
                        if (tagWireType == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                            z11 = true;
                        }
                    } else {
                        z10 = false;
                        z11 = true;
                    }
                }
            }
            if (z11) {
                return parseUnknownField(i10, codedInputStream);
            }
            ensureExtensionsAreMutable();
            h5 h5Var = k5.f24887a;
            if (z10) {
                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                if (generatedExtension.descriptor.f24785c == WireFormat.FieldType.ENUM) {
                    while (codedInputStream.getBytesUntilLimit() > 0) {
                        Internal.EnumLite enumLiteFindValueByNumber = generatedExtension.descriptor.f24783a.findValueByNumber(codedInputStream.readEnum());
                        if (enumLiteFindValueByNumber == null) {
                            return true;
                        }
                        this.extensions.a(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(enumLiteFindValueByNumber));
                    }
                } else {
                    while (codedInputStream.getBytesUntilLimit() > 0) {
                        WireFormat.FieldType fieldType3 = generatedExtension.descriptor.f24785c;
                        v1 v1Var2 = v1.f24964d;
                        this.extensions.a(generatedExtension.descriptor, WireFormat.readPrimitiveField(codedInputStream, fieldType3, h5Var));
                    }
                }
                codedInputStream.popLimit(iPushLimit);
                return true;
            }
            int i12 = b2.f24776a[generatedExtension.descriptor.f24785c.getJavaType().ordinal()];
            if (i12 == 1) {
                c2 c2Var2 = generatedExtension.descriptor;
                MessageLite.Builder builder = (c2Var2.f24786d || (messageLite = (MessageLite) this.extensions.f(c2Var2)) == null) ? null : messageLite.toBuilder();
                if (builder == null) {
                    builder = generatedExtension.getMessageDefaultInstance().newBuilderForType();
                }
                if (generatedExtension.descriptor.f24785c == WireFormat.FieldType.GROUP) {
                    codedInputStream.readGroup(generatedExtension.getNumber(), builder, extensionRegistryLite);
                } else {
                    codedInputStream.readMessage(builder, extensionRegistryLite);
                }
                objBuild = builder.build();
            } else if (i12 != 2) {
                WireFormat.FieldType fieldType4 = generatedExtension.descriptor.f24785c;
                v1 v1Var3 = v1.f24964d;
                objBuild = WireFormat.readPrimitiveField(codedInputStream, fieldType4, h5Var);
            } else {
                int i13 = codedInputStream.readEnum();
                Internal.EnumLite enumLiteFindValueByNumber2 = generatedExtension.descriptor.f24783a.findValueByNumber(i13);
                if (enumLiteFindValueByNumber2 == null) {
                    mergeVarintField(i11, i13);
                    return true;
                }
                objBuild = enumLiteFindValueByNumber2;
            }
            c2 c2Var3 = generatedExtension.descriptor;
            if (c2Var3.f24786d) {
                this.extensions.a(c2Var3, generatedExtension.singularToFieldSetType(objBuild));
                return true;
            }
            this.extensions.p(c2Var3, generatedExtension.singularToFieldSetType(objBuild));
            return true;
        }

        private void verifyExtensionContainingType(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public v1 ensureExtensionsAreMutable() {
            v1 v1Var = this.extensions;
            if (v1Var.f24966b) {
                this.extensions = v1Var.clone();
            }
            return this.extensions;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.j();
        }

        public int extensionsSerializedSize() {
            return this.extensions.i();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.g();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite) {
            GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            Object objF = this.extensions.f(generatedExtensionCheckIsLite.descriptor);
            return objF == null ? generatedExtensionCheckIsLite.defaultValue : (Type) generatedExtensionCheckIsLite.fromFieldSetType(objF);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite) {
            GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            v1 v1Var = this.extensions;
            c2 c2Var = generatedExtensionCheckIsLite.descriptor;
            v1Var.getClass();
            if (!c2Var.f24786d) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objF = v1Var.f(c2Var);
            if (objF == null) {
                return 0;
            }
            return ((List) objF).size();
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite) {
            GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            v1 v1Var = this.extensions;
            c2 c2Var = generatedExtensionCheckIsLite.descriptor;
            v1Var.getClass();
            if (c2Var.f24786d) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return v1Var.f24965a.get(c2Var) != null;
        }

        public final void mergeExtensionFields(MessageType messagetype) {
            v1 v1Var = this.extensions;
            if (v1Var.f24966b) {
                this.extensions = v1Var.clone();
            }
            this.extensions.n(messagetype.extensions);
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
            return newBuilderForType();
        }

        public ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(this, false, null);
        }

        public ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newMessageSetExtensionWriter() {
            return new ExtensionWriter(this, true, null);
        }

        public <MessageType extends MessageLite> boolean parseUnknownField(MessageType messagetype, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i10) throws IOException {
            int tagFieldNumber = WireFormat.getTagFieldNumber(i10);
            return parseExtension(codedInputStream, extensionRegistryLite, extensionRegistryLite.findLiteExtensionByNumber(messagetype, tagFieldNumber), i10, tagFieldNumber);
        }

        public <MessageType extends MessageLite> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i10) throws IOException {
            if (i10 != WireFormat.MESSAGE_SET_ITEM_TAG) {
                return WireFormat.getTagWireType(i10) == 2 ? parseUnknownField(messagetype, codedInputStream, extensionRegistryLite, i10) : codedInputStream.skipField(i10);
            }
            mergeMessageSetExtensionFromCodedStream(messagetype, codedInputStream, extensionRegistryLite);
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
            return toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i10) {
            GeneratedExtension<MessageType, ?> generatedExtensionCheckIsLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(generatedExtensionCheckIsLite);
            v1 v1Var = this.extensions;
            c2 c2Var = generatedExtensionCheckIsLite.descriptor;
            v1Var.getClass();
            if (c2Var.f24786d) {
                Object objF = v1Var.f(c2Var);
                if (objF != null) {
                    return (Type) generatedExtensionCheckIsLite.singularFromFieldSetType(((List) objF).get(i10));
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$FloatList] */
    public static Internal.FloatList mutableCopy(Internal.FloatList floatList) {
        int size = floatList.size();
        return floatList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t10, byteString, extensionRegistryLite));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$DoubleList] */
    public static Internal.DoubleList mutableCopy(Internal.DoubleList doubleList) {
        int size = doubleList.size();
        return doubleList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, byte[] bArr) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t10, bArr, 0, bArr.length, ExtensionRegistryLite.getEmptyRegistry()));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$BooleanList] */
    public static Internal.BooleanList mutableCopy(Internal.BooleanList booleanList) {
        int size = booleanList.size();
        return booleanList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t10, bArr, 0, bArr.length, extensionRegistryLite));
    }

    public static <E> Internal.ProtobufList<E> mutableCopy(Internal.ProtobufList<E> protobufList) {
        int size = protobufList.size();
        return protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t10, CodedInputStream.newInstance(inputStream), ExtensionRegistryLite.getEmptyRegistry()));
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t10, CodedInputStream.newInstance(inputStream), extensionRegistryLite));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return (T) parseFrom(t10, codedInputStream, ExtensionRegistryLite.getEmptyRegistry());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t10, byte[] bArr, int i10, int i11, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t11 = (T) t10.newMutableInstance();
        try {
            p3 p3Var = p3.f24916c;
            p3Var.getClass();
            x3 x3VarA = p3Var.a(t11.getClass());
            x3VarA.h(t11, bArr, i10, i10 + i11, new g(extensionRegistryLite));
            x3VarA.b(t11);
            return t11;
        } catch (InvalidProtocolBufferException e10) {
            InvalidProtocolBufferException invalidProtocolBufferException = e10;
            if (invalidProtocolBufferException.getThrownFromInputStream()) {
                invalidProtocolBufferException = new InvalidProtocolBufferException((IOException) invalidProtocolBufferException);
            }
            throw invalidProtocolBufferException.setUnfinishedMessage(t11);
        } catch (UninitializedMessageException e11) {
            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(t11);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(t11);
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t10, codedInputStream, extensionRegistryLite));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t10, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return (T) parsePartialFrom(t10, codedInputStream, ExtensionRegistryLite.getEmptyRegistry());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t10, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStreamNewCodedInput = byteString.newCodedInput();
        T t11 = (T) parsePartialFrom(t10, codedInputStreamNewCodedInput, extensionRegistryLite);
        try {
            codedInputStreamNewCodedInput.checkLastTagWas(0);
            return t11;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(t11);
        }
    }
}
