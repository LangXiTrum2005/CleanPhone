package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.lightstruck;
import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SnapshotStateList.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 B*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006:\u0001RB\u0017\b\u0000\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\"\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010!J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b)\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001cH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u0010\u0017J\u001f\u00103\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u00104J%\u00105\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b5\u00106J\u001d\u00105\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b5\u0010\u001bJ\u000f\u00107\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u0010\u000bJ\u0017\u00108\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b8\u0010\u0017J\u001d\u00109\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b9\u0010\u001bJ\u0017\u0010:\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b:\u0010\u001fJ\u001d\u0010;\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b;\u0010\u001bJ \u0010<\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001c¢\u0006\u0004\b>\u0010?J-\u0010B\u001a\u00020\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010@\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020\u001cH\u0000¢\u0006\u0004\bB\u0010CJ\u001f\u0010G\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\u001cH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u001cH\u0016¢\u0006\u0004\bI\u0010JR$\u0010O\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010J¨\u0006S"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroid/os/Parcelable;", "Landroidx/compose/runtime/snapshots/polder;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Ldovishness/marial;", "persistentList", "<init>", "(Ldovishness/marial;)V", "()V", "Landroidx/compose/runtime/snapshots/grimness;", "value", "", "impassible", "(Landroidx/compose/runtime/snapshots/grimness;)V", "", "polloi", "()Ljava/util/List;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "add", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "remove", "removeAll", "impromptu", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "taiyuan", "(II)V", "start", TtmlNode.END, "arytenoidectomy", "(Ljava/util/Collection;II)I", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "kowloon", "Landroidx/compose/runtime/snapshots/grimness;", "triweekly", "()Landroidx/compose/runtime/snapshots/grimness;", "firstStateRecord", "competently", "size", "saneness", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnapshotStateList<T> implements Parcelable, polder, List<T>, RandomAccess, unready.wireman {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public grimness firstStateRecord;
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new attabal();

    /* JADX INFO: compiled from: SnapshotStateList.android.kt */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J)\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"androidx/compose/runtime/snapshots/SnapshotStateList$attabal", "Landroid/os/Parcelable$ClassLoaderCreator;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "Landroid/os/Parcel;", "parcel", "Ljava/lang/ClassLoader;", "loader", "dern", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "saneness", "(Landroid/os/Parcel;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "size", "", "marial", "(I)[Landroidx/compose/runtime/snapshots/SnapshotStateList;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements Parcelable.ClassLoaderCreator<SnapshotStateList<Object>> {
        public static final Object wireman(Parcel parcel, ClassLoader classLoader, int i) {
            return parcel.readValue(classLoader);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public SnapshotStateList<Object> createFromParcel(final Parcel parcel, final ClassLoader loader) {
            if (loader == null) {
                loader = attabal.class.getClassLoader();
            }
            return cord.attabal(parcel.readInt(), new Function1() { // from class: androidx.compose.runtime.snapshots.preprohormone
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SnapshotStateList.attabal.wireman(parcel, loader, ((Integer) obj).intValue());
                }
            });
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
        public SnapshotStateList<Object>[] newArray(int size) {
            return new SnapshotStateList[size];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public SnapshotStateList<Object> createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }
    }

    public SnapshotStateList(dovishness.marial<? extends T> marialVar) {
        this.firstStateRecord = cord.formularize(this, marialVar);
    }

    public static final boolean beachfront(int i, Collection collection2, List list) {
        return list.addAll(i, collection2);
    }

    public static final boolean cutely(Collection collection2, List list) {
        return list.retainAll(collection2);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T element) {
        int modification;
        dovishness.marial<T> marialVarCutely;
        formularize formularizeVarDern;
        boolean zBeachfront;
        do {
            synchronized (cord.f6180attabal) {
                grimness firstStateRecord = getFirstStateRecord();
                Intrinsics.competently(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                merc mercVar = (merc) adultoid.polder((merc) firstStateRecord);
                modification = mercVar.getModification();
                marialVarCutely = mercVar.cutely();
                Unit unit = Unit.f29295attabal;
            }
            Intrinsics.beachfront(marialVarCutely);
            dovishness.marial<T> marialVarAdd = marialVarCutely.add(element);
            if (Intrinsics.wireman(marialVarAdd, marialVarCutely)) {
                return false;
            }
            grimness firstStateRecord2 = getFirstStateRecord();
            Intrinsics.competently(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            merc mercVar2 = (merc) firstStateRecord2;
            synchronized (adultoid.privatdozent()) {
                formularizeVarDern = formularize.INSTANCE.dern();
                zBeachfront = cord.beachfront((merc) adultoid.underbelly(mercVar2, this, formularizeVarDern), modification, marialVarAdd, true);
            }
            adultoid.clubfoot(formularizeVarDern, this);
        } while (!zBeachfront);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(final int index, final Collection<? extends T> elements) {
        return cord.apical(this, new Function1() { // from class: androidx.compose.runtime.snapshots.rotuma
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SnapshotStateList.beachfront(index, elements, (List) obj));
            }
        });
    }

    public final int arytenoidectomy(Collection<? extends T> elements, int start, int end) {
        int modification;
        dovishness.marial<T> marialVarCutely;
        formularize formularizeVarDern;
        boolean zBeachfront;
        int size = size();
        do {
            synchronized (cord.f6180attabal) {
                grimness firstStateRecord = getFirstStateRecord();
                Intrinsics.competently(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                merc mercVar = (merc) adultoid.polder((merc) firstStateRecord);
                modification = mercVar.getModification();
                marialVarCutely = mercVar.cutely();
                Unit unit = Unit.f29295attabal;
            }
            Intrinsics.beachfront(marialVarCutely);
            dovishness.marial.attabal<T> attabalVarBuilder = marialVarCutely.builder();
            attabalVarBuilder.subList(start, end).retainAll(elements);
            dovishness.marial<T> marialVarBuild = attabalVarBuilder.build();
            if (Intrinsics.wireman(marialVarBuild, marialVarCutely)) {
                break;
            }
            grimness firstStateRecord2 = getFirstStateRecord();
            Intrinsics.competently(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            merc mercVar2 = (merc) firstStateRecord2;
            synchronized (adultoid.privatdozent()) {
                formularizeVarDern = formularize.INSTANCE.dern();
                zBeachfront = cord.beachfront((merc) adultoid.underbelly(mercVar2, this, formularizeVarDern), modification, marialVarBuild, true);
            }
            adultoid.clubfoot(formularizeVarDern, this);
        } while (!zBeachfront);
        return size - size();
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        formularize formularizeVarDern;
        grimness firstStateRecord = getFirstStateRecord();
        Intrinsics.competently(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        merc mercVar = (merc) firstStateRecord;
        synchronized (adultoid.privatdozent()) {
            formularizeVarDern = formularize.INSTANCE.dern();
            merc mercVar2 = (merc) adultoid.underbelly(mercVar, this, formularizeVarDern);
            synchronized (cord.f6180attabal) {
                mercVar2.impassible(dovishness.attabal.attabal());
                mercVar2.triweekly(mercVar2.getModification() + 1);
                mercVar2.kowloon(mercVar2.getStructuralChange() + 1);
            }
        }
        adultoid.clubfoot(formularizeVarDern, this);
    }

    public int competently() {
        return cord.competently(this).cutely().size();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return cord.competently(this).cutely().contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        return cord.competently(this).cutely().containsAll(elements);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public T get(int index) {
        return cord.competently(this).cutely().get(index);
    }

    @Override // androidx.compose.runtime.snapshots.polder
    public void impassible(grimness value) {
        value.impromptu(getFirstStateRecord());
        Intrinsics.competently(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.firstStateRecord = (merc) value;
    }

    public T impromptu(int index) {
        int modification;
        dovishness.marial<T> marialVarCutely;
        formularize formularizeVarDern;
        boolean zBeachfront;
        T t = get(index);
        do {
            synchronized (cord.f6180attabal) {
                grimness firstStateRecord = getFirstStateRecord();
                Intrinsics.competently(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                merc mercVar = (merc) adultoid.polder((merc) firstStateRecord);
                modification = mercVar.getModification();
                marialVarCutely = mercVar.cutely();
                Unit unit = Unit.f29295attabal;
            }
            Intrinsics.beachfront(marialVarCutely);
            dovishness.marial<T> marialVarFormularize = marialVarCutely.formularize(index);
            if (Intrinsics.wireman(marialVarFormularize, marialVarCutely)) {
                return t;
            }
            grimness firstStateRecord2 = getFirstStateRecord();
            Intrinsics.competently(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            merc mercVar2 = (merc) firstStateRecord2;
            synchronized (adultoid.privatdozent()) {
                formularizeVarDern = formularize.INSTANCE.dern();
                zBeachfront = cord.beachfront((merc) adultoid.underbelly(mercVar2, this, formularizeVarDern), modification, marialVarFormularize, true);
            }
            adultoid.clubfoot(formularizeVarDern, this);
        } while (!zBeachfront);
        return t;
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return cord.competently(this).cutely().indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return cord.competently(this).cutely().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return cord.competently(this).cutely().lastIndexOf(element);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new restrictive(this, 0);
    }

    public final List<T> polloi() {
        return cord.competently(this).cutely();
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return impromptu(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> elements) {
        int modification;
        dovishness.marial<T> marialVarCutely;
        formularize formularizeVarDern;
        boolean zBeachfront;
        do {
            synchronized (cord.f6180attabal) {
                grimness firstStateRecord = getFirstStateRecord();
                Intrinsics.competently(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                merc mercVar = (merc) adultoid.polder((merc) firstStateRecord);
                modification = mercVar.getModification();
                marialVarCutely = mercVar.cutely();
                Unit unit = Unit.f29295attabal;
            }
            Intrinsics.beachfront(marialVarCutely);
            dovishness.marial<T> marialVarRemoveAll = marialVarCutely.removeAll((Collection<? extends T>) elements);
            if (Intrinsics.wireman(marialVarRemoveAll, marialVarCutely)) {
                return false;
            }
            grimness firstStateRecord2 = getFirstStateRecord();
            Intrinsics.competently(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            merc mercVar2 = (merc) firstStateRecord2;
            synchronized (adultoid.privatdozent()) {
                formularizeVarDern = formularize.INSTANCE.dern();
                zBeachfront = cord.beachfront((merc) adultoid.underbelly(mercVar2, this, formularizeVarDern), modification, marialVarRemoveAll, true);
            }
            adultoid.clubfoot(formularizeVarDern, this);
        } while (!zBeachfront);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(final Collection<?> elements) {
        return cord.apical(this, new Function1() { // from class: androidx.compose.runtime.snapshots.gintrap
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SnapshotStateList.cutely(elements, (List) obj));
            }
        });
    }

    @Override // java.util.List
    public T set(int index, T element) {
        int modification;
        dovishness.marial<T> marialVarCutely;
        formularize formularizeVarDern;
        boolean zBeachfront;
        T t = get(index);
        do {
            synchronized (cord.f6180attabal) {
                grimness firstStateRecord = getFirstStateRecord();
                Intrinsics.competently(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                merc mercVar = (merc) adultoid.polder((merc) firstStateRecord);
                modification = mercVar.getModification();
                marialVarCutely = mercVar.cutely();
                Unit unit = Unit.f29295attabal;
            }
            Intrinsics.beachfront(marialVarCutely);
            dovishness.marial<T> marialVar = marialVarCutely.set(index, element);
            if (Intrinsics.wireman(marialVar, marialVarCutely)) {
                return t;
            }
            grimness firstStateRecord2 = getFirstStateRecord();
            Intrinsics.competently(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            merc mercVar2 = (merc) firstStateRecord2;
            synchronized (adultoid.privatdozent()) {
                formularizeVarDern = formularize.INSTANCE.dern();
                zBeachfront = cord.beachfront((merc) adultoid.underbelly(mercVar2, this, formularizeVarDern), modification, marialVar, false);
            }
            adultoid.clubfoot(formularizeVarDern, this);
        } while (!zBeachfront);
        return t;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return competently();
    }

    @Override // java.util.List
    public List<T> subList(int fromIndex, int toIndex) {
        if (!(fromIndex >= 0 && fromIndex <= toIndex && toIndex <= size())) {
            lightstruck.attabal("fromIndex or toIndex are out of bounds");
        }
        return new creditor(this, fromIndex, toIndex);
    }

    public final void taiyuan(int fromIndex, int toIndex) {
        int modification;
        dovishness.marial<T> marialVarCutely;
        formularize formularizeVarDern;
        boolean zBeachfront;
        do {
            synchronized (cord.f6180attabal) {
                grimness firstStateRecord = getFirstStateRecord();
                Intrinsics.competently(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                merc mercVar = (merc) adultoid.polder((merc) firstStateRecord);
                modification = mercVar.getModification();
                marialVarCutely = mercVar.cutely();
                Unit unit = Unit.f29295attabal;
            }
            Intrinsics.beachfront(marialVarCutely);
            dovishness.marial.attabal<T> attabalVarBuilder = marialVarCutely.builder();
            attabalVarBuilder.subList(fromIndex, toIndex).clear();
            dovishness.marial<T> marialVarBuild = attabalVarBuilder.build();
            if (Intrinsics.wireman(marialVarBuild, marialVarCutely)) {
                return;
            }
            grimness firstStateRecord2 = getFirstStateRecord();
            Intrinsics.competently(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            merc mercVar2 = (merc) firstStateRecord2;
            synchronized (adultoid.privatdozent()) {
                formularizeVarDern = formularize.INSTANCE.dern();
                zBeachfront = cord.beachfront((merc) adultoid.underbelly(mercVar2, this, formularizeVarDern), modification, marialVarBuild, true);
            }
            adultoid.clubfoot(formularizeVarDern, this);
        } while (!zBeachfront);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return p002kotlin.jvm.internal.impromptu.attabal(this);
    }

    public String toString() {
        grimness firstStateRecord = getFirstStateRecord();
        Intrinsics.competently(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((merc) adultoid.polder((merc) firstStateRecord)).cutely() + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.snapshots.polder
    /* JADX INFO: renamed from: triweekly, reason: from getter */
    public grimness getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        List<T> listPolloi = polloi();
        int size = listPolloi.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            parcel.writeValue(listPolloi.get(i));
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> elements) {
        int modification;
        dovishness.marial<T> marialVarCutely;
        formularize formularizeVarDern;
        boolean zBeachfront;
        do {
            synchronized (cord.f6180attabal) {
                grimness firstStateRecord = getFirstStateRecord();
                Intrinsics.competently(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                merc mercVar = (merc) adultoid.polder((merc) firstStateRecord);
                modification = mercVar.getModification();
                marialVarCutely = mercVar.cutely();
                Unit unit = Unit.f29295attabal;
            }
            Intrinsics.beachfront(marialVarCutely);
            dovishness.marial<T> marialVarAddAll = marialVarCutely.addAll(elements);
            if (Intrinsics.wireman(marialVarAddAll, marialVarCutely)) {
                return false;
            }
            grimness firstStateRecord2 = getFirstStateRecord();
            Intrinsics.competently(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            merc mercVar2 = (merc) firstStateRecord2;
            synchronized (adultoid.privatdozent()) {
                formularizeVarDern = formularize.INSTANCE.dern();
                zBeachfront = cord.beachfront((merc) adultoid.underbelly(mercVar2, this, formularizeVarDern), modification, marialVarAddAll, true);
            }
            adultoid.clubfoot(formularizeVarDern, this);
        } while (!zBeachfront);
        return true;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int index) {
        return new restrictive(this, index);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        int modification;
        dovishness.marial<T> marialVarCutely;
        formularize formularizeVarDern;
        boolean zBeachfront;
        do {
            synchronized (cord.f6180attabal) {
                grimness firstStateRecord = getFirstStateRecord();
                Intrinsics.competently(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                merc mercVar = (merc) adultoid.polder((merc) firstStateRecord);
                modification = mercVar.getModification();
                marialVarCutely = mercVar.cutely();
                Unit unit = Unit.f29295attabal;
            }
            Intrinsics.beachfront(marialVarCutely);
            dovishness.marial<T> marialVarRemove = marialVarCutely.remove(element);
            if (Intrinsics.wireman(marialVarRemove, marialVarCutely)) {
                return false;
            }
            grimness firstStateRecord2 = getFirstStateRecord();
            Intrinsics.competently(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            merc mercVar2 = (merc) firstStateRecord2;
            synchronized (adultoid.privatdozent()) {
                formularizeVarDern = formularize.INSTANCE.dern();
                zBeachfront = cord.beachfront((merc) adultoid.underbelly(mercVar2, this, formularizeVarDern), modification, marialVarRemove, true);
            }
            adultoid.clubfoot(formularizeVarDern, this);
        } while (!zBeachfront);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) p002kotlin.jvm.internal.impromptu.saneness(this, tArr);
    }

    public SnapshotStateList() {
        this(dovishness.attabal.attabal());
    }

    @Override // java.util.List
    public void add(int index, T element) {
        int modification;
        dovishness.marial<T> marialVarCutely;
        formularize formularizeVarDern;
        boolean zBeachfront;
        do {
            synchronized (cord.f6180attabal) {
                grimness firstStateRecord = getFirstStateRecord();
                Intrinsics.competently(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                merc mercVar = (merc) adultoid.polder((merc) firstStateRecord);
                modification = mercVar.getModification();
                marialVarCutely = mercVar.cutely();
                Unit unit = Unit.f29295attabal;
            }
            Intrinsics.beachfront(marialVarCutely);
            dovishness.marial<T> marialVarAdd = marialVarCutely.add(index, element);
            if (Intrinsics.wireman(marialVarAdd, marialVarCutely)) {
                return;
            }
            grimness firstStateRecord2 = getFirstStateRecord();
            Intrinsics.competently(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            merc mercVar2 = (merc) firstStateRecord2;
            synchronized (adultoid.privatdozent()) {
                formularizeVarDern = formularize.INSTANCE.dern();
                zBeachfront = cord.beachfront((merc) adultoid.underbelly(mercVar2, this, formularizeVarDern), modification, marialVarAdd, true);
            }
            adultoid.clubfoot(formularizeVarDern, this);
        } while (!zBeachfront);
    }
}
