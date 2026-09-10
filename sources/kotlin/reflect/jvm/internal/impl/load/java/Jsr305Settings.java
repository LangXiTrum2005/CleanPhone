package kotlin.reflect.jvm.internal.impl.load.java;

import com.applovin.impl.Z;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class Jsr305Settings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReportLevel f43759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReportLevel f43760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f43761c;
    public final Lazy d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f43762e;

    public Jsr305Settings(ReportLevel reportLevel, ReportLevel reportLevel2) {
        Map map = EmptyMap.X;
        this.f43759a = reportLevel;
        this.f43760b = reportLevel2;
        this.f43761c = map;
        this.d = LazyKt.b(new Function0<String[]>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings$description$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ListBuilder listBuilderP = CollectionsKt.p();
                Jsr305Settings jsr305Settings = this.X;
                listBuilderP.add(jsr305Settings.f43759a.X);
                ReportLevel reportLevel3 = jsr305Settings.f43760b;
                if (reportLevel3 != null) {
                    listBuilderP.add("under-migration:".concat(reportLevel3.X));
                }
                for (Map.Entry entry : jsr305Settings.f43761c.entrySet()) {
                    listBuilderP.add("@" + entry.getKey() + AbstractJsonLexerKt.COLON + ((ReportLevel) entry.getValue()).X);
                }
                return (String[]) CollectionsKt.m(listBuilderP).toArray(new String[0]);
            }
        });
        ReportLevel reportLevel3 = ReportLevel.IGNORE;
        this.f43762e = reportLevel == reportLevel3 && reportLevel2 == reportLevel3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jsr305Settings)) {
            return false;
        }
        Jsr305Settings jsr305Settings = (Jsr305Settings) obj;
        return this.f43759a == jsr305Settings.f43759a && this.f43760b == jsr305Settings.f43760b && Intrinsics.a(this.f43761c, jsr305Settings.f43761c);
    }

    public final int hashCode() {
        int iHashCode = this.f43759a.hashCode() * 31;
        ReportLevel reportLevel = this.f43760b;
        return this.f43761c.hashCode() + ((iHashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Jsr305Settings(globalLevel=");
        sb.append(this.f43759a);
        sb.append(", migrationLevel=");
        sb.append(this.f43760b);
        sb.append(", userDefinedLevelForSpecificAnnotation=");
        return Z.o(sb, this.f43761c, ')');
    }
}
