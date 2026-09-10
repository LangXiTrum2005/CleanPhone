package androidx.collection;

import com.ironsource.A5;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a%\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000b\u001a\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u000b\"\u0014\u0010\u0012\u001a\u00020\u00108\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011\"\"\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00140\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015*\f\b\u0000\u0010\u0018\"\u00020\u00172\u00020\u0017*\f\b\u0000\u0010\u0019\"\u00020\u00172\u00020\u0017*\f\b\u0000\u0010\u001a\"\u00020\u00172\u00020\u0017¨\u0006\u001b"}, d2 = {"K", "V", "Landroidx/collection/walach;", "attabal", "()Landroidx/collection/walach;", "Landroidx/collection/grimness;", "dern", "()Landroidx/collection/grimness;", "", "capacity", "wireman", "(I)I", A5.q, "marial", "saneness", "beachfront", "", "[J", "EmptyGroup", "", "", "Landroidx/collection/grimness;", "EmptyScatterMap", "", "Bitmask", "Group", "StaticBitmask", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class peridotite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final long[] f5721attabal = {-9187201950435737345L, -1};

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final grimness f5722saneness = new grimness(0);

    public static final <K, V> walach<K, V> attabal() {
        grimness grimnessVar = f5722saneness;
        Intrinsics.competently(grimnessVar, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
        return grimnessVar;
    }

    public static final int beachfront(int i) {
        if (i == 7) {
            return 8;
        }
        return i + ((i - 1) / 7);
    }

    public static final <K, V> grimness<K, V> dern() {
        return new grimness<>(0, 1, null);
    }

    public static final int marial(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    public static final int saneness(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final int wireman(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }
}
