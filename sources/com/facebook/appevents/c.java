package com.facebook.appevents;

import com.facebook.appevents.suggestedevents.ViewOnClickListener;
import com.mbridge.msdk.config.component.common.util.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10579c;

    public /* synthetic */ c(String str, String str2, int i10) {
        this.f10577a = i10;
        this.f10578b = str;
        this.f10579c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10577a) {
            case 0:
                UserDataStore.writeDataIntoCache$lambda$0(this.f10578b, this.f10579c);
                break;
            case 1:
                com.mbridge.msdk.config.component.common.util.c.a(this.f10578b, this.f10579c);
                break;
            case 2:
                d.b(this.f10578b, this.f10579c);
                break;
            default:
                ViewOnClickListener.Companion.queryHistoryAndProcess$lambda$0(this.f10578b, this.f10579c);
                break;
        }
    }
}
