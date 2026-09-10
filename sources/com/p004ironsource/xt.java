package com.p004ironsource;

import com.smartdigimkt.q0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ironsource/xt;", "", "Lcom/ironsource/yt;", "<set-?>", "a", "Lcom/ironsource/yt;", "()Lcom/ironsource/yt;", "historyMode", "Lorg/json/JSONObject;", b.i0, "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class xt {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private yt historyMode;

    public xt(JSONObject config) {
        Intrinsics.f(config, "config");
        this.historyMode = yt.INSTANCE.a(config.optInt(d9.a.t, yt.CurrentlyLoadedAds.getValue()));
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final yt getHistoryMode() {
        return this.historyMode;
    }
}
