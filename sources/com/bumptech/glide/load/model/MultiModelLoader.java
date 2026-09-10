package com.bumptech.glide.load.model;

import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
class MultiModelLoader<Model, Data> implements ModelLoader<Model, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pools.Pool f12583b;

    public static class MultiFetcher<Data> implements DataFetcher<Data>, DataFetcher.DataCallback<Data> {
        public final ArrayList X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Pools.Pool f12584Y;
        public int Z;
        public Priority e0;
        public DataFetcher.DataCallback f0;
        public List g0;
        public boolean h0;

        public MultiFetcher(ArrayList arrayList, Pools.Pool pool) {
            this.f12584Y = pool;
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("Must not be empty.");
            }
            this.X = arrayList;
            this.Z = 0;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final Class a() {
            return ((DataFetcher) this.X.get(0)).a();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void b() {
            List list = this.g0;
            if (list != null) {
                this.f12584Y.a(list);
            }
            this.g0 = null;
            Iterator it = this.X.iterator();
            while (it.hasNext()) {
                ((DataFetcher) it.next()).b();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
        public final void c(Exception exc) {
            List list = this.g0;
            Preconditions.c(list, "Argument must not be null");
            list.add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cancel() {
            this.h0 = true;
            Iterator it = this.X.iterator();
            while (it.hasNext()) {
                ((DataFetcher) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final DataSource d() {
            return ((DataFetcher) this.X.get(0)).d();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void e(Priority priority, DataFetcher.DataCallback dataCallback) {
            this.e0 = priority;
            this.f0 = dataCallback;
            this.g0 = (List) this.f12584Y.b();
            ((DataFetcher) this.X.get(this.Z)).e(priority, this);
            if (this.h0) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
        public final void f(Object obj) {
            if (obj != null) {
                this.f0.f(obj);
            } else {
                g();
            }
        }

        public final void g() {
            if (this.h0) {
                return;
            }
            if (this.Z < this.X.size() - 1) {
                this.Z++;
                e(this.e0, this.f0);
            } else {
                Preconditions.b(this.g0);
                this.f0.c(new GlideException("Fetch failed", new ArrayList(this.g0)));
            }
        }
    }

    public MultiModelLoader(ArrayList arrayList, Pools.Pool pool) {
        this.f12582a = arrayList;
        this.f12583b = pool;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean a(Object obj) {
        Iterator it = this.f12582a.iterator();
        while (it.hasNext()) {
            if (((ModelLoader) it.next()).a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData b(Object obj, int i2, int i3, Options options) {
        ModelLoader.LoadData loadDataB;
        ArrayList arrayList = this.f12582a;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        Key key = null;
        for (int i4 = 0; i4 < size; i4++) {
            ModelLoader modelLoader = (ModelLoader) arrayList.get(i4);
            if (modelLoader.a(obj) && (loadDataB = modelLoader.b(obj, i2, i3, options)) != null) {
                arrayList2.add(loadDataB.f12577c);
                key = loadDataB.f12575a;
            }
        }
        if (arrayList2.isEmpty() || key == null) {
            return null;
        }
        return new ModelLoader.LoadData(key, new MultiFetcher(arrayList2, this.f12583b));
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f12582a.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
