package com.chartboost.heliumsdk.network.model;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/chartboost/heliumsdk/network/model/AdLoadNotificationRequestBody.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/chartboost/heliumsdk/network/model/AdLoadNotificationRequestBody;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
public final class AdLoadNotificationRequestBody$$serializer implements GeneratedSerializer<AdLoadNotificationRequestBody> {
    public static final AdLoadNotificationRequestBody$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AdLoadNotificationRequestBody$$serializer adLoadNotificationRequestBody$$serializer = new AdLoadNotificationRequestBody$$serializer();
        INSTANCE = adLoadNotificationRequestBody$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.heliumsdk.network.model.AdLoadNotificationRequestBody", adLoadNotificationRequestBody$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("placement_name", false);
        pluginGeneratedSerialDescriptor.addElement("ad_type", false);
        pluginGeneratedSerialDescriptor.addElement("load_id", false);
        pluginGeneratedSerialDescriptor.addElement("queue_id", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AdLoadNotificationRequestBody$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public AdLoadNotificationRequestBody deserialize(Decoder decoder) {
        int i2;
        String str;
        String str2;
        String str3;
        Object objDecodeNullableSerializableElement;
        String strDecodeStringElement;
        Intrinsics.f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 2);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, null);
            str = strDecodeStringElement3;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 4);
            str3 = strDecodeStringElement5;
            str2 = strDecodeStringElement4;
            i2 = 31;
        } else {
            boolean z2 = true;
            int i3 = 0;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            Object objDecodeNullableSerializableElement2 = null;
            String strDecodeStringElement8 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z2 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
                    i3 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
                    i3 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 2);
                    i3 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                    i3 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 4);
                    i3 |= 16;
                }
            }
            i2 = i3;
            str = strDecodeStringElement2;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement2;
            strDecodeStringElement = strDecodeStringElement8;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new AdLoadNotificationRequestBody(i2, str, str2, str3, (String) objDecodeNullableSerializableElement, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, AdLoadNotificationRequestBody value) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        AdLoadNotificationRequestBody.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
