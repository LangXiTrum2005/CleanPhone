package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonArray extends JsonElement implements Iterable<JsonElement> {
    public final ArrayList X = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JsonArray) && ((JsonArray) obj).X.equals(this.X);
        }
        return true;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<JsonElement> iterator() {
        return this.X.iterator();
    }
}
