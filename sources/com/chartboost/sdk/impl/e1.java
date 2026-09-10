package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13725a;

    public e1(Context context) {
        Intrinsics.f(context, "context");
        this.f13725a = context;
    }

    public final boolean a() {
        try {
            DataUseConsent dataUseConsent = Chartboost.getDataUseConsent(this.f13725a, "coppa");
            Object consent = dataUseConsent != null ? dataUseConsent.getConsent() : null;
            Boolean bool = consent instanceof Boolean ? (Boolean) consent : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
