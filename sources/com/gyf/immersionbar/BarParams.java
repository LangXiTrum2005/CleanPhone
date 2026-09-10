package com.gyf.immersionbar;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class BarParams implements Cloneable {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public HashMap f21426Y;
    public View Z;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;

    public final Object clone() {
        try {
            return (BarParams) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}
