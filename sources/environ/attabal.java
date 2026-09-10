package environ;

import android.graphics.Bitmap;
import endosteum.cutely;
import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: BitmapBytesTranscoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class attabal implements marial<Bitmap, byte[]> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Bitmap.CompressFormat f25864attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f25865saneness;

    public attabal() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // environ.marial
    public cutely<byte[]> attabal(cutely<Bitmap> cutelyVar, maggot.wireman wiremanVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        cutelyVar.get().compress(this.f25864attabal, this.f25865saneness, byteArrayOutputStream);
        cutelyVar.attabal();
        return new labourwallah.saneness(byteArrayOutputStream.toByteArray());
    }

    public attabal(Bitmap.CompressFormat compressFormat, int i) {
        this.f25864attabal = compressFormat;
        this.f25865saneness = i;
    }
}
