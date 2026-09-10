package com.google.gson;

import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes4.dex */
public abstract class JsonElement {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.f0 = true;
            TypeAdapters.f21300z.c(jsonWriter, this);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
