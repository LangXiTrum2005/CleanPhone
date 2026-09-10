package kotlin.reflect;

import com.thinkup.core.api.TUCountryCode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/KVariance;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KVariance {
    public static final KVariance X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final KVariance f43355Y;
    public static final KVariance Z;
    public static final /* synthetic */ KVariance[] e0;
    public static final /* synthetic */ EnumEntries f0;

    static {
        KVariance kVariance = new KVariance("INVARIANT", 0);
        X = kVariance;
        KVariance kVariance2 = new KVariance(TUCountryCode.INDIA, 1);
        f43355Y = kVariance2;
        KVariance kVariance3 = new KVariance("OUT", 2);
        Z = kVariance3;
        KVariance[] kVarianceArr = {kVariance, kVariance2, kVariance3};
        e0 = kVarianceArr;
        f0 = EnumEntriesKt.a(kVarianceArr);
    }

    public static KVariance valueOf(String str) {
        return (KVariance) Enum.valueOf(KVariance.class, str);
    }

    public static KVariance[] values() {
        return (KVariance[]) e0.clone();
    }
}
