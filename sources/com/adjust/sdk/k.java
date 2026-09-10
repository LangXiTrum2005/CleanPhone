package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6868c;

    public /* synthetic */ k(String str, String str2, int i10) {
        this.f6866a = i10;
        this.f6867b = str;
        this.f6868c = str2;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f6866a) {
            case 0:
                activityHandler.addGlobalPartnerParameterI(this.f6867b, this.f6868c);
                break;
            default:
                activityHandler.addGlobalCallbackParameterI(this.f6867b, this.f6868c);
                break;
        }
    }
}
