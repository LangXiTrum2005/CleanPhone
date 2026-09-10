package com.tiktok.appevents.edp;

import android.view.View;
import android.view.ViewGroup;
import com.tiktok.appevents.edp.proxy.ITouchListener;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class TTHierarchyHelper {

    /* JADX INFO: renamed from: com.tiktok.appevents.edp.TTHierarchyHelper$1, reason: invalid class name */
    final class AnonymousClass1 implements ITouchListener {

        /* JADX INFO: renamed from: com.tiktok.appevents.edp.TTHierarchyHelper$1$1, reason: invalid class name and collision with other inner class name */
        class RunnableC07551 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.tiktok.appevents.edp.TTHierarchyHelper$2, reason: invalid class name */
    final class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                throw null;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.tiktok.appevents.edp.TTHierarchyHelper$3, reason: invalid class name */
    final class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            int i2 = EDPConfig.f42669a;
        }
    }

    /* JADX INFO: renamed from: com.tiktok.appevents.edp.TTHierarchyHelper$4, reason: invalid class name */
    final class AnonymousClass4 implements ViewGroup.OnHierarchyChangeListener {
        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            new WeakReference(view2);
            throw null;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
        }
    }
}
