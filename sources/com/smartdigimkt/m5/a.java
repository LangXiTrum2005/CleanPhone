package com.smartdigimkt.m5;

import android.view.View;
import com.smartdigimkt.n5.c;
import com.smartdigimkt.n5.d;
import com.smartdigimkt.n5.e;
import com.smartdigimkt.n5.f;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f36693a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36694b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36695c = 3;
    public static final int d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f36696e = 5;

    public static b a(int i2, View view) {
        if (i2 == 2) {
            return new f(view);
        }
        if (i2 == 3) {
            return new d(view);
        }
        if (i2 != 4) {
            return i2 != 5 ? new e(view) : new com.smartdigimkt.n5.b(view);
        }
        return new c(view);
    }
}
