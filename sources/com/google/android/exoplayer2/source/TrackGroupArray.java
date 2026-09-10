package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackGroupArray implements Bundleable {
    public static final TrackGroupArray e0 = new TrackGroupArray(new TrackGroup[0]);
    public static final String f0;
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ImmutableList f18424Y;
    public int Z;

    static {
        int i2 = Util.f18979a;
        f0 = Integer.toString(0, 36);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.f18424Y = ImmutableList.v(trackGroupArr);
        this.X = trackGroupArr.length;
        int i2 = 0;
        while (true) {
            ImmutableList immutableList = this.f18424Y;
            if (i2 >= immutableList.size()) {
                return;
            }
            int i3 = i2 + 1;
            for (int i4 = i3; i4 < immutableList.size(); i4++) {
                if (((TrackGroup) immutableList.get(i2)).equals(immutableList.get(i4))) {
                    Log.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TrackGroup a(int i2) {
        return (TrackGroup) this.f18424Y.get(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroupArray.class == obj.getClass()) {
            TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
            if (this.X == trackGroupArray.X && this.f18424Y.equals(trackGroupArray.f18424Y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.Z == 0) {
            this.Z = this.f18424Y.hashCode();
        }
        return this.Z;
    }
}
