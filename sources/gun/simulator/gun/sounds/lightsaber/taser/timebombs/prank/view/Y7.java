package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class Y7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4007a;
    public final Integer b;
    public final C3209cr c;
    public final long d;
    public final long e;
    public final Map f;

    public Y7(String str, Integer num, C3209cr c3209cr, long j, long j2, Map map) {
        this.f4007a = str;
        this.b = num;
        this.c = c3209cr;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final C4092mw c() {
        C4092mw c4092mw = new C4092mw();
        String str = this.f4007a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        c4092mw.f4722a = str;
        c4092mw.c = this.b;
        c4092mw.e(this.c);
        c4092mw.e = Long.valueOf(this.d);
        c4092mw.f = Long.valueOf(this.e);
        c4092mw.b = new HashMap(this.f);
        return c4092mw;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Y7)) {
            return false;
        }
        Y7 y7 = (Y7) obj;
        if (this.f4007a.equals(y7.f4007a)) {
            Integer num = y7.b;
            Integer num2 = this.b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.c.equals(y7.c) && this.d == y7.d && this.e == y7.e && this.f.equals(y7.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f4007a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f4007a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
