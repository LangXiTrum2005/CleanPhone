package com.thinkup.core.common.inner.mixad.om;

import android.view.MotionEvent;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class m {
    public static int m = 1;
    public static int m0 = 2;
    private static final String mo = "m";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f41821n = 2;
    public static int o = 0;
    public static int o0 = 3;
    public static int om = 5;
    public static int on = 1;
    public static int oo = 4;
    private List<View> mm;
    private View mn;
    private View n0;
    private float nm;
    private float nn;
    private View no;
    private float o00;
    private int o0m;
    private float o0o;

    public static class o {
        private View m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private View f41822n;
        private List<View> o;
        private View o0;

        public final o m(View view) {
            this.f41822n = view;
            return this;
        }

        public final o n(View view) {
            this.o0 = view;
            return this;
        }

        public final o o(List<View> list) {
            this.o = list;
            return this;
        }

        public final o o(View view) {
            this.m = view;
            return this;
        }

        public final m o() {
            m mVar = new m((byte) 0);
            mVar.mm = this.o;
            mVar.mn = this.m;
            mVar.n0 = this.f41822n;
            mVar.no = this.o0;
            return mVar;
        }
    }

    public /* synthetic */ m(byte b2) {
        this();
    }

    private m() {
        this.o0m = o;
    }

    public final void o(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.o0m = om;
            this.nn = (int) motionEvent.getRawX();
            this.o0o = (int) motionEvent.getRawY();
            this.nm = (int) motionEvent.getX();
            this.o00 = (int) motionEvent.getY();
            return;
        }
        if (action == 1 || action == 3) {
            try {
                float f = this.nn;
                float f2 = this.o0o;
                if (o(f, f2, this.mn)) {
                    this.o0m = f41821n;
                    return;
                }
                if (o(f, f2, this.n0)) {
                    this.o0m = o0;
                    return;
                }
                if (o(f, f2, this.no)) {
                    this.o0m = oo;
                    return;
                }
                List<View> list = this.mm;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (int i2 = 0; i2 < this.mm.size(); i2++) {
                    if (o(f, f2, this.mm.get(i2))) {
                        this.o0m = m;
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void o(float f, float f2) {
        if (o(f, f2, this.mn)) {
            this.o0m = f41821n;
            return;
        }
        if (o(f, f2, this.n0)) {
            this.o0m = o0;
            return;
        }
        if (o(f, f2, this.no)) {
            this.o0m = oo;
            return;
        }
        List<View> list = this.mm;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (int i2 = 0; i2 < this.mm.size(); i2++) {
            if (o(f, f2, this.mm.get(i2))) {
                this.o0m = m;
                return;
            }
        }
    }

    public final int o() {
        return this.o0m;
    }

    private static boolean o(float f, float f2, View view) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float f3 = iArr[0];
        float f4 = iArr[1];
        return f >= f3 && f <= ((float) view.getWidth()) + f3 && f2 >= f4 && f2 <= ((float) view.getHeight()) + f4;
    }
}
