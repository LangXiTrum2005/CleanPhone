package astrogate;

import android.text.TextUtils;

/* JADX INFO: compiled from: SsaDialogueFormat.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f14504attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f14505dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f14506marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f14507saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f14508wireman;

    public attabal(int i, int i2, int i3, int i4, int i5) {
        this.f14504attabal = i;
        this.f14507saneness = i2;
        this.f14505dern = i3;
        this.f14508wireman = i4;
        this.f14506marial = i5;
    }

    public static attabal attabal(String str) {
        decarock.attabal.attabal(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < strArrSplit.length; i5++) {
            String strBeachfront = com.google.common.base.attabal.beachfront(strArrSplit[i5].trim());
            strBeachfront.getClass();
            switch (strBeachfront) {
                case "end":
                    i2 = i5;
                    break;
                case "text":
                    i4 = i5;
                    break;
                case "start":
                    i = i5;
                    break;
                case "style":
                    i3 = i5;
                    break;
            }
        }
        if (i == -1 || i2 == -1 || i4 == -1) {
            return null;
        }
        return new attabal(i, i2, i3, i4, strArrSplit.length);
    }
}
