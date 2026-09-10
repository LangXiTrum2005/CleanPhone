package androidx.recyclerview.widget;

import androidx.collection.LongSparseArray;
import androidx.collection.LongSparseArrayKt;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;

/* JADX INFO: loaded from: classes.dex */
class ViewInfoStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleArrayMap f8158a = new SimpleArrayMap(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LongSparseArray f8159b = new LongSparseArray();

    public static class InfoRecord {
        public static final Pools.SimplePool d = new Pools.SimplePool(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.ItemAnimator.ItemHolderInfo f8161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public RecyclerView.ItemAnimator.ItemHolderInfo f8162c;

        public static InfoRecord a() {
            InfoRecord infoRecord = (InfoRecord) d.b();
            return infoRecord == null ? new InfoRecord() : infoRecord;
        }
    }

    public interface ProcessCallback {
        void a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void b(RecyclerView.ViewHolder viewHolder);

        void c(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void d(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);
    }

    public final void a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        SimpleArrayMap simpleArrayMap = this.f8158a;
        InfoRecord infoRecordA = (InfoRecord) simpleArrayMap.get(viewHolder);
        if (infoRecordA == null) {
            infoRecordA = InfoRecord.a();
            simpleArrayMap.put(viewHolder, infoRecordA);
        }
        infoRecordA.f8162c = itemHolderInfo;
        infoRecordA.f8160a |= 8;
    }

    public final RecyclerView.ItemAnimator.ItemHolderInfo b(RecyclerView.ViewHolder viewHolder, int i2) {
        InfoRecord infoRecord;
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        SimpleArrayMap simpleArrayMap = this.f8158a;
        int iD = simpleArrayMap.d(viewHolder);
        if (iD >= 0 && (infoRecord = (InfoRecord) simpleArrayMap.j(iD)) != null) {
            int i3 = infoRecord.f8160a;
            if ((i3 & i2) != 0) {
                int i4 = i3 & (~i2);
                infoRecord.f8160a = i4;
                if (i2 == 4) {
                    itemHolderInfo = infoRecord.f8161b;
                } else {
                    if (i2 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    itemHolderInfo = infoRecord.f8162c;
                }
                if ((i4 & 12) == 0) {
                    simpleArrayMap.h(iD);
                    infoRecord.f8160a = 0;
                    infoRecord.f8161b = null;
                    infoRecord.f8162c = null;
                    InfoRecord.d.a(infoRecord);
                }
                return itemHolderInfo;
            }
        }
        return null;
    }

    public final void c(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = (InfoRecord) this.f8158a.get(viewHolder);
        if (infoRecord == null) {
            return;
        }
        infoRecord.f8160a &= -2;
    }

    public final void d(RecyclerView.ViewHolder viewHolder) {
        LongSparseArray longSparseArray = this.f8159b;
        for (int i2 = longSparseArray.i() - 1; i2 >= 0; i2--) {
            if (viewHolder == longSparseArray.j(i2)) {
                Object[] objArr = longSparseArray.Z;
                Object obj = objArr[i2];
                Object obj2 = LongSparseArrayKt.f3746a;
                if (obj == obj2) {
                    break;
                }
                objArr[i2] = obj2;
                longSparseArray.X = true;
                break;
            }
        }
        InfoRecord infoRecord = (InfoRecord) this.f8158a.remove(viewHolder);
        if (infoRecord != null) {
            infoRecord.f8160a = 0;
            infoRecord.f8161b = null;
            infoRecord.f8162c = null;
            InfoRecord.d.a(infoRecord);
        }
    }
}
