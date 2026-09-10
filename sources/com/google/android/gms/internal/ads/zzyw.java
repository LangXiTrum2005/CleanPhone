package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzyw extends IOException {
    public zzyw(Throwable th) {
        super(DM.B("Unexpected ", th.getClass().getSimpleName(), th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : ""), th);
    }
}
