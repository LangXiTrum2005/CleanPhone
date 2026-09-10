package com.ironsource;

import com.ironsource.AbstractC3576j3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3684p3<Smash extends AbstractC3576j3<?>> extends Jg<Smash> {
    private boolean h;

    public /* synthetic */ C3684p3(int i, boolean z, List list, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, list, (i2 & 8) != 0 ? false : z2);
    }

    @Override // com.ironsource.Jg
    public void c(Smash smash) {
        String str;
        Intrinsics.checkNotNullParameter(smash, "smash");
        if (!smash.w()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.c() + " (non-bidder) is ready to load");
            smash.a(true);
            c().add(smash);
            return;
        }
        this.h = true;
        if (d() == 0) {
            str = "Advanced Loading: Starting to load bidder " + smash.c() + ". No other instances will be loaded at the same time.";
            smash.a(true);
            c().add(smash);
        } else {
            str = "Advanced Loading: Won't start loading bidder " + smash.c() + " as a non bidder is being loaded";
        }
        IronLog.INTERNAL.verbose(smash.g().name() + " - " + str);
        IronSourceUtils.i(str);
    }

    @Override // com.ironsource.Jg
    public boolean e() {
        return super.e() || this.h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3684p3(int i, boolean z, List<? extends Smash> waterfall, boolean z2) {
        super(i, z, waterfall);
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        this.h = z2;
    }
}
