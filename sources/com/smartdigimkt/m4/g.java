package com.smartdigimkt.m4;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f[] f36687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36688c;

    public g(f... fVarArr) {
        this.f36687b = fVarArr;
        this.f36686a = fVarArr.length;
    }

    public f a(int i2) {
        return this.f36687b[i2];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f36687b, ((g) obj).f36687b);
    }

    public int hashCode() {
        if (this.f36688c == 0) {
            this.f36688c = Arrays.hashCode(this.f36687b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f36688c;
    }

    public f[] a() {
        return (f[]) this.f36687b.clone();
    }
}
