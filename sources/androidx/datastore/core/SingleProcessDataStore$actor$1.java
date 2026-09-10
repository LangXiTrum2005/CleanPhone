package androidx.datastore.core;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class SingleProcessDataStore$actor$1 extends WG implements InterfaceC2766Sw {
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$actor$1(SingleProcessDataStore<T> singleProcessDataStore) {
        super(1);
        this.this$0 = singleProcessDataStore;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        invoke((Throwable) obj);
        return C5033xf0.f5238a;
    }

    public final void invoke(Throwable th) throws IllegalAccessException, InvocationTargetException {
        if (th != null) {
            ((C4907w90) ((SingleProcessDataStore) this.this$0).downstreamFlow).i(new Final(th));
        }
        SingleProcessDataStore.Companion companion = SingleProcessDataStore.Companion;
        Object activeFilesLock$datastore_core = companion.getActiveFilesLock$datastore_core();
        SingleProcessDataStore<T> singleProcessDataStore = this.this$0;
        synchronized (activeFilesLock$datastore_core) {
            companion.getActiveFiles$datastore_core().remove(singleProcessDataStore.getFile().getAbsolutePath());
        }
    }
}
