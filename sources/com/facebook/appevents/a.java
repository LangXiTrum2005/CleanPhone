package com.facebook.appevents;

import com.facebook.appevents.codeless.CodelessManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10571b;

    public /* synthetic */ a(String str, int i10) {
        this.f10570a = i10;
        this.f10571b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f10570a;
        String str = this.f10571b;
        switch (i10) {
            case 0:
                AnalyticsUserIDStore.setUserID$lambda$1(str);
                break;
            case 1:
                CodelessManager.checkCodelessSession$lambda$1(str);
                break;
            default:
                com.mbridge.msdk.config.component.common.file.a.k(str);
                break;
        }
    }
}
