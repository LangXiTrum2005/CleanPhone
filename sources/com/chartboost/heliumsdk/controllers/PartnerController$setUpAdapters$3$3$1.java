package com.chartboost.heliumsdk.controllers;

import android.content.Context;
import com.chartboost.heliumsdk.domain.AdapterInfo;
import com.chartboost.heliumsdk.domain.Metrics;
import com.chartboost.heliumsdk.domain.PartnerAdapter;
import com.chartboost.heliumsdk.domain.PartnerConfiguration;
import com.smartdigimkt.sdk.basead.ui.BaseATView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.controllers.PartnerController$setUpAdapters$3$3$1", f = "PartnerController.kt", l = {BaseATView.g.f38289J}, m = "invokeSuspend")
public final class PartnerController$setUpAdapters$3$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Metrics $metrics;
    final /* synthetic */ Map<String, PartnerConfiguration> $partnerConfigurationMap;
    final /* synthetic */ String $partnerId;
    long J$0;
    int label;
    final /* synthetic */ PartnerController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerController$setUpAdapters$3$3$1(PartnerController partnerController, String str, Map<String, PartnerConfiguration> map, Metrics metrics, Context context, Continuation<? super PartnerController$setUpAdapters$3$3$1> continuation) {
        super(2, continuation);
        this.this$0 = partnerController;
        this.$partnerId = str;
        this.$partnerConfigurationMap = map;
        this.$metrics = metrics;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PartnerController$setUpAdapters$3$3$1(this.this$0, this.$partnerId, this.$partnerConfigurationMap, this.$metrics, this.$context, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0090  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        PartnerController$setUpAdapters$3$3$1 partnerController$setUpAdapters$3$3$1;
        PartnerConfiguration partnerConfiguration;
        long j;
        AdapterInfo adapterInfo;
        String str;
        String partnerVersion;
        AdapterInfo adapterInfo2;
        String adapterVersion;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            PartnerController partnerController = this.this$0;
            String str2 = this.$partnerId;
            Map<String, PartnerConfiguration> map = this.$partnerConfigurationMap;
            Metrics metrics = this.$metrics;
            Context context = this.$context;
            jCurrentTimeMillis = System.currentTimeMillis();
            PartnerAdapter partnerAdapter = partnerController.getAdapters().get(str2);
            if (partnerAdapter == null || (partnerConfiguration = map.get(partnerAdapter.getPartnerId())) == null) {
                partnerController$setUpAdapters$3$3$1 = this;
            } else {
                metrics.setStart(new Long(System.currentTimeMillis()));
                this.J$0 = jCurrentTimeMillis;
                this.label = 1;
                partnerController$setUpAdapters$3$3$1 = this;
                if (partnerController.setUp(context, partnerAdapter, partnerConfiguration, metrics, partnerController$setUpAdapters$3$3$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                j = jCurrentTimeMillis;
            }
            Long l2 = new Long(System.currentTimeMillis() - jCurrentTimeMillis);
            Metrics metrics2 = partnerController$setUpAdapters$3$3$1.$metrics;
            String str3 = partnerController$setUpAdapters$3$3$1.$partnerId;
            metrics2.setDuration(new Long(l2.longValue()));
            PartnerController.Companion companion = PartnerController.INSTANCE;
            adapterInfo = companion.getAdapterInfo().get(str3);
            str = "";
            if (adapterInfo != null || (partnerVersion = adapterInfo.getPartnerVersion()) == null) {
                partnerVersion = "";
            }
            metrics2.setPartnerSdkVersion(partnerVersion);
            adapterInfo2 = companion.getAdapterInfo().get(str3);
            if (adapterInfo2 != null && (adapterVersion = adapterInfo2.getAdapterVersion()) != null) {
                str = adapterVersion;
            }
            metrics2.setPartnerAdapterVersion(str);
            return l2;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = this.J$0;
        ResultKt.b(obj);
        partnerController$setUpAdapters$3$3$1 = this;
        jCurrentTimeMillis = j;
        Long l3 = new Long(System.currentTimeMillis() - jCurrentTimeMillis);
        Metrics metrics3 = partnerController$setUpAdapters$3$3$1.$metrics;
        String str4 = partnerController$setUpAdapters$3$3$1.$partnerId;
        metrics3.setDuration(new Long(l3.longValue()));
        PartnerController.Companion companion2 = PartnerController.INSTANCE;
        adapterInfo = companion2.getAdapterInfo().get(str4);
        str = "";
        if (adapterInfo != null) {
            partnerVersion = "";
        } else {
            partnerVersion = "";
        }
        metrics3.setPartnerSdkVersion(partnerVersion);
        adapterInfo2 = companion2.getAdapterInfo().get(str4);
        if (adapterInfo2 != null) {
            str = adapterVersion;
        }
        metrics3.setPartnerAdapterVersion(str);
        return l3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
        return ((PartnerController$setUpAdapters$3$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
