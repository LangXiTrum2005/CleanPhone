package kcia;

import com.google.gson.ToNumberStrategy;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: IntOrLongOrDoubleOrLazilyParsedNumber.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkcia/attabal;", "Lcom/google/gson/ToNumberStrategy;", "<init>", "()V", "Lcom/google/gson/stream/JsonReader;", "reader", "", "readNumber", "(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Number;", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal implements ToNumberStrategy {
    @Override // com.google.gson.ToNumberStrategy
    public Number readNumber(JsonReader reader) throws IOException {
        Object objM3351constructorimpl;
        Object objValueOf;
        Intrinsics.checkNotNullParameter(reader, "reader");
        String numberStr = reader.nextString();
        try {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(numberStr, "numberStr");
            if (StringsKt.overspeculate(numberStr, ".", false, 2, null) || StringsKt.overspeculate(numberStr, "e", false, 2, null) || StringsKt.overspeculate(numberStr, "E", false, 2, null)) {
                objValueOf = Double.valueOf(Double.parseDouble(numberStr));
            } else {
                objValueOf = Long.parseLong(numberStr) <= 2147483647L ? Integer.valueOf(Integer.parseInt(numberStr)) : Long.valueOf(Long.parseLong(numberStr));
            }
            objM3351constructorimpl = Result.m3351constructorimpl(objValueOf);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(dern.attabal(th));
        }
        Object obj = Result.m3356isFailureimpl(objM3351constructorimpl) ? null : objM3351constructorimpl;
        return obj == null ? new LazilyParsedNumber(numberStr) : (Number) obj;
    }
}
