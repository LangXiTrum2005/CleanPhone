package com.chartboost.heliumsdk.network.model;

import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.mediationsdk.metadata.a;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/chartboost/heliumsdk/network/model/MetricsData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/chartboost/heliumsdk/network/model/MetricsData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
public final class MetricsData$$serializer implements GeneratedSerializer<MetricsData> {
    public static final MetricsData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MetricsData$$serializer metricsData$$serializer = new MetricsData$$serializer();
        INSTANCE = metricsData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.heliumsdk.network.model.MetricsData", metricsData$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("network_type", true);
        pluginGeneratedSerialDescriptor.addElement("line_item_id", true);
        pluginGeneratedSerialDescriptor.addElement("partner_placement", true);
        pluginGeneratedSerialDescriptor.addElement("partner", true);
        pluginGeneratedSerialDescriptor.addElement("start", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.END, true);
        pluginGeneratedSerialDescriptor.addElement("duration", true);
        pluginGeneratedSerialDescriptor.addElement("is_success", false);
        pluginGeneratedSerialDescriptor.addElement("helium_error", true);
        pluginGeneratedSerialDescriptor.addElement("helium_error_code", true);
        pluginGeneratedSerialDescriptor.addElement("helium_error_message", true);
        pluginGeneratedSerialDescriptor.addElement("partner_sdk_version", true);
        pluginGeneratedSerialDescriptor.addElement("partner_adapter_version", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MetricsData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(EnumsKt.createSimpleEnumSerializer("com.chartboost.heliumsdk.domain.ChartboostMediationError", ChartboostMediationError.values())), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MetricsData deserialize(Decoder decoder) {
        Object obj;
        Object objDecodeNullableSerializableElement;
        Object obj2;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        int i2;
        boolean z2;
        Object objDecodeNullableSerializableElement7;
        Object objDecodeNullableSerializableElement8;
        Object objDecodeNullableSerializableElement9;
        Object objDecodeNullableSerializableElement10;
        Intrinsics.f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, stringSerializer, null);
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, stringSerializer, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, longSerializer, null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, longSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, longSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 7);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, EnumsKt.createSimpleEnumSerializer("com.chartboost.heliumsdk.domain.ChartboostMediationError", ChartboostMediationError.values()), null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, stringSerializer, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, stringSerializer, null);
            Object objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, stringSerializer, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, stringSerializer, null);
            z2 = zDecodeBooleanElement;
            obj = objDecodeNullableSerializableElement12;
            i2 = 8191;
            obj2 = objDecodeNullableSerializableElement11;
        } else {
            boolean zDecodeBooleanElement2 = false;
            Object objDecodeNullableSerializableElement13 = null;
            Object objDecodeNullableSerializableElement14 = null;
            Object objDecodeNullableSerializableElement15 = null;
            Object objDecodeNullableSerializableElement16 = null;
            Object objDecodeNullableSerializableElement17 = null;
            Object objDecodeNullableSerializableElement18 = null;
            Object objDecodeNullableSerializableElement19 = null;
            Object objDecodeNullableSerializableElement20 = null;
            Object objDecodeNullableSerializableElement21 = null;
            Object objDecodeNullableSerializableElement22 = null;
            boolean z3 = true;
            int i3 = 0;
            Object objDecodeNullableSerializableElement23 = null;
            Object objDecodeNullableSerializableElement24 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        i3 = i3;
                        break;
                    case 0:
                        i3 |= 1;
                        objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, objDecodeNullableSerializableElement22);
                        objDecodeNullableSerializableElement23 = objDecodeNullableSerializableElement23;
                        break;
                    case 1:
                        objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, objDecodeNullableSerializableElement23);
                        i3 |= 2;
                        break;
                    case 2:
                        objDecodeNullableSerializableElement24 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement24);
                        i3 |= 4;
                        objDecodeNullableSerializableElement23 = objDecodeNullableSerializableElement23;
                        break;
                    case 3:
                        objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement21);
                        i3 |= 8;
                        objDecodeNullableSerializableElement23 = objDecodeNullableSerializableElement23;
                        break;
                    case 4:
                        objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, LongSerializer.INSTANCE, objDecodeNullableSerializableElement18);
                        i3 |= 16;
                        objDecodeNullableSerializableElement23 = objDecodeNullableSerializableElement23;
                        break;
                    case 5:
                        objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, LongSerializer.INSTANCE, objDecodeNullableSerializableElement20);
                        i3 |= 32;
                        objDecodeNullableSerializableElement23 = objDecodeNullableSerializableElement23;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, LongSerializer.INSTANCE, objDecodeNullableSerializableElement17);
                        i3 |= 64;
                        objDecodeNullableSerializableElement23 = objDecodeNullableSerializableElement23;
                        break;
                    case 7:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 7);
                        i3 |= 128;
                        objDecodeNullableSerializableElement23 = objDecodeNullableSerializableElement23;
                        break;
                    case 8:
                        objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, EnumsKt.createSimpleEnumSerializer("com.chartboost.heliumsdk.domain.ChartboostMediationError", ChartboostMediationError.values()), objDecodeNullableSerializableElement16);
                        i3 |= 256;
                        objDecodeNullableSerializableElement23 = objDecodeNullableSerializableElement23;
                        break;
                    case 9:
                        objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, StringSerializer.INSTANCE, objDecodeNullableSerializableElement15);
                        i3 |= 512;
                        objDecodeNullableSerializableElement23 = objDecodeNullableSerializableElement23;
                        break;
                    case 10:
                        objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, objDecodeNullableSerializableElement19);
                        i3 |= 1024;
                        objDecodeNullableSerializableElement23 = objDecodeNullableSerializableElement23;
                        break;
                    case 11:
                        objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, StringSerializer.INSTANCE, objDecodeNullableSerializableElement14);
                        i3 |= a.f25965n;
                        objDecodeNullableSerializableElement23 = objDecodeNullableSerializableElement23;
                        break;
                    case 12:
                        objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, StringSerializer.INSTANCE, objDecodeNullableSerializableElement13);
                        i3 |= 4096;
                        objDecodeNullableSerializableElement23 = objDecodeNullableSerializableElement23;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            int i4 = i3;
            Object obj3 = objDecodeNullableSerializableElement22;
            Object obj4 = objDecodeNullableSerializableElement23;
            Object obj5 = objDecodeNullableSerializableElement15;
            obj = objDecodeNullableSerializableElement14;
            objDecodeNullableSerializableElement = obj5;
            obj2 = obj3;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement13;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement16;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement17;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement19;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement20;
            i2 = i4;
            z2 = zDecodeBooleanElement2;
            objDecodeNullableSerializableElement7 = objDecodeNullableSerializableElement18;
            objDecodeNullableSerializableElement8 = objDecodeNullableSerializableElement21;
            objDecodeNullableSerializableElement9 = objDecodeNullableSerializableElement24;
            objDecodeNullableSerializableElement10 = obj4;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new MetricsData(i2, (String) obj2, (String) objDecodeNullableSerializableElement10, (String) objDecodeNullableSerializableElement9, (String) objDecodeNullableSerializableElement8, (Long) objDecodeNullableSerializableElement7, (Long) objDecodeNullableSerializableElement6, (Long) objDecodeNullableSerializableElement4, z2, (ChartboostMediationError) objDecodeNullableSerializableElement3, (String) objDecodeNullableSerializableElement, (String) objDecodeNullableSerializableElement5, (String) obj, (String) objDecodeNullableSerializableElement2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, MetricsData value) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        MetricsData.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
