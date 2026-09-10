package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.Spatializer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2835Vn implements InterfaceC4753uV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3557go f3893a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    /* JADX WARN: Code duplicated, block: B:40:0x0062 A[Catch: all -> 0x008f, FALL_THROUGH, TryCatch #0 {all -> 0x008f, blocks: (B:4:0x0007, B:6:0x000e, B:8:0x0012, B:10:0x0017, B:34:0x0056, B:36:0x005a, B:38:0x005e, B:40:0x0062, B:42:0x0066, B:44:0x006a, B:46:0x006e, B:48:0x0078, B:50:0x0084, B:56:0x0092), top: B:60:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4753uV
    public final boolean apply(Object obj) {
        boolean z;
        C3877kY c3877kY;
        C3877kY c3877kY2;
        C3557go c3557go = this.f3893a;
        C4619sw c4619sw = (C4619sw) obj;
        synchronized (c3557go.c) {
            try {
                z = true;
                if (c3557go.g.j0 && !c3557go.f) {
                    if (c4619sw.y > 2) {
                        String str = c4619sw.l;
                        if (str != null) {
                            switch (str) {
                                case "audio/eac3-joc":
                                case "audio/ac3":
                                case "audio/ac4":
                                case "audio/eac3":
                                    if (Ug0.f3833a >= 32 && (c3877kY2 = c3557go.h) != null && c3877kY2.b) {
                                    }
                                default:
                                    if (Ug0.f3833a < 32) {
                                        z = false;
                                        break;
                                    } else {
                                        z = false;
                                        break;
                                    }
                                    break;
                            }
                        } else if (Ug0.f3833a < 32 || (c3877kY = c3557go.h) == null || !c3877kY.b || !((Spatializer) c3877kY.c).isAvailable() || !((Spatializer) c3557go.h.c).isEnabled() || !c3557go.h.d(c4619sw, c3557go.i)) {
                            z = false;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
