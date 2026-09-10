package com.facebook.appevents.cloudbridge;

import an.o;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import l7.g0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q7.e0;
import q7.x;
import qk.i0;
import wj.f;
import wj.r;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004@ABCB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0007\u0010\bJC\u0010\u0010\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f\u0018\u00010\u000bj\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f\u0018\u0001`\r2\u0006\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0018\u001a\u00020\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u001f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f\u0018\u00010\u001e2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001f\u0010 JQ\u0010\"\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f\u0018\u00010\u001e2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f2\u0018\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f0\u001eH\u0002¢\u0006\u0004\b\"\u0010#J\u008f\u0001\u0010'\u001a\u00020&2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00112.\u0010!\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f0\u000bj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f`\r2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0011H\u0002¢\u0006\u0004\b'\u0010(JG\u0010+\u001a\u00020\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b)\u0010*JW\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\fH\u0000¢\u0006\u0004\b,\u0010-J\u008b\u0001\u00102\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f\u0018\u00010\u001e2\u0006\u0010/\u001a\u00020&2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00112\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00112\u0018\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f0\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b0\u00101J7\u00105\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f\u0018\u00010\u001e2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\fH\u0000¢\u0006\u0004\b3\u00104R\u0014\u00106\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u00107R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u0002080\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010:R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020>0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010:¨\u0006D"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer;", "", "<init>", "()V", "", "field", X3.i.X, "transformValue$facebook_core_release", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "transformValue", "appEvents", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "transformEvents$facebook_core_release", "(Ljava/lang/String;)Ljava/util/ArrayList;", "transformEvents", "", "appData", "Lcom/facebook/appevents/cloudbridge/AppEventUserAndAppDataField;", "Lwj/r;", "transformAndUpdateAppData", "(Ljava/util/Map;Lcom/facebook/appevents/cloudbridge/AppEventUserAndAppDataField;Ljava/lang/Object;)V", "userData", "transformAndUpdateUserData", "input", "transformEventName", "(Ljava/lang/String;)Ljava/lang/String;", "commonFields", "eventTime", "", "combineAllTransformedDataForMobileAppInstall", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/List;", "customEvents", "combineAllTransformedDataForCustom", "(Ljava/util/Map;Ljava/util/List;)Ljava/util/List;", "parameters", "restOfData", "Lcom/facebook/appevents/cloudbridge/AppEventType;", "splitAppEventParameters", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/Map;)Lcom/facebook/appevents/cloudbridge/AppEventType;", "transformAndUpdateAppAndUserData$facebook_core_release", "(Ljava/util/Map;Ljava/util/Map;Lcom/facebook/appevents/cloudbridge/AppEventUserAndAppDataField;Ljava/lang/Object;)V", "transformAndUpdateAppAndUserData", "combineCommonFields$facebook_core_release", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "combineCommonFields", "eventType", "combineAllTransformedData$facebook_core_release", "(Lcom/facebook/appevents/cloudbridge/AppEventType;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;", "combineAllTransformedData", "conversionsAPICompatibleEvent$facebook_core_release", "(Ljava/util/Map;)Ljava/util/List;", "conversionsAPICompatibleEvent", "TAG", "Ljava/lang/String;", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$SectionFieldMapping;", "topLevelTransformations", "Ljava/util/Map;", "Lcom/facebook/appevents/cloudbridge/CustomEventField;", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$SectionCustomEventFieldMapping;", "customEventTransformations", "Lcom/facebook/appevents/cloudbridge/ConversionsAPIEventName;", "standardEventTransformations", "DataProcessingParameterName", "SectionCustomEventFieldMapping", "SectionFieldMapping", "ValueTransformationType", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AppEventsConversionsAPITransformer {
    public static final AppEventsConversionsAPITransformer INSTANCE = new AppEventsConversionsAPITransformer();
    public static final String TAG = "AppEventsConversionsAPITransformer";
    public static final Map<CustomEventField, SectionCustomEventFieldMapping> customEventTransformations;
    public static final Map<String, ConversionsAPIEventName> standardEventTransformations;
    private static final Map<AppEventUserAndAppDataField, SectionFieldMapping> topLevelTransformations;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$DataProcessingParameterName;", "", "rawValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "OPTIONS", "COUNTRY", "STATE", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public enum DataProcessingParameterName {
        OPTIONS("data_processing_options"),
        COUNTRY("data_processing_options_country"),
        STATE("data_processing_options_state");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String rawValue;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002¨\u0006\u0007"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$DataProcessingParameterName$Companion;", "", "()V", "invoke", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$DataProcessingParameterName;", "rawValue", "", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final DataProcessingParameterName invoke(String rawValue) {
                n.f(rawValue, "rawValue");
                for (DataProcessingParameterName dataProcessingParameterName : DataProcessingParameterName.values()) {
                    if (n.a(dataProcessingParameterName.getRawValue(), rawValue)) {
                        return dataProcessingParameterName;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        DataProcessingParameterName(String str) {
            this.rawValue = str;
        }

        public final String getRawValue() {
            return this.rawValue;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$SectionCustomEventFieldMapping;", "", "section", "Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "field", "Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;)V", "getField", "()Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;", "setField", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;)V", "getSection", "()Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "setSection", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final /* data */ class SectionCustomEventFieldMapping {
        private ConversionsAPICustomEventField field;
        private ConversionsAPISection section;

        public SectionCustomEventFieldMapping(ConversionsAPISection conversionsAPISection, ConversionsAPICustomEventField field) {
            n.f(field, "field");
            this.section = conversionsAPISection;
            this.field = field;
        }

        public static /* synthetic */ SectionCustomEventFieldMapping copy$default(SectionCustomEventFieldMapping sectionCustomEventFieldMapping, ConversionsAPISection conversionsAPISection, ConversionsAPICustomEventField conversionsAPICustomEventField, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                conversionsAPISection = sectionCustomEventFieldMapping.section;
            }
            if ((i10 & 2) != 0) {
                conversionsAPICustomEventField = sectionCustomEventFieldMapping.field;
            }
            return sectionCustomEventFieldMapping.copy(conversionsAPISection, conversionsAPICustomEventField);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ConversionsAPISection getSection() {
            return this.section;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ConversionsAPICustomEventField getField() {
            return this.field;
        }

        public final SectionCustomEventFieldMapping copy(ConversionsAPISection section, ConversionsAPICustomEventField field) {
            n.f(field, "field");
            return new SectionCustomEventFieldMapping(section, field);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SectionCustomEventFieldMapping)) {
                return false;
            }
            SectionCustomEventFieldMapping sectionCustomEventFieldMapping = (SectionCustomEventFieldMapping) other;
            return this.section == sectionCustomEventFieldMapping.section && this.field == sectionCustomEventFieldMapping.field;
        }

        public final ConversionsAPICustomEventField getField() {
            return this.field;
        }

        public final ConversionsAPISection getSection() {
            return this.section;
        }

        public int hashCode() {
            ConversionsAPISection conversionsAPISection = this.section;
            return this.field.hashCode() + ((conversionsAPISection == null ? 0 : conversionsAPISection.hashCode()) * 31);
        }

        public final void setField(ConversionsAPICustomEventField conversionsAPICustomEventField) {
            n.f(conversionsAPICustomEventField, "<set-?>");
            this.field = conversionsAPICustomEventField;
        }

        public final void setSection(ConversionsAPISection conversionsAPISection) {
            this.section = conversionsAPISection;
        }

        public String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.section + ", field=" + this.field + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$SectionFieldMapping;", "", "section", "Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "field", "Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;)V", "getField", "()Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;", "setField", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;)V", "getSection", "()Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "setSection", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final /* data */ class SectionFieldMapping {
        private ConversionsAPIUserAndAppDataField field;
        private ConversionsAPISection section;

        public SectionFieldMapping(ConversionsAPISection section, ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField) {
            n.f(section, "section");
            this.section = section;
            this.field = conversionsAPIUserAndAppDataField;
        }

        public static /* synthetic */ SectionFieldMapping copy$default(SectionFieldMapping sectionFieldMapping, ConversionsAPISection conversionsAPISection, ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                conversionsAPISection = sectionFieldMapping.section;
            }
            if ((i10 & 2) != 0) {
                conversionsAPIUserAndAppDataField = sectionFieldMapping.field;
            }
            return sectionFieldMapping.copy(conversionsAPISection, conversionsAPIUserAndAppDataField);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ConversionsAPISection getSection() {
            return this.section;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ConversionsAPIUserAndAppDataField getField() {
            return this.field;
        }

        public final SectionFieldMapping copy(ConversionsAPISection section, ConversionsAPIUserAndAppDataField field) {
            n.f(section, "section");
            return new SectionFieldMapping(section, field);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SectionFieldMapping)) {
                return false;
            }
            SectionFieldMapping sectionFieldMapping = (SectionFieldMapping) other;
            return this.section == sectionFieldMapping.section && this.field == sectionFieldMapping.field;
        }

        public final ConversionsAPIUserAndAppDataField getField() {
            return this.field;
        }

        public final ConversionsAPISection getSection() {
            return this.section;
        }

        public int hashCode() {
            int iHashCode = this.section.hashCode() * 31;
            ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField = this.field;
            return iHashCode + (conversionsAPIUserAndAppDataField == null ? 0 : conversionsAPIUserAndAppDataField.hashCode());
        }

        public final void setField(ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField) {
            this.field = conversionsAPIUserAndAppDataField;
        }

        public final void setSection(ConversionsAPISection conversionsAPISection) {
            n.f(conversionsAPISection, "<set-?>");
            this.section = conversionsAPISection;
        }

        public String toString() {
            return "SectionFieldMapping(section=" + this.section + ", field=" + this.field + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$ValueTransformationType;", "", "(Ljava/lang/String;I)V", "ARRAY", "BOOL", "INT", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public enum ValueTransformationType {
        ARRAY,
        BOOL,
        INT;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002¨\u0006\u0007"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$ValueTransformationType$Companion;", "", "()V", "invoke", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$ValueTransformationType;", "rawValue", "", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final ValueTransformationType invoke(String rawValue) {
                n.f(rawValue, "rawValue");
                if (rawValue.equals(AppEventUserAndAppDataField.EXT_INFO.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (rawValue.equals(AppEventUserAndAppDataField.URL_SCHEMES.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (rawValue.equals(CustomEventField.CONTENT_IDS.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (rawValue.equals(CustomEventField.CONTENTS.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (rawValue.equals(DataProcessingParameterName.OPTIONS.getRawValue())) {
                    return ValueTransformationType.ARRAY;
                }
                if (rawValue.equals(AppEventUserAndAppDataField.ADV_TE.getRawValue())) {
                    return ValueTransformationType.BOOL;
                }
                if (rawValue.equals(AppEventUserAndAppDataField.APP_TE.getRawValue())) {
                    return ValueTransformationType.BOOL;
                }
                if (rawValue.equals(CustomEventField.EVENT_TIME.getRawValue())) {
                    return ValueTransformationType.INT;
                }
                return null;
            }

            private Companion() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ValueTransformationType.values().length];
            try {
                iArr[ValueTransformationType.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValueTransformationType.BOOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValueTransformationType.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConversionsAPISection.values().length];
            try {
                iArr2[ConversionsAPISection.APP_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ConversionsAPISection.USER_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AppEventType.values().length];
            try {
                iArr3[AppEventType.MOBILE_APP_INSTALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AppEventType.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        AppEventUserAndAppDataField appEventUserAndAppDataField = AppEventUserAndAppDataField.ANON_ID;
        ConversionsAPISection conversionsAPISection = ConversionsAPISection.USER_DATA;
        f fVar = new f(appEventUserAndAppDataField, new SectionFieldMapping(conversionsAPISection, ConversionsAPIUserAndAppDataField.ANON_ID));
        f fVar2 = new f(AppEventUserAndAppDataField.APP_USER_ID, new SectionFieldMapping(conversionsAPISection, ConversionsAPIUserAndAppDataField.FB_LOGIN_ID));
        f fVar3 = new f(AppEventUserAndAppDataField.ADVERTISER_ID, new SectionFieldMapping(conversionsAPISection, ConversionsAPIUserAndAppDataField.MAD_ID));
        f fVar4 = new f(AppEventUserAndAppDataField.PAGE_ID, new SectionFieldMapping(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_ID));
        f fVar5 = new f(AppEventUserAndAppDataField.PAGE_SCOPED_USER_ID, new SectionFieldMapping(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_SCOPED_USER_ID));
        AppEventUserAndAppDataField appEventUserAndAppDataField2 = AppEventUserAndAppDataField.ADV_TE;
        ConversionsAPISection conversionsAPISection2 = ConversionsAPISection.APP_DATA;
        topLevelTransformations = b0.Q(fVar, fVar2, fVar3, fVar4, fVar5, new f(appEventUserAndAppDataField2, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.ADV_TE)), new f(AppEventUserAndAppDataField.APP_TE, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.APP_TE)), new f(AppEventUserAndAppDataField.CONSIDER_VIEWS, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.CONSIDER_VIEWS)), new f(AppEventUserAndAppDataField.DEVICE_TOKEN, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.DEVICE_TOKEN)), new f(AppEventUserAndAppDataField.EXT_INFO, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.EXT_INFO)), new f(AppEventUserAndAppDataField.INCLUDE_DWELL_DATA, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_DWELL_DATA)), new f(AppEventUserAndAppDataField.INCLUDE_VIDEO_DATA, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_VIDEO_DATA)), new f(AppEventUserAndAppDataField.INSTALL_REFERRER, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALL_REFERRER)), new f(AppEventUserAndAppDataField.INSTALLER_PACKAGE, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALLER_PACKAGE)), new f(AppEventUserAndAppDataField.RECEIPT_DATA, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.RECEIPT_DATA)), new f(AppEventUserAndAppDataField.URL_SCHEMES, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.URL_SCHEMES)), new f(AppEventUserAndAppDataField.ADD_TO_MESSAGING_CUSTOMER_BASE_FOR_WHATSAPP, new SectionFieldMapping(conversionsAPISection2, ConversionsAPIUserAndAppDataField.ADD_TO_MESSAGING_CUSTOMER_BASE_FOR_WHATSAPP)), new f(AppEventUserAndAppDataField.USER_DATA, new SectionFieldMapping(conversionsAPISection, null)));
        f fVar6 = new f(CustomEventField.EVENT_TIME, new SectionCustomEventFieldMapping(null, ConversionsAPICustomEventField.EVENT_TIME));
        f fVar7 = new f(CustomEventField.EVENT_NAME, new SectionCustomEventFieldMapping(null, ConversionsAPICustomEventField.EVENT_NAME));
        CustomEventField customEventField = CustomEventField.VALUE_TO_SUM;
        ConversionsAPISection conversionsAPISection3 = ConversionsAPISection.CUSTOM_DATA;
        customEventTransformations = b0.Q(fVar6, fVar7, new f(customEventField, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.VALUE_TO_SUM)), new f(CustomEventField.CONTENT_IDS, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_IDS)), new f(CustomEventField.CONTENTS, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.CONTENTS)), new f(CustomEventField.CONTENT_TYPE, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_TYPE)), new f(CustomEventField.CURRENCY, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.CURRENCY)), new f(CustomEventField.DESCRIPTION, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.DESCRIPTION)), new f(CustomEventField.LEVEL, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.LEVEL)), new f(CustomEventField.MAX_RATING_VALUE, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.MAX_RATING_VALUE)), new f(CustomEventField.NUM_ITEMS, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.NUM_ITEMS)), new f(CustomEventField.PAYMENT_INFO_AVAILABLE, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.PAYMENT_INFO_AVAILABLE)), new f(CustomEventField.REGISTRATION_METHOD, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.REGISTRATION_METHOD)), new f(CustomEventField.SEARCH_STRING, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.SEARCH_STRING)), new f(CustomEventField.SUCCESS, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.SUCCESS)), new f(CustomEventField.ORDER_ID, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.ORDER_ID)), new f(CustomEventField.AD_TYPE, new SectionCustomEventFieldMapping(conversionsAPISection3, ConversionsAPICustomEventField.AD_TYPE)));
        standardEventTransformations = b0.Q(new f(AppEventsConstants.EVENT_NAME_UNLOCKED_ACHIEVEMENT, ConversionsAPIEventName.UNLOCKED_ACHIEVEMENT), new f(AppEventsConstants.EVENT_NAME_ACTIVATED_APP, ConversionsAPIEventName.ACTIVATED_APP), new f(AppEventsConstants.EVENT_NAME_ADDED_PAYMENT_INFO, ConversionsAPIEventName.ADDED_PAYMENT_INFO), new f(AppEventsConstants.EVENT_NAME_ADDED_TO_CART, ConversionsAPIEventName.ADDED_TO_CART), new f(AppEventsConstants.EVENT_NAME_ADDED_TO_WISHLIST, ConversionsAPIEventName.ADDED_TO_WISHLIST), new f(AppEventsConstants.EVENT_NAME_COMPLETED_REGISTRATION, ConversionsAPIEventName.COMPLETED_REGISTRATION), new f(AppEventsConstants.EVENT_NAME_VIEWED_CONTENT, ConversionsAPIEventName.VIEWED_CONTENT), new f(AppEventsConstants.EVENT_NAME_INITIATED_CHECKOUT, ConversionsAPIEventName.INITIATED_CHECKOUT), new f(AppEventsConstants.EVENT_NAME_ACHIEVED_LEVEL, ConversionsAPIEventName.ACHIEVED_LEVEL), new f(AppEventsConstants.EVENT_NAME_PURCHASED, ConversionsAPIEventName.PURCHASED), new f(AppEventsConstants.EVENT_NAME_RATED, ConversionsAPIEventName.RATED), new f(AppEventsConstants.EVENT_NAME_SEARCHED, ConversionsAPIEventName.SEARCHED), new f(AppEventsConstants.EVENT_NAME_SPENT_CREDITS, ConversionsAPIEventName.SPENT_CREDITS), new f(AppEventsConstants.EVENT_NAME_COMPLETED_TUTORIAL, ConversionsAPIEventName.COMPLETED_TUTORIAL));
    }

    private AppEventsConversionsAPITransformer() {
    }

    private final List<Map<String, Object>> combineAllTransformedDataForCustom(Map<String, ? extends Object> commonFields, List<? extends Map<String, ? extends Object>> customEvents) {
        if (customEvents.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = customEvents.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(commonFields);
            linkedHashMap.putAll(map);
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    private final List<Map<String, Object>> combineAllTransformedDataForMobileAppInstall(Map<String, ? extends Object> commonFields, Object eventTime) {
        if (eventTime == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(commonFields);
        linkedHashMap.put(ConversionsAPICustomEventField.EVENT_NAME.getRawValue(), OtherEventConstants.MOBILE_APP_INSTALL.getRawValue());
        linkedHashMap.put(ConversionsAPICustomEventField.EVENT_TIME.getRawValue(), eventTime);
        return j1.f.C(linkedHashMap);
    }

    private final AppEventType splitAppEventParameters(Map<String, ? extends Object> parameters, Map<String, Object> userData, Map<String, Object> appData, ArrayList<Map<String, Object>> customEvents, Map<String, Object> restOfData) {
        Object obj = parameters.get(OtherEventConstants.EVENT.getRawValue());
        AppEventType.Companion companion = AppEventType.INSTANCE;
        n.d(obj, "null cannot be cast to non-null type kotlin.String");
        AppEventType appEventTypeInvoke = companion.invoke((String) obj);
        if (appEventTypeInvoke != AppEventType.OTHER) {
            for (Map.Entry<String, ? extends Object> entry : parameters.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                AppEventUserAndAppDataField appEventUserAndAppDataFieldInvoke = AppEventUserAndAppDataField.INSTANCE.invoke(key);
                if (appEventUserAndAppDataFieldInvoke != null) {
                    INSTANCE.transformAndUpdateAppAndUserData$facebook_core_release(userData, appData, appEventUserAndAppDataFieldInvoke, value);
                } else {
                    boolean zA = n.a(key, ConversionsAPISection.CUSTOM_EVENTS.getRawValue());
                    boolean z10 = value instanceof String;
                    if (appEventTypeInvoke == AppEventType.CUSTOM && zA && z10) {
                        ArrayList<Map<String, Object>> arrayListTransformEvents$facebook_core_release = transformEvents$facebook_core_release((String) value);
                        if (arrayListTransformEvents$facebook_core_release != null) {
                            customEvents.addAll(arrayListTransformEvents$facebook_core_release);
                        }
                    } else if (DataProcessingParameterName.INSTANCE.invoke(key) != null) {
                        restOfData.put(key, value);
                    }
                }
            }
        }
        return appEventTypeInvoke;
    }

    private final void transformAndUpdateAppData(Map<String, Object> appData, AppEventUserAndAppDataField field, Object value) {
        ConversionsAPIUserAndAppDataField field2;
        String rawValue;
        SectionFieldMapping sectionFieldMapping = topLevelTransformations.get(field);
        if (sectionFieldMapping == null || (field2 = sectionFieldMapping.getField()) == null || (rawValue = field2.getRawValue()) == null) {
            return;
        }
        appData.put(rawValue, value);
    }

    private final void transformAndUpdateUserData(Map<String, Object> userData, AppEventUserAndAppDataField field, Object value) {
        ConversionsAPIUserAndAppDataField field2;
        String rawValue;
        if (field == AppEventUserAndAppDataField.USER_DATA) {
            try {
                n.d(value, "null cannot be cast to non-null type kotlin.String");
                userData.putAll(e0.g(new JSONObject((String) value)));
                return;
            } catch (JSONException e10) {
                x.f48792c.t(g0.f45136d, TAG, "\n transformEvents JSONException: \n%s\n%s", value, e10);
                return;
            }
        }
        SectionFieldMapping sectionFieldMapping = topLevelTransformations.get(field);
        if (sectionFieldMapping == null || (field2 = sectionFieldMapping.getField()) == null || (rawValue = field2.getRawValue()) == null) {
            return;
        }
        userData.put(rawValue, value);
    }

    private final String transformEventName(String input) {
        String rawValue;
        Map<String, ConversionsAPIEventName> map = standardEventTransformations;
        if (!map.containsKey(input)) {
            return input;
        }
        ConversionsAPIEventName conversionsAPIEventName = map.get(input);
        return (conversionsAPIEventName == null || (rawValue = conversionsAPIEventName.getRawValue()) == null) ? "" : rawValue;
    }

    public static final ArrayList<Map<String, Object>> transformEvents$facebook_core_release(String appEvents) {
        g0 g0Var = g0.f45136d;
        n.f(appEvents, "appEvents");
        ArrayList<Map> arrayList = new ArrayList();
        try {
            Iterator it = e0.f(new JSONArray(appEvents)).iterator();
            while (it.hasNext()) {
                arrayList.add(e0.g(new JSONObject((String) it.next())));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList<Map<String, Object>> arrayList2 = new ArrayList<>();
            for (Map map : arrayList) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str : map.keySet()) {
                    CustomEventField customEventFieldInvoke = CustomEventField.INSTANCE.invoke(str);
                    SectionCustomEventFieldMapping sectionCustomEventFieldMapping = customEventTransformations.get(customEventFieldInvoke);
                    if (customEventFieldInvoke != null && sectionCustomEventFieldMapping != null) {
                        ConversionsAPISection section = sectionCustomEventFieldMapping.getSection();
                        if (section == null) {
                            try {
                                String rawValue = sectionCustomEventFieldMapping.getField().getRawValue();
                                if (customEventFieldInvoke == CustomEventField.EVENT_NAME && ((String) map.get(str)) != null) {
                                    AppEventsConversionsAPITransformer appEventsConversionsAPITransformer = INSTANCE;
                                    Object obj = map.get(str);
                                    n.d(obj, "null cannot be cast to non-null type kotlin.String");
                                    linkedHashMap2.put(rawValue, appEventsConversionsAPITransformer.transformEventName((String) obj));
                                } else if (customEventFieldInvoke == CustomEventField.EVENT_TIME && ((Integer) map.get(str)) != null) {
                                    Object obj2 = map.get(str);
                                    n.d(obj2, "null cannot be cast to non-null type kotlin.Any");
                                    Object objTransformValue$facebook_core_release = transformValue$facebook_core_release(str, obj2);
                                    n.d(objTransformValue$facebook_core_release, "null cannot be cast to non-null type kotlin.Any");
                                    linkedHashMap2.put(rawValue, objTransformValue$facebook_core_release);
                                }
                            } catch (ClassCastException e10) {
                                x.f48792c.t(g0Var, TAG, "\n transformEvents ClassCastException: \n %s ", i0.m0(e10));
                            }
                        } else if (section == ConversionsAPISection.CUSTOM_DATA) {
                            String rawValue2 = sectionCustomEventFieldMapping.getField().getRawValue();
                            Object obj3 = map.get(str);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.Any");
                            Object objTransformValue$facebook_core_release2 = transformValue$facebook_core_release(str, obj3);
                            n.d(objTransformValue$facebook_core_release2, "null cannot be cast to non-null type kotlin.Any");
                            linkedHashMap.put(rawValue2, objTransformValue$facebook_core_release2);
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(ConversionsAPISection.CUSTOM_DATA.getRawValue(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (JSONException e11) {
            x.f48792c.t(g0Var, TAG, "\n transformEvents JSONException: \n%s\n%s", appEvents, e11);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.HashMap] */
    public static final Object transformValue$facebook_core_release(String field, Object value) {
        n.f(field, "field");
        n.f(value, "value");
        ValueTransformationType valueTransformationTypeInvoke = ValueTransformationType.INSTANCE.invoke(field);
        String str = value instanceof String ? (String) value : null;
        if (valueTransformationTypeInvoke == null || str == null) {
            return value;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[valueTransformationTypeInvoke.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return o.e0(value.toString());
                }
                throw new aa.b((byte) 0, 20);
            }
            Integer numE0 = o.e0(str.toString());
            if (numE0 != null) {
                return Boolean.valueOf(numE0.intValue() != 0);
            }
            return null;
        }
        try {
            ArrayList<??> arrayListF = e0.f(new JSONArray(str));
            ArrayList arrayList = new ArrayList();
            for (?? F : arrayListF) {
                try {
                    try {
                        F = e0.g(new JSONObject((String) F));
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    F = e0.f(new JSONArray((String) F));
                }
                arrayList.add(F);
            }
            return arrayList;
        } catch (JSONException e10) {
            x.f48792c.t(g0.f45136d, TAG, "\n transformEvents JSONException: \n%s\n%s", value, e10);
            return r.f53297a;
        }
    }

    public final List<Map<String, Object>> combineAllTransformedData$facebook_core_release(AppEventType eventType, Map<String, Object> userData, Map<String, Object> appData, Map<String, Object> restOfData, List<? extends Map<String, ? extends Object>> customEvents, Object eventTime) {
        n.f(eventType, "eventType");
        n.f(userData, "userData");
        n.f(appData, "appData");
        n.f(restOfData, "restOfData");
        n.f(customEvents, "customEvents");
        Map<String, Object> mapCombineCommonFields$facebook_core_release = combineCommonFields$facebook_core_release(userData, appData, restOfData);
        int i10 = WhenMappings.$EnumSwitchMapping$2[eventType.ordinal()];
        if (i10 == 1) {
            return combineAllTransformedDataForMobileAppInstall(mapCombineCommonFields$facebook_core_release, eventTime);
        }
        if (i10 != 2) {
            return null;
        }
        return combineAllTransformedDataForCustom(mapCombineCommonFields$facebook_core_release, customEvents);
    }

    public final Map<String, Object> combineCommonFields$facebook_core_release(Map<String, ? extends Object> userData, Map<String, ? extends Object> appData, Map<String, ? extends Object> restOfData) {
        n.f(userData, "userData");
        n.f(appData, "appData");
        n.f(restOfData, "restOfData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OtherEventConstants.ACTION_SOURCE.getRawValue(), OtherEventConstants.APP.getRawValue());
        linkedHashMap.put(ConversionsAPISection.USER_DATA.getRawValue(), userData);
        linkedHashMap.put(ConversionsAPISection.APP_DATA.getRawValue(), appData);
        linkedHashMap.putAll(restOfData);
        return linkedHashMap;
    }

    public final List<Map<String, Object>> conversionsAPICompatibleEvent$facebook_core_release(Map<String, ? extends Object> parameters) {
        n.f(parameters, "parameters");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList<Map<String, Object>> arrayList = new ArrayList<>();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        AppEventType appEventTypeSplitAppEventParameters = splitAppEventParameters(parameters, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (appEventTypeSplitAppEventParameters == AppEventType.OTHER) {
            return null;
        }
        return combineAllTransformedData$facebook_core_release(appEventTypeSplitAppEventParameters, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, parameters.get(OtherEventConstants.INSTALL_EVENT_TIME.getRawValue()));
    }

    public final void transformAndUpdateAppAndUserData$facebook_core_release(Map<String, Object> userData, Map<String, Object> appData, AppEventUserAndAppDataField field, Object value) {
        ConversionsAPISection section;
        n.f(userData, "userData");
        n.f(appData, "appData");
        n.f(field, "field");
        n.f(value, "value");
        SectionFieldMapping sectionFieldMapping = topLevelTransformations.get(field);
        if (sectionFieldMapping == null || (section = sectionFieldMapping.getSection()) == null) {
            return;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$1[section.ordinal()];
        if (i10 == 1) {
            transformAndUpdateAppData(appData, field, value);
        } else {
            if (i10 != 2) {
                return;
            }
            transformAndUpdateUserData(userData, field, value);
        }
    }
}
