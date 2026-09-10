package com.unity3d.ads.core.domain;

import ak.f;
import ck.c;
import ck.e;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0086Bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetAdPlayerContext;", "", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "", "", "invoke", "(Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidGetAdPlayerContext {
    public static final String KEY_GAME_ID = "gameId";
    private final DeviceInfoRepository deviceInfoRepository;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetAdPlayerContext$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.AndroidGetAdPlayerContext", f = "AndroidGetAdPlayerContext.kt", l = {15}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetAdPlayerContext.this.invoke(this);
        }
    }

    public AndroidGetAdPlayerContext(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository) {
        n.f(deviceInfoRepository, "deviceInfoRepository");
        n.f(sessionRepository, "sessionRepository");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object invoke(f fVar) {
        AnonymousClass1 anonymousClass1;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fVar);
        }
        Object objStaticDeviceInfo = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            t9.e.z(objStaticDeviceInfo);
            DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
            bk.a aVar = bk.a.f5708a;
            if (objStaticDeviceInfo == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (AndroidGetAdPlayerContext) anonymousClass1.L$0;
            t9.e.z(objStaticDeviceInfo);
        }
        StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = (StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.deviceInfoRepository.getDynamicDeviceInfo();
        String gameId = this.sessionRepository.getGameId();
        if (gameId == null) {
            gameId = "";
        }
        return b0.Q(new wj.f("bundleId", staticDeviceInfo.getBundleId()), new wj.f("bundleVersion", staticDeviceInfo.getBundleVersion()), new wj.f("webviewHash", "unknown"), new wj.f("sdkVersion", new Integer(SdkProperties.getVersionCode())), new wj.f("sdkVersionName", SdkProperties.getVersionName()), new wj.f("osVersion", staticDeviceInfo.getOsVersion()), new wj.f("systemLanguage", Locale.getDefault().toString()), new wj.f("deviceModel", staticDeviceInfo.getDeviceModel()), new wj.f("limitAdTracking", Boolean.valueOf(dynamicDeviceInfo.getLimitedTracking())), new wj.f("maxVolume", new Double(dynamicDeviceInfo.getAndroid().getMaxVolume())), new wj.f(KEY_GAME_ID, gameId));
    }
}
