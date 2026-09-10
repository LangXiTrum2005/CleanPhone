package com.unity3d.ironsourceads;

import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class InitRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<IronSourceAds.AdFormat> f38428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LogLevel f38429c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f38430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<? extends IronSourceAds.AdFormat> f38431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private LogLevel f38432c;

        public Builder(String appKey) {
            n.f(appKey, "appKey");
            this.f38430a = appKey;
        }

        public final InitRequest build() {
            String str = this.f38430a;
            List list = this.f38431b;
            if (list == null) {
                list = v.f53866a;
            }
            LogLevel logLevel = this.f38432c;
            if (logLevel == null) {
                logLevel = LogLevel.NONE;
            }
            return new InitRequest(str, list, logLevel, null);
        }

        public final String getAppKey() {
            return this.f38430a;
        }

        public final Builder withLegacyAdFormats(List<? extends IronSourceAds.AdFormat> legacyAdFormats) {
            n.f(legacyAdFormats, "legacyAdFormats");
            this.f38431b = legacyAdFormats;
            return this;
        }

        public final Builder withLogLevel(LogLevel logLevel) {
            n.f(logLevel, "logLevel");
            this.f38432c = logLevel;
            return this;
        }
    }

    public /* synthetic */ InitRequest(String str, List list, LogLevel logLevel, g gVar) {
        this(str, list, logLevel);
    }

    public final String getAppKey() {
        return this.f38427a;
    }

    public final List<IronSourceAds.AdFormat> getLegacyAdFormats() {
        return this.f38428b;
    }

    public final LogLevel getLogLevel() {
        return this.f38429c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InitRequest(String str, List<? extends IronSourceAds.AdFormat> list, LogLevel logLevel) {
        this.f38427a = str;
        this.f38428b = list;
        this.f38429c = logLevel;
    }
}
