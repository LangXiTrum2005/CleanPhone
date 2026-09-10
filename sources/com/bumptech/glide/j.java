package com.bumptech.glide;

import a7.p;
import java.util.HashSet;
import java.util.Set;
import t6.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements t6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f10500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f10501b;

    public j(k kVar, l lVar) {
        this.f10501b = kVar;
        this.f10500a = lVar;
    }

    @Override // t6.a
    public final void a(boolean z10) {
        if (z10) {
            synchronized (this.f10501b) {
                l lVar = this.f10500a;
                for (w6.c cVar : p.e((Set) lVar.f50550c)) {
                    if (!cVar.h() && !cVar.g()) {
                        cVar.clear();
                        if (lVar.f50549b) {
                            ((HashSet) lVar.f50551d).add(cVar);
                        } else {
                            cVar.j();
                        }
                    }
                }
            }
        }
    }
}
