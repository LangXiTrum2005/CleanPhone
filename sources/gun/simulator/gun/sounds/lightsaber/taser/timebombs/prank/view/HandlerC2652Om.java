package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC2652Om extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3521a;
    public final /* synthetic */ com.google.android.exoplayer2.drm.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2652Om(com.google.android.exoplayer2.drm.a aVar, Looper looper) {
        super(looper);
        this.b = aVar;
    }

    public final boolean a(Message message, UN un) {
        long jMin;
        C2678Pm c2678Pm = (C2678Pm) message.obj;
        if (!c2678Pm.b) {
            return false;
        }
        int i = c2678Pm.d + 1;
        c2678Pm.d = i;
        if (i > this.b.j.A(3)) {
            return false;
        }
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        Throwable c3124bu = un.getCause() instanceof IOException ? (IOException) un.getCause() : new C3124bu(un.getCause());
        G7 g7 = this.b.j;
        int i2 = c2678Pm.d;
        g7.getClass();
        if (!(c3124bu instanceof KT) && !(c3124bu instanceof FileNotFoundException) && !(c3124bu instanceof OA) && !(c3124bu instanceof NI)) {
            int i3 = C4604sl.b;
            while (true) {
                if (c3124bu == null) {
                    jMin = Math.min((i2 - 1) * 1000, 5000);
                    break;
                }
                if ((c3124bu instanceof C4604sl) && ((C4604sl) c3124bu).f4995a == 2008) {
                    jMin = -9223372036854775807L;
                    break;
                }
                c3124bu = c3124bu.getCause();
            }
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        if (jMin == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f3521a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), jMin);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object objK;
        C2678Pm c2678Pm = (C2678Pm) message.obj;
        try {
            int i = message.what;
            if (i == 0) {
                objK = this.b.l.k((C2295As) c2678Pm.c);
            } else {
                if (i != 1) {
                    throw new RuntimeException();
                }
                com.google.android.exoplayer2.drm.a aVar = this.b;
                objK = aVar.l.i(aVar.m, (C5231zs) c2678Pm.c);
            }
        } catch (UN e) {
            boolean zA = a(message, e);
            objK = e;
            if (zA) {
                return;
            }
        } catch (Exception e2) {
            AbstractC4038mJ.g("Key/provisioning request produced an unexpected exception. Not retrying.", e2);
            objK = e2;
        }
        G7 g7 = this.b.j;
        long j = c2678Pm.f3572a;
        g7.getClass();
        synchronized (this) {
            try {
                if (!this.f3521a) {
                    this.b.n.obtainMessage(message.what, Pair.create(c2678Pm.c, objK)).sendToTarget();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
