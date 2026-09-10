package com.smartdigimkt.e8;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class b extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f34648i = "b";
    private static final int j = 2;

    @Override // com.smartdigimkt.e8.c
    public synchronized void a(com.smartdigimkt.d8.c cVar, com.smartdigimkt.d8.c.a aVar) throws Exception {
        InputStream inputStream = this.d.getInputStream();
        if (a(inputStream) != 2) {
            if (aVar != null) {
                aVar.a((Object) null);
            }
            return;
        }
        inputStream.read(new byte[1], 0, 1);
        byte[] bArr = new byte[4];
        inputStream.read(bArr, 0, 4);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        if (i2 <= 0) {
            if (aVar != null) {
                aVar.a((Object) null);
            }
            return;
        }
        byte[] bArr2 = new byte[i2];
        inputStream.read(bArr2, 0, i2);
        String str = new String(bArr2);
        if (aVar != null) {
            aVar.a(str);
        }
    }
}
