package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.LoadAdError;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3468fn0 extends AdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC4379q9 f4385a;
    public final /* synthetic */ WeakReference b;
    public final /* synthetic */ InterfaceC5085yB c;
    public final /* synthetic */ AbstractC4170nn0 d;

    public C3468fn0(AbstractC4170nn0 abstractC4170nn0, AbstractC4379q9 abstractC4379q9, WeakReference weakReference, InterfaceC5085yB interfaceC5085yB) {
        this.d = abstractC4170nn0;
        this.f4385a = abstractC4379q9;
        this.b = weakReference;
        this.c = interfaceC5085yB;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        AbstractC4170nn0 abstractC4170nn0 = this.d;
        String str = abstractC4170nn0.f4440a;
        byte[] bArr = {-29, -60, 7, -22, 70, 93, 76, 58, -23, -50, 18, -31, 76, 83, 68, 50};
        byte[] bArr2 = {-116, -86, 70, -114, 0, 60, 37, 86};
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
        AbstractC4379q9 abstractC4379q9 = this.f4385a;
        abstractC4170nn0.z((C3491g4) abstractC4379q9.f3354a);
        ((C3491g4) abstractC4379q9.f3354a).M(2);
        if (!TextUtils.isEmpty(((C3491g4) abstractC4379q9.f3354a).w(1))) {
            WeakReference weakReference = this.b;
            if (weakReference.get() != null && ((AbstractC4291p9) abstractC4170nn0.r()).a(X0.j.k())) {
                Context context = (Context) weakReference.get();
                C3491g4 c3491g4 = (C3491g4) abstractC4379q9.f3354a;
                loadAdError.getCode();
                abstractC4170nn0.G(context, abstractC4379q9, c3491g4, null);
            }
        }
        C3491g4 c3491g5 = (C3491g4) abstractC4379q9.f3354a;
        if (loadAdError != null) {
            loadAdError.getCode();
        }
        c3491g5.I();
        InterfaceC5085yB interfaceC5085yB = this.c;
        if (interfaceC5085yB != null) {
            interfaceC5085yB.a(loadAdError != null ? new C3205co0(loadAdError.getCode(), null, null) : null);
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(Object obj) {
        InterfaceC3240dB interfaceC3240dB = (InterfaceC3240dB) obj;
        AbstractC4170nn0 abstractC4170nn0 = this.d;
        String str = abstractC4170nn0.f4440a;
        byte[] bArr = {-100, 87, 22, 60, 127, 47, -75, -5, -106, 93};
        byte[] bArr2 = {-13, 57, 87, 88, 51, 64, -44, -97};
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
        AbstractC4379q9 abstractC4379q9 = this.f4385a;
        abstractC4170nn0.l((C3491g4) abstractC4379q9.f3354a, interfaceC3240dB);
        ((C3491g4) abstractC4379q9.f3354a).M(1);
        if (((String) ((C3491g4) abstractC4379q9.f3354a).b).isEmpty()) {
            ((C3491g4) abstractC4379q9.f3354a).b = UUID.randomUUID().toString();
        }
        interfaceC3240dB.b();
        InterfaceC5085yB interfaceC5085yB = this.c;
        if (interfaceC5085yB != null) {
            interfaceC5085yB.b(interfaceC3240dB);
        }
    }
}
