package com.vungle.ads.internal.model;

import com.applovin.shadow.okio.Segment;
import com.p004ironsource.mediationsdk.metadata.a;
import com.p004ironsource.uq;
import com.smartdigimkt.q0.b;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/vungle/ads/internal/model/ConfigPayload.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated
public final class ConfigPayload$$serializer implements GeneratedSerializer<ConfigPayload> {
    public static final ConfigPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        ConfigPayload$$serializer configPayload$$serializer = new ConfigPayload$$serializer();
        INSTANCE = configPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload", configPayload$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("reuse_assets", true);
        pluginGeneratedSerialDescriptor.addElement(b.i0, true);
        pluginGeneratedSerialDescriptor.addElement("endpoints", true);
        pluginGeneratedSerialDescriptor.addElement("log_metrics", true);
        pluginGeneratedSerialDescriptor.addElement(uq.f27440c, true);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement(Cookie.CONFIG_EXTENSION, true);
        pluginGeneratedSerialDescriptor.addElement(Cookie.COPPA_DISABLE_AD_ID, true);
        pluginGeneratedSerialDescriptor.addElement("ri_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("session_timeout", true);
        pluginGeneratedSerialDescriptor.addElement("wait_for_connectivity_for_tpat", true);
        pluginGeneratedSerialDescriptor.addElement("sdk_session_timeout", true);
        pluginGeneratedSerialDescriptor.addElement("signals_disabled", true);
        pluginGeneratedSerialDescriptor.addElement("fpd_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("rta_debugging", true);
        pluginGeneratedSerialDescriptor.addElement("config_last_validated_ts", true);
        pluginGeneratedSerialDescriptor.addElement("auto_redirect", true);
        pluginGeneratedSerialDescriptor.addElement("retry_prioritized_tpat", true);
        pluginGeneratedSerialDescriptor.addElement("enable_ot", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ConfigPayload$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(ConfigPayload$CleverCache$$serializer.INSTANCE);
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(ConfigPayload$ConfigSettings$$serializer.INSTANCE);
        KSerializer<?> nullable3 = BuiltinSerializersKt.getNullable(ConfigPayload$Endpoints$$serializer.INSTANCE);
        KSerializer<?> nullable4 = BuiltinSerializersKt.getNullable(ConfigPayload$LogMetricsSettings$$serializer.INSTANCE);
        KSerializer<?> nullable5 = BuiltinSerializersKt.getNullable(new ArrayListSerializer(Placement$$serializer.INSTANCE));
        KSerializer<?> nullable6 = BuiltinSerializersKt.getNullable(ConfigPayload$UserPrivacy$$serializer.INSTANCE);
        KSerializer<?> nullable7 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KSerializer<?> nullable8 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer<?> nullable9 = BuiltinSerializersKt.getNullable(booleanSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, nullable9, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(ConfigPayload$AutoRedirect$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ConfigPayload deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object obj;
        Object obj2;
        Object obj3;
        Object objDecodeNullableSerializableElement3;
        Object obj4;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        Object objDecodeNullableSerializableElement7;
        int i2;
        Object obj5;
        Object obj6;
        Object objDecodeNullableSerializableElement8;
        Object objDecodeNullableSerializableElement9;
        Object objDecodeNullableSerializableElement10;
        Object objDecodeNullableSerializableElement11;
        Object objDecodeNullableSerializableElement12;
        Object objDecodeNullableSerializableElement13;
        Object obj7;
        Intrinsics.f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Object objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, new ArrayListSerializer(Placement$$serializer.INSTANCE), null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, booleanSerializer, null);
            objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, booleanSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, intSerializer, null);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, booleanSerializer, null);
            Object objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, intSerializer, null);
            Object objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, booleanSerializer, null);
            obj6 = objDecodeNullableSerializableElement17;
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, booleanSerializer, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 14, booleanSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 15, LongSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, booleanSerializer, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 18, booleanSerializer, null);
            obj3 = objDecodeNullableSerializableElement15;
            obj = objDecodeNullableSerializableElement20;
            obj4 = objDecodeNullableSerializableElement19;
            obj2 = objDecodeNullableSerializableElement14;
            i2 = 524287;
            obj5 = objDecodeNullableSerializableElement18;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement16;
        } else {
            boolean z2 = true;
            Object objDecodeNullableSerializableElement21 = null;
            Object objDecodeNullableSerializableElement22 = null;
            Object objDecodeNullableSerializableElement23 = null;
            Object objDecodeNullableSerializableElement24 = null;
            Object objDecodeNullableSerializableElement25 = null;
            Object objDecodeNullableSerializableElement26 = null;
            Object objDecodeNullableSerializableElement27 = null;
            Object objDecodeNullableSerializableElement28 = null;
            Object objDecodeNullableSerializableElement29 = null;
            Object objDecodeNullableSerializableElement30 = null;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement31 = null;
            Object objDecodeNullableSerializableElement32 = null;
            Object objDecodeNullableSerializableElement33 = null;
            Object objDecodeNullableSerializableElement34 = null;
            Object objDecodeNullableSerializableElement35 = null;
            Object objDecodeNullableSerializableElement36 = null;
            Object objDecodeNullableSerializableElement37 = null;
            int i3 = 0;
            Object objDecodeNullableSerializableElement38 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        obj7 = objDecodeNullableSerializableElement38;
                        z2 = false;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement21 = objDecodeNullableSerializableElement21;
                        break;
                    case 0:
                        obj7 = objDecodeNullableSerializableElement38;
                        objDecodeNullableSerializableElement37 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, objDecodeNullableSerializableElement37);
                        i3 |= 1;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement21 = objDecodeNullableSerializableElement21;
                        break;
                    case 1:
                        objDecodeNullableSerializableElement21 = objDecodeNullableSerializableElement21;
                        i3 |= 2;
                        objDecodeNullableSerializableElement38 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, objDecodeNullableSerializableElement38);
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement21 = objDecodeNullableSerializableElement21;
                        break;
                    case 2:
                        objDecodeNullableSerializableElement24 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, objDecodeNullableSerializableElement24);
                        i3 |= 4;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        break;
                    case 3:
                        objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, objDecodeNullableSerializableElement23);
                        i3 |= 8;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        break;
                    case 4:
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, new ArrayListSerializer(Placement$$serializer.INSTANCE), objDecodeNullableSerializableElement);
                        i3 |= 16;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        break;
                    case 5:
                        objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, objDecodeNullableSerializableElement21);
                        i3 |= 32;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement30 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, objDecodeNullableSerializableElement30);
                        i3 |= 64;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        break;
                    case 7:
                        objDecodeNullableSerializableElement29 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement29);
                        i3 |= 128;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        break;
                    case 8:
                        objDecodeNullableSerializableElement28 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement28);
                        i3 |= 256;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        break;
                    case 9:
                        objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, IntSerializer.INSTANCE, objDecodeNullableSerializableElement22);
                        i3 |= 512;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        break;
                    case 10:
                        objDecodeNullableSerializableElement27 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement27);
                        i3 |= 1024;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        break;
                    case 11:
                        objDecodeNullableSerializableElement26 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, IntSerializer.INSTANCE, objDecodeNullableSerializableElement26);
                        i3 |= a.f25965n;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        break;
                    case 12:
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        objDecodeNullableSerializableElement31 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement31);
                        i3 |= 4096;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement32 = objDecodeNullableSerializableElement32;
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        break;
                    case 13:
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        objDecodeNullableSerializableElement32 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement32);
                        i3 |= Segment.SIZE;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement33 = objDecodeNullableSerializableElement33;
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        break;
                    case 14:
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        objDecodeNullableSerializableElement33 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 14, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement33);
                        i3 |= 16384;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement34 = objDecodeNullableSerializableElement34;
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        break;
                    case 15:
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        objDecodeNullableSerializableElement34 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 15, LongSerializer.INSTANCE, objDecodeNullableSerializableElement34);
                        i3 |= 32768;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement35 = objDecodeNullableSerializableElement35;
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        break;
                    case 16:
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        objDecodeNullableSerializableElement35 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, objDecodeNullableSerializableElement35);
                        i3 |= 65536;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        break;
                    case 17:
                        objDecodeNullableSerializableElement36 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement36);
                        i3 |= 131072;
                        objDecodeNullableSerializableElement25 = objDecodeNullableSerializableElement25;
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        break;
                    case 18:
                        objDecodeNullableSerializableElement25 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 18, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement25);
                        i3 |= 262144;
                        objDecodeNullableSerializableElement38 = objDecodeNullableSerializableElement38;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj8 = objDecodeNullableSerializableElement38;
            Object obj9 = objDecodeNullableSerializableElement21;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement25;
            obj = objDecodeNullableSerializableElement36;
            obj2 = objDecodeNullableSerializableElement37;
            obj3 = objDecodeNullableSerializableElement23;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement24;
            obj4 = objDecodeNullableSerializableElement35;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement34;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement33;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement32;
            objDecodeNullableSerializableElement7 = obj8;
            i2 = i3;
            obj5 = objDecodeNullableSerializableElement31;
            obj6 = objDecodeNullableSerializableElement26;
            objDecodeNullableSerializableElement8 = objDecodeNullableSerializableElement27;
            objDecodeNullableSerializableElement9 = obj9;
            objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement22;
            objDecodeNullableSerializableElement11 = objDecodeNullableSerializableElement28;
            objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement29;
            objDecodeNullableSerializableElement13 = objDecodeNullableSerializableElement30;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new ConfigPayload(i2, (ConfigPayload.CleverCache) obj2, (ConfigPayload.ConfigSettings) objDecodeNullableSerializableElement7, (ConfigPayload.Endpoints) objDecodeNullableSerializableElement3, (ConfigPayload.LogMetricsSettings) obj3, (List) objDecodeNullableSerializableElement, (ConfigPayload.UserPrivacy) objDecodeNullableSerializableElement9, (String) objDecodeNullableSerializableElement13, (Boolean) objDecodeNullableSerializableElement12, (Boolean) objDecodeNullableSerializableElement11, (Integer) objDecodeNullableSerializableElement10, (Boolean) objDecodeNullableSerializableElement8, (Integer) obj6, (Boolean) obj5, (Boolean) objDecodeNullableSerializableElement6, (Boolean) objDecodeNullableSerializableElement5, (Long) objDecodeNullableSerializableElement4, (ConfigPayload.AutoRedirect) obj4, (Boolean) obj, (Boolean) objDecodeNullableSerializableElement2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, ConfigPayload value) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        ConfigPayload.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
