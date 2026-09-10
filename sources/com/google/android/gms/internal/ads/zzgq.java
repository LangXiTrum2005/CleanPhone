package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgq {
    private final zzgp zza;
    private final ArrayDeque zzb = new ArrayDeque();
    private final ArrayDeque zzc = new ArrayDeque();
    private final PriorityQueue zzd = new PriorityQueue();
    private int zze = -1;
    private zzgo zzf;

    public zzgq(zzgp zzgpVar) {
        this.zza = zzgpVar;
    }

    private final void zzf(int i2) {
        List list;
        while (true) {
            PriorityQueue priorityQueue = this.zzd;
            if (priorityQueue.size() <= i2) {
                return;
            }
            zzgo zzgoVar = (zzgo) priorityQueue.poll();
            String str = zzfj.zza;
            int i3 = 0;
            while (true) {
                list = zzgoVar.zza;
                if (i3 >= list.size()) {
                    break;
                }
                this.zza.zza(zzgoVar.zzb, (zzer) list.get(i3));
                this.zzb.push((zzer) list.get(i3));
                i3++;
            }
            list.clear();
            zzgo zzgoVar2 = this.zzf;
            if (zzgoVar2 != null && zzgoVar2.zzb == zzgoVar.zzb) {
                this.zzf = null;
            }
            this.zzc.push(zzgoVar);
        }
    }

    public final void zza(int i2) {
        zzgqa.zzi(i2 >= 0);
        this.zze = i2;
        zzf(i2);
    }

    public final int zzb() {
        return this.zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r7 < r0.zzb) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc(long r7, com.google.android.gms.internal.ads.zzer r9) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L9b
            int r0 = r6.zze
            if (r0 == 0) goto L9c
            r1 = -1
            if (r0 == r1) goto L2a
            java.util.PriorityQueue r0 = r6.zzd
            int r2 = r0.size()
            int r3 = r6.zze
            if (r2 < r3) goto L2a
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.zzgo r0 = (com.google.android.gms.internal.ads.zzgo) r0
            java.lang.String r2 = com.google.android.gms.internal.ads.zzfj.zza
            long r2 = r0.zzb
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2a
            goto L9c
        L2a:
            java.util.ArrayDeque r0 = r6.zzb
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L38
            com.google.android.gms.internal.ads.zzer r0 = new com.google.android.gms.internal.ads.zzer
            r0.<init>()
            goto L3e
        L38:
            java.lang.Object r0 = r0.pop()
            com.google.android.gms.internal.ads.zzer r0 = (com.google.android.gms.internal.ads.zzer) r0
        L3e:
            int r2 = r9.zzd()
            r0.zza(r2)
            byte[] r2 = r9.zzi()
            int r9 = r9.zzg()
            byte[] r3 = r0.zzi()
            r4 = 0
            int r5 = r0.zzd()
            java.lang.System.arraycopy(r2, r9, r3, r4, r5)
            com.google.android.gms.internal.ads.zzgo r9 = r6.zzf
            if (r9 == 0) goto L6a
            long r2 = r9.zzb
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L64
            goto L6a
        L64:
            java.util.List r7 = r9.zza
            r7.add(r0)
            return
        L6a:
            java.util.ArrayDeque r9 = r6.zzc
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L78
            com.google.android.gms.internal.ads.zzgo r9 = new com.google.android.gms.internal.ads.zzgo
            r9.<init>()
            goto L7e
        L78:
            java.lang.Object r9 = r9.pop()
            com.google.android.gms.internal.ads.zzgo r9 = (com.google.android.gms.internal.ads.zzgo) r9
        L7e:
            java.util.List r2 = r9.zza
            boolean r3 = r2.isEmpty()
            com.google.android.gms.internal.ads.zzgqa.zzi(r3)
            r9.zzb = r7
            r2.add(r0)
            java.util.PriorityQueue r7 = r6.zzd
            r7.add(r9)
            r6.zzf = r9
            int r7 = r6.zze
            if (r7 == r1) goto L9a
            r6.zzf(r7)
        L9a:
            return
        L9b:
            r7 = r0
        L9c:
            com.google.android.gms.internal.ads.zzgp r0 = r6.zza
            r0.zza(r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgq.zzc(long, com.google.android.gms.internal.ads.zzer):void");
    }

    public final void zzd() {
        this.zzd.clear();
    }

    public final void zze() {
        zzf(0);
    }
}
