package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.o;
import com.bykv.vk.openvk.preload.a.q;
import com.bykv.vk.openvk.preload.a.r;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.b f238a;
    private final com.bykv.vk.openvk.preload.a.c b;
    private final com.bykv.vk.openvk.preload.a.b.c c;
    private final d d;
    private final com.bykv.vk.openvk.preload.a.b.b.b e = com.bykv.vk.openvk.preload.a.b.b.b.a();

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f240a;
        final boolean b;
        final boolean c;

        public b(String str, boolean z, boolean z2) {
            this.f240a = str;
            this.b = z;
            this.c = z2;
        }

        public abstract void a(com.bykv.vk.openvk.preload.a.d.a aVar, Object obj) throws IllegalAccessException, IOException;

        public abstract void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) throws IllegalAccessException, IOException;

        public abstract boolean a(Object obj) throws IllegalAccessException, IOException;
    }

    public h(com.bykv.vk.openvk.preload.a.b.b bVar, com.bykv.vk.openvk.preload.a.c cVar, com.bykv.vk.openvk.preload.a.b.c cVar2, d dVar) {
        this.f238a = bVar;
        this.b = cVar;
        this.c = cVar2;
        this.d = dVar;
    }

    private boolean a(Field field, boolean z) {
        com.bykv.vk.openvk.preload.a.b.c cVar = this.c;
        return (cVar.a(field.getType(), z) || cVar.a(field, z)) ? false : true;
    }

    private List<String> a(Field field) {
        com.bykv.vk.openvk.preload.a.a.b bVar = (com.bykv.vk.openvk.preload.a.a.b) field.getAnnotation(com.bykv.vk.openvk.preload.a.a.b.class);
        if (bVar == null) {
            return Collections.singletonList(this.b.a(field));
        }
        String strA = bVar.a();
        String[] strArrB = bVar.b();
        if (strArrB.length == 0) {
            return Collections.singletonList(strA);
        }
        ArrayList arrayList = new ArrayList(strArrB.length + 1);
        arrayList.add(strA);
        for (String str : strArrB) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public static final class a<T> extends q<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bykv.vk.openvk.preload.a.b.h<T> f239a;
        private final Map<String, b> b;

        public a(com.bykv.vk.openvk.preload.a.b.h<T> hVar, Map<String, b> map) {
            this.f239a = hVar;
            this.b = map;
        }

        @Override // com.bykv.vk.openvk.preload.a.q
        public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
            if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                aVar.j();
                return null;
            }
            T tA = this.f239a.a();
            try {
                aVar.c();
                while (aVar.e()) {
                    b bVar = this.b.get(aVar.g());
                    if (bVar == null || !bVar.c) {
                        aVar.n();
                    } else {
                        bVar.a(aVar, tA);
                    }
                }
                aVar.d();
                return tA;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new o(e2);
            }
        }

        @Override // com.bykv.vk.openvk.preload.a.q
        public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t) throws IOException {
            if (t == null) {
                cVar.h();
                return;
            }
            cVar.f();
            try {
                for (b bVar : this.b.values()) {
                    if (bVar.a(t)) {
                        cVar.a(bVar.f240a);
                        bVar.a(cVar, t);
                    }
                }
                cVar.g();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.r
    public final <T> q<T> a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        Class<? super T> clsA = aVar.a();
        if (Object.class.isAssignableFrom(clsA)) {
            return new a(this.f238a.a(aVar), a(dVar, aVar, clsA));
        }
        return null;
    }

    private Map<String, b> a(final com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<?> aVar, Class<?> cls) {
        int i;
        int i2;
        Field[] fieldArr;
        Class<?> cls2;
        Type type;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type typeB = aVar.b();
        com.bykv.vk.openvk.preload.a.c.a<?> aVarA = aVar;
        Class<?> clsA = cls;
        while (clsA != Object.class) {
            Field[] declaredFields = clsA.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i3 = 0;
            while (i3 < length) {
                final Field field = declaredFields[i3];
                boolean zA = this.a(field, true);
                boolean zA2 = this.a(field, z);
                if (zA || zA2) {
                    this.e.a(field);
                    Type typeA = com.bykv.vk.openvk.preload.a.b.a.a(aVarA.b(), clsA, field.getGenericType());
                    List<String> listA = this.a(field);
                    int size = listA.size();
                    b bVar = null;
                    int i4 = 0;
                    while (i4 < size) {
                        Type type2 = typeB;
                        String str = listA.get(i4);
                        boolean z2 = i4 != 0 ? false : zA;
                        final com.bykv.vk.openvk.preload.a.c.a<?> aVarA2 = com.bykv.vk.openvk.preload.a.c.a.a(typeA);
                        Class<? super Object> clsA2 = aVarA2.a();
                        boolean z3 = (clsA2 instanceof Class) && clsA2.isPrimitive();
                        com.bykv.vk.openvk.preload.a.a.a aVar2 = (com.bykv.vk.openvk.preload.a.a.a) field.getAnnotation(com.bykv.vk.openvk.preload.a.a.a.class);
                        q<?> qVarA = aVar2 != null ? d.a(this.f238a, dVar, aVarA2, aVar2) : null;
                        boolean z4 = qVarA != null;
                        if (qVarA == null) {
                            qVarA = dVar.a((com.bykv.vk.openvk.preload.a.c.a) aVarA2);
                        }
                        final q<?> qVar = qVarA;
                        int i5 = i4;
                        int i6 = size;
                        List<String> list = listA;
                        Field field2 = field;
                        int i7 = i3;
                        final boolean z5 = z4;
                        int i8 = length;
                        Field[] fieldArr2 = declaredFields;
                        Class<?> cls3 = clsA;
                        final boolean z6 = z3;
                        b bVar2 = (b) linkedHashMap.put(str, new b(str, z2, zA2) { // from class: com.bykv.vk.openvk.preload.a.b.a.h.1
                            @Override // com.bykv.vk.openvk.preload.a.b.a.h.b
                            public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) throws IllegalAccessException, IOException {
                                (z5 ? qVar : new l(dVar, qVar, aVarA2.b())).a(cVar, field.get(obj));
                            }

                            @Override // com.bykv.vk.openvk.preload.a.b.a.h.b
                            public final void a(com.bykv.vk.openvk.preload.a.d.a aVar3, Object obj) throws IllegalAccessException, IOException {
                                Object objA = qVar.a(aVar3);
                                if (objA == null && z6) {
                                    return;
                                }
                                field.set(obj, objA);
                            }

                            @Override // com.bykv.vk.openvk.preload.a.b.a.h.b
                            public final boolean a(Object obj) throws IllegalAccessException, IOException {
                                return this.b && field.get(obj) != obj;
                            }
                        });
                        if (bVar == null) {
                            bVar = bVar2;
                        }
                        i4 = i5 + 1;
                        this = this;
                        clsA = cls3;
                        zA = z2;
                        typeB = type2;
                        length = i8;
                        size = i6;
                        listA = list;
                        field = field2;
                        i3 = i7;
                        declaredFields = fieldArr2;
                    }
                    i = i3;
                    i2 = length;
                    fieldArr = declaredFields;
                    cls2 = clsA;
                    type = typeB;
                    if (bVar != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + bVar.f240a);
                    }
                } else {
                    i = i3;
                    i2 = length;
                    fieldArr = declaredFields;
                    cls2 = clsA;
                    type = typeB;
                }
                i3 = i + 1;
                this = this;
                aVarA = aVarA;
                clsA = cls2;
                typeB = type;
                length = i2;
                declaredFields = fieldArr;
                z = false;
            }
            Class<?> cls4 = clsA;
            aVarA = com.bykv.vk.openvk.preload.a.c.a.a(com.bykv.vk.openvk.preload.a.b.a.a(aVarA.b(), cls4, cls4.getGenericSuperclass()));
            clsA = aVarA.a();
        }
        return linkedHashMap;
    }
}
