package com.startapp.sdk.adsbase;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.a2;
import com.startapp.sdk.internal.b2;
import com.startapp.sdk.internal.lb;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ad f40651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f40652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f40653c;
    public final AdEventListener d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f40654e;

    public d(Ad ad, lb networkApiExecutor, Context context, AdEventListener adEventListener, String admParam) {
        Intrinsics.f(networkApiExecutor, "networkApiExecutor");
        Intrinsics.f(context, "context");
        Intrinsics.f(admParam, "admParam");
        this.f40651a = ad;
        this.f40652b = networkApiExecutor;
        this.f40653c = context;
        this.d = adEventListener;
        this.f40654e = a2.a(admParam);
    }

    public abstract Object a(String str);

    @Override // com.startapp.sdk.internal.b2
    public final void a() {
        ((Executor) this.f40652b.a()).execute(new c0.a(this, 29));
    }

    public static final void a(d this$0) {
        Intrinsics.f(this$0, "this$0");
        if (this$0.a(this$0.f40654e) == null) {
            a0.a(this$0.f40653c, this$0.d, this$0.f40651a, false);
            return;
        }
        Ad ad = this$0.f40651a;
        if (ad != null) {
            ad.setState(Ad.AdState.READY);
        }
        a0.b(this$0.f40653c, this$0.d, this$0.f40651a, false);
    }
}
