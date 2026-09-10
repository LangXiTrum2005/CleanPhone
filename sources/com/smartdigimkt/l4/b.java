package com.smartdigimkt.l4;

import android.util.Log;
import com.smartdigimkt.b4.m;
import com.smartdigimkt.j4.x;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements d.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f36337c = "BaseMediaChunkOutput";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f36338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x[] f36339b;

    public b(int[] iArr, x[] xVarArr) {
        this.f36338a = iArr;
        this.f36339b = xVarArr;
    }

    @Override // com.smartdigimkt.l4.d.b
    public m a(int i2, int i3) {
        int i4 = 0;
        while (true) {
            int[] iArr = this.f36338a;
            if (i4 >= iArr.length) {
                Log.e(f36337c, "Unmatched track of type: " + i3);
                return new com.smartdigimkt.b4.d();
            }
            if (i3 == iArr[i4]) {
                return this.f36339b[i4];
            }
            i4++;
        }
    }

    public int[] a() {
        int[] iArr = new int[this.f36339b.length];
        int i2 = 0;
        while (true) {
            x[] xVarArr = this.f36339b;
            if (i2 >= xVarArr.length) {
                return iArr;
            }
            x xVar = xVarArr[i2];
            if (xVar != null) {
                iArr[i2] = xVar.i();
            }
            i2++;
        }
    }

    public void a(long j) {
        for (x xVar : this.f36339b) {
            if (xVar != null) {
                xVar.c(j);
            }
        }
    }
}
