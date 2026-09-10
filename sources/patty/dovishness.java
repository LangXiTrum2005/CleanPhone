package patty;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: LazyBitmapDrawableResource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class dovishness implements endosteum.cutely<BitmapDrawable>, endosteum.competently {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final endosteum.cutely<Bitmap> f35119arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Resources f35120kowloon;

    public dovishness(Resources resources, endosteum.cutely<Bitmap> cutelyVar) {
        this.f35120kowloon = (Resources) com.bumptech.glide.util.apical.wireman(resources);
        this.f35119arytenoidectomy = (endosteum.cutely) com.bumptech.glide.util.apical.wireman(cutelyVar);
    }

    public static endosteum.cutely<BitmapDrawable> wireman(Resources resources, endosteum.cutely<Bitmap> cutelyVar) {
        if (cutelyVar == null) {
            return null;
        }
        return new dovishness(resources, cutelyVar);
    }

    @Override // endosteum.cutely
    public void attabal() {
        this.f35119arytenoidectomy.attabal();
    }

    @Override // endosteum.cutely
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f35120kowloon, this.f35119arytenoidectomy.get());
    }

    @Override // endosteum.cutely
    public int getSize() {
        return this.f35119arytenoidectomy.getSize();
    }

    @Override // endosteum.competently
    public void initialize() {
        endosteum.cutely<Bitmap> cutelyVar = this.f35119arytenoidectomy;
        if (cutelyVar instanceof endosteum.competently) {
            ((endosteum.competently) cutelyVar).initialize();
        }
    }

    @Override // endosteum.cutely
    public Class<BitmapDrawable> saneness() {
        return BitmapDrawable.class;
    }
}
