package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.p004ironsource.ko;
import com.thinkup.core.common.n.mo;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue f15698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f15699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jg f15700c;
    public final Mediation d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15701e;
    public final boolean f;

    public z3(ue renderableConfig, w adMarkupConfig, jg telemetryManager, Mediation mediation) {
        Intrinsics.f(renderableConfig, "renderableConfig");
        Intrinsics.f(adMarkupConfig, "adMarkupConfig");
        Intrinsics.f(telemetryManager, "telemetryManager");
        this.f15698a = renderableConfig;
        this.f15699b = adMarkupConfig;
        this.f15700c = telemetryManager;
        this.d = mediation;
        this.f = renderableConfig.e();
    }

    public final List a(List list, String str) {
        ArrayList<x6> arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.a(((x6) obj).d(), x6.b.CLICK.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (x6 x6Var : arrayList) {
            wg wgVar = null;
            try {
                new URL(x6Var.e());
                String strE = x6Var.e();
                String upperCase = x6Var.c().toUpperCase(Locale.ROOT);
                Intrinsics.e(upperCase, "toUpperCase(...)");
                String strA = x6Var.a();
                if (StringsKt.w(strA)) {
                    strA = null;
                }
                wgVar = new wg(strE, upperCase, strA, x6Var.b());
            } catch (Exception e2) {
                String strE2 = x6Var.e();
                String strC = x6Var.c();
                String message = e2.getMessage();
                StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("Error processing tracker from ", str, ": URL='", strE2, "', Method='");
                sbQ.append(strC);
                sbQ.append("'. Error: ");
                sbQ.append(message);
                za.e(sbQ.toString(), e2);
            }
            if (wgVar != null) {
                arrayList2.add(wgVar);
            }
        }
        return arrayList2;
    }

    public final List a(List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new wg((String) it.next(), ko.f25534a, null, null));
        }
        return arrayList;
    }

    public final boolean a(y3 clickContext, boolean z2) {
        i4 i4Var;
        Intrinsics.f(clickContext, "clickContext");
        boolean z3 = this.f;
        if (z3 && this.f15701e) {
            za.a("Click deduplicated. Event: " + clickContext, (Throwable) null, 2, (Object) null);
            return false;
        }
        if (!z2) {
            za.a("Click ignored due to lack of user gesture. Event: " + clickContext, (Throwable) null, 2, (Object) null);
            return false;
        }
        za.a("Handling click tracking. Event: " + clickContext + ", Dedupe: " + z3 + ", FirstTracked: " + this.f15701e, (Throwable) null, 2, (Object) null);
        ArrayList arrayList = new ArrayList();
        boolean z4 = clickContext instanceof y3.d;
        if (z4) {
            arrayList.addAll(a(((y3.d) clickContext).a()));
        } else if (clickContext instanceof y3.c) {
            arrayList.addAll(a(((y3.c) clickContext).a()));
        } else if (clickContext instanceof y3.b) {
            arrayList.addAll(a(((y3.b) clickContext).a()));
        } else if (clickContext instanceof y3.a) {
            arrayList.addAll(a(((y3.a) clickContext).a()));
        }
        arrayList.addAll(a(this.f15698a.f(), "RenderableConfig"));
        arrayList.addAll(a(this.f15699b.c(), "AdMarkupConfig"));
        if (!arrayList.isEmpty()) {
            if (clickContext instanceof y3.a) {
                i4Var = i4.CTA;
            } else if (clickContext instanceof y3.c) {
                i4Var = i4.VAST_COMPANION;
            } else {
                if (!z4 && !(clickContext instanceof y3.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                i4Var = i4.BODY;
            }
            i4 i4Var2 = i4Var;
            this.f15700c.a(new a4(this.f15699b.a(), EmptyList.X, i4Var2, null, null, null, null, this.d, 120, null), CollectionsKt.q(arrayList));
            za.a("Submitted " + CollectionsKt.q(arrayList).size() + " unique click trackers for clickType: " + i4Var2.b() + mo.ono, (Throwable) null, 2, (Object) null);
        }
        if (this.f) {
            this.f15701e = true;
            za.a("First click tracked. Subsequent clicks will be deduplicated.", (Throwable) null, 2, (Object) null);
        }
        return true;
    }
}
