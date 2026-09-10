package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.GeneratedMessageLite;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKErrorBatch;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.v30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4807v30 extends GeneratedMessageLite.Builder implements InterfaceC4895w30 {
    public /* synthetic */ C4807v30(com.vungle.ads.internal.protos.a aVar) {
        this();
    }

    public C4807v30 addAllErrors(Iterable<? extends Sdk$SDKError> iterable) {
        copyOnWrite();
        ((Sdk$SDKErrorBatch) this.instance).addAllErrors(iterable);
        return this;
    }

    public C4807v30 addErrors(Sdk$SDKError sdk$SDKError) {
        copyOnWrite();
        ((Sdk$SDKErrorBatch) this.instance).addErrors(sdk$SDKError);
        return this;
    }

    public C4807v30 clearErrors() {
        copyOnWrite();
        ((Sdk$SDKErrorBatch) this.instance).clearErrors();
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4895w30
    public Sdk$SDKError getErrors(int i) {
        return ((Sdk$SDKErrorBatch) this.instance).getErrors(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4895w30
    public int getErrorsCount() {
        return ((Sdk$SDKErrorBatch) this.instance).getErrorsCount();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4895w30
    public List<Sdk$SDKError> getErrorsList() {
        return Collections.unmodifiableList(((Sdk$SDKErrorBatch) this.instance).getErrorsList());
    }

    public C4807v30 removeErrors(int i) {
        copyOnWrite();
        ((Sdk$SDKErrorBatch) this.instance).removeErrors(i);
        return this;
    }

    public C4807v30 setErrors(int i, Sdk$SDKError sdk$SDKError) {
        copyOnWrite();
        ((Sdk$SDKErrorBatch) this.instance).setErrors(i, sdk$SDKError);
        return this;
    }

    private C4807v30() {
        super(Sdk$SDKErrorBatch.DEFAULT_INSTANCE);
    }

    public C4807v30 addErrors(int i, Sdk$SDKError sdk$SDKError) {
        copyOnWrite();
        ((Sdk$SDKErrorBatch) this.instance).addErrors(i, sdk$SDKError);
        return this;
    }

    public C4807v30 setErrors(int i, C4455r30 c4455r30) {
        copyOnWrite();
        ((Sdk$SDKErrorBatch) this.instance).setErrors(i, (Sdk$SDKError) c4455r30.build());
        return this;
    }

    public C4807v30 addErrors(C4455r30 c4455r30) {
        copyOnWrite();
        ((Sdk$SDKErrorBatch) this.instance).addErrors((Sdk$SDKError) c4455r30.build());
        return this;
    }

    public C4807v30 addErrors(int i, C4455r30 c4455r30) {
        copyOnWrite();
        ((Sdk$SDKErrorBatch) this.instance).addErrors(i, (Sdk$SDKError) c4455r30.build());
        return this;
    }
}
