package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import androidx.work.PeriodicWorkRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Um, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2808Um {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3841a = new Object();
    public C2987aO b;
    public com.google.android.exoplayer2.drm.b c;

    public static com.google.android.exoplayer2.drm.b a(C2987aO c2987aO) {
        C3817jn c3817jn = new C3817jn();
        c3817jn.b = null;
        Uri uri = c2987aO.b;
        C3877kY c3877kY = new C3877kY(uri == null ? null : uri.toString(), c2987aO.f, c3817jn);
        Yf0 yf0G = c2987aO.c.entrySet().iterator();
        while (yf0G.hasNext()) {
            Map.Entry entry = (Map.Entry) yf0G.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((Map) c3877kY.e)) {
                ((Map) c3877kY.e).put(str, str2);
            }
        }
        HashMap map = new HashMap();
        UUID uuid = AbstractC4147nc.f4750a;
        G7 g7 = new G7();
        UUID uuid2 = c2987aO.f4120a;
        C2297Au c2297Au = com.google.android.exoplayer2.drm.f.d;
        uuid2.getClass();
        boolean z = c2987aO.d;
        boolean z2 = c2987aO.e;
        int[] iArrZ0 = AbstractC2995aW.z0(c2987aO.g);
        for (int i : iArrZ0) {
            boolean z3 = true;
            if (i != 2 && i != 1) {
                z3 = false;
            }
            FW.h(z3);
        }
        com.google.android.exoplayer2.drm.b bVar = new com.google.android.exoplayer2.drm.b(uuid2, c2297Au, c3877kY, map, z, (int[]) iArrZ0.clone(), z2, g7, PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
        byte[] bArr = c2987aO.h;
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        FW.s(bVar.l.isEmpty());
        bVar.u = 0;
        bVar.v = bArrCopyOf;
        return bVar;
    }

    public final InterfaceC3296dq b(C3693iO c3693iO) {
        com.google.android.exoplayer2.drm.b bVar;
        c3693iO.b.getClass();
        C2987aO c2987aO = c3693iO.b.c;
        if (c2987aO == null || Ug0.f3833a < 18) {
            return InterfaceC3296dq.e1;
        }
        synchronized (this.f3841a) {
            try {
                if (!Ug0.a(c2987aO, this.b)) {
                    this.b = c2987aO;
                    this.c = a(c2987aO);
                }
                bVar = this.c;
                bVar.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
