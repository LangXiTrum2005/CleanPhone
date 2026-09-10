package com.unity3d.ads.core.data.datasource;

import an.h;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.unity3d.ads.core.log.Logger;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidAdQualityVersionDataSource;", "Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "(Lcom/unity3d/ads/core/log/Logger;)V", "invoke", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidAdQualityVersionDataSource implements AdQualityVersionDataSource {
    private final Logger logger;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidAdQualityVersionDataSource$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass2 extends o implements jk.a {
        final /* synthetic */ NoClassDefFoundError $e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NoClassDefFoundError noClassDefFoundError) {
            super(0);
            this.$e = noClassDefFoundError;
        }

        @Override // jk.a
        public final String invoke() {
            return "Ad Quality SDK not available: " + this.$e.getMessage();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidAdQualityVersionDataSource$invoke$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass3 extends o implements jk.a {
        final /* synthetic */ ClassNotFoundException $e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ClassNotFoundException classNotFoundException) {
            super(0);
            this.$e = classNotFoundException;
        }

        @Override // jk.a
        public final String invoke() {
            return "Ad Quality SDK not available: " + this.$e.getMessage();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidAdQualityVersionDataSource$invoke$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass4 extends o implements jk.a {
        final /* synthetic */ NoSuchMethodError $e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(NoSuchMethodError noSuchMethodError) {
            super(0);
            this.$e = noSuchMethodError;
        }

        @Override // jk.a
        public final String invoke() {
            return "Ad Quality SDK not available: " + this.$e.getMessage();
        }
    }

    public AndroidAdQualityVersionDataSource(Logger logger) {
        n.f(logger, "logger");
        this.logger = logger;
    }

    @Override // com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource
    public String invoke() {
        try {
            String sDKVersion = IronSourceAdQuality.getSDKVersion();
            if (sDKVersion == null || h.y0(sDKVersion)) {
                return null;
            }
            return sDKVersion;
        } catch (ClassNotFoundException e10) {
            this.logger.debug(new AnonymousClass3(e10));
            return null;
        } catch (NoClassDefFoundError e11) {
            this.logger.debug(new AnonymousClass2(e11));
            return null;
        } catch (NoSuchMethodError e12) {
            this.logger.debug(new AnonymousClass4(e12));
            return null;
        } catch (Throwable th2) {
            this.logger.error("Failed to get Ad Quality version", th2);
            return null;
        }
    }
}
