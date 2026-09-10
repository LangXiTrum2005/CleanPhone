package com.mbridge.msdk.config.component.animation;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f31812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f31813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f31814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f31815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f31816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f31817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f31818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f31819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f31820i;

    public static i a(View view) {
        i iVar = new i();
        if (view == null) {
            return iVar;
        }
        iVar.f31812a = view.getTranslationX();
        iVar.f31813b = view.getTranslationY();
        iVar.f31815d = view.getScaleX();
        iVar.f31816e = view.getScaleY();
        iVar.f31817f = view.getRotation();
        iVar.f31818g = view.getRotationX();
        iVar.f31819h = view.getRotationY();
        iVar.f31820i = view.getAlpha();
        iVar.f31814c = view.getTranslationZ();
        return iVar;
    }

    public void b(View view) {
        if (view == null) {
            return;
        }
        view.setTranslationX(this.f31812a);
        view.setTranslationY(this.f31813b);
        view.setScaleX(this.f31815d);
        view.setScaleY(this.f31816e);
        view.setRotation(this.f31817f);
        view.setRotationX(this.f31818g);
        view.setRotationY(this.f31819h);
        view.setAlpha(this.f31820i);
        view.setTranslationZ(this.f31814c);
    }
}
