package com.p004ironsource.mediationsdk;

import android.content.Context;
import com.p004ironsource.h5;
import com.p004ironsource.o5;
import com.p004ironsource.r4;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\u0007\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0007\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ironsource/mediationsdk/f;", "Lcom/ironsource/mediationsdk/g;", "Landroid/content/Context;", "context", "Lcom/ironsource/mediationsdk/i;", "auctionRequestParams", "Lorg/json/JSONObject;", "a", "Lcom/ironsource/r4;", "auctionListener", "Lcom/ironsource/mediationsdk/e$a;", "", "b", "Lcom/ironsource/o5;", "Lcom/ironsource/o5;", "settings", "", "Ljava/lang/String;", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Lcom/ironsource/o5;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o5 settings;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String sessionId;

    public f(o5 settings, String sessionId) {
        Intrinsics.f(settings, "settings");
        Intrinsics.f(sessionId, "sessionId");
        this.settings = settings;
        this.sessionId = sessionId;
    }

    @Override // com.p004ironsource.mediationsdk.g
    public e.a a(Context context, i auctionRequestParams, r4 auctionListener) throws JSONException {
        Intrinsics.f(context, "context");
        Intrinsics.f(auctionRequestParams, "auctionRequestParams");
        Intrinsics.f(auctionListener, "auctionListener");
        JSONObject jSONObjectA = a(context, auctionRequestParams);
        String strA = this.settings.a(auctionRequestParams.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DEMAND_ONLY java.lang.String());
        return auctionRequestParams.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DEMAND_ONLY java.lang.String() ? new h5(auctionListener, new URL(strA), jSONObjectA, auctionRequestParams.getIsEncryptedResponse(), this.settings) : new e.a(auctionListener, new URL(strA), jSONObjectA, auctionRequestParams.getIsEncryptedResponse(), this.settings);
    }

    @Override // com.p004ironsource.mediationsdk.g
    public boolean b() {
        return this.settings.n();
    }

    private final JSONObject a(Context context, i auctionRequestParams) throws JSONException {
        JSONObject jSONObjectA = d.b().a(auctionRequestParams);
        Intrinsics.e(jSONObjectA, "getInstance().enrichToke…low(auctionRequestParams)");
        return jSONObjectA;
    }

    @Override // com.p004ironsource.mediationsdk.g
    public boolean a() {
        return this.settings.g() > 0;
    }
}
