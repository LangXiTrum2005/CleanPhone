package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) throws com.pgl.ssdk.a {
        return h.b(byteBuffer);
    }

    public static byte[] b(ByteBuffer byteBuffer) throws com.pgl.ssdk.a {
        return h.c(byteBuffer);
    }

    public static i a(q qVar, c.a aVar, int i2) throws IOException, a {
        try {
            return h.a(qVar, aVar, i2);
        } catch (j e2) {
            throw new a(e2.getMessage());
        }
    }
}
