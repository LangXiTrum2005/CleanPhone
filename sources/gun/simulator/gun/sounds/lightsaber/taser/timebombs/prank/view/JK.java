package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.text.TextUtils;
import com.badlogic.gdx.Net;
import com.badlogic.gdx.net.HttpRequestHeader;
import com.bytedance.sdk.component.LD.Lxb.IeN;
import com.bytedance.sdk.component.LD.Lxb.JVA;
import com.bytedance.sdk.component.LD.Lxb.NXR;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public abstract class JK implements Runnable {
    public static final AtomicLong l = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile BF f3261a;
    public final Vo0 b;
    public final AtomicInteger c = new AtomicInteger();
    public final AtomicLong d = new AtomicLong();
    public volatile List e;
    public volatile String f;
    public volatile String g;
    public volatile C4568sM h;
    public volatile Yo0 i;
    public final AtomicInteger j;
    public int k;

    public JK(BF bf, Vo0 vo0) {
        l.incrementAndGet();
        this.j = new AtomicInteger(0);
        this.k = -1;
        this.f3261a = bf;
        this.b = vo0;
    }

    public final void a() throws MK {
        if (b()) {
            throw new MK();
        }
    }

    public final boolean b() {
        return this.j.get() == 1;
    }

    public final C4568sM c(Xo0 xo0, int i, int i2, String str) {
        String strConcat;
        JVA jvaA = Ro0.a();
        C4472rE c4472rE = new C4472rE();
        HashMap map = new HashMap();
        c4472rE.f4923a = xo0.f3996a;
        Net.HttpMethods.HEAD.equalsIgnoreCase(str);
        List<IW> list = this.e;
        if (list != null && !list.isEmpty()) {
            for (IW iw : list) {
                if (!"Range".equalsIgnoreCase(iw.f3220a) && !"Connection".equalsIgnoreCase(iw.f3220a) && !"Proxy-Connection".equalsIgnoreCase(iw.f3220a) && !HttpRequestHeader.Host.equalsIgnoreCase(iw.f3220a)) {
                    map.put(iw.f3220a, iw.b);
                }
            }
        }
        Handler handler = PK.f3546a;
        if (i >= 0 && i2 > 0) {
            strConcat = i + "-" + i2;
        } else if (i > 0) {
            strConcat = AbstractC3950lJ.n(i, "-");
        } else {
            strConcat = (i >= 0 || i2 <= 0) ? null : "-".concat(String.valueOf(i2));
        }
        String strConcat2 = strConcat == null ? null : "bytes=".concat(strConcat);
        if (strConcat2 != null) {
            map.put("Range", strConcat2);
        }
        if (AbstractC4648tE.f) {
            map.put("Cache-Control", "no-cache");
        }
        C4959wm0 c4959wm0C = C4959wm0.c();
        C4963wo0 c4963wo0B = C4963wo0.b();
        boolean z = this.h == null;
        if (z) {
            c4959wm0C.getClass();
        } else {
            c4963wo0B.getClass();
        }
        if (z) {
            c4959wm0C.getClass();
        } else {
            c4963wo0B.getClass();
        }
        c4472rE.b = map;
        NXR.Lxb lxb = new NXR.Lxb();
        try {
            HashMap map2 = c4472rE.b;
            if (map2 != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    String str2 = (String) entry.getKey();
                    if (!TextUtils.isEmpty(str2)) {
                        String str3 = (String) entry.getValue();
                        if (str3 == null) {
                            str3 = "";
                        }
                        lxb.LD(str2, str3);
                    }
                }
            }
            IeN ieNLD = jvaA.Lxb(lxb.LD(c4472rE.f4923a).Lxb().Lxb("videoPreloadLowVersion").Lxb(6).LD()).LD();
            ieNLD.lk();
            return new C4568sM(ieNLD, c4472rE);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void d() {
        this.j.compareAndSet(0, 1);
    }

    public final void e(int i, int i2) {
        if (i <= 0 || i2 < 0) {
            return;
        }
        int i3 = AbstractC4648tE.g;
        int iG = g();
        int i4 = 2;
        if (i3 == 1 || (i3 == 2 && iG == 1)) {
            int i5 = (int) ((i2 / i) * 100.0f);
            if (i5 > 100) {
                i5 = 100;
            }
            synchronized (this) {
                try {
                    if (i5 <= this.k) {
                        return;
                    }
                    this.k = i5;
                    TY ty = new TY(this, i4);
                    if (PK.a()) {
                        ty.run();
                    } else {
                        PK.f3546a.post(ty);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean f() {
        return g() == 1;
    }

    public final int g() {
        if (this.h != null) {
            return ((JW) this.h.d).f3268a;
        }
        return 0;
    }
}
