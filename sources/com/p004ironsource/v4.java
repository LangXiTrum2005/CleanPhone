package com.p004ironsource;

import com.p004ironsource.mediationsdk.d;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0007\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ironsource/v4;", "Lcom/ironsource/w4;", "", "", "auctionUrls", "methodName", "", "a", "b", "c", "Lcom/ironsource/dj;", "Lcom/ironsource/dj;", "instanceInfo", "Lcom/ironsource/mediationsdk/d;", "Lcom/ironsource/mediationsdk/d;", "auctionDataUtils", "Lcom/ironsource/c5;", "Lcom/ironsource/c5;", "auctionReportUrls", "<init>", "(Lcom/ironsource/dj;Lcom/ironsource/mediationsdk/d;Lcom/ironsource/c5;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class v4 implements w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final dj instanceInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d auctionDataUtils;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c5 auctionReportUrls;

    public v4(dj instanceInfo, d auctionDataUtils, c5 c5Var) {
        Intrinsics.f(instanceInfo, "instanceInfo");
        Intrinsics.f(auctionDataUtils, "auctionDataUtils");
        this.instanceInfo = instanceInfo;
        this.auctionDataUtils = auctionDataUtils;
        this.auctionReportUrls = c5Var;
    }

    @Override // com.p004ironsource.w4
    public void a(String methodName) {
        List<String> listB;
        Intrinsics.f(methodName, "methodName");
        c5 c5Var = this.auctionReportUrls;
        if (c5Var == null || (listB = c5Var.b()) == null) {
            listB = EmptyList.X;
        }
        a(listB, methodName);
    }

    @Override // com.p004ironsource.w4
    public void b(String methodName) {
        List<String> listC;
        Intrinsics.f(methodName, "methodName");
        c5 c5Var = this.auctionReportUrls;
        if (c5Var == null || (listC = c5Var.c()) == null) {
            listC = EmptyList.X;
        }
        a(listC, methodName);
    }

    @Override // com.p004ironsource.w4
    public void c(String methodName) {
        List<String> listA;
        Intrinsics.f(methodName, "methodName");
        c5 c5Var = this.auctionReportUrls;
        if (c5Var == null || (listA = c5Var.a()) == null) {
            listA = EmptyList.X;
        }
        a(listA, methodName);
    }

    private final void a(List<String> auctionUrls, String methodName) {
        Iterator<String> it = auctionUrls.iterator();
        while (it.hasNext()) {
            this.auctionDataUtils.a(methodName, this.instanceInfo.e(), d.b().a(it.next(), this.instanceInfo.e(), this.instanceInfo.f(), this.instanceInfo.d(), "", "", "", ""));
        }
    }
}
