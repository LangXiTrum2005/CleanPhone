package com.chartboost.heliumsdk.domain;

import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.p004ironsource.mediationsdk.metadata.a;
import com.thinkup.core.oo.n0;
import java.util.List;
import java.util.Map;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/chartboost/heliumsdk/domain/BidResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/chartboost/heliumsdk/domain/BidResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
public final class BidResponse$$serializer implements GeneratedSerializer<BidResponse> {
    public static final BidResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BidResponse$$serializer bidResponse$$serializer = new BidResponse$$serializer();
        INSTANCE = bidResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.heliumsdk.domain.BidResponse", bidResponse$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("bidid", true);
        pluginGeneratedSerialDescriptor.addElement(BidResponsed.KEY_CUR, true);
        pluginGeneratedSerialDescriptor.addElement("bid", true);
        pluginGeneratedSerialDescriptor.addElement("seat", false);
        pluginGeneratedSerialDescriptor.addElement("helium_bid_id", false);
        pluginGeneratedSerialDescriptor.addElement("isMediation", true);
        pluginGeneratedSerialDescriptor.addElement("partnerPlacementName", true);
        pluginGeneratedSerialDescriptor.addElement("lineItemId", true);
        pluginGeneratedSerialDescriptor.addElement("adRevenue", true);
        pluginGeneratedSerialDescriptor.addElement("cpmPrice", true);
        pluginGeneratedSerialDescriptor.addElement(n0.o.mo, true);
        pluginGeneratedSerialDescriptor.addElement("partnerSettings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BidResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(BidInfo$$serializer.INSTANCE);
        KSerializer<?> nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable5 = BuiltinSerializersKt.getNullable(JsonElementSerializer.INSTANCE);
        LinkedHashMapSerializer linkedHashMapSerializer = new LinkedHashMapSerializer(stringSerializer, stringSerializer);
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, arrayListSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, nullable4, doubleSerializer, doubleSerializer, nullable5, linkedHashMapSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public BidResponse deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        double dDecodeDoubleElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeSerializableElement;
        int i2;
        Object obj;
        Object obj2;
        Object objDecodeSerializableElement2;
        String str;
        String str2;
        String str3;
        boolean z2;
        double d;
        Intrinsics.f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i3 = 9;
        int i4 = 7;
        int i5 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, stringSerializer, null);
            Object objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            Object objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            Object objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, new ArrayListSerializer(BidInfo$$serializer.INSTANCE), null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 4);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 5);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 6);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 7);
            Object objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, stringSerializer, null);
            double dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor2, 9);
            double dDecodeDoubleElement3 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor2, 10);
            Object objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, JsonElementSerializer.INSTANCE, null);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 12, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null);
            i2 = 8191;
            obj = objDecodeNullableSerializableElement5;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement7;
            str2 = strDecodeStringElement2;
            str = strDecodeStringElement;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement6;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement8;
            dDecodeDoubleElement = dDecodeDoubleElement2;
            obj2 = objDecodeNullableSerializableElement4;
            d = dDecodeDoubleElement3;
            objDecodeSerializableElement = objDecodeSerializableElement3;
            str3 = strDecodeStringElement3;
            z2 = zDecodeBooleanElement;
        } else {
            Object objDecodeNullableSerializableElement9 = null;
            Object objDecodeSerializableElement4 = null;
            objDecodeNullableSerializableElement = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            dDecodeDoubleElement = 0.0d;
            double dDecodeDoubleElement4 = 0.0d;
            boolean z3 = true;
            boolean zDecodeBooleanElement2 = false;
            Object objDecodeNullableSerializableElement10 = null;
            objDecodeNullableSerializableElement2 = null;
            objDecodeNullableSerializableElement3 = null;
            objDecodeSerializableElement = null;
            int i6 = 0;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i4 = 7;
                        i5 = 5;
                        break;
                    case 0:
                        objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, objDecodeNullableSerializableElement9);
                        i6 |= 1;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        break;
                    case 1:
                        objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, objDecodeNullableSerializableElement10);
                        i6 |= 2;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        break;
                    case 2:
                        objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                        i6 |= 4;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        break;
                    case 3:
                        objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, new ArrayListSerializer(BidInfo$$serializer.INSTANCE), objDecodeSerializableElement);
                        i6 |= 8;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        break;
                    case 4:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 4);
                        i6 |= 16;
                        i3 = 9;
                        i5 = 5;
                        break;
                    case 5:
                        int i7 = i5;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, i7);
                        i6 |= 32;
                        i5 = i7;
                        i3 = 9;
                        break;
                    case 6:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 6);
                        i6 |= 64;
                        i3 = 9;
                        i5 = 5;
                        break;
                    case 7:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, i4);
                        i6 |= 128;
                        i3 = 9;
                        i5 = 5;
                        break;
                    case 8:
                        objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, objDecodeNullableSerializableElement3);
                        i6 |= 256;
                        i3 = 9;
                        i5 = 5;
                        break;
                    case 9:
                        dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(descriptor2, i3);
                        i6 |= 512;
                        i5 = 5;
                        break;
                    case 10:
                        dDecodeDoubleElement4 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor2, 10);
                        i6 |= 1024;
                        i5 = 5;
                        break;
                    case 11:
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, JsonElementSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i6 |= a.f25965n;
                        i5 = 5;
                        break;
                    case 12:
                        StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                        objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 12, new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), objDecodeSerializableElement4);
                        i6 |= 4096;
                        i5 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj3 = objDecodeNullableSerializableElement10;
            i2 = i6;
            obj = obj3;
            obj2 = objDecodeNullableSerializableElement9;
            objDecodeSerializableElement2 = objDecodeSerializableElement4;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            z2 = zDecodeBooleanElement2;
            d = dDecodeDoubleElement4;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new BidResponse(i2, (String) obj2, (String) obj, (String) objDecodeNullableSerializableElement2, (List) objDecodeSerializableElement, str, str2, z2, str3, (String) objDecodeNullableSerializableElement3, dDecodeDoubleElement, d, (JsonElement) objDecodeNullableSerializableElement, (Map) objDecodeSerializableElement2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, BidResponse value) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        BidResponse.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
