package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.on0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4258on0 implements DZ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4807a;
    public Object b;

    public /* synthetic */ C4258on0(Object obj, int i) {
        this.f4807a = i;
        this.b = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DZ
    public final String p() {
        NativeAd nativeAd = ((Kn0) this.b).d;
        if (nativeAd == null || nativeAd.getResponseInfo() == null) {
            return null;
        }
        return ((Kn0) this.b).d.getResponseInfo().getMediationAdapterClassName();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DZ
    public final String toString() {
        switch (this.f4807a) {
            case 2:
                NativeAd nativeAd = ((Kn0) this.b).d;
                if (nativeAd != null && nativeAd.getResponseInfo() != null) {
                    return ((Kn0) this.b).d.getResponseInfo().toString();
                }
                byte[] bArr = {85, -66, -70, 89, -56, 43, -84, -117, 98, -95, -95, 88, -35, 43, -66, -117, 67, -72, -70, 95, -44, 108, -22, -117, 101, -72, -72, 67, -50, 37};
                byte[] bArr2 = {com.umeng.analytics.pro.cw.n, -52, -56, 54, -70, 11, -54, -28};
                int i = 0;
                int i2 = 0;
                while (i < 30) {
                    if (i2 >= 8) {
                        i2 = 0;
                    }
                    bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                    i++;
                    i2++;
                }
                return new String(bArr, StandardCharsets.UTF_8);
            default:
                return super.toString();
        }
    }

    public C4258on0(Context context) {
        this.f4807a = 0;
        this.b = new MediaView(context);
    }
}
