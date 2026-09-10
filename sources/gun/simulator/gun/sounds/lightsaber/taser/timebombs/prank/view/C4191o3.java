package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4191o3 implements EB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f4774a;
    public final /* synthetic */ AbstractC4454r3 b;

    public C4191o3(AbstractC4454r3 abstractC4454r3, Runnable runnable) {
        this.b = abstractC4454r3;
        this.f4774a = runnable;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5085yB
    public final void a(A70 a70) {
        AbstractC4454r3 abstractC4454r3 = this.b;
        String str = abstractC4454r3.f4440a;
        byte[] bArr = {com.umeng.analytics.pro.cw.n, -71, -79, 91, 12, 62, -87, -24, 26, -77, -92, 80, 6, 48, -95, -32, 95};
        byte[] bArr2 = {127, -41, -16, 63, 74, 95, -64, -124};
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
        boolean zIsEmpty = abstractC4454r3.h.isEmpty();
        Runnable runnable = this.f4774a;
        if (zIsEmpty) {
            runnable.run();
        } else {
            abstractC4454r3.V((J9) abstractC4454r3.h.remove(0), runnable);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5085yB
    public final void b(InterfaceC3240dB interfaceC3240dB) {
        AbstractC4454r3 abstractC4454r3 = this.b;
        String str = abstractC4454r3.f4440a;
        byte[] bArr = {29, -116, 34, 124, 127, -50, 108, 52, 23, -122, 67};
        byte[] bArr2 = {114, -30, 99, 24, 51, -95, com.umeng.analytics.pro.cw.k, 80};
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
        boolean zIsEmpty = abstractC4454r3.h.isEmpty();
        Runnable runnable = this.f4774a;
        if (zIsEmpty) {
            runnable.run();
        } else {
            abstractC4454r3.V((J9) abstractC4454r3.h.remove(0), runnable);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EB
    public final GB c() {
        return null;
    }
}
