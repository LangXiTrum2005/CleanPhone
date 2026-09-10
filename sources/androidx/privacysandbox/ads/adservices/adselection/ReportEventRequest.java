package androidx.privacysandbox.ads.adservices.adselection;

import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "", "Companion", "Ext10Impl", "Ext8Impl", "ReportingDestination", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalFeatures.Ext8OptIn
public final class ReportEventRequest {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest$Companion;", "", "", "FLAG_REPORTING_DESTINATION_BUYER", "I", "FLAG_REPORTING_DESTINATION_SELLER", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest$Ext10Impl;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Ext10Impl {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest$Ext10Impl$Companion;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest$Ext8Impl;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Ext8Impl {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest$Ext8Impl$Companion;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest$ReportingDestination;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface ReportingDestination {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportEventRequest)) {
            return false;
        }
        ReportEventRequest reportEventRequest = (ReportEventRequest) obj;
        reportEventRequest.getClass();
        reportEventRequest.getClass();
        reportEventRequest.getClass();
        reportEventRequest.getClass();
        reportEventRequest.getClass();
        return true;
    }

    public final int hashCode() {
        Long.hashCode(0L);
        throw null;
    }

    public final String toString() {
        return "ReportEventRequest: adSelectionId=0, eventKey=null, eventData=null, reportingDestinations=0inputEvent=null";
    }
}
