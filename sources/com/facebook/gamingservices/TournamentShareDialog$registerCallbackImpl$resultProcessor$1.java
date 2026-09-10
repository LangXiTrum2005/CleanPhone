package com.facebook.gamingservices;

import android.os.Bundle;
import com.facebook.internal.AppCall;
import com.facebook.share.internal.ResultProcessor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/facebook/gamingservices/TournamentShareDialog$registerCallbackImpl$resultProcessor$1", "Lcom/facebook/share/internal/ResultProcessor;", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
public final class TournamentShareDialog$registerCallbackImpl$resultProcessor$1 extends ResultProcessor {
    @Override // com.facebook.share.internal.ResultProcessor
    public final void c(AppCall appCall, Bundle results) {
        Intrinsics.f(results, "results");
        int i2 = TournamentShareDialog.g;
        results.getString("request");
        throw null;
    }
}
