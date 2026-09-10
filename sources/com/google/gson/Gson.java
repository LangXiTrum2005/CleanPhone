package com.google.gson;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.SqlTypesSupport;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes4.dex */
public final class Gson {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f21187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f21188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstructorConstructor f21189c;
    public final JsonAdapterAnnotationTypeAdapterFactory d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f21190e;
    public final Map f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f21191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f21192i;
    public final List j;

    /* JADX INFO: renamed from: com.google.gson.Gson$1, reason: invalid class name */
    class AnonymousClass1 extends TypeAdapter<Number> {
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
                return;
            }
            double dDoubleValue = number.doubleValue();
            Gson.a(dDoubleValue);
            jsonWriter.H(dDoubleValue);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.Gson$2, reason: invalid class name */
    class AnonymousClass2 extends TypeAdapter<Number> {
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
            float fFloatValue = numberValueOf.floatValue();
            Gson.a(fFloatValue);
            if (!(numberValueOf instanceof Float)) {
                numberValueOf = Float.valueOf(fFloatValue);
            }
            jsonWriter.K(numberValueOf);
        }
    }

    public static class FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TypeAdapter f21195a;

        @Override // com.google.gson.TypeAdapter
        public final Object b(JsonReader jsonReader) {
            TypeAdapter typeAdapter = this.f21195a;
            if (typeAdapter != null) {
                return typeAdapter.b(jsonReader);
            }
            throw new IllegalStateException("Delegate has not been set yet");
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, Object obj) {
            TypeAdapter typeAdapter = this.f21195a;
            if (typeAdapter == null) {
                throw new IllegalStateException("Delegate has not been set yet");
            }
            typeAdapter.c(jsonWriter, obj);
        }

        @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
        public final TypeAdapter d() {
            TypeAdapter typeAdapter = this.f21195a;
            if (typeAdapter != null) {
                return typeAdapter;
            }
            throw new IllegalStateException("Delegate has not been set yet");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Gson() {
        Excluder excluder = Excluder.Z;
        FieldNamingPolicy fieldNamingPolicy = FieldNamingPolicy.X;
        Map map = Collections.EMPTY_MAP;
        LongSerializationPolicy longSerializationPolicy = LongSerializationPolicy.X;
        List list = Collections.EMPTY_LIST;
        this(excluder, fieldNamingPolicy, map, true, true, longSerializationPolicy, list, list, list, ToNumberPolicy.X, ToNumberPolicy.f21205Y, list);
    }

    public static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(String str, TypeToken typeToken) {
        Object objB = null;
        if (str == null) {
            return null;
        }
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        boolean z2 = true;
        jsonReader.f21326Y = true;
        try {
            try {
                try {
                    try {
                        try {
                            jsonReader.j0();
                            try {
                                objB = d(typeToken).b(jsonReader);
                            } catch (EOFException e2) {
                                e = e2;
                                z2 = false;
                                if (!z2) {
                                    throw new JsonSyntaxException(e);
                                }
                            }
                        } catch (AssertionError e3) {
                            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.10): " + e3.getMessage());
                            assertionError.initCause(e3);
                            throw assertionError;
                        }
                    } catch (IllegalStateException e4) {
                        throw new JsonSyntaxException(e4);
                    }
                } catch (IOException e5) {
                    throw new JsonSyntaxException(e5);
                }
            } catch (EOFException e6) {
                e = e6;
            }
            jsonReader.f21326Y = false;
            if (objB != null) {
                try {
                    if (jsonReader.j0() != JsonToken.k0) {
                        throw new JsonSyntaxException("JSON document was not fully consumed.");
                    }
                } catch (MalformedJsonException e7) {
                    throw new JsonSyntaxException(e7);
                } catch (IOException e8) {
                    throw new JsonIOException(e8);
                }
            }
            return objB;
        } catch (Throwable th) {
            jsonReader.f21326Y = false;
            throw th;
        }
    }

    public final Object c(String str, Class cls) {
        Object objB = b(str, TypeToken.get(cls));
        if (cls == Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(objB);
    }

    public final TypeAdapter d(TypeToken typeToken) {
        boolean z2;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f21188b;
        TypeAdapter typeAdapter = (TypeAdapter) concurrentHashMap.get(typeToken);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        ThreadLocal threadLocal = this.f21187a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z2 = true;
        } else {
            z2 = false;
        }
        FutureTypeAdapter futureTypeAdapter = (FutureTypeAdapter) map.get(typeToken);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter futureTypeAdapter2 = new FutureTypeAdapter();
            map.put(typeToken, futureTypeAdapter2);
            Iterator it = this.f21190e.iterator();
            while (it.hasNext()) {
                TypeAdapter typeAdapterB = ((TypeAdapterFactory) it.next()).b(this, typeToken);
                if (typeAdapterB != null) {
                    TypeAdapter typeAdapter2 = (TypeAdapter) concurrentHashMap.putIfAbsent(typeToken, typeAdapterB);
                    if (typeAdapter2 != null) {
                        typeAdapterB = typeAdapter2;
                    }
                    if (futureTypeAdapter2.f21195a != null) {
                        throw new AssertionError();
                    }
                    futureTypeAdapter2.f21195a = typeAdapterB;
                    map.remove(typeToken);
                    if (z2) {
                        threadLocal.remove();
                    }
                    return typeAdapterB;
                }
            }
            throw new IllegalArgumentException("GSON (2.10) cannot handle " + typeToken);
        } catch (Throwable th) {
            map.remove(typeToken);
            if (z2) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final TypeAdapter e(TypeAdapterFactory typeAdapterFactory, TypeToken typeToken) {
        List<TypeAdapterFactory> list = this.f21190e;
        if (!list.contains(typeAdapterFactory)) {
            typeAdapterFactory = this.d;
        }
        boolean z2 = false;
        for (TypeAdapterFactory typeAdapterFactory2 : list) {
            if (z2) {
                TypeAdapter typeAdapterB = typeAdapterFactory2.b(this, typeToken);
                if (typeAdapterB != null) {
                    return typeAdapterB;
                }
            } else if (typeAdapterFactory2 == typeAdapterFactory) {
                z2 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public final JsonWriter f(Writer writer) {
        JsonWriter jsonWriter = new JsonWriter(writer);
        jsonWriter.g0 = this.g;
        jsonWriter.f0 = false;
        jsonWriter.i0 = false;
        return jsonWriter;
    }

    public final String g(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                h(f(stringWriter));
                return stringWriter.toString();
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            i(obj, cls, f(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e3) {
            throw new JsonIOException(e3);
        }
    }

    public final void h(JsonWriter jsonWriter) {
        JsonNull jsonNull = JsonNull.X;
        boolean z2 = jsonWriter.f0;
        jsonWriter.f0 = true;
        boolean z3 = jsonWriter.g0;
        jsonWriter.g0 = this.g;
        boolean z4 = jsonWriter.i0;
        jsonWriter.i0 = false;
        try {
            try {
                try {
                    TypeAdapters.f21300z.c(jsonWriter, jsonNull);
                    jsonWriter.f0 = z2;
                    jsonWriter.g0 = z3;
                    jsonWriter.i0 = z4;
                } catch (IOException e2) {
                    throw new JsonIOException(e2);
                }
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.10): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } catch (Throwable th) {
            jsonWriter.f0 = z2;
            jsonWriter.g0 = z3;
            jsonWriter.i0 = z4;
            throw th;
        }
    }

    public final void i(Object obj, Class cls, JsonWriter jsonWriter) {
        TypeAdapter typeAdapterD = d(TypeToken.get((Type) cls));
        boolean z2 = jsonWriter.f0;
        jsonWriter.f0 = true;
        boolean z3 = jsonWriter.g0;
        jsonWriter.g0 = this.g;
        boolean z4 = jsonWriter.i0;
        jsonWriter.i0 = false;
        try {
            try {
                try {
                    typeAdapterD.c(jsonWriter, obj);
                    jsonWriter.f0 = z2;
                    jsonWriter.g0 = z3;
                    jsonWriter.i0 = z4;
                } catch (AssertionError e2) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.10): " + e2.getMessage());
                    assertionError.initCause(e2);
                    throw assertionError;
                }
            } catch (IOException e3) {
                throw new JsonIOException(e3);
            }
        } catch (Throwable th) {
            jsonWriter.f0 = z2;
            jsonWriter.g0 = z3;
            jsonWriter.i0 = z4;
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f21190e + ",instanceCreators:" + this.f21189c + "}";
    }

    public Gson(Excluder excluder, FieldNamingPolicy fieldNamingPolicy, Map map, boolean z2, boolean z3, LongSerializationPolicy longSerializationPolicy, List list, List list2, List list3, ToNumberPolicy toNumberPolicy, ToNumberPolicy toNumberPolicy2, List list4) {
        final TypeAdapter<Number> typeAdapter;
        TypeAdapterFactory typeAdapterFactoryD;
        this.f21187a = new ThreadLocal();
        this.f21188b = new ConcurrentHashMap();
        this.f = map;
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(map, z3, list4);
        this.f21189c = constructorConstructor;
        this.g = z2;
        this.f21191h = list;
        this.f21192i = list2;
        this.j = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f21287A);
        arrayList.add(ObjectTypeAdapter.d(toNumberPolicy));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f21297p);
        arrayList.add(TypeAdapters.g);
        arrayList.add(TypeAdapters.d);
        arrayList.add(TypeAdapters.f21292e);
        arrayList.add(TypeAdapters.f);
        if (longSerializationPolicy == LongSerializationPolicy.X) {
            typeAdapter = TypeAdapters.k;
        } else {
            typeAdapter = new TypeAdapter<Number>() { // from class: com.google.gson.Gson.3
                @Override // com.google.gson.TypeAdapter
                public final Object b(JsonReader jsonReader) {
                    if (jsonReader.j0() != JsonToken.j0) {
                        return Long.valueOf(jsonReader.P());
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
                        jsonWriter.P(number.toString());
                    }
                }
            };
        }
        arrayList.add(TypeAdapters.b(Long.TYPE, Long.class, typeAdapter));
        arrayList.add(TypeAdapters.b(Double.TYPE, Double.class, new AnonymousClass1()));
        arrayList.add(TypeAdapters.b(Float.TYPE, Float.class, new AnonymousClass2()));
        if (toNumberPolicy2 == ToNumberPolicy.f21205Y) {
            typeAdapterFactoryD = NumberTypeAdapter.f21260b;
        } else {
            typeAdapterFactoryD = NumberTypeAdapter.d(toNumberPolicy2);
        }
        arrayList.add(typeAdapterFactoryD);
        arrayList.add(TypeAdapters.f21293h);
        arrayList.add(TypeAdapters.f21294i);
        arrayList.add(TypeAdapters.a(AtomicLong.class, new TypeAdapter.AnonymousClass1()));
        arrayList.add(TypeAdapters.a(AtomicLongArray.class, new TypeAdapter.AnonymousClass1()));
        arrayList.add(TypeAdapters.j);
        arrayList.add(TypeAdapters.f21295l);
        arrayList.add(TypeAdapters.q);
        arrayList.add(TypeAdapters.r);
        arrayList.add(TypeAdapters.a(BigDecimal.class, TypeAdapters.m));
        arrayList.add(TypeAdapters.a(BigInteger.class, TypeAdapters.f21296n));
        arrayList.add(TypeAdapters.a(LazilyParsedNumber.class, TypeAdapters.o));
        arrayList.add(TypeAdapters.s);
        arrayList.add(TypeAdapters.t);
        arrayList.add(TypeAdapters.v);
        arrayList.add(TypeAdapters.f21299w);
        arrayList.add(TypeAdapters.y);
        arrayList.add(TypeAdapters.f21298u);
        arrayList.add(TypeAdapters.f21290b);
        arrayList.add(DateTypeAdapter.f21250b);
        arrayList.add(TypeAdapters.x);
        if (SqlTypesSupport.f21322a) {
            arrayList.add(SqlTypesSupport.f21325e);
            arrayList.add(SqlTypesSupport.d);
            arrayList.add(SqlTypesSupport.f);
        }
        arrayList.add(ArrayTypeAdapter.f21245c);
        arrayList.add(TypeAdapters.f21289a);
        arrayList.add(new CollectionTypeAdapterFactory(constructorConstructor));
        arrayList.add(new MapTypeAdapterFactory(constructorConstructor));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        this.d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f21288B);
        arrayList.add(new ReflectiveTypeAdapterFactory(constructorConstructor, fieldNamingPolicy, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f21190e = Collections.unmodifiableList(arrayList);
    }
}
