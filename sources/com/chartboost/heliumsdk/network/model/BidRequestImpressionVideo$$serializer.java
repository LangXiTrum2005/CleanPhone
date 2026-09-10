package com.chartboost.heliumsdk.network.model;

import com.smartdigimkt.m3.h;
import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/chartboost/heliumsdk/network/model/BidRequestImpressionVideo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/chartboost/heliumsdk/network/model/BidRequestImpressionVideo;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
public final class BidRequestImpressionVideo$$serializer implements GeneratedSerializer<BidRequestImpressionVideo> {
    public static final BidRequestImpressionVideo$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BidRequestImpressionVideo$$serializer bidRequestImpressionVideo$$serializer = new BidRequestImpressionVideo$$serializer();
        INSTANCE = bidRequestImpressionVideo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.heliumsdk.network.model.BidRequestImpressionVideo", bidRequestImpressionVideo$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("mimes", true);
        pluginGeneratedSerialDescriptor.addElement("w", false);
        pluginGeneratedSerialDescriptor.addElement(h.f36614b, false);
        pluginGeneratedSerialDescriptor.addElement("placement", false);
        pluginGeneratedSerialDescriptor.addElement("pos", false);
        pluginGeneratedSerialDescriptor.addElement("companiontype", false);
        pluginGeneratedSerialDescriptor.addElement("ext", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BidRequestImpressionVideo$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(StringSerializer.INSTANCE);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{arrayListSerializer, intSerializer, intSerializer, intSerializer, intSerializer, new ArrayListSerializer(intSerializer), BidRequestImpressionExt$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public BidRequestImpressionVideo deserialize(Decoder decoder) {
        Object objDecodeSerializableElement;
        int i2;
        int iDecodeIntElement;
        int i3;
        Object objDecodeSerializableElement2;
        int i4;
        int i5;
        Object objDecodeSerializableElement3;
        Intrinsics.f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i6 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, new ArrayListSerializer(StringSerializer.INSTANCE), null);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 1);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 2);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 3);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 4);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, new ArrayListSerializer(IntSerializer.INSTANCE), null);
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 6, BidRequestImpressionExt$$serializer.INSTANCE, null);
            i5 = iDecodeIntElement3;
            i4 = iDecodeIntElement4;
            i3 = 127;
            i2 = iDecodeIntElement2;
        } else {
            boolean z2 = true;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            int i7 = 0;
            Object objDecodeSerializableElement4 = null;
            Object objDecodeSerializableElement5 = null;
            int iDecodeIntElement8 = 0;
            Object objDecodeSerializableElement6 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i6 = 6;
                        break;
                    case 0:
                        objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, new ArrayListSerializer(StringSerializer.INSTANCE), objDecodeSerializableElement4);
                        i7 |= 1;
                        i6 = 6;
                        break;
                    case 1:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 1);
                        i7 |= 2;
                        i6 = 6;
                        break;
                    case 2:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 2);
                        i7 |= 4;
                        i6 = 6;
                        break;
                    case 3:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 3);
                        i7 |= 8;
                        i6 = 6;
                        break;
                    case 4:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 4);
                        i7 |= 16;
                        i6 = 6;
                        break;
                    case 5:
                        objDecodeSerializableElement5 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeSerializableElement5);
                        i7 |= 32;
                        i6 = 6;
                        break;
                    case 6:
                        objDecodeSerializableElement6 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, i6, BidRequestImpressionExt$$serializer.INSTANCE, objDecodeSerializableElement6);
                        i7 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            objDecodeSerializableElement = objDecodeSerializableElement6;
            i2 = iDecodeIntElement6;
            iDecodeIntElement = iDecodeIntElement7;
            i3 = i7;
            objDecodeSerializableElement2 = objDecodeSerializableElement5;
            i4 = iDecodeIntElement8;
            i5 = iDecodeIntElement5;
            objDecodeSerializableElement3 = objDecodeSerializableElement4;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new BidRequestImpressionVideo(i3, (List) objDecodeSerializableElement3, iDecodeIntElement, i2, i5, i4, (List) objDecodeSerializableElement2, (BidRequestImpressionExt) objDecodeSerializableElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, BidRequestImpressionVideo value) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        BidRequestImpressionVideo.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
