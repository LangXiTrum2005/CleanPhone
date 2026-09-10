package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6883b;

    public /* synthetic */ m0(Object obj, int i10) {
        this.f6882a = i10;
        this.f6883b = obj;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f6882a) {
            case 0:
                activityHandler.removeGlobalCallbackParameterI((String) this.f6883b);
                break;
            case 1:
                activityHandler.removeGlobalPartnerParameterI((String) this.f6883b);
                break;
            default:
                activityHandler.lambda$setEnabled$5(((ActivityHandler) this.f6883b).adjustConfig.startEnabled.booleanValue());
                break;
        }
    }
}
