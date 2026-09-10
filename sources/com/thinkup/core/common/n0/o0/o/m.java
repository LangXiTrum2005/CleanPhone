package com.thinkup.core.common.n0.o0.o;

import com.thinkup.core.common.n0.o0.o0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class m extends n {
    private static final String m = "m";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f41968n = 2;

    @Override // com.thinkup.core.common.n0.o0.o.n
    public final synchronized void o(o0 o0Var, o0.o oVar) {
        InputStream inputStream = this.o.getInputStream();
        if (o(inputStream) != 2) {
            if (oVar != null) {
                oVar.o((Object) null);
            }
            return;
        }
        inputStream.read(new byte[1], 0, 1);
        byte[] bArr = new byte[4];
        inputStream.read(bArr, 0, 4);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        if (i2 <= 0) {
            if (oVar != null) {
                oVar.o((Object) null);
            }
            return;
        }
        byte[] bArr2 = new byte[i2];
        inputStream.read(bArr2, 0, i2);
        String str = new String(bArr2);
        if (oVar != null) {
            oVar.o(str);
        }
    }
}
