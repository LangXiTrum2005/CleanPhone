package com.bytedance.adsdk.ugeno.jpc;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class ud {
    private final DataSetObservable qdl = new DataSetObservable();
    private DataSetObserver ud;

    public void lnr() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.ud;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.qdl.notifyChanged();
    }

    public float qdl(int i2) {
        return 1.0f;
    }

    public abstract int qdl();

    public abstract boolean qdl(View view, Object obj);

    public Parcelable ud() {
        return null;
    }

    public int qdl(Object obj) {
        return -1;
    }

    public Object qdl(ViewGroup viewGroup, int i2) {
        return qdl((View) viewGroup, i2);
    }

    public void qdl(ViewGroup viewGroup, int i2, Object obj) {
        qdl((View) viewGroup, i2, obj);
    }

    @Deprecated
    public Object qdl(View view, int i2) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void qdl(View view, int i2, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void qdl(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.ud = dataSetObserver;
        }
    }
}
