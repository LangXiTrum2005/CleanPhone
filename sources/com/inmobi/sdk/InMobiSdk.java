package com.inmobi.sdk;

import A.F;
import A.I0;
import A.RunnableC0895i;
import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import com.applovin.impl.Z;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.inmobi.media.AbstractC2936ab;
import com.inmobi.media.AbstractC3048h7;
import com.inmobi.media.AbstractC3167oe;
import com.inmobi.media.AbstractC3285w5;
import com.inmobi.media.AbstractC3290wa;
import com.inmobi.media.B6;
import com.inmobi.media.C3246te;
import com.inmobi.media.C6;
import com.inmobi.media.De;
import com.inmobi.media.G4;
import com.inmobi.media.Gd;
import com.inmobi.media.H6;
import com.inmobi.media.I5;
import com.inmobi.media.I7;
import com.inmobi.media.J5;
import com.inmobi.media.L3;
import com.inmobi.media.M2;
import com.inmobi.media.Md;
import com.inmobi.media.O2;
import com.inmobi.media.Pd;
import com.inmobi.media.S5;
import com.inmobi.media.Td;
import com.inmobi.media.Uc;
import com.inmobi.media.Ya;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.p004ironsource.d9;
import com.smartdigimkt.h5.f;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.thinkup.core.api.TUCustomRuleKeys;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005PQRSTJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u000e\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\"\u0010\u0016J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b+\u0010)J-\u0010/\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010-\u001a\u0004\u0018\u00010\u00042\b\u0010.\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u001dH\u0007¢\u0006\u0004\b2\u0010 J\u0017\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u000203H\u0007¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u000207H\u0007¢\u0006\u0004\b9\u0010:J\u0019\u0010<\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b<\u0010)J\u0019\u0010>\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b>\u0010)J\u0019\u0010A\u001a\u00020\u00062\b\u0010@\u001a\u0004\u0018\u00010?H\u0007¢\u0006\u0004\bA\u0010BJ\u0011\u0010C\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bC\u0010\u0018J1\u0010C\u001a\u0004\u0018\u00010\u00042\u0014\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010D2\b\u0010F\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bC\u0010GJ\u0019\u0010I\u001a\u00020\u00062\b\u0010H\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\bI\u0010\u0011J\u000f\u0010J\u001a\u00020\u0013H\u0007¢\u0006\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\bN\u0010MR\u0014\u0010O\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\bO\u0010M¨\u0006U"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk;", "", "Lcom/inmobi/sdk/SdkInitializationListener;", "sdkInitializationListener", "", PglCryptUtils.KEY_MESSAGE, "", "a", "(Lcom/inmobi/sdk/SdkInitializationListener;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "accountId", "Lorg/json/JSONObject;", "consentObject", d9.a.f, "(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;Lcom/inmobi/sdk/SdkInitializationListener;)V", "updateGDPRConsent", "(Lorg/json/JSONObject;)V", "setPartnerGDPRConsent", "", "muted", "setApplicationMuted", "(Z)V", "getVersion", "()Ljava/lang/String;", "Lcom/inmobi/sdk/InMobiSdk$LogLevel;", "logLevel", "setLogLevel", "(Lcom/inmobi/sdk/InMobiSdk$LogLevel;)V", "", "age", "setAge", "(I)V", "isAgeRestricted", "setIsAgeRestricted", "Lcom/inmobi/sdk/InMobiSdk$AgeGroup;", "group", "setAgeGroup", "(Lcom/inmobi/sdk/InMobiSdk$AgeGroup;)V", "areaCode", "setAreaCode", "(Ljava/lang/String;)V", "postalCode", "setPostalCode", "city", "state", "country", "setLocationWithCityStateCountry", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "yearOfBirth", "setYearOfBirth", "Lcom/inmobi/sdk/InMobiSdk$Gender;", TUCustomRuleKeys.GENDER, "setGender", "(Lcom/inmobi/sdk/InMobiSdk$Gender;)V", "Lcom/inmobi/sdk/InMobiSdk$Education;", "education", "setEducation", "(Lcom/inmobi/sdk/InMobiSdk$Education;)V", "language", "setLanguage", "interests", "setInterests", "Landroid/location/Location;", "location", "setLocation", "(Landroid/location/Location;)V", "getToken", "", "extras", "keywords", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "jsonObject", "setPublisherProvidedUnifiedId", "isSDKInitialized", "()Z", "IM_GDPR_CONSENT_AVAILABLE", "Ljava/lang/String;", "IM_GDPR_CONSENT_IAB", "IM_GDPR_CONSENT_GDPR_APPLIES", "AgeGroup", "Education", "Gender", "LogLevel", "PublisherSignals", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InMobiSdk {
    public static final String IM_GDPR_CONSENT_AVAILABLE = "gdpr_consent_available";
    public static final String IM_GDPR_CONSENT_GDPR_APPLIES = "gdpr";
    public static final String IM_GDPR_CONSENT_IAB = "gdpr_consent";
    public static final InMobiSdk INSTANCE = new InMobiSdk();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$AgeGroup;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "BELOW_18", "BETWEEN_18_AND_24", "BETWEEN_25_AND_29", "BETWEEN_30_AND_34", "BETWEEN_35_AND_44", "BETWEEN_45_AND_54", "BETWEEN_55_AND_65", "ABOVE_65", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum AgeGroup {
        BELOW_18("below18"),
        BETWEEN_18_AND_24("between18and24"),
        BETWEEN_25_AND_29("between25and29"),
        BETWEEN_30_AND_34("between30and34"),
        BETWEEN_35_AND_44("between35and44"),
        BETWEEN_45_AND_54("between45and54"),
        BETWEEN_55_AND_65("between55and65"),
        ABOVE_65("above65");

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());
        private final String value;

        AgeGroup(String str) {
            this.value = str;
        }

        public static EnumEntries<AgeGroup> getEntries() {
            return $ENTRIES;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$Education;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "HIGH_SCHOOL_OR_LESS", "COLLEGE_OR_GRADUATE", "POST_GRADUATE_OR_ABOVE", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Education {
        HIGH_SCHOOL_OR_LESS("highschoolorless"),
        COLLEGE_OR_GRADUATE("collegeorgraduate"),
        POST_GRADUATE_OR_ABOVE("postgraduateorabove");

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());
        private final String value;

        Education(String str) {
            this.value = str;
        }

        public static EnumEntries<Education> getEntries() {
            return $ENTRIES;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$Gender;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "FEMALE", "MALE", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Gender {
        FEMALE(f.j),
        MALE("m");

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());
        private final String value;

        Gender(String str) {
            this.value = str;
        }

        public static EnumEntries<Gender> getEntries() {
            return $ENTRIES;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$LogLevel;", "", "(Ljava/lang/String;I)V", "NONE", "ERROR", "DEBUG", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum LogLevel {
        NONE,
        ERROR,
        DEBUG;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<LogLevel> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$PublisherSignals;", "", "", "", "signals", "", "putPublisherSignals", "(Ljava/util/Map;)V", "getPublisherSignals", "()Ljava/util/Map;", "resetPublisherSignals", "()V", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PublisherSignals {
        public static final PublisherSignals INSTANCE = new PublisherSignals();

        public final Map<String, Object> getPublisherSignals() {
            if (!InMobiSdk.isSDKInitialized()) {
                String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
                Intrinsics.e(strAccess$getTAG$p, "access$getTAG$p(...)");
                AbstractC3048h7.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot get publisher signals.");
                return null;
            }
            Ya ya = Ya.f23374a;
            ya.getClass();
            try {
                LinkedHashMap linkedHashMap = O2.f23027a;
                Config configA = M2.a("signals", Uc.b(), null);
                Intrinsics.d(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
                SignalsConfig.PublisherConfig publisher = ((SignalsConfig) configA).getPublisher();
                if (!publisher.getEnableMCO() && !publisher.getEnableAB()) {
                    return EmptyMap.X;
                }
                return ya.a();
            } catch (Exception e2) {
                S5 s5 = S5.f23167a;
                S5.d.a(AbstractC3285w5.a(e2, "event"));
                AbstractC3048h7.a((byte) 1, "PubSignalsStore", "Publisher signals could not be retrieved.");
                return EmptyMap.X;
            }
        }

        public final void putPublisherSignals(Map<String, ? extends Object> signals) {
            if (!InMobiSdk.isSDKInitialized()) {
                String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
                Intrinsics.e(strAccess$getTAG$p, "access$getTAG$p(...)");
                AbstractC3048h7.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot set publisher signals.");
                return;
            }
            if (signals != null) {
                Ya ya = Ya.f23374a;
                ya.getClass();
                try {
                    LinkedHashMap linkedHashMap = O2.f23027a;
                    Config configA = M2.a("signals", Uc.b(), null);
                    Intrinsics.d(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
                    SignalsConfig.PublisherConfig publisher = ((SignalsConfig) configA).getPublisher();
                    if (!publisher.getEnableMCO() && !publisher.getEnableAB()) {
                        AbstractC3048h7.a((byte) 1, "PubSignalsStore", "Publisher signals are disabled from InMobi");
                        return;
                    }
                    LinkedHashMap linkedHashMapA = ya.a();
                    Intrinsics.f(linkedHashMapA, "<this>");
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll(linkedHashMapA);
                    linkedHashMap2.putAll(signals);
                    JSONObject jSONObjectA = Ya.a(Ya.a(Ya.a(linkedHashMap2, publisher)), publisher);
                    if (jSONObjectA != null) {
                        Ya.a(jSONObjectA);
                    }
                } catch (Exception e2) {
                    S5 s5 = S5.f23167a;
                    S5.d.a(AbstractC3285w5.a(e2, "event"));
                    AbstractC3048h7.a((byte) 1, "PubSignalsStore", "Publisher signals could not be saved.");
                }
            }
        }

        public final void resetPublisherSignals() {
            if (InMobiSdk.isSDKInitialized()) {
                Ya.f23374a.getClass();
                Ya.b();
            } else {
                String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
                Intrinsics.e(strAccess$getTAG$p, "access$getTAG$p(...)");
                AbstractC3048h7.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot reset publisher signals.");
            }
        }
    }

    public static void a(Context context, String str, JSONObject jSONObject, SdkInitializationListener sdkInitializationListener) {
        Md.a(new F(context, sdkInitializationListener, str, jSONObject, 3));
    }

    public static final /* synthetic */ String access$getTAG$p() {
        return "InMobiSdk";
    }

    public static void b(SdkInitializationListener sdkInitializationListener, String str) {
        if (sdkInitializationListener != null) {
            Md.a(new I0(4, sdkInitializationListener, str));
        }
        if (str != null) {
            AbstractC3048h7.a((byte) 1, "InMobiSdk", str);
            return;
        }
        StringBuilder sbA = H6.a("InMobiSdk", "TAG", "InMobi SDK initialized with account id: ");
        sbA.append(Uc.b());
        AbstractC3048h7.a((byte) 2, "InMobiSdk", sbA.toString());
    }

    public static final void c(SdkInitializationListener sdkInitializationListener, String str) {
        INSTANCE.a(sdkInitializationListener, str);
    }

    @JvmStatic
    public static final String getToken() {
        return getToken(null, null);
    }

    @JvmStatic
    public static final String getVersion() {
        return "10.8.7";
    }

    @JvmStatic
    public static final void init(Context context, String accountId, JSONObject consentObject, SdkInitializationListener sdkInitializationListener) {
        InMobiSdk inMobiSdk = INSTANCE;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        inMobiSdk.getClass();
        a(applicationContext, accountId, consentObject, sdkInitializationListener);
    }

    @JvmStatic
    public static final boolean isSDKInitialized() {
        return Uc.q();
    }

    @JvmStatic
    public static final void setAge(int age) {
        Context contextD = Uc.d();
        if (age != Integer.MIN_VALUE) {
            AbstractC2936ab.f23443a = age;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = C6.f22734b;
                C6.a(B6.a(contextD, "user_info_store"), "user_age", age, false, 4, (Object) null);
            }
        }
    }

    @JvmStatic
    public static final void setAgeGroup(AgeGroup group) {
        Intrinsics.f(group, "group");
        String string = group.toString();
        Locale locale = Locale.ENGLISH;
        String strP = Z.p(locale, "ENGLISH", string, locale, "this as java.lang.String).toLowerCase(locale)");
        Context contextD = Uc.d();
        AbstractC2936ab.f23445c = strP;
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = C6.f22734b;
            C6.a(B6.a(contextD, "user_info_store"), "user_age_group", strP, false, 4, (Object) null);
        }
    }

    @JvmStatic
    public static final void setApplicationMuted(boolean muted) {
        Uc.b(muted);
    }

    @JvmStatic
    public static final void setAreaCode(String areaCode) {
        Context contextD = Uc.d();
        AbstractC2936ab.d = areaCode;
        if (contextD == null || areaCode == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = C6.f22734b;
        C6.a(B6.a(contextD, "user_info_store"), "user_area_code", areaCode, false, 4, (Object) null);
    }

    @JvmStatic
    public static final void setEducation(Education education) {
        Intrinsics.f(education, "education");
        String string = education.toString();
        Locale locale = Locale.ENGLISH;
        String strP = Z.p(locale, "ENGLISH", string, locale, "this as java.lang.String).toLowerCase(locale)");
        Context contextD = Uc.d();
        AbstractC2936ab.k = strP;
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = C6.f22734b;
            C6.a(B6.a(contextD, "user_info_store"), "user_education", strP, false, 4, (Object) null);
        }
    }

    @JvmStatic
    public static final void setGender(Gender gender) {
        Intrinsics.f(gender, "gender");
        String string = gender.toString();
        Locale locale = Locale.ENGLISH;
        String strP = Z.p(locale, "ENGLISH", string, locale, "this as java.lang.String).toLowerCase(locale)");
        Context contextD = Uc.d();
        AbstractC2936ab.j = strP;
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = C6.f22734b;
            C6.a(B6.a(contextD, "user_info_store"), "user_gender", strP, false, 4, (Object) null);
        }
    }

    @JvmStatic
    public static final void setInterests(String interests) {
        Context contextD = Uc.d();
        if (interests != null) {
            AbstractC2936ab.m = interests;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = C6.f22734b;
                C6.a(B6.a(contextD, "user_info_store"), "user_interest", interests, false, 4, (Object) null);
            }
        }
    }

    @JvmStatic
    public static final void setIsAgeRestricted(boolean isAgeRestricted) {
        AbstractC2936ab.a(isAgeRestricted);
        C3246te.f24014a.a(isAgeRestricted);
        if (isAgeRestricted) {
            InMobiUnifiedIdService.reset();
            I5.a();
        }
    }

    @JvmStatic
    public static final void setLanguage(String language) {
        Context contextD = Uc.d();
        if (language != null) {
            AbstractC2936ab.f23449l = language;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = C6.f22734b;
                C6.a(B6.a(contextD, "user_info_store"), "user_language", language, false, 4, (Object) null);
            }
        }
    }

    @JvmStatic
    public static final void setLocation(Location location) {
        Context contextD = Uc.d();
        if (location != null) {
            AbstractC2936ab.f23450n = location;
            if (contextD != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(location.getLatitude());
                sb.append(AbstractJsonLexerKt.COMMA);
                sb.append(location.getLongitude());
                sb.append(AbstractJsonLexerKt.COMMA);
                sb.append((int) location.getAccuracy());
                sb.append(AbstractJsonLexerKt.COMMA);
                sb.append(location.getTime());
                String string = sb.toString();
                ConcurrentHashMap concurrentHashMap = C6.f22734b;
                C6.a(B6.a(contextD, "user_info_store"), "user_location", string, false, 4, (Object) null);
            }
        }
    }

    @JvmStatic
    public static final void setLocationWithCityStateCountry(String city, String state, String country) {
        Context contextD = Uc.d();
        if (city != null) {
            AbstractC2936ab.f = city;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = C6.f22734b;
                C6.a(B6.a(contextD, "user_info_store"), "user_city_code", city, false, 4, (Object) null);
            }
        }
        Context contextD2 = Uc.d();
        if (state != null) {
            AbstractC2936ab.g = state;
            if (contextD2 != null) {
                ConcurrentHashMap concurrentHashMap2 = C6.f22734b;
                C6.a(B6.a(contextD2, "user_info_store"), "user_state_code", state, false, 4, (Object) null);
            }
        }
        Context contextD3 = Uc.d();
        if (country != null) {
            AbstractC2936ab.f23447h = country;
            if (contextD3 != null) {
                ConcurrentHashMap concurrentHashMap3 = C6.f22734b;
                C6.a(B6.a(contextD3, "user_info_store"), "user_country_code", country, false, 4, (Object) null);
            }
        }
    }

    @JvmStatic
    public static final void setLogLevel(LogLevel logLevel) {
        int i2 = logLevel == null ? -1 : a.f24170a[logLevel.ordinal()];
        if (i2 == 1) {
            AbstractC3048h7.a((byte) 0);
            return;
        }
        if (i2 == 2) {
            AbstractC3048h7.a((byte) 1);
        } else if (i2 != 3) {
            AbstractC3048h7.a((byte) 2);
        } else {
            AbstractC3048h7.a((byte) 2);
        }
    }

    @JvmStatic
    public static final void setPartnerGDPRConsent(JSONObject consentObject) {
        G4.c(consentObject);
    }

    @JvmStatic
    public static final void setPostalCode(String postalCode) {
        Context contextD = Uc.d();
        if (postalCode != null) {
            AbstractC2936ab.f23446e = postalCode;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = C6.f22734b;
                C6.a(B6.a(contextD, "user_info_store"), "user_post_code", postalCode, false, 4, (Object) null);
            }
        }
    }

    @JvmStatic
    public static final void setPublisherProvidedUnifiedId(JSONObject jsonObject) {
        Objects.toString(jsonObject);
        Uc.a(new J5(jsonObject));
    }

    @JvmStatic
    public static final void setYearOfBirth(int yearOfBirth) {
        Context contextD = Uc.d();
        if (yearOfBirth != Integer.MIN_VALUE) {
            AbstractC2936ab.f23448i = yearOfBirth;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = C6.f22734b;
                C6.a(B6.a(contextD, "user_info_store"), "user_yob", yearOfBirth, false, 4, (Object) null);
            }
        }
    }

    @JvmStatic
    public static final void updateGDPRConsent(JSONObject consentObject) {
        G4.b(consentObject);
    }

    public static final void a(Context context, SdkInitializationListener sdkInitializationListener, String str, JSONObject jSONObject) {
        SdkInitializationListener sdkInitializationListener2;
        if (context == null) {
            INSTANCE.getClass();
            b(sdkInitializationListener, SdkInitializationListener.MISSING_CONTEXT);
            return;
        }
        if (str == null) {
            INSTANCE.getClass();
            b(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Gd.f22850a.a();
        if (De.f22785a.c()) {
            INSTANCE.getClass();
            b(sdkInitializationListener, "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.");
            return;
        }
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean z3 = Intrinsics.h(str.charAt(!z2 ? i2 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                } else {
                    length--;
                }
            } else if (z3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        String strA = I7.a(length, 1, str, i2);
        try {
            G4.b(jSONObject);
            if (strA.length() == 0) {
                INSTANCE.getClass();
                b(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
                return;
            }
            if (!AbstractC3290wa.a(context, "android.permission.ACCESS_COARSE_LOCATION") && !AbstractC3290wa.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
                AbstractC3048h7.a((byte) 1, "InMobiSdk", "Please grant the location permissions (ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION, or both) for better ad targeting.");
            }
            if (Uc.q()) {
                INSTANCE.getClass();
                b(sdkInitializationListener, null);
                return;
            }
            Uc uc = Uc.f23270a;
            if (uc.i() == 1) {
                return;
            }
            if (!Uc.b(context, strA)) {
                uc.s();
                INSTANCE.getClass();
                b(sdkInitializationListener, SdkInitializationListener.MISSING_WEBVIEW_DEPENDENCY);
                return;
            }
            De.f22785a.e(context);
            INSTANCE.getClass();
            a();
            sdkInitializationListener2 = sdkInitializationListener;
            try {
                Uc.a(new B.a(context, strA, sdkInitializationListener2, jElapsedRealtime));
            } catch (Exception unused) {
                Uc.f23270a.s();
                INSTANCE.getClass();
                b(sdkInitializationListener2, "SDK could not be initialized; an unexpected error was encountered.");
            }
        } catch (Exception unused2) {
            sdkInitializationListener2 = sdkInitializationListener;
        }
    }

    @JvmStatic
    public static final String getToken(Map<String, String> extras, String keywords) {
        return AbstractC3167oe.a(extras, keywords);
    }

    public static final void b() {
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE"};
        StringBuilder sb = new StringBuilder("Permissions granted to SDK are :\nandroid.permission.INTERNET\nandroid.permission.ACCESS_NETWORK_STATE");
        for (int i2 = 0; i2 < 4; i2++) {
            String str = strArr[i2];
            if (AbstractC3290wa.a(Uc.d(), str)) {
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb.append(str);
            }
        }
        AbstractC3048h7.a((byte) 2, "InMobiSdk", sb.toString());
    }

    public static final void a(Context context, String str, SdkInitializationListener sdkInitializationListener, long j) {
        try {
            De de = De.f22785a;
            de.a(context);
            Uc uc = Uc.f23270a;
            uc.a();
            uc.b(str);
            de.c(context);
            uc.t();
            INSTANCE.getClass();
            b(sdkInitializationListener, null);
            LinkedHashMap linkedHashMapA = a(j);
            Pd pd = Pd.f23077a;
            Pd.b("SdkInitialized", linkedHashMapA, Td.SDK);
            InMobiUnifiedIdService.push(null);
        } catch (Exception unused) {
            Uc.f23270a.s();
            INSTANCE.getClass();
            b(sdkInitializationListener, "SDK could not be initialized; an unexpected error was encountered.");
        }
    }

    public final void a(SdkInitializationListener sdkInitializationListener, String message) {
        sdkInitializationListener.onInitializationComplete(message == null ? null : new Error(message));
    }

    public static LinkedHashMap a(long j) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        Objects.toString(linkedHashMap.get("latency"));
        linkedHashMap.put("networkType", L3.q());
        linkedHashMap.put("integrationType", "InMobi");
        return linkedHashMap;
    }

    public static void a() {
        Uc.a(new RunnableC0895i(13));
    }
}
