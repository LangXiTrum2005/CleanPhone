package com.bumptech.glide.load.resource;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultOnHeaderDecodedListener implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HardwareConfigState f12626a = HardwareConfigState.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12628c;
    public final DecodeFormat d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DownsampleStrategy f12629e;
    public final boolean f;
    public final PreferredColorSpace g;

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener$1, reason: invalid class name */
    class AnonymousClass1 implements ImageDecoder$OnPartialImageListener {
        public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public DefaultOnHeaderDecodedListener(int i2, int i3, Options options) {
        this.f12627b = i2;
        this.f12628c = i3;
        this.d = (DecodeFormat) options.c(Downsampler.f);
        this.f12629e = (DownsampleStrategy) options.c(DownsampleStrategy.f);
        Option option = Downsampler.f12656i;
        this.f = options.c(option) != null && ((Boolean) options.c(option)).booleanValue();
        this.g = (PreferredColorSpace) options.c(Downsampler.g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f12626a.b(this.f12627b, this.f12628c, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == DecodeFormat.f12351Y) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new AnonymousClass1());
        Size size = imageInfo.getSize();
        int width = this.f12627b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f12628c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f12629e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        PreferredColorSpace preferredColorSpace = this.g;
        if (preferredColorSpace != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((preferredColorSpace == PreferredColorSpace.X && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i2 >= 26) {
                ColorSpace.Named unused = ColorSpace.Named.SRGB;
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
