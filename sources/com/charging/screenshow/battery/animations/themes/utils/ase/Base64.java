package com.charging.screenshow.battery.animations.themes.utils.ase;

import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* JADX INFO: loaded from: classes3.dex */
public class Base64 {

    /* JADX INFO: renamed from: com.charging.screenshow.battery.animations.themes.utils.ase.Base64$1, reason: invalid class name */
    class AnonymousClass1 extends ObjectInputStream {
        @Override // java.io.ObjectInputStream
        public final Class resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, null);
            return cls == null ? super.resolveClass(objectStreamClass) : cls;
        }
    }

    public static class InputStream extends FilterInputStream {
        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() {
            throw null;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i2, int i3) {
            if (i3 <= 0) {
                return 0;
            }
            throw null;
        }
    }

    public static class OutputStream extends FilterOutputStream {
        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(int i2) {
            throw null;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i2, int i3) {
            if (i3 <= 0) {
                return;
            }
            byte b2 = bArr[i2];
            throw null;
        }
    }
}
