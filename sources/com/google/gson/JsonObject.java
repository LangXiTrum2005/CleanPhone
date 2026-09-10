package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonObject extends JsonElement {
    public final LinkedTreeMap X = new LinkedTreeMap(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JsonObject) && ((JsonObject) obj).X.equals(this.X);
        }
        return true;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }
}
