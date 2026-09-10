package com.google.gson.internal.bind;

import android.support.v4.media.a;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.p004ironsource.d9;
import com.thinkup.core.common.oo.o;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class TypeAdapters {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final TypeAdapterFactory f21287A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final TypeAdapterFactory f21288B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TypeAdapterFactory f21289a = new AnonymousClass31(Class.class, new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
        @Override // com.google.gson.TypeAdapter
        public final Object b(JsonReader jsonReader) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, Object obj) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
        }
    }.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TypeAdapterFactory f21290b = new AnonymousClass31(BitSet.class, new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
        @Override // com.google.gson.TypeAdapter
        public final Object b(JsonReader jsonReader) throws IOException {
            boolean zI;
            BitSet bitSet = new BitSet();
            jsonReader.d();
            JsonToken jsonTokenJ0 = jsonReader.j0();
            int i2 = 0;
            while (jsonTokenJ0 != JsonToken.f21327Y) {
                int iOrdinal = jsonTokenJ0.ordinal();
                if (iOrdinal == 5 || iOrdinal == 6) {
                    int iK = jsonReader.K();
                    if (iK == 0) {
                        zI = false;
                    } else {
                        if (iK != 1) {
                            StringBuilder sbU = a.u(iK, "Invalid bitset value ", ", expected 0 or 1; at path ");
                            sbU.append(jsonReader.s());
                            throw new JsonSyntaxException(sbU.toString());
                        }
                        zI = true;
                    }
                } else {
                    if (iOrdinal != 7) {
                        throw new JsonSyntaxException("Invalid bitset value type: " + jsonTokenJ0 + "; at path " + jsonReader.u());
                    }
                    zI = jsonReader.I();
                }
                if (zI) {
                    bitSet.set(i2);
                }
                i2++;
                jsonTokenJ0 = jsonReader.j0();
            }
            jsonReader.m();
            return bitSet;
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
            BitSet bitSet = (BitSet) obj;
            jsonWriter.h();
            int length = bitSet.length();
            for (int i2 = 0; i2 < length; i2++) {
                jsonWriter.I(bitSet.get(i2) ? 1L : 0L);
            }
            jsonWriter.m();
        }
    }.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TypeAdapter f21291c;
    public static final TypeAdapterFactory d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TypeAdapterFactory f21292e;
    public static final TypeAdapterFactory f;
    public static final TypeAdapterFactory g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final TypeAdapterFactory f21293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final TypeAdapterFactory f21294i;
    public static final TypeAdapterFactory j;
    public static final TypeAdapter k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final TypeAdapterFactory f21295l;
    public static final TypeAdapter m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TypeAdapter f21296n;
    public static final TypeAdapter o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final TypeAdapterFactory f21297p;
    public static final TypeAdapterFactory q;
    public static final TypeAdapterFactory r;
    public static final TypeAdapterFactory s;
    public static final TypeAdapterFactory t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final TypeAdapterFactory f21298u;
    public static final TypeAdapterFactory v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final TypeAdapterFactory f21299w;
    public static final TypeAdapterFactory x;
    public static final TypeAdapterFactory y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final TypeAdapter f21300z;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$30, reason: invalid class name */
    class AnonymousClass30 implements TypeAdapterFactory {
        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter b(Gson gson, TypeToken typeToken) {
            typeToken.equals(null);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$31, reason: invalid class name */
    class AnonymousClass31 implements TypeAdapterFactory {
        public final /* synthetic */ Class X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ TypeAdapter f21301Y;

        public AnonymousClass31(Class cls, TypeAdapter typeAdapter) {
            this.X = cls;
            this.f21301Y = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter b(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == this.X) {
                return this.f21301Y;
            }
            return null;
        }

        public final String toString() {
            return "Factory[type=" + this.X.getName() + ",adapter=" + this.f21301Y + d9.i.f24752e;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$32, reason: invalid class name */
    class AnonymousClass32 implements TypeAdapterFactory {
        public final /* synthetic */ Class X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ Class f21302Y;
        public final /* synthetic */ TypeAdapter Z;

        public AnonymousClass32(Class cls, Class cls2, TypeAdapter typeAdapter) {
            this.X = cls;
            this.f21302Y = cls2;
            this.Z = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter b(Gson gson, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (rawType == this.X || rawType == this.f21302Y) {
                return this.Z;
            }
            return null;
        }

        public final String toString() {
            return "Factory[type=" + this.f21302Y.getName() + "+" + this.X.getName() + ",adapter=" + this.Z + d9.i.f24752e;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$35, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass35 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21306a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f21306a = iArr;
            try {
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21306a[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21306a[7] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21306a[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21306a[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21306a[8] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f21307a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f21308b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashMap f21309c = new HashMap();

        public EnumTypeAdapter(final Class cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new PrivilegedAction<Field[]>() { // from class: com.google.gson.internal.bind.TypeAdapters.EnumTypeAdapter.1
                    @Override // java.security.PrivilegedAction
                    public final Field[] run() {
                        Field[] declaredFields = cls.getDeclaredFields();
                        ArrayList arrayList = new ArrayList(declaredFields.length);
                        for (Field field2 : declaredFields) {
                            if (field2.isEnumConstant()) {
                                arrayList.add(field2);
                            }
                        }
                        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                        AccessibleObject.setAccessible(fieldArr, true);
                        return fieldArr;
                    }
                })) {
                    Enum r4 = (Enum) field.get(null);
                    String strName = r4.name();
                    String string = r4.toString();
                    SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                    if (serializedName != null) {
                        strName = serializedName.value();
                        for (String str : serializedName.alternate()) {
                            this.f21307a.put(str, r4);
                        }
                    }
                    this.f21307a.put(strName, r4);
                    this.f21308b.put(string, r4);
                    this.f21309c.put(r4, strName);
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final Object b(JsonReader jsonReader) throws IOException {
            if (jsonReader.j0() == JsonToken.j0) {
                jsonReader.U();
                return null;
            }
            String strC0 = jsonReader.c0();
            Enum r0 = (Enum) this.f21307a.get(strC0);
            return r0 == null ? (Enum) this.f21308b.get(strC0) : r0;
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
            Enum r3 = (Enum) obj;
            jsonWriter.P(r3 == null ? null : (String) this.f21309c.get(r3));
        }
    }

    static {
        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) throws IOException {
                JsonToken jsonTokenJ0 = jsonReader.j0();
                if (jsonTokenJ0 != JsonToken.j0) {
                    return jsonTokenJ0 == JsonToken.g0 ? Boolean.valueOf(Boolean.parseBoolean(jsonReader.c0())) : Boolean.valueOf(jsonReader.I());
                }
                jsonReader.U();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                jsonWriter.J((Boolean) obj);
            }
        };
        f21291c = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.j0() != JsonToken.j0) {
                    return Boolean.valueOf(jsonReader.c0());
                }
                jsonReader.U();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                Boolean bool = (Boolean) obj;
                jsonWriter.P(bool == null ? AbstractJsonLexerKt.NULL : bool.toString());
            }
        };
        d = new AnonymousClass32(Boolean.TYPE, Boolean.class, typeAdapter);
        f21292e = new AnonymousClass32(Byte.TYPE, Byte.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) throws IOException {
                if (jsonReader.j0() == JsonToken.j0) {
                    jsonReader.U();
                    return null;
                }
                try {
                    int iK = jsonReader.K();
                    if (iK <= 255 && iK >= -128) {
                        return Byte.valueOf((byte) iK);
                    }
                    StringBuilder sbU = a.u(iK, "Lossy conversion from ", " to byte; at path ");
                    sbU.append(jsonReader.s());
                    throw new JsonSyntaxException(sbU.toString());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    jsonWriter.s();
                } else {
                    jsonWriter.I(number.byteValue());
                }
            }
        });
        f = new AnonymousClass32(Short.TYPE, Short.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) throws IOException {
                if (jsonReader.j0() == JsonToken.j0) {
                    jsonReader.U();
                    return null;
                }
                try {
                    int iK = jsonReader.K();
                    if (iK <= 65535 && iK >= -32768) {
                        return Short.valueOf((short) iK);
                    }
                    StringBuilder sbU = a.u(iK, "Lossy conversion from ", " to short; at path ");
                    sbU.append(jsonReader.s());
                    throw new JsonSyntaxException(sbU.toString());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    jsonWriter.s();
                } else {
                    jsonWriter.I(number.shortValue());
                }
            }
        });
        g = new AnonymousClass32(Integer.TYPE, Integer.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.j0() == JsonToken.j0) {
                    jsonReader.U();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.K());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    jsonWriter.s();
                } else {
                    jsonWriter.I(number.intValue());
                }
            }
        });
        f21293h = new AnonymousClass31(AtomicInteger.class, new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                try {
                    return new AtomicInteger(jsonReader.K());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                jsonWriter.I(((AtomicInteger) obj).get());
            }
        }.a());
        f21294i = new AnonymousClass31(AtomicBoolean.class, new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                return new AtomicBoolean(jsonReader.I());
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                jsonWriter.S(((AtomicBoolean) obj).get());
            }
        }.a());
        j = new AnonymousClass31(AtomicIntegerArray.class, new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) throws IOException {
                ArrayList arrayList = new ArrayList();
                jsonReader.d();
                while (jsonReader.t()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.K()));
                    } catch (NumberFormatException e2) {
                        throw new JsonSyntaxException(e2);
                    }
                }
                jsonReader.m();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                jsonWriter.h();
                int length = atomicIntegerArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    jsonWriter.I(atomicIntegerArray.get(i2));
                }
                jsonWriter.m();
            }
        }.a());
        k = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.j0() == JsonToken.j0) {
                    jsonReader.U();
                    return null;
                }
                try {
                    return Long.valueOf(jsonReader.P());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    jsonWriter.s();
                } else {
                    jsonWriter.I(number.longValue());
                }
            }
        };
        new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.j0() != JsonToken.j0) {
                    return Float.valueOf((float) jsonReader.J());
                }
                jsonReader.U();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    jsonWriter.s();
                    return;
                }
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(numberValueOf.floatValue());
                }
                jsonWriter.K(numberValueOf);
            }
        };
        new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.j0() != JsonToken.j0) {
                    return Double.valueOf(jsonReader.J());
                }
                jsonReader.U();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    jsonWriter.s();
                } else {
                    jsonWriter.H(number.doubleValue());
                }
            }
        };
        f21295l = new AnonymousClass32(Character.TYPE, Character.class, new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) throws IOException {
                if (jsonReader.j0() == JsonToken.j0) {
                    jsonReader.U();
                    return null;
                }
                String strC0 = jsonReader.c0();
                if (strC0.length() == 1) {
                    return Character.valueOf(strC0.charAt(0));
                }
                StringBuilder sbY = a.y("Expecting character, got: ", strC0, "; at ");
                sbY.append(jsonReader.s());
                throw new JsonSyntaxException(sbY.toString());
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                Character ch = (Character) obj;
                jsonWriter.P(ch == null ? null : String.valueOf(ch));
            }
        });
        TypeAdapter<String> typeAdapter2 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) throws IOException {
                JsonToken jsonTokenJ0 = jsonReader.j0();
                if (jsonTokenJ0 != JsonToken.j0) {
                    return jsonTokenJ0 == JsonToken.i0 ? Boolean.toString(jsonReader.I()) : jsonReader.c0();
                }
                jsonReader.U();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                jsonWriter.P((String) obj);
            }
        };
        m = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) throws IOException {
                if (jsonReader.j0() == JsonToken.j0) {
                    jsonReader.U();
                    return null;
                }
                String strC0 = jsonReader.c0();
                try {
                    return new BigDecimal(strC0);
                } catch (NumberFormatException e2) {
                    StringBuilder sbY = a.y("Failed parsing '", strC0, "' as BigDecimal; at path ");
                    sbY.append(jsonReader.s());
                    throw new JsonSyntaxException(sbY.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                jsonWriter.K((BigDecimal) obj);
            }
        };
        f21296n = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) throws IOException {
                if (jsonReader.j0() == JsonToken.j0) {
                    jsonReader.U();
                    return null;
                }
                String strC0 = jsonReader.c0();
                try {
                    return new BigInteger(strC0);
                } catch (NumberFormatException e2) {
                    StringBuilder sbY = a.y("Failed parsing '", strC0, "' as BigInteger; at path ");
                    sbY.append(jsonReader.s());
                    throw new JsonSyntaxException(sbY.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                jsonWriter.K((BigInteger) obj);
            }
        };
        o = new TypeAdapter<LazilyParsedNumber>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.j0() != JsonToken.j0) {
                    return new LazilyParsedNumber(jsonReader.c0());
                }
                jsonReader.U();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                jsonWriter.K((LazilyParsedNumber) obj);
            }
        };
        f21297p = new AnonymousClass31(String.class, typeAdapter2);
        q = new AnonymousClass31(StringBuilder.class, new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.j0() != JsonToken.j0) {
                    return new StringBuilder(jsonReader.c0());
                }
                jsonReader.U();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                StringBuilder sb = (StringBuilder) obj;
                jsonWriter.P(sb == null ? null : sb.toString());
            }
        });
        r = new AnonymousClass31(StringBuffer.class, new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.j0() != JsonToken.j0) {
                    return new StringBuffer(jsonReader.c0());
                }
                jsonReader.U();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                StringBuffer stringBuffer = (StringBuffer) obj;
                jsonWriter.P(stringBuffer == null ? null : stringBuffer.toString());
            }
        });
        s = new AnonymousClass31(URL.class, new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) throws IOException {
                if (jsonReader.j0() == JsonToken.j0) {
                    jsonReader.U();
                    return null;
                }
                String strC0 = jsonReader.c0();
                if (AbstractJsonLexerKt.NULL.equals(strC0)) {
                    return null;
                }
                return new URL(strC0);
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                URL url = (URL) obj;
                jsonWriter.P(url == null ? null : url.toExternalForm());
            }
        });
        t = new AnonymousClass31(URI.class, new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) throws IOException {
                if (jsonReader.j0() == JsonToken.j0) {
                    jsonReader.U();
                    return null;
                }
                try {
                    String strC0 = jsonReader.c0();
                    if (AbstractJsonLexerKt.NULL.equals(strC0)) {
                        return null;
                    }
                    return new URI(strC0);
                } catch (URISyntaxException e2) {
                    throw new JsonIOException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                URI uri = (URI) obj;
                jsonWriter.P(uri == null ? null : uri.toASCIIString());
            }
        });
        final TypeAdapter<InetAddress> typeAdapter3 = new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.j0() != JsonToken.j0) {
                    return InetAddress.getByName(jsonReader.c0());
                }
                jsonReader.U();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                InetAddress inetAddress = (InetAddress) obj;
                jsonWriter.P(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        final Class<InetAddress> cls = InetAddress.class;
        f21298u = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // com.google.gson.TypeAdapterFactory
            public final TypeAdapter b(Gson gson, TypeToken typeToken) {
                final Class<?> rawType = typeToken.getRawType();
                if (cls.isAssignableFrom(rawType)) {
                    return new TypeAdapter<Object>() { // from class: com.google.gson.internal.bind.TypeAdapters.34.1
                        @Override // com.google.gson.TypeAdapter
                        public final Object b(JsonReader jsonReader) {
                            Object objB = typeAdapter3.b(jsonReader);
                            if (objB != null) {
                                Class cls2 = rawType;
                                if (!cls2.isInstance(objB)) {
                                    throw new JsonSyntaxException("Expected a " + cls2.getName() + " but was " + objB.getClass().getName() + "; at path " + jsonReader.s());
                                }
                            }
                            return objB;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public final void c(JsonWriter jsonWriter, Object obj) {
                            typeAdapter3.c(jsonWriter, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter3 + d9.i.f24752e;
            }
        };
        v = new AnonymousClass31(UUID.class, new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) throws IOException {
                if (jsonReader.j0() == JsonToken.j0) {
                    jsonReader.U();
                    return null;
                }
                String strC0 = jsonReader.c0();
                try {
                    return UUID.fromString(strC0);
                } catch (IllegalArgumentException e2) {
                    StringBuilder sbY = a.y("Failed parsing '", strC0, "' as UUID; at path ");
                    sbY.append(jsonReader.s());
                    throw new JsonSyntaxException(sbY.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                UUID uuid = (UUID) obj;
                jsonWriter.P(uuid == null ? null : uuid.toString());
            }
        });
        f21299w = new AnonymousClass31(Currency.class, new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) throws IOException {
                String strC0 = jsonReader.c0();
                try {
                    return Currency.getInstance(strC0);
                } catch (IllegalArgumentException e2) {
                    StringBuilder sbY = a.y("Failed parsing '", strC0, "' as Currency; at path ");
                    sbY.append(jsonReader.s());
                    throw new JsonSyntaxException(sbY.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                jsonWriter.P(((Currency) obj).getCurrencyCode());
            }
        }.a());
        final TypeAdapter<Calendar> typeAdapter4 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) throws IOException {
                if (jsonReader.j0() == JsonToken.j0) {
                    jsonReader.U();
                    return null;
                }
                jsonReader.h();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (jsonReader.j0() != JsonToken.e0) {
                    String strS = jsonReader.S();
                    int iK = jsonReader.K();
                    if ("year".equals(strS)) {
                        i2 = iK;
                    } else if (o.C0684o.mm.equals(strS)) {
                        i3 = iK;
                    } else if ("dayOfMonth".equals(strS)) {
                        i4 = iK;
                    } else if ("hourOfDay".equals(strS)) {
                        i5 = iK;
                    } else if ("minute".equals(strS)) {
                        i6 = iK;
                    } else if ("second".equals(strS)) {
                        i7 = iK;
                    }
                }
                jsonReader.p();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    jsonWriter.s();
                    return;
                }
                jsonWriter.k();
                jsonWriter.q("year");
                jsonWriter.I(calendar.get(1));
                jsonWriter.q(o.C0684o.mm);
                jsonWriter.I(calendar.get(2));
                jsonWriter.q("dayOfMonth");
                jsonWriter.I(calendar.get(5));
                jsonWriter.q("hourOfDay");
                jsonWriter.I(calendar.get(11));
                jsonWriter.q("minute");
                jsonWriter.I(calendar.get(12));
                jsonWriter.q("second");
                jsonWriter.I(calendar.get(13));
                jsonWriter.p();
            }
        };
        x = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // com.google.gson.TypeAdapterFactory
            public final TypeAdapter b(Gson gson, TypeToken typeToken) {
                Class rawType = typeToken.getRawType();
                if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
                    return typeAdapter4;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + typeAdapter4 + d9.i.f24752e;
            }
        };
        y = new AnonymousClass31(Locale.class, new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.j0() == JsonToken.j0) {
                    jsonReader.U();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.c0(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (strNextToken2 == null && strNextToken3 == null) {
                    return new Locale(strNextToken);
                }
                return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                Locale locale = (Locale) obj;
                jsonWriter.P(locale == null ? null : locale.toString());
            }
        });
        final TypeAdapter<JsonElement> typeAdapter5 = new TypeAdapter<JsonElement>() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            public static JsonElement d(JsonReader jsonReader, JsonToken jsonToken) {
                int iOrdinal = jsonToken.ordinal();
                if (iOrdinal == 5) {
                    return new JsonPrimitive(jsonReader.c0());
                }
                if (iOrdinal == 6) {
                    return new JsonPrimitive(new LazilyParsedNumber(jsonReader.c0()));
                }
                if (iOrdinal == 7) {
                    return new JsonPrimitive(Boolean.valueOf(jsonReader.I()));
                }
                if (iOrdinal == 8) {
                    jsonReader.U();
                    return JsonNull.X;
                }
                throw new IllegalStateException("Unexpected token: " + jsonToken);
            }

            public static void e(JsonWriter jsonWriter, JsonElement jsonElement) throws IOException {
                if (jsonElement == null || (jsonElement instanceof JsonNull)) {
                    jsonWriter.s();
                    return;
                }
                boolean z2 = jsonElement instanceof JsonPrimitive;
                if (z2) {
                    if (!z2) {
                        throw new IllegalStateException("Not a JSON Primitive: " + jsonElement);
                    }
                    JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
                    Serializable serializable = jsonPrimitive.X;
                    if (serializable instanceof Number) {
                        jsonWriter.K(jsonPrimitive.c());
                        return;
                    } else if (serializable instanceof Boolean) {
                        jsonWriter.S(jsonPrimitive.a());
                        return;
                    } else {
                        jsonWriter.P(jsonPrimitive.d());
                        return;
                    }
                }
                boolean z3 = jsonElement instanceof JsonArray;
                if (z3) {
                    jsonWriter.h();
                    if (!z3) {
                        throw new IllegalStateException("Not a JSON Array: " + jsonElement);
                    }
                    Iterator it = ((JsonArray) jsonElement).X.iterator();
                    while (it.hasNext()) {
                        e(jsonWriter, (JsonElement) it.next());
                    }
                    jsonWriter.m();
                    return;
                }
                boolean z4 = jsonElement instanceof JsonObject;
                if (!z4) {
                    throw new IllegalArgumentException("Couldn't write " + jsonElement.getClass());
                }
                jsonWriter.k();
                if (!z4) {
                    throw new IllegalStateException("Not a JSON Object: " + jsonElement);
                }
                for (Map.Entry entry : ((JsonObject) jsonElement).X.entrySet()) {
                    jsonWriter.q((String) entry.getKey());
                    e(jsonWriter, (JsonElement) entry.getValue());
                }
                jsonWriter.p();
            }

            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) throws IOException {
                JsonElement jsonArray;
                JsonElement jsonArray2;
                if (jsonReader instanceof JsonTreeReader) {
                    JsonTreeReader jsonTreeReader = (JsonTreeReader) jsonReader;
                    JsonToken jsonTokenJ0 = jsonTreeReader.j0();
                    if (jsonTokenJ0 != JsonToken.f0 && jsonTokenJ0 != JsonToken.f21327Y && jsonTokenJ0 != JsonToken.e0 && jsonTokenJ0 != JsonToken.k0) {
                        JsonElement jsonElement = (JsonElement) jsonTreeReader.J0();
                        jsonTreeReader.z0();
                        return jsonElement;
                    }
                    throw new IllegalStateException("Unexpected " + jsonTokenJ0 + " when reading a JsonElement.");
                }
                JsonToken jsonTokenJ1 = jsonReader.j0();
                int iOrdinal = jsonTokenJ1.ordinal();
                if (iOrdinal == 0) {
                    jsonReader.d();
                    jsonArray = new JsonArray();
                } else if (iOrdinal != 2) {
                    jsonArray = null;
                } else {
                    jsonReader.h();
                    jsonArray = new JsonObject();
                }
                if (jsonArray == null) {
                    return d(jsonReader, jsonTokenJ1);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (jsonReader.t()) {
                        String strS = jsonArray instanceof JsonObject ? jsonReader.S() : null;
                        JsonToken jsonTokenJ2 = jsonReader.j0();
                        int iOrdinal2 = jsonTokenJ2.ordinal();
                        if (iOrdinal2 == 0) {
                            jsonReader.d();
                            jsonArray2 = new JsonArray();
                        } else if (iOrdinal2 != 2) {
                            jsonArray2 = null;
                        } else {
                            jsonReader.h();
                            jsonArray2 = new JsonObject();
                        }
                        boolean z2 = jsonArray2 != null;
                        if (jsonArray2 == null) {
                            jsonArray2 = d(jsonReader, jsonTokenJ2);
                        }
                        if (jsonArray instanceof JsonArray) {
                            ((JsonArray) jsonArray).X.add(jsonArray2);
                        } else {
                            ((JsonObject) jsonArray).X.put(strS, jsonArray2);
                        }
                        if (z2) {
                            arrayDeque.addLast(jsonArray);
                            jsonArray = jsonArray2;
                        }
                    } else {
                        if (jsonArray instanceof JsonArray) {
                            jsonReader.m();
                        } else {
                            jsonReader.p();
                        }
                        if (arrayDeque.isEmpty()) {
                            return jsonArray;
                        }
                        jsonArray = (JsonElement) arrayDeque.removeLast();
                    }
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void c(JsonWriter jsonWriter, Object obj) throws IOException {
                e(jsonWriter, (JsonElement) obj);
            }
        };
        f21300z = typeAdapter5;
        final Class<JsonElement> cls2 = JsonElement.class;
        f21287A = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // com.google.gson.TypeAdapterFactory
            public final TypeAdapter b(Gson gson, TypeToken typeToken) {
                final Class rawType = typeToken.getRawType();
                if (cls2.isAssignableFrom(rawType)) {
                    return new TypeAdapter<Object>() { // from class: com.google.gson.internal.bind.TypeAdapters.34.1
                        @Override // com.google.gson.TypeAdapter
                        public final Object b(JsonReader jsonReader) {
                            Object objB = typeAdapter5.b(jsonReader);
                            if (objB != null) {
                                Class cls3 = rawType;
                                if (!cls3.isInstance(objB)) {
                                    throw new JsonSyntaxException("Expected a " + cls3.getName() + " but was " + objB.getClass().getName() + "; at path " + jsonReader.s());
                                }
                            }
                            return objB;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public final void c(JsonWriter jsonWriter, Object obj) {
                            typeAdapter5.c(jsonWriter, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls2.getName() + ",adapter=" + typeAdapter5 + d9.i.f24752e;
            }
        };
        f21288B = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // com.google.gson.TypeAdapterFactory
            public final TypeAdapter b(Gson gson, TypeToken typeToken) {
                Class rawType = typeToken.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new EnumTypeAdapter(rawType);
            }
        };
    }

    public static TypeAdapterFactory a(Class cls, TypeAdapter typeAdapter) {
        return new AnonymousClass31(cls, typeAdapter);
    }

    public static TypeAdapterFactory b(Class cls, Class cls2, TypeAdapter typeAdapter) {
        return new AnonymousClass32(cls, cls2, typeAdapter);
    }
}
