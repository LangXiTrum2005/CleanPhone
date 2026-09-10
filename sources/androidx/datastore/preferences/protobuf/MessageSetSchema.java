package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class MessageSetSchema<T> implements Schema<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageLite f4894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnknownFieldSchema f4895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4896c;
    public final ExtensionSchema d;

    public MessageSetSchema(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MessageLite messageLite) {
        this.f4895b = unknownFieldSchema;
        this.f4896c = extensionSchema.e(messageLite);
        this.d = extensionSchema;
        this.f4894a = messageLite;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void a(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        UnknownFieldSchema unknownFieldSchema = this.f4895b;
        UnknownFieldSetLite unknownFieldSetLiteF = unknownFieldSchema.f(obj);
        ExtensionSchema extensionSchema = this.d;
        FieldSet fieldSetD = extensionSchema.d(obj);
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                Reader reader2 = reader;
                ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
                if (!f(reader2, extensionRegistryLite2, extensionSchema, fieldSetD, unknownFieldSchema, unknownFieldSetLiteF)) {
                    return;
                }
                reader = reader2;
                extensionRegistryLite = extensionRegistryLite2;
            } finally {
                unknownFieldSchema.n(obj, unknownFieldSetLiteF);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final int b(AbstractMessageLite abstractMessageLite) {
        UnknownFieldSchema unknownFieldSchema = this.f4895b;
        int i2 = unknownFieldSchema.i(unknownFieldSchema.g(abstractMessageLite));
        if (!this.f4896c) {
            return i2;
        }
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.d.c(abstractMessageLite).f4837a;
        int size = anonymousClass1.X.size();
        int iF = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iF += FieldSet.f(anonymousClass1.c(i3));
        }
        Iterator<T> it = anonymousClass1.d().iterator();
        while (it.hasNext()) {
            iF += FieldSet.f((Map.Entry) it.next());
        }
        return i2 + iF;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final int c(GeneratedMessageLite generatedMessageLite) {
        int iHashCode = this.f4895b.g(generatedMessageLite).hashCode();
        return this.f4896c ? (iHashCode * 53) + this.d.c(generatedMessageLite).f4837a.hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void d(Object obj, Writer writer) {
        Iterator itI = this.d.c(obj).i();
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) entry.getKey();
            if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof LazyField.LazyEntry) {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), ((LazyField) ((LazyField.LazyEntry) entry).X.getValue()).b());
            } else {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), entry.getValue());
            }
        }
        UnknownFieldSchema unknownFieldSchema = this.f4895b;
        unknownFieldSchema.q(unknownFieldSchema.g(obj), writer);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean e(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        UnknownFieldSchema unknownFieldSchema = this.f4895b;
        if (!unknownFieldSchema.g(generatedMessageLite).equals(unknownFieldSchema.g(generatedMessageLite2))) {
            return false;
        }
        if (!this.f4896c) {
            return true;
        }
        ExtensionSchema extensionSchema = this.d;
        return extensionSchema.c(generatedMessageLite).equals(extensionSchema.c(generatedMessageLite2));
    }

    public final boolean f(Reader reader, ExtensionRegistryLite extensionRegistryLite, ExtensionSchema extensionSchema, FieldSet fieldSet, UnknownFieldSchema unknownFieldSchema, Object obj) throws InvalidProtocolBufferException {
        int tag = reader.getTag();
        int uInt32 = 0;
        MessageLite messageLite = this.f4894a;
        if (tag != 11) {
            if ((tag & 7) != 2) {
                return reader.skipField();
            }
            GeneratedMessageLite.GeneratedExtension generatedExtensionB = extensionSchema.b(extensionRegistryLite, messageLite, tag >>> 3);
            if (generatedExtensionB == null) {
                return unknownFieldSchema.l(0, reader, obj);
            }
            extensionSchema.h(reader, generatedExtensionB, extensionRegistryLite, fieldSet);
            return true;
        }
        GeneratedMessageLite.GeneratedExtension generatedExtensionB2 = null;
        ByteString bytes = null;
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = reader.getTag();
            if (tag2 == 16) {
                uInt32 = reader.readUInt32();
                generatedExtensionB2 = extensionSchema.b(extensionRegistryLite, messageLite, uInt32);
            } else if (tag2 == 26) {
                if (generatedExtensionB2 != null) {
                    extensionSchema.h(reader, generatedExtensionB2, extensionRegistryLite, fieldSet);
                } else {
                    bytes = reader.readBytes();
                }
            } else if (!reader.skipField()) {
                break;
            }
        }
        if (reader.getTag() != 12) {
            throw InvalidProtocolBufferException.d();
        }
        if (bytes != null) {
            if (generatedExtensionB2 != null) {
                extensionSchema.i(bytes, generatedExtensionB2, extensionRegistryLite, fieldSet);
                return true;
            }
            unknownFieldSchema.d(obj, uInt32, bytes);
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean isInitialized(Object obj) {
        return this.d.c(obj).g();
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void makeImmutable(Object obj) {
        this.f4895b.j(obj);
        this.d.f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void mergeFrom(Object obj, Object obj2) {
        Class cls = SchemaUtil.f4914a;
        UnknownFieldSchema unknownFieldSchema = this.f4895b;
        unknownFieldSchema.o(obj, unknownFieldSchema.k(unknownFieldSchema.g(obj), unknownFieldSchema.g(obj2)));
        if (this.f4896c) {
            SchemaUtil.k(this.d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final Object newInstance() {
        MessageLite messageLite = this.f4894a;
        return messageLite instanceof GeneratedMessageLite ? ((GeneratedMessageLite) messageLite).p() : messageLite.newBuilderForType().buildPartial();
    }
}
