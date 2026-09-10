package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c {

    public static class a extends t {
        public a(long j, long j2, int i2, long j3, ByteBuffer byteBuffer) {
            super(j, j2, i2, j3, byteBuffer);
        }
    }

    public static a a(q qVar) throws IOException, s {
        t tVarA = d.a(qVar);
        return new a(tVarA.a(), tVarA.c(), tVarA.b(), tVarA.e(), tVarA.d());
    }
}
