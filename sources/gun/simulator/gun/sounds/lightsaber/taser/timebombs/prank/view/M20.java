package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes.dex */
public final class M20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4654tK f3387a = new C4654tK(1000);
    public final C2296At b = AbstractC2374Dt.a(10, new Wm0(this, 5));

    public final String a(InterfaceC4650tG interfaceC4650tG) {
        String str;
        L20 l20 = (L20) this.b.acquire();
        try {
            interfaceC4650tG.b(l20.f3335a);
            byte[] bArrDigest = l20.f3335a.digest();
            char[] cArr = Tg0.b;
            synchronized (cArr) {
                for (int i = 0; i < bArrDigest.length; i++) {
                    byte b = bArrDigest[i];
                    int i2 = i * 2;
                    char[] cArr2 = Tg0.f3783a;
                    cArr[i2] = cArr2[(b & 255) >>> 4];
                    cArr[i2 + 1] = cArr2[b & com.umeng.analytics.pro.cw.m];
                }
                str = new String(cArr);
            }
            this.b.release(l20);
            return str;
        } catch (Throwable th) {
            this.b.release(l20);
            throw th;
        }
    }

    public final String b(InterfaceC4650tG interfaceC4650tG) {
        String strA;
        synchronized (this.f3387a) {
            strA = (String) this.f3387a.a(interfaceC4650tG);
        }
        if (strA == null) {
            strA = a(interfaceC4650tG);
        }
        synchronized (this.f3387a) {
            this.f3387a.d(interfaceC4650tG, strA);
        }
        return strA;
    }
}
