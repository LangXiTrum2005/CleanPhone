package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TypeAdapterFactory f21245c = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter b(Gson gson, TypeToken typeToken) {
            Type type = typeToken.getType();
            boolean z2 = type instanceof GenericArrayType;
            if (!z2 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z2 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new ArrayTypeAdapter(gson, gson.d(TypeToken.get(genericComponentType)), C$Gson$Types.g(genericComponentType));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f21246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAdapter f21247b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter typeAdapter, Class cls) {
        this.f21247b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f21246a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        if (jsonReader.j0() == JsonToken.j0) {
            jsonReader.U();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.d();
        while (jsonReader.t()) {
            arrayList.add(((TypeAdapterRuntimeTypeWrapper) this.f21247b).f21285b.b(jsonReader));
        }
        jsonReader.m();
        int size = arrayList.size();
        Class cls = this.f21246a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(objNewInstance, i2, arrayList.get(i2));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.s();
            return;
        }
        jsonWriter.h();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.f21247b.c(jsonWriter, Array.get(obj, i2));
        }
        jsonWriter.m();
    }
}
