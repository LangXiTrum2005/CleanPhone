package com.ironsource;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;

/* JADX INFO: renamed from: com.ironsource.hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC3551hd {
    PER_DAY(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D),
    PER_HOUR("h");

    public String a;

    EnumC3551hd(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.a;
    }
}
