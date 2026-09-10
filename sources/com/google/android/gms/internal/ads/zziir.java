package com.google.android.gms.internal.ads;

import com.p004ironsource.d9;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public class zziir implements Iterator, Closeable, zzasw {
    private static final zzasv zza = new zziiq("eof ");
    protected zzass zzb;
    protected zziis zzc;
    zzasv zzd = null;
    long zze = 0;
    long zzf = 0;
    private final List zzg = new ArrayList();

    static {
        zziiy.zzb(zziir.class);
    }

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzasv zzasvVar = this.zzd;
        if (zzasvVar == zza) {
            return false;
        }
        if (zzasvVar != null) {
            return true;
        }
        try {
            this.zzd = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzd = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(d9.i.d);
        int i2 = 0;
        while (true) {
            List list = this.zzg;
            if (i2 >= list.size()) {
                sb.append(d9.i.f24752e);
                return sb.toString();
            }
            if (i2 > 0) {
                sb.append(";");
            }
            sb.append(((zzasv) list.get(i2)).toString());
            i2++;
        }
    }

    public final List zzc() {
        return (this.zzc == null || this.zzd == zza) ? this.zzg : new zziix(this.zzg, this);
    }

    public final void zzd(zziis zziisVar, long j, zzass zzassVar) throws IOException {
        this.zzc = zziisVar;
        this.zze = zziisVar.zzc();
        zziisVar.zzd(zziisVar.zzc() + j);
        this.zzf = zziisVar.zzc();
        this.zzb = zzassVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzasv next() {
        zzasv zzasvVarZzb;
        zzasv zzasvVar = this.zzd;
        if (zzasvVar != null && zzasvVar != zza) {
            this.zzd = null;
            return zzasvVar;
        }
        zziis zziisVar = this.zzc;
        if (zziisVar == null || this.zze >= this.zzf) {
            this.zzd = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zziisVar) {
                this.zzc.zzd(this.zze);
                zzasvVarZzb = this.zzb.zzb(this.zzc, this);
                this.zze = this.zzc.zzc();
            }
            return zzasvVarZzb;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }
}
