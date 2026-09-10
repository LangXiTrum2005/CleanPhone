package kotlinx.serialization.json.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.inmobi.commons.core.configs.AdConfig;
import com.unity3d.ads.metadata.MediationMetaData;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.NamedValueEncoder;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.modules.SerializersModule;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0002JM\b3\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0016H\u0014J\u0018\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0007H&J\b\u0010&\u001a\u00020\u0007H&J\b\u0010'\u001a\u00020\bH\u0016J\b\u0010(\u001a\u00020\bH\u0016J\u0010\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0016H\u0014J\u0018\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u001cH\u0014J\u0018\u0010-\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u00020.H\u0014J\u0018\u0010/\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u000200H\u0014J\u0018\u00101\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u000202H\u0014J\u0018\u00103\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u000204H\u0014J)\u00105\u001a\u00020\b\"\u0004\b\u0000\u001062\f\u00107\u001a\b\u0012\u0004\u0012\u0002H6082\u0006\u0010,\u001a\u0002H6H\u0016¢\u0006\u0002\u00109J\u0018\u0010:\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u00020;H\u0014J\u0018\u0010<\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u00020 H\u0014J\u0018\u0010=\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u00020>H\u0014J\u0018\u0010?\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u0016H\u0014J \u0010@\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u001cH\u0014J\u0018\u0010C\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u00020DH\u0014J\u0018\u0010E\u001a\u00020F2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010G\u001a\u00020\u001aH\u0014J\u0010\u0010H\u001a\u00020F2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0015\u0010I\u001a\u00020J2\u0006\u0010*\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010KJ\u001d\u0010L\u001a\u00020M2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010G\u001a\u00020\u001aH\u0002¢\u0006\u0002\u0010NJ\u0010\u0010O\u001a\u00020P2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010Q\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u00020\u00148\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0001\u0003RST¨\u0006U"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder;", "Lkotlinx/serialization/internal/NamedValueEncoder;", "Lkotlinx/serialization/json/JsonEncoder;", "json", "Lkotlinx/serialization/json/Json;", "nodeConsumer", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;)V", "getJson", "()Lkotlinx/serialization/json/Json;", "getNodeConsumer", "()Lkotlin/jvm/functions/Function1;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "polymorphicDiscriminator", "", "polymorphicSerialName", "elementName", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "index", "", "encodeJsonElement", "element", "shouldEncodeElementDefault", "", "composeName", "parentName", "childName", "putElement", "key", "getCurrent", "encodeNotNullMark", "encodeNull", "encodeTaggedNull", "tag", "encodeTaggedInt", "value", "encodeTaggedByte", "", "encodeTaggedShort", "", "encodeTaggedLong", "", "encodeTaggedFloat", "", "encodeSerializableValue", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeTaggedDouble", "", "encodeTaggedBoolean", "encodeTaggedChar", "", "encodeTaggedString", "encodeTaggedEnum", "enumDescriptor", MediationMetaData.KEY_ORDINAL, "encodeTaggedValue", "", "encodeTaggedInline", "Lkotlinx/serialization/encoding/Encoder;", "inlineDescriptor", "encodeInline", "inlineUnsignedNumberEncoder", "kotlinx/serialization/json/internal/AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1", "(Ljava/lang/String;)Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1;", "inlineUnquotedLiteralEncoder", "kotlinx/serialization/json/internal/AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1;", "beginStructure", "Lkotlinx/serialization/encoding/CompositeEncoder;", "endEncode", "Lkotlinx/serialization/json/internal/JsonPrimitiveEncoder;", "Lkotlinx/serialization/json/internal/JsonTreeEncoder;", "Lkotlinx/serialization/json/internal/JsonTreeListEncoder;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalSerializationApi
abstract class AbstractJsonTreeEncoder extends NamedValueEncoder implements JsonEncoder {
    protected final JsonConfiguration configuration;
    private final Json json;
    private final Function1<JsonElement, Unit> nodeConsumer;
    private String polymorphicDiscriminator;
    private String polymorphicSerialName;

