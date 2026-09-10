package com.inmobi.ads;

import com.inmobi.media.A5;
import com.inmobi.media.InterfaceC3333z5;
import com.inmobi.media.R1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InMobiBanner f22651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f22652b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InMobiBanner inMobiBanner, byte[] bArr) {
        super(0);
        this.f22651a = inMobiBanner;
        this.f22652b = bArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC3333z5 interfaceC3333z5P;
        R1 mAdManager = this.f22651a.getMAdManager();
        if (mAdManager != null && (interfaceC3333z5P = mAdManager.p()) != null) {
            String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
            Intrinsics.e(strAccess$getTAG$cp, "access$getTAG$cp(...)");
            ((A5) interfaceC3333z5P).c(strAccess$getTAG$cp, "load with response");
        }
        R1 mAdManager2 = this.f22651a.getMAdManager();
        if (mAdManager2 != null) {
            mAdManager2.a(this.f22652b, this.f22651a.f22629e);
        }
        return Unit.f43263a;
    }
}
