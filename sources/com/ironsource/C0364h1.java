package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.h1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0364h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28760b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f28761c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0452m0 f28762a;

    /* JADX INFO: renamed from: com.ironsource.h1$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h1$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return j1.f.h(Integer.valueOf(((LevelPlayAdSize) t11).getWidth()), Integer.valueOf(((LevelPlayAdSize) t10).getWidth()));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h1$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f28763a;

        public c(Comparator comparator) {
            this.f28763a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f28763a.compare(t10, t11);
            return iCompare != 0 ? iCompare : j1.f.h(Integer.valueOf(((LevelPlayAdSize) t11).getHeight()), Integer.valueOf(((LevelPlayAdSize) t10).getHeight()));
        }
    }

    public C0364h1(C0452m0 adSizeTools) {
        kotlin.jvm.internal.n.f(adSizeTools, "adSizeTools");
        this.f28762a = adSizeTools;
    }

    public final LevelPlayAdSize a(Context context, Integer num) {
        LevelPlayAdSize levelPlayAdSizeCreateCustomSize;
        kotlin.jvm.internal.n.f(context, "context");
        if (!this.f28762a.c()) {
            IronLog.API.error(C0452m0.a(this.f28762a, "The SDK must be successfully initialized to create an Adaptive Ad Size", (String) null, 2, (Object) null));
            return null;
        }
        Integer numB = this.f28762a.b(context);
        if (numB == null) {
            IronLog.API.error(C0452m0.a(this.f28762a, "Error getting max current orientation banner height", (String) null, 2, (Object) null));
            return null;
        }
        int iIntValue = numB.intValue();
        int iA = a(num, context);
        int iA2 = this.f28762a.a(iA);
        List<LevelPlayAdSize> listA = a();
        Iterator<T> it = a(listA, iIntValue, iA).iterator();
        while (true) {
            if (!it.hasNext()) {
                levelPlayAdSizeCreateCustomSize = null;
                break;
            }
            levelPlayAdSizeCreateCustomSize = (LevelPlayAdSize) it.next();
            if (levelPlayAdSizeCreateCustomSize.getWidth() <= iA && (levelPlayAdSizeCreateCustomSize.getHeight() <= iA2 || iA2 == -1)) {
                iA2 = Math.max(iA2, levelPlayAdSizeCreateCustomSize.getHeight());
                break;
            }
        }
        if (levelPlayAdSizeCreateCustomSize == null) {
            iA2 = ((LevelPlayAdSize) xj.n.w0(listA)).getHeight();
            levelPlayAdSizeCreateCustomSize = LevelPlayAdSize.Companion.createCustomSize(iA, iA2);
        }
        int i10 = iA2;
        LevelPlayAdSize levelPlayAdSize = levelPlayAdSizeCreateCustomSize;
        IronLog ironLog = IronLog.INTERNAL;
        C0452m0 c0452m0 = this.f28762a;
        StringBuilder sbL = l1.d.l("Adaptive: ", iA, "x", i10, " Fallback: ");
        sbL.append(levelPlayAdSize);
        ironLog.info(C0452m0.a(c0452m0, sbL.toString(), (String) null, 2, (Object) null));
        return new LevelPlayAdSize(iA, i10, com.ironsource.mediationsdk.j.f29558f, true, levelPlayAdSize);
    }

    private final int a(Integer num, Context context) {
        if (num != null && num.intValue() < 0) {
            IronLog.API.info(C0452m0.a(this.f28762a, "Width is invalid, screen width will be used", (String) null, 2, (Object) null));
            return Z4.f28089a.b(context);
        }
        if (num == null) {
            return Z4.f28089a.b(context);
        }
        return num.intValue();
    }

    private final List<LevelPlayAdSize> a() {
        return xj.n.I0(this.f28762a.a(), new c(new b()));
    }

    private final List<LevelPlayAdSize> a(List<LevelPlayAdSize> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
            if (levelPlayAdSize.getHeight() <= i10 && levelPlayAdSize.getWidth() <= i11) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
