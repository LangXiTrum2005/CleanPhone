package com.tiktok.appevents;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* JADX INFO: loaded from: classes6.dex */
public class TTSafeReadObjectUtil {

    /* JADX INFO: renamed from: com.tiktok.appevents.TTSafeReadObjectUtil$2, reason: invalid class name */
    final class AnonymousClass2 extends ObjectInputStream {
        public int X;

        @Override // java.io.ObjectInputStream
        public final Class resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
            Class<?> clsResolveClass = super.resolveClass(objectStreamClass);
            if (clsResolveClass.isArray() || clsResolveClass.equals(String.class) || Number.class.isAssignableFrom(clsResolveClass)) {
                return clsResolveClass;
            }
            throw null;
        }

        @Override // java.io.ObjectInputStream
        public final Object resolveObject(Object obj) {
            int i2 = this.X;
            this.X = i2 + 1;
            if (i2 <= Long.MAX_VALUE) {
                return super.resolveObject(obj);
            }
            throw new SecurityException("too many objects from stream. Limit is 9223372036854775807");
        }
    }

    /* JADX INFO: renamed from: com.tiktok.appevents.TTSafeReadObjectUtil$1, reason: invalid class name */
    final class AnonymousClass1 extends FilterInputStream {
        public long X;

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            int i2 = super.read();
            if (i2 != -1) {
                long j = this.X + 1;
                this.X = j;
                if (j > 0) {
                    throw new SecurityException("too many bytes from stream. Limit is 0");
                }
            }
            return i2;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i2, int i3) throws IOException {
            int i4 = super.read(bArr, i2, i3);
            if (i4 > 0) {
                long j = this.X + ((long) i4);
                this.X = j;
                if (j > 0) {
                    throw new SecurityException("too many bytes from stream. Limit is 0");
                }
            }
            return i4;
        }
    }
}
