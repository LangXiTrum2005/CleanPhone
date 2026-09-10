package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfgf {
    private static final AI zza = zzgch.zzh(null);
    private final zzgcs zzb;
    private final ScheduledExecutorService zzc;
    private final zzfgg zzd;

    public zzfgf(zzgcs zzgcsVar, ScheduledExecutorService scheduledExecutorService, zzfgg zzfggVar) {
        this.zzb = zzgcsVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfggVar;
    }

    public final zzffv zza(Object obj, AI... aiArr) {
        return new zzffv(this, obj, Arrays.asList(aiArr), null);
    }

    public final zzfgd zzb(Object obj, AI ai) {
        return new zzfgd(this, obj, ai, Collections.singletonList(ai), ai);
    }

    public abstract String zzf(Object obj);
}
