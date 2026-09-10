package com.adjust.sdk.google.lvl;

import android.content.Context;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.LicenseData;
import com.ironsource.Xa;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import na.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AdjustLicenseVerification {
    public static LicenseData fetchLicenseDate(Context context, ILogger iLogger, long j10) {
        ILogger iLogger2;
        try {
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(1);
            iLogger2 = iLogger;
            try {
                new LicenseChecker(context, new g(linkedBlockingQueue, 21), iLogger2, j10).checkAccess();
                return (LicenseData) linkedBlockingQueue.poll(Xa.C, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                e = e10;
                iLogger2.error("LVL License checker interrupted: ", e.getMessage());
                return null;
            }
        } catch (InterruptedException e11) {
            e = e11;
            iLogger2 = iLogger;
        }
    }
}
