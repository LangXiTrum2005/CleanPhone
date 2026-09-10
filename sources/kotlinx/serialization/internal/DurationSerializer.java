package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lkotlinx/serialization/internal/DurationSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/time/Duration;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "serialize-HG0u8IE", "(Lkotlinx/serialization/encoding/Encoder;J)V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "deserialize-5sfh64U", "(Lkotlinx/serialization/encoding/Decoder;)J", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DurationSerializer implements KSerializer<Duration> {
    public static final DurationSerializer INSTANCE = new DurationSerializer();
    private static final SerialDescriptor descriptor = new PrimitiveSerialDescriptor("kotlin.time.Duration", PrimitiveKind.STRING.INSTANCE);

    private DurationSerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return new Duration(m3342deserialize5sfh64U(decoder));
    }

    /* JADX INFO: renamed from: deserialize-5sfh64U, reason: not valid java name */
    public long m3342deserialize5sfh64U(Decoder decoder) {
        Intrinsics.f(decoder, "decoder");
        Duration.Companion companion = Duration.f44719Y;
        String value = decoder.decodeString();
        Intrinsics.f(value, "value");
        try {
            return DurationKt.a(value);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(android.support.v4.media.a.n("Invalid ISO duration string format: '", value, "'."), e2);
        }
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m3343serializeHG0u8IE(encoder, ((Duration) obj).X);
    }

    /* JADX INFO: renamed from: serialize-HG0u8IE, reason: not valid java name */
    public void m3343serializeHG0u8IE(Encoder encoder, long value) {
        Intrinsics.f(encoder, "encoder");
        Duration.Companion companion = Duration.f44719Y;
        StringBuilder sb = new StringBuilder();
        if (value < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jM = value < 0 ? Duration.m(value) : value;
        long jK = Duration.k(jM, DurationUnit.HOURS);
        boolean z2 = false;
        int iK = Duration.h(jM) ? 0 : (int) (Duration.k(jM, DurationUnit.MINUTES) % ((long) 60));
        int iK2 = Duration.h(jM) ? 0 : (int) (Duration.k(jM, DurationUnit.SECONDS) % ((long) 60));
        int iG = Duration.g(jM);
        if (Duration.h(value)) {
            jK = 9999999999999L;
        }
        boolean z3 = jK != 0;
        boolean z4 = (iK2 == 0 && iG == 0) ? false : true;
        if (iK != 0 || (z4 && z3)) {
            z2 = true;
        }
        if (z3) {
            sb.append(jK);
            sb.append('H');
        }
        if (z2) {
            sb.append(iK);
            sb.append('M');
        }
        if (z4 || (!z3 && !z2)) {
            Duration.b(sb, iK2, iG, 9, "S", true);
        }
        encoder.encodeString(sb.toString());
    }
}
