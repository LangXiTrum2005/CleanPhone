package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Rm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC2730Rm extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.drm.b f3678a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2730Rm(com.google.android.exoplayer2.drm.b bVar, Looper looper) {
        super(looper);
        this.f3678a = bVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        for (com.google.android.exoplayer2.drm.a aVar : this.f3678a.l) {
            if (Arrays.equals(aVar.u, bArr)) {
                if (message.what == 2 && aVar.e == 0 && aVar.o == 4) {
                    int i = Ug0.f3833a;
                    aVar.g(false);
                    return;
                }
                return;
            }
        }
    }
}
