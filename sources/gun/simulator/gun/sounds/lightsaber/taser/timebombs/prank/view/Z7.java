package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class Z7 {
    public static final Z7 f = new Z7(10485760, 200, 10000, 604800000, 81920);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4056a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public Z7(long j, int i, int i2, long j2, int i3) {
        this.f4056a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Z7)) {
            return false;
        }
        Z7 z7 = (Z7) obj;
        return this.f4056a == z7.f4056a && this.b == z7.b && this.c == z7.c && this.d == z7.d && this.e == z7.e;
    }

    public final int hashCode() {
        long j = this.f4056a;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        long j2 = this.d;
        return this.e ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f4056a);
        sb.append(", loadBatchSize=");
        sb.append(this.b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.d);
        sb.append(", maxBlobByteSizePerRow=");
        return AbstractC5044xl.o(sb, this.e, "}");
    }
}
