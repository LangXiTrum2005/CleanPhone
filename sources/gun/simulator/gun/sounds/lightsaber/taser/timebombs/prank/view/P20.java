package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public final class P20 implements InterfaceC3069bH, Serializable {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(P20.class, Object.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile InterfaceC2714Qw f3532a;
    public volatile Object b;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH
    public final Object getValue() {
        Object obj = this.b;
        G7 g7 = G7.j;
        if (obj != g7) {
            return obj;
        }
        InterfaceC2714Qw interfaceC2714Qw = this.f3532a;
        if (interfaceC2714Qw != null) {
            Object objInvoke = interfaceC2714Qw.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, g7, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != g7) {
                }
            }
            this.f3532a = null;
            return objInvoke;
        }
        return this.b;
    }

    public final String toString() {
        return this.b != G7.j ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
