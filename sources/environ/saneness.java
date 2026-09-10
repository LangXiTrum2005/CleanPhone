package environ;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.util.apical;
import endosteum.cutely;
import patty.dovishness;

/* JADX INFO: compiled from: BitmapDrawableTranscoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class saneness implements marial<Bitmap, BitmapDrawable> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Resources f25874attabal;

    public saneness(Context context) {
        this(context.getResources());
    }

    @Override // environ.marial
    public cutely<BitmapDrawable> attabal(cutely<Bitmap> cutelyVar, maggot.wireman wiremanVar) {
        return dovishness.wireman(this.f25874attabal, cutelyVar);
    }

    public saneness(Resources resources) {
        this.f25874attabal = (Resources) apical.wireman(resources);
    }
}
