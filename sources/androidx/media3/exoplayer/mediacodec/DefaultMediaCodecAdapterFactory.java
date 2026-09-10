package androidx.media3.exoplayer.mediacodec;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultMediaCodecAdapterFactory implements MediaCodecAdapter.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6287a;

    public DefaultMediaCodecAdapterFactory(Context context) {
        this.f6287a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r1.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen") != false) goto L11;
     */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.media3.exoplayer.mediacodec.MediaCodecAdapter a(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration r4) {
        /*
            r3 = this;
            int r0 = androidx.media3.common.util.Util.f5683a
            r1 = 23
            if (r0 < r1) goto L46
            r1 = 31
            if (r0 < r1) goto Lb
            goto L1d
        Lb:
            android.content.Context r1 = r3.f6287a
            r2 = 28
            if (r0 < r2) goto L46
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            java.lang.String r1 = "com.amazon.hardware.tv_screen"
            boolean r0 = r0.hasSystemFeature(r1)
            if (r0 == 0) goto L46
        L1d:
            androidx.media3.common.Format r0 = r4.f6290c
            java.lang.String r0 = r0.m
            int r0 = androidx.media3.common.MimeTypes.g(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Creating an asynchronous MediaCodec adapter for track type "
            r1.<init>(r2)
            java.lang.String r2 = androidx.media3.common.util.Util.A(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "DMCodecAdapterFactory"
            androidx.media3.common.util.Log.f(r2, r1)
            androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter$Factory r1 = new androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter$Factory
            r1.<init>(r0)
            androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter r4 = r1.a(r4)
            return r4
        L46:
            androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter$Factory r0 = new androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter$Factory
            r0.<init>()
            androidx.media3.exoplayer.mediacodec.MediaCodecAdapter r4 = r0.a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory.a(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter$Configuration):androidx.media3.exoplayer.mediacodec.MediaCodecAdapter");
    }
}
