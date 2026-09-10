package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class zzasz extends zziin {
    public zzasz(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zziin
    public final void zze(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }
}
