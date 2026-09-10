package com.p004ironsource.mediationsdk.adquality;

import com.p004ironsource.ne;
import com.p004ironsource.us;
import com.p004ironsource.xi;
import com.smartdigimkt.h5.f;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\n"}, d2 = {"Lcom/ironsource/mediationsdk/adquality/a;", "", "", "modeValue", "", "a", "", "b", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static EnumC0285a f25735b = EnumC0285a.DONT_INITIALIZE;

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/ironsource/mediationsdk/adquality/a$a;", "", "", "a", "I", "b", "()I", "value", "<init>", "(Ljava/lang/String;II)V", "c", "d", "e", f.j, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public enum EnumC0285a {
        DONT_INITIALIZE(0),
        LEVELPLAY_ONLY(1),
        ALL_MEDIATIONS(2),
        OTHER_ONLY(3);


        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/ironsource/mediationsdk/adquality/a$a$a;", "", "", "value", "Lcom/ironsource/mediationsdk/adquality/a$a;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            private Companion() {
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0017  */
            /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
            public final EnumC0285a a(int value) {
                for (EnumC0285a enumC0285a : EnumC0285a.values()) {
                    if (enumC0285a.getValue() == value) {
                        if (enumC0285a == null) {
                            return EnumC0285a.DONT_INITIALIZE;
                        }
                        return enumC0285a;
                    }
                }
                enumC0285a = null;
                if (enumC0285a == null) {
                    return EnumC0285a.DONT_INITIALIZE;
                }
                return enumC0285a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        EnumC0285a(int i2) {
            this.value = i2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0005\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ironsource/mediationsdk/adquality/a$b;", "", "Lcom/ironsource/mediationsdk/adquality/a$a;", "adQualitySdkInitMode", "Lcom/ironsource/mediationsdk/adquality/a$a;", "a", "()Lcom/ironsource/mediationsdk/adquality/a$a;", "(Lcom/ironsource/mediationsdk/adquality/a$a;)V", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public final EnumC0285a a() {
            return a.f25735b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(EnumC0285a enumC0285a) {
            Intrinsics.f(enumC0285a, "<set-?>");
            a.f25735b = enumC0285a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25740a;

        static {
            int[] iArr = new int[EnumC0285a.values().length];
            try {
                iArr[EnumC0285a.LEVELPLAY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0285a.ALL_MEDIATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0285a.OTHER_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25740a = iArr;
        }
    }

    public final boolean b() throws JSONException {
        us usVar;
        us usVar2;
        JSONArray jSONArrayOptJSONArray = new xi().a().optJSONArray(ne.f0);
        if (jSONArrayOptJSONArray == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArrayOptJSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = jSONArrayOptJSONArray.getInt(i2);
            us[] usVarArrValues = us.values();
            int length2 = usVarArrValues.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    usVar2 = null;
                    break;
                }
                usVar2 = usVarArrValues[i4];
                if (usVar2.getValue() == i3) {
                    break;
                }
                i4++;
            }
            if (usVar2 != null) {
                linkedHashSet.add(usVar2);
            }
        }
        int i5 = c.f25740a[f25735b.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    usVar = us.EXTERNAL_MEDIATION_INIT;
                }
            } else if (linkedHashSet.contains(us.LEVEL_PLAY_INIT) || linkedHashSet.contains(us.EXTERNAL_MEDIATION_INIT)) {
                return true;
            }
            return false;
        }
        usVar = us.LEVEL_PLAY_INIT;
        return linkedHashSet.contains(usVar);
    }

    public final void a(int modeValue) {
        f25735b = EnumC0285a.INSTANCE.a(modeValue);
    }
}
