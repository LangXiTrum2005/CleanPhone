package com.thinkup.core.common.on;

import androidx.media3.extractor.text.ttml.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class m0 {
    protected o m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f42191n;
    protected List<o> o;

    public final o m() {
        List<o> list = this.o;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (o) a.h(1, this.o);
    }

    public final boolean n() {
        return this.f42191n;
    }

    public final o o() {
        List<o> list = this.o;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.o.get(0);
    }

    public final int o0() {
        List<o> list = this.o;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final List<o0nm.o> om() {
        List<o> list = this.o;
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<o> it = this.o.iterator();
        while (it.hasNext()) {
            o0mm unitGroupInfo = it.next().oo().getUnitGroupInfo();
            arrayList.add(new o0nm.o(unitGroupInfo, unitGroupInfo.n0n()));
        }
        return arrayList;
    }

    public final o oo() {
        return this.m;
    }
}
