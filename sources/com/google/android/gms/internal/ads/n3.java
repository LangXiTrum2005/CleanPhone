package com.google.android.gms.internal.ads;

import android.opengl.GLES20;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17625b;

    public n3(int i10) {
        this.f17624a = 2;
        this.f17625b = i10;
    }

    public int a() {
        int i10 = this.f17625b;
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 5) {
            return 11;
        }
        if (i10 == 29) {
            return 12;
        }
        if (i10 == 42) {
            return 16;
        }
        if (i10 != 22) {
            return i10 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public /* synthetic */ n3(int i10, int i11, boolean z10) {
        this.f17624a = i10;
        this.f17625b = i11;
    }

    public n3(li liVar, int i10, int i11) {
        this.f17624a = i10;
        this.f17625b = i11;
    }

    public n3(int i10, int i11, String str) {
        int iGlGetAttribLocation;
        int iC = v0.i.c(i11);
        if (iC == 0) {
            iGlGetAttribLocation = GLES20.glGetAttribLocation(i10, str);
        } else if (iC == 1) {
            iGlGetAttribLocation = GLES20.glGetUniformLocation(i10, str);
        } else {
            throw new aa.b((byte) 0, 20);
        }
        this.f17624a = iGlGetAttribLocation;
        float[] fArr = nf.a.f46733a;
        if (iGlGetAttribLocation >= 0) {
            this.f17625b = iGlGetAttribLocation;
            return;
        }
        String str2 = "Unable to locate " + str + " in program";
        Log.e("Egloo", str2);
        throw new RuntimeException(str2);
    }

    public n3(int i10, int i11) {
        this.f17624a = Math.max(i10, i11);
        this.f17625b = Math.min(i10, i11);
    }
}
