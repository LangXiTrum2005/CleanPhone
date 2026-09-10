package com.adjust.sdk.network;

import com.adjust.sdk.ActivityPackage;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IActivityPackageSender.ResponseDataCallbackSubscriber f6887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityPackage f6888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f6889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ActivityPackageSender f6890d;

    public a(ActivityPackageSender activityPackageSender, IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber, ActivityPackage activityPackage, Map map) {
        this.f6890d = activityPackageSender;
        this.f6887a = responseDataCallbackSubscriber;
        this.f6888b = activityPackage;
        this.f6889c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6887a.onResponseDataCallback(this.f6890d.sendActivityPackageSync(this.f6888b, this.f6889c));
    }
}
