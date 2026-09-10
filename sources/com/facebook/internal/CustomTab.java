package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/CustomTab;", "", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public class CustomTab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f16267a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/CustomTab$Companion;", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static Uri a(Bundle bundle, String action) {
            Intrinsics.f(action, "action");
            return Utility.b(bundle, ServerProtocol.a(), FacebookSdk.f() + "/dialog/" + action);
        }
    }

    public CustomTab(String action, Bundle bundle) {
        Intrinsics.f(action, "action");
        this.f16267a = Companion.a(bundle == null ? new Bundle() : bundle, action);
    }

    public static Uri a(Bundle bundle, String str) {
        if (CrashShieldHandler.b(CustomTab.class)) {
            return null;
        }
        try {
            return Companion.a(bundle, str);
        } catch (Throwable th) {
            CrashShieldHandler.a(CustomTab.class, th);
            return null;
        }
    }
}
