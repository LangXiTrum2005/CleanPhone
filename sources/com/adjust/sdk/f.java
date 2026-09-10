package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6839b;

    public /* synthetic */ f(String str, int i10) {
        this.f6838a = i10;
        this.f6839b = str;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        int i10 = this.f6838a;
        String str = this.f6839b;
        switch (i10) {
            case 0:
                activityHandler.removeGlobalPartnerParameterI(str);
                break;
            default:
                activityHandler.removeGlobalCallbackParameterI(str);
                break;
        }
    }
}
