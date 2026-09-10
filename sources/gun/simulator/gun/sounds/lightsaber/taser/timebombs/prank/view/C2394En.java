package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.En, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2394En implements ImageDecoder.OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3743iz f3038a = C3743iz.a();
    public final int b;
    public final int c;
    public final EnumC2366Dl d;
    public final AbstractC2578Lp e;
    public final boolean f;
    public final EnumC4929wV g;

    public C2394En(int i, int i2, YS ys) {
        this.b = i;
        this.c = i2;
        this.d = (EnumC2366Dl) ys.c(C2629Np.f);
        this.e = (AbstractC2578Lp) ys.c(AbstractC2578Lp.f);
        VS vs = C2629Np.i;
        this.f = ys.c(vs) != null && ((Boolean) ys.c(vs)).booleanValue();
        this.g = (EnumC4929wV) ys.c(C2629Np.g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f3038a.c(this.b, this.c, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == EnumC2366Dl.b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C2368Dn());
        Size size = imageInfo.getSize();
        int width = this.b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(fB * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        EnumC4929wV enumC4929wV = this.g;
        if (enumC4929wV != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((enumC4929wV == EnumC4929wV.f5182a && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
