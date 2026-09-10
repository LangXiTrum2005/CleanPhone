package com.mbridge.msdk.config.component.animation;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31803a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f31804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Animator f31805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f31806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f31807e;

    public void a(String str) {
        if (str == null) {
            str = "";
        }
        this.f31803a = str;
    }

    public i b() {
        return this.f31807e;
    }

    public View c() {
        return this.f31806d;
    }

    public void a(g gVar) {
        this.f31804b = gVar;
    }

    public Animator a() {
        return this.f31805c;
    }

    public void a(Animator animator) {
        this.f31805c = animator;
    }

    public void a(View view) {
        this.f31806d = view;
    }

    public void a(i iVar) {
        this.f31807e = iVar;
    }
}
