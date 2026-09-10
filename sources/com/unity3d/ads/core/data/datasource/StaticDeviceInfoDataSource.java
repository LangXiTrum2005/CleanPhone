package com.unity3d.ads.core.data.datasource;

import ak.f;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H&¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0003H&¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0003H&¢\u0006\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/StaticDeviceInfoDataSource;", "", "", "", "additionalStores", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "fetch", "(Ljava/util/List;Lak/f;)Ljava/lang/Object;", "fetchCached", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getIdfi", "(Lak/f;)Ljava/lang/Object;", "getAuid", "getUnityBuildGuid", "", "getSystemBootTime", "()J", "getAppName", "()Ljava/lang/String;", "getModel", "getManufacturer", "getOsVersion", "getAnalyticsUserId", "analyticsUserId", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface StaticDeviceInfoDataSource {
    Object fetch(List<String> list, f fVar);

    StaticDeviceInfoOuterClass.StaticDeviceInfo fetchCached();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuid(f fVar);

    Object getIdfi(f fVar);

    String getManufacturer();

    String getModel();

    String getOsVersion();

    long getSystemBootTime();

    Object getUnityBuildGuid(f fVar);
}
