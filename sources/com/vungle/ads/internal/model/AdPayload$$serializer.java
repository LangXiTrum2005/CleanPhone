package com.vungle.ads.internal.model;

import com.smartdigimkt.q0.b;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.ContextualSerializer;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/vungle/ads/internal/model/AdPayload.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/model/AdPayload;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated
public final class AdPayload$$serializer implements GeneratedSerializer<AdPayload> {
    public static final AdPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        AdPayload$$serializer adPayload$$serializer = new AdPayload$$serializer();
        INSTANCE = adPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload", adPayload$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("ads", true);
        pluginGeneratedSerialDescriptor.addElement(b.i0, true);
        pluginGeneratedSerialDescriptor.addElement("expiryWindowStart", true);
        pluginGeneratedSerialDescriptor.addElement("mraidFiles", true);
        pluginGeneratedSerialDescriptor.addElement("incentivizedTextSettings", true);
        pluginGeneratedSerialDescriptor.addElement("assetsFullyDownloaded", true);
        pluginGeneratedSerialDescriptor.addElement("indexFilePath", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AdPayload$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(new ArrayListSerializer(AdPayload$PlacementAdUnit$$serializer.INSTANCE));
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(ConfigPayload$$serializer.INSTANCE);
        KSerializer<?> nullable3 = BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE);
        KClass kClassB = Reflection.f43333a.b(ConcurrentHashMap.class);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, new ContextualSerializer(kClassB, null, new KSerializer[]{stringSerializer, stringSerializer}), new LinkedHashMapSerializer(stringSerializer, stringSerializer), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public AdPayload deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        boolean z2;
        Object objDecodeSerializableElement;
        Object objDecodeSerializableElement2;
        int i2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        char c2;
        Intrinsics.f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i3 = 6;
        int i4 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, new ArrayListSerializer(AdPayload$PlacementAdUnit$$serializer.INSTANCE), null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, ConfigPayload$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, LongSerializer.INSTANCE, null);
            KClass kClassB = Reflection.f43333a.b(ConcurrentHashMap.class);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, new ContextualSerializer(kClassB, null, new KSerializer[]{stringSerializer, stringSerializer}), null);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 5);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, stringSerializer, null);
            i2 = 127;
            z2 = zDecodeBooleanElement;
        } else {
            boolean z3 = true;
            boolean zDecodeBooleanElement2 = false;
            int i5 = 0;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement5 = null;
            Object objDecodeNullableSerializableElement6 = null;
            Object objDecodeNullableSerializableElement7 = null;
            Object objDecodeSerializableElement3 = null;
            Object objDecodeSerializableElement4 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i4 = 5;
                        break;
                    case 0:
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, new ArrayListSerializer(AdPayload$PlacementAdUnit$$serializer.INSTANCE), objDecodeNullableSerializableElement);
                        i5 |= 1;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 1:
                        objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, ConfigPayload$$serializer.INSTANCE, objDecodeNullableSerializableElement6);
                        i5 |= 2;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 2:
                        c2 = 3;
                        objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, LongSerializer.INSTANCE, objDecodeNullableSerializableElement5);
                        i5 |= 4;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 3:
                        KClass kClassB2 = Reflection.f43333a.b(ConcurrentHashMap.class);
                        StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                        c2 = 3;
                        objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, new ContextualSerializer(kClassB2, null, new KSerializer[]{stringSerializer2, stringSerializer2}), objDecodeSerializableElement3);
                        i5 |= 8;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 4:
                        StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                        objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 4, new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), objDecodeSerializableElement4);
                        i5 |= 16;
                        i3 = 6;
                        break;
                    case 5:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, i4);
                        i5 |= 32;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, i3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement7);
                        i5 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement7;
            z2 = zDecodeBooleanElement2;
            objDecodeSerializableElement = objDecodeSerializableElement3;
            objDecodeSerializableElement2 = objDecodeSerializableElement4;
            i2 = i5;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement5;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement6;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new AdPayload(i2, (List) objDecodeNullableSerializableElement, (ConfigPayload) objDecodeNullableSerializableElement4, (Long) objDecodeNullableSerializableElement3, (ConcurrentHashMap) objDecodeSerializableElement, (Map) objDecodeSerializableElement2, z2, (String) objDecodeNullableSerializableElement2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, AdPayload value) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        AdPayload.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
