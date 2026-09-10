package cybernatic;

/* JADX INFO: compiled from: DolbyVisionConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class triweekly {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f24794attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f24795dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f24796saneness;

    public triweekly(int i, int i2, String str) {
        this.f24794attabal = i;
        this.f24796saneness = i2;
        this.f24795dern = str;
    }

    public static triweekly attabal(decarock.stratoscope stratoscopeVar) {
        String str;
        stratoscopeVar.splinterproof(2);
        int iSupplicat = stratoscopeVar.supplicat();
        int i = iSupplicat >> 1;
        int iSupplicat2 = ((stratoscopeVar.supplicat() >> 3) & 31) | ((iSupplicat & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(iSupplicat2 >= 10 ? "." : ".0");
        sb.append(iSupplicat2);
        return new triweekly(i, iSupplicat2, sb.toString());
    }
}
