package endosteum;

import java.io.File;

/* JADX INFO: compiled from: DataCacheWriter.java */
/* JADX INFO: loaded from: classes2.dex */
public class saneness<DataType> implements hemolysin.attabal.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final maggot.attabal<DataType> f25732attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final maggot.wireman f25733dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final DataType f25734saneness;

    public saneness(maggot.attabal<DataType> attabalVar, DataType datatype, maggot.wireman wiremanVar) {
        this.f25732attabal = attabalVar;
        this.f25734saneness = datatype;
        this.f25733dern = wiremanVar;
    }

    @Override // hemolysin.attabal.saneness
    public boolean attabal(File file) {
        return this.f25732attabal.attabal(this.f25734saneness, file, this.f25733dern);
    }
}
