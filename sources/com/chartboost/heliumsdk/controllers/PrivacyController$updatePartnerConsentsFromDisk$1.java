package com.chartboost.heliumsdk.controllers;

import com.chartboost.heliumsdk.utils.LogController;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.controllers.PrivacyController$updatePartnerConsentsFromDisk$1", f = "PrivacyController.kt", l = {}, m = "invokeSuspend")
public final class PrivacyController$updatePartnerConsentsFromDisk$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PrivacyController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivacyController$updatePartnerConsentsFromDisk$1(PrivacyController privacyController, Continuation<? super PrivacyController$updatePartnerConsentsFromDisk$1> continuation) {
        super(2, continuation);
        this.this$0 = privacyController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PrivacyController$updatePartnerConsentsFromDisk$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        String string = this.this$0.sharedPreferences.getString("helium_partner_consents_map", "");
        if (string == null || string.length() == 0) {
            LogController.INSTANCE.d("No partner consents map saved.");
        } else {
            try {
                JSONObject jSONObject = new JSONObject(string);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<String> itKeys = jSONObject.keys();
                Intrinsics.e(itKeys, "jsonObject.keys()");
                while (itKeys.hasNext()) {
                    String it = itKeys.next();
                    Intrinsics.e(it, "it");
                    linkedHashMap.put(it, Boolean.valueOf(jSONObject.getBoolean(it)));
                }
                this.this$0.partnerConsents.mergePartnerConsentsFromDisk$Helium_release(linkedHashMap);
                this.this$0.savePartnerConsentsToDisk();
            } catch (JSONException unused) {
                LogController.INSTANCE.d("Unable to recreate partner consents map.");
            }
        }
        return Unit.f43263a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PrivacyController$updatePartnerConsentsFromDisk$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
