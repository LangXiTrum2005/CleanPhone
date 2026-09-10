package com.vungle.ads.internal.signals;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.p004ironsource.mediationsdk.metadata.a;
import com.thinkup.core.api.TUAdConst;
import com.vungle.ads.internal.model.UnclosedAd$$serializer;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/vungle/ads/internal/signals/SessionData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/signals/SessionData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated
public final class SessionData$$serializer implements GeneratedSerializer<SessionData> {
    public static final SessionData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        SessionData$$serializer sessionData$$serializer = new SessionData$$serializer();
        INSTANCE = sessionData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.signals.SessionData", sessionData$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("103", false);
        pluginGeneratedSerialDescriptor.addElement(StatisticData.ERROR_CODE_IO_ERROR, true);
        pluginGeneratedSerialDescriptor.addElement("100", true);
        pluginGeneratedSerialDescriptor.addElement("106", true);
        pluginGeneratedSerialDescriptor.addElement("102", true);
        pluginGeneratedSerialDescriptor.addElement(TUAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_FLOOR, true);
        pluginGeneratedSerialDescriptor.addElement("105", true);
        pluginGeneratedSerialDescriptor.addElement("112", true);
        pluginGeneratedSerialDescriptor.addElement("113", true);
        pluginGeneratedSerialDescriptor.addElement("114", true);
        pluginGeneratedSerialDescriptor.addElement("115", true);
        pluginGeneratedSerialDescriptor.addElement("116", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SessionData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(SignaledAd$$serializer.INSTANCE);
        ArrayListSerializer arrayListSerializer2 = new ArrayListSerializer(UnclosedAd$$serializer.INSTANCE);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, StringSerializer.INSTANCE, longSerializer, arrayListSerializer, longSerializer, intSerializer, arrayListSerializer2, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public SessionData deserialize(Decoder decoder) {
        int i2;
        Object objDecodeSerializableElement;
        Object objDecodeSerializableElement2;
        int iDecodeIntElement;
        int i3;
        int i4;
        int i5;
        int i6;
        int iDecodeIntElement2;
        long j;
        String str;
        long j2;
        Intrinsics.f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i7 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 2);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, new ArrayListSerializer(SignaledAd$$serializer.INSTANCE), null);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 4);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 5);
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 6, new ArrayListSerializer(UnclosedAd$$serializer.INSTANCE), null);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 7);
            int iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 8);
            int iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 9);
            i7 = 4095;
            i2 = iDecodeIntElement3;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 10);
            i3 = iDecodeIntElement7;
            i4 = iDecodeIntElement5;
            i5 = iDecodeIntElement6;
            i6 = iDecodeIntElement4;
            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 11);
            j = jDecodeLongElement2;
            str = strDecodeStringElement;
            j2 = jDecodeLongElement;
        } else {
            int i8 = 11;
            boolean z2 = true;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            int iDecodeIntElement10 = 0;
            int iDecodeIntElement11 = 0;
            Object objDecodeSerializableElement3 = null;
            Object objDecodeSerializableElement4 = null;
            String strDecodeStringElement2 = null;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            int iDecodeIntElement12 = 0;
            int iDecodeIntElement13 = 0;
            int iDecodeIntElement14 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i8 = 11;
                        break;
                    case 0:
                        i7 |= 1;
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
                        i8 = 11;
                        break;
                    case 1:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
                        i7 |= 2;
                        i8 = 11;
                        break;
                    case 2:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 2);
                        i7 |= 4;
                        i8 = 11;
                        break;
                    case 3:
                        objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, new ArrayListSerializer(SignaledAd$$serializer.INSTANCE), objDecodeSerializableElement4);
                        i7 |= 8;
                        i8 = 11;
                        break;
                    case 4:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 4);
                        i7 |= 16;
                        i8 = 11;
                        break;
                    case 5:
                        iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 5);
                        i7 |= 32;
                        i8 = 11;
                        break;
                    case 6:
                        objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 6, new ArrayListSerializer(UnclosedAd$$serializer.INSTANCE), objDecodeSerializableElement3);
                        i7 |= 64;
                        i8 = 11;
                        break;
                    case 7:
                        iDecodeIntElement14 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 7);
                        i7 |= 128;
                        break;
                    case 8:
                        iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 8);
                        i7 |= 256;
                        break;
                    case 9:
                        iDecodeIntElement13 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 9);
                        i7 |= 512;
                        break;
                    case 10:
                        iDecodeIntElement12 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 10);
                        i7 |= 1024;
                        break;
                    case 11:
                        iDecodeIntElement11 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, i8);
                        i7 |= a.f25965n;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i2 = iDecodeIntElement8;
            objDecodeSerializableElement = objDecodeSerializableElement3;
            objDecodeSerializableElement2 = objDecodeSerializableElement4;
            iDecodeIntElement = iDecodeIntElement12;
            i3 = iDecodeIntElement13;
            i4 = iDecodeIntElement14;
            i5 = iDecodeIntElement9;
            i6 = iDecodeIntElement10;
            iDecodeIntElement2 = iDecodeIntElement11;
            j = jDecodeLongElement3;
            str = strDecodeStringElement2;
            j2 = jDecodeLongElement4;
        }
        int i9 = i7;
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new SessionData(i9, i2, str, j2, (List) objDecodeSerializableElement2, j, i6, (List) objDecodeSerializableElement, i4, i5, i3, iDecodeIntElement, iDecodeIntElement2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, SessionData value) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        SessionData.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
