package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.gyf.immersionbar.NotchUtils;
import com.gyf.immersionbar.OSUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC4646tC implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5024a = 1;
    public int b;
    public Object c;
    public View d;
    public Integer e;

    public RunnableC4646tC(Object obj) {
        if (obj instanceof Activity) {
            if (((com.gyf.immersionbar.a) this.c) == null) {
                this.c = new com.gyf.immersionbar.a((Activity) obj);
                return;
            }
            return;
        }
        if (obj instanceof Fragment) {
            if (((com.gyf.immersionbar.a) this.c) == null) {
                if (obj instanceof DialogFragment) {
                    this.c = new com.gyf.immersionbar.a((DialogFragment) obj);
                    return;
                } else {
                    this.c = new com.gyf.immersionbar.a((Fragment) obj);
                    return;
                }
            }
            return;
        }
        if ((obj instanceof android.app.Fragment) && ((com.gyf.immersionbar.a) this.c) == null) {
            if (obj instanceof android.app.DialogFragment) {
                this.c = new com.gyf.immersionbar.a((android.app.DialogFragment) obj);
            } else {
                this.c = new com.gyf.immersionbar.a((android.app.Fragment) obj);
            }
        }
    }

    public final void a() {
        com.gyf.immersionbar.a aVar = (com.gyf.immersionbar.a) this.c;
        if (aVar == null || !aVar.p) {
            return;
        }
        aVar.k.getClass();
        this.e = null;
    }

    public final void b() {
        com.gyf.immersionbar.a aVar = (com.gyf.immersionbar.a) this.c;
        if (aVar != null) {
            aVar.j();
            if (OSUtils.isEMUI3_x() && aVar.p && !aVar.h && aVar.k.n) {
                aVar.e();
            } else {
                aVar.c();
            }
            a();
        }
    }

    public final void c() {
        com.gyf.immersionbar.a aVar;
        this.d = null;
        this.e = null;
        com.gyf.immersionbar.a aVar2 = (com.gyf.immersionbar.a) this.c;
        if (aVar2 != null) {
            if (aVar2.f850a != null) {
                ViewTreeObserverOnGlobalLayoutListenerC2686Pu viewTreeObserverOnGlobalLayoutListenerC2686Pu = aVar2.o;
                if (viewTreeObserverOnGlobalLayoutListenerC2686Pu != null) {
                    if (viewTreeObserverOnGlobalLayoutListenerC2686Pu.k) {
                        viewTreeObserverOnGlobalLayoutListenerC2686Pu.c.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2686Pu);
                        viewTreeObserverOnGlobalLayoutListenerC2686Pu.k = false;
                    }
                    aVar2.o = null;
                }
                int i = C2579Lq.d;
                ArrayList arrayList = AbstractC2553Kq.f3327a.f3376a;
                if (arrayList != null) {
                    arrayList.remove(aVar2);
                }
                int i2 = C4398qR.f4881a;
                C4398qR c4398qR = AbstractC4310pR.f4834a;
                aVar2.k.getClass();
                c4398qR.getClass();
            }
            if (aVar2.j && (aVar = aVar2.g) != null) {
                T8 t8 = aVar.k;
                t8.k = false;
                if (t8.q != 4) {
                    aVar.h();
                }
            }
            aVar2.p = false;
            this.c = null;
        }
    }

    public final void d() {
        com.gyf.immersionbar.a aVar = (com.gyf.immersionbar.a) this.c;
        if (aVar != null) {
            aVar.j();
            if (aVar.h || !aVar.p || aVar.k == null) {
                return;
            }
            if (OSUtils.isEMUI3_x() && aVar.k.o) {
                aVar.e();
            } else if (aVar.k.q != 4) {
                aVar.h();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        switch (this.f5024a) {
            case 0:
                ((ViewGroup.LayoutParams) this.c).height = (this.d.getHeight() + this.b) - this.e.intValue();
                View view = this.d;
                view.setPadding(view.getPaddingLeft(), (this.d.getPaddingTop() + this.b) - this.e.intValue(), this.d.getPaddingRight(), this.d.getPaddingBottom());
                this.d.setLayoutParams((ViewGroup.LayoutParams) this.c);
                return;
            default:
                com.gyf.immersionbar.a aVar = (com.gyf.immersionbar.a) this.c;
                if (aVar == null || (activity = aVar.f850a) == null) {
                    return;
                }
                new S8(activity);
                ((AbstractC4496rb) this.d).getClass();
                ((AbstractC4496rb) this.d).getClass();
                ((AbstractC4496rb) this.d).getClass();
                ((AbstractC4496rb) this.d).getClass();
                ((AbstractC4496rb) this.d).getClass();
                boolean zHasNotchScreen = NotchUtils.hasNotchScreen(activity);
                ((AbstractC4496rb) this.d).getClass();
                if (zHasNotchScreen && this.b == 0) {
                    this.b = NotchUtils.getNotchHeight(activity);
                    ((AbstractC4496rb) this.d).getClass();
                }
                AbstractC3950lJ.z(this.e);
                throw null;
        }
    }

    public RunnableC4646tC(WeaponUseActivity weaponUseActivity, Dialog dialog) {
        if (((com.gyf.immersionbar.a) this.c) == null) {
            this.c = new com.gyf.immersionbar.a(weaponUseActivity, dialog);
        }
    }
}
