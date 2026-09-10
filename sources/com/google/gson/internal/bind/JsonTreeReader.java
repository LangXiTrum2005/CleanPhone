package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonTreeReader extends JsonReader {
    public static final Object u0;
    public Object[] q0;
    public int r0;
    public String[] s0;
    public int[] t0;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.JsonTreeReader$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21256a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f21256a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21256a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21256a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21256a[9] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        new Reader() { // from class: com.google.gson.internal.bind.JsonTreeReader.1
            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                throw new AssertionError();
            }

            @Override // java.io.Reader
            public final int read(char[] cArr, int i2, int i3) {
                throw new AssertionError();
            }
        };
        u0 = new Object();
    }

    public final void D0(JsonToken jsonToken) {
        if (j0() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + j0() + G0());
    }

    public final String E0(boolean z2) {
        StringBuilder sb = new StringBuilder("$");
        int i2 = 0;
        while (true) {
            int i3 = this.r0;
            if (i2 >= i3) {
                return sb.toString();
            }
            Object[] objArr = this.q0;
            Object obj = objArr[i2];
            if (obj instanceof JsonArray) {
                i2++;
                if (i2 < i3 && (objArr[i2] instanceof Iterator)) {
                    int i4 = this.t0[i2];
                    if (z2 && i4 > 0 && (i2 == i3 - 1 || i2 == i3 - 2)) {
                        i4--;
                    }
                    sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb.append(i4);
                    sb.append(AbstractJsonLexerKt.END_LIST);
                }
            } else if ((obj instanceof JsonObject) && (i2 = i2 + 1) < i3 && (objArr[i2] instanceof Iterator)) {
                sb.append('.');
                String str = this.s0[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
            i2++;
        }
    }

    public final String G0() {
        return " at path " + E0(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean I() {
        D0(JsonToken.i0);
        boolean zA = ((JsonPrimitive) L0()).a();
        int i2 = this.r0;
        if (i2 > 0) {
            int[] iArr = this.t0;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return zA;
    }

    public final String I0(boolean z2) {
        D0(JsonToken.f0);
        Map.Entry entry = (Map.Entry) ((Iterator) J0()).next();
        String str = (String) entry.getKey();
        this.s0[this.r0 - 1] = z2 ? "<skipped>" : str;
        N0(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public final double J() throws MalformedJsonException {
        JsonToken jsonTokenJ0 = j0();
        JsonToken jsonToken = JsonToken.h0;
        if (jsonTokenJ0 != jsonToken && jsonTokenJ0 != JsonToken.g0) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenJ0 + G0());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) J0();
        double dDoubleValue = jsonPrimitive.X instanceof Number ? jsonPrimitive.c().doubleValue() : Double.parseDouble(jsonPrimitive.d());
        if (!this.f21326Y && (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dDoubleValue);
        }
        L0();
        int i2 = this.r0;
        if (i2 > 0) {
            int[] iArr = this.t0;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return dDoubleValue;
    }

    public final Object J0() {
        return this.q0[this.r0 - 1];
    }

    @Override // com.google.gson.stream.JsonReader
    public final int K() {
        JsonToken jsonTokenJ0 = j0();
        JsonToken jsonToken = JsonToken.h0;
        if (jsonTokenJ0 != jsonToken && jsonTokenJ0 != JsonToken.g0) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenJ0 + G0());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) J0();
        int iIntValue = jsonPrimitive.X instanceof Number ? jsonPrimitive.c().intValue() : Integer.parseInt(jsonPrimitive.d());
        L0();
        int i2 = this.r0;
        if (i2 > 0) {
            int[] iArr = this.t0;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return iIntValue;
    }

    public final Object L0() {
        Object[] objArr = this.q0;
        int i2 = this.r0 - 1;
        this.r0 = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final void N0(Object obj) {
        int i2 = this.r0;
        Object[] objArr = this.q0;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            this.q0 = Arrays.copyOf(objArr, i3);
            this.t0 = Arrays.copyOf(this.t0, i3);
            this.s0 = (String[]) Arrays.copyOf(this.s0, i3);
        }
        Object[] objArr2 = this.q0;
        int i4 = this.r0;
        this.r0 = i4 + 1;
        objArr2[i4] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public final long P() {
        JsonToken jsonTokenJ0 = j0();
        JsonToken jsonToken = JsonToken.h0;
        if (jsonTokenJ0 != jsonToken && jsonTokenJ0 != JsonToken.g0) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenJ0 + G0());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) J0();
        long jLongValue = jsonPrimitive.X instanceof Number ? jsonPrimitive.c().longValue() : Long.parseLong(jsonPrimitive.d());
        L0();
        int i2 = this.r0;
        if (i2 > 0) {
            int[] iArr = this.t0;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return jLongValue;
    }

    @Override // com.google.gson.stream.JsonReader
    public final String S() {
        return I0(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public final void U() {
        D0(JsonToken.j0);
        L0();
        int i2 = this.r0;
        if (i2 > 0) {
            int[] iArr = this.t0;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String c0() {
        JsonToken jsonTokenJ0 = j0();
        JsonToken jsonToken = JsonToken.g0;
        if (jsonTokenJ0 != jsonToken && jsonTokenJ0 != JsonToken.h0) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenJ0 + G0());
        }
        String strD = ((JsonPrimitive) L0()).d();
        int i2 = this.r0;
        if (i2 > 0) {
            int[] iArr = this.t0;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return strD;
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.q0 = new Object[]{u0};
        this.r0 = 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void d() {
        D0(JsonToken.X);
        N0(((JsonArray) J0()).X.iterator());
        this.t0[this.r0 - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void h() {
        D0(JsonToken.Z);
        N0(((JsonObject) J0()).X.entrySet().iterator());
    }

    @Override // com.google.gson.stream.JsonReader
    public final JsonToken j0() {
        if (this.r0 == 0) {
            return JsonToken.k0;
        }
        Object objJ0 = J0();
        if (objJ0 instanceof Iterator) {
            boolean z2 = this.q0[this.r0 - 2] instanceof JsonObject;
            Iterator it = (Iterator) objJ0;
            if (!it.hasNext()) {
                return z2 ? JsonToken.e0 : JsonToken.f21327Y;
            }
            if (z2) {
                return JsonToken.f0;
            }
            N0(it.next());
            return j0();
        }
        if (objJ0 instanceof JsonObject) {
            return JsonToken.Z;
        }
        if (objJ0 instanceof JsonArray) {
            return JsonToken.X;
        }
        if (objJ0 instanceof JsonPrimitive) {
            Serializable serializable = ((JsonPrimitive) objJ0).X;
            if (serializable instanceof String) {
                return JsonToken.g0;
            }
            if (serializable instanceof Boolean) {
                return JsonToken.i0;
            }
            if (serializable instanceof Number) {
                return JsonToken.h0;
            }
            throw new AssertionError();
        }
        if (objJ0 instanceof JsonNull) {
            return JsonToken.j0;
        }
        if (objJ0 == u0) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + objJ0.getClass().getName() + " is not supported");
    }

    @Override // com.google.gson.stream.JsonReader
    public final void m() {
        D0(JsonToken.f21327Y);
        L0();
        L0();
        int i2 = this.r0;
        if (i2 > 0) {
            int[] iArr = this.t0;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final void p() {
        D0(JsonToken.e0);
        this.s0[this.r0 - 1] = null;
        L0();
        L0();
        int i2 = this.r0;
        if (i2 > 0) {
            int[] iArr = this.t0;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String s() {
        return E0(true);
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean t() {
        JsonToken jsonTokenJ0 = j0();
        return (jsonTokenJ0 == JsonToken.e0 || jsonTokenJ0 == JsonToken.f21327Y || jsonTokenJ0 == JsonToken.k0) ? false : true;
    }

    @Override // com.google.gson.stream.JsonReader
    public final String toString() {
        return "JsonTreeReader" + G0();
    }

    @Override // com.google.gson.stream.JsonReader
    public final String u() {
        return E0(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public final void z0() {
        int iOrdinal = j0().ordinal();
        if (iOrdinal == 1) {
            m();
            return;
        }
        if (iOrdinal != 9) {
            if (iOrdinal == 3) {
                p();
                return;
            }
            if (iOrdinal == 4) {
                I0(true);
                return;
            }
            L0();
            int i2 = this.r0;
            if (i2 > 0) {
                int[] iArr = this.t0;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
        }
    }
}
