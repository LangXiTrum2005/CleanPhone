package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class NumberTypeAdapter extends TypeAdapter<Number> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TypeAdapterFactory f21260b = d(ToNumberPolicy.f21205Y);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToNumberPolicy f21261a;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.NumberTypeAdapter$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21262a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f21262a = iArr;
            try {
                iArr[8] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21262a[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21262a[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public NumberTypeAdapter(ToNumberPolicy toNumberPolicy) {
        this.f21261a = toNumberPolicy;
    }

    public static TypeAdapterFactory d(ToNumberPolicy toNumberPolicy) {
        return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.TypeAdapterFactory
            public final TypeAdapter b(Gson gson, TypeToken typeToken) {
                if (typeToken.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenJ0 = jsonReader.j0();
        int iOrdinal = jsonTokenJ0.ordinal();
        if (iOrdinal == 5 || iOrdinal == 6) {
            return this.f21261a.a(jsonReader);
        }
        if (iOrdinal == 8) {
            jsonReader.U();
            return null;
        }
        throw new JsonSyntaxException("Expecting number, got: " + jsonTokenJ0 + "; at path " + jsonReader.u());
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        jsonWriter.K((Number) obj);
    }
}
