package patty;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: BitmapTransformation.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class impromptu implements maggot.competently<Bitmap> {
    public abstract Bitmap dern(trawler.wireman wiremanVar, Bitmap bitmap, int i, int i2);

    @Override // maggot.competently
    public final endosteum.cutely<Bitmap> saneness(Context context, endosteum.cutely<Bitmap> cutelyVar, int i, int i2) {
        if (!com.bumptech.glide.util.formularize.dovishness(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        trawler.wireman wiremanVarBeachfront = com.bumptech.glide.saneness.dern(context).beachfront();
        Bitmap bitmap = cutelyVar.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapDern = dern(wiremanVarBeachfront, bitmap, i, i2);
        return bitmap.equals(bitmapDern) ? cutelyVar : competently.wireman(bitmapDern, wiremanVarBeachfront);
    }
}
