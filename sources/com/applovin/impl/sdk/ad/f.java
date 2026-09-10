package com.applovin.impl.sdk.ad;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.MotionEvent;
import com.applovin.impl.da;
import com.applovin.impl.j5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import zc.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements s.a, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f9386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Parcelable f9388c;

    public /* synthetic */ f(Object obj, Parcelable parcelable, boolean z10) {
        this.f9387b = obj;
        this.f9388c = parcelable;
        this.f9386a = z10;
    }

    @Override // s.a
    public Object apply(Object obj) {
        return ((b) this.f9387b).a((MotionEvent) this.f9388c, this.f9386a, (j5) obj);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Integer) task.getResult()).intValue() != 402 ? task : i.a((Context) this.f9387b, (Intent) this.f9388c, this.f9386a).continueWith(new da(1), new xa.b(29));
    }
}
