package patty;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: RoundedCorners.java */
/* JADX INFO: loaded from: classes2.dex */
public final class preprohormone extends impromptu {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final byte[] f35133dern = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(maggot.saneness.f33228attabal);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f35134saneness;

    public preprohormone(int i) {
        com.bumptech.glide.util.apical.attabal(i > 0, "roundingRadius must be greater than 0.");
        this.f35134saneness = i;
    }

    @Override // maggot.saneness
    public void attabal(MessageDigest messageDigest) {
        messageDigest.update(f35133dern);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f35134saneness).array());
    }

    @Override // patty.impromptu
    public Bitmap dern(trawler.wireman wiremanVar, Bitmap bitmap, int i, int i2) {
        return cord.apical(wiremanVar, bitmap, this.f35134saneness);
    }

    @Override // maggot.saneness
    public boolean equals(Object obj) {
        return (obj instanceof preprohormone) && this.f35134saneness == ((preprohormone) obj).f35134saneness;
    }

    @Override // maggot.saneness
    public int hashCode() {
        return com.bumptech.glide.util.formularize.arytenoidectomy(-569625254, com.bumptech.glide.util.formularize.kowloon(this.f35134saneness));
    }
}
