package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oa.n1 f24206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oa.n1 f24207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f24208c;

    public zf(oa.n1 n1Var, oa.n1 n1Var2, UUID uuid) {
        this.f24206a = n1Var;
        this.f24207b = n1Var2;
        this.f24208c = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zf)) {
            return false;
        }
        zf zfVar = (zf) obj;
        return this.f24206a.equals(zfVar.f24206a) && this.f24207b.equals(zfVar.f24207b) && this.f24208c.equals(zfVar.f24208c);
    }

    public final int hashCode() {
        return ((this.f24208c.hashCode() ^ ((((this.f24206a.hashCode() ^ 1000003) * 1000003) ^ this.f24207b.hashCode()) * 1000003)) * 1000003) ^ ((int) (-4294967296L));
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.f24206a);
    }
}
