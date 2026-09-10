package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class ExtensionSchemaLite extends ExtensionSchema<GeneratedMessageLite.ExtensionDescriptor> {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ExtensionSchemaLite$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4829a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f4829a = iArr;
            try {
                iArr[WireFormat.FieldType.Z.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4829a[WireFormat.FieldType.e0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4829a[WireFormat.FieldType.f0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4829a[WireFormat.FieldType.g0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4829a[WireFormat.FieldType.h0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4829a[WireFormat.FieldType.i0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4829a[WireFormat.FieldType.j0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4829a[WireFormat.FieldType.k0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4829a[WireFormat.FieldType.p0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4829a[WireFormat.FieldType.r0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4829a[WireFormat.FieldType.s0.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4829a[WireFormat.FieldType.t0.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4829a[WireFormat.FieldType.u0.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4829a[WireFormat.FieldType.q0.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4829a[WireFormat.FieldType.o0.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4829a[WireFormat.FieldType.l0.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4829a[WireFormat.FieldType.m0.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f4829a[WireFormat.FieldType.n0.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final int a(Map.Entry entry) {
        ((GeneratedMessageLite.ExtensionDescriptor) entry.getKey()).getClass();
        return 1001;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final GeneratedMessageLite.GeneratedExtension b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i2) {
        extensionRegistryLite.getClass();
        return (GeneratedMessageLite.GeneratedExtension) extensionRegistryLite.f4826a.get(new ExtensionRegistryLite.ObjectIntPair(i2, messageLite));
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final FieldSet c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final FieldSet d(Object obj) {
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableMessage.extensions;
        if (fieldSet.f4838b) {
            extendableMessage.extensions = fieldSet.clone();
        }
        return extendableMessage.extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final boolean e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final void f(Object obj) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.j();
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final Object g(Object obj, Reader reader, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, Object obj3, UnknownFieldSchema unknownFieldSchema) {
        Object objE;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj2;
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = generatedExtension.f4852b;
        extensionDescriptor.getClass();
        WireFormat.FieldType fieldType = extensionDescriptor.X;
        Object objBuildPartial = null;
        if (fieldType == WireFormat.FieldType.q0) {
            reader.readInt32();
            extensionDescriptor.getClass();
            throw null;
        }
        int iOrdinal = fieldType.ordinal();
        JavaFeaturesProto.JavaFeatures javaFeatures = generatedExtension.f4851a;
        switch (iOrdinal) {
            case 0:
                objBuildPartial = Double.valueOf(reader.readDouble());
                break;
            case 1:
                objBuildPartial = Float.valueOf(reader.readFloat());
                break;
            case 2:
                objBuildPartial = Long.valueOf(reader.readInt64());
                break;
            case 3:
                objBuildPartial = Long.valueOf(reader.readUInt64());
                break;
            case 4:
                objBuildPartial = Integer.valueOf(reader.readInt32());
                break;
            case 5:
                objBuildPartial = Long.valueOf(reader.readFixed64());
                break;
            case 6:
                objBuildPartial = Integer.valueOf(reader.readFixed32());
                break;
            case 7:
                objBuildPartial = Boolean.valueOf(reader.readBool());
                break;
            case 8:
                objBuildPartial = reader.readString();
                break;
            case 9:
                extensionDescriptor.getClass();
                Object objE2 = fieldSet.e(extensionDescriptor);
                if (objE2 instanceof GeneratedMessageLite) {
                    Schema schemaB = Protobuf.f4904c.b(objE2);
                    if (!((GeneratedMessageLite) objE2).m()) {
                        Object objNewInstance = schemaB.newInstance();
                        schemaB.mergeFrom(objNewInstance, objE2);
                        fieldSet.l(extensionDescriptor, objNewInstance);
                        objE2 = objNewInstance;
                    }
                    reader.f(objE2, schemaB, extensionRegistryLite);
                    return obj3;
                }
                objBuildPartial = reader.d(javaFeatures.getClass(), extensionRegistryLite);
                break;
            case 10:
                extensionDescriptor.getClass();
                Object objE3 = fieldSet.e(extensionDescriptor);
                if (objE3 instanceof GeneratedMessageLite) {
                    Schema schemaB2 = Protobuf.f4904c.b(objE3);
                    if (!((GeneratedMessageLite) objE3).m()) {
                        Object objNewInstance2 = schemaB2.newInstance();
                        schemaB2.mergeFrom(objNewInstance2, objE3);
                        fieldSet.l(extensionDescriptor, objNewInstance2);
                        objE3 = objNewInstance2;
                    }
                    reader.a(objE3, schemaB2, extensionRegistryLite);
                    return obj3;
                }
                objBuildPartial = reader.c(javaFeatures.getClass(), extensionRegistryLite);
                break;
            case 11:
                objBuildPartial = reader.readBytes();
                break;
            case 12:
                objBuildPartial = Integer.valueOf(reader.readUInt32());
                break;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 14:
                objBuildPartial = Integer.valueOf(reader.readSFixed32());
                break;
            case 15:
                objBuildPartial = Long.valueOf(reader.readSFixed64());
                break;
            case 16:
                objBuildPartial = Integer.valueOf(reader.readSInt32());
                break;
            case 17:
                objBuildPartial = Long.valueOf(reader.readSInt64());
                break;
        }
        extensionDescriptor.getClass();
        int iOrdinal2 = extensionDescriptor.X.ordinal();
        if ((iOrdinal2 == 9 || iOrdinal2 == 10) && (objE = fieldSet.e(extensionDescriptor)) != null) {
            GeneratedMessageLite.Builder builder = ((MessageLite) objE).toBuilder();
            MessageLite messageLite = (MessageLite) objBuildPartial;
            if (!builder.X.getClass().isInstance(messageLite)) {
                throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
            }
            builder.getClass();
            builder.k((GeneratedMessageLite) ((AbstractMessageLite) messageLite));
            objBuildPartial = builder.buildPartial();
        }
        fieldSet.l(extensionDescriptor, objBuildPartial);
        return obj3;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final void h(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.l(generatedExtension.f4852b, reader.c(generatedExtension.f4851a.getClass(), extensionRegistryLite));
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final void i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        GeneratedMessageLite.Builder builderNewBuilderForType = generatedExtension.f4851a.newBuilderForType();
        CodedInputStream codedInputStreamT = byteString.t();
        builderNewBuilderForType.i();
        try {
            Schema schemaB = Protobuf.f4904c.b(builderNewBuilderForType.f4850Y);
            GeneratedMessageLite generatedMessageLite = builderNewBuilderForType.f4850Y;
            CodedInputStreamReader codedInputStreamReader = codedInputStreamT.f4753b;
            if (codedInputStreamReader == null) {
                codedInputStreamReader = new CodedInputStreamReader(codedInputStreamT);
            }
            schemaB.a(generatedMessageLite, codedInputStreamReader, extensionRegistryLite);
            fieldSet.l(generatedExtension.f4852b, builderNewBuilderForType.buildPartial());
            codedInputStreamT.a(0);
        } catch (RuntimeException e2) {
            if (!(e2.getCause() instanceof IOException)) {
                throw e2;
            }
            throw ((IOException) e2.getCause());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final void j(Writer writer, Map.Entry entry) {
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = (GeneratedMessageLite.ExtensionDescriptor) entry.getKey();
        extensionDescriptor.getClass();
        switch (extensionDescriptor.X.ordinal()) {
            case 0:
                writer.writeDouble(1001, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                writer.writeFloat(1001, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                writer.writeInt64(1001, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                writer.writeUInt64(1001, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                writer.writeInt32(1001, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                writer.writeFixed64(1001, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                writer.writeFixed32(1001, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                writer.writeBool(1001, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                writer.writeString(1001, (String) entry.getValue());
                break;
            case 9:
                writer.e(1001, entry.getValue(), Protobuf.f4904c.a(entry.getValue().getClass()));
                break;
            case 10:
                writer.c(1001, entry.getValue(), Protobuf.f4904c.a(entry.getValue().getClass()));
                break;
            case 11:
                writer.b(1001, (ByteString) entry.getValue());
                break;
            case 12:
                writer.writeUInt32(1001, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                writer.writeInt32(1001, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                writer.writeSFixed32(1001, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                writer.writeSFixed64(1001, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                writer.writeSInt32(1001, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                writer.writeSInt64(1001, ((Long) entry.getValue()).longValue());
                break;
        }
    }
}
