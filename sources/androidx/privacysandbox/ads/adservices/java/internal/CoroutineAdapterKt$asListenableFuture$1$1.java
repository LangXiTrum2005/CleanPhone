package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3732io;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class CoroutineAdapterKt$asListenableFuture$1$1 extends WG implements InterfaceC2766Sw {
    final /* synthetic */ CallbackToFutureAdapter.Completer<T> $completer;
    final /* synthetic */ InterfaceC3732io $this_asListenableFuture;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineAdapterKt$asListenableFuture$1$1(CallbackToFutureAdapter.Completer<T> completer, InterfaceC3732io interfaceC3732io) {
        super(1);
        this.$completer = completer;
        this.$this_asListenableFuture = interfaceC3732io;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C5033xf0.f5238a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void invoke(Throwable th) {
        if (th == null) {
            this.$completer.set((T) this.$this_asListenableFuture.h());
        } else if (th instanceof CancellationException) {
            this.$completer.setCancelled();
        } else {
            this.$completer.setException(th);
        }
    }
}
