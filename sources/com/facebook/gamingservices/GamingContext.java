package com.facebook.gamingservices;

import android.support.v4.media.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/gamingservices/GamingContext;", "", "Companion", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GamingContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16244a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/gamingservices/GamingContext$Companion;", "", "", "DEFAULT_TIMEOUT", "I", "Lcom/facebook/gamingservices/GamingContext;", "currentContext", "Lcom/facebook/gamingservices/GamingContext;", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    public GamingContext(String contextID) {
        Intrinsics.f(contextID, "contextID");
        this.f16244a = contextID;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof GamingContext) && Intrinsics.a(this.f16244a, ((GamingContext) obj).f16244a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f16244a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return a.r(new StringBuilder("GamingContext(contextID="), this.f16244a, ")");
    }
}
