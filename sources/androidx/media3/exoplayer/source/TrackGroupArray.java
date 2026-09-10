package androidx.media3.exoplayer.source;

import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
public final class TrackGroupArray {
    public static final TrackGroupArray d = new TrackGroupArray(new TrackGroup[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableList f6464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6465c;

    static {
        Util.E(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.f6464b = ImmutableList.v(trackGroupArr);
        this.f6463a = trackGroupArr.length;
        int i2 = 0;
        while (true) {
            ImmutableList immutableList = this.f6464b;
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
        return (TrackGroup) this.f6464b.get(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroupArray.class == obj.getClass()) {
            TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
            if (this.f6463a == trackGroupArray.f6463a && this.f6464b.equals(trackGroupArray.f6464b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f6465c == 0) {
            this.f6465c = this.f6464b.hashCode();
        }
        return this.f6465c;
    }
}
