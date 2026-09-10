package com.facebook.appevents.gps.topics;

import com.applovin.impl.ca;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import d5.u;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/facebook/appevents/gps/topics/TopicData;", "", "taxonomyVersion", "", "modelVersion", "topicId", "", "(JJI)V", "getModelVersion", "()J", "getTaxonomyVersion", "getTopicId", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final /* data */ class TopicData {
    private final long modelVersion;
    private final long taxonomyVersion;
    private final int topicId;

    public TopicData(long j10, long j11, int i10) {
        this.taxonomyVersion = j10;
        this.modelVersion = j11;
        this.topicId = i10;
    }

    public static /* synthetic */ TopicData copy$default(TopicData topicData, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = topicData.taxonomyVersion;
        }
        long j12 = j10;
        if ((i11 & 2) != 0) {
            j11 = topicData.modelVersion;
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            i10 = topicData.topicId;
        }
        return topicData.copy(j12, j13, i10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTaxonomyVersion() {
        return this.taxonomyVersion;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getModelVersion() {
        return this.modelVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTopicId() {
        return this.topicId;
    }

    public final TopicData copy(long taxonomyVersion, long modelVersion, int topicId) {
        return new TopicData(taxonomyVersion, modelVersion, topicId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopicData)) {
            return false;
        }
        TopicData topicData = (TopicData) other;
        return this.taxonomyVersion == topicData.taxonomyVersion && this.modelVersion == topicData.modelVersion && this.topicId == topicData.topicId;
    }

    public final long getModelVersion() {
        return this.modelVersion;
    }

    public final long getTaxonomyVersion() {
        return this.taxonomyVersion;
    }

    public final int getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        return Integer.hashCode(this.topicId) + ca.j(this.modelVersion, Long.hashCode(this.taxonomyVersion) * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TopicData(taxonomyVersion=");
        sb2.append(this.taxonomyVersion);
        sb2.append(", modelVersion=");
        sb2.append(this.modelVersion);
        sb2.append(", topicId=");
        return u.g(sb2, this.topicId, ')');
    }
}
