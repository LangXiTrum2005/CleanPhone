package maggot;

import java.security.MessageDigest;

/* JADX INFO: compiled from: Options.java */
/* JADX INFO: loaded from: classes2.dex */
public final class wireman implements saneness {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final androidx.collection.attabal<dern<?>, Object> f33229saneness = new com.bumptech.glide.util.saneness();

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void beachfront(dern<T> dernVar, Object obj, MessageDigest messageDigest) {
        dernVar.competently(obj, messageDigest);
    }

    @Override // maggot.saneness
    public void attabal(MessageDigest messageDigest) {
        for (int i = 0; i < this.f33229saneness.getSize(); i++) {
            beachfront(this.f33229saneness.competently(i), this.f33229saneness.formularize(i), messageDigest);
        }
    }

    public <T> T dern(dern<T> dernVar) {
        return this.f33229saneness.containsKey(dernVar) ? (T) this.f33229saneness.get(dernVar) : dernVar.dern();
    }

    @Override // maggot.saneness
    public boolean equals(Object obj) {
        if (obj instanceof wireman) {
            return this.f33229saneness.equals(((wireman) obj).f33229saneness);
        }
        return false;
    }

    @Override // maggot.saneness
    public int hashCode() {
        return this.f33229saneness.hashCode();
    }

    public <T> wireman marial(dern<T> dernVar, T t) {
        this.f33229saneness.put(dernVar, t);
        return this;
    }

    public String toString() {
        return "Options{values=" + this.f33229saneness + '}';
    }

    public void wireman(wireman wiremanVar) {
        this.f33229saneness.impromptu(wiremanVar.f33229saneness);
    }
}
