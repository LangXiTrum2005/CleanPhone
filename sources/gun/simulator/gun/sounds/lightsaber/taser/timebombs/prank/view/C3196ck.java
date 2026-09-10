package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3196ck implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4240a = new Object();
    public final HashMap b = new HashMap();
    public Set c = Collections.emptySet();
    public List d = Collections.emptyList();

    public final int a(Object obj) {
        int iIntValue;
        synchronized (this.f4240a) {
            try {
                iIntValue = this.b.containsKey(obj) ? ((Integer) this.b.get(obj)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public final void b(Object obj) {
        synchronized (this.f4240a) {
            try {
                Integer num = (Integer) this.b.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.remove(obj);
                this.d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.b.remove(obj);
                    HashSet hashSet = new HashSet(this.c);
                    hashSet.remove(obj);
                    this.c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.b.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f4240a) {
            it = this.d.iterator();
        }
        return it;
    }
}