    public /* synthetic */ AbstractJsonTreeEncoder(Json json, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit beginStructure$lambda$2(AbstractJsonTreeEncoder abstractJsonTreeEncoder, JsonElement node) {
        Intrinsics.f(node, "node");
        abstractJsonTreeEncoder.putElement(abstractJsonTreeEncoder.getCurrentTag(), node);
        return Unit.f43263a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1] */
    private final AnonymousClass1 inlineUnquotedLiteralEncoder(final String tag, final SerialDescriptor inlineDescriptor) {
        return new AbstractEncoder() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder.inlineUnquotedLiteralEncoder.1
            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeString(String value) {
                Intrinsics.f(value, "value");
                AbstractJsonTreeEncoder.this.putElement(tag, new JsonLiteral(value, false, inlineDescriptor));
            }

            @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
            public SerializersModule getSerializersModule() {
                return AbstractJsonTreeEncoder.this.getJson().getSerializersModule();
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1] */
    private final C35591 inlineUnsignedNumberEncoder(final String tag) {
        return new AbstractEncoder() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder.inlineUnsignedNumberEncoder.1
            private final SerializersModule serializersModule;

            {
                this.serializersModule = AbstractJsonTreeEncoder.this.getJson().getSerializersModule();
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeByte(byte value) {
                putUnquotedString(String.valueOf(value & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeInt(int value) {
                putUnquotedString(Long.toString(((long) value) & 4294967295L, 10));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeLong(long value) {
                String str;
                if (value == 0) {
                    str = "0";
                } else if (value > 0) {
                    str = Long.toString(value, 10);
                } else {
                    char[] cArr = new char[64];
                    long j = (value >>> 1) / ((long) 5);
                    long j2 = 10;
                    int i2 = 63;
                    cArr[63] = Character.forDigit((int) (value - (j * j2)), 10);
                    while (j > 0) {
                        i2--;
                        cArr[i2] = Character.forDigit((int) (j % j2), 10);
                        j /= j2;
                    }
                    str = new String(cArr, i2, 64 - i2);
                }
                putUnquotedString(str);
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeShort(short value) {
                putUnquotedString(String.valueOf(value & 65535));
            }

            @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
            public SerializersModule getSerializersModule() {
                return this.serializersModule;
            }

            public final void putUnquotedString(String s) {
                Intrinsics.f(s, "s");
                AbstractJsonTreeEncoder.this.putElement(tag, new JsonLiteral(s, false, null, 4, null));
            }
        };
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public CompositeEncoder beginStructure(SerialDescriptor descriptor) {
        AbstractJsonTreeEncoder jsonTreeListEncoder;
        Intrinsics.f(descriptor, "descriptor");
        Function1 aVar = getCurrentTagOrNull() == null ? this.nodeConsumer : new a(this, 0);
        SerialKind kind = descriptor.getKind();
        if (Intrinsics.a(kind, StructureKind.LIST.INSTANCE) || (kind instanceof PolymorphicKind)) {
            jsonTreeListEncoder = new JsonTreeListEncoder(this.json, aVar);
        } else if (Intrinsics.a(kind, StructureKind.MAP.INSTANCE)) {
            Json json = this.json;
            SerialDescriptor serialDescriptorCarrierDescriptor = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), json.getSerializersModule());
            SerialKind kind2 = serialDescriptorCarrierDescriptor.getKind();
            if ((kind2 instanceof PrimitiveKind) || Intrinsics.a(kind2, SerialKind.ENUM.INSTANCE)) {
                jsonTreeListEncoder = new JsonTreeMapEncoder(this.json, aVar);
            } else {
                if (!json.getConfiguration().getAllowStructuredMapKeys()) {
                    throw JsonExceptionsKt.InvalidKeyKindException(serialDescriptorCarrierDescriptor);
                }
                jsonTreeListEncoder = new JsonTreeListEncoder(this.json, aVar);
            }
        } else {
            jsonTreeListEncoder = new JsonTreeEncoder(this.json, aVar);
        }
        String str = this.polymorphicDiscriminator;
        if (str != null) {
            if (jsonTreeListEncoder instanceof JsonTreeMapEncoder) {
                JsonTreeMapEncoder jsonTreeMapEncoder = (JsonTreeMapEncoder) jsonTreeListEncoder;
                jsonTreeMapEncoder.putElement("key", JsonElementKt.JsonPrimitive(str));
                String serialName = this.polymorphicSerialName;
                if (serialName == null) {
                    serialName = descriptor.getSerialName();
                }
                jsonTreeMapEncoder.putElement("value", JsonElementKt.JsonPrimitive(serialName));
            } else {
                String serialName2 = this.polymorphicSerialName;
                if (serialName2 == null) {
                    serialName2 = descriptor.getSerialName();
                }
                jsonTreeListEncoder.putElement(str, JsonElementKt.JsonPrimitive(serialName2));
            }
            this.polymorphicDiscriminator = null;
            this.polymorphicSerialName = null;
        }
        return jsonTreeListEncoder;
    }

    @Override // kotlinx.serialization.internal.NamedValueEncoder
    public String composeName(String parentName, String childName) {
        Intrinsics.f(parentName, "parentName");
        Intrinsics.f(childName, "childName");
        return childName;
    }

    @Override // kotlinx.serialization.internal.NamedValueEncoder
    public String elementName(SerialDescriptor descriptor, int index) {
        Intrinsics.f(descriptor, "descriptor");
        return JsonNamesMapKt.getJsonElementName(descriptor, this.json, index);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public Encoder encodeInline(SerialDescriptor descriptor) {
        Intrinsics.f(descriptor, "descriptor");
        if (getCurrentTagOrNull() == null) {
            return new JsonPrimitiveEncoder(this.json, this.nodeConsumer).encodeInline(descriptor);
        }
        if (this.polymorphicDiscriminator != null) {
            this.polymorphicSerialName = descriptor.getSerialName();
        }
        return super.encodeInline(descriptor);
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public void encodeJsonElement(JsonElement element) {
        Intrinsics.f(element, "element");
        if (this.polymorphicDiscriminator == null || (element instanceof JsonObject)) {
            encodeSerializableValue(JsonElementSerializer.INSTANCE, element);
        } else {
            PolymorphicKt.throwJsonElementPolymorphicException(this.polymorphicSerialName, element);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNotNullMark() {
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        String currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull == null) {
            this.nodeConsumer.invoke(JsonNull.INSTANCE);
        } else {
            encodeTaggedNull(currentTagOrNull);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public <T> void encodeSerializableValue(SerializationStrategy<? super T> serializer, T value) {
        String strClassDiscriminator;
        Intrinsics.f(serializer, "serializer");
        if (getCurrentTagOrNull() == null && TreeJsonEncoderKt.getRequiresTopLevelTag(WriteModeKt.carrierDescriptor(serializer.getDescriptor(), getSerializersModule()))) {
            new JsonPrimitiveEncoder(this.json, this.nodeConsumer).encodeSerializableValue(serializer, value);
            return;
        }
        if (getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializer.serialize(this, value);
            return;
        }
        boolean z2 = serializer instanceof AbstractPolymorphicSerializer;
        if (!z2) {
            int i2 = PolymorphicKt.WhenMappings.$EnumSwitchMapping$0[getJson().getConfiguration().getClassDiscriminatorMode().ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                SerialKind kind = serializer.getDescriptor().getKind();
                strClassDiscriminator = (Intrinsics.a(kind, StructureKind.CLASS.INSTANCE) || Intrinsics.a(kind, StructureKind.OBJECT.INSTANCE)) ? PolymorphicKt.classDiscriminator(serializer.getDescriptor(), getJson()) : null;
            }
        } else if (getJson().getConfiguration().getClassDiscriminatorMode() != ClassDiscriminatorMode.NONE) {
        }
        if (z2) {
            AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) serializer;
            if (value == 0) {
                throw new IllegalArgumentException(("Value for serializer " + abstractPolymorphicSerializer.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            SerializationStrategy<? super T> serializationStrategyFindPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer(abstractPolymorphicSerializer, this, value);
            if (strClassDiscriminator != null) {
                PolymorphicKt.validateIfSealed(serializer, serializationStrategyFindPolymorphicSerializer, strClassDiscriminator);
            }
            PolymorphicKt.checkKind(serializationStrategyFindPolymorphicSerializer.getDescriptor().getKind());
            serializer = serializationStrategyFindPolymorphicSerializer;
        }
        if (strClassDiscriminator != null) {
            String serialName = serializer.getDescriptor().getSerialName();
            this.polymorphicDiscriminator = strClassDiscriminator;
            this.polymorphicSerialName = serialName;
        }
        serializer.serialize(this, value);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void endEncode(SerialDescriptor descriptor) {
        Intrinsics.f(descriptor, "descriptor");
        this.nodeConsumer.invoke(getCurrent());
    }

    public abstract JsonElement getCurrent();

    @Override // kotlinx.serialization.json.JsonEncoder
    public final Json getJson() {
        return this.json;
    }

    public final Function1<JsonElement, Unit> getNodeConsumer() {
        return this.nodeConsumer;
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    public final SerializersModule getSerializersModule() {
        return this.json.getSerializersModule();
    }

    public abstract void putElement(String key, JsonElement element);

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public boolean shouldEncodeElementDefault(SerialDescriptor descriptor, int index) {
        Intrinsics.f(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AbstractJsonTreeEncoder(Json json, Function1<? super JsonElement, Unit> function1) {
        this.json = json;
        this.nodeConsumer = function1;
        this.configuration = json.getConfiguration();
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedBoolean(String tag, boolean value) {
        Intrinsics.f(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Boolean.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedByte(String tag, byte value) {
        Intrinsics.f(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Byte.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedChar(String tag, char value) {
        Intrinsics.f(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(String.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedDouble(String tag, double value) {
        Intrinsics.f(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Double.valueOf(value)));
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Double.isInfinite(value) || Double.isNaN(value)) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Double.valueOf(value), tag, getCurrent().toString());
        }
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedEnum(String tag, SerialDescriptor enumDescriptor, int ordinal) {
        Intrinsics.f(tag, "tag");
        Intrinsics.f(enumDescriptor, "enumDescriptor");
        putElement(tag, JsonElementKt.JsonPrimitive(enumDescriptor.getElementName(ordinal)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedFloat(String tag, float value) {
        Intrinsics.f(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Float.valueOf(value)));
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Float.isInfinite(value) || Float.isNaN(value)) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Float.valueOf(value), tag, getCurrent().toString());
        }
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public Encoder encodeTaggedInline(String tag, SerialDescriptor inlineDescriptor) {
        Intrinsics.f(tag, "tag");
        Intrinsics.f(inlineDescriptor, "inlineDescriptor");
        if (StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor)) {
            return inlineUnsignedNumberEncoder(tag);
        }
        return StreamingJsonEncoderKt.isUnquotedLiteral(inlineDescriptor) ? inlineUnquotedLiteralEncoder(tag, inlineDescriptor) : super.encodeTaggedInline(tag, inlineDescriptor);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedInt(String tag, int value) {
        Intrinsics.f(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Integer.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedLong(String tag, long value) {
        Intrinsics.f(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Long.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedNull(String tag) {
        Intrinsics.f(tag, "tag");
        putElement(tag, JsonNull.INSTANCE);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedShort(String tag, short value) {
        Intrinsics.f(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Short.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedString(String tag, String value) {
        Intrinsics.f(tag, "tag");
        Intrinsics.f(value, "value");
        putElement(tag, JsonElementKt.JsonPrimitive(value));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedValue(String tag, Object value) {
        Intrinsics.f(tag, "tag");
        Intrinsics.f(value, "value");
        putElement(tag, JsonElementKt.JsonPrimitive(value.toString()));
    }
}
