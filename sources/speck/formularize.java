package speck;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import patty.graveside;

/* JADX INFO: compiled from: DefaultOnHeaderDecodedListener.java */
/* JADX INFO: loaded from: classes2.dex */
public final class formularize implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final graveside f38025attabal = graveside.saneness();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final boolean f38026beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final PreferredColorSpace f38027competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f38028dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final DownsampleStrategy f38029marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f38030saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final DecodeFormat f38031wireman;

    /* JADX INFO: compiled from: DefaultOnHeaderDecodedListener.java */
    public class attabal implements ImageDecoder$OnPartialImageListener {
        public attabal() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public formularize(int i, int i2, maggot.wireman wiremanVar) {
        this.f38030saneness = i;
        this.f38028dern = i2;
        this.f38031wireman = (DecodeFormat) wiremanVar.dern(com.bumptech.glide.load.resource.bitmap.attabal.f17831beachfront);
        this.f38029marial = (DownsampleStrategy) wiremanVar.dern(DownsampleStrategy.f17807impromptu);
        maggot.dern<Boolean> dernVar = com.bumptech.glide.load.resource.bitmap.attabal.f17833cutely;
        this.f38026beachfront = wiremanVar.dern(dernVar) != null && ((Boolean) wiremanVar.dern(dernVar)).booleanValue();
        this.f38027competently = (PreferredColorSpace) wiremanVar.dern(com.bumptech.glide.load.resource.bitmap.attabal.f17832competently);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f38025attabal.beachfront(this.f38030saneness, this.f38028dern, this.f38026beachfront, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f38031wireman == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new attabal());
        Size size = imageInfo.getSize();
        int width = this.f38030saneness;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f38028dern;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fSaneness = this.f38029marial.saneness(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fSaneness);
        int iRound2 = Math.round(fSaneness * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        PreferredColorSpace preferredColorSpace = this.f38027competently;
        if (preferredColorSpace != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
