package com.smartdigimkt.a4;

import android.media.MediaCrypto;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCrypto f33657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f33658b;

    public k(MediaCrypto mediaCrypto) {
        this(mediaCrypto, false);
    }

    public MediaCrypto a() {
        return this.f33657a;
    }

    public k(MediaCrypto mediaCrypto, boolean z2) {
        this.f33657a = (MediaCrypto) com.smartdigimkt.p4.a.a(mediaCrypto);
        this.f33658b = z2;
    }

    @Override // com.smartdigimkt.a4.i
    public boolean a(String str) {
        return !this.f33658b && this.f33657a.requiresSecureDecoderComponent(str);
    }
}
