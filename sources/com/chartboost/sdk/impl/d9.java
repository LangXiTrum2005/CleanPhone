package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.Intent;
import com.chartboost.sdk.view.CBImpressionActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13687a;

    public d9(Context context) {
        Intrinsics.f(context, "context");
        this.f13687a = context;
    }

    public final void a(Intent intent) {
        Intrinsics.f(intent, "intent");
        try {
            this.f13687a.startActivity(intent);
        } catch (Exception e2) {
            za.b("Cannot start the activity", e2);
        }
    }

    public final Intent a() {
        Intent intentAddFlags = new Intent(this.f13687a, (Class<?>) CBImpressionActivity.class).putExtra("isChartboost", true).addFlags(268435456);
        Intrinsics.e(intentAddFlags, "addFlags(...)");
        return intentAddFlags;
    }
}
