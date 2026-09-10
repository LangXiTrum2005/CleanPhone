package com.google.gson;

import android.support.v4.media.a;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public enum ToNumberPolicy implements ToNumberStrategy {
    X { // from class: com.google.gson.ToNumberPolicy.1
        @Override // com.google.gson.ToNumberStrategy
        public final Number a(JsonReader jsonReader) {
            return Double.valueOf(jsonReader.J());
        }
    },
    f21205Y { // from class: com.google.gson.ToNumberPolicy.2
        @Override // com.google.gson.ToNumberStrategy
        public final Number a(JsonReader jsonReader) {
            return new LazilyParsedNumber(jsonReader.c0());
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF16 { // from class: com.google.gson.ToNumberPolicy.3
        @Override // com.google.gson.ToNumberStrategy
        public final Number a(JsonReader jsonReader) throws IOException {
            String strC0 = jsonReader.c0();
            try {
                try {
                    return Long.valueOf(Long.parseLong(strC0));
                } catch (NumberFormatException e2) {
                    StringBuilder sbY = a.y("Cannot parse ", strC0, "; at path ");
                    sbY.append(jsonReader.s());
                    throw new JsonParseException(sbY.toString(), e2);
                }
            } catch (NumberFormatException unused) {
                Double dValueOf = Double.valueOf(strC0);
                if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                    if (!jsonReader.f21326Y) {
                        throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + jsonReader.s());
                    }
                }
                return dValueOf;
            }
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF21 { // from class: com.google.gson.ToNumberPolicy.4
        @Override // com.google.gson.ToNumberStrategy
        public final Number a(JsonReader jsonReader) throws IOException {
            String strC0 = jsonReader.c0();
            try {
                return new BigDecimal(strC0);
            } catch (NumberFormatException e2) {
                StringBuilder sbY = a.y("Cannot parse ", strC0, "; at path ");
                sbY.append(jsonReader.s());
                throw new JsonParseException(sbY.toString(), e2);
            }
        }
    }
}
