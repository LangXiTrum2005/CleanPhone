package com.facebook.internal.instrument.crashshield;

import com.facebook.FacebookSdk;
import com.facebook.UserSettingsManager;
import com.facebook.internal.instrument.ExceptionAnalyzer;
import com.facebook.internal.instrument.InstrumentData;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/instrument/crashshield/CrashShieldHandler;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class CrashShieldHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f16433a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f16434b;

    public static final void a(Object o, Throwable th) {
        Intrinsics.f(o, "o");
        if (f16434b) {
            f16433a.add(o);
            HashSet hashSet = FacebookSdk.f15915a;
            if (UserSettingsManager.c()) {
                ExceptionAnalyzer.a(th);
                InstrumentData.Builder.b(th, InstrumentData.Type.f0).b();
            }
        }
    }

    public static final boolean b(Object o) {
        Intrinsics.f(o, "o");
        return f16433a.contains(o);
    }
}
