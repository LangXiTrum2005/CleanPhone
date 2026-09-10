package p002kotlin.reflect.jvm.internal.impl.builtins.functions;

import byname.dern;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: FunctionTypeKindExtractor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class beachfront {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final attabal f29786dern = new attabal(null);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final beachfront f29787wireman = new beachfront(adultoid.kowloon(marial.attabal.f29796marial, marial.wireman.f29799marial, marial.saneness.f29798marial, marial.dern.f29797marial));

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<marial> f29788attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<dern, List<marial>> f29789saneness;

    /* JADX INFO: compiled from: FunctionTypeKindExtractor.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final beachfront attabal() {
            return beachfront.f29787wireman;
        }

        public attabal() {
        }
    }

    /* JADX INFO: compiled from: FunctionTypeKindExtractor.kt */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final marial f29790attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f29791saneness;

        public saneness(marial kind, int i) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            this.f29790attabal = kind;
            this.f29791saneness = i;
        }

        public final marial attabal() {
            return this.f29790attabal;
        }

        public final marial dern() {
            return this.f29790attabal;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof saneness)) {
                return false;
            }
            saneness sanenessVar = (saneness) obj;
            return Intrinsics.wireman(this.f29790attabal, sanenessVar.f29790attabal) && this.f29791saneness == sanenessVar.f29791saneness;
        }

        public int hashCode() {
            return (this.f29790attabal.hashCode() * 31) + Integer.hashCode(this.f29791saneness);
        }

        public final int saneness() {
            return this.f29791saneness;
        }

        public String toString() {
            return "KindWithArity(kind=" + this.f29790attabal + ", arity=" + this.f29791saneness + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public beachfront(List<? extends marial> kinds) {
        Intrinsics.checkNotNullParameter(kinds, "kinds");
        this.f29788attabal = kinds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : kinds) {
            dern dernVarSaneness = ((marial) obj).saneness();
            Object arrayList = linkedHashMap.get(dernVarSaneness);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(dernVarSaneness, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f29789saneness = linkedHashMap;
    }

    public final saneness dern(dern packageFqName, String className) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(className, "className");
        List<marial> list = this.f29789saneness.get(packageFqName);
        if (list == null) {
            return null;
        }
        for (marial marialVar : list) {
            if (dovishness.starveling(className, marialVar.attabal(), false, 2, null)) {
                String strSubstring = className.substring(marialVar.attabal().length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                Integer numWireman = wireman(strSubstring);
                if (numWireman != null) {
                    return new saneness(marialVar, numWireman.intValue());
                }
            }
        }
        return null;
    }

    public final marial saneness(dern packageFqName, String className) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(className, "className");
        saneness sanenessVarDern = dern(packageFqName, className);
        if (sanenessVarDern != null) {
            return sanenessVarDern.dern();
        }
        return null;
    }

    public final Integer wireman(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int iCharAt = str.charAt(i2) - '0';
            if (iCharAt < 0 || iCharAt >= 10) {
                return null;
            }
            i = (i * 10) + iCharAt;
        }
        return Integer.valueOf(i);
    }
}
