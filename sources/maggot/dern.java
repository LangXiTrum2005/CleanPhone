package maggot;

import com.bumptech.glide.util.apical;
import java.security.MessageDigest;

/* JADX INFO: compiled from: Option.java */
/* JADX INFO: loaded from: classes2.dex */
public final class dern<T> {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final saneness<Object> f33223marial = new attabal();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final T f33224attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f33225dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final saneness<T> f33226saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public volatile byte[] f33227wireman;

    /* JADX INFO: compiled from: Option.java */
    public interface saneness<T> {
        void attabal(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public dern(String str, T t, saneness<T> sanenessVar) {
        this.f33225dern = apical.saneness(str);
        this.f33224attabal = t;
        this.f33226saneness = (saneness) apical.wireman(sanenessVar);
    }

    public static <T> dern<T> attabal(String str, T t, saneness<T> sanenessVar) {
        return new dern<>(str, t, sanenessVar);
    }

    public static <T> dern<T> beachfront(String str, T t) {
        return new dern<>(str, t, saneness());
    }

    public static <T> dern<T> marial(String str) {
        return new dern<>(str, null, saneness());
    }

    public static <T> saneness<T> saneness() {
        return (saneness<T>) f33223marial;
    }

    public void competently(T t, MessageDigest messageDigest) {
        this.f33226saneness.attabal(wireman(), t, messageDigest);
    }

    public T dern() {
        return this.f33224attabal;
    }

    public boolean equals(Object obj) {
        if (obj instanceof dern) {
            return this.f33225dern.equals(((dern) obj).f33225dern);
        }
        return false;
    }

    public int hashCode() {
        return this.f33225dern.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f33225dern + "'}";
    }

    public final byte[] wireman() {
        if (this.f33227wireman == null) {
            this.f33227wireman = this.f33225dern.getBytes(maggot.saneness.f33228attabal);
        }
        return this.f33227wireman;
    }

    /* JADX INFO: compiled from: Option.java */
    public class attabal implements saneness<Object> {
        @Override // maggot.dern.saneness
        public void attabal(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
