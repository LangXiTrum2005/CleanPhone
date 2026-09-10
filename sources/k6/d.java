package k6;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.bumptech.glide.load.data.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f44339b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f44338a = i10;
        this.f44339b = obj;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f44338a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f44339b.getClass();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        int i10 = this.f44338a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        switch (this.f44338a) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i10 = this.f44338a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d(com.bumptech.glide.f fVar, com.bumptech.glide.load.data.d dVar) {
        switch (this.f44338a) {
            case 0:
                try {
                    dVar.z0(a7.c.a((File) this.f44339b));
                } catch (IOException e10) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                    }
                    dVar.h(e10);
                    return;
                }
                break;
            default:
                dVar.z0(this.f44339b);
                break;
        }
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
