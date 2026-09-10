package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3019ak {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4137a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public C3019ak(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f4137a = str;
        this.b = str2;
        this.c = j2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3019ak) {
            C3019ak c3019ak = (C3019ak) obj;
            if (AbstractC2995aW.i(c3019ak.f4137a, this.f4137a) && AbstractC2995aW.i(c3019ak.b, this.b) && c3019ak.c == this.c && AbstractC2995aW.i(c3019ak.d, this.d) && AbstractC2995aW.i(c3019ak.e, this.e) && c3019ak.f == this.f && c3019ak.g == this.g && c3019ak.h == this.h && c3019ak.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD = DM.d(this.b, DM.d(this.f4137a, 527, 31), 31);
        long j2 = this.c;
        return ((((((DM.d(this.e, DM.d(this.d, (iD + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31), 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4137a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            long j2 = this.c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) AbstractC2288Al.f2833a.get()).format(new Date(j2));
                AbstractC2995aW.p(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(str);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        AbstractC2995aW.p(string, "toString()");
        return string;
    }
}
