package com.inmobi.media.core.config.models;

import com.inmobi.media.C2817c6;
import com.inmobi.media.H6;
import com.inmobi.media.Q4;
import com.inmobi.media.Qe;
import com.ironsource.T3;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 52\u00020\u0001:\u00066789:;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\bJ\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0016\u0010*\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010&R\u0016\u0010+\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010&R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u0006<"}, d2 = {"Lcom/inmobi/media/core/config/models/CrashConfig;", "Lcom/inmobi/media/core/config/models/Config;", "<init>", "()V", "", "setDefaultNetworkConfig", "", "getType", "()Ljava/lang/String;", "", "isValid", "()Z", "Lcom/inmobi/media/Qe$a;", "getMobileConfig", "()Lcom/inmobi/media/Qe$a;", "getWifiConfig", "", "getEventTTL", "()J", "getUrl", "", "getMaxEventsToPersist", "()I", "Lcom/inmobi/media/core/config/models/CrashConfig$ANRConfig;", "getANRConfig", "()Lcom/inmobi/media/core/config/models/CrashConfig$ANRConfig;", "Lcom/inmobi/media/core/config/models/CrashConfig$CrashIncidentConfig;", "getCrashConfig", "()Lcom/inmobi/media/core/config/models/CrashConfig$CrashIncidentConfig;", "Lcom/inmobi/media/core/config/models/CrashConfig$CatchConfig;", "getCatchConfig", "()Lcom/inmobi/media/core/config/models/CrashConfig$CatchConfig;", "Lcom/inmobi/media/c6;", "getEventConfig", "()Lcom/inmobi/media/c6;", "url", "Ljava/lang/String;", "processingInterval", "J", "maxRetryCount", "I", "maxEventsToPersist", "eventTTL", "txLatency", "Lcom/inmobi/media/Qe;", "networkType", "Lcom/inmobi/media/Qe;", "anr", "Lcom/inmobi/media/core/config/models/CrashConfig$ANRConfig;", "crashConfig", "Lcom/inmobi/media/core/config/models/CrashConfig$CrashIncidentConfig;", "catchConfig", "Lcom/inmobi/media/core/config/models/CrashConfig$CatchConfig;", "Companion", "com/inmobi/media/Q4", "ANRConfig", "AppExitReasonConfig", "WatchDogConfig", "CrashIncidentConfig", "CatchConfig", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CrashConfig extends Config {
    public static final Q4 Companion = new Q4();
    public static final long DEFAULT_ANR_WATCHDOG_INTERVAL = 4500;
    public static final long DEFAULT_APP_EXIT_REASON_WAIT_INTERVAL = 1000;
    public static final double DEFAULT_APP_EXIT_SAMPLING_PERCENT = 0.0d;
    public static final boolean DEFAULT_CATCH_ENABLED = false;
    public static final double DEFAULT_CATCH_SAMPLING_PERCENT = 0.0d;
    public static final boolean DEFAULT_CRASH_ENABLED = true;
    public static final double DEFAULT_CRASH_SAMPLING_PERCENT = 1.0d;
    public static final long DEFAULT_EVENT_TTL_SEC = 259200;
    public static final long DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL = 30000;
    public static final long DEFAULT_INGESTION_LATENCY_SEC = 86400;
    public static final int DEFAULT_MAX_BATCH_SIZE = 2;
    public static final int DEFAULT_MAX_EVENTS_TO_PERSIST = 50;
    public static final int DEFAULT_MAX_NO_OF_LINES = 200;
    public static final int DEFAULT_MAX_RETRIES = 3;
    public static final int DEFAULT_MIN_BATCH_SIZE = 1;
    public static final long DEFAULT_PROCESSING_INTERVAL_SEC = 60;
    public static final long DEFAULT_RETRY_INTERVAL_SEC = 10;
    public static final String DEFAULT_URL = "https://crash-metrics.sdk.inmobi.com/trace";
    public static final double DEFAULT_WATCHDOG_SAMPLING_PERCENT = 0.0d;
    private String url = DEFAULT_URL;
    private long processingInterval = 60;
    private int maxRetryCount = 3;
    private int maxEventsToPersist = 50;
    private long eventTTL = DEFAULT_EVENT_TTL_SEC;
    private long txLatency = 86400;
    private Qe networkType = new Qe();
    private ANRConfig anr = new ANRConfig();
    private CrashIncidentConfig crashConfig = new CrashIncidentConfig();
    private CatchConfig catchConfig = new CatchConfig();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/inmobi/media/core/config/models/CrashConfig$ANRConfig;", "", "<init>", "()V", "value", "Lcom/inmobi/media/core/config/models/CrashConfig$AppExitReasonConfig;", "appExitReason", "getAppExitReason", "()Lcom/inmobi/media/core/config/models/CrashConfig$AppExitReasonConfig;", "Lcom/inmobi/media/core/config/models/CrashConfig$WatchDogConfig;", "watchdog", "getWatchdog", "()Lcom/inmobi/media/core/config/models/CrashConfig$WatchDogConfig;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ANRConfig {
        private AppExitReasonConfig appExitReason = new AppExitReasonConfig();
        private WatchDogConfig watchdog = new WatchDogConfig();

        public final AppExitReasonConfig getAppExitReason() {
            return this.appExitReason;
        }

        public final WatchDogConfig getWatchdog() {
            return this.watchdog;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0013@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0017@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/inmobi/media/core/config/models/CrashConfig$AppExitReasonConfig;", "", "<init>", "()V", "value", "", "enabled", "getEnabled", "()Z", "reportToLogs", "getReportToLogs", "useForReporting", "getUseForReporting", "", "incidentWaitInterval", "getIncidentWaitInterval", "()J", "incompleteLogThresholdTime", "getIncompleteLogThresholdTime", "", "samplingPercent", "getSamplingPercent", "()D", "", "maxNumberOfLines", "getMaxNumberOfLines", "()I", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AppExitReasonConfig {
        private boolean enabled;
        private long incidentWaitInterval = 1000;
        private long incompleteLogThresholdTime = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        private int maxNumberOfLines = 200;
        private boolean reportToLogs;
        private double samplingPercent;
        private boolean useForReporting;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getIncidentWaitInterval() {
            return this.incidentWaitInterval;
        }

        public final long getIncompleteLogThresholdTime() {
            return this.incompleteLogThresholdTime;
        }

        public final int getMaxNumberOfLines() {
            return this.maxNumberOfLines;
        }

        public final boolean getReportToLogs() {
            return this.reportToLogs;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }

        public final boolean getUseForReporting() {
            return this.useForReporting;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/inmobi/media/core/config/models/CrashConfig$CatchConfig;", "", "<init>", "()V", "value", "", "enabled", "getEnabled", "()Z", "", "samplingPercent", "getSamplingPercent", "()D", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CatchConfig {
        private boolean enabled;
        private double samplingPercent;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/inmobi/media/core/config/models/CrashConfig$CrashIncidentConfig;", "", "<init>", "()V", "value", "", "enabled", "getEnabled", "()Z", "", "samplingPercent", "getSamplingPercent", "()D", "reportSessionInfo", "getReportSessionInfo", "reportOOMInfo", "getReportOOMInfo", "", "maxLengthOfStackTrace", "getMaxLengthOfStackTrace", "()I", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CrashIncidentConfig {
        private boolean reportOOMInfo;
        private boolean reportSessionInfo;
        private boolean enabled = true;
        private double samplingPercent = 1.0d;
        private int maxLengthOfStackTrace = Integer.MAX_VALUE;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxLengthOfStackTrace() {
            return this.maxLengthOfStackTrace;
        }

        public final boolean getReportOOMInfo() {
            return this.reportOOMInfo;
        }

        public final boolean getReportSessionInfo() {
            return this.reportSessionInfo;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/inmobi/media/core/config/models/CrashConfig$WatchDogConfig;", "", "<init>", "()V", "value", "", "enabled", "getEnabled", "()Z", "useForReporting", "getUseForReporting", "", "interval", "getInterval", "()J", "", "samplingPercent", "getSamplingPercent", "()D", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WatchDogConfig {
        private boolean enabled;
        private long interval = CrashConfig.DEFAULT_ANR_WATCHDOG_INTERVAL;
        private double samplingPercent;
        private boolean useForReporting;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getInterval() {
            return this.interval;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }

        public final boolean getUseForReporting() {
            return this.useForReporting;
        }
    }

    public CrashConfig() {
        setDefaultNetworkConfig();
    }

    private final void setDefaultNetworkConfig() {
        Qe qe = this.networkType;
        Qe.a aVar = new Qe.a();
        aVar.a(10L);
        aVar.c(1);
        aVar.b(2);
        qe.getClass();
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        qe.wifi = aVar;
        Qe qe2 = this.networkType;
        Qe.a aVar2 = new Qe.a();
        aVar2.a(10L);
        aVar2.c(1);
        aVar2.b(2);
        qe2.getClass();
        Intrinsics.checkNotNullParameter(aVar2, "<set-?>");
        qe2.others = aVar2;
    }

    /* JADX INFO: renamed from: getANRConfig, reason: from getter */
    public final ANRConfig getAnr() {
        return this.anr;
    }

    public final CatchConfig getCatchConfig() {
        return this.catchConfig;
    }

    public final CrashIncidentConfig getCrashConfig() {
        return this.crashConfig;
    }

    public final C2817c6 getEventConfig() {
        return new C2817c6(this.maxRetryCount, this.eventTTL, this.processingInterval, this.txLatency, getWifiConfig().b(), getWifiConfig().a(), getMobileConfig().b(), getMobileConfig().a(), getWifiConfig().c(), getMobileConfig().c());
    }

    public final long getEventTTL() {
        return this.eventTTL;
    }

    public final int getMaxEventsToPersist() {
        return this.maxEventsToPersist;
    }

    public final Qe.a getMobileConfig() {
        Qe.a aVar = this.networkType.others;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.preprohormone("others");
        return null;
    }

    @Override // com.inmobi.media.core.config.models.Config
    public String getType() {
        return "crashReporting";
    }

    public final String getUrl() {
        return this.url;
    }

    public final Qe.a getWifiConfig() {
        Qe.a aVar = this.networkType.wifi;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.preprohormone(T3.b);
        return null;
    }

    @Override // com.inmobi.media.core.config.models.Config
    public boolean isValid() {
        if (H6.a(this.url)) {
            return false;
        }
        long j = this.txLatency;
        if (j >= this.processingInterval && j <= this.eventTTL) {
            Qe qe = this.networkType;
            int i = this.maxEventsToPersist;
            Qe.a aVar = qe.wifi;
            Qe.a aVar2 = null;
            if (aVar == null) {
                Intrinsics.preprohormone(T3.b);
                aVar = null;
            }
            if (aVar.a(i)) {
                Qe.a aVar3 = qe.others;
                if (aVar3 != null) {
                    aVar2 = aVar3;
                } else {
                    Intrinsics.preprohormone("others");
                }
                if (aVar2.a(i) && this.processingInterval > 0 && this.maxRetryCount >= 0 && this.txLatency > 0 && this.eventTTL > 0 && this.maxEventsToPersist > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
