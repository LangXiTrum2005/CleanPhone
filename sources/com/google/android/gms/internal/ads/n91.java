package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n91 extends p91 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r91 f17725g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n91(r91 r91Var, int i10) {
        super(r91Var);
        this.f17724f = i10;
        switch (i10) {
            case 1:
                Objects.requireNonNull(r91Var);
                this.f17725g = r91Var;
                super(r91Var);
                break;
            case 2:
                Objects.requireNonNull(r91Var);
                this.f17725g = r91Var;
                super(r91Var);
                break;
            default:
                Objects.requireNonNull(r91Var);
                this.f17725g = r91Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p91
    public final Object b(int i10) {
        switch (this.f17724f) {
            case 0:
                return this.f17725g.g()[i10];
            case 1:
                return new q91(this.f17725g, i10);
            default:
                return this.f17725g.h()[i10];
        }
    }
}
