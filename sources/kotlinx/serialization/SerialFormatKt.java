package kotlinx.serialization;

import com.google.android.gms.ads.RequestConfiguration;
import com.smartdigimkt.v0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.InternalHexConverter;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a\"\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\u0005\u001a\"\u0010\u0006\u001a\u0002H\u0002\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\b\u001a+\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f2\u0006\u0010\u0004\u001a\u0002H\u0002¢\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0002\u0010\u0012\u001a\"\u0010\t\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\n2\u0006\u0010\u0004\u001a\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\u0013\u001a\"\u0010\u000e\u001a\u0002H\u0002\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\u0014\u001a\"\u0010\u0015\u001a\u00020\u0016\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\n2\u0006\u0010\u0004\u001a\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\u0017\u001a\"\u0010\u0018\u001a\u0002H\u0002\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0016H\u0086\b¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"encodeToString", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/StringFormat;", "value", "(Lkotlinx/serialization/StringFormat;Ljava/lang/Object;)Ljava/lang/String;", "decodeFromString", k.f38992h, "(Lkotlinx/serialization/StringFormat;Ljava/lang/String;)Ljava/lang/Object;", "encodeToHexString", "Lkotlinx/serialization/BinaryFormat;", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/BinaryFormat;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;", "decodeFromHexString", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "hex", "(Lkotlinx/serialization/BinaryFormat;Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;", "(Lkotlinx/serialization/BinaryFormat;Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlinx/serialization/BinaryFormat;Ljava/lang/String;)Ljava/lang/Object;", "encodeToByteArray", "", "(Lkotlinx/serialization/BinaryFormat;Ljava/lang/Object;)[B", "decodeFromByteArray", "bytes", "(Lkotlinx/serialization/BinaryFormat;[B)Ljava/lang/Object;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SerialFormatKt {
    public static final <T> T decodeFromByteArray(BinaryFormat binaryFormat, byte[] bytes) {
        Intrinsics.f(binaryFormat, "<this>");
        Intrinsics.f(bytes, "bytes");
        binaryFormat.getSerializersModule();
        Intrinsics.l();
        throw null;
    }

    public static final <T> T decodeFromHexString(BinaryFormat binaryFormat, DeserializationStrategy<? extends T> deserializer, String hex) {
        Intrinsics.f(binaryFormat, "<this>");
        Intrinsics.f(deserializer, "deserializer");
        Intrinsics.f(hex, "hex");
        return (T) binaryFormat.decodeFromByteArray(deserializer, InternalHexConverter.INSTANCE.parseHexBinary(hex));
    }

    public static final <T> T decodeFromString(StringFormat stringFormat, String string) {
        Intrinsics.f(stringFormat, "<this>");
        Intrinsics.f(string, "string");
        stringFormat.getSerializersModule();
        Intrinsics.l();
        throw null;
    }

    public static final <T> byte[] encodeToByteArray(BinaryFormat binaryFormat, T t) {
        Intrinsics.f(binaryFormat, "<this>");
        binaryFormat.getSerializersModule();
        Intrinsics.l();
        throw null;
    }

    public static final <T> String encodeToHexString(BinaryFormat binaryFormat, SerializationStrategy<? super T> serializer, T t) {
        Intrinsics.f(binaryFormat, "<this>");
        Intrinsics.f(serializer, "serializer");
        return InternalHexConverter.INSTANCE.printHexBinary(binaryFormat.encodeToByteArray(serializer, t), true);
    }

    public static final <T> String encodeToString(StringFormat stringFormat, T t) {
        Intrinsics.f(stringFormat, "<this>");
        stringFormat.getSerializersModule();
        Intrinsics.l();
        throw null;
    }

    public static final <T> T decodeFromHexString(BinaryFormat binaryFormat, String hex) {
        Intrinsics.f(binaryFormat, "<this>");
        Intrinsics.f(hex, "hex");
        binaryFormat.getSerializersModule();
        Intrinsics.l();
        throw null;
    }

    public static final <T> String encodeToHexString(BinaryFormat binaryFormat, T t) {
        Intrinsics.f(binaryFormat, "<this>");
        binaryFormat.getSerializersModule();
        Intrinsics.l();
        throw null;
    }
}
