package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Message;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.basic.lib.basic.BasicActivityNotBinding;
import com.basic.lib.basic.BasicFragmentNotBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class W9 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3911a;
    public final /* synthetic */ Object b;

    public /* synthetic */ W9(Object obj, int i) {
        this.f3911a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:87:0x01da  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        int i = this.f3911a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AbstractC2995aW.q((BasicActivityNotBinding) obj, "this$0");
                AbstractC2995aW.q(message, "it");
                return false;
            case 1:
                AbstractC2995aW.q((BasicFragmentNotBinding) obj, "this$0");
                AbstractC2995aW.q(message, "it");
                return false;
            case 2:
                C2388Eh c2388Eh = (C2388Eh) obj;
                C3693iO c3693iO = C2388Eh.u;
                c2388Eh.getClass();
                int i2 = message.what;
                if (i2 != 0) {
                    ArrayList arrayList = c2388Eh.n;
                    if (i2 == 1) {
                        Object obj2 = message.obj;
                        int i3 = Ug0.f3833a;
                        C2362Dh c2362Dh = (C2362Dh) obj2;
                        int i4 = c2362Dh.f2982a;
                        int iIntValue = ((Integer) c2362Dh.b).intValue();
                        if (i4 == 0) {
                            D60 d60 = c2388Eh.t;
                            if (iIntValue == d60.b.length) {
                                c2388Eh.t = d60.a();
                            } else {
                                c2388Eh.t = c2388Eh.t.c(i4, iIntValue);
                            }
                        } else {
                            c2388Eh.t = c2388Eh.t.c(i4, iIntValue);
                        }
                        for (int i5 = iIntValue - 1; i5 >= i4; i5--) {
                            C2336Ch c2336Ch = (C2336Ch) arrayList.remove(i5);
                            c2388Eh.p.remove(c2336Ch.b);
                            c2388Eh.E(i5, -1, -c2336Ch.f2934a.o.e.p());
                            c2336Ch.f = true;
                            if (c2336Ch.c.isEmpty()) {
                                c2388Eh.q.remove(c2336Ch);
                                C4772uh c4772uh = (C4772uh) c2388Eh.h.remove(c2336Ch);
                                c4772uh.getClass();
                                G9 g9 = c4772uh.f5094a;
                                g9.r(c4772uh.b);
                                C3844k50 c3844k50 = c4772uh.c;
                                g9.u(c3844k50);
                                g9.t(c3844k50);
                            }
                        }
                        c2362Dh.getClass();
                        c2388Eh.I(null);
                    } else if (i2 == 2) {
                        Object obj3 = message.obj;
                        int i6 = Ug0.f3833a;
                        C2362Dh c2362Dh2 = (C2362Dh) obj3;
                        D60 d61 = c2388Eh.t;
                        int i7 = c2362Dh2.f2982a;
                        D60 d60C = d61.c(i7, i7 + 1);
                        c2388Eh.t = d60C;
                        Integer num = (Integer) c2362Dh2.b;
                        c2388Eh.t = d60C.b(num.intValue(), 1);
                        int iIntValue2 = num.intValue();
                        int i8 = c2362Dh2.f2982a;
                        int iMin = Math.min(i8, iIntValue2);
                        int iMax = Math.max(i8, iIntValue2);
                        int iP = ((C2336Ch) arrayList.get(iMin)).e;
                        arrayList.add(iIntValue2, (C2336Ch) arrayList.remove(i8));
                        while (iMin <= iMax) {
                            C2336Ch c2336Ch2 = (C2336Ch) arrayList.get(iMin);
                            c2336Ch2.d = iMin;
                            c2336Ch2.e = iP;
                            iP += c2336Ch2.f2934a.o.e.p();
                            iMin++;
                        }
                        c2362Dh2.getClass();
                        c2388Eh.I(null);
                    } else if (i2 == 3) {
                        Object obj4 = message.obj;
                        int i9 = Ug0.f3833a;
                        C2362Dh c2362Dh3 = (C2362Dh) obj4;
                        c2388Eh.t = (D60) c2362Dh3.b;
                        c2362Dh3.getClass();
                        c2388Eh.I(null);
                    } else if (i2 == 4) {
                        c2388Eh.J();
                    } else {
                        if (i2 != 5) {
                            throw new IllegalStateException();
                        }
                        Object obj5 = message.obj;
                        int i10 = Ug0.f3833a;
                        c2388Eh.G((Set) obj5);
                    }
                } else {
                    Object obj6 = message.obj;
                    int i11 = Ug0.f3833a;
                    C2362Dh c2362Dh4 = (C2362Dh) obj6;
                    D60 d62 = c2388Eh.t;
                    int i12 = c2362Dh4.f2982a;
                    Collection collection = (Collection) c2362Dh4.b;
                    c2388Eh.t = d62.b(i12, collection.size());
                    c2388Eh.C(c2362Dh4.f2982a, collection);
                    c2362Dh4.getClass();
                    c2388Eh.I(null);
                }
                return true;
            case 3:
                EI ei = (EI) obj;
                for (DI di : ei.d) {
                    if (!di.d && di.c) {
                        C3125bv c3125bvB = di.b.b();
                        di.b = new C4581sZ(3);
                        di.c = false;
                        ei.c.b(di.f2965a, c3125bvB);
                    }
                    if (ei.b.f3608a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            case 4:
                ((C4629t20) obj).getClass();
                AbstractC2995aW.q(message, NotificationCompat.CATEGORY_MESSAGE);
                return false;
            case 5:
                return ((AbstractC4340pk0) obj).g(message);
            default:
                C5027xc0 c5027xc0 = (C5027xc0) obj;
                AbstractC2995aW.q(c5027xc0, "this$0");
                AbstractC2995aW.q(message, "it");
                if (message.what == 888) {
                    c5027xc0.a().removeMessages(888);
                    long jCurrentTimeMillis = System.currentTimeMillis() - c5027xc0.v;
                    long j = c5027xc0.t - jCurrentTimeMillis;
                    if (j <= 0) {
                        c5027xc0.d(0L);
                        C3355eb c3355eb = c5027xc0.c;
                        if (c3355eb != null) {
                            c3355eb.p();
                        }
                        C3355eb c3355eb2 = c5027xc0.c;
                        if (c3355eb2 != null) {
                            c3355eb2.q();
                        }
                    } else {
                        C3355eb c3355eb3 = c5027xc0.c;
                        if (c3355eb3 != null) {
                            int i13 = (int) (jCurrentTimeMillis / ((long) 1000));
                            int i14 = c5027xc0.w;
                            if (i14 <= 0) {
                                if (i13 >= 1) {
                                    c5027xc0.w = 1;
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else if (i13 > i14) {
                                c5027xc0.w = i13;
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!c3355eb3.v) {
                                if (c3355eb3.t != null && j <= 5050) {
                                    if (c3355eb3.b.getSwitchSound() && (lifecycleOwner = c3355eb3.q) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                                        WD.D(lifecycleScope, AbstractC4437qp.b, 0, new C2900Ya(c3355eb3, null), 2);
                                    }
                                    c3355eb3.v = true;
                                } else if (j > 3000) {
                                    if (z) {
                                        C2498In c2498In = App.n;
                                        WD.D(C2498In.g(), null, 0, new C2926Za(c3355eb3, null), 3);
                                    }
                                } else if (!c3355eb3.w) {
                                    C2498In c2498In2 = App.n;
                                    WD.D(C2498In.g(), null, 0, new C3001ab(c3355eb3, null), 3);
                                }
                            }
                        }
                        c5027xc0.d(j);
                        c5027xc0.a().sendEmptyMessageDelayed(888, 10L);
                    }
                }
                return false;
        }
    }
}
