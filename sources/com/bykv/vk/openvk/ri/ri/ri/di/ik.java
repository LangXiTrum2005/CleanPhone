package com.bykv.vk.openvk.ri.ri.ri.di;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import eliminate.saneness;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends fi implements SurfaceHolder.Callback, attabal {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final ArrayList<eliminate.attabal> f17959monoploid = new ArrayList<>();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public eliminate.attabal f17960arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public WeakReference<saneness> f17961kowloon;

    public ik(Context context) {
        super(context);
        saneness();
    }

    @Override // com.bykv.vk.openvk.ri.ri.ri.di.attabal
    public void attabal(saneness sanenessVar) {
        this.f17961kowloon = new WeakReference<>(sanenessVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<eliminate.attabal> it = f17959monoploid.iterator();
        while (it.hasNext()) {
            eliminate.attabal next = it.next();
            if (next != null && next.attabal() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.f17960arytenoidectomy);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.bykv.vk.openvk.ri.ri.ri.di.attabal
    public void ri(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    public final void saneness() {
        eliminate.attabal attabalVar = new eliminate.attabal(this);
        this.f17960arytenoidectomy = attabalVar;
        f17959monoploid.add(attabalVar);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        WeakReference<saneness> weakReference = this.f17961kowloon;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f17961kowloon.get().ri(surfaceHolder, i, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference<saneness> weakReference = this.f17961kowloon;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f17961kowloon.get().ri(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference<saneness> weakReference = this.f17961kowloon;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f17961kowloon.get().lr(surfaceHolder);
    }

    @Override // com.bykv.vk.openvk.ri.ri.ri.di.attabal
    public View getView() {
        return this;
    }

    public void setWindowVisibilityChangedListener(attabal.InterfaceC0184attabal interfaceC0184attabal) {
    }
}
