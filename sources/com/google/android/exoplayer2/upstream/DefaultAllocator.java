package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultAllocator implements Allocator {
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18757e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18754a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18755b = 65536;
    public int f = 0;
    public Allocation[] g = new Allocation[100];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f18756c = null;

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public final synchronized void a(Allocator.AllocationNode allocationNode) {
        while (allocationNode != null) {
            try {
                Allocation[] allocationArr = this.g;
                int i2 = this.f;
                this.f = i2 + 1;
                allocationArr[i2] = allocationNode.a();
                this.f18757e--;
                allocationNode = allocationNode.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public final synchronized Allocation allocate() {
        Allocation allocation;
        try {
            int i2 = this.f18757e + 1;
            this.f18757e = i2;
            int i3 = this.f;
            if (i3 > 0) {
                Allocation[] allocationArr = this.g;
                int i4 = i3 - 1;
                this.f = i4;
                allocation = allocationArr[i4];
                allocation.getClass();
                this.g[this.f] = null;
            } else {
                Allocation allocation2 = new Allocation(new byte[this.f18755b], 0);
                Allocation[] allocationArr2 = this.g;
                if (i2 > allocationArr2.length) {
                    this.g = (Allocation[]) Arrays.copyOf(allocationArr2, allocationArr2.length * 2);
                }
                allocation = allocation2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return allocation;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public final synchronized void b(Allocation allocation) {
        Allocation[] allocationArr = this.g;
        int i2 = this.f;
        this.f = i2 + 1;
        allocationArr[i2] = allocation;
        this.f18757e--;
        notifyAll();
    }

    public final synchronized void c(int i2) {
        boolean z2 = i2 < this.d;
        this.d = i2;
        if (z2) {
            trim();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public final int getIndividualAllocationLength() {
        return this.f18755b;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public final synchronized void trim() {
        try {
            int i2 = 0;
            int iMax = Math.max(0, Util.g(this.d, this.f18755b) - this.f18757e);
            int i3 = this.f;
            if (iMax >= i3) {
                return;
            }
            if (this.f18756c != null) {
                int i4 = i3 - 1;
                while (i2 <= i4) {
                    Allocation allocation = this.g[i2];
                    allocation.getClass();
                    if (allocation.f18721a == this.f18756c) {
                        i2++;
                    } else {
                        Allocation allocation2 = this.g[i4];
                        allocation2.getClass();
                        if (allocation2.f18721a != this.f18756c) {
                            i4--;
                        } else {
                            Allocation[] allocationArr = this.g;
                            allocationArr[i2] = allocation2;
                            allocationArr[i4] = allocation;
                            i4--;
                            i2++;
                        }
                    }
                }
                iMax = Math.max(iMax, i2);
                if (iMax >= this.f) {
                    return;
                }
            }
            Arrays.fill(this.g, iMax, this.f, (Object) null);
            this.f = iMax;
        } catch (Throwable th) {
            throw th;
        }
    }
}
