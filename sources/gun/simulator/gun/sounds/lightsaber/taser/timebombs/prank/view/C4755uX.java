package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.efs.sdk.base.core.util.NetworkUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponSortActivity;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4755uX {
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static int e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4755uX f5081a = new C4755uX();
    public static long f = ((Number) ((C2856Wi) AbstractC3194cj.i.getValue()).a()).longValue();
    public static final long g = System.currentTimeMillis();

    public static Object c(AbstractC2883Xj abstractC2883Xj) {
        Object objX = WD.X(new C4667tX(2, null), AbstractC4437qp.b, abstractC2883Xj);
        return objX == EnumC4602sk.f4993a ? objX : C5033xf0.f5238a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(InterfaceC2857Wj interfaceC2857Wj) {
        C4316pX c4316pX;
        long jCurrentTimeMillis;
        C4755uX c4755uX;
        if (interfaceC2857Wj instanceof C4316pX) {
            c4316pX = (C4316pX) interfaceC2857Wj;
            int i = c4316pX.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4316pX.e = i - Integer.MIN_VALUE;
            } else {
                c4316pX = new C4316pX(this, interfaceC2857Wj);
            }
        } else {
            c4316pX = new C4316pX(this, interfaceC2857Wj);
        }
        Object obj = c4316pX.c;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c4316pX.e;
        if (i2 == 0) {
            AbstractC3375el.b0(obj);
            if (!NetworkUtil.isConnected(App.n.f())) {
                return Boolean.FALSE;
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            ExecutorC4433qn executorC4433qn = AbstractC4437qp.b;
            C4404qX c4404qX = new C4404qX(2, null);
            c4316pX.f4837a = this;
            c4316pX.b = jCurrentTimeMillis;
            c4316pX.e = 1;
            if (WD.X(c4404qX, executorC4433qn, c4316pX) == enumC4602sk) {
                return enumC4602sk;
            }
            c4755uX = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    AbstractC3375el.b0(obj);
                    return Boolean.TRUE;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
                return Boolean.TRUE;
            }
            jCurrentTimeMillis = c4316pX.b;
            c4755uX = c4316pX.f4837a;
            AbstractC3375el.b0(obj);
        }
        if (WeaponSortActivity.h || !WeaponSortActivity.g) {
            return Boolean.FALSE;
        }
        boolean z = b;
        if (!z && e == 1 && !d) {
            c4316pX.f4837a = null;
            c4316pX.e = 2;
            c4755uX.getClass();
            if (c(c4316pX) == enumC4602sk) {
                return enumC4602sk;
            }
            return Boolean.TRUE;
        }
        if (z || e >= 7 || jCurrentTimeMillis < f + ((long) 86400000)) {
            return Boolean.FALSE;
        }
        c4316pX.f4837a = null;
        c4316pX.e = 3;
        c4755uX.getClass();
        if (c(c4316pX) == enumC4602sk) {
            return enumC4602sk;
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(InterfaceC2857Wj interfaceC2857Wj) {
        C4491rX c4491rX;
        long jCurrentTimeMillis;
        C4755uX c4755uX;
        if (interfaceC2857Wj instanceof C4491rX) {
            c4491rX = (C4491rX) interfaceC2857Wj;
            int i = c4491rX.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4491rX.e = i - Integer.MIN_VALUE;
            } else {
                c4491rX = new C4491rX(this, interfaceC2857Wj);
            }
        } else {
            c4491rX = new C4491rX(this, interfaceC2857Wj);
        }
        Object obj = c4491rX.c;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c4491rX.e;
        if (i2 == 0) {
            AbstractC3375el.b0(obj);
            if (!NetworkUtil.isConnected(App.n.f())) {
                return Boolean.FALSE;
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            ExecutorC4433qn executorC4433qn = AbstractC4437qp.b;
            C4579sX c4579sX = new C4579sX(2, null);
            c4491rX.f4934a = this;
            c4491rX.b = jCurrentTimeMillis;
            c4491rX.e = 1;
            if (WD.X(c4579sX, executorC4433qn, c4491rX) == enumC4602sk) {
                return enumC4602sk;
            }
            c4755uX = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    AbstractC3375el.b0(obj);
                    return Boolean.TRUE;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
                return Boolean.TRUE;
            }
            jCurrentTimeMillis = c4491rX.b;
            c4755uX = c4491rX.f4934a;
            AbstractC3375el.b0(obj);
        }
        boolean z = b;
        if (!z && c && e == 1 && !d) {
            c4491rX.f4934a = null;
            c4491rX.e = 2;
            c4755uX.getClass();
            if (c(c4491rX) == enumC4602sk) {
                return enumC4602sk;
            }
            return Boolean.TRUE;
        }
        if (z || !c || e >= 7 || jCurrentTimeMillis < f + ((long) 86400000)) {
            return Boolean.FALSE;
        }
        c4491rX.f4934a = null;
        c4491rX.e = 3;
        c4755uX.getClass();
        if (c(c4491rX) == enumC4602sk) {
            return enumC4602sk;
        }
        return Boolean.TRUE;
    }
}
