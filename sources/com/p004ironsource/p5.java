package com.p004ironsource;

import android.text.TextUtils;
import com.p004ironsource.mediationsdk.d;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q0.b;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b5\u00106J\u0082\u0001\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0002J@\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u0019\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0002J0\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u00100\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u0019\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/ironsource/p5;", "Lcom/ironsource/hx;", "Lcom/ironsource/c0;", "adInstanceFactory", "Lcom/ironsource/ix;", "waterfallFetcherListener", "", "Lcom/ironsource/m5;", "newWaterfall", "", "", "Lcom/ironsource/g0;", "adInstancePayloads", "auctionId", "genericNotifications", "Lorg/json/JSONObject;", "genericParams", "configurations", "", "auctionTrial", "", "elapsedTime", "troubleshootErrorCode", "troubleshootErrorMessage", "", "a", "errorCode", "errorMessage", IronSourceConstants.AUCTION_FALLBACK, "Lcom/ironsource/jx;", "waterfallInstances", b.i0, "Lcom/ironsource/u2;", "e", "Lcom/ironsource/u2;", "adTools", "Lcom/ironsource/u1;", f.j, "Lcom/ironsource/u1;", "adUnitData", "Lcom/ironsource/q5;", g.f40227p, "Lcom/ironsource/q5;", "auctioneer", "Lcom/ironsource/zp;", h.f36614b, "Lcom/ironsource/zp;", "()Lcom/ironsource/zp;", "outcomeReporter", "Lcom/ironsource/r5;", i.f37957c, "Lcom/ironsource/r5;", "completionListenerStrongReference", "<init>", "(Lcom/ironsource/u2;Lcom/ironsource/u1;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class p5 extends hx {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final u2 adTools;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final u1 adUnitData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final q5 auctioneer;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final zp outcomeReporter;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private r5 completionListenerStrongReference;

    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001Jr\u0010\u0015\u001a\u00020\u00142\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0016J0\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¨\u0006\u001a"}, d2 = {"com/ironsource/p5$a", "Lcom/ironsource/r5;", "", "Lcom/ironsource/m5;", "newWaterfall", "", "", "Lcom/ironsource/g0;", "adInstancePayloads", "auctionId", "genericNotifications", "Lorg/json/JSONObject;", "genericParams", "configurations", "", "auctionTrial", "", "elapsedTime", "troubleshootErrorCode", "troubleshootErrorMessage", "", "a", "errorCode", "errorMessage", IronSourceConstants.AUCTION_FALLBACK, "errorReason", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements r5 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3348c0 f26444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ix f26445c;

        public a(InterfaceC3348c0 interfaceC3348c0, ix ixVar) {
            this.f26444b = interfaceC3348c0;
            this.f26445c = ixVar;
        }

        @Override // com.p004ironsource.r5
        public void a(int errorCode, String errorReason) {
            Intrinsics.f(errorReason, "errorReason");
            this.f26445c.a(errorCode, errorReason);
        }

        @Override // com.p004ironsource.r5
        public void a(final int errorCode, final String errorMessage, final int auctionTrial, final String auctionFallback, final long elapsedTime) {
            Intrinsics.f(errorMessage, "errorMessage");
            Intrinsics.f(auctionFallback, "auctionFallback");
            u2 u2Var = p5.this.adTools;
            final p5 p5Var = p5.this;
            final InterfaceC3348c0 interfaceC3348c0 = this.f26444b;
            final ix ixVar = this.f26445c;
            u2Var.a(new Runnable() { // from class: com.ironsource.A0
                @Override // java.lang.Runnable
                public final void run() {
                    String str = auctionFallback;
                    p5.a.a(p5Var, interfaceC3348c0, ixVar, errorCode, errorMessage, auctionTrial, str, elapsedTime);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(p5 this$0, InterfaceC3348c0 adInstanceFactory, ix waterfallFetcherListener, int i2, String errorMessage, int i3, String auctionFallback, long j) {
            Intrinsics.f(this$0, "this$0");
            Intrinsics.f(adInstanceFactory, "$adInstanceFactory");
            Intrinsics.f(waterfallFetcherListener, "$waterfallFetcherListener");
            Intrinsics.f(errorMessage, "$errorMessage");
            Intrinsics.f(auctionFallback, "$auctionFallback");
            this$0.completionListenerStrongReference = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, i2, errorMessage, i3, auctionFallback, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(p5 this$0, InterfaceC3348c0 adInstanceFactory, ix waterfallFetcherListener, List newWaterfall, Map adInstancePayloads, String auctionId, m5 m5Var, JSONObject jSONObject, JSONObject jSONObject2, int i2, long j, int i3, String str) {
            Intrinsics.f(this$0, "this$0");
            Intrinsics.f(adInstanceFactory, "$adInstanceFactory");
            Intrinsics.f(waterfallFetcherListener, "$waterfallFetcherListener");
            Intrinsics.f(newWaterfall, "$newWaterfall");
            Intrinsics.f(adInstancePayloads, "$adInstancePayloads");
            Intrinsics.f(auctionId, "$auctionId");
            this$0.completionListenerStrongReference = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, newWaterfall, adInstancePayloads, auctionId, m5Var, jSONObject, jSONObject2, i2, j, i3, str);
        }

        @Override // com.p004ironsource.r5
        public void a(final List<m5> newWaterfall, final Map<String, C3357g0> adInstancePayloads, final String auctionId, final m5 genericNotifications, final JSONObject genericParams, final JSONObject configurations, final int auctionTrial, final long elapsedTime, final int troubleshootErrorCode, final String troubleshootErrorMessage) {
            Intrinsics.f(newWaterfall, "newWaterfall");
            Intrinsics.f(adInstancePayloads, "adInstancePayloads");
            Intrinsics.f(auctionId, "auctionId");
            u2 u2Var = p5.this.adTools;
            final p5 p5Var = p5.this;
            final InterfaceC3348c0 interfaceC3348c0 = this.f26444b;
            final ix ixVar = this.f26445c;
            u2Var.a(new Runnable() { // from class: com.ironsource.Z
                @Override // java.lang.Runnable
                public final void run() {
                    p5.a.a(p5Var, interfaceC3348c0, ixVar, newWaterfall, adInstancePayloads, auctionId, genericNotifications, genericParams, configurations, auctionTrial, elapsedTime, troubleshootErrorCode, troubleshootErrorMessage);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(u2 adTools, u1 adUnitData) {
        super(adTools, adUnitData);
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(adUnitData, "adUnitData");
        this.adTools = adTools;
        this.adUnitData = adUnitData;
        q5 q5Var = new q5(adTools, adUnitData);
        this.auctioneer = q5Var;
        this.outcomeReporter = q5Var.getOutcomeReporter();
    }

    @Override // com.p004ironsource.hx
    /* JADX INFO: renamed from: a, reason: from getter */
    public zp getOutcomeReporter() {
        return this.outcomeReporter;
    }

    @Override // com.p004ironsource.hx
    public void a(InterfaceC3348c0 adInstanceFactory, ix waterfallFetcherListener) {
        Intrinsics.f(adInstanceFactory, "adInstanceFactory");
        Intrinsics.f(waterfallFetcherListener, "waterfallFetcherListener");
        a aVar = new a(adInstanceFactory, waterfallFetcherListener);
        this.auctioneer.a(aVar);
        this.completionListenerStrongReference = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(InterfaceC3348c0 adInstanceFactory, ix waterfallFetcherListener, int errorCode, String errorMessage, int auctionTrial, String auctionFallback, long elapsedTime) {
        IronLog.INTERNAL.verbose(m1.a(this.adTools, "Auction failed (error " + errorCode + " - " + errorMessage + ')', (String) null, 2, (Object) null));
        boolean zN = this.adUnitData.getAuctionSettings().n();
        String strA = x4.f27661a.a(zN);
        j5 j5Var = new j5(strA, null, null, auctionTrial, auctionFallback);
        bc eventSender = this.adTools.getEventSender();
        eventSender.a(new t4(j5Var));
        eventSender.getAuction().a(elapsedTime, errorCode, errorMessage);
        if (zN) {
            a(adInstanceFactory, waterfallFetcherListener, auctionTrial, auctionFallback, strA);
        } else {
            a(waterfallFetcherListener);
        }
    }

    private final void a(InterfaceC3348c0 adInstanceFactory, ix waterfallFetcherListener, int auctionTrial, String auctionFallback, String auctionId) {
        IronLog.INTERNAL.verbose(m1.a(this.adTools, "Moving to fallback waterfall", (String) null, 2, (Object) null));
        new hp(this.adTools, this.adUnitData).a(waterfallFetcherListener, auctionTrial, auctionFallback, auctionId, adInstanceFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(InterfaceC3348c0 adInstanceFactory, ix waterfallFetcherListener, List<m5> newWaterfall, Map<String, C3357g0> adInstancePayloads, String auctionId, m5 genericNotifications, JSONObject genericParams, JSONObject configurations, int auctionTrial, long elapsedTime, int troubleshootErrorCode, String troubleshootErrorMessage) {
        IronLog.INTERNAL.verbose(m1.a(this.adTools, (String) null, (String) null, 3, (Object) null));
        j5 j5Var = new j5(auctionId, genericParams, genericNotifications, auctionTrial, "");
        if (!TextUtils.isEmpty(troubleshootErrorMessage)) {
            this.adTools.getEventSender().getTroubleshoot().a(troubleshootErrorCode, troubleshootErrorMessage);
        }
        a(configurations);
        jx jxVarA = a(newWaterfall, adInstancePayloads, j5Var, adInstanceFactory);
        this.adTools.getEventSender().a(new t4(j5Var));
        this.adTools.getEventSender().getAuction().a(elapsedTime, this.adUnitData.v() + ";wtf=" + jxVarA.c());
        this.adTools.getEventSender().getAuction().c(jxVarA.d());
        a(jxVarA, waterfallFetcherListener);
    }

    private final void a(ix waterfallFetcherListener) {
        waterfallFetcherListener.a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill");
    }

    private final void a(jx waterfallInstances, ix waterfallFetcherListener) {
        this.adTools.getAuctionHistory().a(waterfallInstances);
        waterfallFetcherListener.a(waterfallInstances);
    }

    private final void a(JSONObject config) {
        IronLog ironLog;
        u2 u2Var;
        String strV;
        int i2;
        try {
            if (config == null) {
                this.adUnitData.b(false);
                ironLog = IronLog.INTERNAL;
                u2Var = this.adTools;
                strV = "loading configuration from auction response is null, using the following: " + this.adUnitData.v();
            } else {
                try {
                    if (config.has(d.x) && (i2 = config.getInt(d.x)) > 0) {
                        this.adUnitData.a(i2);
                    }
                    if (config.has(d.y)) {
                        this.adUnitData.a(config.getBoolean(d.y));
                    }
                    this.adUnitData.b(config.optBoolean(d.f25777z, false));
                    ironLog = IronLog.INTERNAL;
                    u2Var = this.adTools;
                    strV = this.adUnitData.v();
                } catch (JSONException e2) {
                    q9.d().a(e2);
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.error("failed to update loading configuration for" + this.adUnitData.getAdProperties().getAdFormat() + " Error: " + e2.getMessage());
                    ironLog2.verbose(m1.a(this.adTools, this.adUnitData.v(), (String) null, 2, (Object) null));
                    return;
                }
            }
            ironLog.verbose(m1.a(u2Var, strV, (String) null, 2, (Object) null));
        } catch (Throwable th) {
            IronLog.INTERNAL.verbose(m1.a(this.adTools, this.adUnitData.v(), (String) null, 2, (Object) null));
            throw th;
        }
    }
}
