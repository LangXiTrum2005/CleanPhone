package sentimentalism;

import android.content.Context;
import android.util.Pair;
import com.airbnb.lottie.impromptu;
import com.airbnb.lottie.network.FileExtension;
import com.airbnb.lottie.polloi;
import com.airbnb.lottie.starveling;
import com.ironsource.A5;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: NetworkFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final beachfront f37514attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final marial f37515saneness;

    /* JADX INFO: compiled from: NetworkFetcher.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f37516attabal;

        static {
            int[] iArr = new int[FileExtension.values().length];
            f37516attabal = iArr;
            try {
                iArr[FileExtension.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37516attabal[FileExtension.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public competently(beachfront beachfrontVar, marial marialVar) {
        this.f37514attabal = beachfrontVar;
        this.f37515saneness = marialVar;
    }

    public final impromptu attabal(Context context, String str, String str2) {
        beachfront beachfrontVar;
        Pair<FileExtension, InputStream> pairAttabal;
        starveling<impromptu> starvelingVarSealless;
        if (str2 == null || (beachfrontVar = this.f37514attabal) == null || (pairAttabal = beachfrontVar.attabal(str)) == null) {
            return null;
        }
        FileExtension fileExtension = (FileExtension) pairAttabal.first;
        InputStream inputStream = (InputStream) pairAttabal.second;
        int i = attabal.f37516attabal[fileExtension.ordinal()];
        if (i == 1) {
            starvelingVarSealless = polloi.sealless(context, new ZipInputStream(inputStream), str2);
        } else if (i != 2) {
            starvelingVarSealless = polloi.polloi(inputStream, str2);
        } else {
            try {
                starvelingVarSealless = polloi.polloi(new GZIPInputStream(inputStream), str2);
            } catch (IOException e) {
                starvelingVarSealless = new starveling<>(e);
            }
        }
        if (starvelingVarSealless.saneness() != null) {
            return starvelingVarSealless.saneness();
        }
        return null;
    }

    public final starveling<impromptu> beachfront(String str, InputStream inputStream, String str2) throws IOException {
        beachfront beachfrontVar;
        return (str2 == null || (beachfrontVar = this.f37514attabal) == null) ? polloi.polloi(inputStream, null) : polloi.polloi(new FileInputStream(beachfrontVar.competently(str, inputStream, FileExtension.JSON).getAbsolutePath()), str);
    }

    public final starveling<impromptu> competently(Context context, String str, InputStream inputStream, String str2) throws IOException {
        beachfront beachfrontVar;
        return (str2 == null || (beachfrontVar = this.f37514attabal) == null) ? polloi.sealless(context, new ZipInputStream(inputStream), null) : polloi.sealless(context, new ZipInputStream(new FileInputStream(beachfrontVar.competently(str, inputStream, FileExtension.ZIP))), str);
    }

    public starveling<impromptu> dern(Context context, String str, String str2) {
        impromptu impromptuVarAttabal = attabal(context, str, str2);
        if (impromptuVarAttabal != null) {
            return new starveling<>(impromptuVarAttabal);
        }
        utwa.beachfront.attabal("Animation for " + str + " not found in cache. Fetching from network.");
        return saneness(context, str, str2);
    }

    public final starveling<impromptu> marial(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        starveling<impromptu> starvelingVarCompetently;
        FileExtension fileExtension;
        beachfront beachfrontVar;
        if (str2 == null) {
            str2 = A5.M;
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            utwa.beachfront.attabal("Handling zip response.");
            FileExtension fileExtension2 = FileExtension.ZIP;
            starvelingVarCompetently = competently(context, str, inputStream, str3);
            fileExtension = fileExtension2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            utwa.beachfront.attabal("Handling gzip response.");
            fileExtension = FileExtension.GZIP;
            starvelingVarCompetently = wireman(str, inputStream, str3);
        } else {
            utwa.beachfront.attabal("Received json response.");
            fileExtension = FileExtension.JSON;
            starvelingVarCompetently = beachfront(str, inputStream, str3);
        }
        if (str3 != null && starvelingVarCompetently.saneness() != null && (beachfrontVar = this.f37514attabal) != null) {
            beachfrontVar.beachfront(str, fileExtension);
        }
        return starvelingVarCompetently;
    }

    public final starveling<impromptu> saneness(Context context, String str, String str2) {
        starveling<impromptu> starvelingVar;
        utwa.beachfront.attabal("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                dern dernVarAttabal = this.f37515saneness.attabal(str);
                if (dernVarAttabal.isSuccessful()) {
                    starvelingVar = marial(context, str, dernVarAttabal.yemenite(), dernVarAttabal.stratoscope(), str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Completed fetch from network. Success: ");
                    sb.append(starvelingVar.saneness() != null);
                    utwa.beachfront.attabal(sb.toString());
                } else {
                    starvelingVar = new starveling<>(new IllegalArgumentException(dernVarAttabal.treadless()));
                }
                try {
                    dernVarAttabal.close();
                    return starvelingVar;
                } catch (IOException e) {
                    utwa.beachfront.wireman("LottieFetchResult close failed ", e);
                    return starvelingVar;
                }
            } catch (Exception e2) {
                starveling<impromptu> starvelingVar2 = new starveling<>(e2);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e3) {
                        utwa.beachfront.wireman("LottieFetchResult close failed ", e3);
                    }
                }
                return starvelingVar2;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            try {
                closeable.close();
                throw th;
            } catch (IOException e4) {
                utwa.beachfront.wireman("LottieFetchResult close failed ", e4);
                throw th;
            }
        }
    }

    public final starveling<impromptu> wireman(String str, InputStream inputStream, String str2) throws IOException {
        beachfront beachfrontVar;
        return (str2 == null || (beachfrontVar = this.f37514attabal) == null) ? polloi.polloi(new GZIPInputStream(inputStream), null) : polloi.polloi(new GZIPInputStream(new FileInputStream(beachfrontVar.competently(str, inputStream, FileExtension.GZIP))), str);
    }
}
