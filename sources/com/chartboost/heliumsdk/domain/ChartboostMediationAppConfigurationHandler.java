package com.chartboost.heliumsdk.domain;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.shadow.okio.Segment;
import com.chartboost.heliumsdk.ChartboostMediationInternal;
import com.chartboost.heliumsdk.HeliumInitializationOptions;
import com.chartboost.heliumsdk.controllers.PartnerController;
import com.chartboost.heliumsdk.network.Endpoints;
import com.chartboost.heliumsdk.utils.LogController;
import com.p004ironsource.mediationsdk.metadata.a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002J\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012JE\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/chartboost/heliumsdk/domain/ChartboostMediationAppConfigurationHandler;", "", "context", "Landroid/content/Context;", "chartboostMediationInitializationOptions", "Lcom/chartboost/heliumsdk/HeliumInitializationOptions;", "(Landroid/content/Context;Lcom/chartboost/heliumsdk/HeliumInitializationOptions;)V", "addReferenceAdapterIfNeeded", "", "partnerConfigMap", "", "", "Lcom/chartboost/heliumsdk/domain/PartnerConfiguration;", "buildPartnerConfigMap", "handleConfigurationChange", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "partnerController", "Lcom/chartboost/heliumsdk/controllers/PartnerController;", "(Lcom/chartboost/heliumsdk/controllers/PartnerController;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUpPartnerAdapters", "skippedPartnerIds", "", "(Lcom/chartboost/heliumsdk/controllers/PartnerController;Landroid/content/Context;Ljava/util/Map;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateServerLogLevelOverride", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ChartboostMediationAppConfigurationHandler {
    private final HeliumInitializationOptions chartboostMediationInitializationOptions;
    private final Context context;

    public ChartboostMediationAppConfigurationHandler(Context context, HeliumInitializationOptions heliumInitializationOptions) {
        this.context = context;
        this.chartboostMediationInitializationOptions = heliumInitializationOptions;
    }

    private final void addReferenceAdapterIfNeeded(Map<String, PartnerConfiguration> partnerConfigMap) {
        if (partnerConfigMap.get("reference") == null) {
            partnerConfigMap.put("reference", new PartnerConfiguration(null, 1, null));
        }
    }

    private final Map<String, PartnerConfiguration> buildPartnerConfigMap() {
        Set<Partner> partners = AppConfigStorage.INSTANCE.getPartners();
        int iH = MapsKt.h(CollectionsKt.n(partners, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (Partner partner : partners) {
            linkedHashMap.put(partner.getPartnerId(), new PartnerConfiguration(partner.getCredentials()));
        }
        return MapsKt.s(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setUpPartnerAdapters(PartnerController partnerController, Context context, Map<String, PartnerConfiguration> map, Set<String> set, Continuation<? super ChartboostMediationError> continuation) throws Throwable {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.q();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        partnerController.setUpAdapters(context, map, AppConfigStorage.INSTANCE.getAdapterClassPaths(), set, new Function1<ChartboostMediationError, Unit>() { // from class: com.chartboost.heliumsdk.domain.ChartboostMediationAppConfigurationHandler$setUpPartnerAdapters$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ChartboostMediationError) obj);
                return Unit.f43263a;
            }

            public final void invoke(ChartboostMediationError chartboostMediationError) {
                Ref.BooleanRef booleanRef2 = booleanRef;
                if (booleanRef2.X) {
                    return;
                }
                booleanRef2.X = true;
                cancellableContinuationImpl.resumeWith(chartboostMediationError);
            }
        });
        Object objP = cancellableContinuationImpl.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        return objP;
    }

    private final void updateServerLogLevelOverride(Context context) {
        Unit unit;
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(ChartboostMediationInternal.CHARTBOOST_MEDIATION_INTERNAL_SHARED_PREFS, 0).edit();
        LogController.LogLevel serverLogLevelOverride = AppConfigStorage.INSTANCE.getServerLogLevelOverride();
        if (serverLogLevelOverride != null) {
            LogController.INSTANCE.setServerLogLevelOverride$Helium_release(serverLogLevelOverride);
            editorEdit.putString(ChartboostMediationInternal.SERVER_LOG_LEVEL_OVERRIDE, serverLogLevelOverride.name()).apply();
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            LogController.INSTANCE.setServerLogLevelOverride$Helium_release(null);
            editorEdit.remove(ChartboostMediationInternal.SERVER_LOG_LEVEL_OVERRIDE).apply();
        }
    }

    public final Object handleConfigurationChange(PartnerController partnerController, Continuation<? super ChartboostMediationError> continuation) {
        AppConfigStorage appConfigStorage = AppConfigStorage.INSTANCE;
        MetricsError.JsonParseError parsingError = appConfigStorage.getParsingError();
        boolean validCachedConfigExists = appConfigStorage.getValidCachedConfigExists();
        if (parsingError != null && !validCachedConfigExists) {
            EventResult.SdkInitializationResult.InitResult1B initResult1B = new EventResult.SdkInitializationResult.InitResult1B(parsingError);
            ChartboostMediationError chartboostMediationError = ChartboostMediationError.CM_INITIALIZATION_FAILURE_INVALID_APP_CONFIG;
            MetricsManager.INSTANCE.postMetricsDataForFailedEvent(null, Endpoints.Sdk.Event.INITIALIZATION, null, chartboostMediationError, chartboostMediationError.getMessage(), (14336 & 32) != 0 ? null : null, (14336 & 64) != 0 ? null : null, (14336 & 128) != 0 ? null : null, (14336 & 256) != 0 ? null : null, (14336 & 512) != 0 ? null : null, (14336 & 1024) != 0 ? null : initResult1B, (14336 & a.f25965n) != 0 ? null : null, (14336 & 4096) != 0 ? null : null, (14336 & Segment.SIZE) != 0 ? null : null);
            return chartboostMediationError;
        }
        Context context = this.context;
        if (context == null) {
            LogController.INSTANCE.e("Failed to initialize mediation partners. Context is null.");
            return ChartboostMediationError.CM_INITIALIZATION_FAILURE_ABORTED;
        }
        updateServerLogLevelOverride(context);
        HeliumInitializationOptions heliumInitializationOptions = this.chartboostMediationInitializationOptions;
        Set<String> skippedPartnerIds = heliumInitializationOptions != null ? heliumInitializationOptions.getSkippedPartnerIds() : null;
        if (skippedPartnerIds == null) {
            skippedPartnerIds = EmptySet.X;
        }
        Map<String, PartnerConfiguration> mapBuildPartnerConfigMap = buildPartnerConfigMap();
        addReferenceAdapterIfNeeded(mapBuildPartnerConfigMap);
        return setUpPartnerAdapters(partnerController, context, mapBuildPartnerConfigMap, skippedPartnerIds, continuation);
    }
}
