package com.google.ads.mediation.mintegral;

import android.os.Bundle;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FlagValueGetter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\f"}, d2 = {"Lcom/google/ads/mediation/mintegral/FlagValueGetter;", "", "<init>", "()V", "shouldRestrictMultipleAdLoads", "", "getClientSideRestrictMultipleAdLoadsFlagValue", "processMultipleAdLoadsServerParam", "", "serverParams", "Landroid/os/Bundle;", "Companion", "mintegral_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlagValueGetter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String KEY_FLIP_MULTIPLE_AD_LOADS_BEHAVIOR = "enable_multiple_ads_per_unit";

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static boolean f18966attabal;

    /* JADX INFO: compiled from: FlagValueGetter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/google/ads/mediation/mintegral/FlagValueGetter$Companion;", "", "<init>", "()V", "KEY_FLIP_MULTIPLE_AD_LOADS_BEHAVIOR", "", "flipMultipleAdLoadsBehavior", "", "getFlipMultipleAdLoadsBehavior$annotations", "getFlipMultipleAdLoadsBehavior", "()Z", "setFlipMultipleAdLoadsBehavior", "(Z)V", "mintegral_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getFlipMultipleAdLoadsBehavior() {
            return FlagValueGetter.f18966attabal;
        }

        public final void setFlipMultipleAdLoadsBehavior(boolean z) {
            FlagValueGetter.f18966attabal = z;
        }

        public Companion() {
        }

        public static /* synthetic */ void getFlipMultipleAdLoadsBehavior$annotations() {
        }
    }

    public final boolean getClientSideRestrictMultipleAdLoadsFlagValue() {
        try {
            Method declaredMethod = Class.forName("com.google.android.gms.ads.internal.adaptersettings.AdapterSettings").getDeclaredMethod(Constants.GET_INSTANCE, null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            Method declaredMethod2 = objInvoke.getClass().getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            declaredMethod2.setAccessible(true);
            Object objInvoke2 = declaredMethod2.invoke(objInvoke, "adapter:mintegral_android_restrict_multiple_ads", Boolean.FALSE);
            Intrinsics.competently(objInvoke2, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) objInvoke2).booleanValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
            return false;
        }
    }

    public final void processMultipleAdLoadsServerParam(Bundle serverParams) {
        Intrinsics.checkNotNullParameter(serverParams, "serverParams");
        if (serverParams.containsKey(KEY_FLIP_MULTIPLE_AD_LOADS_BEHAVIOR) && Intrinsics.wireman(serverParams.getString(KEY_FLIP_MULTIPLE_AD_LOADS_BEHAVIOR), a.g)) {
            f18966attabal = true;
        }
    }

    public final boolean shouldRestrictMultipleAdLoads() {
        return getClientSideRestrictMultipleAdLoadsFlagValue() || f18966attabal;
    }
}
