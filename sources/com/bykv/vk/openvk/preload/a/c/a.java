package com.bykv.vk.openvk.preload.a.c;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class<? super T> f288a;
    private Type b;
    private int c;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        Type typeA = com.bykv.vk.openvk.preload.a.b.a.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.b = typeA;
        this.f288a = (Class<? super T>) com.bykv.vk.openvk.preload.a.b.a.b(typeA);
        this.c = this.b.hashCode();
    }

    public final Class<? super T> a() {
        return this.f288a;
    }

    public final Type b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && com.bykv.vk.openvk.preload.a.b.a.a(this.b, ((a) obj).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return com.bykv.vk.openvk.preload.a.b.a.c(this.b);
    }

    public static a<?> a(Type type) {
        return new a<>(type);
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    private a(Type type) {
        Type typeA = com.bykv.vk.openvk.preload.a.b.a.a((Type) com.bykv.vk.openvk.preload.falconx.a.a.a(type));
        this.b = typeA;
        this.f288a = (Class<? super T>) com.bykv.vk.openvk.preload.a.b.a.b(typeA);
        this.c = this.b.hashCode();
    }
}
