package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class av0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12529c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f12527a = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nv0 f12530d = new nv0(0);

    public av0(int i10, int i11) {
        this.f12528b = i10;
        this.f12529c = i11;
    }

    public final void a() {
        while (true) {
            LinkedList linkedList = this.f12527a;
            if (linkedList.isEmpty()) {
                return;
            }
            fv0 fv0Var = (fv0) linkedList.getFirst();
            ((p9.b) zzt.zzk()).getClass();
            if (System.currentTimeMillis() - fv0Var.f14570d < this.f12529c) {
                return;
            }
            nv0 nv0Var = this.f12530d;
            nv0Var.f18003e++;
            ((mv0) nv0Var.f18004f).f17553b++;
            linkedList.remove();
        }
    }
}
