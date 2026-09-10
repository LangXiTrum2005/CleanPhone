package com.chartboost.heliumsdk.network.model;

import com.chartboost.heliumsdk.domain.MetricsError;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/chartboost/heliumsdk/network/model/MetricsRequestBody.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/chartboost/heliumsdk/network/model/MetricsRequestBody;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
public final class MetricsRequestBody$$serializer implements GeneratedSerializer<MetricsRequestBody> {
    public static final MetricsRequestBody$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MetricsRequestBody$$serializer metricsRequestBody$$serializer = new MetricsRequestBody$$serializer();
        INSTANCE = metricsRequestBody$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.heliumsdk.network.model.MetricsRequestBody", metricsRequestBody$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("auction_id", true);
        pluginGeneratedSerialDescriptor.addElement("queue_id", true);
        pluginGeneratedSerialDescriptor.addElement("placement_type", true);
        pluginGeneratedSerialDescriptor.addElement("size", true);
        pluginGeneratedSerialDescriptor.addElement("start", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.END, true);
        pluginGeneratedSerialDescriptor.addElement("duration", true);
        pluginGeneratedSerialDescriptor.addElement("background_duration", true);
        pluginGeneratedSerialDescriptor.addElement("result", true);
        pluginGeneratedSerialDescriptor.addElement("metrics", false);
        pluginGeneratedSerialDescriptor.addElement("error", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MetricsRequestBody$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable4 = BuiltinSerializersKt.getNullable(BannerAdDimensions$$serializer.INSTANCE);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        KSerializer<?> nullable5 = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer<?> nullable6 = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer<?> nullable7 = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer<?> nullable8 = BuiltinSerializersKt.getNullable(longSerializer);
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, BuiltinSerializersKt.getNullable(new ContextualSerializer(reflectionFactory.b(String.class), BuiltinSerializersKt.getNullable(stringSerializer), new KSerializer[0])), new LinkedHashSetSerializer(MetricsData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(new ContextualSerializer(reflectionFactory.b(MetricsError.class), BuiltinSerializersKt.getNullable(MetricsError.INSTANCE.serializer()), new KSerializer[0]))};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MetricsRequestBody deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        Object objDecodeNullableSerializableElement7;
        Object obj;
        int i2;
        Object objDecodeSerializableElement;
        Object objDecodeNullableSerializableElement8;
        Object objDecodeNullableSerializableElement9;
        Intrinsics.f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        Class<MetricsError> cls = MetricsError.class;
        Object objDecodeNullableSerializableElement10 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, stringSerializer, null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            Object objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, BannerAdDimensions$$serializer.INSTANCE, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, longSerializer, null);
            Object objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, longSerializer, null);
            Object objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, longSerializer, null);
            Object objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, longSerializer, null);
            ReflectionFactory reflectionFactory = Reflection.f43333a;
            Object objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, new ContextualSerializer(reflectionFactory.b(String.class), BuiltinSerializersKt.getNullable(stringSerializer), new KSerializer[0]), null);
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 9, new LinkedHashSetSerializer(MetricsData$$serializer.INSTANCE), null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, new ContextualSerializer(reflectionFactory.b(cls), BuiltinSerializersKt.getNullable(MetricsError.INSTANCE.serializer()), new KSerializer[0]), null);
            i2 = 2047;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement12;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement13;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement14;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement15;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement16;
            obj = objDecodeNullableSerializableElement11;
        } else {
            Object objDecodeNullableSerializableElement17 = null;
            objDecodeNullableSerializableElement = null;
            objDecodeNullableSerializableElement2 = null;
            objDecodeNullableSerializableElement3 = null;
            objDecodeNullableSerializableElement4 = null;
            Object objDecodeSerializableElement2 = null;
            objDecodeNullableSerializableElement5 = null;
            Object objDecodeNullableSerializableElement18 = null;
            Object objDecodeNullableSerializableElement19 = null;
            boolean z2 = true;
            Object objDecodeNullableSerializableElement20 = null;
            int i3 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        z2 = false;
                        objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement10;
                        cls = cls;
                        break;
                    case 0:
                        objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, objDecodeNullableSerializableElement10);
                        i3 |= 1;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        cls = cls;
                        break;
                    case 1:
                        i3 |= 2;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        cls = cls;
                        objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, objDecodeNullableSerializableElement17);
                        objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement10;
                        break;
                    case 2:
                        i3 |= 4;
                        objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement20);
                        break;
                    case 3:
                        objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, BannerAdDimensions$$serializer.INSTANCE, objDecodeNullableSerializableElement18);
                        i3 |= 8;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 4:
                        objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, LongSerializer.INSTANCE, objDecodeNullableSerializableElement4);
                        i3 |= 16;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 5:
                        objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, LongSerializer.INSTANCE, objDecodeNullableSerializableElement5);
                        i3 |= 32;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, LongSerializer.INSTANCE, objDecodeNullableSerializableElement3);
                        i3 |= 64;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 7:
                        objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, LongSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                        i3 |= 128;
                        break;
                    case 8:
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, new ContextualSerializer(Reflection.f43333a.b(String.class), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), new KSerializer[0]), objDecodeNullableSerializableElement);
                        i3 |= 256;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 9:
                        objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 9, new LinkedHashSetSerializer(MetricsData$$serializer.INSTANCE), objDecodeSerializableElement2);
                        i3 |= 512;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 10:
                        objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, new ContextualSerializer(Reflection.f43333a.b(cls), BuiltinSerializersKt.getNullable(MetricsError.INSTANCE.serializer()), new KSerializer[0]), objDecodeNullableSerializableElement19);
                        i3 |= 1024;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj2 = objDecodeNullableSerializableElement20;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement17;
            Object obj3 = objDecodeNullableSerializableElement10;
            Object obj4 = objDecodeNullableSerializableElement18;
            objDecodeNullableSerializableElement7 = obj2;
            obj = obj4;
            i2 = i3;
            objDecodeSerializableElement = objDecodeSerializableElement2;
            objDecodeNullableSerializableElement8 = obj3;
            objDecodeNullableSerializableElement9 = objDecodeNullableSerializableElement19;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new MetricsRequestBody(i2, (String) objDecodeNullableSerializableElement8, (String) objDecodeNullableSerializableElement6, (String) objDecodeNullableSerializableElement7, (BannerAdDimensions) obj, (Long) objDecodeNullableSerializableElement4, (Long) objDecodeNullableSerializableElement5, (Long) objDecodeNullableSerializableElement3, (Long) objDecodeNullableSerializableElement2, (String) objDecodeNullableSerializableElement, (Set) objDecodeSerializableElement, (MetricsError) objDecodeNullableSerializableElement9, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, MetricsRequestBody value) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        MetricsRequestBody.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
