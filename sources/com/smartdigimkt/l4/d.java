package com.smartdigimkt.l4;

import android.util.SparseArray;
import com.smartdigimkt.b4.k;
import com.smartdigimkt.p4.s;
import com.smartdigimkt.w3.m;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements com.smartdigimkt.b4.g {
    public final com.smartdigimkt.b4.e X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final int f36345Y;
    private final m Z;
    private final SparseArray<a> e0 = new SparseArray<>();
    private boolean f0;
    private b g0;
    private k h0;
    private m[] i0;

    public interface b {
        com.smartdigimkt.b4.m a(int i2, int i3);
    }

    public d(com.smartdigimkt.b4.e eVar, int i2, m mVar) {
        this.X = eVar;
        this.f36345Y = i2;
        this.Z = mVar;
    }

    public void a(b bVar, long j) {
        this.g0 = bVar;
        if (!this.f0) {
            this.X.a(this);
            if (j != -9223372036854775807L) {
                this.X.a(0L, j);
            }
            this.f0 = true;
            return;
        }
        com.smartdigimkt.b4.e eVar = this.X;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        eVar.a(0L, j);
        for (int i2 = 0; i2 < this.e0.size(); i2++) {
            this.e0.valueAt(i2).a(bVar);
        }
    }

    public m[] b() {
        return this.i0;
    }

    public k c() {
        return this.h0;
    }

    public static final class a implements com.smartdigimkt.b4.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f36346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f36347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final m f36348c;
        public m d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.smartdigimkt.b4.m f36349e;

        public a(int i2, int i3, m mVar) {
            this.f36346a = i2;
            this.f36347b = i3;
            this.f36348c = mVar;
        }

        public void a(b bVar) {
            if (bVar == null) {
                this.f36349e = new com.smartdigimkt.b4.d();
                return;
            }
            com.smartdigimkt.b4.m mVarA = bVar.a(this.f36346a, this.f36347b);
            this.f36349e = mVarA;
            m mVar = this.d;
            if (mVar != null) {
                mVarA.a(mVar);
            }
        }

        @Override // com.smartdigimkt.b4.m
        public void a(m mVar) {
            m mVar2 = this.f36348c;
            if (mVar2 != null) {
                mVar = mVar.a(mVar2);
            }
            this.d = mVar;
            this.f36349e.a(mVar);
        }

        @Override // com.smartdigimkt.b4.m
        public int a(com.smartdigimkt.b4.f fVar, int i2, boolean z2) throws InterruptedException, IOException {
            return this.f36349e.a(fVar, i2, z2);
        }

        @Override // com.smartdigimkt.b4.m
        public void a(s sVar, int i2) {
            this.f36349e.a(sVar, i2);
        }

        @Override // com.smartdigimkt.b4.m
        public void a(long j, int i2, int i3, int i4, com.smartdigimkt.b4.m.a aVar) {
            this.f36349e.a(j, i2, i3, i4, aVar);
        }
    }

    @Override // com.smartdigimkt.b4.g
    public com.smartdigimkt.b4.m a(int i2, int i3) {
        a aVar = this.e0.get(i2);
        if (aVar == null) {
            com.smartdigimkt.p4.a.b(this.i0 == null);
            aVar = new a(i2, i3, i3 == this.f36345Y ? this.Z : null);
            aVar.a(this.g0);
            this.e0.put(i2, aVar);
        }
        return aVar;
    }

    @Override // com.smartdigimkt.b4.g
    public void a() {
        m[] mVarArr = new m[this.e0.size()];
        for (int i2 = 0; i2 < this.e0.size(); i2++) {
            mVarArr[i2] = this.e0.valueAt(i2).d;
        }
        this.i0 = mVarArr;
    }

    @Override // com.smartdigimkt.b4.g
    public void a(k kVar) {
        this.h0 = kVar;
    }
}
