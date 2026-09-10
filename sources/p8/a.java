package p8;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import o8.c;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f48265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f48266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f48267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f48268f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48270b;

    static {
        String strZ = a.a.z("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f48265c = strZ;
        String strZ2 = a.a.z("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strZ3 = a.a.z("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f48266d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new c("proto"), new c("json"))));
        f48267e = new a(strZ, null);
        f48268f = new a(strZ2, strZ3);
    }

    public a(String str, String str2) {
        this.f48269a = str;
        this.f48270b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
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
        return new a(str2, str3);
    }
}
