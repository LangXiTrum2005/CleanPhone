package com.bykv.vk.openvk.preload.a.b;

import com.bykv.vk.openvk.preload.a.q;
import com.bykv.vk.openvk.preload.a.r;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements r, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f273a = new c();
    private double b = -1.0d;
    private int c = 136;
    private boolean d = true;
    private List<com.bykv.vk.openvk.preload.geckox.a.a.c> e = Collections.emptyList();
    private List<com.bykv.vk.openvk.preload.geckox.a.a.c> f = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c clone() {
        try {
            return (c) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    private static boolean b(Class<?> cls) {
        if (Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    private static boolean c(Class<?> cls) {
        return cls.isMemberClass() && !d(cls);
    }

    private static boolean d(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    @Override // com.bykv.vk.openvk.preload.a.r
    public final <T> q<T> a(final com.bykv.vk.openvk.preload.a.d dVar, final com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        boolean zA = a(aVar.a());
        final boolean z = zA || a(true);
        final boolean z2 = zA || a(false);
        if (z || z2) {
            return new q<T>() { // from class: com.bykv.vk.openvk.preload.a.b.c.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private q<T> f274a;

                private q<T> b() {
                    q<T> qVar = this.f274a;
                    if (qVar != null) {
                        return qVar;
                    }
                    q<T> qVarA = dVar.a(c.this, aVar);
                    this.f274a = qVarA;
                    return qVarA;
                }

                @Override // com.bykv.vk.openvk.preload.a.q
                public final T a(com.bykv.vk.openvk.preload.a.d.a aVar2) throws IOException {
                    if (!z2) {
                        return b().a(aVar2);
                    }
                    aVar2.n();
                    return null;
                }

                @Override // com.bykv.vk.openvk.preload.a.q
                public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t) throws IOException {
                    if (z) {
                        cVar.h();
                    } else {
                        b().a(cVar, t);
                    }
                }
            };
        }
        return null;
    }

    public final boolean a(Field field, boolean z) {
        if ((this.c & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.b != -1.0d && !a((com.bykv.vk.openvk.preload.a.a.c) field.getAnnotation(com.bykv.vk.openvk.preload.a.a.c.class), (com.bykv.vk.openvk.preload.a.a.d) field.getAnnotation(com.bykv.vk.openvk.preload.a.a.d.class))) || field.isSynthetic()) {
            return true;
        }
        if ((!this.d && c(field.getType())) || b(field.getType())) {
            return true;
        }
        List<com.bykv.vk.openvk.preload.geckox.a.a.c> list = z ? this.e : this.f;
        if (list.isEmpty()) {
            return false;
        }
        new com.bykv.vk.openvk.preload.geckox.g.a(field);
        Iterator<com.bykv.vk.openvk.preload.geckox.a.a.c> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().a()) {
                return true;
            }
        }
        return false;
    }

    private boolean a(Class<?> cls) {
        if (this.b == -1.0d || a((com.bykv.vk.openvk.preload.a.a.c) cls.getAnnotation(com.bykv.vk.openvk.preload.a.a.c.class), (com.bykv.vk.openvk.preload.a.a.d) cls.getAnnotation(com.bykv.vk.openvk.preload.a.a.d.class))) {
            return (!this.d && c(cls)) || b(cls);
        }
        return true;
    }

    public final boolean a(Class<?> cls, boolean z) {
        return a(cls) || a(z);
    }

    private boolean a(boolean z) {
        Iterator<com.bykv.vk.openvk.preload.geckox.a.a.c> it = (z ? this.e : this.f).iterator();
        while (it.hasNext()) {
            if (it.next().b()) {
                return true;
            }
        }
        return false;
    }

    private boolean a(com.bykv.vk.openvk.preload.a.a.c cVar, com.bykv.vk.openvk.preload.a.a.d dVar) {
        return a(cVar) && a(dVar);
    }

    private boolean a(com.bykv.vk.openvk.preload.a.a.c cVar) {
        return cVar == null || cVar.a() <= this.b;
    }

    private boolean a(com.bykv.vk.openvk.preload.a.a.d dVar) {
        return dVar == null || dVar.a() > this.b;
    }
}
