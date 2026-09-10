package com.facebook.ads.redexgen.core;

import com.facebook.ads.MediaViewListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1859kW implements InterfaceC0657Df {
    public final /* synthetic */ MediaViewListener A00;
    public final /* synthetic */ C1858kV A01;

    public C1859kW(C1858kV c1858kV, MediaViewListener mediaViewListener) {
        this.A01 = c1858kV;
        this.A00 = mediaViewListener;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0657Df
    public final void ACg() {
        this.A00.onComplete(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0657Df
    public final void AD2() {
        this.A00.onEnterFullscreen(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0657Df
    public final void AD8() {
        this.A00.onExitFullscreen(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0657Df
    public final void ADG() {
        this.A00.onFullscreenBackground(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0657Df
    public final void ADI() {
        this.A00.onFullscreenForeground(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0657Df
    public final void AER() {
        this.A00.onPlay(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0657Df
    public final void AFm() {
        this.A00.onVolumeChange(this.A01.A03, this.A01.A05.getVolume());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0657Df
    public final void onPause() {
        this.A00.onPause(this.A01.A03);
    }
}
