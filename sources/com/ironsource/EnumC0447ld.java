package com.ironsource;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;

/* JADX INFO: renamed from: com.ironsource.ld, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC0447ld {
    PER_DAY(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D),
    PER_HOUR("h");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f29184a;

    EnumC0447ld(String str) {
        this.f29184a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f29184a;
    }
}
