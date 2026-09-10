package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes3.dex */
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
