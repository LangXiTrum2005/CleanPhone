package kotlinx.serialization.json.internal;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0000\u001a\u0014\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0000\u001a\u0016\u0010\u0011\u001a\u00020\u000e*\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u0000\u001a\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0000\u001a \u0010\u0017\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0000\u001a \u0010\u0018\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002\u001a\u0018\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\u0016\u0010\u001a\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u001b"}, d2 = {"JsonDecodingException", "Lkotlinx/serialization/json/internal/JsonDecodingException;", "offset", "", PglCryptUtils.KEY_MESSAGE, "", "input", "", "InvalidFloatingPointEncoded", "Lkotlinx/serialization/json/internal/JsonEncodingException;", "value", "", "output", "throwInvalidFloatingPointDecoded", "", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "result", "invalidTrailingComma", "entity", "InvalidKeyKindException", "keyDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "key", "InvalidFloatingPointDecoded", "unexpectedFpErrorMessage", "UnknownKeyException", "minify", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JsonExceptionsKt {
    public static final JsonDecodingException InvalidFloatingPointDecoded(Number value, String key, String output) {
        Intrinsics.f(value, "value");
        Intrinsics.f(key, "key");
        Intrinsics.f(output, "output");
        return JsonDecodingException(-1, unexpectedFpErrorMessage(value, key, output));
    }

    public static final JsonEncodingException InvalidFloatingPointEncoded(Number value, String output) {
        Intrinsics.f(value, "value");
        Intrinsics.f(output, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) minify$default(output, 0, 1, null)));
    }

    public static final JsonEncodingException InvalidKeyKindException(SerialDescriptor keyDescriptor) {
        Intrinsics.f(keyDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + keyDescriptor.getSerialName() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException JsonDecodingException(int i2, String message) {
        Intrinsics.f(message, "message");
        if (i2 >= 0) {
            message = "Unexpected JSON token at offset " + i2 + ": " + message;
        }
        return new JsonDecodingException(message);
    }

    public static final JsonDecodingException UnknownKeyException(String key, String input) {
        Intrinsics.f(key, "key");
        Intrinsics.f(input, "input");
        return JsonDecodingException(-1, "Encountered an unknown key '" + key + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) minify$default(input, 0, 1, null)));
    }

    public static final Void invalidTrailingComma(AbstractJsonLexer abstractJsonLexer, String entity) {
        Intrinsics.f(abstractJsonLexer, "<this>");
        Intrinsics.f(entity, "entity");
        abstractJsonLexer.fail("Trailing comma before the end of JSON ".concat(entity), abstractJsonLexer.currentPosition - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void invalidTrailingComma$default(AbstractJsonLexer abstractJsonLexer, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "object";
        }
        return invalidTrailingComma(abstractJsonLexer, str);
    }

    public static final CharSequence minify(CharSequence charSequence, int i2) {
        Intrinsics.f(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i2 != -1) {
                int i3 = i2 - 30;
                int i4 = i2 + 30;
                String str = i3 <= 0 ? "" : ".....";
                String str2 = i4 >= charSequence.length() ? "" : ".....";
                StringBuilder sbW = android.support.v4.media.a.w(str);
                if (i3 < 0) {
                    i3 = 0;
                }
                int length = charSequence.length();
                if (i4 > length) {
                    i4 = length;
                }
                sbW.append(charSequence.subSequence(i3, i4).toString());
                sbW.append(str2);
                return sbW.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static /* synthetic */ CharSequence minify$default(CharSequence charSequence, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = -1;
        }
        return minify(charSequence, i2);
    }

    public static final Void throwInvalidFloatingPointDecoded(AbstractJsonLexer abstractJsonLexer, Number result) {
        Intrinsics.f(abstractJsonLexer, "<this>");
        Intrinsics.f(result, "result");
        AbstractJsonLexer.fail$default(abstractJsonLexer, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, AbstractJsonLexerKt.specialFlowingValuesHint, 2, null);
        throw new KotlinNothingValueException();
    }

    private static final String unexpectedFpErrorMessage(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) minify$default(str2, 0, 1, null));
    }

    public static final JsonDecodingException JsonDecodingException(int i2, String message, CharSequence input) {
        Intrinsics.f(message, "message");
        Intrinsics.f(input, "input");
        return JsonDecodingException(i2, message + "\nJSON input: " + ((Object) minify(input, i2)));
    }

    public static final JsonEncodingException InvalidFloatingPointEncoded(Number value, String key, String output) {
        Intrinsics.f(value, "value");
        Intrinsics.f(key, "key");
        Intrinsics.f(output, "output");
        return new JsonEncodingException(unexpectedFpErrorMessage(value, key, output));
    }
}
