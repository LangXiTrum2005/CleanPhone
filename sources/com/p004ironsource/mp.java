package com.p004ironsource;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/ironsource/mp;", "Lcom/ironsource/lp;", "Lcom/ironsource/a6;", "loadListener", "", "a", "Lcom/ironsource/c6;", "showListener", "onBannerInitSuccess", "", "description", "onBannerInitFailed", "onBannerClick", "Lcom/ironsource/zj;", d9.h.p0, "Lcom/ironsource/dh;", "adContainer", "onBannerLoadSuccess", "onBannerLoadFail", "onBannerShowSuccess", "Lcom/ironsource/a6;", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class mp implements lp {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private a6 loadListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private WeakReference<c6> showListener = new WeakReference<>(null);

    public final void a(a6 loadListener) {
        Intrinsics.f(loadListener, "loadListener");
        this.loadListener = loadListener;
    }

    @Override // com.p004ironsource.lp
    public void onBannerClick() {
        c6 c6Var = this.showListener.get();
        if (c6Var != null) {
            c6Var.onBannerClick();
        }
    }

    @Override // com.p004ironsource.lp
    public void onBannerInitFailed(String description) {
    }

    @Override // com.p004ironsource.lp
    public void onBannerInitSuccess() {
    }

    @Override // com.p004ironsource.lp
    public void onBannerLoadFail(String description) {
        Intrinsics.f(description, "description");
        a6 a6Var = this.loadListener;
        if (a6Var != null) {
            a6Var.onBannerLoadFail(description);
        }
    }

    @Override // com.p004ironsource.lp
    public void onBannerLoadSuccess(zj adInstance, dh adContainer) {
        Intrinsics.f(adInstance, "adInstance");
        Intrinsics.f(adContainer, "adContainer");
        a6 a6Var = this.loadListener;
        if (a6Var != null) {
            a6Var.onBannerLoadSuccess(adInstance, adContainer);
        }
    }

    @Override // com.p004ironsource.lp
    public void onBannerShowSuccess() {
        c6 c6Var = this.showListener.get();
        if (c6Var != null) {
            c6Var.onBannerShowSuccess();
        }
    }

    public final void a(c6 showListener) {
        Intrinsics.f(showListener, "showListener");
        this.showListener = new WeakReference<>(showListener);
    }
}
