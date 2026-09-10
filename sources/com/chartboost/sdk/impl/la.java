package com.chartboost.sdk.impl;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class la {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PackageManager f14411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f14412b;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14413b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    public la(PackageManager packageManager, Function0 intentFactory) {
        Intrinsics.f(packageManager, "packageManager");
        Intrinsics.f(intentFactory, "intentFactory");
        this.f14411a = packageManager;
        this.f14412b = intentFactory;
    }

    public final Intent a(String str) {
        Intent intent = (Intent) this.f14412b.invoke();
        intent.addFlags(268435456);
        intent.setData(Uri.parse(str));
        return intent;
    }

    public final boolean b(String str) {
        if (str != null && str.length() != 0) {
            try {
                return !a(a(str)).isEmpty();
            } catch (Exception e2) {
                za.b("Cannot open URL", e2);
            }
        }
        return false;
    }

    public final List a(Intent intent, PackageManager.ResolveInfoFlags resolveInfoFlags) {
        List listQueryIntentActivities = this.f14411a.queryIntentActivities(intent, resolveInfoFlags);
        Intrinsics.e(listQueryIntentActivities, "queryIntentActivities(...)");
        return listQueryIntentActivities;
    }

    public /* synthetic */ la(PackageManager packageManager, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(packageManager, (i2 & 2) != 0 ? a.f14413b : function0);
    }

    public final List a(Intent intent) {
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager.ResolveInfoFlags resolveInfoFlagsOf = PackageManager.ResolveInfoFlags.of(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
            Intrinsics.e(resolveInfoFlagsOf, "of(...)");
            return a(intent, resolveInfoFlagsOf);
        }
        List<ResolveInfo> listQueryIntentActivities = this.f14411a.queryIntentActivities(intent, 65536);
        Intrinsics.c(listQueryIntentActivities);
        return listQueryIntentActivities;
    }
}
