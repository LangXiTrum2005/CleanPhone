package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class P4 implements InterfaceC3966lZ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3535a;
    public final C3692iN b;

    public /* synthetic */ P4(C3692iN c3692iN, int i) {
        this.f3535a = i;
        this.b = c3692iN;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3966lZ
    public final InterfaceC3616hZ a(Object obj, int i, int i2, YS ys) {
        int i3 = this.f3535a;
        C3692iN c3692iN = this.b;
        switch (i3) {
            case 0:
                ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource((ByteBuffer) obj);
                c3692iN.getClass();
                return C3692iN.p(sourceCreateSource, i, i2, ys);
            default:
                ImageDecoder.Source sourceCreateSource2 = ImageDecoder.createSource(AbstractC3092bc.b((InputStream) obj));
                c3692iN.getClass();
                return C3692iN.p(sourceCreateSource2, i, i2, ys);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3966lZ
    public final boolean b(Object obj, YS ys) throws IOException {
        int i = this.f3535a;
        C3692iN c3692iN = this.b;
        switch (i) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeH0 = AbstractC2871Wx.h0((List) c3692iN.b, (ByteBuffer) obj);
                if (imageHeaderParser$ImageTypeH0 != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    return Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeH0 == ImageHeaderParser$ImageType.ANIMATED_AVIF;
                }
                return true;
            default:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeG0 = AbstractC2871Wx.g0((C4391qK) c3692iN.c, (InputStream) obj, (List) c3692iN.b);
                if (imageHeaderParser$ImageTypeG0 != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    return Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeG0 == ImageHeaderParser$ImageType.ANIMATED_AVIF;
                }
                return true;
        }
    }
}
