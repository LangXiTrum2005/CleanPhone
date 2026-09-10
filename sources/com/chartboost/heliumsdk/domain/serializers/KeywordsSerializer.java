package com.chartboost.heliumsdk.domain.serializers;

import com.chartboost.heliumsdk.domain.Keywords;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/chartboost/heliumsdk/domain/serializers/KeywordsSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/domain/Keywords;", "()V", "delegate", "", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KeywordsSerializer implements KSerializer<Keywords> {
    public static final KeywordsSerializer INSTANCE = new KeywordsSerializer();
    private static final KSerializer<Map<String, String>> delegate;
    private static final SerialDescriptor descriptor;

    static {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f43337a;
        KSerializer<Map<String, String>> kSerializerMapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(stringCompanionObject), BuiltinSerializersKt.serializer(stringCompanionObject));
        delegate = kSerializerMapSerializer;
        descriptor = kSerializerMapSerializer.getDescriptor();
    }

    private KeywordsSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Keywords deserialize(Decoder decoder) {
        Intrinsics.f(decoder, "decoder");
        StringCompanionObject stringCompanionObject = StringCompanionObject.f43337a;
        Map map = (Map) decoder.decodeSerializableValue(BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(stringCompanionObject), BuiltinSerializersKt.serializer(stringCompanionObject)));
        Keywords keywords = new Keywords();
        for (Map.Entry entry : map.entrySet()) {
            keywords.set((String) entry.getKey(), (String) entry.getValue());
        }
        return keywords;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Keywords value) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(value, "value");
        KSerializer<Map<String, String>> kSerializer = delegate;
        Map<String, String> map = value.get();
        if (map.isEmpty()) {
            map = null;
        }
        if (map == null) {
            map = EmptyMap.X;
        }
        kSerializer.serialize(encoder, map);
    }
}
