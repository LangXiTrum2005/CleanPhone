package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.jb;
import com.google.android.gms.internal.ads.kb;
import com.google.android.gms.internal.ads.va;
import com.google.android.gms.internal.ads.vb;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzbh extends vb {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ byte[] f11078o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Map f11079p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzl f11080q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbh(zzbl zzblVar, int i10, String str, kb kbVar, jb jbVar, byte[] bArr, Map map, com.google.android.gms.ads.internal.util.client.zzl zzlVar) {
        super(i10, str, kbVar, jbVar);
        this.f11078o = bArr;
        this.f11079p = map;
        this.f11080q = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final void d(Object obj) {
        kb kbVar;
        String str = (String) obj;
        this.f11080q.zze(str);
        synchronized (this.f21144m) {
            kbVar = this.f21145n;
        }
        kbVar.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final Map zzm() throws va {
        Map map = this.f11079p;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final byte[] zzn() throws va {
        byte[] bArr = this.f11078o;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}
