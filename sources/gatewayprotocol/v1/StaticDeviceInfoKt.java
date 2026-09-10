package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.X3;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\r2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt;", "", "<init>", "()V", "Lkotlin/Function1;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl;", "Lwj/r;", "block", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "-initializeandroid", "(Ljk/b;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "android", "Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "-initializeios", "(Ljk/b;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "ios", "AndroidKt", "Dsl", "IosKt", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class StaticDeviceInfoKt {
    public static final StaticDeviceInfoKt INSTANCE = new StaticDeviceInfoKt();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AndroidKt {
        public static final AndroidKt INSTANCE = new AndroidKt();

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b2\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u0000 \u0081\u00012\u00020\u0001:\u0002\u0081\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u000eJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u000bJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u000eJ\r\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u000bJ\r\u0010 \u001a\u00020\f¢\u0006\u0004\b \u0010\u000eJ\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\u000bJ\r\u0010\"\u001a\u00020\f¢\u0006\u0004\b\"\u0010\u000eJ\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010\u000bJ\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010\u000eJ\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010\u000bJ\r\u0010&\u001a\u00020\f¢\u0006\u0004\b&\u0010\u000eJ\r\u0010'\u001a\u00020\t¢\u0006\u0004\b'\u0010\u000bJ\r\u0010(\u001a\u00020\f¢\u0006\u0004\b(\u0010\u000eJ\r\u0010)\u001a\u00020\t¢\u0006\u0004\b)\u0010\u000bJ\r\u0010*\u001a\u00020\f¢\u0006\u0004\b*\u0010\u000eJ\r\u0010+\u001a\u00020\t¢\u0006\u0004\b+\u0010\u000bJ\r\u0010,\u001a\u00020\f¢\u0006\u0004\b,\u0010\u000eJ\r\u0010-\u001a\u00020\t¢\u0006\u0004\b-\u0010\u000bJ\r\u0010.\u001a\u00020\f¢\u0006\u0004\b.\u0010\u000eJ\r\u0010/\u001a\u00020\t¢\u0006\u0004\b/\u0010\u000bJ\r\u00100\u001a\u00020\f¢\u0006\u0004\b0\u0010\u000eJ\r\u00101\u001a\u00020\t¢\u0006\u0004\b1\u0010\u000bJ\r\u00102\u001a\u00020\f¢\u0006\u0004\b2\u0010\u000eJ\r\u00103\u001a\u00020\t¢\u0006\u0004\b3\u0010\u000bJ\r\u00104\u001a\u00020\f¢\u0006\u0004\b4\u0010\u000eJ\r\u00105\u001a\u00020\t¢\u0006\u0004\b5\u0010\u000bJ\r\u00106\u001a\u00020\f¢\u0006\u0004\b6\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00107R$\u0010>\u001a\u0002082\u0006\u00109\u001a\u0002088G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010A\u001a\u0002082\u0006\u00109\u001a\u0002088G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=R$\u0010G\u001a\u00020B2\u0006\u00109\u001a\u00020B8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010J\u001a\u00020B2\u0006\u00109\u001a\u00020B8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR$\u0010M\u001a\u00020B2\u0006\u00109\u001a\u00020B8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010D\"\u0004\bL\u0010FR$\u0010P\u001a\u00020B2\u0006\u00109\u001a\u00020B8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010D\"\u0004\bO\u0010FR$\u0010S\u001a\u00020B2\u0006\u00109\u001a\u00020B8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010D\"\u0004\bR\u0010FR$\u0010V\u001a\u00020B2\u0006\u00109\u001a\u00020B8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010D\"\u0004\bU\u0010FR$\u0010Y\u001a\u00020B2\u0006\u00109\u001a\u00020B8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010D\"\u0004\bX\u0010FR$\u0010\\\u001a\u00020B2\u0006\u00109\u001a\u00020B8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010D\"\u0004\b[\u0010FR$\u0010_\u001a\u00020B2\u0006\u00109\u001a\u00020B8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010D\"\u0004\b^\u0010FR$\u0010b\u001a\u00020B2\u0006\u00109\u001a\u00020B8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010D\"\u0004\ba\u0010FR$\u0010e\u001a\u00020B2\u0006\u00109\u001a\u00020B8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010D\"\u0004\bd\u0010FR$\u0010h\u001a\u00020B2\u0006\u00109\u001a\u00020B8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010D\"\u0004\bg\u0010FR$\u0010k\u001a\u00020B2\u0006\u00109\u001a\u00020B8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010D\"\u0004\bj\u0010FR$\u0010n\u001a\u0002082\u0006\u00109\u001a\u0002088G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010;\"\u0004\bm\u0010=R$\u0010q\u001a\u0002082\u0006\u00109\u001a\u0002088G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010;\"\u0004\bp\u0010=R$\u0010t\u001a\u00020B2\u0006\u00109\u001a\u00020B8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\br\u0010D\"\u0004\bs\u0010FR$\u0010z\u001a\u00020u2\u0006\u00109\u001a\u00020u8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR$\u0010}\u001a\u0002082\u0006\u00109\u001a\u0002088G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b{\u0010;\"\u0004\b|\u0010=R%\u0010\u0080\u0001\u001a\u00020u2\u0006\u00109\u001a\u00020u8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b~\u0010w\"\u0004\b\u007f\u0010y¨\u0006\u0082\u0001"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl;", "", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder;)V", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "_build", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "Lwj/r;", "clearApiLevel", "()V", "", "hasApiLevel", "()Z", "clearVersionCode", "hasVersionCode", "clearAndroidFingerprint", "hasAndroidFingerprint", "clearAppInstaller", "hasAppInstaller", "clearApkDeveloperSigningCertificateHash", "hasApkDeveloperSigningCertificateHash", "clearBuildBoard", "hasBuildBoard", "clearBuildBrand", "hasBuildBrand", "clearBuildDevice", "hasBuildDevice", "clearBuildDisplay", "hasBuildDisplay", "clearBuildFingerprint", "hasBuildFingerprint", "clearBuildHardware", "hasBuildHardware", "clearBuildHost", "hasBuildHost", "clearBuildBootloader", "hasBuildBootloader", "clearBuildProduct", "hasBuildProduct", "clearBuildId", "hasBuildId", "clearExtensionVersion", "hasExtensionVersion", "clearPhoneType", "hasPhoneType", "clearSimOperator", "hasSimOperator", "clearTotalDiskSpaceInternal", "hasTotalDiskSpaceInternal", "clearDisplayScreenDensity", "hasDisplayScreenDensity", "clearJvmMaxMemory", "hasJvmMaxMemory", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder;", "", X3.i.X, "getApiLevel", "()I", "setApiLevel", "(I)V", "apiLevel", "getVersionCode", "setVersionCode", "versionCode", "", "getAndroidFingerprint", "()Ljava/lang/String;", "setAndroidFingerprint", "(Ljava/lang/String;)V", "androidFingerprint", "getAppInstaller", "setAppInstaller", "appInstaller", "getApkDeveloperSigningCertificateHash", "setApkDeveloperSigningCertificateHash", "apkDeveloperSigningCertificateHash", "getBuildBoard", "setBuildBoard", "buildBoard", "getBuildBrand", "setBuildBrand", "buildBrand", "getBuildDevice", "setBuildDevice", "buildDevice", "getBuildDisplay", "setBuildDisplay", "buildDisplay", "getBuildFingerprint", "setBuildFingerprint", "buildFingerprint", "getBuildHardware", "setBuildHardware", "buildHardware", "getBuildHost", "setBuildHost", "buildHost", "getBuildBootloader", "setBuildBootloader", "buildBootloader", "getBuildProduct", "setBuildProduct", "buildProduct", "getBuildId", "setBuildId", "buildId", "getExtensionVersion", "setExtensionVersion", "extensionVersion", "getPhoneType", "setPhoneType", X3.j.S, "getSimOperator", "setSimOperator", X3.j.R, "", "getTotalDiskSpaceInternal", "()J", "setTotalDiskSpaceInternal", "(J)V", "totalDiskSpaceInternal", "getDisplayScreenDensity", "setDisplayScreenDensity", "displayScreenDensity", "getJvmMaxMemory", "setJvmMaxMemory", "jvmMaxMemory", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        @ProtoDslMarker
        public static final class Dsl {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder _builder;

            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl;", "builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder) {
                    kotlin.jvm.internal.n.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder, kotlin.jvm.internal.g gVar) {
                this(builder);
            }

            public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo.Android _build() {
                StaticDeviceInfoOuterClass.StaticDeviceInfo.Android androidBuild = this._builder.build();
                kotlin.jvm.internal.n.e(androidBuild, "_builder.build()");
                return androidBuild;
            }

            public final void clearAndroidFingerprint() {
                this._builder.clearAndroidFingerprint();
            }

            public final void clearApiLevel() {
                this._builder.clearApiLevel();
            }

            public final void clearApkDeveloperSigningCertificateHash() {
                this._builder.clearApkDeveloperSigningCertificateHash();
            }

            public final void clearAppInstaller() {
                this._builder.clearAppInstaller();
            }

            public final void clearBuildBoard() {
                this._builder.clearBuildBoard();
            }

            public final void clearBuildBootloader() {
                this._builder.clearBuildBootloader();
            }

            public final void clearBuildBrand() {
                this._builder.clearBuildBrand();
            }

            public final void clearBuildDevice() {
                this._builder.clearBuildDevice();
            }

            public final void clearBuildDisplay() {
                this._builder.clearBuildDisplay();
            }

            public final void clearBuildFingerprint() {
                this._builder.clearBuildFingerprint();
            }

            public final void clearBuildHardware() {
                this._builder.clearBuildHardware();
            }

            public final void clearBuildHost() {
                this._builder.clearBuildHost();
            }

            public final void clearBuildId() {
                this._builder.clearBuildId();
            }

            public final void clearBuildProduct() {
                this._builder.clearBuildProduct();
            }

            public final void clearDisplayScreenDensity() {
                this._builder.clearDisplayScreenDensity();
            }

            public final void clearExtensionVersion() {
                this._builder.clearExtensionVersion();
            }

            public final void clearJvmMaxMemory() {
                this._builder.clearJvmMaxMemory();
            }

            public final void clearPhoneType() {
                this._builder.clearPhoneType();
            }

            public final void clearSimOperator() {
                this._builder.clearSimOperator();
            }

            public final void clearTotalDiskSpaceInternal() {
                this._builder.clearTotalDiskSpaceInternal();
            }

            public final void clearVersionCode() {
                this._builder.clearVersionCode();
            }

            public final String getAndroidFingerprint() {
                String androidFingerprint = this._builder.getAndroidFingerprint();
                kotlin.jvm.internal.n.e(androidFingerprint, "_builder.getAndroidFingerprint()");
                return androidFingerprint;
            }

            public final int getApiLevel() {
                return this._builder.getApiLevel();
            }

            public final String getApkDeveloperSigningCertificateHash() {
                String apkDeveloperSigningCertificateHash = this._builder.getApkDeveloperSigningCertificateHash();
                kotlin.jvm.internal.n.e(apkDeveloperSigningCertificateHash, "_builder.getApkDeveloperSigningCertificateHash()");
                return apkDeveloperSigningCertificateHash;
            }

            public final String getAppInstaller() {
                String appInstaller = this._builder.getAppInstaller();
                kotlin.jvm.internal.n.e(appInstaller, "_builder.getAppInstaller()");
                return appInstaller;
            }

            public final String getBuildBoard() {
                String buildBoard = this._builder.getBuildBoard();
                kotlin.jvm.internal.n.e(buildBoard, "_builder.getBuildBoard()");
                return buildBoard;
            }

            public final String getBuildBootloader() {
                String buildBootloader = this._builder.getBuildBootloader();
                kotlin.jvm.internal.n.e(buildBootloader, "_builder.getBuildBootloader()");
                return buildBootloader;
            }

            public final String getBuildBrand() {
                String buildBrand = this._builder.getBuildBrand();
                kotlin.jvm.internal.n.e(buildBrand, "_builder.getBuildBrand()");
                return buildBrand;
            }

            public final String getBuildDevice() {
                String buildDevice = this._builder.getBuildDevice();
                kotlin.jvm.internal.n.e(buildDevice, "_builder.getBuildDevice()");
                return buildDevice;
            }

            public final String getBuildDisplay() {
                String buildDisplay = this._builder.getBuildDisplay();
                kotlin.jvm.internal.n.e(buildDisplay, "_builder.getBuildDisplay()");
                return buildDisplay;
            }

            public final String getBuildFingerprint() {
                String buildFingerprint = this._builder.getBuildFingerprint();
                kotlin.jvm.internal.n.e(buildFingerprint, "_builder.getBuildFingerprint()");
                return buildFingerprint;
            }

            public final String getBuildHardware() {
                String buildHardware = this._builder.getBuildHardware();
                kotlin.jvm.internal.n.e(buildHardware, "_builder.getBuildHardware()");
                return buildHardware;
            }

            public final String getBuildHost() {
                String buildHost = this._builder.getBuildHost();
                kotlin.jvm.internal.n.e(buildHost, "_builder.getBuildHost()");
                return buildHost;
            }

            public final String getBuildId() {
                String buildId = this._builder.getBuildId();
                kotlin.jvm.internal.n.e(buildId, "_builder.getBuildId()");
                return buildId;
            }

            public final String getBuildProduct() {
                String buildProduct = this._builder.getBuildProduct();
                kotlin.jvm.internal.n.e(buildProduct, "_builder.getBuildProduct()");
                return buildProduct;
            }

            public final int getDisplayScreenDensity() {
                return this._builder.getDisplayScreenDensity();
            }

            public final int getExtensionVersion() {
                return this._builder.getExtensionVersion();
            }

            public final long getJvmMaxMemory() {
                return this._builder.getJvmMaxMemory();
            }

            public final int getPhoneType() {
                return this._builder.getPhoneType();
            }

            public final String getSimOperator() {
                String simOperator = this._builder.getSimOperator();
                kotlin.jvm.internal.n.e(simOperator, "_builder.getSimOperator()");
                return simOperator;
            }

            public final long getTotalDiskSpaceInternal() {
                return this._builder.getTotalDiskSpaceInternal();
            }

            public final int getVersionCode() {
                return this._builder.getVersionCode();
            }

            public final boolean hasAndroidFingerprint() {
                return this._builder.hasAndroidFingerprint();
            }

            public final boolean hasApiLevel() {
                return this._builder.hasApiLevel();
            }

            public final boolean hasApkDeveloperSigningCertificateHash() {
                return this._builder.hasApkDeveloperSigningCertificateHash();
            }

            public final boolean hasAppInstaller() {
                return this._builder.hasAppInstaller();
            }

            public final boolean hasBuildBoard() {
                return this._builder.hasBuildBoard();
            }

            public final boolean hasBuildBootloader() {
                return this._builder.hasBuildBootloader();
            }

            public final boolean hasBuildBrand() {
                return this._builder.hasBuildBrand();
            }

            public final boolean hasBuildDevice() {
                return this._builder.hasBuildDevice();
            }

            public final boolean hasBuildDisplay() {
                return this._builder.hasBuildDisplay();
            }

            public final boolean hasBuildFingerprint() {
                return this._builder.hasBuildFingerprint();
            }

            public final boolean hasBuildHardware() {
                return this._builder.hasBuildHardware();
            }

            public final boolean hasBuildHost() {
                return this._builder.hasBuildHost();
            }

            public final boolean hasBuildId() {
                return this._builder.hasBuildId();
            }

            public final boolean hasBuildProduct() {
                return this._builder.hasBuildProduct();
            }

            public final boolean hasDisplayScreenDensity() {
                return this._builder.hasDisplayScreenDensity();
            }

            public final boolean hasExtensionVersion() {
                return this._builder.hasExtensionVersion();
            }

            public final boolean hasJvmMaxMemory() {
                return this._builder.hasJvmMaxMemory();
            }

            public final boolean hasPhoneType() {
                return this._builder.hasPhoneType();
            }

            public final boolean hasSimOperator() {
                return this._builder.hasSimOperator();
            }

            public final boolean hasTotalDiskSpaceInternal() {
                return this._builder.hasTotalDiskSpaceInternal();
            }

            public final boolean hasVersionCode() {
                return this._builder.hasVersionCode();
            }

            public final void setAndroidFingerprint(String value) {
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.setAndroidFingerprint(value);
            }

            public final void setApiLevel(int i10) {
                this._builder.setApiLevel(i10);
            }

            public final void setApkDeveloperSigningCertificateHash(String value) {
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.setApkDeveloperSigningCertificateHash(value);
            }

            public final void setAppInstaller(String value) {
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.setAppInstaller(value);
            }

            public final void setBuildBoard(String value) {
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.setBuildBoard(value);
            }

            public final void setBuildBootloader(String value) {
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.setBuildBootloader(value);
            }

            public final void setBuildBrand(String value) {
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.setBuildBrand(value);
            }

            public final void setBuildDevice(String value) {
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.setBuildDevice(value);
            }

            public final void setBuildDisplay(String value) {
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.setBuildDisplay(value);
            }

            public final void setBuildFingerprint(String value) {
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.setBuildFingerprint(value);
            }

            public final void setBuildHardware(String value) {
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.setBuildHardware(value);
            }

            public final void setBuildHost(String value) {
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.setBuildHost(value);
            }

            public final void setBuildId(String value) {
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.setBuildId(value);
            }

            public final void setBuildProduct(String value) {
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.setBuildProduct(value);
            }

            public final void setDisplayScreenDensity(int i10) {
                this._builder.setDisplayScreenDensity(i10);
            }

            public final void setExtensionVersion(int i10) {
                this._builder.setExtensionVersion(i10);
            }

            public final void setJvmMaxMemory(long j10) {
                this._builder.setJvmMaxMemory(j10);
            }

            public final void setPhoneType(int i10) {
                this._builder.setPhoneType(i10);
            }

            public final void setSimOperator(String value) {
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.setSimOperator(value);
            }

            public final void setTotalDiskSpaceInternal(long j10) {
                this._builder.setTotalDiskSpaceInternal(j10);
            }

            public final void setVersionCode(int i10) {
                this._builder.setVersionCode(i10);
            }

            private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder) {
                this._builder = builder;
            }
        }

        private AndroidKt() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00ad\u00012\u00020\u0001:\u0006\u00ad\u0001®\u0001¯\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u000eJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u000bJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u000eJ\r\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u000bJ\r\u0010 \u001a\u00020\f¢\u0006\u0004\b \u0010\u000eJ\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\u000bJ\r\u0010\"\u001a\u00020\f¢\u0006\u0004\b\"\u0010\u000eJ\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010\u000bJ\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010\u000eJ'\u0010+\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010(\u001a\u00020&H\u0007¢\u0006\u0004\b)\u0010*J(\u0010-\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010(\u001a\u00020&H\u0087\n¢\u0006\u0004\b,\u0010*J-\u00102\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020&0.H\u0007¢\u0006\u0004\b0\u00101J.\u0010-\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020&0.H\u0087\n¢\u0006\u0004\b3\u00101J0\u00108\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u00105\u001a\u0002042\u0006\u0010(\u001a\u00020&H\u0087\u0002¢\u0006\u0004\b6\u00107J\u001f\u0010;\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%H\u0007¢\u0006\u0004\b9\u0010:J\r\u0010<\u001a\u00020\t¢\u0006\u0004\b<\u0010\u000bJ\r\u0010=\u001a\u00020\f¢\u0006\u0004\b=\u0010\u000eJ\r\u0010>\u001a\u00020\t¢\u0006\u0004\b>\u0010\u000bJ\r\u0010?\u001a\u00020\f¢\u0006\u0004\b?\u0010\u000eJ\r\u0010@\u001a\u00020\t¢\u0006\u0004\b@\u0010\u000bJ\r\u0010A\u001a\u00020\f¢\u0006\u0004\bA\u0010\u000eJ\r\u0010B\u001a\u00020\t¢\u0006\u0004\bB\u0010\u000bJ\r\u0010C\u001a\u00020\f¢\u0006\u0004\bC\u0010\u000eJ\r\u0010D\u001a\u00020\t¢\u0006\u0004\bD\u0010\u000bJ\r\u0010E\u001a\u00020\f¢\u0006\u0004\bE\u0010\u000eJ\r\u0010F\u001a\u00020\t¢\u0006\u0004\bF\u0010\u000bJ\r\u0010G\u001a\u00020\f¢\u0006\u0004\bG\u0010\u000eJ'\u0010+\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020H0%2\u0006\u0010(\u001a\u00020&H\u0007¢\u0006\u0004\bI\u0010*J(\u0010-\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020H0%2\u0006\u0010(\u001a\u00020&H\u0087\n¢\u0006\u0004\bJ\u0010*J-\u00102\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020H0%2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020&0.H\u0007¢\u0006\u0004\bK\u00101J.\u0010-\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020H0%2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020&0.H\u0087\n¢\u0006\u0004\bL\u00101J0\u00108\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020H0%2\u0006\u00105\u001a\u0002042\u0006\u0010(\u001a\u00020&H\u0087\u0002¢\u0006\u0004\bM\u00107J\u001f\u0010;\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020H0%H\u0007¢\u0006\u0004\bN\u0010:J\r\u0010O\u001a\u00020\t¢\u0006\u0004\bO\u0010\u000bJ\r\u0010P\u001a\u00020\f¢\u0006\u0004\bP\u0010\u000eJ\r\u0010Q\u001a\u00020\t¢\u0006\u0004\bQ\u0010\u000bJ\r\u0010R\u001a\u00020\f¢\u0006\u0004\bR\u0010\u000eJ\r\u0010S\u001a\u00020\t¢\u0006\u0004\bS\u0010\u000bJ\r\u0010T\u001a\u00020\f¢\u0006\u0004\bT\u0010\u000eJ\r\u0010U\u001a\u00020\t¢\u0006\u0004\bU\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010VR$\u0010[\u001a\u00020&2\u0006\u0010(\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010^\u001a\u00020&2\u0006\u0010(\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010X\"\u0004\b]\u0010ZR$\u0010b\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010\u000e\"\u0004\b`\u0010aR$\u0010e\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010\u000e\"\u0004\bd\u0010aR$\u0010h\u001a\u00020&2\u0006\u0010(\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010X\"\u0004\bg\u0010ZR$\u0010k\u001a\u00020&2\u0006\u0010(\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010X\"\u0004\bj\u0010ZR$\u0010n\u001a\u00020&2\u0006\u0010(\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010X\"\u0004\bm\u0010ZR$\u0010q\u001a\u00020&2\u0006\u0010(\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010X\"\u0004\bp\u0010ZR$\u0010v\u001a\u0002042\u0006\u0010(\u001a\u0002048G@GX\u0086\u000e¢\u0006\f\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR$\u0010y\u001a\u0002042\u0006\u0010(\u001a\u0002048G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bw\u0010s\"\u0004\bx\u0010uR$\u0010|\u001a\u0002042\u0006\u0010(\u001a\u0002048G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010s\"\u0004\b{\u0010uR$\u0010\u007f\u001a\u0002042\u0006\u0010(\u001a\u0002048G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b}\u0010s\"\u0004\b~\u0010uR \u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%8F¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R+\u0010\u0088\u0001\u001a\u00030\u0083\u00012\u0007\u0010(\u001a\u00030\u0083\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R+\u0010\u008b\u0001\u001a\u00030\u0083\u00012\u0007\u0010(\u001a\u00030\u0083\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0089\u0001\u0010\u0085\u0001\"\u0006\b\u008a\u0001\u0010\u0087\u0001R'\u0010\u008e\u0001\u001a\u00020&2\u0006\u0010(\u001a\u00020&8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008c\u0001\u0010X\"\u0005\b\u008d\u0001\u0010ZR+\u0010\u0091\u0001\u001a\u00030\u0083\u00012\u0007\u0010(\u001a\u00030\u0083\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008f\u0001\u0010\u0085\u0001\"\u0006\b\u0090\u0001\u0010\u0087\u0001R'\u0010\u0094\u0001\u001a\u00020&2\u0006\u0010(\u001a\u00020&8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0092\u0001\u0010X\"\u0005\b\u0093\u0001\u0010ZR'\u0010\u0097\u0001\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0095\u0001\u0010\u000e\"\u0005\b\u0096\u0001\u0010aR \u0010\u0099\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020H0%8F¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0081\u0001R+\u0010\u009c\u0001\u001a\u00030\u0083\u00012\u0007\u0010(\u001a\u00030\u0083\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009a\u0001\u0010\u0085\u0001\"\u0006\b\u009b\u0001\u0010\u0087\u0001R+\u0010¢\u0001\u001a\u00030\u009d\u00012\u0007\u0010(\u001a\u00030\u009d\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R+\u0010¨\u0001\u001a\u00030£\u00012\u0007\u0010(\u001a\u00030£\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R\u0015\u0010¬\u0001\u001a\u00030©\u00018G¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001¨\u0006°\u0001"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl;", "", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder;)V", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "_build", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "Lwj/r;", "clearBundleId", "()V", "", "hasBundleId", "()Z", "clearBundleVersion", "hasBundleVersion", "clearAppDebuggable", "hasAppDebuggable", "clearRooted", "hasRooted", "clearOsVersion", "hasOsVersion", "clearDeviceMake", "hasDeviceMake", "clearDeviceModel", "hasDeviceModel", "clearWebviewUa", "hasWebviewUa", "clearScreenDensity", "hasScreenDensity", "clearScreenWidth", "hasScreenWidth", "clearScreenHeight", "hasScreenHeight", "clearScreenSize", "hasScreenSize", "Lcom/google/protobuf/kotlin/DslList;", "", "Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl$StoresProxy;", X3.i.X, "addStores", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/String;)V", "add", "plusAssignStores", "plusAssign", "", "values", "addAllStores", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllStores", "", "index", "setStores", "(Lcom/google/protobuf/kotlin/DslList;ILjava/lang/String;)V", "set", "clearStores", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "clearTotalDiskSpace", "hasTotalDiskSpace", "clearTotalRamMemory", "hasTotalRamMemory", "clearCpuModel", "hasCpuModel", "clearCpuCount", "hasCpuCount", "clearGpuModel", "hasGpuModel", "clearMadeWithUnity", "hasMadeWithUnity", "Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl$KeyboardLanguagesProxy;", "addKeyboardLanguages", "plusAssignKeyboardLanguages", "addAllKeyboardLanguages", "plusAssignAllKeyboardLanguages", "setKeyboardLanguages", "clearKeyboardLanguages", "clearTotalDiskSpaceBytes", "hasTotalDiskSpaceBytes", "clearAndroid", "hasAndroid", "clearIos", "hasIos", "clearPlatformSpecific", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder;", "getBundleId", "()Ljava/lang/String;", "setBundleId", "(Ljava/lang/String;)V", "bundleId", "getBundleVersion", "setBundleVersion", "bundleVersion", "getAppDebuggable", "setAppDebuggable", "(Z)V", "appDebuggable", "getRooted", "setRooted", "rooted", "getOsVersion", "setOsVersion", "osVersion", "getDeviceMake", "setDeviceMake", "deviceMake", "getDeviceModel", "setDeviceModel", "deviceModel", "getWebviewUa", "setWebviewUa", "webviewUa", "getScreenDensity", "()I", "setScreenDensity", "(I)V", "screenDensity", "getScreenWidth", "setScreenWidth", "screenWidth", "getScreenHeight", "setScreenHeight", "screenHeight", "getScreenSize", "setScreenSize", "screenSize", "getStores", "()Lcom/google/protobuf/kotlin/DslList;", "stores", "", "getTotalDiskSpace", "()J", "setTotalDiskSpace", "(J)V", "totalDiskSpace", "getTotalRamMemory", "setTotalRamMemory", "totalRamMemory", "getCpuModel", "setCpuModel", "cpuModel", "getCpuCount", "setCpuCount", "cpuCount", "getGpuModel", "setGpuModel", "gpuModel", "getMadeWithUnity", "setMadeWithUnity", "madeWithUnity", "getKeyboardLanguages", "keyboardLanguages", "getTotalDiskSpaceBytes", "setTotalDiskSpaceBytes", "totalDiskSpaceBytes", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "getAndroid", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "setAndroid", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;)V", "android", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "getIos", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "setIos", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;)V", "ios", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$PlatformSpecificCase;", "getPlatformSpecificCase", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$PlatformSpecificCase;", "platformSpecificCase", "Companion", "KeyboardLanguagesProxy", "StoresProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl;", "builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl$KeyboardLanguagesProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class KeyboardLanguagesProxy extends DslProxy {
            private KeyboardLanguagesProxy() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl$StoresProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class StoresProxy extends DslProxy {
            private StoresProxy() {
            }
        }

        public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder, kotlin.jvm.internal.g gVar) {
            this(builder);
        }

        public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo _build() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfoBuild = this._builder.build();
            kotlin.jvm.internal.n.e(staticDeviceInfoBuild, "_builder.build()");
            return staticDeviceInfoBuild;
        }

        public final /* synthetic */ void addAllKeyboardLanguages(DslList dslList, Iterable values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            this._builder.addAllKeyboardLanguages(values);
        }

        public final /* synthetic */ void addAllStores(DslList dslList, Iterable values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            this._builder.addAllStores(values);
        }

        public final /* synthetic */ void addKeyboardLanguages(DslList dslList, String value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.addKeyboardLanguages(value);
        }

        public final /* synthetic */ void addStores(DslList dslList, String value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.addStores(value);
        }

        public final void clearAndroid() {
            this._builder.clearAndroid();
        }

        public final void clearAppDebuggable() {
            this._builder.clearAppDebuggable();
        }

        public final void clearBundleId() {
            this._builder.clearBundleId();
        }

        public final void clearBundleVersion() {
            this._builder.clearBundleVersion();
        }

        public final void clearCpuCount() {
            this._builder.clearCpuCount();
        }

        public final void clearCpuModel() {
            this._builder.clearCpuModel();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearGpuModel() {
            this._builder.clearGpuModel();
        }

        public final void clearIos() {
            this._builder.clearIos();
        }

        public final /* synthetic */ void clearKeyboardLanguages(DslList dslList) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            this._builder.clearKeyboardLanguages();
        }

        public final void clearMadeWithUnity() {
            this._builder.clearMadeWithUnity();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearPlatformSpecific() {
            this._builder.clearPlatformSpecific();
        }

        public final void clearRooted() {
            this._builder.clearRooted();
        }

        public final void clearScreenDensity() {
            this._builder.clearScreenDensity();
        }

        public final void clearScreenHeight() {
            this._builder.clearScreenHeight();
        }

        public final void clearScreenSize() {
            this._builder.clearScreenSize();
        }

        public final void clearScreenWidth() {
            this._builder.clearScreenWidth();
        }

        public final /* synthetic */ void clearStores(DslList dslList) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            this._builder.clearStores();
        }

        public final void clearTotalDiskSpace() {
            this._builder.clearTotalDiskSpace();
        }

        public final void clearTotalDiskSpaceBytes() {
            this._builder.clearTotalDiskSpaceBytes();
        }

        public final void clearTotalRamMemory() {
            this._builder.clearTotalRamMemory();
        }

        public final void clearWebviewUa() {
            this._builder.clearWebviewUa();
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android getAndroid() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android2 = this._builder.getAndroid();
            kotlin.jvm.internal.n.e(android2, "_builder.getAndroid()");
            return android2;
        }

        public final boolean getAppDebuggable() {
            return this._builder.getAppDebuggable();
        }

        public final String getBundleId() {
            String bundleId = this._builder.getBundleId();
            kotlin.jvm.internal.n.e(bundleId, "_builder.getBundleId()");
            return bundleId;
        }

        public final String getBundleVersion() {
            String bundleVersion = this._builder.getBundleVersion();
            kotlin.jvm.internal.n.e(bundleVersion, "_builder.getBundleVersion()");
            return bundleVersion;
        }

        public final long getCpuCount() {
            return this._builder.getCpuCount();
        }

        public final String getCpuModel() {
            String cpuModel = this._builder.getCpuModel();
            kotlin.jvm.internal.n.e(cpuModel, "_builder.getCpuModel()");
            return cpuModel;
        }

        public final String getDeviceMake() {
            String deviceMake = this._builder.getDeviceMake();
            kotlin.jvm.internal.n.e(deviceMake, "_builder.getDeviceMake()");
            return deviceMake;
        }

        public final String getDeviceModel() {
            String deviceModel = this._builder.getDeviceModel();
            kotlin.jvm.internal.n.e(deviceModel, "_builder.getDeviceModel()");
            return deviceModel;
        }

        public final String getGpuModel() {
            String gpuModel = this._builder.getGpuModel();
            kotlin.jvm.internal.n.e(gpuModel, "_builder.getGpuModel()");
            return gpuModel;
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios getIos() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios = this._builder.getIos();
            kotlin.jvm.internal.n.e(ios, "_builder.getIos()");
            return ios;
        }

        public final DslList<String, KeyboardLanguagesProxy> getKeyboardLanguages() {
            List<String> keyboardLanguagesList = this._builder.getKeyboardLanguagesList();
            kotlin.jvm.internal.n.e(keyboardLanguagesList, "_builder.getKeyboardLanguagesList()");
            return new DslList<>(keyboardLanguagesList);
        }

        public final boolean getMadeWithUnity() {
            return this._builder.getMadeWithUnity();
        }

        public final String getOsVersion() {
            String osVersion = this._builder.getOsVersion();
            kotlin.jvm.internal.n.e(osVersion, "_builder.getOsVersion()");
            return osVersion;
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase platformSpecificCase = this._builder.getPlatformSpecificCase();
            kotlin.jvm.internal.n.e(platformSpecificCase, "_builder.getPlatformSpecificCase()");
            return platformSpecificCase;
        }

        public final boolean getRooted() {
            return this._builder.getRooted();
        }

        public final int getScreenDensity() {
            return this._builder.getScreenDensity();
        }

        public final int getScreenHeight() {
            return this._builder.getScreenHeight();
        }

        public final int getScreenSize() {
            return this._builder.getScreenSize();
        }

        public final int getScreenWidth() {
            return this._builder.getScreenWidth();
        }

        public final DslList<String, StoresProxy> getStores() {
            List<String> storesList = this._builder.getStoresList();
            kotlin.jvm.internal.n.e(storesList, "_builder.getStoresList()");
            return new DslList<>(storesList);
        }

        public final long getTotalDiskSpace() {
            return this._builder.getTotalDiskSpace();
        }

        public final long getTotalDiskSpaceBytes() {
            return this._builder.getTotalDiskSpaceBytes();
        }

        public final long getTotalRamMemory() {
            return this._builder.getTotalRamMemory();
        }

        public final String getWebviewUa() {
            String webviewUa = this._builder.getWebviewUa();
            kotlin.jvm.internal.n.e(webviewUa, "_builder.getWebviewUa()");
            return webviewUa;
        }

        public final boolean hasAndroid() {
            return this._builder.hasAndroid();
        }

        public final boolean hasAppDebuggable() {
            return this._builder.hasAppDebuggable();
        }

        public final boolean hasBundleId() {
            return this._builder.hasBundleId();
        }

        public final boolean hasBundleVersion() {
            return this._builder.hasBundleVersion();
        }

        public final boolean hasCpuCount() {
            return this._builder.hasCpuCount();
        }

        public final boolean hasCpuModel() {
            return this._builder.hasCpuModel();
        }

        public final boolean hasDeviceMake() {
            return this._builder.hasDeviceMake();
        }

        public final boolean hasDeviceModel() {
            return this._builder.hasDeviceModel();
        }

        public final boolean hasGpuModel() {
            return this._builder.hasGpuModel();
        }

        public final boolean hasIos() {
            return this._builder.hasIos();
        }

        public final boolean hasMadeWithUnity() {
            return this._builder.hasMadeWithUnity();
        }

        public final boolean hasOsVersion() {
            return this._builder.hasOsVersion();
        }

        public final boolean hasRooted() {
            return this._builder.hasRooted();
        }

        public final boolean hasScreenDensity() {
            return this._builder.hasScreenDensity();
        }

        public final boolean hasScreenHeight() {
            return this._builder.hasScreenHeight();
        }

        public final boolean hasScreenSize() {
            return this._builder.hasScreenSize();
        }

        public final boolean hasScreenWidth() {
            return this._builder.hasScreenWidth();
        }

        public final boolean hasTotalDiskSpace() {
            return this._builder.hasTotalDiskSpace();
        }

        public final boolean hasTotalDiskSpaceBytes() {
            return this._builder.hasTotalDiskSpaceBytes();
        }

        public final boolean hasTotalRamMemory() {
            return this._builder.hasTotalRamMemory();
        }

        public final boolean hasWebviewUa() {
            return this._builder.hasWebviewUa();
        }

        public final /* synthetic */ void plusAssignAllKeyboardLanguages(DslList<String, KeyboardLanguagesProxy> dslList, Iterable<String> values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            addAllKeyboardLanguages(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllStores(DslList<String, StoresProxy> dslList, Iterable<String> values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            addAllStores(dslList, values);
        }

        public final /* synthetic */ void plusAssignKeyboardLanguages(DslList<String, KeyboardLanguagesProxy> dslList, String value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            addKeyboardLanguages(dslList, value);
        }

        public final /* synthetic */ void plusAssignStores(DslList<String, StoresProxy> dslList, String value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            addStores(dslList, value);
        }

        public final void setAndroid(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setAndroid(value);
        }

        public final void setAppDebuggable(boolean z10) {
            this._builder.setAppDebuggable(z10);
        }

        public final void setBundleId(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setBundleId(value);
        }

        public final void setBundleVersion(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setBundleVersion(value);
        }

        public final void setCpuCount(long j10) {
            this._builder.setCpuCount(j10);
        }

        public final void setCpuModel(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setCpuModel(value);
        }

        public final void setDeviceMake(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setDeviceMake(value);
        }

        public final void setDeviceModel(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setDeviceModel(value);
        }

        public final void setGpuModel(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setGpuModel(value);
        }

        public final void setIos(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setIos(value);
        }

        public final /* synthetic */ void setKeyboardLanguages(DslList dslList, int i10, String value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setKeyboardLanguages(i10, value);
        }

        public final void setMadeWithUnity(boolean z10) {
            this._builder.setMadeWithUnity(z10);
        }

        public final void setOsVersion(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setOsVersion(value);
        }

        public final void setRooted(boolean z10) {
            this._builder.setRooted(z10);
        }

        public final void setScreenDensity(int i10) {
            this._builder.setScreenDensity(i10);
        }

        public final void setScreenHeight(int i10) {
            this._builder.setScreenHeight(i10);
        }

        public final void setScreenSize(int i10) {
            this._builder.setScreenSize(i10);
        }

        public final void setScreenWidth(int i10) {
            this._builder.setScreenWidth(i10);
        }

        public final /* synthetic */ void setStores(DslList dslList, int i10, String value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setStores(i10, value);
        }

        public final void setTotalDiskSpace(long j10) {
            this._builder.setTotalDiskSpace(j10);
        }

        public final void setTotalDiskSpaceBytes(long j10) {
            this._builder.setTotalDiskSpaceBytes(j10);
        }

        public final void setTotalRamMemory(long j10) {
            this._builder.setTotalRamMemory(j10);
        }

        public final void setWebviewUa(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setWebviewUa(value);
        }

        private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
            this._builder = builder;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class IosKt {
        public static final IosKt INSTANCE = new IosKt();

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 m2\u00020\u0001:\u0002mnB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ'\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001b\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b\u001a\u0010\u0018J-\u0010 \u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ.\u0010\u001b\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001cH\u0087\n¢\u0006\u0004\b!\u0010\u001fJ0\u0010&\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0014H\u0087\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020\t¢\u0006\u0004\b*\u0010\u000bJ\r\u0010+\u001a\u00020\f¢\u0006\u0004\b+\u0010\u000eJ\r\u0010,\u001a\u00020\t¢\u0006\u0004\b,\u0010\u000bJ\r\u0010-\u001a\u00020\f¢\u0006\u0004\b-\u0010\u000eJ\r\u0010.\u001a\u00020\t¢\u0006\u0004\b.\u0010\u000bJ\r\u0010/\u001a\u00020\f¢\u0006\u0004\b/\u0010\u000eJ\r\u00100\u001a\u00020\t¢\u0006\u0004\b0\u0010\u000bJ\r\u00101\u001a\u00020\f¢\u0006\u0004\b1\u0010\u000eJ\r\u00102\u001a\u00020\t¢\u0006\u0004\b2\u0010\u000bJ\r\u00103\u001a\u00020\f¢\u0006\u0004\b3\u0010\u000eJ\r\u00104\u001a\u00020\t¢\u0006\u0004\b4\u0010\u000bJ\r\u00105\u001a\u00020\f¢\u0006\u0004\b5\u0010\u000eJ\r\u00106\u001a\u00020\t¢\u0006\u0004\b6\u0010\u000bJ\r\u00107\u001a\u00020\f¢\u0006\u0004\b7\u0010\u000eJ\r\u00108\u001a\u00020\t¢\u0006\u0004\b8\u0010\u000bJ\r\u00109\u001a\u00020\f¢\u0006\u0004\b9\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010:R$\u0010@\u001a\u00020;2\u0006\u0010\u0016\u001a\u00020;8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010D\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010\u000e\"\u0004\bB\u0010CR$\u0010I\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00148G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001d\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138F¢\u0006\u0006\u001a\u0004\bJ\u0010KR$\u0010Q\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\"8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010T\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010\u000e\"\u0004\bS\u0010CR$\u0010W\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00148G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010F\"\u0004\bV\u0010HR$\u0010Z\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00148G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010F\"\u0004\bY\u0010HR$\u0010]\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00148G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010F\"\u0004\b\\\u0010HR$\u0010`\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00148G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010F\"\u0004\b_\u0010HR$\u0010f\u001a\u00020a2\u0006\u0010\u0016\u001a\u00020a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010i\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\"8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010N\"\u0004\bh\u0010PR$\u0010l\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bj\u0010\u000e\"\u0004\bk\u0010C¨\u0006o"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl;", "", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder;)V", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "_build", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "Lwj/r;", "clearSystemBootTime", "()V", "", "hasSystemBootTime", "()Z", "clearSimulator", "hasSimulator", "clearBuiltSdkVersion", "hasBuiltSdkVersion", "Lcom/google/protobuf/kotlin/DslList;", "", "Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl$SkadnetworkIdProxy;", X3.i.X, "addSkadnetworkId", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/String;)V", "add", "plusAssignSkadnetworkId", "plusAssign", "", "values", "addAllSkadnetworkId", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllSkadnetworkId", "", "index", "setSkadnetworkId", "(Lcom/google/protobuf/kotlin/DslList;ILjava/lang/String;)V", "set", "clearSkadnetworkId", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "clearScreenScale", "hasScreenScale", "clearCanMakePayments", "hasCanMakePayments", "clearXcodeVersion", "hasXcodeVersion", "clearXcodeBuildVersion", "hasXcodeBuildVersion", "clearXcodeSdkBuildVersion", "hasXcodeSdkBuildVersion", "clearBundleVersionFull", "hasBundleVersionFull", "clearUserInterfaceIdiom", "hasUserInterfaceIdiom", "clearAdAttributionKitSupported", "hasAdAttributionKitSupported", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder;", "", "getSystemBootTime", "()J", "setSystemBootTime", "(J)V", "systemBootTime", "getSimulator", "setSimulator", "(Z)V", "simulator", "getBuiltSdkVersion", "()Ljava/lang/String;", "setBuiltSdkVersion", "(Ljava/lang/String;)V", "builtSdkVersion", "getSkadnetworkId", "()Lcom/google/protobuf/kotlin/DslList;", "skadnetworkId", "getScreenScale", "()I", "setScreenScale", "(I)V", "screenScale", "getCanMakePayments", "setCanMakePayments", "canMakePayments", "getXcodeVersion", "setXcodeVersion", "xcodeVersion", "getXcodeBuildVersion", "setXcodeBuildVersion", "xcodeBuildVersion", "getXcodeSdkBuildVersion", "setXcodeSdkBuildVersion", "xcodeSdkBuildVersion", "getBundleVersionFull", "setBundleVersionFull", "bundleVersionFull", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$UserInterfaceIdiom;", "getUserInterfaceIdiom", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$UserInterfaceIdiom;", "setUserInterfaceIdiom", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$UserInterfaceIdiom;)V", "userInterfaceIdiom", "getUserInterfaceIdiomValue", "setUserInterfaceIdiomValue", "userInterfaceIdiomValue", "getAdAttributionKitSupported", "setAdAttributionKitSupported", "adAttributionKitSupported", "Companion", "SkadnetworkIdProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        @ProtoDslMarker
        public static final class Dsl {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder _builder;

            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl;", "builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder) {
                    kotlin.jvm.internal.n.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl$SkadnetworkIdProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
            public static final class SkadnetworkIdProxy extends DslProxy {
                private SkadnetworkIdProxy() {
                }
            }

            public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder, kotlin.jvm.internal.g gVar) {
                this(builder);
            }

            public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios _build() {
                StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios iosBuild = this._builder.build();
                kotlin.jvm.internal.n.e(iosBuild, "_builder.build()");
                return iosBuild;
            }

            public final /* synthetic */ void addAllSkadnetworkId(DslList dslList, Iterable values) {
                kotlin.jvm.internal.n.f(dslList, "<this>");
                kotlin.jvm.internal.n.f(values, "values");
                this._builder.addAllSkadnetworkId(values);
            }

            public final /* synthetic */ void addSkadnetworkId(DslList dslList, String value) {
                kotlin.jvm.internal.n.f(dslList, "<this>");
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.addSkadnetworkId(value);
            }

            public final void clearAdAttributionKitSupported() {
                this._builder.clearAdAttributionKitSupported();
            }

            public final void clearBuiltSdkVersion() {
                this._builder.clearBuiltSdkVersion();
            }

            public final void clearBundleVersionFull() {
                this._builder.clearBundleVersionFull();
            }

            public final void clearCanMakePayments() {
                this._builder.clearCanMakePayments();
            }

            public final void clearScreenScale() {
                this._builder.clearScreenScale();
            }

            public final void clearSimulator() {
                this._builder.clearSimulator();
            }

            public final /* synthetic */ void clearSkadnetworkId(DslList dslList) {
                kotlin.jvm.internal.n.f(dslList, "<this>");
                this._builder.clearSkadnetworkId();
            }

            public final void clearSystemBootTime() {
                this._builder.clearSystemBootTime();
            }

            public final void clearUserInterfaceIdiom() {
                this._builder.clearUserInterfaceIdiom();
            }

            public final void clearXcodeBuildVersion() {
                this._builder.clearXcodeBuildVersion();
            }

            public final void clearXcodeSdkBuildVersion() {
                this._builder.clearXcodeSdkBuildVersion();
            }

            public final void clearXcodeVersion() {
                this._builder.clearXcodeVersion();
            }

            public final boolean getAdAttributionKitSupported() {
                return this._builder.getAdAttributionKitSupported();
            }

            public final String getBuiltSdkVersion() {
                String builtSdkVersion = this._builder.getBuiltSdkVersion();
                kotlin.jvm.internal.n.e(builtSdkVersion, "_builder.getBuiltSdkVersion()");
                return builtSdkVersion;
            }

            public final String getBundleVersionFull() {
                String bundleVersionFull = this._builder.getBundleVersionFull();
                kotlin.jvm.internal.n.e(bundleVersionFull, "_builder.getBundleVersionFull()");
                return bundleVersionFull;
            }

            public final boolean getCanMakePayments() {
                return this._builder.getCanMakePayments();
            }

            public final int getScreenScale() {
                return this._builder.getScreenScale();
            }

            public final boolean getSimulator() {
                return this._builder.getSimulator();
            }

            public final DslList<String, SkadnetworkIdProxy> getSkadnetworkId() {
                List<String> skadnetworkIdList = this._builder.getSkadnetworkIdList();
                kotlin.jvm.internal.n.e(skadnetworkIdList, "_builder.getSkadnetworkIdList()");
                return new DslList<>(skadnetworkIdList);
            }

            public final long getSystemBootTime() {
                return this._builder.getSystemBootTime();
            }

            public final StaticDeviceInfoOuterClass.StaticDeviceInfo.UserInterfaceIdiom getUserInterfaceIdiom() {
                StaticDeviceInfoOuterClass.StaticDeviceInfo.UserInterfaceIdiom userInterfaceIdiom = this._builder.getUserInterfaceIdiom();
                kotlin.jvm.internal.n.e(userInterfaceIdiom, "_builder.getUserInterfaceIdiom()");
                return userInterfaceIdiom;
            }

            public final int getUserInterfaceIdiomValue() {
                return this._builder.getUserInterfaceIdiomValue();
            }

            public final String getXcodeBuildVersion() {
                String xcodeBuildVersion = this._builder.getXcodeBuildVersion();
                kotlin.jvm.internal.n.e(xcodeBuildVersion, "_builder.getXcodeBuildVersion()");
                return xcodeBuildVersion;
            }

            public final String getXcodeSdkBuildVersion() {
                String xcodeSdkBuildVersion = this._builder.getXcodeSdkBuildVersion();
                kotlin.jvm.internal.n.e(xcodeSdkBuildVersion, "_builder.getXcodeSdkBuildVersion()");
                return xcodeSdkBuildVersion;
            }

            public final String getXcodeVersion() {
                String xcodeVersion = this._builder.getXcodeVersion();
                kotlin.jvm.internal.n.e(xcodeVersion, "_builder.getXcodeVersion()");
                return xcodeVersion;
            }

            public final boolean hasAdAttributionKitSupported() {
                return this._builder.hasAdAttributionKitSupported();
            }

            public final boolean hasBuiltSdkVersion() {
                return this._builder.hasBuiltSdkVersion();
            }

            public final boolean hasBundleVersionFull() {
                return this._builder.hasBundleVersionFull();
            }

            public final boolean hasCanMakePayments() {
                return this._builder.hasCanMakePayments();
            }

            public final boolean hasScreenScale() {
                return this._builder.hasScreenScale();
            }

            public final boolean hasSimulator() {
                return this._builder.hasSimulator();
            }

            public final boolean hasSystemBootTime() {
                return this._builder.hasSystemBootTime();
            }

            public final boolean hasUserInterfaceIdiom() {
                return this._builder.hasUserInterfaceIdiom();
            }

            public final boolean hasXcodeBuildVersion() {
                return this._builder.hasXcodeBuildVersion();
            }

            public final boolean hasXcodeSdkBuildVersion() {
                return this._builder.hasXcodeSdkBuildVersion();
            }

            public final boolean hasXcodeVersion() {
                return this._builder.hasXcodeVersion();
            }

            public final /* synthetic */ void plusAssignAllSkadnetworkId(DslList<String, SkadnetworkIdProxy> dslList, Iterable<String> values) {
                kotlin.jvm.internal.n.f(dslList, "<this>");
                kotlin.jvm.internal.n.f(values, "values");
                addAllSkadnetworkId(dslList, values);
            }

            public final /* synthetic */ void plusAssignSkadnetworkId(DslList<String, SkadnetworkIdProxy> dslList, String value) {
                kotlin.jvm.internal.n.f(dslList, "<this>");
                kotlin.jvm.internal.n.f(value, "value");
                addSkadnetworkId(dslList, value);
            }

            public final void setAdAttributionKitSupported(boolean z10) {
                this._builder.setAdAttributionKitSupported(z10);
            }

            public final void setBuiltSdkVersion(String value) {
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.setBuiltSdkVersion(value);
            }

            public final void setBundleVersionFull(String value) {
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.setBundleVersionFull(value);
            }

            public final void setCanMakePayments(boolean z10) {
                this._builder.setCanMakePayments(z10);
            }

            public final void setScreenScale(int i10) {
                this._builder.setScreenScale(i10);
            }

            public final void setSimulator(boolean z10) {
                this._builder.setSimulator(z10);
            }

            public final /* synthetic */ void setSkadnetworkId(DslList dslList, int i10, String value) {
                kotlin.jvm.internal.n.f(dslList, "<this>");
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.setSkadnetworkId(i10, value);
            }

            public final void setSystemBootTime(long j10) {
                this._builder.setSystemBootTime(j10);
            }

            public final void setUserInterfaceIdiom(StaticDeviceInfoOuterClass.StaticDeviceInfo.UserInterfaceIdiom value) {
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.setUserInterfaceIdiom(value);
            }

            public final void setUserInterfaceIdiomValue(int i10) {
                this._builder.setUserInterfaceIdiomValue(i10);
            }

            public final void setXcodeBuildVersion(String value) {
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.setXcodeBuildVersion(value);
            }

            public final void setXcodeSdkBuildVersion(String value) {
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.setXcodeSdkBuildVersion(value);
            }

            public final void setXcodeVersion(String value) {
                kotlin.jvm.internal.n.f(value, "value");
                this._builder.setXcodeVersion(value);
            }

            private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder) {
                this._builder = builder;
            }
        }

        private IosKt() {
        }
    }

    private StaticDeviceInfoKt() {
    }

    /* JADX INFO: renamed from: -initializeandroid, reason: not valid java name */
    public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android m3317initializeandroid(jk.b block) {
        kotlin.jvm.internal.n.f(block, "block");
        AndroidKt.Dsl.Companion companion = AndroidKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builderNewBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder();
        kotlin.jvm.internal.n.e(builderNewBuilder, "newBuilder()");
        AndroidKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* JADX INFO: renamed from: -initializeios, reason: not valid java name */
    public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios m3318initializeios(jk.b block) {
        kotlin.jvm.internal.n.f(block, "block");
        IosKt.Dsl.Companion companion = IosKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builderNewBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.newBuilder();
        kotlin.jvm.internal.n.e(builderNewBuilder, "newBuilder()");
        IosKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
