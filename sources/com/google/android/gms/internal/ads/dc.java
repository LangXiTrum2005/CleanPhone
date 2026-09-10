package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dc extends xw1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13491i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dc(String str, int i10) {
        super(str);
        this.f13491i = i10;
    }

    @Override // com.google.android.gms.internal.ads.xw1
    public final void c(ByteBuffer byteBuffer) {
        switch (this.f13491i) {
            case 0:
                byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
                break;
        }
    }

    private final void e(ByteBuffer byteBuffer) {
    }
}
