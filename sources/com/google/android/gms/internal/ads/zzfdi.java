package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfdi {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgcs zzc;

    public zzfdi(Callable callable, zzgcs zzgcsVar) {
        this.zzb = callable;
        this.zzc = zzgcsVar;
    }

    @Nullable
    public final synchronized AI zza() {
        zzc(1);
        return (AI) this.zza.poll();
    }

    public final synchronized void zzb(AI ai) {
        this.zza.addFirst(ai);
    }

    public final synchronized void zzc(int i) {
        int size = i - this.zza.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}
