package com.inmobi.media;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableList;

/* JADX INFO: renamed from: com.inmobi.media.c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2968c9 extends C2984d8 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f23488A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f23489B;
    public final boolean C;
    public int D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f23490E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public HashMap f23491F;
    public final boolean x;
    public final ArrayList y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f23492z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2968c9(String assetId, String assetName, C2951b9 assetStyle, Ve ve, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ArrayList arrayList, boolean z7) {
        super(assetId, assetName, "VIDEO", assetStyle, 16);
        Intrinsics.f(assetId, "assetId");
        Intrinsics.f(assetName, "assetName");
        Intrinsics.f(assetStyle, "assetStyle");
        this.x = z7;
        this.f23516e = ve;
        this.g = "EXTERNAL";
        this.f23492z = z2;
        this.f23488A = z3;
        this.f23489B = z4;
        this.C = z5;
        this.y = new ArrayList();
        Map map = null;
        this.f23521p = ve != null ? ((Ue) ve).k : null;
        ArrayList<U8> arrayList2 = ve != null ? ((Ue) ve).f23283h : null;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                U8 u8 = (U8) it.next();
                if ("OMID_VIEWABILITY".equals(u8.f23265b)) {
                    map = u8.f23266c;
                    if (!TextUtils.isEmpty(u8.d) && arrayList2 != null && (!(arrayList2 instanceof KMappedMarker) || (arrayList2 instanceof KMutableList))) {
                        arrayList2.add(u8);
                    }
                } else if (arrayList2 != null && (!(arrayList2 instanceof KMappedMarker) || (arrayList2 instanceof KMutableList))) {
                    arrayList2.add(u8);
                }
            }
        }
        if (arrayList2 != null) {
            for (U8 u9 : arrayList2) {
                if ("OMID_VIEWABILITY".equals(u9.f23265b)) {
                    u9.f23266c = map;
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            this.s.addAll(arrayList2);
        }
        HashMap map2 = this.t;
        map2.put("placementType", (byte) 0);
        map2.put("lastVisibleTimestamp", Integer.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        map2.put("visible", bool);
        map2.put("seekPosition", 0);
        map2.put("didStartPlaying", bool);
        map2.put("didPause", bool);
        map2.put("didCompleteQ1", bool);
        map2.put("didCompleteQ2", bool);
        map2.put("didCompleteQ3", bool);
        map2.put("didCompleteQ4", bool);
        map2.put("didRequestFullScreen", bool);
        map2.put("isFullScreen", bool);
        map2.put("didImpressionFire", bool);
        map2.put("mapViewabilityParams", new HashMap());
        map2.put("didSignalVideoCompleted", bool);
        map2.put("shouldAutoPlay", Boolean.valueOf(z6));
        androidx.datastore.preferences.protobuf.a.v(0, map2, "lastMediaVolume", 0, "currentMediaVolume");
        map2.put("didQ4Fire", bool);
    }

    public final void a(HashMap map) {
        this.f23491F = new HashMap(map);
    }

    public final int b() {
        return this.D;
    }

    public final boolean c() {
        if (this.x) {
            return this.f23492z && !Uc.o();
        }
        return this.f23492z;
    }

    public final void d(int i2) {
        this.f23490E = i2;
    }

    public final void a(C2968c9 source) {
        HashMap map;
        Intrinsics.f(source, "source");
        this.t.putAll(source.t);
        HashMap map2 = source.f23491F;
        if (map2 != null && (map = this.f23491F) != null) {
            map.putAll(map2);
        }
        ArrayList trackers = source.s;
        Intrinsics.f(trackers, "trackers");
        this.s.addAll(trackers);
    }

    public final Ve d() {
        Object obj = this.f23516e;
        if (obj instanceof Ve) {
            return (Ve) obj;
        }
        return null;
    }

    public final void c(int i2) {
        this.D = i2;
    }
}
