package com.chartboost.heliumsdk.network.model;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/chartboost/heliumsdk/network/model/BannerSizeBody.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/chartboost/heliumsdk/network/model/BannerSizeBody;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
public final class BannerSizeBody$$serializer implements GeneratedSerializer<BannerSizeBody> {
    public static final BannerSizeBody$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BannerSizeBody$$serializer bannerSizeBody$$serializer = new BannerSizeBody$$serializer();
        INSTANCE = bannerSizeBody$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.heliumsdk.network.model.BannerSizeBody", bannerSizeBody$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("auction_id", false);
        pluginGeneratedSerialDescriptor.addElement("creative_size", false);
        pluginGeneratedSerialDescriptor.addElement("container_size", false);
        pluginGeneratedSerialDescriptor.addElement("request_size", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BannerSizeBody$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        BannerAdDimensions$$serializer bannerAdDimensions$$serializer = BannerAdDimensions$$serializer.INSTANCE;
        return new KSerializer[]{StringSerializer.INSTANCE, bannerAdDimensions$$serializer, bannerAdDimensions$$serializer, bannerAdDimensions$$serializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public BannerSizeBody deserialize(Decoder decoder) {
        int i2;
        String str;
        Object objDecodeSerializableElement;
        Object objDecodeSerializableElement2;
        Object objDecodeSerializableElement3;
        Intrinsics.f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
            BannerAdDimensions$$serializer bannerAdDimensions$$serializer = BannerAdDimensions$$serializer.INSTANCE;
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, bannerAdDimensions$$serializer, null);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, bannerAdDimensions$$serializer, null);
            objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, bannerAdDimensions$$serializer, null);
            str = strDecodeStringElement2;
            i2 = 15;
        } else {
            boolean z2 = true;
            int i3 = 0;
            Object objDecodeSerializableElement4 = null;
            Object objDecodeSerializableElement5 = null;
            Object objDecodeSerializableElement6 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z2 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
                    i3 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, BannerAdDimensions$$serializer.INSTANCE, objDecodeSerializableElement4);
                    i3 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    objDecodeSerializableElement5 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, BannerAdDimensions$$serializer.INSTANCE, objDecodeSerializableElement5);
                    i3 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    objDecodeSerializableElement6 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, BannerAdDimensions$$serializer.INSTANCE, objDecodeSerializableElement6);
                    i3 |= 8;
                }
            }
            i2 = i3;
            str = strDecodeStringElement;
            objDecodeSerializableElement = objDecodeSerializableElement4;
            objDecodeSerializableElement2 = objDecodeSerializableElement5;
            objDecodeSerializableElement3 = objDecodeSerializableElement6;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new BannerSizeBody(i2, str, (BannerAdDimensions) objDecodeSerializableElement, (BannerAdDimensions) objDecodeSerializableElement2, (BannerAdDimensions) objDecodeSerializableElement3, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, BannerSizeBody value) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        BannerSizeBody.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
