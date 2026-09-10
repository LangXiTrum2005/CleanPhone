package com.p004ironsource;

import android.support.v4.media.a;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.p004ironsource.mediationsdk.c;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 %2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b#\u0010$J,\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u0018\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H&J8\u0010\u000b\u001a\u00020\u00162\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u000b\u0010!¨\u0006&"}, d2 = {"Lcom/ironsource/hx;", "", "Lcom/ironsource/m5;", "item", "Lcom/ironsource/j5;", "auctionData", "Lcom/ironsource/c0;", "adInstanceFactory", "Lcom/ironsource/g0;", "adInstancePayload", "Lcom/ironsource/z;", "a", "", PglCryptUtils.KEY_MESSAGE, "instanceName", "", "Lcom/ironsource/ix;", "waterfallFetcherListener", "", "waterfallItems", "", "adInstancePayloads", "Lcom/ironsource/jx;", "Lcom/ironsource/u2;", "Lcom/ironsource/u2;", "adTools", "Lcom/ironsource/u1;", "b", "Lcom/ironsource/u1;", "adUnitData", "Lcom/ironsource/zp;", "c", "Lcom/ironsource/zp;", "()Lcom/ironsource/zp;", "outcomeReporter", "<init>", "(Lcom/ironsource/u2;Lcom/ironsource/u1;)V", "d", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class hx {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u2 adTools;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u1 adUnitData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zp outcomeReporter;

    /* JADX INFO: renamed from: com.ironsource.hx$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ironsource/hx$a;", "", "Lcom/ironsource/u2;", "adTools", "Lcom/ironsource/u1;", "adUnitData", "Lcom/ironsource/hx;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public final hx a(u2 adTools, u1 adUnitData) {
            Intrinsics.f(adTools, "adTools");
            Intrinsics.f(adUnitData, "adUnitData");
            return adUnitData.t() ? new p5(adTools, adUnitData) : new hp(adTools, adUnitData);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/ironsource/hx$b", "Lcom/ironsource/zp;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements zp {
    }

    public hx(u2 adTools, u1 adUnitData) {
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(adUnitData, "adUnitData");
        this.adTools = adTools;
        this.adUnitData = adUnitData;
        this.outcomeReporter = new b();
    }

    public final jx a(List<? extends m5> waterfallItems, Map<String, C3357g0> adInstancePayloads, j5 auctionData, InterfaceC3348c0 adInstanceFactory) {
        Intrinsics.f(waterfallItems, "waterfallItems");
        Intrinsics.f(adInstancePayloads, "adInstancePayloads");
        Intrinsics.f(auctionData, "auctionData");
        Intrinsics.f(adInstanceFactory, "adInstanceFactory");
        IronLog.INTERNAL.verbose(m1.a(this.adTools, "waterfall.size() = " + waterfallItems.size(), (String) null, 2, (Object) null));
        ArrayList arrayList = new ArrayList();
        int size = waterfallItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            m5 m5Var = waterfallItems.get(i2);
            AbstractC3389z abstractC3389zA = a(m5Var, auctionData, adInstanceFactory, adInstancePayloads.get(m5Var.c()));
            if (abstractC3389zA != null && abstractC3389zA.g() != null) {
                arrayList.add(abstractC3389zA);
            }
        }
        jx jxVar = new jx(arrayList);
        IronLog.INTERNAL.verbose(m1.a(this.adTools, "updateWaterfall() - next waterfall is " + jxVar + ".toWaterfallString()", (String) null, 2, (Object) null));
        return jxVar;
    }

    public abstract void a(InterfaceC3348c0 adInstanceFactory, ix waterfallFetcherListener);

    private final AbstractC3389z a(m5 item, j5 auctionData, InterfaceC3348c0 adInstanceFactory, C3357g0 adInstancePayload) {
        String strC;
        String str;
        u1 u1Var = this.adUnitData;
        String strC2 = item.c();
        Intrinsics.e(strC2, "item.instanceName");
        NetworkSettings networkSettingsA = u1Var.a(strC2);
        if (networkSettingsA == null) {
            strC = item.c();
            Intrinsics.e(strC, "item.instanceName");
            str = "Could not find matching provider settings for auction response item";
        } else {
            if (adInstancePayload != null) {
                c.b().b(networkSettingsA, this.adUnitData.getAdProperties().getAdFormat(), this.adUnitData.getAdProperties().getCom.ironsource.sdk.controller.f.b.c java.lang.String());
                int iF = this.adTools.f();
                u1 u1Var2 = this.adUnitData;
                return adInstanceFactory.a(new C3344a0(u1Var2, networkSettingsA, auctionData, new a3(networkSettingsA, u1Var2.b(networkSettingsA), this.adUnitData.getAdProperties().getAdFormat()), item, iF), adInstancePayload);
            }
            strC = item.c();
            Intrinsics.e(strC, "item.instanceName");
            str = "Could not find matching adInstancePayload for auction response item";
        }
        a(str, strC);
        return null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public zp getOutcomeReporter() {
        return this.outcomeReporter;
    }

    private final void a(String message, String instanceName) {
        String strD = a.D(message, " - item = ", instanceName);
        IronLog.INTERNAL.error(m1.a(this.adTools, strD, (String) null, 2, (Object) null));
        this.adTools.getEventSender().getTroubleshoot().i(strD);
    }
}
