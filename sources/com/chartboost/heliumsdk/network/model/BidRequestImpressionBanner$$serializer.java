package com.chartboost.heliumsdk.network.model;

import com.smartdigimkt.m3.h;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/chartboost/heliumsdk/network/model/BidRequestImpressionBanner.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/chartboost/heliumsdk/network/model/BidRequestImpressionBanner;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
public final class BidRequestImpressionBanner$$serializer implements GeneratedSerializer<BidRequestImpressionBanner> {
    public static final BidRequestImpressionBanner$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BidRequestImpressionBanner$$serializer bidRequestImpressionBanner$$serializer = new BidRequestImpressionBanner$$serializer();
        INSTANCE = bidRequestImpressionBanner$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.heliumsdk.network.model.BidRequestImpressionBanner", bidRequestImpressionBanner$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("w", false);
        pluginGeneratedSerialDescriptor.addElement(h.f36614b, false);
        pluginGeneratedSerialDescriptor.addElement("pos", false);
        pluginGeneratedSerialDescriptor.addElement("topframe", true);
        pluginGeneratedSerialDescriptor.addElement("ext", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BidRequestImpressionBanner$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, intSerializer, intSerializer, intSerializer, BidRequestImpressionExt$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public BidRequestImpressionBanner deserialize(Decoder decoder) {
        int iDecodeIntElement;
        int i2;
        int i3;
        int i4;
        int i5;
        Object objDecodeSerializableElement;
        Intrinsics.f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 1);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 2);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 3);
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, BidRequestImpressionExt$$serializer.INSTANCE, null);
            i2 = iDecodeIntElement4;
            i3 = iDecodeIntElement3;
            i4 = iDecodeIntElement2;
            i5 = 31;
        } else {
            boolean z2 = true;
            iDecodeIntElement = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            int i6 = 0;
            Object objDecodeSerializableElement2 = null;
            int iDecodeIntElement7 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z2 = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
                    i6 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 1);
                    i6 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 2);
                    i6 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 3);
                    i6 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, BidRequestImpressionExt$$serializer.INSTANCE, objDecodeSerializableElement2);
                    i6 |= 16;
                }
            }
            i2 = iDecodeIntElement7;
            i3 = iDecodeIntElement5;
            i4 = iDecodeIntElement6;
            i5 = i6;
            objDecodeSerializableElement = objDecodeSerializableElement2;
        }
        int i7 = iDecodeIntElement;
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new BidRequestImpressionBanner(i5, i7, i4, i3, i2, (BidRequestImpressionExt) objDecodeSerializableElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, BidRequestImpressionBanner value) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        BidRequestImpressionBanner.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
