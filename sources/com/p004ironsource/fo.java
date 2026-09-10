package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.sdk.controller.f;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\t\b\u0010¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ironsource/fo;", "Lcom/ironsource/e1;", "Ljava/util/UUID;", f.b.AD_ID, "", "adUnitId", "Lcom/ironsource/mediationsdk/model/Placement;", "placement", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/ironsource/mediationsdk/model/Placement;)V", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class fo extends e1 {
    public fo() {
        this(tf.f27296a.a(), "", null, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo(UUID adId, String adUnitId, Placement placement) {
        super(IronSource.AD_UNIT.NATIVE_AD, adId, adUnitId, placement, null, null, 48, null);
        Intrinsics.f(adId, "adId");
        Intrinsics.f(adUnitId, "adUnitId");
    }

    public /* synthetic */ fo(UUID uuid, String str, Placement placement, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, (i2 & 4) != 0 ? null : placement);
    }
}
