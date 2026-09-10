package com.vungle.ads.internal.downloader;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.X3;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetDownloadListener.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0002\u0013\u0014J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/vungle/ads/internal/downloader/attabal;", "", "Lcom/vungle/ads/internal/downloader/attabal$attabal;", "error", "Lcom/vungle/ads/internal/downloader/DownloadRequest;", "downloadRequest", "", "onError", "(Lcom/vungle/ads/internal/downloader/attabal$attabal;Lcom/vungle/ads/internal/downloader/DownloadRequest;)V", "Ljava/io/File;", X3.i.b, "onSuccess", "(Ljava/io/File;Lcom/vungle/ads/internal/downloader/DownloadRequest;)V", "Lcom/vungle/ads/internal/downloader/attabal$saneness;", NotificationCompat.CATEGORY_PROGRESS, "onProgress", "(Lcom/vungle/ads/internal/downloader/attabal$saneness;Lcom/vungle/ads/internal/downloader/DownloadRequest;)V", "onStart", "(Lcom/vungle/ads/internal/downloader/DownloadRequest;)V", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface attabal {

    /* JADX INFO: renamed from: com.vungle.ads.internal.downloader.attabal$attabal, reason: collision with other inner class name and from toString */
    /* JADX INFO: compiled from: AssetDownloadListener.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/vungle/ads/internal/downloader/attabal$attabal;", "", "", "serverCode", "", "cause", "reason", "<init>", "(ILjava/lang/Throwable;I)V", "", "toString", "()Ljava/lang/String;", "I", "getServerCode", "()I", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "getReason", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class DownloadError {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int DEFAULT_SERVER_CODE = -1;
        private final Throwable cause;

        @saneness
        private final int reason;
        private final int serverCode;

        /* JADX INFO: renamed from: com.vungle.ads.internal.downloader.attabal$attabal$attabal, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: AssetDownloadListener.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/vungle/ads/internal/downloader/attabal$attabal$attabal;", "", "<init>", "()V", "Lcom/vungle/ads/internal/downloader/attabal$attabal;", "error", "", "shouldRetry", "(Lcom/vungle/ads/internal/downloader/attabal$attabal;)Z", "", "DEFAULT_SERVER_CODE", "I", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final boolean shouldRetry(DownloadError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                if (error.getReason() != saneness.INSTANCE.getREQUEST_ERROR()) {
                    return false;
                }
                int serverCode = error.getServerCode();
                if (serverCode != -1 && serverCode != 408 && serverCode != 500) {
                    switch (serverCode) {
                        case 502:
                        case PglCryptUtils.COMPRESS_FAILED /* 503 */:
                        case PglCryptUtils.BASE64_FAILED /* 504 */:
                            break;
                        default:
                            return false;
                    }
                }
                return true;
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.downloader.attabal$attabal$saneness */
        /* JADX INFO: compiled from: AssetDownloadListener.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0086\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/downloader/attabal$attabal$saneness;", "", "<init>", "()V", "Companion", "attabal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @Retention(RetentionPolicy.RUNTIME)
        public @interface saneness {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = Companion.$$INSTANCE;

            /* JADX INFO: renamed from: com.vungle.ads.internal.downloader.attabal$attabal$saneness$attabal, reason: collision with other inner class name and from kotlin metadata */
            /* JADX INFO: compiled from: AssetDownloadListener.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/internal/downloader/attabal$attabal$saneness$attabal;", "", "<init>", "()V", "", "REQUEST_ERROR", "I", "getREQUEST_ERROR", "()I", "setREQUEST_ERROR", "(I)V", "DISK_ERROR", "getDISK_ERROR", "setDISK_ERROR", "FILE_NOT_FOUND_ERROR", "getFILE_NOT_FOUND_ERROR", "setFILE_NOT_FOUND_ERROR", "INTERNAL_ERROR", "getINTERNAL_ERROR", "setINTERNAL_ERROR", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final class Companion {
                static final /* synthetic */ Companion $$INSTANCE = new Companion();
                private static int REQUEST_ERROR = 1;
                private static int DISK_ERROR = 2;
                private static int FILE_NOT_FOUND_ERROR = 3;
                private static int INTERNAL_ERROR = 4;

                private Companion() {
                }

                public final int getDISK_ERROR() {
                    return DISK_ERROR;
                }

                public final int getFILE_NOT_FOUND_ERROR() {
                    return FILE_NOT_FOUND_ERROR;
                }

                public final int getINTERNAL_ERROR() {
                    return INTERNAL_ERROR;
                }

                public final int getREQUEST_ERROR() {
                    return REQUEST_ERROR;
                }

                public final void setDISK_ERROR(int i) {
                    DISK_ERROR = i;
                }

                public final void setFILE_NOT_FOUND_ERROR(int i) {
                    FILE_NOT_FOUND_ERROR = i;
                }

                public final void setINTERNAL_ERROR(int i) {
                    INTERNAL_ERROR = i;
                }

                public final void setREQUEST_ERROR(int i) {
                    REQUEST_ERROR = i;
                }
            }
        }

        public DownloadError(int i, Throwable cause, int i2) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.serverCode = i;
            this.cause = cause;
            this.reason = i2;
        }

        public final Throwable getCause() {
            return this.cause;
        }

        public final int getReason() {
            return this.reason;
        }

        public final int getServerCode() {
            return this.serverCode;
        }

        public String toString() {
            return "DownloadError(serverCode=" + this.serverCode + ", reason=" + this.reason + ", cause=" + this.cause + ')';
        }
    }

    void onError(DownloadError error, DownloadRequest downloadRequest);

    void onProgress(Progress progress, DownloadRequest downloadRequest);

    void onStart(DownloadRequest downloadRequest);

    void onSuccess(File file, DownloadRequest downloadRequest);

    /* JADX INFO: renamed from: com.vungle.ads.internal.downloader.attabal$saneness, reason: from toString */
    /* JADX INFO: compiled from: AssetDownloadListener.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010\t\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\"\u0010\u001c\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018¨\u0006 "}, d2 = {"Lcom/vungle/ads/internal/downloader/attabal$saneness;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "status", "I", "getStatus", "()I", "setStatus", "(I)V", "getStatus$annotations", "progressPercent", "getProgressPercent", "setProgressPercent", "", "timestampDownloadStart", "J", "getTimestampDownloadStart", "()J", "setTimestampDownloadStart", "(J)V", "readBytes", "getReadBytes", "setReadBytes", "sizeBytes", "getSizeBytes", "setSizeBytes", "attabal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Progress {

        /* JADX INFO: renamed from: progressPercent, reason: from kotlin metadata and from toString */
        private int percent;

        /* JADX INFO: renamed from: readBytes, reason: from kotlin metadata and from toString */
        private long readed;

        /* JADX INFO: renamed from: sizeBytes, reason: from kotlin metadata and from toString */
        private long total;
        private int status;

        /* JADX INFO: renamed from: timestampDownloadStart, reason: from kotlin metadata and from toString */
        private long startAt;

        /* JADX INFO: renamed from: com.vungle.ads.internal.downloader.attabal$saneness$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AssetDownloadListener.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0086\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/downloader/attabal$saneness$attabal;", "", "<init>", "()V", "Companion", "attabal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @Retention(RetentionPolicy.RUNTIME)
        public @interface InterfaceC0560attabal {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = Companion.$$INSTANCE;

            /* JADX INFO: renamed from: com.vungle.ads.internal.downloader.attabal$saneness$attabal$attabal, reason: collision with other inner class name and from kotlin metadata */
            /* JADX INFO: compiled from: AssetDownloadListener.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/vungle/ads/internal/downloader/attabal$saneness$attabal$attabal;", "", "<init>", "()V", "", "STARTED", "I", "getSTARTED", "()I", "setSTARTED", "(I)V", "IN_PROGRESS", "getIN_PROGRESS", "setIN_PROGRESS", "CANCELLED", "getCANCELLED", "setCANCELLED", "DONE", "getDONE", "setDONE", "ERROR", "getERROR", "setERROR", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final class Companion {
                private static int STARTED;
                static final /* synthetic */ Companion $$INSTANCE = new Companion();
                private static int IN_PROGRESS = 1;
                private static int CANCELLED = 3;
                private static int DONE = 4;
                private static int ERROR = 7;

                private Companion() {
                }

                public final int getCANCELLED() {
                    return CANCELLED;
                }

                public final int getDONE() {
                    return DONE;
                }

                public final int getERROR() {
                    return ERROR;
                }

                public final int getIN_PROGRESS() {
                    return IN_PROGRESS;
                }

                public final int getSTARTED() {
                    return STARTED;
                }

                public final void setCANCELLED(int i) {
                    CANCELLED = i;
                }

                public final void setDONE(int i) {
                    DONE = i;
                }

                public final void setERROR(int i) {
                    ERROR = i;
                }

                public final void setIN_PROGRESS(int i) {
                    IN_PROGRESS = i;
                }

                public final void setSTARTED(int i) {
                    STARTED = i;
                }
            }
        }

        /* JADX INFO: renamed from: getProgressPercent, reason: from getter */
        public final int getPercent() {
            return this.percent;
        }

        /* JADX INFO: renamed from: getReadBytes, reason: from getter */
        public final long getReaded() {
            return this.readed;
        }

        /* JADX INFO: renamed from: getSizeBytes, reason: from getter */
        public final long getTotal() {
            return this.total;
        }

        public final int getStatus() {
            return this.status;
        }

        /* JADX INFO: renamed from: getTimestampDownloadStart, reason: from getter */
        public final long getStartAt() {
            return this.startAt;
        }

        public final void setProgressPercent(int i) {
            this.percent = i;
        }

        public final void setReadBytes(long j) {
            this.readed = j;
        }

        public final void setSizeBytes(long j) {
            this.total = j;
        }

        public final void setStatus(int i) {
            this.status = i;
        }

        public final void setTimestampDownloadStart(long j) {
            this.startAt = j;
        }

        public String toString() {
            return "Progress(status=" + this.status + ", percent=" + this.percent + ", startAt=" + this.startAt + ", readed=" + this.readed + ", total=" + this.total + ')';
        }

        @InterfaceC0560attabal
        public static /* synthetic */ void getStatus$annotations() {
        }
    }
}
