package x0;

import java.util.concurrent.ThreadPoolExecutor;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.c f53525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f53526b;

    public i(com.bumptech.glide.c cVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f53525a = cVar;
        this.f53526b = threadPoolExecutor;
    }

    @Override // com.bumptech.glide.c
    public final void y(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f53526b;
        try {
            this.f53525a.y(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // com.bumptech.glide.c
    public final void z(u uVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f53526b;
        try {
            this.f53525a.z(uVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
