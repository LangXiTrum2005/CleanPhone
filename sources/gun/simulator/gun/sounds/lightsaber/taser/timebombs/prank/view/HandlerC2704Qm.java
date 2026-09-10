package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC2704Qm extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.drm.a f3623a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2704Qm(com.google.android.exoplayer2.drm.a aVar, Looper looper) {
        super(looper);
        this.f3623a = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Set set;
        Set set2;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 0) {
            com.google.android.exoplayer2.drm.a aVar = this.f3623a;
            if (obj == aVar.x) {
                if (aVar.o == 2 || aVar.h()) {
                    aVar.x = null;
                    boolean z = obj2 instanceof Exception;
                    C3491g4 c3491g4 = aVar.c;
                    if (z) {
                        c3491g4.D((Exception) obj2, false);
                        return;
                    }
                    try {
                        aVar.b.provideProvisionResponse((byte[]) obj2);
                        c3491g4.c = null;
                        AC acJ = AC.j((Set) c3491g4.b);
                        ((Set) c3491g4.b).clear();
                        C5086yC c5086yCListIterator = acJ.listIterator(0);
                        while (c5086yCListIterator.hasNext()) {
                            com.google.android.exoplayer2.drm.a aVar2 = (com.google.android.exoplayer2.drm.a) c5086yCListIterator.next();
                            if (aVar2.k()) {
                                aVar2.g(true);
                            }
                        }
                        return;
                    } catch (Exception e) {
                        c3491g4.D(e, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i != 1) {
            return;
        }
        com.google.android.exoplayer2.drm.a aVar3 = this.f3623a;
        if (obj == aVar3.w && aVar3.h()) {
            aVar3.w = null;
            if (obj2 instanceof Exception) {
                aVar3.j((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (aVar3.e == 3) {
                    com.google.android.exoplayer2.drm.e eVar = aVar3.b;
                    byte[] bArr2 = aVar3.v;
                    int i2 = Ug0.f3833a;
                    eVar.provideKeyResponse(bArr2, bArr);
                    C3196ck c3196ck = aVar3.i;
                    synchronized (c3196ck.f4240a) {
                        set2 = c3196ck.c;
                    }
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        ((C3031aq) it.next()).b();
                    }
                    return;
                }
                byte[] bArrProvideKeyResponse = aVar3.b.provideKeyResponse(aVar3.u, bArr);
                int i3 = aVar3.e;
                if ((i3 == 2 || (i3 == 0 && aVar3.v != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                    aVar3.v = bArrProvideKeyResponse;
                }
                aVar3.o = 4;
                C3196ck c3196ck2 = aVar3.i;
                synchronized (c3196ck2.f4240a) {
                    set = c3196ck2.c;
                }
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    ((C3031aq) it2.next()).a();
                }
                return;
            } catch (Exception e2) {
                aVar3.j(e2, true);
            }
            aVar3.j(e2, true);
        }
    }
}
