package sevenfold;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.util.apical;
import java.security.MessageDigest;

/* JADX INFO: compiled from: GifDrawableTransformation.java */
/* JADX INFO: loaded from: classes2.dex */
public class beachfront implements maggot.competently<dern> {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final maggot.competently<Bitmap> f37545saneness;

    public beachfront(maggot.competently<Bitmap> competentlyVar) {
        this.f37545saneness = (maggot.competently) apical.wireman(competentlyVar);
    }

    @Override // maggot.saneness
    public void attabal(MessageDigest messageDigest) {
        this.f37545saneness.attabal(messageDigest);
    }

    @Override // maggot.saneness
    public boolean equals(Object obj) {
        if (obj instanceof beachfront) {
            return this.f37545saneness.equals(((beachfront) obj).f37545saneness);
        }
        return false;
    }

    @Override // maggot.saneness
    public int hashCode() {
        return this.f37545saneness.hashCode();
    }

    @Override // maggot.competently
    public endosteum.cutely<dern> saneness(Context context, endosteum.cutely<dern> cutelyVar, int i, int i2) {
        dern dernVar = cutelyVar.get();
        endosteum.cutely<Bitmap> competentlyVar = new patty.competently(dernVar.marial(), com.bumptech.glide.saneness.dern(context).beachfront());
        endosteum.cutely<Bitmap> cutelyVarSaneness = this.f37545saneness.saneness(context, competentlyVar, i, i2);
        if (!competentlyVar.equals(cutelyVarSaneness)) {
            competentlyVar.attabal();
        }
        dernVar.impassible(this.f37545saneness, cutelyVarSaneness.get());
        return cutelyVar;
    }
}
