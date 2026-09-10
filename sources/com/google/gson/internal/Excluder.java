package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Excluder implements TypeAdapterFactory, Cloneable {
    public static final Excluder Z = new Excluder();
    public final List X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final List f21226Y;

    public Excluder() {
        List list = Collections.EMPTY_LIST;
        this.X = list;
        this.f21226Y = list;
    }

    public static boolean e(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter b(final Gson gson, final TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        boolean zC = c(rawType);
        final boolean z2 = zC || d(rawType, true);
        final boolean z3 = zC || d(rawType, false);
        if (z2 || z3) {
            return new TypeAdapter<Object>() { // from class: com.google.gson.internal.Excluder.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public TypeAdapter f21227a;

                @Override // com.google.gson.TypeAdapter
                public final Object b(JsonReader jsonReader) throws IOException {
                    if (z3) {
                        jsonReader.z0();
                        return null;
                    }
                    TypeAdapter typeAdapterE = this.f21227a;
                    if (typeAdapterE == null) {
                        typeAdapterE = gson.e(Excluder.this, typeToken);
                        this.f21227a = typeAdapterE;
                    }
                    return typeAdapterE.b(jsonReader);
                }

                @Override // com.google.gson.TypeAdapter
                public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
                    if (z2) {
                        jsonWriter.s();
                        return;
                    }
                    TypeAdapter typeAdapterE = this.f21227a;
                    if (typeAdapterE == null) {
                        typeAdapterE = gson.e(Excluder.this, typeToken);
                        this.f21227a = typeAdapterE;
                    }
                    typeAdapterE.c(jsonWriter, obj);
                }
            };
        }
        return null;
    }

    public final boolean c(Class cls) {
        return e(cls);
    }

    public final Object clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean d(Class cls, boolean z2) {
        Iterator it = (z2 ? this.X : this.f21226Y).iterator();
        while (it.hasNext()) {
            if (((ExclusionStrategy) it.next()).a()) {
                return true;
            }
        }
        return false;
    }
}
