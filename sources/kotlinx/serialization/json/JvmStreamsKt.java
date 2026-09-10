package kotlinx.serialization.json;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.json.internal.JavaStreamSerialReader;
import kotlinx.serialization.json.internal.JsonStreamsKt;
import kotlinx.serialization.json.internal.JsonToJavaStreamWriter;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a5\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a*\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0006\u001a\u0002H\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0087\b¢\u0006\u0002\u0010\n\u001a-\u0010\u000b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\"\u0010\u000b\u001a\u0002H\u0002\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u000eH\u0087\b¢\u0006\u0002\u0010\u0010\u001a8\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0012\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\u001a-\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0012\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0087\b¨\u0006\u0015"}, d2 = {"encodeToStream", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/json/Json;", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "value", "stream", "Ljava/io/OutputStream;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Ljava/io/OutputStream;)V", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;Ljava/io/OutputStream;)V", "decodeFromStream", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "Ljava/io/InputStream;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Ljava/io/InputStream;)Ljava/lang/Object;", "(Lkotlinx/serialization/json/Json;Ljava/io/InputStream;)Ljava/lang/Object;", "decodeToSequence", "Lkotlin/sequences/Sequence;", "format", "Lkotlinx/serialization/json/DecodeSequenceMode;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JvmStreamsKt {
    @ExperimentalSerializationApi
    public static final <T> T decodeFromStream(Json json, DeserializationStrategy<? extends T> deserializer, InputStream stream) {
        Intrinsics.f(json, "<this>");
        Intrinsics.f(deserializer, "deserializer");
        Intrinsics.f(stream, "stream");
        JavaStreamSerialReader javaStreamSerialReader = new JavaStreamSerialReader(stream);
        try {
            return (T) JsonStreamsKt.decodeByReader(json, deserializer, javaStreamSerialReader);
        } finally {
            javaStreamSerialReader.release();
        }
    }

    @ExperimentalSerializationApi
    public static final <T> Sequence<T> decodeToSequence(Json json, InputStream stream, DeserializationStrategy<? extends T> deserializer, DecodeSequenceMode format) {
        Intrinsics.f(json, "<this>");
        Intrinsics.f(stream, "stream");
        Intrinsics.f(deserializer, "deserializer");
        Intrinsics.f(format, "format");
        return JsonStreamsKt.decodeToSequenceByReader(json, new JavaStreamSerialReader(stream), deserializer, format);
    }

    public static /* synthetic */ Sequence decodeToSequence$default(Json json, InputStream inputStream, DeserializationStrategy deserializationStrategy, DecodeSequenceMode decodeSequenceMode, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            decodeSequenceMode = DecodeSequenceMode.AUTO_DETECT;
        }
        return decodeToSequence(json, inputStream, deserializationStrategy, decodeSequenceMode);
    }

    @ExperimentalSerializationApi
    public static final <T> void encodeToStream(Json json, SerializationStrategy<? super T> serializer, T t, OutputStream stream) throws IOException {
        Intrinsics.f(json, "<this>");
        Intrinsics.f(serializer, "serializer");
        Intrinsics.f(stream, "stream");
        JsonToJavaStreamWriter jsonToJavaStreamWriter = new JsonToJavaStreamWriter(stream);
        try {
            JsonStreamsKt.encodeByWriter(json, jsonToJavaStreamWriter, serializer, t);
        } finally {
            jsonToJavaStreamWriter.release();
        }
    }

    @ExperimentalSerializationApi
    public static final <T> Sequence<T> decodeToSequence(Json json, InputStream stream, DecodeSequenceMode format) {
        Intrinsics.f(json, "<this>");
        Intrinsics.f(stream, "stream");
        Intrinsics.f(format, "format");
        json.getSerializersModule();
        Intrinsics.l();
        throw null;
    }

    public static Sequence decodeToSequence$default(Json json, InputStream stream, DecodeSequenceMode format, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            format = DecodeSequenceMode.AUTO_DETECT;
        }
        Intrinsics.f(json, "<this>");
        Intrinsics.f(stream, "stream");
        Intrinsics.f(format, "format");
        json.getSerializersModule();
        Intrinsics.l();
        throw null;
    }

    @ExperimentalSerializationApi
    public static final <T> T decodeFromStream(Json json, InputStream stream) {
        Intrinsics.f(json, "<this>");
        Intrinsics.f(stream, "stream");
        json.getSerializersModule();
        Intrinsics.l();
        throw null;
    }

    @ExperimentalSerializationApi
    public static final <T> void encodeToStream(Json json, T t, OutputStream stream) {
        Intrinsics.f(json, "<this>");
        Intrinsics.f(stream, "stream");
        json.getSerializersModule();
        Intrinsics.l();
        throw null;
    }
}
