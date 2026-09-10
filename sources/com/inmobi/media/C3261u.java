package com.inmobi.media;

import com.squareup.picasso.Callback;
import kotlinx.coroutines.kowloon;

/* JADX INFO: renamed from: com.inmobi.media.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3261u implements Callback {
    public final /* synthetic */ C3311w a;
    public final /* synthetic */ kowloon b;

    public C3261u(C3311w c3311w, kowloon kowloonVar) {
        this.a = c3311w;
        this.b = kowloonVar;
    }

    @Override // com.squareup.picasso.Callback
    public final void onError(Exception exc) {
        C3097n9 c3097n9 = this.a.d;
        if (c3097n9 != null) {
            c3097n9.a("AdChoiceViewManager", "onError Called " + exc);
        }
        P4.a(this.b, Boolean.FALSE);
    }

    @Override // com.squareup.picasso.Callback
    public final void onSuccess() {
        C3097n9 c3097n9 = this.a.d;
        if (c3097n9 != null) {
            c3097n9.a("AdChoiceViewManager", "onSuccess Called");
        }
        P4.a(this.b, Boolean.TRUE);
    }
}
