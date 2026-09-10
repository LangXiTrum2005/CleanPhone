package com.unity3d.services.core.request.metrics;

import com.applovin.impl.ca;
import defpackage.e;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class ScarMetric {
    private static final String ASYNC_PREFIX = "async";
    private static final String HB_SIGNALS_FETCH_FAILURE = "native_hb_signals_%s_fetch_failure";
    private static final String HB_SIGNALS_FETCH_START = "native_hb_signals_%s_fetch_start";
    private static final String HB_SIGNALS_FETCH_SUCCESS = "native_hb_signals_%s_fetch_success";
    private static final String HB_SIGNALS_UPLOAD_FAILURE = "native_hb_signals_%s_upload_failure";
    private static final String HB_SIGNALS_UPLOAD_START = "native_hb_signals_%s_upload_start";
    private static final String HB_SIGNALS_UPLOAD_SUCCESS = "native_hb_signals_%s_upload_success";
    private static final String REASON = "reason";
    private static final String SYNC_PREFIX = "sync";
    private static long _fetchStartTime;
    private static long _uploadStartTime;

    private static long getTotalFetchTime() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - _fetchStartTime);
    }

    private static long getTotalUploadTime() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - _uploadStartTime);
    }

    public static Metric hbSignalsFetchFailure(boolean z10, String str) {
        return new Metric(e.o("native_hb_signals_", z10 ? ASYNC_PREFIX : "sync", "_fetch_failure"), Long.valueOf(getTotalFetchTime()), ca.n("reason", str));
    }

    public static Metric hbSignalsFetchStart(boolean z10) {
        _fetchStartTime = System.nanoTime();
        return new Metric(e.o("native_hb_signals_", z10 ? ASYNC_PREFIX : "sync", "_fetch_start"), null);
    }

    public static Metric hbSignalsFetchSuccess(boolean z10) {
        return new Metric(e.o("native_hb_signals_", z10 ? ASYNC_PREFIX : "sync", "_fetch_success"), Long.valueOf(getTotalFetchTime()));
    }

    public static Metric hbSignalsUploadFailure(boolean z10, String str) {
        return new Metric(e.o("native_hb_signals_", z10 ? ASYNC_PREFIX : "sync", "_upload_failure"), Long.valueOf(getTotalUploadTime()), ca.n("reason", str));
    }

    public static Metric hbSignalsUploadStart(boolean z10) {
        _uploadStartTime = System.nanoTime();
        return new Metric(e.o("native_hb_signals_", z10 ? ASYNC_PREFIX : "sync", "_upload_start"), null);
    }

    public static Metric hbSignalsUploadSuccess(boolean z10) {
        return new Metric(e.o("native_hb_signals_", z10 ? ASYNC_PREFIX : "sync", "_upload_success"), Long.valueOf(getTotalUploadTime()));
    }
}
