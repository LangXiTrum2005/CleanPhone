package com.ironsource.mediationsdk.adquality;

import com.ironsource.C0318e9;
import com.ironsource.EnumC0609ue;
import com.ironsource.O6;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f29285a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static EnumC0078a f29286b = EnumC0078a.DONT_INITIALIZE;

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum EnumC0078a {
        DONT_INITIALIZE(0),
        LEVELPLAY_ONLY(1),
        ALL_MEDIATIONS(2),
        OTHER_ONLY(3);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0079a f29287b = new C0079a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29293a;

        /* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class C0079a {
            public /* synthetic */ C0079a(g gVar) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0017  */
            /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
            public final EnumC0078a a(int i10) {
                for (EnumC0078a enumC0078a : EnumC0078a.values()) {
                    if (enumC0078a.b() == i10) {
                        if (enumC0078a == null) {
                            return EnumC0078a.DONT_INITIALIZE;
                        }
                        return enumC0078a;
                    }
                }
                enumC0078a = null;
                if (enumC0078a == null) {
                    return EnumC0078a.DONT_INITIALIZE;
                }
                return enumC0078a;
            }

            private C0079a() {
            }
        }

        EnumC0078a(int i10) {
            this.f29293a = i10;
        }

        public final int b() {
            return this.f29293a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        public final EnumC0078a a() {
            return a.f29286b;
        }

        private b() {
        }

        public final void a(EnumC0078a enumC0078a) {
            n.f(enumC0078a, "<set-?>");
            a.f29286b = enumC0078a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29294a;

        static {
            int[] iArr = new int[EnumC0078a.values().length];
            try {
                iArr[EnumC0078a.LEVELPLAY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0078a.ALL_MEDIATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0078a.OTHER_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29294a = iArr;
        }
    }

    public final boolean b() throws JSONException {
        EnumC0609ue enumC0609ue;
        JSONArray jSONArrayOptJSONArray = new C0318e9().a().optJSONArray(O6.g0);
        if (jSONArrayOptJSONArray == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArrayOptJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = jSONArrayOptJSONArray.getInt(i10);
            EnumC0609ue[] enumC0609ueArrValues = EnumC0609ue.values();
            int length2 = enumC0609ueArrValues.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    enumC0609ue = null;
                    break;
                }
                enumC0609ue = enumC0609ueArrValues[i12];
                if (enumC0609ue.b() == i11) {
                    break;
                }
                i12++;
            }
            if (enumC0609ue != null) {
                linkedHashSet.add(enumC0609ue);
            }
        }
        int i13 = c.f29294a[f29286b.ordinal()];
        if (i13 == 1) {
            return linkedHashSet.contains(EnumC0609ue.LEVEL_PLAY_INIT);
        }
        if (i13 != 2) {
            if (i13 == 3) {
                return linkedHashSet.contains(EnumC0609ue.EXTERNAL_MEDIATION_INIT);
            }
        } else if (linkedHashSet.contains(EnumC0609ue.LEVEL_PLAY_INIT) || linkedHashSet.contains(EnumC0609ue.EXTERNAL_MEDIATION_INIT)) {
            return true;
        }
        return false;
    }

    public final void a(int i10) {
        f29286b = EnumC0078a.f29287b.a(i10);
    }
}
