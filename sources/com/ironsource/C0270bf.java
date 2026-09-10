package com.ironsource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.bf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0270bf implements L8, L8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Integer> f28307a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Integer> f28308b = new HashMap();

    @Override // com.ironsource.L8.a
    public void a(List<? extends L8.b> smashes) {
        kotlin.jvm.internal.n.f(smashes, "smashes");
        for (L8.b bVar : smashes) {
            this.f28307a.put(bVar.c(), 0);
            this.f28308b.put(bVar.c(), Integer.valueOf(bVar.b()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @Override // com.ironsource.L8
    public boolean b(L8.b smash) {
        boolean z10;
        kotlin.jvm.internal.n.f(smash, "smash");
        synchronized (this) {
            String strC = smash.c();
            if (this.f28307a.containsKey(strC)) {
                Integer num = this.f28307a.get(strC);
                kotlin.jvm.internal.n.c(num);
                if (num.intValue() >= smash.b()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // com.ironsource.L8.a
    public void a(L8.b smash) {
        kotlin.jvm.internal.n.f(smash, "smash");
        synchronized (this) {
            String strC = smash.c();
            if (this.f28307a.containsKey(strC)) {
                Map<String, Integer> map = this.f28307a;
                Integer num = map.get(strC);
                kotlin.jvm.internal.n.c(num);
                map.put(strC, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    @Override // com.ironsource.L8
    public boolean a() {
        for (String str : this.f28308b.keySet()) {
            Integer num = this.f28307a.get(str);
            kotlin.jvm.internal.n.c(num);
            int iIntValue = num.intValue();
            Integer num2 = this.f28308b.get(str);
            kotlin.jvm.internal.n.c(num2);
            if (iIntValue < num2.intValue()) {
                return false;
            }
        }
        return true;
    }
}
