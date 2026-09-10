package androidx.media3.common;

import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class TrackGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5523c;
    public final Format[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5524e;

    static {
        Util.E(0);
        Util.E(1);
    }

    public TrackGroup(String str, Format... formatArr) {
        Assertions.b(formatArr.length > 0);
        this.f5522b = str;
        this.d = formatArr;
        this.f5521a = formatArr.length;
        int iG = MimeTypes.g(formatArr[0].m);
        this.f5523c = iG == -1 ? MimeTypes.g(formatArr[0].f5412l) : iG;
        String str2 = formatArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i2 = formatArr[0].f | 16384;
        for (int i3 = 1; i3 < formatArr.length; i3++) {
            String str3 = formatArr[i3].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                a(i3, "languages", formatArr[0].d, formatArr[i3].d);
                return;
            } else {
                if (i2 != (formatArr[i3].f | 16384)) {
                    a(i3, "role flags", Integer.toBinaryString(formatArr[0].f), Integer.toBinaryString(formatArr[i3].f));
                    return;
                }
            }
        }
    }

    public static void a(int i2, String str, String str2, String str3) {
        StringBuilder sbQ = a.q("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
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
            if (this.f5522b.equals(trackGroup.f5522b) && Arrays.equals(this.d, trackGroup.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f5524e == 0) {
            this.f5524e = Arrays.hashCode(this.d) + a.b(this.f5522b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        }
        return this.f5524e;
    }
}
