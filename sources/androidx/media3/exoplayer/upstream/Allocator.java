package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public interface Allocator {

    public interface AllocationNode {
        Allocation a();

        AllocationNode next();
    }

    void a(AllocationNode allocationNode);

    Allocation allocate();

    void b(Allocation allocation);

    int getIndividualAllocationLength();

    void trim();
}
