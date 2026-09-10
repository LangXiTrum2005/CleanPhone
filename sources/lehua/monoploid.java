package lehua;

import java.util.Set;

/* JADX INFO: compiled from: TransportFactoryImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public final class monoploid implements staphylococcal.taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Set<staphylococcal.dern> f32706attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final graveside f32707dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final arytenoidectomy f32708saneness;

    public monoploid(Set<staphylococcal.dern> set, arytenoidectomy arytenoidectomyVar, graveside gravesideVar) {
        this.f32706attabal = set;
        this.f32708saneness = arytenoidectomyVar;
        this.f32707dern = gravesideVar;
    }

    @Override // staphylococcal.taiyuan
    public <T> staphylococcal.impromptu<T> attabal(String str, Class<T> cls, staphylococcal.dern dernVar, staphylococcal.competently<T, byte[]> competentlyVar) {
        if (this.f32706attabal.contains(dernVar)) {
            return new molybdenite(this.f32708saneness, str, dernVar, competentlyVar, this.f32707dern);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", dernVar, this.f32706attabal));
    }
}
