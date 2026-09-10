package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class FrameworkCryptoConfig implements CryptoConfig {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f6235c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f6236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f6237b;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z2;
        if ("Amazon".equals(Util.f5685c)) {
            String str = Util.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        f6235c = z2;
    }

    public FrameworkCryptoConfig(UUID uuid, byte[] bArr) {
        this.f6236a = uuid;
        this.f6237b = bArr;
    }
}
