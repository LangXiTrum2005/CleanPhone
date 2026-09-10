package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Comparable f10518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10519d;

    public /* synthetic */ b(int i10, Comparable comparable, Object obj) {
        this.f10516a = i10;
        this.f10519d = obj;
        this.f10518c = comparable;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        switch (this.f10516a) {
            case 0:
                Object obj = this.f10517b;
                if (obj != null) {
                    try {
                        g(obj);
                    } catch (IOException unused) {
                        return;
                    }
                    break;
                }
                break;
            default:
                Object obj2 = this.f10517b;
                if (obj2 != null) {
                    try {
                        g(obj2);
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        switch (this.f10516a) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i10 = this.f10516a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d(com.bumptech.glide.f fVar, d dVar) {
        switch (this.f10516a) {
            case 0:
                try {
                    Object objI = i((AssetManager) this.f10519d, (String) this.f10518c);
                    this.f10517b = objI;
                    dVar.z0(objI);
                } catch (IOException e10) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e10);
                    }
                    dVar.h(e10);
                    return;
                }
                break;
            default:
                try {
                    Object objH = h((ContentResolver) this.f10519d, (Uri) this.f10518c);
                    this.f10517b = objH;
                    dVar.z0(objH);
                } catch (FileNotFoundException e11) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e11);
                    }
                    dVar.h(e11);
                }
                break;
        }
    }

    public abstract void g(Object obj);

    public abstract Object h(ContentResolver contentResolver, Uri uri);

    public abstract Object i(AssetManager assetManager, String str);

    private final void e() {
    }

    private final void f() {
    }
}
