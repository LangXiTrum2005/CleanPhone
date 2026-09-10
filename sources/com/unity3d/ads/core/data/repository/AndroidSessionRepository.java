package com.unity3d.ads.core.data.repository;

import ak.f;
import ak.l;
import ck.i;
import cn.a0;
import cn.d0;
import cn.w;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.protobuf.ByteString;
import com.ironsource.X3;
import com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.properties.SessionIdReader;
import fn.a1;
import fn.e;
import fn.g;
import fn.k0;
import fn.m0;
import fn.n0;
import fn.r0;
import fn.u0;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersKt;
import gatewayprotocol.v1.SessionCountersOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;
import xj.b0;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\u0013J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010\u0013J\u000f\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010\u0013J\u000f\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010\u0013J\u000f\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010\u0013J\u000f\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010\u0013J\u000f\u0010'\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010\u0013J\u0013\u0010)\u001a\u00020(H\u0096@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020(H\u0096@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020(H\u0096@ø\u0001\u0000¢\u0006\u0004\b.\u0010*J\u001b\u0010/\u001a\u00020\u00112\u0006\u0010+\u001a\u00020(H\u0096@ø\u0001\u0000¢\u0006\u0004\b/\u0010-J\u0013\u00100\u001a\u00020(H\u0096@ø\u0001\u0000¢\u0006\u0004\b0\u0010*J\u001b\u00101\u001a\u00020\u00112\u0006\u0010+\u001a\u00020(H\u0096@ø\u0001\u0000¢\u0006\u0004\b1\u0010-J\u0013\u00102\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b2\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00103R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\t058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000208058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\t0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010?\u001a\b\u0012\u0004\u0012\u00020>0=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR \u0010H\u001a\b\u0012\u0004\u0012\u00020D0G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001e\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00107R\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020(058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u00107R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u000208058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u00107R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020P058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u00107R\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020R058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u00107R\u001c\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010T058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u00107R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020(058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u00107R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020(058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u00107R\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020L058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u00107R\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u00107R \u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\0[058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u00107R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\u0019058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u00107R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u000208058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u00107R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u000208058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u00107R*\u0010b\u001a\u0004\u0018\u00010a8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bb\u0010c\u0012\u0004\bh\u0010\u0013\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR(\u0010m\u001a\u0004\u0018\u00010L2\b\u0010+\u001a\u0004\u0018\u00010L8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010p\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010q\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR$\u0010w\u001a\u00020P2\u0006\u0010+\u001a\u00020P8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010|\u001a\u00020R2\u0006\u0010+\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R*\u0010\u0081\u0001\u001a\u0004\u0018\u00010T2\b\u0010+\u001a\u0004\u0018\u00010T8V@VX\u0096\u000e¢\u0006\r\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R(\u0010\u0085\u0001\u001a\u00020(2\u0006\u0010+\u001a\u00020(8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\b\u0082\u0001\u0010o\"\u0006\b\u0083\u0001\u0010\u0084\u0001R(\u0010\u0088\u0001\u001a\u00020(2\u0006\u0010+\u001a\u00020(8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\b\u0086\u0001\u0010o\"\u0006\b\u0087\u0001\u0010\u0084\u0001R)\u0010\u008d\u0001\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R'\u0010\u0090\u0001\u001a\u00020L2\u0006\u0010+\u001a\u00020L8V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u008e\u0001\u0010j\"\u0005\b\u008f\u0001\u0010lR)\u0010\u0095\u0001\u001a\u00020Y2\u0006\u0010+\u001a\u00020Y8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R4\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020\\0[2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\\0[8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\b\u0096\u0001\u0010B\"\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001d\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020Y0:8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0016\u0010\u009d\u0001\u001a\u0002088VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010rR\u0016\u0010\u009e\u0001\u001a\u0002088VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010rR\u0016\u0010\u009f\u0001\u001a\u0002088VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010rR\u0018\u0010£\u0001\u001a\u00030 \u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0017\u0010¦\u0001\u001a\u00020\u00198VX\u0096\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R(\u0010ª\u0001\u001a\u0002082\u0006\u0010+\u001a\u0002088V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\b§\u0001\u0010r\"\u0006\b¨\u0001\u0010©\u0001R\u0016\u0010«\u0001\u001a\u0002088VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b«\u0001\u0010rR\u0016\u0010¬\u0001\u001a\u0002088VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010rR\u0018\u0010®\u0001\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010jR\u0018\u0010°\u0001\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010j\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006±\u0001"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidSessionRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "gatewayCacheDataSource", "privacyDataSource", "fsmDataSource", "nativeConfigDataSource", "Lcom/unity3d/ads/core/data/datasource/AndroidUnityInfoDataSource;", "unityInfoDataSource", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "defaultNativeConfiguration", "Lcn/w;", "dispatcher", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/AndroidUnityInfoDataSource;Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;Lcn/w;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "Lwj/r;", "incrementLoadRequestCount", "()V", "incrementLoadRequestAdmCount", "incrementBannerLoadRequestCount", "incrementBannerLoadRequestAdmCount", "incrementBannerImpressionCount", "incrementGlobalAdsFocusChangeCount", "", "timeMs", "addTimeToGlobalAdsFocusTime", "(I)V", "incrementFocusChangeCount", "ms", "setInitializationLatency", "setLastLoadLatency", "incrementAllErrorsCount", "incrementCacheTimeoutErrorsCount", "incrementSuccessCount", "incrementTokenSequenceNumber", "incrementTokenWinsCount", "incrementTokenStartsCount", "resetTokenCounters", "Lcom/google/protobuf/ByteString;", "getGatewayCache", "(Lak/f;)Ljava/lang/Object;", X3.i.X, "setGatewayCache", "(Lcom/google/protobuf/ByteString;Lak/f;)Ljava/lang/Object;", "getPrivacy", "setPrivacy", "getPrivacyFsm", "setPrivacyFsm", "persistNativeConfiguration", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "Lcom/unity3d/ads/core/data/datasource/AndroidUnityInfoDataSource;", "Lfn/n0;", "_sdkConfiguration", "Lfn/n0;", "", "isInit", "Lfn/e;", "persistedNativeConfiguration", "Lfn/e;", "", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "scarEligibleFormats", "Ljava/util/List;", "getScarEligibleFormats", "()Ljava/util/List;", "Lfn/m0;", "Lcom/unity3d/ads/core/data/model/SessionChange;", "_onChange", "Lfn/m0;", "Lfn/r0;", "onChange", "Lfn/r0;", "getOnChange", "()Lfn/r0;", "", "_gameId", "_sessionId", "_isTestModeEnabled", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "_sessionCounters", "Lcom/unity3d/ads/core/data/model/TokenCounters;", "_tokenCounters", "Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "_initializationError", "_sessionToken", "_currentState", "_gatewayUrl", "Lcom/unity3d/ads/core/data/model/InitializationState;", "_initializationState", "", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride;", "_requestUrlOverride", "_headerBiddingTokenCounter", "_shouldInitialize", "_isFirstInitAttempt", "Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;", "initializationConfiguration", "Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;", "getInitializationConfiguration", "()Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;", "setInitializationConfiguration", "(Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;)V", "getInitializationConfiguration$annotations", "getGameId", "()Ljava/lang/String;", "setGameId", "(Ljava/lang/String;)V", AndroidGetAdPlayerContext.KEY_GAME_ID, "getSessionId", "()Lcom/google/protobuf/ByteString;", JsonStorageKeyNames.SESSION_ID_KEY, "isTestModeEnabled", "()Z", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", "sessionCounters", "getTokenCounters", "()Lcom/unity3d/ads/core/data/model/TokenCounters;", "setTokenCounters", "(Lcom/unity3d/ads/core/data/model/TokenCounters;)V", "tokenCounters", "getInitializationError", "()Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "setInitializationError", "(Lcom/unity3d/ads/core/data/model/exception/InitializationException;)V", "initializationError", "getSessionToken", "setSessionToken", "(Lcom/google/protobuf/ByteString;)V", "sessionToken", "getGatewayState", "setGatewayState", "gatewayState", "getNativeConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "setNativeConfiguration", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;)V", "nativeConfiguration", "getGatewayUrl", "setGatewayUrl", "gatewayUrl", "getInitializationState", "()Lcom/unity3d/ads/core/data/model/InitializationState;", "setInitializationState", "(Lcom/unity3d/ads/core/data/model/InitializationState;)V", "initializationState", "getRequestUrlOverrides", "setRequestUrlOverrides", "(Ljava/util/List;)V", "requestUrlOverrides", "getObserveInitializationState", "()Lfn/e;", "observeInitializationState", "isSdkInitialized", "isNativeConfigReady", "isDiagnosticsEnabled", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "getFeatureFlags", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "featureFlags", "getHeaderBiddingTokenCounter", "()I", "headerBiddingTokenCounter", "getShouldInitialize", "setShouldInitialize", "(Z)V", "shouldInitialize", "isOmEnabled", "isFirstInitAttempt", "getUnityInstallationId", "unityInstallationId", "getUnityMegaSessionId", "unityMegaSessionId", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidSessionRepository implements SessionRepository {
    private final n0 _currentState;
    private n0 _gameId;
    private final n0 _gatewayUrl;
    private final n0 _headerBiddingTokenCounter;
    private final n0 _initializationError;
    private final n0 _initializationState;
    private final n0 _isFirstInitAttempt;
    private final n0 _isTestModeEnabled;
    private m0 _onChange;
    private final n0 _requestUrlOverride;
    private final n0 _sdkConfiguration;
    private final n0 _sessionCounters;
    private final n0 _sessionId;
    private final n0 _sessionToken;
    private final n0 _shouldInitialize;
    private final n0 _tokenCounters;
    private final ByteStringDataSource fsmDataSource;
    private final ByteStringDataSource gatewayCacheDataSource;
    private InitializationConfigurationInternal initializationConfiguration;
    private final n0 isInit;
    private final ByteStringDataSource nativeConfigDataSource;
    private final r0 onChange;
    private final e persistedNativeConfiguration;
    private final ByteStringDataSource privacyDataSource;
    private final List<AdFormatOuterClass.AdFormat> scarEligibleFormats;
    private final AndroidUnityInfoDataSource unityInfoDataSource;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @ck.e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$1", f = "AndroidSessionRepository.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        final /* synthetic */ SendDiagnosticEvent $sendDiagnosticEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SendDiagnosticEvent sendDiagnosticEvent, f fVar) {
            super(2, fVar);
            this.$sendDiagnosticEvent = sendDiagnosticEvent;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidSessionRepository.this.new AnonymousClass1(this.$sendDiagnosticEvent, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    t9.e.z(obj);
                    ByteStringDataSource byteStringDataSource = AndroidSessionRepository.this.nativeConfigDataSource;
                    this.label = 1;
                    obj = byteStringDataSource.get(this);
                    bk.a aVar = bk.a.f5708a;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                }
                ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                if (!data.isEmpty()) {
                    n0 n0Var = AndroidSessionRepository.this._sdkConfiguration;
                    NativeConfigurationOuterClass.NativeConfiguration from = NativeConfigurationOuterClass.NativeConfiguration.parseFrom(data);
                    n.e(from, "parseFrom(data)");
                    a1 a1Var = (a1) n0Var;
                    a1Var.getClass();
                    a1Var.e0(null, from);
                }
            } catch (Exception e10) {
                SendDiagnosticEvent sendDiagnosticEvent = this.$sendDiagnosticEvent;
                String message = e10.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialize_missed_native_parsing", (Double) null, b0.P(new wj.f("debugReason", message)), (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
            }
            n0 n0Var2 = AndroidSessionRepository.this.isInit;
            Boolean bool = Boolean.TRUE;
            a1 a1Var2 = (a1) n0Var2;
            a1Var2.getClass();
            a1Var2.e0(null, bool);
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @ck.e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {259}, m = "getGatewayCache")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class C07551 extends ck.c {
        int label;
        /* synthetic */ Object result;

        public C07551(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getGatewayCache(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @ck.e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {262}, m = "getPrivacy")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class C07561 extends ck.c {
        int label;
        /* synthetic */ Object result;

        public C07561(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getPrivacy(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @ck.e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {268}, m = "getPrivacyFsm")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class C07571 extends ck.c {
        int label;
        /* synthetic */ Object result;

        public C07571(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getPrivacyFsm(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @ck.e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {264, 265}, m = "setPrivacy")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class C07581 extends ck.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C07581(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.setPrivacy(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @ck.e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {270, 271}, m = "setPrivacyFsm")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class C07591 extends ck.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C07591(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.setPrivacyFsm(null, this);
        }
    }

    public AndroidSessionRepository(ByteStringDataSource gatewayCacheDataSource, ByteStringDataSource privacyDataSource, ByteStringDataSource fsmDataSource, ByteStringDataSource nativeConfigDataSource, AndroidUnityInfoDataSource unityInfoDataSource, NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration, w dispatcher, SendDiagnosticEvent sendDiagnosticEvent) {
        n.f(gatewayCacheDataSource, "gatewayCacheDataSource");
        n.f(privacyDataSource, "privacyDataSource");
        n.f(fsmDataSource, "fsmDataSource");
        n.f(nativeConfigDataSource, "nativeConfigDataSource");
        n.f(unityInfoDataSource, "unityInfoDataSource");
        n.f(defaultNativeConfiguration, "defaultNativeConfiguration");
        n.f(dispatcher, "dispatcher");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.gatewayCacheDataSource = gatewayCacheDataSource;
        this.privacyDataSource = privacyDataSource;
        this.fsmDataSource = fsmDataSource;
        this.nativeConfigDataSource = nativeConfigDataSource;
        this.unityInfoDataSource = unityInfoDataSource;
        a1 a1VarC = g.c(defaultNativeConfiguration);
        this._sdkConfiguration = a1VarC;
        a1 a1VarC2 = g.c(Boolean.FALSE);
        this.isInit = a1VarC2;
        d0.w(d0.b(dispatcher), null, new AnonymousClass1(sendDiagnosticEvent, null), 3);
        final k0 k0Var = new k0(a1VarC, a1VarC2, new AndroidSessionRepository$persistedNativeConfiguration$1(null));
        final e eVar = new e() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", X3.i.X, "Lwj/r;", "emit", "(Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements fn.f {
                final /* synthetic */ fn.f $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                @ck.e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2", f = "AndroidSessionRepository.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
                public static final class AnonymousClass1 extends ck.c {
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(fn.f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // fn.f
                public final Object emit(Object obj, f fVar) {
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
                    Object obj2 = anonymousClass1.result;
                    int i11 = anonymousClass1.label;
                    if (i11 == 0) {
                        t9.e.z(obj2);
                        fn.f fVar2 = this.$this_unsafeFlow;
                        if (((Boolean) ((wj.f) obj).f53284b).booleanValue()) {
                            anonymousClass1.label = 1;
                            Object objEmit = fVar2.emit(obj, anonymousClass1);
                            bk.a aVar = bk.a.f5708a;
                            if (objEmit == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t9.e.z(obj2);
                    }
                    return r.f53297a;
                }
            }

            @Override // fn.e
            public Object collect(fn.f fVar, f fVar2) {
                Object objCollect = k0Var.collect(new AnonymousClass2(fVar), fVar2);
                return objCollect == bk.a.f5708a ? objCollect : r.f53297a;
            }
        };
        this.persistedNativeConfiguration = new e() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1

            /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", X3.i.X, "Lwj/r;", "emit", "(Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements fn.f {
                final /* synthetic */ fn.f $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                @ck.e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2", f = "AndroidSessionRepository.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
                public static final class AnonymousClass1 extends ck.c {
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(fn.f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // fn.f
                public final Object emit(Object obj, f fVar) {
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
                    Object obj2 = anonymousClass1.result;
                    int i11 = anonymousClass1.label;
                    if (i11 == 0) {
                        t9.e.z(obj2);
                        fn.f fVar2 = this.$this_unsafeFlow;
                        Object obj3 = ((wj.f) obj).f53283a;
                        anonymousClass1.label = 1;
                        Object objEmit = fVar2.emit(obj3, anonymousClass1);
                        bk.a aVar = bk.a.f5708a;
                        if (objEmit == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t9.e.z(obj2);
                    }
                    return r.f53297a;
                }
            }

            @Override // fn.e
            public Object collect(fn.f fVar, f fVar2) {
                Object objCollect = eVar.collect(new AnonymousClass2(fVar), fVar2);
                return objCollect == bk.a.f5708a ? objCollect : r.f53297a;
            }
        };
        this.scarEligibleFormats = new ArrayList();
        u0 u0VarA = g.a((7 & 1) != 0 ? 0 : 100, (7 & 2) == 0 ? 64 : 0, en.a.f40122a);
        this._onChange = u0VarA;
        this.onChange = g.g(u0VarA);
        String gameId = ClientProperties.getGameId();
        this._gameId = g.c(gameId == null ? null : gameId);
        UUID uuidFromString = UUID.fromString(SessionIdReader.INSTANCE.getSessionId());
        n.e(uuidFromString, "fromString(SessionIdReader.sessionId)");
        this._sessionId = g.c(ProtobufExtensionsKt.toByteString(uuidFromString));
        this._isTestModeEnabled = g.c(Boolean.valueOf(SdkProperties.isTestMode()));
        SessionCountersOuterClass.SessionCounters sessionCountersBuild = SessionCountersOuterClass.SessionCounters.newBuilder().build();
        n.e(sessionCountersBuild, "newBuilder().build()");
        this._sessionCounters = g.c(sessionCountersBuild);
        this._tokenCounters = g.c(new TokenCounters(0, 0, 0));
        this._initializationError = g.c(null);
        ByteString EMPTY = ByteString.EMPTY;
        n.e(EMPTY, "EMPTY");
        this._sessionToken = g.c(EMPTY);
        this._currentState = g.c(EMPTY);
        this._gatewayUrl = g.c(UnityAdsConstants.DefaultUrls.GATEWAY_URL);
        this._initializationState = g.c(InitializationState.NOT_INITIALIZED);
        this._requestUrlOverride = g.c(v.f53866a);
        this._headerBiddingTokenCounter = g.c(0);
        Boolean bool = Boolean.TRUE;
        this._shouldInitialize = g.c(bool);
        this._isFirstInitAttempt = g.c(bool);
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void addTimeToGlobalAdsFocusTime(int timeMs) {
        a1 a1Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        n0 n0Var = this._sessionCounters;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            n.e(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setGlobalAdsFocusTime(dsl_create.getGlobalAdsFocusTime() + timeMs);
        } while (!a1Var.c0(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
        NativeConfigurationOuterClass.FeatureFlags featureFlags = getNativeConfiguration().getFeatureFlags();
        n.e(featureFlags, "nativeConfiguration.featureFlags");
        return featureFlags;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getGameId() {
        a1 a1Var;
        Object value;
        String gameId;
        n0 n0Var = this._gameId;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            gameId = ClientProperties.getGameId();
            if (gameId == null) {
                gameId = null;
            }
        } while (!a1Var.c0(value, gameId));
        return gameId;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object getGatewayCache(f fVar) {
        C07551 c07551;
        if (fVar instanceof C07551) {
            c07551 = (C07551) fVar;
            int i10 = c07551.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07551.label = i10 - Integer.MIN_VALUE;
            } else {
                c07551 = new C07551(fVar);
            }
        } else {
            c07551 = new C07551(fVar);
        }
        Object obj = c07551.result;
        int i11 = c07551.label;
        if (i11 == 0) {
            t9.e.z(obj);
            ByteStringDataSource byteStringDataSource = this.gatewayCacheDataSource;
            c07551.label = 1;
            obj = byteStringDataSource.get(c07551);
            bk.a aVar = bk.a.f5708a;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
        }
        ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
        n.e(data, "gatewayCacheDataSource.get().data");
        return data;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ByteString getGatewayState() {
        return (ByteString) ((a1) this._currentState).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getGatewayUrl() {
        return (String) ((a1) this._gatewayUrl).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public int getHeaderBiddingTokenCounter() {
        a1 a1Var;
        Object value;
        Number number;
        n0 n0Var = this._headerBiddingTokenCounter;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            number = (Number) value;
        } while (!a1Var.c0(value, Integer.valueOf(number.intValue() + 1)));
        return number.intValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public InitializationConfigurationInternal getInitializationConfiguration() {
        return this.initializationConfiguration;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public InitializationException getInitializationError() {
        return (InitializationException) ((a1) this._initializationError).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public InitializationState getInitializationState() {
        return (InitializationState) ((a1) this._initializationState).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
        if (((Boolean) ((a1) this.isInit).getValue()).booleanValue()) {
            return (NativeConfigurationOuterClass.NativeConfiguration) ((a1) this._sdkConfiguration).getValue();
        }
        return (NativeConfigurationOuterClass.NativeConfiguration) d0.C(l.f3620a, new AndroidSessionRepository$nativeConfiguration$1(this, null));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public e getObserveInitializationState() {
        return this._initializationState;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public r0 getOnChange() {
        return this.onChange;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object getPrivacy(f fVar) {
        C07561 c07561;
        if (fVar instanceof C07561) {
            c07561 = (C07561) fVar;
            int i10 = c07561.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07561.label = i10 - Integer.MIN_VALUE;
            } else {
                c07561 = new C07561(fVar);
            }
        } else {
            c07561 = new C07561(fVar);
        }
        Object obj = c07561.result;
        int i11 = c07561.label;
        if (i11 == 0) {
            t9.e.z(obj);
            ByteStringDataSource byteStringDataSource = this.privacyDataSource;
            c07561.label = 1;
            obj = byteStringDataSource.get(c07561);
            bk.a aVar = bk.a.f5708a;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
        }
        ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
        n.e(data, "privacyDataSource.get().data");
        return data;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object getPrivacyFsm(f fVar) {
        C07571 c07571;
        if (fVar instanceof C07571) {
            c07571 = (C07571) fVar;
            int i10 = c07571.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07571.label = i10 - Integer.MIN_VALUE;
            } else {
                c07571 = new C07571(fVar);
            }
        } else {
            c07571 = new C07571(fVar);
        }
        Object obj = c07571.result;
        int i11 = c07571.label;
        if (i11 == 0) {
            t9.e.z(obj);
            ByteStringDataSource byteStringDataSource = this.fsmDataSource;
            c07571.label = 1;
            obj = byteStringDataSource.get(c07571);
            bk.a aVar = bk.a.f5708a;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
        }
        ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
        n.e(data, "fsmDataSource.get().data");
        return data;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public List<InitializationResponseOuterClass.RequestUrlOverride> getRequestUrlOverrides() {
        return (List) ((a1) this._requestUrlOverride).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public List<AdFormatOuterClass.AdFormat> getScarEligibleFormats() {
        return this.scarEligibleFormats;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public SessionCountersOuterClass.SessionCounters getSessionCounters() {
        return (SessionCountersOuterClass.SessionCounters) ((a1) this._sessionCounters).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ByteString getSessionId() {
        return (ByteString) ((a1) this._sessionId).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ByteString getSessionToken() {
        return (ByteString) ((a1) this._sessionToken).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean getShouldInitialize() {
        return ((Boolean) ((a1) this._shouldInitialize).getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public TokenCounters getTokenCounters() {
        return (TokenCounters) ((a1) this._tokenCounters).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getUnityInstallationId() {
        return this.unityInfoDataSource.getUnityInstallationId();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getUnityMegaSessionId() {
        return this.unityInfoDataSource.getUnityMegaSessionId();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementAllErrorsCount() {
        a1 a1Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        n0 n0Var = this._sessionCounters;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            n.e(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setAllErrorsCount(dsl_create.getAllErrorsCount() + 1);
        } while (!a1Var.c0(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerImpressionCount() {
        a1 a1Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        n0 n0Var = this._sessionCounters;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            n.e(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerImpressions(dsl_create.getBannerImpressions() + 1);
        } while (!a1Var.c0(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestAdmCount() {
        a1 a1Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        n0 n0Var = this._sessionCounters;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            n.e(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerRequestsAdm(dsl_create.getBannerRequestsAdm() + 1);
        } while (!a1Var.c0(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestCount() {
        a1 a1Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        n0 n0Var = this._sessionCounters;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            n.e(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerLoadRequests(dsl_create.getBannerLoadRequests() + 1);
        } while (!a1Var.c0(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementCacheTimeoutErrorsCount() {
        a1 a1Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        n0 n0Var = this._sessionCounters;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            n.e(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setCacheTimeoutErrorsCount(dsl_create.getCacheTimeoutErrorsCount() + 1);
        } while (!a1Var.c0(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementFocusChangeCount() {
        a1 a1Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        n0 n0Var = this._sessionCounters;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            n.e(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setFocusChangeCount(dsl_create.getFocusChangeCount() + 1);
        } while (!a1Var.c0(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementGlobalAdsFocusChangeCount() {
        a1 a1Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        n0 n0Var = this._sessionCounters;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            n.e(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setGlobalAdsFocusChangeCount(dsl_create.getGlobalAdsFocusChangeCount() + 1);
        } while (!a1Var.c0(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestAdmCount() {
        a1 a1Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        n0 n0Var = this._sessionCounters;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            n.e(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setLoadRequestsAdm(dsl_create.getLoadRequestsAdm() + 1);
        } while (!a1Var.c0(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestCount() {
        a1 a1Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        n0 n0Var = this._sessionCounters;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            n.e(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setLoadRequests(dsl_create.getLoadRequests() + 1);
        } while (!a1Var.c0(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementSuccessCount() {
        a1 a1Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        n0 n0Var = this._sessionCounters;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            n.e(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setSuccessCount(dsl_create.getSuccessCount() + 1);
        } while (!a1Var.c0(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenSequenceNumber() {
        a1 a1Var;
        Object value;
        TokenCounters tokenCounters;
        n0 n0Var = this._tokenCounters;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!a1Var.c0(value, TokenCounters.copy$default(tokenCounters, tokenCounters.getSeq() + 1, 0, 0, 6, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenStartsCount() {
        a1 a1Var;
        Object value;
        TokenCounters tokenCounters;
        n0 n0Var = this._tokenCounters;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!a1Var.c0(value, TokenCounters.copy$default(tokenCounters, 0, 0, tokenCounters.getStarts() + 1, 3, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenWinsCount() {
        a1 a1Var;
        Object value;
        TokenCounters tokenCounters;
        n0 n0Var = this._tokenCounters;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!a1Var.c0(value, TokenCounters.copy$default(tokenCounters, 0, tokenCounters.getWins() + 1, 0, 5, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isDiagnosticsEnabled() {
        return getNativeConfiguration().getDiagnosticEvents().getEnabled();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isFirstInitAttempt() {
        a1 a1Var;
        Object value;
        Boolean bool;
        n0 n0Var = this._isFirstInitAttempt;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!a1Var.c0(value, Boolean.FALSE));
        return bool.booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isNativeConfigReady() {
        return ((Boolean) ((a1) this.isInit).getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isOmEnabled() {
        return getNativeConfiguration().getEnableOm();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isSdkInitialized() {
        return getInitializationState() == InitializationState.INITIALIZED;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isTestModeEnabled() {
        a1 a1Var;
        Object value;
        boolean zIsTestMode;
        n0 n0Var = this._isTestModeEnabled;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            ((Boolean) value).getClass();
            zIsTestMode = SdkProperties.isTestMode();
        } while (!a1Var.c0(value, Boolean.valueOf(zIsTestMode)));
        return zIsTestMode;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object persistNativeConfiguration(f fVar) {
        ByteStringDataSource byteStringDataSource = this.nativeConfigDataSource;
        ByteString byteString = getNativeConfiguration().toByteString();
        n.e(byteString, "nativeConfiguration.toByteString()");
        Object obj = byteStringDataSource.set(byteString, fVar);
        return obj == bk.a.f5708a ? obj : r.f53297a;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void resetTokenCounters() {
        a1 a1Var;
        Object value;
        n0 n0Var = this._tokenCounters;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
        } while (!a1Var.c0(value, new TokenCounters(0, 0, 0)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGameId(String str) {
        a1 a1Var;
        Object value;
        n0 n0Var = this._gameId;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            ClientProperties.setGameId(str);
        } while (!a1Var.c0(value, str));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object setGatewayCache(ByteString byteString, f fVar) {
        Object obj = this.gatewayCacheDataSource.set(byteString, fVar);
        return obj == bk.a.f5708a ? obj : r.f53297a;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayState(ByteString value) {
        a1 a1Var;
        Object value2;
        n.f(value, "value");
        n0 n0Var = this._currentState;
        do {
            a1Var = (a1) n0Var;
            value2 = a1Var.getValue();
        } while (!a1Var.c0(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayUrl(String value) {
        a1 a1Var;
        Object value2;
        n.f(value, "value");
        n0 n0Var = this._gatewayUrl;
        do {
            a1Var = (a1) n0Var;
            value2 = a1Var.getValue();
        } while (!a1Var.c0(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationConfiguration(InitializationConfigurationInternal initializationConfigurationInternal) {
        this.initializationConfiguration = initializationConfigurationInternal;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationError(InitializationException initializationException) {
        a1 a1Var;
        Object value;
        n0 n0Var = this._initializationError;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
        } while (!a1Var.c0(value, initializationException));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationLatency(int ms) {
        a1 a1Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        n0 n0Var = this._sessionCounters;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            n.e(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setInitializationLatency(ms);
        } while (!a1Var.c0(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationState(InitializationState value) {
        a1 a1Var;
        Object value2;
        n.f(value, "value");
        n0 n0Var = this._initializationState;
        do {
            a1Var = (a1) n0Var;
            value2 = a1Var.getValue();
        } while (!a1Var.c0(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setLastLoadLatency(int ms) {
        a1 a1Var;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        n0 n0Var = this._sessionCounters;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            n.e(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setLastLoadLatency(ms);
        } while (!a1Var.c0(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration value) {
        a1 a1Var;
        Object value2;
        n.f(value, "value");
        n0 n0Var = this._sdkConfiguration;
        do {
            a1Var = (a1) n0Var;
            value2 = a1Var.getValue();
        } while (!a1Var.c0(value2, value));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r5.emit(r7, r0) == r4) goto L21;
     */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object setPrivacy(com.google.protobuf.ByteString r6, ak.f r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C07581
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C07581) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            bk.a r4 = bk.a.f5708a
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            t9.e.z(r7)
            goto L66
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            java.lang.Object r5 = r0.L$0
            com.unity3d.ads.core.data.repository.AndroidSessionRepository r5 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository) r5
            t9.e.z(r7)
            goto L51
        L3f:
            t9.e.z(r7)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r7 = r5.privacyDataSource
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r7.set(r6, r0)
            if (r7 != r4) goto L51
            goto L65
        L51:
            fn.m0 r5 = r5._onChange
            com.unity3d.ads.core.data.model.SessionChange$UserConsentChange r7 = new com.unity3d.ads.core.data.model.SessionChange$UserConsentChange
            r7.<init>(r6)
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r2
            java.lang.Object r5 = r5.emit(r7, r0)
            if (r5 != r4) goto L66
        L65:
            return r4
        L66:
            wj.r r5 = wj.r.f53297a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacy(com.google.protobuf.ByteString, ak.f):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r5.emit(r7, r0) == r4) goto L21;
     */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object setPrivacyFsm(com.google.protobuf.ByteString r6, ak.f r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C07591
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C07591) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            bk.a r4 = bk.a.f5708a
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            t9.e.z(r7)
            goto L66
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            java.lang.Object r5 = r0.L$0
            com.unity3d.ads.core.data.repository.AndroidSessionRepository r5 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository) r5
            t9.e.z(r7)
            goto L51
        L3f:
            t9.e.z(r7)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r7 = r5.fsmDataSource
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r7.set(r6, r0)
            if (r7 != r4) goto L51
            goto L65
        L51:
            fn.m0 r5 = r5._onChange
            com.unity3d.ads.core.data.model.SessionChange$PrivacyFsmChange r7 = new com.unity3d.ads.core.data.model.SessionChange$PrivacyFsmChange
            r7.<init>(r6)
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r2
            java.lang.Object r5 = r5.emit(r7, r0)
            if (r5 != r4) goto L66
        L65:
            return r4
        L66:
            wj.r r5 = wj.r.f53297a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacyFsm(com.google.protobuf.ByteString, ak.f):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setRequestUrlOverrides(List<InitializationResponseOuterClass.RequestUrlOverride> value) {
        a1 a1Var;
        Object value2;
        n.f(value, "value");
        n0 n0Var = this._requestUrlOverride;
        do {
            a1Var = (a1) n0Var;
            value2 = a1Var.getValue();
        } while (!a1Var.c0(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionCounters(SessionCountersOuterClass.SessionCounters value) {
        a1 a1Var;
        Object value2;
        n.f(value, "value");
        n0 n0Var = this._sessionCounters;
        do {
            a1Var = (a1) n0Var;
            value2 = a1Var.getValue();
        } while (!a1Var.c0(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionToken(ByteString value) {
        a1 a1Var;
        Object value2;
        n.f(value, "value");
        n0 n0Var = this._sessionToken;
        do {
            a1Var = (a1) n0Var;
            value2 = a1Var.getValue();
        } while (!a1Var.c0(value2, value));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setShouldInitialize(boolean z10) {
        a1 a1Var;
        Object value;
        n0 n0Var = this._shouldInitialize;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            ((Boolean) value).getClass();
        } while (!a1Var.c0(value, Boolean.valueOf(z10)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setTokenCounters(TokenCounters value) {
        a1 a1Var;
        Object value2;
        n.f(value, "value");
        n0 n0Var = this._tokenCounters;
        do {
            a1Var = (a1) n0Var;
            value2 = a1Var.getValue();
        } while (!a1Var.c0(value2, value));
    }

    public static /* synthetic */ void getInitializationConfiguration$annotations() {
    }
}
