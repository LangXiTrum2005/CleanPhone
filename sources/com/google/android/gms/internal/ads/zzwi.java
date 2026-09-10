package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface zzwi {
    default void zzA(zzak zzakVar) {
    }

    void zzD(zzwe zzweVar);

    zzwe zzG(zzwg zzwgVar, zzaah zzaahVar, long j);

    default zzbf zzH() {
        return null;
    }

    default boolean zzI() {
        return true;
    }

    zzak zzJ();

    void zzl(Handler handler, zzwr zzwrVar);

    void zzm(zzwr zzwrVar);

    void zzn(Handler handler, zztg zztgVar);

    void zzo(zztg zztgVar);

    void zzp(zzwh zzwhVar, zzhz zzhzVar, zzpn zzpnVar);

    void zzq(zzwh zzwhVar);

    void zzr(zzwh zzwhVar);

    void zzs(zzwh zzwhVar);

    void zzt() throws IOException;
}
