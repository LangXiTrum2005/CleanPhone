package com.google.android.exoplayer2.drm;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2295As;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5231zs;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2287Ak;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WU;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface e {
    int a();

    void b(NN nn);

    void c(byte[] bArr, WU wu);

    void closeSession(byte[] bArr);

    InterfaceC2287Ak d(byte[] bArr);

    boolean e(byte[] bArr, String str);

    C5231zs f(byte[] bArr, List list, int i, HashMap map);

    C2295As getProvisionRequest();

    byte[] openSession();

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2);

    void provideProvisionResponse(byte[] bArr);

    Map queryKeyStatus(byte[] bArr);

    void release();

    void restoreKeys(byte[] bArr, byte[] bArr2);
}
