package com.unity3d.ads.core.domain;

import ak.f;
import ck.c;
import ck.e;
import com.google.protobuf.ByteString;
import com.ironsource.Ve;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import fn.a1;
import fn.n0;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096Bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleGatewayUniversalResponse;", "Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;", "appSetIdDataSource", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;)V", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", Ve.f27442n, "Lwj/r;", "invoke", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidHandleGatewayUniversalResponse implements HandleGatewayUniversalResponse {
    private final AndroidAppSetIdDataSource appSetIdDataSource;
    private final DeviceInfoRepository deviceInfoRepository;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse", f = "AndroidHandleGatewayUniversalResponse.kt", l = {44, 50, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHandleGatewayUniversalResponse.this.invoke(null, this);
        }
    }

    public AndroidHandleGatewayUniversalResponse(SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, AndroidAppSetIdDataSource appSetIdDataSource) {
        n.f(sessionRepository, "sessionRepository");
        n.f(deviceInfoRepository, "deviceInfoRepository");
        n.f(appSetIdDataSource, "appSetIdDataSource");
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.appSetIdDataSource = appSetIdDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0123 A[PHI: r0 r15
  0x0123: PHI (r0v7 gatewayprotocol.v1.MutableDataOuterClass$MutableData) = 
  (r0v4 gatewayprotocol.v1.MutableDataOuterClass$MutableData)
  (r0v4 gatewayprotocol.v1.MutableDataOuterClass$MutableData)
  (r0v12 gatewayprotocol.v1.MutableDataOuterClass$MutableData)
 binds: [B:37:0x0109, B:39:0x0120, B:17:0x0047] A[DONT_GENERATE, DONT_INLINE]
  0x0123: PHI (r15v12 'this' com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse) = 
  (r15v0 'this' com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse A[IMMUTABLE_TYPE, THIS])
  (r15v0 'this' com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse A[IMMUTABLE_TYPE, THIS])
  (r15v20 'this' com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse)
 binds: [B:37:0x0109, B:39:0x0120, B:17:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x012c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0140  */
    /* JADX WARN: Code duplicated, block: B:49:0x0158  */
    /* JADX WARN: Code duplicated, block: B:51:0x015a A[PHI: r0 r15
  0x015a: PHI (r0v9 com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse) = 
  (r0v8 com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse)
  (r0v11 com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse)
 binds: [B:45:0x013e, B:50:0x0159] A[DONT_GENERATE, DONT_INLINE]
  0x015a: PHI (r15v14 gatewayprotocol.v1.MutableDataOuterClass$MutableData) = 
  (r15v13 gatewayprotocol.v1.MutableDataOuterClass$MutableData)
  (r15v17 gatewayprotocol.v1.MutableDataOuterClass$MutableData)
 binds: [B:45:0x013e, B:50:0x0159] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0160  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.unity3d.ads.core.domain.HandleGatewayUniversalResponse
    public Object invoke(UniversalResponseOuterClass.UniversalResponse universalResponse, f fVar) throws GatewayException {
        AnonymousClass1 anonymousClass1;
        MutableDataOuterClass.MutableData mutableData;
        a1 a1Var;
        Object value;
        AllowedPiiOuterClass.AllowedPii allowedPii;
        AndroidHandleGatewayUniversalResponse androidHandleGatewayUniversalResponse;
        MutableDataOuterClass.MutableData mutableData2;
        SessionRepository sessionRepository;
        ByteString cache;
        AndroidHandleGatewayUniversalResponse androidHandleGatewayUniversalResponse2;
        SessionRepository sessionRepository2;
        ByteString privacyFsm;
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
        Object obj = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        r rVar = r.f53297a;
        bk.a aVar = bk.a.f5708a;
        if (i11 != 0) {
            if (i11 == 1) {
                MutableDataOuterClass.MutableData mutableData3 = (MutableDataOuterClass.MutableData) anonymousClass1.L$1;
                AndroidHandleGatewayUniversalResponse androidHandleGatewayUniversalResponse3 = (AndroidHandleGatewayUniversalResponse) anonymousClass1.L$0;
                t9.e.z(obj);
                mutableData = mutableData3;
                this = androidHandleGatewayUniversalResponse3;
                MutableDataOuterClass.MutableData mutableData4 = mutableData;
                androidHandleGatewayUniversalResponse = this;
                mutableData2 = mutableData4;
                if (mutableData2.hasSessionCounters()) {
                    SessionRepository sessionRepository3 = androidHandleGatewayUniversalResponse.sessionRepository;
                    SessionCountersOuterClass.SessionCounters sessionCounters = mutableData2.getSessionCounters();
                    n.e(sessionCounters, "mutableData.sessionCounters");
                    sessionRepository3.setSessionCounters(sessionCounters);
                }
                if (mutableData2.hasCache()) {
                    sessionRepository = androidHandleGatewayUniversalResponse.sessionRepository;
                    cache = mutableData2.getCache();
                    n.e(cache, "mutableData.cache");
                    anonymousClass1.L$0 = androidHandleGatewayUniversalResponse;
                    anonymousClass1.L$1 = mutableData2;
                    anonymousClass1.label = 2;
                    if (sessionRepository.setGatewayCache(cache, anonymousClass1) != aVar) {
                        androidHandleGatewayUniversalResponse2 = androidHandleGatewayUniversalResponse;
                        androidHandleGatewayUniversalResponse = androidHandleGatewayUniversalResponse2;
                        if (mutableData2.hasPrivacyFsm()) {
                            sessionRepository2 = androidHandleGatewayUniversalResponse.sessionRepository;
                            privacyFsm = mutableData2.getPrivacyFsm();
                            n.e(privacyFsm, "mutableData.privacyFsm");
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.label = 3;
                            if (sessionRepository2.setPrivacyFsm(privacyFsm, anonymousClass1) == aVar) {
                            }
                        }
                    }
                } else if (mutableData2.hasPrivacyFsm()) {
                    sessionRepository2 = androidHandleGatewayUniversalResponse.sessionRepository;
                    privacyFsm = mutableData2.getPrivacyFsm();
                    n.e(privacyFsm, "mutableData.privacyFsm");
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 3;
                    if (sessionRepository2.setPrivacyFsm(privacyFsm, anonymousClass1) == aVar) {
                    }
                }
                return aVar;
            }
            if (i11 == 2) {
                mutableData2 = (MutableDataOuterClass.MutableData) anonymousClass1.L$1;
                androidHandleGatewayUniversalResponse2 = (AndroidHandleGatewayUniversalResponse) anonymousClass1.L$0;
                t9.e.z(obj);
                androidHandleGatewayUniversalResponse = androidHandleGatewayUniversalResponse2;
                if (mutableData2.hasPrivacyFsm()) {
                    sessionRepository2 = androidHandleGatewayUniversalResponse.sessionRepository;
                    privacyFsm = mutableData2.getPrivacyFsm();
                    n.e(privacyFsm, "mutableData.privacyFsm");
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 3;
                    if (sessionRepository2.setPrivacyFsm(privacyFsm, anonymousClass1) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            return rVar;
        }
        t9.e.z(obj);
        if (universalResponse.hasError()) {
            ErrorOuterClass.PublicErrorCode errorCode = universalResponse.getError().getErrorCode();
            n.e(errorCode, "response.error.errorCode");
            String initErrorMsg = UnityAdsErrorKt.getInitErrorMsg(errorCode, this.sessionRepository.getGameId());
            if (initErrorMsg == null) {
                initErrorMsg = universalResponse.getError().getErrorText();
            }
            String str = initErrorMsg;
            n.e(str, "response.error.errorCode… response.error.errorText");
            throw new GatewayException(str, new IllegalStateException(universalResponse.getError().getErrorText()), "gateway_universal", universalResponse.getError().getErrorText(), universalResponse.getError().getErrorCode());
        }
        if (universalResponse.hasMutableData()) {
            mutableData = universalResponse.getMutableData();
            n0 allowedPii2 = this.deviceInfoRepository.getAllowedPii();
            do {
                a1Var = (a1) allowedPii2;
                value = a1Var.getValue();
                allowedPii = mutableData.getAllowedPii();
                n.e(allowedPii, "mutableData.allowedPii");
            } while (!a1Var.c0(value, allowedPii));
            if (mutableData.getAllowedPii().getAppsetId()) {
                this.appSetIdDataSource.invoke();
            }
            SessionRepository sessionRepository4 = this.sessionRepository;
            ByteString currentState = mutableData.getCurrentState();
            n.e(currentState, "mutableData.currentState");
            sessionRepository4.setGatewayState(currentState);
            if (mutableData.hasSessionToken()) {
                SessionRepository sessionRepository5 = this.sessionRepository;
                ByteString sessionToken = mutableData.getSessionToken();
                n.e(sessionToken, "mutableData.sessionToken");
                sessionRepository5.setSessionToken(sessionToken);
            }
            if (mutableData.hasPrivacy()) {
                SessionRepository sessionRepository6 = this.sessionRepository;
                ByteString privacy = mutableData.getPrivacy();
                n.e(privacy, "mutableData.privacy");
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = mutableData;
                anonymousClass1.label = 1;
                if (sessionRepository6.setPrivacy(privacy, anonymousClass1) != aVar) {
                    MutableDataOuterClass.MutableData mutableData5 = mutableData;
                    androidHandleGatewayUniversalResponse = this;
                    mutableData2 = mutableData5;
                    if (mutableData2.hasSessionCounters()) {
                        SessionRepository sessionRepository7 = androidHandleGatewayUniversalResponse.sessionRepository;
                        SessionCountersOuterClass.SessionCounters sessionCounters2 = mutableData2.getSessionCounters();
                        n.e(sessionCounters2, "mutableData.sessionCounters");
                        sessionRepository7.setSessionCounters(sessionCounters2);
                    }
                    if (mutableData2.hasCache()) {
                        sessionRepository = androidHandleGatewayUniversalResponse.sessionRepository;
                        cache = mutableData2.getCache();
                        n.e(cache, "mutableData.cache");
                        anonymousClass1.L$0 = androidHandleGatewayUniversalResponse;
                        anonymousClass1.L$1 = mutableData2;
                        anonymousClass1.label = 2;
                        if (sessionRepository.setGatewayCache(cache, anonymousClass1) != aVar) {
                            androidHandleGatewayUniversalResponse2 = androidHandleGatewayUniversalResponse;
                            androidHandleGatewayUniversalResponse = androidHandleGatewayUniversalResponse2;
                            if (mutableData2.hasPrivacyFsm()) {
                                sessionRepository2 = androidHandleGatewayUniversalResponse.sessionRepository;
                                privacyFsm = mutableData2.getPrivacyFsm();
                                n.e(privacyFsm, "mutableData.privacyFsm");
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.label = 3;
                                if (sessionRepository2.setPrivacyFsm(privacyFsm, anonymousClass1) == aVar) {
                                }
                            }
                        }
                    } else if (mutableData2.hasPrivacyFsm()) {
                        sessionRepository2 = androidHandleGatewayUniversalResponse.sessionRepository;
                        privacyFsm = mutableData2.getPrivacyFsm();
                        n.e(privacyFsm, "mutableData.privacyFsm");
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.label = 3;
                        if (sessionRepository2.setPrivacyFsm(privacyFsm, anonymousClass1) == aVar) {
                        }
                    }
                }
            } else {
                MutableDataOuterClass.MutableData mutableData6 = mutableData;
                androidHandleGatewayUniversalResponse = this;
                mutableData2 = mutableData6;
                if (mutableData2.hasSessionCounters()) {
                    SessionRepository sessionRepository8 = androidHandleGatewayUniversalResponse.sessionRepository;
                    SessionCountersOuterClass.SessionCounters sessionCounters3 = mutableData2.getSessionCounters();
                    n.e(sessionCounters3, "mutableData.sessionCounters");
                    sessionRepository8.setSessionCounters(sessionCounters3);
                }
                if (mutableData2.hasCache()) {
                    sessionRepository = androidHandleGatewayUniversalResponse.sessionRepository;
                    cache = mutableData2.getCache();
                    n.e(cache, "mutableData.cache");
                    anonymousClass1.L$0 = androidHandleGatewayUniversalResponse;
                    anonymousClass1.L$1 = mutableData2;
                    anonymousClass1.label = 2;
                    if (sessionRepository.setGatewayCache(cache, anonymousClass1) != aVar) {
                        androidHandleGatewayUniversalResponse2 = androidHandleGatewayUniversalResponse;
                        androidHandleGatewayUniversalResponse = androidHandleGatewayUniversalResponse2;
                        if (mutableData2.hasPrivacyFsm()) {
                            sessionRepository2 = androidHandleGatewayUniversalResponse.sessionRepository;
                            privacyFsm = mutableData2.getPrivacyFsm();
                            n.e(privacyFsm, "mutableData.privacyFsm");
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.label = 3;
                            if (sessionRepository2.setPrivacyFsm(privacyFsm, anonymousClass1) == aVar) {
                            }
                        }
                    }
                } else if (mutableData2.hasPrivacyFsm()) {
                    sessionRepository2 = androidHandleGatewayUniversalResponse.sessionRepository;
                    privacyFsm = mutableData2.getPrivacyFsm();
                    n.e(privacyFsm, "mutableData.privacyFsm");
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 3;
                    if (sessionRepository2.setPrivacyFsm(privacyFsm, anonymousClass1) == aVar) {
                    }
                }
            }
            return aVar;
        }
        return rVar;
    }
}
