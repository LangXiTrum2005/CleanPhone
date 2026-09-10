package patty;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;

/* JADX INFO: compiled from: BitmapDrawableEncoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class saneness implements maggot.beachfront<BitmapDrawable> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final trawler.wireman f35137attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final maggot.beachfront<Bitmap> f35138saneness;

    public saneness(trawler.wireman wiremanVar, maggot.beachfront<Bitmap> beachfrontVar) {
        this.f35137attabal = wiremanVar;
        this.f35138saneness = beachfrontVar;
    }

    @Override // maggot.attabal
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public boolean attabal(endosteum.cutely<BitmapDrawable> cutelyVar, File file, maggot.wireman wiremanVar) {
        return this.f35138saneness.attabal((Bitmap) new competently(cutelyVar.get().getBitmap(), this.f35137attabal), file, wiremanVar);
    }

    @Override // maggot.beachfront
    public EncodeStrategy saneness(maggot.wireman wiremanVar) {
        return this.f35138saneness.saneness(wiremanVar);
    }
}
