package com.google.android.gms.common.stats;

import android.support.v4.media.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    public interface Types {
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    public final String toString() {
        long jZza = zza();
        int iZzb = zzb();
        String strZzc = zzc();
        int length = String.valueOf(jZza).length();
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(iZzb).length() + 3 + strZzc.length());
        sb.append(jZza);
        sb.append("\t");
        sb.append(iZzb);
        return a.r(sb, "\t-1", strZzc);
    }

    public abstract long zza();

    public abstract int zzb();

    public abstract String zzc();
}
