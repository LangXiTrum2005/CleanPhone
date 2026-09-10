package com.google.firebase.components;

/* JADX INFO: loaded from: classes4.dex */
public final class Qualified<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f20233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f20234b;

    public @interface Unqualified {
    }

    public Qualified(Class cls, Class cls2) {
        this.f20233a = cls;
        this.f20234b = cls2;
    }

    public static Qualified a(Class cls) {
        return new Qualified(Unqualified.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Qualified.class != obj.getClass()) {
            return false;
        }
        Qualified qualified = (Qualified) obj;
        if (this.f20234b.equals(qualified.f20234b)) {
            return this.f20233a.equals(qualified.f20233a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20233a.hashCode() + (this.f20234b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f20234b;
        Class cls2 = this.f20233a;
        if (cls2 == Unqualified.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
