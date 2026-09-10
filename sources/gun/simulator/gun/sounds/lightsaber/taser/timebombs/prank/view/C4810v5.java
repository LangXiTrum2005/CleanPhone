package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaPlayer;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4520rn;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B8;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BF;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2498In;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.v5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4810v5 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5117a;
    public /* synthetic */ Object b;
    public final /* synthetic */ App c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4810v5(App app, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = app;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C4810v5 c4810v5 = new C4810v5(this.c, interfaceC2857Wj);
        c4810v5.b = obj;
        return c4810v5;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4810v5) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        InterfaceC4514rk interfaceC4514rk;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f5117a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            InterfaceC4514rk interfaceC4514rk2 = (InterfaceC4514rk) this.b;
            App app = this.c;
            super/*gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ph*/.onCreate();
            App.q = false;
            App.o = app;
            ExecutorC4433qn executorC4433qn = AbstractC4437qp.b;
            C4546s5 c4546s5 = new C4546s5(app, null);
            this.b = interfaceC4514rk2;
            this.f5117a = 1;
            if (WD.X(c4546s5, executorC4433qn, this) == enumC4602sk) {
                return enumC4602sk;
            }
            interfaceC4514rk = interfaceC4514rk2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC4514rk = (InterfaceC4514rk) this.b;
            AbstractC3375el.b0(obj);
        }
        AbstractC3651ht.a(interfaceC4514rk, new C4634t5(2, null));
        AbstractC3651ht.a(interfaceC4514rk, new C4722u5(2, null));
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App$onCreate$1$4
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                AbstractC4520rn.a(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
                AbstractC4520rn.b(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                AbstractC4520rn.c(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                AbstractC4520rn.d(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onStart(LifecycleOwner lifecycleOwner) {
                AbstractC2995aW.q(lifecycleOwner, "owner");
                AbstractC4520rn.d(this, lifecycleOwner);
                WD.D(C2498In.g(), AbstractC4437qp.b, 0, new B8(App.n.f(), null), 2);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onStop(LifecycleOwner lifecycleOwner) {
                AbstractC2995aW.q(lifecycleOwner, "owner");
                AbstractC4520rn.f(this, lifecycleOwner);
                MediaPlayer mediaPlayer = BF.g;
                try {
                    if (mediaPlayer != null) {
                        try {
                            if (mediaPlayer.isPlaying()) {
                                mediaPlayer.stop();
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        mediaPlayer.release();
                        BF.g = null;
                    }
                    BF.g = null;
                } catch (Throwable th) {
                    mediaPlayer.release();
                    BF.g = null;
                    throw th;
                }
            }
        });
        return C5033xf0.f5238a;
    }
}
