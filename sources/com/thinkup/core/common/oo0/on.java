package com.thinkup.core.common.oo0;

import com.p004ironsource.x4;
import com.thinkup.core.common.ooo.o00;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class on {
    public static final int m = 10002;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f42285n = 10003;
    public static final int o = 10001;

    private static void o(int i2, int i3, Map<String, Object> map) {
        try {
            if (i2 != 2) {
                if (i2 == 15 || i2 == 46 || i2 == 92) {
                    if (i3 == 10002 || i3 == 10003) {
                        com.thinkup.core.common.ooo.oo.o().o(i2, map);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i3 != 10001 || map == null) {
                return;
            }
            long jM = o00.m(map, "init_st");
            long jM2 = o00.m(map, "init_et");
            long jM3 = o00.m(map, "token_st");
            long jM4 = o00.m(map, "token_et");
            oo.o(o00.o(map, "ad_format", x4.DISABLED_AUCTION_FALLBACK_ID), o00.o(map, "admob_init_adsource_id", ""), o00.o(map, "admob_token_adsource_id", ""), o00.o(map, "admob_init_mode", 0), jM, jM2, jM3, jM4, (jM <= 0 || jM2 <= 0 || jM3 <= 0 || jM4 <= 0 || jM <= jM3) ? -1L : jM2 - jM3);
        } catch (Throwable unused) {
        }
    }
}
