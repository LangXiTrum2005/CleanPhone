package vk;

import il.y;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import xj.o;
import yl.b;
import yl.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f52620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f52621b;

    static {
        List listQ = o.Q(y.f43120a, y.f43127h, y.f43128i, y.f43122c, y.f43123d, y.f43125f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(b.j((c) it.next()));
        }
        f52620a = linkedHashSet;
        f52621b = b.j(y.f43126g);
    }
}
