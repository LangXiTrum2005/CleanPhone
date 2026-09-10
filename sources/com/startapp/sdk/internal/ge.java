package com.startapp.sdk.internal;

import com.startapp.sdk.jobs.JobRequest$Network;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class ge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f41011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f41012b = UUID.randomUUID();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JobRequest$Network f41013c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f41014e;

    public ge(fe feVar) {
        this.f41011a = feVar.f40970a;
        this.f41013c = feVar.f40971b;
        this.d = feVar.f40972c;
        this.f41014e = feVar.d;
    }

    public static int a(Class... clsArr) {
        if (clsArr.length == 0) {
            return 0;
        }
        String[] strArr = new String[clsArr.length];
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            strArr[i2] = clsArr[i2].getName();
        }
        return Math.abs(Arrays.hashCode(strArr));
    }
}
