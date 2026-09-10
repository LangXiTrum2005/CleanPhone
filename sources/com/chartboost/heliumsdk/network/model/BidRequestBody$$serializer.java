package com.chartboost.heliumsdk.network.model;

import com.p004ironsource.d9;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/chartboost/heliumsdk/network/model/BidRequestBody.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/chartboost/heliumsdk/network/model/BidRequestBody;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
public final class BidRequestBody$$serializer implements GeneratedSerializer<BidRequestBody> {
    public static final BidRequestBody$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BidRequestBody$$serializer bidRequestBody$$serializer = new BidRequestBody$$serializer();
        INSTANCE = bidRequestBody$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.heliumsdk.network.model.BidRequestBody", bidRequestBody$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("user", false);
        pluginGeneratedSerialDescriptor.addElement("test", true);
        pluginGeneratedSerialDescriptor.addElement("imp", false);
        pluginGeneratedSerialDescriptor.addElement("app", false);
        pluginGeneratedSerialDescriptor.addElement(d9.h.G, false);
        pluginGeneratedSerialDescriptor.addElement("regs", false);
        pluginGeneratedSerialDescriptor.addElement("ext", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BidRequestBody$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BidRequestUser$$serializer.INSTANCE, IntSerializer.INSTANCE, new ArrayListSerializer(BidRequestImpression$$serializer.INSTANCE), BidRequestApp$$serializer.INSTANCE, BidRequestDevice$$serializer.INSTANCE, BidRequestRegs$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(BidRequestExt$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public BidRequestBody deserialize(Decoder decoder) {
        int i2;
        Object objDecodeSerializableElement;
        Object objDecodeNullableSerializableElement;
        int i3;
        Object objDecodeSerializableElement2;
        Object objDecodeSerializableElement3;
        Object objDecodeSerializableElement4;
        Object objDecodeSerializableElement5;
        Intrinsics.f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i4 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, BidRequestUser$$serializer.INSTANCE, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 1);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, new ArrayListSerializer(BidRequestImpression$$serializer.INSTANCE), null);
            objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, BidRequestApp$$serializer.INSTANCE, null);
            objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, BidRequestDevice$$serializer.INSTANCE, null);
            objDecodeSerializableElement5 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, BidRequestRegs$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, BidRequestExt$$serializer.INSTANCE, null);
            i3 = 127;
            i2 = iDecodeIntElement;
        } else {
            boolean z2 = true;
            int iDecodeIntElement2 = 0;
            Object objDecodeSerializableElement6 = null;
            Object objDecodeSerializableElement7 = null;
            Object objDecodeSerializableElement8 = null;
            Object objDecodeSerializableElement9 = null;
            Object objDecodeSerializableElement10 = null;
            int i5 = 0;
            Object objDecodeNullableSerializableElement2 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i4 = 6;
                        break;
                    case 0:
                        objDecodeSerializableElement6 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, BidRequestUser$$serializer.INSTANCE, objDecodeSerializableElement6);
                        i5 |= 1;
                        i4 = 6;
                        break;
                    case 1:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 1);
                        i5 |= 2;
                        i4 = 6;
                        break;
                    case 2:
                        objDecodeSerializableElement7 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, new ArrayListSerializer(BidRequestImpression$$serializer.INSTANCE), objDecodeSerializableElement7);
                        i5 |= 4;
                        i4 = 6;
                        break;
                    case 3:
                        objDecodeSerializableElement8 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, BidRequestApp$$serializer.INSTANCE, objDecodeSerializableElement8);
                        i5 |= 8;
                        break;
                    case 4:
                        objDecodeSerializableElement9 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, BidRequestDevice$$serializer.INSTANCE, objDecodeSerializableElement9);
                        i5 |= 16;
                        break;
                    case 5:
                        objDecodeSerializableElement10 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, BidRequestRegs$$serializer.INSTANCE, objDecodeSerializableElement10);
                        i5 |= 32;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, i4, BidRequestExt$$serializer.INSTANCE, objDecodeNullableSerializableElement2);
                        i5 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj = objDecodeSerializableElement6;
            i2 = iDecodeIntElement2;
            objDecodeSerializableElement = obj;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement2;
            i3 = i5;
            objDecodeSerializableElement2 = objDecodeSerializableElement7;
            objDecodeSerializableElement3 = objDecodeSerializableElement8;
            objDecodeSerializableElement4 = objDecodeSerializableElement9;
            objDecodeSerializableElement5 = objDecodeSerializableElement10;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new BidRequestBody(i3, (BidRequestUser) objDecodeSerializableElement, i2, (List) objDecodeSerializableElement2, (BidRequestApp) objDecodeSerializableElement3, (BidRequestDevice) objDecodeSerializableElement4, (BidRequestRegs) objDecodeSerializableElement5, (BidRequestExt) objDecodeNullableSerializableElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, BidRequestBody value) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        BidRequestBody.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
