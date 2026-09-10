package kotlin;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/KotlinVersion;", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final KotlinVersion f0 = new KotlinVersion(2, 1, 20);
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f43247Y;
    public final int Z;
    public final int e0;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/KotlinVersion$Companion;", "", "", "MAX_COMPONENT_VALUE", "I", "Lkotlin/KotlinVersion;", "CURRENT", "Lkotlin/KotlinVersion;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public KotlinVersion(int i2, int i3, int i4) {
        this.X = i2;
        this.f43247Y = i3;
        this.Z = i4;
        if (i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256 && i4 >= 0 && i4 < 256) {
            this.e0 = (i2 << 16) + (i3 << 8) + i4;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i2 + '.' + i3 + '.' + i4).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(KotlinVersion kotlinVersion) {
        KotlinVersion other = kotlinVersion;
        Intrinsics.f(other, "other");
        return this.e0 - other.e0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        KotlinVersion kotlinVersion = obj instanceof KotlinVersion ? (KotlinVersion) obj : null;
        return kotlinVersion != null && this.e0 == kotlinVersion.e0;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getE0() {
        return this.e0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.X);
        sb.append('.');
        sb.append(this.f43247Y);
        sb.append('.');
        sb.append(this.Z);
        return sb.toString();
    }
}
