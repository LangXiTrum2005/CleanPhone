package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/paging/FlattenedPageEventStorage;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FlattenedPageEventStorage<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LoadStates f7789c;
    public boolean d;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final void a(PageEvent event) {
        Intrinsics.f(event, "event");
        this.d = true;
        if (event instanceof PageEvent.Insert) {
            LoadStates loadStates = ((PageEvent.Insert) event).f7822e;
            throw null;
        }
        if (event instanceof PageEvent.Drop) {
            ((PageEvent.Drop) event).getClass();
            throw null;
        }
        if (event instanceof PageEvent.LoadStateUpdate) {
            LoadStates loadStates2 = ((PageEvent.LoadStateUpdate) event).f7826a;
            throw null;
        }
        if (event instanceof PageEvent.StaticList) {
            throw null;
        }
    }

    public final List b() {
        if (!this.d) {
            return EmptyList.X;
        }
        new ArrayList();
        throw null;
    }
}
