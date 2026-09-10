package com.bytedance.adsdk.ugeno.OY;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class LD {
    private DataSetObserver LD;
    private final DataSetObservable Lxb = new DataSetObservable();

    public Parcelable LD() {
        return null;
    }

    public float Lxb(int i) {
        return 1.0f;
    }

    public abstract int Lxb();

    public abstract boolean Lxb(View view, Object obj);

    public void lk() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.LD;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.Lxb.notifyChanged();
    }

    public int Lxb(Object obj) {
        return -1;
    }

    public Object Lxb(ViewGroup viewGroup, int i) {
        return Lxb((View) viewGroup, i);
    }

    public void Lxb(ViewGroup viewGroup, int i, Object obj) {
        Lxb((View) viewGroup, i, obj);
    }

    @Deprecated
    public Object Lxb(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void Lxb(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void Lxb(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.LD = dataSetObserver;
        }
    }
}
