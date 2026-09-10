package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3644hn0 extends FullScreenContentCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4821vB f4471a;
    public final /* synthetic */ AbstractC4466r9 b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ AbstractC4170nn0 d;

    public C3644hn0(AbstractC4170nn0 abstractC4170nn0, InterfaceC4821vB interfaceC4821vB, AbstractC4466r9 abstractC4466r9, WeakReference weakReference) {
        this.d = abstractC4170nn0;
        this.f4471a = interfaceC4821vB;
        this.b = abstractC4466r9;
        this.c = weakReference;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        String str = this.d.f4440a;
        byte[] bArr = {-98, -121, -16, -127, -91, -96, 22, 46, -102, -116, -43};
        byte[] bArr2 = {-15, -23, -79, -27, -26, -52, 127, 77};
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
        InterfaceC4821vB interfaceC4821vB = this.f4471a;
        if (interfaceC4821vB != null) {
            interfaceC4821vB.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        AbstractC4170nn0 abstractC4170nn0 = this.d;
        String str = abstractC4170nn0.f4440a;
        byte[] bArr = {-127, -111, -11, 2, -47, 120, 88, -95, -117, -101};
        byte[] bArr2 = {-18, -1, -76, 102, -110, 20, 55, -46};
        int i = 0;
        int i2 = 0;
        while (i < 10) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        if (abstractC4170nn0.p() == 0 || abstractC4170nn0.p() == 1 || abstractC4170nn0.p() == 2) {
            AbstractC4170nn0.j = System.currentTimeMillis();
        }
        AbstractC4170nn0.i = false;
        ((AbstractC4291p9) abstractC4170nn0.r()).getClass();
        AbstractC4466r9 abstractC4466r9 = this.b;
        if (abstractC4466r9.d != 2) {
            abstractC4170nn0.O(abstractC4466r9);
        }
        if (abstractC4466r9.d == 1) {
            Context context = (Context) this.c.get();
            C3491g4 c3491g4 = (C3491g4) abstractC4466r9.f3354a;
            boolean z = abstractC4466r9.c;
            abstractC4170nn0.getClass();
            if (context != null && c3491g4 != null) {
                abstractC4170nn0.k(context, abstractC4170nn0.K(c3491g4, z), null);
            }
        }
        InterfaceC4821vB interfaceC4821vB = this.f4471a;
        if (interfaceC4821vB != null) {
            interfaceC4821vB.onAdClosed();
            interfaceC4821vB.h(true);
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        AbstractC4170nn0 abstractC4170nn0 = this.d;
        String str = abstractC4170nn0.f4440a;
        byte[] bArr = {25, -61, 77, 58, 64, -14, -30, 97, 19, -55, 88, 49, 85, -5, -28, 122};
        byte[] bArr2 = {118, -83, 12, 94, 6, -109, -117, com.umeng.analytics.pro.cw.k};
        int i = 0;
        int i2 = 0;
        while (i < 16) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        AbstractC4170nn0.i = false;
        AbstractC4466r9 abstractC4466r9 = this.b;
        abstractC4170nn0.O(abstractC4466r9);
        if (abstractC4466r9.d == 1) {
            Context context = (Context) this.c.get();
            C3491g4 c3491g4 = (C3491g4) abstractC4466r9.f3354a;
            boolean z = abstractC4466r9.c;
            abstractC4170nn0.getClass();
            if (context != null && c3491g4 != null) {
                abstractC4170nn0.k(context, abstractC4170nn0.K(c3491g4, z), null);
            }
        }
        InterfaceC4821vB interfaceC4821vB = this.f4471a;
        if (interfaceC4821vB != null) {
            interfaceC4821vB.d(adError != null ? new C3205co0(adError.getCode(), null, null) : null);
            interfaceC4821vB.h(false);
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        String str = this.d.f4440a;
        byte[] bArr = {-44, 44, 53, -51, -48, -96, 119, 75, -34, 49, 7, -64, -10, -93};
        byte[] bArr2 = {-69, 66, 116, -87, -103, -51, 7, 57};
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
        InterfaceC4821vB interfaceC4821vB = this.f4471a;
        if (interfaceC4821vB != null) {
            interfaceC4821vB.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        AbstractC4170nn0 abstractC4170nn0 = this.d;
        String str = abstractC4170nn0.f4440a;
        byte[] bArr = {19, 87, 32, 50, 110, -54, -35, 122, 25, 93};
        byte[] bArr2 = {124, 57, 97, 86, 61, -94, -78, com.umeng.analytics.pro.cw.k};
        int i = 0;
        int i2 = 0;
        while (i < 10) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        AbstractC4170nn0.i = true;
        ((AbstractC4291p9) abstractC4170nn0.r()).getClass();
        InterfaceC4821vB interfaceC4821vB = this.f4471a;
        if (interfaceC4821vB != null) {
            interfaceC4821vB.onAdShowed();
        }
        AbstractC4466r9 abstractC4466r9 = this.b;
        abstractC4170nn0.O(abstractC4466r9);
        if (abstractC4466r9.d == 2) {
            Context context = (Context) this.c.get();
            C3491g4 c3491g4 = (C3491g4) abstractC4466r9.f3354a;
            boolean z = abstractC4466r9.c;
            abstractC4170nn0.getClass();
            if (context == null || c3491g4 == null) {
                return;
            }
            abstractC4170nn0.k(context, abstractC4170nn0.K(c3491g4, z), null);
        }
    }
}
