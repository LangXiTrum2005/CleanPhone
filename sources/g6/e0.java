package g6;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements h, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f41588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f41589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f41590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile e f41591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f41592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile k6.q f41593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile f f41594g;

    public e0(i iVar, j jVar) {
        this.f41588a = iVar;
        this.f41589b = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // g6.h
    public final boolean a() {
        boolean z10;
        if (this.f41592e == null) {
            if (this.f41591d != null) {
            }
            this.f41591d = null;
            this.f41593f = null;
            z10 = false;
            while (!z10) {
                ArrayList arrayListB = this.f41588a.b();
                int i10 = this.f41590c;
                this.f41590c = i10 + 1;
                this.f41593f = (k6.q) arrayListB.get(i10);
                if (this.f41593f == null) {
                }
            }
            return z10;
        }
        Object obj = this.f41592e;
        this.f41592e = null;
        try {
            if (d(obj)) {
                if (this.f41591d != null || !this.f41591d.a()) {
                    this.f41591d = null;
                    this.f41593f = null;
                    z10 = false;
                    while (!z10 && this.f41590c < this.f41588a.b().size()) {
                        ArrayList arrayListB2 = this.f41588a.b();
                        int i11 = this.f41590c;
                        this.f41590c = i11 + 1;
                        this.f41593f = (k6.q) arrayListB2.get(i11);
                        if (this.f41593f == null && (this.f41588a.f41611p.a(this.f41593f.f44371c.c()) || this.f41588a.c(this.f41593f.f44371c.a()) != null)) {
                            this.f41593f.f44371c.d(this.f41588a.f41610o, new eb.d0(16, this, this.f41593f));
                            z10 = true;
                        }
                    }
                    return z10;
                }
            }
        } catch (IOException e10) {
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e10);
            }
        }
        return true;
    }

    @Override // g6.g
    public final void b(e6.f fVar, Object obj, com.bumptech.glide.load.data.e eVar, int i10, e6.f fVar2) {
        this.f41589b.b(fVar, obj, eVar, this.f41593f.f44371c.c(), fVar);
    }

    @Override // g6.g
    public final void c(e6.f fVar, Exception exc, com.bumptech.glide.load.data.e eVar, int i10) {
        this.f41589b.c(fVar, exc, eVar, this.f41593f.f44371c.c());
    }

    @Override // g6.h
    public final void cancel() {
        k6.q qVar = this.f41593f;
        if (qVar != null) {
            qVar.f44371c.cancel();
        }
    }

    public final boolean d(Object obj) throws Throwable {
        Throwable th2;
        int i10 = a7.j.f3432b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z10 = false;
        try {
            com.bumptech.glide.load.data.g gVarG = this.f41588a.f41599c.a().g(obj);
            Object objA = gVarG.a();
            e6.b bVarD = this.f41588a.d(objA);
            v9.e eVar = new v9.e(bVarD, objA, this.f41588a.f41605i, false, 16);
            e6.f fVar = this.f41593f.f44369a;
            i iVar = this.f41588a;
            f fVar2 = new f(fVar, iVar.f41609n);
            i6.a aVarA = iVar.f41604h.a();
            aVarA.l(fVar2, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + fVar2 + ", data: " + obj + ", encoder: " + bVarD + ", duration: " + a7.j.a(jElapsedRealtimeNanos));
            }
            if (aVarA.j(fVar2) != null) {
                this.f41594g = fVar2;
                this.f41591d = new e(Collections.singletonList(this.f41593f.f44369a), this.f41588a, this);
                this.f41593f.f44371c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f41594g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f41589b.b(this.f41593f.f44369a, gVarG.a(), this.f41593f.f44371c, this.f41593f.f44371c.c(), this.f41593f.f44369a);
                return false;
            } catch (Throwable th3) {
                th2 = th3;
                z10 = true;
                if (z10) {
                    throw th2;
                }
                this.f41593f.f44371c.b();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }
}
