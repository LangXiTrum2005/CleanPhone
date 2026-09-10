package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Log;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.TreeMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4391qK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3692iN f4877a = new C3692iN(8);
    public final F4 b = new F4(1);
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final int e;
    public int f;

    public C4391qK(int i) {
        this.e = i;
    }

    public final synchronized void a() {
        c(0);
    }

    public final void b(int i, Class cls) {
        NavigableMap navigableMapG = g(cls);
        Integer num = (Integer) navigableMapG.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapG.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapG.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void c(int i) {
        int i2;
        String str;
        while (this.f > i) {
            Object objM = this.f4877a.M();
            AbstractC2871Wx.U(objM);
            O5 o5E = e(objM.getClass());
            int i3 = this.f;
            C2641Ob c2641Ob = (C2641Ob) o5E;
            int iA = c2641Ob.a(objM);
            int i4 = c2641Ob.f3508a;
            switch (i4) {
                case 0:
                    i2 = 1;
                    break;
                default:
                    i2 = 4;
                    break;
            }
            this.f = i3 - (iA * i2);
            b(c2641Ob.a(objM), objM.getClass());
            switch (i4) {
                case 0:
                    str = "ByteArrayPool";
                    break;
                default:
                    str = "IntegerArrayPool";
                    break;
            }
            if (Log.isLoggable(str, 2)) {
                c2641Ob.a(objM);
            }
        }
    }

    public final synchronized Object d(int i, Class cls) {
        C4303pK c4303pK;
        int i2;
        try {
            Integer num = (Integer) g(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i2 = this.f) != 0 && this.e / i2 < 2 && num.intValue() > i * 8)) {
                F4 f4 = this.b;
                InterfaceC4226oV interfaceC4226oVI = (InterfaceC4226oV) ((Queue) f4.b).poll();
                if (interfaceC4226oVI == null) {
                    interfaceC4226oVI = f4.i();
                }
                c4303pK = (C4303pK) interfaceC4226oVI;
                c4303pK.b = i;
                c4303pK.c = cls;
            } else {
                F4 f5 = this.b;
                int iIntValue = num.intValue();
                InterfaceC4226oV interfaceC4226oVI2 = (InterfaceC4226oV) ((Queue) f5.b).poll();
                if (interfaceC4226oVI2 == null) {
                    interfaceC4226oVI2 = f5.i();
                }
                c4303pK = (C4303pK) interfaceC4226oVI2;
                c4303pK.b = iIntValue;
                c4303pK.c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f(c4303pK, cls);
    }

    public final O5 e(Class cls) {
        HashMap map = this.d;
        O5 c2641Ob = (O5) map.get(cls);
        if (c2641Ob == null) {
            if (cls.equals(int[].class)) {
                c2641Ob = new C2641Ob(1);
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
                }
                c2641Ob = new C2641Ob(0);
            }
            map.put(cls, c2641Ob);
        }
        return c2641Ob;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x002f. Please report as an issue. */
    public final Object f(C4303pK c4303pK, Class cls) {
        Object obj;
        int i;
        O5 o5E = e(cls);
        Object objY = this.f4877a.y(c4303pK);
        if (objY != null) {
            int i2 = this.f;
            C2641Ob c2641Ob = (C2641Ob) o5E;
            int iA = c2641Ob.a(objY);
            switch (c2641Ob.f3508a) {
                case 0:
                    i = 1;
                    break;
                default:
                    i = 4;
                    break;
            }
            this.f = i2 - (iA * i);
            b(c2641Ob.a(objY), cls);
        }
        if (objY != null) {
            return objY;
        }
        int i3 = ((C2641Ob) o5E).f3508a;
        switch (i3) {
        }
        int i4 = c4303pK.b;
        switch (i3) {
            case 0:
                obj = new byte[i4];
                break;
            default:
                obj = new int[i4];
                break;
        }
        return obj;
    }

    public final NavigableMap g(Class cls) {
        HashMap map = this.c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized void h(Object obj) {
        int i;
        Class<?> cls = obj.getClass();
        O5 o5E = e(cls);
        int iA = ((C2641Ob) o5E).a(obj);
        int iIntValue = 1;
        switch (((C2641Ob) o5E).f3508a) {
            case 0:
                i = 1;
                break;
            default:
                i = 4;
                break;
        }
        int i2 = i * iA;
        if (i2 <= this.e / 2) {
            F4 f4 = this.b;
            InterfaceC4226oV interfaceC4226oVI = (InterfaceC4226oV) ((Queue) f4.b).poll();
            if (interfaceC4226oVI == null) {
                interfaceC4226oVI = f4.i();
            }
            C4303pK c4303pK = (C4303pK) interfaceC4226oVI;
            c4303pK.b = iA;
            c4303pK.c = cls;
            this.f4877a.J(c4303pK, obj);
            NavigableMap navigableMapG = g(cls);
            Integer num = (Integer) navigableMapG.get(Integer.valueOf(c4303pK.b));
            Integer numValueOf = Integer.valueOf(c4303pK.b);
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapG.put(numValueOf, Integer.valueOf(iIntValue));
            this.f += i2;
            c(this.e);
        }
    }

    public final synchronized void i(int i) {
        try {
            if (i >= 40) {
                a();
            } else if (i >= 20 || i == 15) {
                c(this.e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
