package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.util.Util;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class FrameworkCryptoConfig implements CryptoConfig {
    public static final boolean d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f17487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f17488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17489c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z2;
        if ("Amazon".equals(Util.f18981c)) {
            String str = Util.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        d = z2;
    }

    public FrameworkCryptoConfig(UUID uuid, byte[] bArr, boolean z2) {
        this.f17487a = uuid;
        this.f17488b = bArr;
        this.f17489c = z2;
    }
}
