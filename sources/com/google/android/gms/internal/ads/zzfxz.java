package com.google.android.gms.internal.ads;

import androidx.datastore.core.Serializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfxz implements Serializer {
    public static final zzfxz zza = new zzfxz();
    private static final zzfxw zzb;

    static {
        zzfxw zzfxwVarZzd = zzfxw.zzd();
        Intrinsics.e(zzfxwVarZzd, "getDefaultInstance(...)");
        zzb = zzfxwVarZzd;
    }

    private zzfxz() {
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, Continuation continuation) {
        try {
            zzfxw zzfxwVarZzc = zzfxw.zzc(inputStream);
            Intrinsics.c(zzfxwVarZzc);
            return zzfxwVarZzc;
        } catch (Exception unused) {
            return zzb;
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) throws IOException {
        ((zzfxw) obj).zzaO(outputStream);
        return Unit.f43263a;
    }
}
