package kotlin.io.path;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/path/PathWalkOption;", "", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PathWalkOption {
    public static final PathWalkOption X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ PathWalkOption[] f43322Y;
    public static final /* synthetic */ EnumEntries Z;

    /* JADX INFO: Fake field, exist only in values array */
    PathWalkOption EF0;

    static {
        PathWalkOption pathWalkOption = new PathWalkOption("INCLUDE_DIRECTORIES", 0);
        PathWalkOption pathWalkOption2 = new PathWalkOption("BREADTH_FIRST", 1);
        X = pathWalkOption2;
        PathWalkOption[] pathWalkOptionArr = {pathWalkOption, pathWalkOption2, new PathWalkOption("FOLLOW_LINKS", 2)};
        f43322Y = pathWalkOptionArr;
        Z = EnumEntriesKt.a(pathWalkOptionArr);
    }

    public static PathWalkOption valueOf(String str) {
        return (PathWalkOption) Enum.valueOf(PathWalkOption.class, str);
    }

    public static PathWalkOption[] values() {
        return (PathWalkOption[]) f43322Y.clone();
    }
}
