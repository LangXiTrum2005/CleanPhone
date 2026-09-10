package com.badlogic.gdx.utils;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2734Rq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ExecutorC4433qn;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes.dex */
public final class GdxNativesLoader {
    public static final GdxNativesLoader INSTANCE = new GdxNativesLoader();
    private static boolean disableNativesLoading;
    private static boolean nativesLoaded;

    /* JADX INFO: renamed from: com.badlogic.gdx.utils.GdxNativesLoader$load$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.badlogic.gdx.utils.GdxNativesLoader$load$1", f = "GdxNativesLoader.kt", l = {35}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
        int label;

        /* JADX INFO: renamed from: com.badlogic.gdx.utils.GdxNativesLoader$load$1$1, reason: invalid class name and collision with other inner class name */
        @InterfaceC2314Bl(c = "com.badlogic.gdx.utils.GdxNativesLoader$load$1$1", f = "GdxNativesLoader.kt", l = {}, m = "invokeSuspend")
        public static final class C00201 extends Ea0 implements InterfaceC3567gx {
            int label;

            public C00201(InterfaceC2857Wj interfaceC2857Wj) {
                super(2, interfaceC2857Wj);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
                return new C00201(interfaceC2857Wj);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
                return ((C00201) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
                try {
                    new SharedLibraryLoader().load("gdx");
                    GdxNativesLoader.nativesLoaded = true;
                } catch (Throwable th) {
                    th.printStackTrace();
                    GdxNativesLoader.nativesLoaded = false;
                }
                return C5033xf0.f5238a;
            }
        }

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new AnonymousClass1(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            C5033xf0 c5033xf0 = C5033xf0.f5238a;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                if (GdxNativesLoader.nativesLoaded || GdxNativesLoader.INSTANCE.getDisableNativesLoading()) {
                    return c5033xf0;
                }
                ExecutorC4433qn executorC4433qn = AbstractC4437qp.b;
                C00201 c00201 = new C00201(null);
                this.label = 1;
                if (WD.X(c00201, executorC4433qn, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return c5033xf0;
        }
    }

    private GdxNativesLoader() {
    }

    public static final synchronized void load() {
        WD.R(C2734Rq.f3684a, new AnonymousClass1(null));
    }

    public final boolean getDisableNativesLoading() {
        return disableNativesLoading;
    }

    public final void setDisableNativesLoading(boolean z) {
        disableNativesLoading = z;
    }
}
