package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Yb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2901Yb implements InterfaceC3966lZ {
    public static final C4710tz f = new C4710tz(16);
    public static final NN g = new NN(11, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4024a;
    public final List b;
    public final NN c;
    public final C4710tz d;
    public final C3692iN e;

    public C2901Yb(Context context, List list, InterfaceC2459Ha interfaceC2459Ha, C4391qK c4391qK) {
        C4710tz c4710tz = f;
        this.f4024a = context.getApplicationContext();
        this.b = list;
        this.d = c4710tz;
        this.e = new C3692iN(14, interfaceC2459Ha, c4391qK);
        this.c = g;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3966lZ
    public final InterfaceC3616hZ a(Object obj, int i, int i2, YS ys) {
        C2741Rx c2741Rx;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        NN nn = this.c;
        synchronized (nn) {
            try {
                C2741Rx c2741Rx2 = (C2741Rx) ((Queue) nn.b).poll();
                if (c2741Rx2 == null) {
                    c2741Rx2 = new C2741Rx();
                }
                c2741Rx = c2741Rx2;
                c2741Rx.b = null;
                Arrays.fill(c2741Rx.f3689a, (byte) 0);
                c2741Rx.c = new C2715Qx();
                c2741Rx.d = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                c2741Rx.b = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                c2741Rx.b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return c(byteBuffer, i, i2, c2741Rx, ys);
        } finally {
            this.c.v(c2741Rx);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3966lZ
    public final boolean b(Object obj, YS ys) {
        return !((Boolean) ys.c(AbstractC2767Sx.b)).booleanValue() && AbstractC2871Wx.h0(this.b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    public final OR c(ByteBuffer byteBuffer, int i, int i2, C2741Rx c2741Rx, YS ys) {
        int i3 = AbstractC4653tJ.f5029a;
        SystemClock.elapsedRealtimeNanos();
        try {
            C2715Qx c2715QxB = c2741Rx.b();
            if (c2715QxB.c > 0 && c2715QxB.b == 0) {
                Bitmap.Config config = ys.c(AbstractC2767Sx.f3743a) == EnumC2366Dl.b ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iMin = Math.min(c2715QxB.g / i2, c2715QxB.f / i);
                int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
                C4710tz c4710tz = this.d;
                C3692iN c3692iN = this.e;
                c4710tz.getClass();
                C3940l90 c3940l90 = new C3940l90(c3692iN, c2715QxB, byteBuffer, iMax);
                c3940l90.c(config);
                c3940l90.k = (c3940l90.k + 1) % c3940l90.l.c;
                Bitmap bitmapB = c3940l90.b();
                if (bitmapB == null) {
                    return null;
                }
                return new OR(new GifDrawable(new C2534Jx(new C2689Px(com.bumptech.glide.a.a(this.f4024a), c3940l90, i, i2, Cf0.b, bitmapB))), 1);
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
