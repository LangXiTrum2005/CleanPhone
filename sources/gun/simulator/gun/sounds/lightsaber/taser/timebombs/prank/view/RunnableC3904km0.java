package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Build;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.OY.Lxb.Lxb;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.km0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3904km0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4614a;
    public final /* synthetic */ AbstractC4783um0 b;

    public /* synthetic */ RunnableC3904km0(AbstractC4783um0 abstractC4783um0, int i) {
        this.f4614a = i;
        this.b = abstractC4783um0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4614a;
        AbstractC4783um0 abstractC4783um0 = this.b;
        switch (i) {
            case 0:
                if (abstractC4783um0.lc == null) {
                    try {
                        abstractC4783um0.lc = new OG();
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (abstractC4783um0.lc != null) {
                        Qo0 unused = abstractC4783um0.lc;
                        abstractC4783um0.eK = "0";
                        ((OG) abstractC4783um0.lc).f3496a = abstractC4783um0;
                        ((OG) abstractC4783um0.lc).b = abstractC4783um0;
                        ((OG) abstractC4783um0.lc).f = abstractC4783um0;
                        ((OG) abstractC4783um0.lc).c = abstractC4783um0;
                        ((OG) abstractC4783um0.lc).d = abstractC4783um0;
                        ((OG) abstractC4783um0.lc).g = abstractC4783um0;
                        ((OG) abstractC4783um0.lc).e = abstractC4783um0;
                        try {
                            ((OG) abstractC4783um0.lc).i.setLooping(false);
                            break;
                        } catch (Throwable unused2) {
                        }
                        abstractC4783um0.OY = false;
                        break;
                    }
                }
                break;
            case 1:
                if (abstractC4783um0.ebl() && abstractC4783um0.lc != null) {
                    try {
                        ((OG) abstractC4783um0.lc).i.start();
                        for (WeakReference weakReference : abstractC4783um0.id) {
                            if (weakReference != null && weakReference.get() != null) {
                                ((InterfaceC5094yK) weakReference.get()).JXs(abstractC4783um0);
                            }
                        }
                        abstractC4783um0.JVA = 206;
                    } catch (Throwable th2) {
                        th2.getMessage();
                        return;
                    }
                    break;
                }
                break;
            case 2:
                if (abstractC4783um0.NXR != null) {
                    abstractC4783um0.NXR.sendEmptyMessage(101);
                }
                break;
            case 3:
                if (abstractC4783um0.NXR != null) {
                    abstractC4783um0.NXR.sendEmptyMessage(101);
                }
                break;
            case 4:
                if (abstractC4783um0.NXR != null) {
                    abstractC4783um0.NXR.sendEmptyMessage(104);
                }
                break;
            case 5:
                if (abstractC4783um0.lc != null) {
                    long jKqm = abstractC4783um0.kqm();
                    if (jKqm > 0 && Build.VERSION.SDK_INT >= 23 && abstractC4783um0.lc() && abstractC4783um0.VVE != Long.MIN_VALUE) {
                        try {
                            if (abstractC4783um0.VVE == jKqm) {
                                if (!abstractC4783um0.STP && abstractC4783um0.kqm >= 400) {
                                    abstractC4783um0.b(TypedValues.TransitionType.TYPE_FROM);
                                    abstractC4783um0.STP = true;
                                }
                                abstractC4783um0.kqm += (long) abstractC4783um0.nE;
                            } else {
                                if (abstractC4783um0.STP) {
                                    abstractC4783um0.IeN += abstractC4783um0.kqm;
                                    abstractC4783um0.b(TypedValues.TransitionType.TYPE_TO);
                                    long unused3 = abstractC4783um0.IeN;
                                    int unused4 = abstractC4783um0.lk;
                                }
                                abstractC4783um0.kqm = 0L;
                                abstractC4783um0.STP = false;
                            }
                        } catch (Throwable th3) {
                            th3.getMessage();
                        }
                    }
                    if (abstractC4783um0.VVE() > 0) {
                        if (abstractC4783um0.VVE != jKqm) {
                            AbstractC4783um0.Lxb(abstractC4783um0, jKqm, abstractC4783um0.VVE());
                        }
                        abstractC4783um0.VVE = jKqm;
                    }
                    if (abstractC4783um0.LD()) {
                        AbstractC4783um0.Lxb(abstractC4783um0, abstractC4783um0.VVE(), abstractC4783um0.VVE());
                    } else if (abstractC4783um0.NXR != null) {
                        abstractC4783um0.NXR.postDelayed(this, abstractC4783um0.nE);
                    }
                    break;
                }
                break;
            case 6:
                if (abstractC4783um0.NXR != null && abstractC4783um0.NXR.getLooper() != null) {
                    try {
                        Lxb.Lxb().Lxb(abstractC4783um0.NXR);
                        abstractC4783um0.NXR = null;
                    } catch (Throwable unused5) {
                        return;
                    }
                    break;
                }
                break;
            default:
                try {
                    ((OG) abstractC4783um0.lc).i.pause();
                    abstractC4783um0.JVA = 207;
                    abstractC4783um0.le = false;
                } catch (Throwable unused6) {
                    return;
                }
                break;
        }
    }
}
