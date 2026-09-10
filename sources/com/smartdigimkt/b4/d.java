package com.smartdigimkt.b4;

import com.smartdigimkt.p4.s;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements m {
    @Override // com.smartdigimkt.b4.m
    public void a(long j, int i2, int i3, int i4, m.a aVar) {
    }

    @Override // com.smartdigimkt.b4.m
    public void a(com.smartdigimkt.w3.m mVar) {
    }

    @Override // com.smartdigimkt.b4.m
    public int a(f fVar, int i2, boolean z2) throws InterruptedException, IOException {
        int iA = fVar.a(i2);
        if (iA != -1) {
            return iA;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.smartdigimkt.b4.m
    public void a(s sVar, int i2) {
        sVar.f(i2);
    }
}
