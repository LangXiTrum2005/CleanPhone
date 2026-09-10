package com.unity3d.ads.core.configuration;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.configuration.ConfigurationReader;
import fn.a1;
import fn.g;
import fn.n0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/configuration/CommonAlternativeFlowReader;", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "Lcom/unity3d/services/core/configuration/ConfigurationReader;", "configurationReader", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "mediationMetadataReader", "Lcom/unity3d/ads/core/configuration/ForceAlternativeFlow;", "forceAlternativeFlow", "<init>", "(Lcom/unity3d/services/core/configuration/ConfigurationReader;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;Lcom/unity3d/ads/core/configuration/ForceAlternativeFlow;)V", "", "invoke", "()Z", "Lcom/unity3d/services/core/configuration/ConfigurationReader;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "Lcom/unity3d/ads/core/configuration/ForceAlternativeFlow;", "Lfn/n0;", "isAlternativeFlowRead", "Lfn/n0;", "isAlternativeFlowEnabled", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CommonAlternativeFlowReader implements AlternativeFlowReader {
    private final ConfigurationReader configurationReader;
    private final ForceAlternativeFlow forceAlternativeFlow;
    private final n0 isAlternativeFlowEnabled;
    private final n0 isAlternativeFlowRead;
    private final MediationTraitsMetadataReader mediationMetadataReader;
    private final SessionRepository sessionRepository;

    public CommonAlternativeFlowReader(ConfigurationReader configurationReader, SessionRepository sessionRepository, MediationTraitsMetadataReader mediationMetadataReader, ForceAlternativeFlow forceAlternativeFlow) {
        n.f(configurationReader, "configurationReader");
        n.f(sessionRepository, "sessionRepository");
        n.f(mediationMetadataReader, "mediationMetadataReader");
        n.f(forceAlternativeFlow, "forceAlternativeFlow");
        this.configurationReader = configurationReader;
        this.sessionRepository = sessionRepository;
        this.mediationMetadataReader = mediationMetadataReader;
        this.forceAlternativeFlow = forceAlternativeFlow;
        this.isAlternativeFlowRead = g.c(Boolean.FALSE);
        this.isAlternativeFlowEnabled = g.c(Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    @Override // com.unity3d.ads.core.configuration.AlternativeFlowReader
    public boolean invoke() {
        if (((Boolean) ((a1) this.isAlternativeFlowRead).getValue()).booleanValue()) {
            return ((Boolean) ((a1) this.isAlternativeFlowEnabled).getValue()).booleanValue();
        }
        if (this.forceAlternativeFlow.getForceAlternativeFlow()) {
            n0 n0Var = this.isAlternativeFlowEnabled;
            Boolean bool = Boolean.TRUE;
            a1 a1Var = (a1) n0Var;
            a1Var.getClass();
            a1Var.e0(null, bool);
            a1 a1Var2 = (a1) this.isAlternativeFlowRead;
            a1Var2.getClass();
            a1Var2.e0(null, bool);
            return true;
        }
        MediationTraitsMetadataReader mediationTraitsMetadataReader = this.mediationMetadataReader;
        Object obj = mediationTraitsMetadataReader.getJsonStorage().get(mediationTraitsMetadataReader.getKey());
        if (obj == null) {
            obj = null;
        } else {
            if (!(obj instanceof JSONObject)) {
                obj = null;
            }
            if (obj == null) {
                obj = null;
            }
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            if (!jSONObject.has(MediationTraitsMetadataReader.BOLD_SDK_ENABLED)) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                n0 n0Var2 = this.isAlternativeFlowEnabled;
                Boolean boolValueOf = Boolean.valueOf(jSONObject.optBoolean(MediationTraitsMetadataReader.BOLD_SDK_ENABLED));
                a1 a1Var3 = (a1) n0Var2;
                a1Var3.getClass();
                a1Var3.e0(null, boolValueOf);
                n0 n0Var3 = this.isAlternativeFlowRead;
                Boolean bool2 = Boolean.TRUE;
                a1 a1Var4 = (a1) n0Var3;
                a1Var4.getClass();
                a1Var4.e0(null, bool2);
            }
        }
        if (!((Boolean) ((a1) this.isAlternativeFlowRead).getValue()).booleanValue()) {
            if (this.configurationReader.getCurrentConfiguration().getExperiments().isBoldSdkNextSessionEnabled()) {
                n0 n0Var4 = this.isAlternativeFlowEnabled;
                Boolean boolValueOf2 = Boolean.valueOf(this.sessionRepository.getNativeConfiguration().getFeatureFlags().getBoldSdkNextSessionEnabled());
                a1 a1Var5 = (a1) n0Var4;
                a1Var5.getClass();
                a1Var5.e0(null, boolValueOf2);
            } else {
                n0 n0Var5 = this.isAlternativeFlowEnabled;
                Boolean bool3 = Boolean.FALSE;
                a1 a1Var6 = (a1) n0Var5;
                a1Var6.getClass();
                a1Var6.e0(null, bool3);
            }
            n0 n0Var6 = this.isAlternativeFlowRead;
            Boolean bool4 = Boolean.TRUE;
            a1 a1Var7 = (a1) n0Var6;
            a1Var7.getClass();
            a1Var7.e0(null, bool4);
        }
        return ((Boolean) ((a1) this.isAlternativeFlowEnabled).getValue()).booleanValue();
    }
}
