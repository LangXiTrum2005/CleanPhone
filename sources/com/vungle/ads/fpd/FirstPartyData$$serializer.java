package com.vungle.ads.fpd;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/vungle/ads/fpd/FirstPartyData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/fpd/FirstPartyData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated
public final class FirstPartyData$$serializer implements GeneratedSerializer<FirstPartyData> {
    public static final FirstPartyData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        FirstPartyData$$serializer firstPartyData$$serializer = new FirstPartyData$$serializer();
        INSTANCE = firstPartyData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.fpd.FirstPartyData", firstPartyData$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("model_version", true);
        pluginGeneratedSerialDescriptor.addElement("session_context", true);
        pluginGeneratedSerialDescriptor.addElement("demographic", true);
        pluginGeneratedSerialDescriptor.addElement("location", true);
        pluginGeneratedSerialDescriptor.addElement("revenue", true);
        pluginGeneratedSerialDescriptor.addElement("custom_data", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FirstPartyData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(SessionContext$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(Demographic$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(Location$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(Revenue$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(new LinkedHashMapSerializer(stringSerializer, stringSerializer))};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public FirstPartyData deserialize(Decoder decoder) {
        int i2;
        String str;
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Intrinsics.f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        boolean z2 = true;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SessionContext$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, Demographic$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, Location$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, Revenue$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null);
            str = strDecodeStringElement2;
            i2 = 63;
        } else {
            boolean z3 = true;
            int i3 = 0;
            Object objDecodeNullableSerializableElement6 = null;
            Object objDecodeNullableSerializableElement7 = null;
            Object objDecodeNullableSerializableElement8 = null;
            Object objDecodeNullableSerializableElement9 = null;
            Object objDecodeNullableSerializableElement10 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        z2 = z2;
                        break;
                    case 0:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
                        i3 |= 1;
                        z2 = z2;
                        break;
                    case 1:
                        objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SessionContext$$serializer.INSTANCE, objDecodeNullableSerializableElement6);
                        i3 |= 2;
                        z2 = true;
                        break;
                    case 2:
                        objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, Demographic$$serializer.INSTANCE, objDecodeNullableSerializableElement7);
                        i3 |= 4;
                        z2 = true;
                        break;
                    case 3:
                        objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, Location$$serializer.INSTANCE, objDecodeNullableSerializableElement8);
                        i3 |= 8;
                        z2 = true;
                        break;
                    case 4:
                        objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, Revenue$$serializer.INSTANCE, objDecodeNullableSerializableElement9);
                        i3 |= 16;
                        z2 = true;
                        break;
                    case 5:
                        StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                        objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), objDecodeNullableSerializableElement10);
                        i3 |= 32;
                        z2 = true;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i2 = i3;
            str = strDecodeStringElement;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement6;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement7;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement8;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement9;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement10;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new FirstPartyData(i2, str, (SessionContext) objDecodeNullableSerializableElement, (Demographic) objDecodeNullableSerializableElement2, (Location) objDecodeNullableSerializableElement3, (Revenue) objDecodeNullableSerializableElement4, (Map) objDecodeNullableSerializableElement5, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, FirstPartyData value) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        FirstPartyData.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
