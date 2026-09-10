package com.inmobi.media;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.d8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C2984d8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23515c;
    public final C3001e8 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f23516e;
    public boolean f;
    public String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f23517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23518i;
    public byte j;
    public byte k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f23519l;
    public byte m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f23520n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f23521p;
    public String q;
    public C3049h8 r;
    public final ArrayList s;
    public final HashMap t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f23522u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C2984d8 f23523w;

    public C2984d8(String assetId, String assetName, String assetType, C3001e8 assetStyle, List trackers) {
        Intrinsics.f(assetId, "assetId");
        Intrinsics.f(assetName, "assetName");
        Intrinsics.f(assetType, "assetType");
        Intrinsics.f(assetStyle, "assetStyle");
        Intrinsics.f(trackers, "trackers");
        this.f23513a = assetId;
        this.f23514b = assetName;
        this.f23515c = assetType;
        this.d = assetStyle;
        this.g = "NO_ACTION";
        this.f23517h = "";
        this.m = (byte) 2;
        this.f23520n = -1;
        this.f23521p = "";
        this.q = "";
        ArrayList arrayList = new ArrayList();
        this.s = arrayList;
        this.t = new HashMap();
        arrayList.addAll(trackers);
    }

    public static void a(U8 tracker, HashMap map, L7 l7, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(tracker, "tracker");
        C3298x2.f24089a.a(T9.a(tracker.d, map), tracker.f23266c, true, l7, Ta.f23232b, interfaceC3333z5);
    }

    public static void d(String str) {
        Intrinsics.f(str, "<set-?>");
    }

    public final void b(byte b2) {
        this.m = b2;
    }

    public final void c(String str) {
        Intrinsics.f(str, "<set-?>");
    }

    public final void b(int i2) {
        this.f23520n = i2;
    }

    public final void b(String str) {
        String string;
        if (str != null) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                boolean z3 = Intrinsics.h(str.charAt(!z2 ? i2 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i2++;
                } else {
                    z2 = true;
                }
            }
            string = str.subSequence(i2, length + 1).toString();
        } else {
            string = null;
        }
        this.f23521p = string;
    }

    public final void a(byte b2) {
        this.j = b2;
    }

    public final void a(int i2) {
        this.o = i2;
    }

    public final void a(C3049h8 c3049h8) {
        this.r = c3049h8;
    }

    public final HashMap a() {
        return this.t;
    }

    public final void a(String eventType, HashMap map, L7 l7, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(eventType, "eventType");
        for (U8 u8 : this.s) {
            if (eventType.equals(u8.f23265b)) {
                a(u8, map, l7, interfaceC3333z5);
            }
        }
    }

    public /* synthetic */ C2984d8(String str, String str2, String str3, C3001e8 c3001e8, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "root" : str2, (i2 & 4) != 0 ? "CONTAINER" : str3, (i2 & 8) != 0 ? new C3001e8() : c3001e8, new LinkedList());
    }

    public final void a(String value) {
        Intrinsics.f(value, "value");
        int length = value.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean z3 = Intrinsics.h(value.charAt(!z2 ? i2 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                } else {
                    length--;
                }
            } else if (z3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        this.q = value.subSequence(i2, length + 1).toString();
    }
}
