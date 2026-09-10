package environ;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import endosteum.cutely;

/* JADX INFO: compiled from: DrawableBytesTranscoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class dern implements marial<Drawable, byte[]> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final trawler.wireman f25871attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final marial<sevenfold.dern, byte[]> f25872dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final marial<Bitmap, byte[]> f25873saneness;

    public dern(trawler.wireman wiremanVar, marial<Bitmap, byte[]> marialVar, marial<sevenfold.dern, byte[]> marialVar2) {
        this.f25871attabal = wiremanVar;
        this.f25873saneness = marialVar;
        this.f25872dern = marialVar2;
    }

    @Override // environ.marial
    public cutely<byte[]> attabal(cutely<Drawable> cutelyVar, maggot.wireman wiremanVar) {
        Drawable drawable = cutelyVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f25873saneness.attabal(patty.competently.wireman(((BitmapDrawable) drawable).getBitmap(), this.f25871attabal), wiremanVar);
        }
        if (drawable instanceof sevenfold.dern) {
            return this.f25872dern.attabal(saneness(cutelyVar), wiremanVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static cutely<sevenfold.dern> saneness(cutely<Drawable> cutelyVar) {
        return cutelyVar;
    }
}
