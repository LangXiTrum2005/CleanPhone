package glycolate;

import amount.sealless;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import lehua.adultoid;
import nidicolous.cutely;
import reeve.impromptu;
import staphylococcal.competently;
import staphylococcal.taiyuan;
import umbriferous.cord;
import umbriferous.seminary;

/* JADX INFO: compiled from: DataTransportCrashlyticsReportSender.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final marial f27325attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final competently<sealless, byte[]> f27326saneness;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final cutely f27322dern = new cutely();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final String f27324wireman = wireman("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final String f27323marial = wireman("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final competently<sealless, byte[]> f27321beachfront = new competently() { // from class: glycolate.attabal
        @Override // staphylococcal.competently
        public final Object apply(Object obj) {
            return saneness.f27322dern.grimness((sealless) obj).getBytes(Charset.forName(C.UTF8_NAME));
        }
    };

    public saneness(marial marialVar, competently<sealless, byte[]> competentlyVar) {
        this.f27325attabal = marialVar;
        this.f27326saneness = competentlyVar;
    }

    public static saneness saneness(Context context, impromptu impromptuVar, seminary seminaryVar) {
        adultoid.beachfront(context);
        taiyuan taiyuanVarCompetently = adultoid.dern().competently(new denizen.attabal(f27324wireman, f27323marial));
        staphylococcal.dern dernVarSaneness = staphylococcal.dern.saneness("json");
        competently<sealless, byte[]> competentlyVar = f27321beachfront;
        return new saneness(new marial(taiyuanVarCompetently.attabal("FIREBASE_CRASHLYTICS_REPORT", sealless.class, dernVarSaneness, competentlyVar), impromptuVar.saneness(), seminaryVar), competentlyVar);
    }

    public static String wireman(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public Task<cord> dern(cord cordVar, boolean z) {
        return this.f27325attabal.taiyuan(cordVar, z).getTask();
    }
}
