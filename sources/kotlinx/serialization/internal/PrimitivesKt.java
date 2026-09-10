package kotlinx.serialization.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\f\u0010\f\u001a\u00020\u0007*\u00020\u0007H\u0002\u001a$\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\u000e\u0018\u00010\u0003\"\b\b\u0000\u0010\u000e*\u00020\u000f*\b\u0012\u0004\u0012\u0002H\u000e0\u0002H\u0000\"\"\u0010\u0000\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"BUILTIN_SERIALIZERS", "", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "PrimitiveDescriptorSafe", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialName", "", "kind", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "checkName", "", "capitalize", "builtinSerializerOrNull", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PrimitivesKt {
    private static final Map<KClass<?>, KSerializer<?>> BUILTIN_SERIALIZERS = PlatformKt.initBuiltins();

    public static final SerialDescriptor PrimitiveDescriptorSafe(String serialName, PrimitiveKind kind) {
        Intrinsics.f(serialName, "serialName");
        Intrinsics.f(kind, "kind");
        checkName(serialName);
        return new PrimitiveSerialDescriptor(serialName, kind);
    }

    public static final <T> KSerializer<T> builtinSerializerOrNull(KClass<T> kClass) {
        Intrinsics.f(kClass, "<this>");
        return (KSerializer) BUILTIN_SERIALIZERS.get(kClass);
    }

    private static final String capitalize(String str) {
        String strValueOf;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            String strValueOf2 = String.valueOf(cCharAt);
            Intrinsics.d(strValueOf2, "null cannot be cast to non-null type java.lang.String");
            Locale locale = Locale.ROOT;
            strValueOf = strValueOf2.toUpperCase(locale);
            Intrinsics.e(strValueOf, "toUpperCase(...)");
            if (strValueOf.length() <= 1) {
                strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
            } else if (cCharAt != 329) {
                char cCharAt2 = strValueOf.charAt(0);
                String strSubstring = strValueOf.substring(1);
                Intrinsics.e(strSubstring, "substring(...)");
                String lowerCase = strSubstring.toLowerCase(locale);
                Intrinsics.e(lowerCase, "toLowerCase(...)");
                strValueOf = cCharAt2 + lowerCase;
            }
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb.append((Object) strValueOf);
        String strSubstring2 = str.substring(1);
        Intrinsics.e(strSubstring2, "substring(...)");
        sb.append(strSubstring2);
        return sb.toString();
    }

    private static final void checkName(String str) {
        for (KSerializer<?> kSerializer : BUILTIN_SERIALIZERS.values()) {
            if (Intrinsics.a(str, kSerializer.getDescriptor().getSerialName())) {
                StringBuilder sbY = android.support.v4.media.a.y("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbY.append(Reflection.f43333a.b(kSerializer.getClass()).l());
                sbY.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(StringsKt.c0(sbY.toString()));
            }
        }
    }
}
