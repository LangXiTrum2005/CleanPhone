package androidx.paging;

import android.support.v4.media.a;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/PageStore;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PlaceholderPaddedList;", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PageStore<T> implements PlaceholderPaddedList<T> {
    public final ArrayList X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f7850Y;
    public final int Z;
    public final int e0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/PageStore$Companion;", "", "Landroidx/paging/PageStore;", "INITIAL", "Landroidx/paging/PageStore;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        PageEvent.Insert insertEvent = PageEvent.Insert.g;
        Intrinsics.f(insertEvent, "insertEvent");
        new PageStore(insertEvent.f7821c, insertEvent.d, insertEvent.f7820b);
    }

    public PageStore(int i2, int i3, List pages) {
        Intrinsics.f(pages, "pages");
        this.X = CollectionsKt.j0(pages);
        Iterator<T> it = pages.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((TransformablePage) it.next()).f7887b.size();
        }
        this.f7850Y = size;
        this.Z = i2;
        this.e0 = i3;
    }

    public final int a() {
        return this.Z + this.f7850Y + this.e0;
    }

    public final String toString() {
        int i2 = this.f7850Y;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = this.X;
            int size = arrayList2.size();
            int i4 = 0;
            int i5 = i3;
            while (i4 < size) {
                int size2 = ((TransformablePage) arrayList2.get(i4)).f7887b.size();
                if (size2 > i5) {
                    break;
                }
                i5 -= size2;
                i4++;
            }
            arrayList.add(((TransformablePage) arrayList2.get(i4)).f7887b.get(i5));
        }
        String strD = CollectionsKt.D(arrayList, null, null, null, null, 63);
        StringBuilder sb = new StringBuilder("[(");
        sb.append(this.Z);
        sb.append(" placeholders), ");
        sb.append(strD);
        sb.append(", (");
        return a.i(this.e0, " placeholders)]", sb);
    }
}
