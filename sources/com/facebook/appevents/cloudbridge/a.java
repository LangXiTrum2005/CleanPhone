package com.facebook.appevents.cloudbridge;

import com.facebook.appevents.codeless.ViewIndexer;
import l7.e0;
import l7.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10580a;

    public /* synthetic */ a(int i10) {
        this.f10580a = i10;
    }

    @Override // l7.w
    public final void a(e0 e0Var) {
        switch (this.f10580a) {
            case 0:
                AppEventsCAPIManager.enable$lambda$0(e0Var);
                break;
            case 1:
                ViewIndexer.Companion.buildAppIndexingRequest$lambda$0(e0Var);
                break;
        }
    }

    private final void b(e0 e0Var) {
    }
}
