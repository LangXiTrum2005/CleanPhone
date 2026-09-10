package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6877c;

    public /* synthetic */ l0(String str, String str2, int i10) {
        this.f6875a = i10;
        this.f6876b = str;
        this.f6877c = str2;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f6875a) {
            case 0:
                activityHandler.addGlobalCallbackParameterI(this.f6876b, this.f6877c);
                break;
            default:
                activityHandler.addGlobalPartnerParameterI(this.f6876b, this.f6877c);
                break;
        }
    }
}
