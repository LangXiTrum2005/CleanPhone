package com.google.gson.internal.bind;

import android.support.v4.media.a;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.ReflectionAccessFilterHelper;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {
    public final ConstructorConstructor X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final FieldNamingPolicy f21267Y;
    public final Excluder Z;
    public final List e0;

    public static abstract class Adapter<T, A> extends TypeAdapter<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f21272a;

        public Adapter(LinkedHashMap linkedHashMap) {
            this.f21272a = linkedHashMap;
        }

        @Override // com.google.gson.TypeAdapter
        public final Object b(JsonReader jsonReader) throws IOException {
            if (jsonReader.j0() == JsonToken.j0) {
                jsonReader.U();
                return null;
            }
            Object objD = d();
            try {
                jsonReader.h();
                while (jsonReader.t()) {
                    BoundField boundField = (BoundField) this.f21272a.get(jsonReader.S());
                    if (boundField == null || !boundField.d) {
                        jsonReader.z0();
                    } else {
                        f(objD, jsonReader, boundField);
                    }
                }
                jsonReader.p();
                return e(objD);
            } catch (IllegalAccessException e2) {
                ReflectionHelper.RecordHelper recordHelper = ReflectionHelper.f21312a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
            } catch (IllegalStateException e3) {
                throw new JsonSyntaxException(e3);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
            if (obj == null) {
                jsonWriter.s();
                return;
            }
            jsonWriter.k();
            try {
                Iterator it = this.f21272a.values().iterator();
                while (it.hasNext()) {
                    ((BoundField) it.next()).c(jsonWriter, obj);
                }
                jsonWriter.p();
            } catch (IllegalAccessException e2) {
                ReflectionHelper.RecordHelper recordHelper = ReflectionHelper.f21312a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
            }
        }

        public abstract Object d();

        public abstract Object e(Object obj);

        public abstract void f(Object obj, JsonReader jsonReader, BoundField boundField);
    }

    public static abstract class BoundField {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f21274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21275c;
        public final boolean d;

        public BoundField(String str, String str2, boolean z2, boolean z3) {
            this.f21273a = str;
            this.f21274b = str2;
            this.f21275c = z2;
            this.d = z3;
        }

        public abstract void a(JsonReader jsonReader, int i2, Object[] objArr);

        public abstract void b(JsonReader jsonReader, Object obj);

        public abstract void c(JsonWriter jsonWriter, Object obj);
    }

    public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ObjectConstructor f21276b;

        public FieldReflectionAdapter(ObjectConstructor objectConstructor, LinkedHashMap linkedHashMap) {
            super(linkedHashMap);
            this.f21276b = objectConstructor;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object d() {
            return this.f21276b.construct();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object e(Object obj) {
            return obj;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void f(Object obj, JsonReader jsonReader, BoundField boundField) {
            boundField.b(jsonReader, obj);
        }
    }

    public static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final HashMap f21277e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Constructor f21278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object[] f21279c;
        public final HashMap d;

        static {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            f21277e = map;
        }

        public RecordAdapter(Class cls, LinkedHashMap linkedHashMap, boolean z2) {
            super(linkedHashMap);
            this.d = new HashMap();
            Constructor constructorE = ReflectionHelper.e(cls);
            this.f21278b = constructorE;
            if (z2) {
                ReflectiveTypeAdapterFactory.a(null, constructorE);
            } else {
                ReflectionHelper.h(constructorE);
            }
            String[] strArrF = ReflectionHelper.f(cls);
            for (int i2 = 0; i2 < strArrF.length; i2++) {
                this.d.put(strArrF[i2], Integer.valueOf(i2));
            }
            Class<?>[] parameterTypes = this.f21278b.getParameterTypes();
            this.f21279c = new Object[parameterTypes.length];
            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                this.f21279c[i3] = f21277e.get(parameterTypes[i3]);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object d() {
            return (Object[]) this.f21279c.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object e(Object obj) {
            Object[] objArr = (Object[]) obj;
            Constructor constructor = this.f21278b;
            try {
                return constructor.newInstance(objArr);
            } catch (IllegalAccessException e2) {
                ReflectionHelper.RecordHelper recordHelper = ReflectionHelper.f21312a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
            } catch (IllegalArgumentException e3) {
                e = e3;
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e4) {
                e = e4;
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.b(constructor) + "' with args " + Arrays.toString(objArr), e5.getCause());
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void f(Object obj, JsonReader jsonReader, BoundField boundField) {
            Object[] objArr = (Object[]) obj;
            HashMap map = this.d;
            String str = boundField.f21274b;
            Integer num = (Integer) map.get(str);
            if (num != null) {
                boundField.a(jsonReader, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + ReflectionHelper.b(this.f21278b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, FieldNamingPolicy fieldNamingPolicy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.X = constructorConstructor;
        this.f21267Y = fieldNamingPolicy;
        this.Z = excluder;
        this.e0 = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!ReflectionAccessFilterHelper.a(obj, accessibleObject)) {
            throw new JsonIOException(a.m(ReflectionHelper.c(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter b(Gson gson, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        ReflectionAccessFilter.FilterResult filterResultB = ReflectionAccessFilterHelper.b(rawType, this.e0);
        if (filterResultB != ReflectionAccessFilter.FilterResult.e0) {
            boolean z2 = filterResultB == ReflectionAccessFilter.FilterResult.Z;
            return ReflectionHelper.g(rawType) ? new RecordAdapter(rawType, c(gson, typeToken, rawType, z2, true), z2) : new FieldReflectionAdapter(this.X.b(typeToken), c(gson, typeToken, rawType, z2, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    /* JADX WARN: Code duplicated, block: B:52:0x0105  */
    /* JADX WARN: Code duplicated, block: B:55:0x011d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0125  */
    /* JADX WARN: Code duplicated, block: B:63:0x013e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0159  */
    /* JADX WARN: Code duplicated, block: B:73:0x0169  */
    /* JADX WARN: Code duplicated, block: B:74:0x0170  */
    /* JADX WARN: Code duplicated, block: B:77:0x0175  */
    /* JADX WARN: Code duplicated, block: B:78:0x0178  */
    /* JADX WARN: Code duplicated, block: B:80:0x017b  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01e4 A[SYNTHETIC] */
    public final LinkedHashMap c(final Gson gson, TypeToken typeToken, Class cls, boolean z2, boolean z3) {
        Method methodD;
        LinkedHashMap linkedHashMap;
        Type type;
        Type typeI;
        SerializedName serializedName;
        String strValue;
        String[] strArrAlternate;
        List listSingletonList;
        int size;
        BoundField boundField;
        int i2;
        boolean z4;
        Class cls2;
        Field[] fieldArr;
        int i3;
        int i4;
        BoundField boundField2;
        LinkedHashMap linkedHashMap2;
        Type type2;
        boolean z5;
        boolean z6;
        final TypeToken<?> typeToken2;
        Class<? super Object> rawType;
        final boolean z7;
        int modifiers;
        final boolean z8;
        JsonAdapter jsonAdapter;
        TypeAdapter typeAdapterD;
        final boolean z9;
        Class cls3 = cls;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (!cls3.isInterface()) {
            Type type3 = typeToken.getType();
            TypeToken typeToken3 = typeToken;
            boolean z10 = z2;
            Class rawType2 = cls3;
            while (rawType2 != Object.class) {
                Field[] declaredFields = rawType2.getDeclaredFields();
                boolean z11 = true;
                boolean z12 = false;
                if (rawType2 != cls3 && declaredFields.length > 0) {
                    ReflectionAccessFilter.FilterResult filterResultB = ReflectionAccessFilterHelper.b(rawType2, this.e0);
                    if (filterResultB == ReflectionAccessFilter.FilterResult.e0) {
                        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType2 + " (supertype of " + cls3 + "). Register a TypeAdapter for this type or adjust the access filter.");
                    }
                    z10 = filterResultB == ReflectionAccessFilter.FilterResult.Z;
                }
                int length = declaredFields.length;
                int i5 = 0;
                while (i5 < length) {
                    int i6 = length;
                    final Field field = declaredFields[i5];
                    boolean zD = this.d(field, z11);
                    boolean zD2 = this.d(field, z12);
                    if (zD || zD2) {
                        if (z3) {
                            if (Modifier.isStatic(field.getModifiers())) {
                                zD2 = z12;
                            } else {
                                z11 = z11;
                                methodD = ReflectionHelper.d(rawType2, field);
                                if (!z10) {
                                    ReflectionHelper.h(methodD);
                                }
                                if (methodD.getAnnotation(SerializedName.class) != null && field.getAnnotation(SerializedName.class) == null) {
                                    throw new JsonIOException(a.n("@SerializedName on ", ReflectionHelper.c(methodD, z12), " is not supported"));
                                }
                            }
                            if (!z10 && methodD == null) {
                                ReflectionHelper.h(field);
                            }
                            linkedHashMap = linkedHashMap3;
                            type = type3;
                            typeI = C$Gson$Types.i(typeToken3.getType(), rawType2, field.getGenericType(), new HashMap());
                            serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                            if (serializedName == null) {
                                listSingletonList = Collections.singletonList(this.f21267Y.a(field));
                            } else {
                                strValue = serializedName.value();
                                strArrAlternate = serializedName.alternate();
                                if (strArrAlternate.length == 0) {
                                    listSingletonList = Collections.singletonList(strValue);
                                } else {
                                    ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
                                    arrayList.add(strValue);
                                    Collections.addAll(arrayList, strArrAlternate);
                                    listSingletonList = arrayList;
                                }
                            }
                            size = listSingletonList.size();
                            boundField = null;
                            i2 = 0;
                            while (i2 < size) {
                                String str = (String) listSingletonList.get(i2);
                                if (i2 != 0) {
                                    zD = false;
                                }
                                List list = listSingletonList;
                                typeToken2 = TypeToken.get(typeI);
                                rawType = typeToken2.getRawType();
                                if (rawType == null && rawType.isPrimitive()) {
                                    z7 = z11;
                                } else {
                                    z7 = false;
                                }
                                modifiers = field.getModifiers();
                                if (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) {
                                    z8 = false;
                                } else {
                                    z8 = z11;
                                }
                                int i7 = size;
                                jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
                                final boolean z13 = z10;
                                if (jsonAdapter != null) {
                                    typeAdapterD = JsonAdapterAnnotationTypeAdapterFactory.a(this.X, gson, typeToken2, jsonAdapter);
                                } else {
                                    typeAdapterD = null;
                                }
                                int i8 = i5;
                                if (typeAdapterD != null) {
                                    z9 = z11;
                                } else {
                                    z9 = false;
                                }
                                if (typeAdapterD == null) {
                                    typeAdapterD = gson.d(typeToken2);
                                }
                                Class cls4 = rawType2;
                                boolean z14 = zD;
                                int i9 = i6;
                                final TypeAdapter typeAdapter = typeAdapterD;
                                int i10 = i2;
                                final Method method = methodD;
                                LinkedHashMap linkedHashMap4 = linkedHashMap;
                                Type type4 = type;
                                boolean z15 = z11;
                                boundField = (BoundField) linkedHashMap4.put(str, new BoundField(str, field.getName(), z14, zD2) { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.1
                                    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
                                    public final void a(JsonReader jsonReader, int i11, Object[] objArr) {
                                        Object objB = typeAdapter.b(jsonReader);
                                        if (objB != null || !z7) {
                                            objArr[i11] = objB;
                                            return;
                                        }
                                        throw new JsonParseException("null is not allowed as value for record component '" + this.f21274b + "' of primitive type; at path " + jsonReader.u());
                                    }

                                    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
                                    public final void b(JsonReader jsonReader, Object obj) throws IllegalAccessException {
                                        Object objB = typeAdapter.b(jsonReader);
                                        if (objB == null && z7) {
                                            return;
                                        }
                                        Field field2 = field;
                                        if (z13) {
                                            ReflectiveTypeAdapterFactory.a(obj, field2);
                                        } else if (z8) {
                                            throw new JsonIOException(a.C("Cannot set value of 'static final' ", ReflectionHelper.c(field2, false)));
                                        }
                                        field2.set(obj, objB);
                                    }

                                    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
                                    public final void c(JsonWriter jsonWriter, Object obj) throws IllegalAccessException {
                                        Object objInvoke;
                                        if (this.f21275c) {
                                            Field field2 = field;
                                            boolean z16 = z13;
                                            Method method2 = method;
                                            if (z16) {
                                                if (method2 == null) {
                                                    ReflectiveTypeAdapterFactory.a(obj, field2);
                                                } else {
                                                    ReflectiveTypeAdapterFactory.a(obj, method2);
                                                }
                                            }
                                            if (method2 != null) {
                                                try {
                                                    objInvoke = method2.invoke(obj, new Object[0]);
                                                } catch (InvocationTargetException e2) {
                                                    throw new JsonIOException(a.n("Accessor ", ReflectionHelper.c(method2, false), " threw exception"), e2.getCause());
                                                }
                                            } else {
                                                objInvoke = field2.get(obj);
                                            }
                                            if (objInvoke == obj) {
                                                return;
                                            }
                                            jsonWriter.q(this.f21273a);
                                            boolean z17 = z9;
                                            TypeAdapter typeAdapterRuntimeTypeWrapper = typeAdapter;
                                            if (!z17) {
                                                typeAdapterRuntimeTypeWrapper = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapterRuntimeTypeWrapper, typeToken2.getType());
                                            }
                                            typeAdapterRuntimeTypeWrapper.c(jsonWriter, objInvoke);
                                        }
                                    }
                                });
                                if (boundField == 0) {
                                    boundField = boundField;
                                }
                                int i11 = i10 + 1;
                                gson = gson;
                                type = type4;
                                zD = z14;
                                zD2 = zD2;
                                z10 = z13;
                                methodD = method;
                                z11 = z15;
                                i6 = i9;
                                declaredFields = declaredFields;
                                size = i7;
                                rawType2 = cls4;
                                i5 = i8;
                                this = this;
                                i2 = i11;
                                linkedHashMap = linkedHashMap4;
                                listSingletonList = list;
                            }
                            z4 = z10;
                            cls2 = rawType2;
                            fieldArr = declaredFields;
                            i3 = i5;
                            i4 = i6;
                            boundField2 = boundField;
                            linkedHashMap2 = linkedHashMap;
                            type2 = type;
                            z5 = false;
                            z6 = z11;
                            if (boundField2 == null) {
                                throw new IllegalArgumentException(type2 + " declares multiple JSON fields named " + boundField2.f21273a);
                            }
                        }
                        methodD = null;
                        if (!z10) {
                            ReflectionHelper.h(field);
                        }
                        linkedHashMap = linkedHashMap3;
                        type = type3;
                        typeI = C$Gson$Types.i(typeToken3.getType(), rawType2, field.getGenericType(), new HashMap());
                        serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                        if (serializedName == null) {
                            listSingletonList = Collections.singletonList(this.f21267Y.a(field));
                        } else {
                            strValue = serializedName.value();
                            strArrAlternate = serializedName.alternate();
                            if (strArrAlternate.length == 0) {
                                listSingletonList = Collections.singletonList(strValue);
                            } else {
                                ArrayList arrayList2 = new ArrayList(strArrAlternate.length + 1);
                                arrayList2.add(strValue);
                                Collections.addAll(arrayList2, strArrAlternate);
                                listSingletonList = arrayList2;
                            }
                        }
                        size = listSingletonList.size();
                        boundField = null;
                        i2 = 0;
                        while (i2 < size) {
                            String str2 = (String) listSingletonList.get(i2);
                            if (i2 != 0) {
                                zD = false;
                            }
                            List list2 = listSingletonList;
                            typeToken2 = TypeToken.get(typeI);
                            rawType = typeToken2.getRawType();
                            if (rawType == null) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            modifiers = field.getModifiers();
                            if (Modifier.isStatic(modifiers)) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            int i12 = size;
                            jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
                            final boolean z16 = z10;
                            if (jsonAdapter != null) {
                                typeAdapterD = JsonAdapterAnnotationTypeAdapterFactory.a(this.X, gson, typeToken2, jsonAdapter);
                            } else {
                                typeAdapterD = null;
                            }
                            int i13 = i5;
                            if (typeAdapterD != null) {
                                z9 = z11;
                            } else {
                                z9 = false;
                            }
                            if (typeAdapterD == null) {
                                typeAdapterD = gson.d(typeToken2);
                            }
                            Class cls5 = rawType2;
                            boolean z17 = zD;
                            int i14 = i6;
                            final TypeAdapter typeAdapter2 = typeAdapterD;
                            int i15 = i2;
                            final Method method2 = methodD;
                            LinkedHashMap linkedHashMap5 = linkedHashMap;
                            Type type5 = type;
                            boolean z18 = z11;
                            boundField = (BoundField) linkedHashMap5.put(str2, new BoundField(str2, field.getName(), z17, zD2) { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.1
                                @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
                                public final void a(JsonReader jsonReader, int i16, Object[] objArr) {
                                    Object objB = typeAdapter2.b(jsonReader);
                                    if (objB != null || !z7) {
                                        objArr[i16] = objB;
                                        return;
                                    }
                                    throw new JsonParseException("null is not allowed as value for record component '" + this.f21274b + "' of primitive type; at path " + jsonReader.u());
                                }

                                @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
                                public final void b(JsonReader jsonReader, Object obj) throws IllegalAccessException {
                                    Object objB = typeAdapter2.b(jsonReader);
                                    if (objB == null && z7) {
                                        return;
                                    }
                                    Field field2 = field;
                                    if (z16) {
                                        ReflectiveTypeAdapterFactory.a(obj, field2);
                                    } else if (z8) {
                                        throw new JsonIOException(a.C("Cannot set value of 'static final' ", ReflectionHelper.c(field2, false)));
                                    }
                                    field2.set(obj, objB);
                                }

                                @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
                                public final void c(JsonWriter jsonWriter, Object obj) throws IllegalAccessException {
                                    Object objInvoke;
                                    if (this.f21275c) {
                                        Field field2 = field;
                                        boolean z19 = z16;
                                        Method method3 = method2;
                                        if (z19) {
                                            if (method3 == null) {
                                                ReflectiveTypeAdapterFactory.a(obj, field2);
                                            } else {
                                                ReflectiveTypeAdapterFactory.a(obj, method3);
                                            }
                                        }
                                        if (method3 != null) {
                                            try {
                                                objInvoke = method3.invoke(obj, new Object[0]);
                                            } catch (InvocationTargetException e2) {
                                                throw new JsonIOException(a.n("Accessor ", ReflectionHelper.c(method3, false), " threw exception"), e2.getCause());
                                            }
                                        } else {
                                            objInvoke = field2.get(obj);
                                        }
                                        if (objInvoke == obj) {
                                            return;
                                        }
                                        jsonWriter.q(this.f21273a);
                                        boolean z110 = z9;
                                        TypeAdapter typeAdapterRuntimeTypeWrapper = typeAdapter2;
                                        if (!z110) {
                                            typeAdapterRuntimeTypeWrapper = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapterRuntimeTypeWrapper, typeToken2.getType());
                                        }
                                        typeAdapterRuntimeTypeWrapper.c(jsonWriter, objInvoke);
                                    }
                                }
                            });
                            if (boundField == 0) {
                                boundField = boundField;
                            }
                            int i16 = i15 + 1;
                            gson = gson;
                            type = type5;
                            zD = z17;
                            zD2 = zD2;
                            z10 = z16;
                            methodD = method2;
                            z11 = z18;
                            i6 = i14;
                            declaredFields = declaredFields;
                            size = i12;
                            rawType2 = cls5;
                            i5 = i13;
                            this = this;
                            i2 = i16;
                            linkedHashMap = linkedHashMap5;
                            listSingletonList = list2;
                        }
                        z4 = z10;
                        cls2 = rawType2;
                        fieldArr = declaredFields;
                        i3 = i5;
                        i4 = i6;
                        boundField2 = boundField;
                        linkedHashMap2 = linkedHashMap;
                        type2 = type;
                        z5 = false;
                        z6 = z11;
                        if (boundField2 == null) {
                            throw new IllegalArgumentException(type2 + " declares multiple JSON fields named " + boundField2.f21273a);
                        }
                    } else {
                        linkedHashMap2 = linkedHashMap3;
                        type2 = type3;
                        cls2 = rawType2;
                        fieldArr = declaredFields;
                        z6 = z11;
                        z5 = z12;
                        i3 = i5;
                        i4 = i6;
                        z4 = z10;
                    }
                    i5 = i3 + 1;
                    gson = gson;
                    type3 = type2;
                    z10 = z4;
                    linkedHashMap3 = linkedHashMap2;
                    z11 = z6;
                    z12 = z5;
                    length = i4;
                    declaredFields = fieldArr;
                    rawType2 = cls2;
                    this = this;
                }
                Class cls6 = rawType2;
                typeToken3 = TypeToken.get(C$Gson$Types.i(typeToken3.getType(), cls6, cls6.getGenericSuperclass(), new HashMap()));
                rawType2 = typeToken3.getRawType();
                type3 = type3;
                z10 = z10;
                linkedHashMap3 = linkedHashMap3;
                cls3 = cls;
            }
        }
        return linkedHashMap3;
    }

    public final boolean d(Field field, boolean z2) {
        Class<?> type = field.getType();
        Excluder excluder = this.Z;
        if (excluder.c(type) || excluder.d(type, z2) || (field.getModifiers() & Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE) != 0 || field.isSynthetic() || Excluder.e(field.getType())) {
            return false;
        }
        List list = z2 ? excluder.X : excluder.f21226Y;
        if (list.isEmpty()) {
            return true;
        }
        new FieldAttributes(field);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((ExclusionStrategy) it.next()).b()) {
                return false;
            }
        }
        return true;
    }
}
