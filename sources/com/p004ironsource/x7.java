package com.p004ironsource;

import com.p004ironsource.mediationsdk.d;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.s7;
import com.smartdigimkt.m3.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B/\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/ironsource/x7;", "Lcom/ironsource/s7;", "Smash", "Lcom/ironsource/rx;", "smash", "", "c", "(Lcom/ironsource/s7;)V", "", "e", h.f36614b, "Z", "isBidderReached", "", "maxSmashesToLoad", d.f25777z, "", d.f25770h, "<init>", "(IZLjava/util/List;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class x7<Smash extends s7<?>> extends rx<Smash> {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isBidderReached;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(int i2, boolean z2, List<? extends Smash> waterfall, boolean z3) {
        super(i2, z2, waterfall);
        Intrinsics.f(waterfall, "waterfall");
        this.isBidderReached = z3;
    }

    @Override // com.p004ironsource.rx
    public void c(Smash smash) {
        String str;
        Intrinsics.f(smash, "smash");
        if (!smash.w()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.c() + " (non-bidder) is ready to load");
            smash.a(true);
            c().add(smash);
            return;
        }
        this.isBidderReached = true;
        if (d() == 0) {
            str = "Advanced Loading: Starting to load bidder " + smash.c() + ". No other instances will be loaded at the same time.";
            smash.a(true);
            c().add(smash);
        } else {
            str = "Advanced Loading: Won't start loading bidder " + smash.c() + " as a non bidder is being loaded";
        }
        IronLog.INTERNAL.verbose(smash.g().name() + " - " + str);
        IronSourceUtils.sendAutomationLog(str);
    }

    @Override // com.p004ironsource.rx
    public boolean e() {
        return super.e() || this.isBidderReached;
    }

    public /* synthetic */ x7(int i2, boolean z2, List list, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, z2, list, (i3 & 8) != 0 ? false : z3);
    }
}
