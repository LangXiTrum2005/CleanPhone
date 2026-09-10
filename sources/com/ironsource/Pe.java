package com.ironsource;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f27046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27047c;

    public Pe(String str, List<String> list, boolean z10) {
        this.f27045a = str;
        this.f27046b = list;
        this.f27047c = z10;
    }

    public final boolean a() {
        if (this.f27047c) {
            List<String> list = this.f27046b;
            if (list != null && !list.isEmpty()) {
                for (String str : list) {
                    String str2 = this.f27045a;
                    if (str2 != null && an.p.p0(str2, str, false)) {
                        return true;
                    }
                }
            }
            return false;
        }
        List<String> list2 = this.f27046b;
        if (list2 != null && !list2.isEmpty()) {
            for (String str3 : list2) {
                String str4 = this.f27045a;
                if (str4 != null && an.h.q0(str4, str3, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String b() {
        return this.f27045a;
    }

    public /* synthetic */ Pe(String str, List list, boolean z10, int i10, kotlin.jvm.internal.g gVar) {
        this(str, list, (i10 & 4) != 0 ? false : z10);
    }
}
