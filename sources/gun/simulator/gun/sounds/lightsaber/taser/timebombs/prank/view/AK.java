package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class AK extends Thread {
    public final ArrayBlockingQueue c = new ArrayBlockingQueue(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f2812a = new LinkedBlockingQueue();
    public boolean b = true;
    public final LinkedBlockingQueue d = new LinkedBlockingQueue();

    public final void a() {
        while (true) {
            C5006xK c5006xK = (C5006xK) this.d.poll();
            if (c5006xK == null) {
                return;
            }
            c5006xK.b = c5006xK.f.NXR();
            c5006xK.c = new String[]{c5006xK.f.NXR()};
            int iLxb = c5006xK.f.Lxb();
            if (iLxb <= 0) {
                iLxb = c5006xK.f.lk();
            }
            c5006xK.d = iLxb;
            c5006xK.e = c5006xK.f.STP();
            if (!TextUtils.isEmpty(c5006xK.f.STP())) {
                c5006xK.b = c5006xK.f.STP();
            }
            c5006xK.f = null;
            this.f2812a.offer(c5006xK);
            notify();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (this.b) {
            synchronized (this) {
                try {
                    if (!this.d.isEmpty()) {
                        a();
                    }
                    while (!this.f2812a.isEmpty()) {
                        C5006xK c5006xK = (C5006xK) this.f2812a.poll();
                        if (c5006xK != null) {
                            int i = c5006xK.f5218a;
                            if (i == 0) {
                                String[] strArr = c5006xK.c;
                                if (strArr != null && strArr.length > 0) {
                                    ArrayList arrayList = new ArrayList();
                                    for (String str : c5006xK.c) {
                                        Handler handler = PK.f3546a;
                                        if (str != null && (str.startsWith("http://") || str.startsWith("https://"))) {
                                            arrayList.add(str);
                                        }
                                    }
                                    C4959wm0.c().b(false, !TextUtils.isEmpty(c5006xK.e), c5006xK.d, c5006xK.b, null, (String[]) arrayList.toArray(new String[arrayList.size()]));
                                }
                            } else if (i == 1) {
                                C4959wm0 c4959wm0C = C4959wm0.c();
                                String str2 = c5006xK.b;
                                c4959wm0C.getClass();
                                if (!TextUtils.isEmpty(str2)) {
                                    C4080mm0 c4080mm0 = new C4080mm0(c4959wm0C, str2);
                                    if (PK.a()) {
                                        com.bytedance.sdk.component.OY.lc.LD(c4080mm0);
                                        No0 no0 = AbstractC4648tE.f5026a;
                                    } else {
                                        c4080mm0.run();
                                        No0 no1 = AbstractC4648tE.f5026a;
                                    }
                                }
                            } else if (i == 2) {
                                C4959wm0 c4959wm0C2 = C4959wm0.c();
                                c4959wm0C2.getClass();
                                C5051xo0 c5051xo0 = new C5051xo0(c4959wm0C2);
                                if (PK.a()) {
                                    com.bytedance.sdk.component.OY.lc.LD(c5051xo0);
                                    No0 no2 = AbstractC4648tE.f5026a;
                                } else {
                                    c5051xo0.run();
                                    No0 no3 = AbstractC4648tE.f5026a;
                                }
                            } else if (i == 3) {
                                C4959wm0 c4959wm0C3 = C4959wm0.c();
                                c4959wm0C3.getClass();
                                C5051xo0 c5051xo1 = new C5051xo0(c4959wm0C3);
                                if (PK.a()) {
                                    com.bytedance.sdk.component.OY.lc.LD(c5051xo1);
                                    No0 no4 = AbstractC4648tE.f5026a;
                                } else {
                                    c5051xo1.run();
                                    No0 no5 = AbstractC4648tE.f5026a;
                                }
                                if (AbstractC4648tE.f5026a != null) {
                                    AbstractC4648tE.f5026a.u();
                                }
                            } else if (i == 4) {
                                C4959wm0 c4959wm0C4 = C4959wm0.c();
                                c4959wm0C4.getClass();
                                C5051xo0 c5051xo2 = new C5051xo0(c4959wm0C4);
                                if (PK.a()) {
                                    com.bytedance.sdk.component.OY.lc.LD(c5051xo2);
                                    No0 no6 = AbstractC4648tE.f5026a;
                                } else {
                                    c5051xo2.run();
                                    No0 no7 = AbstractC4648tE.f5026a;
                                }
                                this.b = false;
                            }
                            c5006xK.c = null;
                            c5006xK.b = null;
                            c5006xK.f5218a = -1;
                            c5006xK.f = null;
                            this.c.offer(c5006xK);
                        }
                    }
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
