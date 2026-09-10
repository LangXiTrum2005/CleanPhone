package endosteum;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: ResourceCacheKey.java */
/* JADX INFO: loaded from: classes2.dex */
public final class apical implements maggot.saneness {

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final com.bumptech.glide.util.impromptu<Class<?>, byte[]> f25703cutely = new com.bumptech.glide.util.impromptu<>(50);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final int f25704beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final Class<?> f25705competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final maggot.saneness f25706dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final maggot.wireman f25707impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f25708marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final trawler.saneness f25709saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final maggot.competently<?> f25710taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final maggot.saneness f25711wireman;

    public apical(trawler.saneness sanenessVar, maggot.saneness sanenessVar2, maggot.saneness sanenessVar3, int i, int i2, maggot.competently<?> competentlyVar, Class<?> cls, maggot.wireman wiremanVar) {
        this.f25709saneness = sanenessVar;
        this.f25706dern = sanenessVar2;
        this.f25711wireman = sanenessVar3;
        this.f25708marial = i;
        this.f25704beachfront = i2;
        this.f25710taiyuan = competentlyVar;
        this.f25705competently = cls;
        this.f25707impromptu = wiremanVar;
    }

    @Override // maggot.saneness
    public void attabal(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f25709saneness.wireman(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f25708marial).putInt(this.f25704beachfront).array();
        this.f25711wireman.attabal(messageDigest);
        this.f25706dern.attabal(messageDigest);
        messageDigest.update(bArr);
        maggot.competently<?> competentlyVar = this.f25710taiyuan;
        if (competentlyVar != null) {
            competentlyVar.attabal(messageDigest);
        }
        this.f25707impromptu.attabal(messageDigest);
        messageDigest.update(dern());
        this.f25709saneness.put(bArr);
    }

    public final byte[] dern() {
        com.bumptech.glide.util.impromptu<Class<?>, byte[]> impromptuVar = f25703cutely;
        byte[] bArrCompetently = impromptuVar.competently(this.f25705competently);
        if (bArrCompetently != null) {
            return bArrCompetently;
        }
        byte[] bytes = this.f25705competently.getName().getBytes(maggot.saneness.f33228attabal);
        impromptuVar.apical(this.f25705competently, bytes);
        return bytes;
    }

    @Override // maggot.saneness
    public boolean equals(Object obj) {
        if (obj instanceof apical) {
            apical apicalVar = (apical) obj;
            if (this.f25704beachfront == apicalVar.f25704beachfront && this.f25708marial == apicalVar.f25708marial && com.bumptech.glide.util.formularize.marial(this.f25710taiyuan, apicalVar.f25710taiyuan) && this.f25705competently.equals(apicalVar.f25705competently) && this.f25706dern.equals(apicalVar.f25706dern) && this.f25711wireman.equals(apicalVar.f25711wireman) && this.f25707impromptu.equals(apicalVar.f25707impromptu)) {
                return true;
            }
        }
        return false;
    }

    @Override // maggot.saneness
    public int hashCode() {
        int iHashCode = (((((this.f25706dern.hashCode() * 31) + this.f25711wireman.hashCode()) * 31) + this.f25708marial) * 31) + this.f25704beachfront;
        maggot.competently<?> competentlyVar = this.f25710taiyuan;
        if (competentlyVar != null) {
            iHashCode = (iHashCode * 31) + competentlyVar.hashCode();
        }
        return (((iHashCode * 31) + this.f25705competently.hashCode()) * 31) + this.f25707impromptu.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f25706dern + ", signature=" + this.f25711wireman + ", width=" + this.f25708marial + ", height=" + this.f25704beachfront + ", decodedResourceClass=" + this.f25705competently + ", transformation='" + this.f25710taiyuan + "', options=" + this.f25707impromptu + '}';
    }
}
