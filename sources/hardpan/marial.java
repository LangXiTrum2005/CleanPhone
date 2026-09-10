package hardpan;

import android.util.Base64;
import java.util.List;
import technofreak.cutely;

/* JADX INFO: compiled from: FontRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f27524attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final String f27525beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f27526dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f27527marial = 0;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f27528saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final List<List<byte[]>> f27529wireman;

    public marial(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f27524attabal = (String) cutely.competently(str);
        this.f27528saneness = (String) cutely.competently(str2);
        this.f27526dern = (String) cutely.competently(str3);
        this.f27529wireman = (List) cutely.competently(list);
        this.f27525beachfront = attabal(str, str2, str3);
    }

    public final String attabal(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public String beachfront() {
        return this.f27528saneness;
    }

    public String competently() {
        return this.f27526dern;
    }

    public int dern() {
        return this.f27527marial;
    }

    public String marial() {
        return this.f27524attabal;
    }

    public List<List<byte[]>> saneness() {
        return this.f27529wireman;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f27524attabal + ", mProviderPackage: " + this.f27528saneness + ", mQuery: " + this.f27526dern + ", mCertificates:");
        for (int i = 0; i < this.f27529wireman.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f27529wireman.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f27527marial);
        return sb.toString();
    }

    public String wireman() {
        return this.f27525beachfront;
    }
}
