package com.ironsource;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public enum H3 {
    Day(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, 86400000),
    Hour("h", 3600000),
    Second("s", 1000);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f26225c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26231b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final H3 a(String str) {
            for (H3 h7 : H3.values()) {
                if (kotlin.jvm.internal.n.a(h7.f26230a, str)) {
                    return h7;
                }
            }
            return null;
        }

        private a() {
        }
    }

    H3(String str, long j10) {
        this.f26230a = str;
        this.f26231b = j10;
    }

    public final long a(Integer num) {
        return ((long) (num != null ? num.intValue() : 1)) * this.f26231b;
    }

    public static /* synthetic */ long a(H3 h7, Integer num, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inMilliseconds");
        }
        if ((i10 & 1) != 0) {
            num = 1;
        }
        return h7.a(num);
    }
}
