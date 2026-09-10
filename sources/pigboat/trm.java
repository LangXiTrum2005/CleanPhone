package pigboat;

import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"pigboat/oilcan", "pigboat/yemenite"}, d2 = {}, k = 4, mv = {2, 1, 0}, xi = 48)
public final class trm {
    public static final int attabal() {
        return oilcan.attabal();
    }

    public static final boolean beachfront(String str, boolean z) {
        return yemenite.wireman(str, z);
    }

    public static final long dern(String str, long j, long j2, long j3) {
        return yemenite.saneness(str, j, j2, j3);
    }

    public static final String marial(String str, String str2) {
        return yemenite.dern(str, str2);
    }

    public static final int saneness(String str, int i, int i2, int i3) {
        return yemenite.attabal(str, i, i2, i3);
    }

    public static final String wireman(String str) {
        return oilcan.saneness(str);
    }
}
