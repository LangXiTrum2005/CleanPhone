package com.google.common.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public class AtomicDouble extends Number implements Serializable {
    private static final long serialVersionUID = 0;
    public transient AtomicLong X;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.X = new AtomicLong();
        this.X.set(Double.doubleToRawLongBits(objectInputStream.readDouble()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(d());
    }

    public final double d() {
        return Double.longBitsToDouble(this.X.get());
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return d();
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return (float) d();
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) d();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return (long) d();
    }

    public final String toString() {
        return Double.toString(d());
    }
}
