package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements TypeAdapterFactory {
    public final ConstructorConstructor X;

    public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.X = constructorConstructor;
    }

    public static TypeAdapter a(ConstructorConstructor constructorConstructor, Gson gson, TypeToken typeToken, JsonAdapter jsonAdapter) {
        TypeAdapter typeAdapterB;
        Object objConstruct = constructorConstructor.b(TypeToken.get(jsonAdapter.value())).construct();
        boolean zNullSafe = jsonAdapter.nullSafe();
        if (objConstruct instanceof TypeAdapter) {
            typeAdapterB = (TypeAdapter) objConstruct;
        } else if (objConstruct instanceof TypeAdapterFactory) {
            typeAdapterB = ((TypeAdapterFactory) objConstruct).b(gson, typeToken);
        } else {
            boolean z2 = objConstruct instanceof JsonSerializer;
            if (!z2 && !(objConstruct instanceof JsonDeserializer)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objConstruct.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(z2 ? (JsonSerializer) objConstruct : null, objConstruct instanceof JsonDeserializer ? (JsonDeserializer) objConstruct : null, gson, typeToken, zNullSafe);
            zNullSafe = false;
            typeAdapterB = treeTypeAdapter;
        }
        return (typeAdapterB == null || !zNullSafe) ? typeAdapterB : typeAdapterB.a();
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter b(Gson gson, TypeToken typeToken) {
        JsonAdapter jsonAdapter = (JsonAdapter) typeToken.getRawType().getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return a(this.X, gson, typeToken, jsonAdapter);
    }
}
