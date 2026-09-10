package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zziip extends zziin implements zzasv {
    private int zzg;

    public zziip(String str) {
        super("mvhd");
    }

    public final int zzg() {
        if (!this.zzb) {
            zzf();
        }
        return this.zzg;
    }

    public final long zzh(ByteBuffer byteBuffer) {
        this.zzg = zzasu.zzc(byteBuffer.get());
        zzasu.zzb(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
