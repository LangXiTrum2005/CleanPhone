package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonSerializer f21280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonDeserializer f21281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Gson f21282c;
    public final TypeToken d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21283e;
    public volatile TypeAdapter f;

    public final class GsonContextImpl implements JsonSerializationContext, JsonDeserializationContext {
    }

    public static final class SingleTypeFactory implements TypeAdapterFactory {
        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter b(Gson gson, TypeToken typeToken) {
            typeToken.getRawType();
            throw null;
        }
    }

    public TreeTypeAdapter(JsonSerializer jsonSerializer, JsonDeserializer jsonDeserializer, Gson gson, TypeToken typeToken, boolean z2) {
        this.f21280a = jsonSerializer;
        this.f21281b = jsonDeserializer;
        this.f21282c = gson;
        this.d = typeToken;
        this.f21283e = z2;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) {
        boolean z2;
        Object obj;
        JsonDeserializer jsonDeserializer = this.f21281b;
        if (jsonDeserializer == null) {
            TypeAdapter typeAdapterE = this.f;
            if (typeAdapterE == null) {
                typeAdapterE = this.f21282c.e(null, this.d);
                this.f = typeAdapterE;
            }
            return typeAdapterE.b(jsonReader);
        }
        try {
            try {
                jsonReader.j0();
                z2 = false;
                try {
                    obj = (JsonElement) TypeAdapters.f21300z.b(jsonReader);
                } catch (EOFException e2) {
                    e = e2;
                    if (!z2) {
                        throw new JsonSyntaxException(e);
                    }
                    obj = JsonNull.X;
                }
            } catch (MalformedJsonException e3) {
                throw new JsonSyntaxException(e3);
            } catch (IOException e4) {
                throw new JsonIOException(e4);
            } catch (NumberFormatException e5) {
                throw new JsonSyntaxException(e5);
            }
        } catch (EOFException e6) {
            e = e6;
            z2 = true;
        }
        if (this.f21283e) {
            obj.getClass();
            if (obj instanceof JsonNull) {
                return null;
            }
        }
        this.d.getType();
        return jsonDeserializer.a();
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        JsonSerializer jsonSerializer = this.f21280a;
        if (jsonSerializer == null) {
            TypeAdapter typeAdapterE = this.f;
            if (typeAdapterE == null) {
                typeAdapterE = this.f21282c.e(null, this.d);
                this.f = typeAdapterE;
            }
            typeAdapterE.c(jsonWriter, obj);
            return;
        }
        if (this.f21283e && obj == null) {
            jsonWriter.s();
            return;
        }
        this.d.getType();
        TypeAdapters.f21300z.c(jsonWriter, jsonSerializer.serialize());
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public final TypeAdapter d() {
        if (this.f21280a != null) {
            return this;
        }
        TypeAdapter typeAdapter = this.f;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter typeAdapterE = this.f21282c.e(null, this.d);
        this.f = typeAdapterE;
        return typeAdapterE;
    }
}
