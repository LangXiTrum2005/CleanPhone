package umbriferous;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: CrashlyticsAppQualitySessionsStore.java */
/* JADX INFO: loaded from: classes3.dex */
public class apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final spissatus.competently f39066attabal;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final FilenameFilter f39065wireman = new FilenameFilter() { // from class: umbriferous.taiyuan
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("aqs.");
        }
    };

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Comparator<File> f39064marial = new Comparator() { // from class: umbriferous.cutely
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    };

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public String f39068saneness = null;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public String f39067dern = null;

    public apical(spissatus.competently competentlyVar) {
        this.f39066attabal = competentlyVar;
    }

    public static String marial(spissatus.competently competentlyVar, String str) {
        List<File> listPolloi = competentlyVar.polloi(str, f39065wireman);
        if (!listPolloi.isEmpty()) {
            return ((File) Collections.min(listPolloi, f39064marial)).getName().substring(4);
        }
        gelandelaufer.competently.beachfront().apical("Unable to read App Quality Sessions session id.");
        return null;
    }

    public static void wireman(spissatus.competently competentlyVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            competentlyVar.monoploid(str, "aqs." + str2).createNewFile();
        } catch (IOException e) {
            gelandelaufer.competently.beachfront().formularize("Failed to persist App Quality Sessions session id.", e);
        }
    }

    public synchronized void beachfront(String str) {
        if (!Objects.equals(this.f39067dern, str)) {
            wireman(this.f39066attabal, this.f39068saneness, str);
            this.f39067dern = str;
        }
    }

    public synchronized void competently(String str) {
        if (!Objects.equals(this.f39068saneness, str)) {
            wireman(this.f39066attabal, str, this.f39067dern);
            this.f39068saneness = str;
        }
    }

    public synchronized String dern(String str) {
        if (Objects.equals(this.f39068saneness, str)) {
            return this.f39067dern;
        }
        return marial(this.f39066attabal, str);
    }
}
