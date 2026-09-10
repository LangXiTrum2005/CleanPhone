package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.graphics.Rect;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.gms.ads.AdListener;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4454r3 extends AbstractC4103n3 implements FB {
    public final HashMap g = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public WeakReference j = null;
    public final ArrayMap k = new ArrayMap();
    public final ArrayMap l = new ArrayMap();
    public final HashMap m = new HashMap();
    public final HashMap n = new HashMap();
    public final ArrayMap o = new ArrayMap();
    public final ArrayMap p = new ArrayMap();
    public final ArrayMap q = new ArrayMap();
    public final ArrayMap r = new ArrayMap();
    public boolean s = false;

    public static DrawerLayout K(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof DrawerLayout) {
            return (DrawerLayout) view;
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                DrawerLayout drawerLayoutK = K(viewGroup.getChildAt(i));
                if (drawerLayoutK != null) {
                    return drawerLayoutK;
                }
                i++;
            }
        }
        return null;
    }

    public static String N(I9 i9) {
        if (i9.c() == null) {
            return "";
        }
        Object tag = i9.c().getTag();
        if (tag == null || tag.equals("")) {
            i9.c().setTag(UUID.randomUUID().toString());
        }
        return i9.c().getTag().toString();
    }

    public static boolean c0(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.indexOfChild(view2) >= 0) {
                return true;
            }
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (c0(viewGroup.getChildAt(i), view2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d0(View view, String str) {
        if (view.getClass().getName().equals(str)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (d0(viewGroup.getChildAt(i), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void j0(ViewGroup viewGroup) {
        C4355pv c4355pv;
        if (viewGroup == null || viewGroup.getTag() == null) {
            return;
        }
        String string = viewGroup.getTag().toString();
        Activity activityB = AbstractC2340Cl.B();
        if (string == null || string.isEmpty() || (c4355pv = AbstractC2340Cl.g) == null) {
            return;
        }
        try {
            c4355pv.b(activityB, string);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final synchronized void A0(String str) {
        this.o.remove(str);
    }

    public final synchronized void B0(C3491g4 c3491g4) {
        this.n.remove(c3491g4);
    }

    public final synchronized void C0(String str) {
        this.r.remove(str);
    }

    public final synchronized void D0(C3491g4 c3491g4) {
        if (this.g.get(c3491g4) != null) {
            byte[] bArr = {-9, -61, com.umeng.analytics.pro.cw.m, -119, 27, 56, -44, -106, -29, -44, 7, -107, 5, 28, -30, -89, -28, -43, 9};
            byte[] bArr2 = {-123, -90, 98, -26, 109, 93, -122, -13};
            int length = bArr.length;
            int length2 = bArr2.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                if (i2 >= length2) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            C4981x20.u().w((Runnable) this.g.get(c3491g4));
            this.g.remove(c3491g4);
        }
    }

    public final synchronized int J(C3491g4 c3491g4, String str) {
        if (((H9) r()).f5021a) {
            if (this.k.get(c3491g4) == null) {
                return -1;
            }
            return ((Integer) this.k.get(c3491g4)).intValue();
        }
        if (this.l.get(str) == null) {
            return -1;
        }
        return ((Integer) this.l.get(str)).intValue();
    }

    public final synchronized I9 L(String str) {
        return (I9) this.m.get(str);
    }

    public final synchronized String M(C3491g4 c3491g4) {
        return (String) this.q.get(c3491g4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        if (c0(r11, r20) == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(android.app.Activity r19, android.view.View r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4454r3.O(android.app.Activity, android.view.View, java.lang.String):void");
    }

    public final void P(ViewGroup viewGroup) {
        C4355pv c4355pv;
        X0.j.h();
        if (((H9) r()).d == 0 || viewGroup == null || viewGroup.getTag() == null) {
            return;
        }
        String string = viewGroup.getTag().toString();
        if (string.isEmpty()) {
            return;
        }
        j0(viewGroup);
        ViewTreeObserverOnDrawListenerC4367q3 viewTreeObserverOnDrawListenerC4367q3 = new ViewTreeObserverOnDrawListenerC4367q3(this, string, viewGroup);
        Activity activityB = AbstractC2340Cl.B();
        if (string.isEmpty() || (c4355pv = AbstractC2340Cl.g) == null) {
            return;
        }
        try {
            c4355pv.a(activityB, string, viewTreeObserverOnDrawListenerC4367q3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void Q(ViewGroup viewGroup, String str) {
        I9 i9L;
        if (((H9) r()).d == 0 || AbstractC2340Cl.B() == null || viewGroup == null || (i9L = L(str)) == null) {
            return;
        }
        if (i9L.b() == null) {
            i9L.g = new WeakReference(viewGroup);
        }
        if (m0(str) != 1) {
            return;
        }
        if (this.i.contains(str) || i9L.b().isShown()) {
            C4981x20.u().q(new RunnableC3163cN(this, i9L, str, 5));
        }
    }

    public final synchronized void R(C3491g4 c3491g4, AdListener adListener) {
        HashMap map = this.n;
        if (map != null) {
            map.put(c3491g4, adListener);
        }
    }

    public final synchronized void S(C3491g4 c3491g4, String str, int i) {
        try {
            if (((H9) r()).f5021a) {
                this.k.put(c3491g4, Integer.valueOf(i));
            } else {
                this.l.put(str, Integer.valueOf(i));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void T(C3491g4 c3491g4, String str, InterfaceC3240dB interfaceC3240dB) {
        try {
            if (((H9) r()).f5021a) {
                l(c3491g4, interfaceC3240dB);
            } else {
                this.p.put(str, interfaceC3240dB);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void U(J9 j9, C4191o3 c4191o3);

    public final void V(J9 j9, Runnable runnable) {
        U(j9, new C4191o3(this, runnable));
    }

    public final synchronized void W(EB eb) {
        this.j = new WeakReference(eb);
    }

    public final void X(B80 b80) throws Throwable {
        byte[] bArr = {-104, com.umeng.analytics.pro.cw.k, 83, 110, -39, 83, -103, 80, -124, 19, 119, 102, -59, 8, -35};
        byte[] bArr2 = {-24, 127, 54, 2, -74, 50, -3, 17};
        int i = 0;
        int i2 = 0;
        while (i < 15) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        ArrayList arrayList = this.h;
        arrayList.clear();
        if (((H9) r()).c.isEmpty()) {
            b80.run();
        } else {
            arrayList.addAll(((H9) r()).c);
            V((J9) arrayList.remove(0), b80);
        }
    }

    public final synchronized void Y(String str, int i) {
        this.r.put(str, Integer.valueOf(i));
    }

    public final synchronized void Z(String str, I9 i9) {
        this.m.put(str, i9);
    }

    public final synchronized void a0(String str, EB eb) {
        ArrayMap arrayMap = this.o;
        if (arrayMap != null) {
            arrayMap.put(str, eb);
        }
    }

    public final void b0(HashMap map, View view, String str) {
        if (view == null || str == null || str.isEmpty()) {
            byte[] bArr = {-111, 90, -57, -31, 63, 8, -116, -9, -82, 91, -58, -22, 58, 9, -122, -9, -65, 95, -52, -27, 29, 55, -128, -27, -114, 9, -125, -19, 7, 23, -120, -20, -112, 87, -125, -12, 8, 19, -120, -19, -100, 71, -58, -10, 26};
            byte[] bArr2 = {-7, 51, -93, -124, 105, 97, -23, -128};
            int i = 0;
            int i2 = 0;
            while (i < 45) {
                if (i2 >= 8) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            return;
        }
        boolean zIsEmpty = map.isEmpty();
        ArrayList arrayList = this.i;
        if (!zIsEmpty) {
            for (Map.Entry entry : map.entrySet()) {
                if (((WindowManager.LayoutParams) entry.getKey()).type == 1000) {
                    View view2 = (View) entry.getValue();
                    Rect rect = new Rect();
                    view2.getGlobalVisibleRect(rect);
                    Rect rect2 = new Rect();
                    view.getGlobalVisibleRect(rect2);
                    if (Rect.intersects(rect, rect2)) {
                        break;
                    }
                } else if (c0((View) entry.getValue(), view)) {
                    arrayList.remove(str);
                    view.setVisibility(0);
                    return;
                }
            }
        }
        if (!arrayList.contains(str)) {
            arrayList.add(str);
        }
        view.setVisibility(8);
    }

    public final void e0() {
        if (((H9) r()).d == 0 || AbstractC2340Cl.B() == null || !(!AbstractC2340Cl.w(AbstractC2340Cl.B()).isEmpty())) {
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList<View> arrayListW = AbstractC2340Cl.w(AbstractC2340Cl.B());
                if (!arrayListW.isEmpty()) {
                    for (View view : arrayListW) {
                        if (view.getClass().getSimpleName().contains(Qm0.D(new byte[]{-27, -90, -47, 56, 59, 95, 54, 65, -38, -69, -9, 36, 46, 108}, new byte[]{-75, -55, -95, 77, 75, 27, 83, 34})) && d0(view, Qm0.D(new byte[]{-116, 56, -4, 63, -89, -54, 106, -35, -125, 50, -65, 112, -82, -63, 119, -43, -122, 51, -65, 118, -83, -42, 43, -37, -117, 36, -65, 120, -82, -47, 96, -56, -127, 54, -3, 63, -73, -64, 103, -52, -122, 50, -26, 63, -95, -57}, new byte[]{-17, 87, -111, 17, -64, -91, 5, -70})) && view.getVisibility() == 0) {
                            view.setVisibility(8);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized AdListener f0(C3491g4 c3491g4) {
        return (AdListener) this.n.get(c3491g4);
    }

    public final InterfaceC3240dB g0(C3491g4 c3491g4, String str) {
        if (c3491g4 == null) {
            return null;
        }
        if (!((H9) r()).f5021a) {
            return (InterfaceC3240dB) this.p.get(str);
        }
        if (q(c3491g4) != null) {
            return q(c3491g4);
        }
        for (Map.Entry entry : this.c.entrySet()) {
            if (c3491g4 == entry.getKey() && entry.getValue() != null) {
                l(c3491g4, (InterfaceC3240dB) entry.getValue());
                return (InterfaceC3240dB) entry.getValue();
            }
        }
        return null;
    }

    public final synchronized EB h0() {
        WeakReference weakReference;
        weakReference = this.j;
        return weakReference == null ? null : (EB) weakReference.get();
    }

    public final synchronized EB i0(String str) {
        return (EB) this.o.get(str);
    }

    public final void k0(I9 i9, String str, S s) {
        if (s == null) {
            return;
        }
        X0.j.h();
        C3044b1.b.k().getClass();
        long jN0 = n0();
        long jCurrentTimeMillis = s.b;
        if (s.c && s.f3691a > 0) {
            jCurrentTimeMillis += System.currentTimeMillis() - s.f3691a;
        }
        if (jCurrentTimeMillis < jN0) {
            long j = jN0 - jCurrentTimeMillis;
            D0((C3491g4) i9.f3354a);
            RunnableC4279p3 runnableC4279p3 = new RunnableC4279p3(this, i9, str, s);
            C4981x20.u().v(j, runnableC4279p3);
            this.g.put((C3491g4) i9.f3354a, runnableC4279p3);
            return;
        }
        byte[] bArr = {72, -101, 107, -89, 31, 34, 82, -78, 104, -112, 108, -75, 63, 34, 76, -74, 79, -111, 108, -84, 56, 63, 91, -76, 80, -62, 35, -95, com.umeng.analytics.pro.cw.l, 37, 76, -78, 85, -116, 80, -86, 20, 32, 122, -94, 73, -103, 119, -85, 20, 57, 30, -23, 6, -40, 110, -93, 3, 4, 86, -72, 76, -68, 118, -80, 26, 35, 87, -72, 85, -75, 112, -18, 91, 35, 76, -66, 92, -97, 102, -80, 18, 57, 89, -9, 82, -107, 110, -89, 31, 62, 95, -93, 94, -40, 113, -89, 29, 37, 91, -92, 83};
        byte[] bArr2 = {59, -8, 3, -62, 123, 87, 62, -41};
        int i = 0;
        int i2 = 0;
        while (i < 97) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        o0(i9, str, s);
    }

    public final boolean l0(I9 i9) {
        if (i9 == null || ((C3491g4) i9.f3354a) == null) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - ((C3491g4) i9.f3354a).y();
        ((H9) r()).getClass();
        return jCurrentTimeMillis >= 3000000;
    }

    public final synchronized int m0(String str) {
        return this.r.get(str) == null ? 0 : ((Integer) this.r.get(str)).intValue();
    }

    public final long n0() {
        InterfaceC3416fB interfaceC3416fBK = X0.j.k();
        if (interfaceC3416fBK != null) {
            String str = ((Om0) interfaceC3416fBK).t;
            if (AbstractC3375el.I(str)) {
                ((H9) r()).e = C2375Du.a().b(str);
            }
        }
        return ((H9) r()).e;
    }

    public final void o0(I9 i9, String str, S s) {
        byte[] bArr = {105, 87, 61, -73, -15, 48, 127, -120, 78, 87, 48, -79, -15, 38, 127, -53, 30, 69, 115, -86, -4, 45, 40, -38, 79, 67, 33, -72, -32, 43, 48, -108, 7, 22, 39, -85, -3, 37, 56, -97, 89, 95, 61, -66, -76, 48, 58, -100, 89, 83, 32, -79};
        byte[] bArr2 = {43, 54, 83, -39, -108, 66, 95, -6};
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        if (s != null) {
            s.b = 0L;
            s.f3691a = 0L;
            s.c = false;
        }
        i9.d = true;
        i9.e = true;
        EB ebI0 = i0(str);
        ViewGroup viewGroupC = i9.c();
        if (viewGroupC == null || viewGroupC.getContext() == null) {
            return;
        }
        k(viewGroupC.getContext(), i9, ebI0);
    }

    public final void p0() {
        HashMap mapV = AbstractC2340Cl.v(AbstractC2340Cl.B());
        if (mapV.isEmpty()) {
            return;
        }
        Iterator it = mapV.entrySet().iterator();
        while (it.hasNext()) {
            if (((WindowManager.LayoutParams) ((Map.Entry) it.next()).getKey()).type != 1000) {
                e0();
            }
        }
    }

    public final synchronized void q0(C3491g4 c3491g4, String str) {
        try {
            if (((H9) r()).f5021a) {
                this.k.remove(c3491g4);
            } else {
                this.l.remove(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean r0(C3491g4 c3491g4) {
        Iterator it = this.m.entrySet().iterator();
        while (it.hasNext()) {
            if (((C3491g4) ((I9) ((Map.Entry) it.next()).getValue()).f3354a) == c3491g4) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean s0(String str) {
        return m0(str) == 2 || m0(str) == 3;
    }

    public final synchronized I9 t0(String str) {
        return (I9) this.m.remove(str);
    }

    public final void u0() {
        DrawerLayout drawerLayoutK = K(AbstractC2340Cl.B().getWindow().getDecorView());
        if (drawerLayoutK != null) {
            if (drawerLayoutK.isDrawerOpen(GravityCompat.START) || drawerLayoutK.isDrawerOpen(GravityCompat.END)) {
                e0();
            }
        }
    }

    public final synchronized void v0(C3491g4 c3491g4, String str) {
        if (((H9) r()).f5021a) {
            z(c3491g4);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3570h
    public final void w(C3491g4 c3491g4) {
        synchronized (this) {
            this.q.remove(c3491g4);
        }
    }

    public final boolean w0(C3491g4 c3491g4) {
        long jCurrentTimeMillis = System.currentTimeMillis() - c3491g4.y();
        ((H9) r()).getClass();
        return jCurrentTimeMillis >= 3000000;
    }

    public final void x0() {
        if (AbstractC2340Cl.B() == null || AbstractC2340Cl.B().getWindow() == null) {
            return;
        }
        View decorView = AbstractC2340Cl.B().getWindow().getDecorView();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        if (decorView.getHeight() - (rect.bottom - rect.top) > 200) {
            e0();
        }
    }

    public final synchronized void y0(C3491g4 c3491g4) {
        this.q.remove(c3491g4);
    }

    public final synchronized void z0(C3491g4 c3491g4, String str) {
        this.q.put(c3491g4, str);
    }
}
