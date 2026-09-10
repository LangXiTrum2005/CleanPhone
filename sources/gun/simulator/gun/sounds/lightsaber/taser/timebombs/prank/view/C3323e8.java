package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.e8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3323e8 extends AbstractC4214oJ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4309a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final AbstractC5013xR g;

    public C3323e8(long j, Integer num, long j2, byte[] bArr, String str, long j3, AbstractC5013xR abstractC5013xR) {
        this.f4309a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = abstractC5013xR;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4214oJ)) {
            return false;
        }
        AbstractC4214oJ abstractC4214oJ = (AbstractC4214oJ) obj;
        if (this.f4309a == ((C3323e8) abstractC4214oJ).f4309a && ((num = this.b) != null ? num.equals(((C3323e8) abstractC4214oJ).b) : ((C3323e8) abstractC4214oJ).b == null)) {
            C3323e8 c3323e8 = (C3323e8) abstractC4214oJ;
            if (this.c == c3323e8.c) {
                if (Arrays.equals(this.d, abstractC4214oJ instanceof C3323e8 ? ((C3323e8) abstractC4214oJ).d : c3323e8.d)) {
                    String str = c3323e8.e;
                    String str2 = this.e;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f == c3323e8.f) {
                            AbstractC5013xR abstractC5013xR = c3323e8.g;
                            AbstractC5013xR abstractC5013xR2 = this.g;
                            if (abstractC5013xR2 == null) {
                                if (abstractC5013xR == null) {
                                    return true;
                                }
                            } else if (abstractC5013xR2.equals(abstractC5013xR)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f4309a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.c;
        int iHashCode2 = (((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f;
        int i2 = (iHashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        AbstractC5013xR abstractC5013xR = this.g;
        return i2 ^ (abstractC5013xR != null ? abstractC5013xR.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f4309a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
