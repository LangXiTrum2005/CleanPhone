package com.chartboost.heliumsdk.domain.serializers;

import com.chartboost.heliumsdk.domain.AdIdentifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/chartboost/heliumsdk/domain/serializers/AdIdentifierSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/domain/AdIdentifier;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdIdentifierSerializer implements KSerializer<AdIdentifier> {
    public static final AdIdentifierSerializer INSTANCE = new AdIdentifierSerializer();

    private AdIdentifierSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        String strK = Reflection.f43333a.b(AdIdentifier.class).k();
        Intrinsics.c(strK);
        return SerialDescriptorsKt.buildClassSerialDescriptor(strK, new SerialDescriptor[0], new Function1<ClassSerialDescriptorBuilder, Unit>() { // from class: com.chartboost.heliumsdk.domain.serializers.AdIdentifierSerializer$descriptor$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ClassSerialDescriptorBuilder) obj);
                return Unit.f43263a;
            }

            public final void invoke(ClassSerialDescriptorBuilder buildClassSerialDescriptor) {
                Intrinsics.f(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                EmptyList emptyList = EmptyList.X;
                buildClassSerialDescriptor.element("placementName", IntSerializer.INSTANCE.getDescriptor(), emptyList, false);
                buildClassSerialDescriptor.element("adType", StringSerializer.INSTANCE.getDescriptor(), emptyList, false);
            }
        });
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public AdIdentifier deserialize(Decoder decoder) {
        Intrinsics.f(decoder, "decoder");
        return new AdIdentifier(decoder.decodeInt(), decoder.decodeString());
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, AdIdentifier value) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(value, "value");
        encoder.encodeInt(value.getAdType());
        encoder.encodeString(value.getPlacementName());
    }
}
