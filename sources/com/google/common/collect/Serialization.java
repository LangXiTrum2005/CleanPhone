package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class Serialization {

    public static final class FieldSetter<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f19951a;

        public FieldSetter(Field field) {
            this.f19951a = field;
            field.setAccessible(true);
        }

        public final void a(Serializable serializable, Object obj) {
            try {
                this.f19951a.set(serializable, obj);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public static FieldSetter a(Class cls, String str) {
        try {
            return new FieldSetter(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e2) {
            throw new AssertionError(e2);
        }
    }

    public static void b(Map map, ObjectInputStream objectInputStream, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public static void c(Multimap multimap, ObjectInputStream objectInputStream, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            Collection collection = multimap.get(objectInputStream.readObject());
            int i4 = objectInputStream.readInt();
            for (int i5 = 0; i5 < i4; i5++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    public static void d(Multiset multiset, ObjectInputStream objectInputStream, int i2) throws ClassNotFoundException, IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            multiset.add(objectInputStream.readInt(), objectInputStream.readObject());
        }
    }

    public static void e(Map map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public static void f(Multimap multimap, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(multimap.u().size());
        for (Map.Entry entry : multimap.u().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static void g(Multiset multiset, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(multiset.entrySet().size());
        for (Multiset.Entry entry : multiset.entrySet()) {
            objectOutputStream.writeObject(entry.d());
            objectOutputStream.writeInt(entry.getCount());
        }
    }
}
