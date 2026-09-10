package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
final class zzaxo implements Runnable {
    private zzaxo() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzaxp.zzd = MessageDigest.getInstance("MD5");
            countDownLatch = zzaxp.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzaxp.zzb;
        } catch (Throwable th) {
            zzaxp.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ zzaxo(byte[] bArr) {
    }
}
