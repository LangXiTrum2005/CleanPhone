package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.f8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3411f8 extends AbstractC4477rJ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4354a;
    public final long b;
    public final AbstractC4944wf c;
    public final Integer d;
    public final String e;
    public final List f;
    public final PW g;

    public C3411f8(long j, long j2, AbstractC4944wf abstractC4944wf, Integer num, String str, List list, PW pw) {
        this.f4354a = j;
        this.b = j2;
        this.c = abstractC4944wf;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = pw;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4477rJ)) {
            return false;
        }
        AbstractC4477rJ abstractC4477rJ = (AbstractC4477rJ) obj;
        if (this.f4354a == ((C3411f8) abstractC4477rJ).f4354a) {
            C3411f8 c3411f8 = (C3411f8) abstractC4477rJ;
            if (this.b == c3411f8.b) {
                AbstractC4944wf abstractC4944wf = c3411f8.c;
                AbstractC4944wf abstractC4944wf2 = this.c;
                if (abstractC4944wf2 != null ? abstractC4944wf2.equals(abstractC4944wf) : abstractC4944wf == null) {
                    Integer num = c3411f8.d;
                    Integer num2 = this.d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = c3411f8.e;
                        String str2 = this.e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            List list = c3411f8.f;
                            List list2 = this.f;
                            if (list2 != null ? list2.equals(list) : list == null) {
                                PW pw = c3411f8.g;
                                PW pw2 = this.g;
                                if (pw2 == null) {
                                    if (pw == null) {
                                        return true;
                                    }
                                } else if (pw2.equals(pw)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f4354a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        AbstractC4944wf abstractC4944wf = this.c;
        int iHashCode = (i ^ (abstractC4944wf == null ? 0 : abstractC4944wf.hashCode())) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        PW pw = this.g;
        return iHashCode4 ^ (pw != null ? pw.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f4354a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
