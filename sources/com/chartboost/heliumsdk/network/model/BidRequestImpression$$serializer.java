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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/chartboost/heliumsdk/network/model/BidRequestImpression.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/chartboost/heliumsdk/network/model/BidRequestImpression;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
public final class BidRequestImpression$$serializer implements GeneratedSerializer<BidRequestImpression> {
    public static final BidRequestImpression$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BidRequestImpression$$serializer bidRequestImpression$$serializer = new BidRequestImpression$$serializer();
        INSTANCE = bidRequestImpression$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.heliumsdk.network.model.BidRequestImpression", bidRequestImpression$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("displaymanager", true);
        pluginGeneratedSerialDescriptor.addElement("displaymanagerver", true);
        pluginGeneratedSerialDescriptor.addElement("instl", false);
        pluginGeneratedSerialDescriptor.addElement("tagid", false);
        pluginGeneratedSerialDescriptor.addElement("secure", true);
        pluginGeneratedSerialDescriptor.addElement("video", false);
        pluginGeneratedSerialDescriptor.addElement("banner", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BidRequestImpression$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, intSerializer, stringSerializer, intSerializer, BidRequestImpressionVideo$$serializer.INSTANCE, BidRequestImpressionBanner$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public BidRequestImpression deserialize(Decoder decoder) {
        int i2;
        Object objDecodeSerializableElement;
        int i3;
        int i4;
        String str;
        String str2;
        String str3;
        Object objDecodeSerializableElement2;
        Intrinsics.f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 3);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 4);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, BidRequestImpressionVideo$$serializer.INSTANCE, null);
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 6, BidRequestImpressionBanner$$serializer.INSTANCE, null);
            str = strDecodeStringElement;
            str3 = strDecodeStringElement3;
            i2 = iDecodeIntElement2;
            i3 = iDecodeIntElement;
            str2 = strDecodeStringElement2;
            i4 = 127;
        } else {
            boolean z2 = true;
            int iDecodeIntElement3 = 0;
            int i5 = 0;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            Object objDecodeSerializableElement3 = null;
            int iDecodeIntElement4 = 0;
            Object objDecodeSerializableElement4 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        break;
                    case 0:
                        i5 |= 1;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
                        continue;
                    case 1:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
                        i5 |= 2;
                        continue;
                    case 2:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 2);
                        i5 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 3);
                        i5 |= 8;
                        break;
                    case 4:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 4);
                        i5 |= 16;
                        break;
                    case 5:
                        objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, BidRequestImpressionVideo$$serializer.INSTANCE, objDecodeSerializableElement3);
                        i5 |= 32;
                        break;
                    case 6:
                        objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 6, BidRequestImpressionBanner$$serializer.INSTANCE, objDecodeSerializableElement4);
                        i5 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i2 = iDecodeIntElement3;
            objDecodeSerializableElement = objDecodeSerializableElement4;
            i3 = iDecodeIntElement4;
            i4 = i5;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            objDecodeSerializableElement2 = objDecodeSerializableElement3;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new BidRequestImpression(i4, str, str2, i3, str3, i2, (BidRequestImpressionVideo) objDecodeSerializableElement2, (BidRequestImpressionBanner) objDecodeSerializableElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, BidRequestImpression value) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        BidRequestImpression.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
