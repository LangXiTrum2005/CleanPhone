package com.chartboost.heliumsdk.network.model;

import com.applovin.shadow.okio.Segment;
import com.p004ironsource.dc;
import com.p004ironsource.mediationsdk.metadata.a;
import com.p004ironsource.ne;
import com.smartdigimkt.m3.h;
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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/chartboost/heliumsdk/network/model/BidRequestDevice.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/chartboost/heliumsdk/network/model/BidRequestDevice;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
public final class BidRequestDevice$$serializer implements GeneratedSerializer<BidRequestDevice> {
    public static final BidRequestDevice$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BidRequestDevice$$serializer bidRequestDevice$$serializer = new BidRequestDevice$$serializer();
        INSTANCE = bidRequestDevice$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.heliumsdk.network.model.BidRequestDevice", bidRequestDevice$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("ua", true);
        pluginGeneratedSerialDescriptor.addElement("lmt", true);
        pluginGeneratedSerialDescriptor.addElement("devicetype", true);
        pluginGeneratedSerialDescriptor.addElement(ne.t, true);
        pluginGeneratedSerialDescriptor.addElement("model", true);
        pluginGeneratedSerialDescriptor.addElement(ne.f26256E, true);
        pluginGeneratedSerialDescriptor.addElement(ne.f26257F, true);
        pluginGeneratedSerialDescriptor.addElement(h.f36614b, false);
        pluginGeneratedSerialDescriptor.addElement("w", false);
        pluginGeneratedSerialDescriptor.addElement("pxratio", true);
        pluginGeneratedSerialDescriptor.addElement("language", true);
        pluginGeneratedSerialDescriptor.addElement(ne.O0, true);
        pluginGeneratedSerialDescriptor.addElement(dc.f24783e, true);
        pluginGeneratedSerialDescriptor.addElement("ifa", true);
        pluginGeneratedSerialDescriptor.addElement("geo", true);
        pluginGeneratedSerialDescriptor.addElement("ext", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BidRequestDevice$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer, BuiltinSerializersKt.getNullable(FloatSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BidRequestDeviceGeo$$serializer.INSTANCE, BidRequestDeviceExt$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public BidRequestDevice deserialize(Decoder decoder) {
        Object objDecodeSerializableElement;
        int i2;
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        int i3;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeSerializableElement2;
        Object obj;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i4;
        int i5;
        Intrinsics.f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i6 = 11;
        int i7 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, intSerializer, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, intSerializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 3);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 4);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 5);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 6);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 7);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 8);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, FloatSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, stringSerializer, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, stringSerializer, null);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 12);
            Object objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, stringSerializer, null);
            Object objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 14, BidRequestDeviceGeo$$serializer.INSTANCE, null);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 15, BidRequestDeviceExt$$serializer.INSTANCE, null);
            i2 = 65535;
            i4 = iDecodeIntElement;
            str5 = strDecodeStringElement5;
            str4 = strDecodeStringElement4;
            str3 = strDecodeStringElement3;
            i5 = iDecodeIntElement2;
            str2 = strDecodeStringElement2;
            i3 = iDecodeIntElement3;
            str = strDecodeStringElement;
            objDecodeSerializableElement = objDecodeSerializableElement3;
            obj = objDecodeNullableSerializableElement6;
        } else {
            int i8 = 0;
            int i9 = 15;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            boolean z2 = true;
            Object objDecodeNullableSerializableElement7 = null;
            Object objDecodeNullableSerializableElement8 = null;
            Object objDecodeSerializableElement4 = null;
            objDecodeSerializableElement = null;
            Object objDecodeNullableSerializableElement9 = null;
            Object objDecodeNullableSerializableElement10 = null;
            Object objDecodeNullableSerializableElement11 = null;
            String strDecodeStringElement6 = null;
            Object objDecodeNullableSerializableElement12 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            int iDecodeIntElement6 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i9 = 15;
                        i6 = 11;
                        i7 = 10;
                        break;
                    case 0:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
                        i8 |= 1;
                        i9 = 15;
                        i6 = 11;
                        i7 = 10;
                        break;
                    case 1:
                        objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, IntSerializer.INSTANCE, objDecodeNullableSerializableElement12);
                        i8 |= 2;
                        i9 = 15;
                        i6 = 11;
                        i7 = 10;
                        break;
                    case 2:
                        objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, objDecodeNullableSerializableElement8);
                        i8 |= 4;
                        i9 = 15;
                        i6 = 11;
                        break;
                    case 3:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 3);
                        i8 |= 8;
                        i9 = 15;
                        break;
                    case 4:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 4);
                        i8 |= 16;
                        i9 = 15;
                        break;
                    case 5:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 5);
                        i8 |= 32;
                        i9 = 15;
                        break;
                    case 6:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 6);
                        i8 |= 64;
                        i9 = 15;
                        break;
                    case 7:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 7);
                        i8 |= 128;
                        i9 = 15;
                        break;
                    case 8:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 8);
                        i8 |= 256;
                        i9 = 15;
                        break;
                    case 9:
                        objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement7);
                        i8 |= 512;
                        i9 = 15;
                        break;
                    case 10:
                        objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, i7, StringSerializer.INSTANCE, objDecodeNullableSerializableElement10);
                        i8 |= 1024;
                        i9 = 15;
                        break;
                    case 11:
                        objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, i6, StringSerializer.INSTANCE, objDecodeNullableSerializableElement11);
                        i8 |= a.f25965n;
                        i9 = 15;
                        break;
                    case 12:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 12);
                        i8 |= 4096;
                        i9 = 15;
                        break;
                    case 13:
                        objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, StringSerializer.INSTANCE, objDecodeNullableSerializableElement9);
                        i8 |= Segment.SIZE;
                        i9 = 15;
                        break;
                    case 14:
                        objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 14, BidRequestDeviceGeo$$serializer.INSTANCE, objDecodeSerializableElement);
                        i8 |= 16384;
                        i9 = 15;
                        break;
                    case 15:
                        objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, i9, BidRequestDeviceExt$$serializer.INSTANCE, objDecodeSerializableElement4);
                        i8 |= 32768;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i2 = i8;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement7;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement8;
            i3 = iDecodeIntElement6;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement12;
            objDecodeSerializableElement2 = objDecodeSerializableElement4;
            obj = objDecodeNullableSerializableElement9;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement10;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement11;
            str = strDecodeStringElement6;
            str2 = strDecodeStringElement7;
            str3 = strDecodeStringElement8;
            str4 = strDecodeStringElement9;
            str5 = strDecodeStringElement10;
            i4 = iDecodeIntElement4;
            i5 = iDecodeIntElement5;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new BidRequestDevice(i2, str, (Integer) objDecodeNullableSerializableElement3, (Integer) objDecodeNullableSerializableElement2, str2, str3, str4, str5, i4, i5, (Float) objDecodeNullableSerializableElement, (String) objDecodeNullableSerializableElement4, (String) objDecodeNullableSerializableElement5, i3, (String) obj, (BidRequestDeviceGeo) objDecodeSerializableElement, (BidRequestDeviceExt) objDecodeSerializableElement2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, BidRequestDevice value) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        BidRequestDevice.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
