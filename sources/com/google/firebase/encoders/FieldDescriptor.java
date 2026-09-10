package com.google.firebase.encoders;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class FieldDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f20783b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HashMap f20785b = null;

        public Builder(String str) {
            this.f20784a = str;
        }

        public final FieldDescriptor a() {
            return new FieldDescriptor(this.f20784a, this.f20785b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f20785b)));
        }

        public final void b(Annotation annotation) {
            if (this.f20785b == null) {
                this.f20785b = new HashMap();
            }
            this.f20785b.put(annotation.annotationType(), annotation);
        }
    }

    public FieldDescriptor(String str, Map map) {
        this.f20782a = str;
        this.f20783b = map;
    }

    public static FieldDescriptor a(String str) {
        return new FieldDescriptor(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldDescriptor)) {
            return false;
        }
        FieldDescriptor fieldDescriptor = (FieldDescriptor) obj;
        return this.f20782a.equals(fieldDescriptor.f20782a) && this.f20783b.equals(fieldDescriptor.f20783b);
    }

    public final int hashCode() {
        return this.f20783b.hashCode() + (this.f20782a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f20782a + ", properties=" + this.f20783b.values() + "}";
    }
}
