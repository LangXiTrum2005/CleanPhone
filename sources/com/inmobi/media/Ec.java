package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f22802b;

    public Ec(String fieldName, Class<?> originClass) {
        Intrinsics.f(fieldName, "fieldName");
        Intrinsics.f(originClass, "originClass");
        this.f22801a = fieldName;
        this.f22802b = originClass;
    }

    public final Ec a(String fieldName, Class<?> originClass) {
        Intrinsics.f(fieldName, "fieldName");
        Intrinsics.f(originClass, "originClass");
        return new Ec(fieldName, originClass);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ec)) {
            return false;
        }
        Ec ec = (Ec) obj;
        return Intrinsics.a(this.f22801a, ec.f22801a) && Intrinsics.a(this.f22802b, ec.f22802b);
    }

    public int hashCode() {
        return this.f22802b.hashCode() + (this.f22801a.hashCode() * 31);
    }

    public String toString() {
        return "RuleKey(fieldName=" + this.f22801a + ", originClass=" + this.f22802b + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Ec a(Ec ec, String str, Class cls, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ec.f22801a;
        }
        if ((i2 & 2) != 0) {
            cls = ec.f22802b;
        }
        return ec.a(str, cls);
    }
}
