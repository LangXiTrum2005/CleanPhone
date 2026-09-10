package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.Poolable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
class GroupedLinkedMap<K extends Poolable, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedEntry f12483a = new LinkedEntry(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f12484b = new HashMap();

    public static class LinkedEntry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f12485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f12486b;
        public LinkedEntry d = this;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LinkedEntry f12487c = this;

        public LinkedEntry(Object obj) {
            this.f12485a = obj;
        }
    }

    public final Object a(Poolable poolable) {
        HashMap map = this.f12484b;
        LinkedEntry linkedEntry = (LinkedEntry) map.get(poolable);
        if (linkedEntry == null) {
            linkedEntry = new LinkedEntry(poolable);
            map.put(poolable, linkedEntry);
        } else {
            poolable.a();
        }
        LinkedEntry linkedEntry2 = linkedEntry.d;
        linkedEntry2.f12487c = linkedEntry.f12487c;
        linkedEntry.f12487c.d = linkedEntry2;
        LinkedEntry linkedEntry3 = this.f12483a;
        linkedEntry.d = linkedEntry3;
        LinkedEntry linkedEntry4 = linkedEntry3.f12487c;
        linkedEntry.f12487c = linkedEntry4;
        linkedEntry4.d = linkedEntry;
        linkedEntry.d.f12487c = linkedEntry;
        ArrayList arrayList = linkedEntry.f12486b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return linkedEntry.f12486b.remove(size - 1);
        }
        return null;
    }

    public final void b(Poolable poolable, Object obj) {
        HashMap map = this.f12484b;
        LinkedEntry linkedEntry = (LinkedEntry) map.get(poolable);
        if (linkedEntry == null) {
            linkedEntry = new LinkedEntry(poolable);
            linkedEntry.d = linkedEntry;
            LinkedEntry linkedEntry2 = this.f12483a;
            linkedEntry.d = linkedEntry2.d;
            linkedEntry.f12487c = linkedEntry2;
            linkedEntry2.d = linkedEntry;
            linkedEntry.d.f12487c = linkedEntry;
            map.put(poolable, linkedEntry);
        } else {
            poolable.a();
        }
        if (linkedEntry.f12486b == null) {
            linkedEntry.f12486b = new ArrayList();
        }
        linkedEntry.f12486b.add(obj);
    }

    public final Object c() {
        LinkedEntry linkedEntry = this.f12483a;
        LinkedEntry linkedEntry2 = linkedEntry.d;
        while (true) {
            if (linkedEntry2.equals(linkedEntry)) {
                return null;
            }
            ArrayList arrayList = linkedEntry2.f12486b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? linkedEntry2.f12486b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            LinkedEntry linkedEntry3 = linkedEntry2.d;
            linkedEntry3.f12487c = linkedEntry2.f12487c;
            linkedEntry2.f12487c.d = linkedEntry3;
            HashMap map = this.f12484b;
            Object obj = linkedEntry2.f12485a;
            map.remove(obj);
            ((Poolable) obj).a();
            linkedEntry2 = linkedEntry2.d;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        LinkedEntry linkedEntry = this.f12483a;
        LinkedEntry linkedEntry2 = linkedEntry.f12487c;
        boolean z2 = false;
        while (!linkedEntry2.equals(linkedEntry)) {
            sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
            sb.append(linkedEntry2.f12485a);
            sb.append(AbstractJsonLexerKt.COLON);
            ArrayList arrayList = linkedEntry2.f12486b;
            sb.append(arrayList != null ? arrayList.size() : 0);
            sb.append("}, ");
            linkedEntry2 = linkedEntry2.f12487c;
            z2 = true;
        }
        if (z2) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
