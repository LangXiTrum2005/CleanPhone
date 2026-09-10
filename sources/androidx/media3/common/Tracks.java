package androidx.media3.common;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Tracks {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Tracks f5546b = new Tracks(ImmutableList.x());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList f5547a;

    public static final class Group {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TrackGroup f5549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f5550c;
        public final int[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean[] f5551e;

        static {
            Util.E(0);
            Util.E(1);
            Util.E(3);
            Util.E(4);
        }

        public Group(TrackGroup trackGroup, boolean z2, int[] iArr, boolean[] zArr) {
            int i2 = trackGroup.f5521a;
            this.f5548a = i2;
            boolean z3 = false;
            Assertions.b(i2 == iArr.length && i2 == zArr.length);
            this.f5549b = trackGroup;
            if (z2 && i2 > 1) {
                z3 = true;
            }
            this.f5550c = z3;
            this.d = (int[]) iArr.clone();
            this.f5551e = (boolean[]) zArr.clone();
        }

        public final Format a(int i2) {
            return this.f5549b.d[i2];
        }

        public final boolean b(int i2) {
            return this.d[i2] == 4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Group.class == obj.getClass()) {
                Group group = (Group) obj;
                if (this.f5550c == group.f5550c && this.f5549b.equals(group.f5549b) && Arrays.equals(this.d, group.d) && Arrays.equals(this.f5551e, group.f5551e)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f5551e) + ((Arrays.hashCode(this.d) + (((this.f5549b.hashCode() * 31) + (this.f5550c ? 1 : 0)) * 31)) * 31);
        }
    }

    static {
        Util.E(0);
    }

    public Tracks(List list) {
        this.f5547a = ImmutableList.u(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(int i2) {
        int i3 = 0;
        while (true) {
            ImmutableList immutableList = this.f5547a;
            if (i3 >= immutableList.size()) {
                return false;
            }
            Group group = (Group) immutableList.get(i3);
            for (boolean z2 : group.f5551e) {
                if (z2) {
                    if (group.f5549b.f5523c != i2) {
                        break;
                    }
                    return true;
                }
            }
            i3++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Tracks.class != obj.getClass()) {
            return false;
        }
        return this.f5547a.equals(((Tracks) obj).f5547a);
    }

    public final int hashCode() {
        return this.f5547a.hashCode();
    }
}
