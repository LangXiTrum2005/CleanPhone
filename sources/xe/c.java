package xe;

import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TestSuiteActivity f53771b;

    public /* synthetic */ c(TestSuiteActivity testSuiteActivity, int i10) {
        this.f53770a = i10;
        this.f53771b = testSuiteActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f53770a;
        TestSuiteActivity testSuiteActivity = this.f53771b;
        switch (i10) {
            case 0:
                TestSuiteActivity.a(testSuiteActivity);
                break;
            default:
                TestSuiteActivity.b(testSuiteActivity);
                break;
        }
    }
}
