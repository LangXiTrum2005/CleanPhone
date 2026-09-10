package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class Yo0 {
    public static final HashSet f = new HashSet();
    public static final HashSet g = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4043a;
    public final int b;
    public int c = -1;
    public int d;
    public final int e;

    public Yo0(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("urls can't be empty");
        }
        int size = list.size();
        this.b = size;
        this.f4043a = new ArrayList(size);
        Iterator it = list.iterator();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (it.hasNext()) {
            String str = (String) it.next();
            Xo0 xo0 = new Xo0(str);
            if (f.contains(str)) {
                arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                arrayList2.add(xo0);
            } else if (g.contains(str)) {
                arrayList = arrayList == null ? new ArrayList() : arrayList;
                arrayList.add(xo0);
            } else {
                this.f4043a.add(xo0);
            }
        }
        if (arrayList != null) {
            this.f4043a.addAll(arrayList);
        }
        if (arrayList2 != null) {
            this.f4043a.addAll(arrayList2);
        }
        No0 no0 = AbstractC4648tE.f5026a;
        this.e = this.b >= 2 ? 1 : 2;
    }

    public final Xo0 a() {
        int i = this.d;
        if (i >= this.e) {
            throw new NoSuchElementException();
        }
        int i2 = this.c + 1;
        if (i2 >= this.b - 1) {
            this.c = -1;
            this.d = i + 1;
        } else {
            this.c = i2;
        }
        Xo0 xo0 = (Xo0) this.f4043a.get(i2);
        xo0.getClass();
        return xo0;
    }

    public Yo0(String str) {
        ArrayList arrayList = new ArrayList(1);
        this.f4043a = arrayList;
        arrayList.add(new Xo0(str));
        this.b = 1;
        this.e = 1;
    }
}
