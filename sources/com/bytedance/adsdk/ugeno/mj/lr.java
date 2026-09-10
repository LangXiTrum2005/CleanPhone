package com.bytedance.adsdk.ugeno.mj;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lr {
    private DataSetObserver lr;
    private final DataSetObservable ri = new DataSetObservable();

    public void ik() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.lr;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.ri.notifyChanged();
    }

    public Parcelable lr() {
        return null;
    }

    public float ri(int i) {
        return 1.0f;
    }

    public abstract int ri();

    public abstract boolean ri(View view, Object obj);

    public int ri(Object obj) {
        return -1;
    }

    public Object ri(ViewGroup viewGroup, int i) {
        return ri((View) viewGroup, i);
    }

    public void ri(ViewGroup viewGroup, int i, Object obj) {
        ri((View) viewGroup, i, obj);
    }

    @Deprecated
    public Object ri(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void ri(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void ri(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.lr = dataSetObserver;
        }
    }
}
