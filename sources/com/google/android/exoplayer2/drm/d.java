package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2295As;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5231zs;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2287Ak;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WU;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements e {
    @Override // com.google.android.exoplayer2.drm.e
    public final int a() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void closeSession(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final InterfaceC2287Ak d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final boolean e(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final C5231zs f(byte[] bArr, List list, int i, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final C2295As getProvisionRequest() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final byte[] openSession() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void provideProvisionResponse(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final Map queryKeyStatus(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void restoreKeys(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void b(NN nn) {
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final /* synthetic */ void c(byte[] bArr, WU wu) {
    }
}
