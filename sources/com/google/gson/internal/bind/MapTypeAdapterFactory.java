package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes4.dex */
public final class MapTypeAdapterFactory implements TypeAdapterFactory {
    public final ConstructorConstructor X;

    public final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypeAdapter f21257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TypeAdapter f21258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ObjectConstructor f21259c;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, Type type2, TypeAdapter typeAdapter2, ObjectConstructor objectConstructor) {
            this.f21257a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f21258b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f21259c = objectConstructor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public final Object b(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenJ0 = jsonReader.j0();
            if (jsonTokenJ0 == JsonToken.j0) {
                jsonReader.U();
                return null;
            }
            Map map = (Map) this.f21259c.construct();
            JsonToken jsonToken = JsonToken.X;
            TypeAdapter typeAdapter = this.f21258b;
            TypeAdapter typeAdapter2 = this.f21257a;
            if (jsonTokenJ0 != jsonToken) {
                jsonReader.h();
                while (jsonReader.t()) {
                    JsonReaderInternalAccess.f21232a.a(jsonReader);
                    Object objB = ((TypeAdapterRuntimeTypeWrapper) typeAdapter2).f21285b.b(jsonReader);
                    if (map.put(objB, ((TypeAdapterRuntimeTypeWrapper) typeAdapter).f21285b.b(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + objB);
                    }
                }
                jsonReader.p();
                return map;
            }
            jsonReader.d();
            while (jsonReader.t()) {
                jsonReader.d();
                Object objB2 = ((TypeAdapterRuntimeTypeWrapper) typeAdapter2).f21285b.b(jsonReader);
                if (map.put(objB2, ((TypeAdapterRuntimeTypeWrapper) typeAdapter).f21285b.b(jsonReader)) != null) {
                    throw new JsonSyntaxException("duplicate key: " + objB2);
                }
                jsonReader.m();
            }
            jsonReader.m();
            return map;
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                jsonWriter.s();
                return;
            }
            MapTypeAdapterFactory.this.getClass();
            TypeAdapter typeAdapter = this.f21258b;
            jsonWriter.k();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                jsonWriter.q(String.valueOf(entry.getKey()));
                typeAdapter.c(jsonWriter, entry.getValue());
            }
            jsonWriter.p();
        }
    }

    public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.X = constructorConstructor;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter b(Gson gson, TypeToken typeToken) {
        Type[] actualTypeArguments;
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            C$Gson$Preconditions.a(Map.class.isAssignableFrom(rawType));
            Type typeI = C$Gson$Types.i(type, rawType, C$Gson$Types.f(type, rawType, Map.class), new HashMap());
            actualTypeArguments = typeI instanceof ParameterizedType ? ((ParameterizedType) typeI).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new Adapter(gson, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? TypeAdapters.f21291c : gson.d(TypeToken.get(type2)), actualTypeArguments[1], gson.d(TypeToken.get(actualTypeArguments[1])), this.X.b(typeToken));
    }
}
