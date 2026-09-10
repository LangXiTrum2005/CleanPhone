package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.ToNumberPolicy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TypeAdapterFactory f21263c = new AnonymousClass1(ToNumberPolicy.X);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f21264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ToNumberPolicy f21265b;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements TypeAdapterFactory {
        public final /* synthetic */ ToNumberPolicy X;

        public AnonymousClass1(ToNumberPolicy toNumberPolicy) {
            this.X = toNumberPolicy;
        }

        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter b(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Object.class) {
                return new ObjectTypeAdapter(gson, this.X);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21266a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f21266a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21266a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21266a[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21266a[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21266a[7] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21266a[8] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ObjectTypeAdapter(Gson gson, ToNumberPolicy toNumberPolicy) {
        this.f21264a = gson;
        this.f21265b = toNumberPolicy;
    }

    public static TypeAdapterFactory d(ToNumberPolicy toNumberPolicy) {
        return toNumberPolicy == ToNumberPolicy.X ? f21263c : new AnonymousClass1(toNumberPolicy);
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        JsonToken jsonTokenJ0 = jsonReader.j0();
        int iOrdinal = jsonTokenJ0.ordinal();
        if (iOrdinal == 0) {
            jsonReader.d();
            arrayList = new ArrayList();
        } else if (iOrdinal != 2) {
            arrayList = null;
        } else {
            jsonReader.h();
            arrayList = new LinkedTreeMap(true);
        }
        if (arrayList == null) {
            return e(jsonReader, jsonTokenJ0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.t()) {
                String strS = arrayList instanceof Map ? jsonReader.S() : null;
                JsonToken jsonTokenJ1 = jsonReader.j0();
                int iOrdinal2 = jsonTokenJ1.ordinal();
                if (iOrdinal2 == 0) {
                    jsonReader.d();
                    arrayList2 = new ArrayList();
                } else if (iOrdinal2 != 2) {
                    arrayList2 = null;
                } else {
                    jsonReader.h();
                    arrayList2 = new LinkedTreeMap(true);
                }
                boolean z2 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = e(jsonReader, jsonTokenJ1);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strS, arrayList2);
                }
                if (z2) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    jsonReader.m();
                } else {
                    jsonReader.p();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.s();
            return;
        }
        Class<?> cls = obj.getClass();
        Gson gson = this.f21264a;
        gson.getClass();
        TypeAdapter typeAdapterD = gson.d(TypeToken.get((Class) cls));
        if (!(typeAdapterD instanceof ObjectTypeAdapter)) {
            typeAdapterD.c(jsonWriter, obj);
        } else {
            jsonWriter.k();
            jsonWriter.p();
        }
    }

    public final Serializable e(JsonReader jsonReader, JsonToken jsonToken) {
        int iOrdinal = jsonToken.ordinal();
        if (iOrdinal == 5) {
            return jsonReader.c0();
        }
        if (iOrdinal == 6) {
            return this.f21265b.a(jsonReader);
        }
        if (iOrdinal == 7) {
            return Boolean.valueOf(jsonReader.I());
        }
        if (iOrdinal == 8) {
            jsonReader.U();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }
}
