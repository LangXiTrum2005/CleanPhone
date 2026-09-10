package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.UStringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.JsonExceptionsKt;
import p005e.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lkotlinx/serialization/json/JsonLiteralSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonLiteral;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonLiteralSerializer implements KSerializer<JsonLiteral> {
    public static final JsonLiteralSerializer INSTANCE = new JsonLiteralSerializer();
    private static final SerialDescriptor descriptor = SerialDescriptorsKt.PrimitiveSerialDescriptor("kotlinx.serialization.json.JsonLiteral", PrimitiveKind.STRING.INSTANCE);

    private JsonLiteralSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public JsonLiteral deserialize(Decoder decoder) {
        Intrinsics.f(decoder, "decoder");
        JsonElement jsonElementDecodeJsonElement = JsonElementSerializersKt.asJsonDecoder(decoder).decodeJsonElement();
        if (jsonElementDecodeJsonElement instanceof JsonLiteral) {
            return (JsonLiteral) jsonElementDecodeJsonElement;
        }
        StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        throw JsonExceptionsKt.JsonDecodingException(-1, a.b(Reflection.f43333a, jsonElementDecodeJsonElement.getClass(), sb), jsonElementDecodeJsonElement.toString());
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, JsonLiteral value) {
        Boolean bool;
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(value, "value");
        JsonElementSerializersKt.verify(encoder);
        if (value.getIsString()) {
            encoder.encodeString(value.getContent());
            return;
        }
        if (value.getCoerceToInlineType() != null) {
            encoder.encodeInline(value.getCoerceToInlineType()).encodeString(value.getContent());
            return;
        }
        Long lZ = StringsKt.Z(value.getContent());
        if (lZ != null) {
            encoder.encodeLong(lZ.longValue());
            return;
        }
        ULong uLongE = UStringsKt.e(value.getContent());
        if (uLongE != null) {
            encoder.encodeInline(BuiltinSerializersKt.serializer(ULong.f43258Y).getDescriptor()).encodeLong(uLongE.X);
            return;
        }
        Double dW = StringsKt.W(value.getContent());
        if (dW != null) {
            encoder.encodeDouble(dW.doubleValue());
            return;
        }
        String content = value.getContent();
        Intrinsics.f(content, "<this>");
        if (content.equals(com.p004ironsource.mediationsdk.metadata.a.g)) {
            bool = Boolean.TRUE;
        } else {
            bool = content.equals("false") ? Boolean.FALSE : null;
        }
        if (bool != null) {
            encoder.encodeBoolean(bool.booleanValue());
        } else {
            encoder.encodeString(value.getContent());
        }
    }
}
