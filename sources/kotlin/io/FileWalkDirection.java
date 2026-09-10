package kotlin.io;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/FileWalkDirection;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileWalkDirection {
    public static final FileWalkDirection X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ FileWalkDirection[] f43314Y;
    public static final /* synthetic */ EnumEntries Z;

    static {
        FileWalkDirection fileWalkDirection = new FileWalkDirection("TOP_DOWN", 0);
        X = fileWalkDirection;
        FileWalkDirection[] fileWalkDirectionArr = {fileWalkDirection, new FileWalkDirection("BOTTOM_UP", 1)};
        f43314Y = fileWalkDirectionArr;
        Z = EnumEntriesKt.a(fileWalkDirectionArr);
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) f43314Y.clone();
    }
}
