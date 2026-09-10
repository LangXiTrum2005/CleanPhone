package endosteum;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: EngineKey.java */
/* JADX INFO: loaded from: classes2.dex */
public class marial implements maggot.saneness {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Class<?> f25723beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final maggot.saneness f25724competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f25725cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f25726dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final Map<Class<?>, maggot.competently<?>> f25727impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Class<?> f25728marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Object f25729saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final maggot.wireman f25730taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f25731wireman;

    public marial(Object obj, maggot.saneness sanenessVar, int i, int i2, Map<Class<?>, maggot.competently<?>> map, Class<?> cls, Class<?> cls2, maggot.wireman wiremanVar) {
        this.f25729saneness = com.bumptech.glide.util.apical.wireman(obj);
        this.f25724competently = (maggot.saneness) com.bumptech.glide.util.apical.marial(sanenessVar, "Signature must not be null");
        this.f25726dern = i;
        this.f25731wireman = i2;
        this.f25727impromptu = (Map) com.bumptech.glide.util.apical.wireman(map);
        this.f25728marial = (Class) com.bumptech.glide.util.apical.marial(cls, "Resource class must not be null");
        this.f25723beachfront = (Class) com.bumptech.glide.util.apical.marial(cls2, "Transcode class must not be null");
        this.f25730taiyuan = (maggot.wireman) com.bumptech.glide.util.apical.wireman(wiremanVar);
    }

    @Override // maggot.saneness
    public void attabal(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // maggot.saneness
    public boolean equals(Object obj) {
        if (obj instanceof marial) {
            marial marialVar = (marial) obj;
            if (this.f25729saneness.equals(marialVar.f25729saneness) && this.f25724competently.equals(marialVar.f25724competently) && this.f25731wireman == marialVar.f25731wireman && this.f25726dern == marialVar.f25726dern && this.f25727impromptu.equals(marialVar.f25727impromptu) && this.f25728marial.equals(marialVar.f25728marial) && this.f25723beachfront.equals(marialVar.f25723beachfront) && this.f25730taiyuan.equals(marialVar.f25730taiyuan)) {
                return true;
            }
        }
        return false;
    }

    @Override // maggot.saneness
    public int hashCode() {
        if (this.f25725cutely == 0) {
            int iHashCode = this.f25729saneness.hashCode();
            this.f25725cutely = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f25724competently.hashCode()) * 31) + this.f25726dern) * 31) + this.f25731wireman;
            this.f25725cutely = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f25727impromptu.hashCode();
            this.f25725cutely = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f25728marial.hashCode();
            this.f25725cutely = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f25723beachfront.hashCode();
            this.f25725cutely = iHashCode5;
            this.f25725cutely = (iHashCode5 * 31) + this.f25730taiyuan.hashCode();
        }
        return this.f25725cutely;
    }

    public String toString() {
        return "EngineKey{model=" + this.f25729saneness + ", width=" + this.f25726dern + ", height=" + this.f25731wireman + ", resourceClass=" + this.f25728marial + ", transcodeClass=" + this.f25723beachfront + ", signature=" + this.f25724competently + ", hashCode=" + this.f25725cutely + ", transformations=" + this.f25727impromptu + ", options=" + this.f25730taiyuan + '}';
    }
}
