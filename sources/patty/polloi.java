package patty;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: compiled from: DrawableTransformation.java */
/* JADX INFO: loaded from: classes2.dex */
public class polloi implements maggot.competently<Drawable> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final boolean f35131dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final maggot.competently<Bitmap> f35132saneness;

    public polloi(maggot.competently<Bitmap> competentlyVar, boolean z) {
        this.f35132saneness = competentlyVar;
        this.f35131dern = z;
    }

    @Override // maggot.saneness
    public void attabal(MessageDigest messageDigest) {
        this.f35132saneness.attabal(messageDigest);
    }

    @Override // maggot.saneness
    public boolean equals(Object obj) {
        if (obj instanceof polloi) {
            return this.f35132saneness.equals(((polloi) obj).f35132saneness);
        }
        return false;
    }

    @Override // maggot.saneness
    public int hashCode() {
        return this.f35132saneness.hashCode();
    }

    @Override // maggot.competently
    public endosteum.cutely<Drawable> saneness(Context context, endosteum.cutely<Drawable> cutelyVar, int i, int i2) {
        trawler.wireman wiremanVarBeachfront = com.bumptech.glide.saneness.dern(context).beachfront();
        Drawable drawable = cutelyVar.get();
        endosteum.cutely<Bitmap> cutelyVarAttabal = monoploid.attabal(wiremanVarBeachfront, drawable, i, i2);
        if (cutelyVarAttabal != null) {
            endosteum.cutely<Bitmap> cutelyVarSaneness = this.f35132saneness.saneness(context, cutelyVarAttabal, i, i2);
            if (!cutelyVarSaneness.equals(cutelyVarAttabal)) {
                return wireman(context, cutelyVarSaneness);
            }
            cutelyVarSaneness.attabal();
            return cutelyVar;
        }
        if (!this.f35131dern) {
            return cutelyVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    public final endosteum.cutely<Drawable> wireman(Context context, endosteum.cutely<Bitmap> cutelyVar) {
        return dovishness.wireman(context.getResources(), cutelyVar);
    }

    public maggot.competently<BitmapDrawable> dern() {
        return this;
    }
}
