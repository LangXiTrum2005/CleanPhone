package rsp;

import android.text.TextUtils;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.achondroplasia;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: TextEmphasis.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f36987attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f36988dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f36989saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Pattern f36986wireman = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final ImmutableSet<String> f36985marial = ImmutableSet.of("auto", "none");

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final ImmutableSet<String> f36982beachfront = ImmutableSet.of("dot", "sesame", "circle");

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final ImmutableSet<String> f36983competently = ImmutableSet.of("filled", MRAIDPresenter.OPEN);

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final ImmutableSet<String> f36984impromptu = ImmutableSet.of("after", "before", "outside");

    public saneness(int i, int i2, int i3) {
        this.f36987attabal = i;
        this.f36989saneness = i2;
        this.f36988dern = i3;
    }

    public static saneness attabal(String str) {
        if (str == null) {
            return null;
        }
        String strBeachfront = com.google.common.base.attabal.beachfront(str.trim());
        if (strBeachfront.isEmpty()) {
            return null;
        }
        return saneness(ImmutableSet.copyOf(TextUtils.split(strBeachfront, f36986wireman)));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ee  */
    public static saneness saneness(ImmutableSet<String> immutableSet) {
        int i;
        Sets.beachfront beachfrontVarMarial;
        int i2;
        Sets.beachfront beachfrontVarMarial2;
        Sets.beachfront beachfrontVarMarial3;
        String str;
        int iHashCode;
        int i3;
        String str2;
        int iHashCode2;
        String str3;
        int iHashCode3;
        String str4 = (String) achondroplasia.marial(Sets.marial(f36984impromptu, immutableSet), "outside");
        int iHashCode4 = str4.hashCode();
        int i4 = 1;
        if (iHashCode4 != -1392885889) {
            if (iHashCode4 != -1106037339) {
                if (iHashCode4 == 92734940 && str4.equals("after")) {
                    i = 2;
                }
            } else if (str4.equals("outside")) {
                i = -2;
            }
            beachfrontVarMarial = Sets.marial(f36985marial, immutableSet);
            i2 = -1;
            if (!beachfrontVarMarial.isEmpty()) {
                str3 = (String) beachfrontVarMarial.iterator().next();
                iHashCode3 = str3.hashCode();
                if (iHashCode3 != 3005871) {
                    str3.equals("auto");
                } else if (iHashCode3 == 3387192 && str3.equals("none")) {
                    i2 = 0;
                }
                return new saneness(i2, 0, i);
            }
            beachfrontVarMarial2 = Sets.marial(f36983competently, immutableSet);
            beachfrontVarMarial3 = Sets.marial(f36982beachfront, immutableSet);
            if (!beachfrontVarMarial2.isEmpty() && beachfrontVarMarial3.isEmpty()) {
                return new saneness(-1, 0, i);
            }
            str = (String) achondroplasia.marial(beachfrontVarMarial2, "filled");
            iHashCode = str.hashCode();
            if (iHashCode != -1274499742) {
                if (iHashCode == 3417674 && str.equals(MRAIDPresenter.OPEN)) {
                    i3 = 2;
                }
                str2 = (String) achondroplasia.marial(beachfrontVarMarial3, "circle");
                iHashCode2 = str2.hashCode();
                if (iHashCode2 != -1360216880) {
                    str2.equals("circle");
                } else if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str2.equals("dot")) {
                        i4 = 2;
                    }
                } else if (str2.equals("sesame")) {
                    i4 = 3;
                }
                return new saneness(i4, i3, i);
            }
            str.equals("filled");
            i3 = 1;
            str2 = (String) achondroplasia.marial(beachfrontVarMarial3, "circle");
            iHashCode2 = str2.hashCode();
            if (iHashCode2 != -1360216880) {
                str2.equals("circle");
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i4 = 2;
                }
            } else if (str2.equals("sesame")) {
                i4 = 3;
            }
            return new saneness(i4, i3, i);
        }
        str4.equals("before");
        i = 1;
        beachfrontVarMarial = Sets.marial(f36985marial, immutableSet);
        i2 = -1;
        if (!beachfrontVarMarial.isEmpty()) {
            str3 = (String) beachfrontVarMarial.iterator().next();
            iHashCode3 = str3.hashCode();
            if (iHashCode3 != 3005871) {
                str3.equals("auto");
            } else if (iHashCode3 == 3387192) {
                i2 = 0;
            }
            return new saneness(i2, 0, i);
        }
        beachfrontVarMarial2 = Sets.marial(f36983competently, immutableSet);
        beachfrontVarMarial3 = Sets.marial(f36982beachfront, immutableSet);
        if (!beachfrontVarMarial2.isEmpty()) {
        }
        str = (String) achondroplasia.marial(beachfrontVarMarial2, "filled");
        iHashCode = str.hashCode();
        if (iHashCode != -1274499742) {
            if (iHashCode == 3417674) {
                i3 = 2;
            }
            str2 = (String) achondroplasia.marial(beachfrontVarMarial3, "circle");
            iHashCode2 = str2.hashCode();
            if (iHashCode2 != -1360216880) {
                str2.equals("circle");
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i4 = 2;
                }
            } else if (str2.equals("sesame")) {
                i4 = 3;
            }
            return new saneness(i4, i3, i);
        }
        str.equals("filled");
        i3 = 1;
        str2 = (String) achondroplasia.marial(beachfrontVarMarial3, "circle");
        iHashCode2 = str2.hashCode();
        if (iHashCode2 != -1360216880) {
            str2.equals("circle");
        } else if (iHashCode2 != -905816648) {
            if (iHashCode2 == 99657) {
                i4 = 2;
            }
        } else if (str2.equals("sesame")) {
            i4 = 3;
        }
        return new saneness(i4, i3, i);
    }
}
