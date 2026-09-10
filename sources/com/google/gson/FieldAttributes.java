package com.google.gson;

import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class FieldAttributes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f21185a;

    public FieldAttributes(Field field) {
        Objects.requireNonNull(field);
        this.f21185a = field;
    }

    public final String toString() {
        return this.f21185a.toString();
    }
}
