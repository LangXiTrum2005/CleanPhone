package com.google.android.play.core.review;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.2 */
/* JADX INFO: loaded from: classes3.dex */
public final class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Map f21488attabal;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        f21488attabal = new HashMap();
        new collectively.taiyuan("PlayCoreVersion");
    }

    public static synchronized Map attabal() {
        Map map;
        map = f21488attabal;
        map.put("java", 20002);
        return map;
    }
}
