package com.chartboost.heliumsdk.network.model;

import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/chartboost/heliumsdk/network/model/AuctionWinnerRequestBody.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/chartboost/heliumsdk/network/model/AuctionWinnerRequestBody;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
public final class AuctionWinnerRequestBody$$serializer implements GeneratedSerializer<AuctionWinnerRequestBody> {
    public static final AuctionWinnerRequestBody$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AuctionWinnerRequestBody$$serializer auctionWinnerRequestBody$$serializer = new AuctionWinnerRequestBody$$serializer();
        INSTANCE = auctionWinnerRequestBody$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.heliumsdk.network.model.AuctionWinnerRequestBody", auctionWinnerRequestBody$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("auction_id", true);
        pluginGeneratedSerialDescriptor.addElement("placement_type", false);
        pluginGeneratedSerialDescriptor.addElement("winner", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("line_item_id", true);
        pluginGeneratedSerialDescriptor.addElement("partner_placement", true);
        pluginGeneratedSerialDescriptor.addElement("price", true);
        pluginGeneratedSerialDescriptor.addElement("bidders", true);
        pluginGeneratedSerialDescriptor.addElement("size", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AuctionWinnerRequestBody$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(DoubleSerializer.INSTANCE), BuiltinSerializersKt.getNullable(new ArrayListSerializer(AuctionWinnerRequestBidder$$serializer.INSTANCE)), BuiltinSerializersKt.getNullable(BannerAdDimensions$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public AuctionWinnerRequestBody deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        int i2;
        Object objDecodeNullableSerializableElement7;
        String strDecodeStringElement;
        char c2;
        Intrinsics.f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i3 = 7;
        int i4 = 6;
        int i5 = 8;
        Object objDecodeNullableSerializableElement8 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, stringSerializer, null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, stringSerializer, null);
            Object objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, stringSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, DoubleSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, new ArrayListSerializer(AuctionWinnerRequestBidder$$serializer.INSTANCE), null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, BannerAdDimensions$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement8 = objDecodeNullableSerializableElement9;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement10;
            i2 = 511;
        } else {
            boolean z2 = true;
            int i6 = 0;
            Object objDecodeNullableSerializableElement11 = null;
            Object objDecodeNullableSerializableElement12 = null;
            Object objDecodeNullableSerializableElement13 = null;
            Object objDecodeNullableSerializableElement14 = null;
            objDecodeNullableSerializableElement = null;
            String strDecodeStringElement2 = null;
            Object objDecodeNullableSerializableElement15 = null;
            Object objDecodeNullableSerializableElement16 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 0:
                        objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, objDecodeNullableSerializableElement8);
                        i6 |= 1;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 1:
                        c2 = 5;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
                        i6 |= 2;
                        i3 = 7;
                        i5 = 8;
                        break;
                    case 2:
                        c2 = 5;
                        objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement15);
                        i6 |= 4;
                        i3 = 7;
                        i5 = 8;
                        break;
                    case 3:
                        c2 = 5;
                        objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement16);
                        i6 |= 8;
                        i3 = 7;
                        i5 = 8;
                        break;
                    case 4:
                        c2 = 5;
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i6 |= 16;
                        i3 = 7;
                        i5 = 8;
                        break;
                    case 5:
                        objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, objDecodeNullableSerializableElement14);
                        i6 |= 32;
                        i5 = 8;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, i4, DoubleSerializer.INSTANCE, objDecodeNullableSerializableElement13);
                        i6 |= 64;
                        i5 = 8;
                        break;
                    case 7:
                        objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, i3, new ArrayListSerializer(AuctionWinnerRequestBidder$$serializer.INSTANCE), objDecodeNullableSerializableElement11);
                        i6 |= 128;
                        i5 = 8;
                        break;
                    case 8:
                        objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, i5, BannerAdDimensions$$serializer.INSTANCE, objDecodeNullableSerializableElement12);
                        i6 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement11;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement12;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement13;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement15;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement16;
            i2 = i6;
            objDecodeNullableSerializableElement7 = objDecodeNullableSerializableElement14;
            strDecodeStringElement = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new AuctionWinnerRequestBody(i2, (String) objDecodeNullableSerializableElement8, strDecodeStringElement, (String) objDecodeNullableSerializableElement5, (String) objDecodeNullableSerializableElement6, (String) objDecodeNullableSerializableElement, (String) objDecodeNullableSerializableElement7, (Double) objDecodeNullableSerializableElement4, (List) objDecodeNullableSerializableElement2, (BannerAdDimensions) objDecodeNullableSerializableElement3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, AuctionWinnerRequestBody value) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        AuctionWinnerRequestBody.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
