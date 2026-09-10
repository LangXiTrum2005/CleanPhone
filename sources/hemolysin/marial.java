package hemolysin;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: DiskLruCacheWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public class marial implements attabal {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long f27652dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public gondola.saneness f27653marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final File f27654saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final dern f27655wireman = new dern();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final cutely f27651attabal = new cutely();

    @Deprecated
    public marial(File file, long j) {
        this.f27654saneness = file;
        this.f27652dern = j;
    }

    public static attabal dern(File file, long j) {
        return new marial(file, j);
    }

    @Override // hemolysin.attabal
    public File attabal(maggot.saneness sanenessVar) {
        String strSaneness = this.f27651attabal.saneness(sanenessVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(sanenessVar);
        }
        try {
            gondola.saneness.marial marialVarSaran = wireman().saran(strSaneness);
            if (marialVarSaran != null) {
                return marialVarSaran.attabal(0);
            }
            return null;
        } catch (IOException unused) {
            Log.isLoggable("DiskLruCacheWrapper", 5);
            return null;
        }
    }

    @Override // hemolysin.attabal
    public void saneness(maggot.saneness sanenessVar, attabal.saneness sanenessVar2) {
        String strSaneness = this.f27651attabal.saneness(sanenessVar);
        this.f27655wireman.attabal(strSaneness);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(sanenessVar);
            }
            try {
                gondola.saneness sanenessVarWireman = wireman();
                if (sanenessVarWireman.saran(strSaneness) == null) {
                    gondola.saneness.dern dernVarMerc = sanenessVarWireman.merc(strSaneness);
                    if (dernVarMerc == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strSaneness);
                    }
                    try {
                        if (sanenessVar2.attabal(dernVarMerc.beachfront(0))) {
                            dernVarMerc.marial();
                        }
                        dernVarMerc.saneness();
                    } catch (Throwable th) {
                        dernVarMerc.saneness();
                        throw th;
                    }
                }
            } catch (IOException unused) {
                Log.isLoggable("DiskLruCacheWrapper", 5);
            }
            this.f27655wireman.saneness(strSaneness);
        } catch (Throwable th2) {
            this.f27655wireman.saneness(strSaneness);
            throw th2;
        }
    }

    public final synchronized gondola.saneness wireman() throws IOException {
        try {
            if (this.f27653marial == null) {
                this.f27653marial = gondola.saneness.creditor(this.f27654saneness, 1, 1, this.f27652dern);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f27653marial;
    }
}
