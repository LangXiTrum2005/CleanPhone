package com.google.android.gms.internal.ads;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbdp {
    private final int zza;
    private final zzbdm zzb = new zzbdr();

    public zzbdp(int i2) {
        this.zza = i2;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(((String) arrayList.get(i2)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split(IOUtils.LINE_SEPARATOR_UNIX);
        if (strArrSplit.length == 0) {
            return "";
        }
        zzbdo zzbdoVar = new zzbdo();
        int i3 = this.zza;
        PriorityQueue priorityQueue = new PriorityQueue(i3, new zzbdn(this));
        for (String str : strArrSplit) {
            String[] strArrZzb = zzbdq.zzb(str, false);
            if (strArrZzb.length != 0) {
                zzbdt.zza(strArrZzb, i3, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbdoVar.zzb.write(this.zzb.zza(((zzbds) it.next()).zzb));
            } catch (IOException e2) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while writing hash to byteStream", e2);
            }
        }
        return zzbdoVar.toString();
    }
}
