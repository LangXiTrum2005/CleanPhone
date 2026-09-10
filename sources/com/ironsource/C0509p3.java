package com.ironsource;

import com.ironsource.AbstractC0401j3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.p3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0509p3<Smash extends AbstractC0401j3<?>> extends ch<Smash> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f29972h;

    public /* synthetic */ C0509p3(int i10, boolean z10, List list, boolean z11, int i11, kotlin.jvm.internal.g gVar) {
        this(i10, z10, list, (i11 & 8) != 0 ? false : z11);
    }

    @Override // com.ironsource.ch
    public void c(Smash smash) {
        String strO;
        kotlin.jvm.internal.n.f(smash, "smash");
        if (!smash.w()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.c() + " (non-bidder) is ready to load");
            smash.a(true);
            c().add(smash);
            return;
        }
        this.f29972h = true;
        if (d() == 0) {
            strO = "Advanced Loading: Starting to load bidder " + smash.c() + ". No other instances will be loaded at the same time.";
            smash.a(true);
            c().add(smash);
        } else {
            strO = defpackage.e.o("Advanced Loading: Won't start loading bidder ", smash.c(), " as a non bidder is being loaded");
        }
        IronLog.INTERNAL.verbose(smash.g().name() + " - " + strO);
        IronSourceUtils.i(strO);
    }

    @Override // com.ironsource.ch
    public boolean e() {
        return super.e() || this.f29972h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0509p3(int i10, boolean z10, List<? extends Smash> waterfall, boolean z11) {
        super(i10, z10, waterfall);
        kotlin.jvm.internal.n.f(waterfall, "waterfall");
        this.f29972h = z11;
    }
}
