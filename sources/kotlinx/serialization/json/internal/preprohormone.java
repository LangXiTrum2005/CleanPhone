package kotlinx.serialization.json.internal;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.X3;
import org.jacoco.core.runtime.AgentOptions;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JsonExceptions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0017\u001a\u00020\u0013*\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a'\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010 \u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b \u0010!\u001a'\u0010\"\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010$\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001d\u0010&\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"", "offset", "", PglCryptUtils.KEY_MESSAGE, "Lkotlinx/serialization/json/internal/JsonDecodingException;", "marial", "(ILjava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;", "", "input", "beachfront", "(ILjava/lang/String;Ljava/lang/CharSequence;)Lkotlinx/serialization/json/internal/JsonDecodingException;", "", "value", AgentOptions.OUTPUT, "Lkotlinx/serialization/json/internal/JsonEncodingException;", "saneness", "(Ljava/lang/Number;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonEncodingException;", "Lkotlinx/serialization/json/internal/attabal;", "result", "", "formularize", "(Lkotlinx/serialization/json/internal/attabal;Ljava/lang/Number;)Ljava/lang/Void;", "entity", "impromptu", "(Lkotlinx/serialization/json/internal/attabal;Ljava/lang/String;)Ljava/lang/Void;", "Lbristol/beachfront;", "keyDescriptor", "wireman", "(Lbristol/beachfront;)Lkotlinx/serialization/json/internal/JsonEncodingException;", X3.i.W, "dern", "(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonEncodingException;", "attabal", "(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;", "impassible", "(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "competently", "(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;", "cutely", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class preprohormone {
    public static /* synthetic */ CharSequence apical(CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return cutely(charSequence, i);
    }

    public static final JsonDecodingException attabal(Number value, String key, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        return marial(-1, impassible(value, key, output));
    }

    public static final JsonDecodingException beachfront(int i, String message, CharSequence input) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(input, "input");
        return marial(i, message + "\nJSON input: " + ((Object) cutely(input, i)));
    }

    public static final JsonDecodingException competently(String key, String input) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(input, "input");
        return marial(-1, "Encountered an unknown key '" + key + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) apical(input, 0, 1, null)));
    }

    public static final CharSequence cutely(CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                return (i2 <= 0 ? "" : ".....") + charSequence.subSequence(p002kotlin.ranges.wireman.wireman(i2, 0), p002kotlin.ranges.wireman.competently(i3, charSequence.length())).toString() + (i3 >= charSequence.length() ? "" : ".....");
            }
            int length = charSequence.length() - 60;
            if (length > 0) {
                return "....." + charSequence.subSequence(length, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final JsonEncodingException dern(Number value, String key, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        return new JsonEncodingException(impassible(value, key, output));
    }

    public static final Void formularize(JsonReader jsonReader, Number result) {
        Intrinsics.checkNotNullParameter(jsonReader, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        JsonReader.rotuma(jsonReader, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new KotlinNothingValueException();
    }

    public static final String impassible(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) apical(str2, 0, 1, null));
    }

    public static final Void impromptu(JsonReader jsonReader, String entity) {
        Intrinsics.checkNotNullParameter(jsonReader, "<this>");
        Intrinsics.checkNotNullParameter(entity, "entity");
        jsonReader.gintrap("Trailing comma before the end of JSON " + entity, jsonReader.currentPosition - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw new KotlinNothingValueException();
    }

    public static final JsonDecodingException marial(int i, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i >= 0) {
            message = "Unexpected JSON token at offset " + i + ": " + message;
        }
        return new JsonDecodingException(message);
    }

    public static final JsonEncodingException saneness(Number value, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(output, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) apical(output, 0, 1, null)));
    }

    public static /* synthetic */ Void taiyuan(JsonReader jsonReader, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "object";
        }
        return impromptu(jsonReader, str);
    }

    public static final JsonEncodingException wireman(bristol.beachfront keyDescriptor) {
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + keyDescriptor.getSerialName() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }
}
