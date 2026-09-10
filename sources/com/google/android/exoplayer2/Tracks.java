package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class Tracks implements Bundleable {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Tracks f17210Y = new Tracks(ImmutableList.x());
    public final ImmutableList X;

    public static final class Group implements Bundleable {
        public static final String g0;
        public static final String h0;
        public static final String i0;
        public static final String j0;
        public final int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final TrackGroup f17211Y;
        public final boolean Z;
        public final int[] e0;
        public final boolean[] f0;

        static {
            int i2 = Util.f18979a;
            g0 = Integer.toString(0, 36);
            h0 = Integer.toString(1, 36);
            i0 = Integer.toString(3, 36);
            j0 = Integer.toString(4, 36);
        }

        public Group(TrackGroup trackGroup, boolean z2, int[] iArr, boolean[] zArr) {
            int i2 = trackGroup.X;
            this.X = i2;
            boolean z3 = false;
            Assertions.b(i2 == iArr.length && i2 == zArr.length);
            this.f17211Y = trackGroup;
            if (z2 && i2 > 1) {
                z3 = true;
            }
            this.Z = z3;
            this.e0 = (int[]) iArr.clone();
            this.f0 = (boolean[]) zArr.clone();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Group.class == obj.getClass()) {
                Group group = (Group) obj;
                if (this.Z == group.Z && this.f17211Y.equals(group.f17211Y) && Arrays.equals(this.e0, group.e0) && Arrays.equals(this.f0, group.f0)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f0) + ((Arrays.hashCode(this.e0) + (((this.f17211Y.hashCode() * 31) + (this.Z ? 1 : 0)) * 31)) * 31);
        }
    }

    static {
        int i2 = Util.f18979a;
        Integer.toString(0, 36);
    }

    public Tracks(ImmutableList immutableList) {
        this.X = ImmutableList.u(immutableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(int i2) {
        int i3 = 0;
        while (true) {
            ImmutableList immutableList = this.X;
            if (i3 >= immutableList.size()) {
                return false;
            }
            Group group = (Group) immutableList.get(i3);
            for (boolean z2 : group.f0) {
                if (z2) {
                    if (group.f17211Y.Z != i2) {
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
        return this.X.equals(((Tracks) obj).X);
    }

    public final int hashCode() {
        return this.X.hashCode();
    }
}
