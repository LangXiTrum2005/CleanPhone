package saneness;

import ads_mobile_sdk.j;
import ads_mobile_sdk.um;
import ads_mobile_sdk.vm;
import ads_mobile_sdk.vm0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gondola extends vm0 {
    public gondola() {
        super(vm.DEFAULT_INSTANCE);
    }

    public final void attabal(um umVar) {
        b();
        vm vmVar = (vm) this.b;
        vmVar.getClass();
        prescient prescientVar = vmVar.thirdPartySdk_;
        if (!((j) prescientVar).a) {
            vmVar.thirdPartySdk_ = listeriosis.attabal(prescientVar, 2);
        }
        vmVar.thirdPartySdk_.add(umVar);
    }

    public final List dern() {
        return Collections.unmodifiableList(((vm) this.b).thirdPartySdk_);
    }
}
