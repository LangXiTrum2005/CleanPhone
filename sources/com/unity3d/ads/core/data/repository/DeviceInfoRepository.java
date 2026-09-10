package com.unity3d.ads.core.data.repository;

import ak.f;
import com.ironsource.O6;
import fn.e;
import fn.n0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0004J\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0004J\u0015\u0010\u000b\u001a\u0004\u0018\u00010\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0004J\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010 R\u0014\u0010-\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010 R\u0014\u0010/\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010$R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0007008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010 R\u0014\u00107\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010 R\u0014\u00109\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010 R\u0014\u0010;\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010 R\u0014\u0010?\u001a\u00020<8&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, d2 = {"Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfo", "(Lak/f;)Ljava/lang/Object;", "cachedStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "", "getIdfi", "getAuidString", "Lcom/google/protobuf/ByteString;", "getAuidByteString", "getUnityBuildGuid", "Lfn/n0;", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "getAllowedPii", "()Lfn/n0;", "allowedPii", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfo", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "getPiiData", "()Lgatewayprotocol/v1/PiiOuterClass$Pii;", "piiData", "Lfn/e;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "getVolumeSettingsChange", "()Lfn/e;", "volumeSettingsChange", "getAnalyticsUserId", "()Ljava/lang/String;", "analyticsUserId", "", "getRingerMode", "()I", "ringerMode", "", "getSystemBootTime", "()J", "systemBootTime", "getOrientation", "orientation", "getConnectionTypeStr", "connectionTypeStr", "getCurrentUiTheme", "currentUiTheme", "", "getLocaleList", "()Ljava/util/List;", "localeList", "getAppName", "appName", "getModel", O6.B, "getManufacturer", "manufacturer", "getOsVersion", "osVersion", "", "getHasInternet", "()Z", "hasInternet", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface DeviceInfoRepository {
    StaticDeviceInfoOuterClass.StaticDeviceInfo cachedStaticDeviceInfo();

    n0 getAllowedPii();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuidByteString(f fVar);

    Object getAuidString(f fVar);

    String getConnectionTypeStr();

    int getCurrentUiTheme();

    DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

    boolean getHasInternet();

    Object getIdfi(f fVar);

    List<String> getLocaleList();

    String getManufacturer();

    String getModel();

    String getOrientation();

    String getOsVersion();

    PiiOuterClass.Pii getPiiData();

    int getRingerMode();

    long getSystemBootTime();

    Object getUnityBuildGuid(f fVar);

    e getVolumeSettingsChange();

    Object staticDeviceInfo(f fVar);
}
