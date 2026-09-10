package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes4.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f21284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAdapter f21285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f21286c;

    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter typeAdapter, Type type) {
        this.f21284a = gson;
        this.f21285b = typeAdapter;
        this.f21286c = type;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) {
        return this.f21285b.b(jsonReader);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003b  */
    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) {
        TypeAdapter typeAdapterD;
        Type type = this.f21286c;
        Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
        TypeAdapter typeAdapter = this.f21285b;
        if (type2 != type) {
            TypeAdapter typeAdapterD2 = this.f21284a.d(TypeToken.get(type2));
            if (typeAdapterD2 instanceof ReflectiveTypeAdapterFactory.Adapter) {
                TypeAdapter typeAdapter2 = typeAdapter;
                while ((typeAdapter2 instanceof SerializationDelegatingTypeAdapter) && (typeAdapterD = ((SerializationDelegatingTypeAdapter) typeAdapter2).d()) != typeAdapter2) {
                    typeAdapter2 = typeAdapterD;
                }
                if (typeAdapter2 instanceof ReflectiveTypeAdapterFactory.Adapter) {
                    typeAdapter = typeAdapterD2;
                }
            } else {
                typeAdapter = typeAdapterD2;
            }
        }
        typeAdapter.c(jsonWriter, obj);
    }
}
