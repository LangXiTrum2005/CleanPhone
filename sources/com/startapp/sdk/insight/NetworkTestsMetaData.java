package com.startapp.sdk.insight;

import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class NetworkTestsMetaData implements Serializable {
    private static final long serialVersionUID = 91489019050126377L;
    private boolean enabledCachedProcess;
    private String hostCt;
    private String hostLt;
    private String hostNir;
    private int numberOfRecordsMin = 5000;
    private int numberOfRecordsMax = 10000;
    private boolean enabled = false;
    private String projectId = "20050";
    private String connectivityTestHostname = "d2to8y50b3n6dq.cloudfront.net";
    private String connectivityTestFilename = "/favicon.ico";
    private boolean connectivityTestEnabled = true;
    private boolean nirCollectCellinfoEnabled = true;
    private boolean ctCollectCellinfoEnabled = true;
    private String connectivityTestCdnconfigUrl = "https://d2to8y50b3n6dq.cloudfront.net/truststores/[PROJECTID]/cdnconfig.zip";
    private String geoipUrl = "https://geoip.api.p3insight.de/geoip/";
    private long ctltIntervalMilli = 900000;
    private long sendIntervalMilli = 7200000;
    private long guardDiffMilli = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
    private long ttl = 86400000;
    private double iep = 0.0d;

    public final String a() {
        return this.hostCt;
    }

    public final String b() {
        return this.hostLt;
    }

    public final String c() {
        return this.hostNir;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            NetworkTestsMetaData networkTestsMetaData = (NetworkTestsMetaData) obj;
            if (this.numberOfRecordsMin != networkTestsMetaData.numberOfRecordsMin || this.numberOfRecordsMax != networkTestsMetaData.numberOfRecordsMax || this.enabled != networkTestsMetaData.enabled || this.enabledCachedProcess != networkTestsMetaData.enabledCachedProcess || this.connectivityTestEnabled != networkTestsMetaData.connectivityTestEnabled || this.nirCollectCellinfoEnabled != networkTestsMetaData.nirCollectCellinfoEnabled || this.ctCollectCellinfoEnabled != networkTestsMetaData.ctCollectCellinfoEnabled || this.ctltIntervalMilli != networkTestsMetaData.ctltIntervalMilli || this.sendIntervalMilli != networkTestsMetaData.sendIntervalMilli || this.ttl != networkTestsMetaData.ttl) {
                return false;
            }
            String str = this.hostCt;
            if (str == null ? networkTestsMetaData.hostCt != null : !str.equals(networkTestsMetaData.hostCt)) {
                return false;
            }
            String str2 = this.hostLt;
            if (str2 == null ? networkTestsMetaData.hostLt != null : !str2.equals(networkTestsMetaData.hostLt)) {
                return false;
            }
            String str3 = this.hostNir;
            if (str3 == null ? networkTestsMetaData.hostNir != null : !str3.equals(networkTestsMetaData.hostNir)) {
                return false;
            }
            String str4 = this.projectId;
            if (str4 == null ? networkTestsMetaData.projectId != null : !str4.equals(networkTestsMetaData.projectId)) {
                return false;
            }
            String str5 = this.connectivityTestHostname;
            if (str5 == null ? networkTestsMetaData.connectivityTestHostname != null : !str5.equals(networkTestsMetaData.connectivityTestHostname)) {
                return false;
            }
            String str6 = this.connectivityTestFilename;
            if (str6 == null ? networkTestsMetaData.connectivityTestFilename != null : !str6.equals(networkTestsMetaData.connectivityTestFilename)) {
                return false;
            }
            String str7 = this.connectivityTestCdnconfigUrl;
            if (str7 == null ? networkTestsMetaData.connectivityTestCdnconfigUrl != null : !str7.equals(networkTestsMetaData.connectivityTestCdnconfigUrl)) {
                return false;
            }
            String str8 = this.geoipUrl;
            String str9 = networkTestsMetaData.geoipUrl;
            if (str8 != null) {
                return str8.equals(str9);
            }
            if (str9 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.hostCt;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.hostLt;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.hostNir;
        int iHashCode3 = (((((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.numberOfRecordsMin) * 31) + this.numberOfRecordsMax) * 31) + (this.enabled ? 1 : 0)) * 31) + (this.enabledCachedProcess ? 1 : 0)) * 31;
        String str4 = this.projectId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.connectivityTestHostname;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.connectivityTestFilename;
        int iHashCode6 = (((((((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + (this.connectivityTestEnabled ? 1 : 0)) * 31) + (this.nirCollectCellinfoEnabled ? 1 : 0)) * 31) + (this.ctCollectCellinfoEnabled ? 1 : 0)) * 31;
        String str7 = this.connectivityTestCdnconfigUrl;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.geoipUrl;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        long j = this.ctltIntervalMilli;
        int i2 = (iHashCode8 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.sendIntervalMilli;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.ttl;
        return i3 + ((int) (j3 ^ (j3 >>> 32)));
    }
}
