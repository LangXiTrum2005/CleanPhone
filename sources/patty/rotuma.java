package patty;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: compiled from: ResourceBitmapDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class rotuma implements maggot.marial<Uri, Bitmap> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final dumb.formularize f35135attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final trawler.wireman f35136saneness;

    public rotuma(dumb.formularize formularizeVar, trawler.wireman wiremanVar) {
        this.f35135attabal = formularizeVar;
        this.f35136saneness = wiremanVar;
    }

    @Override // maggot.marial
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public endosteum.cutely<Bitmap> attabal(Uri uri, int i, int i2, maggot.wireman wiremanVar) {
        endosteum.cutely<Drawable> cutelyVarAttabal = this.f35135attabal.attabal(uri, i, i2, wiremanVar);
        if (cutelyVarAttabal == null) {
            return null;
        }
        return monoploid.attabal(this.f35136saneness, cutelyVarAttabal.get(), i, i2);
    }

    @Override // maggot.marial
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean saneness(Uri uri, maggot.wireman wiremanVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
