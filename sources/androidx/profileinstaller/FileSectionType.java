package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
enum FileSectionType {
    DEX_FILES(0),
    /* JADX INFO: Fake field, exist only in values array */
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATION_COUNT(4);

    public final long X;

    FileSectionType(long j) {
        this.X = j;
    }
}
