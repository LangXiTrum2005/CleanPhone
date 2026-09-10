package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.ironsource.C0375hc;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResponse;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.same.d;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.c;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.tracker.network.p;
import com.mbridge.msdk.tracker.network.toolbox.OKHTTPEventListener;
import defpackage.e;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class OkHTTPFileDownloadTask implements IDownloadTask {
    private static final String CLOSE = "close";
    private static final String CONNECTION = "Connection";
    private static final String FORMAT_RANGE = "bytes=%d-";
    private static final String RESPONSE_BODY_IS_NULL = "response body is null";
    private static final String RESPONSE_CODE = "responseCode ";
    private static final String RESPONSE_CONTENT_LENGTH_IS_NULL = "response content length is null";
    private static final String RESPONSE_INPUTSTREAM_IS_NULL = "response inputStream is null";
    private static final String RESPONSE_IS_NULL = "response is null";
    private final IDatabaseHelper _databaseHelper;
    private volatile DownloadMessage _downloadMessage;
    private DownloadModel _downloadModel;
    private final DownloadRequest _downloadRequest;
    private DownloadResponse _downloadResponse;
    private DownloaderReporter.Builder _downloaderReporter;
    private String _etag = "";
    private InputStream _inputStream;
    private DownloadFileOutputStream _outputStream;
    private b0 _responseBody;
    private p monitor;

    private OkHTTPFileDownloadTask(DownloadRequest downloadRequest, DownloadModel downloadModel, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage, DownloaderReporter.Builder builder) {
        this._downloadRequest = downloadRequest;
        this._downloadModel = downloadModel;
        this._databaseHelper = iDatabaseHelper;
        this._downloadMessage = downloadMessage;
        this._downloaderReporter = builder;
    }

    public static IDownloadTask create(DownloadRequest downloadRequest, DownloadModel downloadModel, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage, DownloaderReporter.Builder builder) {
        if (Objects.isNull(builder)) {
            builder = new DownloaderReporter.Builder(DownloadCommon.DOWNLOAD_REPORT_KEY);
        }
        return new OkHTTPFileDownloadTask(downloadRequest, downloadModel, iDatabaseHelper, downloadMessage, builder);
    }

    /* JADX WARN: Failed to calculate best type for var: r2v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v16 ??, new type: com.mbridge.msdk.foundation.download.DownloadResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v17 ??, new type: com.mbridge.msdk.foundation.download.DownloadResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v22 ??, new type: com.mbridge.msdk.foundation.download.DownloadResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v23 ??, new type: com.mbridge.msdk.foundation.download.DownloadResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v24 ??, new type: com.mbridge.msdk.foundation.download.DownloadResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v25 ??, new type: com.mbridge.msdk.foundation.download.DownloadResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v26 ??, new type: com.mbridge.msdk.foundation.download.DownloadResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v36 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v36 ??, new type: com.mbridge.msdk.foundation.download.DownloadResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v0 ??, new type: com.mbridge.msdk.foundation.download.DownloadResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v0 ??, new type: com.mbridge.msdk.foundation.download.DownloadResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v20 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v2 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    private com.mbridge.msdk.foundation.download.DownloadResponse handleInputStream(java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37) throws java.io.IOException, java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 703
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.core.OkHTTPFileDownloadTask.handleInputStream(java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.mbridge.msdk.foundation.download.DownloadResponse");
    }

    private void handlerException(String str, String str2, String str3, Exception exc) {
        try {
            if (Objects.isNotNull(this._databaseHelper) && Objects.isNotNull(this._downloadRequest)) {
                if (!s0.a().a("r_f_s_d_e", true)) {
                    this._databaseHelper.remove(str3, str2);
                    MBResourceManager.getInstance().deleteFile(new File(this._downloadRequest.getCacheDirectoryPath() + this._downloadMessage.getSaveFileName()));
                }
                this._downloadRequest.setDownloadedBytes(0L);
                this._downloadRequest.setTotalBytes(0L);
            }
        } catch (Exception e10) {
            GlobalComponent.getInstance().getLogger().log(IDownloadTask.TAG, e10.getMessage());
        }
        this._downloadResponse.setError(exc);
    }

    private DownloadResponse handlerRequestSuccessful(String str, String str2, String str3, a0 a0Var, int i10) throws IllegalAccessException, IOException {
        DownloadResponse downloadResponse = new DownloadResponse();
        boolean zIsSupportResume = isSupportResume(i10, this._downloadModel);
        boolean z10 = (a0Var == null || this._downloadRequest == null || i10 != 206 || a0Var.d() == null || this._downloadRequest.getTotalBytes() <= 0 || a0Var.d().k() == this._downloadRequest.getTotalBytes() - this._downloadRequest.getDownloadedBytes()) ? false : true;
        if (!zIsSupportResume && z10) {
            this._downloadRequest.setDownloadedBytes(0L);
            this._downloadRequest.setTotalBytes(0L);
            if (Objects.isNotNull(this._databaseHelper)) {
                this._databaseHelper.remove(str3, str2);
            }
            this._downloadModel = null;
            MBResourceManager.getInstance().deleteFile(new File(this._downloadRequest.getCacheDirectoryPath() + this._downloadMessage.getSaveFileName()));
        }
        b0 b0VarD = a0Var.d();
        this._responseBody = b0VarD;
        if (Objects.isNull(b0VarD)) {
            downloadResponse.setError(new IOException(RESPONSE_BODY_IS_NULL));
            this._downloadRequest.setTotalBytes(0L);
            this._downloadRequest.setDownloadedBytes(0L);
            return downloadResponse;
        }
        long jK = this._responseBody.k();
        if (jK <= 0) {
            downloadResponse.setError(new IOException(RESPONSE_CONTENT_LENGTH_IS_NULL));
            return downloadResponse;
        }
        if (this._downloadRequest.getTotalBytes() == 0) {
            this._downloadRequest.setTotalBytes(jK);
        }
        InputStream inputStreamD = this._responseBody.d();
        this._inputStream = inputStreamD;
        if (Objects.isNull(inputStreamD)) {
            downloadResponse.setError(new IOException(RESPONSE_INPUTSTREAM_IS_NULL));
            return downloadResponse;
        }
        this._downloadMessage.setContentLength(this._downloadRequest.getTotalBytes());
        this._downloadRequest.handlerResponseStartEvent(this._downloadMessage);
        return handleInputStream(str, str2, str3, this._etag);
    }

    private boolean isSupportResume(int i10, DownloadModel downloadModel) {
        if (i10 != 206 || TextUtils.isEmpty(this._etag)) {
            return false;
        }
        return downloadModel == null || TextUtils.equals(this._etag, downloadModel.getEtag());
    }

    private void reportDownloadMessage() {
        boolean zIsSuccessful = this._downloadResponse.isSuccessful();
        this._downloaderReporter.add("su", Boolean.toString(zIsSuccessful));
        boolean zIsCancelled = this._downloadResponse.isCancelled();
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_CANCEL, Boolean.toString(zIsCancelled));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE, String.valueOf(Utils.getDownloadRate(this._downloadRequest.getTotalBytes(), this._downloadRequest.getDownloadedBytes())));
        if (!zIsSuccessful && !zIsCancelled) {
            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_REASON, this._downloadResponse.getErrorMessage());
        }
        p pVar = this.monitor;
        if (pVar != null) {
            if (zIsSuccessful) {
                pVar.a(1);
            } else {
                String errorMessage = this._downloadResponse.getErrorMessage();
                DownloadError error = this._downloadResponse.getError();
                Exception exception = error == null ? null : error.getException();
                p pVar2 = this.monitor;
                if (zIsCancelled) {
                    exception = new IOException("download request canceled");
                }
                pVar2.a(exception);
                if (TextUtils.equals(errorMessage, "timeout")) {
                    this.monitor.a(3);
                } else {
                    this.monitor.a(2);
                }
            }
        }
        this._downloaderReporter.build().report();
    }

    private void sendProgress(DownloadRequest downloadRequest, DownloadMessage downloadMessage, long j10, long j11, int i10) {
        if (downloadRequest.getStatus() != DownloadStatus.CANCELLED) {
            if (downloadMessage != null) {
                downloadMessage.setCurrentDownloadRate(i10);
                downloadMessage.setContentLength(j11);
            }
            downloadRequest.handlerProcessEvent(downloadMessage, new DownloadProgress(j10, j11, i10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x01f4 A[Catch: all -> 0x01d5, Exception -> 0x01d9, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x01d5, blocks: (B:29:0x01b1, B:31:0x01b7, B:34:0x01c9, B:36:0x01d1, B:43:0x01e3, B:45:0x01f4, B:51:0x022d, B:53:0x023d, B:55:0x0244, B:65:0x026f), top: B:92:0x01b1 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0226  */
    /* JADX WARN: Code duplicated, block: B:51:0x022d A[Catch: all -> 0x01d5, Exception -> 0x0267, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x01d5, blocks: (B:29:0x01b1, B:31:0x01b7, B:34:0x01c9, B:36:0x01d1, B:43:0x01e3, B:45:0x01f4, B:51:0x022d, B:53:0x023d, B:55:0x0244, B:65:0x026f), top: B:92:0x01b1 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x02bc  */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x01f4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    @Override // com.mbridge.msdk.foundation.download.core.IDownloadTask
    public DownloadResponse run() throws Throwable {
        String str;
        this._downloadResponse = new DownloadResponse();
        if (this._downloadRequest.getStatus() == DownloadStatus.CANCELLED) {
            this._downloadResponse.setCancelled(true);
            return this._downloadResponse;
        }
        long totalBytes = this._downloadRequest.getTotalBytes();
        long downloadedBytes = this._downloadRequest.getDownloadedBytes();
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_CURRENT_RATE, String.valueOf(Utils.getDownloadRate(totalBytes, downloadedBytes)));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_DOWNLOAD_BYTES, String.valueOf(downloadedBytes));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_TOTAL_BYTES, String.valueOf(totalBytes));
        if (totalBytes != 0 && downloadedBytes != 0 && totalBytes == downloadedBytes) {
            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR_VALUE);
            this._downloaderReporter.build().report();
            this._downloadResponse.setSuccessful(true);
            return this._downloadResponse;
        }
        String saveFileName = this._downloadMessage.getSaveFileName();
        String cacheDirectoryPath = this._downloadRequest.getCacheDirectoryPath();
        String downloadId = this._downloadRequest.getDownloadId();
        String downloadUrl = this._downloadMessage.getDownloadUrl();
        p monitor = this._downloadRequest.getMonitor();
        this.monitor = monitor;
        if (monitor == null && this._downloadRequest.canTrack() && !TextUtils.isEmpty(downloadUrl)) {
            p pVar = new p(d.a((DownloadRequest<?>) this._downloadRequest), C0375hc.f28788a);
            this.monitor = pVar;
            pVar.f(downloadUrl);
            this._downloadRequest.setMonitor(this.monitor);
        }
        long timeout = this._downloadRequest.getTimeout();
        long connectTimeout = this._downloadRequest.getConnectTimeout();
        long readTimeout = this._downloadRequest.getReadTimeout();
        long writeTimeout = this._downloadRequest.getWriteTimeout();
        long requestQueueTime = this._downloadRequest.getRequestQueueTime();
        p pVar2 = this.monitor;
        if (pVar2 != null) {
            pVar2.i(timeout);
            this.monitor.e(connectTimeout);
            this.monitor.f(readTimeout);
            this.monitor.j(writeTimeout);
            this.monitor.d("queue");
            this.monitor.a(requestQueueTime);
        }
        Locale locale = Locale.ENGLISH;
        String strJ = e.j(downloadedBytes, "bytes=", "-");
        try {
            v.b bVarS = GlobalComponent.getInstance().getOkHttpClient().s();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            v vVarA = bVarS.b(connectTimeout, timeUnit).a(new MBridgeHostnameVerifier(downloadUrl)).d(readTimeout, timeUnit).e(writeTimeout, timeUnit).a(Math.max(0L, timeout), timeUnit).a(new OKHTTPEventListener(this.monitor)).b(true).a();
            String str2 = "close";
            y yVarA = new y.a().b(downloadUrl).a(new c.a().b().a()).a(CONNECTION, "close").a(Command.HTTP_HEADER_RANGE, strJ).a(Command.HTTP_HEADER_USER_AGENT).a(Command.HTTP_HEADER_USER_AGENT, Command.DEFAULT_USER_AGENT).a();
            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_HOST, yVarA.g().g());
            String str3 = "url";
            this._downloaderReporter.add("url", downloadUrl);
            com.mbridge.msdk.thrid.okhttp.d dVarA = vVarA.a(yVarA);
            a0 a0Var = null;
            try {
                try {
                    a0 a0VarD = dVarA.d();
                    try {
                        try {
                            try {
                                if (Objects.isNull(a0VarD) || Objects.isNull(a0VarD.d())) {
                                    this._downloadResponse.setError(new IOException(RESPONSE_IS_NULL));
                                    DownloadResponse downloadResponse = this._downloadResponse;
                                    Objects.closeInputStream(this._inputStream);
                                    Objects.closeOutputStream(this._outputStream);
                                    Objects.closeResponse(a0VarD);
                                    Objects.closeResponseBody(this._responseBody);
                                    if (!dVarA.h()) {
                                        dVarA.cancel();
                                    }
                                    reportDownloadMessage();
                                    return downloadResponse;
                                }
                                int iK = a0VarD.k();
                                p pVar3 = this.monitor;
                                if (pVar3 != null) {
                                    try {
                                        pVar3.b(iK);
                                        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RESPONSE_CODE, String.valueOf(iK));
                                        if (!a0VarD.n()) {
                                            this._downloadResponse.setError(new IOException(RESPONSE_CODE + iK));
                                            DownloadResponse downloadResponse2 = this._downloadResponse;
                                            Objects.closeInputStream(this._inputStream);
                                            Objects.closeOutputStream(this._outputStream);
                                            Objects.closeResponse(a0VarD);
                                            Objects.closeResponseBody(this._responseBody);
                                            if (!dVarA.h()) {
                                                dVarA.cancel();
                                            }
                                            reportDownloadMessage();
                                            return downloadResponse2;
                                        }
                                        this._etag = a0VarD.a(Command.HTTP_HEADER_ETAG, "");
                                        try {
                                            this._downloadResponse = handlerRequestSuccessful(saveFileName, cacheDirectoryPath, downloadId, a0VarD, iK);
                                            Objects.closeInputStream(this._inputStream);
                                            Objects.closeOutputStream(this._outputStream);
                                            Objects.closeResponse(a0VarD);
                                            Objects.closeResponseBody(this._responseBody);
                                            if (!dVarA.h()) {
                                                dVarA.cancel();
                                            }
                                        } catch (Exception e10) {
                                            e = e10;
                                            str2 = downloadId;
                                            str3 = cacheDirectoryPath;
                                            vVarA = saveFileName;
                                            a0Var = a0VarD;
                                            str = vVarA;
                                            handlerException(str, str3, str2, e);
                                            Objects.closeInputStream(this._inputStream);
                                            Objects.closeOutputStream(this._outputStream);
                                            Objects.closeResponse(a0Var);
                                            Objects.closeResponseBody(this._responseBody);
                                            if (!dVarA.h()) {
                                            }
                                            reportDownloadMessage();
                                            return this._downloadResponse;
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        a0Var = a0VarD;
                                        str = saveFileName;
                                        str3 = cacheDirectoryPath;
                                        str2 = downloadId;
                                        handlerException(str, str3, str2, e);
                                        Objects.closeInputStream(this._inputStream);
                                        Objects.closeOutputStream(this._outputStream);
                                        Objects.closeResponse(a0Var);
                                        Objects.closeResponseBody(this._responseBody);
                                        if (!dVarA.h()) {
                                        }
                                        reportDownloadMessage();
                                        return this._downloadResponse;
                                    }
                                } else {
                                    this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RESPONSE_CODE, String.valueOf(iK));
                                    if (!a0VarD.n()) {
                                        this._downloadResponse.setError(new IOException(RESPONSE_CODE + iK));
                                        DownloadResponse downloadResponse3 = this._downloadResponse;
                                        Objects.closeInputStream(this._inputStream);
                                        Objects.closeOutputStream(this._outputStream);
                                        Objects.closeResponse(a0VarD);
                                        Objects.closeResponseBody(this._responseBody);
                                        if (!dVarA.h()) {
                                            dVarA.cancel();
                                        }
                                        reportDownloadMessage();
                                        return downloadResponse3;
                                    }
                                    this._etag = a0VarD.a(Command.HTTP_HEADER_ETAG, "");
                                    this._downloadResponse = handlerRequestSuccessful(saveFileName, cacheDirectoryPath, downloadId, a0VarD, iK);
                                    Objects.closeInputStream(this._inputStream);
                                    Objects.closeOutputStream(this._outputStream);
                                    Objects.closeResponse(a0VarD);
                                    Objects.closeResponseBody(this._responseBody);
                                    if (!dVarA.h()) {
                                        dVarA.cancel();
                                    }
                                }
                                reportDownloadMessage();
                                return this._downloadResponse;
                            } catch (Exception e12) {
                                e = e12;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            vVarA = saveFileName;
                            str3 = cacheDirectoryPath;
                            str2 = downloadId;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        a0Var = a0VarD;
                        Objects.closeInputStream(this._inputStream);
                        Objects.closeOutputStream(this._outputStream);
                        Objects.closeResponse(a0Var);
                        Objects.closeResponseBody(this._responseBody);
                        if (!dVarA.h()) {
                            dVarA.cancel();
                        }
                        reportDownloadMessage();
                        throw th;
                    }
                    a0Var = a0VarD;
                    str = vVarA;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e14) {
                e = e14;
            }
            handlerException(str, str3, str2, e);
            Objects.closeInputStream(this._inputStream);
            Objects.closeOutputStream(this._outputStream);
            Objects.closeResponse(a0Var);
            Objects.closeResponseBody(this._responseBody);
            if (!dVarA.h()) {
                dVarA.cancel();
            }
            reportDownloadMessage();
            return this._downloadResponse;
        } catch (Exception e15) {
            handlerException(saveFileName, cacheDirectoryPath, downloadId, e15);
            this._downloadResponse.setSuccessful(false);
            return this._downloadResponse;
        }
    }
}
