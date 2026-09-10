package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.X3;
import com.unity3d.services.core.configuration.ExperimentsBase;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/FeatureFlagsKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class FeatureFlagsKt {
    public static final FeatureFlagsKt INSTANCE = new FeatureFlagsKt();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 Y2\u00020\u0001:\u0001YB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u000bJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u000bJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u000bJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR$\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010%\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R$\u0010(\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R$\u0010+\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R$\u0010.\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R$\u00101\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u0010!R$\u00104\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!R$\u00107\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u0010!R$\u0010:\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010\u001f\"\u0004\b9\u0010!R$\u0010=\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010\u001f\"\u0004\b<\u0010!R$\u0010@\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010\u001f\"\u0004\b?\u0010!R$\u0010C\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010\u001f\"\u0004\bB\u0010!R$\u0010F\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010\u001f\"\u0004\bE\u0010!R$\u0010I\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010\u001f\"\u0004\bH\u0010!R$\u0010L\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010\u001f\"\u0004\bK\u0010!R$\u0010R\u001a\u00020M2\u0006\u0010\u001d\u001a\u00020M8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010X\u001a\u00020S2\u0006\u0010\u001d\u001a\u00020S8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lgatewayprotocol/v1/FeatureFlagsKt$Dsl;", "", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags$Builder;)V", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "_build", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "Lwj/r;", "clearOpenglGpuEnabled", "()V", "clearOpportunityIdPlacementValidation", "clearBoldSdkNextSessionEnabled", "clearAppSheetBugCheckEnabled", "clearRecoverTerminatedWebviews", "clearShouldHandleWebviewCaching", "clearShouldSendIapHistory", "clearCollectIlrData", "clearDisableGridCollection", "clearDisableCustomScheme", "clearUseFilesDir", "clearUseTryCatchInDownloadQueue", "clearEnsureCacheFolderExistences", "clearWebviewLessLoadParallelActivityLaunch", "clearCollectLifecycleEvents", "clearNativeStartMode", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags$Builder;", "", X3.i.X, "getOpenglGpuEnabled", "()Z", "setOpenglGpuEnabled", "(Z)V", "openglGpuEnabled", "getOpportunityIdPlacementValidation", "setOpportunityIdPlacementValidation", "opportunityIdPlacementValidation", "getBoldSdkNextSessionEnabled", "setBoldSdkNextSessionEnabled", ExperimentsBase.EXP_TAG_IS_BOLD_NEXT_SESSION, "getAppSheetBugCheckEnabled", "setAppSheetBugCheckEnabled", "appSheetBugCheckEnabled", "getRecoverTerminatedWebviews", "setRecoverTerminatedWebviews", "recoverTerminatedWebviews", "getShouldHandleWebviewCaching", "setShouldHandleWebviewCaching", "shouldHandleWebviewCaching", "getShouldSendIapHistory", "setShouldSendIapHistory", "shouldSendIapHistory", "getCollectIlrData", "setCollectIlrData", "collectIlrData", "getDisableGridCollection", "setDisableGridCollection", "disableGridCollection", "getDisableCustomScheme", "setDisableCustomScheme", "disableCustomScheme", "getUseFilesDir", "setUseFilesDir", "useFilesDir", "getUseTryCatchInDownloadQueue", "setUseTryCatchInDownloadQueue", "useTryCatchInDownloadQueue", "getEnsureCacheFolderExistences", "setEnsureCacheFolderExistences", "ensureCacheFolderExistences", "getWebviewLessLoadParallelActivityLaunch", "setWebviewLessLoadParallelActivityLaunch", "webviewLessLoadParallelActivityLaunch", "getCollectLifecycleEvents", "setCollectLifecycleEvents", "collectLifecycleEvents", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeStartMode;", "getNativeStartMode", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeStartMode;", "setNativeStartMode", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeStartMode;)V", "nativeStartMode", "", "getNativeStartModeValue", "()I", "setNativeStartModeValue", "(I)V", "nativeStartModeValue", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final NativeConfigurationOuterClass.FeatureFlags.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/FeatureFlagsKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/FeatureFlagsKt$Dsl;", "builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.FeatureFlags.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.FeatureFlags.Builder builder, kotlin.jvm.internal.g gVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.FeatureFlags _build() {
            NativeConfigurationOuterClass.FeatureFlags featureFlagsBuild = this._builder.build();
            kotlin.jvm.internal.n.e(featureFlagsBuild, "_builder.build()");
            return featureFlagsBuild;
        }

        public final void clearAppSheetBugCheckEnabled() {
            this._builder.clearAppSheetBugCheckEnabled();
        }

        public final void clearBoldSdkNextSessionEnabled() {
            this._builder.clearBoldSdkNextSessionEnabled();
        }

        public final void clearCollectIlrData() {
            this._builder.clearCollectIlrData();
        }

        public final void clearCollectLifecycleEvents() {
            this._builder.clearCollectLifecycleEvents();
        }

        public final void clearDisableCustomScheme() {
            this._builder.clearDisableCustomScheme();
        }

        public final void clearDisableGridCollection() {
            this._builder.clearDisableGridCollection();
        }

        public final void clearEnsureCacheFolderExistences() {
            this._builder.clearEnsureCacheFolderExistences();
        }

        public final void clearNativeStartMode() {
            this._builder.clearNativeStartMode();
        }

        public final void clearOpenglGpuEnabled() {
            this._builder.clearOpenglGpuEnabled();
        }

        public final void clearOpportunityIdPlacementValidation() {
            this._builder.clearOpportunityIdPlacementValidation();
        }

        public final void clearRecoverTerminatedWebviews() {
            this._builder.clearRecoverTerminatedWebviews();
        }

        public final void clearShouldHandleWebviewCaching() {
            this._builder.clearShouldHandleWebviewCaching();
        }

        public final void clearShouldSendIapHistory() {
            this._builder.clearShouldSendIapHistory();
        }

        public final void clearUseFilesDir() {
            this._builder.clearUseFilesDir();
        }

        public final void clearUseTryCatchInDownloadQueue() {
            this._builder.clearUseTryCatchInDownloadQueue();
        }

        public final void clearWebviewLessLoadParallelActivityLaunch() {
            this._builder.clearWebviewLessLoadParallelActivityLaunch();
        }

        public final boolean getAppSheetBugCheckEnabled() {
            return this._builder.getAppSheetBugCheckEnabled();
        }

        public final boolean getBoldSdkNextSessionEnabled() {
            return this._builder.getBoldSdkNextSessionEnabled();
        }

        public final boolean getCollectIlrData() {
            return this._builder.getCollectIlrData();
        }

        public final boolean getCollectLifecycleEvents() {
            return this._builder.getCollectLifecycleEvents();
        }

        public final boolean getDisableCustomScheme() {
            return this._builder.getDisableCustomScheme();
        }

        public final boolean getDisableGridCollection() {
            return this._builder.getDisableGridCollection();
        }

        public final boolean getEnsureCacheFolderExistences() {
            return this._builder.getEnsureCacheFolderExistences();
        }

        public final NativeConfigurationOuterClass.NativeStartMode getNativeStartMode() {
            NativeConfigurationOuterClass.NativeStartMode nativeStartMode = this._builder.getNativeStartMode();
            kotlin.jvm.internal.n.e(nativeStartMode, "_builder.getNativeStartMode()");
            return nativeStartMode;
        }

        public final int getNativeStartModeValue() {
            return this._builder.getNativeStartModeValue();
        }

        public final boolean getOpenglGpuEnabled() {
            return this._builder.getOpenglGpuEnabled();
        }

        public final boolean getOpportunityIdPlacementValidation() {
            return this._builder.getOpportunityIdPlacementValidation();
        }

        public final boolean getRecoverTerminatedWebviews() {
            return this._builder.getRecoverTerminatedWebviews();
        }

        public final boolean getShouldHandleWebviewCaching() {
            return this._builder.getShouldHandleWebviewCaching();
        }

        public final boolean getShouldSendIapHistory() {
            return this._builder.getShouldSendIapHistory();
        }

        public final boolean getUseFilesDir() {
            return this._builder.getUseFilesDir();
        }

        public final boolean getUseTryCatchInDownloadQueue() {
            return this._builder.getUseTryCatchInDownloadQueue();
        }

        public final boolean getWebviewLessLoadParallelActivityLaunch() {
            return this._builder.getWebviewLessLoadParallelActivityLaunch();
        }

        public final void setAppSheetBugCheckEnabled(boolean z10) {
            this._builder.setAppSheetBugCheckEnabled(z10);
        }

        public final void setBoldSdkNextSessionEnabled(boolean z10) {
            this._builder.setBoldSdkNextSessionEnabled(z10);
        }

        public final void setCollectIlrData(boolean z10) {
            this._builder.setCollectIlrData(z10);
        }

        public final void setCollectLifecycleEvents(boolean z10) {
            this._builder.setCollectLifecycleEvents(z10);
        }

        public final void setDisableCustomScheme(boolean z10) {
            this._builder.setDisableCustomScheme(z10);
        }

        public final void setDisableGridCollection(boolean z10) {
            this._builder.setDisableGridCollection(z10);
        }

        public final void setEnsureCacheFolderExistences(boolean z10) {
            this._builder.setEnsureCacheFolderExistences(z10);
        }

        public final void setNativeStartMode(NativeConfigurationOuterClass.NativeStartMode value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setNativeStartMode(value);
        }

        public final void setNativeStartModeValue(int i10) {
            this._builder.setNativeStartModeValue(i10);
        }

        public final void setOpenglGpuEnabled(boolean z10) {
            this._builder.setOpenglGpuEnabled(z10);
        }

        public final void setOpportunityIdPlacementValidation(boolean z10) {
            this._builder.setOpportunityIdPlacementValidation(z10);
        }

        public final void setRecoverTerminatedWebviews(boolean z10) {
            this._builder.setRecoverTerminatedWebviews(z10);
        }

        public final void setShouldHandleWebviewCaching(boolean z10) {
            this._builder.setShouldHandleWebviewCaching(z10);
        }

        public final void setShouldSendIapHistory(boolean z10) {
            this._builder.setShouldSendIapHistory(z10);
        }

        public final void setUseFilesDir(boolean z10) {
            this._builder.setUseFilesDir(z10);
        }

        public final void setUseTryCatchInDownloadQueue(boolean z10) {
            this._builder.setUseTryCatchInDownloadQueue(z10);
        }

        public final void setWebviewLessLoadParallelActivityLaunch(boolean z10) {
            this._builder.setWebviewLessLoadParallelActivityLaunch(z10);
        }

        private Dsl(NativeConfigurationOuterClass.FeatureFlags.Builder builder) {
            this._builder = builder;
        }
    }

    private FeatureFlagsKt() {
    }
}
