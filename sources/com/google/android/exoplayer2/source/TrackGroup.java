package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackGroup implements Bundleable {
    public static final String g0;
    public static final String h0;
    public static final i i0;
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f18423Y;
    public final int Z;
    public final Format[] e0;
    public int f0;

    static {
        int i2 = Util.f18979a;
        g0 = Integer.toString(0, 36);
        h0 = Integer.toString(1, 36);
        i0 = new i(1);
    }

    public TrackGroup(String str, Format... formatArr) {
        Assertions.b(formatArr.length > 0);
        this.f18423Y = str;
        this.e0 = formatArr;
        this.X = formatArr.length;
        int iF = MimeTypes.f(formatArr[0].m0);
        this.Z = iF == -1 ? MimeTypes.f(formatArr[0].l0) : iF;
        String str2 = formatArr[0].Z;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i2 = formatArr[0].f0 | 16384;
        for (int i3 = 1; i3 < formatArr.length; i3++) {
            String str3 = formatArr[i3].Z;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                a(i3, "languages", formatArr[0].Z, formatArr[i3].Z);
                return;
            } else {
                if (i2 != (formatArr[i3].f0 | 16384)) {
                    a(i3, "role flags", Integer.toBinaryString(formatArr[0].f0), Integer.toBinaryString(formatArr[i3].f0));
                    return;
                }
            }
        }
    }

    public static void a(int i2, String str, String str2, String str3) {
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbQ.append(str3);
        sbQ.append("' (track ");
        sbQ.append(i2);
        sbQ.append(")");
        Log.d("TrackGroup", "", new IllegalStateException(sbQ.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroup.class == obj.getClass()) {
            TrackGroup trackGroup = (TrackGroup) obj;
            if (this.f18423Y.equals(trackGroup.f18423Y) && Arrays.equals(this.e0, trackGroup.e0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f0 == 0) {
            this.f0 = androidx.datastore.preferences.protobuf.a.b(this.f18423Y, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31) + Arrays.hashCode(this.e0);
        }
        return this.f0;
    }
}
