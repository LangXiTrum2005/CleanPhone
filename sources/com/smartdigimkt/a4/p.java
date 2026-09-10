package com.smartdigimkt.a4;

import android.util.Pair;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f33668a = "LicenseDurationRemaining";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f33669b = "PlaybackDurationRemaining";

    private p() {
    }

    public static Pair<Long, Long> a(f<?> fVar) {
        Map<String, String> mapE = fVar.e();
        if (mapE == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(mapE, "LicenseDurationRemaining")), Long.valueOf(a(mapE, "PlaybackDurationRemaining")));
    }

    private static long a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }
}
