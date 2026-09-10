package com.google.android.gms.internal.ads;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o20 implements jk1, y21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f18091a;

    @Override // com.google.android.gms.internal.ads.y21
    public Object c(FileInputStream fileInputStream) {
        try {
            return tb1.a(fileInputStream);
        } catch (IOException e10) {
            throw new x21("Cannot read bytes.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.y21
    public /* synthetic */ void d(Object obj, FileOutputStream fileOutputStream) throws IOException {
        fileOutputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.jk1, com.google.android.gms.internal.ads.hm0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ wk1 mo166zza() {
        AtomicInteger atomicInteger = r20.f19281u;
        return new ci1(this.f18091a);
    }

    @Override // com.google.android.gms.internal.ads.y21
    public /* synthetic */ Object zzc() {
        return this.f18091a;
    }
}
