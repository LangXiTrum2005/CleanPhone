package com.google.gson.internal.bind;

import android.support.v4.media.a;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonTreeWriter extends JsonWriter {
    public static final JsonPrimitive n0;
    public String m0;

    static {
        new Writer() { // from class: com.google.gson.internal.bind.JsonTreeWriter.1
            @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                throw new AssertionError();
            }

            @Override // java.io.Writer, java.io.Flushable
            public final void flush() {
                throw new AssertionError();
            }

            @Override // java.io.Writer
            public final void write(char[] cArr, int i2, int i3) {
                throw new AssertionError();
            }
        };
        n0 = new JsonPrimitive("closed");
    }

    @Override // com.google.gson.stream.JsonWriter
    public final void H(double d) {
        if (this.f0 || !(Double.isNaN(d) || Double.isInfinite(d))) {
            U(new JsonPrimitive(Double.valueOf(d)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
    }

    @Override // com.google.gson.stream.JsonWriter
    public final void I(long j) {
        U(new JsonPrimitive(Long.valueOf(j)));
    }

    @Override // com.google.gson.stream.JsonWriter
    public final void J(Boolean bool) {
        if (bool == null) {
            U(JsonNull.X);
        } else {
            U(new JsonPrimitive(bool));
        }
    }

    @Override // com.google.gson.stream.JsonWriter
    public final void K(Number number) {
        if (number == null) {
            U(JsonNull.X);
            return;
        }
        if (!this.f0) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        U(new JsonPrimitive(number));
    }

    @Override // com.google.gson.stream.JsonWriter
    public final void P(String str) {
        if (str == null) {
            U(JsonNull.X);
        } else {
            U(new JsonPrimitive(str));
        }
    }

    @Override // com.google.gson.stream.JsonWriter
    public final void S(boolean z2) {
        U(new JsonPrimitive(Boolean.valueOf(z2)));
    }

    public final void U(JsonElement jsonElement) {
        this.m0.getClass();
        if (!(jsonElement instanceof JsonNull) || this.i0) {
            JsonObject jsonObject = (JsonObject) ((JsonElement) a.d(1, null));
            jsonObject.X.put(this.m0, jsonElement);
        }
        this.m0 = null;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public final void flush() {
    }

    @Override // com.google.gson.stream.JsonWriter
    public final void h() {
        U(new JsonArray());
        throw null;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final void k() {
        U(new JsonObject());
        throw null;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final void m() {
        throw null;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final void p() {
        throw null;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final void q(String str) {
        Objects.requireNonNull(str, "name == null");
        throw null;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter s() {
        U(JsonNull.X);
        return this;
    }
}
