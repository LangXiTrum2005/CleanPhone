package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzast extends zziir implements Closeable {
    static {
        zziiy.zzb(zzast.class);
    }

    public zzast(zziis zziisVar, zzass zzassVar) throws IOException {
        zzd(zziisVar, zziisVar.zzb(), zzassVar);
    }

    @Override // com.google.android.gms.internal.ads.zziir, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zziir
    public final String toString() {
        String string = this.zzc.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
