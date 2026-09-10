package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class H90 implements InterfaceC3966lZ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3159a;
    public final InterfaceC3966lZ b;
    public final C4391qK c;

    public H90(List list, C2901Yb c2901Yb, C4391qK c4391qK) {
        this.f3159a = list;
        this.b = c2901Yb;
        this.c = c4391qK;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3966lZ
    public final InterfaceC3616hZ a(Object obj, int i, int i2, YS ys) {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(byteArray), i, i2, ys);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3966lZ
    public final boolean b(Object obj, YS ys) {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) ys.c(AbstractC2767Sx.b)).booleanValue()) {
            if (AbstractC2871Wx.g0(this.c, inputStream, this.f3159a) == ImageHeaderParser$ImageType.GIF) {
                return true;
            }
        }
        return false;
    }
}
