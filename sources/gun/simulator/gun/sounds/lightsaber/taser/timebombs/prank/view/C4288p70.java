package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.SnapshotArray;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.p70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4288p70 implements InterfaceC4218oN {
    public static volatile C4288p70 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4823a;
    public Object b;
    public boolean c;
    public Object d;

    public C4288p70(int i) {
        this.f4823a = i;
        if (i == 5) {
            a();
        } else if (i != 6) {
            this.b = Collections.newSetFromMap(new WeakHashMap());
            this.d = new HashSet();
        }
    }

    public static C4288p70 f(Context context) {
        if (e == null) {
            synchronized (C4288p70.class) {
                try {
                    if (e == null) {
                        e = new C4288p70(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public final void a() {
        switch (this.f4823a) {
            case 2:
                ((Array) this.d).clear();
                break;
            default:
                this.d = null;
                this.c = false;
                this.b = null;
                break;
        }
    }

    public final boolean b(IY iy) {
        boolean z = true;
        if (iy == null) {
            return true;
        }
        boolean zRemove = ((Set) this.b).remove(iy);
        if (!((Set) this.d).remove(iy) && !zRemove) {
            z = false;
        }
        if (z) {
            iy.clear();
        }
        return z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4218oN
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final E6 v(C4130nN c4130nN) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = c4130nN.f4740a.f5075a;
        E6 e6 = null;
        try {
            FW.c("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                E6 e7 = new E6(mediaCodecCreateByCodecName, (HandlerThread) ((Ca0) this.d).get(), (HandlerThread) ((Ca0) this.b).get(), this.c);
                try {
                    FW.A();
                    E6.m(e7, c4130nN.b, c4130nN.d, c4130nN.e);
                    return e7;
                } catch (Exception e2) {
                    e = e2;
                    e6 = e7;
                    if (e6 != null) {
                        e6.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            e = e4;
            mediaCodecCreateByCodecName = null;
        }
    }

    public final void d() {
        int i;
        Exception e2;
        if (this.c) {
            return;
        }
        this.c = true;
        SnapshotArray snapshotArray = ((C3843k5) this.b).d;
        int i2 = 0;
        while (true) {
            Object obj = this.d;
            if (i2 >= ((Array) obj).size) {
                a();
                this.c = false;
                return;
            }
            try {
                try {
                    EnumC3669i5 enumC3669i5 = (EnumC3669i5) ((Array) obj).get(i2);
                    i = i2 + 1;
                    C3755j5 c3755j5 = (C3755j5) ((Array) this.d).get(i);
                    int i3 = snapshotArray.size;
                    Object[] objArrBegin = snapshotArray.begin();
                    int iOrdinal = enumC3669i5.ordinal();
                    if (iOrdinal == 0) {
                        c3755j5.getClass();
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((InterfaceC3581h5) objArrBegin[i4]).getClass();
                        }
                    } else if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            c3755j5.getClass();
                            for (int i5 = 0; i5 < i3; i5++) {
                                ((InterfaceC3581h5) objArrBegin[i5]).getClass();
                            }
                        } else if (iOrdinal != 3) {
                            if (iOrdinal == 4) {
                                c3755j5.getClass();
                                for (int i6 = 0; i6 < i3; i6++) {
                                    ((InterfaceC3581h5) objArrBegin[i6]).a(c3755j5);
                                }
                            } else if (iOrdinal == 5) {
                                try {
                                    C2683Pr c2683Pr = (C2683Pr) ((Array) this.d).get(i2 + 2);
                                    c3755j5.getClass();
                                    for (int i7 = 0; i7 < i3; i7++) {
                                        ((InterfaceC3581h5) objArrBegin[i7]).b(c2683Pr);
                                    }
                                    i2 = i;
                                } catch (Exception e3) {
                                    e2 = e3;
                                    e2.printStackTrace();
                                    snapshotArray.end();
                                    i2 = i;
                                }
                            }
                        }
                        c3755j5.getClass();
                        for (int i8 = 0; i8 < i3; i8++) {
                            ((InterfaceC3581h5) objArrBegin[i8]).getClass();
                        }
                        ((C3843k5) this.b).j.free(c3755j5);
                    } else {
                        c3755j5.getClass();
                        for (int i9 = 0; i9 < i3; i9++) {
                            ((InterfaceC3581h5) objArrBegin[i9]).getClass();
                        }
                    }
                    snapshotArray.end();
                } catch (Throwable th) {
                    snapshotArray.end();
                    throw th;
                }
            } catch (Exception e4) {
                i = i2;
                e2 = e4;
            }
            i2 += 2;
        }
    }

    public final void e(C3755j5 c3755j5) {
        ((Array) this.d).add(EnumC3669i5.c);
        ((Array) this.d).add(c3755j5);
        ((C3843k5) this.b).g = true;
    }

    public final void g() {
        for (IY iy : Tg0.e((Set) this.b)) {
            if (!iy.h() && !iy.g()) {
                iy.clear();
                if (this.c) {
                    ((Set) this.d).add(iy);
                } else {
                    iy.begin();
                }
            }
        }
    }

    public final void h() {
        this.c = false;
        for (IY iy : Tg0.e((Set) this.b)) {
            if (!iy.h() && !iy.isRunning()) {
                iy.begin();
            }
        }
        ((Set) this.d).clear();
    }

    public final void i(boolean z) {
        if (this.c) {
            ((Context) this.d).unregisterReceiver((RunnableC2967a7) this.b);
            this.c = false;
        }
    }

    public final String toString() {
        switch (this.f4823a) {
            case 1:
                return super.toString() + "{numRequests=" + ((Set) this.b).size() + ", isPaused=" + this.c + "}";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D6] */
    /* JADX WARN: Type inference failed for: r4v2, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D6] */
    public C4288p70(final int i, int i2) {
        this.f4823a = 4;
        final int i3 = 0;
        final int i4 = 1;
        this((D6) new Ca0() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D6
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ca0
            public final Object get() {
                int i5 = i3;
                int i6 = i;
                switch (i5) {
                    case 0:
                        return new HandlerThread(E6.n(i6, "ExoPlayer:MediaCodecAsyncAdapter:"));
                    default:
                        return new HandlerThread(E6.n(i6, "ExoPlayer:MediaCodecQueueingThread:"));
                }
            }
        }, (D6) new Ca0() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D6
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ca0
            public final Object get() {
                int i5 = i4;
                int i6 = i;
                switch (i5) {
                    case 0:
                        return new HandlerThread(E6.n(i6, "ExoPlayer:MediaCodecAsyncAdapter:"));
                    default:
                        return new HandlerThread(E6.n(i6, "ExoPlayer:MediaCodecQueueingThread:"));
                }
            }
        });
    }

    public C4288p70(Context context, Handler handler, SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os) {
        this.f4823a = 3;
        this.d = context.getApplicationContext();
        this.b = new RunnableC2967a7(this, handler, surfaceHolderCallbackC2658Os);
    }

    public C4288p70(Context context) {
        Object c4200o70;
        this.f4823a = 0;
        this.b = new HashSet();
        C4351pr c4351pr = new C4351pr(new C5091yH(this, context));
        C3674i70 c3674i70 = new C3674i70(this);
        if (Build.VERSION.SDK_INT >= 24) {
            c4200o70 = new C3877kY(c4351pr, c3674i70);
        } else {
            c4200o70 = new C4200o70(context, c4351pr, c3674i70);
        }
        this.d = c4200o70;
    }

    public C4288p70(D6 d6, D6 d7) {
        this.f4823a = 4;
        this.d = d6;
        this.b = d7;
        this.c = false;
    }

    public C4288p70(C3843k5 c3843k5) {
        this.f4823a = 2;
        this.b = c3843k5;
        this.d = new Array();
    }
}
