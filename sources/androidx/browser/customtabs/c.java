package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17a;
    public final /* synthetic */ EngagementSignalsCallback b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Bundle d;

    public /* synthetic */ c(EngagementSignalsCallback engagementSignalsCallback, int i, Bundle bundle, int i2) {
        this.f17a = i2;
        this.b = engagementSignalsCallback;
        this.c = i;
        this.d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f17a;
        EngagementSignalsCallback engagementSignalsCallback = this.b;
        Bundle bundle = this.d;
        int i2 = this.c;
        switch (i) {
            case 0:
                CustomTabsSession.AnonymousClass1.lambda$onGreatestScrollPercentageIncreased$1(engagementSignalsCallback, i2, bundle);
                break;
            default:
                CustomTabsSession.AnonymousClass2.lambda$onGreatestScrollPercentageIncreased$1(engagementSignalsCallback, i2, bundle);
                break;
        }
    }
}
