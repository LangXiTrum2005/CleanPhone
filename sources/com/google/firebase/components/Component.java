package com.google.firebase.components;

import A.C0880a0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class Component<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f20199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f20200c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20201e;
    public final ComponentFactory f;
    public final Set g;

    public Component(String str, Set set, Set set2, int i2, int i3, ComponentFactory componentFactory, Set set3) {
        this.f20198a = str;
        this.f20199b = Collections.unmodifiableSet(set);
        this.f20200c = Collections.unmodifiableSet(set2);
        this.d = i2;
        this.f20201e = i3;
        this.f = componentFactory;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static Builder a(Qualified qualified) {
        return new Builder(qualified, new Qualified[0]);
    }

    public static Builder b(Class cls) {
        return new Builder(cls, new Class[0]);
    }

    public static Component c(Object obj, Class cls, Class... clsArr) {
        Builder builder = new Builder(cls, clsArr);
        builder.f = new C0880a0(obj, 17);
        return builder.b();
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f20199b.toArray()) + ">{" + this.d + ", type=" + this.f20201e + ", deps=" + Arrays.toString(this.f20200c.toArray()) + "}";
    }

    public static class Builder<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20202a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashSet f20203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashSet f20204c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f20205e;
        public ComponentFactory f;
        public final HashSet g;

        public Builder(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.f20203b = hashSet;
            this.f20204c = new HashSet();
            this.d = 0;
            this.f20205e = 0;
            this.g = new HashSet();
            hashSet.add(Qualified.a(cls));
            for (Class cls2 : clsArr) {
                Preconditions.a(cls2, "Null interface");
                this.f20203b.add(Qualified.a(cls2));
            }
        }

        public final void a(Dependency dependency) {
            if (this.f20203b.contains(dependency.f20220a)) {
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            this.f20204c.add(dependency);
        }

        public final Component b() {
            if (this.f != null) {
                return new Component(this.f20202a, new HashSet(this.f20203b), new HashSet(this.f20204c), this.d, this.f20205e, this.f, this.g);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public final void c() {
            if (!(this.d == 0)) {
                throw new IllegalStateException("Instantiation type has already been set.");
            }
            this.d = 2;
        }

        public Builder(Qualified qualified, Qualified[] qualifiedArr) {
            HashSet hashSet = new HashSet();
            this.f20203b = hashSet;
            this.f20204c = new HashSet();
            this.d = 0;
            this.f20205e = 0;
            this.g = new HashSet();
            hashSet.add(qualified);
            for (Qualified qualified2 : qualifiedArr) {
                Preconditions.a(qualified2, "Null interface");
            }
            Collections.addAll(this.f20203b, qualifiedArr);
        }
    }
}
