package saneness;

import ads_mobile_sdk.f83;
import ads_mobile_sdk.j;
import ads_mobile_sdk.vm0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class iconoclasm extends vm0 {
    public iconoclasm() {
        super(f83.DEFAULT_INSTANCE);
    }

    public final void attabal(long j) {
        b();
        ((f83) this.b).maxTimePerTaskInUiThreadMs_ = j;
    }

    public final List beachfront() {
        return Collections.unmodifiableList(((f83) this.b).nonUiThreadBlockingStartupLocations_);
    }

    public final List competently() {
        return Collections.unmodifiableList(((f83) this.b).uiThreadBlockingStartupLocations_);
    }

    public final void dern(ArrayList arrayList) {
        b();
        f83 f83Var = (f83) this.b;
        prescient prescientVar = f83Var.nonUiThreadBlockingStartupLocations_;
        if (!((j) prescientVar).a) {
            f83Var.nonUiThreadBlockingStartupLocations_ = listeriosis.attabal(prescientVar, 2);
        }
        lamplit.a(arrayList, f83Var.nonUiThreadBlockingStartupLocations_);
    }

    public final void marial(ArrayList arrayList) {
        b();
        f83 f83Var = (f83) this.b;
        prescient prescientVar = f83Var.uiThreadBlockingStartupLocations_;
        if (!((j) prescientVar).a) {
            f83Var.uiThreadBlockingStartupLocations_ = listeriosis.attabal(prescientVar, 2);
        }
        lamplit.a(arrayList, f83Var.uiThreadBlockingStartupLocations_);
    }

    public final void wireman(long j) {
        b();
        ((f83) this.b).totalTimeInUiThreadMs_ = j;
    }
}
