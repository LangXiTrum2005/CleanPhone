package androidx.datastore.core;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class SingleProcessDataStore$file$2 extends WG implements InterfaceC2714Qw {
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$file$2(SingleProcessDataStore<T> singleProcessDataStore) {
        super(0);
        this.this$0 = singleProcessDataStore;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final File invoke() {
        File file = (File) ((SingleProcessDataStore) this.this$0).produceFile.invoke();
        String absolutePath = file.getAbsolutePath();
        SingleProcessDataStore.Companion companion = SingleProcessDataStore.Companion;
        synchronized (companion.getActiveFilesLock$datastore_core()) {
            if (!(!companion.getActiveFiles$datastore_core().contains(absolutePath))) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            Set<String> activeFiles$datastore_core = companion.getActiveFiles$datastore_core();
            AbstractC2995aW.p(absolutePath, "it");
            activeFiles$datastore_core.add(absolutePath);
        }
        return file;
    }
}
