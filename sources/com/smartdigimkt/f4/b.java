package com.smartdigimkt.f4;

import com.smartdigimkt.e4.e;
import com.smartdigimkt.p4.f0;
import com.smartdigimkt.p4.s;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements com.smartdigimkt.e4.b {
    @Override // com.smartdigimkt.e4.b
    public com.smartdigimkt.e4.a a(e eVar) {
        ByteBuffer byteBuffer = eVar.f40353c;
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        s sVar = new s(bArrArray, iLimit);
        String strU = sVar.u();
        String strU2 = sVar.u();
        long jZ = sVar.z();
        return new com.smartdigimkt.e4.a(new a(strU, strU2, f0.c(sVar.z(), 1000L, jZ), sVar.z(), Arrays.copyOfRange(bArrArray, sVar.c(), iLimit), f0.c(sVar.z(), 1000000L, jZ)));
    }
}
