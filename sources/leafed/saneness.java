package leafed;

import com.bumptech.glide.util.apical;
import java.security.MessageDigest;

/* JADX INFO: compiled from: ObjectKey.java */
/* JADX INFO: loaded from: classes2.dex */
public final class saneness implements maggot.saneness {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Object f32605saneness;

    public saneness(Object obj) {
        this.f32605saneness = apical.wireman(obj);
    }

    @Override // maggot.saneness
    public void attabal(MessageDigest messageDigest) {
        messageDigest.update(this.f32605saneness.toString().getBytes(maggot.saneness.f33228attabal));
    }

    @Override // maggot.saneness
    public boolean equals(Object obj) {
        if (obj instanceof saneness) {
            return this.f32605saneness.equals(((saneness) obj).f32605saneness);
        }
        return false;
    }

    @Override // maggot.saneness
    public int hashCode() {
        return this.f32605saneness.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f32605saneness + '}';
    }
}
