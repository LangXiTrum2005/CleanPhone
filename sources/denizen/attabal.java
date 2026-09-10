package denizen;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import lehua.competently;

/* JADX INFO: compiled from: CCTDestination.java */
/* JADX INFO: loaded from: classes2.dex */
public final class attabal implements competently {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final Set<staphylococcal.dern> f25184beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final attabal f25185competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final String f25186dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final attabal f25187impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final String f25188marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final String f25189wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f25190attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f25191saneness;

    static {
        String strAttabal = marial.attabal("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f25186dern = strAttabal;
        String strAttabal2 = marial.attabal("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f25189wireman = strAttabal2;
        String strAttabal3 = marial.attabal("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f25188marial = strAttabal3;
        f25184beachfront = Collections.unmodifiableSet(new HashSet(Arrays.asList(staphylococcal.dern.saneness("proto"), staphylococcal.dern.saneness("json"))));
        f25185competently = new attabal(strAttabal, null);
        f25187impromptu = new attabal(strAttabal2, strAttabal3);
    }

    public attabal(String str, String str2) {
        this.f25190attabal = str;
        this.f25191saneness = str2;
    }

    public static attabal dern(byte[] bArr) {
        String str = new String(bArr, Charset.forName(C.UTF8_NAME));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new attabal(str2, str3);
    }

    @Override // lehua.competently
    public Set<staphylococcal.dern> attabal() {
        return f25184beachfront;
    }

    @Override // lehua.beachfront
    public byte[] getExtras() {
        return saneness();
    }

    @Override // lehua.beachfront
    public String getName() {
        return "cct";
    }

    public String marial() {
        return this.f25190attabal;
    }

    public byte[] saneness() {
        String str = this.f25191saneness;
        if (str == null && this.f25190attabal == null) {
            return null;
        }
        String str2 = this.f25190attabal;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName(C.UTF8_NAME));
    }

    public String wireman() {
        return this.f25191saneness;
    }
}
