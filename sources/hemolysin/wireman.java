package hemolysin;

import java.io.File;

/* JADX INFO: compiled from: DiskLruCacheFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class wireman implements hemolysin.attabal.InterfaceC0631attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f27670attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final attabal f27671saneness;

    /* JADX INFO: compiled from: DiskLruCacheFactory.java */
    public interface attabal {
        File attabal();
    }

    public wireman(attabal attabalVar, long j) {
        this.f27670attabal = j;
        this.f27671saneness = attabalVar;
    }

    @Override // hemolysin.attabal.InterfaceC0631attabal
    public hemolysin.attabal build() {
        File fileAttabal = this.f27671saneness.attabal();
        if (fileAttabal == null) {
            return null;
        }
        if (fileAttabal.isDirectory() || fileAttabal.mkdirs()) {
            return marial.dern(fileAttabal, this.f27670attabal);
        }
        return null;
    }
}
