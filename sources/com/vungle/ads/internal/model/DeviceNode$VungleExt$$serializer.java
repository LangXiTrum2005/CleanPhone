package com.vungle.ads.internal.model;

import com.applovin.shadow.okio.Segment;
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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/vungle/ads/internal/model/DeviceNode.VungleExt.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated
public final class DeviceNode$VungleExt$$serializer implements GeneratedSerializer<DeviceNode.VungleExt> {
    public static final DeviceNode$VungleExt$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        DeviceNode$VungleExt$$serializer deviceNode$VungleExt$$serializer = new DeviceNode$VungleExt$$serializer();
        INSTANCE = deviceNode$VungleExt$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.DeviceNode.VungleExt", deviceNode$VungleExt$$serializer, 22);
        pluginGeneratedSerialDescriptor.addElement("is_google_play_services_available", true);
        pluginGeneratedSerialDescriptor.addElement("app_set_id", true);
        pluginGeneratedSerialDescriptor.addElement("app_set_id_scope", true);
        pluginGeneratedSerialDescriptor.addElement("battery_level", true);
        pluginGeneratedSerialDescriptor.addElement("battery_state", true);
        pluginGeneratedSerialDescriptor.addElement("battery_saver_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("connection_type", true);
        pluginGeneratedSerialDescriptor.addElement("connection_type_detail", true);
        pluginGeneratedSerialDescriptor.addElement("locale", true);
        pluginGeneratedSerialDescriptor.addElement("language", true);
        pluginGeneratedSerialDescriptor.addElement("time_zone", true);
        pluginGeneratedSerialDescriptor.addElement("volume_level", true);
        pluginGeneratedSerialDescriptor.addElement("sound_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("is_tv", true);
        pluginGeneratedSerialDescriptor.addElement("sd_card_available", true);
        pluginGeneratedSerialDescriptor.addElement("is_sideload_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("gaid", true);
        pluginGeneratedSerialDescriptor.addElement("amazon_advertising_id", true);
        pluginGeneratedSerialDescriptor.addElement("sit", true);
        pluginGeneratedSerialDescriptor.addElement("oit", true);
        pluginGeneratedSerialDescriptor.addElement("ort", true);
        pluginGeneratedSerialDescriptor.addElement("obt", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DeviceNode$VungleExt$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer<?> nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable5 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable6 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable7 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable8 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable9 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer<?> nullable10 = BuiltinSerializersKt.getNullable(stringSerializer);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        KSerializer<?> nullable11 = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer<?> nullable12 = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer<?> nullable13 = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer<?> nullable14 = BuiltinSerializersKt.getNullable(longSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, nullable, nullable2, floatSerializer, nullable3, intSerializer, nullable4, nullable5, nullable6, nullable7, nullable8, floatSerializer, intSerializer, booleanSerializer, intSerializer, booleanSerializer, nullable9, nullable10, nullable11, nullable12, nullable13, nullable14};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public DeviceNode.VungleExt deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object obj;
        Object obj2;
        int i2;
        Object objDecodeNullableSerializableElement3;
        Object obj3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        boolean z2;
        float f;
        Object objDecodeNullableSerializableElement7;
        Object objDecodeNullableSerializableElement8;
        int i3;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        float f2;
        Object objDecodeNullableSerializableElement9;
        Object objDecodeNullableSerializableElement10;
        Object objDecodeNullableSerializableElement11;
        int i6;
        Object obj4;
        Intrinsics.f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i7 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, null);
            float fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 3);
            objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 5);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, stringSerializer, null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, stringSerializer, null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, stringSerializer, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, stringSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, stringSerializer, null);
            float fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 11);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 12);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 13);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 14);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 15);
            obj2 = objDecodeNullableSerializableElement12;
            Object objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, stringSerializer, null);
            Object objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, stringSerializer, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            obj3 = objDecodeNullableSerializableElement14;
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 18, longSerializer, null);
            Object objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 19, longSerializer, null);
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 20, longSerializer, null);
            f = fDecodeFloatElement;
            i2 = 4194303;
            i3 = iDecodeIntElement2;
            i5 = iDecodeIntElement;
            f2 = fDecodeFloatElement2;
            z2 = zDecodeBooleanElement3;
            i4 = iDecodeIntElement3;
            z4 = zDecodeBooleanElement2;
            z3 = zDecodeBooleanElement;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement15;
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 21, longSerializer, null);
            obj = objDecodeNullableSerializableElement13;
        } else {
            objDecodeNullableSerializableElement = null;
            boolean z5 = true;
            Object objDecodeNullableSerializableElement16 = null;
            Object objDecodeNullableSerializableElement17 = null;
            Object objDecodeNullableSerializableElement18 = null;
            Object objDecodeNullableSerializableElement19 = null;
            Object objDecodeNullableSerializableElement20 = null;
            objDecodeNullableSerializableElement2 = null;
            Object objDecodeNullableSerializableElement21 = null;
            Object objDecodeNullableSerializableElement22 = null;
            Object objDecodeNullableSerializableElement23 = null;
            Object objDecodeNullableSerializableElement24 = null;
            Object objDecodeNullableSerializableElement25 = null;
            Object objDecodeNullableSerializableElement26 = null;
            boolean zDecodeBooleanElement4 = false;
            int iDecodeIntElement4 = 0;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            float fDecodeFloatElement3 = 0.0f;
            float fDecodeFloatElement4 = 0.0f;
            Object objDecodeNullableSerializableElement27 = null;
            while (z5) {
                Object obj5 = objDecodeNullableSerializableElement16;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        objDecodeNullableSerializableElement16 = obj5;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 0:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 0);
                        i7 |= 1;
                        objDecodeNullableSerializableElement16 = obj5;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 1:
                        obj4 = objDecodeNullableSerializableElement20;
                        i7 |= 2;
                        objDecodeNullableSerializableElement26 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, objDecodeNullableSerializableElement26);
                        objDecodeNullableSerializableElement16 = obj5;
                        objDecodeNullableSerializableElement20 = obj4;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        break;
                    case 2:
                        obj4 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, obj5);
                        i7 |= 4;
                        objDecodeNullableSerializableElement20 = obj4;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        break;
                    case 3:
                        fDecodeFloatElement3 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 3);
                        i7 |= 8;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        objDecodeNullableSerializableElement16 = obj5;
                        break;
                    case 4:
                        i7 |= 16;
                        objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement20);
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        objDecodeNullableSerializableElement16 = obj5;
                        break;
                    case 5:
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 5);
                        i7 |= 32;
                        objDecodeNullableSerializableElement16 = obj5;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, objDecodeNullableSerializableElement17);
                        i7 |= 64;
                        objDecodeNullableSerializableElement16 = obj5;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 7:
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, objDecodeNullableSerializableElement18);
                        i7 |= 128;
                        objDecodeNullableSerializableElement16 = obj5;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 8:
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement25 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, objDecodeNullableSerializableElement25);
                        i7 |= 256;
                        objDecodeNullableSerializableElement16 = obj5;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 9:
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement24 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, StringSerializer.INSTANCE, objDecodeNullableSerializableElement24);
                        i7 |= 512;
                        objDecodeNullableSerializableElement16 = obj5;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 10:
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, objDecodeNullableSerializableElement23);
                        i7 |= 1024;
                        objDecodeNullableSerializableElement16 = obj5;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 11:
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        fDecodeFloatElement4 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 11);
                        i7 |= a.f25965n;
                        objDecodeNullableSerializableElement16 = obj5;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 12:
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 12);
                        i7 |= 4096;
                        objDecodeNullableSerializableElement16 = obj5;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 13:
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 13);
                        i7 |= Segment.SIZE;
                        objDecodeNullableSerializableElement16 = obj5;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 14:
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 14);
                        i7 |= 16384;
                        objDecodeNullableSerializableElement16 = obj5;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 15:
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 15);
                        i7 |= 32768;
                        objDecodeNullableSerializableElement16 = obj5;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 16:
                        objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, StringSerializer.INSTANCE, objDecodeNullableSerializableElement19);
                        i6 = 65536;
                        i7 |= i6;
                        objDecodeNullableSerializableElement16 = obj5;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 17:
                        objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, StringSerializer.INSTANCE, objDecodeNullableSerializableElement22);
                        i6 = 131072;
                        i7 |= i6;
                        objDecodeNullableSerializableElement16 = obj5;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 18:
                        objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 18, LongSerializer.INSTANCE, objDecodeNullableSerializableElement21);
                        i6 = 262144;
                        i7 |= i6;
                        objDecodeNullableSerializableElement16 = obj5;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 19:
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 19, LongSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i6 = 524288;
                        i7 |= i6;
                        objDecodeNullableSerializableElement16 = obj5;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 20:
                        objDecodeNullableSerializableElement27 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 20, LongSerializer.INSTANCE, objDecodeNullableSerializableElement27);
                        i6 = 1048576;
                        i7 |= i6;
                        objDecodeNullableSerializableElement16 = obj5;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 21:
                        objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 21, LongSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                        i6 = 2097152;
                        i7 |= i6;
                        objDecodeNullableSerializableElement16 = obj5;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj6 = objDecodeNullableSerializableElement20;
            Object obj7 = objDecodeNullableSerializableElement26;
            Object obj8 = objDecodeNullableSerializableElement16;
            obj = objDecodeNullableSerializableElement19;
            obj2 = obj7;
            i2 = i7;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement21;
            obj3 = objDecodeNullableSerializableElement22;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement23;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement24;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement25;
            z2 = zDecodeBooleanElement4;
            f = fDecodeFloatElement3;
            objDecodeNullableSerializableElement7 = obj8;
            objDecodeNullableSerializableElement8 = objDecodeNullableSerializableElement17;
            i3 = iDecodeIntElement4;
            z3 = zDecodeBooleanElement5;
            z4 = zDecodeBooleanElement6;
            i4 = iDecodeIntElement5;
            i5 = iDecodeIntElement6;
            f2 = fDecodeFloatElement4;
            objDecodeNullableSerializableElement9 = objDecodeNullableSerializableElement18;
            objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement27;
            objDecodeNullableSerializableElement11 = obj6;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new DeviceNode.VungleExt(i2, z3, (String) obj2, (Integer) objDecodeNullableSerializableElement7, f, (String) objDecodeNullableSerializableElement11, i5, (String) objDecodeNullableSerializableElement8, (String) objDecodeNullableSerializableElement9, (String) objDecodeNullableSerializableElement6, (String) objDecodeNullableSerializableElement5, (String) objDecodeNullableSerializableElement4, f2, i3, z4, i4, z2, (String) obj, (String) obj3, (Long) objDecodeNullableSerializableElement3, (Long) objDecodeNullableSerializableElement, (Long) objDecodeNullableSerializableElement10, (Long) objDecodeNullableSerializableElement2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, DeviceNode.VungleExt value) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        DeviceNode.VungleExt.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
