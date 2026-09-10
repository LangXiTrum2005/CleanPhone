package org.jacoco.core.internal;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public class ContentTypeDetector {
    private static final int BUFFER_SIZE = 8;
    public static final int CLASSFILE = -889275714;
    public static final int GZFILE = 529203200;
    public static final int PACK200FILE = -889270259;
    public static final int UNKNOWN = -1;
    public static final int ZIPFILE = 1347093252;
    private final InputStream in;
    private final int type;

    public ContentTypeDetector(InputStream inputStream) throws IOException {
        if (inputStream.markSupported()) {
            this.in = inputStream;
        } else {
            this.in = new BufferedInputStream(inputStream, 8);
        }
        this.in.mark(8);
        this.type = determineType(this.in);
        this.in.reset();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        if (r0 != 1347093252) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int determineType(java.io.InputStream r3) throws java.io.IOException {
        /*
            int r0 = readInt(r3)
            r1 = -889275714(0xffffffffcafebabe, float:-8346975.0)
            if (r0 == r1) goto L15
            r3 = -889270259(0xffffffffcafed00d, float:-8349702.5)
            if (r0 == r3) goto L14
            r3 = 1347093252(0x504b0304, float:1.362389E10)
            if (r0 == r3) goto L14
            goto L22
        L14:
            return r3
        L15:
            int r3 = readInt(r3)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            r2 = 45
            if (r3 < r2) goto L22
            return r1
        L22:
            r3 = -65536(0xffffffffffff0000, float:NaN)
            r3 = r3 & r0
            r0 = 529203200(0x1f8b0000, float:5.886879E-20)
            if (r3 != r0) goto L2a
            return r0
        L2a:
            r3 = -1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jacoco.core.internal.ContentTypeDetector.determineType(java.io.InputStream):int");
    }

    private static int readInt(InputStream inputStream) throws IOException {
        return inputStream.read() | (inputStream.read() << 24) | (inputStream.read() << 16) | (inputStream.read() << 8);
    }

    public InputStream getInputStream() {
        return this.in;
    }

    public int getType() {
        return this.type;
    }
}
