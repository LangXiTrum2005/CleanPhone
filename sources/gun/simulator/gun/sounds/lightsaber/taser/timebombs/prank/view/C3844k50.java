package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.k50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3844k50 implements EO, InterfaceC3120bq, OnPaidEventListener, InterfaceC2763St {
    public static C3844k50 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4584a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public C3844k50(int i) {
        this.f4584a = i;
        if (i != 2) {
            if (i == 3) {
                this.c = null;
                this.d = new ArrayList();
                this.e = null;
                this.b = "";
                return;
            }
            if (i == 5) {
                this(new Random());
                return;
            }
            if (i == 11) {
                this.b = "";
                this.c = "";
                this.d = "";
                this.e = "";
                return;
            }
            if (i == 7) {
                this.d = new ArrayDeque();
                this.e = null;
                LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
                this.b = linkedBlockingQueue;
                this.c = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
                return;
            }
            if (i == 8) {
                this.d = new ArrayDeque();
                this.e = null;
                LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
                this.b = linkedBlockingQueue2;
                this.c = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue2);
                return;
            }
            if (i != 9) {
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = new ArrayDeque();
                return;
            }
            this.d = new ArrayDeque();
            this.e = null;
            LinkedBlockingQueue linkedBlockingQueue3 = new LinkedBlockingQueue();
            this.b = linkedBlockingQueue3;
            this.c = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue3);
        }
    }

    public static synchronized C3844k50 i() {
        try {
            if (f == null) {
                f = new C3844k50(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public static void p(Map map, long j) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3120bq
    public final void D(int i, C5186zO c5186zO, int i2) {
        if (m(i, c5186zO)) {
            ((C3031aq) this.d).d(i2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3120bq
    public final void E(int i, C5186zO c5186zO, Exception exc) {
        if (m(i, c5186zO)) {
            ((C3031aq) this.d).e(exc);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3120bq
    public final void G(int i, C5186zO c5186zO) {
        if (m(i, c5186zO)) {
            ((C3031aq) this.d).c();
        }
    }

    public final void a() {
        switch (this.f4584a) {
            case 7:
                AbstractAsyncTaskC4521rn0 abstractAsyncTaskC4521rn0 = (AbstractAsyncTaskC4521rn0) ((ArrayDeque) this.d).poll();
                this.e = abstractAsyncTaskC4521rn0;
                if (abstractAsyncTaskC4521rn0 != null) {
                    abstractAsyncTaskC4521rn0.executeOnExecutor((ThreadPoolExecutor) this.c, new Object[0]);
                }
                break;
            case 8:
                AbstractAsyncTaskC4785un0 abstractAsyncTaskC4785un0 = (AbstractAsyncTaskC4785un0) ((ArrayDeque) this.d).poll();
                this.e = abstractAsyncTaskC4785un0;
                if (abstractAsyncTaskC4785un0 != null) {
                    abstractAsyncTaskC4785un0.executeOnExecutor((ThreadPoolExecutor) this.c, new Object[0]);
                }
                break;
            default:
                AbstractAsyncTaskC3906kn0 abstractAsyncTaskC3906kn0 = (AbstractAsyncTaskC3906kn0) ((ArrayDeque) this.d).poll();
                this.e = abstractAsyncTaskC3906kn0;
                if (abstractAsyncTaskC3906kn0 != null) {
                    abstractAsyncTaskC3906kn0.executeOnExecutor((ThreadPoolExecutor) this.c, new Object[0]);
                }
                break;
        }
    }

    public final ArrayList b(AC ac) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        p((Map) this.b, jElapsedRealtime);
        p((Map) this.c, jElapsedRealtime);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ac.size(); i++) {
            U9 u9 = (U9) ac.get(i);
            if (!((Map) this.b).containsKey(u9.b) && !((Map) this.c).containsKey(Integer.valueOf(u9.c))) {
                arrayList.add(u9);
            }
        }
        return arrayList;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EO
    public final void c(int i, C5186zO c5186zO, C3779jO c3779jO) {
        if (m(i, c5186zO)) {
            ((DO) this.c).n(o(c3779jO));
        }
    }

    public final void d(AbstractAsyncTaskC3906kn0 abstractAsyncTaskC3906kn0) {
        abstractAsyncTaskC3906kn0.f4616a = this;
        ((ArrayDeque) this.d).add(abstractAsyncTaskC3906kn0);
        if (((AbstractAsyncTaskC3906kn0) this.e) == null) {
            a();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3120bq
    public final void e(int i, C5186zO c5186zO) {
        if (m(i, c5186zO)) {
            ((C3031aq) this.d).a();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3120bq
    public final void f(int i, C5186zO c5186zO) {
        if (m(i, c5186zO)) {
            ((C3031aq) this.d).f();
        }
    }

    public final void g(AbstractAsyncTaskC4521rn0 abstractAsyncTaskC4521rn0) {
        abstractAsyncTaskC4521rn0.f4946a = this;
        ((ArrayDeque) this.d).add(abstractAsyncTaskC4521rn0);
        if (((AbstractAsyncTaskC4521rn0) this.e) == null) {
            a();
        }
    }

    public final void h(AbstractAsyncTaskC4785un0 abstractAsyncTaskC4785un0) {
        abstractAsyncTaskC4785un0.f5102a = this;
        ((ArrayDeque) this.d).add(abstractAsyncTaskC4785un0);
        if (((AbstractAsyncTaskC4785un0) this.e) == null) {
            a();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EO
    public final void j(int i, C5186zO c5186zO, FI fi, C3779jO c3779jO, IOException iOException, boolean z) {
        if (m(i, c5186zO)) {
            ((DO) this.c).k(fi, o(c3779jO), iOException, z);
        }
    }

    public final boolean k(Context context) {
        if (((Boolean) this.d) == null) {
            this.d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        ((Boolean) this.c).booleanValue();
        return ((Boolean) this.d).booleanValue();
    }

    public final boolean l(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        ((Boolean) this.c).booleanValue();
        return ((Boolean) this.c).booleanValue();
    }

    public final boolean m(int i, C5186zO c5186zO) {
        C5186zO c5186zOV;
        if (c5186zO != null) {
            c5186zOV = ((AbstractC4860vh) this.e).v(this.b, c5186zO);
            if (c5186zOV == null) {
                return false;
            }
        } else {
            c5186zOV = null;
        }
        int iX = ((AbstractC4860vh) this.e).x(this.b, i);
        DO r0 = (DO) this.c;
        if (r0.f2968a != iX || !Ug0.a(r0.b, c5186zOV)) {
            this.c = new DO(((AbstractC4860vh) this.e).c.c, iX, c5186zOV, 0L);
        }
        C3031aq c3031aq = (C3031aq) this.d;
        if (c3031aq.f4145a == iX && Ug0.a(c3031aq.b, c5186zOV)) {
            return true;
        }
        this.d = new C3031aq(((AbstractC4860vh) this.e).d.c, iX, c5186zOV);
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2763St
    public final void n() {
        File file = new File((File) this.c, (String) this.b);
        if (!AbstractC2995aW.X((File) this.d)) {
            C4981x20.u().j(new TY(this, 12));
            return;
        }
        Bitmap bitmapB = AbstractC3923l1.b(file, AbstractC3923l1.f4625a);
        if (bitmapB != null) {
            C4981x20.u().q(new RunnableC3252dN(15, this, bitmapB));
        }
    }

    public final C3779jO o(C3779jO c3779jO) {
        long jW = ((AbstractC4860vh) this.e).w(this.b, c3779jO.f);
        AbstractC4860vh abstractC4860vh = (AbstractC4860vh) this.e;
        Object obj = this.b;
        long j = c3779jO.g;
        long jW2 = abstractC4860vh.w(obj, j);
        if (jW == c3779jO.f && jW2 == j) {
            return c3779jO;
        }
        return new C3779jO(c3779jO.f4552a, c3779jO.b, c3779jO.c, c3779jO.d, c3779jO.e, jW, jW2);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0113  */
    @Override // com.google.android.gms.ads.OnPaidEventListener
    public final void onPaidEvent(AdValue adValue) {
        String str;
        AbstractC4103n3 abstractC4103n3 = (AbstractC4103n3) this.e;
        Context context = (Context) this.c;
        InterfaceC3240dB interfaceC3240dB = (InterfaceC3240dB) this.d;
        abstractC4103n3.getClass();
        X0 x0 = X0.j;
        if (x0.b.get() && ((Om0) x0.k()).r) {
            try {
                HashMap map = new HashMap();
                map.put(Qm0.D(new byte[]{-81, 12, 46, 114, 33}, new byte[]{-39, 109, 66, 7, 68, -91, 26, 42}), Double.valueOf(adValue.getValueMicros() / 1000000.0d));
                map.put(Qm0.D(new byte[]{71, 61, -119, 86, 40, -62, -28, 76}, new byte[]{36, 72, -5, 36, 77, -84, -121, 53}), adValue.getCurrencyCode());
                String strD = interfaceC3240dB.d();
                if (strD.length() > 5) {
                    strD = strD.substring(strD.length() - 5);
                }
                map.put(Qm0.D(new byte[]{20, 66, 74, 57, -36, 105, 41, -117}, new byte[]{117, 38, 31, 87, -75, 29, 96, -17}), strD);
                map.put(Qm0.D(new byte[]{-21, -62, 72, -17, 92, -37}, new byte[]{-115, -83, 58, -126, 61, -81, -69, -62}), Integer.valueOf(abstractC4103n3.p()));
                map.put(Qm0.D(new byte[]{-88, -127, 58, 1, -82, -30, 30, -84, -74, -89, 38, 18, -94}, new byte[]{-40, -13, 95, 98, -57, -111, 119, -61}), String.valueOf(adValue.getPrecisionType()));
                if (interfaceC3240dB.a() == null || interfaceC3240dB.a().p() == null || !interfaceC3240dB.a().p().contains(Qm0.D(new byte[]{119}, new byte[]{89, -51, -114, -11, -65, 44, -100, 74}))) {
                    str = null;
                } else {
                    String[] strArrSplit = interfaceC3240dB.a().p().split(Qm0.D(new byte[]{-75, -77}, new byte[]{-23, -99, -120, -23, 56, -117, 57, 64}));
                    if (strArrSplit.length != 0) {
                        str = strArrSplit[strArrSplit.length - 1];
                    } else {
                        str = null;
                    }
                }
                map.put(Qm0.D(new byte[]{-40, 120, 63, -81, -122, 75, -109, 31, -46}, new byte[]{-71, 28, 113, -54, -14, 60, -4, 109}), str);
                Qm0 qm0A = Qm0.A();
                String strD2 = Qm0.D(new byte[]{-42, 37, 31, -10, -16, 104, -92, -7, -28, 50, 41, -48, -13, 71, -124, -7, -31, 36, 46, -54, -8}, new byte[]{-105, 65, 64, -65, -99, 24, -42, -100});
                qm0A.getClass();
                Qm0.B(context, strD2, map);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        ((InterfaceC3240dB) this.d).c();
        C4981x20.u().t(new RunnableC5099yP(this, adValue, (String) this.b, (Context) this.c));
    }

    public final U9 q(AC ac) {
        ArrayList arrayListB = b(ac);
        if (arrayListB.size() < 2) {
            return (U9) FW.F(arrayListB, null);
        }
        Collections.sort(arrayListB, new P70(1));
        ArrayList arrayList = new ArrayList();
        int i = ((U9) arrayListB.get(0)).c;
        for (int i2 = 0; i2 < arrayListB.size(); i2++) {
            U9 u9 = (U9) arrayListB.get(i2);
            if (i != u9.c) {
                if (arrayList.size() != 1) {
                    break;
                }
                return (U9) arrayListB.get(0);
            }
            arrayList.add(new Pair(u9.b, Integer.valueOf(u9.d)));
        }
        U9 u10 = (U9) ((Map) this.d).get(arrayList);
        if (u10 == null) {
            List listSubList = arrayListB.subList(0, arrayList.size());
            int i3 = 0;
            for (int i4 = 0; i4 < listSubList.size(); i4++) {
                i3 += ((U9) listSubList.get(i4)).d;
            }
            int iNextInt = ((Random) this.e).nextInt(i3);
            int i5 = 0;
            for (int i6 = 0; i6 < listSubList.size(); i6++) {
                U9 u11 = (U9) listSubList.get(i6);
                i5 += u11.d;
                if (iNextInt < i5) {
                    u10 = u11;
                    ((Map) this.d).put(arrayList, u10);
                }
            }
            u10 = (U9) FW.H(listSubList);
            ((Map) this.d).put(arrayList, u10);
        }
        return u10;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EO
    public final void r(int i, C5186zO c5186zO, FI fi, C3779jO c3779jO) {
        if (m(i, c5186zO)) {
            ((DO) this.c).e(fi, o(c3779jO));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EO
    public final void s(int i, C5186zO c5186zO, C3779jO c3779jO) {
        if (m(i, c5186zO)) {
            ((DO) this.c).c(o(c3779jO));
        }
    }

    public final String toString() {
        switch (this.f4584a) {
            case 11:
                StringBuilder sb = new StringBuilder();
                sb.append(Qm0.D(new byte[]{-12, 42, -81, 43, -67, 3, 55, -87, -27, com.umeng.analytics.pro.cw.k, -91, 47, -70, 9, 58, -96, -59, 7, -122, 119, -18}, new byte[]{-92, 105, -31, 74, -55, 106, 65, -52}));
                sb.append((String) this.b);
                sb.append('\'');
                sb.append(Qm0.D(new byte[]{-43, -108, -34, 88, -58, -10, -38, 64, -105, -47, -117, 26}, new byte[]{-7, -76, -74, 61, -89, -110, -74, 41}));
                sb.append((String) this.c);
                sb.append('\'');
                sb.append(Qm0.D(new byte[]{-93, 125, -52, -45, -55, -14, 86, -12}, new byte[]{-113, 93, -82, -68, -83, -117, 107, -45}));
                sb.append((String) this.d);
                sb.append('\'');
                sb.append(Qm0.D(new byte[]{-38, 55, -51, 2, -57, -6, 24, -75, -73, 116, -38, 10, -60, -8, 113, -3}, new byte[]{-10, 23, -82, 99, -85, -106, 76, -38}));
                return DM.m(sb, (String) this.e, "'}");
            default:
                return super.toString();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EO
    public final void u(int i, C5186zO c5186zO, FI fi, C3779jO c3779jO) {
        if (m(i, c5186zO)) {
            ((DO) this.c).m(fi, o(c3779jO));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3120bq
    public final void x(int i, C5186zO c5186zO) {
        if (m(i, c5186zO)) {
            ((C3031aq) this.d).b();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EO
    public final void z(int i, C5186zO c5186zO, FI fi, C3779jO c3779jO) {
        if (m(i, c5186zO)) {
            ((DO) this.c).h(fi, o(c3779jO));
        }
    }

    public C3844k50(AbstractC4103n3 abstractC4103n3, Context context, InterfaceC3240dB interfaceC3240dB, String str) {
        this.f4584a = 10;
        this.e = abstractC4103n3;
        this.c = context;
        this.d = interfaceC3240dB;
        this.b = str;
    }

    public C3844k50(RunnableC3163cN runnableC3163cN, File file, String str, File file2) {
        this.f4584a = 12;
        this.e = runnableC3163cN;
        this.c = file;
        this.b = str;
        this.d = file2;
    }

    public C3844k50(F4 f4, F4 f5, F4 f6, Xb0 xb0) {
        this.f4584a = 1;
        this.b = f4;
        this.c = f5;
        this.d = f6;
        this.e = xb0;
    }

    public C3844k50(Random random) {
        this.f4584a = 5;
        this.d = new HashMap();
        this.e = random;
        this.b = new HashMap();
        this.c = new HashMap();
    }

    public C3844k50(AbstractC4860vh abstractC4860vh, Object obj) {
        this.f4584a = 4;
        this.e = abstractC4860vh;
        this.c = abstractC4860vh.a(null);
        this.d = new C3031aq(abstractC4860vh.d.c, 0, null);
        this.b = obj;
    }
}
