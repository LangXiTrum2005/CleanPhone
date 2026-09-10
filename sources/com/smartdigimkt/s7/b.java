package com.smartdigimkt.s7;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes6.dex */
public class b implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38215b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<String> f38214a = new CopyOnWriteArraySet();

    @Override // com.smartdigimkt.s7.a
    public void a(String... strArr) {
        for (String str : strArr) {
            this.f38214a.remove(str);
        }
    }

    @Override // com.smartdigimkt.s7.a
    public void b(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        Collections.addAll(this.f38214a, strArr);
    }

    @Override // com.smartdigimkt.s7.a
    public boolean e() {
        return this.f38215b;
    }

    @Override // com.smartdigimkt.s7.a
    public boolean a(String str) {
        return this.f38214a.contains(str);
    }

    @Override // com.smartdigimkt.s7.a
    public void a(boolean z2) {
        this.f38215b = z2;
    }
}
