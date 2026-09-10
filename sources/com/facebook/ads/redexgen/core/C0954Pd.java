package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSink;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0954Pd implements InterfaceC1434dW {
    public InterfaceC1490eR A02;
    public long A01 = 5242880;
    public int A00 = CacheDataSink.DEFAULT_BUFFER_SIZE;

    public final C0954Pd A00(InterfaceC1490eR interfaceC1490eR) {
        this.A02 = interfaceC1490eR;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1434dW
    public final PY A57() {
        return new PY((InterfaceC1490eR) AbstractC1517es.A01(this.A02), this.A01, this.A00);
    }
}
