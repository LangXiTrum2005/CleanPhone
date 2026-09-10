package com.google.firebase.components;

import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.thinkup.core.common.n.mo;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class RestrictedComponentContainer implements ComponentContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f20235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f20236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f20237c;
    public final Set d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f20238e;
    public final ComponentContainer f;

    public static class RestrictedPublisher implements Publisher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Publisher f20239a;

        public RestrictedPublisher(Publisher publisher) {
            this.f20239a = publisher;
        }
    }

    public RestrictedComponentContainer(Component component, ComponentContainer componentContainer) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (Dependency dependency : component.f20200c) {
            int i2 = dependency.f20222c;
            boolean z2 = i2 == 0;
            int i3 = dependency.f20221b;
            Qualified qualified = dependency.f20220a;
            if (z2) {
                if (i3 == 2) {
                    hashSet4.add(qualified);
                } else {
                    hashSet.add(qualified);
                }
            } else if (i2 == 2) {
                hashSet3.add(qualified);
            } else if (i3 == 2) {
                hashSet5.add(qualified);
            } else {
                hashSet2.add(qualified);
            }
        }
        if (!component.g.isEmpty()) {
            hashSet.add(Qualified.a(Publisher.class));
        }
        this.f20235a = Collections.unmodifiableSet(hashSet);
        this.f20236b = Collections.unmodifiableSet(hashSet2);
        this.f20237c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.f20238e = Collections.unmodifiableSet(hashSet5);
        this.f = componentContainer;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Object a(Class cls) {
        if (this.f20235a.contains(Qualified.a(cls))) {
            Object objA = this.f.a(cls);
            return !cls.equals(Publisher.class) ? objA : new RestrictedPublisher((Publisher) objA);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + cls + mo.ono);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Provider b(Qualified qualified) {
        if (this.f20236b.contains(qualified)) {
            return this.f.b(qualified);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<" + qualified + ">.");
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Set c(Qualified qualified) {
        if (this.d.contains(qualified)) {
            return this.f.c(qualified);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Set<" + qualified + ">.");
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Provider d(Qualified qualified) {
        if (this.f20238e.contains(qualified)) {
            return this.f.d(qualified);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<Set<" + qualified + ">>.");
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Object e(Qualified qualified) {
        if (this.f20235a.contains(qualified)) {
            return this.f.e(qualified);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + qualified + mo.ono);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Provider g(Class cls) {
        return b(Qualified.a(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Deferred h(Qualified qualified) {
        if (this.f20237c.contains(qualified)) {
            return this.f.h(qualified);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Deferred<" + qualified + ">.");
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Deferred i(Class cls) {
        return h(Qualified.a(cls));
    }
}
