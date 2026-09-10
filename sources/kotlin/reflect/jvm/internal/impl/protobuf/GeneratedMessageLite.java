package kotlin.reflect.jvm.internal.impl.protobuf;

import android.support.v4.media.a;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class GeneratedMessageLite extends AbstractMessageLite implements Serializable {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44207a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f44207a = iArr;
            try {
                WireFormat.JavaType javaType = WireFormat.JavaType.INT;
                iArr[8] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f44207a;
                WireFormat.JavaType javaType2 = WireFormat.JavaType.INT;
                iArr2[7] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class Builder<MessageType extends GeneratedMessageLite, BuilderType extends Builder> extends AbstractMessageLite.Builder<BuilderType> {
        public ByteString X = ByteString.X;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Builder c() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public abstract Builder f(GeneratedMessageLite generatedMessageLite);
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType> {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public FieldSet f44208Y = FieldSet.d;
        public boolean Z;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public ExtendableBuilder c() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public final void h(ExtendableMessage extendableMessage) {
            SmallSortedMap.AnonymousClass1 anonymousClass1;
            if (!this.Z) {
                this.f44208Y = this.f44208Y.clone();
                this.Z = true;
            }
            FieldSet fieldSet = this.f44208Y;
            FieldSet fieldSet2 = extendableMessage.X;
            fieldSet.getClass();
            int i2 = 0;
            while (true) {
                int size = fieldSet2.f44202a.f44226Y.size();
                anonymousClass1 = fieldSet2.f44202a;
                if (i2 >= size) {
                    break;
                }
                fieldSet.g((Map.Entry) anonymousClass1.f44226Y.get(i2));
                i2++;
            }
            Iterator it = anonymousClass1.c().iterator();
            while (it.hasNext()) {
                fieldSet.g((Map.Entry) it.next());
            }
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage> extends MessageLiteOrBuilder {
    }

    public static final class ExtensionDescriptor implements FieldSet.FieldDescriptorLite<ExtensionDescriptor> {
        public final int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final WireFormat.FieldType f44211Y;
        public final boolean Z;

        public ExtensionDescriptor(int i2, WireFormat.FieldType fieldType, boolean z2) {
            this.X = i2;
            this.f44211Y = fieldType;
            this.Z = z2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.X - ((ExtensionDescriptor) obj).X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final Builder e(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).f((GeneratedMessageLite) messageLite);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.JavaType getLiteJavaType() {
            return this.f44211Y.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.FieldType getLiteType() {
            return this.f44211Y;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final int getNumber() {
            return this.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final boolean isPacked() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final boolean isRepeated() {
            return this.Z;
        }
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExtendableMessage f44212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f44213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final GeneratedMessageLite f44214c;
        public final ExtensionDescriptor d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Method f44215e;

        public GeneratedExtension(ExtendableMessage extendableMessage, Object obj, GeneratedMessageLite generatedMessageLite, ExtensionDescriptor extensionDescriptor, Class cls) {
            if (extendableMessage == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (extensionDescriptor.f44211Y == WireFormat.FieldType.n0 && generatedMessageLite == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f44212a = extendableMessage;
            this.f44213b = obj;
            this.f44214c = generatedMessageLite;
            this.d = extensionDescriptor;
            if (!Internal.EnumLite.class.isAssignableFrom(cls)) {
                this.f44215e = null;
                return;
            }
            try {
                this.f44215e = cls.getMethod("valueOf", Integer.TYPE);
            } catch (NoSuchMethodException e2) {
                String name = cls.getName();
                throw new RuntimeException(a.s(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e2);
            }
        }

        public final Object a(Object obj) {
            if (this.d.f44211Y.X != WireFormat.JavaType.ENUM) {
                return obj;
            }
            try {
                return this.f44215e.invoke(null, (Integer) obj);
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

        public final Object b(Object obj) {
            return this.d.f44211Y.X == WireFormat.JavaType.ENUM ? Integer.valueOf(((Internal.EnumLite) obj).getNumber()) : obj;
        }
    }

    public static GeneratedExtension c(ExtendableMessage extendableMessage, GeneratedMessageLite generatedMessageLite, int i2, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension(extendableMessage, Collections.EMPTY_LIST, generatedMessageLite, new ExtensionDescriptor(i2, fieldType, true), cls);
    }

    public static GeneratedExtension d(ExtendableMessage extendableMessage, Serializable serializable, GeneratedMessageLite generatedMessageLite, int i2, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension(extendableMessage, serializable, generatedMessageLite, new ExtensionDescriptor(i2, fieldType, false), cls);
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements ExtendableMessageOrBuilder<MessageType> {
        public final FieldSet X;

        public class ExtensionWriter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator f44209a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Map.Entry f44210b;

            public ExtensionWriter(ExtendableMessage extendableMessage) {
                Iterator it;
                FieldSet fieldSet = extendableMessage.X;
                boolean z2 = fieldSet.f44204c;
                SmallSortedMap.AnonymousClass1 anonymousClass1 = fieldSet.f44202a;
                if (z2) {
                    Iterator it2 = anonymousClass1.entrySet().iterator();
                    LazyField.LazyIterator lazyIterator = new LazyField.LazyIterator();
                    lazyIterator.X = it2;
                    it = lazyIterator;
                } else {
                    it = anonymousClass1.entrySet().iterator();
                }
                this.f44209a = it;
                if (it.hasNext()) {
                    this.f44210b = (Map.Entry) it.next();
                }
            }

            public final void a(int i2, CodedOutputStream codedOutputStream) {
                while (true) {
                    Map.Entry entry = this.f44210b;
                    if (entry == null || ((ExtensionDescriptor) entry.getKey()).X >= i2) {
                        return;
                    }
                    ExtensionDescriptor extensionDescriptor = (ExtensionDescriptor) this.f44210b.getKey();
                    Object value = this.f44210b.getValue();
                    FieldSet fieldSet = FieldSet.d;
                    WireFormat.FieldType fieldType = extensionDescriptor.f44211Y;
                    int i3 = extensionDescriptor.X;
                    if (extensionDescriptor.Z) {
                        Iterator it = ((List) value).iterator();
                        while (it.hasNext()) {
                            FieldSet.k(codedOutputStream, fieldType, i3, it.next());
                        }
                    } else if (value instanceof LazyField) {
                        FieldSet.k(codedOutputStream, fieldType, i3, ((LazyField) value).a());
                    } else {
                        FieldSet.k(codedOutputStream, fieldType, i3, value);
                    }
                    Iterator it2 = this.f44209a;
                    if (it2.hasNext()) {
                        this.f44210b = (Map.Entry) it2.next();
                    } else {
                        this.f44210b = null;
                    }
                }
            }
        }

        public ExtendableMessage() {
            this.X = new FieldSet();
        }

        public final boolean g() {
            int i2 = 0;
            while (true) {
                SmallSortedMap.AnonymousClass1 anonymousClass1 = this.X.f44202a;
                if (i2 >= anonymousClass1.f44226Y.size()) {
                    Iterator it = anonymousClass1.c().iterator();
                    while (it.hasNext()) {
                        if (!FieldSet.f((Map.Entry) it.next())) {
                            break;
                        }
                    }
                    return true;
                }
                if (!FieldSet.f((Map.Entry) anonymousClass1.f44226Y.get(i2))) {
                    break;
                }
                i2++;
            }
            return false;
        }

        public final int h() {
            SmallSortedMap.AnonymousClass1 anonymousClass1;
            int i2 = 0;
            int iD = 0;
            while (true) {
                anonymousClass1 = this.X.f44202a;
                if (i2 >= anonymousClass1.f44226Y.size()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) anonymousClass1.f44226Y.get(i2);
                iD += FieldSet.d((FieldSet.FieldDescriptorLite) entry.getKey(), entry.getValue());
                i2++;
            }
            for (Map.Entry entry2 : anonymousClass1.c()) {
                iD += FieldSet.d((FieldSet.FieldDescriptorLite) entry2.getKey(), entry2.getValue());
            }
            return iD;
        }

        public final Object i(GeneratedExtension generatedExtension) {
            o(generatedExtension);
            FieldSet fieldSet = this.X;
            ExtensionDescriptor extensionDescriptor = generatedExtension.d;
            Object objE = fieldSet.e(extensionDescriptor);
            if (objE == null) {
                return generatedExtension.f44213b;
            }
            if (!extensionDescriptor.Z) {
                return generatedExtension.a(objE);
            }
            if (extensionDescriptor.f44211Y.X != WireFormat.JavaType.ENUM) {
                return objE;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) objE).iterator();
            while (it.hasNext()) {
                arrayList.add(generatedExtension.a(it.next()));
            }
            return arrayList;
        }

        public final Object j(GeneratedExtension generatedExtension, int i2) {
            o(generatedExtension);
            FieldSet fieldSet = this.X;
            fieldSet.getClass();
            ExtensionDescriptor extensionDescriptor = generatedExtension.d;
            if (!extensionDescriptor.Z) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objE = fieldSet.e(extensionDescriptor);
            if (objE != null) {
                return generatedExtension.a(((List) objE).get(i2));
            }
            throw new IndexOutOfBoundsException();
        }

        public final int k(GeneratedExtension generatedExtension) {
            o(generatedExtension);
            FieldSet fieldSet = this.X;
            fieldSet.getClass();
            ExtensionDescriptor extensionDescriptor = generatedExtension.d;
            if (!extensionDescriptor.Z) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objE = fieldSet.e(extensionDescriptor);
            if (objE == null) {
                return 0;
            }
            return ((List) objE).size();
        }

        public final boolean l(GeneratedExtension generatedExtension) {
            o(generatedExtension);
            FieldSet fieldSet = this.X;
            fieldSet.getClass();
            ExtensionDescriptor extensionDescriptor = generatedExtension.d;
            if (extensionDescriptor.Z) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return fieldSet.f44202a.get(extensionDescriptor) != null;
        }

        public final void m() {
            FieldSet fieldSet = this.X;
            if (fieldSet.f44203b) {
                return;
            }
            fieldSet.f44202a.e();
            fieldSet.f44203b = true;
        }

        /* JADX WARN: Code duplicated, block: B:4:0x001d  */
        public final boolean n(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i2) throws InvalidProtocolBufferException {
            boolean z2;
            boolean z3;
            Object objBuild;
            MessageLite messageLite;
            MessageLite defaultInstanceForType = getDefaultInstanceForType();
            int i3 = i2 & 7;
            extensionRegistryLite.getClass();
            GeneratedExtension generatedExtension = (GeneratedExtension) extensionRegistryLite.f44199a.get(new ExtensionRegistryLite.ObjectIntPair(i2 >>> 3, defaultInstanceForType));
            if (generatedExtension == null) {
                z3 = false;
                z2 = true;
            } else {
                ExtensionDescriptor extensionDescriptor = generatedExtension.d;
                WireFormat.FieldType fieldType = extensionDescriptor.f44211Y;
                FieldSet fieldSet = FieldSet.d;
                if (i3 == fieldType.f44231Y) {
                    z2 = false;
                    z3 = false;
                } else if (extensionDescriptor.Z && fieldType.d() && i3 == 2) {
                    z2 = false;
                    z3 = true;
                } else {
                    z3 = false;
                    z2 = true;
                }
            }
            if (z2) {
                return codedInputStream.q(i2, codedOutputStream);
            }
            MessageLite.Builder builderNewBuilderForType = null;
            FieldSet fieldSet2 = this.X;
            if (z3) {
                int iD = codedInputStream.d(codedInputStream.k());
                ExtensionDescriptor extensionDescriptor2 = generatedExtension.d;
                if (extensionDescriptor2.f44211Y != WireFormat.FieldType.q0) {
                    while (codedInputStream.b() > 0) {
                        fieldSet2.a(extensionDescriptor2, FieldSet.h(codedInputStream, extensionDescriptor2.f44211Y));
                    }
                } else if (codedInputStream.b() > 0) {
                    codedInputStream.k();
                    throw null;
                }
                codedInputStream.c(iD);
                return true;
            }
            int iOrdinal = generatedExtension.d.f44211Y.X.ordinal();
            ExtensionDescriptor extensionDescriptor3 = generatedExtension.d;
            if (iOrdinal == 7) {
                codedInputStream.k();
                extensionDescriptor3.getClass();
                throw null;
            }
            if (iOrdinal != 8) {
                objBuild = FieldSet.h(codedInputStream, extensionDescriptor3.f44211Y);
            } else {
                if (!extensionDescriptor3.Z && (messageLite = (MessageLite) fieldSet2.e(extensionDescriptor3)) != null) {
                    builderNewBuilderForType = messageLite.toBuilder();
                }
                if (builderNewBuilderForType == null) {
                    builderNewBuilderForType = generatedExtension.f44214c.newBuilderForType();
                }
                if (extensionDescriptor3.f44211Y == WireFormat.FieldType.m0) {
                    int i4 = codedInputStream.f44194i;
                    if (i4 >= 64) {
                        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                    }
                    codedInputStream.f44194i = i4 + 1;
                    builderNewBuilderForType.a(codedInputStream, extensionRegistryLite);
                    codedInputStream.a((extensionDescriptor3.X << 3) | 4);
                    codedInputStream.f44194i--;
                } else {
                    int iK = codedInputStream.k();
                    if (codedInputStream.f44194i >= 64) {
                        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                    }
                    int iD2 = codedInputStream.d(iK);
                    codedInputStream.f44194i++;
                    builderNewBuilderForType.a(codedInputStream, extensionRegistryLite);
                    codedInputStream.a(0);
                    codedInputStream.f44194i--;
                    codedInputStream.c(iD2);
                }
                objBuild = builderNewBuilderForType.build();
            }
            if (extensionDescriptor3.Z) {
                fieldSet2.a(extensionDescriptor3, generatedExtension.b(objBuild));
                return true;
            }
            fieldSet2.i(extensionDescriptor3, generatedExtension.b(objBuild));
            return true;
        }

        public final void o(GeneratedExtension generatedExtension) {
            if (generatedExtension.f44212a != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public ExtendableMessage(ExtendableBuilder extendableBuilder) {
            FieldSet fieldSet = extendableBuilder.f44208Y;
            if (!fieldSet.f44203b) {
                fieldSet.f44202a.e();
                fieldSet.f44203b = true;
            }
            extendableBuilder.Z = false;
            this.X = extendableBuilder.f44208Y;
        }
    }
}
