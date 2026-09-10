package com.unity3d.ads.core.data.datasource;

import com.ironsource.X3;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonStorage;
import gatewayprotocol.v1.DeveloperConsentKt;
import gatewayprotocol.v1.DeveloperConsentOptionKt;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0017\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u001aJ\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0010H\u0002R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidDeveloperConsentDataSource;", "Lcom/unity3d/ads/core/data/datasource/DeveloperConsentDataSource;", "flattenerRulesUseCase", "Lcom/unity3d/ads/core/domain/privacy/FlattenerRulesUseCase;", "publicStorage", "Lcom/unity3d/services/core/misc/JsonStorage;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "(Lcom/unity3d/ads/core/domain/privacy/FlattenerRulesUseCase;Lcom/unity3d/services/core/misc/JsonStorage;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "developerConsent", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "getDeveloperConsent", "()Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "createDeveloperConsentOption", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentOption;", X3.i.W, "", X3.i.X, "", "developerConsentList", "", "fetchData", "Lorg/json/JSONObject;", "getDeveloperConsentChoice", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentChoice;", "choice", "(Ljava/lang/Boolean;)Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentChoice;", "getDeveloperConsentType", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentType;", "type", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidDeveloperConsentDataSource implements DeveloperConsentDataSource {
    private final FlattenerRulesUseCase flattenerRulesUseCase;
    private final JsonStorage publicStorage;
    private final SessionRepository sessionRepository;

    public AndroidDeveloperConsentDataSource(FlattenerRulesUseCase flattenerRulesUseCase, JsonStorage publicStorage, SessionRepository sessionRepository) {
        n.f(flattenerRulesUseCase, "flattenerRulesUseCase");
        n.f(publicStorage, "publicStorage");
        n.f(sessionRepository, "sessionRepository");
        this.flattenerRulesUseCase = flattenerRulesUseCase;
        this.publicStorage = publicStorage;
        this.sessionRepository = sessionRepository;
    }

    private final DeveloperConsentOuterClass.DeveloperConsentOption createDeveloperConsentOption(String key, boolean value) {
        DeveloperConsentOptionKt.Dsl.Companion companion = DeveloperConsentOptionKt.Dsl.INSTANCE;
        DeveloperConsentOuterClass.DeveloperConsentOption.Builder builderNewBuilder = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
        n.e(builderNewBuilder, "newBuilder()");
        DeveloperConsentOptionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setType(getDeveloperConsentType(key));
        if (dsl_create.getType() == DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM) {
            dsl_create.setCustomType(key);
        }
        dsl_create.setValue(getDeveloperConsentChoice(Boolean.valueOf(value)));
        return dsl_create._build();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d7  */
    private final List<DeveloperConsentOuterClass.DeveloperConsentOption> developerConsentList() throws JSONException {
        DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOptionCreateDeveloperConsentOption;
        ArrayList arrayList = new ArrayList();
        if (this.sessionRepository.getInitializationConfiguration() != null) {
            if (UnityAds.getNonBehavioral() != null) {
                DeveloperConsentOptionKt.Dsl.Companion companion = DeveloperConsentOptionKt.Dsl.INSTANCE;
                DeveloperConsentOuterClass.DeveloperConsentOption.Builder builderNewBuilder = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
                n.e(builderNewBuilder, "newBuilder()");
                DeveloperConsentOptionKt.Dsl dsl_create = companion._create(builderNewBuilder);
                dsl_create.setType(DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_SET_NON_BEHAVIORAL);
                dsl_create.setValue(getDeveloperConsentChoice(UnityAds.getNonBehavioral()));
                arrayList.add(dsl_create._build());
            }
            if (UnityAds.getUserConsent() != null) {
                DeveloperConsentOptionKt.Dsl.Companion companion2 = DeveloperConsentOptionKt.Dsl.INSTANCE;
                DeveloperConsentOuterClass.DeveloperConsentOption.Builder builderNewBuilder2 = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
                n.e(builderNewBuilder2, "newBuilder()");
                DeveloperConsentOptionKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
                dsl_create2.setType(DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_SET_USER_CONSENT);
                dsl_create2.setValue(getDeveloperConsentChoice(UnityAds.getUserConsent()));
                arrayList.add(dsl_create2._build());
            }
            if (UnityAds.getUserOptOut() != null) {
                DeveloperConsentOptionKt.Dsl.Companion companion3 = DeveloperConsentOptionKt.Dsl.INSTANCE;
                DeveloperConsentOuterClass.DeveloperConsentOption.Builder builderNewBuilder3 = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
                n.e(builderNewBuilder3, "newBuilder()");
                DeveloperConsentOptionKt.Dsl dsl_create3 = companion3._create(builderNewBuilder3);
                dsl_create3.setType(DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_SET_USER_OPT_OUT);
                dsl_create3.setValue(getDeveloperConsentChoice(UnityAds.getUserOptOut()));
                arrayList.add(dsl_create3._build());
                return arrayList;
            }
        } else {
            JSONObject jSONObjectFetchData = fetchData();
            Iterator<String> itKeys = jSONObjectFetchData.keys();
            n.e(itKeys, "data.keys()");
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                Object obj = jSONObjectFetchData.get(key);
                if (obj instanceof Boolean) {
                    n.e(key, "key");
                    developerConsentOptionCreateDeveloperConsentOption = createDeveloperConsentOption(key, ((Boolean) obj).booleanValue());
                } else if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.equalsIgnoreCase(com.ironsource.mediationsdk.metadata.a.f29610g) || str.equalsIgnoreCase("false")) {
                        n.e(key, "key");
                        developerConsentOptionCreateDeveloperConsentOption = createDeveloperConsentOption(key, Boolean.parseBoolean(str));
                    } else {
                        developerConsentOptionCreateDeveloperConsentOption = null;
                    }
                } else {
                    developerConsentOptionCreateDeveloperConsentOption = null;
                }
                if (developerConsentOptionCreateDeveloperConsentOption != null) {
                    arrayList.add(developerConsentOptionCreateDeveloperConsentOption);
                }
            }
        }
        return arrayList;
    }

    private final JSONObject fetchData() {
        if (this.publicStorage.getData() == null) {
            return new JSONObject();
        }
        JSONObject jSONObjectFlattenJson = new JsonFlattener(this.publicStorage.getData()).flattenJson(".", this.flattenerRulesUseCase.invoke());
        n.e(jSONObjectFlattenJson, "flattener.flattenJson(\".… flattenerRulesUseCase())");
        return jSONObjectFlattenJson;
    }

    private final DeveloperConsentOuterClass.DeveloperConsentChoice getDeveloperConsentChoice(Boolean choice) {
        if (n.a(choice, Boolean.TRUE)) {
            return DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_TRUE;
        }
        return n.a(choice, Boolean.FALSE) ? DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_FALSE : DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_UNSPECIFIED;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final DeveloperConsentOuterClass.DeveloperConsentType getDeveloperConsentType(String type) {
        if (type == null) {
            return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_UNSPECIFIED;
        }
        switch (type.hashCode()) {
            case -1998919769:
                if (type.equals("user.nonbehavioral")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                }
                break;
            case -1078801183:
                if (type.equals("pipl.consent")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PIPL_CONSENT;
                }
                break;
            case -5454905:
                if (type.equals(JsonStorageKeyNames.USER_NON_BEHAVIORAL_KEY)) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                }
                break;
            case 194451659:
                if (type.equals("gdpr.consent")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_GDPR_CONSENT;
                }
                break;
            case 519433140:
                if (type.equals("privacy.consent")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT;
                }
                break;
            case 2033752033:
                if (type.equals("privacy.useroveragelimit")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT;
                }
                break;
        }
        return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM;
    }

    @Override // com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource
    public DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
        DeveloperConsentKt.Dsl.Companion companion = DeveloperConsentKt.Dsl.INSTANCE;
        DeveloperConsentOuterClass.DeveloperConsent.Builder builderNewBuilder = DeveloperConsentOuterClass.DeveloperConsent.newBuilder();
        n.e(builderNewBuilder, "newBuilder()");
        DeveloperConsentKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.addAllOptions(dsl_create.getOptions(), developerConsentList());
        return dsl_create._build();
    }
}
