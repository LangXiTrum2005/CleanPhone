package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: Serialization.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attendance {

    /* JADX INFO: compiled from: Serialization.java */
    public static final class saneness<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Field f21882attabal;

        public void attabal(T t, int i) {
            try {
                this.f21882attabal.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        public void saneness(T t, Object obj) {
            try {
                this.f21882attabal.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        public saneness(Field field) {
            this.f21882attabal = field;
            field.setAccessible(true);
        }
    }

    public static <T> saneness<T> attabal(Class<T> cls, String str) {
        try {
            return new saneness<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public static int dern(ObjectInputStream objectInputStream) throws IOException {
        return objectInputStream.readInt();
    }

    public static <E> void marial(hardpan<E> hardpanVar, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(hardpanVar.entrySet().size());
        for (hardpan.attabal<E> attabalVar : hardpanVar.entrySet()) {
            objectOutputStream.writeObject(attabalVar.getElement());
            objectOutputStream.writeInt(attabalVar.getCount());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> void saneness(hardpan<E> hardpanVar, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            hardpanVar.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    public static <K, V> void wireman(claque<K, V> claqueVar, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(claqueVar.asMap().size());
        for (Map.Entry<K, Collection<V>> entry : claqueVar.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }
}
