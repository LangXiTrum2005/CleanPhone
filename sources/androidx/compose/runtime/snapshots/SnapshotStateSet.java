package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SnapshotStateSet.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000 6*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006:\u00017B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\u0014J\u001d\u0010\"\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\"\u0010\u0018J\u000f\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010\bJ\u0017\u0010$\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010\u0014J\u001d\u0010%\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b%\u0010\u0018J\u001d\u0010&\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b&\u0010\u0018J\u001f\u0010+\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010.R$\u00103\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010.¨\u00068"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroid/os/Parcelable;", "Landroidx/compose/runtime/snapshots/polder;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "<init>", "()V", "Landroidx/compose/runtime/snapshots/grimness;", "value", "", "impassible", "(Landroidx/compose/runtime/snapshots/grimness;)V", "", "competently", "()Ljava/util/Set;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "toString", "()Ljava/lang/String;", "add", "addAll", "clear", "remove", "removeAll", "retainAll", "Landroid/os/Parcel;", "parcel", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "kowloon", "Landroidx/compose/runtime/snapshots/grimness;", "triweekly", "()Landroidx/compose/runtime/snapshots/grimness;", "firstStateRecord", "wireman", "size", "arytenoidectomy", "saneness", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnapshotStateSet<T> implements Parcelable, polder, Set<T>, RandomAccess, unready.beachfront {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public grimness firstStateRecord = kattegat.beachfront(this, dovishness.attabal.saneness());
    public static final Parcelable.Creator<SnapshotStateSet<Object>> CREATOR = new attabal();

    /* JADX INFO: compiled from: SnapshotStateSet.android.kt */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J)\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"androidx/compose/runtime/snapshots/SnapshotStateSet$attabal", "Landroid/os/Parcelable$ClassLoaderCreator;", "Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "", "Landroid/os/Parcel;", "parcel", "Ljava/lang/ClassLoader;", "loader", "saneness", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "attabal", "(Landroid/os/Parcel;)Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "", "size", "", "dern", "(I)[Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements Parcelable.ClassLoaderCreator<SnapshotStateSet<Object>> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public SnapshotStateSet<Object> createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public SnapshotStateSet<Object>[] newArray(int size) {
            return new SnapshotStateSet[size];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public SnapshotStateSet<Object> createFromParcel(Parcel parcel, ClassLoader loader) {
            SnapshotStateSet<Object> snapshotStateSet = new SnapshotStateSet<>();
            if (loader == null) {
                loader = SnapshotStateSet.class.getClassLoader();
            }
            int i = parcel.readInt();
            for (int i2 = 0; i2 < i; i2++) {
                snapshotStateSet.add(parcel.readValue(loader));
            }
            return snapshotStateSet;
        }
    }

    public static final boolean beachfront(Collection collection2, Set set) {
        return set.retainAll(CollectionsKt.prefect(collection2));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(T element) {
        int modification;
        dovishness.beachfront<T> beachfrontVarApical;
        formularize formularizeVarDern;
        boolean zSaneness;
        do {
            synchronized (kattegat.f6209attabal) {
                grimness firstStateRecord = getFirstStateRecord();
                Intrinsics.competently(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                privatdozent privatdozentVar = (privatdozent) adultoid.polder((privatdozent) firstStateRecord);
                modification = privatdozentVar.getModification();
                beachfrontVarApical = privatdozentVar.apical();
                Unit unit = Unit.f29295attabal;
            }
            Intrinsics.beachfront(beachfrontVarApical);
            dovishness.beachfront<T> beachfrontVarAdd = beachfrontVarApical.add(element);
            if (Intrinsics.wireman(beachfrontVarAdd, beachfrontVarApical)) {
                return false;
            }
            grimness firstStateRecord2 = getFirstStateRecord();
            Intrinsics.competently(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            privatdozent privatdozentVar2 = (privatdozent) firstStateRecord2;
            synchronized (adultoid.privatdozent()) {
                formularizeVarDern = formularize.INSTANCE.dern();
                zSaneness = kattegat.saneness((privatdozent) adultoid.underbelly(privatdozentVar2, this, formularizeVarDern), modification, beachfrontVarAdd);
            }
            adultoid.clubfoot(formularizeVarDern, this);
        } while (!zSaneness);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> elements) {
        int modification;
        dovishness.beachfront<T> beachfrontVarApical;
        formularize formularizeVarDern;
        boolean zSaneness;
        do {
            synchronized (kattegat.f6209attabal) {
                grimness firstStateRecord = getFirstStateRecord();
                Intrinsics.competently(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                privatdozent privatdozentVar = (privatdozent) adultoid.polder((privatdozent) firstStateRecord);
                modification = privatdozentVar.getModification();
                beachfrontVarApical = privatdozentVar.apical();
                Unit unit = Unit.f29295attabal;
            }
            Intrinsics.beachfront(beachfrontVarApical);
            dovishness.beachfront<T> beachfrontVarAddAll = beachfrontVarApical.addAll(elements);
            if (Intrinsics.wireman(beachfrontVarAddAll, beachfrontVarApical)) {
                return false;
            }
            grimness firstStateRecord2 = getFirstStateRecord();
            Intrinsics.competently(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            privatdozent privatdozentVar2 = (privatdozent) firstStateRecord2;
            synchronized (adultoid.privatdozent()) {
                formularizeVarDern = formularize.INSTANCE.dern();
                zSaneness = kattegat.saneness((privatdozent) adultoid.underbelly(privatdozentVar2, this, formularizeVarDern), modification, beachfrontVarAddAll);
            }
            adultoid.clubfoot(formularizeVarDern, this);
        } while (!zSaneness);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        formularize formularizeVarDern;
        grimness firstStateRecord = getFirstStateRecord();
        Intrinsics.competently(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
        privatdozent privatdozentVar = (privatdozent) firstStateRecord;
        synchronized (adultoid.privatdozent()) {
            formularizeVarDern = formularize.INSTANCE.dern();
            privatdozent privatdozentVar2 = (privatdozent) adultoid.underbelly(privatdozentVar, this, formularizeVarDern);
            synchronized (kattegat.f6209attabal) {
                privatdozentVar2.impassible(dovishness.attabal.saneness());
                privatdozentVar2.formularize(privatdozentVar2.getModification() + 1);
            }
        }
        adultoid.clubfoot(formularizeVarDern, this);
    }

    public final Set<T> competently() {
        return kattegat.wireman(this).apical();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return kattegat.wireman(this).apical().contains(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        return kattegat.wireman(this).apical().containsAll(elements);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // androidx.compose.runtime.snapshots.polder
    public void impassible(grimness value) {
        value.impromptu(getFirstStateRecord());
        Intrinsics.competently(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        this.firstStateRecord = (privatdozent) value;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return kattegat.wireman(this).apical().isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new saran(this, kattegat.wireman(this).apical().iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        int modification;
        dovishness.beachfront<T> beachfrontVarApical;
        formularize formularizeVarDern;
        boolean zSaneness;
        do {
            synchronized (kattegat.f6209attabal) {
                grimness firstStateRecord = getFirstStateRecord();
                Intrinsics.competently(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                privatdozent privatdozentVar = (privatdozent) adultoid.polder((privatdozent) firstStateRecord);
                modification = privatdozentVar.getModification();
                beachfrontVarApical = privatdozentVar.apical();
                Unit unit = Unit.f29295attabal;
            }
            Intrinsics.beachfront(beachfrontVarApical);
            dovishness.beachfront<T> beachfrontVarRemove = beachfrontVarApical.remove(element);
            if (Intrinsics.wireman(beachfrontVarRemove, beachfrontVarApical)) {
                return false;
            }
            grimness firstStateRecord2 = getFirstStateRecord();
            Intrinsics.competently(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            privatdozent privatdozentVar2 = (privatdozent) firstStateRecord2;
            synchronized (adultoid.privatdozent()) {
                formularizeVarDern = formularize.INSTANCE.dern();
                zSaneness = kattegat.saneness((privatdozent) adultoid.underbelly(privatdozentVar2, this, formularizeVarDern), modification, beachfrontVarRemove);
            }
            adultoid.clubfoot(formularizeVarDern, this);
        } while (!zSaneness);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> elements) {
        int modification;
        dovishness.beachfront<T> beachfrontVarApical;
        formularize formularizeVarDern;
        boolean zSaneness;
        do {
            synchronized (kattegat.f6209attabal) {
                grimness firstStateRecord = getFirstStateRecord();
                Intrinsics.competently(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                privatdozent privatdozentVar = (privatdozent) adultoid.polder((privatdozent) firstStateRecord);
                modification = privatdozentVar.getModification();
                beachfrontVarApical = privatdozentVar.apical();
                Unit unit = Unit.f29295attabal;
            }
            Intrinsics.beachfront(beachfrontVarApical);
            dovishness.beachfront<T> beachfrontVarRemoveAll = beachfrontVarApical.removeAll((Collection<? extends T>) elements);
            if (Intrinsics.wireman(beachfrontVarRemoveAll, beachfrontVarApical)) {
                return false;
            }
            grimness firstStateRecord2 = getFirstStateRecord();
            Intrinsics.competently(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            privatdozent privatdozentVar2 = (privatdozent) firstStateRecord2;
            synchronized (adultoid.privatdozent()) {
                formularizeVarDern = formularize.INSTANCE.dern();
                zSaneness = kattegat.saneness((privatdozent) adultoid.underbelly(privatdozentVar2, this, formularizeVarDern), modification, beachfrontVarRemoveAll);
            }
            adultoid.clubfoot(formularizeVarDern, this);
        } while (!zSaneness);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(final Collection<?> elements) {
        return kattegat.marial(this, new Function1() { // from class: androidx.compose.runtime.snapshots.sealless
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SnapshotStateSet.beachfront(elements, (Set) obj));
            }
        });
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return wireman();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return p002kotlin.jvm.internal.impromptu.attabal(this);
    }

    public String toString() {
        grimness firstStateRecord = getFirstStateRecord();
        Intrinsics.competently(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return "SnapshotStateSet(value=" + ((privatdozent) adultoid.polder((privatdozent) firstStateRecord)).apical() + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.snapshots.polder
    /* JADX INFO: renamed from: triweekly, reason: from getter */
    public grimness getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public int wireman() {
        return kattegat.wireman(this).apical().size();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Set<T> setCompetently = competently();
        parcel.writeInt(size());
        Iterator<T> it = setCompetently.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) p002kotlin.jvm.internal.impromptu.saneness(this, tArr);
    }
}
