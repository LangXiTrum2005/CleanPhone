package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class Protobuf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Protobuf f4904c = new Protobuf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f4906b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManifestSchemaFactory f4905a = new ManifestSchemaFactory();

    public final Schema a(Class cls) {
        ExtensionSchema extensionSchema;
        Schema schemaV;
        Class cls2;
        Internal.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f4906b;
        Schema schema = (Schema) concurrentHashMap.get(cls);
        if (schema != null) {
            return schema;
        }
        ManifestSchemaFactory manifestSchemaFactory = this.f4905a;
        manifestSchemaFactory.getClass();
        Class cls3 = SchemaUtil.f4914a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = SchemaUtil.f4914a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        MessageInfo messageInfoMessageInfoFor = manifestSchemaFactory.f4873a.messageInfoFor(cls);
        if (messageInfoMessageInfoFor.isMessageSetWireFormat()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                schemaV = new MessageSetSchema(SchemaUtil.f4916c, ExtensionSchemas.f4830a, messageInfoMessageInfoFor.getDefaultInstance());
            } else {
                UnknownFieldSchema unknownFieldSchema = SchemaUtil.f4915b;
                ExtensionSchema extensionSchema2 = ExtensionSchemas.f4831b;
                if (extensionSchema2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                schemaV = new MessageSetSchema(unknownFieldSchema, extensionSchema2, messageInfoMessageInfoFor.getDefaultInstance());
            }
        } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            NewInstanceSchemaLite newInstanceSchemaLite = NewInstanceSchemas.f4900b;
            ListFieldSchemaLite listFieldSchemaLite = ListFieldSchemas.f4869b;
            UnknownFieldSetLiteSchema unknownFieldSetLiteSchema = SchemaUtil.f4916c;
            ExtensionSchemaLite extensionSchemaLite = messageInfoMessageInfoFor.getSyntax().ordinal() != 1 ? ExtensionSchemas.f4830a : null;
            MapFieldSchemaLite mapFieldSchemaLite = MapFieldSchemas.f4882b;
            int[] iArr = MessageSchema.f4884p;
            if (!(messageInfoMessageInfoFor instanceof RawMessageInfo)) {
                throw null;
            }
            schemaV = MessageSchema.v((RawMessageInfo) messageInfoMessageInfoFor, newInstanceSchemaLite, listFieldSchemaLite, unknownFieldSetLiteSchema, extensionSchemaLite, mapFieldSchemaLite);
        } else {
            NewInstanceSchema newInstanceSchema = NewInstanceSchemas.f4899a;
            ListFieldSchema listFieldSchema = ListFieldSchemas.f4868a;
            UnknownFieldSchema unknownFieldSchema2 = SchemaUtil.f4915b;
            if (messageInfoMessageInfoFor.getSyntax().ordinal() != 1) {
                ExtensionSchema extensionSchema3 = ExtensionSchemas.f4831b;
                if (extensionSchema3 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                extensionSchema = extensionSchema3;
            } else {
                extensionSchema = null;
            }
            MapFieldSchema mapFieldSchema = MapFieldSchemas.f4881a;
            int[] iArr2 = MessageSchema.f4884p;
            if (!(messageInfoMessageInfoFor instanceof RawMessageInfo)) {
                throw null;
            }
            schemaV = MessageSchema.v((RawMessageInfo) messageInfoMessageInfoFor, newInstanceSchema, listFieldSchema, unknownFieldSchema2, extensionSchema, mapFieldSchema);
        }
        Schema schema2 = (Schema) concurrentHashMap.putIfAbsent(cls, schemaV);
        return schema2 != null ? schema2 : schemaV;
    }

    public final Schema b(Object obj) {
        return a(obj.getClass());
    }
}
