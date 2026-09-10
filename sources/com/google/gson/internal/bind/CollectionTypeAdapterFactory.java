package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class CollectionTypeAdapterFactory implements TypeAdapterFactory {
    public final ConstructorConstructor X;

    public static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypeAdapter f21248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ObjectConstructor f21249b;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, ObjectConstructor objectConstructor) {
            this.f21248a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f21249b = objectConstructor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public final Object b(JsonReader jsonReader) throws IOException {
            if (jsonReader.j0() == JsonToken.j0) {
                jsonReader.U();
                return null;
            }
            Collection collection = (Collection) this.f21249b.construct();
            jsonReader.d();
            while (jsonReader.t()) {
                collection.add(((TypeAdapterRuntimeTypeWrapper) this.f21248a).f21285b.b(jsonReader));
            }
            jsonReader.m();
            return collection;
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                jsonWriter.s();
                return;
            }
            jsonWriter.h();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f21248a.c(jsonWriter, it.next());
            }
            jsonWriter.m();
        }
    }

    public CollectionTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.X = constructorConstructor;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter b(Gson gson, TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C$Gson$Preconditions.a(Collection.class.isAssignableFrom(rawType));
        Type typeI = C$Gson$Types.i(type, rawType, C$Gson$Types.f(type, rawType, Collection.class), new HashMap());
        Type type2 = typeI instanceof ParameterizedType ? ((ParameterizedType) typeI).getActualTypeArguments()[0] : Object.class;
        return new Adapter(gson, type2, gson.d(TypeToken.get(type2)), this.X.b(typeToken));
    }
}
