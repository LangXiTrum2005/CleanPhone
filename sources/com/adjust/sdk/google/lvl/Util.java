package com.adjust.sdk.google.lvl;

import android.content.Context;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.LicenseData;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class Util {
    public static synchronized LicenseData getLicenseRequiredData(Context context, ILogger iLogger, long j10) {
        return AdjustLicenseVerification.fetchLicenseDate(context, iLogger, j10);
    }
}
