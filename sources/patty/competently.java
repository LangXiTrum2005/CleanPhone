package patty;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: BitmapResource.java */
/* JADX INFO: loaded from: classes2.dex */
public class competently implements endosteum.cutely<Bitmap>, endosteum.competently {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final trawler.wireman f35107arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Bitmap f35108kowloon;

    public competently(Bitmap bitmap, trawler.wireman wiremanVar) {
        this.f35108kowloon = (Bitmap) com.bumptech.glide.util.apical.marial(bitmap, "Bitmap must not be null");
        this.f35107arytenoidectomy = (trawler.wireman) com.bumptech.glide.util.apical.marial(wiremanVar, "BitmapPool must not be null");
    }

    public static competently wireman(Bitmap bitmap, trawler.wireman wiremanVar) {
        if (bitmap == null) {
            return null;
        }
        return new competently(bitmap, wiremanVar);
    }

    @Override // endosteum.cutely
    public void attabal() {
        this.f35107arytenoidectomy.dern(this.f35108kowloon);
    }

    @Override // endosteum.cutely
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f35108kowloon;
    }

    @Override // endosteum.cutely
    public int getSize() {
        return com.bumptech.glide.util.formularize.taiyuan(this.f35108kowloon);
    }

    @Override // endosteum.competently
    public void initialize() {
        this.f35108kowloon.prepareToDraw();
    }

    @Override // endosteum.cutely
    public Class<Bitmap> saneness() {
        return Bitmap.class;
    }
}
