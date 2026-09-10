package com.p004ironsource;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.p004ironsource.mediationsdk.l;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0006\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J#\u0010\u0006\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/ironsource/d3;", "", "", "width", "Landroid/content/Context;", "context", "a", "(Ljava/lang/Integer;Landroid/content/Context;)I", "", "Lcom/unity3d/mediation/LevelPlayAdSize;", "fallbackSortedList", "maxHeight", "maxWidth", "(Landroid/content/Context;Ljava/lang/Integer;)Lcom/unity3d/mediation/LevelPlayAdSize;", "Lcom/ironsource/j1;", "Lcom/ironsource/j1;", "adSizeTools", "<init>", "(Lcom/ironsource/j1;)V", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class d3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f24608c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j1 adSizeTools;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.a(Integer.valueOf(((LevelPlayAdSize) t2).getWidth()), Integer.valueOf(((LevelPlayAdSize) t).getWidth()));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f24610a;

        public c(Comparator comparator) {
            this.f24610a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.f24610a.compare(t, t2);
            return iCompare != 0 ? iCompare : ComparisonsKt.a(Integer.valueOf(((LevelPlayAdSize) t2).getHeight()), Integer.valueOf(((LevelPlayAdSize) t).getHeight()));
        }
    }

    public d3(j1 adSizeTools) {
        Intrinsics.f(adSizeTools, "adSizeTools");
        this.adSizeTools = adSizeTools;
    }

    private final int a(Integer width, Context context) {
        if (width != null && width.intValue() < 0) {
            IronLog.API.info(j1.a(this.adSizeTools, "Width is invalid, screen width will be used", (String) null, 2, (Object) null));
        } else if (width != null) {
            return width.intValue();
        }
        return bb.f24416a.b(context);
    }

    public final LevelPlayAdSize a(Context context, Integer width) {
        IronLog ironLog;
        j1 j1Var;
        String str;
        LevelPlayAdSize levelPlayAdSizeCreateCustomSize;
        Intrinsics.f(context, "context");
        if (this.adSizeTools.d()) {
            Integer numB = this.adSizeTools.b(context);
            if (numB != null) {
                int iIntValue = numB.intValue();
                int iA = a(width, context);
                int iA2 = this.adSizeTools.a(iA);
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
                    iA2 = ((LevelPlayAdSize) CollectionsKt.F(listA)).getHeight();
                    levelPlayAdSizeCreateCustomSize = LevelPlayAdSize.INSTANCE.createCustomSize(iA, iA2);
                }
                int i2 = iA2;
                LevelPlayAdSize levelPlayAdSize = levelPlayAdSizeCreateCustomSize;
                IronLog.INTERNAL.info(j1.a(this.adSizeTools, "Adaptive: " + iA + 'x' + i2 + " Fallback: " + levelPlayAdSize, (String) null, 2, (Object) null));
                return new LevelPlayAdSize(iA, i2, l.f, true, levelPlayAdSize);
            }
            ironLog = IronLog.API;
            j1Var = this.adSizeTools;
            str = "Error getting max current orientation banner height";
        } else {
            ironLog = IronLog.API;
            j1Var = this.adSizeTools;
            str = "The SDK must be successfully initialized to create an Adaptive Ad Size";
        }
        ironLog.error(j1.a(j1Var, str, (String) null, 2, (Object) null));
        return null;
    }

    private final List<LevelPlayAdSize> a() {
        return CollectionsKt.c0(new c(new b()), this.adSizeTools.b());
    }

    private final List<LevelPlayAdSize> a(List<LevelPlayAdSize> fallbackSortedList, int maxHeight, int maxWidth) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : fallbackSortedList) {
            LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
            if (levelPlayAdSize.getHeight() <= maxHeight && levelPlayAdSize.getWidth() <= maxWidth) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
