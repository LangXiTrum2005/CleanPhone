package patty;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: BitmapImageDecoderResourceDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class beachfront implements maggot.marial<ImageDecoder.Source, Bitmap> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final trawler.wireman f35106attabal = new trawler.marial();

    @Override // maggot.marial
    public /* bridge */ /* synthetic */ endosteum.cutely<Bitmap> attabal(ImageDecoder.Source source, int i, int i2, maggot.wireman wiremanVar) throws IOException {
        return dern(wireman.attabal(source), i, i2, wiremanVar);
    }

    public endosteum.cutely<Bitmap> dern(ImageDecoder.Source source, int i, int i2, maggot.wireman wiremanVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new speck.formularize(i, i2, wiremanVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new competently(bitmapDecodeBitmap, this.f35106attabal);
    }

    @Override // maggot.marial
    public /* bridge */ /* synthetic */ boolean saneness(ImageDecoder.Source source, maggot.wireman wiremanVar) throws IOException {
        return wireman(wireman.attabal(source), wiremanVar);
    }

    public boolean wireman(ImageDecoder.Source source, maggot.wireman wiremanVar) throws IOException {
        return true;
    }
}
